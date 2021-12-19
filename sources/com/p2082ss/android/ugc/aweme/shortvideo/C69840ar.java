package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar */
public final class C69840ar {

    /* renamed from: a */
    private HashMap<String, Object> f156065a = new HashMap<>();

    static {
        Covode.recordClassIndex(82248);
    }

    /* renamed from: a */
    public final synchronized JSONObject mo110191a() {
        JSONObject jSONObject;
        MethodCollector.m26663i(361);
        try {
            jSONObject = new JSONObject(this.f156065a);
            MethodCollector.m26664o(361);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(361);
            return null;
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C69840ar m123402a(JSONObject jSONObject) {
        C69840ar arVar = new C69840ar();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                arVar.mo110189a(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return arVar;
    }

    /* renamed from: a */
    public final C69840ar mo110190a(Map<String, String> map) {
        this.f156065a.putAll(map);
        return this;
    }

    /* renamed from: a */
    public final C69840ar mo110185a(String str, Boolean bool) {
        this.f156065a.put(str, bool);
        return this;
    }

    /* renamed from: a */
    public final C69840ar mo110186a(String str, Float f) {
        this.f156065a.put(str, f);
        return this;
    }

    /* renamed from: a */
    public final C69840ar mo110187a(String str, Integer num) {
        this.f156065a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C69840ar mo110188a(String str, Long l) {
        this.f156065a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C69840ar mo110189a(String str, String str2) {
        this.f156065a.put(str, str2);
        return this;
    }
}
