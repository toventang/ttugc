package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IExternalService;

/* renamed from: com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback */
public abstract class SimpleServiceLoadCallback implements IExternalService.ServiceLoadCallback {
    static {
        Covode.recordClassIndex(79728);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public void onDismiss() {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public void onFailed() {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public void onOK() {
        onFailed();
    }
}
