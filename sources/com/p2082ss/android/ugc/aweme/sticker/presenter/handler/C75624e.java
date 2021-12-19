package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.e */
public final class C75624e extends AbstractC75614b {

    /* renamed from: a */
    public List<? extends AVChallenge> f170035a;

    /* renamed from: b */
    private final AbstractC89183m<List<String>, AbstractC89172b<? super List<? extends AVChallenge>, C89391z>, C89391z> f170036b;

    static {
        Covode.recordClassIndex(88555);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f170035a = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.e$a */
    static final class C75625a extends AbstractC89220m implements AbstractC89172b<List<? extends AVChallenge>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75624e f170037a;

        static {
            Covode.recordClassIndex(88556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75625a(C75624e eVar) {
            super(1);
            this.f170037a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(List<? extends AVChallenge> list) {
            this.f170037a.f170035a = list;
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super java.util.List<java.lang.String>, ? super h.f.a.b<? super java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.AVChallenge>, h.z>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75624e(AbstractC89183m<? super List<String>, ? super AbstractC89172b<? super List<? extends AVChallenge>, C89391z>, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        this.f170036b = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        Effect effect = aVar.f170022a;
        this.f170035a = null;
        List<String> challenge = effect.getChallenge();
        if (challenge != null) {
            this.f170036b.invoke(challenge, new C75625a(this));
        }
    }
}
