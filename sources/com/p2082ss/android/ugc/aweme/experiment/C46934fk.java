package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;

/* renamed from: com.ss.android.ugc.aweme.experiment.fk */
public final class C46934fk {

    /* renamed from: a */
    public static final boolean f109377a;

    /* renamed from: b */
    public static final boolean f109378b;

    /* renamed from: c */
    public static final boolean f109379c;

    /* renamed from: d */
    public static final boolean f109380d;

    /* renamed from: e */
    public static final boolean f109381e;

    /* renamed from: f */
    public static final boolean f109382f;

    /* renamed from: g */
    public static final boolean f109383g;

    /* renamed from: h */
    public static final C46934fk f109384h = new C46934fk();

    /* renamed from: i */
    private static final int f109385i;

    /* renamed from: j */
    private static final int f109386j;

    private C46934fk() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Covode.recordClassIndex(55535);
        boolean z7 = true;
        int a = C16048b.m29633a().mo25412a(true, "zl_profile_opt_launch_fix", 1);
        f109385i = a;
        if (C80446fr.m139458a() && a == 1) {
            a = 65535;
        }
        f109386j = a;
        if ((a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f109377a = z;
        if ((a & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f109378b = z2;
        if ((a & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f109379c = z3;
        if ((a & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f109380d = z4;
        if ((a & 32) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        f109381e = z5;
        if ((a & 64) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        f109382f = z6;
        if ((a & 128) == 0) {
            z7 = false;
        }
        f109383g = z7;
    }
}
