package com.bytedance.android.livesdk;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdkapi.session.C11868d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMonitor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.z */
public final class C11603z implements IMonitor {

    /* renamed from: a */
    private static final Map<String, Object> f27759a = new HashMap();

    /* renamed from: b */
    private static final long f27760b = LiveMessageTimeoutSetting.INSTANCE.getHttpFetchMonitorTimeout();

    static {
        Covode.recordClassIndex(13269);
    }

    /* renamed from: a */
    public static void m20414a(int i, int i2) {
        int i3 = i + i2;
        if (i3 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("api_call_success_count", Integer.valueOf(i));
            hashMap.put("api_call_error_count", Integer.valueOf(i2));
            double d = (double) i;
            Double.isNaN(d);
            double d2 = (double) i3;
            Double.isNaN(d2);
            hashMap.put("api_call_success_ration", Double.valueOf((d * 1.0d) / d2));
            C3868c.m9491a("ttlive_fetch_message_success_ratio", 0, hashMap);
        }
    }

    /* renamed from: a */
    public static void m20416a(long j, long j2) {
        if (j2 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("api_call_delay_count", Long.valueOf(j2));
            hashMap.put("api_call_delay_all", Long.valueOf(j));
            double d = (double) j;
            Double.isNaN(d);
            double d2 = (double) j2;
            Double.isNaN(d2);
            hashMap.put("api_delay_average", Double.valueOf((d * 1.0d) / d2));
            C3868c.m9491a("ttlive_fetch_message_delay_average", 0, hashMap);
        }
    }

    /* renamed from: a */
    private static void m20419a(String str, Map<String, Object> map) {
        map.put("event_name", str.toUpperCase(Locale.getDefault()));
        C6555i.m14021b().mo9220c("ttlive_msg", map);
    }

    /* renamed from: a */
    public static void m20420a(Throwable th, String str) {
        HashMap hashMap = new HashMap();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        hashMap.put("status_code", -10001);
        hashMap.put("error_type", "ParseError");
        hashMap.put("error_code", "1");
        hashMap.put("method_name", str);
        hashMap.put("error_msg", th.getMessage());
        hashMap.put("stack_trace", stringWriter.toString());
        C3868c.m9491a(C6542d.m13985b("ttlive_fetch_message"), 1, hashMap);
        m20419a(C6542d.m13985b("ttlive_fetch_message"), hashMap);
    }

    /* renamed from: a */
    public static void m20418a(String str, String str2, long j) {
        Map<String, ?> map = f27759a;
        map.put("event_name", str);
        map.put("method", str2);
        map.put("msg_id", Long.valueOf(j));
        C6555i.m14021b().mo9217b("ttlive_msg", map);
    }

    /* renamed from: a */
    public static void m20417a(long j, long j2, long j3) {
        long j4 = f27760b;
        if (j4 > 0 && j >= j4) {
            HashMap hashMap = new HashMap();
            hashMap.put("api_call_start_time", Long.valueOf(j2));
            hashMap.put("api_call_time_stamp", Long.valueOf(j3));
            hashMap.put("api_delay", Long.valueOf(j));
            C3854a.m9453a(4, "LiveMessageMonitor", C4139e.C4140a.f11575b.mo46674b(hashMap));
            C3868c.m9491a("ttlive_fetch_message_time_out", 0, hashMap);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C11868d.m20958a(str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public static void m20415a(int i, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", "0");
        hashMap.put("status_code", Integer.valueOf(i));
        hashMap.put("error_type", str);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("stack_trace", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("error_msg", str2);
        }
        C3868c.m9491a(C6542d.m13985b("ttlive_fetch_message"), 1, hashMap);
        m20419a(C6542d.m13985b("ttlive_fetch_message"), hashMap);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorLatency(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            if (j > 0) {
                C11868d.m20959a(jSONObject2, "latency", j);
                C11868d.m20959a(jSONObject3, "latency", j);
            }
            C11868d.m20960a(jSONObject3, "event_module", "live_message");
            C11868d.m20960a(jSONObject3, "event_type", "bussiness_api_call");
            C11868d.m20958a(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
