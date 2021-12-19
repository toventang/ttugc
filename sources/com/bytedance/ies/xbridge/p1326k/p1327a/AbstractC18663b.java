package com.bytedance.ies.xbridge.p1326k.p1327a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18679c;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18681d;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.k.a.b */
public abstract class AbstractC18663b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44441a = "x.scanCode";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44442b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.k.a.b$a */
    public interface AbstractC18664a {
        static {
            Covode.recordClassIndex(21358);
        }

        /* renamed from: a */
        void mo29718a(C18681d dVar, String str);

        /* renamed from: a */
        void mo29719a(String str);
    }

    static {
        Covode.recordClassIndex(21357);
    }

    /* renamed from: a */
    public abstract void mo29717a(C18679c cVar, AbstractC18664a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44441a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44442b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18679c> mo29415d() {
        return C18679c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18681d> mo29416e() {
        return C18681d.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.k.a.b$b */
    public static final class C18665b implements AbstractC18664a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18663b f44443a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44444b;

        static {
            Covode.recordClassIndex(21359);
        }

        @Override // com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18663b.AbstractC18664a
        /* renamed from: a */
        public final void mo29719a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44444b, 0, str, null, 8);
        }

        C18665b(AbstractC18663b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44443a = bVar;
            this.f44444b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18663b.AbstractC18664a
        /* renamed from: a */
        public final void mo29718a(C18681d dVar, String str) {
            C89219l.m154719c(dVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(dVar, "");
            if (dVar.f44462a == null) {
                AbstractC18468a.m34357a(this.f44444b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = dVar.f44462a;
            if (str2 != null) {
                linkedHashMap.put("result", str2);
            }
            AbstractC18663b.m34358a(this.f44444b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        boolean a = C18586i.m34542a(nVar, "cameraOnly", false);
        C18679c cVar = new C18679c();
        cVar.f44460a = a;
        mo29717a(cVar, new C18665b(this, bVar), eVar);
    }
}
