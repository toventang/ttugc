package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.discover.a.ah */
public final class C41500ah {

    /* renamed from: a */
    public static final boolean f96814a;

    /* renamed from: b */
    public static final boolean f96815b;

    /* renamed from: c */
    static final boolean f96816c;

    /* renamed from: d */
    public static final C41500ah f96817d = new C41500ah();

    private C41500ah() {
    }

    static {
        boolean z;
        boolean z2;
        Covode.recordClassIndex(49407);
        boolean z3 = true;
        if (C16048b.m29633a().mo25412a(true, "show_account_sug_histories", 0) == 2 || C16048b.m29633a().mo25412a(true, "show_account_sug_histories", 0) == 3) {
            z = true;
        } else {
            z = false;
        }
        f96814a = z;
        if (C16048b.m29633a().mo25412a(true, "show_account_sug_histories", 0) == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        f96815b = z2;
        if (C16048b.m29633a().mo25412a(true, "show_account_sug_histories", 0) == 0) {
            z3 = false;
        }
        f96816c = z3;
    }
}
