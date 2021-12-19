package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.c */
public final class C69771c implements AbstractC69768a {

    /* renamed from: a */
    public final C43223c f155929a;

    /* renamed from: b */
    public final VideoPublishEditModel f155930b;

    static {
        Covode.recordClassIndex(82177);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a
    /* renamed from: a */
    public final DraftFileSaveResult mo110127a() {
        boolean z;
        List<EditVideoSegment> videoList = this.f155930b.getPreviewInfo().getVideoList();
        if (videoList == null || videoList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(2, new DraftFileSaveException(-600, new RuntimeException("model.previewInfo.videoList.isNullOrEmpty()")));
        }
        EditPreviewInfo previewInfo = this.f155930b.getPreviewInfo();
        C89219l.m154716b(previewInfo, "");
        DraftFileSaveException a = C69769b.m123293a(previewInfo, this.f155929a);
        if (a.isSuc()) {
            C69769b.m123294a(this.f155929a);
        }
        return new DraftFileSaveResult(2, a);
    }

    public C69771c(C43223c cVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f155929a = cVar;
        this.f155930b = videoPublishEditModel;
    }
}
