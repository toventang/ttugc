package com.p2082ss.android.ugc.gamora.editor.volume;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.volume.EditVolumeViewModel */
public final class EditVolumeViewModel extends LifecycleAwareViewModel<EditVolumeState> implements AbstractC83369a {
    static {
        Covode.recordClassIndex(97250);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a
    /* renamed from: a */
    public final void mo128383a() {
        mo33689c(C83368d.f186206a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditVolumeState(null, null, null, null, 15, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a
    /* renamed from: a */
    public final void mo128384a(int i) {
        mo33689c(new C83366b(i));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.EditVolumeViewModel$a */
    static final class C83365a extends AbstractC89220m implements AbstractC89172b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ String f186203a;

        static {
            Covode.recordClassIndex(97251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83365a(String str) {
            super(1);
            this.f186203a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditVolumeState invoke(EditVolumeState editVolumeState) {
            EditVolumeState editVolumeState2 = editVolumeState;
            C89219l.m154721d(editVolumeState2, "");
            return EditVolumeState.copy$default(editVolumeState2, this.f186203a, null, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.EditVolumeViewModel$b */
    static final class C83366b extends AbstractC89220m implements AbstractC89172b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ int f186204a;

        static {
            Covode.recordClassIndex(97252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83366b(int i) {
            super(1);
            this.f186204a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditVolumeState invoke(EditVolumeState editVolumeState) {
            EditVolumeState editVolumeState2 = editVolumeState;
            C89219l.m154721d(editVolumeState2, "");
            return EditVolumeState.copy$default(editVolumeState2, null, null, Integer.valueOf(this.f186204a), null, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.EditVolumeViewModel$c */
    static final class C83367c extends AbstractC89220m implements AbstractC89172b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ String f186205a;

        static {
            Covode.recordClassIndex(97253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83367c(String str) {
            super(1);
            this.f186205a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditVolumeState invoke(EditVolumeState editVolumeState) {
            EditVolumeState editVolumeState2 = editVolumeState;
            C89219l.m154721d(editVolumeState2, "");
            return EditVolumeState.copy$default(editVolumeState2, null, this.f186205a, null, null, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.volume.EditVolumeViewModel$d */
    static final class C83368d extends AbstractC89220m implements AbstractC89172b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        public static final C83368d f186206a = new C83368d();

        static {
            Covode.recordClassIndex(97254);
        }

        C83368d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditVolumeState invoke(EditVolumeState editVolumeState) {
            EditVolumeState editVolumeState2 = editVolumeState;
            C89219l.m154721d(editVolumeState2, "");
            return EditVolumeState.copy$default(editVolumeState2, null, null, null, new AbstractC23517a.C23519b(), 7, null);
        }
    }
}
