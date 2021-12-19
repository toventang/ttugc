package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3990b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75690ab;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75691ac;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.d */
public final class C75757d implements IEffectDownloadProgressListener {

    /* renamed from: a */
    private long f170177a = System.currentTimeMillis();

    /* renamed from: b */
    private long f170178b;

    /* renamed from: c */
    private final C75691ac f170179c;

    /* renamed from: d */
    private final AbstractC84447f<C75691ac, Effect, C75690ab> f170180d;

    static {
        Covode.recordClassIndex(88691);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.f170177a = System.currentTimeMillis();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        Effect effect2 = effect;
        long currentTimeMillis = System.currentTimeMillis() - this.f170177a;
        AbstractC84447f<C75691ac, Effect, C75690ab> fVar = this.f170180d;
        C75691ac acVar = this.f170179c;
        if (effect2 == null) {
            effect2 = acVar.f170122a;
        }
        fVar.mo119505a(acVar, effect2, new C75690ab(this.f170178b, 3), currentTimeMillis);
    }

    public C75757d(C75691ac acVar, AbstractC84447f<C75691ac, Effect, C75690ab> fVar) {
        C89219l.m154721d(acVar, "");
        C89219l.m154721d(fVar, "");
        this.f170179c = acVar;
        this.f170180d = fVar;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        C89219l.m154721d(exceptionResult, "");
        this.f170180d.mo119503a(this.f170179c, exceptionResult.getException(), new C75690ab(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg(), this.f170178b), System.currentTimeMillis() - this.f170177a);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.f170178b = j;
        this.f170180d.mo119502a(this.f170179c, i);
    }
}
