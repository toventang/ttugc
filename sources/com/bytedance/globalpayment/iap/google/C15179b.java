package com.bytedance.globalpayment.iap.google;

import com.android.billingclient.api.AbstractC2234c;
import com.android.billingclient.api.C2242h;
import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.google.C15165a;
import com.bytedance.globalpayment.iap.google.helper.C15199c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.Iterator;

/* renamed from: com.bytedance.globalpayment.iap.google.b */
final /* synthetic */ class C15179b implements AbstractC2234c {

    /* renamed from: a */
    private final C15165a.C151747 f37057a;

    /* renamed from: b */
    private final String f37058b;

    static {
        Covode.recordClassIndex(17359);
    }

    C15179b(C15165a.C151747 r1, String str) {
        this.f37057a = r1;
        this.f37058b = str;
    }

    @Override // com.android.billingclient.api.AbstractC2234c
    /* renamed from: a */
    public final void mo6189a(C2242h hVar) {
        C15165a.C151747 r4 = this.f37057a;
        String str = this.f37058b;
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
