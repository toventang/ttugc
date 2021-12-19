package com.bytedance.scene;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.navigation.AbstractC22237b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

class SceneActivityCompatibilityLayerFragment$4 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC1204m f52286a;

    /* renamed from: b */
    final /* synthetic */ AbstractC22237b f52287b;

    /* renamed from: c */
    final /* synthetic */ FragmentC22224k f52288c;

    static {
        Covode.recordClassIndex(25917);
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
        this.f52286a.getLifecycle().mo4013b(this);
        this.f52288c.f52563c.remove(this.f52287b);
    }
}
