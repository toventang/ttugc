package com.bytedance.ies.xbridge.p1309g.p1311b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18419a;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18420b;
import com.bytedance.ies.xbridge.base.runtime.p1292a.EnumC18421c;
import com.bytedance.ies.xbridge.p1309g.p1310a.AbstractC18544b;
import com.bytedance.ies.xbridge.p1309g.p1312c.C18551b;
import com.bytedance.ies.xbridge.p1309g.p1312c.C18554c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.g.b.b */
public final class C18548b extends AbstractC18544b {
    static {
        Covode.recordClassIndex(21242);
    }

    /* renamed from: a */
    private static Map<String, Object> m34490a(List<C18420b> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : list) {
            linkedHashMap.put(t.f44009a, t.f44010b);
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.ies.xbridge.p1309g.p1310a.AbstractC18544b
    /* renamed from: a */
    public final void mo29655a(C18551b bVar, AbstractC18544b.AbstractC18545a aVar, EnumC18483e eVar) {
        IHostContextDepend iHostContextDepend;
        List<C18420b> settings;
        C18465b bVar2;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        List<C18551b.C18553b> list = bVar.f44230a;
        if (list == null) {
            C89219l.m154710a("keys");
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : list) {
            String str = t.f44232b;
            String str2 = t.f44231a;
            EnumC18421c a = EnumC18421c.C18422a.m34276a(t.f44233c);
            if (str.length() > 0 && a != EnumC18421c.UNSUPPORTED) {
                C18419a aVar2 = new C18419a(str, a);
                C89219l.m154719c(str2, "");
                aVar2.f44006a = str2;
                arrayList.add(aVar2);
                linkedHashSet.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            aVar.mo29656a(-3, "empty key or unsupported key type in params");
        } else if (linkedHashSet.size() < arrayList.size()) {
            aVar.mo29656a(-3, "duplicate keys in params");
        } else {
            C18465b bVar3 = (C18465b) mo29616a(C18465b.class);
            if (((bVar3 == null || (iHostContextDepend = bVar3.f44102e) == null) && ((bVar2 = C18465b.f44096l) == null || (iHostContextDepend = bVar2.f44102e) == null)) || (settings = iHostContextDepend.getSettings(arrayList)) == null) {
                aVar.mo29656a(0, "getSettings not implemented in host");
                return;
            }
            C18554c cVar = new C18554c();
            cVar.f44235a = m34490a(settings);
            aVar.mo29657a(cVar, "");
        }
    }
}
