package com.p2082ss.android.p2092ad.splash.core.p2100e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.e.m */
public final class C29469m {

    /* renamed from: a */
    public String f70097a;

    /* renamed from: b */
    public int f70098b;

    /* renamed from: c */
    public int f70099c;

    /* renamed from: d */
    public String f70100d;

    /* renamed from: e */
    public String f70101e;

    /* renamed from: f */
    public String f70102f;

    /* renamed from: g */
    public boolean f70103g;

    /* renamed from: h */
    public int f70104h;

    /* renamed from: i */
    private int f70105i;

    static {
        Covode.recordClassIndex(35863);
    }

    /* renamed from: a */
    public final boolean mo51559a(int i) {
        if ((i & this.f70105i) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C29469m m59056a(JSONObject jSONObject) {
        C29469m mVar = new C29469m();
        if (jSONObject != null) {
            mVar.f70097a = jSONObject.optString("countdown_unit", "");
            mVar.f70098b = jSONObject.optInt("height_extra_size");
            mVar.f70099c = jSONObject.optInt("width_extra_size");
            mVar.f70100d = jSONObject.optString("text_color");
            mVar.f70101e = jSONObject.optString("background_color");
            mVar.f70102f = jSONObject.optString("text");
            boolean z = true;
            if (jSONObject.optInt("countdown_enable", 0) != 1) {
                z = false;
            }
            mVar.f70103g = z;
            mVar.f70104h = jSONObject.optInt("show_skip_seconds", 0);
            mVar.f70105i = jSONObject.optInt("button_extra_style", 0);
        }
        return mVar;
    }
}
