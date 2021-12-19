package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.AbstractServiceC0583f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83063g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ck */
public final class C69932ck {
    static {
        Covode.recordClassIndex(82341);
    }

    /* renamed from: a */
    static final /* synthetic */ C1731i m123509a(Context context) {
        try {
            AbstractServiceC0583f.enqueueWork(context, OriginalSoundUploadService.class, 3008, new Intent());
            return null;
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    static void m123510a(VideoPublishEditModel videoPublishEditModel) {
        TextStickerData textStickerData;
        if (C83063g.m143407a() && videoPublishEditModel != null && videoPublishEditModel.infoStickerModel != null && videoPublishEditModel.infoStickerModel.stickers != null && !videoPublishEditModel.infoStickerModel.stickers.isEmpty()) {
            try {
                for (StickerItemModel stickerItemModel : videoPublishEditModel.infoStickerModel.stickers) {
                    if (stickerItemModel.isTextSticker() && (textStickerData = (TextStickerData) C63244g.m114602a().mo73261G().mo46670a(stickerItemModel.extra, TextStickerData.class)) != null) {
                        for (String str : textStickerData.getAudioPathList()) {
                            C80720e.m139931c(str);
                        }
                    }
                }
            } catch (Throwable th) {
                C51423a.m95787a("removeAudioFile failed: " + th.getMessage());
            }
        }
    }
}
