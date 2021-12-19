package com.p2082ss.android.ugc.aweme.ftc.components.cutmusic;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import p4600h.C89386u;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel */
public final class FTCEditMusicCutViewModel extends LifecycleAwareViewModel<FTCEditMusicCutState> implements AbstractC52071a {
    static {
        Covode.recordClassIndex(61446);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.AbstractC52071a
    /* renamed from: a */
    public final void mo87803a() {
        mo33689c(C52069b.f119951a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FTCEditMusicCutState(null, null, null, 7, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.AbstractC52071a
    /* renamed from: a */
    public final void mo87804a(int i) {
        mo33689c(new C52068a(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel$a */
    static final class C52068a extends AbstractC89220m implements AbstractC89172b<FTCEditMusicCutState, FTCEditMusicCutState> {

        /* renamed from: a */
        final /* synthetic */ int f119950a;

        static {
            Covode.recordClassIndex(61447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52068a(int i) {
            super(1);
            this.f119950a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditMusicCutState invoke(FTCEditMusicCutState fTCEditMusicCutState) {
            FTCEditMusicCutState fTCEditMusicCutState2 = fTCEditMusicCutState;
            C89219l.m154721d(fTCEditMusicCutState2, "");
            return FTCEditMusicCutState.copy$default(fTCEditMusicCutState2, null, Integer.valueOf(this.f119950a), null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel$b */
    static final class C52069b extends AbstractC89220m implements AbstractC89172b<FTCEditMusicCutState, FTCEditMusicCutState> {

        /* renamed from: a */
        public static final C52069b f119951a = new C52069b();

        static {
            Covode.recordClassIndex(61448);
        }

        C52069b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditMusicCutState invoke(FTCEditMusicCutState fTCEditMusicCutState) {
            FTCEditMusicCutState fTCEditMusicCutState2 = fTCEditMusicCutState;
            C89219l.m154721d(fTCEditMusicCutState2, "");
            return FTCEditMusicCutState.copy$default(fTCEditMusicCutState2, null, null, new AbstractC23517a.C23519b(), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel$c */
    static final class C52070c extends AbstractC89220m implements AbstractC89172b<FTCEditMusicCutState, FTCEditMusicCutState> {

        /* renamed from: a */
        final /* synthetic */ C70625d f119952a;

        /* renamed from: b */
        final /* synthetic */ int f119953b;

        /* renamed from: c */
        final /* synthetic */ int f119954c = 0;

        static {
            Covode.recordClassIndex(61449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52070c(C70625d dVar, int i) {
            super(1);
            this.f119952a = dVar;
            this.f119953b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditMusicCutState invoke(FTCEditMusicCutState fTCEditMusicCutState) {
            FTCEditMusicCutState fTCEditMusicCutState2 = fTCEditMusicCutState;
            C89219l.m154721d(fTCEditMusicCutState2, "");
            return FTCEditMusicCutState.copy$default(fTCEditMusicCutState2, new C89386u(this.f119952a, Integer.valueOf(this.f119953b), Integer.valueOf(this.f119954c)), null, null, 6, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.AbstractC52071a
    /* renamed from: a */
    public final void mo87805a(C70625d dVar, int i) {
        mo33689c(new C52070c(dVar, i));
    }
}
