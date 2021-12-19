package com.bytedance.ies.xbridge.p1326k.p1327a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18675a;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18677b;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.k.a.a */
public abstract class AbstractC18660a extends AbstractC18468a {

    /* renamed from: a */
    private final String f44437a = "x.getGeckoInfo";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44438b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.k.a.a$a */
    public interface AbstractC18661a {
        static {
            Covode.recordClassIndex(21355);
        }

        /* renamed from: a */
        void mo29715a(C18677b bVar, String str);

        /* renamed from: a */
        void mo29716a(String str);
    }

    static {
        Covode.recordClassIndex(21354);
    }

    /* renamed from: a */
    public abstract void mo29714a(C18675a aVar, AbstractC18661a aVar2, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44437a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44438b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<? extends AbstractC18749a> mo29415d() {
        return C18675a.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<? extends AbstractC18744a> mo29416e() {
        return C18677b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.k.a.a$b */
    public static final class C18662b implements AbstractC18661a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18660a f44439a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44440b;

        static {
            Covode.recordClassIndex(21356);
        }

        @Override // com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18660a.AbstractC18661a
        /* renamed from: a */
        public final void mo29716a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44440b, 0, str, null, 8);
        }

        C18662b(AbstractC18660a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44439a = aVar;
            this.f44440b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18660a.AbstractC18661a
        /* renamed from: a */
        public final void mo29715a(C18677b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(bVar, "");
            Boolean bool = bVar.f44456a;
            if (bool != null) {
                bool.booleanValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Boolean bool2 = bVar.f44456a;
                if (bool2 != null) {
                    linkedHashMap.put("needUpdate", Boolean.valueOf(bool2.booleanValue()));
                }
                Long l = bVar.f44457b;
                if (l != null) {
                    linkedHashMap.put("totalSize", Long.valueOf(l.longValue()));
                }
                String str2 = bVar.f44458c;
                if (str2 != null) {
                    linkedHashMap.put("version", str2);
                }
                AbstractC18660a.m34358a(this.f44440b, linkedHashMap, str);
                return;
            }
            AbstractC18468a.m34357a(this.f44440b, -5, null, null, 12);
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
        String str = C18586i.m34539a(nVar, "channel", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = C18586i.m34539a(nVar, "accessKey", "");
            if (str2.length() != 0) {
                C18675a aVar = new C18675a();
                C89219l.m154719c(str, "");
                aVar.f44454b = str;
                C89219l.m154719c(str2, "");
                aVar.f44453a = str2;
                mo29714a(aVar, new C18662b(this, bVar), eVar);
                return;
            }
        }
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }
}
