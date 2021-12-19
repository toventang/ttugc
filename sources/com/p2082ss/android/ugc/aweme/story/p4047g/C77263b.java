package com.p2082ss.android.ugc.aweme.story.p4047g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.g.b */
public final class C77263b {
    static {
        Covode.recordClassIndex(90280);
    }

    /* renamed from: a */
    public static final C84425b m135059a(AVETParameter aVETParameter) {
        String str;
        String str2;
        String str3;
        String str4;
        C84425b bVar = new C84425b();
        if (aVETParameter == null || (str = aVETParameter.getCreationId()) == null) {
            str = "";
        }
        C84425b a = bVar.mo129406a("creation_id", str);
        if (aVETParameter == null || (str2 = aVETParameter.getShootWay()) == null) {
            str2 = "";
        }
        C84425b a2 = a.mo129406a("shoot_way", str2);
        if (aVETParameter == null || (str3 = aVETParameter.getContentSource()) == null) {
            str3 = "";
        }
        C84425b a3 = a2.mo129406a("content_source", str3);
        if (aVETParameter == null || (str4 = aVETParameter.getContentType()) == null) {
            str4 = "";
        }
        C84425b a4 = a3.mo129406a("content_type", str4).mo129406a("placeholder_enter_from", "video_edit_page");
        C89219l.m154716b(a4, "");
        return a4;
    }
}
