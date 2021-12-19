package com.p2082ss.android.ugc.gamora.editor;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.JediViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditMentionStickerViewModel */
public final class EditMentionStickerViewModel extends JediViewModel<EditMentionStickerState> {

    /* renamed from: a */
    private final AbstractC89244h f183553a = C89250i.m154773a((AbstractC89171a) C82017c.f183556a);

    static {
        Covode.recordClassIndex(95837);
    }

    /* renamed from: a */
    public final C1213t<Float> mo127226a() {
        return (C1213t) this.f183553a.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMentionStickerViewModel$c */
    static final class C82017c extends AbstractC89220m implements AbstractC89171a<C1213t<Float>> {

        /* renamed from: a */
        public static final C82017c f183556a = new C82017c();

        static {
            Covode.recordClassIndex(95840);
        }

        C82017c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Float> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: b */
    public final void mo127228b() {
        mo33689c(C82016b.f183555a);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ EditMentionStickerState mo23027d() {
        return new EditMentionStickerState(null, false, null, 7, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMentionStickerViewModel$a */
    public static final class C82015a extends AbstractC89220m implements AbstractC89172b<EditMentionStickerState, EditMentionStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f183554a;

        static {
            Covode.recordClassIndex(95838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82015a(boolean z) {
            super(1);
            this.f183554a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMentionStickerState invoke(EditMentionStickerState editMentionStickerState) {
            EditMentionStickerState editMentionStickerState2 = editMentionStickerState;
            C89219l.m154721d(editMentionStickerState2, "");
            return EditMentionStickerState.copy$default(editMentionStickerState2, null, false, Boolean.valueOf(this.f183554a), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditMentionStickerViewModel$b */
    static final class C82016b extends AbstractC89220m implements AbstractC89172b<EditMentionStickerState, EditMentionStickerState> {

        /* renamed from: a */
        public static final C82016b f183555a = new C82016b();

        static {
            Covode.recordClassIndex(95839);
        }

        C82016b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMentionStickerState invoke(EditMentionStickerState editMentionStickerState) {
            EditMentionStickerState editMentionStickerState2 = editMentionStickerState;
            C89219l.m154721d(editMentionStickerState2, "");
            return EditMentionStickerState.copy$default(editMentionStickerState2, new C20526p(), false, null, 6, null);
        }
    }

    /* renamed from: a */
    public final void mo127227a(float f) {
        mo127226a().setValue(Float.valueOf(f));
    }
}
