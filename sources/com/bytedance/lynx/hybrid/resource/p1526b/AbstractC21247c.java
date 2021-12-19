package com.bytedance.lynx.hybrid.resource.p1526b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.b.c */
public abstract class AbstractC21247c extends IHybridResourceLoader {
    static {
        Covode.recordClassIndex(24863);
    }

    /* renamed from: a */
    public abstract C21294e mo34838a(C21294e eVar, C21248d dVar);

    /* renamed from: a */
    public abstract void mo34839a(C21294e eVar, C21248d dVar, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public void cancelLoad() {
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public C21294e loadSync(C21294e eVar, C21284j jVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(jVar, "");
        if ((jVar instanceof C21248d) || (jVar = new C21248d(jVar.f50529t).mo34840a(jVar)) != null) {
            return mo34838a(eVar, (C21248d) jVar);
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public void loadAsync(C21294e eVar, C21284j jVar, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        if (!(jVar instanceof C21248d) && (jVar = new C21248d(jVar.f50529t).mo34840a(jVar)) == null) {
            throw new C89388w("null cannot be cast to non-null type");
        }
        mo34839a(eVar, (C21248d) jVar, bVar, bVar2);
    }
}
