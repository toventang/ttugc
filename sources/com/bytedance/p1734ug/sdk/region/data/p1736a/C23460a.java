package com.bytedance.p1734ug.sdk.region.data.p1736a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1734ug.sdk.region.data.p1743h.C23482a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ug.sdk.region.data.a.a */
public final class C23460a {

    /* renamed from: a */
    public String f55625a;

    /* renamed from: b */
    public long f55626b;

    /* renamed from: c */
    public String f55627c;

    /* renamed from: d */
    public String f55628d;

    /* renamed from: e */
    public long f55629e;

    /* renamed from: f */
    public int f55630f;

    /* renamed from: g */
    public String f55631g;

    static {
        Covode.recordClassIndex(27461);
    }

    private C23460a() {
    }

    /* renamed from: a */
    public final String mo38219a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Code", this.f55625a);
            jSONObject.put("GeoNameID", this.f55626b);
            jSONObject.put("ASCIName", this.f55627c);
            jSONObject.put("Name", this.f55628d);
            jSONObject.put("expire_time", this.f55629e);
            jSONObject.put("source", this.f55630f);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo38220b() {
        if (TextUtils.isEmpty(this.f55631g) && !TextUtils.isEmpty(this.f55625a) && this.f55629e > 0 && System.currentTimeMillis() <= this.f55629e) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "RegionBean{code='" + this.f55625a + '\'' + ", geoNameID=" + this.f55626b + ", asciName='" + this.f55627c + '\'' + ", name='" + this.f55628d + '\'' + ", source=" + this.f55630f + ", expireTime=" + this.f55629e + '}';
    }

    /* renamed from: b */
    public static C23460a m44152b(String str) {
        C23460a aVar = new C23460a();
        aVar.f55631g = str;
        return aVar;
    }

    /* renamed from: a */
    public static C23460a m44150a(String str) {
        C23460a aVar = new C23460a();
        aVar.f55630f = 2;
        aVar.f55625a = str;
        aVar.f55629e = System.currentTimeMillis() + 21600000;
        return aVar;
    }

    /* renamed from: a */
    public static C23460a m44151a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C23460a aVar = new C23460a();
            aVar.f55625a = C23482a.m44172b(jSONObject, "Code", null);
            aVar.f55626b = C23482a.m44170a(jSONObject, "GeoNameID", 0);
            aVar.f55627c = C23482a.m44172b(jSONObject, "ASCIName", null);
            aVar.f55628d = C23482a.m44172b(jSONObject, "Name", null);
            aVar.f55629e = C23482a.m44170a(jSONObject, "expire_time", System.currentTimeMillis() + 21600000);
            aVar.f55630f = i;
            return aVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
