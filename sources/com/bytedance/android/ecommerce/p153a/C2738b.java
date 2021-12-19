package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.b */
public class C2738b {

    /* renamed from: a */
    public int f8180a;

    /* renamed from: b */
    public int f8181b;

    /* renamed from: c */
    public int f8182c;

    /* renamed from: d */
    public int f8183d;

    /* renamed from: e */
    public int f8184e;

    /* renamed from: f */
    public int f8185f;

    /* renamed from: g */
    public int f8186g;

    /* renamed from: h */
    public int f8187h;

    /* renamed from: i */
    public boolean f8188i = false;

    /* renamed from: j */
    public boolean f8189j = false;

    /* renamed from: k */
    private final String f8190k = C2738b.class.getName();

    static {
        Covode.recordClassIndex(3164);
    }

    public C2738b(JSONObject jSONObject) {
        int i;
        int i2;
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("left_bottom");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("left_top");
                JSONArray optJSONArray3 = jSONObject.optJSONArray("right_bottom");
                JSONArray optJSONArray4 = jSONObject.optJSONArray("right_top");
                if (optJSONArray != null && optJSONArray2 != null && optJSONArray3 != null && optJSONArray4 != null) {
                    this.f8180a = optJSONArray.getInt(0);
                    this.f8181b = optJSONArray.getInt(1);
                    this.f8182c = optJSONArray2.getInt(0);
                    this.f8183d = optJSONArray2.getInt(1);
                    this.f8184e = optJSONArray3.getInt(0);
                    this.f8185f = optJSONArray3.getInt(1);
                    this.f8186g = optJSONArray4.getInt(0);
                    int i3 = optJSONArray4.getInt(1);
                    this.f8187h = i3;
                    int i4 = this.f8182c;
                    int i5 = this.f8184e;
                    if (i4 > i5 && (i = this.f8183d) > (i2 = this.f8185f)) {
                        int i6 = this.f8180a;
                        int i7 = this.f8181b;
                        int i8 = this.f8186g;
                        this.f8182c = i5;
                        this.f8183d = i2;
                        this.f8186g = i6;
                        this.f8187h = i7;
                        this.f8180a = i8;
                        this.f8181b = i3;
                        this.f8184e = i4;
                        this.f8185f = i;
                        this.f8189j = true;
                    }
                    this.f8188i = true;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
