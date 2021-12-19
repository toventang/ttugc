package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84448g;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86793b;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.a.d */
public abstract class AbstractC84471d<RESULT, INFO> implements AbstractC84448g<InfoStickerEffect, RESULT, INFO> {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC84398d> f188816a;

    static {
        Covode.recordClassIndex(98436);
    }

    /* renamed from: a */
    public abstract Exception mo129449a(InfoStickerEffect infoStickerEffect, ExceptionResult exceptionResult);

    /* renamed from: a */
    public abstract RESULT mo129450a(InfoStickerEffect infoStickerEffect);

    /* renamed from: b */
    public abstract INFO mo129451b(InfoStickerEffect infoStickerEffect);

    /* renamed from: c */
    public abstract INFO mo129452c(InfoStickerEffect infoStickerEffect);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC84471d(AbstractC89171a<? extends AbstractC84398d> aVar) {
        C89219l.m154721d(aVar, "");
        this.f188816a = aVar;
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.d$a */
    public static final class C84472a implements AbstractC86793b {

        /* renamed from: a */
        public long f188817a = System.currentTimeMillis();

        /* renamed from: b */
        final /* synthetic */ AbstractC84471d f188818b;

        /* renamed from: c */
        final /* synthetic */ AbstractC84447f f188819c;

        /* renamed from: d */
        final /* synthetic */ InfoStickerEffect f188820d;

        static {
            Covode.recordClassIndex(98437);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(InfoStickerEffect infoStickerEffect) {
            C89219l.m154721d(infoStickerEffect, "");
            long currentTimeMillis = System.currentTimeMillis() - this.f188817a;
            AbstractC84447f fVar = this.f188819c;
            InfoStickerEffect infoStickerEffect2 = this.f188820d;
            fVar.mo119505a(infoStickerEffect2, this.f188818b.mo129450a(infoStickerEffect2), this.f188818b.mo129451b(this.f188820d), currentTimeMillis);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.h.a.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(InfoStickerEffect infoStickerEffect, C86840e eVar) {
            C89219l.m154721d(eVar, "");
            long currentTimeMillis = System.currentTimeMillis() - this.f188817a;
            AbstractC84447f fVar = this.f188819c;
            InfoStickerEffect infoStickerEffect2 = this.f188820d;
            Exception a = this.f188818b.mo129449a(infoStickerEffect2, ListenerAdaptExtKt.toOldExceptionResult(eVar));
            AbstractC84471d dVar = this.f188818b;
            InfoStickerEffect infoStickerEffect3 = this.f188820d;
            ListenerAdaptExtKt.toOldExceptionResult(eVar);
            fVar.mo119503a((Object) infoStickerEffect2, a, dVar.mo129452c(infoStickerEffect3), currentTimeMillis);
        }

        C84472a(AbstractC84471d dVar, AbstractC84447f fVar, InfoStickerEffect infoStickerEffect) {
            this.f188818b = dVar;
            this.f188819c = fVar;
            this.f188820d = infoStickerEffect;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84448g
    /* renamed from: a */
    public final /* synthetic */ void mo119501a(InfoStickerEffect infoStickerEffect, AbstractC84447f fVar) {
        InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
        C89219l.m154721d(infoStickerEffect2, "");
        C89219l.m154721d(fVar, "");
        this.f188816a.invoke().mo78890a(infoStickerEffect2, new C84472a(this, fVar, infoStickerEffect2));
    }
}
