package com.bytedance.globalpayment.service.manager.iap.google;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15127a;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15128b;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import java.util.List;

public class GoogleIapExternalServiceImplOfMock implements GoogleIapExternalService {
    static {
        Covode.recordClassIndex(17512);
    }

    /* renamed from: com_bytedance_globalpayment_service_manager_iap_google_GoogleIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m28187x70730b68(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void init(AbstractC15128b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToNotExpiredSubscriptionManagerPage(String str, String str2) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToSubscriptionManagerPage() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryHasSubscriptionProducts() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryProductDetails(List<String> list, boolean z, AbstractC15237c<AbsIapProduct> cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryUnAckEdOrderFromChannel(AbstractC15108b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setGpListener(AbstractC15127a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public PayloadPreferencesService getPayloadPreferencesService() {
        m28187x70730b68("GoogleIapExternalService", "cur getPayloadPreferencesService method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return new PayloadPreferencesServiceImplOfMock();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public RestoreGoogleOrderService getRestoreGoogleOrderService() {
        m28187x70730b68("GoogleIapExternalService", "cur getRestoreGoogleOrderService method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return new RestoreGoogleOrderServiceImplOfMock();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isServiceConnected() {
        m28187x70730b68("GoogleIapExternalService", "cur isServiceConnected method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isSupportGooglePay() {
        m28187x70730b68("GoogleIapExternalService", "cur isSupportGooglePay method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public AbstractC15131a getGoogleState(AbstractC15153d dVar, Activity activity) {
        m28187x70730b68("GoogleIapExternalService", "cur getGoogleState method is empty impl in GoogleIapExternalServiceImplOfMockClass");
        return null;
    }
}
