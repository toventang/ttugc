package com.bytedance.globalpayment.iap.google.p1069e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.android.billingclient.api.C2240g;
import com.android.billingclient.api.ProxyBillingActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15153d;
import com.bytedance.globalpayment.iap.common.ability.p1061h.C15156a;
import com.bytedance.globalpayment.iap.google.C15165a;
import com.bytedance.globalpayment.iap.google.helper.C15200d;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a;
import com.bytedance.globalpayment.iap.google.p1067c.C15183a;
import com.bytedance.globalpayment.iap.google.p1067c.C15184b;
import com.bytedance.globalpayment.iap.google.p1068d.C15186a;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1082j.C15281c;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.google.e.a */
public class C15188a extends AbstractC15131a {

    /* renamed from: c */
    public final String f37077c = C15188a.class.getCanonicalName();

    /* renamed from: d */
    public Activity f37078d;

    /* renamed from: e */
    public HandlerC15191b f37079e;

    static {
        Covode.recordClassIndex(17368);
    }

    /* renamed from: com.bytedance.globalpayment.iap.google.e.a$a */
    public class C15189a implements AbstractC15180a {

        /* renamed from: a */
        public C15186a f37080a;

        /* renamed from: b */
        public boolean f37081b;

        /* renamed from: c */
        public OrderData f37082c;

        /* renamed from: d */
        public OrderInfo f37083d;

        /* renamed from: e */
        public Message f37084e;

        /* renamed from: g */
        private C2240g f37086g;

        /* renamed from: h */
        private Application.ActivityLifecycleCallbacks f37087h;

        /* renamed from: i */
        private int f37088i;

        /* renamed from: j */
        private boolean f37089j;

