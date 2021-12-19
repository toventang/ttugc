package com.bytedance.push.p1593f;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.f.c */
public final class C21804c {

    /* renamed from: a */
    public long f51675a;

    /* renamed from: b */
    public String f51676b;

    /* renamed from: c */
    public String f51677c;

    /* renamed from: d */
    public String f51678d;

    /* renamed from: e */
    public int f51679e;

    static {
        Covode.recordClassIndex(25453);
    }

    /* renamed from: a */
    public final JSONObject mo35484a() {
        if (this.f51679e <= 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StringSet.type, this.f51679e);
            jSONObject.put("token", this.f51678d);
            jSONObject.put("did", this.f51676b);
            jSONObject.put("vc", this.f51677c);
            jSONObject.put("t", this.f51675a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public final String toString() {
        return "{updateTime=" + this.f51675a + ", deviceId='" + this.f51676b + '\'' + ", versionCode='" + this.f51677c + '\'' + ", token='" + this.f51678d + '\'' + ", type=" + this.f51679e + '}';
    }

    public C21804c(int i, String str, String str2, String str3, long j) {
        this.f51679e = i;
        this.f51678d = str;
        this.f51676b = str2;
        this.f51677c = str3;
        this.f51675a = j;
    }
}
