package androidx.lifecycle;

import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class FullLifecycleObserverAdapter implements AbstractC1202k {

    /* renamed from: a */
    private final AbstractC1190d f3925a;

    /* renamed from: b */
    private final AbstractC1202k f3926b;

    static {
        Covode.recordClassIndex(1257);
    }

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$1 */
    static /* synthetic */ class C11611 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3927a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 1258(0x4ea, float:1.763E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                androidx.lifecycle.FullLifecycleObserverAdapter.C11611.f3927a = r2
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = androidx.lifecycle.FullLifecycleObserverAdapter.C11611.f3927a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = androidx.lifecycle.FullLifecycleObserverAdapter.C11611.f3927a     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = androidx.lifecycle.FullLifecycleObserverAdapter.C11611.f3927a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = androidx.lifecycle.FullLifecycleObserverAdapter.C11611.f3927a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = androidx.lifecycle.FullLifecycleObserverAdapter.C11611.f3927a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r2 = androidx.lifecycle.FullLifecycleObserverAdapter.C11611.f3927a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C11611.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(AbstractC1190d dVar, AbstractC1202k kVar) {
        this.f3925a = dVar;
        this.f3926b = kVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (C11611.f3927a[aVar.ordinal()] != 7) {
            AbstractC1202k kVar = this.f3926b;
            if (kVar != null) {
                kVar.onStateChanged(mVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    }
}
