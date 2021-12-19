package com.p2082ss.android.ugc.gamora.editor.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel */
public final class EditStickerPanelViewModel extends LifecycleAwareViewModel<EditStickerPanelState> implements AbstractC82905a {

    /* renamed from: a */
    private final C88411a f185262a = new C88411a();

    /* renamed from: b */
    private final C82910c f185263b;

    static {
        Covode.recordClassIndex(96760);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a
    /* renamed from: a */
    public final void mo127986a() {
        mo33689c(C82904d.f185270a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditStickerPanelState(null, null, null, null, null, null, 63, null);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f185262a.dispose();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a
    /* renamed from: a */
    public final void mo127987a(AbstractC56722g gVar) {
        C89219l.m154721d(gVar, "");
        this.f185263b.mo127995a(gVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel$c */
    static final class C82903c extends AbstractC89220m implements AbstractC89172b<EditStickerPanelState, EditStickerPanelState> {

        /* renamed from: a */
        final /* synthetic */ boolean f185268a;

        /* renamed from: b */
        final /* synthetic */ String f185269b;

        static {
            Covode.recordClassIndex(96763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82903c(boolean z, String str) {
            super(1);
            this.f185268a = z;
            this.f185269b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerPanelState invoke(EditStickerPanelState editStickerPanelState) {
            EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
            C89219l.m154721d(editStickerPanelState2, "");
            return EditStickerPanelState.copy$default(editStickerPanelState2, new C20521k(this.f185268a), null, null, null, this.f185269b, null, 46, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel$d */
    public static final class C82904d extends AbstractC89220m implements AbstractC89172b<EditStickerPanelState, EditStickerPanelState> {

        /* renamed from: a */
        public static final C82904d f185270a = new C82904d();

        static {
            Covode.recordClassIndex(96764);
        }

        C82904d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerPanelState invoke(EditStickerPanelState editStickerPanelState) {
            EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
            C89219l.m154721d(editStickerPanelState2, "");
            return EditStickerPanelState.copy$default(editStickerPanelState2, null, null, null, null, null, new AbstractC23517a.C23519b(), 31, null);
        }
    }

    public EditStickerPanelViewModel(C82910c cVar) {
        C89219l.m154721d(cVar, "");
        this.f185263b = cVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel$a */
    static final class C82901a extends AbstractC89220m implements AbstractC89172b<EditStickerPanelState, EditStickerPanelState> {

        /* renamed from: a */
        final /* synthetic */ Effect f185264a;

        /* renamed from: b */
        final /* synthetic */ String f185265b = null;

        static {
            Covode.recordClassIndex(96761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82901a(Effect effect) {
            super(1);
            this.f185264a = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerPanelState invoke(EditStickerPanelState editStickerPanelState) {
            EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
            C89219l.m154721d(editStickerPanelState2, "");
            return EditStickerPanelState.copy$default(editStickerPanelState2, null, null, null, new C20524n(C89387v.m154943a(this.f185264a, this.f185265b)), null, null, 55, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel$b */
    public static final class C82902b extends AbstractC89220m implements AbstractC89172b<EditStickerPanelState, EditStickerPanelState> {

        /* renamed from: a */
        final /* synthetic */ Effect f185266a;

        /* renamed from: b */
        final /* synthetic */ String f185267b;

        static {
            Covode.recordClassIndex(96762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82902b(Effect effect, String str) {
            super(1);
            this.f185266a = effect;
            this.f185267b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerPanelState invoke(EditStickerPanelState editStickerPanelState) {
            EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
            C89219l.m154721d(editStickerPanelState2, "");
            return EditStickerPanelState.copy$default(editStickerPanelState2, null, new C20524n(C89387v.m154943a(this.f185266a, this.f185267b)), null, null, null, null, 61, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a
    /* renamed from: a */
    public final void mo127988a(Effect effect, String str) {
        C89219l.m154721d(effect, "");
        mo33689c(new C82902b(effect, str));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a
    /* renamed from: a */
    public final void mo127989a(boolean z, String str) {
        C89219l.m154721d(str, "");
        mo33689c(new C82903c(z, str));
    }
}
