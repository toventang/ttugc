package com.p2082ss.android.ugc.aweme.music.p3476k;

import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.music.k.g */
public final class C60829g {

    /* renamed from: a */
    public static final String f138241a = (AVExternalServiceImpl.m113114a().configService().cacheConfig().musicDir() + "rhythm/");

    static {
        Covode.recordClassIndex(71386);
    }

    /* renamed from: a */
    public static String m110430a(String str) {
        return f138241a + m110431b(str);
    }

    /* renamed from: b */
    public static String m110431b(String str) {
        return C13607d.m24442b(str) + ".json";
    }
}
