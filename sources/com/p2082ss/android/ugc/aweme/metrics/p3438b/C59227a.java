package com.p2082ss.android.ugc.aweme.metrics.p3438b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.statisticlogger.C18228e;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.utils.C80444fq;
import com.p2082ss.android.ugc.aweme.utils.EnumC80443fp;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.metrics.b.a */
public final class C59227a {

    /* renamed from: a */
    public static boolean f135144a = C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.VIDEO_REQ);

    /* renamed from: b */
    private static volatile long f135145b = -1;

    /* renamed from: c */
    private static volatile boolean f135146c = false;

    static {
        Covode.recordClassIndex(69590);
    }

    /* renamed from: b */
    private static void m108851b() {
        C34822d.m71158a(C17867d.m33078a(), "ies_log_flag", 0).edit().putLong("first_install_time_key", System.currentTimeMillis()).apply();
    }

    /* renamed from: a */
    public static boolean m108850a() {
        long j;
        if (f135146c) {
            return true;
        }
        Context a = C17867d.m33078a();
        if (f135145b <= 0) {
            SharedPreferences a2 = C34822d.m71158a(a, "ies_log_flag", 0);
            if (C49907s.f115049a) {
                j = -1;
            } else {
                j = 1;
            }
            long j2 = a2.getLong("first_install_time_key", j);
            f135145b = j2;
            if (j2 <= 0) {
                f135145b = System.currentTimeMillis();
                m108851b();
            }
        }
        if (f135145b + 172800000 > System.currentTimeMillis()) {
            return false;
        }
        if (!f135146c) {
            f135146c = true;
            C34822d.m71158a(a, "ies_log_flag", 0).edit().putLong("first_install_time_key", 1).apply();
        }
        return true;
    }

    /* renamed from: a */
    public static void m108848a(String str, JSONObject jSONObject) {
        m108849a(str, jSONObject, System.currentTimeMillis());
    }

    /* renamed from: a */
    public static void m108847a(String str, String str2, String str3) {
        if (!m108850a()) {
            C1731i.m5640b(new CallableC59229c(str, str2, str3, C17867d.m33078a()), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    public static void m108849a(String str, JSONObject jSONObject, long j) {
        if (!m108850a()) {
            Context a = C17867d.m33078a();
            try {
                jSONObject.put("local_time", j / 1000);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            m108846a(a, str, "low_retain", jSONObject);
        }
    }

    /* renamed from: a */
    private static void m108846a(Context context, String str, String str2, JSONObject jSONObject) {
        C1731i.m5640b(new CallableC59230d(jSONObject, str, str2, context), C1731i.f5562a);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m108844a(JSONObject jSONObject, String str, String str2, Context context) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put("session_id", C18228e.f43418b);
        jSONObject2.put("scene", str2);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m108845a(JSONObject jSONObject, String str, String str2, String str3, Context context) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put(str2, str3);
        jSONObject2.put("session_id", C18228e.f43418b);
        jSONObject2.put("scene", "low_retain");
        jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }
}
