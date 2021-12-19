package com.p2082ss.android.ugc.aweme.story.record.recordcontrol;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.b */
public final class C77621b extends AbstractC77620a {
    static {
        Covode.recordClassIndex(90660);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.record.recordcontrol.AbstractC77620a
    /* renamed from: a */
    public final void mo121158a() {
        C73991bj.m130128a("AudioCaptureControlStrategy initAudio() called");
        this.f174112a.mo56931c(PrivacyCert.Builder.Companion.with("bpea-304").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77621b(ASCameraView aSCameraView) {
        super(aSCameraView);
        C89219l.m154721d(aSCameraView, "");
    }
}
