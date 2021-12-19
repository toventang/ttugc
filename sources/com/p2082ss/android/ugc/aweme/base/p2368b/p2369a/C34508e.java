package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58900e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.e */
public final class C34508e {

    /* renamed from: a */
    public static Map<Class, Object> f81495a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41466);
    }

    /* renamed from: a */
    public static <T> T m70493a(Context context, Class<T> cls) {
        T t;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c) {
            if (applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (cls.isInterface() || !AbstractC58900e.class.equals(cls)) {
                return null;
            }
            t = (T) f81495a.get(cls);
            if (t == null && (t instanceof C34522s)) {
                return t;
            }
            T t2 = (T) new C34522s(applicationContext);
            f81495a.put(cls, t2);
            return t2;
        }
        if (applicationContext == null) {
            return null;
        }
        if (cls.isInterface()) {
            return null;
        }
        t = (T) f81495a.get(cls);
        if (t == null) {
        }
        T t22 = (T) new C34522s(applicationContext);
        f81495a.put(cls, t22);
        return t22;
    }
}
