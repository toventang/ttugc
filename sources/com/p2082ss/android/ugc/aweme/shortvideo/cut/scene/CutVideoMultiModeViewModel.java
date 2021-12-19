package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel */
public final class CutVideoMultiModeViewModel extends BaseJediViewModel<CutVideoMultiModeState> {

    /* renamed from: a */
    public int f156806a = 1;

    /* renamed from: b */
    public AbstractC70298bt f156807b;

    static {
        Covode.recordClassIndex(82559);
    }

    /* renamed from: a */
    public final boolean mo110720a() {
        if (this.f156806a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo110721b() {
        mo33689c(new C70128b());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new CutVideoMultiModeState(null, null, null, 7, null);
    }

    /* renamed from: g */
    public final void mo110722g() {
        mo33689c(new C70127a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel$a */
    public static final class C70127a extends AbstractC89220m implements AbstractC89172b<CutVideoMultiModeState, CutVideoMultiModeState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156808a = true;

        static {
            Covode.recordClassIndex(82560);
        }

        C70127a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoMultiModeState invoke(CutVideoMultiModeState cutVideoMultiModeState) {
            CutVideoMultiModeState cutVideoMultiModeState2 = cutVideoMultiModeState;
            C89219l.m154721d(cutVideoMultiModeState2, "");
            return CutVideoMultiModeState.copy$default(cutVideoMultiModeState2, null, null, new C20521k(this.f156808a), 3, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel$b */
    public static final class C70128b extends AbstractC89220m implements AbstractC89172b<CutVideoMultiModeState, CutVideoMultiModeState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156809a = true;

        static {
            Covode.recordClassIndex(82561);
        }

        C70128b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoMultiModeState invoke(CutVideoMultiModeState cutVideoMultiModeState) {
            CutVideoMultiModeState cutVideoMultiModeState2 = cutVideoMultiModeState;
            C89219l.m154721d(cutVideoMultiModeState2, "");
            return CutVideoMultiModeState.copy$default(cutVideoMultiModeState2, null, new C20521k(this.f156809a), null, 5, null);
        }
    }

    /* renamed from: a */
    public final void mo110719a(ActivityC0945e eVar, boolean z) {
        C89219l.m154721d(eVar, "");
        AbstractC70298bt btVar = this.f156807b;
        if (btVar == null) {
            C89219l.m154710a("stickerPointController");
        }
        btVar.mo110879e();
        JediViewModel a = C20531t.m38716a(eVar).mo33800a(CutVideoEditViewModel.class);
        C89219l.m154716b(a, "");
        CutVideoEditViewModel cutVideoEditViewModel = (CutVideoEditViewModel) a;
        cutVideoEditViewModel.mo110670b(true);
        if (z) {
            cutVideoEditViewModel.mo110667a();
        }
        JediViewModel a2 = C20531t.m38716a(eVar).mo33800a(CutVideoListViewModel.class);
        C89219l.m154716b(a2, "");
        ((CutVideoListViewModel) a2).mo110698b(false);
        AbstractC70298bt btVar2 = this.f156807b;
        if (btVar2 == null) {
            C89219l.m154710a("stickerPointController");
        }
        btVar2.mo110885k().mo110930a(true);
    }
}
