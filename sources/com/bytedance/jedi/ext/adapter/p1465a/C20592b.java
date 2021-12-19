package com.bytedance.jedi.ext.adapter.p1465a;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import com.bytedance.jedi.ext.adapter.extension.C20645b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.a.b */
public final class C20592b {
    static {
        Covode.recordClassIndex(24124);
    }

    /* renamed from: a */
    public static /* synthetic */ C20601g m38823a(C20645b bVar) {
        AbstractC1204m mVar = bVar.f48821e;
        C20438e.AbstractC20440b bVar2 = null;
        if (!(mVar instanceof AbstractC20468h)) {
            mVar = null;
        }
        AbstractC20468h hVar = (AbstractC20468h) mVar;
        if (hVar != null) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(hVar, "");
            C20438e eVar = bVar.f48817b;
            if (eVar == null) {
                C20438e.AbstractC20440b bVar3 = bVar.f48816a;
                if (bVar3 != null) {
                    C89219l.m154719c(bVar3, "");
                    C20438e.C20439a aVar = new C20438e.C20439a(bVar3);
                    aVar.f48379b = true;
                    aVar.f48378a = 10;
                    if (!aVar.f48379b || aVar.f48378a > 0) {
                        eVar = new C20438e(aVar.f48380c, aVar.f48379b, aVar.f48378a, (byte) 0);
                    } else {
                        throw new IllegalArgumentException("Prefetch distance must be a positive number when prefetch is enabled");
                    }
                } else {
                    eVar = null;
                }
            }
            C20645b.C20647b bVar4 = new C20645b.C20647b(bVar, eVar, bVar.f48821e, eVar, bVar.f48819d);
            C20438e eVar2 = bVar4.f48651a;
            if (eVar2 != null) {
                bVar2 = eVar2.f48375a;
            }
            C89219l.m154719c(bVar4, "");
            C89219l.m154719c(hVar, "");
            C20601g gVar = new C20601g(bVar4, new C20594d(bVar4), hVar);
            gVar.f48761q = (ListViewModel) bVar2;
            return gVar;
        }
        throw new IllegalArgumentException("realAdapter does not provide ISubscriber, please specify it".toString());
    }
}
