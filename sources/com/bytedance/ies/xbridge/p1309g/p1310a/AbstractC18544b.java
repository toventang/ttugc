package com.bytedance.ies.xbridge.p1309g.p1310a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1309g.p1312c.C18551b;
import com.bytedance.ies.xbridge.p1309g.p1312c.C18554c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.g.a.b */
public abstract class AbstractC18544b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44209a = "x.getSettings";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44210b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.g.a.b$a */
    public interface AbstractC18545a {
        static {
            Covode.recordClassIndex(21239);
        }

        /* renamed from: a */
        void mo29656a(int i, String str);

        /* renamed from: a */
        void mo29657a(C18554c cVar, String str);
    }

    static {
        Covode.recordClassIndex(21238);
    }

    /* renamed from: a */
    public abstract void mo29655a(C18551b bVar, AbstractC18545a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44209a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44210b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18551b> mo29415d() {
        return C18551b.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18554c> mo29416e() {
        return C18554c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.g.a.b$b */
    public static final class C18546b implements AbstractC18545a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18544b f44211a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44212b;

        static {
            Covode.recordClassIndex(21240);
        }

        C18546b(AbstractC18544b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44211a = bVar;
            this.f44212b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1309g.p1310a.AbstractC18544b.AbstractC18545a
        /* renamed from: a */
        public final void mo29656a(int i, String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44212b, i, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.p1309g.p1310a.AbstractC18544b.AbstractC18545a
        /* renamed from: a */
        public final void mo29657a(C18554c cVar, String str) {
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(cVar, "");
            if (cVar.f44235a == null) {
                AbstractC18468a.m34357a(this.f44212b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> map = cVar.f44235a;
            if (map != null) {
                linkedHashMap.put("settings", map);
            }
            AbstractC18544b.m34358a(this.f44212b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        AbstractC18700m c = C18586i.m34544c(nVar, "keys");
        if (c == null) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        C18551b bVar2 = new C18551b();
        ArrayList arrayList = new ArrayList();
        int a = c.mo29730a();
        for (int i = 0; i < a; i++) {
            AbstractC18754n f = c.mo29737f(i);
            if (f != null) {
                String str = C18586i.m34539a(f, "key", "");
                String str2 = C18586i.m34539a(f, StringSet.type, "");
                String str3 = C18586i.m34539a(f, "biz", "");
                if (str.length() > 0 && str2.length() > 0) {
                    C18551b.C18553b bVar3 = new C18551b.C18553b(str, str2);
                    C89219l.m154719c(str3, "");
                    bVar3.f44231a = str3;
                    arrayList.add(bVar3);
                }
            }
        }
        C89219l.m154719c(arrayList, "");
        bVar2.f44230a = arrayList;
        mo29655a(bVar2, new C18546b(this, bVar), eVar);
    }
}
