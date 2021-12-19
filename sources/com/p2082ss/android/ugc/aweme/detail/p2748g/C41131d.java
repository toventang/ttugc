package com.p2082ss.android.ugc.aweme.detail.p2748g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p2082ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.AbstractC42305a;
import com.p2082ss.android.ugc.aweme.discover.model.ContinuousLoadingAwemeList;
import com.p2082ss.android.ugc.aweme.discover.model.IAwemeList;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41902e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.g.d */
public final class C41131d extends AbstractC42305a<ContinuousLoadingAwemeList> {

    /* renamed from: a */
    private final AbstractC89244h f96132a = C89250i.m154773a((AbstractC89171a) C41133b.f96137a);

    /* renamed from: b */
    private int f96133b;

    /* renamed from: c */
    private final AbstractC89244h f96134c = C89250i.m154773a((AbstractC89171a) C41132a.f96136a);

    /* renamed from: d */
    private final AbstractC89244h f96135d = C89250i.m154773a((AbstractC89171a) C41134c.f96138a);

    static {
        Covode.recordClassIndex(49014);
    }

    /* renamed from: c */
    private final IAwemeService m82830c() {
        return (IAwemeService) this.f96132a.getValue();
    }

    /* renamed from: a */
    public final SearchContinuousLoadingApi.C41847b mo70382a() {
        return (SearchContinuousLoadingApi.C41847b) this.f96135d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.g.d$b */
    static final class C41133b extends AbstractC89220m implements AbstractC89171a<IAwemeService> {

        /* renamed from: a */
        public static final C41133b f96137a = new C41133b();

        static {
            Covode.recordClassIndex(49016);
        }

        C41133b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAwemeService invoke() {
            return AwemeService.m70060b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.g.d$c */
    static final class C41134c extends AbstractC89220m implements AbstractC89171a<SearchContinuousLoadingApi.C41847b> {

        /* renamed from: a */
        public static final C41134c f96138a = new C41134c();

        static {
            Covode.recordClassIndex(49017);
        }

        C41134c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchContinuousLoadingApi.C41847b invoke() {
            return new SearchContinuousLoadingApi.C41847b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.g.d$a */
    static final class C41132a extends AbstractC89220m implements AbstractC89171a<SearchContinuousLoadingApi> {

        /* renamed from: a */
        public static final C41132a f96136a = new C41132a();

        static {
            Covode.recordClassIndex(49015);
        }

        C41132a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchContinuousLoadingApi invoke() {
            return RetrofitFactory.m33635a().mo28817b(SearchApiNew.f97598a).mo28832d().mo28858a(SearchContinuousLoadingApi.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.AbstractC42305a
    /* renamed from: b */
    public final AbstractC88979t<ContinuousLoadingAwemeList> mo70385b() {
        return ((SearchContinuousLoadingApi) this.f96134c.getValue()).getAwemeList(mo70382a().f97616a, mo70382a().f97617b, mo70382a().f97618c, mo70382a().f97619d, mo70382a().f97620e, mo70382a().f97621f);
    }

    /* renamed from: a */
    public final void mo70383a(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        int i;
        C89219l.m154721d(continuousLoadingAwemeList, "");
        this.mData = continuousLoadingAwemeList;
        List<Aweme> list = ((ContinuousLoadingAwemeList) this.mData).awemeList;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.f96133b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void handleData(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        long j;
        super.handleData((IAwemeList) continuousLoadingAwemeList);
        if (continuousLoadingAwemeList != null) {
            mo70382a().f97619d = continuousLoadingAwemeList.cursor;
            SearchContinuousLoadingApi.C41847b a = mo70382a();
            Aweme aweme = (Aweme) C89070n.m154588i(getItems());
            if (aweme != null) {
                j = aweme.getCreateTime();
            } else {
                j = 0;
            }
            a.f97621f = j;
            boolean z = true;
            if (this.mListQueryType != 1) {
                z = false;
            }
            this.f96133b = C41902e.m83943a(z, continuousLoadingAwemeList.awemeList, this.f96133b);
            List<Aweme> list = continuousLoadingAwemeList.awemeList;
            if (list != null) {
                for (T t : list) {
                    IAwemeService c = m82830c();
                    String aid = t.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    Aweme b = c.mo60684b(aid);
                    if (b != null) {
                        t.setUserDigg(b.getUserDigg());
                        AwemeStatistics statistics = b.getStatistics();
                        if (statistics != null) {
                            long diggCount = statistics.getDiggCount();
                            AwemeStatistics statistics2 = t.getStatistics();
                            C89219l.m154716b(statistics2, "");
                            statistics2.setDiggCount(diggCount);
                        }
                    }
                    m82830c().mo60677a((Aweme) t);
                }
            }
        }
    }
}
