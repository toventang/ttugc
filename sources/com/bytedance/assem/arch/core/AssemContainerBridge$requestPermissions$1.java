package com.bytedance.assem.arch.core;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public final class AssemContainerBridge$requestPermissions$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C12749b f30972a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1204m f30973b;

    /* renamed from: c */
    final /* synthetic */ int f30974c;

    static {
        Covode.recordClassIndex(14562);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        this.f30973b.getLifecycle().mo4013b(this);
        this.f30972a.f31006b.mo2185b(this.f30974c);
    }
}
