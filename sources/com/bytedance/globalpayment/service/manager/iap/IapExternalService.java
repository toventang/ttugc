package com.bytedance.globalpayment.service.manager.iap;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;

public interface IapExternalService extends IapService {
    static {
        Covode.recordClassIndex(17505);
    }

    void executeUnUploadTokenOrder(IapPaymentMethod iapPaymentMethod, AbsIapChannelOrderData absIapChannelOrderData);

    AbstractC15131a getNextState(AbstractC15131a aVar);

    void init();

    void onOrderTimeout(OrderInfo orderInfo);

    void tryRestoreUnAckOrder(IapPaymentMethod iapPaymentMethod);
}
