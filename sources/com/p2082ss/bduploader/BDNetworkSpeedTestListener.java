package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDNetworkSpeedTestListener */
public interface BDNetworkSpeedTestListener {
    static {
        Covode.recordClassIndex(100793);
    }

    void onSpeedTestContext(int i, int i2, String str);

    int speedTestCheckNetState(int i, int i2);
}
