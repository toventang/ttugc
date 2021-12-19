package com.p2082ss.android.ugc.aweme.discover.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallengeList;
import com.p2082ss.android.ugc.aweme.discover.model.SearchEffectListResponse;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUserList;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApi */
public final class SearchApi {

    /* renamed from: a */
    public static final String f97594a = Api.f79771d;

    /* renamed from: b */
    public static final SearchApi f97595b = new SearchApi();

    /* renamed from: c */
    private static final AbstractC89244h f97596c = C89250i.m154773a((AbstractC89171a) C41839a.f97597a);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(49757);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/challenge/search/")
        @AbstractC89721e
        AbstractFutureC27655q<SearchChallengeList> searchChallengeList(@AbstractC89719c(mo144273a = "cursor") long j, @AbstractC89719c(mo144273a = "keyword") String str, @AbstractC89719c(mo144273a = "count") int i, @AbstractC89719c(mo144273a = "hot_search") int i2, @AbstractC89719c(mo144273a = "source") String str2, @AbstractC89719c(mo144273a = "search_source") String str3, @AbstractC89719c(mo144273a = "search_id") String str4, @AbstractC89719c(mo144273a = "last_search_id") String str5, @AbstractC89719c(mo144273a = "query_correct_type") int i3, @AbstractC89719c(mo144273a = "search_context") String str6);

        @AbstractC89731o(mo144285a = "/aweme/v1/loadmore/wish/")
        @AbstractC89721e
        C1731i<SearchEffectListResponse> searchEffectList(@AbstractC89719c(mo144273a = "keyword") String str, @AbstractC89719c(mo144273a = "alasrc") String str2, @AbstractC89719c(mo144273a = "source") String str3, @AbstractC89719c(mo144273a = "offset") int i, @AbstractC89719c(mo144273a = "limit") int i2, @AbstractC89719c(mo144273a = "aid") int i3);

        @AbstractC89731o(mo144285a = "/aweme/v1/live/search/")
        @AbstractC89721e
        AbstractFutureC27655q<SearchLiveList> searchLiveList(@AbstractC89719c(mo144273a = "offset") long j, @AbstractC89719c(mo144273a = "keyword") String str, @AbstractC89719c(mo144273a = "count") int i, @AbstractC89719c(mo144273a = "search_source") String str2, @AbstractC89719c(mo144273a = "enter_from") String str3, @AbstractC89719c(mo144273a = "search_id") String str4, @AbstractC89719c(mo144273a = "source") String str5, @AbstractC89719c(mo144273a = "live_id_list") String str6);

        @AbstractC89731o(mo144285a = "/aweme/v1/music/search/")
        @AbstractC89721e
        AbstractFutureC27655q<SearchMusicList> searchMusicList(@AbstractC89719c(mo144273a = "cursor") long j, @AbstractC89719c(mo144273a = "keyword") String str, @AbstractC89719c(mo144273a = "count") int i, @AbstractC89719c(mo144273a = "hot_search") int i2, @AbstractC89719c(mo144273a = "search_id") String str2, @AbstractC89719c(mo144273a = "last_search_id") String str3, @AbstractC89719c(mo144273a = "source") String str4, @AbstractC89719c(mo144273a = "search_source") String str5, @AbstractC89719c(mo144273a = "query_correct_type") int i3, @AbstractC89719c(mo144273a = "is_filter_search") int i4, @AbstractC89719c(mo144273a = "filter_by") int i5, @AbstractC89719c(mo144273a = "sort_type") int i6, @AbstractC21998f LinkedHashMap<String, Integer> linkedHashMap, @AbstractC89719c(mo144273a = "search_context") String str6);

