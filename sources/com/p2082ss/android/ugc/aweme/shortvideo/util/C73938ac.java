package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70646dq;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.C78609k;
import com.p2082ss.android.ugc.aweme.utils.C80585ir;
import com.p2082ss.android.ugc.tools.utils.C84906m;
import java.util.LinkedHashMap;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ac */
public final class C73938ac {

    /* renamed from: a */
    private final VideoPublishEditModel f166015a;

    /* renamed from: b */
    private final C65616g f166016b;

    /* renamed from: c */
    private final SynthetiseResult f166017c;

    static {
        Covode.recordClassIndex(86688);
    }

    /* renamed from: a */
    public final LinkedHashMap<String, String> mo116385a() {
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("create_aweme", "start building create/aweme request fields");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        String str = this.f166016b.f147920i;
        if (str == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        linkedHashMap.put("video_id", str);
        String str2 = "1";
        linkedHashMap.put("new_sdk", str2);
        linkedHashMap.put("mixed_type", String.valueOf(this.f166015a.getStickPointType()));
        m130032a(this.f166015a, linkedHashMap);
        m130033b(this.f166015a, linkedHashMap);
        C80585ir.m139721a(this.f166016b, linkedHashMap);
        C89378p<Integer, Integer> a = C84906m.m145912a(this.f166015a);
        int intValue = a.component1().intValue();
        int intValue2 = a.component2().intValue();
        linkedHashMap.put("video_cnt", String.valueOf(intValue));
        linkedHashMap.put("pic_cnt", String.valueOf(intValue2));
        if (intValue + intValue2 <= 1) {
            str2 = "0";
        }
        linkedHashMap.put("is_multi_content", str2);
        C70646dq dqVar = new C70646dq();
        dqVar.mo111450a(this.f166015a, linkedHashMap);
        if (this.f166015a.openPlatformClientKey != null) {
            String str3 = this.f166015a.openPlatformClientKey;
            C89219l.m154716b(str3, "");
            linkedHashMap.put("open_platform_key", str3);
        }
        if (this.f166015a.openPlatformExtra != null) {
            String str4 = this.f166015a.openPlatformExtra;
            C89219l.m154716b(str4, "");
            linkedHashMap.put("open_platform_extra", str4);
        }
        dqVar.mo111449a(this.f166015a, this.f166017c, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: a */
    private static void m130032a(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        boolean[] zArr;
        String str;
        if (videoPublishEditModel.infoStickerModel != null) {
            InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
            C89219l.m154716b(infoStickerModel, "");
            zArr = C78609k.m137209a(infoStickerModel);
        } else {
            zArr = new boolean[]{false, false};
        }
        String str2 = "1";
        if (zArr[0]) {
            str = str2;
        } else {
            str = "0";
        }
        linkedHashMap.put("is_diy_prop", str);
        if (!zArr[1]) {
            str2 = "0";
        }
        linkedHashMap.put("remove_background", str2);
    }

    /* renamed from: b */
    private static void m130033b(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        try {
            if (videoPublishEditModel.hasReadTextAudio()) {
                linkedHashMap.put("is_text_reading", "1");
            } else {
                linkedHashMap.put("is_text_reading", "0");
            }
        } catch (Exception e) {
            C51423a.m95787a("setupReadTextInfo failed: " + e.getMessage());
        }
    }

    public C73938ac(VideoPublishEditModel videoPublishEditModel, C65616g gVar, SynthetiseResult synthetiseResult) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(synthetiseResult, "");
        this.f166015a = videoPublishEditModel;
        this.f166016b = gVar;
        this.f166017c = synthetiseResult;
    }
}
