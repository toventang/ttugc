package com.bytedance.ies.xbridge.system.p1356a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.system.p1361c.C18902e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.a.d */
public abstract class AbstractC18853d extends AbstractC18468a {

    /* renamed from: a */
    private final String f44662a = "x.removeCalendarEvent";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44663b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.system.a.d$a */
    public interface AbstractC18854a {
        static {
            Covode.recordClassIndex(21563);
        }

        /* renamed from: a */
        void mo29839a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29840a(String str);
    }

    static {
        Covode.recordClassIndex(21562);
    }

    /* renamed from: a */
    public abstract void mo29838a(C18902e eVar, AbstractC18854a aVar, EnumC18483e eVar2);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44662a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44663b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18902e> mo29415d() {
        return C18902e.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.system.a.d$b */
    public static final class C18855b implements AbstractC18854a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18853d f44664a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44665b;

        static {
            Covode.recordClassIndex(21564);
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18853d.AbstractC18854a
        /* renamed from: a */
        public final void mo29840a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44665b, 0, str, null, 8);
        }

        C18855b(AbstractC18853d dVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44664a = dVar;
            this.f44665b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18853d.AbstractC18854a
        /* renamed from: a */
        public final void mo29839a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18853d.m34358a(this.f44665b, C18745b.C18746a.m34815a(bVar), str);
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
        String str = C18586i.m34539a(nVar, "eventID", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC18468a.m34357a(bVar, -3, "param model convert to null", null, 8);
            return;
        }
        C18902e eVar2 = new C18902e();
        C89219l.m154719c(str, "");
        eVar2.f44740a = str;
        mo29838a(eVar2, new C18855b(this, bVar), eVar);
    }
}
