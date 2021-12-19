package com.p2082ss.android.ugc.aweme.net.preload;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.bytedance.retrofit2.C22099u;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.preload.a */
public final class C61454a {

    /* renamed from: a */
    public static final HashSet<String> f139506a = new HashSet<>();

    /* renamed from: b */
    public static C61455a f139507b;

    /* renamed from: c */
    public static final C61454a f139508c = new C61454a();

    /* renamed from: d */
    private static final String f139509d = "PowerPreload-CacheA";

    /* renamed from: e */
    private static final ConcurrentHashMap<String, C61459c> f139510e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final AtomicInteger f139511f = new AtomicInteger(0);

    /* renamed from: g */
    private static AtomicInteger f139512g = new AtomicInteger(0);

    /* renamed from: com.ss.android.ugc.aweme.net.preload.a$a */
    public static final class C61455a {

        /* renamed from: c */
        public static final C61456a f139513c = new C61456a((byte) 0);

        /* renamed from: a */
        public final C0490e<String, C61461e> f139514a = new C0490e<>(this.f139515b);

        /* renamed from: b */
        public int f139515b = 16;

        static {
            Covode.recordClassIndex(72111);
        }

        /* renamed from: com.ss.android.ugc.aweme.net.preload.a$a$a */
        public static final class C61456a {
            static {
                Covode.recordClassIndex(72112);
            }

            private C61456a() {
            }

            public /* synthetic */ C61456a(byte b) {
                this();
            }
        }

        /* renamed from: c */
        private void m111305c(String str) {
            C89219l.m154721d(str, "");
            this.f139514a.mo2097b(str);
        }

        /* renamed from: b */
        static String m111304b(String str) {
            if (!C89361p.m154874b(str, "/", false)) {
                str = "/".concat(String.valueOf(str));
            }
            if (C89361p.m154876c(str, "/", false)) {
                return str;
            }
            return str + '/';
        }

        /* renamed from: a */
        public final C22099u<?> mo99129a(String str) {
            C61461e a;
            C17794i iVar;
            MethodCollector.m26663i(9149);
            if (str == null) {
                MethodCollector.m26664o(9149);
                return null;
            } else if (this.f139514a.mo2095b() == 0) {
                MethodCollector.m26664o(9149);
                return null;
            } else {
                synchronized (this.f139514a) {
                    try {
                        a = this.f139514a.mo2091a(str);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(9149);
                        throw th;
                    }
                }
                if (a == null) {
                    MethodCollector.m26664o(9149);
                    return null;
                } else if (Math.abs(a.mo99134a()) < ((long) a.f139521a.f139526x.f42470a)) {
                    C61462f fVar = a.f139521a;
                    if (!(fVar == null || (iVar = fVar.f139526x) == null || !iVar.f42473d)) {
                        m111305c(str);
                    }
                    C22099u<?> uVar = a.f139522b;
                    MethodCollector.m26664o(9149);
                    return uVar;
                } else {
                    m111305c(str);
                    a.mo99134a();
                    MethodCollector.m26664o(9149);
                    return null;
                }
            }
        }
    }

    private C61454a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.net.preload.a$b */
    public static final class C61457b extends AbstractC89220m implements AbstractC89171a<C22099u<?>> {

        /* renamed from: a */
        final /* synthetic */ C61458b f139516a;

        static {
            Covode.recordClassIndex(72113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61457b(C61458b bVar) {
            super(0);
            this.f139516a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C22099u<?> invoke() {
            C61455a aVar = C61454a.f139507b;
            if (aVar != null) {
                return aVar.mo99129a(this.f139516a.f139518b);
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(72110);
    }

    /* renamed from: a */
    public static void m111303a(String str) {
        MethodCollector.m26663i(12208);
        HashSet<String> hashSet = f139506a;
        synchronized (hashSet) {
            try {
                hashSet.remove(str);
            } catch (Throwable th) {
                MethodCollector.m26664o(12208);
                throw th;
            }
        }
        ConcurrentHashMap<String, C61459c> concurrentHashMap = f139510e;
        C61459c cVar = concurrentHashMap.get(str);
        if (cVar != null) {
            cVar.mo99133a();
        }
        concurrentHashMap.remove(str);
        MethodCollector.m26664o(12208);
    }

    /* renamed from: a */
    public static <T> T m111302a(String str, C61462f fVar, AbstractC89171a<? extends T> aVar) {
        C61459c cVar;
        MethodCollector.m26663i(12075);
        HashSet<String> hashSet = f139506a;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(str)) {
                    if (fVar != null) {
                        f139511f.incrementAndGet();
                    }
                    ConcurrentHashMap<String, C61459c> concurrentHashMap = f139510e;
                    cVar = concurrentHashMap.get(str);
                    if (cVar == null) {
                        cVar = new C61459c();
                        concurrentHashMap.put(str, cVar);
                    }
                } else {
                    cVar = null;
                }
            } finally {
                MethodCollector.m26664o(12075);
            }
        }
        if (cVar != null) {
            ReentrantLock reentrantLock = cVar.f139519a;
            reentrantLock.lock();
            try {
                cVar.f139520b.await();
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                MethodCollector.m26664o(12075);
                throw th;
            }
        }
        T t = (T) aVar.invoke();
        if (t == null) {
            if (fVar != null) {
                synchronized (hashSet) {
                    try {
                        hashSet.add(str);
                    } finally {
                        MethodCollector.m26664o(12075);
                    }
                }
                f139511f.incrementAndGet();
            }
        } else if (fVar == null) {
            f139512g.incrementAndGet();
        }
        return t;
    }
}
