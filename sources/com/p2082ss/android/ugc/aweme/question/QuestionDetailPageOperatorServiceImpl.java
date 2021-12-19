package com.p2082ss.android.ugc.aweme.question;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.question.p3662d.C66518a;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.QuestionDetailPageOperatorServiceImpl */
public final class QuestionDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(78032);
    }

    /* renamed from: com.ss.android.ugc.aweme.question.QuestionDetailPageOperatorServiceImpl$a */
    public static final class C66493a implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(78033);
        }

        C66493a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C66518a(aVar, "from_question");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.QuestionDetailPageOperatorServiceImpl$b */
    public static final class C66494b implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(78034);
        }

        C66494b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C66518a(aVar, "qa_detail");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageOperatorService
    /* renamed from: a */
    public final HashMap<String, AbstractC41265ab> mo57213a() {
        HashMap<String, AbstractC41265ab> hashMap = new HashMap<>();
        hashMap.put("from_question", new C66493a());
        hashMap.put("qa_detail", new C66494b());
        return hashMap;
    }
}
