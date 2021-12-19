package com.bytedance.ies.xbridge.platform.p1352b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.b.a */
public final class C18820a {

    /* renamed from: a */
    public static final C18820a f44625a = new C18820a();

    private C18820a() {
    }

    static {
        Covode.recordClassIndex(21516);
    }

    /* renamed from: a */
    public static List<Object> m34919a(JSONArray jSONArray) {
        C89219l.m154719c(jSONArray, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (opt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (opt instanceof Integer) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            } else if (opt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (opt instanceof JSONObject) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                C89219l.m154709a((Object) optJSONObject, "");
                arrayList.add(m34920a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i);
                C89219l.m154709a((Object) optJSONArray, "");
                arrayList.add(m34919a(optJSONArray));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m34920a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof Long) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (opt instanceof Double) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (opt instanceof Integer) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (opt instanceof String) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, jSONObject.optString(next));
            } else if (opt instanceof JSONObject) {
                C89219l.m154709a((Object) next, "");
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                C89219l.m154709a((Object) optJSONObject, "");
                linkedHashMap.put(next, m34920a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                C89219l.m154709a((Object) next, "");
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                C89219l.m154709a((Object) optJSONArray, "");
                linkedHashMap.put(next, m34919a(optJSONArray));
            } else if (opt instanceof Boolean) {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            } else {
                C89219l.m154709a((Object) next, "");
                linkedHashMap.put(next, null);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private static JSONArray m34921a(List<? extends Object> list) {
        JSONArray jSONArray = new JSONArray();
        for (T t : list) {
            if (t instanceof Float) {
                jSONArray.put((double) t.floatValue());
            } else if (t instanceof Long) {
                jSONArray.put((double) t.longValue());
            } else if (t instanceof Integer) {
                jSONArray.put(t.intValue());
            } else if (t instanceof Double) {
                jSONArray.put(t.doubleValue());
            } else if (t instanceof String) {
                jSONArray.put(t);
            } else if (t instanceof Boolean) {
                jSONArray.put(t.booleanValue());
            } else if (t instanceof Map) {
                if (t != null) {
                    try {
                        jSONArray.put(m34922a((Map<String, ? extends Object>) t));
                    } catch (Exception unused) {
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (!(t instanceof List)) {
                continue;
            } else if (t != null) {
                jSONArray.put(m34921a((List<? extends Object>) t));
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m34922a(Map<String, ? extends Object> map) {
        C89219l.m154719c(map, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                jSONObject.put(key, (double) ((Number) value).longValue());
            } else if (value instanceof Float) {
                jSONObject.put(key, (double) ((Number) value).floatValue());
            } else if (value instanceof Integer) {
                jSONObject.put(key, ((Number) value).intValue());
            } else if (value instanceof Double) {
                jSONObject.put(key, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                jSONObject.put(key, value);
            } else if (value instanceof Boolean) {
                jSONObject.put(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Map) {
                try {
                    jSONObject.put(key, m34922a((Map) value));
                } catch (Exception unused) {
                }
            } else if (value instanceof List) {
                jSONObject.put(key, m34921a((List) value));
            }
        }
        return jSONObject;
    }
}
