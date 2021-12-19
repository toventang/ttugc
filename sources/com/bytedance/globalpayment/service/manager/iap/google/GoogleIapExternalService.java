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

public interface GoogleIapExternalService {
    static {
        Covode.recordClassIndex(17511);
    }

    void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener);

    AbstractC15131a getGoogleState(AbstractC15153d dVar, Activity activity);

    PayloadPreferencesService getPayloadPreferencesService();

    RestoreGoogleOrderService getRestoreGoogleOrderService();

    void init(AbstractC15128b bVar);

    boolean isServiceConnected();

    boolean isSupportGooglePay();

    void jumpToNotExpiredSubscriptionManagerPage(String str, String str2);

    void jumpToSubscriptionManagerPage();

    void queryHasSubscriptionProducts();

    void queryProductDetails(List<String> list, boolean z, AbstractC15237c<AbsIapProduct> cVar);

    void queryUnAckEdOrderFromChannel(AbstractC15108b bVar);

    void setGpListener(AbstractC15127a aVar);
}
