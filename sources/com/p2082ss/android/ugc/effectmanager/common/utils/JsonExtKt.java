package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.JsonExtKt */
public final class JsonExtKt {
    static {
        Covode.recordClassIndex(95521);
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        C89219l.m154719c(jSONArray, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            C89219l.m154709a(obj, "");
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            C89219l.m154709a((Object) next, "");
            C89219l.m154709a(obj, "");
            hashMap.put(next, obj);
        }
        return hashMap;
    }
}
