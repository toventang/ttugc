package com.bytedance.android.live.wallet.api;

import com.bytedance.android.live.wallet.AbstractC6360g;
import com.bytedance.android.live.wallet.p416c.C6316a;
import com.bytedance.android.live.wallet.p416c.C6331c;
import com.bytedance.android.livesdk.wallet.C11309a;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.C11316e;
import com.bytedance.android.livesdk.wallet.C11318g;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.android.live.wallet.api.b */
public class C6304b implements AbstractC15125a {

    /* renamed from: d */
    private static C6304b f15763d;

    /* renamed from: a */
    public String f15764a;

    /* renamed from: b */
    public boolean f15765b = false;

    /* renamed from: c */
    private final List<AbstractC6360g> f15766c = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(7020);
    }

    private C6304b() {
    }

    /* renamed from: a */
    public static C6304b m13621a() {
        MethodCollector.m26663i(12809);
        if (f15763d == null) {
            synchronized (C6304b.class) {
                try {
                    if (f15763d == null) {
                        f15763d = new C6304b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12809);
                    throw th;
                }
            }
        }
        C6304b bVar = f15763d;
        MethodCollector.m26664o(12809);
        return bVar;
    }

    /* renamed from: b */
    public final void mo12344b(AbstractC6360g gVar) {
        this.f15766c.remove(gVar);
    }

    /* renamed from: a */
    public final void mo12340a(AbstractC6360g gVar) {
        if (!this.f15766c.contains(gVar) && gVar != null) {
            this.f15766c.add(gVar);
        }
    }

    /* renamed from: a */
    private void m13623a(int i, Object obj) {
        for (AbstractC6360g gVar : this.f15766c) {
            if (gVar != null) {
                gVar.mo12414a(i, obj);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a
    /* renamed from: a */
    public final void mo12341a(C15126d dVar, OrderInfo orderInfo) {
        if (!C13603b.m24435a((Collection) this.f15766c) && orderInfo != null && dVar != null && C13627m.m24499a(orderInfo.getExtraPayload(), "0") && C13627m.m24499a(this.f15764a, orderInfo.getUserId())) {
            if (dVar.getCode() != 0) {
                m13622a(2, dVar.getCode(), dVar.getDetailCode(), "ttlive_pipo_create_order", new Exception(dVar.getMessage()), new C11318g(orderInfo.getProductId(), orderInfo.getOrderId()));
            } else if (orderInfo.getOrderId() == null) {
                m13622a(2, 32, -1, "ttlive_pipo_create_order", new Exception("create pipo order fail"), new C11318g(orderInfo.getProductId(), orderInfo.getOrderId()));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", orderInfo.getOrderId());
                C6331c.m13652a("ttlive_pipo_create_order", hashMap);
                m13623a(2, new C11316e(orderInfo.getProductId(), orderInfo.getOrderId(), orderInfo.getUserId()));
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a
    /* renamed from: b */
    public final void mo12345b(C15126d dVar, OrderInfo orderInfo) {
        if (!C13603b.m24435a((Collection) this.f15766c) && orderInfo != null && dVar != null && C13627m.m24499a(orderInfo.getExtraPayload(), "0") && C13627m.m24499a(this.f15764a, orderInfo.getUserId())) {
            if (dVar.getCode() != 0) {
                m13622a(2, dVar.getCode(), dVar.getDetailCode(), "ttlive_wallet_supplement_order", new Exception(dVar.getMessage()), new C11318g(orderInfo.getProductId(), orderInfo.getOrderId()));
            } else if (orderInfo.getOrderId() == null) {
                m13622a(2, 51, -1, "ttlive_wallet_supplement_order", new Exception("supplement_order_fail"), new C11318g(orderInfo.getProductId(), orderInfo.getOrderId()));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", orderInfo.getOrderId());
                C6331c.m13652a("ttlive_wallet_supplement_order", hashMap);
                m13623a(2, new C11316e(orderInfo.getProductId(), orderInfo.getOrderId(), orderInfo.getUserId()));
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a
    /* renamed from: a */
    public final void mo12342a(C15126d dVar, List<AbsIapProduct> list) {
        if (!C13603b.m24435a((Collection) this.f15766c) && dVar != null && C13627m.m24499a(dVar.f36928a, "0")) {
            if (dVar.getCode() != 0) {
                m13622a(1, dVar.getCode(), dVar.getDetailCode(), "ttlive_query_pipo_purchase", new Exception(dVar.getMessage()), new C11318g("", ""));
            } else if (C13603b.m24435a((Collection) list)) {
                m13622a(1, 21, -1, "ttlive_query_pipo_purchase", new Exception("query pipo purchase empty"), new C11318g("", ""));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("item_size", Integer.valueOf(list.size()));
                C6331c.m13652a("ttlive_query_pipo_purchase", hashMap);
                ArrayList arrayList = new ArrayList();
                for (AbsIapProduct absIapProduct : list) {
                    if (absIapProduct != null) {
                        C11314c cVar = new C11314c(absIapProduct.getProductId(), absIapProduct.getPrice(), absIapProduct.getPriceCurrencyCode(), absIapProduct.getPriceAmountMicros(), absIapProduct.getDescription());
                        if (absIapProduct.getChannelUserData() != null) {
                            cVar.f27064j = new C11309a(absIapProduct.getChannelUserData().getUserId(), absIapProduct.getChannelUserData().getUserMarkPlace());
                        }
                        arrayList.add(cVar);
                    }
                }
                m13623a(1, arrayList);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a
    /* renamed from: b */
    public final void mo12346b(C15126d dVar, List<AbsIapProduct> list) {
        if (!C13603b.m24435a((Collection) this.f15766c) && dVar != null) {
            if (dVar.getCode() != 0) {
                m13622a(4, dVar.getCode(), dVar.getDetailCode(), "ttlive_query_pipo_purchase", new Exception(dVar.getMessage()), new C11318g("", ""));
            } else if (C13603b.m24435a((Collection) list)) {
                m13622a(4, 21, -1, "ttlive_query_pipo_purchase", new Exception("query pipo purchase empty"), new C11318g("", ""));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("item_size", Integer.valueOf(list.size()));
                C6331c.m13652a("ttlive_query_pipo_purchase", hashMap);
                ArrayList arrayList = new ArrayList();
                for (AbsIapProduct absIapProduct : list) {
                    if (absIapProduct != null) {
                        arrayList.add(new C11314c(absIapProduct.getProductId(), absIapProduct.getPrice(), absIapProduct.getPriceCurrencyCode(), absIapProduct.getPriceAmountMicros(), absIapProduct.getDescription()));
                    }
                }
                m13623a(4, arrayList);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a
    /* renamed from: a */
    public final void mo12343a(IapPaymentMethod iapPaymentMethod, C15126d dVar) {
        String str;
        HashMap hashMap = new HashMap();
        if (iapPaymentMethod != null) {
            str = iapPaymentMethod.channelName;
        } else {
            str = "";
        }
        hashMap.put("pay_method", str);
        if (dVar == null) {
            C6331c.m13651a("ttlive_pipo_init", -1, -1, "iapResult is null", hashMap);
        } else if (dVar.isSuccess()) {
            C6331c.m13652a("ttlive_pipo_init", hashMap);
        } else {
            C6331c.m13651a("ttlive_pipo_init", dVar.getCode(), dVar.getDetailCode(), dVar.getMessage(), hashMap);
        }
    }

    /* renamed from: a */
    private void m13622a(int i, int i2, int i3, String str, Exception exc, C11318g gVar) {
        C6331c.m13650a(str, i2, i3, exc.getMessage());
        C6316a.m13637a(i2, i3, exc.getMessage());
        for (AbstractC6360g gVar2 : this.f15766c) {
            if (gVar2 != null) {
                gVar2.mo12413a(i, i2, i3, exc, gVar);
            }
        }
    }
}
