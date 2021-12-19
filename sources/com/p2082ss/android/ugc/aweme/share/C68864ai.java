package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.utils.C80522ha;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ai */
public final class C68864ai implements AbstractC72627e {

    /* renamed from: a */
    private final String f154029a = "SharePublishServiceExtension";

    static {
        Covode.recordClassIndex(81165);
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
        String str;
        String str2;
        C89219l.m154721d(baseShortVideoContext, "");
        C89219l.m154721d(linkedHashMap, "");
        C39078ad a = C80522ha.m139584a(baseShortVideoContext);
        if (a != null) {
            if (a.mClientKey != null && !linkedHashMap.containsKey("open_platform_key")) {
                String str3 = a.mClientKey;
                C89219l.m154716b(str3, "");
                linkedHashMap.put("open_platform_key", str3);
            }
            if (a.mOpenPlatformExtra != null && !linkedHashMap.containsKey("open_platform_extra")) {
                String str4 = a.mOpenPlatformExtra;
                C89219l.m154716b(str4, "");
                linkedHashMap.put("open_platform_extra", str4);
            }
            if (a.mState == null) {
                str = "";
            } else {
                str = a.mState;
            }
            C89219l.m154716b(str, "");
            linkedHashMap.put("open_platform_share_id", str);
            if (a.mOpenPlatformContent == null) {
                str2 = "";
            } else {
                str2 = a.mOpenPlatformContent;
            }
            C89219l.m154716b(str2, "");
            linkedHashMap.put("open_platform_content", str2);
        }
    }
}
