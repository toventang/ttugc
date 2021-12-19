package com.bytedance.globalpayment.iap.google;

import com.android.billingclient.api.AbstractC2250m;
import com.android.billingclient.api.C2242h;
import com.android.billingclient.api.SkuDetails;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.google.C15165a;
import com.bytedance.globalpayment.iap.google.helper.C15199c;
import com.bytedance.globalpayment.iap.google.p1067c.C15184b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15272d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.globalpayment.iap.google.d */
final /* synthetic */ class C15185d implements AbstractC2250m {

    /* renamed from: a */
    private final C15165a.C151758 f37067a;

    /* renamed from: b */
    private final AbstractC15237c f37068b;

    static {
        Covode.recordClassIndex(17365);
    }

    C15185d(C15165a.C151758 r1, AbstractC15237c cVar) {
        this.f37067a = r1;
        this.f37068b = cVar;
    }

    @Override // com.android.billingclient.api.AbstractC2250m
    /* renamed from: b */
    public final void mo6216b(C2242h hVar, List list) {
        int sb;
        C15165a.C151758 r3 = this.f37067a;
        AbstractC15237c cVar = this.f37068b;
        AbstractC15272d e = C15253a.m28071a().mo24705e();
        Object[] objArr = new Object[2];
        objArr[0] = hVar.f6732a + ":" + hVar.f6733b;
        if (list == null) {
            sb = 0;
        } else {
            sb = new StringBuilder().append(list.size()).toString();
        }
        objArr[1] = sb;
        e.mo24723a("BillingManager: result of query skuDetails list asynchronously is billingResult code is %s,skuDetailsList size is %s", objArr);
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = (SkuDetails) it.next();
                arrayList.add(new C15184b(skuDetails));
                if (!C15165a.this.f37006g.containsKey(skuDetails.mo6171a())) {
                    C15165a.this.f37006g.put(skuDetails.mo6171a(), skuDetails);
                }
            }
        }
        cVar.mo24682a(C15199c.m28008a(hVar), arrayList);
    }
}
