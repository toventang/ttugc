package com.bytedance.ies.xbridge.p1330l.p1332b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1330l.p1331a.AbstractC18691b;
import com.bytedance.ies.xbridge.p1330l.p1333c.C18698b;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.l.b.b */
public final class C18695b extends AbstractC18691b {
    static {
        Covode.recordClassIndex(21389);
    }

    /* renamed from: a */
    private final IHostRouterDepend m34707a() {
        IHostRouterDepend iHostRouterDepend;
        C18465b bVar = (C18465b) mo29616a(C18465b.class);
        if (bVar != null && (iHostRouterDepend = bVar.f44104g) != null) {
            return iHostRouterDepend;
        }
        C18465b bVar2 = C18465b.f44096l;
        if (bVar2 != null) {
            return bVar2.f44104g;
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.p1330l.p1331a.AbstractC18691b
    /* renamed from: a */
    public final void mo29727a(C18698b bVar, AbstractC18691b.AbstractC18692a aVar, EnumC18483e eVar) {
        IHostRouterDepend a;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        String str = bVar.f44480a;
        if (str == null) {
            C89219l.m154710a("schema");
        }
        boolean z = bVar.f44481b;
        boolean z2 = bVar.f44482c;
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29729a("Context not provided in host");
        }
        Map<String, ? extends Object> a2 = C89041ag.m154412a(C89387v.m154943a("useSysBrowser", Boolean.valueOf(z2)));
        IHostRouterDepend a3 = m34707a();
        if (a3 != null) {
            a3.openSchema(this.f44109d, str, a2, eVar, context);
        }
        if (z && (a = m34707a()) != null) {
            a.closeView(this.f44109d, eVar, null, false);
        }
        aVar.mo29728a(new C18745b(), "");
    }
}
