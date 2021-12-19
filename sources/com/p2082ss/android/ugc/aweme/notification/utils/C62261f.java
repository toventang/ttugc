package com.p2082ss.android.ugc.aweme.notification.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.f */
public final class C62261f {

    /* renamed from: a */
    public static final C62261f f141312a = new C62261f();

    /* renamed from: a */
    public static final String m112631a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "new" : "earlier" : "this_month" : "this_week" : "yesterday" : "today";
    }

    private C62261f() {
    }

    static {
        Covode.recordClassIndex(73035);
    }

    /* renamed from: a */
    public static String m112632a(Integer num) {
        int a = C61530a.C61532b.m111445a();
        if (num == null || num.intValue() == a) {
            return "all";
        }
        if (num.intValue() == 3) {
            return "likes";
        }
        if (num.intValue() == 44) {
            return "comments";
        }
        if (num.intValue() == 84) {
            return "qa";
        }
        if (num.intValue() == 7) {
            return "followers";
        }
        if (num.intValue() == 26) {
            return "mentions";
        }
        if (num.intValue() == 599) {
            return "shop";
        }
        if (num.intValue() == 37) {
            return "official";
        }
        return "all";
    }
}
