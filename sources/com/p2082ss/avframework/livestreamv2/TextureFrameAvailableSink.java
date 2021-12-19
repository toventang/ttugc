package com.p2082ss.avframework.livestreamv2;

import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.JavaI420Buffer;
import com.p2082ss.avframework.buffer.RoiInfo;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.TextureFrameAvailableSink */
public class TextureFrameAvailableSink extends VideoSink {
    private EGLContext mEGLContext11;
    private ByteBuffer mExtraBuffer;
    private ILiveStream.ITextureFrameAvailableListener mListener;

    static {
        Covode.recordClassIndex(100097);
    }

    @Override // com.p2082ss.avframework.engine.VideoSink
    public void OnDiscardedFrame() {
    }

    public ILiveStream.ITextureFrameAvailableListener getListener() {
        return this.mListener;
    }

    public void setListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        this.mListener = iTextureFrameAvailableListener;
    }

    @Override // com.p2082ss.avframework.engine.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        int i;
        ByteBuffer byteBuffer;
        int peekParcelSize;
        ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener = this.mListener;
        if (iTextureFrameAvailableListener != null) {
            if (this.mEGLContext11 == null) {
                EGL egl = EGLContext.getEGL();
                if (egl instanceof EGL10) {
                    this.mEGLContext11 = ((EGL10) egl).eglGetCurrentContext();
                }
            }
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer) {
                VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) videoFrame.getBuffer();
                Matrix transformMatrix = textureBuffer.getTransformMatrix();
                if (videoFrame.getRotation() != 0) {
                    Matrix matrix = new Matrix();
                    matrix.reset();
                    matrix.preTranslate(0.5f, 0.5f);
                    matrix.preRotate((float) (-videoFrame.getRotation()));
                    matrix.preTranslate(-0.5f, -0.5f);
                    if (transformMatrix != null) {
                        matrix.preConcat(transformMatrix);
                    }
                    transformMatrix = matrix;
                }
                float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(transformMatrix);
                int textureId = textureBuffer.getTextureId();
                if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                    z = true;
                } else {
                    z = false;
                }
                RoiInfo rOIInfo = textureBuffer.getROIInfo();
                VideoFrame.IExtraData extraData = videoFrame.getExtraData();
                if (extraData != null) {
                    ByteBuffer byteBuffer2 = this.mExtraBuffer;
                    if (byteBuffer2 == null) {
                        peekParcelSize = extraData.peekParcelSize();
                    } else {
                        i = extraData.readParcel(byteBuffer2);
                        if (i < 0) {
                            peekParcelSize = extraData.peekParcelSize();
                            if (this.mExtraBuffer.capacity() > peekParcelSize) {
                                AVLog.ioe("TextureFrameAvailableSink", "Read parcel error. extraBuffer " + peekParcelSize + " VS " + this.mExtraBuffer.capacity());
                            }
                        }
                    }
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(peekParcelSize);
                    this.mExtraBuffer = allocateDirect;
                    i = extraData.readParcel(allocateDirect);
                } else {
                    i = 0;
                }
                ByteBuffer byteBuffer3 = null;
                if (i > 0) {
                    this.mExtraBuffer.position(0);
                    this.mExtraBuffer.limit(i);
                    byteBuffer = this.mExtraBuffer.slice();
                } else {
                    byteBuffer = null;
                }
                if (rOIInfo != null) {
                    rOIInfo.lockFacePointsData();
                    byteBuffer3 = rOIInfo.getFacePointsData();
                }
                iTextureFrameAvailableListener.onTextureFrameAvailable(this.mEGLContext11, textureId, z, rotatedWidth, rotatedHeight, videoFrame.getTimestampNs(), convertMatrixFromAndroidGraphicsMatrix, byteBuffer, byteBuffer3);
                if (rOIInfo != null) {
                    rOIInfo.unlockFacePointsData();
                }
            } else if (!(videoFrame.getBuffer() instanceof JavaI420Buffer)) {
                AVLog.m147806e("TextureFrameAvailableSink", "Unsupport format");
            }
        }
    }
}
