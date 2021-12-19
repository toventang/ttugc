package com.bytedance.geckox.p1025l;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.statistic.C15035c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.geckox.l.a */
public final class C14967a {

    /* renamed from: a */
    final ConcurrentHashMap<Class<?>, Set<?>> f36558a;

    static {
        Covode.recordClassIndex(17080);
    }

    /* renamed from: com.bytedance.geckox.l.a$a */
    public static class C14968a {

        /* renamed from: a */
        public static C14967a f36559a = new C14967a((byte) 0);

        static {
            Covode.recordClassIndex(17081);
        }
    }

    private C14967a() {
        this.f36558a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C14967a(byte b) {
        this();
    }

    /* renamed from: a */
    public final <T> Set<T> mo24084a(Class<T> cls) {
        Throwable th;
        Set<T> set;
        Set<T> set2 = null;
        try {
            Set<?> set3 = this.f36558a.get(cls);
            if (set3 == null) {
                try {
                    set = new HashSet<>();
                } catch (Throwable th2) {
                    th = th2;
                    set2 = set3;
                }
            } else {
                set = set3;
            }
            Iterator it = ServiceLoader.load(cls, Looper.getMainLooper().getThread().getContextClassLoader()).iterator();
            while (it.hasNext()) {
                set.add((T) it.next());
            }
            this.f36558a.put(cls, set);
            return set;
        } catch (Throwable th3) {
            th = th3;
            C15035c.m27678a(1, 12, th.getMessage(), "");
            C14957a.m27543a("gecko service manager get services failed:" + th.getMessage());
            return set2;
        }
    }
}
