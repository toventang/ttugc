package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.os.Build;
import android.os.SystemClock;
import androidx.p025c.C0484a;
import androidx.p025c.C0497g;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;
import p4600h.p4617i.C89258d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j */
public final class C38749j implements AbstractC12009a {

    /* renamed from: a */
    public static final C38749j f91505a = new C38749j();

    /* renamed from: b */
    private static final AbstractC89255c f91506b = C89258d.m154745a(SystemClock.uptimeMillis());

    /* renamed from: c */
    private static final AbstractC89244h f91507c = C89250i.m154773a((AbstractC89171a) C38750a.f91509a);

    /* renamed from: d */
    private static final boolean f91508d = false;

    private C38749j() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j$a */
    static final class C38750a extends AbstractC89220m implements AbstractC89171a<C0484a<String, String>> {

        /* renamed from: a */
        public static final C38750a f91509a = new C38750a();

        static {
            Covode.recordClassIndex(46291);
        }

        C38750a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C0484a<String, String> invoke() {
            C0484a aVar = new C0484a(8);
            aVar.put("resource_performance", "landing_page_static_resource");
            aVar.put("perf", "landing_page_perf");
            aVar.put("performance", "landing_page_performance");
            aVar.put("blank", "landing_page_blank");
            aVar.put("navigationStart", "landing_page_navigation_start");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(46290);
        int i = Build.VERSION.SDK_INT;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12009a
    /* renamed from: a */
    public final void mo13268a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject optJSONObject;
        String str2;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
        C89219l.m154716b(adLandingPageConfig, "");
        int hybridMonitorSampleRate = adLandingPageConfig.getHybridMonitorSampleRate();
        if (hybridMonitorSampleRate > 0 && f91506b.nextInt(hybridMonitorSampleRate) == 0 && !f91508d && str != null && str.length() != 0 && jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("extra")) != null) {
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("nativeInfo");
            JSONObject optJSONObject5 = optJSONObject.optJSONObject("jsInfo");
            if (((optJSONObject5 != null && (str2 = optJSONObject5.optString("ev_type")) != null) || (optJSONObject4 != null && (str2 = optJSONObject4.optString("event_type")) != null)) && !C89219l.m154714a((Object) str2, (Object) "custom")) {
                if (C89219l.m154714a((Object) str2, (Object) "resource_performance")) {
                    IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
                    C89219l.m154716b(iESSettingsProxy2, "");
                    AdLandingPageConfig adLandingPageConfig2 = iESSettingsProxy2.getAdLandingPageConfig();
                    C89219l.m154716b(adLandingPageConfig2, "");
                    if (!adLandingPageConfig2.isHybridMonitorResPerfEnable()) {
                        return;
                    }
                }
                String str3 = (String) ((C0497g) f91507c.getValue()).get(str2);
                if (str3 != null && str3.length() != 0 && (optJSONObject2 = optJSONObject.optJSONObject("nativeBase")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("context")) != null) {
                    String optString = optJSONObject3.optString("creative_id");
                    String optString2 = optJSONObject3.optString("log_extra");
                    if (optString != null && optString.length() != 0) {
                        String optString3 = optJSONObject3.optString("channel_name");
                        int optInt = optJSONObject3.optInt("preload_status", 0);
                        long optLong = optJSONObject3.optLong("preload_webview_time", -1);
                        C89219l.m154716b(optString3, "");
                        C18129a.m33747a("ad_wap_stat", str3, optString, optString2, null).mo28897a("hybrid_data", String.valueOf(optJSONObject)).mo28897a("channel_name", optString3).mo28897a("preload_status", Integer.valueOf(optInt)).mo28897a("preload_webview_time", Long.valueOf(optLong)).mo28901b();
                    }
                }
            }
        }
    }
}
