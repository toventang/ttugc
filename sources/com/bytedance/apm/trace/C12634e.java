package com.bytedance.apm.trace;

import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p772e.C12448b;
import com.bytedance.apm.p773f.C12451a;
import com.bytedance.apm.p773f.C12463b;
import com.bytedance.apm.p773f.C12468e;
import com.bytedance.apm.p789q.C12577c;
import com.bytedance.apm.p789q.C12587i;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p831i.p832a.C13098b;
import com.kakao.usermgmt.StringSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.e */
public final class C12634e {

    /* renamed from: a */
    public static volatile boolean f30756a = true;

    /* renamed from: b */
    public long f30757b;

    /* renamed from: c */
    public long f30758c;

    /* renamed from: d */
    public final ConcurrentHashMap<String, C12448b> f30759d = new ConcurrentHashMap<>(4);

    /* renamed from: e */
    private final String f30760e;

    /* renamed from: f */
    private final String f30761f;

    /* renamed from: com.bytedance.apm.trace.e$a */
    public interface AbstractC12638a {
        static {
            Covode.recordClassIndex(14455);
        }

        /* renamed from: a */
        void mo20446a(long j);
    }

    static {
        Covode.recordClassIndex(14451);
    }

    /* renamed from: a */
    public final boolean mo20445a() {
        return "start_trace".equals(this.f30760e);
    }

    public C12634e(String str, String str2) {
        if ("start_trace".equals(str) || "page_load_trace".equals(str)) {
            this.f30760e = str;
            this.f30761f = str2;
            return;
        }
        throw new IllegalStateException("Please add TraceServiceName support on TraceState#reportAsync");
    }

    /* renamed from: a */
    public final void mo20444a(int i, String str, String str2, long j, C12468e.C12469a aVar) {
        JSONObject a;
        JSONArray jSONArray = new JSONArray();
        int i2 = 2;
        try {
            if (TextUtils.equals(str2, AutoLaunchTraceHelper.sLauncherActivityName)) {
                jSONArray = AutoLaunchTraceHelper.assemblySpan();
            }
            ConcurrentHashMap<String, C12448b> concurrentHashMap = this.f30759d;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                for (Map.Entry<String, C12448b> entry : this.f30759d.entrySet()) {
                    String key = entry.getKey();
                    C12448b value = entry.getValue();
                    if (value.f30238b != 0) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = key.split("#");
                        if (split.length == i2) {
                            if ("page_load_trace".equals(this.f30760e)) {
                                jSONObject.put(StringSet.name, split[1]);
                            } else {
                                jSONObject.put("module_name", split[0]);
                                jSONObject.put("span_name", split[1]);
                            }
                        } else if (split.length == 1) {
                            jSONObject.put("span_name", split[0]);
                        }
                        jSONObject.put("start", value.f30237a);
                        jSONObject.put("end", value.f30238b);
                        jSONObject.put("thread", value.f30239c);
                        jSONArray.put(jSONObject);
                        i2 = 2;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ConcurrentHashMap<String, C12448b> concurrentHashMap2 = this.f30759d;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(StringSet.name, this.f30761f);
            jSONObject2.put("page_type", this.f30761f);
            jSONObject2.put("start", this.f30757b);
            jSONObject2.put("end", j);
            jSONObject2.put("spans", jSONArray);
            jSONObject2.put("collect_from", 2);
            jSONObject2.put("page_name", str2);
            if (i != -1) {
                jSONObject2.put("launch_mode", i);
            }
            if (!str.isEmpty()) {
                jSONObject2.put("custom_launch_mode", str);
            }
        } catch (JSONException unused) {
        }
        if (mo20445a() && C12451a.C12452a.f30248a.mo20282a().f30278d) {
            JSONObject jSONObject3 = new JSONObject();
            C12577c.C12579a.f30614a.mo20404a(jSONObject3, true);
            C12577c.C12579a.f30614a.mo20405b(jSONObject3, true);
            try {
                jSONObject2.put("device_info_data", jSONObject3);
            } catch (Throwable unused2) {
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("trace", jSONObject2);
            if (!(aVar == null || (a = C12463b.m22425a(aVar)) == null)) {
                jSONObject4.put("perf_data", a);
            }
        } catch (JSONException unused3) {
        }
        C12412f fVar = new C12412f(this.f30760e, "", null, null, jSONObject4, (byte) 0);
        C13098b.m23557a(fVar, false);
        if (C12397c.m22288e()) {
            C12587i.m22685a("AppStartStats", "reportAsync: ".concat(String.valueOf(jSONObject4)));
        }
        C12401a.m22303b().mo20179a(fVar);
    }
}
