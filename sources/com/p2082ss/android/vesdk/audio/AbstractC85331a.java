package com.p2082ss.android.vesdk.audio;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85521l;

/* renamed from: com.ss.android.vesdk.audio.a */
public interface AbstractC85331a {
    static {
        Covode.recordClassIndex(99443);
    }

    int init(C85521l lVar);

    void release(PrivacyCert privacyCert);

    int start(PrivacyCert privacyCert);

    int stop(PrivacyCert privacyCert);
}
