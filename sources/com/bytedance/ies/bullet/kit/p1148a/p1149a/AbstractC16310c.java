package com.bytedance.ies.bullet.kit.p1148a.p1149a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.a.a.c */
public abstract class AbstractC16310c extends IXResourceLoader {
    static {
        Covode.recordClassIndex(18603);
    }

    /* renamed from: a */
    public abstract C16610ap mo25895a(C16610ap apVar, C16311d dVar);

    /* renamed from: a */
    public abstract void mo25896a(C16610ap apVar, C16311d dVar, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public C16610ap loadSync(C16610ap apVar, C16667j jVar) {
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(jVar, "");
        if ((jVar instanceof C16311d) || (jVar = new C16311d(jVar.f39857y).mo25897a(jVar)) != null) {
            return mo25895a(apVar, (C16311d) jVar);
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void loadAsync(C16610ap apVar, C16667j jVar, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        if (!(jVar instanceof C16311d) && (jVar = new C16311d(jVar.f39857y).mo25897a(jVar)) == null) {
            throw new C89388w("null cannot be cast to non-null type");
        }
        mo25896a(apVar, (C16311d) jVar, bVar, bVar2);
    }
}
