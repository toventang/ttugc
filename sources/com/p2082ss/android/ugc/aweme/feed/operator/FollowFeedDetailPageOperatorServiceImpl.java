package com.p2082ss.android.ugc.aweme.feed.operator;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab;
import com.p2082ss.android.ugc.aweme.detail.operators.C41292l;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.operator.FollowFeedDetailPageOperatorServiceImpl */
public final class FollowFeedDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(58872);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.operator.FollowFeedDetailPageOperatorServiceImpl$a */
    public static final class C49768a implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(58873);
        }

        C49768a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            List<String> uidList = bVar.getUidList();
            C89219l.m154716b(uidList, "");
            List<String> blueDotList = bVar.getBlueDotList();
            C89219l.m154716b(blueDotList, "");
            return new C49770a(uidList, blueDotList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.operator.FollowFeedDetailPageOperatorServiceImpl$b */
    public static final class C49769b implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(58874);
        }

        C49769b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41292l(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageOperatorService
    /* renamed from: a */
    public final HashMap<String, AbstractC41265ab> mo57213a() {
        HashMap<String, AbstractC41265ab> hashMap = new HashMap<>();
        hashMap.put("from_following_sky_light", new C49768a());
        hashMap.put("from_follow_page", new C49769b());
        return hashMap;
    }
}
