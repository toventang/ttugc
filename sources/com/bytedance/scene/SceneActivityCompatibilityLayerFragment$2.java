package com.bytedance.scene;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

class SceneActivityCompatibilityLayerFragment$2 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC1204m f52280a;

    /* renamed from: b */
    final /* synthetic */ int f52281b;

    /* renamed from: c */
    final /* synthetic */ FragmentC22224k f52282c;

    static {
        Covode.recordClassIndex(25915);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f52280a.getLifecycle().mo4013b(this);
        this.f52282c.f52561a.mo2185b(this.f52281b);
    }
}
