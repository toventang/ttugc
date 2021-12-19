package com.bytedance.analytics.page;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.analytics.C2576a;
import com.bytedance.analytics.C2592b;
import com.bytedance.analytics.p124a.C2581b;
import com.bytedance.analytics.p124a.GestureDetector$OnGestureListenerC2589g;
import com.bytedance.analytics.p125b.C2593a;
import com.bytedance.analytics.p125b.C2594b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.analytics.page.j */
public final class C2607j implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static final C2607j f7852a = new C2607j();

    /* renamed from: b */
    public static WeakReference<Activity> f7853b;

    static {
        Covode.recordClassIndex(2995);
    }

    public final void onActivityPaused(Activity activity) {
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

    private C2607j() {
    }

    public final void onActivityResumed(Activity activity) {
        C89219l.m154721d(activity, "");
        f7853b = new WeakReference<>(activity);
        m7555a(activity);
    }

    /* renamed from: a */
    private static void m7555a(Activity activity) {
        MethodCollector.m26663i(6104);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        if (viewGroup != null && viewGroup.getChildCount() > 0 && !(viewGroup.getChildAt(0) instanceof GestureDetector$OnGestureListenerC2589g)) {
            GestureDetector$OnGestureListenerC2589g gVar = new GestureDetector$OnGestureListenerC2589g(activity);
            while (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                viewGroup.removeViewAt(0);
                gVar.addView(childAt, childAt.getLayoutParams());
            }
            viewGroup.addView(gVar, new ViewGroup.LayoutParams(-1, -1));
        }
        MethodCollector.m26664o(6104);
    }

    public final void onActivityDestroyed(Activity activity) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(activity, "");
        String valueOf = String.valueOf(activity.hashCode());
        HashSet hashSet = new HashSet();
        C2602f fVar = null;
        C2602f fVar2 = null;
        for (C2602f fVar3 : C2603g.f7844c.values()) {
            if (fVar3.f7827g && TextUtils.equals(fVar3.f7829i, valueOf)) {
                if (C89219l.m154714a(C2603g.f7843b, fVar3)) {
                    fVar2 = fVar3;
                } else {
                    hashSet.add(fVar3);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C2602f fVar4 = (C2602f) it.next();
            if (!C89219l.m154714a(fVar4, fVar2)) {
                C89219l.m154716b(fVar4, "");
                C2603g.m7552a(fVar4);
            }
        }
        if (fVar2 != null) {
            C2602f fVar5 = C2603g.f7846e.get(valueOf);
            if (fVar5 != null) {
                fVar = fVar5.f7823c;
            }
            C2603g.f7846e.remove(valueOf);
            fVar2.f7823c = fVar;
            if (fVar != null) {
                fVar.f7841u = fVar2;
            }
            C2603g.m7550a(fVar2.f7821a);
        }
        C89219l.m154721d(activity, "");
        C2581b.f7787c.remove(Integer.valueOf(activity.hashCode()));
        C2581b.f7788d.remove(Integer.valueOf(activity.hashCode()));
        if (activity instanceof AbstractC2597b) {
            AbstractC2597b bVar = (AbstractC2597b) activity;
            C89219l.m154721d(bVar, "");
            C2603g.m7550a(bVar.ag_());
        } else {
            AbstractC2598c<Activity> cVar = C2601e.f7820b;
            if (cVar != null) {
                C2576a a = cVar.mo7086a(activity);
                C89219l.m154721d(a, "");
                C2603g.m7550a(a.f7762b);
            }
        }
        C89219l.m154721d(activity, "");
        AbstractC89183m<? super String, ? super String, C89391z> mVar = C2594b.f7812b;
        if (mVar != null) {
            mVar.invoke("BTMLogTag_ActivityLife", C89219l.m154704a("onDestroy ", (Object) activity.getClass().getName()));
        }
        if (activity instanceof ActivityC0218d) {
            ((ActivityC0945e) activity).getSupportFragmentManager().mo3554a(C2608k.f7854a);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        if (activity instanceof ActivityC0218d) {
            ((ActivityC0945e) activity).getSupportFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) C2608k.f7854a, true);
        }
        if (activity instanceof AbstractC2597b) {
            C2592b.m7537a((AbstractC2597b) activity);
        } else {
            AbstractC2598c<Activity> cVar = C2601e.f7820b;
            if (cVar != null) {
                C2592b.m7536a(cVar.mo7086a(activity));
            }
        }
        if (activity.getComponentName() != null) {
            String className = activity.getComponentName().getClassName();
            C89219l.m154716b(className, "");
            C89219l.m154721d(className, "");
            HashMap hashMap = new HashMap();
            hashMap.put("btm_activity", className);
            AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar = C2593a.f7810b;
            if (mVar != null) {
                mVar.invoke("activity", hashMap);
            }
        }
        C89219l.m154721d(activity, "");
        AbstractC89183m<? super String, ? super String, C89391z> mVar2 = C2594b.f7812b;
        if (mVar2 != null) {
            mVar2.invoke("BTMLogTag_ActivityLife", C89219l.m154704a("onCreate ", (Object) activity.getClass().getName()));
        }
    }
}
