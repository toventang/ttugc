package com.p2082ss.android.ugc.tiktok.deeplink.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.a */
public final class C84300a {

    /* renamed from: a */
    public JSONObject f188509a;

    /* renamed from: b */
    public List<String> f188510b = new ArrayList();

    /* renamed from: c */
    public List<C84302c> f188511c = new ArrayList();

    /* renamed from: d */
    public Long f188512d = -1L;

    static {
        Covode.recordClassIndex(98224);
    }

    /* renamed from: a */
    private void m145001a(JSONObject jSONObject) {
        JSONArray names;
        if (!(jSONObject == null || (names = jSONObject.names()) == null || names.length() <= 0)) {
            for (int i = 0; i < names.length(); i++) {
                String optString = names.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f188510b.add(optString);
                    JSONObject optJSONObject = jSONObject.optJSONObject(optString);
                    if (optJSONObject != null) {
                        this.f188511c.add(new C84302c(optString, optJSONObject));
                    }
                }
            }
        }
    }

    public C84300a(String str, Long l) {
        if (l != null) {
            this.f188512d = l;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f188509a = jSONObject;
                m145001a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public C84300a(JSONObject jSONObject, Long l) {
        if (l != null) {
            this.f188512d = l;
        }
        this.f188509a = jSONObject;
        m145001a(jSONObject);
    }
}
