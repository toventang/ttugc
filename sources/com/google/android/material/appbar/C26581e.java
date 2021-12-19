package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.e */
public final class C26581e {

    /* renamed from: a */
    static final int[] f62756a = {16843848};

    static {
        Covode.recordClassIndex(32018);
    }

    /* renamed from: a */
    private static int m52690a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.a3);
        if (matchConfig == null) {
            return resources.getInteger(R.integer.a3);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(R.integer.a3);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i = 0; i < min; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(R.integer.a3);
        }
    }

    /* renamed from: a */
    static void m52691a(View view, float f) {
        int a = m52690a(view.getResources());
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) a;
        stateListAnimator.addState(new int[]{16842766, R.attr.afg, -2130970174}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
