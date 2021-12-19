package com.p2082ss.android.ugc.gamora.editor.sticker.info;

import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20525o;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71044aj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71050c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.RunnableC71391z;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73949aj;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel */
public final class EditInfoStickerViewModel extends LifecycleAwareViewModel<EditInfoStickerState> implements AbstractC82839a {

    /* renamed from: a */
    public C82843c f185143a;

    /* renamed from: b */
    private final AbstractC89244h f185144b = C89250i.m154773a((AbstractC89171a) new C82837g(this));

    static {
        Covode.recordClassIndex(96686);
    }

    /* renamed from: k */
    private C71056i m143051k() {
        return (C71056i) this.f185144b.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: a */
    public final void mo127913a() {
        mo33690d(C82836f.f185151a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: i */
    public final void mo127929i() {
        mo33689c(C82833c.f185148a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: j */
    public final void mo127930j() {
        mo33690d(C82834d.f185149a);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel$g */
    static final class C82837g extends AbstractC89220m implements AbstractC89171a<C71056i> {

        /* renamed from: a */
        final /* synthetic */ EditInfoStickerViewModel f185152a;

        static {
            Covode.recordClassIndex(96693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82837g(EditInfoStickerViewModel editInfoStickerViewModel) {
            super(0);
            this.f185152a = editInfoStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71056i invoke() {
            C82843c cVar = this.f185152a.f185143a;
            if (cVar == null) {
                C89219l.m154710a("scene");
            }
            return cVar.mo127934E();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: c */
    public final Object mo127924c() {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        return cVar.mo127934E().f159104K;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditInfoStickerState(null, null, null, null, null, null, null, 127, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: h */
    public final AbstractC45898d mo127928h() {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        return cVar.mo127934E();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: b */
    public final void mo127922b() {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        cVar.mo127934E().mo112257g();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: f */
    public final boolean mo127926f() {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C71056i E = cVar.mo127934E();
        if (E.f159122d != null) {
            return E.f159122d.f159014x;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: g */
    public final boolean mo127927g() {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C71056i E = cVar.mo127934E();
        if (E.f159122d != null) {
            return E.f159122d.f159015y;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: e */
    public final void mo127925e() {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C71056i E = cVar.mo127934E();
        if (E.f159122d != null) {
            C71050c cVar2 = E.f159122d.f158998g;
            if (!C13617h.m24465a(cVar2.f159073a)) {
                Iterator<C71044aj> it = cVar2.f159073a.iterator();
                while (it.hasNext()) {
                    C71044aj next = it.next();
                    cVar2.f159077e.mo56359g(next.f159054c.getId());
                    it.remove();
                    if (cVar2.f159078f != null) {
                        cVar2.f159078f.mo87993b(next.f159054c);
                    }
                }
                cVar2.f159074b = null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: a */
    public final void mo127917a(C89378p<Integer, Integer> pVar) {
        C89219l.m154721d(pVar, "");
        mo33689c(new C82835e(pVar));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel$b */
    public static final class C82832b extends AbstractC89220m implements AbstractC89172b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ StickerItemModel f185147a;

        static {
            Covode.recordClassIndex(96688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82832b(StickerItemModel stickerItemModel) {
            super(1);
            this.f185147a = stickerItemModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            C89219l.m154721d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, null, new C20391d(this.f185147a), null, null, null, 119, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel$c */
    static final class C82833c extends AbstractC89220m implements AbstractC89172b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        public static final C82833c f185148a = new C82833c();

        static {
            Covode.recordClassIndex(96689);
        }

        C82833c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            C89219l.m154721d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, new C20526p(), null, null, null, null, null, 125, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel$d */
    static final class C82834d extends AbstractC89220m implements AbstractC89172b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        public static final C82834d f185149a = new C82834d();

        static {
            Covode.recordClassIndex(96690);
        }

        C82834d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            C89219l.m154721d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, null, null, null, null, new C20526p(), 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel$e */
    static final class C82835e extends AbstractC89220m implements AbstractC89172b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ C89378p f185150a;

        static {
            Covode.recordClassIndex(96691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82835e(C89378p pVar) {
            super(1);
            this.f185150a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            C89219l.m154721d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, new C20524n(this.f185150a), null, null, null, null, 123, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel$f */
    static final class C82836f extends AbstractC89220m implements AbstractC89172b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        public static final C82836f f185151a = new C82836f();

        static {
            Covode.recordClassIndex(96692);
        }

        C82836f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            C89219l.m154721d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, new AbstractC23517a.C23519b(), null, null, null, null, null, null, 126, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: a */
    public final void mo127916a(AbstractC45904h<?> hVar) {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        cVar.mo127934E().mo112249a(true, (AbstractC45904h) hVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel$a */
    public static final class C82831a extends AbstractC89220m implements AbstractC89172b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f185145a;

        /* renamed from: b */
        final /* synthetic */ long f185146b = 300;

        static {
            Covode.recordClassIndex(96687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82831a(float f) {
            super(1);
            this.f185145a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            C89219l.m154721d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, null, null, new C20524n(new C89378p(Float.valueOf(this.f185145a), Long.valueOf(this.f185146b))), null, null, 111, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel$h */
    public static final class C82838h extends AbstractC89220m implements AbstractC89172b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f185153a;

        /* renamed from: b */
        final /* synthetic */ float f185154b;

        /* renamed from: c */
        final /* synthetic */ float f185155c;

        static {
            Covode.recordClassIndex(96694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82838h(float f, float f2, float f3) {
            super(1);
            this.f185153a = f;
            this.f185154b = f2;
            this.f185155c = f3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            C89219l.m154721d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, null, null, null, new C20525o(new C89386u(Float.valueOf(this.f185153a), Float.valueOf(this.f185154b), Float.valueOf(this.f185155c))), null, 95, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: b */
    public final void mo127923b(AbstractC45904h<?> hVar) {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        cVar.mo127934E().mo112245a((AbstractC45904h) hVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: a */
    public final void mo127920a(boolean z) {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C71056i E = cVar.mo127934E();
        if (E.f159122d != null) {
            InfoStickerEditView infoStickerEditView = E.f159122d;
            infoStickerEditView.f159000i = z;
            if (!z && infoStickerEditView.f158998g.f159074b != null) {
                infoStickerEditView.f158998g.mo112231b();
                infoStickerEditView.f158978E.mo77176b();
                infoStickerEditView.f158998g.mo112224a();
                infoStickerEditView.invalidate();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: a */
    public final boolean mo127921a(int i) {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        return cVar.mo127934E().mo112251a(i);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: a */
    public final void mo127915a(int i, boolean z) {
        C71056i k = m143051k();
        if (!(k.f159139u == null || k.f159139u.infoStickerModel == null || C13617h.m24465a(k.f159139u.infoStickerModel.stickers))) {
            for (StickerItemModel stickerItemModel : k.f159139u.infoStickerModel.stickers) {
                C89378p<Integer, Integer> a = C73949aj.m130040a(stickerItemModel.uiStartTime, stickerItemModel.uiEndTime, i);
                stickerItemModel.uiStartTime = a.getFirst().intValue();
                stickerItemModel.uiEndTime = a.getSecond().intValue();
                if (k.f159137s != null) {
                    stickerItemModel.startTime = k.f159137s.mo56386s(a.getFirst().intValue());
                    stickerItemModel.endTime = k.f159137s.mo56386s(a.getSecond().intValue());
                }
            }
        }
        if (z) {
            C71056i k2 = m143051k();
            if (k2.f159122d != null) {
                InfoStickerEditView infoStickerEditView = k2.f159122d;
                for (C71044aj ajVar : infoStickerEditView.f158998g.f159073a) {
                    if (ajVar.f159054c.isPin) {
                        infoStickerEditView.f158981H.mo112115a(ajVar);
                        infoStickerEditView.mo112166a(ajVar);
                        ajVar.f159054c.setPin(false);
                        C84902i.m145896b(ajVar.f159054c.pinAlgorithmFile);
                        ajVar.f159054c.setPinAlgorithmFile(null);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: a */
    public final void mo127914a(int i, int i2, int[] iArr) {
        C89219l.m154721d(iArr, "");
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C89219l.m154721d(iArr, "");
        C71056i E = cVar.mo127934E();
        if (E.f159137s != null) {
            E.f159094A.post(new RunnableC71391z(E, i, i2, iArr));
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: a */
    public final void mo127919a(String str, String str2, String str3, int i) {
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C71056i E = cVar.mo127934E();
        if (E.f159122d.getStickNumber() >= E.f159136r) {
            new C79459a(E.f159122d.getContext()).mo123050a(R.string.cm9).mo123053a();
            return;
        }
        InfoStickerEditView infoStickerEditView = E.f159122d;
        C71050c cVar2 = infoStickerEditView.f158998g;
        if (cVar2.f159074b != null && cVar2.f159074b.f159055d) {
            cVar2.f159074b.f159055d = false;
        }
        cVar2.mo112223a(str, str2, str3, i, cVar2.f159077e.mo56292a(str2, TextUtils.isEmpty(str3) ? null : new String[]{str3}), 0.0f, 0.0f, 1.0f, 1.0f, false);
        infoStickerEditView.invalidate();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.info.AbstractC82839a
    /* renamed from: a */
    public final void mo127918a(String str, String str2, int i, int i2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C82843c cVar = this.f185143a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C71056i E = cVar.mo127934E();
        if (E.f159122d.getStickNumber() >= E.f159136r) {
            new C79459a(E.f159122d.getContext()).mo123050a(R.string.cm9).mo123053a();
            return;
        }
        InfoStickerEditView infoStickerEditView = E.f159122d;
        C71050c cVar2 = infoStickerEditView.f158998g;
        float[] fArr = i > i2 ? new float[]{280.0f, (((float) i2) * 280.0f) / ((float) i)} : new float[]{(((float) i) * 280.0f) / ((float) i2), 280.0f};
        float f = fArr[0] / ((float) cVar2.f159076d.f158994c);
        float f2 = fArr[1] / ((float) cVar2.f159076d.f158995d);
        float f3 = (1.0f - f) / 2.0f;
        float f4 = (1.0f - f2) / 2.0f;
        C71044aj a = cVar2.mo112223a(str, str2, null, 11, cVar2.f159077e.mo56283a(str2, f3, f4, f, f2), f3, f4, f, f2, z);
        if (a != null) {
            a.f159064m = true;
        }
        infoStickerEditView.invalidate();
    }
}
