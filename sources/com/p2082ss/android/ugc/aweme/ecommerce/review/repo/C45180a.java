package com.p2082ss.android.ugc.aweme.ecommerce.review.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.a */
public final class C45180a extends AbstractC20179a<ReviewApi.C45179c, ListReviewData, ReviewApi.C45179c, ListReviewData> {
    static {
        Covode.recordClassIndex(53615);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.a$a */
    public static final class C45181a extends RuntimeException {

        /* renamed from: a */
        private final C43612a<ListReviewData> f105319a;

        static {
            Covode.recordClassIndex(53616);
        }

        public final C43612a<ListReviewData> getResponse() {
            return this.f105319a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45181a(C43612a<ListReviewData> aVar, String str) {
            super(str);
            C89219l.m154721d(aVar, "");
            this.f105319a = aVar;
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.a$b */
    static final class C45182b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C45182b f105320a = new C45182b();

        static {
            Covode.recordClassIndex(53617);
        }

        C45182b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C43612a aVar = (C43612a) obj;
            C89219l.m154721d(aVar, "");
            if (aVar.isCodeOK() && aVar.data != null) {
                return aVar.data;
            }
            throw new C45181a(aVar, "code is not ok | data is null");
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<ListReviewData> mo33481a(ReviewApi.C45179c cVar) {
        ReviewApi.C45179c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        C89219l.m154721d(cVar2, "");
        AbstractC88979t<C43612a<ListReviewData>> b = ((ReviewApi) ReviewApi.C45173a.f105307a.mo28858a(ReviewApi.class)).getReviewInfo(cVar2).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        AbstractC88979t<R> d = b.mo143292d(C45182b.f105320a);
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj2;
    }
}
