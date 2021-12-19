package com.p2082ss.android.ugc.aweme.discover.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingData;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.utils.C80512gt;
import java.util.concurrent.ExecutionException;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi */
public final class SuggestWordsApi {

    /* renamed from: a */
    public static final SuggestWordsApi f97634a = new SuggestWordsApi();

    /* renamed from: b */
    private static final AbstractC89244h f97635b = C89250i.m154773a((AbstractC89171a) C41853b.f97648a);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$SuggestApi */
    public interface SuggestApi {

        /* renamed from: a */
        public static final C41851a f97636a = C41851a.f97637a;

        static {
            Covode.recordClassIndex(49776);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/suggest/deletemostvisit/")
        @AbstractC21999g
        C1731i<BaseResponse> deleteVisitedAccount(@AbstractC89719c(mo144273a = "uid") String str);

        @AbstractC89722f(mo144276a = "/aweme/v1/search/clicksug/")
        C1731i<ClickSearchResponse> fetchClickSearchData(@AbstractC89736t(mo144292a = "keyword") String str, @AbstractC89736t(mo144292a = "aweme_id") String str2);

        @AbstractC89722f(mo144276a = "/aweme/v1/search/billboard/")
        C1731i<TrendingData> fetchSearchBillboard(@AbstractC89736t(mo144292a = "billboard_type") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/suggest/guide/")
        AbstractC88979t<SuggestWordResponse> fetchSuggestWords(@AbstractC89736t(mo144292a = "business_id") String str, @AbstractC89736t(mo144292a = "pd") String str2, @AbstractC89736t(mo144292a = "history_list") String str3, @AbstractC89736t(mo144292a = "is_debug") String str4);

        @AbstractC89722f(mo144276a = "/aweme/v1/suggest/guide/")
        AbstractC88403ab<SuggestWordResponse> getSuggestSearchList(@AbstractC89736t(mo144292a = "business_id") String str, @AbstractC89736t(mo144292a = "pd") String str2, @AbstractC89736t(mo144292a = "history_list") String str3, @AbstractC89736t(mo144292a = "is_debug") String str4, @AbstractC89736t(mo144292a = "req_source") String str5);

        @AbstractC89722f(mo144276a = "/aweme/v1/suggest/guide/")
        C1731i<SuggestWordResponse> getSuggestWords(@AbstractC89736t(mo144292a = "business_id") String str, @AbstractC89736t(mo144292a = "from_group_id") String str2, @AbstractC89736t(mo144292a = "word_in_box") String str3, @AbstractC89736t(mo144292a = "data_type") Integer num, @AbstractC89736t(mo144292a = "history_list") String str4, @AbstractC89736t(mo144292a = "type") String str5);

        @AbstractC89722f(mo144276a = "/aweme/v1/suggest/guide/")
        C1731i<String> getSuggestWordsWithRawString(@AbstractC89736t(mo144292a = "business_id") String str, @AbstractC89736t(mo144292a = "from_group_id") String str2, @AbstractC89736t(mo144292a = "word_in_box") String str3, @AbstractC89736t(mo144292a = "data_type") Integer num, @AbstractC89736t(mo144292a = "history_list") String str4, @AbstractC89736t(mo144292a = "type") String str5);

        /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$SuggestApi$a */
        public static final class C41851a {

            /* renamed from: a */
            static final /* synthetic */ C41851a f97637a = new C41851a();

            private C41851a() {
            }

            static {
                Covode.recordClassIndex(49777);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$a */
    public static final class C41852a {

        /* renamed from: a */
        public String f97638a;

        /* renamed from: b */
        public String f97639b;

        /* renamed from: c */
        public String f97640c;

        /* renamed from: d */
        public String f97641d;

        /* renamed from: e */
        public String f97642e;

        /* renamed from: f */
        public String f97643f;

        /* renamed from: g */
        public String f97644g;

        /* renamed from: h */
        public String f97645h;

        /* renamed from: i */
        public Integer f97646i;

        /* renamed from: j */
        public String f97647j;

        static {
            Covode.recordClassIndex(49778);
        }
    }

    /* renamed from: a */
    public static SuggestApi m83832a() {
        return (SuggestApi) f97635b.getValue();
    }

    private SuggestWordsApi() {
    }

    /* renamed from: b */
    public static C1731i<TrendingData> m83833b() {
        return m83832a().fetchSearchBillboard(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$b */
    static final class C41853b extends AbstractC89220m implements AbstractC89171a<SuggestApi> {

        /* renamed from: a */
        public static final C41853b f97648a = new C41853b();

        static {
            Covode.recordClassIndex(49779);
        }

        C41853b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SuggestApi invoke() {
            return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(SuggestApi.class);
        }
    }

    static {
        Covode.recordClassIndex(49775);
    }

    /* renamed from: b */
    public static C1731i<BaseResponse> m83834b(C41852a aVar) {
        C89219l.m154721d(aVar, "");
        try {
            return m83832a().deleteVisitedAccount(aVar.f97645h);
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC34479a.getCompatibleException(e);
            C89219l.m154716b(compatibleException, "");
            throw compatibleException;
        }
    }

    /* renamed from: c */
    public static final AbstractC88979t<SuggestWordResponse> m83835c(C41852a aVar) {
        C89219l.m154721d(aVar, "");
        return m83832a().fetchSuggestWords(aVar.f97638a, aVar.f97639b, C80512gt.f180112c.mo123769a().mo123767a(), aVar.f97640c);
    }

    /* renamed from: d */
    public static C1731i<ClickSearchResponse> m83836d(C41852a aVar) {
        C89219l.m154721d(aVar, "");
        return m83832a().fetchClickSearchData(aVar.f97643f, aVar.f97644g);
    }

    /* renamed from: a */
    public static C1731i<String> m83831a(C41852a aVar) {
        C89219l.m154721d(aVar, "");
        return m83832a().getSuggestWordsWithRawString(aVar.f97638a, aVar.f97641d, aVar.f97642e, aVar.f97646i, C80512gt.f180112c.mo123769a().mo123767a(), "qrec");
    }
}
