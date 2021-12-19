package com.bytedance.ies.xbridge.system.p1356a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.system.p1361c.C18900d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.a.c */
public abstract class AbstractC18850c extends AbstractC18468a {

    /* renamed from: a */
    private final String f44658a = "x.makePhoneCall";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44659b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.system.a.c$a */
    public interface AbstractC18851a {
        static {
            Covode.recordClassIndex(21560);
        }

        /* renamed from: a */
        void mo29836a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29837a(String str);
    }

    static {
        Covode.recordClassIndex(21559);
    }

    /* renamed from: a */
    public abstract void mo29835a(C18900d dVar, AbstractC18851a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44658a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44659b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18900d> mo29415d() {
        return C18900d.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.system.a.c$b */
    public static final class C18852b implements AbstractC18851a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18850c f44660a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44661b;

        static {
            Covode.recordClassIndex(21561);
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18850c.AbstractC18851a
        /* renamed from: a */
        public final void mo29837a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44661b, 0, str, null, 8);
        }

        C18852b(AbstractC18850c cVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44660a = cVar;
            this.f44661b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18850c.AbstractC18851a
        /* renamed from: a */
        public final void mo29836a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18850c.m34358a(this.f44661b, C18745b.C18746a.m34815a(bVar), str);
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
        String str = C18586i.m34539a(nVar, "phoneNumber", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        C18900d dVar = new C18900d();
        C89219l.m154719c(str, "");
        dVar.f44738a = str;
        mo29835a(dVar, new C18852b(this, bVar), eVar);
    }
}
