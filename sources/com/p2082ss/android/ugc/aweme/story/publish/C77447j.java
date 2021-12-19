package com.p2082ss.android.ugc.aweme.story.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73375b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.j */
public final class C77447j extends AbstractC74052a {

    /* renamed from: i */
    public static final AbstractC89244h f173771i = C89250i.m154773a((AbstractC89171a) C77449b.f173778a);

    /* renamed from: j */
    public static final C77448a f173772j = new C77448a((byte) 0);

    /* renamed from: h */
    volatile boolean f173773h;

    /* renamed from: k */
    private volatile boolean f173774k;

    /* renamed from: l */
    private volatile boolean f173775l;

    /* renamed from: m */
    private volatile C65616g f173776m;

    /* renamed from: n */
    private final AbstractC89244h f173777n = C89250i.m154773a((AbstractC89171a) new C77450c(this));

    /* renamed from: l */
    private final RunnableC77420b m135402l() {
        return (RunnableC77420b) this.f173777n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: e */
    public final void mo116442e() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: f */
    public final void mo116445f(C65616g gVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.j$a */
    public static final class C77448a {
        static {
            Covode.recordClassIndex(90481);
        }

        private C77448a() {
        }

        public /* synthetic */ C77448a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f, com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: j */
    public final void mo116449j() {
        throw new C73375b("Story not support parallel publish");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f, com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: k */
    public final void mo116450k() {
        throw new C73375b("Story not support parallel publish");
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.j$c */
    static final class C77450c extends AbstractC89220m implements AbstractC89171a<RunnableC77420b> {

        /* renamed from: a */
        final /* synthetic */ C77447j f173779a;

        static {
            Covode.recordClassIndex(90483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77450c(C77447j jVar) {
            super(0);
            this.f173779a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RunnableC77420b invoke() {
            return new RunnableC77420b(new AbstractC89171a<C89391z>(this.f173779a) {
                /* class com.p2082ss.android.ugc.aweme.story.publish.C77447j.C77450c.C774511 */

                static {
                    Covode.recordClassIndex(90484);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C77447j jVar = (C77447j) this.receiver;
                    jVar.f173773h = true;
                    jVar.mo116432a();
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: f */
    public final void mo116444f() {
        ((ExecutorService) f173771i.getValue()).execute(m135402l());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: g */
    public final void mo116446g() {
        m135402l().mo121049a();
        this.f173774k = true;
        mo116436b();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: h */
    public final void mo116447h() {
        m135402l().mo121049a();
        this.f173774k = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.j$b */
    static final class C77449b extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C77449b f173778a = new C77449b();

        static {
            Covode.recordClassIndex(90482);
        }

        C77449b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
            a.f95504b = "story_publisher_synthetic_executor";
            return C40780g.m82242a(a.mo70028a());
        }
    }

    static {
        Covode.recordClassIndex(90480);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: i */
    public final C69840ar mo116448i() {
        C69840ar a = new C69840ar().mo110187a("is_story", (Integer) 1);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: d */
    public final void mo116441d(C65616g gVar) {
        mo116433a(gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: e */
    public final void mo116443e(C65616g gVar) {
        this.f173776m = gVar;
        this.f173775l = true;
        if (this.f173775l) {
            mo116439c(this.f173776m);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77447j(AbstractC71893j jVar, int i, int i2, int i3, String str, boolean z, AbstractC74304x<C69831ai> xVar) {
        super(jVar, i, i2, i3, str, z, xVar);
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(xVar, "");
    }
}
