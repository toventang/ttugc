package com.bytedance.android.monitor.p714l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitor.l.a */
public final class C11947a {
    static {
        Covode.recordClassIndex(13673);
    }

    /* renamed from: a */
    public static Activity m21085a(View view) {
        return m21084a(view.getContext());
    }

    /* renamed from: a */
    public static Activity m21084a(Context context) {
        while (context instanceof ContextWrapper) {
            try {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
                return null;
            }
        }
        return null;
    }
}
