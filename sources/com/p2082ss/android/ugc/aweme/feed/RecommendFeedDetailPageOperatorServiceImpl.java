package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab;
import com.p2082ss.android.ugc.aweme.feed.model.FriendVideoMoreOperator;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.RecommendFeedDetailPageOperatorServiceImpl */
public final class RecommendFeedDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(56741);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.RecommendFeedDetailPageOperatorServiceImpl$a */
    public static final class C48016a implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(56742);
        }

        C48016a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new FriendVideoMoreOperator(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageOperatorService
    /* renamed from: a */
    public final HashMap<String, AbstractC41265ab> mo57213a() {
        HashMap<String, AbstractC41265ab> hashMap = new HashMap<>();
        hashMap.put("friend_more", new C48016a());
        return hashMap;
    }
}
