package com.bytedance.ies.xbridge.p1297d.p1299b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.C18371a;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1290b.AbstractC18406b;
import com.bytedance.ies.xbridge.p1297d.p1298a.AbstractC18473b;
import com.bytedance.ies.xbridge.p1297d.p1300c.C18480b;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.d.b.b */
public final class C18477b extends AbstractC18473b {
    static {
        Covode.recordClassIndex(21171);
    }

    @Override // com.bytedance.ies.xbridge.p1297d.p1298a.AbstractC18473b
    /* renamed from: a */
    public final void mo29622a(C18752c cVar, AbstractC18473b.AbstractC18474a aVar, EnumC18483e eVar) {
        String str;
        AbstractC18406b bVar;
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        C18480b bVar2 = new C18480b();
        C18742c cVar2 = this.f44109d;
        if (cVar2 == null || (bVar = (AbstractC18406b) cVar2.mo29769a(AbstractC18406b.class)) == null) {
            str = "DEFAULT";
        } else {
            str = bVar.mo13409a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Class<? extends AbstractC18400b>> a = C18371a.m34206a(eVar, str);
        if (a != null) {
            for (Map.Entry<String, Class<? extends AbstractC18400b>> entry : a.entrySet()) {
                String key = entry.getKey();
                String value = ((AbstractC18400b) entry.getValue().newInstance()).mo7346c().getValue();
                C18480b.C18482b bVar3 = new C18480b.C18482b();
                bVar3.f44125a = value;
                linkedHashMap.put(key, bVar3);
            }
        }
        bVar2.f44124a = linkedHashMap;
        aVar.mo29623a(bVar2, "");
    }
}
