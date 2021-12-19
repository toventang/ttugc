package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44083l;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44061e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44064h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b */
public final class C44056b extends C1445j.AbstractC1451e<Object> {
    static {
        Covode.recordClassIndex(52362);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final boolean mo4954b(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return C89219l.m154714a(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final boolean mo4953a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        if ((obj instanceof C44064h) && (obj2 instanceof C44064h)) {
            return C44083l.m86908a(((C44064h) obj).f102707a, ((C44064h) obj2).f102707a);
        }
        if (!(obj instanceof C44061e) || !(obj2 instanceof C44061e)) {
            return C89219l.m154714a(obj, obj2);
        }
        C44061e eVar = (C44061e) obj;
        C44061e eVar2 = (C44061e) obj2;
        if (!C89219l.m154714a((Object) eVar.f102703b.f102742a, (Object) eVar2.f102703b.f102742a) || !C44083l.m86908a(eVar.f102704c, eVar2.f102704c)) {
            return false;
        }
        return true;
    }
}
