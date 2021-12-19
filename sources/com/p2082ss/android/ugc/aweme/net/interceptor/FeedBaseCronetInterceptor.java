package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.feed.api.C48331e;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor */
public class FeedBaseCronetInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(72043);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo98967a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C22099u mo98966a(AbstractC22021a.AbstractC22022a aVar) {
        return aVar.mo35810a(aVar.mo35809a());
    }

    /* renamed from: a */
    private static boolean m111165a(Request request) {
        if (request == null || request.getUrl() == null || !C48331e.m91791a(request.getUrl())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private C22099u m111166b(AbstractC22021a.AbstractC22022a aVar) {
        Request a = aVar.mo35809a();
        if (!mo98967a() || !m111165a(a)) {
            return aVar.mo35810a(aVar.mo35809a());
        }
        return mo98966a(aVar);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111166b(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u b = m111166b(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return b;
    }
}
