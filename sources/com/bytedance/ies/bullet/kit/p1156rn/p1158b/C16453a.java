package com.bytedance.ies.bullet.kit.p1156rn.p1158b;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.rn.b.a */
public final class C16453a {

    /* renamed from: a */
    public static final C16453a f39508a = new C16453a();

    private C16453a() {
    }

    static {
        Covode.recordClassIndex(18775);
    }

    /* renamed from: a */
    public static String m30538a(Object obj) {
        C89219l.m154719c(obj, "");
        if (obj instanceof List) {
            String jSONArray = m30539a((List<? extends Object>) ((List) obj)).toString();
            C89219l.m154709a((Object) jSONArray, "");
            return jSONArray;
        } else if (obj instanceof Map) {
            String jSONObject = m30540a((Map<String, ? extends Object>) ((Map) obj)).toString();
            C89219l.m154709a((Object) jSONObject, "");
            return jSONObject;
        } else if (!(obj instanceof Double)) {
            return obj.toString();
        } else {
            Number number = (Number) obj;
            long doubleValue = (long) number.doubleValue();
            if (Double.compare(number.doubleValue(), (double) doubleValue) == 0) {
                return String.valueOf(doubleValue);
            }
            return obj.toString();
        }
    }

    /* renamed from: a */
    private static JSONArray m30539a(List<? extends Object> list) {
        C89219l.m154719c(list, "");
        JSONArray jSONArray = new JSONArray();
        for (T t : list) {
            if (t != null) {
                if (t instanceof List) {
                    jSONArray.put(m30539a((List<? extends Object>) t));
                } else if (t instanceof Map) {
                    jSONArray.put(m30540a((Map<String, ? extends Object>) t));
                } else if (t instanceof Double) {
                    T t2 = t;
                    long doubleValue = (long) t2.doubleValue();
                    if (Double.compare(t2.doubleValue(), (double) doubleValue) == 0) {
                        jSONArray.put(doubleValue);
                    } else {
                        jSONArray.put(t2.doubleValue());
                    }
                } else {
                    jSONArray.put(t);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m30540a(Map<String, ? extends Object> map) {
        C89219l.m154719c(map, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                Object value = entry.getValue();
                if (value instanceof List) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    if (value2 != null) {
                        jSONObject.put(key, m30539a((List<? extends Object>) ((List) value2)));
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (value instanceof Map) {
                    String key2 = entry.getKey();
                    Object value3 = entry.getValue();
                    if (value3 != null) {
                        jSONObject.put(key2, m30540a((Map<String, ? extends Object>) ((Map) value3)));
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (value instanceof Double) {
                    Object value4 = entry.getValue();
                    if (value4 != null) {
                        double doubleValue = ((Double) value4).doubleValue();
                        long j = (long) doubleValue;
                        if (Double.compare(doubleValue, (double) j) == 0) {
                            jSONObject.put(entry.getKey(), j);
                        } else {
                            jSONObject.put(entry.getKey(), doubleValue);
                        }
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return jSONObject;
    }
}
