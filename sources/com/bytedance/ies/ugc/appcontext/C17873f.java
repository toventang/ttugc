package com.bytedance.ies.ugc.appcontext;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.ALog;
import java.lang.ref.WeakReference;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.appcontext.f */
public final class C17873f {

    /* renamed from: a */
    public static final C88960c<C17874a> f42625a;

    /* renamed from: b */
    static final C88960c<C17874a> f42626b;

    /* renamed from: c */
    static final C88960c<Activity> f42627c;

    /* renamed from: d */
    static final C88960c<Activity> f42628d;

    /* renamed from: e */
    static final C88960c<Activity> f42629e;

    /* renamed from: f */
    static final C88960c<Activity> f42630f;

    /* renamed from: g */
    static final C88960c<Activity> f42631g;

    /* renamed from: h */
    static final C88960c<C17874a> f42632h;

    /* renamed from: i */
    static final C88960c<Boolean> f42633i;

    /* renamed from: j */
    static final C88960c<Application> f42634j;

    /* renamed from: k */
    static final C88960c<C17875b> f42635k;

    /* renamed from: l */
    public static volatile boolean f42636l = true;

    /* renamed from: m */
    public static volatile boolean f42637m;

    /* renamed from: n */
    static int f42638n;

    /* renamed from: o */
    public static volatile long f42639o;

    /* renamed from: p */
    public static AbstractC17877d f42640p;

    /* renamed from: q */
    public static final C17873f f42641q = new C17873f();

    /* renamed from: r */
    private static WeakReference<Activity> f42642r;

