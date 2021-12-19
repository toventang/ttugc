package com.bytedance.scene;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* access modifiers changed from: package-private */
public class SceneActivityCompatibilityLayerFragment$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC1204m f52277a;

    /* renamed from: b */
    final /* synthetic */ int f52278b;

    /* renamed from: c */
    final /* synthetic */ FragmentC22224k f52279c;

    static {
        Covode.recordClassIndex(25914);
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
        this.f52277a.getLifecycle().mo4013b(this);
        this.f52279c.f52561a.mo2185b(this.f52278b);
    }

    SceneActivityCompatibilityLayerFragment$1(FragmentC22224k kVar, AbstractC1204m mVar, int i) {
        this.f52279c = kVar;
        this.f52277a = mVar;
        this.f52278b = i;
    }
}
