package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.account.C31575b;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.c */
public final class C42634c {

    /* renamed from: a */
    public static final C42634c f99453a = new C42634c();

    private C42634c() {
    }

    static {
        Covode.recordClassIndex(50738);
    }

    /* renamed from: b */
    private static int m85142b() {
        return C16048b.m29633a().mo25412a(true, "search_filter_activity", 0);
    }

    /* renamed from: a */
    public static boolean m85141a() {
        if (m85142b() <= 0 || !C31575b.m65865g().isLogin()) {
            return false;
        }
        return true;
    }
}
