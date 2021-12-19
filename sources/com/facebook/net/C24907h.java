package com.facebook.net;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p2082ss.p2083a.p2084a.AbstractC29335a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.net.h */
public class C24907h {

    /* renamed from: d */
    private static volatile C24907h f59128d;

    /* renamed from: a */
    public volatile ArrayList<Integer> f59129a;

    /* renamed from: b */
    public volatile ArrayList<Integer> f59130b;

    /* renamed from: c */
    public volatile int f59131c;

    /* renamed from: e */
    private final int f59132e = 1;

    /* renamed from: f */
    private final int f59133f = 2;

    /* renamed from: g */
    private volatile boolean f59134g;

    /* renamed from: h */
    private volatile HashMap<String, C22092q> f59135h;

    /* renamed from: i */
    private volatile List<AbstractC22021a> f59136i;

    static {
        Covode.recordClassIndex(29100);
    }

    private C24907h() {
    }

    /* renamed from: b */
    public final synchronized boolean mo40785b() {
        boolean z;
        MethodCollector.m26663i(6219);
        z = this.f59134g;
        MethodCollector.m26664o(6219);
        return z;
    }

    /* renamed from: a */
    public static C24907h m47742a() {
        MethodCollector.m26663i(6072);
        if (f59128d == null) {
            synchronized (C24907h.class) {
                try {
                    if (f59128d == null) {
                        f59128d = new C24907h();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6072);
                    throw th;
                }
            }
        }
        C24907h hVar = f59128d;
        MethodCollector.m26664o(6072);
        return hVar;
    }

    /* renamed from: com.facebook.net.h$a */
    public static class C24908a extends Exception {

        /* renamed from: e */
        public final Exception f59137e;
        public final int retryCount;

        static {
            Covode.recordClassIndex(29101);
        }

        public C24908a(Exception exc, int i) {
            this.f59137e = exc;
            this.retryCount = i;
        }
    }

    /* renamed from: a */
    public final <S> S mo40784a(String str, Class<S> cls) {
        List<AbstractC22021a> list = null;
        if (!mo40785b()) {
            AbstractC29335a.m58736d("RetryInterceptManager", "[getRetrofitService] is closed");
            return null;
        } else if (C13627m.m24498a(str)) {
            return null;
        } else {
            C22092q qVar = this.f59135h.get(str);
            if (qVar == null) {
                if (mo40785b()) {
                    list = this.f59136i;
                }
                qVar = RetrofitUtils.m43289b(str, list);
            }
            return (S) RetrofitUtils.m43280a(qVar, cls);
        }
    }
}
