package com.bytedance.ies.xbridge.p1343n.p1344a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18798d;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18800e;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.a.e */
public abstract class AbstractC18768e extends AbstractC18468a {

    /* renamed from: a */
    private final String f44546a = "x.showModal";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44547b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.n.a.e$a */
    public interface AbstractC18769a {

        /* renamed from: com.bytedance.ies.xbridge.n.a.e$a$a */
        public static final class C18770a {
            static {
                Covode.recordClassIndex(21466);
            }
        }

        static {
            Covode.recordClassIndex(21465);
        }

        /* renamed from: a */
        void mo29811a(C18800e eVar, String str);

        /* renamed from: a */
        void mo29812a(String str);
    }

    static {
        Covode.recordClassIndex(21464);
    }

    /* renamed from: a */
    public abstract void mo29810a(C18798d dVar, AbstractC18769a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44546a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44547b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18798d> mo29415d() {
        return C18798d.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18800e> mo29416e() {
        return C18800e.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.n.a.e$b */
    public static final class C18771b implements AbstractC18769a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18768e f44548a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44549b;

        static {
            Covode.recordClassIndex(21467);
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18768e.AbstractC18769a
        /* renamed from: a */
        public final void mo29812a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44549b, 0, str, null, 8);
        }

        C18771b(AbstractC18768e eVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44548a = eVar;
            this.f44549b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18768e.AbstractC18769a
        /* renamed from: a */
        public final void mo29811a(C18800e eVar, String str) {
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(str, "");
            Map<String, Object> a = C18800e.C18802b.m34901a(eVar);
            if (a == null) {
                AbstractC18468a.m34357a(this.f44549b, -5, null, null, 12);
            } else {
                AbstractC18768e.m34358a(this.f44549b, a, str);
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "title", "");
        String str2 = C18586i.m34539a(nVar, "content", "");
        boolean a = C18586i.m34542a(nVar, "showCancel", false);
        String str3 = C18586i.m34539a(nVar, "cancelText", "");
        String str4 = C18586i.m34539a(nVar, "confirmText", "");
        boolean a2 = C18586i.m34542a(nVar, "tapMaskToDismiss", false);
        C18798d dVar = new C18798d();
        C89219l.m154719c(str, "");
        dVar.f44580a = str;
        C89219l.m154719c(str2, "");
        dVar.f44581b = str2;
        dVar.f44582c = a;
        C89219l.m154719c(str3, "");
        dVar.f44583d = str3;
        C89219l.m154719c(str4, "");
        dVar.f44584e = str4;
        dVar.f44585f = a2;
        mo29810a(dVar, new C18771b(this, bVar), eVar);
    }
}
