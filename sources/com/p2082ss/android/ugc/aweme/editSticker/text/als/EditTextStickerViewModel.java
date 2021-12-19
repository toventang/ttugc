package com.p2082ss.android.ugc.aweme.editSticker.text.als;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.lifecycle.C1213t;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.editSticker.AbstractC45891h;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.compile.AbstractC45860c;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45858a;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45859b;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45865h;
import com.p2082ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45872e;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45887e;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46118d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46119e;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.data.TextStruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel */
public final class EditTextStickerViewModel extends LifecycleAwareViewModel<EditTextStickerViewState> implements AbstractC45898d, AbstractC46036a {

    /* renamed from: o */
    public static final C45998a f107127o = new C45998a((byte) 0);

    /* renamed from: a */
    public boolean f107128a;

    /* renamed from: b */
    public boolean f107129b;

    /* renamed from: c */
    public TextStickerData f107130c;

    /* renamed from: d */
    public boolean f107131d;

    /* renamed from: e */
    public final List<C46239q> f107132e = new ArrayList();

    /* renamed from: f */
    public boolean f107133f = true;

    /* renamed from: g */
    public boolean f107134g;

    /* renamed from: l */
    public final C2563k<C89391z> f107135l = new C2563k<>();

    /* renamed from: m */
    public final C2563k<C89378p<Boolean, Boolean>> f107136m = new C2563k<>();

    /* renamed from: n */
    public final C2563k<Boolean> f107137n = new C2563k<>();

    /* renamed from: p */
    private C1213t<Boolean> f107138p;

    /* renamed from: q */
    private final AbstractC89244h f107139q = C89250i.m154773a((AbstractC89171a) C46014e.f107159a);

    /* renamed from: r */
    private C89378p<Integer, Integer> f107140r;

    /* renamed from: s */
    private final AbstractC89244h f107141s = C89250i.m154773a((AbstractC89171a) C46018i.f107166a);

    /* renamed from: t */
    private final C2564l<Boolean> f107142t = new C2564l<>(false);

