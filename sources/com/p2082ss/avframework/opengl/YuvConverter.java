package com.p2082ss.avframework.opengl;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.GlTextureFrameBuffer;
import com.p2082ss.avframework.buffer.JavaI420Buffer;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.utils.GlobalControler;
import com.p2082ss.avframework.utils.JniCommon;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* renamed from: com.ss.avframework.opengl.YuvConverter */
public class YuvConverter {
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final float[][] RGB_TO_FULL_RANGE_YUV_TRANSFORM_MATRIX;
    private static final float[][] RGB_TO_VIDEO_RANGE_YUV_TRANSFORM_MATRIX = {new float[]{0.257f, 0.504f, 0.098f, 0.0625f}, new float[]{-0.148f, -0.291f, 0.439f, 0.5f}, new float[]{0.439f, -0.368f, -0.071f, 0.5f}};
    static float[][] RGB_TO_YUV_TRANSFORM_MATRIX;
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private int coeffsLoc;
    public ConverterBufferPool mConverterBufferPool;
    private boolean released = false;
    private GlShader shader;
    private VideoFrame.TextureBuffer.Type shaderTextureType;
    private int texMatrixLoc;
    private final GlTextureFrameBuffer textureFrameBuffer;
    private final ThreadUtils.ThreadChecker threadChecker;
    private int xUnitLoc;
    private YuvConverterCPU yuvConverterCPU;

