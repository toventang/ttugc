package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17714i;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.page.k */
public final class C17721k {

    /* renamed from: a */
    public volatile C17712h f42379a = C17712h.f42360c;

    /* renamed from: b */
    private final AbstractC89172b<C17712h, C89391z> f42380b;

    static {
        Covode.recordClassIndex(20281);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.bytedance.ies.powerlist.page.h, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17721k(AbstractC89172b<? super C17712h, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f42380b = bVar;
    }

    /* renamed from: a */
    private final void m32848a(C17712h hVar) {
        if (!C89219l.m154714a(hVar, this.f42379a)) {
            this.f42379a = hVar;
            this.f42380b.invoke(this.f42379a);
        }
    }

    /* renamed from: a */
    public final void mo28190a(EnumC17698d dVar, EnumC17699e eVar, Object obj) {
        AbstractC17714i dVar2;
        Object obj2;
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(eVar, "");
        int i = C17722l.f42381a[dVar.ordinal()];
        if (i == 1) {
            dVar2 = new AbstractC17714i.C17718d(eVar);
        } else if (i == 2) {
            dVar2 = new AbstractC17714i.C17717c(eVar);
        } else if (i == 3) {
            dVar2 = new AbstractC17714i.C17715a(eVar);
        } else if (i == 4) {
            if (!(obj instanceof Exception)) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            Exception exc = (Exception) obj2;
            if (exc == null) {
                exc = new Exception();
            }
            dVar2 = new AbstractC17714i.C17716b(eVar, exc);
        } else {
            throw new C89376n();
        }
        m32848a(new C17712h(dVar2, this.f42379a.f42363b.mo28168a(dVar, eVar, obj)));
    }
}
