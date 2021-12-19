package com.facebook.imagepipeline.p1879d;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.EnumC24105b;
import com.facebook.imagepipeline.p1879d.C24382h;

/* renamed from: com.facebook.imagepipeline.d.d */
public final class C24371d implements C24382h.AbstractC24385a {
    static {
        Covode.recordClassIndex(28514);
    }

    /* renamed from: com.facebook.imagepipeline.d.d$1 */
    static /* synthetic */ class C243721 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57798a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 28515(0x6f63, float:3.9958E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.common.g.b[] r0 = com.facebook.common.p1835g.EnumC24105b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.p1879d.C24371d.C243721.f57798a = r2
                com.facebook.common.g.b r0 = com.facebook.common.p1835g.EnumC24105b.OnCloseToDalvikHeapLimit     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.p1879d.C24371d.C243721.f57798a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.common.g.b r0 = com.facebook.common.p1835g.EnumC24105b.OnAppBackgrounded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imagepipeline.p1879d.C24371d.C243721.f57798a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.common.g.b r0 = com.facebook.common.p1835g.EnumC24105b.OnSystemMemoryCriticallyLowWhileAppInForeground     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imagepipeline.p1879d.C24371d.C243721.f57798a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.facebook.common.g.b r0 = com.facebook.common.p1835g.EnumC24105b.OnSystemLowMemoryWhileAppInForeground     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.facebook.imagepipeline.p1879d.C24371d.C243721.f57798a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.facebook.common.g.b r0 = com.facebook.common.p1835g.EnumC24105b.OnSystemLowMemoryWhileAppInBackground     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1879d.C24371d.C243721.<clinit>():void");
        }
    }

    @Override // com.facebook.imagepipeline.p1879d.C24382h.AbstractC24385a
    /* renamed from: a */
    public final double mo40173a(EnumC24105b bVar) {
        int i = C243721.f57798a[bVar.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                return 1.0d;
            }
            C24099a.m45660d("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", bVar);
            return 0.0d;
        } else if (Build.VERSION.SDK_INT >= 21) {
            return EnumC24105b.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio();
        } else {
            return 0.0d;
        }
    }
}
