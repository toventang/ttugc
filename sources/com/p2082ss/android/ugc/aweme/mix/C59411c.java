package com.p2082ss.android.ugc.aweme.mix;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.c */
public final class C59411c implements AbstractC72627e {
    static {
        Covode.recordClassIndex(69803);
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
        if (baseShortVideoContext.playlist_id != null && baseShortVideoContext.playlist_name != null) {
            String str = baseShortVideoContext.playlist_id;
            C89219l.m154716b(str, "");
            linkedHashMap.put("playlist_id", str);
            String str2 = baseShortVideoContext.playlist_name;
            C89219l.m154716b(str2, "");
            linkedHashMap.put("playlist_name", str2);
        }
    }
}
