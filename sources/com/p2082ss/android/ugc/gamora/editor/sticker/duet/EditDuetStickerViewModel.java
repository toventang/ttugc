package com.p2082ss.android.ugc.gamora.editor.sticker.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.vesdk.VESize;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.EditDuetStickerViewModel */
public final class EditDuetStickerViewModel extends LifecycleAwareViewModel<EditDuetStickerState> implements AbstractC82814a {

    /* renamed from: a */
    public final C82815b f185105a;

    /* renamed from: b */
    private final AbstractC89244h f185106b = C89250i.m154773a((AbstractC89171a) new C82812c(this));

    static {
        Covode.recordClassIndex(96663);
    }

    /* renamed from: k */
    private final C82818c m143000k() {
        return (C82818c) this.f185106b.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: a */
    public final void mo127877a() {
        this.f185105a.mo23032c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: b */
    public final void mo127882b() {
        mo33689c(C82811b.f185108a);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.EditDuetStickerViewModel$c */
    static final class C82812c extends AbstractC89220m implements AbstractC89171a<C82818c> {

        /* renamed from: a */
        final /* synthetic */ EditDuetStickerViewModel f185109a;

        static {
            Covode.recordClassIndex(96666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82812c(EditDuetStickerViewModel editDuetStickerViewModel) {
            super(0);
            this.f185109a = editDuetStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82818c invoke() {
            return this.f185109a.f185105a.mo127891a();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: c */
    public final void mo127884c() {
        m143000k().mo127895d().mo112446q();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditDuetStickerState(null, null, 0.0f, null, 15, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: e */
    public final void mo127885e() {
        m143000k().mo127895d().mo112285d();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: g */
    public final InteractStickerStruct mo127887g() {
        return m143000k().mo127895d().mo112284c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: h */
    public final AbstractC45898d mo127888h() {
        return m143000k().mo127895d();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: i */
    public final boolean mo127889i() {
        return m143000k().mo127895d().mo112283b();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: j */
    public final boolean mo127890j() {
        return m143000k().mo127895d().mo112312a();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: f */
    public final void mo127886f() {
        C82818c k = m143000k();
        List<InteractStickerStruct> a = C71073b.m125565a(k.mo127892a().getMainBusinessContext(), 16, EnumC71088d.TRACK_PAGE_EDIT);
        k.mo127895d().mo112306a(k.mo127894b().mo114778C().getValue(), k.mo127894b());
        if (a != null && !a.isEmpty()) {
            InteractStickerStruct interactStickerStruct = a.get(0);
            C89219l.m154716b(interactStickerStruct, "");
            if (interactStickerStruct.getDuetStickerStruct() != null) {
                k.mo127895d().mo112310a(a.get(0));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: a */
    public final void mo127878a(float f) {
        mo33689c(new C82813d(f));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: b */
    public final void mo127883b(String str) {
        C89219l.m154721d(str, "");
        m143000k().mo127895d().f159340c = str;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.EditDuetStickerViewModel$a */
    static final class C82810a extends AbstractC89220m implements AbstractC89172b<EditDuetStickerState, EditDuetStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f185107a;

        static {
            Covode.recordClassIndex(96664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82810a(boolean z) {
            super(1);
            this.f185107a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditDuetStickerState invoke(EditDuetStickerState editDuetStickerState) {
            EditDuetStickerState editDuetStickerState2 = editDuetStickerState;
            C89219l.m154721d(editDuetStickerState2, "");
            return EditDuetStickerState.copy$default(editDuetStickerState2, null, Boolean.valueOf(this.f185107a), 0.0f, null, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.EditDuetStickerViewModel$b */
    static final class C82811b extends AbstractC89220m implements AbstractC89172b<EditDuetStickerState, EditDuetStickerState> {

        /* renamed from: a */
        public static final C82811b f185108a = new C82811b();

        static {
            Covode.recordClassIndex(96665);
        }

        C82811b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditDuetStickerState invoke(EditDuetStickerState editDuetStickerState) {
            EditDuetStickerState editDuetStickerState2 = editDuetStickerState;
            C89219l.m154721d(editDuetStickerState2, "");
            return EditDuetStickerState.copy$default(editDuetStickerState2, new C20526p(), null, 0.0f, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.duet.EditDuetStickerViewModel$d */
    static final class C82813d extends AbstractC89220m implements AbstractC89172b<EditDuetStickerState, EditDuetStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f185110a;

        static {
            Covode.recordClassIndex(96667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82813d(float f) {
            super(1);
            this.f185110a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditDuetStickerState invoke(EditDuetStickerState editDuetStickerState) {
            EditDuetStickerState editDuetStickerState2 = editDuetStickerState;
            C89219l.m154721d(editDuetStickerState2, "");
            return EditDuetStickerState.copy$default(editDuetStickerState2, null, null, this.f185110a, null, 11, null);
        }
    }

    public EditDuetStickerViewModel(C82815b bVar) {
        C89219l.m154721d(bVar, "");
        this.f185105a = bVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: a */
    public final void mo127879a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        m143000k().mo127893a(vESize);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: a */
    public final void mo127880a(String str) {
        C89219l.m154721d(str, "");
        m143000k().mo127895d().f159339b = str;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a
    /* renamed from: a */
    public final void mo127881a(boolean z) {
        mo33689c(new C82810a(z));
    }
}
