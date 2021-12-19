package com.p2082ss.android.ugc.aweme.tools.extract;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.extract.C78516af;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.y */
public final class C78594y {

    /* renamed from: a */
    public static final C78594y f176631a = new C78594y();

    private C78594y() {
    }

    static {
        Covode.recordClassIndex(91728);
    }

    /* renamed from: a */
    public static C78516af m137206a(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        C89219l.m154721d(videoPublishEditModel, "");
        C78516af.C78517a aVar = new C78516af.C78517a();
        if (videoPublishEditModel.isMvThemeVideoType()) {
            aVar.mo122450a(EnumC78518ag.MV_THEME);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mStickerID)) {
            aVar.mo122450a(EnumC78518ag.RECORD_PROP);
        }
        ArrayList<EffectPointModel> arrayList = videoPublishEditModel.mEffectList;
        if (arrayList != null && (!arrayList.isEmpty())) {
            aVar.mo122450a(EnumC78518ag.EDIT_EFFECT);
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (!(infoStickerModel == null || (list = infoStickerModel.stickers) == null || !(!list.isEmpty()))) {
            aVar.mo122450a(EnumC78518ag.EDIT_STICKER);
        }
        return aVar.mo122451a();
    }
}
