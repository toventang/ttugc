package com.p2082ss.android.ugc.aweme.commercialize;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.h */
public final class C38007h implements AbstractC72627e {

    /* renamed from: a */
    private final String f89815a = "StarAtlasPublishServiceExtension";

    static {
        Covode.recordClassIndex(45468);
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
        C89219l.m154721d(baseShortVideoContext, "");
        C89219l.m154721d(linkedHashMap, "");
        PublishExtensionModel fromContext = PublishExtensionModel.fromContext(baseShortVideoContext);
        C89219l.m154716b(fromContext, "");
        if (fromContext.isStarAtlas) {
            linkedHashMap.put("is_star_atlas", "1");
        } else {
            linkedHashMap.put("is_star_atlas", "0");
        }
        if (!TextUtils.isEmpty(fromContext.starAtlasContent)) {
            String str = fromContext.starAtlasContent;
            C89219l.m154716b(str, "");
            linkedHashMap.put("star_atlas_content", str);
        }
        if (!TextUtils.isEmpty(fromContext.brandedContentType)) {
            String str2 = fromContext.brandedContentType;
            C89219l.m154716b(str2, "");
            linkedHashMap.put("branded_content_type", str2);
        }
        if (!C13603b.m24435a((Collection) fromContext.tcmTagBaInfo)) {
            String b = new C27910f().mo46674b(fromContext.tcmTagBaInfo);
            C89219l.m154716b(b, "");
            linkedHashMap.put("tcm_tag_ba_info", b);
        }
    }
}
