package com.bytedance.scene.ktx;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public final class SceneExtensionsKt$postDelayed$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ Runnable f52566a;

    static {
        Covode.recordClassIndex(26033);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        C22228c.m41827a().removeCallbacks(this.f52566a);
    }

    SceneExtensionsKt$postDelayed$1(Runnable runnable) {
        this.f52566a = runnable;
    }
}
