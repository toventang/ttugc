package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.experiment.dd */
public final class C46825dd {

    /* renamed from: a */
    public static final boolean f109088a;

    /* renamed from: b */
    public static final boolean f109089b;

    /* renamed from: c */
    public static final boolean f109090c;

    /* renamed from: d */
    public static final boolean f109091d;

    /* renamed from: e */
    public static final boolean f109092e;

    /* renamed from: f */
    public static final boolean f109093f;

    /* renamed from: g */
    public static final C46825dd f109094g = new C46825dd();

    /* renamed from: h */
    private static final int f109095h;

    /* renamed from: i */
    private static final int f109096i;

    private C46825dd() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Covode.recordClassIndex(55426);
        boolean z6 = true;
        int a = C16048b.m29633a().mo25412a(true, "feed_opt_postdelay", 1);
        f109095h = a;
        f109096i = a;
        if ((a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        f109088a = z;
        if ((a & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f109089b = z2;
        if ((a & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f109090c = z3;
        if ((a & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f109091d = z4;
        if ((a & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        f109092e = z5;
        if ((a & 64) == 0) {
            z6 = false;
        }
        f109093f = z6;
    }
}
