package com.bytedance.ies.xbridge.p1330l.p1331a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1330l.p1333c.C18698b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.l.a.b */
public abstract class AbstractC18691b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44472a = "x.open";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44473b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.l.a.b$a */
    public interface AbstractC18692a {
        static {
            Covode.recordClassIndex(21386);
        }

        /* renamed from: a */
        void mo29728a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29729a(String str);
    }

    static {
        Covode.recordClassIndex(21385);
    }

    /* renamed from: a */
    public abstract void mo29727a(C18698b bVar, AbstractC18692a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44472a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44473b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18698b> mo29415d() {
        return C18698b.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.l.a.b$b */
    public static final class C18693b implements AbstractC18692a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18691b f44474a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44475b;

        static {
            Covode.recordClassIndex(21387);
        }

        @Override // com.bytedance.ies.xbridge.p1330l.p1331a.AbstractC18691b.AbstractC18692a
        /* renamed from: a */
        public final void mo29729a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44475b, 0, str, null, 8);
        }

        C18693b(AbstractC18691b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44474a = bVar;
            this.f44475b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1330l.p1331a.AbstractC18691b.AbstractC18692a
        /* renamed from: a */
        public final void mo29728a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18691b.m34358a(this.f44475b, C18745b.C18746a.m34815a(bVar), str);
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
        String str = C18586i.m34539a(nVar, "schema", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        C18698b bVar2 = new C18698b();
        C89219l.m154719c(str, "");
        bVar2.f44480a = str;
        bVar2.f44481b = C18586i.m34542a(nVar, "replace", false);
        bVar2.f44482c = C18586i.m34542a(nVar, "useSysBrowser", false);
        mo29727a(bVar2, new C18693b(this, bVar), eVar);
    }
}
