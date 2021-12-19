package com.p2082ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sticker.text.f */
public final class C75900f {
    static {
        Covode.recordClassIndex(88840);
    }

    /* renamed from: a */
    private static List<String> m133093a(StickerItemModel stickerItemModel) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C46110t.m88973i(((TextStickerData) C63244g.m114602a().mo73261G().mo46670a(stickerItemModel.extra, TextStickerData.class)).getTextWrapList()));
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m133094a(BaseShortVideoContext baseShortVideoContext, JSONArray jSONArray) {
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            AbstractC27235f fVar = C75901g.f170476a;
            AbstractC27235f fVar2 = C75902h.f170477a;
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList = new ArrayList();
            if (videoPublishEditModel.hasInfoStickers()) {
                for (StickerItemModel stickerItemModel : videoPublishEditModel.infoStickerModel.stickers) {
                    if (((Boolean) fVar.mo45319a(stickerItemModel)).booleanValue()) {
                        arrayList.add(stickerItemModel);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, C75903i.f170478a);
                for (int i = 0; i < arrayList.size(); i++) {
                    jSONArray2.put(fVar2.mo45319a(arrayList.get(i)));
                }
            }
            if (jSONArray2.length() > 0) {
                try {
                    jSONArray.put(new JSONObject().put(StringSet.type, 4).put("data", jSONArray2));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getHasCoverText() && videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getTextSticker() != null) {
                try {
                    JSONArray jSONArray3 = new JSONArray();
                    for (String str : m133093a(videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getTextSticker())) {
                        jSONArray3.put(str);
                    }
                    jSONArray.put(new JSONObject().put(StringSet.type, 9).put("data", jSONArray3));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
