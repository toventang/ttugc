package com.bytedance.p802b.p803a.p805b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p830h.AbstractC13094b;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.a.b.a */
public final class C12922a implements AbstractC13094b {

    /* renamed from: a */
    public String f31445a;

    /* renamed from: b */
    public int f31446b;

    /* renamed from: c */
    public JSONObject f31447c;

    /* renamed from: d */
    public JSONObject f31448d;

    /* renamed from: e */
    public JSONObject f31449e;

    /* renamed from: f */
    public JSONObject f31450f;

    static {
        Covode.recordClassIndex(14758);
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: a */
    public final String mo20770a() {
        return "service_monitor";
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: b */
    public final boolean mo20771b() {
        if (!TextUtils.isEmpty(this.f31445a)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CommonEvent{serviceName='" + this.f31445a + '\'' + '}';
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: c */
    public final JSONObject mo20772c() {
        try {
            JSONObject jSONObject = this.f31450f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", "service_monitor");
            jSONObject.put("service", this.f31445a);
            jSONObject.put("status", this.f31446b);
            JSONObject jSONObject2 = this.f31447c;
            if (jSONObject2 != null) {
                jSONObject.put("value", jSONObject2);
            }
            JSONObject jSONObject3 = this.f31448d;
            if (jSONObject3 != null) {
                jSONObject.put("category", jSONObject3);
            }
            JSONObject jSONObject4 = this.f31449e;
            if (jSONObject4 != null) {
                jSONObject.put("metric", jSONObject4);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public C12922a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f31445a = str;
        this.f31446b = i;
        this.f31447c = jSONObject;
        this.f31448d = jSONObject2;
        this.f31449e = jSONObject3;
        this.f31450f = jSONObject4;
    }
}
