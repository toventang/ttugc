package com.p2082ss.android.ugc.aweme.challenge;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab;
import com.p2082ss.android.ugc.aweme.detail.operators.C41287g;
import com.p2082ss.android.ugc.aweme.detail.operators.C41288h;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ChallengeDetailPageOperatorServiceImpl */
public final class ChallengeDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(42667);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ChallengeDetailPageOperatorServiceImpl$a */
    public static final class C35481a implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(42668);
        }

        C35481a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41288h(aVar, "from_discovery_challenge");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ChallengeDetailPageOperatorServiceImpl$b */
    public static final class C35482b implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(42669);
        }

        C35482b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41288h(aVar, "from_challenge");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ChallengeDetailPageOperatorServiceImpl$c */
    public static final class C35483c implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(42670);
        }

        C35483c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41287g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageOperatorService
    /* renamed from: a */
    public final HashMap<String, AbstractC41265ab> mo57213a() {
        HashMap<String, AbstractC41265ab> hashMap = new HashMap<>();
        hashMap.put("from_discovery_challenge", new C35481a());
        hashMap.put("from_challenge", new C35482b());
        hashMap.put("from_search_recalled_challenge", new C35483c());
        return hashMap;
    }
}
