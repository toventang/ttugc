package com.bytedance.globalpayment.iap.google.helper;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.google.C15165a;
import com.bytedance.globalpayment.iap.google.p1068d.C15187b;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.globalpayment.iap.google.helper.d */
public final class C15200d implements WeakHandler.IHandler {

    /* renamed from: a */
    public Handler f37100a;

    /* renamed from: b */
    public final long f37101b;

    /* renamed from: c */
    public final boolean f37102c;

    /* renamed from: d */
    public final CopyOnWriteArrayList<String> f37103d;

    /* renamed from: e */
    volatile Runnable f37104e;

    /* renamed from: f */
    public final AbstractC15108b f37105f;

    /* renamed from: g */
    private final int f37106g;

    /* renamed from: h */
    private C15187b f37107h;

    static {
        Covode.recordClassIndex(17381);
    }

    /* renamed from: com.bytedance.globalpayment.iap.google.helper.d$a */
    public static class C15204a {

        /* renamed from: a */
        public static final C15200d f37111a = new C15200d((byte) 0);

        static {
            Covode.recordClassIndex(17385);
        }
    }

    /* renamed from: a */
    public final C15187b mo24570a() {
        if (this.f37107h == null) {
            this.f37107h = new C15187b();
        }
        return this.f37107h;
    }

    /* renamed from: b */
    public final boolean mo24571b() {
        if (this.f37101b <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo24572c() {
        if (!mo24571b()) {
            RunnableC152033 r1 = new Runnable() {
                /* class com.bytedance.globalpayment.iap.google.helper.C15200d.RunnableC152033 */

                static {
                    Covode.recordClassIndex(17384);
                }

                public final void run() {
                    C15165a.m27920a().mo24513a(C15200d.this.f37105f);
                }
            };
            Handler handler = this.f37100a;
            if (handler == null) {
                this.f37104e = r1;
            } else {
                handler.post(r1);
            }
        }
    }

    private C15200d() {
        this.f37106g = 1020;
        this.f37103d = new CopyOnWriteArrayList<>();
        this.f37105f = new AbstractC15108b() {
            /* class com.bytedance.globalpayment.iap.google.helper.C15200d.C152022 */

            static {
                Covode.recordClassIndex(17383);
            }

            @Override // com.bytedance.globalpayment.iap.p1049a.AbstractC15108b
            public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                if (!(absResult == null || absResult.getCode() != 0 || list == null)) {
                    Object[] array = list.toArray();
                    for (Object obj : array) {
                        if (obj != null) {
                            AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
                            String selfOrderId = absIapChannelOrderData.getSelfOrderId();
                            if (!TextUtils.isEmpty(selfOrderId) && C15200d.this.f37103d.contains(selfOrderId) && absIapChannelOrderData.getOrderState() != 2) {
                                PaymentServiceManager.get().getIapExternalService().executeUnUploadTokenOrder(IapPaymentMethod.GOOGLE, absIapChannelOrderData);
                                C15200d dVar = C15200d.this;
                                if (!dVar.mo24571b() && dVar.f37103d.contains(absIapChannelOrderData.getSelfOrderId())) {
                                    dVar.f37103d.remove(absIapChannelOrderData.getSelfOrderId());
                                    dVar.mo24570a().mo24549a(absIapChannelOrderData.getProductId(), absIapChannelOrderData.getSelfOrderId(), absIapChannelOrderData.isSubscription(), 2);
                                }
                            }
                        }
                    }
                }
                if (C15200d.this.f37103d.size() > 0 && C15200d.this.f37100a != null) {
                    C15200d.this.f37100a.sendEmptyMessageDelayed(1020, C15200d.this.f37101b);
                }
            }
        };
        this.f37101b = C15253a.m28071a().mo24708h().mo24740g();
        this.f37102c = C15253a.m28071a().mo24708h().mo24741h();
        new Thread(new Runnable() {
            /* class com.bytedance.globalpayment.iap.google.helper.C15200d.RunnableC152011 */

            static {
                Covode.recordClassIndex(17382);
            }

            public final void run() {
                C15200d dVar = C15200d.this;
                Looper.prepare();
                dVar.f37100a = new WeakHandler(Looper.myLooper(), dVar);
                if (dVar.f37104e != null) {
                    dVar.f37100a.post(dVar.f37104e);
                    dVar.f37104e = null;
                }
                Looper.loop();
            }
        }, "restore_order_opt_thread").start();
    }

    /* synthetic */ C15200d(byte b) {
        this();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 1020) {
            mo24572c();
        }
    }
}
