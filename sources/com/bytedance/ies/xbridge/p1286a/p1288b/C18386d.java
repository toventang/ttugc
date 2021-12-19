package com.bytedance.ies.xbridge.p1286a.p1288b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18687l;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18379c;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18396d;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18398e;
import com.bytedance.ies.xbridge.p1349o.C18806a;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.a.b.d */
public final class C18386d extends AbstractC18379c {
    static {
        Covode.recordClassIndex(21058);
    }

    /* renamed from: com.bytedance.ies.xbridge.a.b.d$a */
    public static final class C18387a implements IHostUserDepend.AbstractC18462b {

        /* renamed from: a */
        final /* synthetic */ C18396d f43969a;

        /* renamed from: b */
        final /* synthetic */ Activity f43970b;

        /* renamed from: c */
        final /* synthetic */ AbstractC18379c.AbstractC18380a f43971c;

        static {
            Covode.recordClassIndex(21059);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend.AbstractC18462b
        /* renamed from: a */
        public final void mo29427a() {
            AbstractC18379c.AbstractC18380a aVar = this.f43971c;
            C18398e eVar = new C18398e();
            eVar.f43989a = "loggedOut";
            aVar.mo29423a(eVar, "");
        }

        C18387a(C18396d dVar, Activity activity, AbstractC18379c.AbstractC18380a aVar) {
            this.f43969a = dVar;
            this.f43970b = activity;
            this.f43971c = aVar;
        }
    }

    @Override // com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18379c
    /* renamed from: a */
    public final void mo29422a(C18396d dVar, AbstractC18379c.AbstractC18380a aVar, EnumC18483e eVar) {
        IHostUserDepend iHostUserDepend;
        C18465b bVar;
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29424a("context is null");
            return;
        }
        Activity a = C18806a.m34902a(context);
        if (a == null) {
            aVar.mo29424a("context can not convert to activity");
            return;
        }
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if ((bVar2 == null || (iHostUserDepend = bVar2.f44105h) == null) && ((bVar = C18465b.f44096l) == null || (iHostUserDepend = bVar.f44105h) == null)) {
            aVar.mo29424a("hostUserDepend is null");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC18754n nVar = dVar.f43987a;
        if (nVar != null) {
            AbstractC18687l a2 = nVar.mo29756a();
            while (a2.mo29723a()) {
                String b = a2.mo29724b();
                AbstractC18659k i = nVar.mo29766i(b);
                int i2 = C18388e.f43972a[i.mo29707a().ordinal()];
                if (i2 == 1) {
                    linkedHashMap.put(b, String.valueOf(i.mo29710d()));
                } else if (i2 == 2) {
                    linkedHashMap.put(b, String.valueOf(i.mo29709c()));
                } else if (i2 == 3) {
                    linkedHashMap.put(b, i.mo29711e());
                } else if (i2 == 4) {
                    linkedHashMap.put(b, String.valueOf(i.mo29708b()));
                }
            }
        }
        iHostUserDepend.logout(a, new C18387a(dVar, a, aVar), linkedHashMap);
    }
}
