package com.p2082ss.android.ugc.aweme.shortvideo.eventtrack;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eventtrack.f */
public final class C71826f {
    static {
        Covode.recordClassIndex(84372);
    }

    /* renamed from: a */
    public static final void m126820a(String str, int i) {
        String str2;
        C89219l.m154721d(str, "");
        C84425b a = new C84425b().mo129406a("enter_from", "video_post_page").mo129406a("enter_method", str);
        if (i == 0) {
            str2 = "everyone";
        } else if (i == 2) {
            str2 = "friends";
        } else if (i == 1) {
            str2 = "private";
        } else {
            str2 = "empty";
        }
        C39162r.m79460a("show_audience_select_bottom_sheet", a.mo129406a("default_choice", str2).f188764a);
    }
}
