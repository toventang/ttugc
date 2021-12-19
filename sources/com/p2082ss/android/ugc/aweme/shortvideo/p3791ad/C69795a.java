package com.p2082ss.android.ugc.aweme.shortvideo.p3791ad;

import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ad.a */
public final class C69795a extends AbstractC69796b {
    static {
        Covode.recordClassIndex(82201);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3791ad.AbstractC69796b
    /* renamed from: a */
    public final void mo110147a() {
        C73991bj.m130128a("AudioCaptureControlStrategy initAudio() called");
        this.f155979a.mo56931c(new PrivacyCert(new C13349j("1055"), "Record audio  when shooting video.", new C13350k[]{C13401b.m24108b()}));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3791ad.AbstractC69796b
    /* renamed from: b */
    public final void mo110148b() {
        C73991bj.m130128a("AudioCaptureControlStrategy releaseAudio() called");
        this.f155979a.mo56933d(new PrivacyCert(new C13349j("1060"), "Record audio  when shooting video.", new C13350k[]{C13401b.m24108b()}));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69795a(ASCameraView aSCameraView) {
        super(aSCameraView);
        C89219l.m154721d(aSCameraView, "");
    }
}
