package com.bytedance.android.ecommerce.p153a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.c */
public final class C2743c {

    /* renamed from: a */
    public String f8216a;

    /* renamed from: b */
    public String f8217b;

    /* renamed from: c */
    public String f8218c;

    /* renamed from: d */
    public String f8219d;

    /* renamed from: e */
    public String f8220e;

    /* renamed from: f */
    public JSONArray f8221f;

    /* renamed from: g */
    public String f8222g;

    /* renamed from: h */
    public String f8223h;

    /* renamed from: i */
    public String f8224i;

    /* renamed from: j */
    public List<Object> f8225j;

    /* renamed from: k */
    public String f8226k;

    /* renamed from: l */
    public String f8227l;

    /* renamed from: m */
    public List<C2743c> f8228m;

    /* renamed from: n */
    public Object f8229n;

    /* renamed from: o */
    private List<C2745e> f8230o;

    static {
        Covode.recordClassIndex(3169);
    }

    /* renamed from: a */
    public final boolean mo7324a() {
        return TextUtils.equals(this.f8222g, "R");
    }

    /* renamed from: c */
    private List<C2743c> m7911c() {
        ArrayList arrayList = new ArrayList();
        List<C2743c> list = this.f8228m;
        if (list != null) {
            for (C2743c cVar : list) {
                arrayList.addAll(cVar.m7911c());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<C2745e> mo7325b() {
        if (this.f8230o == null) {
            this.f8230o = new ArrayList();
            if (this.f8221f != null) {
                for (int i = 0; i < this.f8221f.length(); i++) {
                    this.f8230o.add(new C2745e(this.f8221f.optJSONObject(i)));
                }
            }
        }
        return this.f8230o;
    }

    public final String toString() {
        return "{mElement='" + this.f8216a + '\'' + ", mIconUrl='" + this.f8217b + '\'' + ", mDarkIconUrl='" + this.f8218c + '\'' + ", mStartlingKey='" + this.f8219d + '\'' + ", mStyleType='" + this.f8220e + '\'' + ", mFrontendRuleJsonArray=" + this.f8221f + ", mFrontendRuleList=" + this.f8230o + ", mDisplayTag='" + this.f8222g + '\'' + ", mParamName='" + this.f8223h + '\'' + ", mParamValue='" + this.f8224i + '\'' + ", mOptions=" + this.f8225j + ", mPlaceHolder='" + this.f8226k + '\'' + ", mDisplayOrder='" + this.f8227l + '\'' + ", mSubElementList=" + this.f8228m + '}';
    }

    public C2743c(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f8216a = jSONObject.optString("element");
            this.f8219d = jSONObject.optString("starling_key");
            this.f8220e = jSONObject.optString("style_type");
            this.f8222g = jSONObject.optString("display_tag");
            this.f8223h = jSONObject.optString("param_name");
            this.f8227l = jSONObject.optString("display_order");
            JSONArray optJSONArray = jSONObject.optJSONArray("sub_element_list");
            this.f8228m = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        this.f8228m.add(new C2743c((JSONObject) optJSONArray.get(i)));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            this.f8228m.addAll(m7911c());
        }
    }
}
