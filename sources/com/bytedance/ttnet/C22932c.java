package com.bytedance.ttnet;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.AbstractC14625c;
import com.bytedance.frameworks.baselib.network.http.cronet.C14646b;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.p1705f.C22954c;
import com.bytedance.ttnet.utils.C22970d;
import java.net.MalformedURLException;

/* renamed from: com.bytedance.ttnet.c */
public final class C22932c {

    /* renamed from: a */
    public static volatile AbstractC22934b f54199a;

    /* renamed from: b */
    public static final C22935c f54200b = new C22935c((byte) 0);

    /* renamed from: c */
    public static final C22933a f54201c = new C22933a((byte) 0);

    /* renamed from: d */
    static boolean f54202d;

    /* renamed from: e */
    public static volatile boolean f54203e;

    /* renamed from: f */
    static String f54204f;

    /* renamed from: com.bytedance.ttnet.c$b */
    public interface AbstractC22934b {
        static {
            Covode.recordClassIndex(26842);
        }

        /* renamed from: g */
        boolean mo37239g();
    }

    /* renamed from: com.bytedance.ttnet.c$c */
    public static class C22935c {
        static {
            Covode.recordClassIndex(26843);
        }

        private C22935c() {
        }

        /* renamed from: a */
        public AbstractC14625c mo37253a() {
            Context a = TTNetInit.getTTNetDepend().mo37259a();
            C14722o a2 = C14722o.m26949a(a);
            if (C14756f.m27056a(a)) {
                C14722o.f35861j = C22954c.m43256a();
            }
            return a2;
        }

        /* synthetic */ C22935c(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ttnet.c$a */
    public static class C22933a extends C22935c {
        static {
            Covode.recordClassIndex(26841);
        }

        private C22933a() {
            super((byte) 0);
        }

        @Override // com.bytedance.ttnet.C22932c.C22935c
        /* renamed from: a */
        public final AbstractC14625c mo37253a() {
            return C22936d.m43222a(C14659h.m26802a(TTNetInit.getTTNetDepend().mo37259a()));
        }

        /* synthetic */ C22933a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(26840);
    }

    /* renamed from: a */
    public static boolean m43218a() {
        if (f54199a == null) {
            C14722o.f35853b = 9;
            return false;
        } else if (!f54199a.mo37239g()) {
            return false;
        } else {
            TTNetInit.getTTNetDepend();
            if (!f54202d || f54203e) {
                return true;
            }
            C14722o.f35853b = 7;
            C14722o.f35854c = f54204f;
            return false;
        }
    }

    /* renamed from: com.bytedance.ttnet.c$d */
    static class C22936d implements AbstractC14625c {

        /* renamed from: a */
        private static volatile C22936d f54205a;

        /* renamed from: b */
        private C14659h f54206b;

        /* renamed from: c */
        private volatile int f54207c;

        static {
            Covode.recordClassIndex(26844);
        }

        private C22936d(C14659h hVar) {
            this.f54206b = hVar;
        }

        /* renamed from: a */
        public static C22936d m43222a(C14659h hVar) {
            MethodCollector.m26663i(5286);
            if (f54205a == null) {
                synchronized (C22936d.class) {
                    try {
                        if (f54205a == null) {
                            f54205a = new C22936d(hVar);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5286);
                        throw th;
                    }
                }
            }
            C22936d dVar = f54205a;
            MethodCollector.m26664o(5286);
            return dVar;
        }

        @Override // com.bytedance.retrofit2.client.AbstractC22025a
        /* renamed from: a */
        public final AbstractC22029d mo11597a(Request request) {
            boolean z;
            try {
                return this.f54206b.mo11597a(request);
            } catch (Throwable th) {
                if (!(th instanceof MalformedURLException) && (th.getMessage() == null || !th.getMessage().contains("MalformedURLException"))) {
                    C14646b a = C14646b.m26772a();
                    if (a.f35478b == C14646b.EnumC14647a.PRE_INIT || a.f35478b == C14646b.EnumC14647a.FORCE_INIT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i = this.f54207c + 1;
                        this.f54207c = i;
                        if (i > 5) {
                            C22932c.f54202d = true;
                            String a2 = C22970d.m43301a(th);
                            C22932c.f54204f = a2;
                            if (a2.length() > 2048) {
                                C22932c.f54204f = C22932c.f54204f.substring(0, 2048);
                            }
                        }
                    }
                }
                TTNetInit.notifyColdStartFinish();
                return C22932c.f54200b.mo37253a().mo11597a(request);
            }
        }
    }
}
