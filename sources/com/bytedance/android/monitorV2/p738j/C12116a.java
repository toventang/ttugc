package com.bytedance.android.monitorV2.p738j;

import com.bytedance.android.monitorV2.lynx.C12155c;
import com.bytedance.android.monitorV2.lynx.p742b.C12151a;
import com.bytedance.android.monitorV2.lynx.p742b.C12152b;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.j.a */
public final class C12116a {

    /* renamed from: a */
    public static final C12116a f29137a = new C12116a();

    private C12116a() {
    }

    static {
        Covode.recordClassIndex(13845);
    }

    /* renamed from: a */
    public static final void m21585a(LynxView lynxView, C12152b bVar) {
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(bVar, "");
        if (bVar.f29204b) {
            C12155c cVar = C12155c.f29212j;
            C89219l.m154719c(lynxView, "");
            C89219l.m154719c(bVar, "");
            C12115b.m21583b("LynxViewMonitor", "registerLynxViewMonitor");
            C12151a aVar = cVar.f29217c;
            C89219l.m154719c(lynxView, "");
            C89219l.m154719c(bVar, "");
            aVar.f29202a.put(lynxView, bVar);
            String str = bVar.f29203a;
            C12152b a = cVar.f29217c.mo19514a(lynxView);
            if (a != null) {
                C89219l.m154719c(str, "");
                a.f29203a = str;
            }
            lynxView.addLynxViewClient(new C12117b(lynxView));
        }
    }
}
