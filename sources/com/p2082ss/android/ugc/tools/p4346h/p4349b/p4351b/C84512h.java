package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84435a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84457n;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84442f;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.AbstractC84486b;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.h */
public final class C84512h implements AbstractC84442f<EffectCategoryResponse> {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC84398d> f188896a;

    static {
        Covode.recordClassIndex(98477);
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.h$c */
    static final class C84516c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C84457n f188901a;

        static {
            Covode.recordClassIndex(98481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84516c(C84457n nVar) {
            super(0);
            this.f188901a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return this.f188901a.f188788a;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.h$b */
    public static final class C84514b extends AbstractC84486b<EffectChannelResponse, EffectChannelResponse> {

        /* renamed from: f */
        final /* synthetic */ C84512h f188898f;

        /* renamed from: g */
        final /* synthetic */ C84457n f188899g;

        static {
            Covode.recordClassIndex(98479);
        }

        /* renamed from: com.ss.android.ugc.tools.h.b.b.h$b$a */
        public static final class C84515a implements IFetchEffectChannelListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC84486b.AbstractC84487a f188900a;

            static {
                Covode.recordClassIndex(98480);
            }

            C84515a(AbstractC84486b.AbstractC84487a aVar) {
                this.f188900a = aVar;
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                this.f188900a.mo129462a(exceptionResult);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                this.f188900a.mo129463a(effectChannelResponse);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.AbstractC84486b
        /* renamed from: d */
        public final /* bridge */ /* synthetic */ EffectChannelResponse mo129461d(EffectChannelResponse effectChannelResponse) {
            if (effectChannelResponse == null) {
                return C84386a.f188661a;
            }
            return effectChannelResponse;
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.AbstractC84486b
        /* renamed from: a */
        public final void mo129460a(AbstractC89171a<? extends AbstractC84398d> aVar, AbstractC89171a<String> aVar2, AbstractC84486b.AbstractC84487a<EffectChannelResponse> aVar3) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(aVar3, "");
            AbstractC84398d dVar = (AbstractC84398d) aVar.invoke();
            String invoke = aVar2.invoke();
            C84515a aVar4 = new C84515a(aVar3);
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(invoke, "");
            C89219l.m154721d(aVar4, "");
            C84386a.m145136a(dVar, invoke, new C84386a.C84393e(dVar, aVar4, invoke));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84514b(C84512h hVar, C84457n nVar, AbstractC89171a aVar, AbstractC89171a aVar2) {
            super(aVar, aVar2);
            this.f188898f = hVar;
            this.f188899g = nVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84512h(AbstractC89171a<? extends AbstractC84398d> aVar) {
        C89219l.m154721d(aVar, "");
        this.f188896a = aVar;
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84442f
    /* renamed from: a */
    public final AbstractC88979t<C84435a<EffectCategoryResponse, Effect>> mo129426a(C84457n nVar) {
        C89219l.m154721d(nVar, "");
        AbstractC88979t<C84435a<EffectCategoryResponse, Effect>> d = new C84514b(this, nVar, this.f188896a, new C84516c(nVar)).mo33487c(C89391z.f203057a).mo143292d(C84513a.f188897a);
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.h$a */
    static final class C84513a<T, R> implements AbstractC88434g<EffectChannelResponse, C84435a<EffectCategoryResponse, Effect>> {

        /* renamed from: a */
        public static final C84513a f188897a = new C84513a();

        static {
            Covode.recordClassIndex(98478);
        }

        C84513a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C84435a<EffectCategoryResponse, Effect> apply(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            C89219l.m154721d(effectChannelResponse2, "");
            List<EffectCategoryResponse> categoryResponseList = effectChannelResponse2.getCategoryResponseList();
            if (categoryResponseList == null || categoryResponseList.isEmpty()) {
                return new C84435a(effectChannelResponse2.getAllCategoryEffects(), C89086z.INSTANCE);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) categoryResponseList, 10));
            for (T t : categoryResponseList) {
                List<Effect> totalEffects = t.getTotalEffects();
                arrayList.addAll(totalEffects);
                arrayList2.add(C89387v.m154943a(t, totalEffects));
            }
            return new C84435a(arrayList, arrayList2);
        }
    }
}
