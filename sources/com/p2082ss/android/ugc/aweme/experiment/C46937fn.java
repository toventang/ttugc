package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;

/* renamed from: com.ss.android.ugc.aweme.experiment.fn */
public final class C46937fn {

    /* renamed from: a */
    public static final boolean f109391a;

    /* renamed from: b */
    public static final boolean f109392b;

    /* renamed from: c */
    public static final boolean f109393c;

    /* renamed from: d */
    public static final C46937fn f109394d = new C46937fn();

    /* renamed from: e */
    private static final int f109395e;

    /* renamed from: f */
    private static final int f109396f;

    private C46937fn() {
    }

    static {
        boolean z;
        boolean z2;
        Covode.recordClassIndex(55538);
        boolean z3 = true;
        int a = C16048b.m29633a().mo25412a(true, "zl_profile_opt_preload", 1);
        f109395e = a;
        if (C80446fr.m139458a() && a == 1) {
            a = 65535;
        }
        f109396f = a;
        if ((a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f109391a = z;
        if ((a & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f109392b = z2;
        if ((a & 8) == 0) {
            z3 = false;
        }
        f109393c = z3;
    }
}
