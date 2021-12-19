package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.p2082ss.bytertc.engine.utils.ByteBufferUtils;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;

/* renamed from: com.ss.bytertc.engine.handler.RTCVideoFrameObserver */
public class RTCVideoFrameObserver {
    static {
        Covode.recordClassIndex(101064);
    }

    /* access modifiers changed from: package-private */
    public void onLocalScreenFrame(VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public void onLocalVideoFrame(VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public RTCVideoFrame ConvertVideoFrame(VideoFrame videoFrame) {
        RTCVideoFrame rTCVideoFrame;
        MethodCollector.m26663i(1171);
        if (videoFrame != null) {
            int width = videoFrame.getBuffer().getWidth();
            int height = videoFrame.getBuffer().getHeight();
            final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer((width * height) + (((width + 1) / 2) * ((height + 1) / 2) * 2));
            rTCVideoFrame = new RTCVideoFrame(nativeAllocateBuffer, videoFrame.getExtendedData(), null, width, height, videoFrame.getRotation(), videoFrame.getTimestampNs(), new Runnable() {
                /* class com.p2082ss.bytertc.engine.handler.RTCVideoFrameObserver.RunnableC860961 */

                static {
                    Covode.recordClassIndex(101065);
                }

                public void run() {
                    MethodCollector.m26663i(436);
                    ByteBuffer byteBuffer = nativeAllocateBuffer;
                    if (byteBuffer != null) {
                        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
                    }
                    MethodCollector.m26664o(436);
                }
            });
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            if (i420 != null) {
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), rTCVideoFrame.buffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
            videoFrame.release();
        } else {
            rTCVideoFrame = null;
        }
        MethodCollector.m26664o(1171);
        return rTCVideoFrame;
    }

    /* access modifiers changed from: package-private */
    public void onRemoteScreenFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public void onRemoteVideoFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
