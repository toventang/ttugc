package com.p2082ss.android.ugc.gamora.recorder.p4295c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.c.a */
public final class C83470a {

    /* renamed from: a */
    public final AbstractC84089j f186423a;

    static {
        Covode.recordClassIndex(97356);
    }

    public C83470a(AbstractC84089j jVar) {
        C89219l.m154721d(jVar, "");
        this.f186423a = jVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.a$a */
    public static final class C83471a implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ C83470a f186424a;

        /* renamed from: b */
        final /* synthetic */ IEffectDownloadProgressListener f186425b;

        static {
            Covode.recordClassIndex(97357);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f186425b;
            if (exceptionResult == null) {
                exceptionResult = new ExceptionResult(new Exception("unknown"));
            }
            iEffectDownloadProgressListener.onFail(null, exceptionResult);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            List<Effect> data;
            Effect effect;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = data.get(0)) != null) {
                if (this.f186424a.f186423a.mo23167t().mo119291c().mo119459e().mo119439a(effect)) {
                    this.f186425b.onSuccess(effect);
                } else {
                    this.f186424a.f186423a.mo23167t().mo119283a(effect, this.f186425b);
                }
            }
        }

        C83471a(C83470a aVar, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
            this.f186424a = aVar;
            this.f186425b = iEffectDownloadProgressListener;
        }
    }

    /* renamed from: a */
    public final void mo128482a(String str, Map<String, String> map, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iEffectDownloadProgressListener, "");
        C75346e.m132158a(this.f186423a, C89070n.m154516a(str), map, new C83471a(this, iEffectDownloadProgressListener));
    }
}
