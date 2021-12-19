package com.bytedance.android.livesdk.p450an;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.an.c */
public class C6800c<T> {

    /* renamed from: a */
    public String f16860a;

    /* renamed from: b */
    public String f16861b;

    /* renamed from: c */
    public T f16862c;

    /* renamed from: d */
    public Class<T> f16863d;

    static {
        Covode.recordClassIndex(7538);
    }

    /* renamed from: a */
    public T mo13066a() {
        return (T) C6801d.m14589a(this);
    }

    /* renamed from: a */
    public void mo13067a(T t) {
        String str = this.f16861b;
        if (t == null) {
            C6801d.m14588a(str).edit().remove(this.f16860a).apply();
            return;
        }
        Class<T> cls = this.f16863d;
        if (cls == Boolean.class) {
            C6801d.m14588a(str).edit().putBoolean(this.f16860a, t.booleanValue()).apply();
        } else if (cls == Integer.class) {
            C6801d.m14588a(str).edit().putInt(this.f16860a, t.intValue()).apply();
        } else if (cls == Float.class) {
            C6801d.m14588a(str).edit().putFloat(this.f16860a, t.floatValue()).apply();
        } else if (cls == Long.class) {
            C6801d.m14588a(str).edit().putLong(this.f16860a, t.longValue()).apply();
        } else if (cls == Double.class) {
            C6801d.m14588a(str).edit().putString(this.f16860a, String.valueOf(t.doubleValue())).apply();
        } else if (cls == String.class) {
            C6801d.m14588a(str).edit().putString(this.f16860a, t).apply();
        } else {
            Map<String, Object> map = C6801d.f16864a.get(str);
            if (map != null) {
                map.put(this.f16860a, t);
            }
            C6801d.m14588a(str).edit().putString(this.f16860a, C6801d.f16865b.mo46674b(t)).apply();
        }
    }

    public C6800c(String str, Class<T> cls) {
        this("tt_live_sdk", str, cls, null);
    }

    public C6800c(String str, T t) {
        this("tt_live_sdk", str, t.getClass(), t);
    }

    public C6800c(String str, String str2, T t) {
        this(str, str2, t.getClass(), t);
    }

    private C6800c(String str, String str2, Class<T> cls, T t) {
        this.f16861b = str;
        this.f16860a = str2;
        this.f16862c = t;
        this.f16863d = cls;
        if (t != null) {
            return;
        }
        if (cls == Integer.class || cls == Short.class) {
            this.f16862c = (T) 0;
        } else if (cls == Long.class) {
            this.f16862c = (T) 0L;
        } else if (cls == Double.class) {
            this.f16862c = (T) Double.valueOf(0.0d);
        } else if (cls == Float.class) {
            this.f16862c = (T) Float.valueOf(0.0f);
        } else if (cls == Boolean.class) {
            this.f16862c = (T) false;
        }
    }
}
