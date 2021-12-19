package com.bytedance.globalpayment.service.manager.iap;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

public class IapExternalServiceImplOfMock implements IapExternalService {
    static {
        Covode.recordClassIndex(17506);
    }

    /* renamed from: com_bytedance_globalpayment_service_manager_iap_IapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m28185x9944828b(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void acquireReward(C15124c cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void addIapObserver(AbstractC15125a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void executeUnUploadTokenOrder(IapPaymentMethod iapPaymentMethod, AbsIapChannelOrderData absIapChannelOrderData) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getChannelUserData(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void init() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToNotExpiredSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod, String str, String str2) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, C15124c cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void onAppResume() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void onOrderTimeout(OrderInfo orderInfo) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryRewards() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void removeIapObserver(AbstractC15125a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void tryRestoreUnAckOrder(IapPaymentMethod iapPaymentMethod) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHost(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean hasInitEd() {
        m28185x9944828b("IapExternalService", "cur hasInitEd method is empty impl in IapExternalServiceImplOfMockClass");
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public AbstractC15131a getNextState(AbstractC15131a aVar) {
        m28185x9944828b("IapExternalService", "cur getNextState method is empty impl in IapExternalServiceImplOfMockClass");
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean isSupportPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        m28185x9944828b("IapExternalService", "cur isSupportPaymentMethod method is empty impl in IapExternalServiceImplOfMockClass");
        return false;
    }
}
