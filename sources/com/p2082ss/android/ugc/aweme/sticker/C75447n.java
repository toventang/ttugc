package com.p2082ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.n */
public final class C75447n {
    static {
        Covode.recordClassIndex(88368);
    }

    /* renamed from: a */
    private static final boolean m132311a(String str) {
        if (str == null || ((!C89361p.m154874b(str, "prop_panel_", false) || !(!C89219l.m154714a((Object) str, (Object) "prop_panel_prop_reuse")) || !(!C89219l.m154714a((Object) str, (Object) "prop_panel_challenge"))) && !C89361p.m154874b(str, "duet", false))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static final boolean m132312b(String str) {
        if (C89219l.m154714a((Object) str, (Object) "prop_reuse") || C89219l.m154714a((Object) str, (Object) "prop_collect") || C89219l.m154714a((Object) str, (Object) "homepage_prop_maker") || C89219l.m154714a((Object) str, (Object) "favorite_prop") || C89219l.m154714a((Object) str, (Object) "single_song") || C89219l.m154714a((Object) str, (Object) "prop_page") || C89219l.m154714a((Object) str, (Object) "qr_code") || C89219l.m154714a((Object) str, (Object) "challenge") || C89219l.m154714a((Object) str, (Object) "direct_shoot") || C89219l.m154714a((Object) str, (Object) "outer_rec") || C89219l.m154714a((Object) str, (Object) "outer_save") || C89219l.m154714a((Object) str, (Object) "bubble_rec") || C89219l.m154714a((Object) str, (Object) "duet") || C89219l.m154714a((Object) str, (Object) "prop_search") || C89219l.m154714a((Object) str, (Object) "prop_recommend")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m132310a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (z && !m132311a(str) && !m132312b(str)) {
            return "other";
        }
        return str;
    }
}
