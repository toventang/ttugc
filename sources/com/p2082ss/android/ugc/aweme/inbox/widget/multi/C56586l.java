package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.l */
public final class C56586l extends C1445j.AbstractC1451e<AbstractC56585k> {
    static {
        Covode.recordClassIndex(66409);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final /* synthetic */ boolean mo4953a(AbstractC56585k kVar, AbstractC56585k kVar2) {
        AbstractC56585k kVar3 = kVar;
        AbstractC56585k kVar4 = kVar2;
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        if (kVar3.f129018j == kVar4.f129018j) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final /* synthetic */ boolean mo4954b(AbstractC56585k kVar, AbstractC56585k kVar2) {
        AbstractC56585k kVar3 = kVar;
        AbstractC56585k kVar4 = kVar2;
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        if (!(kVar3 instanceof C56562b) || !(kVar4 instanceof C56562b)) {
            return C89219l.m154714a(kVar3, kVar4);
        }
        if (kVar3.mo93492a() != kVar4.mo93492a()) {
            return false;
        }
        C56562b bVar = (C56562b) kVar3;
        C56562b bVar2 = (C56562b) kVar4;
        if (!C89219l.m154714a(bVar.f128967e, bVar2.f128967e) || !C89219l.m154714a((Object) bVar.f128966d, (Object) bVar2.f128966d) || kVar3.f129018j != kVar4.f129018j || !C89219l.m154714a((Object) bVar.f128968f, (Object) bVar2.f128968f)) {
            return false;
        }
        return true;
    }
}
