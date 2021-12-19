package com.p2082ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.i */
public final class C30696i {

    /* renamed from: a */
    public Map<Integer, C30697a> f73422a = new HashMap();

    /* renamed from: b */
    public Map<Integer, C30697a> f73423b = new HashMap();

    /* renamed from: c */
    public int f73424c = -1;

    /* renamed from: com.ss.android.ttve.monitor.i$a */
    public static class C30697a {

        /* renamed from: a */
        public String f73425a;

        /* renamed from: b */
        public int f73426b;

        /* renamed from: c */
        public int f73427c;

        static {
            Covode.recordClassIndex(37267);
        }
    }

    static {
        Covode.recordClassIndex(37266);
    }

    /* renamed from: a */
    public final synchronized void mo55067a() {
        MethodCollector.m26663i(493);
        this.f73422a.clear();
        this.f73423b.clear();
        this.f73424c = -1;
        MethodCollector.m26664o(493);
    }

    /* renamed from: b */
    public final synchronized boolean mo55070b() {
        boolean isEmpty;
        MethodCollector.m26663i(495);
        isEmpty = this.f73422a.isEmpty();
        MethodCollector.m26664o(495);
        return isEmpty;
    }

    /* renamed from: c */
    public final synchronized boolean mo55071c() {
        boolean isEmpty;
        MethodCollector.m26663i(500);
        isEmpty = this.f73423b.isEmpty();
        MethodCollector.m26664o(500);
        return isEmpty;
    }

    /* renamed from: a */
    public final synchronized String mo55066a(int i) {
        Iterator<Map.Entry<Integer, C30697a>> it;
        MethodCollector.m26663i(3963);
        JSONArray jSONArray = new JSONArray();
        if (i == 0) {
            it = this.f73422a.entrySet().iterator();
        } else if (i == 1) {
            it = this.f73423b.entrySet().iterator();
        } else {
            it = null;
        }
        if (it == null) {
            MethodCollector.m26664o(3963);
            return null;
        }
        while (it.hasNext()) {
            C30697a value = it.next().getValue();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", value.f73425a);
                jSONObject.put("start", value.f73426b);
                jSONObject.put("duration", value.f73427c);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        String jSONArray2 = jSONArray.toString();
        MethodCollector.m26664o(3963);
        return jSONArray2;
    }

    /* renamed from: a */
    public final synchronized void mo55068a(int i, int i2) {
        MethodCollector.m26663i(511);
        if (i != 0) {
            if (i == 1) {
                this.f73423b.remove(Integer.valueOf(i2));
            }
            MethodCollector.m26664o(511);
            return;
        }
        this.f73422a.remove(Integer.valueOf(i2));
        MethodCollector.m26664o(511);
    }

    /* renamed from: a */
    public final synchronized void mo55069a(int i, int i2, C30697a aVar) {
        MethodCollector.m26663i(507);
        if (i != 0) {
            if (i == 1) {
                this.f73423b.put(Integer.valueOf(i2), aVar);
            }
            MethodCollector.m26664o(507);
            return;
        }
        this.f73422a.put(Integer.valueOf(i2), aVar);
        MethodCollector.m26664o(507);
    }
}
