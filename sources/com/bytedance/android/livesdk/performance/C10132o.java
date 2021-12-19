package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.performance.o */
public class C10132o {

    /* renamed from: a */
    HashMap<String, C10133a> f24579a = new HashMap<>();

    static {
        Covode.recordClassIndex(11695);
    }

    /* renamed from: com.bytedance.android.livesdk.performance.o$a */
    public static class C10133a {

        /* renamed from: a */
        public String f24580a;

        /* renamed from: b */
        public Map<String, String> f24581b;

        static {
            Covode.recordClassIndex(11696);
        }

        /* renamed from: a */
        public final JSONObject mo16972a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("active", 1);
                Map<String, String> map = this.f24581b;
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, String> entry : this.f24581b.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final String toString() {
            return "Module: " + this.f24580a + " : " + this.f24581b.toString();
        }

        public C10133a(String str, Map<String, String> map) {
            this.f24580a = str;
            this.f24581b = map;
        }
    }
}
