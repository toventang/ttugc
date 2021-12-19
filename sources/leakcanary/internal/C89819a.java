package leakcanary.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Proxy;
import leakcanary.C89792a;
import leakcanary.C89802g;
import leakcanary.internal.C89843j;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: leakcanary.internal.a */
public final class C89819a {

    /* renamed from: d */
    public static final C89820a f203673d = new C89820a((byte) 0);

    /* renamed from: a */
    public final C89821b f203674a;

    /* renamed from: b */
    public final C89802g f203675b;

    /* renamed from: c */
    public final AbstractC89171a<C89792a.C89793a> f203676c;

    static {
        Covode.recordClassIndex(105916);
    }

    /* renamed from: leakcanary.internal.a$a */
    public static final class C89820a {
        static {
            Covode.recordClassIndex(105917);
        }

        private C89820a() {
        }

        public /* synthetic */ C89820a(byte b) {
            this();
        }
    }

    /* renamed from: leakcanary.internal.a$b */
    public static final class C89821b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C89819a f203677a;

        /* renamed from: b */
        private final /* synthetic */ Application.ActivityLifecycleCallbacks f203678b;

        static {
            Covode.recordClassIndex(105918);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            this.f203678b.onActivityCreated(activity, bundle);
        }

        public final void onActivityPaused(Activity activity) {
            this.f203678b.onActivityPaused(activity);
        }

        public final void onActivityResumed(Activity activity) {
            this.f203678b.onActivityResumed(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            this.f203678b.onActivitySaveInstanceState(activity, bundle);
        }

        public final void onActivityStarted(Activity activity) {
            this.f203678b.onActivityStarted(activity);
        }

        public final void onActivityStopped(Activity activity) {
            this.f203678b.onActivityStopped(activity);
        }

        public final void onActivityDestroyed(Activity activity) {
            C89219l.m154719c(activity, "");
            if (this.f203677a.f203676c.invoke().f203627b) {
                this.f203677a.f203675b.mo144366a(activity);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89821b(C89819a aVar) {
            this.f203677a = aVar;
            C89843j.C89849f fVar = C89843j.C89849f.f203736a;
            Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, fVar);
            if (newProxyInstance != null) {
                this.f203678b = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    private C89819a(C89802g gVar, AbstractC89171a<C89792a.C89793a> aVar) {
        this.f203675b = gVar;
        this.f203676c = aVar;
        this.f203674a = new C89821b(this);
    }

    public /* synthetic */ C89819a(C89802g gVar, AbstractC89171a aVar, byte b) {
        this(gVar, aVar);
    }
}
