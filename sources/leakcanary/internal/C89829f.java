package leakcanary.internal;

import android.app.Application;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.File;
import java.lang.reflect.Field;
import leakcanary.AbstractC89795c;
import leakcanary.C89792a;
import leakcanary.C89797d;
import leakcanary.C89799e;
import leakcanary.C89802g;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4645m.C89863a;

/* renamed from: leakcanary.internal.f */
public final class C89829f {

    /* renamed from: l */
    public static final C89830a f203690l = new C89830a((byte) 0);

    /* renamed from: a */
    public final long f203691a = 300000;

    /* renamed from: b */
    public volatile boolean f203692b;

    /* renamed from: c */
    public int f203693c;

    /* renamed from: d */
    public FileObserver f203694d;

    /* renamed from: e */
    public final AbstractC89171a<C89391z> f203695e = new C89836e(this);

    /* renamed from: f */
    volatile long f203696f = -1;

    /* renamed from: g */
    public final Application f203697g;

    /* renamed from: h */
    public final Handler f203698h;

    /* renamed from: i */
    public final C89802g f203699i;

    /* renamed from: j */
    public final AbstractC89795c f203700j;

    /* renamed from: k */
    public final AbstractC89841h f203701k;

    /* renamed from: m */
    private final AbstractC89171a<C89391z> f203702m = new C89837f(this);

    /* renamed from: n */
    private final AbstractC89171a<C89799e.C89800a> f203703n;

    static {
        Covode.recordClassIndex(105926);
    }

    /* renamed from: leakcanary.internal.f$a */
    public static final class C89830a {
        static {
            Covode.recordClassIndex(105927);
        }

        private C89830a() {
        }

        public /* synthetic */ C89830a(byte b) {
            this();
        }
    }

    /* renamed from: leakcanary.internal.f$e */
    static final class C89836e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89829f f203716a;

