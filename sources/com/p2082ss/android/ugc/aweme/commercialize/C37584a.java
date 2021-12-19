package com.p2082ss.android.ugc.aweme.commercialize;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.a */
public final class C37584a implements AbstractC72627e {
    static {
        Covode.recordClassIndex(44997);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e
    /* renamed from: a */
    public final void mo65459a(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
        Map a;
        C89219l.m154721d(baseShortVideoContext, "");
        PublishExtensionModel fromContext = PublishExtensionModel.fromContext(baseShortVideoContext);
        String str = fromContext.anchorContent;
        if (str == null || (a = (HashMap) C80342dg.m139300a().mo46670a(str, (Class) new HashMap().getClass())) == null) {
            a = C89041ag.m154415a();
        }
        if (C89219l.m154714a(a.get("common_type"), (Object) true)) {
            int i = fromContext.anchorBusinessType;
            String str2 = fromContext.anchorTitle;
            if (str2 == null) {
                str2 = "";
            }
            C89219l.m154716b(str2, "");
            String str3 = fromContext.anchorContent;
            if (str3 == null) {
                str3 = "";
            }
            C89219l.m154716b(str3, "");
            list.add(new CreateAnchorInfo(i, str2, "", "", str3, null, null, null, null, null, fromContext.anchorSubtype, null, 3040, null));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e
    /* renamed from: a */
    public final void mo65458a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        Map a;
        String str;
        C89219l.m154721d(baseShortVideoContext, "");
        C89219l.m154721d(linkedHashMap, "");
        List<CreateAnchorInfo> list2 = PublishExtensionModel.fromContext(baseShortVideoContext).createAnchorInfos;
        if (!(list2 == null || list == null)) {
            C89219l.m154716b(list2, "");
            list.addAll(list2);
        }
        PublishExtensionModel fromContext = PublishExtensionModel.fromContext(baseShortVideoContext);
        String str2 = fromContext.anchorContent;
        if (str2 == null || (a = (HashMap) C80342dg.m139300a().mo46670a(str2, (Class) new HashMap().getClass())) == null) {
            a = C89041ag.m154415a();
        }
        if (C89219l.m154714a(a.get("common_type"), (Object) true)) {
            try {
                String str3 = fromContext.anchorContent;
                if (str3 == null) {
                    str3 = "";
                }
                str = new JSONObject(str3).optString("url");
                C89219l.m154716b(str, "");
            } catch (Exception unused) {
                str = "";
            }
            if (list != null) {
                int i = fromContext.anchorBusinessType;
                String str4 = fromContext.anchorTitle;
                if (str4 == null) {
                    str4 = "";
                }
                C89219l.m154716b(str4, "");
                String str5 = fromContext.anchorContent;
                if (str5 == null) {
                    str5 = "";
                }
                C89219l.m154716b(str5, "");
                list.add(new CreateAnchorInfo(i, str4, str, "", str5, null, null, null, null, null, fromContext.anchorSubtype, null, 3040, null));
            }
        }
    }
}
