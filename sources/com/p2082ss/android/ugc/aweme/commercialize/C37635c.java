package com.p2082ss.android.ugc.aweme.commercialize;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c */
public final class C37635c implements AbstractC72627e {
    static {
        Covode.recordClassIndex(45059);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e
    /* renamed from: a */
    public final void mo65459a(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
        C89219l.m154721d(baseShortVideoContext, "");
        C89219l.m154721d(baseShortVideoContext, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e
    /* renamed from: a */
    public final void mo65458a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        String str = "";
        C89219l.m154721d(baseShortVideoContext, str);
        C89219l.m154721d(linkedHashMap, str);
        if (PublishExtensionModel.fromContext(baseShortVideoContext).fromCommercialSoundPage) {
            linkedHashMap.put("is_commercial_sound_page", "1");
        } else {
            linkedHashMap.put("is_commercial_sound_page", "0");
        }
        if (baseShortVideoContext.isDefaultProp) {
            linkedHashMap.put("is_default_prop", "1");
        } else {
            linkedHashMap.put("is_default_prop", "0");
        }
        Mission mission = PublishExtensionModel.fromString(baseShortVideoContext.commerceData).mission;
        if (mission != null) {
            String missionId = mission.getMissionId();
            if (missionId == null) {
                missionId = str;
            }
            linkedHashMap.put("mission_id", missionId);
            String enterFrom = mission.getEnterFrom();
            if (enterFrom != null) {
                str = enterFrom;
            }
            linkedHashMap.put("mission_from", str);
        }
    }
}
