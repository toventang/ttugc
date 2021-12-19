package com.p2082ss.ugc.aweme.performance.mainlooper.monitor.work;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.performance.p3544b.p3545a.C62835a;
import com.p2082ss.ugc.aweme.performance.core.monitor.C86659a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4432a.AbstractC86663b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86665a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86666b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4434c.C86668a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4435d.AbstractC86669a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4436e.C86677b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4437f.C86679b;
import com.p2082ss.ugc.aweme.performance.mainlooper.monitor.p4439a.RunnableC86681a;
import com.p2082ss.ugc.aweme.performance.mainlooper.p4438a.C86680a;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a */
public final class C86682a extends AbstractC86669a {

    /* renamed from: l */
    public static final AbstractC89244h f195388l = C89250i.m154773a((AbstractC89171a) C86684b.f195399a);

    /* renamed from: m */
    static final double f195389m = f195389m;

    /* renamed from: n */
    static int f195390n = 50;

    /* renamed from: o */
    public static final C86683a f195391o = new C86683a((byte) 0);

    /* renamed from: q */
    private static int f195392q = 200;

    /* renamed from: h */
    public long f195393h;

    /* renamed from: i */
    final Handler f195394i;

    /* renamed from: j */
    long f195395j;

    /* renamed from: k */
    final RunnableC86685c f195396k;

    /* renamed from: p */
    private final HandlerThread f195397p;

    /* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a$a */
    public static final class C86683a {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f195398a = {new C89232y(C89204ab.m154669a(C86683a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/mainlooper/monitor/work/LogWorker;")};

        /* renamed from: a */
        public static C86682a m150159a() {
            return (C86682a) C86682a.f195388l.getValue();
        }

        private C86683a() {
        }

        static {
            Covode.recordClassIndex(101913);
        }

        public /* synthetic */ C86683a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a$b */
    static final class C86684b extends AbstractC89220m implements AbstractC89171a<C86682a> {

        /* renamed from: a */
        public static final C86684b f195399a = new C86684b();

        static {
            Covode.recordClassIndex(101914);
        }

        C86684b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86682a invoke() {
            return new C86682a((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(101912);
    }

    private C86682a() {
        this.f195395j = 16;
        this.f195396k = new RunnableC86685c();
        HandlerThread handlerThread = new HandlerThread("LogWorker");
        this.f195397p = handlerThread;
        handlerThread.start();
        this.f195394i = new Handler(handlerThread.getLooper());
        if (this.f195373d) {
            C89219l.m154719c(C62835a.C62836a.f142494a, "");
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a$c */
    static final class RunnableC86685c implements Runnable {

        /* renamed from: a */
        public String f195400a = "";

        /* renamed from: b */
        public long f195401b;

        static {
            Covode.recordClassIndex(101915);
        }

        public final void run() {
            MethodCollector.m26663i(5491);
            C86666b bVar = new C86666b();
            bVar.f195352e = this.f195401b;
            bVar.f195355h = C86668a.f195364b;
            bVar.f195354g = this.f195400a;
            synchronized (C86683a.m150159a().f195370a) {
                try {
                    C86683a.m150159a().f195370a.put(this.f195400a, bVar);
                } finally {
                    MethodCollector.m26664o(5491);
                }
            }
            if (C86683a.m150159a().f195371b) {
                synchronized (bVar) {
                    try {
                        Looper mainLooper = Looper.getMainLooper();
                        C89219l.m154709a((Object) mainLooper, "");
                        Thread thread = mainLooper.getThread();
                        C89219l.m154709a((Object) thread, "");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        if (stackTrace != null && stackTrace.length > 0) {
                            String stackTraceElement = stackTrace[0].toString();
                            C89219l.m154709a((Object) stackTraceElement, "");
                            bVar.f195357j = stackTraceElement;
                        }
                        bVar.f195349b = C86679b.m150154a(stackTrace);
                    } finally {
                        MethodCollector.m26664o(5491);
                    }
                }
                RunnableC86681a a = C86680a.f195383a.mo137960a();
                String str = bVar.f195354g;
                C89219l.m154719c(str, "");
                a.f195387b = str;
                C86677b.f195379a.mo137953a(a);
            }
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a$d */
    static final class RunnableC86686d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C86682a f195402a;

        /* renamed from: b */
        final /* synthetic */ C86666b f195403b;

        static {
            Covode.recordClassIndex(101916);
        }

        RunnableC86686d(C86682a aVar, C86666b bVar) {
            this.f195402a = aVar;
            this.f195403b = bVar;
        }

        public final void run() {
            Map<String, Object> map;
            MethodCollector.m26663i(5513);
            if (this.f195402a.f195373d) {
                AbstractC86663b bVar = C86659a.C86660a.m150136a().f195330d;
                if (bVar != null) {
                    map = bVar.mo137930a();
                } else {
                    map = null;
                }
                synchronized (this.f195403b) {
                    if (map != null) {
                        try {
                            Set<String> keySet = map.keySet();
                            if (keySet != null) {
                                Iterator<T> it = keySet.iterator();
                                while (it.hasNext()) {
                                    if (C89361p.m154908a((CharSequence) this.f195403b.f195349b, (CharSequence) it.next(), false)) {
                                        return;
                                    }
                                }
                            }
                        } finally {
                            MethodCollector.m26664o(5513);
                        }
                    }
                }
            }
            C86665a aVar = new C86665a(null, 3, (byte) 0);
            aVar.f195338b = 1;
            if (this.f195403b.f195353f == -1) {
                aVar.f195339c = this.f195402a.f195393h * 50;
                aVar.mo137932b("errorJank");
                Looper mainLooper = Looper.getMainLooper();
                C89219l.m154709a((Object) mainLooper, "");
                Thread thread = mainLooper.getThread();
                C89219l.m154709a((Object) thread, "");
                aVar.mo137936f(C86679b.m150154a(thread.getStackTrace()));
                String date = new Date(System.currentTimeMillis() / 1000000).toString();
                C89219l.m154709a((Object) date, "");
                aVar.mo137934d(date);
            } else {
                aVar.f195339c = (this.f195403b.f195353f - this.f195403b.f195352e) / 1000000;
                aVar.mo137932b("applicaiton");
                String date2 = new Date(this.f195403b.f195352e / 1000000).toString();
                C89219l.m154709a((Object) date2, "");
                aVar.mo137934d(date2);
                synchronized (this.f195403b) {
                    try {
                        aVar.mo137936f(this.f195403b.f195349b);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5513);
                        throw th;
                    }
                }
            }
            aVar.mo137933c(this.f195403b.f195355h);
            aVar.mo137935e(C86679b.m150154a(C86679b.m150155b(this.f195403b.f195358k)) + "\n" + this.f195403b.f195356i);
            aVar.mo137931a(this.f195403b.f195357j);
            C86659a.C86660a.m150136a();
            MethodCollector.m26664o(5513);
        }
    }

    public /* synthetic */ C86682a(byte b) {
        this();
    }
}
