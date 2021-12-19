package com.bytedance.common.utility;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.utility.m */
public final class C13627m {
    static {
        Covode.recordClassIndex(15654);
    }

    /* renamed from: a */
    public static boolean m24498a(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m24496a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (!m24498a(str) && !m24498a(str2)) {
                    jSONObject.put(str, str2);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m24500b(String str) {
        if (m24498a(str)) {
            return str;
        }
        try {
            str = str.replace("[ss_random]", String.valueOf(new Random().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: c */
    public static String m24501c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C13607d.m24440a(bytes, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m24502d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] a = C13607d.m24441a(str);
            for (int i = 0; i < a.length; i++) {
                a[i] = (byte) (a[i] ^ 5);
            }
            return new String(a, 0, a.length, "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static boolean m24499a(String str, String str2) {
        if (m24498a(str) && m24498a(str2)) {
            return true;
        }
        if (str == null || !str.equals(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Map<String, String> m24497a(String str, Map<String, String> map) {
        if (m24498a(str) || map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (!m24498a(next) && !m24498a(string)) {
                    map.put(next, string);
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }
}
