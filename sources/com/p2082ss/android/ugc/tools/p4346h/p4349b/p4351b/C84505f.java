package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.f */
public class C84505f extends C84501e {

    /* renamed from: i */
    public final String f188883i;

    static {
        Covode.recordClassIndex(98470);
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.b.f$a */
    static final class C84506a<T> implements AbstractC88407af<C20169f<? extends ProviderEffectModel>> {

        /* renamed from: a */
        final /* synthetic */ C84505f f188884a;

        /* renamed from: b */
        final /* synthetic */ C84520l f188885b;

        /* renamed from: c */
        final /* synthetic */ int f188886c;

        static {
            Covode.recordClassIndex(98471);
        }

        C84506a(C84505f fVar, C84520l lVar, int i) {
            this.f188884a = fVar;
            this.f188885b = lVar;
            this.f188886c = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel>>] */
        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(final AbstractC88405ad<C20169f<? extends ProviderEffectModel>> adVar) {
            C89219l.m154721d(adVar, "");
            this.f188884a.f188875f.invoke().mo78898a(this.f188884a.f188883i, this.f188884a.f188876g, this.f188884a.f188877h, this.f188885b.f188909a, this.f188886c, (IFetchProviderEffect) new IFetchProviderEffect() {
                /* class com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84505f.C84506a.C845071 */

                static {
                    Covode.recordClassIndex(98472);
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
            }, false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84501e
    /* renamed from: a */
    public final AbstractC88403ab<C20169f<ProviderEffectModel>> mo129465a(int i, C84520l lVar) {
        C89219l.m154721d(lVar, "");
        AbstractC88403ab<C20169f<ProviderEffectModel>> a = AbstractC88403ab.m153596a((AbstractC88407af) new C84506a(this, lVar, i));
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84505f(AbstractC89171a<? extends AbstractC84398d> aVar, String str, String str2, String str3, C84520l lVar) {
        super(aVar, str, str2, lVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(lVar, "");
        this.f188883i = str3;
    }
}
