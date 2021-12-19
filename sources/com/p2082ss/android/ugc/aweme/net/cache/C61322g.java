package com.p2082ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1609a.AbstractC21982a;
import com.p2082ss.android.ugc.aweme.net.cache.C61313a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.cache.g */
public final class C61322g implements AbstractC21982a {

    /* renamed from: a */
    public static final C61322g f139273a = new C61322g();

    private C61322g() {
    }

    static {
        Covode.recordClassIndex(71953);
    }

    @Override // com.bytedance.retrofit2.p1609a.AbstractC21982a
    /* renamed from: a */
    public final C22028c mo35778a(Request request) {
        boolean z;
        C22028c cVar = null;
        if (request == null) {
            return null;
        }
        C89219l.m154721d(request, "");
        if (C61313a.f139252b != null && C61316b.m111005d(request)) {
            C61313a.f139253c.incrementAndGet();
            cVar = (C22028c) C61313a.m110997a(C61316b.m111006e(request), C61313a.f139254d, C61313a.f139255e, new C61313a.C61314a(request));
            if (cVar != null) {
                z = true;
                C61316b.m111002a(request, z);
                return cVar;
            }
        }
        z = false;
        C61316b.m111002a(request, z);
        return cVar;
    }

    @Override // com.bytedance.retrofit2.p1609a.AbstractC21982a
    /* renamed from: a */
    public final C22028c mo35779a(Request request, C22028c cVar) {
        if (request == null || cVar == null) {
            return null;
        }
        return C61313a.m110995a(request, cVar);
    }
}
