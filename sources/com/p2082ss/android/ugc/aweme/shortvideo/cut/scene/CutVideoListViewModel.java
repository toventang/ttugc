package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel */
public final class CutVideoListViewModel extends BaseJediViewModel<CutVideoListState> {

    /* renamed from: a */
    public int f156788a;

    /* renamed from: b */
    public int f156789b;

    /* renamed from: c */
    public AbstractC70298bt f156790c;

    /* renamed from: d */
    private final AbstractC89244h f156791d = C89250i.m154773a((AbstractC89171a) C70118e.f156796a);

    static {
        Covode.recordClassIndex(82542);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C1213t<Boolean> mo110700g() {
        return (C1213t) this.f156791d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$e */
    static final class C70118e extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C70118e f156796a = new C70118e();

        static {
            Covode.recordClassIndex(82547);
        }

        C70118e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$k */
    public static final class C70124k implements AbstractC70440f {

        /* renamed from: a */
        final /* synthetic */ CutVideoStickerPointMusicViewModel f156802a;

        static {
            Covode.recordClassIndex(82553);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
            this.f156802a.mo110779a(false);
        }

        C70124k(CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel) {
            this.f156802a = cutVideoStickerPointMusicViewModel;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
            this.f156802a.mo110779a(false);
        }
    }

    /* renamed from: a */
    public final void mo110695a() {
        mo33689c(new C70122i());
    }

    /* renamed from: b */
    public final void mo110697b() {
        mo33689c(new C70116c());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new CutVideoListState(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* renamed from: c */
    public final void mo110699c(boolean z) {
        mo33689c(new C70114a(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$a */
    static final class C70114a extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156792a;

        static {
            Covode.recordClassIndex(82543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70114a(boolean z) {
            super(1);
            this.f156792a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, null, null, null, null, new C20521k(this.f156792a), 511, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$b */
    static final class C70115b extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        public static final C70115b f156793a = new C70115b();

        static {
            Covode.recordClassIndex(82544);
        }

        C70115b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, new C20526p(), null, null, null, null, null, null, null, null, null, 1022, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$c */
    static final class C70116c extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156794a = true;

        static {
            Covode.recordClassIndex(82545);
        }

        C70116c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, new C20521k(this.f156794a), null, null, null, null, 991, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$d */
    static final class C70117d extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156795a;

        static {
            Covode.recordClassIndex(82546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70117d(boolean z) {
            super(1);
            this.f156795a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, null, null, new C20521k(this.f156795a), null, null, 895, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$f */
    static final class C70119f extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156797a;

        static {
            Covode.recordClassIndex(82548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70119f(boolean z) {
            super(1);
            this.f156797a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, Boolean.valueOf(this.f156797a), null, null, null, null, null, null, 1015, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$g */
    static final class C70120g extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156798a;

        static {
            Covode.recordClassIndex(82549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70120g(boolean z) {
            super(1);
            this.f156798a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, Boolean.valueOf(this.f156798a), null, null, null, null, null, null, null, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$h */
    static final class C70121h extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156799a;

        static {
            Covode.recordClassIndex(82550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70121h(boolean z) {
            super(1);
            this.f156799a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f156799a), null, 767, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$i */
    static final class C70122i extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156800a = true;

        static {
            Covode.recordClassIndex(82551);
        }

        C70122i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, new C20521k(this.f156800a), null, null, null, null, null, 1007, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$j */
    static final class C70123j extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156801a;

        static {
            Covode.recordClassIndex(82552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70123j(boolean z) {
            super(1);
            this.f156801a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, null, null, null, null, null, new C20521k(this.f156801a), null, null, null, 959, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$l */
    static final class C70125l extends AbstractC89220m implements AbstractC89172b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156803a;

        static {
            Covode.recordClassIndex(82554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70125l(boolean z) {
            super(1);
            this.f156803a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoListState invoke(CutVideoListState cutVideoListState) {
            CutVideoListState cutVideoListState2 = cutVideoListState;
            C89219l.m154721d(cutVideoListState2, "");
            return CutVideoListState.copy$default(cutVideoListState2, null, new C20521k(this.f156803a), null, null, null, null, null, null, null, null, 1021, null);
        }
    }

    /* renamed from: a */
    public final void mo110696a(boolean z) {
        mo33689c(new C70121h(z));
    }

    /* renamed from: b */
    public final void mo110698b(boolean z) {
        mo110700g().setValue(Boolean.valueOf(z));
    }
}
