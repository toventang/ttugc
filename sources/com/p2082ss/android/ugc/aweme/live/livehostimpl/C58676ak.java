package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.ak */
public final class C58676ak {
    static {
        Covode.recordClassIndex(68978);
    }

    /* renamed from: a */
    public static IStickerService.FaceSticker m107826a(C11672a aVar) {
        IStickerService.FaceSticker faceSticker = new IStickerService.FaceSticker();
        if (aVar != null) {
            faceSticker.stickerId = aVar.f27893a;
            faceSticker.name = aVar.f27897e;
            C2962b bVar = aVar.f27896d;
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            if (bVar != null) {
                toolsUrlModel.f174537a = bVar.f8711a;
                toolsUrlModel.f174538b = bVar.f8712b;
            }
            faceSticker.iconUrl = toolsUrlModel;
            faceSticker.hint = aVar.f27898f;
            faceSticker.localPath = aVar.f27899g;
            faceSticker.types = aVar.f27902j;
            faceSticker.extra = aVar.f27885A;
            faceSticker.hint = aVar.f27898f;
            faceSticker.tags = aVar.f27901i;
        }
        return faceSticker;
    }

    /* renamed from: a */
    public static C11672a m107825a(IStickerService.FaceSticker faceSticker) {
        C11672a aVar = new C11672a();
        if (faceSticker != null) {
            aVar.f27893a = faceSticker.stickerId;
            aVar.mo18442b(String.valueOf(faceSticker.stickerId));
            aVar.f27897e = faceSticker.name;
            ToolsUrlModel toolsUrlModel = faceSticker.iconUrl;
            C2962b bVar = new C2962b();
            if (toolsUrlModel != null) {
                bVar.f8711a = toolsUrlModel.f174537a;
                bVar.f8712b = toolsUrlModel.f174538b;
            }
            aVar.f27896d = bVar;
            aVar.f27898f = faceSticker.hint;
            aVar.mo18444c(faceSticker.localPath);
            aVar.f27901i = faceSticker.tags;
            aVar.f27902j = faceSticker.types;
            aVar.f27885A = faceSticker.extra;
            aVar.mo18440a(String.valueOf(faceSticker.stickerId));
            aVar.f27915w = faceSticker.isVideoUsedSticker;
            try {
                C28022o j = C28024q.m56139a(faceSticker.extra).mo46789j();
                if (!j.mo46802b("gift_sticker") || !j.mo46803c("gift_sticker").mo46695h()) {
                    aVar.f27910r.addAll(Arrays.asList(1, 2));
                }
                if (j.mo46802b("Review_original_frame")) {
                    aVar.f27913u = j.mo46803c("Review_original_frame").mo46695h();
                }
            } catch (Throwable unused) {
                aVar.f27910r.addAll(Arrays.asList(1, 2));
            }
        }
        return aVar;
    }
}
