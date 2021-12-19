package com.bytedance.android.livesdk.util;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.util.b */
public final class C11117b {

    /* renamed from: a */
    static Set<Class<? extends Activity>> f26725a = new HashSet();

    static {
        Covode.recordClassIndex(12741);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Set<java.lang.Class<? extends android.app.Activity>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m19749a(Activity activity) {
        if (activity != null) {
            f26725a.add(activity.getClass());
        }
    }
}
