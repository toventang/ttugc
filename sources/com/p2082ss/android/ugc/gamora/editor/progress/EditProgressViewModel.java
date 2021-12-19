package com.p2082ss.android.ugc.gamora.editor.progress;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel */
public final class EditProgressViewModel extends LifecycleAwareViewModel<EditProgressState> implements AbstractC82478a {

    /* renamed from: b */
    private boolean f184452b = true;

    static {
        Covode.recordClassIndex(96317);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a
    /* renamed from: a */
    public final boolean mo127564a() {
        return this.f184452b;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a
    /* renamed from: b */
    public final void mo127565b() {
        mo33689c(C82477b.f184454a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditProgressState(null, null, 3, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a
    /* renamed from: a */
    public final void mo127563a(boolean z) {
        this.f184452b = z;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a
    /* renamed from: a */
    public final void mo127562a(int i) {
        mo33689c(new C82476a(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel$a */
    public static final class C82476a extends AbstractC89220m implements AbstractC89172b<EditProgressState, EditProgressState> {

        /* renamed from: a */
        final /* synthetic */ int f184453a;

        static {
            Covode.recordClassIndex(96318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82476a(int i) {
            super(1);
            this.f184453a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditProgressState invoke(EditProgressState editProgressState) {
            EditProgressState editProgressState2 = editProgressState;
            C89219l.m154721d(editProgressState2, "");
            return EditProgressState.copy$default(editProgressState2, null, new C20523m(this.f184453a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel$b */
    static final class C82477b extends AbstractC89220m implements AbstractC89172b<EditProgressState, EditProgressState> {

        /* renamed from: a */
        public static final C82477b f184454a = new C82477b();

        static {
            Covode.recordClassIndex(96319);
        }

        C82477b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditProgressState invoke(EditProgressState editProgressState) {
            EditProgressState editProgressState2 = editProgressState;
            C89219l.m154721d(editProgressState2, "");
            return EditProgressState.copy$default(editProgressState2, new AbstractC23517a.C23519b(), null, 2, null);
        }
    }
}
