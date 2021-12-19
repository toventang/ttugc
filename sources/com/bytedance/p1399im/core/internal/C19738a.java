package com.bytedance.p1399im.core.internal;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19517i;
import com.bytedance.p1399im.core.proto.Config;
import com.bytedance.p1399im.core.proto.GetConfigsResponseBody;
import com.google.gson.C27910f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.a */
public final class C19738a {

    /* renamed from: a */
    public static boolean f46908a;

    /* renamed from: b */
    public static boolean f46909b;

    /* renamed from: c */
    public static long f46910c = 60;

    /* renamed from: d */
    public static boolean f46911d;

    /* renamed from: e */
    public static long f46912e = 86400000;

    /* renamed from: f */
    public static long f46913f;

    /* renamed from: g */
    public static int f46914g = 100;

    /* renamed from: h */
    public static float f46915h = 0.2f;

    /* renamed from: i */
    public static boolean f46916i = true;

    /* renamed from: j */
    public static long f46917j = 100;

    /* renamed from: k */
    public static Float f46918k;

    /* renamed from: l */
    public static Map<String, String> f46919l;

    /* renamed from: m */
    public static JSONObject f46920m;

    /* renamed from: n */
    private static JSONObject f46921n;

    /* renamed from: m */
    public static boolean m36947m() {
        if (f46921n != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static long m36937c() {
        JSONObject jSONObject = f46920m;
        if (jSONObject != null) {
            return (long) jSONObject.optInt("defaultPollingMsgInterval");
        }
        return f46910c;
    }

    /* renamed from: e */
    public static long m36939e() {
        JSONObject jSONObject = f46920m;
        if (jSONObject != null) {
            return (long) jSONObject.optInt("conversationMsgRepairInterval");
        }
        return f46912e;
    }

    /* renamed from: f */
    public static long m36940f() {
        JSONObject jSONObject = f46920m;
        if (jSONObject != null) {
            return (long) jSONObject.optInt("conversationMsgRepairStart");
        }
        return f46913f;
    }

    /* renamed from: g */
    public static int m36941g() {
        JSONObject jSONObject = f46920m;
        if (jSONObject != null) {
            return jSONObject.optInt("conversationMsgRepairCount");
        }
        return f46914g;
    }

    /* renamed from: n */
    public static boolean m36948n() {
        return "1".equals(m36935b("only_check_not_repair"));
    }

    /* renamed from: a */
    public static boolean m36934a() {
        JSONObject jSONObject = f46920m;
        if (jSONObject == null) {
            return f46908a;
        }
        if (jSONObject.optInt("autoPollingMsgEnabled") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m36936b() {
        JSONObject jSONObject = f46920m;
        if (jSONObject == null) {
            return f46909b;
        }
        if (jSONObject.optInt("triggerPollingMsgEnabled") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m36938d() {
        JSONObject jSONObject = f46920m;
        if (jSONObject == null) {
            return f46911d;
        }
        if (jSONObject.optInt("repairEnabled") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m36943i() {
        if (C19483d.m36365a().mo31141b().f46223aE || "1".equals(m36935b("applog_2_alog"))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m36944j() {
        if (C19483d.m36365a().mo31141b().f46224aF || "1".equals(m36935b("is_switch_to_foreground_pull_msg"))) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m36945k() {
        if (C19483d.m36365a().mo31141b().f46225aG || "1".equals(m36935b("is_net_change_pull_msg"))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m36946l() {
        if (C19483d.m36365a().mo31141b().f46230aL || "1".equals(m36935b("auto_polling_when_no_ws"))) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static double m36942h() {
        JSONObject jSONObject = f46920m;
        if (jSONObject != null) {
            return jSONObject.optDouble("dbReportRate");
        }
        if (f46918k == null) {
            C20041s.m37876a();
            f46918k = Float.valueOf(C20041s.f47627a.mo27995b("db_report_rate", Float.valueOf(0.02f)).floatValue());
        }
        return (double) f46918k.floatValue();
    }

    static {
        Covode.recordClassIndex(22582);
        if (f46920m == null) {
            C20041s.m37876a();
            String b = C20041s.f47628b.mo27996b(C20041s.m37878a("key_imsdk_settings"), "");
            if (!TextUtils.isEmpty(b)) {
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    f46921n = jSONObject;
                    if (jSONObject.has("im_config")) {
                        f46920m = f46921n.optJSONObject("im_config");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: o */
    public static int m36949o() {
        String b = m36935b("ws_report_interval");
        if (TextUtils.isEmpty(b)) {
            return -1;
        }
        try {
            return Integer.parseInt(b);
        } catch (Exception e) {
            if (C19510e.f46308a == null || !C19483d.m36365a().mo31141b().f46241af) {
                new C19517i().mo31179a("imsdk_exception").mo31180a("error_stack", Log.getStackTraceString(e)).mo31180a("error_msg", "getWsReportIntervalSec").mo31181b();
            } else {
                C19510e.f46308a.mo27982a((Throwable) e);
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m36932a(List<Config> list) {
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (Config config : list) {
                hashMap.put(config.conf_name, config.conf_value);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static double m36931a(String str) {
        String b = m36935b("app_log_rate");
        try {
            if (TextUtils.isEmpty(b)) {
                return C19483d.m36365a().mo31141b().f46226aH;
            }
            JSONObject jSONObject = new JSONObject(b);
            double optDouble = jSONObject.optDouble("default_rate", 0.0d);
            if (jSONObject.has(str)) {
                return jSONObject.optDouble(str, 0.0d);
            }
            return optDouble;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "getEvenSample err ", e);
            e.printStackTrace();
            return C19483d.m36365a().mo31141b().f46226aH;
        }
    }

    /* renamed from: b */
    private static String m36935b(String str) {
        Object opt;
        JSONObject jSONObject = f46920m;
        if (jSONObject != null && (opt = jSONObject.opt(str)) != null) {
            return opt.toString();
        }
        if (f46919l == null) {
            C27910f fVar = C19999h.f47538a;
            C20041s.m37876a();
            GetConfigsResponseBody getConfigsResponseBody = (GetConfigsResponseBody) fVar.mo46670a(C20041s.f47627a.mo27996b(C20041s.m37878a("imsdk_cloud_config"), ""), GetConfigsResponseBody.class);
            if (getConfigsResponseBody != null) {
                f46919l = m36932a(getConfigsResponseBody.configs);
            } else {
                f46919l = new HashMap();
            }
        }
        return f46919l.get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m36933a(org.json.JSONObject r2) {
        /*
            java.lang.String r1 = "data"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x000e
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            if (r2 == 0) goto L_0x0052
        L_0x000e:
            java.lang.String r1 = "app"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x0053
            org.json.JSONObject r2 = r2.optJSONObject(r1)
        L_0x001a:
            if (r2 == 0) goto L_0x0052
        L_0x001c:
            java.lang.String r1 = "sdk_key_imsdk"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x0052
            org.json.JSONObject r0 = r2.optJSONObject(r1)
            com.bytedance.p1399im.core.internal.C19738a.f46921n = r0
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003e
            com.bytedance.p1399im.core.internal.utils.C20041s.m37876a()
            java.lang.String r0 = r2.toString()
            com.bytedance.p1399im.core.internal.utils.C20041s.m37888c(r0)
        L_0x003e:
            org.json.JSONObject r0 = com.bytedance.p1399im.core.internal.C19738a.f46921n
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = "im_config"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x0052
            org.json.JSONObject r0 = com.bytedance.p1399im.core.internal.C19738a.f46921n
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            com.bytedance.p1399im.core.internal.C19738a.f46920m = r0
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r1 = "settings"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x001c
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.C19738a.m36933a(org.json.JSONObject):void");
    }
}
