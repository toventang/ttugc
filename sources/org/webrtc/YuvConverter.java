package org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

public class YuvConverter {
    private final GlGenericDrawer drawer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;

    /* renamed from: org.webrtc.YuvConverter$1 */
    static /* synthetic */ class C903101 {
        static {
            Covode.recordClassIndex(106765);
        }
    }

    static {
        Covode.recordClassIndex(106763);
    }

    /* renamed from: org_webrtc_YuvConverter_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m157062xa9ead9b2(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};
        private static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private float[] coeffs;
        private int coeffsLoc;
        private float stepSize;
        private int xUnitLoc;

        private ShaderCallbacks() {
        }

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }

        static {
            Covode.recordClassIndex(106766);
        }

        /* synthetic */ ShaderCallbacks(C903101 r1) {
            this();
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i5 = this.xUnitLoc;
            float f = this.stepSize;
            float f2 = (float) i;
            GLES20.glUniform2f(i5, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.threadChecker.detachThread();
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        ShaderCallbacks shaderCallbacks2 = new ShaderCallbacks(null);
        this.shaderCallbacks = shaderCallbacks2;
        this.drawer = new GlGenericDrawer("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", shaderCallbacks2);
        threadChecker2.detachThread();
    }

    static final /* synthetic */ void lambda$convert$0$YuvConverter(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(2785);
        JniCommon.nativeFreeByteBuffer(byteBuffer);
        MethodCollector.m26664o(2785);
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        MethodCollector.m26663i(2774);
        this.threadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error("YUVConverter");
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i = ((width + 63) / 64) * 64;
        int i2 = (height + 1) / 2;
        int i3 = height + i2;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i * i3) + i);
        int i4 = i / 4;
        int i5 = (((width + 7) / 8) * 8) / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        this.i420TextureFrameBuffer.setSize(i4, i3);
        GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, 0, i5, height);
        this.shaderCallbacks.setPlaneU();
        int i6 = i5 / 2;
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, height, i6, i2);
        this.shaderCallbacks.setPlaneV();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, i4 / 2, height, i6, i2);
        GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, nativeAllocateByteBuffer);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            m157062xa9ead9b2("YUVConverter", "error: ".concat(String.valueOf(glGetError)));
            RXLogging.m41311e("YUVConverter", "convert i420 failed as opengl error ".concat(String.valueOf(glGetError)));
            if (1285 == glGetError || 1282 == glGetError) {
                if (nativeAllocateByteBuffer != null) {
                    JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                }
                MethodCollector.m26664o(2774);
                return null;
            }
            RuntimeException runtimeException = new RuntimeException("YuvConverter.convert: GLES20 error: ".concat(String.valueOf(glGetError)));
            MethodCollector.m26664o(2774);
            throw runtimeException;
        }
        GLES20.glBindFramebuffer(36160, 0);
        int i7 = (i * height) + 0;
        int i8 = i / 2;
        int i9 = i7 + i8;
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i7);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i7);
        int i10 = ((i2 - 1) * i) + i8;
        nativeAllocateByteBuffer.limit(i7 + i10);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i9);
        nativeAllocateByteBuffer.limit(i9 + i10);
        JavaI420Buffer wrap = JavaI420Buffer.wrap(width, height, slice, i, slice2, i, nativeAllocateByteBuffer.slice(), i, new YuvConverter$$Lambda$0(nativeAllocateByteBuffer));
        MethodCollector.m26664o(2774);
        return wrap;
    }
}
