package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51435a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.b */
public final class C34505b {

    /* renamed from: a */
    public static Map<Class, Object> f81492a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41463);
    }

    /* renamed from: a */
    public static <T> T m70490a(Context context, Class<T> cls) {
        T t;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c) {
            if (applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (cls.isInterface() || !AbstractC51435a.class.equals(cls)) {
                return null;
            }
            t = (T) f81492a.get(cls);
            if (t == null && (t instanceof C34518o)) {
                return t;
            }
            T t2 = (T) new C34518o(applicationContext);
            f81492a.put(cls, t2);
            return t2;
        }
        if (applicationContext == null) {
            return null;
        }
        if (cls.isInterface()) {
            return null;
        }
        t = (T) f81492a.get(cls);
        if (t == null) {
        }
        T t22 = (T) new C34518o(applicationContext);
        f81492a.put(cls, t22);
        return t22;
    }
}
