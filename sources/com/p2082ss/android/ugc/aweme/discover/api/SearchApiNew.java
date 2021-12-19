package com.p2082ss.android.ugc.aweme.discover.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18079b;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC22017y;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42427n;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42438t;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMix;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p2082ss.android.ugc.aweme.discover.p2767c.AbstractC41905f;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41902e;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67617g;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew */
public final class SearchApiNew {

    /* renamed from: a */
    public static final String f97598a;

    /* renamed from: b */
    public static final AbstractC18099f f97599b;

    /* renamed from: c */
    public static final int f97600c = 1;

    /* renamed from: d */
    public static final Set<String> f97601d = new LinkedHashSet();

    /* renamed from: e */
    public static final SearchApiNew f97602e = new SearchApiNew();

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$RealApi */
    public interface RealApi {

        /* renamed from: a */
        public static final C41840a f97603a = C41840a.f97605b;

        static {
            Covode.recordClassIndex(49760);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/search/videosug/")
        AbstractC88979t<C42438t> fetchFeedDetailWords(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "source") String str2);

        @AbstractC89731o(mo144285a = "/aweme/v1/search/item/")
        @AbstractC89721e
        AbstractFutureC27655q<SearchMix> searchFeedList(@AbstractC89719c(mo144273a = "keyword") String str, @AbstractC89719c(mo144273a = "offset") long j, @AbstractC89719c(mo144273a = "count") int i, @AbstractC89719c(mo144273a = "source") String str2, @AbstractC89719c(mo144273a = "search_source") String str3, @AbstractC89719c(mo144273a = "hot_search") int i2, @AbstractC89719c(mo144273a = "search_id") String str4, @AbstractC89719c(mo144273a = "last_search_id") String str5, @AbstractC89719c(mo144273a = "query_correct_type") int i3, @AbstractC89719c(mo144273a = "is_filter_search") int i4, @AbstractC89719c(mo144273a = "sort_type") int i5, @AbstractC89719c(mo144273a = "publish_time") int i6, @AbstractC89719c(mo144273a = "enter_from") String str6, @AbstractC89719c(mo144273a = "search_channel") String str7, @AbstractC89719c(mo144273a = "show_results_source") String str8, @AbstractC89719c(mo144273a = "search_context") String str9, @AbstractC21998f LinkedHashMap<String, Integer> linkedHashMap);

        @AbstractC89731o(mo144285a = "/aweme/v1/general/search/single/")
        @AbstractC89721e
        @AbstractC22017y(mo35806a = 3)
        C1731i<C42426m> searchMTMixFeedList(@AbstractC89719c(mo144273a = "keyword") String str, @AbstractC89719c(mo144273a = "offset") int i, @AbstractC89719c(mo144273a = "count") int i2, @AbstractC89719c(mo144273a = "search_source") String str2, @AbstractC89719c(mo144273a = "hot_search") int i3, @AbstractC89719c(mo144273a = "search_id") String str3, @AbstractC89719c(mo144273a = "last_search_id") String str4, @AbstractC89719c(mo144273a = "query_correct_type") int i4, @AbstractC89719c(mo144273a = "multi_mod") int i5, @AbstractC89719c(mo144273a = "sug_user_id") String str5, @AbstractC89719c(mo144273a = "is_rich_sug") String str6, @AbstractC89719c(mo144273a = "is_filter_search") int i6, @AbstractC89719c(mo144273a = "publish_time") int i7, @AbstractC89719c(mo144273a = "sort_type") int i8, @AbstractC89719c(mo144273a = "backtrace") String str7, @AbstractC89719c(mo144273a = "original_query") String str8, @AbstractC89719c(mo144273a = "words_type") String str9, @AbstractC89719c(mo144273a = "search_context") String str10, @AbstractC89719c(mo144273a = "ad_user_agent") String str11, @AbstractC89719c(mo144273a = "trending_event_id") String str12, @AbstractC21998f LinkedHashMap<String, Integer> linkedHashMap);

        @AbstractC89731o(mo144285a = "/aweme/v1/general/search/stream/")
        @AbstractC89721e
        @AbstractC21991ae
        @AbstractC22017y(mo35806a = 3)
        C1731i<C18079b<C42426m>> searchMTMixFeedListByChunk(@AbstractC89719c(mo144273a = "keyword") String str, @AbstractC89719c(mo144273a = "offset") int i, @AbstractC89719c(mo144273a = "count") int i2, @AbstractC89719c(mo144273a = "search_source") String str2, @AbstractC89719c(mo144273a = "hot_search") int i3, @AbstractC89719c(mo144273a = "search_id") String str3, @AbstractC89719c(mo144273a = "last_search_id") String str4, @AbstractC89719c(mo144273a = "query_correct_type") int i4, @AbstractC89719c(mo144273a = "multi_mod") int i5, @AbstractC89719c(mo144273a = "sug_user_id") String str5, @AbstractC89719c(mo144273a = "is_rich_sug") String str6, @AbstractC89719c(mo144273a = "is_filter_search") int i6, @AbstractC89719c(mo144273a = "publish_time") int i7, @AbstractC89719c(mo144273a = "sort_type") int i8, @AbstractC89719c(mo144273a = "original_query") String str7, @AbstractC89719c(mo144273a = "trending_event_id") String str8, @AbstractC21998f LinkedHashMap<String, Integer> linkedHashMap);

