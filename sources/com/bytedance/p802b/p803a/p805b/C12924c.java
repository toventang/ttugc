package com.bytedance.p802b.p803a.p805b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p830h.AbstractC13094b;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.a.b.c */
public final class C12924c implements AbstractC13094b {

    /* renamed from: a */
    public JSONObject f31453a;

    /* renamed from: b */
    private String f31454b;

    static {
        Covode.recordClassIndex(14760);
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: a */
    public final String mo20770a() {
        return this.f31454b;
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: b */
    public final boolean mo20771b() {
        if (!TextUtils.isEmpty(this.f31454b)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: c */
    public final JSONObject mo20772c() {
        try {
            JSONObject jSONObject = this.f31453a;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", this.f31454b);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String toString() {
        return "Apm5LegacyEvent{logType='" + this.f31454b + '\'' + '}';
    }

    public C12924c(String str, JSONObject jSONObject) {
        this.f31454b = str;
        this.f31453a = jSONObject;
    }
}
