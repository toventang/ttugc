package com.p2082ss.android.ugc.aweme.external.p2916b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70669e;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70690l;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.b.a */
public final class C47112a {

    /* renamed from: a */
    public static final C47112a f109701a = new C47112a();

    private C47112a() {
    }

    static {
        Covode.recordClassIndex(55716);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.a$a */
    public static final class C47113a implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f109702a;

        /* renamed from: b */
        final /* synthetic */ AbstractC46415f f109703b;

        static {
            Covode.recordClassIndex(55717);
        }

        /* renamed from: com.ss.android.ugc.aweme.external.b.a$a$a */
        public static final class C47114a implements IFetchEffectListener {

            /* renamed from: a */
            final /* synthetic */ C47113a f109704a;

            static {
                Covode.recordClassIndex(55718);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C47114a(C47113a aVar) {
                this.f109704a = aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                this.f109704a.f109702a.invoke(effect);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C89219l.m154721d(exceptionResult, "");
                this.f109704a.f109702a.invoke(null);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f109702a.invoke(null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<Effect> allCategoryEffects;
            T t;
            String str;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (!(effectChannelResponse2 == null || (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) == null)) {
                Iterator<T> it = allCategoryEffects.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    C70669e a = C70690l.m124930a(t);
                    if (a != null) {
                        str = a.f158178a;
                    } else {
                        str = null;
                    }
                    if (C89219l.m154714a((Object) "vertical", (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    if (this.f109703b.mo78914a((Effect) t2)) {
                        this.f109702a.invoke(t2);
                        return;
                    } else {
                        this.f109703b.mo78915b(t2, new C47114a(this));
                        return;
                    }
                }
            }
            this.f109702a.invoke(null);
        }

        C47113a(AbstractC89172b bVar, AbstractC46415f fVar) {
            this.f109702a = bVar;
            this.f109703b = fVar;
        }
    }
}
