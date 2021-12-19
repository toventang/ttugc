package com.p2082ss.android.p2092ad.splash.core.p2100e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.e.a */
public final class C29454a {

    /* renamed from: a */
    public String f69972a;

    /* renamed from: b */
    public String f69973b;

    /* renamed from: c */
    public String f69974c;

    /* renamed from: d */
    public String f69975d;

    static {
        Covode.recordClassIndex(35848);
    }

    public final String toString() {
        return "ShareAdInfo{mTitle='" + this.f69972a + '\'' + ", mDescription='" + this.f69973b + '\'' + ", mImageUrl='" + this.f69974c + '\'' + ", mShareUrl='" + this.f69975d + '\'' + '}';
    }

    public C29454a(JSONObject jSONObject) {
        this.f69972a = jSONObject.optString("share_title");
        this.f69973b = jSONObject.optString("share_desc");
        this.f69974c = jSONObject.optString("share_icon");
        this.f69975d = jSONObject.optString("share_url");
    }
}
