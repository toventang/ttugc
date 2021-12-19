package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.b */
public final class C53580b {

    /* renamed from: a */
    public static final C53580b f122988a = new C53580b();

    private C53580b() {
    }

    static {
        Covode.recordClassIndex(63156);
    }

    /* renamed from: a */
    public static Activity m98792a(WeakReference<Context> weakReference) {
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
