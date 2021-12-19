package com.p2082ss.android.ugc.aweme.share.p3745c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.share.c.a */
public interface AbstractC68902a {

    /* renamed from: a */
    public static final String f154115a;

    /* renamed from: b */
    public static final String f154116b;

    /* renamed from: c */
    public static final String f154117c;

    /* renamed from: d */
    public static final String f154118d;

    /* renamed from: e */
    public static final String f154119e;

    static {
        Covode.recordClassIndex(81208);
        String shareDir = AVExternalServiceImpl.m113114a().configService().cacheConfig().shareDir();
        f154115a = shareDir;
        f154116b = shareDir + "tmp/";
        f154117c = shareDir + "pic/";
        f154118d = shareDir + "out/";
        f154119e = shareDir + "openPlatform/";
    }
}
