package com.bytedance.android.livesdk.feed.services;

import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.network.GsonProvider;
import com.bytedance.android.livesdk.feed.p531g.AbstractC8592a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.feed.services.b */
public class C8680b {

    /* renamed from: a */
    private static volatile C8680b f21429a;

    /* renamed from: b */
    private final Map<Class<?>, C8681a<?>> f21430b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.livesdk.feed.services.b$b */
    public interface AbstractC8682b<T> {
        static {
            Covode.recordClassIndex(9549);
        }

        /* renamed from: a */
        C8683a<T> mo14951a(C8683a<T> aVar);

        /* renamed from: com.bytedance.android.livesdk.feed.services.b$b$a */
        public static final class C8683a<R> {

            /* renamed from: a */
            public R f21433a;

            /* renamed from: b */
            public boolean f21434b;

            static {
                Covode.recordClassIndex(9550);
            }

            private C8683a() {
            }

            /* synthetic */ C8683a(byte b) {
                this();
            }
        }
    }

    static {
        Covode.recordClassIndex(9547);
    }

    private C8680b() {
        m16957a(AbstractC8593h.class, new C8679a());
        m16957a(AbstractC8592a.class, new C8686e());
        m16957a(C27910f.class, new GsonProvider());
    }

    /* renamed from: a */
    public static C8680b m16959a() {
        MethodCollector.m26663i(2860);
        if (f21429a == null) {
            synchronized (C8680b.class) {
                try {
                    if (f21429a == null) {
                        f21429a = new C8680b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2860);
                    throw th;
                }
            }
        }
        C8680b bVar = f21429a;
        MethodCollector.m26664o(2860);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.feed.services.b$a */
    public static final class C8681a<T> {

        /* renamed from: a */
        public AbstractC8682b<T> f21431a;

        /* renamed from: b */
        public Object f21432b;

        static {
            Covode.recordClassIndex(9548);
        }

        private C8681a(AbstractC8682b<T> bVar) {
            this.f21431a = bVar;
        }

        /* synthetic */ C8681a(AbstractC8682b bVar, byte b) {
            this(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [R, T] */
    /* renamed from: a */
    public final <T> T mo14966a(Class<T> cls) {
        MethodCollector.m26663i(2867);
        C8681a<?> aVar = this.f21430b.get(cls);
        if (aVar == null) {
            aVar = m16957a(cls, new C8684c(cls));
        }
        AbstractC8682b.C8683a<T> a = aVar.f21431a.mo14951a(new AbstractC8682b.C8683a<>((byte) 0));
        if (a.f21434b) {
            if (aVar.f21432b == null) {
                synchronized (C8680b.class) {
                    try {
                        if (aVar.f21432b == null) {
                            aVar.f21432b = a.f21433a;
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(2867);
                        throw th;
                    }
                }
            }
            T t = (T) aVar.f21432b;
            MethodCollector.m26664o(2867);
            return t;
        }
        R r = a.f21433a;
        MethodCollector.m26664o(2867);
        return r;
    }

    /* renamed from: a */
    private <T> C8681a<T> m16957a(Class<T> cls, AbstractC8682b<T> bVar) {
        C8681a<T> aVar = new C8681a<>(bVar, (byte) 0);
        this.f21430b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ AbstractC8682b.C8683a m16958a(Class cls, AbstractC8682b.C8683a aVar) {
        try {
            aVar.f21433a = (R) cls.newInstance();
            return aVar;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Requested class isn't registered in FeedImplProvider and its nullary constructor isn't accessible: " + cls.getName() + ".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
        } catch (InstantiationException unused2) {
            throw new RuntimeException("Requested class isn't registered in FeedImplProvider and doesn't have public non-param constructor: " + cls.getName() + ".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
        }
    }
}
