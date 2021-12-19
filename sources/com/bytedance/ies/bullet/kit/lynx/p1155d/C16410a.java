package com.bytedance.ies.bullet.kit.lynx.p1155d;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.jsbridge.C28355a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.lynx.d.a */
public final class C16410a {

    /* renamed from: a */
    public static final C16410a f39406a = new C16410a();

    private C16410a() {
    }

    /* renamed from: a */
    public final JSONObject mo26043a(ReadableMap readableMap) {
        C89219l.m154719c(readableMap, "");
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            ReadableType type = readableMap.getType(nextKey);
            if (type != null) {
                switch (C16411b.f39407a[type.ordinal()]) {
                    case 1:
                        jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                        continue;
                    case 2:
                        C89219l.m154709a((Object) nextKey, "");
                        Number a = m30458a(readableMap, nextKey);
                        if (!(a instanceof Double)) {
                            if (!(a instanceof Long)) {
                                if (!(a instanceof Integer)) {
                                    break;
                                } else {
                                    jSONObject.put(nextKey, a.intValue());
                                    break;
                                }
                            } else {
                                jSONObject.put(nextKey, a.longValue());
                                break;
                            }
                        } else {
                            jSONObject.put(nextKey, a.doubleValue());
                            continue;
                        }
                    case 3:
                        jSONObject.put(nextKey, readableMap.getLong(nextKey));
                        continue;
                    case 4:
                        jSONObject.put(nextKey, readableMap.getString(nextKey));
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ReadableMap map = readableMap.getMap(nextKey);
                        C89219l.m154709a((Object) map, "");
                        jSONObject.put(nextKey, mo26043a(map));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        ReadableArray array = readableMap.getArray(nextKey);
                        C89219l.m154709a((Object) array, "");
                        jSONObject.put(nextKey, mo26042a(array));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        jSONObject.put(nextKey, JSONObject.NULL);
                        continue;
                }
            }
        }
        return jSONObject;
    }

    static {
        Covode.recordClassIndex(18713);
    }

    /* renamed from: a */
    private WritableArray m30456a(JSONArray jSONArray) {
        C89219l.m154719c(jSONArray, "");
        WritableArray a = C28355a.m56661a();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                a.pushDouble(jSONArray.getDouble(i));
            } else if (obj instanceof Long) {
                a.pushDouble((double) jSONArray.getLong(i));
            } else if (obj instanceof Number) {
                a.pushInt(jSONArray.getInt(i));
            } else if (obj instanceof String) {
                a.pushString(jSONArray.getString(i));
            } else if (obj instanceof Boolean) {
                a.pushBoolean(jSONArray.getBoolean(i));
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C89219l.m154709a((Object) jSONObject, "");
                a.pushMap(mo26041a(jSONObject));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                C89219l.m154709a((Object) jSONArray2, "");
                a.pushArray(m30456a(jSONArray2));
            } else if (C89219l.m154714a(obj, JSONObject.NULL)) {
                a.pushNull();
            }
        }
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* renamed from: a */
    public final WritableMap mo26041a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        WritableMap b = C28355a.m56665b();
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154709a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                String str = next;
                Object obj = jSONObject.get(str);
                if ((obj instanceof Float) || (obj instanceof Double)) {
                    b.putDouble(str, jSONObject.getDouble(str));
                } else if (obj instanceof Long) {
                    b.putDouble(str, (double) jSONObject.getLong(str));
                } else if (obj instanceof Number) {
                    b.putInt(str, jSONObject.getInt(str));
                } else if (obj instanceof String) {
                    b.putString(str, jSONObject.getString(str));
                } else if (obj instanceof Boolean) {
                    b.putBoolean(str, jSONObject.getBoolean(str));
                } else if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    C89219l.m154709a((Object) jSONObject2, "");
                    b.putMap(str, mo26041a(jSONObject2));
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    C89219l.m154709a((Object) jSONArray, "");
                    b.putArray(str, m30456a(jSONArray));
                } else if (C89219l.m154714a(obj, JSONObject.NULL)) {
                    b.putNull(str);
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        C89219l.m154709a((Object) b, "");
        return b;
    }

    /* renamed from: a */
    public final JSONArray mo26042a(ReadableArray readableArray) {
        C89219l.m154719c(readableArray, "");
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableType type = readableArray.getType(i);
            if (type != null) {
                switch (C16411b.f39408b[type.ordinal()]) {
                    case 1:
                        jSONArray.put(readableArray.getBoolean(i));
                        continue;
                    case 2:
                        Number a = m30457a(readableArray, i);
                        if (!(a instanceof Double)) {
                            if (!(a instanceof Long)) {
                                if (a instanceof Integer) {
                                    jSONArray.put(a.intValue());
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                jSONArray.put(a.longValue());
                                break;
                            }
                        } else {
                            jSONArray.put(a.doubleValue());
                            continue;
                        }
                    case 3:
                        jSONArray.put(readableArray.getLong(i));
                        continue;
                    case 4:
                        jSONArray.put(readableArray.getString(i));
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ReadableMap map = readableArray.getMap(i);
                        C89219l.m154709a((Object) map, "");
                        jSONArray.put(mo26043a(map));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        ReadableArray array = readableArray.getArray(i);
                        C89219l.m154709a((Object) array, "");
                        jSONArray.put(mo26042a(array));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        jSONArray.put(JSONObject.NULL);
                        continue;
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static Number m30457a(ReadableArray readableArray, int i) {
        Object obj;
        int i2;
        Object obj2;
        double d;
        try {
            obj = C89379q.m157068constructorimpl(Integer.valueOf(readableArray.getInt(i)));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        Double d2 = null;
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        try {
            obj2 = C89379q.m157068constructorimpl(Double.valueOf(readableArray.getDouble(i)));
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
        if (Double.compare((double) i2, d) == 0) {
            return Integer.valueOf(i2);
        }
        long j = (long) d;
        if (Double.compare(d, (double) j) == 0) {
            return Long.valueOf(j);
        }
        return Double.valueOf(d);
    }

    /* renamed from: a */
    private static Number m30458a(ReadableMap readableMap, String str) {
        Object obj;
        int i;
        Object obj2;
        double d;
        try {
            obj = C89379q.m157068constructorimpl(Integer.valueOf(readableMap.getInt(str)));
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
            obj2 = C89379q.m157068constructorimpl(Double.valueOf(readableMap.getDouble(str)));
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
}
