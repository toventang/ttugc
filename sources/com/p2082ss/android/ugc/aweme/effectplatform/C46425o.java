package com.p2082ss.android.ugc.aweme.effectplatform;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.o */
public final class C46425o implements IFetchPanelInfoListener {

    /* renamed from: c */
    public static final C46426a f108181c = new C46426a((byte) 0);

    /* renamed from: a */
    public final String f108182a;

    /* renamed from: b */
    public final IFetchPanelInfoListener f108183b;

    /* renamed from: d */
    private final C27252o f108184d;

    static {
        Covode.recordClassIndex(55006);
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.o$a */
    public static final class C46426a {
        static {
            Covode.recordClassIndex(55007);
        }

        private C46426a() {
        }

        public /* synthetic */ C46426a(byte b) {
            this();
        }

        /* renamed from: a */
        public static IFetchPanelInfoListener m89592a(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchPanelInfoListener, "");
            return new C46425o(str, iFetchPanelInfoListener, (byte) 0);
        }
    }

    /* renamed from: a */
    private final String m89591a() {
        if (TextUtils.equals(this.f108182a, "default")) {
            return "effect_panel_info";
        }
        return C46420k.m89588a(this.f108182a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
        long a = this.f108184d.mo45339a(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.f108183b;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onSuccess(panelInfoModel);
        }
        C80322d.m139251a("tool_performance_api", new C84425b().mo129406a("api_type", m89591a()).mo129404a("duration", a).mo129403a("status", 0).f188764a);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        Integer num;
        long a = this.f108184d.mo45339a(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.f108183b;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onFail(exceptionResult);
        }
        C84425b a2 = new C84425b().mo129406a("api_type", m89591a()).mo129404a("duration", a).mo129403a("status", 1).mo129405a("error_domain", EffectPlatformFactory.m89604a().getHosts().get(0));
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            num = null;
        }
        C80322d.m139251a("tool_performance_api", a2.mo129405a("error_code", num).f188764a);
    }

    private C46425o(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
        this.f108182a = str;
        this.f108183b = iFetchPanelInfoListener;
        this.f108184d = C27252o.m54253a();
    }

    public /* synthetic */ C46425o(String str, IFetchPanelInfoListener iFetchPanelInfoListener, byte b) {
        this(str, iFetchPanelInfoListener);
    }
}
