package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

public class VideoFrameDrawer {
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private final float[] dstPoints = new float[6];
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private final Matrix renderMatrix = new Matrix();
    private final Point renderSize = new Point();
    private int renderWidth;
    private final YuvUploader yuvUploader = new YuvUploader(null);

    /* renamed from: org_webrtc_VideoFrameDrawer_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m157061x1201f621(String str, String str2, Throwable th) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        static {
            Covode.recordClassIndex(106760);
        }

        private YuvUploader() {
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        /* synthetic */ YuvUploader(C903091 r1) {
            this();
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = 0;
            int i4 = i / 2;
            int[] iArr2 = {i, i4, i4};
            int i5 = i2 / 2;
            int[] iArr3 = {i2, i5, i5};
            int i6 = 0;
            int i7 = 0;
            do {
                if (iArr[i6] > iArr2[i6]) {
                    i7 = Math.max(i7, iArr2[i6] * iArr3[i6]);
                }
                i6++;
            } while (i6 < 3);
            if (i7 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i7)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i7);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                int i8 = 0;
                do {
                    this.yuvTextures[i8] = GlUtil.generateTexture(3553);
                    i8++;
                } while (i8 < 3);
            }
            do {
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.yuvTextures[i3]);
                if (iArr[i3] == iArr2[i3]) {
                    byteBuffer = byteBufferArr[i3];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i3], iArr[i3], this.copyBuffer, iArr2[i3], iArr2[i3], iArr3[i3]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i3], iArr3[i3], 0, 6409, 5121, byteBuffer);
                i3++;
            } while (i3 < 3);
            return this.yuvTextures;
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    static {
        Covode.recordClassIndex(106758);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.VideoFrameDrawer$1 */
    public static /* synthetic */ class C903091 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 106759(0x1a107, float:1.49601E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = org.webrtc.VideoFrame.TextureBuffer.Type.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.webrtc.VideoFrameDrawer.C903091.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = r2
                org.webrtc.VideoFrame$TextureBuffer$Type r0 = org.webrtc.VideoFrame.TextureBuffer.Type.OES     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.webrtc.VideoFrameDrawer.C903091.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.webrtc.VideoFrame$TextureBuffer$Type r0 = org.webrtc.VideoFrame.TextureBuffer.Type.RGB     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.VideoFrameDrawer.C903091.<clinit>():void");
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    private void calculateTransformedRenderSize(int i, int i2, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i3 = 0; i3 < 3; i3++) {
            float[] fArr = this.dstPoints;
            int i4 = i3 * 2;
            int i5 = i4 + 0;
            fArr[i5] = fArr[i5] * ((float) i);
            int i6 = i4 + 1;
            fArr[i6] = fArr[i6] * ((float) i2);
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot((double) (f3 - f), (double) (f4 - f2)));
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        try {
            calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
            boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate((float) videoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (!z || this.renderWidth <= 0) {
                if (videoFrame != this.lastI420Frame) {
                    this.lastI420Frame = videoFrame;
                    if (!(videoFrame == null || videoFrame.getBuffer() == null)) {
                        VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                        this.yuvUploader.uploadFromBuffer(i420);
                        i420.release();
                    }
                }
                glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4);
                return;
            }
            this.lastI420Frame = null;
            drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4);
        } catch (Exception e) {
            m157061x1201f621("VideoFrameDrawer", "draw frame error", e);
        }
    }

    static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i7 = C903091.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i7 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else if (i7 == 2) {
            glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else {
            throw new RuntimeException("Unknown texture type.");
        }
    }
}
