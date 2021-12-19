package com.bytedance.lottie.p1505f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lottie.f.b */
public final class C21080b {
    static {
        Covode.recordClassIndex(24696);
    }

    /* renamed from: a */
    public static Activity m39686a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
