package com.bytedance.helios.sdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15372c;
import java.util.Iterator;
import java.util.LinkedList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.utils.a */
public final class C15477a {

    /* renamed from: a */
    public static final C15477a f37722a = new C15477a();

    /* renamed from: b */
    private static final LinkedList<Application.ActivityLifecycleCallbacks> f37723b = new LinkedList<>();

    /* renamed from: c */
    private static C15372c f37724c;

    /* renamed from: d */
    private static final AbstractC89244h f37725d = C89250i.m154773a((AbstractC89171a) C15478a.f37726a);

    private C15477a() {
    }

    /* renamed from: com.bytedance.helios.sdk.utils.a$a */
    static final class C15478a extends AbstractC89220m implements AbstractC89171a<C154791> {

        /* renamed from: a */
        public static final C15478a f37726a = new C15478a();

        static {
            Covode.recordClassIndex(17732);
        }

        C15478a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C154791 invoke() {
            return new Application.ActivityLifecycleCallbacks() {
                /* class com.bytedance.helios.sdk.utils.C15477a.C15478a.C154791 */

                static {
                    Covode.recordClassIndex(17733);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    C89219l.m154719c(activity, "");
                    C89219l.m154719c(bundle, "");
                }

                public final void onActivityDestroyed(Activity activity) {
                    C89219l.m154719c(activity, "");
                    C15477a.m28479e(activity);
                }

                public final void onActivityPaused(Activity activity) {
                    C89219l.m154719c(activity, "");
                    C15477a.m28477c(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    C89219l.m154719c(activity, "");
                    C15477a.m28476b(activity);
                }

                public final void onActivityStarted(Activity activity) {
                    C89219l.m154719c(activity, "");
                    C15477a.m28473a(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    C89219l.m154719c(activity, "");
                    C15477a.m28478d(activity);
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C89219l.m154719c(activity, "");
                    C15477a.m28474a(activity, bundle);
                }
            };
        }
    }

    static {
        Covode.recordClassIndex(17731);
    }

    /* renamed from: a */
    public static final void m28473a(Activity activity) {
        C89219l.m154719c(activity, "");
        C15372c cVar = new C15372c(activity, AbstractC1196i.EnumC1198a.ON_START);
        if (!C89219l.m154714a(cVar, f37724c)) {
            f37724c = cVar;
            Iterator<T> it = f37723b.iterator();
            while (it.hasNext()) {
                it.next().onActivityStarted(activity);
            }
        }
    }

    /* renamed from: b */
    public static final void m28476b(Activity activity) {
        C89219l.m154719c(activity, "");
        C15372c cVar = new C15372c(activity, AbstractC1196i.EnumC1198a.ON_RESUME);
        if (!C89219l.m154714a(cVar, f37724c)) {
            f37724c = cVar;
            Iterator<T> it = f37723b.iterator();
            while (it.hasNext()) {
                it.next().onActivityResumed(activity);
            }
        }
    }

    /* renamed from: c */
    public static final void m28477c(Activity activity) {
        C89219l.m154719c(activity, "");
        C15372c cVar = new C15372c(activity, AbstractC1196i.EnumC1198a.ON_PAUSE);
        if (!C89219l.m154714a(cVar, f37724c)) {
            f37724c = cVar;
            Iterator<T> it = f37723b.iterator();
            while (it.hasNext()) {
                it.next().onActivityPaused(activity);
            }
        }
    }

    /* renamed from: d */
    public static final void m28478d(Activity activity) {
        C89219l.m154719c(activity, "");
        C15372c cVar = new C15372c(activity, AbstractC1196i.EnumC1198a.ON_STOP);
        if (!C89219l.m154714a(cVar, f37724c)) {
            f37724c = cVar;
            Iterator<T> it = f37723b.iterator();
            while (it.hasNext()) {
                it.next().onActivityStopped(activity);
            }
        }
    }

    /* renamed from: e */
    public static final void m28479e(Activity activity) {
        C89219l.m154719c(activity, "");
        C15372c cVar = new C15372c(activity, AbstractC1196i.EnumC1198a.ON_DESTROY);
        if (!C89219l.m154714a(cVar, f37724c)) {
            f37724c = cVar;
            Iterator<T> it = f37723b.iterator();
            while (it.hasNext()) {
                it.next().onActivityDestroyed(activity);
            }
        }
    }

    /* renamed from: a */
    public static final void m28474a(Activity activity, Bundle bundle) {
        C89219l.m154719c(activity, "");
        C15372c cVar = new C15372c(activity, AbstractC1196i.EnumC1198a.ON_CREATE);
        if (!C89219l.m154714a(cVar, f37724c)) {
            f37724c = cVar;
            Iterator<T> it = f37723b.iterator();
            while (it.hasNext()) {
                it.next().onActivityCreated(activity, bundle);
            }
        }
    }

    /* renamed from: a */
    public static final void m28475a(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        MethodCollector.m26663i(5011);
        C89219l.m154719c(application, "");
        if (activityLifecycleCallbacks != null) {
            LinkedList<Application.ActivityLifecycleCallbacks> linkedList = f37723b;
            synchronized (linkedList) {
                try {
                    if (linkedList.isEmpty()) {
                        application.registerActivityLifecycleCallbacks((C15478a.C154791) f37725d.getValue());
                    }
                    linkedList.add(activityLifecycleCallbacks);
                } finally {
                    MethodCollector.m26664o(5011);
                }
            }
            return;
        }
        MethodCollector.m26664o(5011);
    }
}
