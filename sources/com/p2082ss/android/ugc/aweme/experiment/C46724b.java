package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.b */
public final class C46724b {

    /* renamed from: a */
    public static final boolean f108900a;

    /* renamed from: b */
    public static final boolean f108901b;

    /* renamed from: c */
    public static final boolean f108902c;

    /* renamed from: d */
    public static final boolean f108903d;

    /* renamed from: e */
    public static final int f108904e;

    /* renamed from: f */
    public static final C46724b f108905f = new C46724b();

    /* renamed from: g */
    private static final int f108906g;

    /* renamed from: h */
    private static final int f108907h;

    private C46724b() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        Covode.recordClassIndex(55325);
        boolean z4 = true;
        int a = C16048b.m29633a().mo25412a(true, "zl_activity_opt_with_gc", 1);
        f108906g = a;
        f108907h = a;
        if ((a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        f108900a = z;
        if ((a & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f108901b = z2;
        if ((a & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f108902c = z3;
        if ((a & 128) == 0) {
            z4 = false;
        }
        f108903d = z4;
        f108904e = a & 15;
    }
}
