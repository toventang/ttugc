package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4357a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84536d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84537e;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84566b;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.C84605m;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84454k;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84436a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84437b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84438c;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84442f;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84512h;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4352c.C84529b;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4352c.C84530c;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.d */
public final class C84558d implements AbstractC84537e {

    /* renamed from: a */
    public AbstractC89171a<? extends AbstractC84454k<Effect, C84605m>> f188973a;

    /* renamed from: b */
    public boolean f188974b = true;

    /* renamed from: c */
    public final AbstractC89171a<AbstractC84398d> f188975c;

    /* renamed from: d */
    private AbstractC89171a<? extends AbstractC84436a> f188976d;

    /* renamed from: e */
    private AbstractC89171a<? extends AbstractC84566b> f188977e;

    /* renamed from: f */
    private Integer f188978f;

    /* renamed from: g */
    private AbstractC89171a<? extends AbstractC84442f<EffectCategoryResponse>> f188979g;

    /* renamed from: h */
    private AbstractC89171a<? extends AbstractC84437b<Effect>> f188980h;

    /* renamed from: i */
    private Integer f188981i;

    /* renamed from: j */
    private final AbstractC89171a<AbstractC84438c> f188982j;

    static {
        Covode.recordClassIndex(98523);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.d$a */
    static final class C84559a extends AbstractC89220m implements AbstractC89171a<C84564g> {

        /* renamed from: a */
        final /* synthetic */ C84558d f188983a;

        static {
            Covode.recordClassIndex(98524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84559a(C84558d dVar) {
            super(0);
            this.f188983a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84564g invoke() {
            return new C84564g(this.f188983a.f188975c);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84537e
    /* renamed from: a */
    public final AbstractC84536d mo129483a() {
        AbstractC84436a aVar;
        int i;
        AbstractC84442f fVar;
        int i2;
        AbstractC84437b bVar;
        AbstractC89171a<? extends AbstractC84436a> aVar2 = this.f188976d;
        if (aVar2 == null || (aVar = (AbstractC84436a) aVar2.invoke()) == null) {
            aVar = new C84530c(this.f188975c);
        }
        AbstractC89171a aVar3 = this.f188977e;
        if (aVar3 == null) {
            aVar3 = new C84559a(this);
        }
        Integer num = this.f188978f;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 3;
        }
        C84552a aVar4 = new C84552a(aVar, aVar3, i);
        AbstractC89171a<? extends AbstractC84454k<Effect, C84605m>> aVar5 = this.f188973a;
        if (aVar5 != null) {
            aVar4.mo129440a((AbstractC84454k) aVar5.invoke());
        }
        AbstractC84438c invoke = this.f188982j.invoke();
        AbstractC89171a<? extends AbstractC84442f<EffectCategoryResponse>> aVar6 = this.f188979g;
        if (aVar6 == null || (fVar = (AbstractC84442f) aVar6.invoke()) == null) {
            fVar = new C84512h(this.f188975c);
        }
        C84562f fVar2 = new C84562f(aVar, aVar4);
        Integer num2 = this.f188981i;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 75;
        }
        AbstractC89171a<? extends AbstractC84437b<Effect>> aVar7 = this.f188980h;
        if (aVar7 == null || (bVar = (AbstractC84437b) aVar7.invoke()) == null) {
            bVar = new C84529b(this.f188975c, i2, this.f188974b);
        }
        return new C84553b(invoke, fVar, bVar, fVar2, aVar4, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.h.a.a.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84558d(AbstractC89171a<? extends AbstractC84398d> aVar, AbstractC89171a<? extends AbstractC84438c> aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f188975c = aVar;
        this.f188982j = aVar2;
    }
}
