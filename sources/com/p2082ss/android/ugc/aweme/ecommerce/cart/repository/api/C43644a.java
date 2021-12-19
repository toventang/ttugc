package com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.api.CartApi;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43641b;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43642c;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.api.a */
public final class C43644a extends AbstractC20179a<C43641b, C43642c, C43641b, C43642c> {
    static {
        Covode.recordClassIndex(51903);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<C43642c> mo33481a(C43641b bVar) {
        C43641b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(bVar2, "");
        AbstractC88979t<C43642c> b = ((CartApi) CartApi.C43643a.f101733a.mo28858a(CartApi.class)).addToCart(bVar2).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj2;
    }
}
