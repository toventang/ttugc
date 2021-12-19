package com.p2082ss.android.ugc.aweme.kids.liked.detail;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a;
import com.p2082ss.android.ugc.aweme.kids.liked.api.FavoriteApi;
import com.p2082ss.android.ugc.aweme.kids.liked.model.KidFeedItemList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.liked.detail.a */
public final class C57737a implements AbstractC57401a {

    /* renamed from: c */
    public static final C57738a f131728c = new C57738a((byte) 0);

    /* renamed from: a */
    long f131729a;

    /* renamed from: b */
    boolean f131730b;

    /* renamed from: d */
    private final FavoriteApi f131731d = FavoriteApi.C57733a.m104449a();

    /* renamed from: e */
    private final List<Aweme> f131732e;

    static {
        Covode.recordClassIndex(67717);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: a */
    public final boolean mo94659a() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: b */
    public final boolean mo94660b() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.detail.a$a */
    public static final class C57738a {
        static {
            Covode.recordClassIndex(67718);
        }

        private C57738a() {
        }

        public /* synthetic */ C57738a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: c */
    public final boolean mo94661c() {
        return this.f131730b;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: d */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94662d() {
        AbstractC88979t<C89378p<List<Aweme>, Integer>> b = AbstractC88979t.m154310b(C89387v.m154943a(this.f131732e, 0));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: e */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94663e() {
        AbstractC88979t<C89378p<List<Aweme>, Integer>> b = AbstractC88979t.m154310b(C89387v.m154943a(C89086z.INSTANCE, -1));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: f */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94664f() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC88979t<R> d = this.f131731d.getFavoriteList(this.f131729a, 0, 10).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C57739b(currentTimeMillis)).mo143292d(new C57740c(this, currentTimeMillis));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.detail.a$b */
    static final class C57739b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131733a;

        static {
            Covode.recordClassIndex(67719);
        }

        C57739b(long j) {
            this.f131733a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57354e.m103957a("kids_api_like", 2, -1, this.f131733a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public C57737a(List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        this.f131732e = list;
        this.f131729a = (long) list.size();
        this.f131730b = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.detail.a$c */
    static final class C57740c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C57737a f131734a;

        /* renamed from: b */
        final /* synthetic */ long f131735b;

        static {
            Covode.recordClassIndex(67720);
        }

        C57740c(C57737a aVar, long j) {
            this.f131734a = aVar;
            this.f131735b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            KidFeedItemList kidFeedItemList = (KidFeedItemList) obj;
            C89219l.m154721d(kidFeedItemList, "");
            C57354e.m103957a("kids_api_like", 2, 0, this.f131735b);
            C57737a aVar = this.f131734a;
            boolean z = true;
            if (kidFeedItemList.getHasMore() != 1) {
                z = false;
            }
            aVar.f131730b = z;
            if (aVar.f131729a >= kidFeedItemList.getMaxCursor()) {
                return C89387v.m154943a(C89086z.INSTANCE, -1);
            }
            aVar.f131729a = kidFeedItemList.getMaxCursor();
            List<Aweme> items = kidFeedItemList.getItems();
            if (items == null) {
                return C89387v.m154943a(C89086z.INSTANCE, -1);
            }
            if (items.get(0).getLogPbBean() == null) {
                for (Aweme aweme : items) {
                    aweme.setLogPbBean(kidFeedItemList.getLogPb());
                }
            }
            if (items.isEmpty()) {
                return C89387v.m154943a(C89086z.INSTANCE, -1);
            }
            return C89387v.m154943a(items, 0);
        }
    }
}
