package com.p2082ss.android.ugc.aweme.shortvideo.p3838k;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.g */
public final class C71913g {

    /* renamed from: a */
    public static final C71913g f161147a = new C71913g();

    private C71913g() {
    }

    static {
        Covode.recordClassIndex(84462);
    }

    /* renamed from: b */
    public static final boolean m126989b() {
        if (m126991d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m126990c() {
        if (m126991d() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m126991d() {
        return C16048b.m29633a().mo25412a(true, "expand_the_character_limit_of_video_caption_from_150_to_500", 0);
    }

    /* renamed from: e */
    private static boolean m126992e() {
        if (m126991d() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m126988a() {
        if (m126992e() || m126989b() || m126990c()) {
            return false;
        }
        return true;
    }
}
