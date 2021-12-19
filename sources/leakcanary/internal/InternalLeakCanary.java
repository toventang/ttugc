package leakcanary.internal;

import android.app.Application;
import android.content.ComponentName;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicReference;
import leakcanary.AbstractC89795c;
import leakcanary.AbstractC89804h;
import leakcanary.C89792a;
import leakcanary.C89799e;
import leakcanary.internal.C89829f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;
import p4645m.C89863a;

public final class InternalLeakCanary implements AbstractC89172b<Application, C89391z>, AbstractC89804h {
    static final /* synthetic */ AbstractC89286i[] $$delegatedProperties = {new C89232y(C89204ab.m154669a(InternalLeakCanary.class), "leakDirectoryProvider", "getLeakDirectoryProvider()Lleakcanary/internal/LeakDirectoryProvider;")};
    public static final InternalLeakCanary INSTANCE = new InternalLeakCanary();
    public static Application application;
    private static volatile boolean applicationVisible;
    private static C89829f heapDumpTrigger;
    private static final AbstractC89244h leakDirectoryProvider$delegate = C89250i.m154773a((AbstractC89171a) C89815d.f203669a);

    public final C89851k getLeakDirectoryProvider() {
        return (C89851k) leakDirectoryProvider$delegate.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leakcanary.internal.InternalLeakCanary$c */
    public static final class C89814c extends AbstractC89220m implements AbstractC89171a<C89799e.C89800a> {

        /* renamed from: a */
        public static final C89814c f203668a = new C89814c();

        static {
            Covode.recordClassIndex(105911);
        }

        C89814c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89799e.C89800a invoke() {
            return C89799e.f203635a;
        }
    }

    private InternalLeakCanary() {
    }

    public final boolean getApplicationVisible() {
        return applicationVisible;
    }

    /* renamed from: leakcanary.internal.InternalLeakCanary$d */
    static final class C89815d extends AbstractC89220m implements AbstractC89171a<C89851k> {

        /* renamed from: a */
        public static final C89815d f203669a = new C89815d();

        static {
            Covode.recordClassIndex(105912);
        }

        C89815d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89851k invoke() {
            return new C89851k(InternalLeakCanary.INSTANCE.getApplication(), C898161.f203670a, C898172.f203671a);
        }
    }

    private final void disableDumpHeapInInstrumentationTests() {
        new Handler().post(RunnableC89812a.f203666a);
    }

    public final Application getApplication() {
        Application application2 = application;
        if (application2 == null) {
            C89219l.m154710a("application");
        }
        return application2;
    }

    public final C89799e.C89800a getNoInstallConfig() {
        return new C89799e.C89800a(false, 0, false, 0, 126);
    }

    public final void onDumpHeapReceived() {
        C89829f fVar = heapDumpTrigger;
        if (fVar != null) {
            fVar.f203698h.post(new C89829f.RunnableC89832c(fVar));
        }
    }

    public final /* synthetic */ <T> T noOpDelegate() {
        C89219l.m154718c();
        C89818e eVar = C89818e.f203672a;
        T t = (T) Proxy.newProxyInstance(Object.class.getClassLoader(), new Class[]{Object.class}, eVar);
        C89219l.m154718c();
        return t;
    }

    static {
        Covode.recordClassIndex(105908);
    }

    @Override // leakcanary.AbstractC89804h
    public final void onObjectRetained() {
        C89829f fVar = heapDumpTrigger;
        if (fVar == null) {
            return;
        }
        if (fVar.f203692b) {
            C89863a.AbstractC89864a aVar = C89863a.f203762a;
            if (aVar != null) {
                aVar.mo144406a("Already scheduled retained check, ignoring (" + "found new object retained" + ')');
                return;
            }
            return;
        }
        fVar.f203692b = true;
        fVar.f203698h.post(new C89829f.RunnableC89838g(fVar, "found new object retained"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leakcanary.internal.InternalLeakCanary$a */
    public static final class RunnableC89812a implements Runnable {

        /* renamed from: a */
        public static final RunnableC89812a f203666a = new RunnableC89812a();

        static {
            Covode.recordClassIndex(105909);
        }

        RunnableC89812a() {
        }

        public final void run() {
            try {
                Class<?> cls = Class.forName("androidx.test.platform.app.InstrumentationRegistry");
                C89219l.m154709a((Object) cls, "");
                Field declaredField = cls.getDeclaredField("instrumentationRef");
                C89219l.m154709a((Object) declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                } else if (((AtomicReference) obj).get() != null) {
                    C89863a.AbstractC89864a aVar = C89863a.f203762a;
                    if (aVar != null) {
                        aVar.mo144406a("Instrumentation test detected, setting LeakCanary.Config.dumpHeap to false");
                    }
                    C89799e.m155893a(C89799e.C89800a.m155894a(C89799e.f203635a, false, false, 0, false, 0, false, false, 126));
                }
            } catch (Throwable unused) {
                if (0 == 0) {
                }
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* bridge */ /* synthetic */ C89391z invoke(Application application2) {
        invoke(application2);
        return C89391z.f203057a;
    }

    public final void setApplication(Application application2) {
        C89219l.m154719c(application2, "");
        application = application2;
    }

    public static final /* synthetic */ C89829f access$getHeapDumpTrigger$p(InternalLeakCanary internalLeakCanary) {
        C89829f fVar = heapDumpTrigger;
        if (fVar == null) {
            C89219l.m154710a("heapDumpTrigger");
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leakcanary.internal.InternalLeakCanary$b */
    public static final class C89813b extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        public static final C89813b f203667a = new C89813b();

        static {
            Covode.recordClassIndex(105910);
        }

        C89813b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            InternalLeakCanary internalLeakCanary = InternalLeakCanary.INSTANCE;
            InternalLeakCanary.applicationVisible = booleanValue;
            C89829f access$getHeapDumpTrigger$p = InternalLeakCanary.access$getHeapDumpTrigger$p(InternalLeakCanary.INSTANCE);
            if (booleanValue) {
                access$getHeapDumpTrigger$p.f203696f = -1;
            } else {
                access$getHeapDumpTrigger$p.f203696f = SystemClock.uptimeMillis();
                access$getHeapDumpTrigger$p.mo144419a("app became invisible", C89792a.f203624a.f203630e);
            }
            return C89391z.f203057a;
        }
    }

    public final void invoke(Application application2) {
        C89219l.m154719c(application2, "");
        application = application2;
        C89843j.f203727e.mo144368a((AbstractC89804h) this);
        AndroidHeapDumper androidHeapDumper = new AndroidHeapDumper(application2, getLeakDirectoryProvider());
        AbstractC89795c.C89796a aVar = AbstractC89795c.C89796a.f203631a;
        C89814c cVar = C89814c.f203668a;
        HandlerThread handlerThread = new HandlerThread("LeakCanary-Heap-Dump");
        handlerThread.start();
        heapDumpTrigger = new C89829f(application2, new Handler(handlerThread.getLooper()), C89843j.f203727e, aVar, androidHeapDumper, cVar);
        C89813b bVar = C89813b.f203667a;
        C89219l.m154719c(application2, "");
        C89219l.m154719c(bVar, "");
        application2.registerActivityLifecycleCallbacks(new C89862p(bVar));
        disableDumpHeapInInstrumentationTests();
    }

    public final void setEnabledBlocking(String str, boolean z) {
        int i;
        C89219l.m154719c(str, "");
        Application application2 = application;
        if (application2 == null) {
            C89219l.m154710a("application");
        }
        ComponentName componentName = new ComponentName(application2, str);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        Application application3 = application;
        if (application3 == null) {
            C89219l.m154710a("application");
        }
        application3.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
    }

    /* renamed from: leakcanary.internal.InternalLeakCanary$e */
    public static final class C89818e implements InvocationHandler {

        /* renamed from: a */
        public static final C89818e f203672a = new C89818e();

        static {
            Covode.recordClassIndex(105915);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            return C89391z.f203057a;
        }
    }
}
