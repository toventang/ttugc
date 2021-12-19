package com.p2082ss.android.ugc.gamora.editor.cutmusic;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import p4600h.C89386u;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.EditMusicCutViewModel */
public final class EditMusicCutViewModel extends LifecycleAwareViewModel<EditMusicCutState> implements AbstractC82104a {
    static {
        Covode.recordClassIndex(95928);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a
    /* renamed from: a */
    public final void mo127330a() {
        mo33689c(C82102b.f183694a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditMusicCutState(null, null, null, 7, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a
    /* renamed from: a */
    public final void mo127331a(int i) {
        mo33689c(new C82101a(i));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.EditMusicCutViewModel$a */
    static final class C82101a extends AbstractC89220m implements AbstractC89172b<EditMusicCutState, EditMusicCutState> {

        /* renamed from: a */
        final /* synthetic */ int f183693a;

        static {
            Covode.recordClassIndex(95929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82101a(int i) {
            super(1);
            this.f183693a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicCutState invoke(EditMusicCutState editMusicCutState) {
            EditMusicCutState editMusicCutState2 = editMusicCutState;
            C89219l.m154721d(editMusicCutState2, "");
            return EditMusicCutState.copy$default(editMusicCutState2, null, Integer.valueOf(this.f183693a), null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.EditMusicCutViewModel$b */
    static final class C82102b extends AbstractC89220m implements AbstractC89172b<EditMusicCutState, EditMusicCutState> {

        /* renamed from: a */
        public static final C82102b f183694a = new C82102b();

        static {
            Covode.recordClassIndex(95930);
        }

        C82102b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicCutState invoke(EditMusicCutState editMusicCutState) {
            EditMusicCutState editMusicCutState2 = editMusicCutState;
            C89219l.m154721d(editMusicCutState2, "");
            return EditMusicCutState.copy$default(editMusicCutState2, null, null, new AbstractC23517a.C23519b(), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.EditMusicCutViewModel$c */
    static final class C82103c extends AbstractC89220m implements AbstractC89172b<EditMusicCutState, EditMusicCutState> {

        /* renamed from: a */
        final /* synthetic */ C70625d f183695a;

        /* renamed from: b */
        final /* synthetic */ int f183696b;

        /* renamed from: c */
        final /* synthetic */ int f183697c;

        static {
            Covode.recordClassIndex(95931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82103c(C70625d dVar, int i, int i2) {
            super(1);
            this.f183695a = dVar;
            this.f183696b = i;
            this.f183697c = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicCutState invoke(EditMusicCutState editMusicCutState) {
            EditMusicCutState editMusicCutState2 = editMusicCutState;
            C89219l.m154721d(editMusicCutState2, "");
            return EditMusicCutState.copy$default(editMusicCutState2, new C20391d(new C89386u(this.f183695a, Integer.valueOf(this.f183696b), Integer.valueOf(this.f183697c))), null, null, 6, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a
    /* renamed from: a */
    public final void mo127332a(C70625d dVar, int i, int i2) {
        mo33689c(new C82103c(dVar, i, i2));
    }
}
