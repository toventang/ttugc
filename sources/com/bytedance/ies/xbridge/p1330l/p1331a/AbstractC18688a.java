package com.bytedance.ies.xbridge.p1330l.p1331a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1330l.p1333c.C18696a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.l.a.a */
public abstract class AbstractC18688a extends AbstractC18468a {

    /* renamed from: a */
    private final String f44469a = "x.close";

    /* renamed from: com.bytedance.ies.xbridge.l.a.a$a */
    public interface AbstractC18689a {
        static {
            Covode.recordClassIndex(21383);
        }

        /* renamed from: a */
        void mo29726a(C18745b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21382);
    }

    /* renamed from: a */
    public abstract void mo29725a(C18696a aVar, AbstractC18689a aVar2, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44469a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return AbstractC18400b.EnumC18401a.PROTECT;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18696a> mo29415d() {
        return C18696a.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.l.a.a$b */
    public static final class C18690b implements AbstractC18689a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18688a f44470a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44471b;

        static {
            Covode.recordClassIndex(21384);
        }

        C18690b(AbstractC18688a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44470a = aVar;
            this.f44471b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1330l.p1331a.AbstractC18688a.AbstractC18689a
        /* renamed from: a */
        public final void mo29726a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18688a.m34358a(this.f44471b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "containerID", "");
        boolean a = C18586i.m34542a(nVar, "animated", false);
        C18696a aVar = new C18696a();
        if (str.length() > 0) {
            aVar.f44477a = str;
        }
        aVar.f44478b = a;
        mo29725a(aVar, new C18690b(this, bVar), eVar);
    }
}