        static {
            Covode.recordClassIndex(105933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89836e(C89829f fVar) {
            super(0);
            this.f203716a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f203716a.mo144423e();
            return C89391z.f203057a;
        }
    }

    /* renamed from: leakcanary.internal.f$f */
    static final class C89837f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89829f f203717a;

        static {
            Covode.recordClassIndex(105934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89837f(C89829f fVar) {
            super(0);
            this.f203717a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f203717a.mo144422d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: leakcanary.internal.f$g */
    static final class RunnableC89838g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89829f f203718a;

        /* renamed from: b */
        final /* synthetic */ String f203719b;

        static {
            Covode.recordClassIndex(105935);
        }

        RunnableC89838g(C89829f fVar, String str) {
            this.f203718a = fVar;
            this.f203719b = str;
        }

        public final void run() {
            this.f203718a.f203692b = false;
            this.f203718a.mo144418a(this.f203719b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leakcanary.internal.f$h */
    public static final class RunnableC89839h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89829f f203720a;

        /* renamed from: b */
        final /* synthetic */ String f203721b;

        static {
            Covode.recordClassIndex(105936);
        }

        RunnableC89839h(C89829f fVar, String str) {
            this.f203720a = fVar;
            this.f203721b = str;
        }

        public final void run() {
            this.f203720a.f203692b = false;
            this.f203720a.mo144418a(this.f203721b);
        }
    }

    /* renamed from: b */
    public final void mo144420b() {
        this.f203698h.postDelayed(new RunnableC89835d(this), this.f203691a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leakcanary.internal.f$d */
    public static final class RunnableC89835d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89829f f203715a;

        static {
            Covode.recordClassIndex(105932);
        }

        RunnableC89835d(C89829f fVar) {
            this.f203715a = fVar;
        }

        public final void run() {
            if (!C89797d.f203632a) {
                C89792a.m155885a(C89792a.C89793a.m155886a(C89792a.f203624a, true, false, false, false, 0, 30));
            } else {
                this.f203715a.mo144420b();
            }
        }
    }

    /* renamed from: a */
    public final NotificationManager mo144417a() {
        Object a = m155914a(this.f203697g, "notification");
        if (a != null) {
            return (NotificationManager) a;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: c */
    public final void mo144421c() {
        C89863a.AbstractC89864a aVar = C89863a.f203762a;
        if (aVar != null) {
            aVar.mo144406a("Failed to dump heap, will retry in 5000 ms");
        }
        mo144419a("failed to dump heap", 5000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [leakcanary.internal.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo144422d() {
        /*
            r3 = this;
            android.os.Handler r2 = r3.f203698h
            h.f.a.a<h.z> r1 = r3.f203702m
            if (r1 == 0) goto L_0x000c
            leakcanary.internal.g r0 = new leakcanary.internal.g
            r0.<init>(r1)
            r1 = r0
        L_0x000c:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.removeCallbacks(r1)
            android.app.NotificationManager r1 = r3.mo144417a()
            r0 = -101110101(0xfffffffff9f92eab, float:-1.6172856E35)
            r1.cancel(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.C89829f.mo144422d():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [leakcanary.internal.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo144423e() {
        /*
            r3 = this;
            android.os.Handler r2 = r3.f203698h
            h.f.a.a<h.z> r1 = r3.f203695e
            if (r1 == 0) goto L_0x000c
            leakcanary.internal.g r0 = new leakcanary.internal.g
            r0.<init>(r1)
            r1 = r0
        L_0x000c:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.removeCallbacks(r1)
            android.app.NotificationManager r1 = r3.mo144417a()
            r0 = -1000111(0xfffffffffff0bd51, float:NaN)
            r1.cancel(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.C89829f.mo144423e():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leakcanary.internal.f$c */
    public static final class RunnableC89832c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89829f f203708a;

        /* renamed from: b */
        final /* synthetic */ boolean f203709b = true;

        static {
            Covode.recordClassIndex(105929);
        }

        RunnableC89832c(C89829f fVar) {
            this.f203708a = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v34, types: [leakcanary.internal.g] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 426
            */
            throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.C89829f.RunnableC89832c.run():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [leakcanary.internal.g] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if ((android.os.SystemClock.uptimeMillis() - r0) < leakcanary.C89792a.f203624a.f203630e) goto L_0x0073;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo144418a(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.C89829f.mo144418a(java.lang.String):void");
    }

    /* renamed from: leakcanary.internal.f$b */
    public static final class FileObserverC89831b extends FileObserver {

        /* renamed from: a */
        final /* synthetic */ C89829f f203704a;

        /* renamed from: b */
        final /* synthetic */ File f203705b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f203706c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89842i f203707d;

        static {
            Covode.recordClassIndex(105928);
        }

        public final void onEvent(int i, String str) {
            if (i != 8) {
                return;
            }
            if (this.f203705b == null) {
                this.f203704a.mo144421c();
                return;
            }
            C89863a.AbstractC89864a aVar = C89863a.f203762a;
            if (aVar != null) {
                aVar.mo144406a("HeapAnalyzerService.runAnalysis");
            }
            C89797d.m155891a(this.f203704a.f203697g, this.f203705b);
            this.f203704a.mo144420b();
            stopWatching();
            this.f203707d.mo144383b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        FileObserverC89831b(C89829f fVar, File file, C89233z.C89236c cVar, AbstractC89842i iVar, String str) {
            super(str, 4095);
            this.f203704a = fVar;
            this.f203705b = file;
            this.f203706c = cVar;
            this.f203707d = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144419a(String str, long j) {
        if (this.f203692b) {
            C89863a.AbstractC89864a aVar = C89863a.f203762a;
            if (aVar != null) {
                aVar.mo144406a("Already scheduled retained check, ignoring (" + str + ')');
                return;
            }
            return;
        }
        this.f203692b = true;
        this.f203698h.postDelayed(new RunnableC89839h(this, str), j);
    }

    /* renamed from: a */
    private static Object m155914a(Application application, String str) {
        Object obj;
        MethodCollector.m26663i(4242);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = application.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = application.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(4242);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    public C89829f(Application application, Handler handler, C89802g gVar, AbstractC89795c cVar, AbstractC89841h hVar, AbstractC89171a<C89799e.C89800a> aVar) {
        C89219l.m154719c(application, "");
        C89219l.m154719c(handler, "");
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(aVar, "");
        this.f203697g = application;
        this.f203698h = handler;
        this.f203699i = gVar;
        this.f203700j = cVar;
        this.f203701k = hVar;
        this.f203703n = aVar;
    }
}
