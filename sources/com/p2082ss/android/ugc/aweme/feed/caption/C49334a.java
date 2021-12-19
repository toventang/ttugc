package com.p2082ss.android.ugc.aweme.feed.caption;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.a */
public final class C49334a {

    /* renamed from: a */
    public static final C49334a f113375a = new C49334a();

    /* renamed from: b */
    private static final Keva f113376b;

    private C49334a() {
    }

    /* renamed from: a */
    public static boolean m92423a() {
        return f113376b.getBoolean("has_tap_translated_caption", false);
    }

    /* renamed from: b */
    public static void m92424b() {
        f113376b.storeBoolean("has_tap_translated_caption", true);
    }

    static {
        Covode.recordClassIndex(58135);
        Keva repo = Keva.getRepo("cross_language_caption_keva");
        C89219l.m154716b(repo, "");
        f113376b = repo;
    }
}
