package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.utils.C80368e;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.ar */
public final class C72770ar implements AbstractC31014b {

    /* renamed from: b */
    public static final C72771a f163158b = new C72771a((byte) 0);

    /* renamed from: a */
    public final List<C40964c.C40967b> f163159a = new ArrayList();

    /* renamed from: c */
    private final String f163160c;

    static {
        Covode.recordClassIndex(85456);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.ar$a */
    public static final class C72771a {
        static {
            Covode.recordClassIndex(85457);
        }

        private C72771a() {
        }

        public /* synthetic */ C72771a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.ar$b */
    public static final class C72772b extends C40964c.C40967b {

        /* renamed from: a */
        final /* synthetic */ AbstractC31014b.AbstractC31015a f163161a;

        static {
            Covode.recordClassIndex(85458);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.C40967b, com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
        /* renamed from: a */
        public final void mo70154a() {
            this.f163161a.mo56119b();
        }

        @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.C40967b, com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
        /* renamed from: b */
        public final void mo70155b() {
            this.f163161a.mo56118a();
        }

        C72772b(AbstractC31014b.AbstractC31015a aVar) {
            this.f163161a = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: k */
    public final void mo56111k() {
        C80368e.m139341a(this.f163160c);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: l */
    public final void mo56112l() {
        C80368e.m139343b(this.f163160c);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: m */
    public final void mo56113m() {
        C80368e.m139344c(this.f163160c);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: q */
    public final void mo56117q() {
        Iterator<T> it = this.f163159a.iterator();
        while (it.hasNext()) {
            C40964c.C40968c.f95804a.mo70146b(it.next());
        }
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: i */
    public final void mo56109i() {
        C84911q.m145928d("AVSecurityMobHelper onInitMic creationId: " + this.f163160c + " currentPage " + C80368e.m139340a());
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: j */
    public final void mo56110j() {
        C84911q.m145928d("AVSecurityMobHelper onInitMicSuccess creationId: " + this.f163160c + " currentPage " + C80368e.m139340a());
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: a */
    public final void mo56095a() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onOpenCamera creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_camera_open", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: b */
    public final void mo56099b() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onOpenCameraSuccess creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_camera_open_success", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: c */
    public final void mo56101c() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onReleaseCamera creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_camera_release", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: d */
    public final void mo56103d() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onReleaseCameraSuccess creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_camera_release_success", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: e */
    public final void mo56105e() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onStartPreview creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_camera_start_preview", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: f */
    public final void mo56106f() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onStartPreviewSuccess creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_camera_start_preview_success", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: g */
    public final void mo56107g() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onStopPreview creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_camera_stop_preview", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: h */
    public final void mo56108h() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onStopPreviewSuccess creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_camera_stop_preview_success", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: n */
    public final void mo56114n() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onReleaseMicSuccess creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_mic_release_success", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: o */
    public final void mo56115o() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onOpenFlash creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_flash_open", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: p */
    public final void mo56116p() {
        String str = this.f163160c;
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onCloseFlash creationId: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_flash_close", new C84425b().mo129406a("creation_id", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    public C72770ar(String str) {
        C89219l.m154721d(str, "");
        this.f163160c = str;
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: a */
    public final void mo56097a(AbstractC31014b.AbstractC31015a aVar) {
        C89219l.m154721d(aVar, "");
        C72772b bVar = new C72772b(aVar);
        this.f163159a.add(bVar);
        C40964c.C40968c.f95804a.mo70143a(bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: a */
    public final void mo56098a(String str) {
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onInitMicFailed creationId: " + this.f163160c + " currentPage " + C80368e.m139340a());
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: b */
    public final void mo56100b(int i, String str) {
        C89219l.m154721d(str, "");
        C80368e.m139342a(this.f163160c, i, str);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: a */
    public final void mo56096a(int i, String str) {
        C89219l.m154721d(str, "");
        String str2 = this.f163160c;
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onOpenCameraFailed creationId: " + str2 + " errCode: " + i + " msg: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_camera_open_fail", new C84425b().mo129406a("creation_id", str2).mo129403a("error_code", i).mo129406a("msg", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: c */
    public final void mo56102c(int i, String str) {
        C89219l.m154721d(str, "");
        String str2 = this.f163160c;
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onReleaseMicFailed creationId: " + str2 + " errCode: " + i + " msg: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_mic_release_fail", new C84425b().mo129406a("creation_id", str2).mo129403a("error_code", i).mo129406a("msg", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b
    /* renamed from: d */
    public final void mo56104d(int i, String str) {
        C89219l.m154721d(str, "");
        String str2 = this.f163160c;
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C84911q.m145928d("AVSecurityMobHelper onOpenFlashFailed creationId: " + str2 + " errCode: " + i + " msg: " + str + " currentPage " + C80368e.m139340a());
        C39162r.m79460a("tool_flash_open_fail", new C84425b().mo129406a("creation_id", str2).mo129403a("error_code", i).mo129406a("msg", str).mo129406a("page", C80368e.m139340a()).f188764a);
    }
}
