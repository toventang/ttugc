package com.p2082ss.android.ugc.p4267g.p4268a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.g.a.d */
public final class C82003d {

    /* renamed from: a */
    static long f183523a = -1;

    /* renamed from: b */
    static long f183524b = -1;

    /* renamed from: c */
    static int f183525c;

    /* renamed from: d */
    static AtomicBoolean f183526d = new AtomicBoolean(true);

    /* renamed from: e */
    static Thread f183527e;

    /* renamed from: f */
    static RunnableC81984a f183528f;

    /* renamed from: g */
    public static final C82003d f183529g = new C82003d();

    /* renamed from: h */
    private static EnumC81991b f183530h = EnumC81991b.UNKNOWN_STATUS;

    private C82003d() {
    }

    static {
        Covode.recordClassIndex(95818);
    }

    /* renamed from: a */
    public static void m141961a(long j) {
        Thread thread;
        RunnableC81984a aVar = f183528f;
        if (aVar != null && aVar.f183457b.contains(Long.valueOf(j)) && (thread = f183527e) != null) {
            thread.interrupt();
        }
    }
}
