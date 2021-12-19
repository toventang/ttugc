package com.p2082ss.android.ugc.aweme.ftc.components.volume;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel */
public final class FTCEditVolumeViewModel extends LifecycleAwareViewModel<FTCEditVolumeState> implements AbstractC52439a {
    static {
        Covode.recordClassIndex(61829);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.volume.AbstractC52439a
    /* renamed from: a */
    public final void mo88203a() {
        mo33689c(C52438c.f120766a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FTCEditVolumeState(null, null, null, null, 15, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel$a */
    static final class C52436a extends AbstractC89220m implements AbstractC89172b<FTCEditVolumeState, FTCEditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ String f120764a;

        static {
            Covode.recordClassIndex(61830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52436a(String str) {
            super(1);
            this.f120764a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditVolumeState invoke(FTCEditVolumeState fTCEditVolumeState) {
            FTCEditVolumeState fTCEditVolumeState2 = fTCEditVolumeState;
            C89219l.m154721d(fTCEditVolumeState2, "");
            return FTCEditVolumeState.copy$default(fTCEditVolumeState2, this.f120764a, null, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel$b */
    static final class C52437b extends AbstractC89220m implements AbstractC89172b<FTCEditVolumeState, FTCEditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ String f120765a;

        static {
            Covode.recordClassIndex(61831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52437b(String str) {
            super(1);
            this.f120765a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditVolumeState invoke(FTCEditVolumeState fTCEditVolumeState) {
            FTCEditVolumeState fTCEditVolumeState2 = fTCEditVolumeState;
            C89219l.m154721d(fTCEditVolumeState2, "");
            return FTCEditVolumeState.copy$default(fTCEditVolumeState2, null, this.f120765a, null, null, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel$c */
    static final class C52438c extends AbstractC89220m implements AbstractC89172b<FTCEditVolumeState, FTCEditVolumeState> {

        /* renamed from: a */
        public static final C52438c f120766a = new C52438c();

        static {
            Covode.recordClassIndex(61832);
        }

        C52438c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditVolumeState invoke(FTCEditVolumeState fTCEditVolumeState) {
            FTCEditVolumeState fTCEditVolumeState2 = fTCEditVolumeState;
            C89219l.m154721d(fTCEditVolumeState2, "");
            return FTCEditVolumeState.copy$default(fTCEditVolumeState2, null, null, null, new AbstractC23517a.C23519b(), 7, null);
        }
    }
}
