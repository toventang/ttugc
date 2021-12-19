package com.bytedance.globalpayment.iap.google;

import com.android.billingclient.api.AbstractC2246j;
import com.android.billingclient.api.C2242h;
import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.google.C15165a;
import com.bytedance.globalpayment.iap.google.helper.C15199c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.Iterator;

/* renamed from: com.bytedance.globalpayment.iap.google.c */
final /* synthetic */ class C15182c implements AbstractC2246j {

    /* renamed from: a */
    private final C15165a.C151747 f37059a;

    static {
        Covode.recordClassIndex(17362);
    }

    C15182c(C15165a.C151747 r1) {
        this.f37059a = r1;
    }

    @Override // com.android.billingclient.api.AbstractC2246j
    /* renamed from: a */
    public final void mo6212a(C2242h hVar, String str) {
        C15165a.C151747 r3 = this.f37059a;
        ConsumeIapProductListener consumeIapProductListener = C15165a.this.f37003d.get(str);
        if (consumeIapProductListener != null) {
            if (C15165a.this.f37004e.size() == 0) {
                C15253a.m28071a().mo24705e();
            }
            Iterator<Purchase> it = C15165a.this.f37004e.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().mo6162c())) {
                    consumeIapProductListener.onConsumeFinished(C15199c.m28008a(hVar));
                }
            }
        }
        C15165a.this.f37003d.remove(str);
    }
}
