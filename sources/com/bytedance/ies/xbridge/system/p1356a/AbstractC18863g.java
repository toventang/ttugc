package com.bytedance.ies.xbridge.system.p1356a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.system.p1361c.C18910i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.a.g */
public abstract class AbstractC18863g extends AbstractC18468a {

    /* renamed from: a */
    private final String f44674a = "x.vibrate";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44675b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.system.a.g$a */
    public interface AbstractC18864a {

        /* renamed from: com.bytedance.ies.xbridge.system.a.g$a$a */
        public static final class C18865a {
            static {
                Covode.recordClassIndex(21574);
            }
        }

        static {
            Covode.recordClassIndex(21573);
        }

        /* renamed from: a */
        void mo29848a(int i, String str);

        /* renamed from: a */
        void mo29849a(C18745b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21572);
    }

    /* renamed from: a */
    public abstract void mo29847a(C18910i iVar, AbstractC18864a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44674a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44675b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18910i> mo29415d() {
        return C18910i.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.system.a.g$b */
    public static final class C18866b implements AbstractC18864a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18863g f44676a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44677b;

        static {
            Covode.recordClassIndex(21575);
        }

        C18866b(AbstractC18863g gVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44676a = gVar;
            this.f44677b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18863g.AbstractC18864a
        /* renamed from: a */
        public final void mo29848a(int i, String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44677b, i, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18863g.AbstractC18864a
        /* renamed from: a */
        public final void mo29849a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18863g.m34358a(this.f44677b, C18745b.C18746a.m34815a(bVar), str);
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
        int a = AbstractC18749a.C18750a.m34816a(nVar, "duration", 300);
        String str = C18586i.m34539a(nVar, "style", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        C18910i iVar = new C18910i();
        iVar.f44757a = a;
        C89219l.m154719c(str, "");
        iVar.f44758b = str;
        mo29847a(iVar, new C18866b(this, bVar), eVar);
    }
}
