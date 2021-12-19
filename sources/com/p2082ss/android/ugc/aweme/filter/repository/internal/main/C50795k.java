package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1458h.AbstractC20270e;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50747h;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50710a;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50812b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50695c;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.k */
public final class C50795k extends AbstractC20270e<C50710a> implements AbstractC50747h {

    /* renamed from: a */
    final AbstractC27255q<AbstractC84398d> f117233a;

    /* renamed from: b */
    final AbstractC27255q<String> f117234b;

    static {
        Covode.recordClassIndex(59963);
    }

    @Override // com.bytedance.jedi.p1445a.p1458h.AbstractC20266a
    /* renamed from: b */
    public final AbstractC88979t<C50710a> mo33640b() {
        AbstractC88979t<C50710a> a = AbstractC88979t.m154303a(new CallableC50796a(this));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.k$a */
    static final class CallableC50796a<V> implements Callable<AbstractC88984x<? extends C50710a>> {

        /* renamed from: a */
        final /* synthetic */ C50795k f117235a;

        static {
            Covode.recordClassIndex(59964);
        }

        CallableC50796a(C50795k kVar) {
            this.f117235a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ AbstractC88984x<? extends C50710a> call() {
            C50795k kVar = this.f117235a;
            C88958b bVar = new C88958b();
            C89219l.m154716b(bVar, "");
            AbstractC84398d b = kVar.f117233a.mo5560b();
            C89219l.m154716b(b, "");
            String b2 = kVar.f117234b.mo5560b();
            C89219l.m154716b(b2, "");
            C84386a.m145136a(b, b2, new C50797b(bVar));
            AbstractC88979t c = bVar.mo143283c();
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.k$b */
    public static final class C50797b implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ C88958b f117236a;

        static {
            Covode.recordClassIndex(59965);
        }

        C50797b(C88958b bVar) {
            this.f117236a = bVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exc;
            Exception exception;
            if (!(exceptionResult == null || (exception = exceptionResult.getException()) == null)) {
                exception.printStackTrace();
            }
            C88958b bVar = this.f117236a;
            if (exceptionResult == null || (exc = exceptionResult.getException()) == null) {
                exc = new RuntimeException("failed on fetch remote filters, msg : " + exceptionResult + "?.msg, code : " + exceptionResult + "?.errorCode");
            }
            bVar.onError(exc);
            this.f117236a.onComplete();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<EffectCategoryResponse> categoryResponseList;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            ArrayList<C89378p> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!(effectChannelResponse2 == null || (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) == null)) {
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) categoryResponseList, 10));
                for (T t : categoryResponseList) {
                    List<Effect> totalEffects = t.getTotalEffects();
                    ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) totalEffects, 10));
                    Iterator<T> it = totalEffects.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(C50812b.m95166a((Effect) it.next()));
                    }
                    arrayList3.add(C89387v.m154943a(t, arrayList4));
                }
                arrayList.addAll(arrayList3);
                ArrayList arrayList5 = new ArrayList();
                for (C89378p pVar : arrayList) {
                    C89070n.m154535a((Collection) arrayList5, (Iterable) ((List) pVar.getSecond()));
                }
                arrayList2.addAll(arrayList5);
            }
            this.f117236a.onNext(new C50710a(new C50695c(arrayList2, arrayList)));
            this.f117236a.onComplete();
        }
    }

    public C50795k(AbstractC27255q<AbstractC84398d> qVar, AbstractC27255q<String> qVar2) {
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(qVar2, "");
        this.f117233a = qVar;
        this.f117234b = qVar2;
    }
}
