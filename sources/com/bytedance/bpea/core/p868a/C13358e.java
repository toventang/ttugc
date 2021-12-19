package com.bytedance.bpea.core.p868a;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.a.e */
public final class C13358e {

    /* renamed from: a */
    public String f32639a;

    /* renamed from: b */
    public String f32640b;

    /* renamed from: c */
    JSONObject f32641c;

    /* renamed from: d */
    JSONObject f32642d;

    /* renamed from: e */
    JSONObject f32643e;

    static {
        Covode.recordClassIndex(15354);
    }

    /* renamed from: a */
    public final String mo21600a(String str) {
        C89219l.m154719c(str, "");
        JSONObject jSONObject = this.f32641c;
        if (jSONObject != null) {
            return jSONObject.optString(str);
        }
        return null;
    }

    /* renamed from: b */
    public final JSONArray mo21601b(String str) {
        C89219l.m154719c(str, "");
        JSONObject jSONObject = this.f32642d;
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* renamed from: c */
    public final JSONObject mo21602c(String str) {
        C89219l.m154719c(str, "");
        JSONObject jSONObject = this.f32643e;
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }
}
