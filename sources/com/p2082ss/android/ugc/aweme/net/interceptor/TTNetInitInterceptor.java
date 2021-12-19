package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.C18100g;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.TTNetInitInterceptor */
public class TTNetInitInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(72046);
    }

    /* renamed from: a */
    private static C22099u m111171a(AbstractC22021a.AbstractC22022a aVar) {
        C18100g.m33702b();
        return aVar.mo35810a(aVar.mo35809a());
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111171a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m111171a(aVar);
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
