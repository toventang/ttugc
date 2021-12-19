package com.p2082ss.android.ugc.aweme.shortvideo.eventtrack;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.beauty.C34806c;
import com.p2082ss.android.ugc.aweme.beauty.C34810g;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eventtrack.a */
public final class C71820a {

    /* renamed from: a */
    public static final C71820a f160967a = new C71820a();

    private C71820a() {
    }

    static {
        Covode.recordClassIndex(84366);
    }

    /* renamed from: a */
    public static final void m126811a(ShortVideoContext shortVideoContext, AbstractC31133a aVar, FaceStickerBean faceStickerBean, Integer num, ComposerBeautyBuriedInfo composerBeautyBuriedInfo, C34810g gVar, String str, AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar) {
        String str2;
        String str3;
        Long l;
        String valueOf;
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(mVar, "");
        C84425b bVar = new C84425b();
        C84425b a = bVar.mo129406a("next_action", str);
        if (faceStickerBean == null || (str2 = faceStickerBean.getId()) == null) {
            str2 = "";
        }
        C84425b a2 = a.mo129406a("effect_id", str2);
        if (faceStickerBean == null || (str3 = faceStickerBean.getRecId()) == null) {
            str3 = "";
        }
        C84425b a3 = a2.mo129406a("effect_rec_id", str3);
        if (faceStickerBean != null) {
            l = Long.valueOf(faceStickerBean.getStickerId());
        } else {
            l = "";
        }
        a3.mo129405a("effect_sticker_id", l).mo129403a("beauty_status", C34806c.m71109a(composerBeautyBuriedInfo, gVar)).mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("resolution", C65357b.m117049e()).mo129406a("creation_id", shortVideoContext.f155830o).mo129405a("fps", Float.valueOf(aVar.mo56629p())).mo129403a("lag_count", aVar.mo56626m()).mo129403a("lag_max", aVar.mo56627n()).mo129403a("lag_total_duration", aVar.mo56628o()).mo129403a("beautify_used", C34806c.m71113b(composerBeautyBuriedInfo)).mo129406a("beautify_info", C34806c.m71111a(composerBeautyBuriedInfo)).mo129403a("is_composer", C34806c.m71115c(composerBeautyBuriedInfo));
        if (num == null) {
            bVar.mo129406a("filter_id", "");
        } else {
            int intValue = num.intValue();
            if (intValue == 0) {
                valueOf = "-1";
            } else {
                valueOf = String.valueOf(intValue);
            }
            bVar.mo129406a("filter_id", valueOf);
        }
        Map<String, String> map = bVar.f188764a;
        C89219l.m154716b(map, "");
        mVar.invoke("tool_performance_video_preview", map);
    }
}
