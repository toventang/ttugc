package com.p2082ss.avframework.livestreamv2.recorder;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.capture.video.VideoCapturer;
import com.p2082ss.avframework.engine.VideoSink;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.recorder.RecordVideoSink */
public class RecordVideoSink extends VideoCapturer {
    private int mFps;
    private int mHeight;
    private int mStatus = 0;
    private VideoSink mVideoSink = new VideoSink() {
        /* class com.p2082ss.avframework.livestreamv2.recorder.RecordVideoSink.C860101 */

        static {
            Covode.recordClassIndex(100601);
        }

        @Override // com.p2082ss.avframework.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        @Override // com.p2082ss.avframework.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            RecordVideoSink.this.onFrame(videoFrame.getBuffer(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs() / 1000);
        }
    };
    private int mWidth;

    static {
        Covode.recordClassIndex(100600);
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer
    public void stop() {
        this.mStatus = 2;
    }

    public VideoSink getVideoSink() {
        return this.mVideoSink;
    }

    @Override // com.p2082ss.avframework.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(3267);
        stop();
        super.release();
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            videoSink.release();
            this.mVideoSink = null;
        }
        MethodCollector.m26664o(3267);
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFps = i3;
        nativeAdaptedOutputFormat(i, i2, i3, false);
        this.mStatus = 1;
    }

    public int pushVideoFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        return onFrame(buffer, i, i2, i3, j);
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer
    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        if (this.mStatus == 1) {
            return super.onFrame(buffer, i, i2, i3, j);
        }
        return -1;
    }
}
