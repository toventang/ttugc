package com.bytedance.globalpayment.service.manager.iap;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

public interface IapService {
    static {
        Covode.recordClassIndex(17507);
    }

    void acquireReward(C15124c cVar);

    void addIapObserver(AbstractC15125a aVar);

    void getChannelUserData(IapPaymentMethod iapPaymentMethod);

    boolean hasInitEd();

    boolean isSupportPaymentMethod(IapPaymentMethod iapPaymentMethod);

    void jumpToNotExpiredSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod, String str, String str2);

    void jumpToSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod);

    void newPay(Activity activity, C15124c cVar);

    void onAppResume();

    void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod);

    void queryProductDetails(IapPaymentMethod iapPaymentMethod, List<String> list, String str);

    void queryRewards();

    void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list);

    void removeIapObserver(AbstractC15125a aVar);

    void updateHost(String str);
}
