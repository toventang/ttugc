package com.p2082ss.android.ugc.aweme.app.p2328f;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.f.c */
public final class C33743c {

    /* renamed from: a */
    public HashMap<String, Object> f79941a = new HashMap<>();

    static {
        Covode.recordClassIndex(40638);
    }

    /* renamed from: a */
    public final JSONObject mo59977a() {
        try {
            return new JSONObject(this.f79941a);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C33743c m69072a(JSONObject jSONObject) {
        C33743c cVar = new C33743c();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    cVar.mo59976a(next, jSONObject.getString(next));
                } catch (JSONException unused) {
                }
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public final C33743c mo59971a(String str, Boolean bool) {
        this.f79941a.put(str, bool);
        return this;
    }

    /* renamed from: a */
    public final C33743c mo59972a(String str, Double d) {
        this.f79941a.put(str, d);
        return this;
    }

    /* renamed from: a */
    public final C33743c mo59973a(String str, Float f) {
        this.f79941a.put(str, f);
        return this;
    }

    /* renamed from: a */
    public final C33743c mo59974a(String str, Integer num) {
        this.f79941a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C33743c mo59975a(String str, Long l) {
        this.f79941a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C33743c mo59976a(String str, String str2) {
        this.f79941a.put(str, str2);
        return this;
    }
}
