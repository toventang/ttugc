package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel */
public final class ChangeDuetLayoutViewModel extends BaseJediViewModel<ChangeDuetLayoutState> {
    static {
        Covode.recordClassIndex(83119);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ChangeDuetLayoutState(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo111464a(int i) {
        mo33689c(new C70652a(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel$a */
    static final class C70652a extends AbstractC89220m implements AbstractC89172b<ChangeDuetLayoutState, ChangeDuetLayoutState> {

        /* renamed from: a */
        final /* synthetic */ int f158145a;

        static {
            Covode.recordClassIndex(83120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70652a(int i) {
            super(1);
            this.f158145a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChangeDuetLayoutState invoke(ChangeDuetLayoutState changeDuetLayoutState) {
            ChangeDuetLayoutState changeDuetLayoutState2 = changeDuetLayoutState;
            C89219l.m154721d(changeDuetLayoutState2, "");
            return ChangeDuetLayoutState.copy$default(changeDuetLayoutState2, null, new C20391d(Integer.valueOf(this.f158145a)), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel$b */
    static final class C70653b extends AbstractC89220m implements AbstractC89172b<ChangeDuetLayoutState, ChangeDuetLayoutState> {

        /* renamed from: a */
        final /* synthetic */ Effect f158146a;

        static {
            Covode.recordClassIndex(83121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70653b(Effect effect) {
            super(1);
            this.f158146a = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChangeDuetLayoutState invoke(ChangeDuetLayoutState changeDuetLayoutState) {
            ChangeDuetLayoutState changeDuetLayoutState2 = changeDuetLayoutState;
            C89219l.m154721d(changeDuetLayoutState2, "");
            return ChangeDuetLayoutState.copy$default(changeDuetLayoutState2, new C20391d(this.f158146a), null, 2, null);
        }
    }

    /* renamed from: a */
    public final void mo111465a(Effect effect) {
        C89219l.m154721d(effect, "");
        mo33689c(new C70653b(effect));
    }
}
