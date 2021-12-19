package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.j */
public final class C83066j {

    /* renamed from: a */
    public static final C83066j f185616a = new C83066j();

    private C83066j() {
    }

    static {
        Covode.recordClassIndex(96939);
    }

    /* renamed from: a */
    public static void m143416a(ShortVideoCommonParams shortVideoCommonParams) {
        C89219l.m154721d(shortVideoCommonParams, "");
        C39162r.m79460a("text_reading_bubble_show", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", shortVideoCommonParams.shootWay).mo129406a("content_source", shortVideoCommonParams.contentSource).mo129406a("content_type", shortVideoCommonParams.contentType).mo129406a("creation_id", shortVideoCommonParams.creationId).f188764a);
    }

    /* renamed from: b */
    public static void m143418b(ShortVideoCommonParams shortVideoCommonParams) {
        C89219l.m154721d(shortVideoCommonParams, "");
        C39162r.m79460a("cancel_text_reading", new C84425b().mo129406a("shoot_way", shortVideoCommonParams.shootWay).mo129406a("content_source", shortVideoCommonParams.contentSource).mo129406a("content_type", shortVideoCommonParams.contentType).mo129406a("creation_id", shortVideoCommonParams.creationId).f188764a);
    }

    /* renamed from: a */
    public static void m143417a(ShortVideoCommonParams shortVideoCommonParams, String str, String str2) {
        C89219l.m154721d(shortVideoCommonParams, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("click_text_reading", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", shortVideoCommonParams.shootWay).mo129406a("content_source", shortVideoCommonParams.contentSource).mo129406a("content_type", shortVideoCommonParams.contentType).mo129406a("tone_choice_method", str).mo129406a("enter_method", str2).mo129406a("creation_id", shortVideoCommonParams.creationId).f188764a);
    }

    /* renamed from: b */
    public static void m143419b(ShortVideoCommonParams shortVideoCommonParams, String str, String str2) {
        String str3;
        C89219l.m154721d(shortVideoCommonParams, "");
        C84425b a = new C84425b().mo129406a("shoot_way", shortVideoCommonParams.shootWay).mo129406a("content_source", shortVideoCommonParams.contentSource).mo129406a("content_type", shortVideoCommonParams.contentType).mo129406a("creation_id", shortVideoCommonParams.creationId);
        if (str == null) {
            str = "";
        }
        C84425b a2 = a.mo129406a("tone_id", str);
        if (str2 == null) {
            str2 = "";
        }
        C84425b a3 = a2.mo129406a("tone_name", str2);
        if (C83067k.m143424b()) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        C39162r.m79460a("text_reading_complete", a3.mo129406a("is_open_apply", str3).f188764a);
    }
}
