package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59040ay;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.c */
public final class C34506c {

    /* renamed from: a */
    public static Map<Class, Object> f81493a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41464);
    }

    /* renamed from: a */
    public static <T> T m70491a(Context context, Class<T> cls) {
        T t;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c) {
            if (applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (cls.isInterface() || !AbstractC59040ay.class.equals(cls)) {
                return null;
            }
            t = (T) f81493a.get(cls);
            if (t == null && (t instanceof C34523t)) {
                return t;
            }
            T t2 = (T) new C34523t(applicationContext);
            f81493a.put(cls, t2);
            return t2;
        }
        if (applicationContext == null) {
            return null;
        }
        if (cls.isInterface()) {
            return null;
        }
        t = (T) f81493a.get(cls);
        if (t == null) {
        }
        T t22 = (T) new C34523t(applicationContext);
        f81493a.put(cls, t22);
        return t22;
    }
}
