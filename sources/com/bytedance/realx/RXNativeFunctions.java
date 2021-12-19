package com.bytedance.realx;

import com.bytedance.covode.number.Covode;
import org.webrtc.VideoFrame;

public final class RXNativeFunctions {
    static {
        Covode.recordClassIndex(25634);
    }

    public static native void nativeOnCapturerError(long j, int i);

    public static native void nativeOnCapturerStarted(long j, boolean z);

    public static native void nativeOnCapturerStopped(long j);

    public static native void nativeOnFrameCaptured(long j, VideoFrame videoFrame);
}
