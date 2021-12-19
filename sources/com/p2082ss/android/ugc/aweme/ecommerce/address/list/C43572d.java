package com.p2082ss.android.ugc.aweme.ecommerce.address.list;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.d */
public final class C43572d extends C1445j.AbstractC1451e<Object> {
    static {
        Covode.recordClassIndex(51812);
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
        if ((obj instanceof C44457d) && (obj2 instanceof C44457d)) {
            return C89219l.m154714a((Object) ((C44457d) obj).f103650b.f101187a, (Object) ((C44457d) obj2).f103650b.f101187a);
        }
        if (!(obj instanceof AddressAdapter.C43521a) || !(obj2 instanceof AddressAdapter.C43521a)) {
            return C89219l.m154714a(obj, obj2);
        }
        return C89219l.m154714a(obj.getClass(), obj2.getClass());
    }
}
