package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.LynxViewReleaseObserver */
public final class LynxViewReleaseObserver implements AbstractC33974au {

    /* renamed from: a */
    public LynxView f98386a;

    static {
        Covode.recordClassIndex(50158);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        LynxView lynxView = this.f98386a;
        if (lynxView != null) {
            lynxView.destroy();
        }
        this.f98386a = null;
    }

    public LynxViewReleaseObserver(LynxView lynxView) {
        this.f98386a = lynxView;
    }
}
