package com.bytedance.ies.xbridge.p1305f.p1307b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.C18371a;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import com.bytedance.ies.xbridge.p1290b.AbstractC18406b;
import com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18519b;
import com.bytedance.ies.xbridge.p1305f.p1308c.C18533b;
import com.bytedance.ies.xbridge.p1305f.p1308c.C18535c;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.f.b.b */
public final class C18528b extends AbstractC18519b {
    static {
        Covode.recordClassIndex(21222);
    }

    @Override // com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18519b
    /* renamed from: a */
    public final void mo29646a(C18533b bVar, AbstractC18519b.AbstractC18520a aVar, EnumC18483e eVar) {
        String str;
        AbstractC18406b bVar2;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        String str2 = bVar.f44195a;
        if (str2 == null) {
            C89219l.m154710a("method");
        }
        C18742c cVar = this.f44109d;
        if (cVar == null || (bVar2 = (AbstractC18406b) cVar.mo29769a(AbstractC18406b.class)) == null) {
            str = "DEFAULT";
        } else {
            str = bVar2.mo13409a();
        }
        Map<String, Class<? extends AbstractC18400b>> a = C18371a.m34206a(eVar, str);
        if (a != null) {
            C18535c cVar2 = new C18535c();
            cVar2.f44197a = Boolean.valueOf(a.containsKey(str2));
            Class<? extends AbstractC18400b> cls = a.get(str2);
            if (cls != null) {
                Class<? extends AbstractC18749a> d = ((AbstractC18400b) cls.newInstance()).mo29415d();
                if (d != null) {
                    List<String> provideParamList = ((AbstractC18749a) d.newInstance()).provideParamList();
                    C89219l.m154719c(provideParamList, "");
                    cVar2.f44198b = provideParamList;
                }
                Class<? extends AbstractC18744a> e = ((AbstractC18400b) cls.newInstance()).mo29416e();
                if (e != null) {
                    List<String> a2 = ((AbstractC18744a) e.newInstance()).mo29428a();
                    C89219l.m154719c(a2, "");
                    cVar2.f44199c = a2;
                }
            }
            aVar.mo29647a(cVar2, "");
            return;
        }
        C18535c cVar3 = new C18535c();
        cVar3.f44197a = false;
        aVar.mo29647a(cVar3, "");
    }
}
