package com.bytedance.globalpayment.iap.service.provider;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15122b;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15127a;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15128b;
import com.bytedance.globalpayment.iap.common.ability.p1056e.C15130b;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.iap.p1062d.C15162b;
import com.bytedance.globalpayment.iap.state.extra.C15221a;
import com.bytedance.globalpayment.iap.state.extra.C15222b;
import com.bytedance.globalpayment.iap.state.extra.ExtraConsumeState;
import com.bytedance.globalpayment.iap.state.nomal.C15226b;
import com.bytedance.globalpayment.iap.state.nomal.C15227c;
import com.bytedance.globalpayment.iap.state.nomal.ConsumeProductState;
import com.bytedance.globalpayment.iap.state.pre.C15231b;
import com.bytedance.globalpayment.iap.state.pre.C15232c;
import com.bytedance.globalpayment.iap.state.pre.PreregisterConsumeState;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class IapServiceProvider extends AbstractC15214a implements AbstractC15127a, AbstractC15153d, IapExternalService {
    public final String TAG = IapServiceProvider.class.getSimpleName();
    private AbstractC15108b mQueryUnAckEdOrderListener = new AbstractC15108b() {
        /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.C152051 */

        static {
            Covode.recordClassIndex(17399);
        }

        @Override // com.bytedance.globalpayment.iap.p1049a.AbstractC15108b
        public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
            C15253a.m28071a().mo24705e();
            if (absResult != null && list != null) {
                if (absResult.getCode() != 0) {
                    C15253a.m28071a().mo24705e();
                    absResult.getMessage();
                } else if (list.isEmpty()) {
                    C15253a.m28071a().mo24705e();
                } else {
                    C15253a.m28071a().mo24705e();
                    list.size();
                    if (iapPaymentMethod != IapPaymentMethod.GOOGLE || !PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().isEnableRestoreOrder()) {
                        for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                            C15253a.m28071a().mo24705e();
                            absIapChannelOrderData.isSubscription();
                            absIapChannelOrderData.isAcknowledged();
                            absIapChannelOrderData.getOrderState();
                            if (absIapChannelOrderData.isOrderStateSuccess()) {
                                String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                                String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                                if ((iapPaymentMethod == IapPaymentMethod.GOOGLE && !(TextUtils.isEmpty(channelOrderId) && TextUtils.isEmpty(developerPayload))) || iapPaymentMethod == IapPaymentMethod.AMAZON) {
                                    IapServiceProvider.this.executeUnUploadTokenOrder(iapPaymentMethod, absIapChannelOrderData);
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(17398);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.globalpayment.iap.service.provider.AbstractC15214a
    public AbstractC15153d getIapInternalService() {
        return this;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean hasInitEd() {
        return this.mInitEd.get();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void onAppResume() {
        if (this.mInitEd.get()) {
            queryRewardsInternal(true);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryRewards() {
        if (this.mInitEd.get()) {
            queryRewardsInternal(false);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void init() {
        if (this.mInitEd.getAndSet(true)) {
            C15122b.m27797e().mo24381a().mo24411a(IapPaymentMethod.GOOGLE, new C15126d(401, 4011, "init failed because repeated init"));
            C15122b.m27797e().mo24381a().mo24411a(IapPaymentMethod.AMAZON, new C15126d(401, 4011, "init failed because repeated init"));
            return;
        }
        if (C15253a.m28071a().mo24709i().mo24715d().f37219g) {
            PaymentServiceManager.get().getGoogleIapExternalService().setGpListener(this);
            PaymentServiceManager.get().getGoogleIapExternalService().init(new AbstractC15128b() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.C152062 */

                static {
                    Covode.recordClassIndex(17400);
                }

                @Override // com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15128b
                /* renamed from: a */
                public final void mo24391a(C15126d dVar) {
                    if (dVar == null) {
                        C15122b.m27797e().mo24381a().mo24411a(IapPaymentMethod.GOOGLE, new C15126d(401, 4012, "google init failed"));
                    } else if (dVar.getCode() == 0) {
                        C15122b.m27797e().mo24381a().mo24411a(IapPaymentMethod.GOOGLE, new C15126d(0, 0, "init success"));
                        IapServiceProvider.this.tryRestoreUnAckOrder(IapPaymentMethod.GOOGLE);
                    } else {
                        C15122b.m27797e().mo24381a().mo24411a(IapPaymentMethod.GOOGLE, new C15126d(401, 4012, "google response code is: " + dVar.getCode() + " message is : " + dVar.getMessage()));
                    }
                }
            });
        }
        if (C15253a.m28071a().mo24709i().mo24715d().f37220h) {
            PaymentServiceManager.get().getAmazonIapExternalService().init(new AbstractC15128b() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.C152073 */

                static {
                    Covode.recordClassIndex(17401);
                }

                @Override // com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15128b
                /* renamed from: a */
                public final void mo24391a(C15126d dVar) {
                    if (dVar == null) {
                        C15122b.m27797e().mo24381a().mo24411a(IapPaymentMethod.AMAZON, new C15126d(401, 4012, "amazon init failed"));
                    } else if (dVar.getCode() == 0) {
                        C15122b.m27797e().mo24381a().mo24411a(IapPaymentMethod.AMAZON, new C15126d(0, 0, "init success"));
                        IapServiceProvider.this.tryRestoreUnAckOrder(IapPaymentMethod.AMAZON);
                    } else {
                        C15122b.m27797e().mo24381a().mo24411a(IapPaymentMethod.AMAZON, new C15126d(401, 4012, "amazon response code is: " + dVar.getCode() + " message is : " + dVar.getMessage()));
                    }
                }
            });
        }
    }

    /* renamed from: com.bytedance.globalpayment.iap.service.provider.IapServiceProvider$9 */
    static /* synthetic */ class C152139 {

        /* renamed from: a */
        static final /* synthetic */ int[] f37131a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.C152139.<clinit>():void");
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void addIapObserver(AbstractC15125a aVar) {
        C15122b.m27797e().mo24381a().mo24405a(aVar);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getChannelUserData(IapPaymentMethod iapPaymentMethod) {
        C15162b.m27903d().mo24494c().mo24496a(iapPaymentMethod);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod) {
        C15162b.m27903d().mo24494c().mo24502b(iapPaymentMethod);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void onOrderTimeout(OrderInfo orderInfo) {
        C15122b.m27797e().mo24381a().mo24410a(orderInfo);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d
    public void removeAcquireRewards(String str) {
        if (this.mRewards != null) {
            this.mRewards.remove(str);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void removeIapObserver(AbstractC15125a aVar) {
        C15122b.m27797e().mo24381a().mo24415b(aVar);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15127a
    public void onCJBillingCallback(OrderData orderData) {
        orderData.setOrderFromOtherSystem(true);
        new C15222b(getIapInternalService()).mo24398a(orderData);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(IapPaymentMethod iapPaymentMethod) {
        if (this.mInitEd.get()) {
            C15162b.m27903d().mo24494c().mo24503c(iapPaymentMethod);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHost(String str) {
        C15253a.m28071a().mo24705e();
        C15122b.m27797e().mo24384d().mo24400a(str);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean isSupportPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE) {
            return PaymentServiceManager.get().getGoogleIapExternalService().isSupportGooglePay();
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            return PaymentServiceManager.get().getAmazonIapExternalService().isSupportAmazonPay();
        }
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void tryRestoreUnAckOrder(IapPaymentMethod iapPaymentMethod) {
        if (iapPaymentMethod == IapPaymentMethod.GOOGLE && !C15253a.m28071a().mo24708h().mo24737d()) {
            C15162b.m27903d().mo24494c().mo24498a(iapPaymentMethod, this.mQueryUnAckEdOrderListener);
        }
        if (iapPaymentMethod == IapPaymentMethod.AMAZON) {
            C15162b.m27903d().mo24494c().mo24498a(iapPaymentMethod, this.mQueryUnAckEdOrderListener);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d
    public void onIapOrderFinished(OrderData orderData) {
        if (orderData.isFinished()) {
            this.mPayingRequests.remove(orderData);
        }
        if (orderData.isSuccess()) {
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            this.mUnSuccessEdProductIds.remove(orderData.getProductId());
            return;
        }
        AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
        if (absIapChannelOrderData != null && absIapChannelOrderData.getOrderState() == 1 && !orderData.isConsumed() && !orderData.isQuerySucceed()) {
            this.mUnSuccessEdProductIds.add(orderData.getProductId());
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void acquireReward(final C15124c cVar) {
        if (this.mInitEd.get()) {
            if (cVar == null) {
                AbstractC15155f a = C15122b.m27797e().mo24381a();
                C15126d dVar = new C15126d(201, 2011, "pipoRequest is null when preregisterRewardsPay.");
                dVar.f36929b = cVar;
                dVar.f36930c = PayType.PRE;
                a.mo24406a(dVar, (OrderInfo) null);
                return;
            }
            final OrderData orderData = new OrderData(cVar, PayType.PRE);
            orderData.setIapPaymentMethod(IapPaymentMethod.GOOGLE);
            final String productId = orderData.getProductId();
            C15253a.m28071a().mo24705e();
            C15130b bVar = new C15130b(productId, orderData.getOrderId(), cVar.f36922g, PayType.PRE, orderData);
            orderData.setIapPayMonitor(bVar);
            bVar.mo24394a();
            C15162b.m27903d().mo24492a().mo24506b(orderData);
            if (this.mRewards.containsKey(productId)) {
                orderData.setAbsIapChannelOrderData((AbsIapChannelOrderData) this.mRewards.get(productId));
                acquireRewardInternal(orderData);
                return;
            }
            PaymentServiceManager.get().getGoogleIapExternalService().queryUnAckEdOrderFromChannel(new AbstractC15108b() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.C152117 */

                static {
                    Covode.recordClassIndex(17405);
                }

                @Override // com.bytedance.globalpayment.iap.p1049a.AbstractC15108b
                public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                    String str = "";
                    if (absResult.getCode() != 0) {
                        C15126d dVar = new C15126d(203, absResult.getCode(), "query purchases success in preregisterRewardsPay, result message is: " + absResult.getMessage());
                        if (orderData.getIapPayRequest() != null) {
                            str = orderData.getIapPayRequest().f36924i;
                        }
                        dVar.f36928a = str;
                        dVar.f36929b = cVar;
                        dVar.f36930c = PayType.PRE;
                        C15253a.m28071a().mo24705e();
                        absResult.getMessage();
                        C15122b.m27797e().mo24381a().mo24406a(dVar, orderData.buildOrderInfo());
                        return;
                    }
                    if (list != null) {
                        C15253a.m28071a().mo24705e();
                        list.size();
                        for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                            String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                            String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                            if (TextUtils.isEmpty(channelOrderId) && TextUtils.isEmpty(developerPayload)) {
                                IapServiceProvider.this.mRewards.put(absIapChannelOrderData.getProductId(), absIapChannelOrderData);
                            }
                        }
                    }
                    if (IapServiceProvider.this.mRewards.containsKey(productId)) {
                        orderData.setAbsIapChannelOrderData((AbsIapChannelOrderData) IapServiceProvider.this.mRewards.get(productId));
                        IapServiceProvider.this.acquireRewardInternal(orderData);
                        return;
                    }
                    C15126d dVar2 = new C15126d(203, 2031, "doesn't has preregisterReward [" + productId + "]");
                    if (orderData.getIapPayRequest() != null) {
                        str = orderData.getIapPayRequest().f36924i;
                    }
                    dVar2.f36928a = str;
                    dVar2.f36929b = cVar;
                    dVar2.f36929b = cVar;
                    dVar2.f36930c = PayType.PRE;
                    C15253a.m28071a().mo24705e();
                    C15122b.m27797e().mo24381a().mo24406a(dVar2, orderData.buildOrderInfo());
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public AbstractC15131a getNextState(AbstractC15131a aVar) {
        switch (C152139.f37131a[aVar.mo24396a().ordinal()]) {
            case 1:
                OrderData orderData = aVar.f36941a;
                return C15162b.m27903d().mo24494c().mo24495a(orderData.getIapPaymentMethod(), getIapInternalService(), this.mActivity.get());
            case 2:
            case 3:
                return new C15227c(getIapInternalService());
            case 4:
                return new C15226b(getIapInternalService());
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new ConsumeProductState(getIapInternalService());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new C15221a(getIapInternalService());
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return new ExtraConsumeState(getIapInternalService());
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return new C15232c(getIapInternalService());
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return new C15231b(getIapInternalService());
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return new PreregisterConsumeState(getIapInternalService());
            default:
                return null;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15127a
    public void onPurchasesUpdated(C15126d dVar, List<AbsIapChannelOrderData> list) {
        queryRewardsInternal(true);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(IapPaymentMethod iapPaymentMethod, List<String> list) {
        if (this.mInitEd.get()) {
            PaymentServiceManager.get().getGoogleIapExternalService().queryProductDetails(list, true, new AbstractC15237c<AbsIapProduct>() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.C152106 */

                static {
                    Covode.recordClassIndex(17404);
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c
                /* renamed from: a */
                public final void mo24682a(AbsResult absResult, List<AbsIapProduct> list) {
                    if (absResult.getCode() == 0) {
                        C15122b.m27797e().mo24381a().mo24417b(new C15126d(0, 0, "query success in querySubscriptionDetails."), list);
                        return;
                    }
                    C15253a.m28071a().mo24705e();
                    C15122b.m27797e().mo24381a().mo24417b(new C15126d(301, absResult.getCode(), "query product list details from google service has error, result: " + absResult.getMessage()), list);
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void executeUnUploadTokenOrder(final IapPaymentMethod iapPaymentMethod, final AbsIapChannelOrderData absIapChannelOrderData) {
        if (this.mInitEd.get()) {
            final String productId = absIapChannelOrderData.getProductId();
            for (Object obj : this.mPayingRequests.toArray()) {
                if (TextUtils.equals(((OrderData) obj).getProductId(), productId)) {
                    C15253a.m28071a().mo24705e();
                    return;
                }
            }
            C15253a.m28071a().mo24705e();
            absIapChannelOrderData.getChannelOrderId();
            ArrayList arrayList = new ArrayList();
            arrayList.add(productId);
            C15162b.m27903d().mo24494c().mo24500a(iapPaymentMethod, arrayList, absIapChannelOrderData.isSubscription(), new AbstractC15237c<AbsIapProduct>() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.C152128 */

                static {
                    Covode.recordClassIndex(17406);
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c
                /* renamed from: a */
                public final void mo24682a(AbsResult absResult, List<AbsIapProduct> list) {
                    C15253a.m28071a().mo24705e();
                    absIapChannelOrderData.getChannelOrderId();
                    if (absResult.getCode() != 0) {
                        IapServiceProvider iapServiceProvider = IapServiceProvider.this;
                        IapPaymentMethod iapPaymentMethod = iapPaymentMethod;
                        AbsIapChannelOrderData absIapChannelOrderData = absIapChannelOrderData;
                        iapServiceProvider.restoreOrderByUploadToken(iapPaymentMethod, absIapChannelOrderData, null, absIapChannelOrderData.isSubscription());
                        return;
                    }
                    for (AbsIapProduct absIapProduct : list) {
                        if (absIapProduct.getProductId().equals(productId)) {
                            IapServiceProvider iapServiceProvider2 = IapServiceProvider.this;
                            IapPaymentMethod iapPaymentMethod2 = iapPaymentMethod;
                            AbsIapChannelOrderData absIapChannelOrderData2 = absIapChannelOrderData;
                            iapServiceProvider2.restoreOrderByUploadToken(iapPaymentMethod2, absIapChannelOrderData2, absIapProduct, absIapChannelOrderData2.isSubscription());
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, C15124c cVar) {
        if (this.mInitEd.get()) {
            this.mActivity = new WeakReference(activity);
            if (cVar == null) {
                AbstractC15155f a = C15122b.m27797e().mo24381a();
                C15126d dVar = new C15126d(201, 2011, "PipoPayManger.executeNewPay:pipoRequest is null.");
                dVar.f36929b = cVar;
                dVar.f36930c = PayType.NOMAL;
                a.mo24406a(dVar, (OrderInfo) null);
                return;
            }
            final OrderData orderData = new OrderData(cVar, PayType.NOMAL);
            final C15130b bVar = new C15130b(orderData.getProductId(), orderData.getOrderId(), cVar.f36922g, PayType.NOMAL, orderData);
            orderData.setIapPayMonitor(bVar);
            bVar.mo24394a();
            C15162b.m27903d().mo24492a().mo24506b(orderData);
            final IapPaymentMethod iapPaymentMethod = orderData.getIapPaymentMethod();
            if (this.mUnSuccessEdProductIds.contains(orderData.getProductId())) {
                C15162b.m27903d().mo24494c().mo24498a(iapPaymentMethod, new AbstractC15108b() {
                    /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.C152084 */

                    static {
                        Covode.recordClassIndex(17402);
                    }

                    @Override // com.bytedance.globalpayment.iap.p1049a.AbstractC15108b
                    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                        if (absResult != null && list != null && absResult.getCode() == 0 && !list.isEmpty()) {
                            for (Object obj : list.toArray()) {
                                AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
                                if (TextUtils.equals(absIapChannelOrderData.getProductId(), orderData.getProductId())) {
                                    OrderData orderData = orderData;
                                    C15130b bVar = bVar;
                                    C15253a.m28071a().mo24705e();
                                    OrderInfo buildOrderInfo = orderData.buildOrderInfo();
                                    C15126d dVar = new C15126d();
                                    dVar.f36928a = buildOrderInfo.getExtraPayload();
                                    dVar.f36930c = PayType.NOMAL;
                                    dVar.withErrorCode(208).withMessage("PipoPayManger: executeNewPay failed because cur productId is unfinished :" + orderData.getProductId() + ", then call back unFinish error");
                                    bVar.mo24395a(dVar, null);
                                    C15162b.m27903d().mo24492a().mo24504a(orderData, dVar);
                                    C15122b.m27797e().mo24381a().mo24406a(dVar, buildOrderInfo);
                                    IapServiceProvider.this.executeUnUploadTokenOrder(iapPaymentMethod, absIapChannelOrderData);
                                    return;
                                }
                            }
                        }
                        IapServiceProvider.this.executeNewPayInternal(orderData);
                    }
                });
            } else {
                executeNewPayInternal(orderData);
            }
            tryRestoreUnAckOrder(iapPaymentMethod);
        }
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void jumpToNotExpiredSubscriptionManagerPage(IapPaymentMethod iapPaymentMethod, String str, String str2) {
        C15162b.m27903d().mo24494c().mo24499a(iapPaymentMethod, str, str2);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(final IapPaymentMethod iapPaymentMethod, List<String> list, final String str) {
        if (this.mInitEd.get()) {
            C15162b.m27903d().mo24494c().mo24500a(iapPaymentMethod, list, false, (AbstractC15237c<AbsIapProduct>) new AbstractC15237c<AbsIapProduct>() {
                /* class com.bytedance.globalpayment.iap.service.provider.IapServiceProvider.C152095 */

                static {
                    Covode.recordClassIndex(17403);
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c
                /* renamed from: a */
                public final void mo24682a(AbsResult absResult, List<AbsIapProduct> list) {
                    if (absResult.getCode() == 0) {
                        AbstractC15155f a = C15122b.m27797e().mo24381a();
                        IapPaymentMethod iapPaymentMethod = iapPaymentMethod;
                        C15126d dVar = new C15126d(0, 0, "query success in queryProductDetails.");
                        dVar.f36928a = str;
                        a.mo24412a(iapPaymentMethod, dVar, list);
                        return;
                    }
                    C15253a.m28071a().mo24705e();
                    AbstractC15155f a2 = C15122b.m27797e().mo24381a();
                    IapPaymentMethod iapPaymentMethod2 = iapPaymentMethod;
                    C15126d dVar2 = new C15126d(301, absResult.getCode(), "query product list details from chanel service has error, result: " + absResult.getMessage());
                    dVar2.f36928a = str;
                    a2.mo24412a(iapPaymentMethod2, dVar2, list);
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.iap.p1049a.AbstractC15108b
    public void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        if (absResult != null && list != null) {
            if (absResult.getCode() != 0) {
                C15253a.m28071a().mo24705e();
                absResult.getMessage();
            } else if (list.isEmpty()) {
                C15253a.m28071a().mo24705e();
            } else {
                C15253a.m28071a().mo24705e();
                list.size();
                if (!C15253a.m28071a().mo24708h().mo24737d()) {
                    for (AbsIapChannelOrderData absIapChannelOrderData : list) {
                        C15253a.m28071a().mo24705e();
                        absIapChannelOrderData.isSubscription();
                        absIapChannelOrderData.isAcknowledged();
                        absIapChannelOrderData.getOrderState();
                        if (absIapChannelOrderData.isOrderStateSuccess()) {
                            String channelOrderId = absIapChannelOrderData.getChannelOrderId();
                            String developerPayload = absIapChannelOrderData.getDeveloperPayload();
                            if (!TextUtils.isEmpty(channelOrderId) || !TextUtils.isEmpty(developerPayload)) {
                                executeUnUploadTokenOrder(iapPaymentMethod, absIapChannelOrderData);
                            }
                        }
                    }
                }
            }
        }
    }
}
