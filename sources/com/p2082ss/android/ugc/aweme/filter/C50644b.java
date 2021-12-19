package com.p2082ss.android.ugc.aweme.filter;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.b */
public final class C50644b {

    /* renamed from: a */
    private final AbstractC27255q<AbstractC84398d> f116977a;

    /* renamed from: b */
    private final AbstractC27255q<String> f116978b;

    static {
        Covode.recordClassIndex(59806);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.b$a */
    public static final class C50645a implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f116979a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f116980b;

        static {
            Covode.recordClassIndex(59807);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f116980b.invoke(exceptionResult);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<EffectCategoryResponse> categoryResponseList;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            ArrayList arrayList = new ArrayList();
            if (!(effectChannelResponse2 == null || (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) == null)) {
                Iterator<T> it = categoryResponseList.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(it.next().getTotalEffects());
                }
            }
            this.f116979a.invoke(arrayList);
        }

        C50645a(AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f116979a = bVar;
            this.f116980b = bVar2;
        }
    }

    public C50644b(AbstractC27255q<AbstractC84398d> qVar, AbstractC27255q<String> qVar2) {
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(qVar2, "");
        this.f116977a = qVar;
        this.f116978b = qVar2;
    }

    /* renamed from: a */
    public final void mo85999a(AbstractC89172b<? super List<? extends Effect>, C89391z> bVar, AbstractC89172b<? super ExceptionResult, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        String b = this.f116978b.mo5560b();
        C89219l.m154716b(b, "");
        this.f116977a.mo5560b().mo78910a(b, true, false, (IFetchEffectChannelListener) new C50645a(bVar, bVar2));
    }
}
