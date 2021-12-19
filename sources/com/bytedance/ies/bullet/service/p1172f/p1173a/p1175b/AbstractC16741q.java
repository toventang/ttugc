package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.q */
public abstract class AbstractC16741q {

    /* renamed from: a */
    private boolean f39983a;

    /* renamed from: as */
    public final Map<Class<?>, AbstractC89172b<?, C16728g<?>>> f39984as = new LinkedHashMap();

    static {
        Covode.recordClassIndex(19181);
    }

    /* renamed from: a */
    public abstract List<AbstractC16725d<?>> mo26542a();

    /* renamed from: a */
    private final void m31063a(AbstractC16727f fVar) {
        if (!this.f39983a) {
            Iterator<T> it = mo26542a().iterator();
            while (it.hasNext()) {
                it.next().mo26547a(fVar);
            }
            this.f39983a = true;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m31062a(AbstractC16741q qVar, String str) {
        C89219l.m154719c(str, "");
        for (T t : qVar.mo26542a()) {
            if (C89219l.m154714a((Object) t.mo26546a(), (Object) str)) {
                return t.mo26550b();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <R> void mo26572a(Class<R> cls, R r, AbstractC16727f fVar) {
        C16728g<?> invoke;
        C89219l.m154719c(cls, "");
        if (fVar != null) {
            fVar.mo26558a(cls, r);
            m31063a(fVar);
            return;
        }
        AbstractC89172b<?, C16728g<?>> bVar = this.f39984as.get(cls);
        if (bVar == null || !C89206ad.m154678a(bVar, 1) || (invoke = bVar.invoke(r)) == null) {
            Iterator<T> it = mo26542a().iterator();
            while (it.hasNext()) {
                it.next().mo26548a(cls, r);
            }
            return;
        }
        Iterator<T> it2 = mo26542a().iterator();
        while (it2.hasNext()) {
            it2.next().mo26548a(invoke.f39953a, invoke.f39954b);
        }
    }
}
