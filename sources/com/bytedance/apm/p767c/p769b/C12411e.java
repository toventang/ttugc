package com.bytedance.apm.p767c.p769b;

import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.b.e */
public final class C12411e implements AbstractC12406b {

    /* renamed from: a */
    public String f30007a;

    /* renamed from: b */
    public String f30008b;

    /* renamed from: c */
    public float f30009c;

    static {
        Covode.recordClassIndex(14218);
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: b */
    public final String mo20190b() {
        return "timer";
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: c */
    public final String mo20191c() {
        return "timer";
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: d */
    public final boolean mo20192d() {
        return false;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final JSONObject mo20188a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StringSet.type, this.f30007a);
            jSONObject.put("key", this.f30008b);
            jSONObject.put("value", (double) this.f30009c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final boolean mo20189a(JSONObject jSONObject) {
        return C12556c.m22588c(this.f30007a);
    }

    public C12411e(String str, String str2, float f) {
        this.f30007a = str;
        this.f30008b = str2;
        this.f30009c = f;
    }
}
