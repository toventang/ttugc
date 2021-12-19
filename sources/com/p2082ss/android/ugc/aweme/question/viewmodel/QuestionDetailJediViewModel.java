package com.p2082ss.android.ugc.aweme.question.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.question.api.C66500a;
import com.p2082ss.android.ugc.aweme.question.api.QuestionApi;
import com.p2082ss.android.ugc.aweme.question.p3659a.C66497a;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel */
public final class QuestionDetailJediViewModel extends JediViewModel<QuestionDetailState> {
    static {
        Covode.recordClassIndex(78121);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ QuestionDetailState mo23027d() {
        return new QuestionDetailState(null, 1, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel$a */
    public static final class C66576a<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ boolean f149688a;

        /* renamed from: b */
        final /* synthetic */ long f149689b;

        static {
            Covode.recordClassIndex(78122);
        }

        C66576a(boolean z, long j) {
            this.f149688a = z;
            this.f149689b = j;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<C66500a> adVar) {
            C66500a aVar;
            C89219l.m154721d(adVar, "");
            try {
                if (!this.f149688a) {
                    C66497a.C66498a a = C66497a.f149485b.mo2091a(String.valueOf(this.f149689b));
                    if (!(a == null || System.currentTimeMillis() - a.f149489b >= ((long) C66497a.f149484a) || (aVar = a.f149488a) == null)) {
                        adVar.mo142931a(aVar);
                        return;
                    }
                }
                C66500a a2 = QuestionApi.m118249a(this.f149689b);
                adVar.mo142931a(a2);
                long j = this.f149689b;
                C89219l.m154716b(a2, "");
                C89219l.m154721d(a2, "");
                C66497a.f149485b.mo2092a(String.valueOf(j), new C66497a.C66498a(a2, System.currentTimeMillis()));
            } catch (Throwable th) {
                if (!adVar.isDisposed()) {
                    adVar.mo142932a(th);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel$b */
    public static final class C66577b extends AbstractC89220m implements AbstractC89183m<QuestionDetailState, AbstractC20362a<? extends C66500a>, QuestionDetailState> {

        /* renamed from: a */
        public static final C66577b f149690a = new C66577b();

        static {
            Covode.recordClassIndex(78123);
        }

        C66577b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailState */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ QuestionDetailState invoke(QuestionDetailState questionDetailState, AbstractC20362a<? extends C66500a> aVar) {
            QuestionDetailState questionDetailState2 = questionDetailState;
            AbstractC20362a<? extends C66500a> aVar2 = aVar;
            C89219l.m154721d(questionDetailState2, "");
            C89219l.m154721d(aVar2, "");
            return questionDetailState2.copy(aVar2);
        }
    }

    /* renamed from: a */
    public final void mo105572a(long j, boolean z) {
        AbstractC88403ab b = AbstractC88403ab.m153596a((AbstractC88407af) new C66576a(z, j)).mo142918b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        mo33679a(b, C66577b.f149690a);
    }
}
