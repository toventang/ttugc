package com.bytedance.globalpayment.iap.p1062d.p1063a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15122b;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15107a;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.d.a.a */
public class C15159a implements AbstractC15163a {

    /* renamed from: a */
    private final String f36992a = C15159a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17339);
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a
    /* renamed from: b */
    public final void mo24502b(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().jumpToSubscriptionManagerPage();
        }
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a
    /* renamed from: c */
    public final void mo24503c(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryHasSubscriptionProducts();
        } else {
            C15122b.m27797e().mo24381a().mo24419b(IapPaymentMethod.AMAZON, new C15126d(1, "query has subscription not support amazon!"), null);
        }
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a
    /* renamed from: a */
    public final void mo24496a(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            C15122b.m27797e().mo24381a().mo24407a(new C15126d(1, "google not support get user data"), (IapChannelUserData) null);
        } else if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().getAmazonUserId(new AbstractC15107a() {
                /* class com.bytedance.globalpayment.iap.p1062d.p1063a.C15159a.C151601 */

                static {
                    Covode.recordClassIndex(17340);
                }

                @Override // com.bytedance.globalpayment.iap.p1049a.AbstractC15107a
                /* renamed from: a */
                public final void mo24364a(String str, String str2) {
                    C15122b.m27797e().mo24381a().mo24407a(new C15126d(0, "get user data success from amazon"), new IapChannelUserData(IapPaymentMethod.AMAZON, str, str2));
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a
    /* renamed from: a */
    public final void mo24497a(IapPaymentMethod iapPaymentMethod, AbstractC15107a aVar) {
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().getAmazonUserId(aVar);
        } else {
            aVar.mo24364a("", "");
        }
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a
    /* renamed from: a */
    public final AbstractC15131a mo24495a(IapPaymentMethod iapPaymentMethod, Object... objArr) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().getGoogleState((AbstractC15153d) objArr[0], (Activity) objArr[1]);
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            return PaymentServiceManager.get().getAmazonIapExternalService().getAmazonState((AbstractC15153d) objArr[0], (Activity) objArr[1]);
        }
        return null;
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a
    /* renamed from: a */
    public final void mo24498a(IapPaymentMethod iapPaymentMethod, AbstractC15108b bVar) {
        C15253a.m28071a().mo24705e();
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(bVar);
        } else if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().queryUnAckEdOrderFromChannel(bVar);
        } else {
            bVar.onQueryFinished(iapPaymentMethod, new AbsResult().withErrorCode(1).withMessage("invalid payment_method"), null);
        }
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a
    /* renamed from: a */
    public final void mo24499a(IapPaymentMethod iapPaymentMethod, String str, String str2) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().jumpToNotExpiredSubscriptionManagerPage(str, str2);
        }
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a
    /* renamed from: a */
    public final void mo24500a(IapPaymentMethod iapPaymentMethod, List<String> list, boolean z, AbstractC15237c<AbsIapProduct> cVar) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(list, z, cVar);
        } else if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().queryProductDetails(list, z, cVar);
        }
    }

    @Override // com.bytedance.globalpayment.iap.p1062d.p1064b.AbstractC15163a
    /* renamed from: a */
    public final void mo24501a(IapPaymentMethod iapPaymentMethod, boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            PaymentServiceManager.get().getGoogleIapExternalService().consumeProduct(z, str, consumeIapProductListener);
        } else if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            PaymentServiceManager.get().getAmazonIapExternalService().consumeProduct(str, consumeIapProductListener);
        }
    }
}
