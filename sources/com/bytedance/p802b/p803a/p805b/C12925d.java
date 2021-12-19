package com.bytedance.p802b.p803a.p805b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p830h.AbstractC13094b;
import com.bytedance.p802b.p841k.C13116b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.a.b.d */
public final class C12925d implements AbstractC13094b {

    /* renamed from: a */
    private JSONArray f31455a;

    static {
        Covode.recordClassIndex(14761);
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: a */
    public final String mo20770a() {
        return "tracing";
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: b */
    public final boolean mo20771b() {
        return true;
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: c */
    public final JSONObject mo20772c() {
        return C13116b.m23583a("tracing", this.f31455a);
    }

    public C12925d(JSONArray jSONArray) {
        this.f31455a = jSONArray;
    }

    public C12925d(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        this.f31455a = jSONArray;
    }
}
