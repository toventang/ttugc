package com.p2082ss.android.ugc.aweme.kids.liked.p3361a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57374a;
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

/* renamed from: com.ss.android.ugc.aweme.kids.liked.a.c */
public final class C57728c implements AbstractC57374a {

    /* renamed from: a */
    private boolean f131713a = true;

    /* renamed from: b */
    private long f131714b;

    /* renamed from: c */
    private final FavoriteApi f131715c = FavoriteApi.C57733a.m104449a();

    static {
        Covode.recordClassIndex(67705);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57374a
    /* renamed from: a */
    public final boolean mo94634a() {
        return this.f131713a;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57374a
    /* renamed from: b */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94635b() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC88979t<R> d = this.f131715c.getFavoriteList(0, 0, 20).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C57731c(currentTimeMillis)).mo143292d(new C57732d(this, currentTimeMillis));
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57374a
    /* renamed from: c */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94636c() {
        if (!this.f131713a) {
            AbstractC88979t<C89378p<List<Aweme>, Integer>> b = AbstractC88979t.m154310b(C89387v.m154943a(C89086z.INSTANCE, -1));
            C89219l.m154716b(b, "");
            return b;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC88979t<R> d = this.f131715c.getFavoriteList(this.f131714b, 0, 10).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C57729a(currentTimeMillis)).mo143292d(new C57730b(this, currentTimeMillis));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.c$a */
    static final class C57729a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131716a;

        static {
            Covode.recordClassIndex(67706);
        }

        C57729a(long j) {
            this.f131716a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57354e.m103957a("kids_api_like", 2, -1, this.f131716a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.c$c */
    static final class C57731c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131719a;

        static {
            Covode.recordClassIndex(67708);
        }

        C57731c(long j) {
            this.f131719a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57354e.m103957a("kids_api_like", 1, -1, this.f131719a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.c$b */
    static final class C57730b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C57728c f131717a;

        /* renamed from: b */
        final /* synthetic */ long f131718b;

        static {
            Covode.recordClassIndex(67707);
        }

        C57730b(C57728c cVar, long j) {
            this.f131717a = cVar;
            this.f131718b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            KidFeedItemList kidFeedItemList = (KidFeedItemList) obj;
            C89219l.m154721d(kidFeedItemList, "");
            C57354e.m103957a("kids_api_like", 2, 0, this.f131718b);
            return this.f131717a.mo95044a(kidFeedItemList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.c$d */
    static final class C57732d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C57728c f131720a;

        /* renamed from: b */
        final /* synthetic */ long f131721b;

        static {
            Covode.recordClassIndex(67709);
        }

        C57732d(C57728c cVar, long j) {
            this.f131720a = cVar;
            this.f131721b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            KidFeedItemList kidFeedItemList = (KidFeedItemList) obj;
            C89219l.m154721d(kidFeedItemList, "");
            C57354e.m103957a("kids_api_like", 1, 0, this.f131721b);
            return this.f131720a.mo95044a(kidFeedItemList);
        }
    }

    /* renamed from: a */
    public final C89378p<List<Aweme>, Integer> mo95044a(KidFeedItemList kidFeedItemList) {
        boolean z = true;
        if (kidFeedItemList.getHasMore() != 1) {
            z = false;
        }
        this.f131713a = z;
        if (this.f131714b == kidFeedItemList.getMaxCursor()) {
            return C89387v.m154943a(C89086z.INSTANCE, -1);
        }
        this.f131714b = kidFeedItemList.getMaxCursor();
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
