package com.bytedance.android.live.p250i.p252b;

import com.bytedance.android.live.p250i.p251a.AbstractC4352a;
import com.bytedance.android.live.p250i.p251a.AbstractC4354b;
import com.bytedance.android.live.p379n.AbstractC5771e;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p379n.AbstractC5779l;
import com.bytedance.android.livesdk.p442ai.C6705a;
import com.bytedance.android.livesdk.p442ai.C6718d;
import com.bytedance.android.livesdk.p442ai.C6730i;
import com.bytedance.android.livesdk.p442ai.C6741n;
import com.bytedance.android.livesdk.p594n.C9936b;
import com.bytedance.android.livesdk.p594n.C9939c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.i.b.b */
public class C4360b {

    /* renamed from: a */
    private static volatile C4360b f11879a;

    /* renamed from: b */
    private final Map<Class<?>, C4361a<?>> f11880b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.live.i.b.b$b */
    public interface AbstractC4362b<T> {
        static {
            Covode.recordClassIndex(4936);
        }

        /* renamed from: a */
        C4363a<T> mo10117a(C4363a<T> aVar);

        /* renamed from: com.bytedance.android.live.i.b.b$b$a */
        public static final class C4363a<R> {

            /* renamed from: a */
            public R f11884a;

            /* renamed from: b */
            public boolean f11885b;

            static {
                Covode.recordClassIndex(4937);
            }

            private C4363a() {
            }

            /* synthetic */ C4363a(byte b) {
                this();
            }
        }
    }

    static {
        Covode.recordClassIndex(4934);
    }

    /* renamed from: a */
    static C4360b m10458a() {
        MethodCollector.m26663i(12988);
        if (f11879a == null) {
            synchronized (C4360b.class) {
                try {
                    if (f11879a == null) {
                        f11879a = new C4360b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12988);
                    throw th;
                }
            }
        }
        C4360b bVar = f11879a;
        MethodCollector.m26664o(12988);
        return bVar;
    }

    private C4360b() {
        m10456a(AbstractC5777j.class, new C6730i.C6735a());
        m10456a(AbstractC5771e.class, new C9936b.C9938a());
        m10456a(AbstractC5779l.class, new C9939c.C9941b());
        m10456a(C6741n.class, new C6741n.C6742a());
        m10456a(AbstractC4354b.class, new C6718d.C6720a());
        m10456a(AbstractC4352a.class, new C6705a.C6706a());
    }

    /* renamed from: com.bytedance.android.live.i.b.b$a */
    public static final class C4361a<T> {

        /* renamed from: a */
        public AbstractC4362b<T> f11881a;

        /* renamed from: b */
        public AbstractC4362b.C4363a<T> f11882b;

        /* renamed from: c */
        public Object f11883c;

        static {
            Covode.recordClassIndex(4935);
        }

        private C4361a(AbstractC4362b<T> bVar) {
            this.f11881a = bVar;
        }

        /* synthetic */ C4361a(AbstractC4362b bVar, byte b) {
            this(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R, T] */
    /* renamed from: a */
    public <T> T mo10116a(Class<T> cls) {
        MethodCollector.m26663i(13080);
        C4361a<?> aVar = this.f11880b.get(cls);
        if (aVar == null) {
            aVar = new C4361a<>(new C4364c(cls), (byte) 0);
            aVar.f11882b = aVar.f11881a.mo10117a(new AbstractC4362b.C4363a<>((byte) 0));
            aVar.f11883c = aVar.f11881a.mo10117a(aVar.f11882b).f11884a;
            this.f11880b.put(cls, aVar);
        }
        if (aVar.f11882b == null || !aVar.f11882b.f11885b) {
            aVar.f11882b = aVar.f11881a.mo10117a(new AbstractC4362b.C4363a<>((byte) 0));
        }
        if (aVar.f11882b.f11885b) {
            if (aVar.f11883c == null) {
                synchronized (C4360b.class) {
                    try {
                        if (aVar.f11883c == null && aVar.f11882b != null) {
                            aVar.f11883c = aVar.f11882b.f11884a;
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13080);
                        throw th;
                    }
                }
            }
            T t = (T) aVar.f11883c;
            MethodCollector.m26664o(13080);
            return t;
        }
        R r = aVar.f11882b.f11884a;
        aVar.f11882b = null;
        MethodCollector.m26664o(13080);
        return r;
    }

    /* renamed from: a */
    private <T> C4361a<T> m10456a(Class<T> cls, AbstractC4362b<T> bVar) {
        C4361a<T> aVar = new C4361a<>(bVar, (byte) 0);
        this.f11880b.put(cls, aVar);
        return aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ AbstractC4362b.C4363a m10457a(Class cls, AbstractC4362b.C4363a aVar) {
        try {
            aVar.f11884a = (R) cls.newInstance();
            return aVar;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Requested class isn't registered in LiveImplProvider and its nullary constructor isn't accessible: " + cls.getName() + ".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
        } catch (InstantiationException unused2) {
            throw new RuntimeException("Requested class isn't registered in LiveImplProvider and doesn't have public non-param constructor: " + cls.getName() + ".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
        }
    }
}
