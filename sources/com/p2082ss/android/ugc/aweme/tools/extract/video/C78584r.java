package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.Iterator;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.r */
final /* synthetic */ class C78584r implements AbstractC1729g {

    /* renamed from: a */
    private final VideoFramesUploadService f176615a;

    /* renamed from: b */
    private final C78579n f176616b;

    static {
        Covode.recordClassIndex(91718);
    }

    C78584r(VideoFramesUploadService videoFramesUploadService, C78579n nVar) {
        this.f176615a = videoFramesUploadService;
        this.f176616b = nVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C78579n nVar = this.f176616b;
        if (iVar.mo5544c()) {
            return C1731i.m5632a(iVar.mo5546e());
        }
        if (VideoFramesUploadService.m137175a()) {
            return C1731i.m5632a((Exception) new IllegalStateException("stop task manually for specified case"));
        }
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "upload zip success");
        C78582p pVar = (C78582p) iVar.mo5545d();
        nVar.mo122499a(pVar);
        Iterator<C78580o> it = pVar.f176610a.iterator();
        while (it.hasNext()) {
            C84911q.m145921a(VideoFramesUploadService.f176559a + " upload zip succeed,uri:" + it.next().f176588c);
        }
        return VideoFramesUploadService.m137167a(pVar);
    }
}
