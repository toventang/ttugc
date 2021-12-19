package leakcanary.internal;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import leakcanary.AbstractC89794b;
import leakcanary.AbstractC89804h;
import leakcanary.C89792a;
import leakcanary.C89802g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: leakcanary.internal.j */
public final class C89843j {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f203723a = {new C89232y(C89204ab.m154669a(C89843j.class), "isDebuggableBuild", "isDebuggableBuild()Z")};

    /* renamed from: b */
    public static final AbstractC89172b<Application, C89391z> f203724b;

    /* renamed from: c */
    public static Application f203725c;

    /* renamed from: d */
    static final Handler f203726d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public static final C89802g f203727e;

    /* renamed from: f */
    public static final C89843j f203728f = new C89843j();

    /* renamed from: g */
    private static final AbstractC89244h f203729g = C89250i.m154773a((AbstractC89171a) C89848e.f203735a);

    /* renamed from: h */
    private static final C89846c f203730h = new C89846c();

    /* renamed from: i */
    private static final Executor f203731i;

    /* renamed from: leakcanary.internal.j$a */
    public static final class C89844a implements AbstractC89172b<Application, C89391z>, AbstractC89804h {

        /* renamed from: b */
        public static final C89844a f203732b = new C89844a();

        @Override // leakcanary.AbstractC89804h
        public final void onObjectRetained() {
        }

        private C89844a() {
        }

        static {
            Covode.recordClassIndex(105941);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Application application) {
            C89219l.m154719c(application, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: leakcanary.internal.j$c */
    public static final class C89846c implements AbstractC89794b {
        static {
            Covode.recordClassIndex(105943);
        }

        C89846c() {
        }

        @Override // leakcanary.AbstractC89794b
        /* renamed from: a */
        public final long mo144358a() {
            return SystemClock.uptimeMillis();
        }
    }

    /* renamed from: leakcanary.internal.j$d */
    public static final class C89847d extends AbstractC89220m implements AbstractC89171a<C89792a.C89793a> {

        /* renamed from: a */
        public static final C89847d f203734a = new C89847d();

        static {
            Covode.recordClassIndex(105944);
        }

        C89847d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89792a.C89793a invoke() {
            return C89792a.f203624a;
        }
    }

    private C89843j() {
    }

    /* renamed from: a */
    public static boolean m155924a() {
        if (f203725c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: leakcanary.internal.j$g */
    static final class C89850g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C89850g f203737a = new C89850g();

        static {
            Covode.recordClassIndex(105947);
        }

        C89850g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C89792a.f203624a.f203626a);
        }
    }

    /* renamed from: leakcanary.internal.j$e */
    static final class C89848e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C89848e f203735a = new C89848e();

        static {
            Covode.recordClassIndex(105945);
        }

        C89848e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Application application = C89843j.f203725c;
            if (application == null) {
                C89219l.m154710a("application");
            }
            if ((application.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Object obj;
        Covode.recordClassIndex(105940);
        try {
            Class<?> cls = Class.forName("leakcanary.internal.InternalLeakCanary");
            C89219l.m154709a((Object) cls, "");
            obj = cls.getDeclaredField("INSTANCE").get(null);
        } catch (Throwable unused) {
            obj = C89844a.f203732b;
        }
        if (obj != null) {
            f203724b = (AbstractC89172b) C89206ad.m154679b(obj, 1);
            ExecutorC89845b bVar = ExecutorC89845b.f203733a;
            f203731i = bVar;
            f203727e = new C89802g(f203730h, bVar, C89850g.f203737a);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: leakcanary.internal.j$b */
    static final class ExecutorC89845b implements Executor {

        /* renamed from: a */
        public static final ExecutorC89845b f203733a = new ExecutorC89845b();

        static {
            Covode.recordClassIndex(105942);
        }

        ExecutorC89845b() {
        }

        public final void execute(Runnable runnable) {
            C89843j.f203726d.postDelayed(runnable, C89792a.f203624a.f203630e);
        }
    }

    /* renamed from: leakcanary.internal.j$f */
    public static final class C89849f implements InvocationHandler {

        /* renamed from: a */
        public static final C89849f f203736a = new C89849f();

        static {
            Covode.recordClassIndex(105946);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            return C89391z.f203057a;
        }
    }
}
