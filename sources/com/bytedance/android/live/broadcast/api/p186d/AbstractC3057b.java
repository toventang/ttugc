package com.bytedance.android.live.broadcast.api.p186d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.api.d.b */
public interface AbstractC3057b {
    static {
        Covode.recordClassIndex(3535);
    }

    void beforeLiveCoreStartStream();

    void connected();

    void onCaptureFirstFrame();

    void onFirstRTMPConnect();

    void onInfo(float f);

    void onNetworkLow();

    void onNetworkStatus(int i);

    void onReconnect();

    void onReconnected();

    void onStreamEnd(int i, int i2, String str);

    void onStreamStart();
}
