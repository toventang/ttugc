package com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.f */
final /* synthetic */ class C44373f extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f103481a = new C44373f();

    static {
        Covode.recordClassIndex(52705);
    }

    C44373f() {
        super(DeliveryPanelState.class, "status", "getStatus()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((DeliveryPanelState) obj).getStatus());
    }
}
