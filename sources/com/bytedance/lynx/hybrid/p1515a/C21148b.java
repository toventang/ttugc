package com.bytedance.lynx.hybrid.p1515a;

import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p739k.C12118a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.bytedance.lynx.hybrid.p1524j.C21213f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.a.b */
public final class C21148b extends AbstractC21152f {

    /* renamed from: a */
    public final C21196a f50181a;

    /* renamed from: b */
    public final AbstractC21152f f50182b;

    static {
        Covode.recordClassIndex(24764);
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
    /* renamed from: a */
    public final void mo25380a() {
        C21213f.m39929a(this.f50181a.f50280f, "prepare_component_start", System.currentTimeMillis());
        AbstractC21152f fVar = this.f50182b;
        if (fVar != null) {
            fVar.mo25380a();
        }
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
    /* renamed from: b */
    public final void mo25383b() {
        C21213f.m39929a(this.f50181a.f50280f, "prepare_component_end", System.currentTimeMillis());
        AbstractC21152f fVar = this.f50182b;
        if (fVar != null) {
            fVar.mo25383b();
        }
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
    /* renamed from: c */
    public final void mo25385c() {
        String str = this.f50181a.f50280f;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        C12115b.m21583b("ContainerStandardApi", "invalidateID [monitorId:" + str + ']');
        C89219l.m154719c(str, "");
        C12118a.f29140a.remove(str);
        C12118a.f29141b.remove(str);
        C21170d a = C21170d.C21171a.m39868a();
        C21196a aVar = this.f50181a;
        C89219l.m154719c(aVar, "");
        a.f50222c.remove(aVar);
        AbstractC21152f fVar = this.f50182b;
        if (fVar != null) {
            fVar.mo25385c();
        }
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
    /* renamed from: a */
    public final void mo34718a(EnumC21149c cVar) {
        C89219l.m154719c(cVar, "");
        AbstractC21152f fVar = this.f50182b;
        if (fVar != null) {
            fVar.mo34718a(cVar);
        }
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
    /* renamed from: a */
    public final void mo25381a(AbstractC21154h hVar) {
        C89219l.m154719c(hVar, "");
        AbstractC21152f fVar = this.f50182b;
        if (fVar != null) {
            fVar.mo25381a(hVar);
        }
    }

    public C21148b(C21196a aVar, AbstractC21152f fVar) {
        C89219l.m154719c(aVar, "");
        this.f50181a = aVar;
        this.f50182b = fVar;
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
    /* renamed from: b */
    public final void mo25384b(AbstractC21154h hVar, String str) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(str, "");
        AbstractC21152f fVar = this.f50182b;
        if (fVar != null) {
            fVar.mo25384b(hVar, str);
        }
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
    /* renamed from: a */
    public final void mo25382a(AbstractC21154h hVar, String str) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(str, "");
        AbstractC21152f fVar = this.f50182b;
        if (fVar != null) {
            fVar.mo25382a(hVar, str);
        }
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
    /* renamed from: a */
    public final void mo34719a(AbstractC21154h hVar, String str, String str2) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(str, "");
        AbstractC21152f fVar = this.f50182b;
        if (fVar != null) {
            fVar.mo34719a(hVar, str, str2);
        }
    }
}
