package com.bytedance.globalpayment.iap.google.p1065a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15127a;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15128b;
import com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.google.a.a */
public interface AbstractC15178a {
    static {
        Covode.recordClassIndex(17358);
    }

    /* renamed from: a */
    void mo24511a(Activity activity, String str, boolean z, OrderData orderData, AbstractC15180a aVar);

    /* renamed from: a */
    void mo24513a(AbstractC15108b bVar);

    /* renamed from: a */
    void mo24514a(AbstractC15127a aVar);

    /* renamed from: a */
    void mo24515a(AbstractC15128b bVar);

    /* renamed from: a */
    void mo24517a(List<String> list, boolean z, AbstractC15237c<AbsIapProduct> cVar);

    /* renamed from: a */
    void mo24518a(boolean z, String str, ConsumeIapProductListener consumeIapProductListener);

    /* renamed from: b */
    boolean mo24520b();

    /* renamed from: c */
    void mo24521c();
}
