package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.basics.c */
public abstract class AbstractC13342c implements AbstractC13343d, Serializable {

    /* renamed from: a */
    private final String f32609a;

    /* renamed from: b */
    private final int f32610b;

    static {
        Covode.recordClassIndex(15338);
    }

    @Override // com.bytedance.bpea.basics.AbstractC13343d
    public String certToken() {
        return this.f32609a;
    }

    public int certType() {
        return this.f32610b;
    }

    public String toString() {
        String jSONObject = toJSON().toString();
        C89219l.m154709a((Object) jSONObject, "");
        return jSONObject;
    }

    @Override // com.bytedance.bpea.basics.AbstractC13343d
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("certToken", this.f32609a);
            jSONObject.put("certType", this.f32610b);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.bpea.basics.AbstractC13343d
    public void validate(C13345f fVar) {
        C89219l.m154719c(fVar, "");
        String str = this.f32609a;
        if (str == null || str.length() == 0) {
            throw new C13340a(-1, "certToken is empty");
        }
    }

    public AbstractC13342c(String str, int i) {
        this.f32609a = str;
        this.f32610b = i;
    }
}
