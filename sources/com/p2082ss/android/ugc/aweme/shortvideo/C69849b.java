package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.b */
public final class C69849b {

    /* renamed from: a */
    public static final Keva f156091a;

    /* renamed from: b */
    public static final C69849b f156092b = new C69849b();

    private C69849b() {
    }

    /* renamed from: a */
    public static boolean m123425a() {
        return f156091a.getBoolean("has_tap_feed_caption", false);
    }

    static {
        Covode.recordClassIndex(82257);
        Keva repo = Keva.getRepo("av_feed_keva");
        C89219l.m154716b(repo, "");
        f156091a = repo;
    }
}
