package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.C43209h;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71414c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.f */
public final class C69774f implements AbstractC69768a {

    /* renamed from: a */
    public final C43223c f155937a;

    /* renamed from: b */
    public final VideoPublishEditModel f155938b;

    static {
        Covode.recordClassIndex(82180);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a
    /* renamed from: a */
    public final DraftFileSaveResult mo110127a() {
        boolean z;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        String valueOf;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f155937a.f100900W.f100817ax;
        List<MultiEditVideoSegmentRecordData> list2 = (multiEditVideoStatusRecordData == null || (multiEditVideoRecordData2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null) ? null : multiEditVideoRecordData2.segmentDataList;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(6, new DraftFileSaveException(-600, new RuntimeException("draft.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList.isNullOrEmpty")));
        }
        String draftDir = this.f155938b.getPreviewInfo().getDraftDir();
        ArrayList<C89378p> arrayList = new ArrayList();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = this.f155937a.f100900W.f100817ax;
        if (!(multiEditVideoStatusRecordData2 == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
            for (T t : list) {
                if (t.enable) {
                    if (!C84896h.m145869b(t.videoPath)) {
                        valueOf = C89159j.m154655f(new File(t.videoPath));
                    } else {
                        valueOf = String.valueOf(t.videoPath.hashCode());
                    }
                    String str = C43209h.m86171a(draftDir) + valueOf;
                    String str2 = t.videoPath;
                    C89219l.m154716b(str2, "");
                    DraftFileSaveException a = C43209h.m86170a(str2, str, true);
                    if (!a.isSuc()) {
                        return new DraftFileSaveResult(6, a);
                    }
                    arrayList.add(C89387v.m154943a(t, str));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (C89378p pVar : arrayList) {
                ((MultiEditVideoSegmentRecordData) pVar.getFirst()).videoPath = (String) pVar.getSecond();
                ((MultiEditVideoSegmentRecordData) pVar.getFirst()).draftVideoPath = (String) pVar.getSecond();
            }
            this.f155937a.mo73632a(new C71414c(true).mo113019a(new C89378p<>(this.f155937a.f100900W.f100817ax.curMultiEditVideoRecordData, this.f155938b.getPreviewInfo())));
        }
        return new DraftFileSaveResult(6, null, 2, null);
    }

    public C69774f(C43223c cVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f155937a = cVar;
        this.f155938b = videoPublishEditModel;
    }
}
