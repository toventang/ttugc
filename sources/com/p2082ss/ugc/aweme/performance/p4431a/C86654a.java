package com.p2082ss.ugc.aweme.performance.p4431a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.aweme.performance.core.monitor.C86659a;
import com.p2082ss.ugc.aweme.performance.core.monitor.C86664b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4432a.AbstractC86662a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86667c;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4435d.AbstractC86675b;
import com.p2082ss.ugc.aweme.performance.mainlooper.monitor.work.SampleJankListener;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.aweme.performance.a.a */
public final class C86654a {

    /* renamed from: c */
    public static final String f195305c = f195305c;

    /* renamed from: d */
    public static final String f195306d = f195306d;

    /* renamed from: e */
    public static final String f195307e = f195307e;

    /* renamed from: f */
    public static final String f195308f = f195308f;

    /* renamed from: g */
    public static boolean f195309g;

    /* renamed from: h */
    public static Handler f195310h;

    /* renamed from: i */
    public static long f195311i = 32;

    /* renamed from: j */
    public static Printer f195312j;

    /* renamed from: k */
    public static int f195313k;

    /* renamed from: l */
    public static long f195314l;

    /* renamed from: m */
    public static final AbstractC89244h f195315m = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C86656b.f195322a);

    /* renamed from: n */
    public static final C86655a f195316n = new C86655a((byte) 0);

    /* renamed from: o */
    private static HandlerThread f195317o;

    /* renamed from: p */
    private static final C86657c f195318p = new C86657c();

    /* renamed from: a */
    public boolean f195319a;

    /* renamed from: b */
    public List<AbstractC86675b> f195320b;

    /* renamed from: com.ss.ugc.aweme.performance.a.a$a */
    public static final class C86655a {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f195321a = {new C89232y(C89204ab.m154669a(C86655a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/monitor/JankMonitor;")};

        /* renamed from: a */
        public static C86654a m150135a() {
            return (C86654a) C86654a.f195315m.getValue();
        }

        private C86655a() {
        }

        static {
            Covode.recordClassIndex(101883);
        }

        public /* synthetic */ C86655a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.a.a$c */
    public static final class C86657c implements Printer {

        /* renamed from: a */
        private long f195323a;

        static {
            Covode.recordClassIndex(101885);
        }

        C86657c() {
        }

        /* renamed from: com.ss.ugc.aweme.performance.a.a$c$a */
        static final class RunnableC86658a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C89233z.C89238e f195324a;

            static {
                Covode.recordClassIndex(101886);
            }

            RunnableC86658a(C89233z.C89238e eVar) {
                this.f195324a = eVar;
            }

            public final void run() {
                Iterator<T> it = C86655a.m150135a().f195320b.iterator();
                while (it.hasNext()) {
                    it.next().onJankHappened(this.f195324a.element, -1, -1, -1);
                }
            }
        }

        public final void println(String str) {
            C89219l.m154719c(str, "");
            if (!TextUtils.isEmpty(str) && C86655a.m150135a().f195319a) {
                if (C86654a.f195309g) {
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = (T) (C86654a.f195308f + String.valueOf(C86654a.f195313k));
                    if (C89361p.m154874b(str, C86654a.f195306d, false)) {
                        Handler handler = C86654a.f195310h;
                        if (handler != null) {
                            handler.postDelayed(new RunnableC86658a(eVar), C86654a.f195311i * 50);
                        }
                        this.f195323a = System.nanoTime();
                        Iterator<T> it = C86655a.m150135a().f195320b.iterator();
                        while (it.hasNext()) {
                            it.next().onMessageArrive(eVar.element, this.f195323a);
                        }
                    }
                    if (C89361p.m154874b(str, C86654a.f195307e, false)) {
                        Handler handler2 = C86654a.f195310h;
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                        }
                        if (this.f195323a != 0) {
                            long nanoTime = System.nanoTime();
                            long j = (nanoTime - this.f195323a) / 1000000;
                            if (j > C86654a.f195311i) {
                                C86654a.f195314l += j;
                                C86654a.f195313k++;
                                Iterator<T> it2 = C86655a.m150135a().f195320b.iterator();
                                while (it2.hasNext()) {
                                    it2.next().onJankHappened(eVar.element, this.f195323a, nanoTime, j);
                                }
                            }
                            Iterator<T> it3 = C86655a.m150135a().f195320b.iterator();
                            while (it3.hasNext()) {
                                it3.next().onMessageLeave(eVar.element, nanoTime);
                            }
                        }
                    }
                }
                if (C86654a.f195312j != null && (!C89219l.m154714a(C86654a.f195312j, this))) {
                    Printer printer = C86654a.f195312j;
                    if (printer == null) {
                        C89219l.m154707a();
                    }
                    printer.println(str);
                }
            }
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.a.a$b */
    static final class C86656b extends AbstractC89220m implements AbstractC89171a<C86654a> {

        /* renamed from: a */
        public static final C86656b f195322a = new C86656b();

        static {
            Covode.recordClassIndex(101884);
        }

        C86656b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86654a invoke() {
            if (C86659a.C86660a.m150136a().f195329c || !C86659a.C86660a.m150136a().f195327a) {
                return new C86654a((byte) 0);
            }
            throw new RuntimeException("not init , please check!");
        }
    }

    static {
        Covode.recordClassIndex(101882);
    }

    private C86654a() {
        boolean z;
        long j;
        this.f195320b = new ArrayList();
        AbstractC86662a aVar = C86659a.C86660a.m150136a().f195328b;
        if (aVar != null) {
            z = aVar.mo137925a();
        } else {
            z = false;
        }
        f195309g = z;
        AbstractC86662a aVar2 = C86659a.C86660a.m150136a().f195328b;
        if (aVar2 != null) {
            j = aVar2.mo137926b();
        } else {
            j = 100;
        }
        f195311i = j;
        SampleJankListener sampleJankListener = new SampleJankListener();
        C89219l.m154719c(sampleJankListener, "");
        this.f195320b.add(sampleJankListener);
        sampleJankListener.setThreshold(f195311i);
    }

    /* renamed from: a */
    private static Printer m150131a() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            C89219l.m154709a((Object) declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj != null) {
                return (Printer) obj;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private synchronized void m150132b() {
        AbstractC86662a aVar;
        if (f195309g) {
            if (!this.f195319a) {
                this.f195319a = true;
                if (f195317o == null && (aVar = C86659a.C86660a.m150136a().f195328b) != null && aVar.mo137927c()) {
                    HandlerThread handlerThread = new HandlerThread(f195305c);
                    f195317o = handlerThread;
                    handlerThread.start();
                    HandlerThread handlerThread2 = f195317o;
                    if (handlerThread2 == null) {
                        C89219l.m154707a();
                    }
                    f195310h = new Handler(handlerThread2.getLooper());
                }
                Iterator<T> it = this.f195320b.iterator();
                while (it.hasNext()) {
                    it.next().setThreshold(f195311i);
                }
                if (true ^ C89219l.m154714a(f195312j, m150131a())) {
                    f195312j = m150131a();
                }
                Looper.getMainLooper().setMessageLogging(f195318p);
            }
        }
    }

    public /* synthetic */ C86654a(byte b) {
        this();
    }

    /* renamed from: b */
    public final synchronized void mo137922b(String str) {
        C89219l.m154719c(str, "");
        if (f195309g) {
            C86667c a = C86664b.m150143a(str);
            if (a != null) {
                a.f195360b = System.nanoTime();
                Iterator<T> it = this.f195320b.iterator();
                while (it.hasNext()) {
                    it.next().flush(a);
                }
                C89219l.m154719c(str, "");
                C86664b.f195333a.remove(str);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo137921a(String str) {
        C89219l.m154719c(str, "");
        if (f195309g) {
            if (!this.f195319a) {
                m150132b();
            }
            if (C86664b.m150143a(str) == null) {
                C86667c cVar = new C86667c(str);
                cVar.f195359a = System.nanoTime();
                C89219l.m154719c(str, "");
                C89219l.m154719c(cVar, "");
                if (C86664b.f195334b.get(str) == null) {
                    int i = C86664b.f195335c + 1;
                    C86664b.f195335c = i;
                    cVar.f195361c = i;
                    C86664b.f195334b.put(str, Integer.valueOf(cVar.f195361c));
                } else {
                    Integer num = C86664b.f195334b.get(str);
                    if (num == null) {
                        C89219l.m154707a();
                    }
                    cVar.f195361c = num.intValue();
                }
                C86664b.f195333a.put(str, cVar);
            }
        }
    }
}
