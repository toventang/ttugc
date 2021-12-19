package com.bytedance.ies.xbridge.platform.lynx.p1355a;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.lynx.a.d */
public final class C18837d {

    /* renamed from: a */
    public static final C18837d f44645a = new C18837d();

    private C18837d() {
    }

    static {
        Covode.recordClassIndex(21534);
    }

    /* renamed from: a */
    private static WritableArray m34972a(JSONArray jSONArray) {
        C89219l.m154719c(jSONArray, "");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                javaOnlyArray.pushMap(m34973a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyArray.pushArray(m34972a((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyArray.pushDouble((double) ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyArray.pushDouble((double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyArray.pushString((String) obj);
            } else {
                javaOnlyArray.pushString(obj.toString());
            }
        }
        return javaOnlyArray;
    }

    /* renamed from: a */
    public static final WritableMap m34973a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C89219l.m154709a((Object) next, "");
            String str = next;
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                javaOnlyMap.putMap(str, m34973a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyMap.putArray(str, m34972a((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyMap.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyMap.putDouble(str, (double) ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyMap.putDouble(str, (double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyMap.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyMap.putString(str, (String) obj);
            } else {
                javaOnlyMap.putString(str, obj.toString());
            }
        }
        return javaOnlyMap;
    }
}
