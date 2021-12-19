package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.airbnb.lottie.j */
public final class C2199j {

    /* renamed from: a */
    public static volatile C2199j f6561a;

    /* renamed from: b */
    public static final C2200a f6562b = new C2200a((byte) 0);

    /* renamed from: c */
    private C2201b f6563c;

    /* renamed from: com.airbnb.lottie.j$b */
    public static final class C2201b {

        /* renamed from: a */
        public boolean f6564a;

        static {
            Covode.recordClassIndex(2396);
        }
    }

    static {
        Covode.recordClassIndex(2394);
    }

    /* renamed from: com.airbnb.lottie.j$a */
    public static final class C2200a {
        static {
            Covode.recordClassIndex(2395);
        }

        private C2200a() {
        }

        /* renamed from: a */
        public static C2199j m6800a() {
            MethodCollector.m26663i(13857);
            if (C2199j.f6561a == null) {
                synchronized (C2199j.class) {
                    try {
                        if (C2199j.f6561a == null) {
                            C2199j.f6561a = new C2199j((byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13857);
                        throw th;
                    }
                }
            }
            C2199j jVar = C2199j.f6561a;
            if (jVar == null) {
                C89219l.m154707a();
            }
            MethodCollector.m26664o(13857);
            return jVar;
        }

        public /* synthetic */ C2200a(byte b) {
            this();
        }
    }

    private C2199j() {
    }

    public /* synthetic */ C2199j(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo6120a(Exception exc) {
        C2201b bVar = this.f6563c;
        if (bVar != null && bVar.f6564a) {
            throw new RuntimeException(exc);
        }
    }
}
