package com.bytedance.android.livesdk.util.rxutils;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.util.rxutils.p651b.C11187c;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88985y;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88435h;
import p4560f.p4561a.p4567d.AbstractC88436i;
import p4560f.p4561a.p4568e.p4584j.C88906h;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.i */
public final class C11195i {

    /* renamed from: a */
    public static AbstractC88433f<Throwable> f26823a = C11196j.f26826a;

    /* renamed from: b */
    public static AbstractC88433f<Object> f26824b = C11197k.f26827a;

    /* renamed from: c */
    public static final Object f26825c = new Object();

    static {
        Covode.recordClassIndex(12822);
    }

    /* renamed from: a */
    public static C11193h m19837a(long j) {
        return new C11193h(j);
    }

    /* renamed from: a */
    public static <T> AbstractC88985y<T, T> m19838a(Fragment fragment, EnumC11186b bVar) {
        return C11187c.m19828a(fragment.getChildFragmentManager()).mo17968a(bVar);
    }

    /* renamed from: a */
    public static <T, R> R m19840a(AbstractC88434g<T, R> gVar, T t) {
        try {
            return gVar.apply(t);
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> R m19842a(AbstractC88436i<T1, T2, T3, T4, R> iVar, T4 t4) {
        try {
            return iVar.mo9212a(t4);
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }

    /* renamed from: a */
    public static <T, U, R> R m19839a(AbstractC88430c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.mo9210a(t, u);
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> R m19841a(AbstractC88435h<T1, T2, T3, R> hVar, T1 t1, T2 t2, T3 t3) {
        try {
            return hVar.mo9211a(t1, t2, t3);
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }
}
