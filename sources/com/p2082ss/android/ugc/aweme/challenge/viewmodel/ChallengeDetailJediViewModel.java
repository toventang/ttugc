package com.p2082ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.p2446b.C35493a;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel */
public final class ChallengeDetailJediViewModel extends JediViewModel<ChallengeDetailState> {
    static {
        Covode.recordClassIndex(42898);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ ChallengeDetailState mo23027d() {
        return new ChallengeDetailState(null, 1, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel$a */
    public static final class C35674a<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ boolean f84169a;

        /* renamed from: b */
        final /* synthetic */ String f84170b;

        /* renamed from: c */
        final /* synthetic */ int f84171c;

        /* renamed from: d */
        final /* synthetic */ boolean f84172d;

        /* renamed from: e */
        final /* synthetic */ String f84173e;

        static {
            Covode.recordClassIndex(42899);
        }

        C35674a(boolean z, String str, int i, boolean z2, String str2) {
            this.f84169a = z;
            this.f84170b = str;
            this.f84171c = i;
            this.f84172d = z2;
            this.f84173e = str2;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<ChallengeDetail> adVar) {
            ChallengeDetail challengeDetail;
            C89219l.m154721d(adVar, "");
            try {
                if (!this.f84169a) {
                    String str = this.f84170b;
                    C35493a.C35495b a = C35493a.f83716b.mo2091a(str + '&' + this.f84171c + '&' + this.f84172d);
                    if (!(a == null || System.currentTimeMillis() - a.f83722b >= ((long) C35493a.f83715a) || (challengeDetail = a.f83721a) == null)) {
                        adVar.mo142931a(challengeDetail);
                        return;
                    }
                }
                ChallengeDetail a2 = ChallengeApi.m72576a(this.f84170b, this.f84171c, this.f84172d, this.f84173e);
                adVar.mo142931a(a2);
                String str2 = this.f84170b;
                int i = this.f84171c;
                boolean z = this.f84172d;
                C89219l.m154716b(a2, "");
                C89219l.m154721d(a2, "");
                C35493a.f83716b.mo2092a(str2 + '&' + i + '&' + z, new C35493a.C35495b(a2, System.currentTimeMillis()));
            } catch (Throwable th) {
                if (!adVar.isDisposed()) {
                    adVar.mo142932a(th);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel$b */
    public static final class C35675b extends AbstractC89220m implements AbstractC89183m<ChallengeDetailState, AbstractC20362a<? extends ChallengeDetail>, ChallengeDetailState> {

        /* renamed from: a */
        public static final C35675b f84174a = new C35675b();

        static {
            Covode.recordClassIndex(42900);
        }

        C35675b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ ChallengeDetailState invoke(ChallengeDetailState challengeDetailState, AbstractC20362a<? extends ChallengeDetail> aVar) {
            ChallengeDetailState challengeDetailState2 = challengeDetailState;
            AbstractC20362a<? extends ChallengeDetail> aVar2 = aVar;
            C89219l.m154721d(challengeDetailState2, "");
            C89219l.m154721d(aVar2, "");
            return challengeDetailState2.copy(aVar2);
        }
    }

    /* renamed from: a */
    public final void mo62698a(String str, int i, boolean z, boolean z2, String str2) {
        AbstractC88403ab b = AbstractC88403ab.m153596a((AbstractC88407af) new C35674a(z2, str, i, z, str2)).mo142918b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        mo33679a(b, C35675b.f84174a);
    }
}
