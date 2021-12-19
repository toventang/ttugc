package com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46953fs;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.c */
public final class C72866c {

    /* renamed from: a */
    public static final C72866c f163496a = new C72866c();

    private C72866c() {
    }

    static {
        Covode.recordClassIndex(85558);
    }

    /* renamed from: a */
    public static boolean m128684a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!C46953fs.m90240a() || videoPublishEditModel.isStoryEditMode) {
            return false;
        }
        if ((videoPublishEditModel.mShootMode != 15 || videoPublishEditModel.mOrigin != 1) && C63244g.m114602a().mo73255A().mo93903b() && !C63244g.m114602a().mo73255A().mo93901a()) {
            return true;
        }
        return false;
    }
}
