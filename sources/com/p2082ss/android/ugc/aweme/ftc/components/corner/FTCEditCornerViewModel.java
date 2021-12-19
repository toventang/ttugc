package com.p2082ss.android.ugc.aweme.ftc.components.corner;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel */
public final class FTCEditCornerViewModel extends LifecycleAwareViewModel<FTCEditCornerState> implements AbstractC52056a {
    static {
        Covode.recordClassIndex(61428);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.corner.AbstractC52056a
    /* renamed from: a */
    public final void mo87792a() {
        mo33689c(C52055d.f119931a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FTCEditCornerState(null, null, null, null, 15, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.corner.AbstractC52056a
    /* renamed from: a */
    public final void mo87793a(boolean z) {
        mo33689c(new C52053b(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel$a */
    public static final class C52052a extends AbstractC89220m implements AbstractC89172b<FTCEditCornerState, FTCEditCornerState> {

        /* renamed from: a */
        final /* synthetic */ int f119928a;

        static {
            Covode.recordClassIndex(61429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52052a(int i) {
            super(1);
            this.f119928a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditCornerState invoke(FTCEditCornerState fTCEditCornerState) {
            FTCEditCornerState fTCEditCornerState2 = fTCEditCornerState;
            C89219l.m154721d(fTCEditCornerState2, "");
            return FTCEditCornerState.copy$default(fTCEditCornerState2, null, null, Integer.valueOf(this.f119928a), null, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel$b */
    static final class C52053b extends AbstractC89220m implements AbstractC89172b<FTCEditCornerState, FTCEditCornerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f119929a;

        static {
            Covode.recordClassIndex(61430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52053b(boolean z) {
            super(1);
            this.f119929a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditCornerState invoke(FTCEditCornerState fTCEditCornerState) {
            FTCEditCornerState fTCEditCornerState2 = fTCEditCornerState;
            C89219l.m154721d(fTCEditCornerState2, "");
            return FTCEditCornerState.copy$default(fTCEditCornerState2, Boolean.valueOf(this.f119929a), null, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel$c */
    public static final class C52054c extends AbstractC89220m implements AbstractC89172b<FTCEditCornerState, FTCEditCornerState> {

        /* renamed from: a */
        final /* synthetic */ int f119930a;

        static {
            Covode.recordClassIndex(61431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52054c(int i) {
            super(1);
            this.f119930a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditCornerState invoke(FTCEditCornerState fTCEditCornerState) {
            FTCEditCornerState fTCEditCornerState2 = fTCEditCornerState;
            C89219l.m154721d(fTCEditCornerState2, "");
            return FTCEditCornerState.copy$default(fTCEditCornerState2, null, Integer.valueOf(this.f119930a), null, null, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel$d */
    static final class C52055d extends AbstractC89220m implements AbstractC89172b<FTCEditCornerState, FTCEditCornerState> {

        /* renamed from: a */
        public static final C52055d f119931a = new C52055d();

        static {
            Covode.recordClassIndex(61432);
        }

        C52055d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditCornerState invoke(FTCEditCornerState fTCEditCornerState) {
            FTCEditCornerState fTCEditCornerState2 = fTCEditCornerState;
            C89219l.m154721d(fTCEditCornerState2, "");
            return FTCEditCornerState.copy$default(fTCEditCornerState2, null, null, null, new AbstractC23517a.C23519b(), 7, null);
        }
    }
}
