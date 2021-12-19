package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.net.URI;
import okhttp3.C90200t;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet */
public class UrlTransformInterceptorTTNet implements AbstractC22021a {
    static {
        Covode.recordClassIndex(72048);
    }

    /* renamed from: a */
    private static boolean m111175a(String str) {
        if ("vas_ad_track".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C22099u m111173a(AbstractC22021a.AbstractC22022a aVar) {
        Request a = aVar.mo35809a();
        return aVar.mo35810a(a.newBuilder().mo35838a(m111174a(a.getUrl(), a.getServiceType())).mo35840a());
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111173a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m111173a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }

    /* renamed from: b */
    private static String m111176b(String str, String str2) {
        if (str2 == null || str2.length() <= 0 || str == null || str.length() <= 0) {
            return str2;
        }
        try {
            String host = URI.create(str2).getHost();
            if (host != null) {
                return str2.replace(host, str);
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: a */
    private static String m111174a(String str, String str2) {
        if (!SettingsManager.m29616a().mo25400a("debug_replace_http_to_https", true) || TextUtils.isEmpty(str) || str.contains("api.oston.io") || str.contains("api.keepon.media")) {
            return str;
        }
        if (SharePrefCache.inst().getUseHttps().mo59941c().booleanValue() && !m111175a(str2)) {
            if (!str.contains("https://") && !str.contains("http://")) {
                str = "https://".concat(String.valueOf(str));
            } else if (str.contains("http://")) {
                str = str.replace("http://", "https://");
            }
        }
        C90200t.C90201a j = C90200t.m156802f(str).mo145060j();
        C90200t b = j.mo145068b();
        if (str.contains("/passport/auth/login/") || str.contains("/passport/auth/login_only/")) {
            if (TextUtils.isEmpty(b.mo145048c("access_token"))) {
                return str;
            }
            String replaceAll = b.mo145048c("access_token").replaceAll(" ", "+");
            C90200t.C90201a e = b.mo145060j().mo145072e("access_token");
            e.mo145064a("access_token", replaceAll);
            return e.mo145068b().mo145046a().toString();
        } else if (str.contains("/service/settings/v2/")) {
            return m111176b(C17867d.f42587k.f42569a, str);
        } else {
            if (str.contains("/service/settings/v3/")) {
                return m111176b(C17867d.f42587k.f42569a, str);
            }
            if (str.contains("push/get_service_addrs")) {
                str = b.mo145060j().mo145069c(C17867d.f42587k.f42569a).mo145068b().mo145046a().toString();
            }
            return C61401c.m111177a(str, j);
        }
    }
}
