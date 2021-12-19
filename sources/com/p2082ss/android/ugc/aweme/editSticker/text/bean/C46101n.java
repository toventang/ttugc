package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89671m;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.n */
public final class C46101n {

    /* renamed from: a */
    public final AbstractC84398d f107349a;

    static {
        Covode.recordClassIndex(54659);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.n$a */
    public static final class C46102a implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89671m f107350a;

        static {
            Covode.recordClassIndex(54660);
        }

        public C46102a(AbstractC89671m mVar) {
            this.f107350a = mVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exception;
            if (this.f107350a.mo144213a()) {
                if (exceptionResult == null || (exception = exceptionResult.getException()) == null) {
                    this.f107350a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new Exception())));
                } else {
                    this.f107350a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) exception)));
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            ArrayList arrayList;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (effectChannelResponse2 == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                Iterator<T> it = effectChannelResponse2.getAllCategoryEffects().iterator();
                while (it.hasNext()) {
                    C46091h a = C46083b.m88939a((Effect) it.next());
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            if (this.f107350a.mo144213a()) {
                this.f107350a.resumeWith(C89379q.m157068constructorimpl(arrayList));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.n$b */
    public static final class C46103b implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89671m f107351a;

        static {
            Covode.recordClassIndex(54661);
        }

        public C46103b(AbstractC89671m mVar) {
            this.f107351a = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<C46079a> a = C46083b.m88940a(effectChannelResponse);
            if (this.f107351a.mo144213a()) {
                this.f107351a.resumeWith(C89379q.m157068constructorimpl(a));
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exception;
            if (this.f107351a.mo144213a()) {
                if (exceptionResult == null || (exception = exceptionResult.getException()) == null) {
                    this.f107351a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new Exception())));
                } else {
                    this.f107351a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) exception)));
                }
            }
        }
    }

    public C46101n(AbstractC84398d dVar) {
        C89219l.m154721d(dVar, "");
        this.f107349a = dVar;
    }
}
