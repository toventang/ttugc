package com.bytedance.ies.xbridge.p1343n.p1344a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18790b;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18794c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.a.c */
public abstract class AbstractC18761c extends AbstractC18468a {

    /* renamed from: a */
    private final String f44539a = "x.showActionSheet";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44540b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.n.a.c$a */
    public interface AbstractC18762a {

        /* renamed from: com.bytedance.ies.xbridge.n.a.c$a$a */
        public static final class C18763a {
            static {
                Covode.recordClassIndex(21459);
            }
        }

        static {
            Covode.recordClassIndex(21458);
        }

        /* renamed from: a */
        void mo29805a(C18794c cVar, String str);

        /* renamed from: a */
        void mo29806a(String str);
    }

    static {
        Covode.recordClassIndex(21457);
    }

    /* renamed from: a */
    public abstract void mo29804a(C18790b bVar, AbstractC18762a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44539a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44540b;
    }

    /* renamed from: com.bytedance.ies.xbridge.n.a.c$b */
    public static final class C18764b implements AbstractC18762a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18761c f44541a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44542b;

        static {
            Covode.recordClassIndex(21460);
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18761c.AbstractC18762a
        /* renamed from: a */
        public final void mo29806a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44542b, 0, str, null, 8);
        }

        C18764b(AbstractC18761c cVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44541a = cVar;
            this.f44542b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18761c.AbstractC18762a
        /* renamed from: a */
        public final void mo29805a(C18794c cVar, String str) {
            Integer num;
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(cVar, "");
            if (cVar.f44574a != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (cVar.f44574a == C18794c.EnumC18796b.SELECT) {
                    C18794c.C18797c cVar2 = cVar.f44575b;
                    if (!(cVar2 == null || (num = cVar2.f44578a) == null)) {
                        linkedHashMap.put("index", Integer.valueOf(num.intValue()));
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                C18794c.EnumC18796b bVar = cVar.f44574a;
                if (bVar != null) {
                    linkedHashMap2.put("action", bVar.getAction());
                }
                linkedHashMap2.put("detail", linkedHashMap);
                AbstractC18761c.m34358a(this.f44542b, linkedHashMap2, str);
                return;
            }
            AbstractC18468a.m34357a(this.f44542b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        AbstractC18754n g;
        String str;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str2 = C18586i.m34539a(nVar, "subtitle", "");
        String str3 = C18586i.m34539a(nVar, "title", "");
        AbstractC18700m c = C18586i.m34544c(nVar, "actions");
        if (c == null || c.mo29730a() == 0) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int a = c.mo29730a();
        for (int i = 0; i < a; i++) {
            AbstractC18659k g2 = c.mo29738g(i);
            if (g2.mo29707a() == EnumC18805o.Map && (g = g2.mo29713g()) != null) {
                C89219l.m154719c(g, "");
                String str4 = C18586i.m34539a(g, "title", "");
                if (str4.length() != 0) {
                    String str5 = C18586i.m34539a(g, StringSet.type, "");
                    if (str5.length() == 0) {
                        str5 = "default";
                    }
                    if (g.mo29757a("subtitle")) {
                        str = C18586i.m34539a(g, "subtitle", "");
                    } else {
                        str = null;
                    }
                    C18790b.C18791a aVar = new C18790b.C18791a();
                    C89219l.m154719c(str4, "");
                    aVar.f44570a = str4;
                    C89219l.m154719c(str5, "");
                    aVar.f44572c = str5;
                    aVar.f44571b = str;
                    arrayList.add(aVar);
                }
            }
        }
        C18790b bVar2 = new C18790b();
        bVar2.f44566a = str3;
        C89219l.m154719c(arrayList, "");
        bVar2.f44568c = arrayList;
        bVar2.f44567b = str2;
        mo29804a(bVar2, new C18764b(this, bVar), eVar);
    }
}
