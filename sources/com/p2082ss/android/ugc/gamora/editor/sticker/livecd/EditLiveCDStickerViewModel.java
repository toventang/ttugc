package com.p2082ss.android.ugc.gamora.editor.sticker.livecd;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.vesdk.VESize;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel */
public final class EditLiveCDStickerViewModel extends LifecycleAwareViewModel<EditLiveCDStickerState> implements AbstractC82878a {

    /* renamed from: a */
    public final C82879b f185216a;

    /* renamed from: b */
    private final AbstractC89244h f185217b = C89250i.m154773a((AbstractC89171a) new C82876d(this));

    static {
        Covode.recordClassIndex(96730);
    }

    /* renamed from: l */
    private final C82882c m143124l() {
        return (C82882c) this.f185217b.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: a */
    public final void mo127951a() {
        mo33689c(C82875c.f185220a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: b */
    public final void mo127956b() {
        this.f185216a.mo23032c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: h */
    public final void mo127962h() {
        mo33689c(C82874b.f185219a);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel$d */
    static final class C82876d extends AbstractC89220m implements AbstractC89171a<C82882c> {

        /* renamed from: a */
        final /* synthetic */ EditLiveCDStickerViewModel f185221a;

        static {
            Covode.recordClassIndex(96734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82876d(EditLiveCDStickerViewModel editLiveCDStickerViewModel) {
            super(0);
            this.f185221a = editLiveCDStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82882c invoke() {
            return this.f185221a.f185216a.mo127966a();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: c */
    public final AbstractC45898d mo127958c() {
        return m143124l().mo127970d();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditLiveCDStickerState(null, null, 0.0f, null, null, 31, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: e */
    public final void mo127959e() {
        m143124l().mo127970d().mo112285d();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: f */
    public final InteractStickerStruct mo127960f() {
        return m143124l().mo127970d().mo112284c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: g */
    public final boolean mo127961g() {
        return m143124l().mo127970d().mo112312a();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: i */
    public final boolean mo127963i() {
        return m143124l().mo127970d().mo112283b();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: j */
    public final void mo127964j() {
        m143124l().mo127970d().mo112446q();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: k */
    public final boolean mo127965k() {
        return m143124l().mo127970d().f159570A;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: a */
    public final void mo127952a(float f) {
        mo33689c(new C82877e(f));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: b */
    public final void mo127957b(String str) {
        C89219l.m154721d(str, "");
        m143124l().mo127970d().f159574b = str;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel$a */
    static final class C82873a extends AbstractC89220m implements AbstractC89172b<EditLiveCDStickerState, EditLiveCDStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f185218a;

        static {
            Covode.recordClassIndex(96731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82873a(boolean z) {
            super(1);
            this.f185218a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditLiveCDStickerState invoke(EditLiveCDStickerState editLiveCDStickerState) {
            EditLiveCDStickerState editLiveCDStickerState2 = editLiveCDStickerState;
            C89219l.m154721d(editLiveCDStickerState2, "");
            return EditLiveCDStickerState.copy$default(editLiveCDStickerState2, null, Boolean.valueOf(this.f185218a), 0.0f, null, null, 29, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel$b */
    public static final class C82874b extends AbstractC89220m implements AbstractC89172b<EditLiveCDStickerState, EditLiveCDStickerState> {

        /* renamed from: a */
        public static final C82874b f185219a = new C82874b();

        static {
            Covode.recordClassIndex(96732);
        }

        C82874b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditLiveCDStickerState invoke(EditLiveCDStickerState editLiveCDStickerState) {
            EditLiveCDStickerState editLiveCDStickerState2 = editLiveCDStickerState;
            C89219l.m154721d(editLiveCDStickerState2, "");
            return EditLiveCDStickerState.copy$default(editLiveCDStickerState2, new C20526p(), null, 0.0f, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel$c */
    static final class C82875c extends AbstractC89220m implements AbstractC89172b<EditLiveCDStickerState, EditLiveCDStickerState> {

        /* renamed from: a */
        public static final C82875c f185220a = new C82875c();

        static {
            Covode.recordClassIndex(96733);
        }

        C82875c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditLiveCDStickerState invoke(EditLiveCDStickerState editLiveCDStickerState) {
            EditLiveCDStickerState editLiveCDStickerState2 = editLiveCDStickerState;
            C89219l.m154721d(editLiveCDStickerState2, "");
            return EditLiveCDStickerState.copy$default(editLiveCDStickerState2, null, null, 0.0f, new C20526p(), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel$e */
    static final class C82877e extends AbstractC89220m implements AbstractC89172b<EditLiveCDStickerState, EditLiveCDStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f185222a;

        static {
            Covode.recordClassIndex(96735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82877e(float f) {
            super(1);
            this.f185222a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditLiveCDStickerState invoke(EditLiveCDStickerState editLiveCDStickerState) {
            EditLiveCDStickerState editLiveCDStickerState2 = editLiveCDStickerState;
            C89219l.m154721d(editLiveCDStickerState2, "");
            return EditLiveCDStickerState.copy$default(editLiveCDStickerState2, null, null, this.f185222a, null, null, 27, null);
        }
    }

    public EditLiveCDStickerViewModel(C82879b bVar) {
        C89219l.m154721d(bVar, "");
        this.f185216a = bVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: a */
    public final void mo127953a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        m143124l().mo127968a(vESize);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: a */
    public final void mo127954a(String str) {
        C89219l.m154721d(str, "");
        m143124l().mo127970d().f159573a = str;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a
    /* renamed from: a */
    public final void mo127955a(boolean z) {
        mo33689c(new C82873a(z));
    }
}
