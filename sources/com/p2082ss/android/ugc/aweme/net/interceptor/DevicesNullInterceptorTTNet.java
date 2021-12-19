package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import okhttp3.C90200t;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet */
public class DevicesNullInterceptorTTNet implements AbstractC22021a {
    static {
        Covode.recordClassIndex(72040);
    }

    /* renamed from: a */
    private static C22099u m111161a(AbstractC22021a.AbstractC22022a aVar) {
        Request a = aVar.mo35809a();
        C90200t f = C90200t.m156802f(a.getUrl());
        C90200t.C90201a j = f.mo145060j();
        if (TextUtils.equals("", f.mo145048c("device_id"))) {
            j.mo145072e("device_id");
            f = j.mo145068b();
        }
        return aVar.mo35810a(a.newBuilder().mo35838a(f.toString()).mo35840a());
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111161a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m111161a(aVar);
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
