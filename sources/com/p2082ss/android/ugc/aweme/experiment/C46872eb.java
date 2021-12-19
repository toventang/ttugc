package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.lego.p3392b.C58177c;

/* renamed from: com.ss.android.ugc.aweme.experiment.eb */
public final class C46872eb {

    /* renamed from: a */
    public static final boolean f109217a;

    /* renamed from: b */
    public static final boolean f109218b;

    /* renamed from: c */
    public static final boolean f109219c;

    /* renamed from: d */
    public static final boolean f109220d;

    /* renamed from: e */
    public static final C46872eb f109221e = new C46872eb();

    /* renamed from: f */
    private static final int f109222f;

    /* renamed from: g */
    private static final int f109223g;

    /* renamed from: h */
    private static final boolean f109224h;

    private C46872eb() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Covode.recordClassIndex(55473);
        boolean z5 = true;
        int a = C16048b.m29633a().mo25412a(true, "zl_launch_opt_doframe", 62);
        f109222f = a;
        f109223g = a;
        if ((a & 2) == 0 || !C58177c.m105092a()) {
            z = false;
        } else {
            z = true;
        }
        f109217a = z;
        if ((a & 4) == 0 || !C58177c.m105092a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        f109224h = z2;
        if ((a & 8) == 0 || !C58177c.m105092a()) {
            z3 = false;
        } else {
            z3 = true;
        }
        f109218b = z3;
        if ((a & 16) == 0 || !C58177c.m105092a()) {
            z4 = false;
        } else {
            z4 = true;
        }
        f109219c = z4;
        if ((a & 32) == 0 || !C58177c.m105092a()) {
            z5 = false;
        }
        f109220d = z5;
    }
}
