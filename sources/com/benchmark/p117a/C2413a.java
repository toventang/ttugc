package com.benchmark.p117a;

import com.benchmark.tools.C2517e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.benchmark.a.a */
public final class C2413a {

    /* renamed from: a */
    private static C2517e.AbstractC2518a f7250a;

    static {
        Covode.recordClassIndex(2764);
    }

    /* renamed from: a */
    public static synchronized void m7257a(C2517e.AbstractC2518a aVar) {
        synchronized (C2413a.class) {
            MethodCollector.m26663i(7605);
            f7250a = aVar;
            MethodCollector.m26664o(7605);
        }
    }

    /* renamed from: a */
    public static void m7258a(String str, String str2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        m7259a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m7259a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("sdk_version", "2.4.0-8_mt");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C2517e.AbstractC2518a aVar = f7250a;
        if (aVar != null) {
            aVar.mo6840a(str, jSONObject);
        }
    }
}
