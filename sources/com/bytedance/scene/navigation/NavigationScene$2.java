package com.bytedance.scene.navigation;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* access modifiers changed from: package-private */
public class NavigationScene$2 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC1204m f52583a;

    /* renamed from: b */
    final /* synthetic */ AbstractC22259h f52584b;

    /* renamed from: c */
    final /* synthetic */ C22239d f52585c;

    static {
        Covode.recordClassIndex(26045);
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
        this.f52583a.getLifecycle().mo4013b(this);
        this.f52585c.f52597c.mo36546a(this.f52584b);
    }

    NavigationScene$2(C22239d dVar, AbstractC1204m mVar, AbstractC22259h hVar) {
        this.f52585c = dVar;
        this.f52583a = mVar;
        this.f52584b = hVar;
    }
}
