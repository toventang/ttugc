package com.bytedance.ies.xbridge.p1343n.p1345b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18758b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.b.b */
public final class C18778b extends AbstractC18758b {
    static {
        Covode.recordClassIndex(21474);
    }

    @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18758b
    /* renamed from: a */
    public final void mo29801a(C18752c cVar, AbstractC18758b.AbstractC18759a aVar, EnumC18483e eVar) {
        IHostStyleUIDepend iHostStyleUIDepend;
        Boolean hideLoading;
        C18465b bVar;
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if (((bVar2 == null || (iHostStyleUIDepend = bVar2.f44103f) == null) && ((bVar = C18465b.f44096l) == null || (iHostStyleUIDepend = bVar.f44103f) == null)) || (hideLoading = iHostStyleUIDepend.hideLoading(this.f44109d)) == null) {
            aVar.mo29803a("");
            return;
        }
        hideLoading.booleanValue();
        aVar.mo29802a(new C18745b(), "");
    }
}
