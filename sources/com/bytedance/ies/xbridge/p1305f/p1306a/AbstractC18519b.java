package com.bytedance.ies.xbridge.p1305f.p1306a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1305f.p1308c.C18533b;
import com.bytedance.ies.xbridge.p1305f.p1308c.C18535c;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.f.a.b */
public abstract class AbstractC18519b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44178a = "x.canIUse";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44179b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.f.a.b$a */
    public interface AbstractC18520a {

        /* renamed from: com.bytedance.ies.xbridge.f.a.b$a$a */
        public static final class C18521a {
            static {
                Covode.recordClassIndex(21215);
            }
        }

        static {
            Covode.recordClassIndex(21214);
        }

        /* renamed from: a */
        void mo29647a(C18535c cVar, String str);
    }

    static {
        Covode.recordClassIndex(21213);
    }

    /* renamed from: a */
    public abstract void mo29646a(C18533b bVar, AbstractC18520a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44178a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44179b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18533b> mo29415d() {
        return C18533b.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18535c> mo29416e() {
        return C18535c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.f.a.b$b */
    public static final class C18522b implements AbstractC18520a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18519b f44180a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44181b;

        static {
            Covode.recordClassIndex(21216);
        }

        C18522b(AbstractC18519b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44180a = bVar;
            this.f44181b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18519b.AbstractC18520a
        /* renamed from: a */
        public final void mo29647a(C18535c cVar, String str) {
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(cVar, "");
            Boolean bool = cVar.f44197a;
            if (bool != null) {
                bool.booleanValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Boolean bool2 = cVar.f44197a;
                if (bool2 == null) {
                    C89219l.m154707a();
                }
                linkedHashMap.put("isAvailable", bool2);
                linkedHashMap.put("params", cVar.f44198b);
                linkedHashMap.put("results", cVar.f44199c);
                AbstractC18519b.m34358a(this.f44181b, linkedHashMap, str);
                return;
            }
            AbstractC18468a.m34357a(this.f44181b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "method", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        C18533b bVar2 = new C18533b();
        C89219l.m154719c(str, "");
        bVar2.f44195a = str;
        mo29646a(bVar2, new C18522b(this, bVar), eVar);
    }
}
