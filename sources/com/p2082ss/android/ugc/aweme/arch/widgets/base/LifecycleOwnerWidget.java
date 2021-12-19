package com.p2082ss.android.ugc.aweme.arch.widgets.base;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget */
public class LifecycleOwnerWidget extends Widget implements AbstractC1204m, AbstractC33974au {

    /* renamed from: a */
    C1205n f80268a = new C1205n(this);

    static {
        Covode.recordClassIndex(40863);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final AbstractC1204m aj_() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.f80268a;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f80268a.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        this.f80268a.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onPause() {
        this.f80268a.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        super.onPause();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onResume() {
        super.onResume();
        this.f80268a.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onStart() {
        super.onStart();
        this.f80268a.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onStop() {
        this.f80268a.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
        super.onStop();
    }
}
