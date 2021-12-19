package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.internal.C2310am;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class CrossPromotionHelper {

    /* renamed from: ι */
    private static String f7129 = "https://%simpression.%s";

    static {
        Covode.recordClassIndex(2620);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.share.CrossPromotionHelper$a */
    public static class RunnableC2347a implements Runnable {

        /* renamed from: ǃ */
        private final C2310am f7130;

        /* renamed from: ɩ */
        private final WeakReference<Context> f7131;

        /* renamed from: Ι */
        private final String f7132;

        /* renamed from: ι */
        private final boolean f7133;

        static {
            Covode.recordClassIndex(2621);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0 A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 203
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.RunnableC2347a.run():void");
        }

        /* renamed from: com_appsflyer_share_CrossPromotionHelper$a_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection */
        public static URLConnection m7164x75119ad0(URL url) {
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

        /* renamed from: com_appsflyer_share_CrossPromotionHelper$a_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
        public static void m7165x39865cb(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }

        RunnableC2347a(String str, C2310am amVar, Context context, boolean z) {
            this.f7132 = str;
            this.f7130 = amVar;
            this.f7131 = new WeakReference<>(context);
            this.f7133 = z;
        }
    }

    public static void trackAndOpenStore(Context context, String str, String str2) {
        trackAndOpenStore(context, str, str2, null);
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2) {
        trackCrossPromoteImpression(context, str, str2, null);
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new Thread(new RunnableC2347a(m7163(context, str, str2, map, ServerConfigHandler.getUrl(f7129)).generateLink(), null, null, AppsFlyerLib.getInstance().isTrackingStopped())).start();
        }
    }

    public static void trackAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator r4 = m7163(context, str, str2, map, ServerConfigHandler.getUrl(Constants.f7128));
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().trackEvent(context, "af_cross_promotion", map);
        new Thread(new RunnableC2347a(r4.generateLink(), new C2310am(), context, AppsFlyerLib.getInstance().isTrackingStopped())).start();
    }

    /* renamed from: Ι */
    private static LinkGenerator m7163(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.f7138 = str3;
        linkGenerator.f7143 = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }
}
