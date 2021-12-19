package com.appsflyer.internal;

import com.appsflyer.internal.model.event.BackgroundEvent;
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

/* renamed from: com.appsflyer.internal.ad */
public final class RunnableC2298ad implements Runnable {

    /* renamed from: Ι */
    private final BackgroundEvent f6973;

    static {
        Covode.recordClassIndex(2550);
    }

    public final void run() {
        mo6441();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01dc  */
    /* renamed from: ɩ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection mo6441() {
        /*
        // Method dump skipped, instructions count: 479
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.RunnableC2298ad.mo6441():java.net.HttpURLConnection");
    }

    public RunnableC2298ad(BackgroundEvent backgroundEvent) {
        this.f6973 = (BackgroundEvent) backgroundEvent.weakContext();
    }

    /* renamed from: com_appsflyer_internal_ad_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection */
    public static URLConnection m7056x66a2ea57(URL url) {
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
