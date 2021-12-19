package com.p2082ss.android.vesdk.audio;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.audio.h */
public interface AbstractC85340h {
    static {
        Covode.recordClassIndex(99452);
    }

    void onError(int i, int i2, String str);

    void onInfo(int i, int i2, double d, Object obj);

    void onReceive(C85342j jVar);
}
