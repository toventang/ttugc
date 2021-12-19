package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84448g;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.a.c */
public abstract class AbstractC84469c<RESULT, INFO> implements AbstractC84448g<ProviderEffect, RESULT, INFO> {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC84398d> f188811a;

    static {
        Covode.recordClassIndex(98434);
    }

    /* renamed from: a */
    public abstract Exception mo129445a(ProviderEffect providerEffect, ExceptionResult exceptionResult);

    /* renamed from: a */
    public abstract RESULT mo129446a(ProviderEffect providerEffect);

    /* renamed from: b */
    public abstract INFO mo129447b(ProviderEffect providerEffect);

    /* renamed from: c */
    public abstract INFO mo129448c(ProviderEffect providerEffect);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC84469c(AbstractC89171a<? extends AbstractC84398d> aVar) {
        C89219l.m154721d(aVar, "");
        this.f188811a = aVar;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.c$a */
    public static final class C84470a implements IDownloadProviderEffectProgressListener {

        /* renamed from: a */
        public long f188812a = System.currentTimeMillis();

        /* renamed from: b */
        final /* synthetic */ AbstractC84469c f188813b;

        /* renamed from: c */
        final /* synthetic */ AbstractC84447f f188814c;

        /* renamed from: d */
        final /* synthetic */ ProviderEffect f188815d;

        static {
            Covode.recordClassIndex(98435);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(ProviderEffect providerEffect) {
            long currentTimeMillis = System.currentTimeMillis() - this.f188812a;
            AbstractC84447f fVar = this.f188814c;
            ProviderEffect providerEffect2 = this.f188815d;
            fVar.mo119505a(providerEffect2, this.f188813b.mo129446a(providerEffect2), this.f188813b.mo129447b(this.f188815d), currentTimeMillis);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener
        public final void onFail(ProviderEffect providerEffect, ExceptionResult exceptionResult) {
            long currentTimeMillis = System.currentTimeMillis() - this.f188812a;
            AbstractC84447f fVar = this.f188814c;
            ProviderEffect providerEffect2 = this.f188815d;
            fVar.mo119503a((Object) providerEffect2, this.f188813b.mo129445a(providerEffect2, exceptionResult), this.f188813b.mo129448c(this.f188815d), currentTimeMillis);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener
        public final void onProgress(ProviderEffect providerEffect, int i, long j) {
            this.f188814c.mo119502a(this.f188815d, i);
        }

        C84470a(AbstractC84469c cVar, AbstractC84447f fVar, ProviderEffect providerEffect) {
            this.f188813b = cVar;
            this.f188814c = fVar;
            this.f188815d = providerEffect;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84448g
    /* renamed from: a */
    public final /* synthetic */ void mo119501a(ProviderEffect providerEffect, AbstractC84447f fVar) {
        ProviderEffect providerEffect2 = providerEffect;
        C89219l.m154721d(providerEffect2, "");
        C89219l.m154721d(fVar, "");
        this.f188811a.invoke().mo78888a(providerEffect2, new C84470a(this, fVar, providerEffect2));
    }
}