    private static native void nativeSetConvertColorRange(int i);

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        threadChecker2.checkIsOnValidThread();
        this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
    }

    private void setupVertexAttribArray() {
        this.shader.setVertexAttribArray("in_pos", 2, DEVICE_RECTANGLE);
        this.shader.setVertexAttribArray("in_tc", 2, TEXTURE_RECTANGLE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.opengl.YuvConverter$2 */
    public static /* synthetic */ class C860342 {

        /* renamed from: $SwitchMap$com$ss$avframework$buffer$VideoFrame$TextureBuffer$Type */
        static final /* synthetic */ int[] f191997xbf11558d;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 100676(0x18944, float:1.41077E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.avframework.buffer.VideoFrame$TextureBuffer$Type[] r0 = com.p2082ss.avframework.buffer.VideoFrame.TextureBuffer.Type.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.avframework.opengl.YuvConverter.C860342.f191997xbf11558d = r2
                com.ss.avframework.buffer.VideoFrame$TextureBuffer$Type r0 = com.p2082ss.avframework.buffer.VideoFrame.TextureBuffer.Type.OES     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.avframework.opengl.YuvConverter.C860342.f191997xbf11558d     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.avframework.buffer.VideoFrame$TextureBuffer$Type r0 = com.p2082ss.avframework.buffer.VideoFrame.TextureBuffer.Type.RGB     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.opengl.YuvConverter.C860342.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.opengl.YuvConverter$ConverterBufferPool */
    public static class ConverterBufferPool {
        private ByteBuffer[] mByteBuffers;
        private int mMaxSize;
        private final Object mReleaseFence = new Object();
        private boolean[] mRetained;
        private final boolean mYuvConverterUseBufferPool;

        static {
            Covode.recordClassIndex(100677);
        }

        public void release() {
            MethodCollector.m26663i(2030);
            if (this.mYuvConverterUseBufferPool) {
                MethodCollector.m26664o(2030);
                return;
            }
            synchronized (this.mReleaseFence) {
                try {
                    this.mMaxSize = 0;
                    ByteBuffer[] byteBufferArr = this.mByteBuffers;
                    for (ByteBuffer byteBuffer : byteBufferArr) {
                        if (byteBuffer != null) {
                            JniCommon.nativeFreeByteBuffer(byteBuffer);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(2030);
                }
            }
        }

        ConverterBufferPool(int i) {
            this.mMaxSize = i;
            this.mByteBuffers = new ByteBuffer[i];
            this.mRetained = new boolean[]{false, false, false};
            this.mYuvConverterUseBufferPool = GlobalControler.isYuvConverterUseBufferPool();
        }

        public synchronized void unlock(ByteBuffer byteBuffer) {
            MethodCollector.m26663i(2021);
            if (this.mYuvConverterUseBufferPool) {
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                MethodCollector.m26664o(2021);
                return;
            }
            synchronized (this.mReleaseFence) {
                for (int i = 0; i < this.mMaxSize; i++) {
                    try {
                        if (this.mByteBuffers[i] == byteBuffer) {
                            boolean[] zArr = this.mRetained;
                            if (zArr[i]) {
                                zArr[i] = false;
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(2021);
                    }
                }
            }
        }

        public synchronized ByteBuffer lock(int i) {
            MethodCollector.m26663i(2023);
            if (this.mYuvConverterUseBufferPool) {
                ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i);
                MethodCollector.m26664o(2023);
                return nativeAllocateByteBuffer;
            }
            synchronized (this.mReleaseFence) {
                for (int i2 = 0; i2 < this.mMaxSize; i2++) {
                    try {
                        if (!this.mRetained[i2]) {
                            ByteBuffer[] byteBufferArr = this.mByteBuffers;
                            if (byteBufferArr[i2] == null) {
                                byteBufferArr[i2] = JniCommon.nativeAllocateByteBuffer(i);
                            } else if (byteBufferArr[i2].capacity() < i) {
                                JniCommon.nativeFreeByteBuffer(this.mByteBuffers[i2]);
                                this.mByteBuffers[i2] = JniCommon.nativeAllocateByteBuffer(i);
                            }
                            this.mRetained[i2] = true;
                            this.mByteBuffers[i2].position(0);
                            return this.mByteBuffers[i2];
                        }
                    } finally {
                        MethodCollector.m26664o(2023);
                    }
                }
                MethodCollector.m26664o(2023);
                return null;
            }
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        this.textureFrameBuffer.release();
        YuvConverterCPU yuvConverterCPU2 = this.yuvConverterCPU;
        if (yuvConverterCPU2 != null) {
            yuvConverterCPU2.release();
            this.yuvConverterCPU = null;
        }
        ConverterBufferPool converterBufferPool = this.mConverterBufferPool;
        if (converterBufferPool != null) {
            converterBufferPool.release();
        }
    }

    static {
        Covode.recordClassIndex(100674);
        float[][] fArr = {new float[]{0.299f, 0.587f, 0.114f, 0.0f}, new float[]{-0.169f, -0.331f, 0.499f, 0.5f}, new float[]{0.499f, -0.418f, -0.0813f, 0.5f}};
        RGB_TO_FULL_RANGE_YUV_TRANSFORM_MATRIX = fArr;
        RGB_TO_YUV_TRANSFORM_MATRIX = fArr;
    }

    public static void setConvertColorRange(int i) {
        MethodCollector.m26663i(1516);
        if (i == 1) {
            RGB_TO_YUV_TRANSFORM_MATRIX = RGB_TO_VIDEO_RANGE_YUV_TRANSFORM_MATRIX;
        } else if (i == 0) {
            RGB_TO_YUV_TRANSFORM_MATRIX = RGB_TO_FULL_RANGE_YUV_TRANSFORM_MATRIX;
        }
        nativeSetConvertColorRange(i);
        MethodCollector.m26664o(1516);
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        try {
            i420BufferArr[0] = convertGPUInternal(textureBuffer);
        } catch (Exception unused) {
        }
        if (i420BufferArr[0] == null) {
            i420BufferArr[0] = convertCPUInternal(textureBuffer);
        }
        return i420BufferArr[0];
    }

    public VideoFrame.I420Buffer convertCPUInternal(VideoFrame.TextureBuffer textureBuffer) {
        if (this.yuvConverterCPU == null) {
            this.yuvConverterCPU = new YuvConverterCPU();
        }
        return this.yuvConverterCPU.readPixel(textureBuffer);
    }

    private void initShader(VideoFrame.TextureBuffer.Type type) {
        String str;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        int i = C860342.f191997xbf11558d[type.ordinal()];
        if (i == 1) {
            str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
        } else if (i == 2) {
            str = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
        } else {
            throw new IllegalArgumentException("Unsupported texture type.");
        }
        this.shaderTextureType = type;
        GlShader glShader2 = new GlShader("varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n", str);
        this.shader = glShader2;
        glShader2.useProgram();
        this.texMatrixLoc = this.shader.getUniformLocation("texMatrix");
        this.xUnitLoc = this.shader.getUniformLocation("xUnit");
        this.coeffsLoc = this.shader.getUniformLocation("coeffs");
        GLES20.glUniform1i(this.shader.getUniformLocation("tex"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        setupVertexAttribArray();
    }

    public VideoFrame.I420Buffer convertGPUInternal(VideoFrame.TextureBuffer textureBuffer) {
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        int i3 = (height + i2 + 1) * i;
        if (this.mConverterBufferPool == null) {
            this.mConverterBufferPool = new ConverterBufferPool(3);
        }
        final ByteBuffer lock = this.mConverterBufferPool.lock(i3);
        if (lock == null) {
            return null;
        }
        convert(lock, width, height, i, textureBuffer.getTextureId(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), textureBuffer.getType());
        int i4 = (i * height) + 0;
        int i5 = (i / 2) + i4;
        lock.position(0);
        lock.limit(i4);
        ByteBuffer slice = lock.slice();
        lock.position(i4);
        int i6 = i2 * i;
        lock.limit(i4 + i6);
        ByteBuffer slice2 = lock.slice();
        lock.position(i5);
        lock.limit(i5 + i6);
        return JavaI420Buffer.wrap(width, height, slice, i, slice2, i, lock.slice(), i, textureBuffer.getCaptureMs(), new Runnable() {
            /* class com.p2082ss.avframework.opengl.YuvConverter.RunnableC860331 */

            static {
                Covode.recordClassIndex(100675);
            }

            public void run() {
                if (YuvConverter.this.mConverterBufferPool != null) {
                    YuvConverter.this.mConverterBufferPool.unlock(lock);
                }
            }
        });
    }

    public void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        convert(byteBuffer, i, i2, i3, i4, fArr, VideoFrame.TextureBuffer.Type.OES);
    }

    private void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr, VideoFrame.TextureBuffer.Type type) {
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            if (type != this.shaderTextureType) {
                initShader(type);
            }
            this.shader.useProgram();
            setupVertexAttribArray();
            if (i3 % 8 != 0) {
                throw new IllegalArgumentException("Invalid stride, must be a multiple of 8");
            } else if (i3 >= i) {
                int i5 = (i + 3) / 4;
                int i6 = (i + 7) / 8;
                int i7 = (i2 + 1) / 2;
                int i8 = i2 + i7;
                if (byteBuffer.capacity() >= i3 * i8) {
                    float[] multiplyMatrices = RendererCommon.multiplyMatrices(fArr, RendererCommon.verticalFlipMatrix());
                    int i9 = i3 / 4;
                    this.textureFrameBuffer.setSize(i9, i8);
                    GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.getFrameBufferId());
                    GlUtil.checkNoGLES2Error("glBindFramebuffer");
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(type.getGlTarget(), i4);
                    GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, multiplyMatrices, 0);
                    GLES20.glViewport(0, 0, i5, i2);
                    float f = (float) i;
                    GLES20.glUniform2f(this.xUnitLoc, multiplyMatrices[0] / f, multiplyMatrices[1] / f);
                    float[] fArr2 = RGB_TO_YUV_TRANSFORM_MATRIX[0];
                    GLES20.glUniform4f(this.coeffsLoc, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glViewport(0, i2, i6, i7);
                    GLES20.glUniform2f(this.xUnitLoc, (multiplyMatrices[0] * 2.0f) / f, (multiplyMatrices[1] * 2.0f) / f);
                    float[] fArr3 = RGB_TO_YUV_TRANSFORM_MATRIX[1];
                    GLES20.glUniform4f(this.coeffsLoc, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glViewport(i3 / 8, i2, i6, i7);
                    float[] fArr4 = RGB_TO_YUV_TRANSFORM_MATRIX[2];
                    GLES20.glUniform4f(this.coeffsLoc, fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glReadPixels(0, 0, i9, i8, 6408, 5121, byteBuffer);
                    GlUtil.checkNoGLES2Error("YuvConverter.convert");
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glBindTexture(3553, 0);
                    GLES20.glBindTexture(type.getGlTarget(), 0);
                    return;
                }
                throw new IllegalArgumentException("YuvConverter.convert called with too small buffer");
            } else {
                throw new IllegalArgumentException("Invalid stride, must >= width");
            }
        } else {
            throw new IllegalStateException("YuvConverter.convert called on released object");
        }
    }
}
