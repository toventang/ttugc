package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14617b;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.p982a.C14615a;
import com.bytedance.frameworks.baselib.network.http.p982a.C14616b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseSsInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(16857);
    }

    /* renamed from: a */
    public void mo23782a(Request request, C22099u uVar) {
    }

    /* renamed from: a */
    private static String m27079a(String str) {
        try {
            return C14731e.m26993b(str);
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    private C22099u m27078a(AbstractC22021a.AbstractC22022a aVar) {
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        Request a = aVar.mo35809a();
        try {
            URL url = new URL(a.getUrl());
            if (url.getProtocol().equals("http")) {
                C14731e.m26988a(url.getHost(), url.getPath(), false);
            }
        } catch (MalformedURLException unused) {
        }
        Request a2 = mo23781a(a);
        if (a2.getMetrics() != null) {
            a2.getMetrics().f52197x.put("BaseSsInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
        }
        C22099u a3 = aVar.mo35810a(a2);
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        mo23782a(a2, a3);
        if (a2.getMetrics() != null) {
            a2.getMetrics().f52198y.put("BaseSsInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf2.longValue()));
        }
        return a3;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m27078a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m27078a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }

    /* renamed from: a */
    public Request mo23781a(Request request) {
        String a;
        if (request == null) {
            return request;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        String url = request.getUrl();
        if (request.getExtraInfo() instanceof C14617b) {
            request.getExtraInfo();
            a = C14731e.m26982a(url);
        } else {
            a = C14731e.m26982a(url);
        }
        if (request.getMetrics() != null) {
            request.getMetrics().f52199z = SystemClock.uptimeMillis() - valueOf.longValue();
        }
        if (request.getUrl().startsWith("https:") && a.startsWith("http:")) {
            try {
                URL url2 = new URL(a);
                C14731e.m26988a(url2.getHost(), url2.getPath(), true);
            } catch (Throwable unused) {
            }
        }
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        if (request.isAddCommonParam()) {
            C14615a aVar = C14616b.m26722a().f35396a;
            if (aVar == null || !aVar.f35384a) {
                a = m27079a(a);
            } else {
                a = C14616b.m26722a().mo23500a(request, a);
            }
        }
        if (request.getMetrics() != null) {
            request.getMetrics().f52158A = SystemClock.uptimeMillis() - valueOf2.longValue();
        }
        Request.C22024a newBuilder = request.newBuilder();
        newBuilder.mo35838a(a);
        return newBuilder.mo35840a();
    }
}
