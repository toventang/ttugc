package com.p2082ss.android.ugc.aweme.net.cache;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.cache.a */
public final class C61313a {

    /* renamed from: a */
    public static C61328j f139251a;

    /* renamed from: b */
    static C61323h f139252b;

    /* renamed from: c */
    static final AtomicInteger f139253c = new AtomicInteger(0);

    /* renamed from: d */
    static final HashSet<String> f139254d = new HashSet<>();

    /* renamed from: e */
    static final ConcurrentHashMap<String, C61317c> f139255e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final C61313a f139256f = new C61313a();

    /* renamed from: g */
    private static AtomicInteger f139257g = new AtomicInteger(0);

    /* renamed from: h */
    private static final HashSet<String> f139258h = new HashSet<>();

    /* renamed from: i */
    private static final ConcurrentHashMap<String, C61317c> f139259i = new ConcurrentHashMap<>();

    private C61313a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.net.cache.a$a */
    static final class C61314a extends AbstractC89220m implements AbstractC89171a<C22028c> {

        /* renamed from: a */
        final /* synthetic */ Request f139260a;

        static {
            Covode.recordClassIndex(71945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61314a(Request request) {
            super(0);
            this.f139260a = request;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C22028c invoke() {
            C61323h hVar = C61313a.f139252b;
            if (hVar != null) {
                return hVar.mo98945a(this.f139260a);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.cache.a$b */
    static final class C61315b extends AbstractC89220m implements AbstractC89171a<C22099u<?>> {

        /* renamed from: a */
        final /* synthetic */ Request f139261a;

        static {
            Covode.recordClassIndex(71946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61315b(Request request) {
            super(0);
            this.f139261a = request;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C22099u<?> invoke() {
            C61328j jVar = C61313a.f139251a;
            if (jVar != null) {
                return jVar.mo98946a(this.f139261a);
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(71944);
    }

    /* renamed from: a */
    public static C22099u<?> m110996a(Request request) {
        C89219l.m154721d(request, "");
        if (f139251a == null || !C61316b.m111004c(request)) {
            return null;
        }
        f139253c.incrementAndGet();
        return (C22099u) m110997a(C61316b.m111006e(request), f139258h, f139259i, new C61315b(request));
    }

    /* renamed from: a */
    public static void m110998a(Request request, C22099u<?> uVar) {
        String str;
        MethodCollector.m26663i(11431);
        C89219l.m154721d(request, "");
        C89219l.m154721d(uVar, "");
        C61328j jVar = f139251a;
        if (jVar == null) {
            MethodCollector.m26664o(11431);
            return;
        }
        C89219l.m154721d(request, "");
        C89219l.m154721d(uVar, "");
        if (C61316b.m111004c(request) && uVar.f52261a.mo35845a()) {
            C61318d b = C61316b.m111003b(request);
            if (b != null) {
                String e = C61316b.m111006e(request);
                String str2 = b.f139265a;
                if (str2 == null || str2.length() == 0) {
                    str = request.getPath();
                } else {
                    str = b.f139265a;
                }
                if (str != null) {
                    synchronized (jVar.f139286a) {
                        try {
                            C0490e<String, C61320e> a = jVar.f139286a.mo2091a(str);
                            if (a == null) {
                                a = new C0490e<>(b.f139266b);
                                jVar.f139286a.mo2092a(str, a);
                            }
                            a.mo2092a(e, new C61320e(uVar));
                        } catch (Throwable th) {
                            MethodCollector.m26664o(11431);
                            throw th;
                        }
                    }
                }
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.".toString());
                MethodCollector.m26664o(11431);
                throw illegalArgumentException;
            }
        }
        m110999a(C61316b.m111006e(request), f139258h, f139259i);
        MethodCollector.m26664o(11431);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012b, code lost:
        p4600h.p4610e.C89146c.m154636a(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0132, code lost:
        p4600h.p4610e.C89146c.m154636a(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0135, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.retrofit2.client.C22028c m110995a(com.bytedance.retrofit2.client.Request r11, com.bytedance.retrofit2.client.C22028c r12) {
        /*
        // Method dump skipped, instructions count: 330
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.net.cache.C61313a.m110995a(com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.client.c):com.bytedance.retrofit2.client.c");
    }

    /* renamed from: a */
    private static void m110999a(String str, HashSet<String> hashSet, ConcurrentHashMap<String, C61317c> concurrentHashMap) {
        MethodCollector.m26663i(11606);
        synchronized (hashSet) {
            try {
                hashSet.remove(str);
            } catch (Throwable th) {
                MethodCollector.m26664o(11606);
                throw th;
            }
        }
        C61317c cVar = concurrentHashMap.get(str);
        if (cVar != null) {
            cVar.mo98941a();
        }
        concurrentHashMap.remove(str);
        MethodCollector.m26664o(11606);
    }

    /* renamed from: a */
    static <T> T m110997a(String str, HashSet<String> hashSet, ConcurrentHashMap<String, C61317c> concurrentHashMap, AbstractC89171a<? extends T> aVar) {
        C61317c cVar;
        MethodCollector.m26663i(11433);
        synchronized (hashSet) {
            try {
                if (hashSet.contains(str)) {
                    cVar = concurrentHashMap.get(str);
                    if (cVar == null) {
                        cVar = new C61317c();
                        concurrentHashMap.put(str, cVar);
                    }
                } else {
                    cVar = null;
                }
            } finally {
                MethodCollector.m26664o(11433);
            }
        }
        if (cVar != null) {
            ReentrantLock reentrantLock = cVar.f139262a;
            reentrantLock.lock();
            try {
                cVar.f139263b.await();
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                MethodCollector.m26664o(11433);
                throw th;
            }
        }
        T t = (T) aVar.invoke();
        if (t == null) {
            synchronized (hashSet) {
                try {
                    hashSet.add(str);
                } finally {
                    MethodCollector.m26664o(11433);
                }
            }
        } else {
            f139257g.incrementAndGet();
        }
        return t;
    }
}
