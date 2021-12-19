package com.p2082ss.android.ugc.awemepushlib.p4251f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.f.c */
public final class C81834c {

    /* renamed from: a */
    public HashMap<String, Object> f182970a = new HashMap<>();

    static {
        Covode.recordClassIndex(95247);
    }

    /* renamed from: a */
    public final synchronized JSONObject mo125504a() {
        JSONObject jSONObject;
        MethodCollector.m26663i(11554);
        try {
            jSONObject = new JSONObject(this.f182970a);
            MethodCollector.m26664o(11554);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(11554);
            return null;
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final C81834c mo125502a(String str, Long l) {
        this.f182970a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C81834c mo125503a(String str, String str2) {
        this.f182970a.put(str, str2);
        return this;
    }
}
