package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl */
public final class SearchDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(49144);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl$a */
    public static final class C41257a implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49145);
        }

        C41257a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41317v(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl$b */
    public static final class C41258b implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49146);
        }

        C41258b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41298p((SearchJediViewModel) jediViewModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl$c */
    public static final class C41259c implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49147);
        }

        C41259c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41318w(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl$d */
    public static final class C41260d implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49148);
        }

        C41260d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41270ag(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageOperatorService
    /* renamed from: a */
    public final HashMap<String, AbstractC41265ab> mo57213a() {
        HashMap<String, AbstractC41265ab> hashMap = new HashMap<>();
        hashMap.put("from_search", new C41257a());
        hashMap.put("from_search_jedi", new C41258b());
        hashMap.put("from_search_mix", new C41259c());
        hashMap.put("from_search_continuous_loading_card", new C41260d());
        return hashMap;
    }
}
