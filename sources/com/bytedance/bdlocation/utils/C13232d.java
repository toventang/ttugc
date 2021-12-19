package com.bytedance.bdlocation.utils;

import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.utils.ActivityLifecycleUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.bdlocation.utils.d */
public final class C13232d extends C13230c implements ActivityLifecycleUtils.AbstractC13226a {
    static {
        Covode.recordClassIndex(15193);
    }

    @Override // com.bytedance.bdlocation.utils.ActivityLifecycleUtils.AbstractC13226a
    /* renamed from: a */
    public final void mo21375a(boolean z) {
        this.f32339b = z;
        C13162b.m23690d("BDLocation", "LifecycleObserver isEnterBackground:".concat(String.valueOf(z)));
        if (this.f32338a != null) {
            C13162b.m23690d("BDLocation", "LifecycleObserver mCallback");
        }
    }
}
