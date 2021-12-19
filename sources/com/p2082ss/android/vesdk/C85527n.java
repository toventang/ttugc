package com.p2082ss.android.vesdk;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.model.C84224v;

/* renamed from: com.ss.android.vesdk.n */
public final class C85527n {
    static {
        Covode.recordClassIndex(99696);
    }

    /* renamed from: a */
    public static String m147374a(int i) {
        if (i == 1) {
            return "beauty_brighten";
        }
        if (i == 2) {
            return "beauty_smooth";
        }
        if (i == 4) {
            return "reshape_eye";
        }
        if (i == 5) {
            return "reshape cheek";
        }
        if (i == 9) {
            return "sharp";
        }
        switch (i) {
            case 17:
                return "beauty_lipstick";
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return "beauty_blusher";
            case 19:
                return "beauty_nasolabial";
            case C84224v.f188239U:
                return "beauty_pouch";
            default:
                return "";
        }
    }
}
