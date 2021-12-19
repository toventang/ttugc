package com.p2082ss.android.ugc.aweme.kids.discovery.gallery;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57374a;
import com.p2082ss.android.ugc.aweme.kids.discovery.api.DetailApi;
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

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.b */
public final class C57579b implements AbstractC57374a {

    /* renamed from: a */
    public static final C57580a f131437a = new C57580a((byte) 0);

    /* renamed from: b */
    private boolean f131438b = true;

    /* renamed from: c */
    private int f131439c;

    /* renamed from: d */
    private final String f131440d;

    static {
        Covode.recordClassIndex(67535);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.b$a */
    public static final class C57580a {
        static {
            Covode.recordClassIndex(67536);
        }

        private C57580a() {
        }

        public /* synthetic */ C57580a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57374a
    /* renamed from: a */
    public final boolean mo94634a() {
        return this.f131438b;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57374a
    /* renamed from: b */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94635b() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC88979t<R> d = DetailApi.m104271a(this.f131440d, 0, 10).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C57583d(currentTimeMillis)).mo143292d(new C57584e(this, currentTimeMillis));
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57374a
    /* renamed from: c */
    public final AbstractC88979t<C89378p<List<Aweme>, Integer>> mo94636c() {
        if (!this.f131438b) {
            AbstractC88979t<C89378p<List<Aweme>, Integer>> b = AbstractC88979t.m154310b(C89387v.m154943a(C89086z.INSTANCE, -1));
            C89219l.m154716b(b, "");
            return b;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC88979t<R> d = DetailApi.m104271a(this.f131440d, this.f131439c, 8).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C57581b(currentTimeMillis)).mo143292d(new C57582c(this, currentTimeMillis));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.b$b */
    static final class C57581b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131441a;

        static {
            Covode.recordClassIndex(67537);
        }

        C57581b(long j) {
            this.f131441a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57354e.m103957a("kids_api_detail", 2, -1, this.f131441a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.b$d */
    static final class C57583d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131444a;

        static {
            Covode.recordClassIndex(67539);
        }

        C57583d(long j) {
            this.f131444a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57354e.m103957a("kids_api_detail", 1, -1, this.f131444a);
        }
    }

    public C57579b(String str) {
        C89219l.m154721d(str, "");
        this.f131440d = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.b$c */
    static final class C57582c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C57579b f131442a;

        /* renamed from: b */
        final /* synthetic */ long f131443b;

        static {
            Covode.recordClassIndex(67538);
        }

        C57582c(C57579b bVar, long j) {
            this.f131442a = bVar;
            this.f131443b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C57562d dVar = (C57562d) obj;
            C89219l.m154721d(dVar, "");
            C57354e.m103957a("kids_api_detail", 2, 0, this.f131443b);
            return this.f131442a.mo94906a(dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.b$e */
    static final class C57584e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C57579b f131445a;

        /* renamed from: b */
        final /* synthetic */ long f131446b;

        static {
            Covode.recordClassIndex(67540);
        }

        C57584e(C57579b bVar, long j) {
            this.f131445a = bVar;
            this.f131446b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C57562d dVar = (C57562d) obj;
            C89219l.m154721d(dVar, "");
            C57354e.m103957a("kids_api_detail", 1, 0, this.f131446b);
            return this.f131445a.mo94906a(dVar);
        }
    }

    /* renamed from: a */
    public final C89378p<List<Aweme>, Integer> mo94906a(C57562d dVar) {
        boolean z = true;
        if (dVar.f131408c != 1) {
            z = false;
        }
        this.f131438b = z;
        if (this.f131439c == dVar.f131407b) {
            return C89387v.m154943a(C89086z.INSTANCE, -1);
        }
        this.f131439c = dVar.f131407b;
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
}
