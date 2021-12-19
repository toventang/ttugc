package com.p2082ss.android.ugc.aweme.net.cache;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.cache.IesCacheInterceptor */
public final class IesCacheInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(71943);
    }

    /* renamed from: a */
    private static C22099u<?> m110994a(AbstractC22021a.AbstractC22022a aVar) {
        C89219l.m154721d(aVar, "");
        Request.C22024a newBuilder = aVar.mo35809a().newBuilder();
        Request a = aVar.mo35809a();
        C89219l.m154716b(a, "");
        String url = a.getUrl();
        C89219l.m154716b(url, "");
        Request a2 = newBuilder.mo35837a(C61330k.class, new C61330k(url)).mo35840a();
        C89219l.m154716b(a2, "");
        C22099u<?> a3 = C61313a.m110996a(a2);
        if (a3 == null) {
            C61316b.m111002a(a2, false);
            C22099u<?> a4 = aVar.mo35810a(a2);
            C89219l.m154716b(a4, "");
            C61313a.m110998a(a2, a4);
            return a4;
        }
        C61316b.m111002a(a2, true);
        return a3;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m110994a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m110994a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }
}
