package com.p2082ss.avframework.livestreamv2.capture;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.capture.CameraObserver */
public interface CameraObserver {
    static {
        Covode.recordClassIndex(100108);
    }

    void onCaptureStarted(int i, int i2);

    void onCaptureStopped(int i);

    void onError(int i, String str);

    void onInfo(int i, int i2, String str);
}
