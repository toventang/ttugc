package com.bytedance.android.livesdk.p450an;

import android.content.SharedPreferences;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.an.d */
public final class C6801d {

    /* renamed from: a */
    static Map<String, Map<String, Object>> f16864a = new HashMap();

    /* renamed from: b */
    static C27910f f16865b = C4139e.C4140a.f11575b;

    /* renamed from: a */
    private static boolean m14592a(String str, String str2, boolean z) {
        return m14588a(str).getBoolean(str2, z);
    }

    static {
        Covode.recordClassIndex(7539);
    }

    /* renamed from: a */
    static SharedPreferences m14588a(String str) {
        return C34822d.m71158a(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), str, 0);
    }

    /* renamed from: a */
    public static <T> T m14589a(C6800c<T> cVar) {
        return cVar.f16863d == Boolean.class ? (T) Boolean.valueOf(m14592a(cVar.f16861b, cVar.f16860a, cVar.f16862c.booleanValue())) : (cVar.f16863d == Integer.class || cVar.f16863d == Short.class) ? (T) Integer.valueOf(m14586a(cVar.f16861b, cVar.f16860a, cVar.f16862c.intValue())) : cVar.f16863d == Float.class ? (T) Float.valueOf(m14585a(cVar.f16861b, cVar.f16860a, cVar.f16862c.floatValue())) : cVar.f16863d == Long.class ? (T) Long.valueOf(m14587a(cVar.f16861b, cVar.f16860a, cVar.f16862c.longValue())) : cVar.f16863d == Double.class ? (T) Double.valueOf(m14584a(cVar.f16861b, cVar.f16860a, cVar.f16862c.doubleValue())) : cVar.f16863d == String.class ? (T) m14591a(cVar.f16861b, cVar.f16860a, cVar.f16862c) : (T) m14590a(cVar.f16861b, cVar.f16860a, cVar.f16863d, cVar.f16862c);
    }

    /* renamed from: a */
    private static float m14585a(String str, String str2, float f) {
        return m14588a(str).getFloat(str2, f);
    }

    /* renamed from: a */
    private static double m14584a(String str, String str2, double d) {
        try {
            return Double.parseDouble(m14588a(str).getString(str2, String.valueOf(d)));
        } catch (Exception e) {
            e.printStackTrace();
            return d;
        }
    }

    /* renamed from: a */
    private static int m14586a(String str, String str2, int i) {
        return m14588a(str).getInt(str2, i);
    }

    /* renamed from: a */
    private static long m14587a(String str, String str2, long j) {
        return m14588a(str).getLong(str2, j);
    }

    /* renamed from: a */
    private static String m14591a(String str, String str2, String str3) {
        return m14588a(str).getString(str2, str3);
    }

    /* renamed from: a */
    private static <T> T m14590a(String str, String str2, Class<T> cls, T t) {
        Map<String, Object> map = f16864a.get(str);
        if (map == null) {
            map = new HashMap<>();
            f16864a.put(str, map);
        }
        try {
            if (map.containsKey(str2)) {
                return (T) map.get(str2);
            }
            T t2 = (T) f16865b.mo46670a(m14588a(str).getString(str2, ""), (Class) cls);
            if (t2 == null) {
                map.remove(str2);
                return t;
            }
            map.put(str2, t2);
            return t2;
        } catch (Exception unused) {
            map.remove(str2);
            return t;
        }
    }
}
