package com.bytedance.android.monitorV2.p740l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitorV2.l.a */
public final class C12124a {
    static {
        Covode.recordClassIndex(13853);
    }

    /* renamed from: a */
    public static Activity m21625a(View view) {
        return m21624a(view.getContext());
    }

    /* renamed from: a */
    public static Activity m21624a(Context context) {
        while (context instanceof ContextWrapper) {
            try {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
                return null;
            }
        }
        return null;
    }
}
