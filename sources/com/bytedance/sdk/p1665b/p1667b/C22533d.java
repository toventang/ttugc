package com.bytedance.sdk.p1665b.p1667b;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.b.b.d */
public final class C22533d {

    /* renamed from: a */
    public Map<String, List<String>> f53271a;

    static {
        Covode.recordClassIndex(26349);
    }

    /* renamed from: a */
    public static C22533d m42505a(String str) {
        C22533d dVar = new C22533d();
        JSONArray jSONArray = new JSONArray(str);
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(StringSet.name);
                JSONArray jSONArray2 = jSONObject.getJSONArray("mccmnc");
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList.add(jSONArray2.getString(i2));
                }
                hashMap.put(string, arrayList);
            }
            dVar.f53271a = hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return dVar;
    }
}
