package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20526p;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.util.ArrayList;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel */
public final class ChooseMediaViewModel extends BaseJediViewModel<ChooseMediaState> {

    /* renamed from: a */
    final ArrayList<MvImageChooseAdapter.MyMediaModel> f161361a = new ArrayList<>();

    /* renamed from: b */
    final ArrayList<MvImageChooseAdapter.MyMediaModel> f161362b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<MvImageChooseAdapter.MyMediaModel> f161363c = new ArrayList<>();

    /* renamed from: d */
    int f161364d;

    static {
        Covode.recordClassIndex(84648);
    }

    /* renamed from: a */
    public final void mo114217a() {
        mo33689c(C72011f.f161372a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ChooseMediaState(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048575, null);
    }

    /* renamed from: a */
    public final void mo114219a(ClosingChooseMediaPageState closingChooseMediaPageState) {
        C89219l.m154721d(closingChooseMediaPageState, "");
        mo33689c(new C72018m(closingChooseMediaPageState));
    }

    /* renamed from: b */
    public final void mo114226b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        C89219l.m154721d(myMediaModel, "");
        mo33689c(new C72022q(myMediaModel));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$a */
    public static final class C72006a extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        public static final C72006a f161365a = new C72006a();

        static {
            Covode.recordClassIndex(84649);
        }

        C72006a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, new C20526p(), null, 786431, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$c */
    public static final class C72008c extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MusicModel f161367a;

        /* renamed from: b */
        final /* synthetic */ String f161368b;

        static {
            Covode.recordClassIndex(84651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72008c(MusicModel musicModel, String str) {
            super(1);
            this.f161367a = musicModel;
            this.f161368b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, chooseMediaState2.getLastPreMusicState().copy(this.f161367a, this.f161368b), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048559, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$d */
    public static final class C72009d extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MusicModel f161369a;

        /* renamed from: b */
        final /* synthetic */ String f161370b;

        static {
            Covode.recordClassIndex(84652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72009d(MusicModel musicModel, String str) {
            super(1);
            this.f161369a = musicModel;
            this.f161370b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, chooseMediaState2.getPreMusicState().copy(this.f161369a, this.f161370b), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048559, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$j */
    static final class C72015j extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        public static final C72015j f161377a = new C72015j();

        static {
            Covode.recordClassIndex(84658);
        }

        C72015j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            C89219l.m154721d(chooseMediaState, "");
            return new ChooseMediaState(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048575, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$l */
    public static final class C72017l extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ boolean f161379a;

        static {
            Covode.recordClassIndex(84660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72017l(boolean z) {
            super(1);
            this.f161379a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, this.f161379a, null, null, null, null, null, null, null, 1044479, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$m */
    public static final class C72018m extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ ClosingChooseMediaPageState f161380a;

        static {
            Covode.recordClassIndex(84661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72018m(ClosingChooseMediaPageState closingChooseMediaPageState) {
            super(1);
            this.f161380a = closingChooseMediaPageState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, this.f161380a, null, null, null, false, null, null, null, null, null, null, null, 1048319, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$o */
    public static final class C72020o extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ OpeningChooseMediaPageState f161382a;

        static {
            Covode.recordClassIndex(84663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72020o(OpeningChooseMediaPageState openingChooseMediaPageState) {
            super(1);
            this.f161382a = openingChooseMediaPageState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, this.f161382a, null, null, null, null, false, null, null, null, null, null, null, null, 1048447, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$r */
    static final class C72023r extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f161385a;

        /* renamed from: b */
        final /* synthetic */ boolean f161386b;

        static {
            Covode.recordClassIndex(84666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72023r(ArrayList arrayList, boolean z) {
            super(1);
            this.f161385a = arrayList;
            this.f161386b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, new C72059ad(this.f161385a, this.f161386b), null, null, false, null, null, null, null, null, null, null, 1048063, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$s */
    static final class C72024s extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f161387a;

        /* renamed from: b */
        final /* synthetic */ boolean f161388b;

        static {
            Covode.recordClassIndex(84667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72024s(ArrayList arrayList, boolean z) {
            super(1);
            this.f161387a = arrayList;
            this.f161388b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, new C72059ad(this.f161387a, this.f161388b), null, false, null, null, null, null, null, null, null, 1047551, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$t */
    static final class C72025t extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ String f161389a;

        static {
            Covode.recordClassIndex(84668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72025t(String str) {
            super(1);
            this.f161389a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, this.f161389a, 524287, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$u */
    static final class C72026u extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f161390a;

        /* renamed from: b */
        final /* synthetic */ boolean f161391b;

        static {
            Covode.recordClassIndex(84669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72026u(ArrayList arrayList, boolean z) {
            super(1);
            this.f161390a = arrayList;
            this.f161391b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, new C72059ad(this.f161390a, this.f161391b), false, null, null, null, null, null, null, null, 1046527, null);
        }
    }

    /* renamed from: a */
    public final void mo114220a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        mo33689c(new C72013h(myMediaModel));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo114227b(ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList) {
        mo33689c(new C72019n(arrayList));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$b */
    public static final class C72007b extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161366a;

        static {
            Covode.recordClassIndex(84650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72007b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.f161366a = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, new MediaState(this.f161366a, chooseMediaState2.getPreviewNextBtnMediaState().getValue() + 1), null, null, 917503, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$e */
    public static final class C72010e extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161371a;

        static {
            Covode.recordClassIndex(84653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72010e(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.f161371a = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, chooseMediaState2.getPreviewMediaState().copy(this.f161371a, chooseMediaState2.getPreviewMediaState().getValue() + 1), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048567, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$f */
    public static final class C72011f extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        public static final C72011f f161372a = new C72011f();

        static {
            Covode.recordClassIndex(84654);
        }

        C72011f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, chooseMediaState2.getMediaListState().copy(chooseMediaState2.getMediaListState().getMediaList(), chooseMediaState2.getMediaListState().getValue() + 1), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048574, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$g */
    public static final class C72012g extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161373a;

        static {
            Covode.recordClassIndex(84655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72012g(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.f161373a = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, new MediaState(this.f161373a, chooseMediaState2.getPreviewDockerAddMediaState().getValue() + 1), null, null, null, 983039, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$h */
    static final class C72013h extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161374a;

        static {
            Covode.recordClassIndex(84656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72013h(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.f161374a = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, new MediaState(this.f161374a, chooseMediaState2.getPreviewDockerDelMediaState().getValue() + 1), null, null, null, null, 1015807, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$i */
    public static final class C72014i extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ int f161375a;

        /* renamed from: b */
        final /* synthetic */ int f161376b;

        static {
            Covode.recordClassIndex(84657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72014i(int i, int i2) {
            super(1);
            this.f161375a = i;
            this.f161376b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, new PreviewSwapState(Integer.valueOf(this.f161375a), Integer.valueOf(this.f161376b), chooseMediaState2.getPreviewSwapState().getValue() + 1), null, null, null, null, null, 1032191, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$k */
    public static final class C72016k extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161378a;

        static {
            Covode.recordClassIndex(84659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72016k(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.f161378a = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, chooseMediaState2.getSelectMediaState().copy(this.f161378a, chooseMediaState2.getSelectMediaState().getValue() + 1), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048573, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$n */
    public static final class C72019n extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f161381a;

        static {
            Covode.recordClassIndex(84662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72019n(ArrayList arrayList) {
            super(1);
            this.f161381a = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            ArrayList<MvImageChooseAdapter.MyMediaModel> mediaList = chooseMediaState2.getMediaListState().getMediaList();
            mediaList.clear();
            int i = 0;
            for (MvImageChooseAdapter.MyMediaModel myMediaModel : this.f161381a) {
                myMediaModel.f161472w = i;
                i++;
            }
            mediaList.addAll(this.f161381a);
            return ChooseMediaState.copy$default(chooseMediaState2, chooseMediaState2.getMediaListState().copy(mediaList, chooseMediaState2.getMediaListState().getValue() + 1), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048574, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$p */
    public static final class C72021p extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f161383a;

        static {
            Covode.recordClassIndex(84664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72021p(ArrayList arrayList) {
            super(1);
            this.f161383a = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, new MediaListState(this.f161383a, chooseMediaState2.getPreviewDockerInitMediaList().getValue() + 1), null, null, null, null, null, null, 1040383, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel$q */
    static final class C72022q extends AbstractC89220m implements AbstractC89172b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a */
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel f161384a;

        static {
            Covode.recordClassIndex(84665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72022q(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.f161384a = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            C89219l.m154721d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, chooseMediaState2.getUnSelectMediaState().copy(this.f161384a, chooseMediaState2.getUnSelectMediaState().getValue() + 1), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 1048571, null);
        }
    }

    /* renamed from: a */
    public final void mo114221a(OpeningChooseMediaPageState openingChooseMediaPageState) {
        C89219l.m154721d(openingChooseMediaPageState, "");
        mo33689c(new C72020o(openingChooseMediaPageState));
    }

    /* renamed from: a */
    public final void mo114222a(String str) {
        C89219l.m154721d(str, "");
        mo33689c(new C72025t(str));
    }

    /* renamed from: a */
    public final void mo114223a(ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList) {
        C89219l.m154721d(arrayList, "");
        mo33689c(new C72021p(arrayList));
    }

    /* renamed from: a */
    public final void mo114224a(boolean z) {
        mo33689c(new C72017l(z));
    }

    /* renamed from: a */
    public final void mo114218a(MusicModel musicModel, String str) {
        mo33689c(new C72009d(musicModel, str));
    }

    /* renamed from: b */
    public final void mo114225b(MusicModel musicModel, String str) {
        mo33689c(new C72008c(musicModel, str));
    }
}
