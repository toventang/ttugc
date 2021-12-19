package com.bytedance.ies.xbridge.p1343n.p1345b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18765d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.b.d */
public final class C18781d extends AbstractC18765d {
    static {
        Covode.recordClassIndex(21477);
    }

    @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18765d
    /* renamed from: a */
    public final void mo29807a(C18752c cVar, AbstractC18765d.AbstractC18766a aVar, EnumC18483e eVar) {
        IHostStyleUIDepend iHostStyleUIDepend;
        Boolean showLoading;
        C18465b bVar;
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if (((bVar2 == null || (iHostStyleUIDepend = bVar2.f44103f) == null) && ((bVar = C18465b.f44096l) == null || (iHostStyleUIDepend = bVar.f44103f) == null)) || (showLoading = iHostStyleUIDepend.showLoading(this.f44109d)) == null) {
            aVar.mo29809a("");
            return;
        }
        showLoading.booleanValue();
        aVar.mo29808a(new C18745b(), "");
    }
}
