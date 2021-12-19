package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.n */
public final class C46423n implements IEffectDownloadProgressListener {

    /* renamed from: c */
    public static final C46424a f108176c = new C46424a((byte) 0);

    /* renamed from: a */
    public final String f108177a;

    /* renamed from: b */
    public final IFetchEffectListener f108178b;

    /* renamed from: d */
    private final C27252o f108179d;

    /* renamed from: e */
    private final boolean f108180e;

    static {
        Covode.recordClassIndex(55004);
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.n$a */
    public static final class C46424a {
        static {
            Covode.recordClassIndex(55005);
        }

        private C46424a() {
        }

        public /* synthetic */ C46424a(byte b) {
            this();
        }

        /* renamed from: a */
        public static IFetchEffectListener m89590a(String str, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
            return new C46423n(str, iEffectDownloadProgressListener, (byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.f108178b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        String str;
        Effect effect2 = effect;
        long a = this.f108179d.mo45339a(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.f108178b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect2);
        }
        C84425b a2 = new C84425b().mo129406a("resource_type", C46422m.m89589a(this.f108177a)).mo129404a("duration", a).mo129403a("status", 0);
        if (effect2 != null) {
            str = effect2.getEffectId();
        } else {
            str = null;
        }
        C80322d.m139251a("tool_performance_resource_download", a2.mo129406a("resource_id", str).mo129407a("is_auto_download", this.f108180e).f188764a);
    }

    public C46423n(String str, IFetchEffectListener iFetchEffectListener) {
        this.f108177a = str;
        this.f108178b = iFetchEffectListener;
        this.f108180e = false;
        C27252o a = C27252o.m54253a();
        C89219l.m154716b(a, "");
        this.f108179d = a;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        String str;
        C89219l.m154721d(exceptionResult, "");
        long a = this.f108179d.mo45339a(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.f108178b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
        C84425b a2 = new C84425b().mo129406a("resource_type", C46422m.m89589a(this.f108177a)).mo129404a("duration", a).mo129403a("status", 1);
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
        C80322d.m139251a("tool_performance_resource_download", a3.mo129406a("error_msg", msg).mo129407a("is_auto_download", this.f108180e).f188764a);
    }

    public /* synthetic */ C46423n(String str, IFetchEffectListener iFetchEffectListener, byte b) {
        this(str, iFetchEffectListener);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        IFetchEffectListener iFetchEffectListener = this.f108178b;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(effect, i, j);
        }
    }
}
