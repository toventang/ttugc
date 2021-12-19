package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.vesdk.C85346av;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.n */
public final class C74228n extends C74172g<AbstractC74227m> implements AbstractC74227m {

    /* renamed from: q */
    private final C2563k<Boolean> f166736q;

    /* renamed from: r */
    private final C2559g<Boolean> f166737r;

    static {
        Covode.recordClassIndex(86987);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74227m
    /* renamed from: G */
    public final C2559g<Boolean> mo116699G() {
        return this.f166737r;
    }

    /* Return type fixed from 'com.bytedance.creativex.recorder.b.a.m' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g
    /* renamed from: M */
    public final /* bridge */ /* synthetic */ AbstractC74227m mo116648M() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g, com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        mo116643H().mo22747A().mo56916a(new C74230b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.n$a */
    static final class C74229a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74228n f166738a;

        /* renamed from: b */
        final /* synthetic */ int f166739b;

        static {
            Covode.recordClassIndex(86988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74229a(C74228n nVar, int i) {
            super(0);
            this.f166738a = nVar;
            this.f166739b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i = this.f166739b;
            if (i == 1022) {
                C14207x xVar = new C14207x("stop record when stopPreview");
                xVar.f34485a = 3;
                C74228n nVar = this.f166738a;
                C89219l.m154716b(xVar, "");
                nVar.mo22889b(xVar);
                this.f166738a.mo22879a(xVar);
            } else if (i == 1080) {
                C74228n nVar2 = this.f166738a;
                nVar2.f166636j = nVar2.mo116643H().mo22751E().mo122463a();
                this.f166738a.mo22918y();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74227m
    /* renamed from: g */
    public final void mo116700g(boolean z) {
        this.f166736q.mo6999a(Boolean.valueOf(!z));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g, com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m
    /* renamed from: a */
    public final void mo22879a(C14207x xVar) {
        C89219l.m154721d(xVar, "");
        if (xVar.f34485a != 0) {
            super.mo22879a(xVar);
        } else {
            super.mo22879a(xVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74228n(C21582f fVar, AbstractC89172b<? super C74172g.C74180b, C89391z> bVar) {
        super(fVar, bVar);
        C89219l.m154721d(fVar, "");
        C2563k<Boolean> kVar = new C2563k<>();
        this.f166736q = kVar;
        this.f166737r = kVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.n$b */
    static final class C74230b extends AbstractC89220m implements AbstractC89188r<Integer, Integer, String, C85346av, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74228n f166740a;

        static {
            Covode.recordClassIndex(86989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74230b(C74228n nVar) {
            super(4);
            this.f166740a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, String str, C85346av avVar) {
            int intValue = num.intValue();
            C89219l.m154721d(avVar, "");
            C80558hx.m139642a(0, new C74229a(this.f166740a, intValue));
            return C89391z.f203057a;
        }
    }
}
