package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VEVersionUtil */
public class VEVersionUtil {
    static {
        Covode.recordClassIndex(99385);
    }

    public static String getVESDKVersion() {
        return "10.5.0.161".concat(String.valueOf("-".concat("mt")));
    }
}
