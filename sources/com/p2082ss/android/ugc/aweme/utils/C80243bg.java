package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.utils.bg */
public final class C80243bg {
    static {
        Covode.recordClassIndex(93511);
    }

    /* renamed from: a */
    public static Activity m139083a(Context context) {
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Activity m139084a(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        for (Context context = weakReference.get(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }
}
