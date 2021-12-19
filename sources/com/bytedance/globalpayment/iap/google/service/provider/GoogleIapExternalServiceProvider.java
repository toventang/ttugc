package com.bytedance.globalpayment.iap.google.service.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15127a;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15128b;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.google.C15165a;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.p1069e.C15188a;
import com.bytedance.globalpayment.iap.google.service.PayloadPreferencesServiceImpl;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService;
import com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService;
import com.bytedance.globalpayment.service.manager.iap.google.RestoreGoogleOrderService;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.List;

public class GoogleIapExternalServiceProvider implements GoogleIapExternalService {
    static {
        Covode.recordClassIndex(17387);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isServiceConnected() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public PayloadPreferencesService getPayloadPreferencesService() {
        return PayloadPreferencesServiceImpl.getInstance();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryHasSubscriptionProducts() {
        C15165a.m27920a().mo24521c();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isSupportGooglePay() {
        return C15165a.m27920a().mo24520b();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public RestoreGoogleOrderService getRestoreGoogleOrderService() {
        return RestoreOrderService.getIns(C15253a.m28071a().mo24709i().mo24713b());
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToSubscriptionManagerPage() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions"));
        intent.addFlags(268435456);
        m28014x13aa299d(C15253a.m28071a().mo24709i().mo24713b(), intent);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void init(AbstractC15128b bVar) {
        C15165a.m27920a().mo24515a(bVar);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryUnAckEdOrderFromChannel(AbstractC15108b bVar) {
        C15165a.m27920a().mo24513a(bVar);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setGpListener(AbstractC15127a aVar) {
        C15165a.m27920a().mo24514a(aVar);
    }

    /* renamed from: com_bytedance_globalpayment_iap_google_service_provider_GoogleIapExternalServiceProvider_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m28014x13aa299d(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public AbstractC15131a getGoogleState(AbstractC15153d dVar, Activity activity) {
        return new C15188a(dVar, activity);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void jumpToNotExpiredSubscriptionManagerPage(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + str + "&package=" + str2));
        intent.addFlags(268435456);
        m28014x13aa299d(C15253a.m28071a().mo24709i().mo24713b(), intent);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        C15165a.m27920a().mo24518a(z, str, consumeIapProductListener);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryProductDetails(List<String> list, boolean z, AbstractC15237c<AbsIapProduct> cVar) {
        C15165a.m27920a().mo24517a(list, z, cVar);
    }
}
