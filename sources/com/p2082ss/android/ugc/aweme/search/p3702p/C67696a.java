package com.p2082ss.android.ugc.aweme.search.p3702p;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.SinglePageLynxViewContainer;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.p3693i.AbstractC67457c;
import com.p2082ss.android.ugc.aweme.search.p3693i.C67455a;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.p.a */
public final class C67696a implements AbstractC67457c {
    static {
        Covode.recordClassIndex(79341);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3693i.AbstractC67457c
    /* renamed from: a */
    public final void mo106290a(C67455a aVar) {
        View view;
        C67469ad c;
        String str = "";
        C89219l.m154721d(aVar, str);
        View view2 = aVar.f151130e;
        String str2 = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.aqh);
        } else {
            view = null;
        }
        if (!(view instanceof SinglePageLynxViewContainer)) {
            view = null;
        }
        SinglePageLynxViewContainer singlePageLynxViewContainer = (SinglePageLynxViewContainer) view;
        if (singlePageLynxViewContainer != null) {
            AbstractC67567q a = C67486am.m119564a();
            if (!(a == null || (c = a.mo106431c()) == null)) {
                str2 = c.f151151a;
            }
            String a2 = C67458j.m119528a(aVar.f151129d);
            C89378p[] pVarArr = new C89378p[3];
            if (str2 == null) {
                str2 = str;
            }
            pVarArr[0] = C89387v.m154943a("search_id", str2);
            pVarArr[1] = C89387v.m154943a("search_type", a2);
            String str3 = aVar.f151128c;
            if (str3 != null) {
                str = str3;
            }
            pVarArr[2] = C89387v.m154943a("use_scenario", str);
            singlePageLynxViewContainer.mo71394a(aVar.f151127b, C89041ag.m154421a(pVarArr));
        }
    }
}
