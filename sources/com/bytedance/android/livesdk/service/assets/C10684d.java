package com.bytedance.android.livesdk.service.assets;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.service.assets.d */
public final /* synthetic */ class C10684d implements AbstractC88433f {

    /* renamed from: a */
    private final boolean f25737a;

    /* renamed from: b */
    private final WeakReference f25738b;

    static {
        Covode.recordClassIndex(12281);
    }

    C10684d(boolean z, WeakReference weakReference) {
        this.f25737a = z;
        this.f25738b = weakReference;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        GiftManager.lambda$syncGiftList$3$GiftManager(this.f25737a, this.f25738b, (Throwable) obj);
    }
}
