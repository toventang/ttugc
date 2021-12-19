package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import dmt.p4542av.video.C88288n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.EditAudioEffectViewModel */
public final class EditAudioEffectViewModel extends LifecycleAwareViewModel<EditAudioEffectState> implements AbstractC70859h {
    static {
        Covode.recordClassIndex(83310);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AbstractC70859h
    /* renamed from: a */
    public final void mo111996a() {
        mo33690d(C70824b.f158576a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditAudioEffectState(null, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.EditAudioEffectViewModel$a */
    static final class C70823a extends AbstractC89220m implements AbstractC89172b<EditAudioEffectState, EditAudioEffectState> {

        /* renamed from: a */
        public static final C70823a f158575a = new C70823a();

        static {
            Covode.recordClassIndex(83311);
        }

        C70823a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAudioEffectState invoke(EditAudioEffectState editAudioEffectState) {
            EditAudioEffectState editAudioEffectState2 = editAudioEffectState;
            C89219l.m154721d(editAudioEffectState2, "");
            return EditAudioEffectState.copy$default(editAudioEffectState2, new C20526p(), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.EditAudioEffectViewModel$b */
    static final class C70824b extends AbstractC89220m implements AbstractC89172b<EditAudioEffectState, EditAudioEffectState> {

        /* renamed from: a */
        public static final C70824b f158576a = new C70824b();

        static {
            Covode.recordClassIndex(83312);
        }

        C70824b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditAudioEffectState invoke(EditAudioEffectState editAudioEffectState) {
            EditAudioEffectState editAudioEffectState2 = editAudioEffectState;
            C89219l.m154721d(editAudioEffectState2, "");
            return EditAudioEffectState.copy$default(editAudioEffectState2, null, new AbstractC23517a.C23519b(), 1, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AbstractC70859h
    /* renamed from: a */
    public final void mo111997a(AbstractC72510a aVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(aVar, "");
        aVar.mo114801a(C88288n.C88289a.m153423a());
        C70835b.m125100a(videoPublishEditModel);
        mo33690d(C70823a.f158575a);
    }
}
