package com.bytedance.ies.xbridge.p1305f.p1307b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18516a;
import com.bytedance.ies.xbridge.p1305f.p1308c.C18530a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.f.b.a */
public final class C18526a extends AbstractC18516a {

    /* renamed from: b */
    private final String f44186b = "invalid Parameter";

    static {
        Covode.recordClassIndex(21220);
    }

    /* renamed from: com.bytedance.ies.xbridge.f.b.a$a */
    public enum EnumC18527a {
        closed;
        

        /* renamed from: b */
        private final String f44188b;

        public final String getActionType() {
            return this.f44188b;
        }

        static {
            Covode.recordClassIndex(21221);
        }

        private EnumC18527a() {
            this.f44188b = r3;
        }
    }

    @Override // com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18516a
    /* renamed from: a */
    public final void mo29643a(C18530a aVar, AbstractC18516a.AbstractC18517a aVar2, EnumC18483e eVar) {
        IHostFrameworkDepend iHostFrameworkDepend;
        C18465b bVar;
        C18465b bVar2;
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(eVar, "");
        String str = aVar.f44190a;
        if (str == null) {
            C89219l.m154710a("actionType");
        }
        List<C18530a.C18531a> list = aVar.f44191b;
        for (EnumC18527a aVar3 : EnumC18527a.values()) {
            if (C89219l.m154714a((Object) aVar3.getActionType(), (Object) str)) {
                if (list == null || list.isEmpty()) {
                    aVar2.mo29645a(this.f44186b);
                    return;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().f44192a.length() == 0) {
                            aVar2.mo29645a(this.f44186b);
                            return;
                        }
                    }
                    C18742c cVar = this.f44109d;
                    if (!((cVar == null || (bVar2 = (C18465b) cVar.mo29769a(C18465b.class)) == null || (iHostFrameworkDepend = bVar2.f44098a) == null) && ((bVar = C18465b.f44096l) == null || (iHostFrameworkDepend = bVar.f44098a) == null))) {
                        C18742c cVar2 = this.f44109d;
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().f44192a);
                        }
                        ArrayList arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                        Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(it3.next().f44193b);
                        }
                        iHostFrameworkDepend.addObserverEvent(cVar2, str, arrayList2, arrayList3);
                    }
                    aVar2.mo29644a(new C18745b(), "");
                    return;
                }
            }
        }
        aVar2.mo29645a(this.f44186b);
    }
}
