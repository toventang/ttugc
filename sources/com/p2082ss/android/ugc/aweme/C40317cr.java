package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.cr */
public final class C40317cr {

    /* renamed from: a */
    static final Keva f94480a;

    /* renamed from: b */
    static boolean f94481b;

    /* renamed from: c */
    static long f94482c;

    /* renamed from: d */
    public static final C40317cr f94483d = new C40317cr();

    private C40317cr() {
    }

    static {
        Covode.recordClassIndex(48118);
        Keva repo = Keva.getRepo("NewUserUtils");
        f94480a = repo;
        f94482c = repo.getLong("last_open_time", -1);
    }
}