    static {
        Covode.recordClassIndex(54531);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: f */
    public final void mo77630f() {
        this.f107129b = true;
    }

    /* renamed from: u */
    public final C1213t<C89378p<Float, Boolean>> mo77646u() {
        return (C1213t) this.f107139q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$a */
    public static final class C45998a {
        static {
            Covode.recordClassIndex(54532);
        }

        private C45998a() {
        }

        public /* synthetic */ C45998a(byte b) {
            this();
        }

        /* renamed from: a */
        public static float m88840a(float f) {
            return new BigDecimal((double) f).setScale(4, 1).floatValue();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final C2563k<C89391z> mo77604a() {
        return this.f107135l;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: b */
    public final C2563k<C89378p<Boolean, Boolean>> mo77620b() {
        return this.f107136m;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: c */
    public final C2563k<Boolean> mo77624c() {
        return this.f107137n;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: e */
    public final boolean mo77629e() {
        return this.f107128a;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: q */
    public final AbstractC45898d mo77642q() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: r */
    public final List<C46239q> mo77643r() {
        return this.f107132e;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: s */
    public final C2560h<Boolean> mo77644s() {
        return this.f107142t;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77619a(boolean z) {
        mo33689c(new C46022m(z));
        this.f107131d = z;
        Iterator<T> it = this.f107132e.iterator();
        while (it.hasNext()) {
            it.next().f107764x = this.f107131d;
        }
    }

    /* renamed from: a */
    public final void mo77615a(C46239q qVar) {
        C89219l.m154721d(qVar, "");
        this.f107132e.remove(qVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d
    /* renamed from: a */
    public final boolean mo77274a(RectF rectF) {
        C89219l.m154721d(rectF, "");
        for (C46239q qVar : this.f107132e) {
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

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77614a(AbstractC46119e eVar) {
        mo33689c(new C46002ad(eVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77617a(AbstractC89183m<? super C46239q, ? super C46239q, C89391z> mVar) {
        mo33689c(new C45999aa(mVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77616a(AbstractC89172b<? super C46239q, C89391z> bVar) {
        mo33689c(new C46003ae(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77613a(AbstractC46118d dVar) {
        mo33689c(new C46001ac(dVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77618a(C89378p<Integer, Integer> pVar) {
        if (this.f107140r == null) {
            this.f107140r = pVar;
        }
        mo33689c(new C46004af(pVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$e */
    static final class C46014e extends AbstractC89220m implements AbstractC89171a<C1213t<C89378p<? extends Float, ? extends Boolean>>> {

        /* renamed from: a */
        public static final C46014e f107159a = new C46014e();

        static {
            Covode.recordClassIndex(54548);
        }

        C46014e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C89378p<? extends Float, ? extends Boolean>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$i */
    static final class C46018i extends AbstractC89220m implements AbstractC89171a<C45865h> {

        /* renamed from: a */
        public static final C46018i f107166a = new C46018i();

        static {
            Covode.recordClassIndex(54552);
        }

        C46018i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C45865h invoke() {
            return new C45865h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: g */
    public final void mo77632g() {
        mo33690d(C46006ah.f107150a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: j */
    public final void mo77635j() {
        mo33689c(C46031v.f107180a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: k */
    public final void mo77636k() {
        mo33689c(C46009ak.f107153a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: m */
    public final void mo77638m() {
        mo33689c(C46032w.f107181a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: t */
    public final void mo77645t() {
        mo33689c(C46033x.f107182a);
    }

    /* renamed from: w */
    public final int mo77648w() {
        return this.f107132e.size();
    }

    /* renamed from: x */
    public final boolean mo77649x() {
        return this.f107132e.isEmpty();
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: h */
    public final void mo77633h() {
        mo33690d(new C46023n());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: l */
    public final void mo77637l() {
        mo33689c(new C46007ai());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: o */
    public final boolean mo77640o() {
        if (!mo77649x()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: i */
    public final boolean mo77634i() {
        Boolean value;
        C1213t<Boolean> tVar = this.f107138p;
        if (tVar == null || (value = tVar.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    /* renamed from: y */
    public final C46239q mo77650y() {
        T t;
        Iterator<T> it = this.f107132e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f107753m) {
                break;
            }
        }
        return t;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: n */
    public final boolean mo77639n() {
        mo33689c(C46025p.f107173a);
        boolean z = false;
        for (C46239q qVar : this.f107132e) {
            if (qVar.mo78550e()) {
                qVar.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: p */
    public final boolean mo77641p() {
        Iterator<T> it = this.f107132e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            TextStickerData data = next.getData();
            if (data != null && data.getHasReadTextAudio()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditTextStickerViewState(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    /* renamed from: v */
    public final int mo77647v() {
        if (this.f107132e.isEmpty()) {
            return 0;
        }
        int size = this.f107132e.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            List<TextStickerTextWrap> textWrapList = this.f107132e.get(i2).getTextWrapList();
            C89219l.m154716b(textWrapList, "");
            for (TextStickerTextWrap textStickerTextWrap : textWrapList) {
                if (textStickerTextWrap != null) {
                    i += textStickerTextWrap.safeStrPair().f107314b.size();
                }
            }
        }
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77609a(C1213t<Boolean> tVar) {
        C89219l.m154721d(tVar, "");
        this.f107138p = tVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77607a(int i) {
        mo33689c(new C46010al(i));
    }

    /* renamed from: b */
    public final void mo77621b(C46239q qVar) {
        C89219l.m154721d(qVar, "");
        this.f107132e.add(0, qVar);
    }

    /* renamed from: c */
    public final void mo77625c(C46239q qVar) {
        mo33689c(new C46019j(qVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: d */
    public final void mo77627d(boolean z) {
        mo33689c(new C46026q(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: e */
    public final void mo77628e(boolean z) {
        mo33690d(new C46020k(z));
    }

    /* renamed from: f */
    public final void mo77631f(boolean z) {
        this.f107142t.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$h */
    static final class C46017h<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ EditTextStickerViewModel f107162a;

        /* renamed from: b */
        final /* synthetic */ List f107163b;

        /* renamed from: c */
        final /* synthetic */ C46239q f107164c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f107165d;

        static {
            Covode.recordClassIndex(54551);
        }

        C46017h(EditTextStickerViewModel editTextStickerViewModel, List list, C46239q qVar, ViewGroup viewGroup) {
            this.f107162a = editTextStickerViewModel;
            this.f107163b = list;
            this.f107164c = qVar;
            this.f107165d = viewGroup;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            if (iVar.mo5545d() != null) {
                return new TextStickerCompileResult(this.f107164c.mo78410b(), (C45859b) iVar.mo5545d());
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo77606a(float f) {
        mo77646u().setValue(new C89378p<>(Float.valueOf(f), false));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: b */
    public final void mo77622b(AbstractC89172b<? super C46239q, C89391z> bVar) {
        mo33689c(new C46000ab(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: c */
    public final void mo77626c(boolean z) {
        this.f107133f = z;
        for (C46239q qVar : this.f107132e) {
            qVar.setEnableEdit(this.f107133f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77608a(TextWatcher textWatcher) {
        C89219l.m154721d(textWatcher, "");
        mo33690d(new C46012c(textWatcher));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: b */
    public final void mo77623b(boolean z) {
        mo33689c(new C46035z(z));
        C1213t<Boolean> tVar = this.f107138p;
        if (tVar != null && (!C89219l.m154714a(tVar.getValue(), Boolean.valueOf(z)))) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$aa */
    static final class C45999aa extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f107143a;

        static {
            Covode.recordClassIndex(54533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45999aa(AbstractC89183m mVar) {
            super(1);
            this.f107143a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, new C20391d(this.f107143a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$ab */
    static final class C46000ab extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f107144a;

        static {
            Covode.recordClassIndex(54534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46000ab(AbstractC89172b bVar) {
            super(1);
            this.f107144a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, new C20391d(this.f107144a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$ac */
    static final class C46001ac extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC46118d f107145a;

        static {
            Covode.recordClassIndex(54535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46001ac(AbstractC46118d dVar) {
            super(1);
            this.f107145a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, new C20391d(this.f107145a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$ad */
    static final class C46002ad extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC46119e f107146a;

        static {
            Covode.recordClassIndex(54536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46002ad(AbstractC46119e eVar) {
            super(1);
            this.f107146a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, new C20391d(this.f107146a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$ae */
    static final class C46003ae extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f107147a;

        static {
            Covode.recordClassIndex(54537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46003ae(AbstractC89172b bVar) {
            super(1);
            this.f107147a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, new C20391d(this.f107147a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$af */
    static final class C46004af extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ C89378p f107148a;

        static {
            Covode.recordClassIndex(54538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46004af(C89378p pVar) {
            super(1);
            this.f107148a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f107148a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$ag */
    static final class C46005ag extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC45872e f107149a;

        static {
            Covode.recordClassIndex(54539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46005ag(AbstractC45872e eVar) {
            super(1);
            this.f107149a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f107149a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$ah */
    static final class C46006ah extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        public static final C46006ah f107150a = new C46006ah();

        static {
            Covode.recordClassIndex(54540);
        }

        C46006ah() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, new AbstractC23517a.C23519b(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$ai */
    static final class C46007ai extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ C46239q f107151a = null;

        static {
            Covode.recordClassIndex(54541);
        }

        C46007ai() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f107151a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$ak */
    static final class C46009ak extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        public static final C46009ak f107153a = new C46009ak();

        static {
            Covode.recordClassIndex(54543);
        }

        C46009ak() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$al */
    static final class C46010al extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ int f107154a;

        static {
            Covode.recordClassIndex(54544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46010al(int i) {
            super(1);
            this.f107154a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20523m(this.f107154a), null, -1, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$b */
    public static final class C46011b extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ TextStickerData f107155a;

        /* renamed from: b */
        final /* synthetic */ boolean f107156b = true;

        static {
            Covode.recordClassIndex(54545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46011b(TextStickerData textStickerData) {
            super(1);
            this.f107155a = textStickerData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, new C20524n(new C89378p(this.f107155a, Boolean.valueOf(this.f107156b))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$c */
    static final class C46012c extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ TextWatcher f107157a;

        static {
            Covode.recordClassIndex(54546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46012c(TextWatcher textWatcher) {
            super(1);
            this.f107157a = textWatcher;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f107157a), null, null, null, null, -536870913, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$d */
    public static final class C46013d extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ String f107158a;

        static {
            Covode.recordClassIndex(54547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46013d(String str) {
            super(1);
            this.f107158a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f107158a), null, null, null, -1073741825, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$f */
    public static final class C46015f extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        public static final C46015f f107160a = new C46015f();

        static {
            Covode.recordClassIndex(54549);
        }

        C46015f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, -4194305, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$g */
    public static final class C46016g extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f107161a = true;

        static {
            Covode.recordClassIndex(54550);
        }

        public C46016g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20521k(this.f107161a), null, null, null, null, null, null, null, null, -33554433, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$j */
    static final class C46019j extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ C46239q f107167a;

        static {
            Covode.recordClassIndex(54553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46019j(C46239q qVar) {
            super(1);
            this.f107167a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f107167a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$k */
    static final class C46020k extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f107168a;

        static {
            Covode.recordClassIndex(54554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46020k(boolean z) {
            super(1);
            this.f107168a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20521k(this.f107168a), null, null, null, null, null, -268435457, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$l */
    public static final class C46021l extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ String f107169a;

        static {
            Covode.recordClassIndex(54555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46021l(String str) {
            super(1);
            this.f107169a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f107169a), null, null, null, null, null, null, null, null, null, null, -8388609, 3, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$m */
    public static final class C46022m extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f107170a;

        static {
            Covode.recordClassIndex(54556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46022m(boolean z) {
            super(1);
            this.f107170a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20521k(this.f107170a), null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$n */
    static final class C46023n extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f107171a = true;

        static {
            Covode.recordClassIndex(54557);
        }

        C46023n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20521k(this.f107171a), null, null, null, null, null, null, null, null, null, -16777217, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$o */
    public static final class C46024o extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ C46239q f107172a;

        static {
            Covode.recordClassIndex(54558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46024o(C46239q qVar) {
            super(1);
            this.f107172a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f107172a), null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 3, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$p */
    public static final class C46025p extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        public static final C46025p f107173a = new C46025p();

        static {
            Covode.recordClassIndex(54559);
        }

        C46025p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$q */
    static final class C46026q extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f107174a;

        static {
            Covode.recordClassIndex(54560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46026q(boolean z) {
            super(1);
            this.f107174a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20521k(this.f107174a), null, null, null, null, null, null, -134217729, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$r */
    public static final class C46027r extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        public static final C46027r f107175a = new C46027r();

        static {
            Covode.recordClassIndex(54561);
        }

        C46027r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$s */
    public static final class C46028s extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ C46239q f107176a;

        static {
            Covode.recordClassIndex(54562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46028s(C46239q qVar) {
            super(1);
            this.f107176a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, new C20391d(this.f107176a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$t */
    public static final class C46029t extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        public static final C46029t f107177a = new C46029t();

        static {
            Covode.recordClassIndex(54563);
        }

        C46029t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 3, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$u */
    public static final class C46030u extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ TextStickerData f107178a;

        /* renamed from: b */
        final /* synthetic */ String f107179b;

        static {
            Covode.recordClassIndex(54564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46030u(TextStickerData textStickerData, String str) {
            super(1);
            this.f107178a = textStickerData;
            this.f107179b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20391d(new C89378p(this.f107178a, this.f107179b)), null, null, null, null, null, null, null, -67108865, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$v */
    static final class C46031v extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        public static final C46031v f107180a = new C46031v();

        static {
            Covode.recordClassIndex(54565);
        }

        C46031v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$w */
    static final class C46032w extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        public static final C46032w f107181a = new C46032w();

        static {
            Covode.recordClassIndex(54566);
        }

        C46032w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$x */
    static final class C46033x extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        public static final C46033x f107182a = new C46033x();

        static {
            Covode.recordClassIndex(54567);
        }

        C46033x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), -1, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$y */
    public static final class C46034y extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ C46239q f107183a;

        static {
            Covode.recordClassIndex(54568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46034y(C46239q qVar) {
            super(1);
            this.f107183a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20391d(this.f107183a), null, null, Integer.MAX_VALUE, 3, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$z */
    public static final class C46035z extends AbstractC89220m implements AbstractC89172b<EditTextStickerViewState, EditTextStickerViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f107184a;

        static {
            Covode.recordClassIndex(54569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46035z(boolean z) {
            super(1);
            this.f107184a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditTextStickerViewState invoke(EditTextStickerViewState editTextStickerViewState) {
            EditTextStickerViewState editTextStickerViewState2 = editTextStickerViewState;
            C89219l.m154721d(editTextStickerViewState2, "");
            return EditTextStickerViewState.copy$default(editTextStickerViewState2, null, this.f107184a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, 3, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final void mo77610a(AbstractC45872e eVar) {
        mo33689c(new C46005ag(eVar));
    }

    /* renamed from: a */
    public final void mo77611a(TextStickerData textStickerData) {
        C89219l.m154721d(textStickerData, "");
        mo33690d(new C46011b(textStickerData));
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel$aj */
    static final class C46008aj<T> implements Comparator {

        /* renamed from: a */
        public static final C46008aj f107152a = new C46008aj();

        static {
            Covode.recordClassIndex(54542);
        }

        C46008aj() {
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C46239q) obj).f107765y - ((C46239q) obj2).f107765y;
        }
    }

    /* renamed from: a */
    private final PointF m88789a(PointF pointF, Context context) {
        int i;
        PointF pointF2 = new PointF();
        C89378p<Integer, Integer> pVar = this.f107140r;
        int i2 = 0;
        if (pVar != null) {
            i2 = pVar.getFirst().intValue();
            i = pVar.getSecond().intValue();
        } else if (context != null) {
            i2 = C70636dh.m124831b(context);
            i = C70636dh.m124828a(context);
        } else {
            i = 0;
        }
        pointF2.set(C45998a.m88840a((pointF.x * 1.0f) / ((float) i2)), C45998a.m88840a((pointF.y * 1.0f) / ((float) i)));
        return pointF2;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final C1731i<List<TextStickerCompileResult>> mo77603a(C45858a aVar, ViewGroup viewGroup) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(viewGroup, "");
        mo77639n();
        ArrayList arrayList = new ArrayList();
        for (C46239q qVar : this.f107132e) {
            C1731i<TContinuationResult> c = ((AbstractC45860c) this.f107141s.getValue()).mo77212a(qVar, viewGroup, aVar.f106825a, aVar.f106826b, aVar.f106827c, aVar.f106828d, aVar.f106829e).mo5542c(new C46017h(this, arrayList, qVar, viewGroup));
            C89219l.m154716b(c, "");
            arrayList.add(c);
        }
        C1731i<List<TextStickerCompileResult>> a = C1731i.m5634a((Collection) arrayList);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public final void mo77612a(TextStickerData textStickerData, String str) {
        C89219l.m154721d(textStickerData, "");
        mo33689c(new C46030u(textStickerData, str));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a
    /* renamed from: a */
    public final List<InteractStickerStruct> mo77605a(Context context, List<? extends StickerItemModel> list, C27910f fVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(fVar, "");
        ArrayList arrayList = new ArrayList(mo77648w());
        List a = C89070n.m154553a((Iterable) this.f107132e, (Comparator) C46008aj.f107152a);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C46239q qVar = (C46239q) a.get(i);
            List<TextStickerTextWrap> textWrapList = qVar.getTextWrapList();
            C89219l.m154716b(textWrapList, "");
            if (C46110t.m88971g(textWrapList)) {
                InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                interactStickerStruct.setType(5);
                LinkedList linkedList = new LinkedList();
                NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                normalTrackTimeStamp.setRotation(C45998a.m88840a(qVar.getStickerRotate()));
                normalTrackTimeStamp.setScale(Float.valueOf(qVar.getStickerScale()));
                PointF a2 = m88789a(new PointF(qVar.getCenterX(), qVar.getCenterY()), context);
                normalTrackTimeStamp.setX(a2.x);
                normalTrackTimeStamp.setY(a2.y);
                PointF a3 = m88789a(new PointF((float) qVar.getContentViewWidth(), (float) qVar.getContentViewHeight()), context);
                normalTrackTimeStamp.setWidth(a3.x);
                normalTrackTimeStamp.setHeight(a3.y);
                normalTrackTimeStamp.setStartTime((float) qVar.mo65014a(-1));
                normalTrackTimeStamp.setEndTime((float) qVar.mo65018b(-1));
                linkedList.add(normalTrackTimeStamp);
                C45887e.m88531a(interactStickerStruct, linkedList);
                try {
                    interactStickerStruct.setTextStruct(C45866d.m88489b().mo46674b(new TextStruct(C46110t.m88970f(textWrapList))));
                } catch (Exception e) {
                    AbstractC45891h d = C45866d.m88491d();
                    if (d != null) {
                        d.mo77252a(e);
                    }
                }
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    } else if (((StickerItemModel) list.get(i2)).viewHash == qVar.hashCode()) {
                        interactStickerStruct.setIndex(((StickerItemModel) list.get(i2)).layerWeight);
                        HashMap hashMap = new HashMap();
                        String str = ((StickerItemModel) list.get(i2)).stickerId;
                        C89219l.m154716b(str, "");
                        hashMap.put("text_sticker_id", str);
                        interactStickerStruct.setAttr(C45866d.m88489b().mo46674b(hashMap));
                        break;
                    } else {
                        i2++;
                    }
                }
                arrayList.add(interactStickerStruct);
            }
        }
        return arrayList;
    }
}
