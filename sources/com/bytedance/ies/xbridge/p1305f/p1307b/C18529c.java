package com.bytedance.ies.xbridge.p1305f.p1307b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18523c;
import com.bytedance.ies.xbridge.p1305f.p1308c.C18537d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.f.b.c */
public final class C18529c extends AbstractC18523c {
    static {
        Covode.recordClassIndex(21223);
    }

    @Override // com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18523c
    /* renamed from: a */
    public final void mo29648a(C18752c cVar, AbstractC18523c.AbstractC18524a aVar, EnumC18483e eVar) {
        IHostFrameworkDepend iHostFrameworkDepend;
        String containerID;
        C18465b bVar;
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if (((bVar2 == null || (iHostFrameworkDepend = bVar2.f44098a) == null) && ((bVar = C18465b.f44096l) == null || (iHostFrameworkDepend = bVar.f44098a) == null)) || (containerID = iHostFrameworkDepend.getContainerID(this.f44109d)) == null) {
            aVar.mo29650a("getContainerID not implemented in ContainerDepend");
            return;
        }
        C18537d dVar = new C18537d();
        dVar.f44201a = containerID;
        aVar.mo29649a(dVar, "");
    }
}
