package dmt.p4542av.video.p4545b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import dmt.p4542av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.k */
public final class C88226k extends AbstractC88181j {

    /* renamed from: H */
    private boolean f200247H;

    /* renamed from: I */
    private boolean f200248I;

    static {
        Covode.recordClassIndex(104261);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88226k(dmt.p4542av.video.p4545b.C88238s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82247d()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.C88226k.<init>(dmt.av.video.b.s):void");
    }

    /* renamed from: a */
    private static boolean m153322a(VEPreviewParams vEPreviewParams) {
        if (vEPreviewParams.isStoryEditMode || !vEPreviewParams.mIsFromDraft) {
            return false;
        }
        if (vEPreviewParams.recordData == null || !vEPreviewParams.recordData.isSupportMultiEdit || vEPreviewParams.recordData.curMultiEditVideoRecordData == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m153321a(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        C89219l.m154716b(list, "");
        ArrayList<MultiEditVideoSegmentRecordData> arrayList = new ArrayList();
        for (T t : list) {
            if (t.enable) {
                arrayList.add(t);
            }
        }
        int i = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList) {
            C89219l.m154716b(multiEditVideoSegmentRecordData, "");
            i += (int) (((float) (multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime())) / multiEditVideoSegmentRecordData.getVideoSpeed());
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009b  */
    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo142714a(android.content.Context r15, com.bytedance.creativex.editor.preview.AbstractC14088a r16, android.view.SurfaceView r17, androidx.lifecycle.AbstractC1204m r18) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.C88226k.mo142714a(android.content.Context, com.bytedance.creativex.editor.preview.a, android.view.SurfaceView, androidx.lifecycle.m):int");
    }
}
