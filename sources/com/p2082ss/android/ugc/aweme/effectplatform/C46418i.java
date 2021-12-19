package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.i */
public final class C46418i implements IFetchCategoryEffectListener {

    /* renamed from: a */
    public final String f108167a;

    /* renamed from: b */
    public final IFetchCategoryEffectListener f108168b;

    /* renamed from: c */
    private final C27252o f108169c;

    static {
        Covode.recordClassIndex(54999);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
        long a = this.f108169c.mo45339a(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.f108168b;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onSuccess(categoryPageModel);
        }
        C80322d.m139251a("tool_performance_api", new C84425b().mo129406a("api_type", C46420k.m89588a(this.f108167a)).mo129404a("duration", a).mo129403a("status", 0).f188764a);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        Integer num;
        long a = this.f108169c.mo45339a(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.f108168b;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onFail(exceptionResult);
        }
        C84425b a2 = new C84425b().mo129406a("api_type", C46420k.m89588a(this.f108167a)).mo129404a("duration", a).mo129403a("status", 1).mo129405a("error_domain", EffectPlatformFactory.m89604a().getHosts().get(0));
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            num = null;
        }
        C80322d.m139251a("tool_performance_api", a2.mo129405a("error_code", num).f188764a);
    }

    public C46418i(String str, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        C89219l.m154721d(str, "");
        this.f108167a = str;
        this.f108168b = iFetchCategoryEffectListener;
        C27252o a = C27252o.m54253a();
        C89219l.m154716b(a, "");
        this.f108169c = a;
    }
}
