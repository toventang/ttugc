package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.c */
public final class C71414c {

    /* renamed from: a */
    private final boolean f160006a;

    static {
        Covode.recordClassIndex(83948);
    }

    public C71414c(boolean z) {
        this.f160006a = z;
    }

    /* renamed from: a */
    public final EditPreviewInfo mo113019a(C89378p<? extends MultiEditVideoRecordData, EditPreviewInfo> pVar) {
        VideoFileInfo videoFileInfo;
        C89219l.m154721d(pVar, "");
        EditPreviewInfo second = pVar.getSecond();
        C71416e eVar = new C71416e(second.getPreviewWidth(), second.getPreviewHeight(), second.getSceneIn(), second.getSceneOut(), second.getDraftDir());
        List<MultiEditVideoSegmentRecordData> list = ((MultiEditVideoRecordData) pVar.getFirst()).segmentDataList;
        C89219l.m154716b(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.enable) {
                arrayList.add(t);
            }
        }
        ArrayList<MultiEditVideoSegmentRecordData> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList2) {
            if (this.f160006a) {
                videoFileInfo = new VideoFileInfo(multiEditVideoSegmentRecordData.width, multiEditVideoSegmentRecordData.height, multiEditVideoSegmentRecordData.videoLength / 1000, -100, 0, 0, 0, 0, 240, null);
            } else {
                videoFileInfo = new VideoFileInfo(pVar.getSecond().getPreviewWidth(), pVar.getSecond().getPreviewHeight(), multiEditVideoSegmentRecordData.videoLength / 1000, -100, 0, 0, 0, 0, 240, null);
            }
            EditVideoSegment editVideoSegment = new EditVideoSegment(multiEditVideoSegmentRecordData.draftVideoPath.toString(), multiEditVideoSegmentRecordData.draftAudioPath, videoFileInfo);
            C89219l.m154716b(multiEditVideoSegmentRecordData, "");
            editVideoSegment.setVideoCutInfo(new VideoCutInfo(multiEditVideoSegmentRecordData.getStartTime(), multiEditVideoSegmentRecordData.getEndTime(), multiEditVideoSegmentRecordData.getVideoSpeed(), multiEditVideoSegmentRecordData.rotate));
            arrayList3.add(editVideoSegment);
        }
        EditPreviewInfo a = eVar.mo113021a(C89070n.m154585g((Collection) arrayList3));
        a.setReverseAudioArray(pVar.getSecond().getReverseAudioArray());
        a.setReverseVideoArray(pVar.getSecond().getReverseVideoArray());
        return a;
    }
}
