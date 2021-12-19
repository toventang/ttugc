package com.bytedance.globalpayment.iap.p1049a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.a.b */
public interface AbstractC15108b {
    static {
        Covode.recordClassIndex(17276);
    }

    void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list);
}
