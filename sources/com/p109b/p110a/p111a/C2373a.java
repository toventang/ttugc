package com.p109b.p110a.p111a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p109b.p110a.p113c.C2377a;

/* renamed from: com.b.a.a.a */
public final class C2373a implements Application.ActivityLifecycleCallbacks {
    static {
        Covode.recordClassIndex(2651);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        MethodCollector.m26663i(11406);
        System.currentTimeMillis();
        if (!C2374b.f7216a) {
            MethodCollector.m26664o(11406);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int i = 0;
        while (true) {
            if (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) instanceof C2377a) {
                    break;
                }
                i++;
            } else {
                C2377a aVar = new C2377a(activity);
                aVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    viewGroup.removeView(childAt);
                    aVar.addView(childAt);
                }
                viewGroup.addView(aVar, 0);
            }
        }
        System.currentTimeMillis();
        MethodCollector.m26664o(11406);
    }
}
