package com.p2082ss.avframework.opengl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.GlTextureFrameBuffer;
import com.p2082ss.avframework.buffer.JavaI420Buffer;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.utils.JniCommon;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.opengl.YuvConverterCPU */
public class YuvConverterCPU {
    private GlTextureFrameBuffer mFrameBuffer;
    private GlRenderDrawer mGlDrawer;

    static {
        Covode.recordClassIndex(100678);
    }

    static int clamp(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public void release() {
        GlTextureFrameBuffer glTextureFrameBuffer = this.mFrameBuffer;
        if (glTextureFrameBuffer != null) {
            glTextureFrameBuffer.release();
            this.mFrameBuffer = null;
        }
        GlRenderDrawer glRenderDrawer = this.mGlDrawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.mGlDrawer = null;
        }
    }

    public VideoFrame.I420Buffer readPixel(VideoFrame.TextureBuffer textureBuffer) {
        MethodCollector.m26663i(3824);
        if (this.mFrameBuffer == null) {
            GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            this.mFrameBuffer = glTextureFrameBuffer;
            glTextureFrameBuffer.setSize(textureBuffer.getWidth(), textureBuffer.getHeight());
        }
        if (this.mGlDrawer == null) {
            this.mGlDrawer = new GlRenderDrawer();
        }
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        android.graphics.Matrix matrix = null;
        boolean z = textureBuffer instanceof JavaI420Buffer;
        if (textureBuffer instanceof VideoFrame.TextureBuffer) {
            matrix = new android.graphics.Matrix(textureBuffer.getTransformMatrix());
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
        } else if (z) {
            matrix = new android.graphics.Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
        }
        Matrix.rotateM(fArr2, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        if (matrix != null) {
            Matrix.multiplyMM(fArr2, 0, fArr3, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix), 0);
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBuffer.getFrameBufferId());
        if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
            this.mGlDrawer.drawOes(textureBuffer.getTextureId(), fArr, fArr2, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
        } else {
            this.mGlDrawer.drawRgb(textureBuffer.getTextureId(), fArr, fArr2, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
        }
        GLES20.glFinish();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(textureBuffer.getWidth() * textureBuffer.getHeight() * 4);
        GLES20.glReadPixels(0, 0, textureBuffer.getWidth(), textureBuffer.getHeight(), 6408, 5121, allocateDirect);
        allocateDirect.position(0);
        GLES20.glBindFramebuffer(36160, 0);
        byte[] bArr = new byte[allocateDirect.limit()];
        allocateDirect.get(bArr);
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        int i3 = (height + i2 + 1) * i;
        byte[] bArr2 = new byte[i3];
        RGBA2_YUV420P_I420_YU12(bArr, bArr2, width, height);
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i3);
        nativeAllocateByteBuffer.clear();
        nativeAllocateByteBuffer.put(bArr2);
        int i4 = (i * height) + 0;
        int i5 = (i / 2) + i4;
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i4);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i4);
        int i6 = i2 * i;
        nativeAllocateByteBuffer.limit(i4 + i6);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i5);
        nativeAllocateByteBuffer.limit(i5 + i6);
        JavaI420Buffer wrap = JavaI420Buffer.wrap(width, height, slice, i, slice2, i, nativeAllocateByteBuffer.slice(), i, textureBuffer.getCaptureMs(), new Runnable() {
            /* class com.p2082ss.avframework.opengl.YuvConverterCPU.RunnableC860351 */

            static {
                Covode.recordClassIndex(100679);
            }

            public void run() {
                MethodCollector.m26663i(895);
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                MethodCollector.m26664o(895);
            }
        });
        MethodCollector.m26664o(3824);
        return wrap;
    }

    static void RGBA2_YUV420P_I420_YU12(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = i5 + 1;
                int i11 = bArr[i5] & 255;
                int i12 = i10 + 1;
                int i13 = bArr[i10] & 255;
                int i14 = i12 + 1;
                int i15 = bArr[i12] & 255;
                i5 = i14 + 1;
                int i16 = (((((i11 * 66) + (i13 * 129)) + (i15 * 25)) + 128) >> 8) + 16;
                int i17 = (((((i11 * -38) - (i13 * 74)) + (i15 * 112)) + 128) >> 8) + 128;
                int i18 = (((((i11 * 112) - (i13 * 94)) - (i15 * 18)) + 128) >> 8) + 128;
                int i19 = i4 + 1;
                bArr2[i4] = (byte) clamp(i16);
                if (i8 % 2 == 0 && i6 % 2 == 0) {
                    int i20 = i3 + i7;
                    bArr2[i20] = (byte) clamp(i17);
                    int i21 = i / 2;
                    bArr2[i20 + i21] = (byte) clamp(i18);
                    i7++;
                    if (i7 == i21) {
                        i3 += i;
                        i7 = 0;
                    }
                }
                i6++;
                i9++;
                i4 = i19;
            }
        }
    }
}
