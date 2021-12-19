package com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.f */
public final class C50740f {

    /* renamed from: a */
    public static final IFetchEffectChannelListener f117124a = new C50741a();

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.f$a */
    public static final class C50741a implements IFetchEffectChannelListener {
        static {
            Covode.recordClassIndex(59906);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
        }

        C50741a() {
        }
    }

    static {
        Covode.recordClassIndex(59905);
    }
}
