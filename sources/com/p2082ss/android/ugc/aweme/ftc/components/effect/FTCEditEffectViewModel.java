package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectViewModel */
public final class FTCEditEffectViewModel extends LifecycleAwareViewModel<FTCEditEffectState> implements AbstractC52098a {
    static {
        Covode.recordClassIndex(61475);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.effect.AbstractC52098a
    /* renamed from: a */
    public final void mo87831a() {
        mo33690d(C52097c.f120016a);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.effect.AbstractC52098a
    /* renamed from: b */
    public final void mo87833b() {
        mo33690d(C52095a.f120014a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FTCEditEffectState(null, null, 3, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.effect.AbstractC52098a
    /* renamed from: a */
    public final void mo87832a(int i) {
        mo33690d(new C52096b(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectViewModel$a */
    static final class C52095a extends AbstractC89220m implements AbstractC89172b<FTCEditEffectState, FTCEditEffectState> {

        /* renamed from: a */
        public static final C52095a f120014a = new C52095a();

        static {
            Covode.recordClassIndex(61476);
        }

        C52095a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditEffectState invoke(FTCEditEffectState fTCEditEffectState) {
            FTCEditEffectState fTCEditEffectState2 = fTCEditEffectState;
            C89219l.m154721d(fTCEditEffectState2, "");
            return FTCEditEffectState.copy$default(fTCEditEffectState2, new AbstractC23517a.C23518a(), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectViewModel$b */
    static final class C52096b extends AbstractC89220m implements AbstractC89172b<FTCEditEffectState, FTCEditEffectState> {

        /* renamed from: a */
        final /* synthetic */ int f120015a;

        static {
            Covode.recordClassIndex(61477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52096b(int i) {
            super(1);
            this.f120015a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditEffectState invoke(FTCEditEffectState fTCEditEffectState) {
            FTCEditEffectState fTCEditEffectState2 = fTCEditEffectState;
            C89219l.m154721d(fTCEditEffectState2, "");
            return FTCEditEffectState.copy$default(fTCEditEffectState2, null, Integer.valueOf(this.f120015a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectViewModel$c */
    static final class C52097c extends AbstractC89220m implements AbstractC89172b<FTCEditEffectState, FTCEditEffectState> {

        /* renamed from: a */
        public static final C52097c f120016a = new C52097c();

        static {
            Covode.recordClassIndex(61478);
        }

        C52097c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditEffectState invoke(FTCEditEffectState fTCEditEffectState) {
            FTCEditEffectState fTCEditEffectState2 = fTCEditEffectState;
            C89219l.m154721d(fTCEditEffectState2, "");
            return FTCEditEffectState.copy$default(fTCEditEffectState2, new AbstractC23517a.C23519b(), null, 2, null);
        }
    }
}
