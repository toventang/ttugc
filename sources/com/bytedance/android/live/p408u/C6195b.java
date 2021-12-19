package com.bytedance.android.live.p408u;

import android.os.Build;
import android.os.Debug;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Pair;
import android.view.Choreographer;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.live.u.b */
public class C6195b {

    /* renamed from: s */
    private static volatile C6195b f15441s;

    /* renamed from: a */
    final C6194a f15442a = new C6194a();

    /* renamed from: b */
    Method f15443b;

    /* renamed from: c */
    public volatile boolean f15444c = false;

    /* renamed from: d */
    public volatile long f15445d = -1;

    /* renamed from: e */
    public volatile long f15446e = 0;

    /* renamed from: f */
    volatile long f15447f = 0;

    /* renamed from: g */
    long f15448g = 10;

    /* renamed from: h */
    long f15449h = 0;

    /* renamed from: i */
    long f15450i = 0;

    /* renamed from: j */
    public long f15451j = 2000000000;

    /* renamed from: k */
    volatile int f15452k = -1;

    /* renamed from: l */
    public volatile long f15453l = -1;

    /* renamed from: m */
    public volatile long f15454m = -1;

    /* renamed from: n */
    public volatile boolean f15455n = false;

    /* renamed from: o */
    public final Choreographer.FrameCallback f15456o = new Choreographer.FrameCallback() {
        /* class com.bytedance.android.live.p408u.C6195b.Choreographer$FrameCallbackC61961 */

        static {
            Covode.recordClassIndex(6902);
        }

        public final void doFrame(long j) {
            C6195b bVar = C6195b.this;
            if (bVar.f15448g > 0 && bVar.f15445d > 0) {
                long j2 = j - bVar.f15445d;
                if (j2 > 0) {
                    if (bVar.f15449h < bVar.f15448g) {
                        bVar.f15449h++;
                    }
                    bVar.f15450i = ((bVar.f15450i * (bVar.f15449h - 1)) + j2) / bVar.f15449h;
                    bVar.f15446e = bVar.f15447f + bVar.f15450i;
                }
            }
            bVar.f15445d = j;
            if (bVar.mo12105a(bVar.f15452k)) {
                bVar.f15452k = -1;
            }
            if (C6195b.this.f15444c) {
                Choreographer.getInstance().postFrameCallback(C6195b.this.f15456o);
            }
        }
    };

    /* renamed from: p */
    public final Runnable f15457p = new RunnableC6198c(this);

    /* renamed from: q */
    final Runnable f15458q = new RunnableC6199d(this);

    /* renamed from: r */
    public final Runnable f15459r = new RunnableC6200e(this);

    /* renamed from: t */
    private MessageQueue f15460t;

    /* renamed from: u */
    private Method f15461u;

    /* renamed from: v */
    private Object f15462v;

    /* renamed from: w */
    private C6197a f15463w;

    /* renamed from: x */
    private double f15464x = 1.0d;

    static {
        Covode.recordClassIndex(6901);
    }

    /* renamed from: a */
    static Object m13447a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_live_watchdog_FWatchDog_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_live_watchdog_FWatchDog_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12106b() {
        this.f15448g = 0;
    }

