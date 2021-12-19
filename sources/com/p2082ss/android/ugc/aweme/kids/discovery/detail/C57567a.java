package com.p2082ss.android.ugc.aweme.kids.discovery.detail;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a;
import com.p2082ss.android.ugc.aweme.kids.discovery.api.DetailApi;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3349b.C57557a;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57562d;
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

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.a */
public final class C57567a implements AbstractC57401a {

    /* renamed from: a */
    public static final C57568a f131418a = new C57568a((byte) 0);

    /* renamed from: b */
    private boolean f131419b = true;

    /* renamed from: c */
    private int f131420c;

    /* renamed from: d */
    private final String f131421d;

    /* renamed from: e */
    private final boolean f131422e;

    static {
        Covode.recordClassIndex(67522);
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

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: c */
    public final boolean mo94661c() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.a$a */
    public static final class C57568a {
        static {
            Covode.recordClassIndex(67523);
        }

        private C57568a() {
        }

        public /* synthetic */ C57568a(byte b) {
            this();
        }
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
        AbstractC88979t<R> d = DetailApi.m104271a(this.f131421d, this.f131420c, 8).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C57569b(currentTimeMillis)).mo143292d(new C57570c(this, currentTimeMillis));
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a
    /* renamed from: d */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94662d() {
        if (this.f131422e) {
            List<Aweme> a = C57557a.C57558a.m104274a();
            if (a == null || !(!a.isEmpty())) {
                AbstractC88979t<C89378p<List<Aweme>, Integer>> b = AbstractC88979t.m154310b(C89387v.m154943a(C89086z.INSTANCE, -1));
                C89219l.m154716b(b, "");
                return b;
            }
            Object a2 = C57557a.C57558a.m104274a();
            if (a2 == null) {
                a2 = C89086z.INSTANCE;
            }
            AbstractC88979t<C89378p<List<Aweme>, Integer>> b2 = AbstractC88979t.m154310b(C89387v.m154943a(a2, 0));
            C89219l.m154716b(b2, "");
            return b2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC88979t<R> d = DetailApi.m104271a(this.f131421d, 0, 10).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C57571d(currentTimeMillis)).mo143292d(new C57572e(this, currentTimeMillis));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.a$b */
    static final class C57569b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131423a;

        static {
            Covode.recordClassIndex(67524);
        }

        C57569b(long j) {
            this.f131423a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57354e.m103957a("kids_api_detail", 2, -1, this.f131423a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.a$d */
    static final class C57571d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131426a;

        static {
            Covode.recordClassIndex(67526);
        }

        C57571d(long j) {
            this.f131426a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57354e.m103957a("kids_api_detail", 3, -1, this.f131426a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.a$c */
    static final class C57570c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C57567a f131424a;

        /* renamed from: b */
        final /* synthetic */ long f131425b;

        static {
            Covode.recordClassIndex(67525);
        }

        C57570c(C57567a aVar, long j) {
            this.f131424a = aVar;
            this.f131425b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C57562d dVar = (C57562d) obj;
            C89219l.m154721d(dVar, "");
            C57354e.m103957a("kids_api_detail", 2, 0, this.f131425b);
            return this.f131424a.mo94905a(dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.a$e */
    static final class C57572e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C57567a f131427a;

        /* renamed from: b */
        final /* synthetic */ long f131428b;

        static {
            Covode.recordClassIndex(67527);
        }

        C57572e(C57567a aVar, long j) {
            this.f131427a = aVar;
            this.f131428b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C57562d dVar = (C57562d) obj;
            C89219l.m154721d(dVar, "");
            C57354e.m103957a("kids_api_detail", 3, 0, this.f131428b);
            return this.f131427a.mo94905a(dVar);
        }
    }

    /* renamed from: a */
    public final C89378p<List<Aweme>, Integer> mo94905a(C57562d dVar) {
        boolean z = true;
        if (dVar.f131408c != 1) {
            z = false;
        }
        this.f131419b = z;
        if (this.f131420c == dVar.f131407b) {
            return C89387v.m154943a(C89086z.INSTANCE, -1);
        }
        this.f131420c = dVar.f131407b;
        List<? extends Aweme> list = dVar.f131406a;
        if (list == null) {
            return C89387v.m154943a(C89086z.INSTANCE, -1);
        }
        if (((Aweme) list.get(0)).getLogPbBean() == null) {
            for (Aweme aweme : list) {
                aweme.setLogPbBean(dVar.f131409d);
            }
        }
        if (list.isEmpty()) {
            return C89387v.m154943a(C89086z.INSTANCE, -1);
        }
        return C89387v.m154943a(list, 0);
    }

    public C57567a(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f131421d = str;
        this.f131422e = z;
    }
}
