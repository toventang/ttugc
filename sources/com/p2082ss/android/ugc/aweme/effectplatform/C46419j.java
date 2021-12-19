package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.j */
public final class C46419j implements IFetchEffectChannelListener {

    /* renamed from: a */
    public final String f108170a;

    /* renamed from: b */
    public final IFetchEffectChannelListener f108171b;

    /* renamed from: c */
    private final C27252o f108172c = C27252o.m54253a();

    static {
        Covode.recordClassIndex(55000);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
        long a = this.f108172c.mo45339a(TimeUnit.MILLISECONDS);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.f108171b;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onSuccess(effectChannelResponse);
        }
        C80322d.m139251a("tool_performance_api", new C84425b().mo129406a("api_type", C46420k.m89588a(this.f108170a)).mo129404a("duration", a).mo129403a("status", 0).f188764a);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        Integer num;
        long a = this.f108172c.mo45339a(TimeUnit.MILLISECONDS);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.f108171b;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onFail(exceptionResult);
        }
        C84425b a2 = new C84425b().mo129406a("api_type", C46420k.m89588a(this.f108170a)).mo129404a("duration", a).mo129403a("status", 1).mo129405a("error_domain", EffectPlatformFactory.m89604a().getHosts().get(0));
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            num = null;
        }
        C80322d.m139251a("tool_performance_api", a2.mo129405a("error_code", num).f188764a);
    }

    public C46419j(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C89219l.m154721d(str, "");
        this.f108170a = str;
        this.f108171b = iFetchEffectChannelListener;
    }
}
