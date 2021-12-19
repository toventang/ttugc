package com.p2082ss.android.ugc.aweme.base.utils;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.utils.h */
public final class C34722h {
    static {
        Covode.recordClassIndex(41714);
    }

    /* renamed from: a */
    public static int m70921a(int i) {
        return C17867d.m33078a().getResources().getColor(i);
    }

    /* renamed from: b */
    public static String m70923b(int i) {
        return C17867d.m33078a().getResources().getString(i);
    }

    /* renamed from: a */
    public static int m70922a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.ar);
        if (matchConfig == null) {
            return resources.getInteger(R.integer.ar);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(R.integer.ar);
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
            return resources.getInteger(R.integer.ar);
        }
    }
}
