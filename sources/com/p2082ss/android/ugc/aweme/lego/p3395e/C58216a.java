package com.p2082ss.android.ugc.aweme.lego.p3395e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.p3390a.AbstractC58142d;
import com.p2082ss.android.ugc.aweme.lego.p3394d.C58205b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.e.a */
public final class C58216a {

    /* renamed from: a */
    public Context f132563a;

    /* renamed from: b */
    public final Map<String, AbstractC58258q> f132564b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map<Class<? extends Activity>, WeakReference<Activity>> f132565c = new HashMap();

    /* renamed from: d */
    private final Map<String, AbstractC58258q> f132566d = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(68283);
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.e.a$a */
    public final class C58217a implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(68284);
        }

        public final void onActivityPaused(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityResumed(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
        }

        public final void onActivityStarted(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        public final void onActivityStopped(Activity activity) {
            C89219l.m154721d(activity, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C58217a() {
        }

        public final void onActivityDestroyed(Activity activity) {
            C89219l.m154721d(activity, "");
            C58216a.this.f132565c.remove(activity.getClass());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.Class<? extends android.app.Activity>, java.lang.ref.WeakReference<android.app.Activity>> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
            C58216a.this.f132565c.put(activity.getClass(), new WeakReference(activity));
        }
    }

    /* renamed from: a */
    public final <T> T mo95669a(String str) {
        T t;
        MethodCollector.m26663i(5537);
        C89219l.m154721d(str, "");
        synchronized (this.f132564b) {
            try {
                t = (T) this.f132564b.get(str);
            } finally {
                MethodCollector.m26664o(5537);
            }
        }
        if (t == null) {
            t = (T) mo95671b(str);
        }
        return t;
    }

    /* renamed from: b */
    public final AbstractC58258q mo95671b(String str) {
        AbstractC58258q qVar;
        MethodCollector.m26663i(5541);
        C89219l.m154721d(str, "");
        AbstractC58258q qVar2 = this.f132566d.get(str);
        if (qVar2 == null) {
            C89219l.m154715b();
        }
        AbstractC58258q qVar3 = qVar2;
        synchronized (qVar3) {
            try {
                if (!this.f132564b.containsKey(str)) {
                    if (C58205b.f132531a || C58205b.m105117a(qVar3)) {
                        if (this.f132563a == null) {
                            C89219l.m154710a("context");
                        }
                        Context context = this.f132563a;
                        if (context == null) {
                            C89219l.m154710a("context");
                        }
                        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, (int) R.style.nz);
                        WeakReference<Activity> weakReference = this.f132565c.get(qVar3.mo28743b());
                        Activity activity = null;
                        if (weakReference != null) {
                            activity = weakReference.get();
                        }
                        AbstractC58142d dVar = C58221f.f132583g;
                        if (dVar != null) {
                            dVar.mo95650a(qVar3);
                        }
                        qVar3.mo28741a(contextThemeWrapper, activity);
                        AbstractC58142d dVar2 = C58221f.f132583g;
                        if (dVar2 != null) {
                            dVar2.mo95651b(qVar3);
                        }
                    }
                    synchronized (this.f132564b) {
                        try {
                            this.f132564b.put(str, qVar3);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                AbstractC58258q qVar4 = this.f132564b.get(str);
                if (qVar4 == null) {
                    C89219l.m154715b();
                }
                qVar = qVar4;
            } finally {
                MethodCollector.m26664o(5541);
            }
        }
        MethodCollector.m26664o(5541);
        return qVar;
    }

    /* renamed from: a */
    public final void mo95670a(String str, AbstractC58258q qVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(qVar, "");
        if (!this.f132566d.containsKey(str)) {
            this.f132566d.put(str, qVar);
        }
    }
}
