package com.bytedance.android.livesdk.p452ao;

import android.content.SharedPreferences;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ao.c */
public final class C6806c {

    /* renamed from: a */
    protected static C27910f f17076a = C4139e.C4140a.f11575b;

    /* renamed from: b */
    private static SharedPreferences f17077b;

    /* renamed from: c */
    private static Map<String, Object> f17078c = new HashMap();

    static {
        Covode.recordClassIndex(7544);
    }

    /* renamed from: a */
    private static SharedPreferences m14600a() {
        if (f17077b == null) {
            f17077b = C34822d.m71158a(C3966y.m9669e(), "live_sdk_core", 4);
        }
        return f17077b;
    }

    /* renamed from: a */
    public static <T> T m14601a(C6800c<T> cVar) {
        if (f17078c.containsKey(cVar.f16860a)) {
            return (T) f17078c.get(cVar.f16860a);
        }
        if (cVar.f16863d == Boolean.class) {
            T t = (T) Boolean.valueOf(m14600a().getBoolean(cVar.f16860a, cVar.f16862c.booleanValue()));
            f17078c.put(cVar.f16860a, t);
            return t;
        } else if (cVar.f16863d == Integer.class || cVar.f16863d == Short.class) {
            T t2 = (T) Integer.valueOf(m14600a().getInt(cVar.f16860a, cVar.f16862c.intValue()));
            f17078c.put(cVar.f16860a, t2);
            return t2;
        } else if (cVar.f16863d == Float.class) {
            T t3 = (T) Float.valueOf(m14600a().getFloat(cVar.f16860a, cVar.f16862c.floatValue()));
            f17078c.put(cVar.f16860a, t3);
            return t3;
        } else if (cVar.f16863d == Long.class) {
            T t4 = (T) Long.valueOf(m14600a().getLong(cVar.f16860a, cVar.f16862c.longValue()));
            f17078c.put(cVar.f16860a, t4);
            return t4;
        } else if (cVar.f16863d == Double.class) {
            T t5 = (T) Double.valueOf(m14599a(cVar.f16860a, cVar.f16862c.doubleValue()));
            f17078c.put(cVar.f16860a, t5);
            return t5;
        } else if (cVar.f16863d != String.class) {
            return (T) m14602a(cVar.f16860a, cVar.f16863d, cVar.f16862c);
        } else {
            T t6 = (T) m14600a().getString(cVar.f16860a, cVar.f16862c);
            if (t6 == null) {
                f17078c.remove(cVar.f16860a);
            } else {
                f17078c.put(cVar.f16860a, t6);
            }
            return t6;
        }
    }

    /* renamed from: a */
    private static double m14599a(String str, double d) {
        try {
            return Double.parseDouble(m14600a().getString(str, String.valueOf(d)));
        } catch (Exception e) {
            e.printStackTrace();
            return d;
        }
    }

    /* renamed from: a */
    public static <T> void m14603a(C6800c cVar, T t) {
        if (t == null) {
            f17078c.remove(cVar.f16860a);
            m14600a().edit().remove(cVar.f16860a).apply();
            return;
        }
        f17078c.put(cVar.f16860a, t);
        if (cVar.f16863d == Boolean.class) {
            m14600a().edit().putBoolean(cVar.f16860a, t.booleanValue()).apply();
        } else if (cVar.f16863d == Integer.class) {
            m14600a().edit().putInt(cVar.f16860a, t.intValue()).apply();
        } else if (cVar.f16863d == Float.class) {
            m14600a().edit().putFloat(cVar.f16860a, t.floatValue()).apply();
        } else if (cVar.f16863d == Long.class) {
            m14600a().edit().putLong(cVar.f16860a, t.longValue()).apply();
        } else if (cVar.f16863d == Double.class) {
            m14600a().edit().putString(cVar.f16860a, t.toString()).apply();
        } else if (cVar.f16863d == String.class) {
            m14600a().edit().putString(cVar.f16860a, t).apply();
        } else {
            m14600a().edit().putString(cVar.f16860a, f17076a.mo46674b(t)).apply();
        }
    }

    /* renamed from: a */
    private static <T> T m14602a(String str, Class<T> cls, T t) {
        try {
            if (f17078c.containsKey(str)) {
                return (T) f17078c.get(str);
            }
            T t2 = (T) f17076a.mo46670a(m14600a().getString(str, ""), (Class) cls);
            if (t2 == null) {
                f17078c.remove(str);
            } else {
                f17078c.put(str, t2);
            }
            return t2;
        } catch (Exception e) {
            e.printStackTrace();
            f17078c.remove(str);
            return t;
        }
    }
}
