package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ProfileDetailPageOperatorServiceImpl */
public final class ProfileDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(49141);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ProfileDetailPageOperatorServiceImpl$a */
    public static final class C41255a implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49142);
        }

        C41255a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41316u(aVar, true, bVar.getUid());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ProfileDetailPageOperatorServiceImpl$b */
    public static final class C41256b implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49143);
        }

        C41256b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41316u(aVar, false, bVar.getUid());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageOperatorService
    /* renamed from: a */
    public final HashMap<String, AbstractC41265ab> mo57213a() {
        HashMap<String, AbstractC41265ab> hashMap = new HashMap<>();
        hashMap.put("from_profile_self", new C41255a());
        hashMap.put("from_profile_other", new C41256b());
        return hashMap;
    }
}
