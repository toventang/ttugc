package com.p2082ss.avframework.livestreamv2;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.JavaI420Buffer;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.opengl.GlRenderDrawer;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.opengl.RendererCommon;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.VideoFrameRender */
public class VideoFrameRender {
    final float[] identityMatrix;
    int mYuvHeight;
    int[] mYuvTexs;
    int mYuvWidth;

    static {
        Covode.recordClassIndex(100098);
    }

    public VideoFrameRender() {
        float[] fArr = new float[16];
        this.identityMatrix = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* access modifiers changed from: package-private */
    public void release() {
        int[] iArr = this.mYuvTexs;
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.mYuvTexs = null;
        }
    }

    public boolean drawFrame(VideoFrame videoFrame, GlRenderDrawer glRenderDrawer, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4) {
        android.graphics.Matrix matrix;
        float[] fArr3 = fArr;
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        boolean z2 = videoFrame.getBuffer() instanceof JavaI420Buffer;
        if (z) {
            matrix = ((VideoFrame.TextureBuffer) videoFrame.getBuffer()).getTransformMatrix();
        } else if (z2) {
            matrix = new android.graphics.Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
        } else {
            matrix = null;
        }
        Matrix.rotateM(fArr4, 0, (float) videoFrame.getRotation(), 0.0f, 0.0f, 1.0f);
        if (fArr2 != null) {
            Matrix.multiplyMM(fArr4, 0, this.identityMatrix, 0, fArr2, 0);
        }
        if (matrix != null) {
            Matrix.multiplyMM(fArr4, 0, this.identityMatrix, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix), 0);
        }
        if (z) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) videoFrame.getBuffer();
            GLES20.glClear(16640);
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                return glRenderDrawer.drawOes(textureBuffer.getTextureId(), fArr3, fArr4, i, i2, i3, i4);
            }
            return glRenderDrawer.drawRgb(textureBuffer.getTextureId(), fArr3, fArr4, i, i2, i3, i4);
        }
        JavaI420Buffer javaI420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
        ByteBuffer[] byteBufferArr = {javaI420Buffer.getDataY(), javaI420Buffer.getDataU(), javaI420Buffer.getDataV()};
        int[] iArr = {javaI420Buffer.getStrideY(), javaI420Buffer.getStrideU(), javaI420Buffer.getStrideV()};
        int[] iArr2 = {javaI420Buffer.getHeight(), javaI420Buffer.getHeight() / 2, javaI420Buffer.getHeight() / 2};
        int[] iArr3 = {33984, 33985, 33986};
        if (this.mYuvTexs == null) {
            this.mYuvTexs = new int[3];
            int i5 = 0;
            do {
                int[] iArr4 = new int[1];
                GLES20.glGenTextures(1, iArr4, 0);
                GLES20.glActiveTexture(iArr3[i5]);
                GLES20.glBindTexture(3553, iArr4[0]);
                GLES20.glTexParameterf(3553, 10241, (float) GlUtil.getFilterType(9728));
                GLES20.glTexParameterf(3553, 10240, (float) GlUtil.getFilterType(9729));
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glBindTexture(3553, 0);
                this.mYuvTexs[i5] = iArr4[0];
                i5++;
            } while (i5 < 3);
        }
        if (!(this.mYuvWidth == javaI420Buffer.getWidth() && this.mYuvHeight == javaI420Buffer.getHeight())) {
            int i6 = 0;
            do {
                GLES20.glActiveTexture(iArr3[i6]);
                GLES20.glBindTexture(3553, this.mYuvTexs[i6]);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i6], iArr2[i6], 0, 6409, 5121, null);
                GLES20.glBindTexture(3553, 0);
                i6++;
            } while (i6 < 3);
            this.mYuvWidth = javaI420Buffer.getWidth();
            this.mYuvHeight = javaI420Buffer.getHeight();
        }
        int i7 = 0;
        do {
            GLES20.glActiveTexture(iArr3[i7]);
            GLES20.glBindTexture(3553, this.mYuvTexs[i7]);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, iArr[i7], iArr2[i7], 6409, 5121, byteBufferArr[i7]);
            GLES20.glBindTexture(3553, 0);
            i7++;
        } while (i7 < 3);
        if (fArr3 == null) {
            fArr3 = this.identityMatrix;
        }
        return glRenderDrawer.drawYuv(this.mYuvTexs, fArr3, fArr4, i, i2, i3, i4, 0);
    }
}
