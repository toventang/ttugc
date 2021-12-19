package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.i */
public final class C16730i implements AbstractC16727f {

    /* renamed from: a */
    private final List<C16731a<?>> f39955a = new ArrayList();

    static {
        Covode.recordClassIndex(19170);
    }

    /* JADX DEBUG: Type inference failed for r2v0. Raw type applied. Possible types: java.lang.Class<T>, java.lang.Class<R> */
    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16727f
    /* renamed from: a */
    public final <T> void mo26557a(AbstractC16725d<T> dVar) {
        C89219l.m154719c(dVar, "");
        for (T t : this.f39955a) {
            Class cls = (Class<T>) t.f39956a;
            if (cls != null) {
                T t2 = t.f39957b;
                if (t2 != null) {
                    dVar.mo26548a(cls, t2);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.i$a */
    public static final class C16731a<T> {

        /* renamed from: a */
        public final Class<T> f39956a;

        /* renamed from: b */
        public final T f39957b;

        static {
            Covode.recordClassIndex(19171);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16731a)) {
                return false;
            }
            C16731a aVar = (C16731a) obj;
            return C89219l.m154714a(this.f39956a, aVar.f39956a) && C89219l.m154714a(this.f39957b, aVar.f39957b);
        }

        public final int hashCode() {
            Class<T> cls = this.f39956a;
            int i = 0;
            int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
            T t = this.f39957b;
            if (t != null) {
                i = t.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "ParamsItem(inputType=" + this.f39956a + ", input=" + ((Object) this.f39957b) + ")";
        }

        public C16731a(Class<T> cls, T t) {
            C89219l.m154719c(cls, "");
            this.f39956a = cls;
            this.f39957b = t;
        }
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16727f
    /* renamed from: a */
    public final <T> void mo26558a(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        C16731a<?> aVar = new C16731a<>(cls, t);
        if (!this.f39955a.contains(aVar)) {
            this.f39955a.add(aVar);
        }
    }
}
