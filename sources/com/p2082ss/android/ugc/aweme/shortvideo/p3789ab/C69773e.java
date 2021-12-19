package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.C43209h;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69743b;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71414c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import java.io.File;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.e */
public final class C69773e implements AbstractC69768a {

    /* renamed from: a */
    public final C43223c f155933a;

    /* renamed from: b */
    public final VideoPublishEditModel f155934b;

    /* renamed from: c */
    public final boolean f155935c;

    /* renamed from: d */
    private final Workspace f155936d;

    static {
        Covode.recordClassIndex(82179);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a
    /* renamed from: a */
    public final DraftFileSaveResult mo110127a() {
        boolean z;
        List<MultiEditVideoSegmentRecordData> list = this.f155934b.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(3, new DraftFileSaveException(-600, new RuntimeException("model.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList.isNullOrEmpty()")));
        }
        String str = C70637di.f158102e;
        C89219l.m154716b(str, "");
        String draftDir = this.f155934b.draftDir();
        C89219l.m154716b(draftDir, "");
        DraftFileSaveException a = C43209h.m86169a(str, draftDir, null, 6);
        if (a.isSuc()) {
            String str2 = C70637di.f158102e;
            C89219l.m154716b(str2, "");
            C71429d.m126157a(str2, this.f155934b.draftDir() + File.separator, this.f155933a.f100900W.f100817ax);
            C43223c cVar = this.f155933a;
            C71414c cVar2 = new C71414c(false);
            MultiEditVideoRecordData multiEditVideoRecordData = cVar.f100900W.f100817ax.curMultiEditVideoRecordData;
            C89219l.m154716b(multiEditVideoRecordData, "");
            EditPreviewInfo editPreviewInfo = cVar.f100900W.f100808ao;
            if (editPreviewInfo == null) {
                C89219l.m154715b();
            }
            cVar.mo73632a(cVar2.mo113019a(new C89378p<>(multiEditVideoRecordData, editPreviewInfo)));
            C71833a.m126843a();
            C69769b.m123295a(this.f155936d, this.f155935c);
            C69769b.m123294a(this.f155933a);
        }
        return new DraftFileSaveResult(3, a);
    }

    public C69773e(C43223c cVar, VideoPublishEditModel videoPublishEditModel, boolean z) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f155933a = cVar;
        this.f155934b = videoPublishEditModel;
        this.f155935c = z;
        this.f155936d = C69743b.m123265a(videoPublishEditModel);
    }
}