        @AbstractC89731o(mo144285a = "/aweme/v1/music/search/")
        @AbstractC89721e
        AbstractC88979t<SearchMusicList> searchMusicList(@AbstractC89719c(mo144273a = "cursor") long j, @AbstractC89719c(mo144273a = "keyword") String str, @AbstractC89719c(mo144273a = "count") int i, @AbstractC89719c(mo144273a = "hot_search") int i2, @AbstractC89719c(mo144273a = "search_id") String str2, @AbstractC89719c(mo144273a = "query_correct_type") int i3, @AbstractC89719c(mo144273a = "is_author_search") int i4, @AbstractC89719c(mo144273a = "is_filter_search") int i5, @AbstractC89719c(mo144273a = "filter_by") int i6, @AbstractC89719c(mo144273a = "sort_type") int i7, @AbstractC21998f LinkedHashMap<String, Integer> linkedHashMap);

        /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$RealApi$a */
        public static final class C41840a {

            /* renamed from: a */
            public static final RealApi f97604a;

            /* renamed from: b */
            static final /* synthetic */ C41840a f97605b = new C41840a();

            private C41840a() {
            }

            static {
                Covode.recordClassIndex(49761);
                Object a = SearchApiNew.f97599b.mo28858a(RealApi.class);
                C89219l.m154716b(a, "");
                f97604a = (RealApi) a;
            }
        }
    }

    private SearchApiNew() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$a */
    static final class CallableC41841a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42427n f97606a;

        static {
            Covode.recordClassIndex(49762);
        }

        CallableC41841a(C42427n nVar) {
            this.f97606a = nVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cursor", this.f97606a.f98862c);
            jSONObject.put("searchId", this.f97606a.f98865f);
            jSONObject.put("keyword", this.f97606a.f98861b);
            jSONObject.put("correctType", this.f97606a.f98867h);
            C34611o.m70668a("search_page_repeat_request", jSONObject);
            return 0;
        }
    }

    static {
        Covode.recordClassIndex(49759);
        String str = Api.f79771d;
        f97598a = str;
        f97599b = RetrofitFactory.m33635a().mo28816a(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$d */
    static final class C41844d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C41844d f97612a = new C41844d();

        static {
            Covode.recordClassIndex(49765);
        }

        C41844d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C42426m mVar = (C42426m) obj;
            C89219l.m154721d(mVar, "");
            C41902e.f97765b.mo71063a(mVar);
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$e */
    static final class C41845e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C41845e f97613a = new C41845e();

        static {
            Covode.recordClassIndex(49766);
        }

        C41845e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C42426m mVar = (C42426m) obj;
            C89219l.m154721d(mVar, "");
            C67617g.m119767a(mVar);
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$c */
    static final class C41843c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C42426m f97611a;

        static {
            Covode.recordClassIndex(49764);
        }

        C41843c(C42426m mVar) {
            this.f97611a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C42426m mVar = (C42426m) obj;
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(mVar, "");
            SearchApiResult a = AbstractC41905f.C41906a.m83950a(mVar);
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeedList");
            return a;
        }
    }

    /* renamed from: a */
    public static AbstractC88979t<SearchMusicList> m83826a(C42174f fVar) {
        boolean z;
        int i;
        int i2;
        LinkedHashMap<String, Integer> linkedHashMap;
        C89219l.m154721d(fVar, "");
        try {
            RealApi realApi = RealApi.C41840a.f97604a;
            long j = fVar.f98292i;
            String str = fVar.f98284a;
            int i3 = fVar.f98293j;
            int i4 = fVar.f98288e;
            String str2 = fVar.f98290g;
            int i5 = fVar.f98289f;
            int i6 = fVar.f98300q;
            C67437b bVar = fVar.f98295l;
            if (bVar != null) {
                z = bVar.isDefaultOption();
            } else {
                z = true;
            }
            int i7 = 0;
            if (!z) {
                i = 1;
            } else {
                i = 0;
            }
            C67437b bVar2 = fVar.f98295l;
            if (bVar2 != null) {
                i2 = bVar2.getFilterBy();
            } else {
                i2 = 0;
            }
            C67437b bVar3 = fVar.f98295l;
            if (bVar3 != null) {
                i7 = bVar3.getSortType();
            }
            C67437b bVar4 = fVar.f98295l;
            if (bVar4 == null || (linkedHashMap = bVar4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            return realApi.searchMusicList(j, str, i3, i4, str2, i5, i6, i, i2, i7, linkedHashMap);
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC34479a.getCompatibleException(e);
            C89219l.m154716b(compatibleException, "");
            throw compatibleException;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$b */
    static final class C41842b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ int f97607a;

        /* renamed from: b */
        final /* synthetic */ C1731i f97608b;

        /* renamed from: c */
        final /* synthetic */ C42174f f97609c;

        /* renamed from: d */
        final /* synthetic */ int f97610d;

        static {
            Covode.recordClassIndex(49763);
        }

        C41842b(int i, C1731i iVar, C42174f fVar, int i2) {
            this.f97607a = i;
            this.f97608b = iVar;
            this.f97609c = fVar;
            this.f97610d = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:44:0x013a, code lost:
            if (r1 == null) goto L_0x013c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0190  */
        @Override // p4560f.p4561a.AbstractC88983w
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(p4560f.p4561a.AbstractC88982v<com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m> r7) {
            /*
            // Method dump skipped, instructions count: 406
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew.C41842b.subscribe(f.a.v):void");
        }
    }

    /* renamed from: a */
    public static AbstractC88979t<C42426m> m83827a(C42174f fVar, int i, int i2, C42426m mVar) {
        C1731i<C42426m> iVar;
        C89219l.m154721d(fVar, "");
        if (mVar != null) {
            iVar = mVar.f98853g;
            mVar.f98853g = null;
        } else {
            iVar = null;
        }
        AbstractC88979t<C42426m> b = AbstractC88979t.m154294a(new C41842b(i, iVar, fVar, i2)).mo143292d(new C41843c(mVar)).mo143292d(C41844d.f97612a).mo143292d(C41845e.f97613a).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }
}
