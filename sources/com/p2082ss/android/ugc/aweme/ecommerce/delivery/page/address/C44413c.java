package com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.c */
final /* synthetic */ class C44413c extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f103549a = new C44413c();

    static {
        Covode.recordClassIndex(52750);
    }

    C44413c() {
        super(AddressSelectState.class, "selectedAddress", "getSelectedAddress()Lcom/ss/android/ugc/aweme/ecommerce/delivery/repo/dto/ReachableAddress;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((AddressSelectState) obj).getSelectedAddress();
    }
}
