package com.bytedance.globalpayment.service.manager.iap.amazon;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15128b;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15107a;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

public interface AmazonIapExternalService {
    static {
        Covode.recordClassIndex(17508);
    }

    void consumeProduct(String str, ConsumeIapProductListener consumeIapProductListener);

    AbstractC15131a getAmazonState(AbstractC15153d dVar, Activity activity);

    void getAmazonUserId(AbstractC15107a aVar);

    void init(AbstractC15128b bVar);

    boolean isSupportAmazonPay();

    void queryProductDetails(List<String> list, boolean z, AbstractC15237c<AbsIapProduct> cVar);

    void queryUnAckEdOrderFromChannel(AbstractC15108b bVar);
}
