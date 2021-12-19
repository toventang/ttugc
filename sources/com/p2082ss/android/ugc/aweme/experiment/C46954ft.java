package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.ft */
public final class C46954ft {

    /* renamed from: a */
    public static final int f109429a = 0;

    /* renamed from: b */
    public static final C46954ft f109430b = new C46954ft();

    /* renamed from: c */
    private static final int f109431c = 1;

    /* renamed from: d */
    private static final int f109432d = 2;

    private C46954ft() {
    }

    static {
        Covode.recordClassIndex(55555);
    }

    /* renamed from: a */
    public static final boolean m90241a() {
        if (C16048b.m29633a().mo25412a(true, "show_super_accounts_to_unlogged_users", 0) == f109432d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m90242b() {
        if (C16048b.m29633a().mo25412a(true, "show_super_accounts_to_unlogged_users", 0) != f109429a) {
            return true;
        }
        return false;
    }
}
