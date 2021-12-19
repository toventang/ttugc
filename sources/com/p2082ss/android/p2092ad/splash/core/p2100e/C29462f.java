package com.p2082ss.android.p2092ad.splash.core.p2100e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.p2109f.C29643f;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.e.f */
public final class C29462f {

    /* renamed from: a */
    public List<String> f70075a;

    /* renamed from: b */
    public int f70076b;

    /* renamed from: c */
    public int f70077c;

    /* renamed from: d */
    public String f70078d;

    /* renamed from: e */
    public String f70079e;

    static {
        Covode.recordClassIndex(35856);
    }

    /* renamed from: a */
    public final boolean mo51558a() {
        if (this.f70076b > 0 && this.f70077c > 0 && !C29643f.m59683a(this.f70075a) && !C29657l.m59760a(this.f70078d)) {
            String str = this.f70075a.get(0);
            if (C29657l.m59760a(str) && this.f70075a.size() >= 2) {
                str = this.f70075a.get(1);
                if (C29657l.m59760a(str) && this.f70075a.size() >= 3) {
                    str = this.f70075a.get(2);
                }
            }
            if (!C29657l.m59760a(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C29462f m59049a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("url_list");
        ArrayList arrayList = new ArrayList(3);
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("url");
                if (!C29657l.m59760a(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString2 = jSONObject.optString("uri");
        String optString3 = jSONObject.optString("secret_key");
        if (C29657l.m59760a(optString2)) {
            return null;
        }
        return new C29462f(arrayList, optInt, optInt2, optString2, optString3);
    }

    private C29462f(List<String> list, int i, int i2, String str, String str2) {
        this.f70075a = list;
        this.f70076b = i;
        this.f70077c = i2;
        this.f70078d = str;
        this.f70079e = str2;
    }
}
