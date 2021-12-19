package com.bytedance.android.ecommerce.p165k;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.k.k */
public final class C2840k {
    static {
        Covode.recordClassIndex(3266);
    }

    /* renamed from: a */
    public static void m8119a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
