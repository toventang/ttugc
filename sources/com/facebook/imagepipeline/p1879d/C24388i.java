package com.facebook.imagepipeline.p1879d;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24093k;

/* renamed from: com.facebook.imagepipeline.d.i */
public class C24388i implements AbstractC24093k<C24398q> {

    /* renamed from: a */
    private final ActivityManager f57841a;

    static {
        Covode.recordClassIndex(28531);
    }

    /* renamed from: a */
    public C24398q mo34217b() {
        int i;
        int min = Math.min(this.f57841a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i = 4194304;
        } else if (min < 67108864) {
            i = 6291456;
        } else {
            int i2 = Build.VERSION.SDK_INT;
            i = min / 4;
        }
        return new C24398q(i, 256, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public C24388i(ActivityManager activityManager) {
        this.f57841a = activityManager;
    }
}
