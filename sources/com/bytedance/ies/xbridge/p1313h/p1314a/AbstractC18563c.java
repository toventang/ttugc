package com.bytedance.ies.xbridge.p1313h.p1314a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1313h.p1316c.C18581c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.h.a.c */
public abstract class AbstractC18563c extends AbstractC18468a {

    /* renamed from: a */
    private final String f44244a = "x.reportAppLog";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44245b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.h.a.c$a */
    public interface AbstractC18564a {
        static {
            Covode.recordClassIndex(21258);
        }

        /* renamed from: a */
        void mo29665a(C18745b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21257);
    }

    /* renamed from: a */
    public abstract void mo29664a(C18581c cVar, AbstractC18564a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44244a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44245b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18581c> mo29415d() {
        return C18581c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.h.a.c$b */
    public static final class C18565b implements AbstractC18564a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18563c f44246a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44247b;

        static {
            Covode.recordClassIndex(21259);
        }

        C18565b(AbstractC18563c cVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44246a = cVar;
            this.f44247b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1313h.p1314a.AbstractC18563c.AbstractC18564a
        /* renamed from: a */
        public final void mo29665a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18563c.m34358a(this.f44247b, C18745b.C18746a.m34815a(bVar), str);
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
        String str = C18586i.m34539a(nVar, "eventName", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        AbstractC18754n b = C18586i.m34543b(nVar, "params");
        C18581c cVar = new C18581c();
        C89219l.m154719c(str, "");
        cVar.f44272a = str;
        if (b != null) {
            cVar.f44273b = b;
        }
        mo29664a(cVar, new C18565b(this, bVar), eVar);
    }
}
