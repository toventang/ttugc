package com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.logistic;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic.e */
final /* synthetic */ class C44447e extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f103608a = new C44447e();

    static {
        Covode.recordClassIndex(52786);
    }

    C44447e() {
        super(DeliveryPanelState.class, "selectedLogistic", "getSelectedLogistic()Lcom/ss/android/ugc/aweme/ecommerce/delivery/repo/dto/LogisticDTO;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((DeliveryPanelState) obj).getSelectedLogistic();
    }
}
