package leakcanary.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Proxy;
import leakcanary.internal.InternalLeakCanary;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: leakcanary.internal.p */
public final class C89862p implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private int f203758a;

    /* renamed from: b */
    private boolean f203759b;

    /* renamed from: c */
    private final AbstractC89172b<Boolean, C89391z> f203760c;

    /* renamed from: d */
    private final /* synthetic */ Application.ActivityLifecycleCallbacks f203761d;

    static {
        Covode.recordClassIndex(105959);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f203761d.onActivityCreated(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f203761d.onActivityDestroyed(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f203761d.onActivityPaused(activity);
    }

    public final void onActivityResumed(Activity activity) {
        this.f203761d.onActivityResumed(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f203761d.onActivitySaveInstanceState(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
        C89219l.m154719c(activity, "");
        int i = this.f203758a + 1;
        this.f203758a = i;
        if (!this.f203759b && i == 1) {
            this.f203759b = true;
            this.f203760c.invoke(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89862p(AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        InternalLeakCanary.C89818e eVar = InternalLeakCanary.C89818e.f203672a;
        Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, eVar);
        if (newProxyInstance != null) {
            this.f203761d = (Application.ActivityLifecycleCallbacks) newProxyInstance;
            this.f203760c = bVar;
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void onActivityStopped(Activity activity) {
        C89219l.m154719c(activity, "");
        int i = this.f203758a;
        if (i > 0) {
            this.f203758a = i - 1;
        }
        if (this.f203759b && this.f203758a == 0 && !activity.isChangingConfigurations()) {
            this.f203759b = false;
            this.f203760c.invoke(false);
        }
    }
}
