package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttuploader.TTImageInfo;
import com.p2082ss.ttuploader.TTImageUploader;
import com.p2082ss.ttuploader.TTImageUploaderListener;
import com.p2082ss.ttuploader.UploadEventManager;
import org.json.JSONArray;
import p077b.C1743j;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.u */
public final /* synthetic */ class C78587u implements TTImageUploaderListener {

    /* renamed from: a */
    private final VideoFramesUploadService f176621a;

    /* renamed from: b */
    private final TTImageUploader f176622b;

    /* renamed from: c */
    private final C78580o f176623c;

    /* renamed from: d */
    private final C1743j f176624d;

    static {
        Covode.recordClassIndex(91721);
    }

    C78587u(VideoFramesUploadService videoFramesUploadService, TTImageUploader tTImageUploader, C78580o oVar, C1743j jVar) {
        this.f176621a = videoFramesUploadService;
        this.f176622b = tTImageUploader;
        this.f176623c = oVar;
        this.f176624d = jVar;
    }

    @Override // com.p2082ss.ttuploader.TTImageUploaderListener
    public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        TTImageUploader tTImageUploader = this.f176622b;
        C78580o oVar = this.f176623c;
        C1743j jVar = this.f176624d;
        if (i == 3) {
            tTImageUploader.close();
            oVar.f176588c = tTImageInfo.mImageUri;
            jVar.mo5557b(oVar);
        } else if (i == 4) {
            JSONArray popAllImageEvents = UploadEventManager.instance.popAllImageEvents();
            VideoFramesUploadService.m137169a(15, "upload zip file failed video id = " + oVar.f176587b + ", msg: " + tTImageInfo.mExtra + ", code: " + tTImageInfo.mErrcode);
            tTImageUploader.close();
            VideoFramesUploadService.m137171a(oVar, tTImageInfo.mErrcode, "what : " + i + ", code: " + tTImageInfo.mErrcode + ", events: " + popAllImageEvents.toString());
            jVar.mo5556b((Exception) new IllegalStateException("upload zip file failed"));
        }
    }
}
