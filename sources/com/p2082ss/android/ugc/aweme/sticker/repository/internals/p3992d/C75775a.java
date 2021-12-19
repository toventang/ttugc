package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3992d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75709o;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3985b.AbstractC75725b;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.a */
public final class C75775a implements AbstractC75709o {

    /* renamed from: a */
    private final AbstractC84398d f170217a;

    static {
        Covode.recordClassIndex(88709);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.a$a */
    public static final class C75776a implements IEffectDownloadProgressListener {

        /* renamed from: a */
        final /* synthetic */ IFetchEffectListener f170218a;

        static {
            Covode.recordClassIndex(88710);
        }

        C75776a(IFetchEffectListener iFetchEffectListener) {
            this.f170218a = iFetchEffectListener;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            IFetchEffectListener iFetchEffectListener = this.f170218a;
            if (iFetchEffectListener != null) {
                iFetchEffectListener.onStart(effect);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
            IFetchEffectListener iFetchEffectListener = this.f170218a;
            if (iFetchEffectListener != null) {
                iFetchEffectListener.onSuccess(effect);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            IFetchEffectListener iFetchEffectListener = this.f170218a;
            if (iFetchEffectListener != null) {
                iFetchEffectListener.onFail(effect, exceptionResult);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i, long j) {
            IFetchEffectListener iFetchEffectListener = this.f170218a;
            if (!(iFetchEffectListener instanceof IEffectDownloadProgressListener)) {
                iFetchEffectListener = null;
            }
            IEffectDownloadProgressListener iEffectDownloadProgressListener = (IEffectDownloadProgressListener) iFetchEffectListener;
            if (iEffectDownloadProgressListener != null) {
                iEffectDownloadProgressListener.onProgress(effect, i, j);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.a$b */
    public static final class C75777b implements IFetchEffectListListener {

        /* renamed from: a */
        final /* synthetic */ IFetchEffectListListener f170219a;

        static {
            Covode.recordClassIndex(88711);
        }

        C75777b(IFetchEffectListListener iFetchEffectListListener) {
            this.f170219a = iFetchEffectListListener;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            IFetchEffectListListener iFetchEffectListListener = this.f170219a;
            if (iFetchEffectListListener != null) {
                iFetchEffectListListener.onFail(exceptionResult);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(List<Effect> list) {
            IFetchEffectListListener iFetchEffectListListener = this.f170219a;
            if (iFetchEffectListListener != null) {
                iFetchEffectListListener.onSuccess(list);
            }
        }
    }

    public C75775a(AbstractC84398d dVar) {
        C89219l.m154721d(dVar, "");
        this.f170217a = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75709o
    /* renamed from: a */
    public final void mo119436a(Effect effect, IFetchEffectListener iFetchEffectListener) {
        C89219l.m154721d(effect, "");
        if (!this.f170217a.mo78918c(effect)) {
            this.f170217a.mo78915b(effect, new C75776a(iFetchEffectListener));
        } else if (!(iFetchEffectListener instanceof AbstractC75725b) && iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75709o
    /* renamed from: a */
    public final void mo119437a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        C89219l.m154721d(list, "");
        this.f170217a.mo78911a(list, map, iFetchEffectListByIdsListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75709o
    /* renamed from: a */
    public final void mo119438a(List<String> list, boolean z, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        C89219l.m154721d(list, "");
        this.f170217a.mo78912a(list, map, z, new C75777b(iFetchEffectListListener));
    }
}
