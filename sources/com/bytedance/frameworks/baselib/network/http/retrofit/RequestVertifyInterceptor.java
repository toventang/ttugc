package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;

public final class RequestVertifyInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(16858);
    }

    /* renamed from: a */
    private static Request m27082a(Request request) {
        if (request != null && !request.isResponseStreaming()) {
            return m27084b(request);
        }
        return request;
    }

    /* renamed from: a */
    private static C22099u m27083a(AbstractC22021a.AbstractC22022a aVar) {
        C22096s c = aVar.mo35812c();
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        Request a = m27082a(aVar.mo35809a());
        if (c != null) {
            c.f52197x.put("RequestVerifyInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
        }
        return aVar.mo35810a(a);
    }

    /* renamed from: b */
    private static Request m27084b(Request request) {
        try {
            String url = request.getUrl();
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            request.isAddCommonParam();
            Object[] objArr = new Object[1];
            request.getBody();
            if (C14731e.f35917f != null) {
                url = C14731e.f35917f.mo23731b(url);
            }
            if (request.getMetrics() != null) {
                request.getMetrics().f52159B = SystemClock.uptimeMillis() - valueOf.longValue();
            }
            Request.C22024a newBuilder = request.newBuilder();
            newBuilder.mo35838a(url);
            return newBuilder.mo35840a();
        } catch (Throwable unused) {
            return request;
        }
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m27083a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m27083a(aVar);
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
