package com.bytedance.push.frontier.setting;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.frontier.setting.a */
public final class C21815a {

    /* renamed from: a */
    public int f51703a;

    /* renamed from: b */
    public int f51704b;

    /* renamed from: c */
    public String f51705c;

    /* renamed from: d */
    public List<String> f51706d;

    static {
        Covode.recordClassIndex(25467);
    }

    /* renamed from: b */
    public final boolean mo35502b() {
        List<String> list;
        if (this.f51703a == 0 || this.f51704b == 0 || TextUtils.isEmpty(this.f51705c) || (list = this.f51706d) == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final JSONObject mo35501a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", this.f51703a);
            jSONObject.put("pid", this.f51704b);
            jSONObject.put("app_key", this.f51705c);
            JSONArray jSONArray = new JSONArray();
            List<String> list = this.f51706d;
            if (list != null) {
                for (String str : list) {
                    jSONArray.put(str);
                }
            }
            jSONObject.put("urls", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C21815a m40862a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C21815a aVar = new C21815a();
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray != null) {
            aVar.f51706d = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    if (!optString.endsWith("/ws/v2")) {
                        optString = optString.endsWith("/") ? optString + "ws/v2" : optString + "/ws/v2";
                    }
                    aVar.f51706d.add(optString);
                }
            }
        }
        aVar.f51703a = jSONObject.optInt("aid");
        aVar.f51704b = jSONObject.optInt("pid");
        aVar.f51705c = jSONObject.optString("app_key");
        return aVar;
    }
}
