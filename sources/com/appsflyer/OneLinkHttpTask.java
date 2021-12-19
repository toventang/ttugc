package com.appsflyer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public abstract class OneLinkHttpTask implements Runnable {
    private AppsFlyerLibCore afLib;
    private HttpsUrlConnectionProvider connectionProvider;
    public String oneLinkId;

    static {
        Covode.recordClassIndex(2533);
    }

    /* access modifiers changed from: protected */
    public abstract String getOneLinkUrl();

    /* access modifiers changed from: protected */
    public abstract void handleResponse(String str);

    /* access modifiers changed from: protected */
    public abstract void initRequest(HttpsURLConnection httpsURLConnection);

    /* access modifiers changed from: protected */
    public abstract void onErrorResponse();

    public void run() {
        doRequest();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doRequest() {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.OneLinkHttpTask.doRequest():void");
    }

    public void setConnProvider(HttpsUrlConnectionProvider httpsUrlConnectionProvider) {
        this.connectionProvider = httpsUrlConnectionProvider;
    }

    public OneLinkHttpTask(AppsFlyerLibCore appsFlyerLibCore) {
        this.afLib = appsFlyerLibCore;
    }

    public static class HttpsUrlConnectionProvider {
        static {
            Covode.recordClassIndex(2534);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ */
        public final HttpsURLConnection mo6427(String str) {
            return (HttpsURLConnection) m7037x337c2454(new URL(str));
        }

        /* renamed from: com_appsflyer_OneLinkHttpTask$HttpsUrlConnectionProvider_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection */
        public static URLConnection m7037x337c2454(URL url) {
            URLConnection aVar;
            URLConnection aVar2;
            C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
            if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
                R r = m.f139469b;
                if (r instanceof HttpsURLConnection) {
                    aVar2 = new C61417b(r);
                } else if (!(r instanceof HttpURLConnection)) {
                    return r;
                } else {
                    aVar2 = new C61416a(r);
                }
                return aVar2;
            } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
                URLConnection openConnection = url.openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    aVar = new C61417b((HttpsURLConnection) openConnection);
                } else if (!(openConnection instanceof HttpURLConnection)) {
                    return openConnection;
                } else {
                    aVar = new C61416a((HttpURLConnection) openConnection);
                }
                return aVar;
            } else {
                throw m.f139472e;
            }
        }
    }
}
