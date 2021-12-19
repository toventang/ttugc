package com.bytedance.ies.xbridge.p1343n.p1344a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.a.b */
public abstract class AbstractC18758b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44535a = "x.hideLoading";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44536b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.n.a.b$a */
    public interface AbstractC18759a {
        static {
            Covode.recordClassIndex(21455);
        }

        /* renamed from: a */
        void mo29802a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29803a(String str);
    }

    static {
        Covode.recordClassIndex(21454);
    }

    /* renamed from: a */
    public abstract void mo29801a(C18752c cVar, AbstractC18759a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44535a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44536b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18752c> mo29415d() {
        return C18752c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.n.a.b$b */
    public static final class C18760b implements AbstractC18759a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18758b f44537a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44538b;

        static {
            Covode.recordClassIndex(21456);
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18758b.AbstractC18759a
        /* renamed from: a */
        public final void mo29803a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44538b, 0, str, null, 8);
        }

        C18760b(AbstractC18758b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44537a = bVar;
            this.f44538b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18758b.AbstractC18759a
        /* renamed from: a */
        public final void mo29802a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18758b.m34358a(this.f44538b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        mo29801a(C18752c.C18753a.m34818a(nVar), new C18760b(this, bVar), eVar);
    }
}
