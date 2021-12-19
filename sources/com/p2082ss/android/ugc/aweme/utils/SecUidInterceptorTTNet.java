package com.p2082ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import okhttp3.C90200t;

/* renamed from: com.ss.android.ugc.aweme.utils.SecUidInterceptorTTNet */
public class SecUidInterceptorTTNet implements AbstractC22021a {
    static {
        Covode.recordClassIndex(93438);
    }

    /* renamed from: a */
    private static C22099u m138981a(AbstractC22021a.AbstractC22022a aVar) {
        Request a = aVar.mo35809a();
        C90200t f = C90200t.m156802f(a.getUrl());
        if (f != null) {
            C80517gw.m139563a();
            C80517gw.m139567a(f);
            C90200t.C90201a j = f.mo145060j();
            String[] strArr = C80517gw.f180119b;
            for (String str : strArr) {
                String c = f.mo145048c(str);
                if (TextUtils.isEmpty(f.mo145048c("sec_".concat(String.valueOf(str))))) {
                    String c2 = C80517gw.m139563a().mo123775c(c);
                    if (!TextUtils.isEmpty(c2)) {
                        if (C80517gw.m139563a().mo123774b(f.toString())) {
                            j.mo145072e(str);
                        }
                        j.mo145070c("sec_".concat(String.valueOf(str)), c2);
                    }
                }
            }
            a = a.newBuilder().mo35838a(j.mo145068b().toString()).mo35840a();
        }
        return aVar.mo35810a(a);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m138981a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m138981a(aVar);
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
