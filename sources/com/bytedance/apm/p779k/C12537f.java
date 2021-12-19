package com.bytedance.apm.p779k;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p839e.AbstractC13109a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.f */
public class C12537f {

    /* renamed from: a */
    private static volatile C12537f f30451a;

    static {
        Covode.recordClassIndex(14353);
    }

    private C12537f() {
    }

    /* renamed from: a */
    public static C12537f m22534a() {
        if (f30451a == null) {
            synchronized (C12537f.class) {
                if (f30451a == null) {
                    f30451a = new C12537f();
                }
            }
        }
        return f30451a;
    }

    /* renamed from: b */
    public static JSONObject m22535b() {
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC13109a aVar = (AbstractC13109a) C13104c.m23566a(AbstractC13109a.class);
            jSONObject.put("process_usage", aVar.mo20881a());
            jSONObject.put("stat_speed", aVar.mo20883b());
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
