package com.p2082ss.android.ugc.aweme.net;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.ttnet.p1701b.AbstractC22917a;
import com.p2082ss.android.account.C29351f;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.language.C58074g;
import com.p2082ss.android.ugc.aweme.launcher.service.account.C58078a;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.C61450o;
import com.p2082ss.android.ugc.aweme.net.p3489b.C61308a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.service.ILarkMsgReportHostService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.ttnet.org.chromium.base.C87458g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.e */
public final class C61337e extends AbstractC22917a {

    /* renamed from: a */
    public static final C61337e f139304a = new C61337e();

    /* renamed from: b */
    public static int f139305b = 0;

    /* renamed from: c */
    public static final Keva f139306c = Keva.getRepo("network_keva");

    /* renamed from: d */
    static final Pattern f139307d = Pattern.compile("(https:.+?)\\?.+?x-tt-logid=\\[([0-9a-zA-Z]+?)\\],.*?x-tt-store-region=\\[([a-zA-Z]+)\\], x-tt-store-region-src=\\[([a-zA-Z]+)\\]");

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbClient() {
        return null;
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbFeature() {
        return null;
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbFlag() {
        return "0";
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getOpenUdid() {
        return "";
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getStoreIdcRuleJSON() {
        return "{\"update_store_idc_path_list\": [\"/passport/*\", \"/service/*/device_register/\", \"/service/*/app_alert_check/\", \"/service/*/app_alert/\"],\"add_store_idc_host_list\": [\"*.tiktokv.com\",\"*.tiktok.com\", \"*.tiktokv.com.boe-gateway.byted.org\"]}";
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUUID() {
        return "";
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getChannel() {
        return C17867d.f42595s;
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbVersion() {
        return C17867d.m33085f();
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppName() {
        return C17867d.m33081b();
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getCarrierRegion() {
        return C58071d.m104914h();
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceId() {
        return AppLog.getServerDeviceId();
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getRegion() {
        return C58071d.m104913g();
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionName() {
        return C17867d.m33085f();
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppId() {
        return String.valueOf(AppLog.getAppId());
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getManifestVersionCode() {
        return String.valueOf(C17867d.m33087h());
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getStoreIdc() {
        return C58074g.get().getStoreIdc();
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSysRegion() {
        return SettingServiceImpl.m120782v().mo108876l();
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUpdateVersionCode() {
        return String.valueOf(C17867d.m33083d());
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionCode() {
        return String.valueOf(C17867d.m33084e());
    }

    /* renamed from: b */
    private static JSONArray m111033b() {
        JSONArray jSONArray = new JSONArray();
        for (String str : C58939a.C58940a.f134171a.f134170a.getBoeBypassPathList()) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getBypassBOEJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bypass_boe_host_list", m111030a());
            jSONObject.put("bypass_boe_path_list", m111033b());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getGetDomainDefaultJSON() {
        String g = C58071d.m104913g();
        for (String str : C61308a.f139238c) {
            if (str.equalsIgnoreCase(g)) {
                return C61308a.f139242g;
            }
        }
        return C61308a.f139243h;
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final Map<String, String> getTNCRequestHeader() {
        return C30628d.m62921a("https://" + C29351f.m58781a().mo52209a());
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUserId() {
        String userId = AppLog.getUserId();
        if (C13627m.m24498a(userId) || userId.equals("0")) {
            return C31575b.m65865g().getCurUserId();
        }
        return userId;
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final boolean loggerDebug() {
        if (C87458g.m151790a() || "local_test".equals(C17867d.f42595s)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(71970);
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final ArrayList<byte[]> getOpaqueData() {
        if (!f139306c.getBoolean("opaque_data_enabled", true)) {
            return null;
        }
        ArrayList<byte[]> a = C61450o.m111299a();
        C89219l.m154721d(a, "");
        C1731i.m5640b(new C61450o.CallableC61452b(a), C1731i.f5562a);
        return a;
    }

    /* renamed from: a */
    private static JSONArray m111030a() {
        JSONArray jSONArray = new JSONArray();
        if (ServiceManager.get().getService(ILarkMsgReportHostService.class) != null) {
            String a = ((ILarkMsgReportHostService) ServiceManager.get().getService(ILarkMsgReportHostService.class)).mo106970a();
            if (!TextUtils.isEmpty(a)) {
                jSONArray.put(a);
            }
        }
        for (String str : C58939a.C58940a.f134171a.f134170a.getBoeBypassHostList()) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static void m111031a(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("ttnet_duration");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    long optLong = optJSONObject.optLong(next);
                    C58945a.C58947b.f134185a.mo96427b(C1764a.m5928a("%s_%s", new Object[]{"ttnet_duration", next}), optLong);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static Map<String, String> m111032b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, String.valueOf(jSONObject.get(next)));
        }
        return hashMap;
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onServerConfigUpdated(String str) {
        C58007a.m104830a("tnc ", true);
        super.onServerConfigUpdated(str);
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            String[] split = jSONObject.getString("share_cookie_host_list").split(",");
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (str2.startsWith(".")) {
                    str2 = str2.substring(1);
                }
                arrayList.add(str2);
            }
            C58078a.f132318a.mo95574a(arrayList);
            C58007a.m104834b();
            C80937s.m140453b().mo124067a(m111032b(jSONObject.getJSONObject("ttnet_http_dns_addr")));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.ttnet.p1701b.AbstractC22917a, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void sendAppMonitorEvent(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C33830n.m70668a(str2, jSONObject);
            if ("ttnet_init".equals(str2)) {
                m111031a(jSONObject);
            } else if ("store_idc".equals(str2)) {
                C40780g.m82245b().execute(new RunnableC61342f(str));
            }
        } catch (Throwable unused) {
        }
    }
}
