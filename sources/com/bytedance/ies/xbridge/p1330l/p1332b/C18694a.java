package com.bytedance.ies.xbridge.p1330l.p1332b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1330l.p1331a.AbstractC18688a;
import com.bytedance.ies.xbridge.p1330l.p1333c.C18696a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.l.b.a */
public final class C18694a extends AbstractC18688a {
    static {
        Covode.recordClassIndex(21388);
    }

    @Override // com.bytedance.ies.xbridge.p1330l.p1331a.AbstractC18688a
    /* renamed from: a */
    public final void mo29725a(C18696a aVar, AbstractC18688a.AbstractC18689a aVar2, EnumC18483e eVar) {
        IHostRouterDepend iHostRouterDepend;
        C18465b bVar;
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(eVar, "");
        String str = aVar.f44477a;
        boolean z = aVar.f44478b;
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if (!((bVar2 == null || (iHostRouterDepend = bVar2.f44104g) == null) && ((bVar = C18465b.f44096l) == null || (iHostRouterDepend = bVar.f44104g) == null))) {
            iHostRouterDepend.closeView(this.f44109d, eVar, str, z);
        }
        aVar2.mo29726a(new C18745b(), "");
    }
}
