package com.bytedance.ies.xbridge.p1313h.p1315b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18687l;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18563c;
import com.bytedance.ies.xbridge.p1313h.p1316c.C18581c;
import com.bytedance.ies.xbridge.p1349o.C18809c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.h.b.c */
public final class C18573c extends AbstractC18563c {
    static {
        Covode.recordClassIndex(21267);
    }

    @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18563c
    /* renamed from: a */
    public final void mo29664a(C18581c cVar, AbstractC18563c.AbstractC18564a aVar, EnumC18483e eVar) {
        IHostLogDepend iHostLogDepend;
        C18465b bVar;
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        String str = cVar.f44272a;
        if (str == null) {
            C89219l.m154710a("eventName");
        }
        AbstractC18754n nVar = cVar.f44273b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (nVar != null) {
            AbstractC18687l a = nVar.mo29756a();
            while (a.mo29723a()) {
                String b = a.mo29724b();
                AbstractC18659k i = nVar.mo29766i(b);
                switch (C18574d.f44254a[i.mo29707a().ordinal()]) {
                    case 1:
                        linkedHashMap.put(b, String.valueOf(i.mo29708b()));
                        break;
                    case 2:
                        linkedHashMap.put(b, String.valueOf(i.mo29710d()));
                        break;
                    case 3:
                        linkedHashMap.put(b, String.valueOf(i.mo29709c()));
                        break;
                    case 4:
                        linkedHashMap.put(b, i.mo29711e());
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        AbstractC18754n g = i.mo29713g();
                        if (g == null) {
                            break;
                        } else {
                            String jSONObject = C18809c.m34905a(g).toString();
                            C89219l.m154709a((Object) jSONObject, "");
                            linkedHashMap.put(b, jSONObject);
                            break;
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        AbstractC18700m f = i.mo29712f();
                        if (f == null) {
                            break;
                        } else {
                            String jSONArray = C18809c.m34904a(f).toString();
                            C89219l.m154709a((Object) jSONArray, "");
                            linkedHashMap.put(b, jSONArray);
                            break;
                        }
                }
            }
        }
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if (!((bVar2 == null || (iHostLogDepend = bVar2.f44099b) == null) && ((bVar = C18465b.f44096l) == null || (iHostLogDepend = bVar.f44099b) == null))) {
            iHostLogDepend.onEventV3Map(str, linkedHashMap);
        }
        aVar.mo29665a(new C18745b(), "");
    }
}
