package com.p2082ss.android.ugc.aweme.effect.p2889b;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46421l;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.b.b */
public final class C46313b implements IFetchEffectListener {

    /* renamed from: a */
    public static final C46314a f107965a = new C46314a((byte) 0);

    /* renamed from: b */
    private long f107966b;

    /* renamed from: c */
    private final String f107967c;

    /* renamed from: d */
    private final IFetchEffectListener f107968d;

    static {
        Covode.recordClassIndex(54890);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.b$a */
    public static final class C46314a {
        static {
            Covode.recordClassIndex(54891);
        }

        private C46314a() {
        }

        public /* synthetic */ C46314a(byte b) {
            this();
        }

        /* renamed from: a */
        public static IFetchEffectListener m89346a(String str, String str2, IFetchEffectListener iFetchEffectListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchEffectListener, "");
            return new C46313b(str, new C46421l(str2, iFetchEffectListener), (byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.f107966b = System.currentTimeMillis();
        IFetchEffectListener iFetchEffectListener = this.f107968d;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        UrlModel urlModel;
        String str;
        String name;
        Effect effect2 = effect;
        long currentTimeMillis = System.currentTimeMillis() - this.f107966b;
        AbstractC63190ap I = C63244g.m114602a().mo73263I();
        String str2 = this.f107967c;
        C69840ar arVar = new C69840ar();
        C27910f G = C63244g.m114602a().mo73261G();
        Integer num = null;
        if (effect2 != null) {
            urlModel = effect2.getFileUrl();
        } else {
            urlModel = null;
        }
        String b = G.mo46674b(urlModel);
        String str3 = "";
        if (b == null) {
            b = str3;
        }
        C69840ar a = arVar.mo110189a("url", b).mo110189a("duration", String.valueOf(currentTimeMillis));
        if (effect2 == null || (str = effect2.getEffectId()) == null) {
            str = str3;
        }
        C69840ar a2 = a.mo110189a("effect_id", str);
        if (!(effect2 == null || (name = effect2.getName()) == null)) {
            str3 = name;
        }
        C69840ar a3 = a2.mo110189a("effect_name", str3);
        if (effect2 != null) {
            num = Integer.valueOf(effect2.getEffectType());
        }
        I.mo101629a(str2, 0, a3.mo110187a("effect_type", num).mo110191a());
        IFetchEffectListener iFetchEffectListener = this.f107968d;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect2);
        }
    }

    private C46313b(String str, IFetchEffectListener iFetchEffectListener) {
        this.f107967c = str;
        this.f107968d = iFetchEffectListener;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        String str;
        String str2;
        int i;
        UrlModel urlModel;
        String str3 = "";
        C89219l.m154721d(exceptionResult, str3);
        AbstractC63190ap I = C63244g.m114602a().mo73263I();
        String str4 = this.f107967c;
        C69840ar arVar = new C69840ar();
        if (effect == null || (str = effect.getEffectId()) == null) {
            str = str3;
        }
        C69840ar a = arVar.mo110189a("effect_id", str);
        if (effect == null || (str2 = effect.getName()) == null) {
            str2 = str3;
        }
        C69840ar a2 = a.mo110189a("effect_name", str2);
        if (effect != null) {
            i = effect.getEffectType();
        } else {
            i = -1;
        }
        C69840ar a3 = a2.mo110187a("effect_type", Integer.valueOf(i));
        C27910f G = C63244g.m114602a().mo73261G();
        if (effect != null) {
            urlModel = effect.getFileUrl();
        } else {
            urlModel = null;
        }
        String b = G.mo46674b(urlModel);
        if (b != null) {
            str3 = b;
        }
        I.mo101629a(str4, 1, a3.mo110189a("url", str3).mo110189a("exception", Log.getStackTraceString(exceptionResult.getException())).mo110187a("errorCode", Integer.valueOf(exceptionResult.getErrorCode())).mo110189a("errorMsg", exceptionResult.getMsg()).mo110191a());
        IFetchEffectListener iFetchEffectListener = this.f107968d;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
    }

    public /* synthetic */ C46313b(String str, IFetchEffectListener iFetchEffectListener, byte b) {
        this(str, iFetchEffectListener);
    }
}
