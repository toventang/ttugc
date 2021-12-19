package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.dc */
public final class C46824dc {

    /* renamed from: a */
    public static final boolean f109078a;

    /* renamed from: b */
    public static final boolean f109079b;

    /* renamed from: c */
    public static final boolean f109080c;

    /* renamed from: d */
    public static final boolean f109081d;

    /* renamed from: e */
    public static final boolean f109082e;

    /* renamed from: f */
    public static final boolean f109083f;

    /* renamed from: g */
    public static final boolean f109084g;

    /* renamed from: h */
    public static final C46824dc f109085h = new C46824dc();

    /* renamed from: i */
    private static final int f109086i;

    /* renamed from: j */
    private static final int f109087j;

    private C46824dc() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Covode.recordClassIndex(55425);
        boolean z7 = true;
        int a = C16048b.m29633a().mo25412a(true, "zl_feed_opt_thread", 1);
        f109086i = a;
        f109087j = a;
        if ((a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f109078a = z;
        if ((a & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f109079b = z2;
        if ((a & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f109080c = z3;
        if ((a & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f109081d = z4;
        if ((a & 32) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        f109082e = z5;
        if ((a & 64) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        f109083f = z6;
        if ((a & 128) == 0) {
            z7 = false;
        }
        f109084g = z7;
    }
}
