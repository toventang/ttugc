package com.p2082ss.android.ugc.aweme.ftc.components.sticker.text;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ViewGroup;
import androidx.lifecycle.C1213t;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.compile.AbstractC45860c;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45858a;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45859b;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45865h;
import com.p2082ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel */
public final class FTCEditTextStickerViewModel extends LifecycleAwareViewModel<FTCEditTextStickerViewState> implements AbstractC45898d, AbstractC52309a {

    /* renamed from: g */
    public static final C52288a f120486g = new C52288a((byte) 0);

    /* renamed from: a */
    public final List<C46239q> f120487a = new ArrayList();

    /* renamed from: b */
    public boolean f120488b = true;

    /* renamed from: c */
    public boolean f120489c;

    /* renamed from: d */
    final C2563k<C89391z> f120490d = new C2563k<>();

    /* renamed from: e */
    final C2563k<C89378p<Boolean, Boolean>> f120491e = new C2563k<>();

    /* renamed from: f */
    final C2563k<Boolean> f120492f = new C2563k<>();

    /* renamed from: l */
    private C1213t<Boolean> f120493l;

    /* renamed from: m */
    private final AbstractC89244h f120494m = C89250i.m154773a((AbstractC89171a) C52290c.f120499a);

    /* renamed from: n */
    private C89378p<Integer, Integer> f120495n;

    /* renamed from: o */
    private final AbstractC89244h f120496o = C89250i.m154773a((AbstractC89171a) C52292e.f120504a);

    static {
        Covode.recordClassIndex(61676);
    }

