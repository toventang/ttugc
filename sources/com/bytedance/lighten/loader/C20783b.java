package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.imagepipeline.p1879d.C24398q;

/* renamed from: com.bytedance.lighten.loader.b */
public final class C20783b implements AbstractC24093k<C24398q> {

    /* renamed from: a */
    private final ActivityManager f49172a;

    /* renamed from: b */
    private int f49173b;

    static {
        Covode.recordClassIndex(24359);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.common.p1832d.AbstractC24093k
    /* renamed from: b */
    public final /* synthetic */ C24398q mo34217b() {
        int i = this.f49173b;
        if (i <= 0) {
            int min = Math.min(this.f49172a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
            if (min < 33554432) {
                i = 4194304;
            } else if (min < 67108864) {
                i = 6291456;
            } else {
                int i2 = Build.VERSION.SDK_INT;
                i = min / 8;
            }
        }
        return new C24398q(i, 256, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public C20783b(ActivityManager activityManager, int i) {
        this.f49172a = activityManager;
        this.f49173b = i;
    }
}