    /* renamed from: h */
    private void m13448h() {
        try {
            C6197a aVar = this.f15463w;
            if (aVar != null) {
                aVar.f15466a = true;
                this.f15463w.interrupt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C6195b m13446a() {
        MethodCollector.m26663i(12134);
        if (f15441s == null) {
            synchronized (C6195b.class) {
                try {
                    if (f15441s == null) {
                        f15441s = new C6195b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12134);
                    throw th;
                }
            }
        }
        C6195b bVar = f15441s;
        MethodCollector.m26664o(12134);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        return r1.getBoolean(android.view.Choreographer.getInstance());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r2 = r5.f15442a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r2.f15435c == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r2.f15435c = r2.mo12103a(android.view.Choreographer.class, "USE_VSYNC", java.lang.Boolean.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = r2.f15435c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m13449i() {
        /*
            r5 = this;
            java.lang.String r4 = "USE_VSYNC"
            r3 = 0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()     // Catch:{ Exception -> 0x001c }
            com.bytedance.common.utility.reflect.Reflect r1 = com.bytedance.common.utility.reflect.Reflect.m24529on(r0)     // Catch:{ Exception -> 0x001c }
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x001c }
            com.bytedance.common.utility.reflect.Reflect r0 = r1.field(r4, r0)     // Catch:{ Exception -> 0x001c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x001c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x001c }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x001c }
            return r0
        L_0x001c:
            com.bytedance.android.live.u.a r2 = r5.f15442a     // Catch:{ Exception -> 0x0039 }
            java.lang.reflect.Field r0 = r2.f15435c     // Catch:{ Exception -> 0x0039 }
            if (r0 != 0) goto L_0x002c
            java.lang.Class<android.view.Choreographer> r1 = android.view.Choreographer.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.reflect.Field r0 = r2.mo12103a(r1, r4, r0)     // Catch:{ Exception -> 0x0039 }
            r2.f15435c = r0     // Catch:{ Exception -> 0x0039 }
        L_0x002c:
            java.lang.reflect.Field r1 = r2.f15435c     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x003d
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()     // Catch:{ Exception -> 0x0039 }
            boolean r0 = r1.getBoolean(r0)     // Catch:{ Exception -> 0x0039 }
            return r0
        L_0x0039:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.p408u.C6195b.m13449i():boolean");
    }

    /* renamed from: j */
    private Object m13450j() {
        if (this.f15462v == null) {
            try {
                this.f15462v = Reflect.m24529on(Choreographer.getInstance()).field("mDisplayEventReceiver", new Class[0]).get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.f15462v;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r5.f15442a.mo12102a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r0.getBoolean(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001f */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12109e() {
        /*
            r5 = this;
            r4 = 0
            java.lang.Object r3 = r5.m13450j()     // Catch:{ Exception -> 0x001e }
            if (r3 == 0) goto L_0x0032
            com.bytedance.common.utility.reflect.Reflect r2 = com.bytedance.common.utility.reflect.Reflect.m24529on(r3)     // Catch:{ Exception -> 0x001f }
            java.lang.String r1 = "mHavePendingVsync"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x001f }
            com.bytedance.common.utility.reflect.Reflect r0 = r2.field(r1, r0)     // Catch:{ Exception -> 0x001f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x001f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x001f }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x001f }
            return r0
        L_0x001e:
            r3 = 0
        L_0x001f:
            com.bytedance.android.live.u.a r0 = r5.f15442a     // Catch:{ Exception -> 0x002e }
            java.lang.reflect.Field r0 = r0.mo12102a()     // Catch:{ Exception -> 0x002e }
            if (r0 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            boolean r0 = r0.getBoolean(r3)     // Catch:{ Exception -> 0x002e }
            return r0
        L_0x002e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0032:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.p408u.C6195b.mo12109e():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final MessageQueue mo12111g() {
        if (this.f15460t == null) {
            try {
                this.f15460t = (MessageQueue) Reflect.m24529on(Looper.getMainLooper()).field("mQueue", new Class[0]).get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.f15460t;
    }

    private C6195b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12107c() {
        int i = Build.VERSION.SDK_INT;
        if (C11279p.m20018b() && m13449i() && !this.f15444c) {
            this.f15444c = true;
            if (C6207i.f15486d < 0) {
                C6207i.f15486d = (long) Math.ceil((double) (C6207i.m13486a() * 1000000.0f));
            }
            double d = (double) C6207i.f15486d;
            double d2 = this.f15464x;
            Double.isNaN(d);
            this.f15447f = (long) (d * d2);
            this.f15446e = this.f15447f + this.f15450i;
            Choreographer.getInstance().removeFrameCallback(this.f15456o);
            Choreographer.getInstance().postFrameCallback(this.f15456o);
            if (this.f15463w != null) {
                m13448h();
            } else {
                this.f15463w = new C6197a("FWatchDogWorkThread", this.f15464x);
            }
            this.f15463w.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12108d() {
        if (C11279p.m20018b() && this.f15444c) {
            this.f15444c = false;
            m13448h();
            Choreographer.getInstance().removeFrameCallback(this.f15456o);
            C3940j.m9594a().removeCallbacks(this.f15457p);
            C3940j.m9594a().removeCallbacks(this.f15458q);
            C3940j.m9594a().removeCallbacks(this.f15459r);
            mo12105a(this.f15452k);
            mo12110f();
            this.f15445d = -1;
            this.f15450i = 0;
            this.f15449h = 0;
            this.f15448g = 10;
            this.f15453l = -1;
            this.f15452k = -1;
            this.f15454m = -1;
            this.f15455n = false;
            this.f15463w = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo12110f() {
        try {
            MessageQueue g = mo12111g();
            if (g != null) {
                Message message = (Message) Reflect.m24529on(g).field("mMessages", new Class[0]).get();
                while (message != null && message.getWhen() <= 1) {
                    if (message.getTarget() == null) {
                        mo12105a(message.arg1);
                    }
                    message = (Message) Reflect.m24529on(message).field("next", new Class[0]).get();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.u.b$a */
    public class C6197a extends Thread {

        /* renamed from: a */
        volatile boolean f15466a;

        /* renamed from: c */
        private final double f15468c;

        /* renamed from: d */
        private long f15469d;

        static {
            Covode.recordClassIndex(6903);
        }

        public final void run() {
            while (!this.f15466a) {
                try {
                    sleep(this.f15469d);
                    if (!Debug.isDebuggerConnected()) {
                        long nanoTime = System.nanoTime();
                        if (C6195b.this.f15454m > 0 && C6195b.this.f15451j > 0 && nanoTime - C6195b.this.f15454m > C6195b.this.f15451j && !C6195b.this.f15455n) {
                            C6195b.this.f15455n = true;
                            C3940j.m9594a().sendMessageAtFrontOfQueue(Message.obtain(C3940j.m9594a(), C6195b.this.f15459r));
                        }
                    }
                    long nanoTime2 = System.nanoTime();
                    if (C6195b.this.f15445d >= 0 && nanoTime2 - C6195b.this.f15445d > C6195b.this.f15446e && C6195b.this.f15445d != C6195b.this.f15453l) {
                        C6195b bVar = C6195b.this;
                        bVar.f15453l = bVar.f15445d;
                        C3940j.m9594a().postAtFrontOfQueue(C6195b.this.f15457p);
                    }
                } catch (Exception unused) {
                    this.f15466a = true;
                }
            }
        }

        public C6197a(String str, double d) {
            super(str);
            this.f15468c = d;
            if (C6207i.f15487e < 0) {
                C6207i.f15487e = (long) Math.ceil((double) C6207i.m13486a());
            }
            double d2 = (double) C6207i.f15487e;
            Double.isNaN(d2);
            this.f15469d = (long) (d2 * d);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|(1:15)|16|(2:19|20)) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = r8.f15442a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r3.f15434b == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r3.f15434b = r3.mo12104a(android.os.MessageQueue.class, "removeSyncBarrier", java.lang.Integer.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r2 = r3.f15434b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        m13447a(r2, null, new java.lang.Object[]{java.lang.Integer.valueOf(r9)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12105a(int r9) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.p408u.C6195b.mo12105a(int):boolean");
    }
}
