package com.p2082ss.android.ugc.gamora.editor.sticker.poll;

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

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.EditPollStickerViewModel */
public final class EditPollStickerViewModel extends LifecycleAwareViewModel<EditPollStickerState> implements AbstractC82957a {

    /* renamed from: a */
    public final C82958b f185364a;

    /* renamed from: b */
    private final AbstractC89244h f185365b = C89250i.m154773a((AbstractC89171a) new C82955c(this));

    static {
        Covode.recordClassIndex(96815);
    }

    /* renamed from: m */
    private final C82961c m143214m() {
        return (C82961c) this.f185365b.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: a */
    public final void mo128016a() {
        this.f185364a.mo23032c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: b */
    public final void mo128021b() {
        mo33689c(C82954b.f185367a);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.EditPollStickerViewModel$c */
    static final class C82955c extends AbstractC89220m implements AbstractC89171a<C82961c> {

        /* renamed from: a */
        final /* synthetic */ EditPollStickerViewModel f185368a;

        static {
            Covode.recordClassIndex(96818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82955c(EditPollStickerViewModel editPollStickerViewModel) {
            super(0);
            this.f185368a = editPollStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82961c invoke() {
            return this.f185368a.f185364a.mo128032a();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: c */
    public final void mo128023c() {
        m143214m().mo128036d().mo112446q();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditPollStickerState(null, null, 0.0f, null, 15, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: e */
    public final void mo128024e() {
        m143214m().mo128036d().mo112285d();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: g */
    public final InteractStickerStruct mo128026g() {
        return m143214m().mo128036d().mo112284c();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: h */
    public final boolean mo128027h() {
        return m143214m().mo128036d().f159636B;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: i */
    public final AbstractC45898d mo128028i() {
        return m143214m().mo128036d();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: j */
    public final String mo128029j() {
        return m143214m().mo128036d().f159649b;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: k */
    public final boolean mo128030k() {
        return m143214m().mo128036d().mo112283b();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: l */
    public final boolean mo128031l() {
        return m143214m().mo128036d().mo112312a();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: f */
    public final void mo128025f() {
        C82961c m = m143214m();
        List<InteractStickerStruct> a = C71073b.m125565a(m.mo128033a().getMainBusinessContext(), 1, EnumC71088d.TRACK_PAGE_EDIT);
        m.mo128036d().mo112306a(m.mo128035b().mo114778C().getValue(), m.mo128035b());
        if (a != null && !a.isEmpty()) {
            InteractStickerStruct interactStickerStruct = a.get(0);
            C89219l.m154716b(interactStickerStruct, "");
            if (interactStickerStruct.getPollStruct() != null) {
                m.mo128036d().mo112310a(a.get(0));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: a */
    public final void mo128017a(float f) {
        mo33689c(new C82956d(f));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: b */
    public final void mo128022b(String str) {
        C89219l.m154721d(str, "");
        m143214m().mo128036d().f159650c = str;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.EditPollStickerViewModel$a */
    static final class C82953a extends AbstractC89220m implements AbstractC89172b<EditPollStickerState, EditPollStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f185366a;

        static {
            Covode.recordClassIndex(96816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82953a(boolean z) {
            super(1);
            this.f185366a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPollStickerState invoke(EditPollStickerState editPollStickerState) {
            EditPollStickerState editPollStickerState2 = editPollStickerState;
            C89219l.m154721d(editPollStickerState2, "");
            return EditPollStickerState.copy$default(editPollStickerState2, null, Boolean.valueOf(this.f185366a), 0.0f, null, 13, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.EditPollStickerViewModel$b */
    public static final class C82954b extends AbstractC89220m implements AbstractC89172b<EditPollStickerState, EditPollStickerState> {

        /* renamed from: a */
        public static final C82954b f185367a = new C82954b();

        static {
            Covode.recordClassIndex(96817);
        }

        C82954b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPollStickerState invoke(EditPollStickerState editPollStickerState) {
            EditPollStickerState editPollStickerState2 = editPollStickerState;
            C89219l.m154721d(editPollStickerState2, "");
            return EditPollStickerState.copy$default(editPollStickerState2, new C20526p(), null, 0.0f, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.poll.EditPollStickerViewModel$d */
    static final class C82956d extends AbstractC89220m implements AbstractC89172b<EditPollStickerState, EditPollStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f185369a;

        static {
            Covode.recordClassIndex(96819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82956d(float f) {
            super(1);
            this.f185369a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPollStickerState invoke(EditPollStickerState editPollStickerState) {
            EditPollStickerState editPollStickerState2 = editPollStickerState;
            C89219l.m154721d(editPollStickerState2, "");
            return EditPollStickerState.copy$default(editPollStickerState2, null, null, this.f185369a, null, 11, null);
        }
    }

    public EditPollStickerViewModel(C82958b bVar) {
        C89219l.m154721d(bVar, "");
        this.f185364a = bVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: a */
    public final void mo128018a(VESize vESize) {
        C89219l.m154721d(vESize, "");
        m143214m().mo128034a(vESize);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: a */
    public final void mo128019a(String str) {
        C89219l.m154721d(str, "");
        m143214m().mo128036d().f159649b = str;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a
    /* renamed from: a */
    public final void mo128020a(boolean z) {
        mo33689c(new C82953a(z));
    }
}
