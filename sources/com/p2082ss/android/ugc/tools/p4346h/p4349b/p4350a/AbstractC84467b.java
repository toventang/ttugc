package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84448g;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.a.b */
public abstract class AbstractC84467b<RESULT, INFO> implements AbstractC84448g<Effect, RESULT, INFO> {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC84398d> f188806a;

    static {
        Covode.recordClassIndex(98432);
    }

    /* renamed from: a */
    public abstract Exception mo129441a(Effect effect, ExceptionResult exceptionResult);

    /* renamed from: a */
    public abstract INFO mo129442a(Effect effect);

    /* renamed from: a */
    public abstract RESULT mo129443a(Effect effect, Effect effect2);

    /* renamed from: b */
    public abstract INFO mo129444b(Effect effect, ExceptionResult exceptionResult);

    /* renamed from: com.ss.android.ugc.tools.h.b.a.b$a */
    public static final class C84468a implements IEffectDownloadProgressListener {

        /* renamed from: a */
        public long f188807a = System.currentTimeMillis();

        /* renamed from: b */
        final /* synthetic */ AbstractC84467b f188808b;

        /* renamed from: c */
        final /* synthetic */ AbstractC84447f f188809c;

        /* renamed from: d */
        final /* synthetic */ Effect f188810d;

        static {
            Covode.recordClassIndex(98433);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            this.f188807a = System.currentTimeMillis();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            long currentTimeMillis = System.currentTimeMillis() - this.f188807a;
            AbstractC84447f fVar = this.f188809c;
            Effect effect2 = this.f188810d;
            fVar.mo119505a(effect2, this.f188808b.mo129443a(effect2, effect), this.f188808b.mo129442a(this.f188810d), currentTimeMillis);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            long currentTimeMillis = System.currentTimeMillis() - this.f188807a;
            AbstractC84447f fVar = this.f188809c;
            Effect effect2 = this.f188810d;
            fVar.mo119503a((Object) effect2, this.f188808b.mo129441a(effect2, exceptionResult), this.f188808b.mo129444b(this.f188810d, exceptionResult), currentTimeMillis);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i, long j) {
            this.f188809c.mo119502a(this.f188810d, i);
        }

        C84468a(AbstractC84467b bVar, AbstractC84447f fVar, Effect effect) {
            this.f188808b = bVar;
            this.f188809c = fVar;
            this.f188810d = effect;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC84467b(AbstractC89171a<? extends AbstractC84398d> aVar) {
        C89219l.m154721d(aVar, "");
        this.f188806a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84448g
    /* renamed from: a */
    public final /* synthetic */ void mo119501a(Effect effect, AbstractC84447f fVar) {
        Effect effect2 = effect;
        C89219l.m154721d(effect2, "");
        C89219l.m154721d(fVar, "");
        this.f188806a.invoke().mo78915b(effect2, new C84468a(this, fVar, effect2));
    }
}
