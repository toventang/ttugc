package com.bytedance.ies.xbridge.p1301e.p1302a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1301e.p1304c.C18509e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.a.c */
public abstract class AbstractC18491c extends AbstractC18468a {

    /* renamed from: a */
    private final AbstractC18400b.EnumC18401a f44140a = AbstractC18400b.EnumC18401a.PUBLIC;

    /* renamed from: b */
    private final String f44141b = "x.unsubscribeEvent";

    /* renamed from: com.bytedance.ies.xbridge.e.a.c$a */
    public interface AbstractC18492a {
        static {
            Covode.recordClassIndex(21186);
        }

        /* renamed from: a */
        void mo29634a(C18745b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21185);
    }

    /* renamed from: a */
    public abstract void mo29633a(C18509e eVar, AbstractC18492a aVar, EnumC18483e eVar2);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44141b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44140a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18509e> mo29415d() {
        return C18509e.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.e.a.c$b */
    public static final class C18493b implements AbstractC18492a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18491c f44142a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44143b;

        static {
            Covode.recordClassIndex(21187);
        }

        C18493b(AbstractC18491c cVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44142a = cVar;
            this.f44143b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1301e.p1302a.AbstractC18491c.AbstractC18492a
        /* renamed from: a */
        public final void mo29634a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18491c.m34358a(this.f44143b, C18745b.C18746a.m34815a(bVar), str);
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
        C18509e eVar2 = new C18509e();
        C89219l.m154719c(str, "");
        eVar2.f44165a = str;
        mo29633a(eVar2, new C18493b(this, bVar), eVar);
    }
}
