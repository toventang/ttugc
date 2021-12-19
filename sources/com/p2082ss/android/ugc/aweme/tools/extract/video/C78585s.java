package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.s */
final /* synthetic */ class C78585s implements AbstractC1729g {

    /* renamed from: a */
    private final VideoFramesUploadService f176617a;

    /* renamed from: b */
    private final C78582p f176618b;

    /* renamed from: c */
    private final C78579n f176619c;

    static {
        Covode.recordClassIndex(91719);
    }

    C78585s(VideoFramesUploadService videoFramesUploadService, C78582p pVar, C78579n nVar) {
        this.f176617a = videoFramesUploadService;
        this.f176618b = pVar;
        this.f176619c = nVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C78582p pVar = this.f176618b;
        C78579n nVar = this.f176619c;
        if (iVar.mo5544c()) {
            C63244g.m114602a().mo73287o().mo104792l().mo104818a("extract_frame", iVar.mo5546e());
            return null;
        }
        VideoFramesUploadService.m137174a(pVar, nVar);
        return null;
    }
}