        @AbstractC89731o(mo144285a = "/aweme/v1/discover/search/")
        @AbstractC89721e
        AbstractFutureC27655q<SearchUserList> searchUserList(@AbstractC89719c(mo144273a = "cursor") long j, @AbstractC89719c(mo144273a = "keyword") String str, @AbstractC89719c(mo144273a = "count") int i, @AbstractC89719c(mo144273a = "type") int i2, @AbstractC89719c(mo144273a = "hot_search") int i3, @AbstractC89719c(mo144273a = "search_source") String str2, @AbstractC89719c(mo144273a = "search_id") String str3, @AbstractC89719c(mo144273a = "last_search_id") String str4, @AbstractC89719c(mo144273a = "query_correct_type") int i4, @AbstractC89719c(mo144273a = "search_channel") String str5, @AbstractC89719c(mo144273a = "sug_user_id") String str6, @AbstractC89719c(mo144273a = "is_rich_sug") String str7, @AbstractC89719c(mo144273a = "search_context") String str8);
    }

    /* renamed from: a */
    public static RealApi m83820a() {
        return (RealApi) f97596c.getValue();
    }

    private SearchApi() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApi$a */
    static final class C41839a extends AbstractC89220m implements AbstractC89171a<RealApi> {

        /* renamed from: a */
        public static final C41839a f97597a = new C41839a();

        static {
            Covode.recordClassIndex(49758);
        }

        C41839a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RealApi invoke() {
            return RetrofitFactory.m33635a().mo28817b(SearchApi.f97594a).mo28832d().mo28858a(RealApi.class);
        }
    }

    static {
        Covode.recordClassIndex(49756);
    }

    /* renamed from: b */
    public static SearchChallengeList m83823b(C42174f fVar) {
        C89219l.m154721d(fVar, "");
        try {
            SearchChallengeList searchChallengeList = m83820a().searchChallengeList(fVar.f98292i, fVar.f98284a, fVar.f98293j, fVar.f98288e, "challenge", fVar.f98286c, fVar.f98290g, fVar.f98291h, fVar.f98289f, fVar.f98303t).get();
            C89219l.m154716b(searchChallengeList, "");
            return searchChallengeList;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC34479a.getCompatibleException(e);
            C89219l.m154716b(compatibleException, "");
            throw compatibleException;
        }
    }

    /* renamed from: c */
    public static SearchLiveList m83824c(C42174f fVar) {
        C89219l.m154721d(fVar, "");
        try {
            SearchLiveList searchLiveList = m83820a().searchLiveList(fVar.f98292i, fVar.f98284a, fVar.f98293j, fVar.f98286c, fVar.f98294k, fVar.f98290g, fVar.f98287d, fVar.f98302s).get();
            C89219l.m154716b(searchLiveList, "");
            return searchLiveList;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC34479a.getCompatibleException(e);
            C89219l.m154716b(compatibleException, "");
            throw compatibleException;
        }
    }

    /* renamed from: a */
    public static SearchUserList m83822a(C42174f fVar) {
        C89219l.m154721d(fVar, "");
        try {
            SearchUserList searchUserList = m83820a().searchUserList(fVar.f98292i, fVar.f98284a, fVar.f98293j, 1, fVar.f98288e, fVar.f98286c, fVar.f98290g, fVar.f98291h, fVar.f98289f, fVar.f98296m, fVar.f98298o, fVar.f98299p, fVar.f98303t).get();
            C89219l.m154716b(searchUserList, "");
            return searchUserList;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC34479a.getCompatibleException(e);
            C89219l.m154716b(compatibleException, "");
            throw compatibleException;
        }
    }

    /* renamed from: d */
    public static SearchMusicList m83825d(C42174f fVar) {
        ExecutionException e;
        int i;
        int i2;
        int i3;
        LinkedHashMap<String, Integer> linkedHashMap;
        C89219l.m154721d(fVar, "");
        try {
            RealApi a = m83820a();
            long j = fVar.f98292i;
            String str = fVar.f98284a;
            int i4 = fVar.f98293j;
            int i5 = fVar.f98288e;
            String str2 = fVar.f98290g;
            String str3 = fVar.f98291h;
            String str4 = fVar.f98286c;
            int i6 = fVar.f98289f;
            C67437b bVar = fVar.f98295l;
            if (bVar == null || bVar.isDefaultOption()) {
                i = 0;
            } else {
                i = 1;
            }
            C67437b bVar2 = fVar.f98295l;
            if (bVar2 != null) {
                i2 = bVar2.getFilterBy();
            } else {
                i2 = 0;
            }
            C67437b bVar3 = fVar.f98295l;
            if (bVar3 != null) {
                i3 = bVar3.getSortType();
            } else {
                i3 = 0;
            }
            try {
                C67437b bVar4 = fVar.f98295l;
                if (bVar4 == null || (linkedHashMap = bVar4.activityToFieldMap()) == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                SearchMusicList searchMusicList = a.searchMusicList(j, str, i4, i5, str2, str3, "music", str4, i6, i, i2, i3, linkedHashMap, fVar.f98303t).get();
                C89219l.m154716b(searchMusicList, "");
                return searchMusicList;
            } catch (ExecutionException e2) {
                e = e2;
                RuntimeException compatibleException = AbstractC34479a.getCompatibleException(e);
                C89219l.m154716b(compatibleException, "");
                throw compatibleException;
            }
        } catch (ExecutionException e3) {
            e = e3;
            RuntimeException compatibleException2 = AbstractC34479a.getCompatibleException(e);
            C89219l.m154716b(compatibleException2, "");
            throw compatibleException2;
        }
    }

    /* renamed from: a */
    public static SearchLiveList m83821a(String str, long j, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str5, "");
        try {
            SearchLiveList searchLiveList = m83820a().searchLiveList(j, str, 20, str3, str4, str5, str2, "").get();
            C89219l.m154716b(searchLiveList, "");
            return searchLiveList;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC34479a.getCompatibleException(e);
            C89219l.m154716b(compatibleException, "");
            throw compatibleException;
        }
    }
}
