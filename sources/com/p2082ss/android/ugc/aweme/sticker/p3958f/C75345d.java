package com.p2082ss.android.ugc.aweme.sticker.p3958f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.f.d */
public final class C75345d {
    static {
        Covode.recordClassIndex(88263);
    }

    /* renamed from: a */
    private static ToolsUrlModel m132153a(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
        toolsUrlModel.f174537a = urlModel.getUri();
        toolsUrlModel.f174538b = urlModel.getUrlList();
        return toolsUrlModel;
    }

    /* renamed from: a */
    public static final IStickerService.FaceSticker m132152a(Effect effect) {
        if (effect == null) {
            return null;
        }
        IStickerService.FaceSticker faceSticker = new IStickerService.FaceSticker();
        faceSticker.f118514id = effect.getId();
        faceSticker.stickerId = Long.parseLong(effect.getEffectId());
        faceSticker.fileUrl = m132153a(effect.getFileUrl());
        faceSticker.iconUrl = m132153a(effect.getIconUrl());
        faceSticker.localPath = effect.getUnzipPath();
        faceSticker.name = effect.getName();
        faceSticker.hint = effect.getHint();
        faceSticker.types = effect.getTypes();
        faceSticker.tags = effect.getTags();
        faceSticker.requirements = effect.getRequirements();
        faceSticker.sdkExtra = effect.getSdkExtra();
        faceSticker.extra = effect.getExtra();
        return faceSticker;
    }
}
