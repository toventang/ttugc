package com.lynx.jsbridge;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.jsbridge.a */
public class C28355a {
    static {
        Covode.recordClassIndex(34330);
    }

    /* renamed from: a */
    public static WritableArray m56661a() {
        return new JavaOnlyArray();
    }

    /* renamed from: b */
    public static WritableMap m56665b() {
        return new JavaOnlyMap();
    }

    /* renamed from: a */
    public static JavaOnlyMap m56660a(Map<String, Object> map) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (map == null) {
            return javaOnlyMap;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m56664a(javaOnlyMap, entry.getKey(), entry.getValue());
        }
        return javaOnlyMap;
    }

    /* renamed from: a */
    private static Object m56663a(final Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj.getClass().isArray()) {
            return m56659a((List) new AbstractList() {
                /* class com.lynx.jsbridge.C28355a.C283561 */

                static {
                    Covode.recordClassIndex(34331);
                }

                public final int size() {
                    return Array.getLength(obj);
                }

                @Override // java.util.List, java.util.AbstractList
                public final Object get(int i) {
                    return Array.get(obj, i);
                }
            });
        }
        if (obj instanceof List) {
            return m56659a((List) obj);
        }
        if (obj instanceof Map) {
            return m56660a((Map<String, Object>) ((Map) obj));
        }
        if (!(obj instanceof Bundle)) {
            return obj;
        }
        Bundle bundle = (Bundle) obj;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                m56664a(javaOnlyMap, str, m56662a(bundle, str));
            }
        }
        return javaOnlyMap;
    }

    /* renamed from: a */
    private static JavaOnlyArray m56659a(List list) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (list == null) {
            return javaOnlyArray;
        }
        for (Object obj : list) {
            Object a = m56663a(obj);
            if (a == null) {
                javaOnlyArray.pushNull();
            } else if (a instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) a).booleanValue());
            } else if (a instanceof Integer) {
                javaOnlyArray.pushInt(((Integer) a).intValue());
            } else if (a instanceof Double) {
                javaOnlyArray.pushDouble(((Double) a).doubleValue());
            } else if (a instanceof String) {
                javaOnlyArray.pushString((String) a);
            } else if (a instanceof JavaOnlyArray) {
                javaOnlyArray.pushArray((JavaOnlyArray) a);
            } else if (a instanceof JavaOnlyMap) {
                javaOnlyArray.pushMap((JavaOnlyMap) a);
            } else {
                throw new IllegalArgumentException("Could not convert " + a.getClass());
            }
        }
        return javaOnlyArray;
    }

    /* renamed from: a */
    private static Object m56662a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m56664a(JavaOnlyMap javaOnlyMap, String str, Object obj) {
        Object a = m56663a(obj);
        if (a == null) {
            javaOnlyMap.putNull(str);
        } else if (a instanceof Boolean) {
            javaOnlyMap.putBoolean(str, ((Boolean) a).booleanValue());
        } else if (a instanceof Integer) {
            javaOnlyMap.putInt(str, ((Integer) a).intValue());
        } else if (a instanceof Number) {
            javaOnlyMap.putDouble(str, ((Number) a).doubleValue());
        } else if (a instanceof String) {
            javaOnlyMap.putString(str, (String) a);
        } else if (a instanceof JavaOnlyArray) {
            javaOnlyMap.putArray(str, (JavaOnlyArray) a);
        } else if (a instanceof JavaOnlyMap) {
            javaOnlyMap.putMap(str, (JavaOnlyMap) a);
        } else {
            throw new IllegalArgumentException("Could not convert " + a.getClass());
        }
    }
}
