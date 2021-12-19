package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.d */
public final class C83618d {

    /* renamed from: a */
    public static final C83618d f186687a = new C83618d();

    private C83618d() {
    }

    static {
        Covode.recordClassIndex(97505);
    }

    /* renamed from: a */
    public static void m143955a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("show_music_popup", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("music_id", str).mo129406a("creation_id", str2).f188764a);
    }

    /* renamed from: a */
    public static void m143956a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a("click_music_popup_option", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("music_id", str).mo129406a("creation_id", str2).mo129406a("click_type", str3).f188764a);
    }
}
