package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform */
public final class UseKNPlatform {
    public static final UseKNPlatform INSTANCE = new UseKNPlatform();
    public static boolean enableKNPlatform = true;

    private UseKNPlatform() {
    }

    static {
        Covode.recordClassIndex(95765);
    }
}
