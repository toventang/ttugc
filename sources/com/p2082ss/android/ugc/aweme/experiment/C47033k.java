package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.experiment.k */
public final class C47033k {

    /* renamed from: a */
    public static final boolean f109571a;

    /* renamed from: b */
    public static final boolean f109572b;

    /* renamed from: c */
    public static final boolean f109573c;

    /* renamed from: d */
    public static final boolean f109574d;

    /* renamed from: e */
    public static final int f109575e;

    /* renamed from: f */
    public static final C47033k f109576f = new C47033k();

    /* renamed from: g */
    private static final int f109577g;

    /* renamed from: h */
    private static final boolean f109578h;

    /* renamed from: i */
    private static final boolean f109579i;

    /* renamed from: j */
    private static final boolean f109580j;

    /* renamed from: k */
    private static final boolean f109581k;

    /* renamed from: l */
    private static final boolean f109582l;

    private C47033k() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Covode.recordClassIndex(55634);
        int i = Keva.getRepo("ab_repo_cold_boot").getInt("zl_async_inflate", 49);
        f109577g = i;
        boolean z9 = true;
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        f109578h = z;
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f109579i = z2;
        if ((i & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        f109580j = z3;
        if ((i & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        f109571a = z4;
        if ((i & 256) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        f109572b = z5;
        if ((i & 512) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        f109573c = z6;
        if ((i & 1024) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        f109581k = z7;
        if ((i & 2048) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        f109574d = z8;
        if ((i & 4096) == 0) {
            z9 = false;
        }
        f109582l = z9;
        f109575e = i & 15;
    }
}
