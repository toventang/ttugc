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

/* renamed from: com.ss.android.ugc.gamora.editor.EditHashTagStickerViewModel */
public final class EditHashTagStickerViewModel extends JediViewModel<EditHashTagStickerState> {

    /* renamed from: a */
    private final AbstractC89244h f183549a = C89250i.m154773a((AbstractC89171a) C82014c.f183552a);

    static {
        Covode.recordClassIndex(95832);
    }

    /* renamed from: a */
    public final C1213t<Float> mo127213a() {
        return (C1213t) this.f183549a.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditHashTagStickerViewModel$c */
    static final class C82014c extends AbstractC89220m implements AbstractC89171a<C1213t<Float>> {

        /* renamed from: a */
        public static final C82014c f183552a = new C82014c();

        static {
            Covode.recordClassIndex(95835);
        }

        C82014c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Float> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: b */
    public final void mo127215b() {
        mo33689c(C82013b.f183551a);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ EditHashTagStickerState mo23027d() {
        return new EditHashTagStickerState(null, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditHashTagStickerViewModel$a */
    public static final class C82012a extends AbstractC89220m implements AbstractC89172b<EditHashTagStickerState, EditHashTagStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f183550a;

        static {
            Covode.recordClassIndex(95833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82012a(boolean z) {
            super(1);
            this.f183550a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditHashTagStickerState invoke(EditHashTagStickerState editHashTagStickerState) {
            EditHashTagStickerState editHashTagStickerState2 = editHashTagStickerState;
            C89219l.m154721d(editHashTagStickerState2, "");
            return EditHashTagStickerState.copy$default(editHashTagStickerState2, null, Boolean.valueOf(this.f183550a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditHashTagStickerViewModel$b */
    static final class C82013b extends AbstractC89220m implements AbstractC89172b<EditHashTagStickerState, EditHashTagStickerState> {

        /* renamed from: a */
        public static final C82013b f183551a = new C82013b();

        static {
            Covode.recordClassIndex(95834);
        }

        C82013b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditHashTagStickerState invoke(EditHashTagStickerState editHashTagStickerState) {
            EditHashTagStickerState editHashTagStickerState2 = editHashTagStickerState;
            C89219l.m154721d(editHashTagStickerState2, "");
            return EditHashTagStickerState.copy$default(editHashTagStickerState2, new C20526p(), null, 2, null);
        }
    }

    /* renamed from: a */
    public final void mo127214a(float f) {
        mo127213a().setValue(Float.valueOf(f));
    }
}
