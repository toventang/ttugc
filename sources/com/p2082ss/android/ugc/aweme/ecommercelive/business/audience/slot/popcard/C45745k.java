package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.AbstractC45709b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.C45706a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.k */
public final class C45745k implements AbstractC45709b {

    /* renamed from: a */
    public final PopupCardVO f106547a;

    /* renamed from: b */
    private C45706a f106548b;

    /* renamed from: c */
    private final long f106549c;

    static {
        Covode.recordClassIndex(54263);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.AbstractC45709b
    /* renamed from: b */
    public final C45706a mo77000b() {
        return this.f106548b;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.AbstractC45709b
    /* renamed from: a */
    public final boolean mo76999a() {
        return this.f106547a.isInStock();
    }

    public C45745k(PopupCardVO popupCardVO, long j) {
        C45706a aVar;
        C89219l.m154721d(popupCardVO, "");
        this.f106547a = popupCardVO;
        this.f106549c = j;
        C45746l flashSaleInfo = popupCardVO.getFlashSaleInfo();
        if (flashSaleInfo != null) {
            aVar = new C45706a(j, flashSaleInfo.f106550a, flashSaleInfo.f106551b);
        } else {
            aVar = null;
        }
        this.f106548b = aVar;
    }
}
