package com.bytedance.globalpayment.service.manager.iap.google;

import com.bytedance.covode.number.Covode;

public class RestoreGoogleOrderServiceImplOfMock implements RestoreGoogleOrderService {
    static {
        Covode.recordClassIndex(17516);
    }

    /* renamed from: com_bytedance_globalpayment_service_manager_iap_google_RestoreGoogleOrderServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m28188xf879fa21(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onFailedFinishedTokenUpload(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public void onSuccessFinishedTokenUpload(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService
    public boolean isEnableRestoreOrder() {
        m28188xf879fa21("RestoreGoogleOrderService", "cur isEnableRestoreOrder method is empty impl in RestoreGoogleOrderServiceImplOfMockClass");
        return false;
    }
}
