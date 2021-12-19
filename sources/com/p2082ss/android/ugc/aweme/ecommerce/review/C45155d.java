package com.p2082ss.android.ugc.aweme.ecommerce.review;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.review.p2854a.AbstractC45150a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.d */
public final class C45155d extends C1445j.AbstractC1451e<AbstractC45150a> {

    /* renamed from: a */
    public boolean f105256a = true;

    static {
        Covode.recordClassIndex(53589);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: c */
    public final /* synthetic */ Object mo4955c(AbstractC45150a aVar, AbstractC45150a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return aVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final /* synthetic */ boolean mo4953a(AbstractC45150a aVar, AbstractC45150a aVar2) {
        ReviewItemStruct reviewItemStruct;
        ReviewItemStruct.MainReview mainReview;
        AbstractC45150a aVar3 = aVar;
        AbstractC45150a aVar4 = aVar2;
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        if (!this.f105256a) {
            return false;
        }
        if (aVar3 instanceof AbstractC45150a.C45151a) {
            String str = null;
            if (!(aVar4 instanceof AbstractC45150a.C45151a)) {
                aVar4 = null;
            }
            AbstractC45150a.C45151a aVar5 = (AbstractC45150a.C45151a) aVar4;
            if (!(aVar5 == null || (reviewItemStruct = aVar5.f105247a) == null || (mainReview = reviewItemStruct.f105340a) == null)) {
                str = mainReview.f105353a;
            }
            if (C89219l.m154714a((Object) str, (Object) ((AbstractC45150a.C45151a) aVar3).f105247a.f105340a.f105353a)) {
                return true;
            }
            return false;
        }
        throw new C89376n();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final /* synthetic */ boolean mo4954b(AbstractC45150a aVar, AbstractC45150a aVar2) {
        AbstractC45150a aVar3 = aVar2;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar3, "");
        if (!this.f105256a) {
            return false;
        }
        if (aVar instanceof AbstractC45150a.C45151a) {
            if (!(aVar3 instanceof AbstractC45150a.C45151a)) {
                aVar3 = null;
            }
            if (C89219l.m154714a(aVar3, aVar)) {
                return true;
            }
            return false;
        }
        throw new C89376n();
    }
}
