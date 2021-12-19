package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44890b;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.b */
public final class C44843b extends AbstractC20179a<IPdpStarter.PdpEnterParam, C44890b, IPdpStarter.PdpEnterParam, C44890b> {
    static {
        Covode.recordClassIndex(53230);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<C44890b> mo33481a(IPdpStarter.PdpEnterParam pdpEnterParam) {
        IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpEnterParam;
        C89219l.m154721d(pdpEnterParam2, "");
        C89219l.m154721d(pdpEnterParam2, "");
        AbstractC88979t<C44890b> b = ((PdpApi) PdpApi.C44837a.f104572a.mo28858a(PdpApi.class)).getProductInfo(pdpEnterParam2.getRequestParams()).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj2;
    }
}
