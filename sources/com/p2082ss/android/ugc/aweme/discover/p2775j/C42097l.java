package com.p2082ss.android.ugc.aweme.discover.p2775j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42427n;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import java.util.HashMap;
import java.util.Map;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.l */
public final class C42097l {

    /* renamed from: a */
    public static final Map<C42427n, C89378p<C42427n, C1731i<?>>> f98145a = new HashMap();

    /* renamed from: b */
    public static long f98146b;

    /* renamed from: c */
    public static int f98147c;

    /* renamed from: d */
    public static int f98148d;

    /* renamed from: e */
    public static final C42097l f98149e = new C42097l();

    private C42097l() {
    }

    /* renamed from: a */
    public static void m84310a() {
        f98148d++;
    }

    /* renamed from: b */
    public static void m84313b() {
        f98147c++;
    }

    static {
        Covode.recordClassIndex(50031);
    }

    /* renamed from: a */
    public static void m84311a(C42427n nVar) {
        C89219l.m154721d(nVar, "");
        f98145a.remove(nVar);
    }

    /* renamed from: b */
    public static C89378p<C42427n, C1731i<C42426m>> m84312b(C42427n nVar) {
        C89219l.m154721d(nVar, "");
        C89378p<C42427n, C1731i<C42426m>> c = m84314c(nVar);
        m84311a(nVar);
        return c;
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: h.p<com.ss.android.ugc.aweme.discover.mixfeed.n, b.i<?>>, h.p<com.ss.android.ugc.aweme.discover.mixfeed.n, b.i<com.ss.android.ugc.aweme.discover.mixfeed.m>> */
    /* renamed from: c */
    private static C89378p<C42427n, C1731i<C42426m>> m84314c(C42427n nVar) {
        C89219l.m154721d(nVar, "");
        C89378p pVar = f98145a.get(nVar);
        if (pVar == null) {
            return null;
        }
        C67605g.m119730a(nVar.f98860a).mo106589e();
        C67606h.m119736a(nVar.f98860a).mo106605d();
        return pVar;
    }
}
