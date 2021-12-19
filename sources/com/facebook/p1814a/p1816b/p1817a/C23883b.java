package com.facebook.p1814a.p1816b.p1817a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.a.b */
public final class C23883b {

    /* renamed from: a */
    public final String f56537a;

    /* renamed from: b */
    public final String f56538b;

    /* renamed from: c */
    public final List<C23884c> f56539c;

    /* renamed from: d */
    public final String f56540d;

    static {
        Covode.recordClassIndex(28004);
    }

    public C23883b(JSONObject jSONObject) {
        this.f56537a = jSONObject.getString(StringSet.name);
        this.f56538b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C23884c(optJSONArray.getJSONObject(i)));
            }
        }
        this.f56539c = arrayList;
        this.f56540d = jSONObject.optString("path_type", "absolute");
    }
}
