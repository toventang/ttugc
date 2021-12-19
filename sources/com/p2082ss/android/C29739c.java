package com.p2082ss.android;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.c */
public final class C29739c {

    /* renamed from: a */
    public static final String f70927a;

    static {
        String str;
        Covode.recordClassIndex(36140);
        if (Keva.getRepo("ab_repo_cold_boot").getBoolean("isInTikTokRegionForAbTestInit", false)) {
            str = "https://libra-sg.tiktokv.com/common";
        } else {
            str = "https://libra-va.tiktokv.com/common";
        }
        f70927a = str;
    }
}
