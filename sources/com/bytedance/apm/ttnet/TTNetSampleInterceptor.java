package com.bytedance.apm.ttnet;

import android.os.SystemClock;
import com.bytedance.apm.p767c.p768a.C12404d;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.ArrayList;

public class TTNetSampleInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(14461);
    }

    /* renamed from: a */
    private static C22099u m22773a(AbstractC22021a.AbstractC22022a aVar) {
        Request a = aVar.mo35809a();
        if (C12585h.m22682a(a.headers("x-tt-trace-log")) && C12404d.C12405a.f29983a.f29970e) {
            if (C12404d.C12405a.f29983a.mo20187b() && C12404d.C12405a.f29983a.f29969d) {
                return aVar.mo35810a(m22772a(a, "01"));
            }
            if (C12404d.C12405a.f29983a.f29968c == 1 && C12404d.C12405a.f29983a.f29969d) {
                return aVar.mo35810a(m22772a(a, "02"));
            }
        }
        return aVar.mo35810a(a);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m22773a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m22773a(aVar);
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
    private static Request m22772a(Request request, String str) {
        ArrayList arrayList = new ArrayList(request.getHeaders());
        Request.C22024a newBuilder = request.newBuilder();
        arrayList.add(new C22027b("x-tt-trace-log", str));
        newBuilder.f52025c = arrayList;
        return newBuilder.mo35840a();
    }
}
