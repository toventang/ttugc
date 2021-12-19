package com.bytedance.bridge.magpie.p886e;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.e.b */
public final class C13450b {

    /* renamed from: a */
    public static final C13450b f32774a = new C13450b();

    private C13450b() {
    }

    static {
        Covode.recordClassIndex(15450);
    }

    /* renamed from: a */
    private final JavaOnlyArray m24172a(JSONArray jSONArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONArray) {
                javaOnlyArray.add(m24172a((JSONArray) opt));
            } else if (opt instanceof JSONObject) {
                javaOnlyArray.add(mo21680a((JSONObject) opt));
            } else {
                javaOnlyArray.add(opt);
            }
        }
        return javaOnlyArray;
    }

    /* renamed from: a */
    private static Number m24173a(Number number) {
        Object obj;
        int i;
        Object obj2;
        double d;
        try {
            obj = C89379q.m157068constructorimpl(Integer.valueOf(number.intValue()));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        Double d2 = null;
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        try {
            obj2 = C89379q.m157068constructorimpl(Double.valueOf(number.doubleValue()));
        } catch (Throwable th2) {
            obj2 = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
        }
        if (!C89379q.m157073isFailureimpl(obj2)) {
            d2 = obj2;
        }
        Double d3 = d2;
        if (d3 != null) {
            d = d3.doubleValue();
        } else {
            d = 0.0d;
        }
        if (Double.compare((double) i, d) == 0) {
            return Integer.valueOf(i);
        }
        long j = (long) d;
        if (Double.compare(d, (double) j) == 0) {
            return Long.valueOf(j);
        }
        return Double.valueOf(d);
    }

    /* renamed from: a */
    private final JSONArray m24174a(JavaOnlyArray javaOnlyArray) {
        JSONArray jSONArray = new JSONArray();
        int size = javaOnlyArray.size();
        for (int i = 0; i < size; i++) {
            Object obj = javaOnlyArray.get(i);
            try {
                ReadableType type = javaOnlyArray.getType(i);
                if (type != null) {
                    int i2 = C13451c.f32776b[type.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                if (obj != null) {
                                    jSONArray.put(m24173a((Number) obj));
                                } else {
                                    throw new C89388w("null cannot be cast to non-null type");
                                }
                            }
                        } else if (obj != null) {
                            jSONArray.put(m24174a((JavaOnlyArray) obj));
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else if (obj != null) {
                        jSONArray.put(mo21681a((JavaOnlyMap) obj));
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                jSONArray.put(obj);
            } catch (Throwable th) {
                C13453e.m24177a("BridgeConverter", "revertJavaOnlyArray2JSONArray ".concat(String.valueOf(th)));
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final JavaOnlyMap mo21680a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                javaOnlyMap.put(next, mo21680a((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                javaOnlyMap.put(next, m24172a((JSONArray) opt));
            } else {
                javaOnlyMap.put(next, opt);
            }
        }
        return javaOnlyMap;
    }

    /* renamed from: a */
    public final JSONObject mo21681a(JavaOnlyMap javaOnlyMap) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (javaOnlyMap == null || javaOnlyMap.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return jSONObject;
        }
        ReadableMapKeySetIterator keySetIterator = javaOnlyMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Object obj = javaOnlyMap.get(nextKey);
            try {
                ReadableType type = javaOnlyMap.getType(nextKey);
                if (type != null) {
                    int i = C13451c.f32775a[type.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (obj != null) {
                                    jSONObject.put(nextKey, m24173a((Number) obj));
                                } else {
                                    throw new C89388w("null cannot be cast to non-null type");
                                }
                            }
                        } else if (obj != null) {
                            jSONObject.putOpt(nextKey, mo21681a((JavaOnlyMap) obj));
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else if (obj != null) {
                        jSONObject.putOpt(nextKey, m24174a((JavaOnlyArray) obj));
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                jSONObject.putOpt(nextKey, obj);
            } catch (Throwable th) {
                C13453e.m24177a("BridgeConverter", "revertJavaOnlyMap2JSONObject ".concat(String.valueOf(th)));
            }
        }
        return jSONObject;
    }
}
