package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a;
import com.bytedance.ies.uikit.p1279a.C18236d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl */
public final class C38686bl {

    /* renamed from: a */
    public static final C38686bl f91401a = new C38686bl();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$a */
    public static final class ActivityC38687a extends AbstractActivityC18232a {

        /* renamed from: a */
        public static final ActivityC38687a f91402a = new ActivityC38687a();

        private ActivityC38687a() {
        }

        static {
            Covode.recordClassIndex(46228);
        }

        @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a
        public final void onStop() {
            super.onStop();
            if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
                try {
                    getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private C38686bl() {
    }

    static {
        Covode.recordClassIndex(46227);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$b */
    public static final /* synthetic */ class C38688b extends C89217j implements AbstractC89172b<Activity, C89391z> {
        static {
            Covode.recordClassIndex(46229);
        }

        public C38688b(ActivityC38687a aVar) {
            super(1, aVar, ActivityC38687a.class, "proxyPause", "proxyPause(Landroid/app/Activity;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Activity activity) {
            Activity activity2 = activity;
            C89219l.m154721d(activity2, "");
            C89219l.m154721d(activity2, "");
            C18236d.AbstractC18237a a = C18236d.m33937a();
            if (a != null) {
                a.mo29098b(activity2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$c */
    public static final /* synthetic */ class C38689c extends C89217j implements AbstractC89172b<Activity, C89391z> {
        static {
            Covode.recordClassIndex(46230);
        }

        public C38689c(ActivityC38687a aVar) {
            super(1, aVar, ActivityC38687a.class, "proxyResume", "proxyResume(Landroid/app/Activity;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Activity activity) {
            Activity activity2 = activity;
            C89219l.m154721d(activity2, "");
            C89219l.m154721d(activity2, "");
            C18236d.AbstractC18237a a = C18236d.m33937a();
            if (a != null) {
                a.mo29097a(activity2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$d */
    public static final /* synthetic */ class C38690d extends C89217j implements AbstractC89172b<Activity, C89391z> {
        static {
            Covode.recordClassIndex(46231);
        }

        public C38690d(ActivityC38687a aVar) {
            super(1, aVar, ActivityC38687a.class, "proxyStart", "proxyStart(Landroid/app/Activity;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Activity activity) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(activity, "");
            AbstractActivityC18232a.f43428k++;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$e */
    public static final /* synthetic */ class C38691e extends C89217j implements AbstractC89172b<Activity, C89391z> {
        static {
            Covode.recordClassIndex(46232);
        }

        public C38691e(ActivityC38687a aVar) {
            super(1, aVar, ActivityC38687a.class, "proxyStop", "proxyStop(Landroid/app/Activity;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Activity activity) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(activity, "");
            AbstractActivityC18232a.f43428k--;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m78501a(Activity activity, AbstractC89172b<? super Activity, C89391z> bVar) {
        Class<?> cls;
        String canonicalName;
        if (!(activity instanceof AbstractActivityC18232a) && activity != null && (cls = activity.getClass()) != null && (canonicalName = cls.getCanonicalName()) != null && C89361p.m154874b(canonicalName, "com.rocket.", false)) {
            bVar.invoke(activity);
        }
    }
}
