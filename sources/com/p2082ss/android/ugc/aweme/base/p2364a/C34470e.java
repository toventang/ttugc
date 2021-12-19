package com.p2082ss.android.ugc.aweme.base.p2364a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.a.e */
public final class C34470e {
    static {
        Covode.recordClassIndex(41423);
    }

    /* renamed from: a */
    public static final Activity m70451a(Context context) {
        while (context != null && !(context instanceof Application)) {
            if (!(context instanceof Activity)) {
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                    if (context == null) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return (Activity) context;
            }
        }
        return null;
    }
}
