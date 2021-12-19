package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;

/* renamed from: com.ss.android.ugc.aweme.experiment.fj */
public final class C46933fj {

    /* renamed from: a */
    public static final boolean f109368a;

    /* renamed from: b */
    public static final boolean f109369b;

    /* renamed from: c */
    public static final boolean f109370c;

    /* renamed from: d */
    public static final boolean f109371d;

    /* renamed from: e */
    public static final C46933fj f109372e = new C46933fj();

    /* renamed from: f */
    private static final int f109373f;

    /* renamed from: g */
    private static final int f109374g;

    /* renamed from: h */
    private static final boolean f109375h;

    /* renamed from: i */
    private static final boolean f109376i;

    private C46933fj() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Covode.recordClassIndex(55534);
        boolean z6 = true;
        int a = C16048b.m29633a().mo25412a(true, "zl_profile_opt_gc", 1);
        f109373f = a;
        if (C80446fr.m139458a() && a == 1) {
            a = 65535;
        }
        f109374g = a;
        if ((a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f109368a = z;
        if ((a & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f109369b = z2;
        if ((a & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f109375h = z3;
        if ((a & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f109376i = z4;
        if ((a & 32) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        f109370c = z5;
        if ((a & 64) == 0) {
            z6 = false;
        }
        f109371d = z6;
    }
}
