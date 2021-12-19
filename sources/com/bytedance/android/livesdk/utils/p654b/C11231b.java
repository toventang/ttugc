package com.bytedance.android.livesdk.utils.p654b;

import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88655aj;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88657ak;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88686av;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.utils.b.b */
public final class C11231b<T> {

    /* renamed from: a */
    public AbstractC88979t<T> f26877a;

    static {
        Covode.recordClassIndex(12859);
    }

    C11231b(AbstractC88979t<T> tVar) {
        this.f26877a = tVar;
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo17979a(long j) {
        return m19895a(j, C88446a.f200702h);
    }

    /* renamed from: a */
    public static AbstractC88979t<Long> m19897a(TimeUnit timeUnit) {
        AbstractC88398aa a;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            a = C88946a.m154209a(C40780g.m82245b());
        } else {
            a = C88925a.m154160a(C88946a.f201990b);
        }
        return m19898a(timeUnit, a);
    }

    /* renamed from: b */
    public static AbstractC88979t<Long> m19899b(long j, TimeUnit timeUnit) {
        AbstractC88398aa a;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            a = C88946a.m154209a(C40780g.m82245b());
        } else {
            a = C88925a.m154160a(C88946a.f201990b);
        }
        return m19894a(j, j, timeUnit, a);
    }

    /* renamed from: a */
    private AbstractC88979t<T> m19895a(long j, AbstractC88438k<? super Throwable> kVar) {
        if (j >= 0) {
            C88466b.m153697a((Object) kVar, "predicate is null");
            return C88925a.m154171a(new C88686av(this.f26877a, j, kVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j)));
    }

    /* renamed from: a */
    public static AbstractC88979t<Long> m19896a(long j, TimeUnit timeUnit) {
        AbstractC88398aa a;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            a = C88946a.m154209a(C40780g.m82245b());
        } else {
            a = C88925a.m154160a(C88946a.f201990b);
        }
        return m19894a(0, j, timeUnit, a);
    }

    /* renamed from: a */
    private static AbstractC88979t<Long> m19898a(TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154171a(new C88657ak(0, 9, Math.max(0L, 1000L), Math.max(0L, 1000L), timeUnit, aaVar));
    }

    /* renamed from: a */
    private static AbstractC88979t<Long> m19894a(long j, long j2, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154171a(new C88655aj(Math.max(0L, j), Math.max(0L, j2), timeUnit, aaVar));
    }
}
