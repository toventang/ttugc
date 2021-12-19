package com.p2082ss.android.ugc.aweme.discover.repo.fetcher;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.discover.api.DiscoverApiNew;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopicOrAd;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41941b;
import com.p2082ss.android.ugc.aweme.discover.p2778l.C42183a;
import com.p2082ss.android.ugc.aweme.discover.repo.fetcher.C42503a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b */
public final class C42506b extends AbstractC20191d<C42516c, DiscoverSectionList> {

    /* renamed from: i */
    public static final C42507a f99110i = new C42507a((byte) 0);

    /* renamed from: a */
    public final DiscoverApiNew f99111a = DiscoverApiNew.C41838a.f97592a;

    /* renamed from: b */
    public volatile int f99112b;

    /* renamed from: f */
    public volatile boolean f99113f = true;

    /* renamed from: g */
    public boolean f99114g = C41941b.m83980b();

    /* renamed from: h */
    long f99115h;

    static {
        Covode.recordClassIndex(50595);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$a */
    public static final class C42507a {
        static {
            Covode.recordClassIndex(50596);
        }

        private C42507a() {
        }

        public /* synthetic */ C42507a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$g */
    public static final class C42515g<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C42515g f99128a = new C42515g();

        static {
            Covode.recordClassIndex(50604);
        }

        C42515g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            TrendingTopicOrAd trendingTopicOrAd = (TrendingTopicOrAd) obj;
            C89219l.m154721d(trendingTopicOrAd, "");
            return new DiscoverSectionItem.TrendingTopicOrAdSection(trendingTopicOrAd);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$b */
    public static final class C42508b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C42506b f99116a;

        /* renamed from: b */
        final /* synthetic */ int f99117b;

        /* renamed from: c */
        final /* synthetic */ int f99118c;

        /* renamed from: d */
        final /* synthetic */ int f99119d;

        /* renamed from: e */
        final /* synthetic */ String f99120e;

        static {
            Covode.recordClassIndex(50597);
        }

        C42508b(C42506b bVar, int i, int i2, int i3, String str) {
            this.f99116a = bVar;
            this.f99117b = i;
            this.f99118c = i2;
            this.f99119d = i3;
            this.f99120e = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            if (C42183a.f98315a) {
                return AbstractC88403ab.m153603a(th);
            }
            C42183a.f98315a = true;
            return this.f99116a.f99111a.getTrendingTopicsV2(this.f99117b, this.f99118c, 0, Integer.valueOf(this.f99119d), this.f99120e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$c */
    static final class C42509c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C42506b f99121a;

        /* renamed from: b */
        final /* synthetic */ boolean f99122b;

        static {
            Covode.recordClassIndex(50598);
        }

        C42509c(C42506b bVar, boolean z) {
            this.f99121a = bVar;
            this.f99122b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (!this.f99122b || !list.isEmpty()) {
                C18285c.m34003a("discovery_client_show_time");
                return new DiscoverSectionList(list, this.f99121a.f99112b, this.f99121a.f99113f, false, 8, null);
            }
            throw new Exception("api all went wrong");
        }
    }

    /* renamed from: a */
    private AbstractC88979t<DiscoverSectionItem.TrendingTopicOrAdSection> m85000a(AbstractC88403ab<TrendingTopicList> abVar) {
        C89219l.m154721d(abVar, "");
        AbstractC88979t<R> d = abVar.mo142925c(new C42510d(this)).mo142923b(new C42512e(this)).mo143292d(C42514f.f99127a).mo143292d(C42515g.f99128a);
        C89219l.m154716b(d, "");
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$d */
    public static final class C42510d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C42506b f99123a;

        static {
            Covode.recordClassIndex(50599);
        }

        C42510d(C42506b bVar) {
            this.f99123a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.discover.model.TrendingTopicList r3 = (com.p2082ss.android.ugc.aweme.discover.model.TrendingTopicList) r3
                java.lang.String r1 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
                com.ss.android.ugc.aweme.discover.repo.fetcher.b r0 = r2.f99123a
                boolean r0 = r0.f99114g
                if (r0 == 0) goto L_0x0057
                p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
                boolean r0 = com.p2082ss.android.ugc.aweme.discover.repo.gson.C42519a.m85003a()
                if (r0 == 0) goto L_0x003a
                java.lang.String r1 = r3.jsonRawData
                java.util.List<com.ss.android.ugc.aweme.discover.model.TrendingTopic> r0 = r3.items
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x003a
                if (r1 == 0) goto L_0x003a
                java.util.List<com.ss.android.ugc.aweme.discover.model.TrendingTopic> r0 = r3.items
                java.lang.Object r0 = p4600h.p4601a.C89070n.m154586h(r0)
                com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = (com.p2082ss.android.ugc.aweme.discover.model.TrendingTopic) r0
                boolean r0 = r0.getNeedToBeSupplied()
                if (r0 == 0) goto L_0x003a
                com.ss.android.ugc.aweme.discover.repo.gson.a$b r0 = new com.ss.android.ugc.aweme.discover.repo.gson.a$b
                r0.<init>(r1, r3)
                r3.setLazyParseCallable(r0)
            L_0x003a:
                java.util.concurrent.Callable r0 = r3.getLazyParseCallable()
                if (r0 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.discover.repo.fetcher.b$d$1 r0 = new com.ss.android.ugc.aweme.discover.repo.fetcher.b$d$1
                r0.<init>(r3)
                f.a.t r0 = p4560f.p4561a.AbstractC88979t.m154294a(r0)
            L_0x0049:
                h.p r1 = new h.p
                if (r0 != 0) goto L_0x0053
                f.a.t<java.lang.Object> r0 = p4560f.p4561a.p4568e.p4573e.p4578e.C88790v.f201616a
                f.a.t r0 = p4560f.p4561a.p4587h.C88925a.m154171a(r0)
            L_0x0053:
                r1.<init>(r3, r0)
                return r1
            L_0x0057:
                r0 = 0
                goto L_0x0049
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.repo.fetcher.C42506b.C42510d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$e */
    public static final class C42512e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C42506b f99125a;

        static {
            Covode.recordClassIndex(50601);
        }

        C42512e(C42506b bVar) {
            this.f99125a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89378p pVar = (C89378p) obj;
            C89219l.m154721d(pVar, "");
            TrendingTopicList trendingTopicList = (TrendingTopicList) pVar.component1();
            AbstractC88979t tVar = (AbstractC88979t) pVar.component2();
            this.f99125a.f99112b = trendingTopicList.cursor;
            this.f99125a.f99113f = trendingTopicList.doesHaveMore();
            C42506b bVar = this.f99125a;
            C89219l.m154716b(trendingTopicList, "");
            C14612a<?> requestInfo = trendingTopicList.getRequestInfo();
            if (requestInfo != null) {
                long j = requestInfo.f35365h;
                long j2 = j - bVar.f99115h;
                if (j2 > 0 && bVar.f99115h > 0) {
                    C18285c.m34004a("discovery_trending_topic_receive_time", j2);
                }
                long j3 = requestInfo.f35362e - bVar.f99115h;
                if (j3 > 0 && bVar.f99115h > 0) {
                    C18285c.m34004a("discovery_trending_topic_real_request", j3);
                }
                long currentTimeMillis = System.currentTimeMillis() - j;
                if (currentTimeMillis > 0) {
                    C18285c.m34004a("discovery_trending_topic_json_timing_gap", currentTimeMillis);
                }
            }
            bVar.f99115h = 0;
            return AbstractC88979t.m154309b((Iterable) trendingTopicList.items).mo143269a(tVar.mo143267a((AbstractC88434g) C425131.f99126a, false));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.b$f */
    public static final class C42514f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C42514f f99127a = new C42514f();

        static {
            Covode.recordClassIndex(50603);
        }

        C42514f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            TrendingTopic trendingTopic = (TrendingTopic) obj;
            C89219l.m154721d(trendingTopic, "");
            List<Aweme> items = trendingTopic.getItems();
            if (items != null) {
                List g = C89070n.m154585g((Collection) items);
                if (!C13603b.m24435a((Collection) g)) {
                    for (int i = 0; i < g.size(); i++) {
                        Aweme a = AwemeService.m70060b().mo60677a((Aweme) g.get(i));
                        C89219l.m154716b(a, "");
                        g.set(i, a);
                    }
                }
            }
            if (trendingTopic.isPicAd()) {
                return new TrendingTopicOrAd(trendingTopic.getAdData());
            }
            return new TrendingTopicOrAd(trendingTopic);
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        boolean z;
        AbstractC88979t tVar;
        AbstractC88979t b;
        AbstractC88979t b2;
        C42516c cVar = (C42516c) obj;
        C89219l.m154721d(cVar, "");
        ArrayList<AbstractC88979t> arrayList = new ArrayList();
        if (cVar.getCursor() == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean isFromSuggestSearch = cVar.isFromSuggestSearch();
        int a = C16048b.m29633a().mo25412a(true, "discovery_change_request_num", 10);
        if (a == 0) {
            a = 10;
        }
        if (z) {
            this.f99112b = 0;
            this.f99113f = true;
            if (C67446h.f151111a.mo106228q()) {
                AbstractC88979t<?> r = C67446h.f151111a.mo106229r();
                Objects.requireNonNull(r, "null cannot be cast to non-null type io.reactivex.Observable<com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem.SuggestSearchSection>");
                arrayList.add(r);
            }
            if (!isFromSuggestSearch) {
                AbstractC88979t<R> d = DiscoverApiNew.C41838a.f97592a.getBannerList(1, Integer.valueOf(C39223a.m79593g().mo68663b()), C39223a.m79590d().mo68621f()).mo142914a(C42503a.C42504a.f99108a).mo142925c(C42503a.C42505b.f99109a).mo142930d();
                C89219l.m154716b(d, "");
                arrayList.add(d);
                arrayList.add(m84999a(0, a));
            }
        } else {
            arrayList.add(m84999a(cVar.getCursor(), 10));
        }
        if (C16048b.m29633a().mo25412a(true, "discover_async_request_fix", 0) == 2) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
            for (AbstractC88979t tVar2 : arrayList) {
                if (z) {
                    b2 = tVar2.mo143282b((AbstractC88984x) C88925a.m154171a(C88790v.f201616a)).mo143278b(C88925a.m154180b(C88946a.f201991c));
                } else {
                    b2 = tVar2.mo143278b(C88925a.m154180b(C88946a.f201991c));
                }
                arrayList2.add(b2);
            }
            tVar = AbstractC88979t.m154313c(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
            for (AbstractC88979t tVar3 : arrayList) {
                if (z) {
                    b = tVar3.mo143282b((AbstractC88984x) C88925a.m154171a(C88790v.f201616a));
                } else {
                    b = tVar3.mo143278b(C88925a.m154180b(C88946a.f201991c));
                }
                arrayList3.add(b);
            }
            tVar = AbstractC88979t.m154299a(arrayList3);
        }
        AbstractC88979t b3 = tVar.mo143303h().mo142925c(new C42509c(this, z)).mo142930d().mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b3, "");
        return b3;
    }

    /* renamed from: a */
    private final AbstractC88979t<DiscoverSectionItem.TrendingTopicOrAdSection> m84999a(int i, int i2) {
        int b = C39223a.m79593g().mo68663b();
        String f = C39223a.m79590d().mo68621f();
        if (this.f99115h == 0) {
            this.f99115h = System.currentTimeMillis();
        }
        AbstractC88403ab<TrendingTopicList> trendingTopicsV2 = this.f99111a.getTrendingTopicsV2(i, i2, Integer.valueOf(C42183a.m84436b() ? 1 : 0), Integer.valueOf(b), f);
        if (C42183a.m84435a() && i == 0) {
            trendingTopicsV2 = trendingTopicsV2.mo142928d(new C42508b(this, 0, i2, b, f));
            C89219l.m154716b(trendingTopicsV2, "");
        }
        return m85000a(trendingTopicsV2);
    }
}
