package com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45575o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.a */
public final class C43549a extends AbstractC43570i {

    /* renamed from: a */
    public final AddressListActivity f101552a;

    static {
        Covode.recordClassIndex(51789);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b.AbstractC43570i
    /* renamed from: b */
    public final void mo74035b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b.AbstractC43570i
    /* renamed from: c */
    public final void mo74036c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b.AbstractC43570i
    /* renamed from: a */
    public final void mo74034a() {
        this.f101552a.setContentView(mo76360i());
        C45575o.m88124a(this.f101552a.getWindow());
        this.f101552a.getWindow().setSoftInputMode(16);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43549a(AddressListActivity addressListActivity) {
        super(addressListActivity);
        C89219l.m154721d(addressListActivity, "");
        this.f101552a = addressListActivity;
    }
}
