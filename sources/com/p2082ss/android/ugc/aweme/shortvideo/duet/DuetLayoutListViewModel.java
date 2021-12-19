package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutListViewModel */
public final class DuetLayoutListViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public C1213t<C35324a<EffectChannelResponse>> f158147a;

    static {
        Covode.recordClassIndex(83122);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutListViewModel$a */
    public static final class C70654a implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ DuetLayoutListViewModel f158148a;

        static {
            Covode.recordClassIndex(83123);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70654a(DuetLayoutListViewModel duetLayoutListViewModel) {
            this.f158148a = duetLayoutListViewModel;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exc;
            C1213t<C35324a<EffectChannelResponse>> tVar = this.f158148a.f158147a;
            if (tVar != null) {
                if (exceptionResult != null) {
                    exc = exceptionResult.getException();
                } else {
                    exc = null;
                }
                tVar.setValue(C35324a.m72282a((Throwable) exc));
            }
            this.f158148a.f158147a = null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            C89219l.m154721d(effectChannelResponse, "");
            C1213t<C35324a<EffectChannelResponse>> tVar = this.f158148a.f158147a;
            if (tVar != null) {
                tVar.setValue(C35324a.m72281a(effectChannelResponse));
            }
        }
    }

    /* renamed from: a */
    public final C1213t<C35324a<EffectChannelResponse>> mo111466a(AbstractC46415f fVar, String str) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str, "");
        C1213t<C35324a<EffectChannelResponse>> tVar = this.f158147a;
        if (tVar != null) {
            return tVar;
        }
        C1213t<C35324a<EffectChannelResponse>> tVar2 = new C1213t<>();
        this.f158147a = tVar2;
        tVar2.setValue(C35324a.m72278a());
        fVar.mo78907a(str, false, (IFetchEffectChannelListener) new C70654a(this));
        C1213t<C35324a<EffectChannelResponse>> tVar3 = this.f158147a;
        if (tVar3 == null) {
            C89219l.m154715b();
        }
        return tVar3;
    }
}
