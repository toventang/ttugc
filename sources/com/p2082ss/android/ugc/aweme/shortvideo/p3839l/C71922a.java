package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.a */
public final class C71922a {

    /* renamed from: a */
    public IFetchEffectListByIdsListener f161165a;

    static {
        Covode.recordClassIndex(84471);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.a$a */
    public static final class C71923a implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ C71922a f161166a;

        /* renamed from: b */
        final /* synthetic */ IFetchEffectListByIdsListener f161167b;

        static {
            Covode.recordClassIndex(84472);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            IFetchEffectListByIdsListener iFetchEffectListByIdsListener = this.f161166a.f161165a;
            if (iFetchEffectListByIdsListener != null) {
                iFetchEffectListByIdsListener.onFail(exceptionResult);
            }
            this.f161167b.onFail(exceptionResult);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            IFetchEffectListByIdsListener iFetchEffectListByIdsListener = this.f161166a.f161165a;
            if (iFetchEffectListByIdsListener != null) {
                iFetchEffectListByIdsListener.onSuccess(effectListResponse);
            }
            this.f161167b.onSuccess(effectListResponse);
        }

        public C71923a(C71922a aVar, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
            this.f161166a = aVar;
            this.f161167b = iFetchEffectListByIdsListener;
        }
    }
}
