package com.p2082ss.android.ugc.gamora.editor;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel */
public final class EditCommentStickerViewModel extends BaseJediViewModel<EditCommentStickerState> {

    /* renamed from: a */
    C1213t<Boolean> f183542a;

    /* renamed from: b */
    private final AbstractC89244h f183543b = C89250i.m154773a((AbstractC89171a) C82011e.f183548a);

    static {
        Covode.recordClassIndex(95825);
    }

    /* renamed from: b */
    public final C1213t<Float> mo127202b() {
        return (C1213t) this.f183543b.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel$e */
    static final class C82011e extends AbstractC89220m implements AbstractC89171a<C1213t<Float>> {

        /* renamed from: a */
        public static final C82011e f183548a = new C82011e();

        static {
            Covode.recordClassIndex(95830);
        }

        C82011e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Float> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: a */
    public final void mo127199a() {
        mo33689c(C82007a.f183544a);
    }

    /* renamed from: g */
    public final void mo127204g() {
        mo33689c(C82008b.f183545a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditCommentStickerState(null, false, null, null, 15, null);
    }

    /* renamed from: a */
    public final void mo127200a(float f) {
        mo127202b().setValue(Float.valueOf(f));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel$a */
    static final class C82007a extends AbstractC89220m implements AbstractC89172b<EditCommentStickerState, EditCommentStickerState> {

        /* renamed from: a */
        public static final C82007a f183544a = new C82007a();

        static {
            Covode.recordClassIndex(95826);
        }

        C82007a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditCommentStickerState invoke(EditCommentStickerState editCommentStickerState) {
            EditCommentStickerState editCommentStickerState2 = editCommentStickerState;
            C89219l.m154721d(editCommentStickerState2, "");
            return EditCommentStickerState.copy$default(editCommentStickerState2, new C20526p(), false, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel$b */
    static final class C82008b extends AbstractC89220m implements AbstractC89172b<EditCommentStickerState, EditCommentStickerState> {

        /* renamed from: a */
        public static final C82008b f183545a = new C82008b();

        static {
            Covode.recordClassIndex(95827);
        }

        C82008b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditCommentStickerState invoke(EditCommentStickerState editCommentStickerState) {
            EditCommentStickerState editCommentStickerState2 = editCommentStickerState;
            C89219l.m154721d(editCommentStickerState2, "");
            return EditCommentStickerState.copy$default(editCommentStickerState2, null, false, null, new C20526p(), 7, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel$c */
    public static final class C82009c extends AbstractC89220m implements AbstractC89172b<EditCommentStickerState, EditCommentStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f183546a;

        static {
            Covode.recordClassIndex(95828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82009c(boolean z) {
            super(1);
            this.f183546a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditCommentStickerState invoke(EditCommentStickerState editCommentStickerState) {
            EditCommentStickerState editCommentStickerState2 = editCommentStickerState;
            C89219l.m154721d(editCommentStickerState2, "");
            return EditCommentStickerState.copy$default(editCommentStickerState2, null, false, new C20521k(this.f183546a), null, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel$d */
    static final class C82010d extends AbstractC89220m implements AbstractC89172b<EditCommentStickerState, EditCommentStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f183547a;

        static {
            Covode.recordClassIndex(95829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82010d(boolean z) {
            super(1);
            this.f183547a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditCommentStickerState invoke(EditCommentStickerState editCommentStickerState) {
            EditCommentStickerState editCommentStickerState2 = editCommentStickerState;
            C89219l.m154721d(editCommentStickerState2, "");
            return EditCommentStickerState.copy$default(editCommentStickerState2, null, this.f183547a, null, null, 13, null);
        }
    }

    /* renamed from: a */
    public final void mo127201a(boolean z) {
        mo33689c(new C82009c(z));
    }

    /* renamed from: b */
    public final void mo127203b(boolean z) {
        mo33689c(new C82010d(z));
        C1213t<Boolean> tVar = this.f183542a;
        if (tVar != null && (!C89219l.m154714a(tVar.getValue(), Boolean.valueOf(z)))) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }
}
