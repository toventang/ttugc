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

public class AmazonIapExternalServiceImplOfMock implements AmazonIapExternalService {
    static {
        Covode.recordClassIndex(17509);
    }

    /* renamed from: com_bytedance_globalpayment_service_manager_iap_amazon_AmazonIapExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m28186x3e0b2108(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void consumeProduct(String str, ConsumeIapProductListener consumeIapProductListener) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void getAmazonUserId(AbstractC15107a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void init(AbstractC15128b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void queryProductDetails(List<String> list, boolean z, AbstractC15237c<AbsIapProduct> cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public void queryUnAckEdOrderFromChannel(AbstractC15108b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public boolean isSupportAmazonPay() {
        m28186x3e0b2108("AmazonIapExternalService", "cur isSupportAmazonPay method is empty impl in AmazonIapExternalServiceImplOfMockClass");
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.amazon.AmazonIapExternalService
    public AbstractC15131a getAmazonState(AbstractC15153d dVar, Activity activity) {
        m28186x3e0b2108("AmazonIapExternalService", "cur getAmazonState method is empty impl in AmazonIapExternalServiceImplOfMockClass");
        return null;
    }
}
