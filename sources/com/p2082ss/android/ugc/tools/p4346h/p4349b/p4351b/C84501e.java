package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.e */
public class C84501e extends AbstractC84484a<ProviderEffect, C84520l, ProviderEffectModel> {

    /* renamed from: f */
    public final AbstractC89171a<AbstractC84398d> f188875f;

    /* renamed from: g */
    public final String f188876g;

    /* renamed from: h */
    public final String f188877h;

    static {
        Covode.recordClassIndex(98466);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.h.b.b.e$a */
    public static final class C84502a<T> implements AbstractC88407af<C20169f<? extends ProviderEffectModel>> {

        /* renamed from: a */
        final /* synthetic */ C84501e f188878a;

        /* renamed from: b */
        final /* synthetic */ C84520l f188879b;

        /* renamed from: c */
        final /* synthetic */ int f188880c;

        static {
            Covode.recordClassIndex(98467);
        }

        C84502a(C84501e eVar, C84520l lVar, int i) {
            this.f188878a = eVar;
            this.f188879b = lVar;
            this.f188880c = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel>>] */
        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(final AbstractC88405ad<C20169f<? extends ProviderEffectModel>> adVar) {
            C89219l.m154721d(adVar, "");
            this.f188878a.f188875f.invoke().mo78903a(this.f188878a.f188876g, this.f188878a.f188877h, false, this.f188879b.f188909a, this.f188880c, (IFetchProviderEffect) new IFetchProviderEffect() {
                /* class com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84501e.C84502a.C845031 */

                static {
                    Covode.recordClassIndex(98468);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect
                public final void onFail(ExceptionResult exceptionResult) {
                    adVar.mo142933b(C84386a.m145135a(exceptionResult));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(ProviderEffectModel providerEffectModel) {
                    adVar.mo142931a(C20171g.m38149a(providerEffectModel));
                }
            });
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        C89378p pVar = (C89378p) obj;
        C89219l.m154721d(pVar, "");
        int intValue = ((Number) pVar.component1()).intValue();
        C84520l lVar = (C84520l) pVar.component2();
        AbstractC88979t<R> d = mo129465a(intValue, lVar).mo142925c(new C84504b(lVar)).mo142930d();
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.e$b */
    static final class C84504b<T, R> implements AbstractC88434g<C20169f<? extends ProviderEffectModel>, C89378p<? extends C84520l, ? extends C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>>> {

        /* renamed from: a */
        final /* synthetic */ C84520l f188882a;

        static {
            Covode.recordClassIndex(98469);
        }

        C84504b(C84520l lVar) {
            this.f188882a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C89378p<? extends C84520l, ? extends C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> apply(C20169f<? extends ProviderEffectModel> fVar) {
            C20169f<? extends ProviderEffectModel> fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            ProviderEffectModelTemplate providerEffectModelTemplate = (ProviderEffectModelTemplate) fVar2.mo33486a();
            if (providerEffectModelTemplate == null) {
                return C89387v.m154943a(new C84520l(this.f188882a.f188909a, false), C89387v.m154943a(C89086z.INSTANCE, null));
            }
            List<ProviderEffect> stickerList = providerEffectModelTemplate.getStickerList();
            if (stickerList == null || stickerList.isEmpty()) {
                return C89387v.m154943a(new C84520l(this.f188882a.f188909a, false), C89387v.m154943a(C89086z.INSTANCE, providerEffectModelTemplate));
            }
            return C89387v.m154943a(new C84520l(providerEffectModelTemplate.getCursor(), providerEffectModelTemplate.hasMore()), C89387v.m154943a(providerEffectModelTemplate.getStickerList(), providerEffectModelTemplate));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC88403ab<C20169f<ProviderEffectModel>> mo129465a(int i, C84520l lVar) {
        C89219l.m154721d(lVar, "");
        AbstractC88403ab<C20169f<ProviderEffectModel>> a = AbstractC88403ab.m153596a((AbstractC88407af) new C84502a(this, lVar, i));
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.AbstractC84484a
    /* renamed from: b */
    public final /* synthetic */ boolean mo129459b(C84520l lVar, C84520l lVar2) {
        C84520l lVar3 = lVar;
        C84520l lVar4 = lVar2;
        C89219l.m154721d(lVar3, "");
        C89219l.m154721d(lVar4, "");
        if (lVar3.f188909a == lVar4.f188909a) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84501e(AbstractC89171a<? extends AbstractC84398d> aVar, String str, String str2, C84520l lVar) {
        super(lVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(lVar, "");
        this.f188875f = aVar;
        this.f188876g = str;
        this.f188877h = str2;
    }
}
