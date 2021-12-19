package com.bytedance.push.settings;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.settings.d */
public final class C21891d {
    static {
        Covode.recordClassIndex(25554);
    }

    /* renamed from: a */
    private static Boolean m41114a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() == 1) {
                return true;
            }
            if (num.intValue() == 0) {
                return false;
            }
            return null;
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            String str = (String) obj;
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return true;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return false;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m41115a(JSONObject jSONObject, String str) {
        Boolean a = m41114a(jSONObject.opt(str));
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }
}
