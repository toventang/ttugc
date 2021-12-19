package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;

/* renamed from: com.ss.android.ugc.aweme.utils.gf */
public final class C80492gf {

    /* renamed from: a */
    public static final C80492gf f180086a = new C80492gf();

    /* renamed from: b */
    private static long f180087b;

    private C80492gf() {
    }

    static {
        Covode.recordClassIndex(93765);
    }

    /* renamed from: a */
    public static final void m139513a() {
        C73991bj.m130133d("click to open camera");
        f180087b = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m139514b() {
        C73991bj.m130133d("open camera to first frame cost = ".concat(String.valueOf(System.currentTimeMillis() - f180087b)));
    }
}
