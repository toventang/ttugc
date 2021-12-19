package com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.a */
final /* synthetic */ class C44396a extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f103521a = new C44396a();

    static {
        Covode.recordClassIndex(52733);
    }

    C44396a() {
        super(AddressSelectState.class, "selectedAddress", "getSelectedAddress()Lcom/ss/android/ugc/aweme/ecommerce/delivery/repo/dto/ReachableAddress;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((AddressSelectState) obj).getSelectedAddress();
    }
}
