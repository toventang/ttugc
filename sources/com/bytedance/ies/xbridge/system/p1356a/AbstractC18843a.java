package com.bytedance.ies.xbridge.system.p1356a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.system.p1361c.C18894a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.a.a */
public abstract class AbstractC18843a extends AbstractC18468a {

    /* renamed from: a */
    private final String f44650a = "x.allowCaptureScreen";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44651b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.system.a.a$a */
    public interface AbstractC18844a {
        static {
            Covode.recordClassIndex(21553);
        }

        /* renamed from: a */
        void mo29830a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29831a(String str);
    }

    static {
        Covode.recordClassIndex(21552);
    }

    /* renamed from: a */
    public abstract void mo29829a(C18894a aVar, AbstractC18844a aVar2, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44650a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44651b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18894a> mo29415d() {
        return C18894a.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.system.a.a$b */
    public static final class C18845b implements AbstractC18844a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18843a f44652a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44653b;

        static {
            Covode.recordClassIndex(21554);
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18843a.AbstractC18844a
        /* renamed from: a */
        public final void mo29831a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44653b, 0, str, null, 8);
        }

        C18845b(AbstractC18843a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44652a = aVar;
            this.f44653b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18843a.AbstractC18844a
        /* renamed from: a */
        public final void mo29830a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18843a.m34358a(this.f44653b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        boolean a = C18586i.m34542a(nVar, "allow", true);
        C18894a aVar = new C18894a();
        aVar.f44732a = a;
        mo29829a(aVar, new C18845b(this, bVar), eVar);
    }
}
