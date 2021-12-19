package com.bytedance.apm.p767c.p769b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.b.a */
public final class C12407a implements AbstractC12406b {

    /* renamed from: a */
    public String f29984a;

    /* renamed from: b */
    public long f29985b;

    /* renamed from: c */
    public long f29986c;

    /* renamed from: d */
    public String f29987d;

    /* renamed from: e */
    public String f29988e;

    /* renamed from: f */
    public String f29989f;

    /* renamed from: g */
    public int f29990g;

    /* renamed from: h */
    public JSONObject f29991h;

    static {
        Covode.recordClassIndex(14214);
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final boolean mo20189a(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: b */
    public final String mo20190b() {
        return null;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: c */
    public final String mo20191c() {
        return null;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: d */
    public final boolean mo20192d() {
        return true;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final JSONObject mo20188a() {
        if (TextUtils.isEmpty(this.f29984a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.f29984a);
            jSONObject.put("duration", this.f29985b);
            jSONObject.put("uri", Uri.parse(this.f29987d));
            long j = this.f29986c;
            if (j > 0) {
                jSONObject.put("timestamp", j);
            }
            jSONObject.put("status", this.f29990g);
            if (!TextUtils.isEmpty(this.f29988e)) {
                jSONObject.put("ip", this.f29988e);
            }
            if (!TextUtils.isEmpty(this.f29989f)) {
                jSONObject.put("trace_code", this.f29989f);
            } else {
                jSONObject.put("trace_code", "");
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public C12407a(String str, long j, long j2, String str2, String str3, String str4, int i, JSONObject jSONObject) {
        this.f29984a = str;
        this.f29985b = j;
        this.f29986c = j2;
        this.f29987d = str2;
        this.f29988e = str3;
        this.f29989f = str4;
        this.f29990g = i;
        if (jSONObject == null) {
            this.f29991h = new JSONObject();
        } else {
            this.f29991h = jSONObject;
        }
    }
}
