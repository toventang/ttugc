package com.bytedance.ies.xbridge.p1297d.p1299b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1297d.p1298a.AbstractC18470a;
import com.bytedance.ies.xbridge.p1297d.p1300c.C18478a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.d.b.a */
public final class C18476a extends AbstractC18470a {
    static {
        Covode.recordClassIndex(21170);
    }

    @Override // com.bytedance.ies.xbridge.p1297d.p1298a.AbstractC18470a
    /* renamed from: a */
    public final void mo29619a(C18752c cVar, AbstractC18470a.AbstractC18471a aVar, EnumC18483e eVar) {
        IHostContextDepend iHostContextDepend;
        C18465b bVar;
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if ((bVar2 == null || (iHostContextDepend = bVar2.f44102e) == null) && ((bVar = C18465b.f44096l) == null || (iHostContextDepend = bVar.f44102e) == null)) {
            aVar.mo29621a("hostContextDepend not implemented");
        } else if (iHostContextDepend.isDebuggable()) {
            C18478a aVar2 = new C18478a();
            aVar2.f44119a = Boolean.valueOf(iHostContextDepend.isBoeEnable());
            aVar2.f44121c = Boolean.valueOf(iHostContextDepend.isPPEEnable());
            aVar2.f44120b = iHostContextDepend.getBoeChannel();
            aVar2.f44122d = iHostContextDepend.getPPEChannel();
            aVar.mo29620a(aVar2, "");
        } else {
            aVar.mo29621a("x.getDebugInfo is not allowed in non-debuggable env");
        }
    }
}
