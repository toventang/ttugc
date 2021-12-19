package com.p2082ss.android.ugc.aweme.p2387bf;

import android.content.Context;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.p932j.C13911h;
import com.bytedance.keva.KevaMonitor;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.application.C33914o;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bf.b */
public final class C34819b extends KevaMonitor {
    static {
        Covode.recordClassIndex(41827);
    }

    /* renamed from: a */
    private static void m71154a(String str) {
        if (C33914o.f80220b.get(str) == null) {
            Librarian.m38964a(str, false, (Context) null);
        }
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void loadLibrary(String str) {
        m71154a("c++_shared");
        m71154a(str);
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void onLoadRepo(String str, int i) {
        super.onLoadRepo(str, i);
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
        if (ApmDelegate.C12507a.f30372a.mo20329a("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", C34818a.f82246a);
                jSONObject.put("kv_perf_report_type", 0);
                jSONObject.put("kv_perf_value_type", String.valueOf(i));
                jSONObject.put("kv_perf_name", str);
                jSONObject.put("kv_perf_key", str2);
                jSONObject.put("kv_perf_value", obj);
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                jSONObject.put("kv_perf_msg", stringWriter.getBuffer().toString());
            } catch (Throwable unused) {
            }
            C12290b.m22064a("aweme_keva_monitor_report", jSONObject);
        }
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void reportWarning(int i, String str, String str2, Object obj, String str3) {
        if (ApmDelegate.C12507a.f30372a.mo20329a("aweme_keva_monitor_report")) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("kv_global_id", C34818a.f82246a);
                hashMap.put("kv_report_type", "1");
                hashMap.put("kv_type", String.valueOf(i));
                hashMap.put("kv_name", str);
                if (str2 != null) {
                    hashMap.put("kv_key", str2);
                }
                if (obj != null) {
                    hashMap.put("kv_value", obj.toString());
                }
                hashMap.put("kv_msg", str3);
                Exception exc = new Exception("keva exception");
                if (C13849d.m25016a(exc)) {
                    C13911h.m25185a(exc, str, true, hashMap, "core_exception_monitor");
                }
            } catch (Throwable unused) {
            }
        }
    }
}
