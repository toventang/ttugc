package com.p2082ss.android.ugc.aweme.search.p3693i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.search.p3687e.C67372c;
import com.p2082ss.android.ugc.aweme.search.p3702p.C67696a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.i.b */
public final class C67456b {

    /* renamed from: a */
    public static final C67456b f151131a = new C67456b();

    private C67456b() {
    }

    static {
        Covode.recordClassIndex(79093);
    }

    /* renamed from: a */
    public static void m119524a(C67455a aVar) {
        AbstractC67457c aVar2;
        int originType;
        C89219l.m154721d(aVar, "");
        C42345d dVar = aVar.f151127b;
        if (dVar != null) {
            dVar.getSchema();
        }
        C42345d dVar2 = aVar.f151127b;
        if (dVar2 == null || (originType = dVar2.getOriginType()) == 0 || originType == 80) {
            aVar2 = new C67696a();
        } else if (originType == 81) {
            aVar2 = new C67372c();
        } else {
            throw new UnsupportedOperationException("Unknown DynamicPatch's origin_type: ".concat(String.valueOf(originType)));
        }
        aVar2.mo106290a(aVar);
    }
}