    /* renamed from: com.bytedance.ies.ugc.appcontext.f$c */
    public interface AbstractC17876c {
        static {
            Covode.recordClassIndex(20477);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.f$d */
    public interface AbstractC17877d {
        static {
            Covode.recordClassIndex(20478);
        }

        /* renamed from: a */
        boolean mo28450a(Activity activity);
    }

    private C17873f() {
    }

    /* renamed from: a */
    public static AbstractC88979t<C17874a> m33092a() {
        AbstractC88979t<C17874a> i = f42626b.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: b */
    public static AbstractC88979t<Activity> m33094b() {
        AbstractC88979t<Activity> i = f42627c.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: c */
    public static AbstractC88979t<Activity> m33095c() {
        AbstractC88979t<Activity> i = f42628d.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: d */
    public static AbstractC88979t<Activity> m33096d() {
        AbstractC88979t<Activity> i = f42629e.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: e */
    public static AbstractC88979t<Activity> m33097e() {
        AbstractC88979t<Activity> i = f42630f.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: f */
    public static AbstractC88979t<Activity> m33098f() {
        AbstractC88979t<Activity> i = f42631g.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: g */
    public static AbstractC88979t<Boolean> m33099g() {
        AbstractC88979t<Boolean> i = f42633i.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: h */
    public static AbstractC88979t<C17875b> m33100h() {
        AbstractC88979t<C17875b> i = f42635k.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: i */
    public static AbstractC88979t<Application> m33101i() {
        AbstractC88979t<Application> i = f42634j.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        return i;
    }

    /* renamed from: j */
    public static Activity m33102j() {
        WeakReference<Activity> weakReference = f42642r;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(20474);
        C88960c<C17874a> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        f42625a = cVar;
        C88960c<C17874a> cVar2 = new C88960c<>();
        C89219l.m154716b(cVar2, "");
        f42626b = cVar2;
        C88960c<Activity> cVar3 = new C88960c<>();
        C89219l.m154716b(cVar3, "");
        f42627c = cVar3;
        C88960c<Activity> cVar4 = new C88960c<>();
        C89219l.m154716b(cVar4, "");
        f42628d = cVar4;
        C88960c<Activity> cVar5 = new C88960c<>();
        C89219l.m154716b(cVar5, "");
        f42629e = cVar5;
        C88960c<Activity> cVar6 = new C88960c<>();
        C89219l.m154716b(cVar6, "");
        f42630f = cVar6;
        C88960c<Activity> cVar7 = new C88960c<>();
        C89219l.m154716b(cVar7, "");
        f42631g = cVar7;
        C88960c<C17874a> cVar8 = new C88960c<>();
        C89219l.m154716b(cVar8, "");
        f42632h = cVar8;
        C88960c<Boolean> cVar9 = new C88960c<>();
        C89219l.m154716b(cVar9, "");
        f42633i = cVar9;
        C88960c<Application> cVar10 = new C88960c<>();
        C89219l.m154716b(cVar10, "");
        f42634j = cVar10;
        C88960c<C17875b> cVar11 = new C88960c<>();
        C89219l.m154716b(cVar11, "");
        f42635k = cVar11;
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.f$e */
    public static final class C17878e implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ Application f42647a;

        static {
            Covode.recordClassIndex(20479);
        }

        public C17878e(Application application) {
            this.f42647a = application;
        }

        public final void onActivityDestroyed(Activity activity) {
            String str;
            C89219l.m154721d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.m59865d("@ActivityMonitor", sb.append(str).append(" destroyed.").toString());
            if (activity instanceof AbstractC17876c) {
                C17873f.f42637m = false;
            }
            C17873f.f42631g.onNext(activity);
            if (C17873f.f42638n == 0) {
                C17873f.f42634j.onNext(this.f42647a);
            }
        }

        public final void onActivityPaused(Activity activity) {
            String str;
            C89219l.m154721d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.m59865d("@ActivityMonitor", sb.append(str).append(" paused.").toString());
            if (C17873f.f42640p != null) {
                AbstractC17877d dVar = C17873f.f42640p;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                if (dVar.mo28450a(activity)) {
                    C17873f.m33093a(null);
                }
            }
            C17873f.f42629e.onNext(activity);
        }

        public final void onActivityResumed(Activity activity) {
            String str;
            C89219l.m154721d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.m59865d("@ActivityMonitor", sb.append(str).append(" resumed.").toString());
            if (C17873f.f42640p != null) {
                AbstractC17877d dVar = C17873f.f42640p;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                if (dVar.mo28450a(activity)) {
                    C17873f.m33093a(activity);
                }
            }
            C17873f.f42628d.onNext(activity);
        }

        public final void onActivityStarted(Activity activity) {
            String str;
            C89219l.m154721d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.m59865d("@ActivityMonitor", sb.append(str).append(" started.").toString());
            int i = C17873f.f42638n + 1;
            C17873f.f42638n = i;
            if (i == 1) {
                C17873f.f42636l = false;
                C17873f.f42633i.onNext(Boolean.valueOf(C17873f.f42636l));
                C17873f.f42635k.onNext(new C17875b(activity, C17873f.f42636l));
            }
            C17873f.f42627c.onNext(activity);
        }

        public final void onActivityStopped(Activity activity) {
            String str;
            C89219l.m154721d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.m59865d("@ActivityMonitor", sb.append(str).append(" stopped.").toString());
            int i = C17873f.f42638n - 1;
            C17873f.f42638n = i;
            if (i == 0) {
                C17873f.f42636l = true;
                C17873f.f42639o = System.currentTimeMillis();
                C17873f.f42633i.onNext(Boolean.valueOf(C17873f.f42636l));
                C17873f.f42635k.onNext(new C17875b(activity, C17873f.f42636l));
            }
            C17873f.f42630f.onNext(activity);
        }

        public final void onActivityPreCreated(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
            C17873f.f42625a.onNext(new C17874a(activity, bundle));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
            C17873f.f42632h.onNext(new C17874a(activity, bundle));
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            String str;
            C89219l.m154721d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.m59865d("@ActivityMonitor", sb.append(str).append(" created.").toString());
            if (activity instanceof AbstractC17876c) {
                C17873f.f42637m = true;
            }
            C17873f.f42626b.onNext(new C17874a(activity, bundle));
        }
    }

    /* renamed from: a */
    public static void m33093a(Activity activity) {
        if (activity == null) {
            f42642r = null;
        } else {
            f42642r = new WeakReference<>(activity);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.f$a */
    public static final class C17874a {

        /* renamed from: a */
        public final Activity f42643a;

        /* renamed from: b */
        public final Bundle f42644b;

        static {
            Covode.recordClassIndex(20475);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17874a)) {
                return false;
            }
            C17874a aVar = (C17874a) obj;
            return C89219l.m154714a(this.f42643a, aVar.f42643a) && C89219l.m154714a(this.f42644b, aVar.f42644b);
        }

        public final int hashCode() {
            Activity activity = this.f42643a;
            int i = 0;
            int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
            Bundle bundle = this.f42644b;
            if (bundle != null) {
                i = bundle.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "ActivityEvent(activity=" + this.f42643a + ", bundle=" + this.f42644b + ")";
        }

        public C17874a(Activity activity, Bundle bundle) {
            this.f42643a = activity;
            this.f42644b = bundle;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.f$b */
    public static final class C17875b {

        /* renamed from: a */
        public final Activity f42645a;

        /* renamed from: b */
        public final boolean f42646b;

        static {
            Covode.recordClassIndex(20476);
        }

        public C17875b(Activity activity, boolean z) {
            this.f42645a = activity;
            this.f42646b = z;
        }
    }
}
