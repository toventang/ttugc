package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import java.util.Iterator;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.q */
final /* synthetic */ class C78583q implements AbstractC1729g {

    /* renamed from: a */
    private final VideoFramesUploadService f176611a;

    /* renamed from: b */
    private final C78579n f176612b;

    /* renamed from: c */
    private final C78582p f176613c;

    /* renamed from: d */
    private final C65611c f176614d;

    static {
        Covode.recordClassIndex(91717);
    }

    C78583q(VideoFramesUploadService videoFramesUploadService, C78579n nVar, C78582p pVar, C65611c cVar) {
        this.f176611a = videoFramesUploadService;
        this.f176612b = nVar;
        this.f176613c = pVar;
        this.f176614d = cVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        VideoFramesUploadService videoFramesUploadService = this.f176611a;
        C78579n nVar = this.f176612b;
        C78582p pVar = this.f176613c;
        C65611c cVar = this.f176614d;
        if (iVar.mo5544c()) {
            return C1731i.m5632a(iVar.mo5546e());
        }
        nVar.mo122499a((C78582p) iVar.mo5545d());
        Iterator<C78580o> it = ((C78582p) iVar.mo5545d()).f176610a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "package zip success.");
        return videoFramesUploadService.mo122489a(pVar, cVar.f147854d);
    }
}
