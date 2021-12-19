package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.feed.EnumC49664i;
import com.p2082ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.a */
public final class C51601a extends AbstractC20179a<String, String, DislikeRecommendParams, String> {
    static {
        Covode.recordClassIndex(60944);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.a$a */
    static final class C51602a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ DislikeRecommendParams f118909a;

        static {
            Covode.recordClassIndex(60945);
        }

        C51602a(DislikeRecommendParams dislikeRecommendParams) {
            this.f118909a = dislikeRecommendParams;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return this.f118909a.uid;
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        DislikeRecommendParams dislikeRecommendParams = (DislikeRecommendParams) obj;
        C89219l.m154721d(dislikeRecommendParams, "");
        return dislikeRecommendParams.uid;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<String> mo33481a(DislikeRecommendParams dislikeRecommendParams) {
        DislikeRecommendParams dislikeRecommendParams2 = dislikeRecommendParams;
        C89219l.m154721d(dislikeRecommendParams2, "");
        AbstractC88979t<R> d = RecommendUserApiService.f167940a.dislikeRecommend(dislikeRecommendParams2.uid, dislikeRecommendParams2.secUid, Integer.valueOf(EnumC49664i.SCENE_CARD.getValue())).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143292d(new C51602a(dislikeRecommendParams2));
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
