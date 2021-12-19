package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50747h;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50748i;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50749j;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50752m;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50723f;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.p2988a.C50711a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50708p;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84455l;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.C84477h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.h */
public final class C50782h implements AbstractC50708p {

    /* renamed from: a */
    public AbstractC27255q<AbstractC50751l> f117196a;

    /* renamed from: b */
    public AbstractC27255q<AbstractC50722e> f117197b;

    /* renamed from: c */
    public AbstractC27255q<AbstractC84455l> f117198c;

    /* renamed from: d */
    public AbstractC27255q<AbstractC50749j> f117199d;

    /* renamed from: e */
    public AbstractC27255q<AbstractC50752m> f117200e;

    /* renamed from: f */
    private AbstractC27255q<AbstractC50747h> f117201f;

    /* renamed from: g */
    private Integer f117202g;

    /* renamed from: h */
    private Boolean f117203h;

    /* renamed from: i */
    private AbstractC27255q<AbstractC50748i> f117204i;

    /* renamed from: j */
    private final Context f117205j;

    /* renamed from: k */
    private final AbstractC27255q<AbstractC84398d> f117206k;

    /* renamed from: l */
    private final AbstractC27255q<String> f117207l;

    static {
        Covode.recordClassIndex(59950);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.h$a */
    public static final class C50783a implements AbstractC27255q<AbstractC84455l> {

        /* renamed from: a */
        private final AbstractC89244h f117208a = C89250i.m154773a((AbstractC89171a) C50784a.f117209a);

        static {
            Covode.recordClassIndex(59951);
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.h$a$a */
        static final class C50784a extends AbstractC89220m implements AbstractC89171a<C84477h> {

            /* renamed from: a */
            public static final C50784a f117209a = new C50784a();

            static {
                Covode.recordClassIndex(59952);
            }

            C50784a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C84477h invoke() {
                return new C84477h();
            }
        }

        C50783a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ AbstractC84455l mo5560b() {
            return (C84477h) this.f117208a.getValue();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50708p
    /* renamed from: a */
    public final AbstractC50707o mo86073a() {
        AbstractC50751l lVar;
        AbstractC50722e eVar;
        int i;
        AbstractC50747h hVar;
        AbstractC50748i iVar;
        boolean z;
        AbstractC27255q<AbstractC50751l> qVar = this.f117196a;
        if (qVar == null || (lVar = qVar.mo5560b()) == null) {
            String absolutePath = new File(C84902i.m145895b(this.f117205j), "filters").getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            lVar = new C50760e(new C50759d(absolutePath));
        }
        AbstractC27255q<AbstractC50752m> qVar2 = this.f117200e;
        if (qVar2 != null) {
            AbstractC50752m b = qVar2.mo5560b();
            C89219l.m154716b(b, "");
            lVar.mo86108a(b);
        }
        AbstractC27255q<AbstractC50722e> qVar3 = this.f117197b;
        if (qVar3 == null || (eVar = qVar3.mo5560b()) == null) {
            eVar = C50723f.f117090a;
        }
        AbstractC27255q qVar4 = this.f117198c;
        if (qVar4 == null) {
            qVar4 = new C50783a();
        }
        Integer num = this.f117202g;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 3;
        }
        C50711a aVar = new C50711a(lVar, eVar, qVar4, i);
        AbstractC27255q<AbstractC50749j> qVar5 = this.f117199d;
        if (qVar5 != null) {
            AbstractC50749j b2 = qVar5.mo5560b();
            C89219l.m154716b(b2, "");
            AbstractC50749j jVar = b2;
            C89219l.m154721d(jVar, "");
            aVar.f117061c = jVar;
        }
        C50761f fVar = new C50761f(eVar, aVar, lVar);
        AbstractC27255q<AbstractC50747h> qVar6 = this.f117201f;
        if (qVar6 == null || (hVar = qVar6.mo5560b()) == null) {
            hVar = new C50756c(new C50793j(eVar), new C50795k(this.f117206k, this.f117207l));
        }
        AbstractC27255q<AbstractC50748i> qVar7 = this.f117204i;
        if (qVar7 == null || (iVar = qVar7.mo5560b()) == null) {
            iVar = new C50785i();
        }
        Boolean bool = this.f117203h;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        return new C50763g(lVar, aVar, eVar, hVar, fVar, iVar, z);
    }

    public C50782h(Context context, AbstractC27255q<AbstractC84398d> qVar, AbstractC27255q<String> qVar2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(qVar2, "");
        this.f117205j = context;
        this.f117206k = qVar;
        this.f117207l = qVar2;
    }
}
