package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.HashMap;
import java.util.Map;
import okhttp3.C90200t;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.TokenSdkCommonParamsInterceptorTTNet */
public class TokenSdkCommonParamsInterceptorTTNet implements AbstractC22021a {

    /* renamed from: a */
    String f139397a;

    static {
        Covode.recordClassIndex(72047);
    }

    public TokenSdkCommonParamsInterceptorTTNet(String str) {
        this.f139397a = str;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111172a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m111172a(aVar);
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
    private C22099u m111172a(AbstractC22021a.AbstractC22022a aVar) {
        int serverTime = NetworkUtils.getServerTime();
        Request a = aVar.mo35809a();
        String url = a.getUrl();
        if (url != null && (url.contains("/passport/token/beat/") || url.contains("/passport/token/change/") || url.contains("/passport/user/logout/"))) {
            C90200t.C90201a a2 = C90200t.m156802f(a.getUrl()).mo145060j().mo145064a("ts", String.valueOf(serverTime)).mo145064a("app_type", this.f139397a);
            HashMap hashMap = new HashMap();
            C29803q.m60037b(hashMap, true);
            for (Map.Entry entry : hashMap.entrySet()) {
                a2.mo145064a((String) entry.getKey(), (String) entry.getValue());
            }
            a = a.newBuilder().mo35838a(a2.mo145068b().toString()).mo35840a();
        }
        return aVar.mo35810a(a);
    }
}
