package com.p2082ss.android.account.token;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.account.token.TTTokenInterceptor */
public class TTTokenInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(35760);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m58800a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m58800a(aVar);
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
    private static C22099u m58800a(AbstractC22021a.AbstractC22022a aVar) {
        Request a = aVar.mo35809a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a.getHeaders());
        Map a2 = C30628d.m62921a(a.getUrl());
        if (a2 != null && !a2.isEmpty()) {
            for (Map.Entry entry : a2.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    arrayList.add(new C22027b((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        Request.C22024a newBuilder = a.newBuilder();
        newBuilder.f52025c = arrayList;
        C22099u a3 = aVar.mo35810a(newBuilder.mo35840a());
        C30628d.m62922a(a.getUrl(), TTTokenUtils.m58801a(a3.f52261a.f52042d));
        return a3;
    }
}
