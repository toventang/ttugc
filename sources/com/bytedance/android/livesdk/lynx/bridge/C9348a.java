package com.bytedance.android.livesdk.lynx.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.bridge.a */
public final class C9348a {
    static {
        Covode.recordClassIndex(10853);
    }

    /* renamed from: a */
    private static WritableArray m17619a(JSONArray jSONArray) {
        C89219l.m154721d(jSONArray, "");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                javaOnlyArray.pushDouble(jSONArray.getDouble(i));
            } else if (obj instanceof Number) {
                javaOnlyArray.pushLong(jSONArray.getLong(i));
            } else if (obj instanceof String) {
                javaOnlyArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(jSONArray.getBoolean(i));
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C89219l.m154716b(jSONObject, "");
                javaOnlyArray.pushMap(m17620a(jSONObject));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                C89219l.m154716b(jSONArray2, "");
                javaOnlyArray.pushArray(m17619a(jSONArray2));
            } else if (C89219l.m154714a(obj, JSONObject.NULL)) {
                javaOnlyArray.pushNull();
            }
        }
        C89219l.m154716b(javaOnlyArray, "");
        return javaOnlyArray;
    }

    /* renamed from: a */
    public static final WritableMap m17620a(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            Objects.requireNonNull(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            Object obj = jSONObject.get(str);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                javaOnlyMap.putDouble(str, jSONObject.getDouble(str));
            } else if (obj instanceof Number) {
                javaOnlyMap.putLong(str, jSONObject.getLong(str));
            } else if (obj instanceof String) {
                javaOnlyMap.putString(str, jSONObject.getString(str));
            } else if (obj instanceof Boolean) {
                javaOnlyMap.putBoolean(str, jSONObject.getBoolean(str));
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                C89219l.m154716b(jSONObject2, "");
                javaOnlyMap.putMap(str, m17620a(jSONObject2));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                C89219l.m154716b(jSONArray, "");
                javaOnlyMap.putArray(str, m17619a(jSONArray));
            } else if (C89219l.m154714a(obj, JSONObject.NULL)) {
                javaOnlyMap.putNull(str);
            }
        }
        C89219l.m154716b(javaOnlyMap, "");
        return javaOnlyMap;
    }

    /* renamed from: a */
    private static JSONArray m17621a(ReadableArray readableArray) {
        C89219l.m154721d(readableArray, "");
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableType type = readableArray.getType(i);
            if (type != null) {
                switch (C9349b.f22822b[type.ordinal()]) {
                    case 1:
                        jSONArray.put(readableArray.getBoolean(i));
                        continue;
                    case 2:
                        try {
                            jSONArray.put(readableArray.getLong(i));
                            continue;
                        } catch (Exception unused) {
                            jSONArray.put(readableArray.getDouble(i));
                            break;
                        }
                    case 3:
                        jSONArray.put(readableArray.getString(i));
                        continue;
                    case 4:
                        ReadableMap map = readableArray.getMap(i);
                        C89219l.m154716b(map, "");
                        jSONArray.put(m17622a(map));
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ReadableArray array = readableArray.getArray(i);
                        C89219l.m154716b(array, "");
                        jSONArray.put(m17621a(array));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        jSONArray.put(readableArray.getInt(i));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        jSONArray.put(readableArray.getLong(i));
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        jSONArray.put(JSONObject.NULL);
                        continue;
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static final JSONObject m17622a(ReadableMap readableMap) {
        C89219l.m154721d(readableMap, "");
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            ReadableType type = readableMap.getType(nextKey);
            if (type != null) {
                switch (C9349b.f22821a[type.ordinal()]) {
                    case 1:
                        jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                        continue;
                    case 2:
                        try {
                            jSONObject.put(nextKey, readableMap.getLong(nextKey));
                            continue;
                        } catch (Exception unused) {
                            jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                            break;
                        }
                    case 3:
                        jSONObject.put(nextKey, readableMap.getString(nextKey));
                        continue;
                    case 4:
                        ReadableMap map = readableMap.getMap(nextKey);
                        C89219l.m154716b(map, "");
                        jSONObject.put(nextKey, m17622a(map));
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        ReadableArray array = readableMap.getArray(nextKey);
                        C89219l.m154716b(array, "");
                        jSONObject.put(nextKey, m17621a(array));
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        jSONObject.put(nextKey, JSONObject.NULL);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        jSONObject.put(nextKey, readableMap.getInt(nextKey));
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        jSONObject.put(nextKey, readableMap.getLong(nextKey));
                        continue;
                }
            }
        }
        return jSONObject;
    }
}
