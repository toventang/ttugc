package com.bytedance.ies.xbridge.p1326k.p1328b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18666c;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18683e;
import com.bytedance.ies.xbridge.p1326k.p1329c.C18685f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.k.b.c */
public final class C18673c extends AbstractC18666c {
    static {
        Covode.recordClassIndex(21367);
    }

    /* renamed from: com.bytedance.ies.xbridge.k.b.c$a */
    public static final class C18674a implements IHostOpenDepend.AbstractC18457d {

        /* renamed from: a */
        final /* synthetic */ AbstractC18666c.AbstractC18667a f44451a;

        static {
            Covode.recordClassIndex(21368);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.AbstractC18457d
        /* renamed from: a */
        public final void mo29561a() {
            AbstractC18666c.AbstractC18667a aVar = this.f44451a;
            C18685f fVar = new C18685f();
            fVar.f44468a = 1;
            aVar.mo29721a(fVar, "needUpdate");
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.AbstractC18457d
        /* renamed from: b */
        public final void mo29562b() {
            AbstractC18666c.AbstractC18667a aVar = this.f44451a;
            C18685f fVar = new C18685f();
            fVar.f44468a = 0;
            aVar.mo29721a(fVar, "skipUpdate for local version is already up-to-date");
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.AbstractC18457d
        /* renamed from: c */
        public final void mo29563c() {
            AbstractC18666c.AbstractC18667a aVar = this.f44451a;
            C18685f fVar = new C18685f();
            fVar.f44468a = 2;
            aVar.mo29721a(fVar, "abortUpdate for requested channel is not in lazy channels or doesn't exist with host accesskey");
        }

        C18674a(AbstractC18666c.AbstractC18667a aVar) {
            this.f44451a = aVar;
        }
    }

    @Override // com.bytedance.ies.xbridge.p1326k.p1327a.AbstractC18666c
    /* renamed from: a */
    public final void mo29720a(C18683e eVar, AbstractC18666c.AbstractC18667a aVar, EnumC18483e eVar2) {
        IHostOpenDepend iHostOpenDepend;
        C18465b bVar;
        C18465b bVar2;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar2, "");
        String str = eVar.f44464a;
        if (str == null) {
            C89219l.m154710a("channel");
        }
        String str2 = eVar.f44465b;
        if (str2 == null) {
            C89219l.m154710a("accessKey");
        }
        boolean z = eVar.f44466c;
        C18742c cVar = this.f44109d;
        if (((cVar == null || (bVar2 = (C18465b) cVar.mo29769a(C18465b.class)) == null || (iHostOpenDepend = bVar2.f44101d) == null) && ((bVar = C18465b.f44096l) == null || (iHostOpenDepend = bVar.f44101d) == null)) || iHostOpenDepend.updateGecko(str2, str, new C18674a(aVar), z) == null) {
            aVar.mo29722a("updateGecko ability is not implemented");
        }
    }
}
