package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import java.io.File;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.utils.k */
public final /* synthetic */ class C3733k implements AbstractC88433f {

    /* renamed from: a */
    private final StickerImageUploader f10331a;

    /* renamed from: b */
    private final StickerImageUploader.C3713c f10332b;

    static {
        Covode.recordClassIndex(4248);
    }

    C3733k(StickerImageUploader stickerImageUploader, StickerImageUploader.C3713c cVar) {
        this.f10331a = stickerImageUploader;
        this.f10332b = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f10331a;
        StickerImageUploader.C3713c cVar = this.f10332b;
        File file = (File) obj;
        if (file == null) {
            C3854a.m9453a(6, "StickerImageUploader", "compress file fail->" + cVar.f10288b);
            stickerImageUploader.f10282c = false;
            stickerImageUploader.mo9024a();
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedFile("image/jpeg", file));
        stickerImageUploader.f10280a = ((StickerImageUploader.UploadStickerImageApi) C5805e.m12718a().mo11572a(StickerImageUploader.UploadStickerImageApi.class)).upload(multipartTypedOutput, cVar.f10289c, cVar.f10290d).mo142910a(new C11191f()).mo142915a(new C3735m(stickerImageUploader, cVar), new C3736n(stickerImageUploader, cVar));
    }
}
