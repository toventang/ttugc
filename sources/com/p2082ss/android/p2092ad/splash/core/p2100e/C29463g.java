package com.p2082ss.android.p2092ad.splash.core.p2100e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.e.g */
public final class C29463g {

    /* renamed from: a */
    public String f70080a;

    /* renamed from: b */
    public int f70081b;

    /* renamed from: c */
    public String f70082c;

    /* renamed from: d */
    public String f70083d;

    static {
        Covode.recordClassIndex(35857);
    }

    /* renamed from: a */
    public static C29463g m59051a(JSONObject jSONObject) {
        C29463g gVar = new C29463g();
        if (jSONObject != null) {
            gVar.f70080a = jSONObject.optString("background_color");
            gVar.f70081b = jSONObject.optInt("position");
            gVar.f70082c = jSONObject.optString("text_color");
            gVar.f70083d = jSONObject.optString("text");
        }
        return gVar;
    }
}
