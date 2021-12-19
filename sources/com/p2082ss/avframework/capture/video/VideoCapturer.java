package com.p2082ss.avframework.capture.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.engine.VideoSource;

/* renamed from: com.ss.avframework.capture.video.VideoCapturer */
public abstract class VideoCapturer extends VideoSource {

    /* renamed from: com.ss.avframework.capture.video.VideoCapturer$VideoCapturerObserver */
    public interface VideoCapturerObserver {
        static {
            Covode.recordClassIndex(99889);
        }

        void onVideoCapturerError(int i, Exception exc);

        void onVideoCapturerStarted();

        void onVideoCapturerStoped();
    }

    static {
        Covode.recordClassIndex(99888);
    }

    public float getInCapFps() {
        return 0.0f;
    }

    @Override // com.p2082ss.avframework.engine.VideoSource
    public boolean isScreenCast() {
        return false;
    }

    public abstract void start(int i, int i2, int i3);

    public abstract void stop();

    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        return nativeOnFrame(buffer, i, i2, i3, j);
    }
}
