package com.bytedance.push.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1593f.C21804c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.settings.j */
public class C21897j {
    static {
        Covode.recordClassIndex(25560);
    }

    /* renamed from: a */
    public static List<C21804c> m41122a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                C21804c cVar = null;
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt(StringSet.type);
                    String optString = optJSONObject.optString("token");
                    String optString2 = optJSONObject.optString("did");
                    String optString3 = optJSONObject.optString("vc");
                    long optLong = optJSONObject.optLong("t");
                    if (optInt > 0) {
                        cVar = new C21804c(optInt, optString, optString2, optString3, optLong);
                    }
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
