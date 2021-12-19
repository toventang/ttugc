package com.bytedance.ies.xbridge.p1313h.p1315b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18426f;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18557a;
import com.bytedance.ies.xbridge.p1313h.p1316c.C18576a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.h.b.a */
public final class C18569a extends AbstractC18557a {
    static {
        Covode.recordClassIndex(21263);
    }

    /* renamed from: com.bytedance.ies.xbridge.h.b.a$a */
    public static final class C18570a implements IReportADLogResultCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC18557a.AbstractC18558a f44252a;

        static {
            Covode.recordClassIndex(21264);
        }

        C18570a(AbstractC18557a.AbstractC18558a aVar) {
            this.f44252a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback
        public final void onFailure(int i, String str) {
            C89219l.m154719c(str, "");
            this.f44252a.mo29659a(i, str);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback
        public final void onSuccess(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            this.f44252a.mo29660a(bVar, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18557a
    /* renamed from: a */
    public final void mo29658a(C18576a aVar, AbstractC18557a.AbstractC18558a aVar2, EnumC18483e eVar) {
        IHostLogDepend iHostLogDepend;
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(eVar, "");
        String str = aVar.f44256a;
        if (str == null) {
            C89219l.m154710a("label");
        }
        String str2 = aVar.f44257b;
        if (str2 == null) {
            C89219l.m154710a("tag");
        }
        C18426f fVar = new C18426f(str, str2, aVar.f44258c, aVar.f44259d, aVar.f44260e, aVar.f44261f, aVar.f44262g);
        C18465b bVar = (C18465b) mo29616a(C18465b.class);
        if (bVar == null || (iHostLogDepend = bVar.f44099b) == null) {
            C18465b bVar2 = C18465b.f44096l;
            if (bVar2 != null) {
                iHostLogDepend = bVar2.f44099b;
            } else {
                return;
            }
        }
        if (iHostLogDepend != null) {
            iHostLogDepend.handleReportADLog(this.f44109d, mo7341b(), fVar, new C18570a(aVar2), eVar);
        }
    }
}
