package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel */
public final class CutVideoBottomBarViewModel extends BaseJediViewModel<CutVideoBottomBarState> {

    /* renamed from: a */
    private final AbstractC89244h f156770a = C89250i.m154773a((AbstractC89171a) C70099a.f156772a);

    /* renamed from: b */
    private final AbstractC89244h f156771b = C89250i.m154773a((AbstractC89171a) C70100b.f156773a);

    static {
        Covode.recordClassIndex(82523);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1213t<Float> mo110644a() {
        return (C1213t) this.f156770a.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1213t<Boolean> mo110647b() {
        return (C1213t) this.f156771b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$a */
    static final class C70099a extends AbstractC89220m implements AbstractC89171a<C1213t<Float>> {

        /* renamed from: a */
        public static final C70099a f156772a = new C70099a();

        static {
            Covode.recordClassIndex(82524);
        }

        C70099a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Float> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$b */
    static final class C70100b extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C70100b f156773a = new C70100b();

        static {
            Covode.recordClassIndex(82525);
        }

        C70100b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new CutVideoBottomBarState(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: c */
    public final void mo110650c(boolean z) {
        mo33689c(new C70104f(z));
    }

    /* renamed from: d */
    public final void mo110651d(boolean z) {
        mo33689c(new C70102d(z));
    }

    /* renamed from: e */
    public final void mo110652e(boolean z) {
        mo110647b().setValue(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$c */
    static final class C70101c extends AbstractC89220m implements AbstractC89172b<CutVideoBottomBarState, CutVideoBottomBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156774a;

        static {
            Covode.recordClassIndex(82526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70101c(boolean z) {
            super(1);
            this.f156774a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoBottomBarState invoke(CutVideoBottomBarState cutVideoBottomBarState) {
            CutVideoBottomBarState cutVideoBottomBarState2 = cutVideoBottomBarState;
            C89219l.m154721d(cutVideoBottomBarState2, "");
            return CutVideoBottomBarState.copy$default(cutVideoBottomBarState2, null, null, null, null, null, null, null, Boolean.valueOf(this.f156774a), 127, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$d */
    static final class C70102d extends AbstractC89220m implements AbstractC89172b<CutVideoBottomBarState, CutVideoBottomBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156775a;

        static {
            Covode.recordClassIndex(82527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70102d(boolean z) {
            super(1);
            this.f156775a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoBottomBarState invoke(CutVideoBottomBarState cutVideoBottomBarState) {
            CutVideoBottomBarState cutVideoBottomBarState2 = cutVideoBottomBarState;
            C89219l.m154721d(cutVideoBottomBarState2, "");
            return CutVideoBottomBarState.copy$default(cutVideoBottomBarState2, null, null, null, null, Boolean.valueOf(this.f156775a), null, null, null, 239, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$e */
    static final class C70103e extends AbstractC89220m implements AbstractC89172b<CutVideoBottomBarState, CutVideoBottomBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156776a;

        static {
            Covode.recordClassIndex(82528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70103e(boolean z) {
            super(1);
            this.f156776a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoBottomBarState invoke(CutVideoBottomBarState cutVideoBottomBarState) {
            CutVideoBottomBarState cutVideoBottomBarState2 = cutVideoBottomBarState;
            C89219l.m154721d(cutVideoBottomBarState2, "");
            return CutVideoBottomBarState.copy$default(cutVideoBottomBarState2, null, null, null, null, null, Boolean.valueOf(this.f156776a), null, null, 223, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$f */
    static final class C70104f extends AbstractC89220m implements AbstractC89172b<CutVideoBottomBarState, CutVideoBottomBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156777a;

        static {
            Covode.recordClassIndex(82529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70104f(boolean z) {
            super(1);
            this.f156777a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoBottomBarState invoke(CutVideoBottomBarState cutVideoBottomBarState) {
            CutVideoBottomBarState cutVideoBottomBarState2 = cutVideoBottomBarState;
            C89219l.m154721d(cutVideoBottomBarState2, "");
            return CutVideoBottomBarState.copy$default(cutVideoBottomBarState2, null, null, null, Boolean.valueOf(this.f156777a), null, null, null, null, 247, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$g */
    static final class C70105g extends AbstractC89220m implements AbstractC89172b<CutVideoBottomBarState, CutVideoBottomBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156778a;

        static {
            Covode.recordClassIndex(82530);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70105g(boolean z) {
            super(1);
            this.f156778a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoBottomBarState invoke(CutVideoBottomBarState cutVideoBottomBarState) {
            CutVideoBottomBarState cutVideoBottomBarState2 = cutVideoBottomBarState;
            C89219l.m154721d(cutVideoBottomBarState2, "");
            return CutVideoBottomBarState.copy$default(cutVideoBottomBarState2, null, null, Boolean.valueOf(this.f156778a), null, null, null, null, null, 251, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$h */
    static final class C70106h extends AbstractC89220m implements AbstractC89172b<CutVideoBottomBarState, CutVideoBottomBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156779a;

        static {
            Covode.recordClassIndex(82531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70106h(boolean z) {
            super(1);
            this.f156779a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoBottomBarState invoke(CutVideoBottomBarState cutVideoBottomBarState) {
            CutVideoBottomBarState cutVideoBottomBarState2 = cutVideoBottomBarState;
            C89219l.m154721d(cutVideoBottomBarState2, "");
            return CutVideoBottomBarState.copy$default(cutVideoBottomBarState2, null, null, null, null, null, null, Boolean.valueOf(this.f156779a), null, 191, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$i */
    static final class C70107i extends AbstractC89220m implements AbstractC89172b<CutVideoBottomBarState, CutVideoBottomBarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156780a;

        static {
            Covode.recordClassIndex(82532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70107i(boolean z) {
            super(1);
            this.f156780a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoBottomBarState invoke(CutVideoBottomBarState cutVideoBottomBarState) {
            CutVideoBottomBarState cutVideoBottomBarState2 = cutVideoBottomBarState;
            C89219l.m154721d(cutVideoBottomBarState2, "");
            return CutVideoBottomBarState.copy$default(cutVideoBottomBarState2, null, Boolean.valueOf(this.f156780a), null, null, null, null, null, null, 253, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel$j */
    static final class C70108j extends AbstractC89220m implements AbstractC89172b<CutVideoBottomBarState, CutVideoBottomBarState> {

        /* renamed from: a */
        final /* synthetic */ float f156781a;

        static {
            Covode.recordClassIndex(82533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70108j(float f) {
            super(1);
            this.f156781a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoBottomBarState invoke(CutVideoBottomBarState cutVideoBottomBarState) {
            CutVideoBottomBarState cutVideoBottomBarState2 = cutVideoBottomBarState;
            C89219l.m154721d(cutVideoBottomBarState2, "");
            return CutVideoBottomBarState.copy$default(cutVideoBottomBarState2, Float.valueOf(this.f156781a), null, null, null, null, null, null, null, 254, null);
        }
    }

    /* renamed from: a */
    public final void mo110645a(float f) {
        mo33689c(new C70108j(f));
    }

    /* renamed from: b */
    public final void mo110648b(float f) {
        mo110644a().setValue(Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo110646a(boolean z) {
        mo33689c(new C70107i(z));
    }

    /* renamed from: b */
    public final void mo110649b(boolean z) {
        mo33689c(new C70105g(z));
    }
}
