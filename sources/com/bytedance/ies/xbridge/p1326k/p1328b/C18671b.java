package com.bytedance.ies.xbridge.p1326k.p1328b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18663b;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18679c;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18681d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.k.b.b */
public final class C18671b extends AbstractC18663b {
    static {
        Covode.recordClassIndex(21365);
    }

    /* renamed from: com.bytedance.ies.xbridge.k.b.b$a */
    public static final class C18672a implements IHostOpenDepend.AbstractC18456c {

        /* renamed from: a */
        final /* synthetic */ AbstractC18663b.AbstractC18664a f44450a;

        static {
            Covode.recordClassIndex(21366);
        }

        C18672a(AbstractC18663b.AbstractC18664a aVar) {
            this.f44450a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.AbstractC18456c
        /* renamed from: b */
        public final void mo29560b(String str) {
            C89219l.m154719c(str, "");
            this.f44450a.mo29719a(str);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.AbstractC18456c
        /* renamed from: a */
        public final void mo29559a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18663b.AbstractC18664a aVar = this.f44450a;
            C18681d dVar = new C18681d();
            if (str.length() == 0) {
                str = "";
            }
            dVar.f44462a = str;
            aVar.mo29718a(dVar, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18663b
    /* renamed from: a */
    public final void mo29717a(C18679c cVar, AbstractC18663b.AbstractC18664a aVar, EnumC18483e eVar) {
        IHostOpenDepend iHostOpenDepend;
        C18465b bVar;
        C18465b bVar2;
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        boolean z = cVar.f44460a;
        C18742c cVar2 = this.f44109d;
        if ((cVar2 == null || (bVar2 = (C18465b) cVar2.mo29769a(C18465b.class)) == null || (iHostOpenDepend = bVar2.f44101d) == null) && ((bVar = C18465b.f44096l) == null || (iHostOpenDepend = bVar.f44101d) == null)) {
            aVar.mo29719a("openDepend not implemented in host");
        } else {
            iHostOpenDepend.scanCode(this.f44109d, z, new C18672a(aVar));
        }
    }
}
