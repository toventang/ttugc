package com.bytedance.sdk.bdlynx.p1692f;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.f.b */
public final class C22662b {

    /* renamed from: a */
    public static final C22662b f53531a = new C22662b();

    private C22662b() {
    }

    static {
        Covode.recordClassIndex(26479);
    }

    /* renamed from: a */
    private final List<Object> m42732a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if ((jSONArray.get(i) instanceof Float) || (jSONArray.get(i) instanceof Double)) {
                    arrayList.add(jSONArray.get(i));
                } else if (jSONArray.get(i) instanceof Number) {
                    arrayList.add(jSONArray.get(i));
                } else if (jSONArray.get(i) instanceof String) {
                    arrayList.add(jSONArray.get(i));
                } else if (jSONArray.get(i) instanceof Boolean) {
                    arrayList.add(jSONArray.get(i));
                } else if (jSONArray.get(i) instanceof JSONObject) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C89219l.m154709a((Object) jSONObject, "");
                    arrayList.add(mo36934a(jSONObject));
                } else if (jSONArray.get(i) instanceof JSONArray) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                    C89219l.m154709a((Object) jSONArray2, "");
                    arrayList.add(m42732a(jSONArray2));
                } else {
                    arrayList.add(null);
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Map<String, Object> mo36934a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ((jSONObject.get(next) instanceof Float) || (jSONObject.get(next) instanceof Double)) {
                    C89219l.m154709a((Object) next, "");
                    linkedHashMap.put(next, jSONObject.get(next));
                } else if (jSONObject.get(next) instanceof Number) {
                    C89219l.m154709a((Object) next, "");
                    linkedHashMap.put(next, jSONObject.get(next));
                } else if (jSONObject.get(next) instanceof String) {
                    C89219l.m154709a((Object) next, "");
                    linkedHashMap.put(next, jSONObject.get(next));
                } else if (jSONObject.get(next) instanceof Boolean) {
                    C89219l.m154709a((Object) next, "");
                    linkedHashMap.put(next, jSONObject.get(next));
                } else if (jSONObject.get(next) instanceof JSONObject) {
                    C89219l.m154709a((Object) next, "");
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    C89219l.m154709a((Object) jSONObject2, "");
                    linkedHashMap.put(next, mo36934a(jSONObject2));
                } else if (jSONObject.get(next) instanceof JSONArray) {
                    C89219l.m154709a((Object) next, "");
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    C89219l.m154709a((Object) jSONArray, "");
                    linkedHashMap.put(next, m42732a(jSONArray));
                } else {
                    C89219l.m154709a((Object) next, "");
                    linkedHashMap.put(next, null);
                }
            }
        } catch (Throwable unused) {
        }
        return linkedHashMap;
    }
}
