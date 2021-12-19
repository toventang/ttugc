package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34598e;
import com.p2082ss.android.ugc.aweme.utils.C80257bo;

/* renamed from: com.ss.android.ugc.aweme.feed.ai */
public final class C48314ai {
    static {
        Covode.recordClassIndex(57056);
    }

    /* renamed from: b */
    public static void m91748b() {
        m91751d();
        C34598e c = C34597d.m70636c();
        c.mo61056b("share_guide_show_times", c.mo61048a("share_guide_show_times", 0) + 1);
    }

    /* renamed from: c */
    public static String m91750c() {
        return C34597d.m70636c().mo61051a("last_share_type", C33842s.C33843a.f80132a.mo60065i().mo59941c());
    }

    /* renamed from: a */
    public static boolean m91747a() {
        int a = C16048b.m29633a().mo25412a(true, "share_guide_threshold", 0);
        if (a < 0) {
            a = Integer.MAX_VALUE;
        }
        m91751d();
        if (C34597d.m70636c().mo61048a("share_guide_show_times", 0) < a) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static void m91751d() {
        int d = (int) (C80257bo.m139112d(System.currentTimeMillis()) / 86400000);
        C34598e c = C34597d.m70636c();
        if (c.mo61048a("share_guide_date_day", -1) != d) {
            c.mo61056b("share_guide_date_day", d);
            c.mo61056b("share_guide_show_times", 0);
        }
    }

    /* renamed from: a */
    public static void m91746a(String str) {
        C34597d.m70636c().mo61057b("last_share_type", str);
    }

    /* renamed from: b */
    public static void m91749b(String str) {
        C34597d.m70636c().mo61057b("last_share_way", str);
    }
}
