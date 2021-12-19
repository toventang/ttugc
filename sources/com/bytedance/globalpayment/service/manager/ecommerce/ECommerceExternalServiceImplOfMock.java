package com.bytedance.globalpayment.service.manager.ecommerce;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1039a.AbstractC15075a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1039a.AbstractC15076b;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1039a.AbstractC15077c;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1039a.AbstractC15078d;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.AbstractC15081a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.AbstractC15083c;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.C15082b;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1041c.C15084d;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.C15085a;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.C15089b;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.p1043a.C15087b;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.p1043a.C15088c;
import com.bytedance.globalpayment.p1036a.p1048b.C15104a;
import java.util.List;

public class ECommerceExternalServiceImplOfMock implements ECommerceExternalService {
    static {
        Covode.recordClassIndex(17498);
    }

    /* renamed from: com_bytedance_globalpayment_service_manager_ecommerce_ECommerceExternalServiceImplOfMock_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m28181xe6128e5b(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public void init() {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void onLanguageUpdate(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public void pay(int i, C15104a aVar, AbstractC15076b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void pay(C15087b bVar, AbstractC15077c cVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void payWithChannel(int i, C15104a aVar, AbstractC15076b bVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void queryOrderState(C15088c cVar, AbstractC15078d dVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public void startBankCardOcr(String str, AbstractC15075a aVar) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public void updateNonce(String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public AbstractC15081a getECommerceInterceptor() {
        m28181xe6128e5b("ECommerceExternalService", "cur getECommerceInterceptor method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return new C15082b();
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public ECommerceService getECommerceService() {
        m28181xe6128e5b("ECommerceExternalService", "cur getECommerceService method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return new ECommerceServiceImplOfMock();
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public String encryptWithRsa(String str) {
        m28181xe6128e5b("ECommerceExternalService", "cur encryptWithRsa method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return "";
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public C15089b getCardPaymentMethod(String str) {
        m28181xe6128e5b("ECommerceExternalService", "cur getCardPaymentMethod method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceExternalService
    public AbstractC15083c getPayChannel(int i) {
        m28181xe6128e5b("ECommerceExternalService", "cur getPayChannel method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return new C15084d();
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public List<Object> getElements(String str, String[] strArr) {
        m28181xe6128e5b("ECommerceExternalService", "cur getElements method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public C15085a isValidElement(String str, String str2, String str3) {
        m28181xe6128e5b("ECommerceExternalService", "cur isValidElement method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.ecommerce.ECommerceService
    public C15085a isValidExpiryDateElement(String str, String str2, String str3) {
        m28181xe6128e5b("ECommerceExternalService", "cur isValidExpiryDateElement method is empty impl in ECommerceExternalServiceImplOfMockClass");
        return null;
    }
}
