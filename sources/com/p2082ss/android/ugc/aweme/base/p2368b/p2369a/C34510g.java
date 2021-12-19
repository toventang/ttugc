package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61566a;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61567b;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61568c;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.g */
public final class C34510g {

    /* renamed from: a */
    public static Map<Class, Object> f81497a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41468);
    }

    /* renamed from: a */
    public static <T> T m70494a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c) {
            if (applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (cls == null && cls.isInterface()) {
                if (AbstractC61566a.class.equals(cls)) {
                    T t = (T) f81497a.get(cls);
                    if (t != null && (t instanceof C34525v)) {
                        return t;
                    }
                    T t2 = (T) new C34525v(applicationContext);
                    f81497a.put(cls, t2);
                    return t2;
                } else if (AbstractC61567b.class.equals(cls)) {
                    T t3 = (T) f81497a.get(cls);
                    if (t3 != null && (t3 instanceof C34526w)) {
                        return t3;
                    }
                    T t4 = (T) new C34526w(applicationContext);
                    f81497a.put(cls, t4);
                    return t4;
                } else if (AbstractC61571e.class.equals(cls)) {
                    T t5 = (T) f81497a.get(cls);
                    if (t5 != null && (t5 instanceof C34528y)) {
                        return t5;
                    }
                    T t6 = (T) new C34528y(applicationContext);
                    f81497a.put(cls, t6);
                    return t6;
                } else if (!AbstractC61568c.class.equals(cls)) {
                    return null;
                } else {
                    T t7 = (T) f81497a.get(cls);
                    if (t7 != null && (t7 instanceof C34527x)) {
                        return t7;
                    }
                    T t8 = (T) new C34527x(applicationContext);
                    f81497a.put(cls, t8);
                    return t8;
                }
            }
        }
        if (applicationContext == null) {
            return null;
        }
        return cls == null ? null : null;
    }
}
