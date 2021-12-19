package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.p1703d.C22944d;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.security.GeneralSecurityException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet */
public class FeedRetryInterceptorTTNet implements AbstractC22021a {

    /* renamed from: a */
    public static final Pattern f139396a = Pattern.compile(".*/aweme/v\\d/feed.*");

    static {
        Covode.recordClassIndex(72044);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111169a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m111169a(aVar);
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
    private static C22099u m111169a(AbstractC22021a.AbstractC22022a aVar) {
        String str;
        try {
            return aVar.mo35810a(aVar.mo35809a());
        } catch (Exception e) {
            if (!(e instanceof C34485a)) {
                Request a = aVar.mo35809a();
                C22944d dVar = new C22944d();
                Request.C22024a newBuilder = a.newBuilder();
                newBuilder.f52033k = dVar;
                String url = a.getUrl();
                if (!f139396a.matcher(url).matches()) {
                    throw e;
                } else if (!TextUtils.isEmpty(url)) {
                    boolean z = true;
                    boolean z2 = !url.startsWith("https");
                    if ((e instanceof SSLException) || (e instanceof GeneralSecurityException)) {
                        z = false;
                    }
                    String filterUrl = NetworkUtils.filterUrl(url);
                    if (z2) {
                        if (z) {
                            str = "both";
                        }
                        str = "ssl";
                    } else {
                        if (z) {
                            str = "protocol";
                        }
                        str = "ssl";
                    }
                    newBuilder.mo35838a(m111170a(filterUrl, "retry_reason", str));
                    newBuilder.mo35838a(m111170a(NetworkUtils.filterUrl(url), "retry_type", "first_retry"));
                    return aVar.mo35810a(newBuilder.mo35840a());
                } else {
                    throw new IllegalArgumentException("url is empty!");
                }
            } else {
                throw e;
            }
        }
    }

    /* renamed from: a */
    private static String m111170a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C29844g gVar = new C29844g(str);
        gVar.mo52130a(str2, str3);
        return gVar.toString();
    }
}
