package com.bytedance.apm.p773f;

import com.bytedance.apm.p773f.C12468e;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b */
public final class C12463b {

    /* renamed from: a */
    public static boolean f30274a;

    static {
        Covode.recordClassIndex(14273);
    }

    /* renamed from: a */
    public static JSONObject m22425a(C12468e.C12469a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (aVar.f30297a != -1) {
                jSONObject2.put("launch_perf_gc_count", aVar.f30297a);
            }
            if (aVar.f30298b != -1) {
                jSONObject2.put("launch_perf_gc_time", aVar.f30298b);
            }
            if (aVar.f30299c != -1) {
                jSONObject2.put("launch_perf_block_gc_count", aVar.f30299c);
            }
            if (aVar.f30300d != -1) {
                jSONObject2.put("launch_perf_block_gc_time", aVar.f30300d);
            }
            if (aVar.f30304h != -1.0d) {
                jSONObject2.put("launch_perf_iowait_time", aVar.f30304h);
            }
            if (aVar.f30305i != -1.0d) {
                jSONObject2.put("launch_perf_runnable_time", aVar.f30305i);
            }
            if (aVar.f30306j != -1.0d) {
                jSONObject2.put("launch_perf_sleep_time", aVar.f30306j);
            }
            if (aVar.f30309m != -1) {
                jSONObject2.put("launch_perf_minfor_fault", aVar.f30309m);
            }
            if (aVar.f30310n != -1) {
                jSONObject2.put("launch_perf_major_fault", aVar.f30310n);
            }
            if (aVar.f30301e != -1.0d) {
                jSONObject2.put("launch_perf_cpu_time", aVar.f30301e);
            }
            if (aVar.f30302f != -1) {
                jSONObject2.put("launch_perf_voluntary_switches", aVar.f30302f);
            }
            if (aVar.f30303g != -1) {
                jSONObject2.put("launch_perf_involuntary_switches", aVar.f30303g);
            }
            if (aVar.f30311o != -1) {
                jSONObject2.put("launch_perf_all_thread_count", aVar.f30311o);
            }
            if (aVar.f30307k != -1) {
                jSONObject2.put("launch_perf_lock_time", aVar.f30307k);
            }
            if (aVar.f30308l != -1) {
                jSONObject2.put("launch_perf_binder_time", aVar.f30308l);
            }
            jSONObject.put("list_data", jSONObject2);
            List<String> list = aVar.f30312p;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str : list) {
                    jSONArray.put(str);
                }
                jSONObject.put("current_thread_list", jSONArray);
            }
            return jSONObject;
        } catch (Throwable th) {
            th.getLocalizedMessage();
            return null;
        }
    }
}
