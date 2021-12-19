package com.bytedance.p802b.p803a.p805b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p830h.AbstractC13094b;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.a.b.b */
public final class C12923b implements AbstractC13094b {

    /* renamed from: a */
    public String f31451a;

    /* renamed from: b */
    public JSONObject f31452b;

    static {
        Covode.recordClassIndex(14759);
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: a */
    public final String mo20770a() {
        return this.f31451a;
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: b */
    public final boolean mo20771b() {
        if (!TextUtils.isEmpty(this.f31451a)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: c */
    public final JSONObject mo20772c() {
        try {
            JSONObject jSONObject = this.f31452b;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", this.f31451a);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String toString() {
        return "CommonLog{logType='" + this.f31451a + '\'' + '}';
    }

    public C12923b(String str, JSONObject jSONObject) {
        this.f31451a = str;
        this.f31452b = jSONObject;
    }
}
