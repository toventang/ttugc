package com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.qasticker.C65863a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4281a.C82307a;
import com.p2082ss.android.vesdk.VESize;
import java.util.List;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel */
public final class EditPageQaStickerViewModel extends LifecycleAwareViewModel<EditQaStickerState> implements AbstractC82982a {

    /* renamed from: a */
    public final C82983b f185406a;

    /* renamed from: b */
    public final C65863a f185407b;

    /* renamed from: c */
    private final AbstractC89244h f185408c = C89250i.m154773a((AbstractC89171a) new C82980c(this));

    static {
        Covode.recordClassIndex(96841);
    }

    /* renamed from: k */
    public final C82986c mo128053k() {
        return (C82986c) this.f185408c.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: a */
    public final void mo128038a() {
        this.f185406a.mo23032c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: b */
    public final void mo128044b() {
        mo33689c(C82979b.f185410a);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel$c */
    static final class C82980c extends AbstractC89220m implements AbstractC89171a<C82986c> {

        /* renamed from: a */
        final /* synthetic */ EditPageQaStickerViewModel f185411a;

        static {
            Covode.recordClassIndex(96844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82980c(EditPageQaStickerViewModel editPageQaStickerViewModel) {
            super(0);
            this.f185411a = editPageQaStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82986c invoke() {
            return this.f185411a.f185406a.mo128065a();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: c */
    public final void mo128046c() {
        mo128053k().mo128071d().mo112446q();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditQaStickerState(null, null, null, 0.0f, 15, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: e */
    public final void mo128047e() {
        mo128053k().mo128071d().mo112285d();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: h */
    public final InteractStickerStruct mo128050h() {
        return mo128053k().mo128071d().mo112284c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: i */
    public final boolean mo128051i() {
        return mo128053k().mo128071d().mo112283b();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: g */
    public final void mo128049g() {
        C82986c k = mo128053k();
        if (k.mo128067a().qaStruct != null) {
            QaStruct qaStruct = k.mo128067a().qaStruct;
            C89219l.m154716b(qaStruct, "");
            k.mo128068a(qaStruct);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: j */
    public final void mo128052j() {
        C39162r.m79460a("click_ask_sticker", this.f185407b.mo105008a().mo129406a("user_id", C63244g.m114602a().mo73255A().mo93904c()).mo129406a("enter_method", "click_main_panel").f188764a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: f */
    public final void mo128048f() {
        C82986c k = mo128053k();
        List<InteractStickerStruct> a = C71073b.m125565a(k.mo128067a().getMainBusinessContext(), 12, EnumC71088d.TRACK_PAGE_EDIT);
        k.mo128071d().mo112306a(k.mo128070b().mo114778C().getValue(), k.mo128070b());
        if (a != null && !a.isEmpty()) {
            InteractStickerStruct interactStickerStruct = a.get(0);
            C89219l.m154716b(interactStickerStruct, "");
            if (interactStickerStruct.getQaStruct() != null) {
                k.mo128067a().hasQaSticker = true;
                C82307a C = k.mo128066C();
                if (C != null) {
                    C.mo127447f();
                }
                k.mo128071d().mo112310a(a.get(0));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: a */
    public final void mo128039a(float f) {
        mo33689c(new C82981d(f));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: b */
    public final void mo128045b(String str) {
        C89219l.m154721d(str, "");
        mo128053k().mo128071d().f159715A = str;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel$a */
    static final class C82978a extends AbstractC89220m implements AbstractC89172b<EditQaStickerState, EditQaStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f185409a;

        static {
            Covode.recordClassIndex(96842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82978a(boolean z) {
            super(1);
            this.f185409a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditQaStickerState invoke(EditQaStickerState editQaStickerState) {
            EditQaStickerState editQaStickerState2 = editQaStickerState;
            C89219l.m154721d(editQaStickerState2, "");
            return EditQaStickerState.copy$default(editQaStickerState2, null, null, Boolean.valueOf(this.f185409a), 0.0f, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel$b */
    static final class C82979b extends AbstractC89220m implements AbstractC89172b<EditQaStickerState, EditQaStickerState> {

        /* renamed from: a */
        public static final C82979b f185410a = new C82979b();

        static {
            Covode.recordClassIndex(96843);
        }

        C82979b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditQaStickerState invoke(EditQaStickerState editQaStickerState) {
            EditQaStickerState editQaStickerState2 = editQaStickerState;
            C89219l.m154721d(editQaStickerState2, "");
            return EditQaStickerState.copy$default(editQaStickerState2, null, new C20526p(), null, 0.0f, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel$d */
    static final class C82981d extends AbstractC89220m implements AbstractC89172b<EditQaStickerState, EditQaStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f185412a;

        static {
            Covode.recordClassIndex(96845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82981d(float f) {
            super(1);
            this.f185412a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditQaStickerState invoke(EditQaStickerState editQaStickerState) {
            EditQaStickerState editQaStickerState2 = editQaStickerState;
            C89219l.m154721d(editQaStickerState2, "");
            return EditQaStickerState.copy$default(editQaStickerState2, null, null, null, this.f185412a, 7, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: a */
    public final void mo128040a(QaStruct qaStruct) {
        C89219l.m154721d(qaStruct, "");
        if (!C63244g.m114602a().mo73255A().mo93901a()) {
            mo128053k().mo128068a(qaStruct);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: a */
    public final void mo128041a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        mo128053k().mo128069a(vESize);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: a */
    public final void mo128042a(String str) {
        C89219l.m154721d(str, "");
        mo128053k().mo128071d().f159722c = str;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: a */
    public final void mo128043a(boolean z) {
        mo33689c(new C82978a(z));
    }

    public EditPageQaStickerViewModel(C82983b bVar, C65863a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f185406a = bVar;
        this.f185407b = aVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.AbstractC82982a
    /* renamed from: a */
    public final C1731i<C89391z> mo128037a(AbstractC31071f fVar, AbstractC82035ab abVar, AbstractC89172b<? super String, String> bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(abVar, "");
        return mo128053k().mo127435a(fVar, abVar, bVar);
    }
}
