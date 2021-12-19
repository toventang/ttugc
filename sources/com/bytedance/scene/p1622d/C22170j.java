package com.bytedance.scene.p1622d;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.d.j */
public final class C22170j {
    static {
        Covode.recordClassIndex(25974);
    }

    /* renamed from: a */
    public static void m41654a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This method must call on main thread");
        }
    }
}
