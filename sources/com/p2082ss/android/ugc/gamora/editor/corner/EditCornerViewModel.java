package com.p2082ss.android.ugc.gamora.editor.corner;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel */
public final class EditCornerViewModel extends LifecycleAwareViewModel<EditCornerState> implements AbstractC82088a {
    static {
        Covode.recordClassIndex(95909);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.corner.AbstractC82088a
    /* renamed from: a */
    public final void mo127317a() {
        mo33689c(C82087d.f183671a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditCornerState(null, null, null, null, 15, null);
    }

    /* renamed from: a */
    public final void mo127318a(int i) {
        mo33689c(new C82086c(i));
    }

    /* renamed from: b */
    public final void mo127320b(int i) {
        mo33689c(new C82084a(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel$a */
    public static final class C82084a extends AbstractC89220m implements AbstractC89172b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        final /* synthetic */ int f183668a;

        static {
            Covode.recordClassIndex(95910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82084a(int i) {
            super(1);
            this.f183668a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditCornerState invoke(EditCornerState editCornerState) {
            EditCornerState editCornerState2 = editCornerState;
            C89219l.m154721d(editCornerState2, "");
            return EditCornerState.copy$default(editCornerState2, null, null, Integer.valueOf(this.f183668a), null, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel$b */
    static final class C82085b extends AbstractC89220m implements AbstractC89172b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f183669a;

        static {
            Covode.recordClassIndex(95911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82085b(boolean z) {
            super(1);
            this.f183669a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditCornerState invoke(EditCornerState editCornerState) {
            EditCornerState editCornerState2 = editCornerState;
            C89219l.m154721d(editCornerState2, "");
            return EditCornerState.copy$default(editCornerState2, Boolean.valueOf(this.f183669a), null, null, null, 14, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel$c */
    public static final class C82086c extends AbstractC89220m implements AbstractC89172b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        final /* synthetic */ int f183670a;

        static {
            Covode.recordClassIndex(95912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82086c(int i) {
            super(1);
            this.f183670a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditCornerState invoke(EditCornerState editCornerState) {
            EditCornerState editCornerState2 = editCornerState;
            C89219l.m154721d(editCornerState2, "");
            return EditCornerState.copy$default(editCornerState2, null, Integer.valueOf(this.f183670a), null, null, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel$d */
    static final class C82087d extends AbstractC89220m implements AbstractC89172b<EditCornerState, EditCornerState> {

        /* renamed from: a */
        public static final C82087d f183671a = new C82087d();

        static {
            Covode.recordClassIndex(95913);
        }

        C82087d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditCornerState invoke(EditCornerState editCornerState) {
            EditCornerState editCornerState2 = editCornerState;
            C89219l.m154721d(editCornerState2, "");
            return EditCornerState.copy$default(editCornerState2, null, null, null, new AbstractC23517a.C23519b(), 7, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.corner.AbstractC82088a
    /* renamed from: a */
    public final void mo127319a(boolean z) {
        mo33689c(new C82085b(z));
    }
}
