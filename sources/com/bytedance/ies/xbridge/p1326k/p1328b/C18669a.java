package com.bytedance.ies.xbridge.p1326k.p1328b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18660a;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18675a;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18677b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.k.b.a */
public final class C18669a extends AbstractC18660a {
    static {
        Covode.recordClassIndex(21363);
    }

    /* renamed from: com.bytedance.ies.xbridge.k.b.a$a */
    public static final class C18670a implements IHostOpenDepend.AbstractC18455b {

        /* renamed from: a */
        final /* synthetic */ AbstractC18660a.AbstractC18661a f44449a;

        static {
            Covode.recordClassIndex(21364);
        }

        C18670a(AbstractC18660a.AbstractC18661a aVar) {
            this.f44449a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.AbstractC18455b
        /* renamed from: a */
        public final void mo29558a(IHostOpenDepend.C18454a aVar) {
            C89219l.m154719c(aVar, "");
            AbstractC18660a.AbstractC18661a aVar2 = this.f44449a;
            C18677b bVar = new C18677b();
            bVar.f44456a = Boolean.valueOf(aVar.f44092c);
            Long l = aVar.f44090a;
            if (l != null) {
                bVar.f44457b = Long.valueOf(l.longValue());
            }
            String str = aVar.f44091b;
            if (str != null) {
                bVar.f44458c = str;
            }
            aVar2.mo29715a(bVar, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18660a
    /* renamed from: a */
    public final void mo29714a(C18675a aVar, AbstractC18660a.AbstractC18661a aVar2, EnumC18483e eVar) {
        IHostOpenDepend iHostOpenDepend;
        C18465b bVar;
        C18465b bVar2;
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(eVar, "");
        String str = aVar.f44454b;
        if (str == null) {
            C89219l.m154710a("channel");
        }
        String str2 = aVar.f44453a;
        if (str2 == null) {
            C89219l.m154710a("accessKey");
        }
        C18742c cVar = this.f44109d;
        if (((cVar == null || (bVar2 = (C18465b) cVar.mo29769a(C18465b.class)) == null || (iHostOpenDepend = bVar2.f44101d) == null) && ((bVar = C18465b.f44096l) == null || (iHostOpenDepend = bVar.f44101d) == null)) || iHostOpenDepend.getGeckoInfo(str2, str, new C18670a(aVar2)) == null) {
            aVar2.mo29716a("getGeckoInfo ability is not implemented");
        }
    }
}
