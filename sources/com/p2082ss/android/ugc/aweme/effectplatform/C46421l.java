package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.l */
public final class C46421l implements IFetchEffectListener {

    /* renamed from: a */
    public final String f108173a;

    /* renamed from: b */
    public final IFetchEffectListener f108174b;

    /* renamed from: c */
    private final C27252o f108175c = C27252o.m54253a();

    static {
        Covode.recordClassIndex(55002);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.f108174b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        String str;
        Effect effect2 = effect;
        long a = this.f108175c.mo45339a(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.f108174b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect2);
        }
        C84425b a2 = new C84425b().mo129406a("resource_type", C46422m.m89589a(this.f108173a)).mo129404a("duration", a).mo129403a("status", 0);
        if (effect2 != null) {
            str = effect2.getEffectId();
        } else {
            str = null;
        }
        C80322d.m139251a("tool_performance_resource_download", a2.mo129406a("resource_id", str).f188764a);
    }

    public C46421l(String str, IFetchEffectListener iFetchEffectListener) {
        this.f108173a = str;
        this.f108174b = iFetchEffectListener;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        String str;
        C89219l.m154721d(exceptionResult, "");
        long a = this.f108175c.mo45339a(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.f108174b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
        C84425b a2 = new C84425b().mo129406a("resource_type", C46422m.m89589a(this.f108173a)).mo129404a("duration", a).mo129403a("status", 1);
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        C84425b a3 = a2.mo129406a("resource_id", str).mo129405a("error_domain", EffectPlatformFactory.m89604a().getHosts().get(0)).mo129403a("error_code", exceptionResult.getErrorCode());
        String msg = exceptionResult.getMsg();
        if (msg == null) {
            msg = "empty_error_msg";
        }
        C80322d.m139251a("tool_performance_resource_download", a3.mo129406a("error_msg", msg).f188764a);
    }
}
