package com.p2082ss.android.ugc.aweme.components;

import com.bytedance.covode.number.Covode;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.components.b */
public final class C40161b {
    static {
        Covode.recordClassIndex(47947);
    }

    /* renamed from: a */
    public static WritableMap m81241a(Map<String, Object> map) {
        WritableMap createMap = Arguments.createMap();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            Object value = next.getValue();
            if (value == null) {
                createMap.putNull(next.getKey());
            } else if (value instanceof Boolean) {
                createMap.putBoolean(next.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                createMap.putDouble(next.getKey(), ((Double) value).doubleValue());
            } else if (value instanceof Integer) {
                createMap.putInt(next.getKey(), ((Integer) value).intValue());
            } else if (value instanceof String) {
                createMap.putString(next.getKey(), (String) value);
            } else if (value instanceof Map) {
                createMap.putMap(next.getKey(), m81241a((Map) value));
            } else if (value.getClass() != null && value.getClass().isArray()) {
                createMap.putArray(next.getKey(), C40160a.m81240a((Object[]) value));
            }
            it.remove();
        }
        return createMap;
    }
}
