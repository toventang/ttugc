package com.bytedance.globalpayment.iap.service.provider;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15122b;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.common.ability.p1056e.C15130b;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.common.ability.p1061h.C15156a;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15107a;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.iap.p1062d.C15162b;
import com.bytedance.globalpayment.iap.state.extra.C15222b;
import com.bytedance.globalpayment.iap.state.nomal.C15224a;
import com.bytedance.globalpayment.iap.state.pre.C15229a;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.service.provider.a */
public abstract class AbstractC15214a {
    public final String TAG = AbstractC15214a.class.getSimpleName();
    protected WeakReference<Activity> mActivity = new WeakReference<>(null);
    protected AtomicBoolean mInitEd = new AtomicBoolean(false);
    protected List<OrderData> mPayingRequests = Collections.synchronizedList(new ArrayList());
    protected ConcurrentHashMap<String, AbsIapChannelOrderData> mRewards = new ConcurrentHashMap<>();
    protected Set<String> mUnSuccessEdProductIds = Collections.synchronizedSet(new HashSet());

    static {
        Covode.recordClassIndex(17408);
    }

    /* access modifiers changed from: protected */
    public abstract AbstractC15153d getIapInternalService();

    /* access modifiers changed from: protected */
    public void acquireRewardInternal(OrderData orderData) {
        new C15229a(getIapInternalService()).mo24398a(orderData);
        this.mPayingRequests.add(orderData);
    }

    /* access modifiers changed from: protected */
    public void executeNewPayInternal(final OrderData orderData) {
        C15162b.m27903d().mo24494c().mo24497a(orderData.getIapPaymentMethod(), new AbstractC15107a() {
            /* class com.bytedance.globalpayment.iap.service.provider.AbstractC15214a.C152151 */

            static {
                Covode.recordClassIndex(17409);
            }

            @Override // com.bytedance.globalpayment.iap.p1049a.AbstractC15107a
            /* renamed from: a */
            public final void mo24364a(String str, String str2) {
                orderData.setChannelUserId(str);
                AbstractC15214a.this.payInternal(orderData);
            }
        });
    }

    private void extraUploadToken(OrderData orderData) {
        this.mUnSuccessEdProductIds.add(orderData.getProductId());
        if (orderData.getIapPayMonitor() != null) {
            orderData.getIapPayMonitor().mo24394a();
        }
        C15162b.m27903d().mo24492a().mo24506b(orderData);
        new C15222b(getIapInternalService()).mo24398a(orderData);
        this.mPayingRequests.add(orderData);
    }

