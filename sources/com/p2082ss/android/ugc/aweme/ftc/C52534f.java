package com.p2082ss.android.ugc.aweme.ftc;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.f */
public final class C52534f {

    /* renamed from: a */
    public static final C52534f f120954a = new C52534f();

    private C52534f() {
    }

    static {
        Covode.recordClassIndex(61930);
    }

    /* renamed from: a */
    public static void m97451a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("group_id", C70747dv.m124972a());
        if (videoPublishEditModel.draftId != 0) {
            a.mo129403a("draft_id", videoPublishEditModel.draftId);
        }
        C39162r.m79460a("click_text_entrance", a.f188764a);
    }
}
