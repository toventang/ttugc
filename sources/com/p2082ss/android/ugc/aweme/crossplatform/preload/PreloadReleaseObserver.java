package com.p2082ss.android.ugc.aweme.crossplatform.preload;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.crossplatform.view.C40737c;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.preload.PreloadReleaseObserver */
public final class PreloadReleaseObserver implements AbstractC33974au {

    /* renamed from: a */
    public final String f95327a;

    /* renamed from: b */
    public ActivityC0945e f95328b;

    static {
        Covode.recordClassIndex(48562);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        C40737c a = C40716a.m82130a(this.f95327a);
        C40716a.m82131b(this.f95327a);
        if (a != null) {
            a.mo69928d(this.f95328b);
        }
        this.f95328b = null;
    }
}
