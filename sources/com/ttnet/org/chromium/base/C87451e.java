package com.ttnet.org.chromium.base;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ttnet.org.chromium.base.e */
public final class C87451e {

    /* renamed from: a */
    static AbstractC87454c f198351a;

    /* renamed from: b */
    final C87455d f198352b;

    /* renamed from: com.ttnet.org.chromium.base.e$c */
    interface AbstractC87454c {
        static {
            Covode.recordClassIndex(103389);
        }
    }

    static {
        Covode.recordClassIndex(103386);
    }

    /* renamed from: com.ttnet.org.chromium.base.e$a */
    public static class C87452a extends RuntimeException {
        static {
            Covode.recordClassIndex(103387);
        }

        public C87452a() {
            super("vvv This is where object was created. vvv");
        }
    }

    /* renamed from: com.ttnet.org.chromium.base.e$d */
    public static class C87455d extends PhantomReference<Object> {

        /* renamed from: d */
        public static ReferenceQueue<Object> f198353d = new ReferenceQueue<>();

        /* renamed from: e */
        public static Set<C87455d> f198354e = Collections.synchronizedSet(new HashSet());

        /* renamed from: a */
        boolean f198355a = false;

        /* renamed from: b */
        final Class<?> f198356b;

        /* renamed from: c */
        final C87452a f198357c;

        static {
            Covode.recordClassIndex(103390);
            new Thread("GcStateAssertQueue") {
                /* class com.ttnet.org.chromium.base.C87451e.C87455d.C874561 */

                static {
                    Covode.recordClassIndex(103391);
                }

                public final void run() {
                    while (true) {
                        try {
                            C87455d dVar = (C87455d) C87455d.f198353d.remove();
                            C87455d.f198354e.remove(dVar);
                            if (!dVar.f198355a) {
                                String a = C1764a.m5928a("Object of type %s was GC'ed without cleanup. Refer to \"Caused by\" for where object was created.", new Object[]{dVar.f198356b.getName()});
                                if (C87451e.f198351a == null) {
                                    throw new C87453b(a, dVar.f198357c);
                                }
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

                {
                    setDaemon(true);
                    start();
                }
            };
        }

        public C87455d(Object obj, C87452a aVar) {
            super(obj, f198353d);
            this.f198357c = aVar;
            this.f198356b = obj.getClass();
            f198354e.add(this);
        }
    }

    public C87451e(C87455d dVar) {
        this.f198352b = dVar;
    }

    /* renamed from: a */
    public static void m151783a(C87451e eVar) {
        if (C87444b.f198337a) {
            eVar.f198352b.f198355a = true;
        }
    }

    /* renamed from: com.ttnet.org.chromium.base.e$b */
    static class C87453b extends RuntimeException {
        static {
            Covode.recordClassIndex(103388);
        }

        C87453b(String str, Throwable th) {
            super(str, th);
        }
    }
}
