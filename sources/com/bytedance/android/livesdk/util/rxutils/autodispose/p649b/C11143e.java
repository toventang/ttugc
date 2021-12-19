package com.bytedance.android.livesdk.util.rxutils.autodispose.p649b;

import com.bytedance.android.livesdk.util.rxutils.autodispose.C11135aa;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11168q;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88502d;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88720bi;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.b.e */
public final class C11143e {

    /* renamed from: a */
    private static final Comparator<Comparable<Object>> f26758a = C11146h.f26762a;

    static {
        Covode.recordClassIndex(12770);
    }

    /* renamed from: a */
    public static <E> AbstractC88917f m19782a(AbstractC11142d<E> dVar) {
        AbstractC88438k gVar;
        E d = dVar.mo17929d();
        AbstractC11139a<E> b = dVar.mo17927b();
        if (d != null) {
            try {
                E apply = b.apply(d);
                AbstractC88979t<E> a = dVar.mo17926a();
                Comparator<Comparable<Object>> comparator = null;
                if (apply instanceof Comparable) {
                    comparator = f26758a;
                }
                if (comparator != null) {
                    gVar = new C11144f(comparator, apply);
                } else {
                    gVar = new C11145g(apply);
                }
                AbstractC88979t<E> f = a.mo143297f();
                C88466b.m153697a((Object) gVar, "predicate is null");
                return C88925a.m154171a(new C88720bi(f, gVar)).mo143290d();
            } catch (Exception e) {
                if (!(e instanceof C11140b)) {
                    return AbstractC88410b.m153640a(e);
                }
                AbstractC88433f<? super C11135aa> fVar = C11168q.f26783a;
                if (fVar != null) {
                    try {
                        fVar.accept((C11140b) e);
                        return C88925a.m154165a(C88502d.f200771a);
                    } catch (Exception e2) {
                        return AbstractC88410b.m153640a(e2);
                    }
                } else {
                    throw e;
                }
            }
        } else {
            throw new C11141c();
        }
    }
}