    /* renamed from: o */
    public final C1213t<C89378p<Float, Boolean>> mo88064o() {
        return (C1213t) this.f120494m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$a */
    public static final class C52288a {
        static {
            Covode.recordClassIndex(61677);
        }

        private C52288a() {
        }

        public /* synthetic */ C52288a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final C2563k<C89391z> mo88039a() {
        return this.f120490d;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: b */
    public final C2563k<C89378p<Boolean, Boolean>> mo88051b() {
        return this.f120491e;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: c */
    public final C2563k<Boolean> mo88053c() {
        return this.f120492f;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: m */
    public final AbstractC45898d mo88062m() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: n */
    public final List<C46239q> mo88063n() {
        return this.f120487a;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final void mo88050a(boolean z) {
        mo33689c(new C52299l(z));
        C1213t<Boolean> tVar = this.f120493l;
        if (tVar != null && (!C89219l.m154714a(tVar.getValue(), Boolean.valueOf(z)))) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d
    /* renamed from: a */
    public final boolean mo77274a(RectF rectF) {
        C89219l.m154721d(rectF, "");
        for (C46239q qVar : this.f120487a) {
            PointF[] anglePointList = qVar.getAnglePointList();
            if (!(anglePointList == null || anglePointList.length == 0)) {
                RectF a = C45883b.m88523a(anglePointList);
                C89219l.m154716b(a, "");
                if (a.top < rectF.top || a.bottom > rectF.bottom) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final void mo88049a(C89378p<Integer, Integer> pVar) {
        if (this.f120495n == null) {
            this.f120495n = pVar;
        }
        mo33689c(new C52304q(pVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$c */
    static final class C52290c extends AbstractC89220m implements AbstractC89171a<C1213t<C89378p<? extends Float, ? extends Boolean>>> {

        /* renamed from: a */
        public static final C52290c f120499a = new C52290c();

        static {
            Covode.recordClassIndex(61679);
        }

        C52290c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89378p<? extends Float, ? extends Boolean>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$e */
    static final class C52292e extends AbstractC89220m implements AbstractC89171a<C45865h> {

        /* renamed from: a */
        public static final C52292e f120504a = new C52292e();

        static {
            Covode.recordClassIndex(61681);
        }

        C52292e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C45865h invoke() {
            return new C45865h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: e */
    public final void mo88054e() {
        mo33690d(C52306s.f120518a);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: g */
    public final void mo88056g() {
        mo33689c(C52297j.f120509a);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: h */
    public final void mo88057h() {
        mo33689c(C52308u.f120520a);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: j */
    public final void mo88059j() {
        mo33689c(C52298k.f120510a);
    }

    /* renamed from: q */
    public final boolean mo88066q() {
        return this.f120487a.isEmpty();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: i */
    public final void mo88058i() {
        mo33689c(new C52307t());
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: l */
    public final boolean mo88061l() {
        if (!mo88066q()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FTCEditTextStickerViewState(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: f */
    public final boolean mo88055f() {
        Boolean value;
        C1213t<Boolean> tVar = this.f120493l;
        if (tVar == null || (value = tVar.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: k */
    public final boolean mo88060k() {
        mo33689c(C52293f.f120505a);
        boolean z = false;
        for (C46239q qVar : this.f120487a) {
            if (qVar.mo78550e()) {
                qVar.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: p */
    public final int mo88065p() {
        if (this.f120487a.isEmpty()) {
            return 0;
        }
        int size = this.f120487a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            List<TextStickerTextWrap> textWrapList = this.f120487a.get(i2).getTextWrapList();
            C89219l.m154716b(textWrapList, "");
            for (TextStickerTextWrap textStickerTextWrap : textWrapList) {
                if (textStickerTextWrap != null) {
                    i += textStickerTextWrap.safeStrPair().f107314b.size();
                }
            }
        }
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final void mo88041a(C1213t<Boolean> tVar) {
        C89219l.m154721d(tVar, "");
        this.f120493l = tVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final void mo88042a(AbstractC45872e eVar) {
        mo33689c(new C52305r(eVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$d */
    static final class C52291d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ FTCEditTextStickerViewModel f120500a;

        /* renamed from: b */
        final /* synthetic */ List f120501b;

        /* renamed from: c */
        final /* synthetic */ C46239q f120502c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f120503d;

        static {
            Covode.recordClassIndex(61680);
        }

        C52291d(FTCEditTextStickerViewModel fTCEditTextStickerViewModel, List list, C46239q qVar, ViewGroup viewGroup) {
            this.f120500a = fTCEditTextStickerViewModel;
            this.f120501b = list;
            this.f120502c = qVar;
            this.f120503d = viewGroup;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            if (iVar.mo5545d() != null) {
                return new TextStickerCompileResult(this.f120502c.mo78410b(), (C45859b) iVar.mo5545d());
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo88040a(float f) {
        mo88064o().setValue(new C89378p<>(Float.valueOf(f), false));
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: b */
    public final void mo88052b(boolean z) {
        this.f120488b = z;
        for (C46239q qVar : this.f120487a) {
            qVar.setEnableEdit(this.f120488b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$b */
    static final class C52289b extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ TextStickerData f120497a;

        /* renamed from: b */
        final /* synthetic */ boolean f120498b = true;

        static {
            Covode.recordClassIndex(61678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52289b(TextStickerData textStickerData) {
            super(1);
            this.f120497a = textStickerData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, new C20524n(new C89378p(this.f120497a, Boolean.valueOf(this.f120498b))), null, null, null, null, null, null, null, null, null, null, null, 65519, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$f */
    public static final class C52293f extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        public static final C52293f f120505a = new C52293f();

        static {
            Covode.recordClassIndex(61682);
        }

        C52293f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$g */
    public static final class C52294g extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        public static final C52294g f120506a = new C52294g();

        static {
            Covode.recordClassIndex(61683);
        }

        C52294g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$h */
    public static final class C52295h extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ C46239q f120507a;

        static {
            Covode.recordClassIndex(61684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52295h(C46239q qVar) {
            super(1);
            this.f120507a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, new C20391d(this.f120507a), null, null, null, null, null, null, null, null, null, null, null, null, null, 65531, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$i */
    public static final class C52296i extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        public static final C52296i f120508a = new C52296i();

        static {
            Covode.recordClassIndex(61685);
        }

        C52296i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$j */
    static final class C52297j extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        public static final C52297j f120509a = new C52297j();

        static {
            Covode.recordClassIndex(61686);
        }

        C52297j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, 65503, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$k */
    static final class C52298k extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        public static final C52298k f120510a = new C52298k();

        static {
            Covode.recordClassIndex(61687);
        }

        C52298k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, 57343, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$l */
    static final class C52299l extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f120511a;

        static {
            Covode.recordClassIndex(61688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52299l(boolean z) {
            super(1);
            this.f120511a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, this.f120511a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$m */
    static final class C52300m extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f120512a;

        static {
            Covode.recordClassIndex(61689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52300m(AbstractC89183m mVar) {
            super(1);
            this.f120512a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, new C20391d(this.f120512a), null, null, null, null, null, null, null, null, 65407, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$n */
    static final class C52301n extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC46118d f120513a;

        static {
            Covode.recordClassIndex(61690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52301n(AbstractC46118d dVar) {
            super(1);
            this.f120513a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, new C20391d(this.f120513a), null, null, null, null, null, null, null, 65279, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$o */
    static final class C52302o extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC46119e f120514a;

        static {
            Covode.recordClassIndex(61691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52302o(AbstractC46119e eVar) {
            super(1);
            this.f120514a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, new C20391d(this.f120514a), null, null, null, null, null, null, null, null, null, 65471, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$p */
    static final class C52303p extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f120515a;

        static {
            Covode.recordClassIndex(61692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52303p(AbstractC89172b bVar) {
            super(1);
            this.f120515a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, new C20391d(this.f120515a), null, null, null, null, null, null, 65023, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$q */
    static final class C52304q extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ C89378p f120516a;

        static {
            Covode.recordClassIndex(61693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52304q(C89378p pVar) {
            super(1);
            this.f120516a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, new C20391d(this.f120516a), null, null, null, null, 63487, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$r */
    static final class C52305r extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC45872e f120517a;

        static {
            Covode.recordClassIndex(61694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52305r(AbstractC45872e eVar) {
            super(1);
            this.f120517a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, new C20391d(this.f120517a), null, null, null, null, null, 64511, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$s */
    static final class C52306s extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        public static final C52306s f120518a = new C52306s();

        static {
            Covode.recordClassIndex(61695);
        }

        C52306s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, new AbstractC23517a.C23519b(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$t */
    static final class C52307t extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ C46239q f120519a = null;

        static {
            Covode.recordClassIndex(61696);
        }

        C52307t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f120519a), null, null, null, 61439, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel$u */
    static final class C52308u extends AbstractC89220m implements AbstractC89172b<FTCEditTextStickerViewState, FTCEditTextStickerViewState> {

        /* renamed from: a */
        public static final C52308u f120520a = new C52308u();

        static {
            Covode.recordClassIndex(61697);
        }

        C52308u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditTextStickerViewState invoke(FTCEditTextStickerViewState fTCEditTextStickerViewState) {
            FTCEditTextStickerViewState fTCEditTextStickerViewState2 = fTCEditTextStickerViewState;
            C89219l.m154721d(fTCEditTextStickerViewState2, "");
            return FTCEditTextStickerViewState.copy$default(fTCEditTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, 49151, null);
        }
    }

    /* renamed from: a */
    public final void mo88043a(TextStickerData textStickerData) {
        C89219l.m154721d(textStickerData, "");
        mo33690d(new C52289b(textStickerData));
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final void mo88044a(AbstractC46118d dVar) {
        mo33689c(new C52301n(dVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final void mo88045a(AbstractC46119e eVar) {
        mo33689c(new C52302o(eVar));
    }

    /* renamed from: a */
    public final void mo88046a(C46239q qVar) {
        C89219l.m154721d(qVar, "");
        this.f120487a.remove(qVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final void mo88047a(AbstractC89172b<? super C46239q, C89391z> bVar) {
        mo33689c(new C52303p(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final void mo88048a(AbstractC89183m<? super C46239q, ? super C46239q, C89391z> mVar) {
        mo33689c(new C52300m(mVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a
    /* renamed from: a */
    public final C1731i<List<TextStickerCompileResult>> mo88038a(C45858a aVar, ViewGroup viewGroup) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(viewGroup, "");
        mo88060k();
        ArrayList arrayList = new ArrayList();
        for (C46239q qVar : this.f120487a) {
            C1731i<TContinuationResult> c = ((AbstractC45860c) this.f120496o.getValue()).mo77212a(qVar, viewGroup, aVar.f106825a, aVar.f106826b, aVar.f106827c, aVar.f106828d, aVar.f106829e).mo5542c(new C52291d(this, arrayList, qVar, viewGroup));
            C89219l.m154716b(c, "");
            arrayList.add(c);
        }
        C1731i<List<TextStickerCompileResult>> a = C1731i.m5634a((Collection) arrayList);
        C89219l.m154716b(a, "");
        return a;
    }
}