    /* access modifiers changed from: protected */
    public void queryRewardsInternal(final boolean z) {
        if (this.mInitEd.get()) {
            if (!z || C15253a.m28071a().mo24709i().mo24715d().f37218f) {
                PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(new AbstractC15108b() {
                    /* class com.bytedance.globalpayment.iap.service.provider.AbstractC15214a.C152162 */

                    static {
                        Covode.recordClassIndex(17410);
                    }

                    @Override // com.bytedance.globalpayment.iap.p1049a.AbstractC15108b
                    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                        C15126d dVar;
                        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
                            ArrayList arrayList = new ArrayList();
                            if (absResult.getCode() != 0) {
                                dVar = new C15126d(301, absResult.getCode(), absResult.getMessage());
                            } else {
                                dVar = new C15126d(0, 0, "query purchases in queryPreregisterRewards success.");
                                if (list != null) {
                                    C15253a.m28071a().mo24705e();
                                    list.size();
                                    for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                                        String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                                        String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                                        if (TextUtils.isEmpty(channelOrderId) && TextUtils.isEmpty(developerPayload)) {
                                            AbstractC15214a.this.mRewards.put(absIapChannelOrderData.getProductId(), absIapChannelOrderData);
                                            arrayList.add(absIapChannelOrderData.getProductId());
                                        }
                                    }
                                    C15253a.m28071a().mo24705e();
                                    if (arrayList.size() > 0) {
                                        PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(arrayList, false, new AbstractC15237c<AbsIapProduct>() {
                                            /* class com.bytedance.globalpayment.iap.service.provider.AbstractC15214a.C152162.C152171 */

                                            static {
                                                Covode.recordClassIndex(17411);
                                            }

                                            @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c
                                            /* renamed from: a */
                                            public final void mo24682a(AbsResult absResult, List<AbsIapProduct> list) {
                                                C15122b.m27797e().mo24381a().mo24409a(C15126d.m27810a(absResult), z, list);
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                            C15122b.m27797e().mo24381a().mo24409a(dVar, z, new ArrayList());
                        }
                    }
                });
            }
        }
    }

    public void payInternal(OrderData orderData) {
        if (!C15253a.m28071a().mo24708h().mo24735b().mo24754b() || !orderData.getIapPayRequest().f36925j) {
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            new C15224a(getIapInternalService()).mo24398a(orderData);
        } else {
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            orderData.execute();
            C15162b.m27903d().mo24494c().mo24495a(orderData.getIapPaymentMethod(), getIapInternalService(), this.mActivity.get()).mo24398a(orderData);
        }
        this.mPayingRequests.add(orderData);
    }

    /* access modifiers changed from: protected */
    public void restoreOrderByUploadToken(IapPaymentMethod iapPaymentMethod, AbsIapChannelOrderData absIapChannelOrderData, AbsIapProduct absIapProduct, boolean z) {
        String str;
        String str2;
        String str3;
        C15124c iapPayRequest;
        String str4 = "";
        if (this.mPayingRequests.size() != 0) {
            str = this.mPayingRequests.get(0).getUserId();
        } else {
            str = str4;
        }
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            Pair<String, Pair<String, String>> b = C15156a.m27882b(absIapChannelOrderData.getDeveloperPayload());
            if (b != null) {
                str = (String) b.first;
                str3 = (String) ((Pair) b.second).first;
                String str5 = (String) ((Pair) b.second).second;
                C15253a.m28071a().mo24705e();
                JSONObject a = C15156a.m27880a(str3);
                if (a != null) {
                    C15253a.m28071a().mo24705e();
                    str4 = a.optString("extra_payload", str4);
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = absIapChannelOrderData.getExtraPayload();
                }
                if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str3)) {
                    OrderInfo orderInfo = new OrderInfo();
                    orderInfo.setUserId(str);
                    orderInfo.setProductId(absIapChannelOrderData.getProductId());
                    orderInfo.setIapPaymentMethod(IapPaymentMethod.GOOGLE);
                    C15126d dVar = new C15126d();
                    dVar.withErrorCode(201);
                    dVar.withDetailCode(2012);
                    dVar.withMessage("execute un finished order failed because order info from purchase is null");
                    C15122b.m27797e().mo24381a().mo24406a(dVar, orderInfo);
                    return;
                }
                str2 = str4;
                str4 = str5;
            } else {
                str2 = str4;
                str3 = str2;
            }
        } else {
            str = absIapChannelOrderData.getMerchantUserId();
            str4 = absIapChannelOrderData.getMerchantId();
            str3 = absIapChannelOrderData.getSelfOrderId();
            str2 = absIapChannelOrderData.getExtraPayload();
        }
        C15253a.m28071a().mo24705e();
        if (TextUtils.isEmpty(str4)) {
            if (!this.mPayingRequests.isEmpty() && (iapPayRequest = this.mPayingRequests.get(0).getIapPayRequest()) != null) {
                str4 = iapPayRequest.f36917b;
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = C15253a.m28071a().mo24709i().mo24715d().f37216d;
            }
        }
        C15124c cVar = new C15124c(SystemClock.uptimeMillis());
        cVar.f36917b = str4;
        cVar.f36920e = str;
        cVar.f36924i = str2;
        cVar.f36922g = z;
        OrderData orderData = new OrderData(cVar, PayType.EXTRA_TOKEN);
        orderData.setProductId(absIapChannelOrderData.getProductId());
        orderData.setOrderId(str3);
        orderData.setUserId(str);
        orderData.setNewSubscription(absIapChannelOrderData.isNewSubscription());
        orderData.setAbsIapChannelOrderData(absIapChannelOrderData).setAbsIapProduct(absIapProduct);
        orderData.setOrderFromOtherSystem(absIapChannelOrderData.isOrderFromOtherSystem());
        orderData.setHost(absIapChannelOrderData.getHost());
        orderData.setIapPaymentMethod(iapPaymentMethod);
        orderData.setChannelUserId(absIapChannelOrderData.getChannelUserId());
        orderData.setIapPayMonitor(new C15130b(orderData.getProductId(), orderData.getOrderId(), cVar.f36922g, PayType.EXTRA_TOKEN, orderData));
        extraUploadToken(orderData);
    }
}
