package com.bytedance.ies.ugc.aweme.commercialize.splash.p1261e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.e.a */
public final class C17960a {

    /* renamed from: a */
    public static final C17960a f42779a = new C17960a();

    private C17960a() {
    }

    static {
        Covode.recordClassIndex(20578);
    }

    /* renamed from: a */
    public static final void m33431a(boolean z, Aweme aweme, String str) {
        String str2;
        if (aweme != null && aweme.isAd()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("failCode", str);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str2 = awemeRawAd.getCreativeIdStr();
            } else {
                str2 = null;
            }
            jSONObject.put("creativeId", str2);
            jSONObject.put("groupId", aweme.getAid());
            IMonitorDepend iMonitorDepend = C16091a.f38742b;
            if (iMonitorDepend != null) {
                iMonitorDepend.monitorStatusRate("aweme_ad_awesome_splash_show", !z ? 1 : 0, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public static final void m33433a(boolean z, Long l, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("failReason", str2);
        jSONObject.put("creativeId", l);
        jSONObject.put("logExtra", str);
        IMonitorDepend iMonitorDepend = C16091a.f38742b;
        if (iMonitorDepend != null) {
            iMonitorDepend.monitorStatusRate("aweme_ad_normal_splash_download", !z ? 1 : 0, jSONObject);
        }
    }

    /* renamed from: b */
    public static final void m33434b(boolean z, Long l, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("failReason", str2);
        jSONObject.put("creativeId", l);
        jSONObject.put("logExtra", str);
        IMonitorDepend iMonitorDepend = C16091a.f38742b;
        if (iMonitorDepend != null) {
            iMonitorDepend.monitorStatusRate("aweme_ad_normal_splash_download_new", !z ? 1 : 0, jSONObject);
        }
    }

    /* renamed from: a */
    public static final void m33432a(boolean z, Aweme aweme, String str, Integer num, String str2) {
        String str3;
        if (aweme != null && aweme.isAd()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", str);
            jSONObject.put("errorCode", num);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str3 = awemeRawAd.getCreativeIdStr();
            } else {
                str3 = null;
            }
            jSONObject.put("creativeId", str3);
            jSONObject.put("groupId", aweme.getAid());
            jSONObject.put("url", str2);
            IMonitorDepend iMonitorDepend = C16091a.f38742b;
            if (iMonitorDepend != null) {
                iMonitorDepend.monitorStatusRate("aweme_ad_awesome_splash_download", !z ? 1 : 0, jSONObject);
            }
        }
    }
}
