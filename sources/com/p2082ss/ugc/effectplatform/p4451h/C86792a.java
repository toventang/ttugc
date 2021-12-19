package com.p2082ss.ugc.effectplatform.p4451h;

import com.bytedance.covode.number.Covode;
import p4519d.p4520a.p4521a.C87989b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.h.a */
public final class C86792a {

    /* renamed from: a */
    public final C87989b<String, AbstractC86796e<?>> f195697a = new C87989b<>(true);

    static {
        Covode.recordClassIndex(102491);
    }

    /* renamed from: b */
    public final void mo140037b(String str) {
        C89219l.m154719c(str, "");
        this.f195697a.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* renamed from: a */
    public final <T> AbstractC86796e<T> mo140035a(String str) {
        C89219l.m154719c(str, "");
        AbstractC86796e<?> eVar = this.f195697a.get(str);
        if (!(eVar instanceof AbstractC86796e)) {
            eVar = null;
        }
        AbstractC86796e<T> eVar2 = (AbstractC86796e) eVar;
        if (eVar2 == null) {
            return null;
        }
        return eVar2;
    }

    /* renamed from: a */
    public final <T> void mo140036a(String str, AbstractC86796e<T> eVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(eVar, "");
        this.f195697a.put(str, eVar);
    }
}
