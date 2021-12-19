package com.p2082ss.android.sdk.webview;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.sdk.webview.d */
public final class C30246d {
    static {
        Covode.recordClassIndex(36757);
    }

    /* renamed from: a */
    public static Context m61213a(Context context) {
        while (context != null) {
            if ((context instanceof Activity) || !(context instanceof ContextWrapper)) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: b */
    public static Activity m61215b(WeakReference<Context> weakReference) {
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

    /* renamed from: a */
    public static Context m61214a(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        Context context = weakReference.get();
        while (context != null) {
            if ((context instanceof Activity) || !(context instanceof ContextWrapper)) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
