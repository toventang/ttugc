package leakcanary.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Proxy;
import java.util.List;
import leakcanary.internal.C89843j;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: leakcanary.internal.d */
public final class C89826d {

    /* renamed from: a */
    public static final C89826d f203685a = new C89826d();

    private C89826d() {
    }

    static {
        Covode.recordClassIndex(105923);
    }

    /* renamed from: a */
    public static boolean m155911a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: leakcanary.internal.d$a */
    public static final class C89827a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ List f203686a;

        /* renamed from: b */
        private final /* synthetic */ Application.ActivityLifecycleCallbacks f203687b;

        static {
            Covode.recordClassIndex(105924);
        }

        public final void onActivityDestroyed(Activity activity) {
            this.f203687b.onActivityDestroyed(activity);
        }

        public final void onActivityPaused(Activity activity) {
            this.f203687b.onActivityPaused(activity);
        }

        public final void onActivityResumed(Activity activity) {
            this.f203687b.onActivityResumed(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            this.f203687b.onActivitySaveInstanceState(activity, bundle);
        }

        public final void onActivityStarted(Activity activity) {
            this.f203687b.onActivityStarted(activity);
        }

        public final void onActivityStopped(Activity activity) {
            this.f203687b.onActivityStopped(activity);
        }

        public C89827a(List list) {
            this.f203686a = list;
            C89843j.C89849f fVar = C89843j.C89849f.f203736a;
            Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, fVar);
            if (newProxyInstance != null) {
                this.f203687b = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C89219l.m154719c(activity, "");
            for (AbstractC89172b bVar : this.f203686a) {
                bVar.invoke(activity);
            }
        }
    }
}
