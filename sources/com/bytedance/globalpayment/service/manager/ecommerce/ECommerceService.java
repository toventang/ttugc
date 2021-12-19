package com.bytedance.globalpayment.service.manager.ecommerce;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1039a.AbstractC15076b;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1039a.AbstractC15077c;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1039a.AbstractC15078d;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.AbstractC15081a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.C15085a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.C15089b;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.p1043a.C15087b;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.p1043a.C15088c;
import com.bytedance.globalpayment.p1036a.p1048b.C15104a;
import java.util.List;

public interface ECommerceService {
    static {
        Covode.recordClassIndex(17499);
    }

    String encryptWithRsa(String str);

    C15089b getCardPaymentMethod(String str);

    AbstractC15081a getECommerceInterceptor();

    List<Object> getElements(String str, String... strArr);

    C15085a isValidElement(String str, String str2, String str3);

    C15085a isValidExpiryDateElement(String str, String str2, String str3);

    void onLanguageUpdate(String str);

    void pay(C15087b bVar, AbstractC15077c cVar);

    void payWithChannel(int i, C15104a aVar, AbstractC15076b bVar);

    void queryOrderState(C15088c cVar, AbstractC15078d dVar);

    void updateNonce(String str);
}
