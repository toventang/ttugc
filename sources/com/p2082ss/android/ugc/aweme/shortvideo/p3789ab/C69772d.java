package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.d */
public final class C69772d implements AbstractC69768a {

    /* renamed from: a */
    public final C43223c f155931a;

    /* renamed from: b */
    public final VideoPublishEditModel f155932b;

    static {
        Covode.recordClassIndex(82178);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a
    /* renamed from: a */
    public final DraftFileSaveResult mo110127a() {
        DraftFileSaveException draftFileSaveException;
        List<EditVideoSegment> videoList = this.f155932b.getPreviewInfo().getVideoList();
        if (videoList == null || videoList.isEmpty()) {
            return new DraftFileSaveResult(1, new DraftFileSaveException(-600, new RuntimeException("model.previewInfo.videoList.isNullOrEmpty()")));
        }
        List<EditVideoSegment> i = C43225d.m86339i(this.f155931a);
        if (!this.f155932b.isFastImport || this.f155932b.isMultiVideoEdit() || (i != null && !i.isEmpty())) {
            draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
        } else {
            EditPreviewInfo previewInfo = this.f155932b.getPreviewInfo();
            C89219l.m154716b(previewInfo, "");
            draftFileSaveException = C69769b.m123293a(previewInfo, this.f155931a);
        }
        if (draftFileSaveException.isSuc()) {
            C69769b.m123294a(this.f155931a);
        }
        return new DraftFileSaveResult(1, draftFileSaveException);
    }

    public C69772d(C43223c cVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f155931a = cVar;
        this.f155932b = videoPublishEditModel;
    }
}
