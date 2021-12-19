package com.p2082ss.avframework.livestreamv2;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.capture.video.ExternalVideoCapturer;
import com.p2082ss.avframework.capture.video.VideoCapturer;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.engine.VideoTrack;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.InputVideoStream */
class InputVideoStream implements VideoCapturer.VideoCapturerObserver, IInputVideoStream {
    private int mCurrentFrameHeight;
    private int mCurrentFrameWidth;
    private ExternalVideoCapturer mExternalVideoCapturer;
    private int mFps;
    private Handler mHandler;
    private int mHeight;
    private Observer mObserver;
    private VideoMixer.VideoMixerDescription mVideoMixerDescription = new VideoMixer.VideoMixerDescription();
    private VideoTrack mVideoTrack;
    private int mWidth;

    /* renamed from: com.ss.avframework.livestreamv2.InputVideoStream$Observer */
    public interface Observer {
        static {
            Covode.recordClassIndex(100024);
        }

        void onMixerDescriptionChange(InputVideoStream inputVideoStream, VideoMixer.VideoMixerDescription videoMixerDescription);

        void releaseInputStream(InputVideoStream inputVideoStream);
    }

    static {
        Covode.recordClassIndex(100023);
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerError(int i, Exception exc) {
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStarted() {
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStoped() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public int fps() {
        return this.mFps;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public VideoMixer.VideoMixerDescription getMixerDescription() {
        return this.mVideoMixerDescription;
    }

    public VideoTrack getVideoTrack() {
        return this.mVideoTrack;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public String name() {
        VideoTrack videoTrack = this.mVideoTrack;
        if (videoTrack != null) {
            return videoTrack.mo132293id();
        }
        return "";
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public int stop() {
        if (this.mExternalVideoCapturer == null) {
            return 0;
        }
        AVLog.iow("InputVideoStream", "InputVideoStream: stop.");
        this.mExternalVideoCapturer.stop();
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public synchronized void release() {
        MethodCollector.m26663i(902);
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.releaseInputStream(this);
        }
        ExternalVideoCapturer externalVideoCapturer = this.mExternalVideoCapturer;
        if (externalVideoCapturer != null) {
            externalVideoCapturer.release();
            this.mExternalVideoCapturer = null;
        }
        VideoTrack videoTrack = this.mVideoTrack;
        if (videoTrack != null) {
            videoTrack.release();
            this.mVideoTrack = null;
        }
        MethodCollector.m26664o(902);
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public int start() {
        if (this.mExternalVideoCapturer == null) {
            return 0;
        }
        AVLog.iow("InputVideoStream", "InputVideoStream: start.width:" + this.mWidth + ",height:" + this.mHeight + ",fps:" + this.mFps);
        this.mExternalVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public void setMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        if (videoMixerDescription != null) {
            AVLog.iow("InputVideoStream", "update mix description:" + this + ",desc:" + videoMixerDescription.toString());
            this.mVideoMixerDescription.copy(videoMixerDescription);
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onMixerDescriptionChange(this, videoMixerDescription);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        ExternalVideoCapturer externalVideoCapturer = this.mExternalVideoCapturer;
        if (externalVideoCapturer != null) {
            return externalVideoCapturer.pushVideoFrame(byteBuffer, i, i2, i3, j, TimeUtils.currentTimeMs());
        }
        return -1;
    }

    public InputVideoStream(MediaEngineFactory mediaEngineFactory, Handler handler, Observer observer, int i, int i2, int i3) {
        ExternalVideoCapturer externalVideoCapturer = new ExternalVideoCapturer(this, handler);
        this.mExternalVideoCapturer = externalVideoCapturer;
        this.mVideoTrack = mediaEngineFactory.createVideoTrack(externalVideoCapturer);
        this.mObserver = observer;
        this.mFps = i3;
        this.mWidth = i;
        this.mHeight = i2;
        this.mHandler = handler;
    }

    @Override // com.p2082ss.avframework.livestreamv2.IInputVideoStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        if (!(i2 == this.mCurrentFrameWidth && i3 == this.mCurrentFrameHeight)) {
            this.mCurrentFrameWidth = i2;
            this.mCurrentFrameHeight = i3;
            this.mExternalVideoCapturer.adaptOutputFormat(i2, i3, this.mFps, false);
            AVLog.iod("InputVideoStream", "Report first video frame at " + i2 + "x" + i3 + " timestamp " + j);
        }
        ExternalVideoCapturer externalVideoCapturer = this.mExternalVideoCapturer;
        if (externalVideoCapturer != null) {
            return externalVideoCapturer.pushVideoFrame(i, z, i2, i3, i4, fArr, j, null, TimeUtils.currentTimeMs());
        }
        return -1;
    }
}
