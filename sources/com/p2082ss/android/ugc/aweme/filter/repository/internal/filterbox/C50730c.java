package com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50701i;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50702j;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.c */
public final class C50730c implements AbstractC50702j {

    /* renamed from: a */
    public final AbstractC27255q<FilterBoxApi> f117102a;

    /* renamed from: b */
    private final AbstractC50707o f117103b;

    /* renamed from: c */
    private final AbstractC27255q<AbstractC84398d> f117104c;

    /* renamed from: d */
    private final C50732d f117105d;

    static {
        Covode.recordClassIndex(59895);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.c$a */
    static final class C50731a extends AbstractC89220m implements AbstractC89171a<FilterBoxApi> {

        /* renamed from: a */
        final /* synthetic */ C50730c f117106a;

        static {
            Covode.recordClassIndex(59896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50731a(C50730c cVar) {
            super(0);
            this.f117106a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FilterBoxApi invoke() {
            return this.f117106a.f117102a.mo5560b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50702j
    /* renamed from: a */
    public final AbstractC50701i mo86051a() {
        return new C50728b(new C50733e(C89250i.m154773a((AbstractC89171a) new C50731a(this)), this.f117105d, this.f117104c), this.f117103b);
    }

    public C50730c(AbstractC50707o oVar, AbstractC27255q<FilterBoxApi> qVar, AbstractC27255q<AbstractC84398d> qVar2, C50732d dVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(qVar2, "");
        C89219l.m154721d(dVar, "");
        this.f117103b = oVar;
        this.f117102a = qVar;
        this.f117104c = qVar2;
        this.f117105d = dVar;
    }
}
