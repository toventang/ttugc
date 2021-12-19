package com.bytedance.ies.xbridge.p1301e.p1303b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.p1302a.AbstractC18485a;
import com.bytedance.ies.xbridge.p1301e.p1304c.C18503a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.b.a */
public final class C18499a extends AbstractC18485a {
    static {
        Covode.recordClassIndex(21193);
    }

    @Override // com.bytedance.ies.xbridge.p1301e.p1302a.AbstractC18485a
    /* renamed from: a */
    public final void mo29629a(C18503a aVar, AbstractC18485a.AbstractC18486a aVar2, EnumC18483e eVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(eVar, "");
        String str = aVar.f44156a;
        if (str == null) {
            C89219l.m154710a("eventName");
        }
        C18494b.m34415a(new C18484a(str, aVar.f44157b, aVar.f44158c));
        aVar2.mo29630a(new C18745b(), "");
    }
}
