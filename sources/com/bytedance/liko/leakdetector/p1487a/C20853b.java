package com.bytedance.liko.leakdetector.p1487a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.liko.leakdetector.a.b */
public final class C20853b {

    /* renamed from: a */
    public static final C20853b f49310a = new C20853b();

    private C20853b() {
    }

    static {
        Covode.recordClassIndex(24432);
    }

    /* renamed from: a */
    public static float m39205a() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long j = Runtime.getRuntime().totalMemory();
        long freeMemory = j - Runtime.getRuntime().freeMemory();
        float f = ((float) freeMemory) / ((float) maxMemory);
        C89219l.m154719c("javaMax:" + maxMemory + " javaTotal:" + j + " javaUsed:" + freeMemory + " proportion:" + f, "");
        return f;
    }
}
