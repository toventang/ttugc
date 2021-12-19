package org.webrtc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.webrtc.VideoFrame;

class NativeCapturerObserver implements CapturerObserver {
    private final long nativeSource;

    static {
        Covode.recordClassIndex(106675);
    }

    private static native void nativeCapturerStarted(long j, boolean z);

    private static native void nativeCapturerStopped(long j);

    private static native void nativeOnFrameCaptured(long j, int i, int i2, int i3, long j2, VideoFrame.Buffer buffer);

    @Override // org.webrtc.CapturerObserver
    public void onCapturerError(String str) {
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        MethodCollector.m26663i(1336);
        nativeCapturerStopped(this.nativeSource);
        MethodCollector.m26664o(1336);
    }

    public NativeCapturerObserver(long j) {
        this.nativeSource = j;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        MethodCollector.m26663i(1334);
        nativeCapturerStarted(this.nativeSource, z);
        MethodCollector.m26664o(1334);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        MethodCollector.m26663i(1344);
        nativeOnFrameCaptured(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
        MethodCollector.m26664o(1344);
    }
}
