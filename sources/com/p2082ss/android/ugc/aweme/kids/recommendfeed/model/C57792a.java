package com.p2082ss.android.ugc.aweme.kids.recommendfeed.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a;
import com.p2082ss.android.ugc.aweme.kids.recommendfeed.fetchlist.FeedApi;
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

/* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.model.a */
public final class C57792a implements AbstractC57401a {
    static {
        Covode.recordClassIndex(67787);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: a */
    public final boolean mo94659a() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: b */
    public final boolean mo94660b() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: c */
    public final boolean mo94661c() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: d */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94662d() {
        return mo94663e();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: e */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94663e() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC88979t<R> d = FeedApi.m104499a(1).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C57795c(currentTimeMillis)).mo143292d(new C57796d(this, currentTimeMillis));
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: f */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94664f() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC88979t<R> d = FeedApi.m104499a(2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C57793a(currentTimeMillis)).mo143292d(new C57794b(this, currentTimeMillis));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.model.a$a */
    static final class C57793a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131821a;

        static {
            Covode.recordClassIndex(67788);
        }

        C57793a(long j) {
            this.f131821a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57354e.m103957a("kids_api_feed", 2, -1, this.f131821a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.model.a$c */
    public static final class C57795c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131824a;

        static {
            Covode.recordClassIndex(67790);
        }

        C57795c(long j) {
            this.f131824a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57354e.m103957a("kids_api_feed", 1, -1, this.f131824a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.model.a$b */
    static final class C57794b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C57792a f131822a;

        /* renamed from: b */
        final /* synthetic */ long f131823b;

        static {
            Covode.recordClassIndex(67789);
        }

        C57794b(C57792a aVar, long j) {
            this.f131822a = aVar;
            this.f131823b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            KFeedItemList kFeedItemList = (KFeedItemList) obj;
            C89219l.m154721d(kFeedItemList, "");
            C57354e.m103957a("kids_api_feed", 2, 0, this.f131823b);
            return C57792a.m104501a(kFeedItemList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.model.a$d */
    public static final class C57796d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C57792a f131825a;

        /* renamed from: b */
        final /* synthetic */ long f131826b;

        static {
            Covode.recordClassIndex(67791);
        }

        C57796d(C57792a aVar, long j) {
            this.f131825a = aVar;
            this.f131826b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            KFeedItemList kFeedItemList = (KFeedItemList) obj;
            C89219l.m154721d(kFeedItemList, "");
            C57354e.m103957a("kids_api_feed", 1, 0, this.f131826b);
            return C57792a.m104501a(kFeedItemList);
        }
    }

    /* renamed from: a */
    public static C89378p<List<Aweme>, Integer> m104501a(KFeedItemList kFeedItemList) {
        Aweme aweme = kFeedItemList.items.get(0);
        C89219l.m154716b(aweme, "");
        if (aweme.getLogPbBean() == null) {
            for (Aweme aweme2 : kFeedItemList.items) {
                C89219l.m154716b(aweme2, "");
                aweme2.setLogPbBean(kFeedItemList.getLogPb());
            }
        }
        if (kFeedItemList.items.isEmpty()) {
            return C89387v.m154943a(C89086z.INSTANCE, -1);
        }
        return C89387v.m154943a(kFeedItemList.items, 0);
    }
}
