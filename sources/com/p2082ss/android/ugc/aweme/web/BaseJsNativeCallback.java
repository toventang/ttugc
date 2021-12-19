package com.p2082ss.android.ugc.aweme.web;

import android.os.ResultReceiver;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.web.IJsCallback;

/* renamed from: com.ss.android.ugc.aweme.web.BaseJsNativeCallback */
public abstract class BaseJsNativeCallback<CALLBACK extends IJsCallback> extends BaseLifeCycleObserver {

    /* renamed from: a */
    public ResultReceiver f182287a;

    /* renamed from: b */
    private AbstractC1204m f182288b;

    static {
        Covode.recordClassIndex(94896);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.web.BaseLifeCycleObserver
    public void onDestroy(AbstractC1204m mVar) {
        super.onDestroy(mVar);
        this.f182287a = null;
        this.f182288b.getLifecycle().mo4013b(this);
    }
}
