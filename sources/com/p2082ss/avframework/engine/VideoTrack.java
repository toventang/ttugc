package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.avframework.engine.VideoTrack */
public class VideoTrack extends MediaTrack {
    protected VideoProcessor mVideoProcessor;

    static {
        Covode.recordClassIndex(99992);
    }

    /* access modifiers changed from: protected */
    public native void nativeSetVideoProcessor(VideoProcessor videoProcessor);

    @Override // com.p2082ss.avframework.engine.MediaTrack
    public synchronized void release() {
        MethodCollector.m26663i(4314);
        super.release();
        VideoProcessor videoProcessor = this.mVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.release();
        }
        MethodCollector.m26664o(4314);
    }

    @Override // com.p2082ss.avframework.engine.MediaTrack
    public void addVideoSink(VideoSink videoSink) {
        super.addVideoSink(videoSink);
    }

    @Override // com.p2082ss.avframework.engine.MediaTrack
    public void removeVideoSink(VideoSink videoSink) {
        super.removeVideoSink(videoSink);
    }

    @Override // com.p2082ss.avframework.engine.MediaTrack
    public boolean containVideoSink(VideoSink videoSink) {
        return super.containVideoSink(videoSink);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        MethodCollector.m26663i(4312);
        this.mVideoProcessor = videoProcessor;
        nativeSetVideoProcessor(videoProcessor);
        MethodCollector.m26664o(4312);
    }

    public VideoTrack(long j, MediaSource mediaSource) {
        super(j, mediaSource);
    }
}
