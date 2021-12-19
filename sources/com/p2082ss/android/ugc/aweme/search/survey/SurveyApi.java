package com.p2082ss.android.ugc.aweme.search.survey;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyApi */
public final class SurveyApi {

    /* renamed from: a */
    public static final SurveyApi f151788a = new SurveyApi();

    /* renamed from: b */
    private static final AbstractC89244h f151789b = C89250i.m154773a((AbstractC89171a) C67727a.f151792a);

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyApi$Api */
    public interface Api {

        /* renamed from: a */
        public static final /* synthetic */ C67726a f151790a = C67726a.f151791a;

        static {
            Covode.recordClassIndex(79374);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/search/survey/detail/")
        C1731i<C67754d> fetch(@AbstractC89736t(mo144292a = "survey_id") String str);

        @AbstractC89731o(mo144285a = "/aweme/v1/search/survey/submit/")
        @AbstractC89721e
        C1731i<BaseResponse> submit(@AbstractC89719c(mo144273a = "survey_id") String str, @AbstractC89719c(mo144273a = "search_id") String str2, @AbstractC89719c(mo144273a = "survey_answer_rating") int i, @AbstractC89719c(mo144273a = "keyword") String str3);

        /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyApi$Api$a */
        public static final class C67726a {

            /* renamed from: a */
            static final /* synthetic */ C67726a f151791a = new C67726a();

            private C67726a() {
            }

            static {
                Covode.recordClassIndex(79375);
            }
        }
    }

    /* renamed from: a */
    static Api m119904a() {
        return (Api) f151789b.getValue();
    }

    private SurveyApi() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyApi$a */
    static final class C67727a extends AbstractC89220m implements AbstractC89171a<Api> {

        /* renamed from: a */
        public static final C67727a f151792a = new C67727a();

        static {
            Covode.recordClassIndex(79376);
        }

        C67727a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.m33635a().mo28817b(C29736b.f70921b).mo28832d().mo28858a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(79373);
    }
}