        static {
            Covode.recordClassIndex(17369);
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a
        /* renamed from: b */
        public final int mo24530b() {
            return this.f37088i;
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a
        /* renamed from: d */
        public final C2240g mo24532d() {
            return this.f37086g;
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a
        /* renamed from: e */
        public final boolean mo24533e() {
            return this.f37081b;
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a
        /* renamed from: a */
        public final void mo24526a() {
            this.f37088i++;
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a
        /* renamed from: c */
        public final Activity mo24531c() {
            return C15188a.this.f37078d;
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a
        /* renamed from: f */
        public final void mo24534f() {
            if (C15188a.this.f37078d != null && !this.f37089j) {
                this.f37089j = true;
                C15188a.this.f37078d.getApplication().registerActivityLifecycleCallbacks(this.f37087h);
            }
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a
        /* renamed from: a */
        public final void mo24527a(C2240g gVar) {
            this.f37086g = gVar;
            this.f37088i = -1;
            this.f37081b = false;
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a
        /* renamed from: a */
        public final void mo24529a(C15183a aVar) {
            C15126d dVar = new C15126d(209, 2091, "pay failed because signature is invalid");
            dVar.f36930c = this.f37082c.getPayType();
            this.f37080a.mo24548a(aVar.getOrderState(), dVar);
            C15188a.this.mo24397a(dVar);
        }

        public C15189a(C15186a aVar, OrderData orderData) {
            this.f37080a = aVar;
            this.f37082c = orderData;
            this.f37083d = new OrderInfo(C15188a.this.f36941a);
            this.f37087h = new Application.ActivityLifecycleCallbacks(C15188a.this) {
                /* class com.bytedance.globalpayment.iap.google.p1069e.C15188a.C15189a.C151901 */

                static {
                    Covode.recordClassIndex(17370);
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                public final void onActivityPaused(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityStarted(Activity activity) {
                }

                public final void onActivityStopped(Activity activity) {
                }

                public final void onActivityResumed(Activity activity) {
                    if (activity.getClass() == ProxyBillingActivity.class) {
                        C15189a.this.f37080a.f37070b = SystemClock.uptimeMillis();
                        C15189a.this.f37081b = true;
                    }
                }

                public final void onActivityDestroyed(Activity activity) {
                    if (activity.getClass() == ProxyBillingActivity.class) {
                        C15189a.this.f37080a.f37071c = SystemClock.uptimeMillis();
                        if (C15253a.m28071a().mo24709i().mo24715d().f37215c > 0) {
                            C15189a.this.f37084e = Message.obtain();
                            C15189a.this.f37084e.what = 1435;
                            C15189a.this.f37084e.obj = C15189a.this.f37083d;
                            C15253a.m28071a().mo24705e();
                            Object obj = C15189a.this.f37084e.obj;
                            C15188a.this.f37079e.sendMessageDelayed(C15189a.this.f37084e, C15253a.m28071a().mo24709i().mo24715d().f37215c);
                        }
                        RestoreOrderService.getIns(C15188a.this.f37078d).onGooglePanelDismiss(C15189a.this.f37082c);
                    }
                }
            };
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a
        /* renamed from: a */
        public final void mo24528a(C15126d dVar, C15183a aVar, C15184b bVar) {
            C15126d dVar2;
            C15126d dVar3;
            C15188a.this.f37078d = null;
            if (C15188a.this.f37078d != null && this.f37089j) {
                C15188a.this.f37078d.getApplication().unregisterActivityLifecycleCallbacks(this.f37087h);
                this.f37089j = false;
            }
            int code = dVar.getCode();
            if (aVar != null) {
                C15253a.m28071a().mo24705e();
            }
            int i = -1;
            if (code == 0) {
                if (aVar != null) {
                    if (aVar.isOrderStateSuccess()) {
                        if (bVar == null) {
                            if (C15200d.C15204a.f37111a.f37102c) {
                                this.f37080a.mo24548a(aVar.getOrderState(), new C15126d(-201, dVar.getCode(), "pay successful in GooglePayPurchasesUpdatedListener but detail is null,resultMessage is " + dVar.getMessage()));
                            }
                        }
                        C15188a.this.f37079e.removeMessages(1435, this.f37084e);
                        this.f37080a.mo24548a(aVar.getOrderState(), null);
                        C15188a aVar2 = C15188a.this;
                        aVar2.f36941a.setAbsIapChannelOrderData(aVar).setAbsIapProduct(bVar);
                        aVar2.f36941a.setHost(aVar.getHost());
                        AbstractC15131a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(aVar2);
                        if (nextState != null) {
                            nextState.mo24398a(aVar2.f36941a);
                        }
                        C15200d dVar4 = C15200d.C15204a.f37111a;
                        if (!dVar4.mo24571b() && dVar4.f37103d.contains(aVar.getSelfOrderId())) {
                            dVar4.f37103d.remove(aVar.getSelfOrderId());
                            dVar4.mo24570a().mo24549a(aVar.getProductId(), aVar.getSelfOrderId(), aVar.isSubscription(), 3);
                            return;
                        }
                        return;
                    }
                    if (!aVar.isOrderStateSuccess()) {
                        dVar3 = new C15126d(-202, code, "pay successful in GooglePayPurchasesUpdatedListener but isOrderStateSuccess() is false,resultMessage is " + dVar.getMessage());
                    } else if (bVar == null) {
                        dVar3 = new C15126d(-200, code, "pay successful in GooglePayPurchasesUpdatedListener but detail is null,resultMessage is " + dVar.getMessage());
                    } else {
                        return;
                    }
                } else {
                    dVar3 = new C15126d(-203, code, "pay successful in GooglePayPurchasesUpdatedListener but googleIapOrderData is null,resultMessage is " + dVar.getMessage());
                }
                C15186a aVar3 = this.f37080a;
                if (aVar != null) {
                    i = aVar.getOrderState();
                }
                aVar3.mo24548a(i, dVar3);
                return;
            }
            if (code == 1) {
                dVar2 = new C15126d(206, code, "pay failed in GooglePayPurchasesUpdatedListener because user canceled,resultMessage is " + dVar.getMessage());
                C15200d dVar5 = C15200d.C15204a.f37111a;
                OrderData orderData = this.f37082c;
                if (!dVar5.mo24571b() && orderData != null) {
                    String orderId = orderData.getOrderId();
                    if (!dVar5.f37103d.contains(orderId)) {
                        dVar5.f37103d.add(orderId);
                        dVar5.mo24570a().mo24549a(orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().f36922g, 1);
                        if (dVar5.f37103d.size() == 1) {
                            dVar5.mo24572c();
                        }
                    }
                }
            } else {
                dVar2 = new C15126d(203, code, "pay failed in GooglePayPurchasesUpdatedListener,resultMessage is " + dVar.getMessage());
            }
            C15186a aVar4 = this.f37080a;
            if (aVar != null) {
                i = aVar.getOrderState();
            }
            aVar4.mo24548a(i, dVar2);
            C15156a.m27881a(C15253a.m28071a().mo24709i().mo24713b(), this.f37082c.getOrderId());
            C15188a.this.mo24397a(dVar2);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final EnumC15121a mo24396a() {
        return EnumC15121a.PerformPay;
    }

    /* renamed from: com.bytedance.globalpayment.iap.google.e.a$b */
    static class HandlerC15191b extends Handler {
        static {
            Covode.recordClassIndex(17371);
        }

        public HandlerC15191b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1435) {
                PaymentServiceManager.get().getIapExternalService().onOrderTimeout((OrderInfo) message.obj);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1057f.AbstractC15131a
    /* renamed from: a */
    public final void mo24398a(OrderData orderData) {
        super.mo24398a(orderData);
        if (orderData.isCanceled() || orderData.isFinished()) {
            C15253a.m28071a().mo24705e();
            orderData.getProductId();
            return;
        }
        Activity activity = this.f37078d;
        C15253a.m28071a().mo24705e();
        orderData.getProductId();
        C15186a aVar = new C15186a(orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().f36922g, this.f36941a.getPayType());
        aVar.f37069a = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        aVar.add(jSONObject, "product_id", aVar.f37072d);
        aVar.add(jSONObject, "request_id", aVar.f37073e);
        JSONObject jSONObject2 = new JSONObject();
        aVar.add(jSONObject2, "pay_type", (long) aVar.f37075g);
        aVar.add(jSONObject2, "is_subscription", aVar.f37074f);
        aVar.add(jSONObject2, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_google_pay_start", jSONObject2, null, jSONObject);
        Context b = C15253a.m28071a().mo24709i().mo24713b();
        if (b != null) {
            orderData.getProductId();
            String orderId = orderData.getOrderId();
            String str = orderData.getIapPayRequest().f36917b;
            String str2 = orderData.getIapPayRequest().f36920e;
            String str3 = orderData.getIapPayRequest().f36924i;
            C15253a.m28071a().mo24705e();
            C15156a.m27877a(b).edit().putString(C15281c.m28154a("key_google_pay_".concat(String.valueOf(orderId))), C15156a.m27878a(orderId, str, str2, str3)).apply();
        }
        C15165a.m27920a().mo24511a(activity, orderData.getProductId(), orderData.getIapPayRequest().f36922g, this.f36941a, new C15189a(aVar, this.f36941a));
    }

    public C15188a(AbstractC15153d dVar, Activity activity) {
        super(dVar);
        this.f37078d = activity;
        this.f37079e = new HandlerC15191b();
    }
}
