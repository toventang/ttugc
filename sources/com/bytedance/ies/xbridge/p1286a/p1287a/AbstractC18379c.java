package com.bytedance.ies.xbridge.p1286a.p1287a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18396d;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18398e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.a.a.c */
public abstract class AbstractC18379c extends AbstractC18468a {

    /* renamed from: a */
    private final AbstractC18400b.EnumC18401a f43960a = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: b */
    private final String f43961b = "x.logout";

    /* renamed from: com.bytedance.ies.xbridge.a.a.c$a */
    public interface AbstractC18380a {
        static {
            Covode.recordClassIndex(21052);
        }

        /* renamed from: a */
        void mo29423a(C18398e eVar, String str);

        /* renamed from: a */
        void mo29424a(String str);
    }

    static {
        Covode.recordClassIndex(21051);
    }

    /* renamed from: a */
    public abstract void mo29422a(C18396d dVar, AbstractC18380a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f43961b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f43960a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18396d> mo29415d() {
        return C18396d.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18398e> mo29416e() {
        return C18398e.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.a.a.c$b */
    public static final class C18381b implements AbstractC18380a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18379c f43962a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f43963b;

        static {
            Covode.recordClassIndex(21053);
        }

        @Override // com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18379c.AbstractC18380a
        /* renamed from: a */
        public final void mo29424a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f43963b, 0, str, null, 8);
        }

        C18381b(AbstractC18379c cVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f43962a = cVar;
            this.f43963b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18379c.AbstractC18380a
        /* renamed from: a */
        public final void mo29423a(C18398e eVar, String str) {
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(eVar, "");
            if (eVar.f43989a == null) {
                AbstractC18468a.m34357a(this.f43963b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = eVar.f43989a;
            if (str2 != null) {
                linkedHashMap.put("status", str2);
            }
            AbstractC18379c.m34358a(this.f43963b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        AbstractC18754n b = C18586i.m34543b(nVar, "context");
        C18396d dVar = new C18396d();
        if (b != null) {
            dVar.f43987a = b;
        }
        mo29422a(dVar, new C18381b(this, bVar), eVar);
    }
}
