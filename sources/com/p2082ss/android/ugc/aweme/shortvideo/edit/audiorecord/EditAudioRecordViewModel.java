package com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel */
public final class EditAudioRecordViewModel extends LifecycleAwareViewModel<EditAudioRecordState> implements AbstractC70892c {

    /* renamed from: a */
    public boolean f158697a;

    /* renamed from: b */
    final C1213t<Boolean> f158698b = new C1213t<>();

    static {
        Covode.recordClassIndex(83377);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c
    /* renamed from: e */
    public final LiveData<Boolean> mo112055e() {
        return this.f158698b;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c
    /* renamed from: a */
    public final void mo112052a() {
        mo33690d(C70886c.f158701a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c
    /* renamed from: b */
    public final void mo112053b() {
        mo33690d(C70885b.f158700a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c
    /* renamed from: c */
    public final void mo112054c() {
        mo33689c(C70884a.f158699a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditAudioRecordState(null, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel$a */
    static final class C70884a extends AbstractC89220m implements AbstractC89172b<EditAudioRecordState, EditAudioRecordState> {

        /* renamed from: a */
        public static final C70884a f158699a = new C70884a();

        static {
            Covode.recordClassIndex(83378);
        }

        C70884a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAudioRecordState invoke(EditAudioRecordState editAudioRecordState) {
            EditAudioRecordState editAudioRecordState2 = editAudioRecordState;
            C89219l.m154721d(editAudioRecordState2, "");
            return EditAudioRecordState.copy$default(editAudioRecordState2, null, new C20526p(), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel$b */
    static final class C70885b extends AbstractC89220m implements AbstractC89172b<EditAudioRecordState, EditAudioRecordState> {

        /* renamed from: a */
        public static final C70885b f158700a = new C70885b();

        static {
            Covode.recordClassIndex(83379);
        }

        C70885b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAudioRecordState invoke(EditAudioRecordState editAudioRecordState) {
            EditAudioRecordState editAudioRecordState2 = editAudioRecordState;
            C89219l.m154721d(editAudioRecordState2, "");
            return EditAudioRecordState.copy$default(editAudioRecordState2, new AbstractC23517a.C23518a(), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel$c */
    static final class C70886c extends AbstractC89220m implements AbstractC89172b<EditAudioRecordState, EditAudioRecordState> {

        /* renamed from: a */
        public static final C70886c f158701a = new C70886c();

        static {
            Covode.recordClassIndex(83380);
        }

        C70886c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAudioRecordState invoke(EditAudioRecordState editAudioRecordState) {
            EditAudioRecordState editAudioRecordState2 = editAudioRecordState;
            C89219l.m154721d(editAudioRecordState2, "");
            return EditAudioRecordState.copy$default(editAudioRecordState2, new AbstractC23517a.C23519b(), null, 2, null);
        }
    }
}
