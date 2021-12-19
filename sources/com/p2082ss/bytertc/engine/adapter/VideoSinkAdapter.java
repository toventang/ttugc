package com.p2082ss.bytertc.engine.adapter;

import android.opengl.EGLContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.mediaio.IVideoSink;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.p2082ss.bytertc.engine.utils.ByteBufferUtils;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;

/* renamed from: com.ss.bytertc.engine.adapter.VideoSinkAdapter */
public class VideoSinkAdapter implements IVideoSink {
    public boolean mInitialized;
    public IVideoSink mSink;
    public boolean mStarted;
    private VideoSinkTask mVideoSinkTask;

    static {
        Covode.recordClassIndex(100957);
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public int getBufferType() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getBufferType();
        }
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public EGLContext getEGLContextHandle() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getEGLContextHandle();
        }
        return null;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public int getPixelFormat() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getPixelFormat();
        }
        return 1;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public void onDispose() {
        VideoSinkTask videoSinkTask;
        if (this.mSink != null && (videoSinkTask = this.mVideoSinkTask) != null) {
            videoSinkTask.post(new Runnable() {
                /* class com.p2082ss.bytertc.engine.adapter.VideoSinkAdapter.RunnableC860854 */

                static {
                    Covode.recordClassIndex(100961);
                }

                public void run() {
                    if (VideoSinkAdapter.this.mSink != null) {
                        VideoSinkAdapter.this.mSink.onDispose();
                    }
                    VideoSinkAdapter.this.mInitialized = false;
                }
            });
        }
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public boolean onInitialize() {
        VideoSinkTask videoSinkTask;
        if (this.mSink == null || (videoSinkTask = this.mVideoSinkTask) == null) {
            return false;
        }
        videoSinkTask.post(new Runnable() {
            /* class com.p2082ss.bytertc.engine.adapter.VideoSinkAdapter.RunnableC860821 */

            static {
                Covode.recordClassIndex(100958);
            }

            public void run() {
                if (VideoSinkAdapter.this.mSink != null) {
                    VideoSinkAdapter videoSinkAdapter = VideoSinkAdapter.this;
                    videoSinkAdapter.mInitialized = videoSinkAdapter.mSink.onInitialize();
                }
            }
        });
        return true;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public boolean onStart() {
        VideoSinkTask videoSinkTask;
        if (this.mSink == null || (videoSinkTask = this.mVideoSinkTask) == null) {
            return false;
        }
        videoSinkTask.post(new Runnable() {
            /* class com.p2082ss.bytertc.engine.adapter.VideoSinkAdapter.RunnableC860832 */

            static {
                Covode.recordClassIndex(100959);
            }

            public void run() {
                if (VideoSinkAdapter.this.mSink != null && VideoSinkAdapter.this.mInitialized) {
                    VideoSinkAdapter videoSinkAdapter = VideoSinkAdapter.this;
                    videoSinkAdapter.mStarted = videoSinkAdapter.mSink.onStart();
                }
            }
        });
        return true;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public void onStop() {
        VideoSinkTask videoSinkTask;
        if (this.mSink != null && (videoSinkTask = this.mVideoSinkTask) != null) {
            videoSinkTask.post(new Runnable() {
                /* class com.p2082ss.bytertc.engine.adapter.VideoSinkAdapter.RunnableC860843 */

                static {
                    Covode.recordClassIndex(100960);
                }

                public void run() {
                    if (VideoSinkAdapter.this.mSink != null) {
                        VideoSinkAdapter.this.mSink.onStop();
                    }
                    VideoSinkAdapter.this.mStarted = false;
                }
            });
        }
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoFrameConsumer
    public void consumeVideoFrame(RTCVideoFrame rTCVideoFrame) {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null && this.mInitialized && this.mStarted) {
            iVideoSink.consumeVideoFrame(rTCVideoFrame);
        }
    }

    /* access modifiers changed from: package-private */
    public void onVideoFrame(VideoFrame videoFrame) {
        MethodCollector.m26663i(937);
        if (videoFrame != null) {
            int width = videoFrame.getBuffer().getWidth();
            int height = videoFrame.getBuffer().getHeight();
            final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer((width * height) + (((width + 1) / 2) * ((height + 1) / 2) * 2));
            RTCVideoFrame rTCVideoFrame = new RTCVideoFrame(nativeAllocateBuffer, videoFrame.getExtendedData(), null, width, height, videoFrame.getRotation(), videoFrame.getTimestampNs(), new Runnable() {
                /* class com.p2082ss.bytertc.engine.adapter.VideoSinkAdapter.RunnableC860865 */

                static {
                    Covode.recordClassIndex(100962);
                }

                public void run() {
                    MethodCollector.m26663i(967);
                    ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
                    MethodCollector.m26664o(967);
                }
            });
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            if (i420 != null) {
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), rTCVideoFrame.buffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
            consumeVideoFrame(rTCVideoFrame);
            videoFrame.release();
            rTCVideoFrame.release();
        }
        MethodCollector.m26664o(937);
    }

    public VideoSinkAdapter(IVideoSink iVideoSink, VideoSinkTask videoSinkTask) {
        this.mSink = iVideoSink;
        this.mVideoSinkTask = videoSinkTask;
    }
}
