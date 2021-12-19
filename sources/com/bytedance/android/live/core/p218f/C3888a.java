package com.bytedance.android.live.core.p218f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.a */
public final class C3888a {
    static {
        Covode.recordClassIndex(4417);
    }

    /* renamed from: a */
    public static Activity m9505a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: b */
    public static ActivityC0945e m9506b(Context context) {
        while (context != null) {
            if (context instanceof ActivityC0945e) {
                return (ActivityC0945e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
