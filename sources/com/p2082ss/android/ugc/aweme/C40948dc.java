package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.AbstractC32080t;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34509f;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34514k;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.ugc.aweme.dc */
public final class C40948dc {
    static {
        Covode.recordClassIndex(48800);
    }

    /* renamed from: a */
    public static <T> T m82454a(Context context, Class<T> cls) {
        T t;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c) {
            if (applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (cls.isInterface() || !AbstractC32080t.class.equals(cls)) {
                return null;
            }
            t = (T) C34509f.f81496a.get(cls);
            if (t == null && (t instanceof C34514k)) {
                return t;
            }
            T t2 = (T) new C34514k(applicationContext);
            C34509f.f81496a.put(cls, t2);
            return t2;
        }
        if (applicationContext == null) {
            return null;
        }
        if (cls.isInterface()) {
            return null;
        }
        t = (T) C34509f.f81496a.get(cls);
        if (t == null) {
        }
        T t22 = (T) new C34514k(applicationContext);
        C34509f.f81496a.put(cls, t22);
        return t22;
    }
}
