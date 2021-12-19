package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.d */
public final class C71415d {

    /* renamed from: a */
    private final int f160007a;

    /* renamed from: b */
    private final int f160008b;

    /* renamed from: c */
    private final long f160009c;

    /* renamed from: d */
    private final long f160010d;

    /* renamed from: e */
    private final boolean f160011e;

    /* renamed from: f */
    private final String[] f160012f;

    /* renamed from: g */
    private final String[] f160013g;

    /* renamed from: h */
    private final boolean f160014h;

    /* renamed from: i */
    private final String f160015i;

    static {
        Covode.recordClassIndex(83949);
    }

    public C71415d() {
        this(0, 0, false, null, null, false, null, 511);
    }

    public C71415d(int i, int i2) {
        this(i, i2, false, null, null, false, null, 508);
    }

    /* renamed from: a */
    public final EditPreviewInfo mo113020a(MultiEditVideoRecordData multiEditVideoRecordData) {
        String str;
        String str2;
        C89219l.m154721d(multiEditVideoRecordData, "");
        C71416e eVar = new C71416e(this.f160007a, this.f160008b, this.f160009c, this.f160010d, this.f160015i);
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
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
            if (this.f160014h) {
                str = multiEditVideoSegmentRecordData.draftVideoPath;
            } else {
                str = multiEditVideoSegmentRecordData.videoPath;
            }
            if (this.f160014h) {
                str2 = multiEditVideoSegmentRecordData.draftAudioPath;
            } else {
                str2 = multiEditVideoSegmentRecordData.audioPath;
            }
            C89219l.m154716b(str, "");
            EditVideoSegment editVideoSegment = new EditVideoSegment(str, str2, new VideoFileInfo(multiEditVideoSegmentRecordData.width, multiEditVideoSegmentRecordData.height, multiEditVideoSegmentRecordData.videoLength / 1000, -100, 0, 0, 0, 0, 240, null));
            if (this.f160011e) {
                C89219l.m154716b(multiEditVideoSegmentRecordData, "");
                editVideoSegment.setVideoCutInfo(new VideoCutInfo(multiEditVideoSegmentRecordData.getStartTime(), multiEditVideoSegmentRecordData.getEndTime(), multiEditVideoSegmentRecordData.getVideoSpeed(), multiEditVideoSegmentRecordData.rotate));
            }
            arrayList3.add(editVideoSegment);
        }
        EditPreviewInfo a = eVar.mo113021a(C89070n.m154585g((Collection) arrayList3));
        a.setReverseAudioArray(this.f160012f);
        a.setReverseVideoArray(this.f160013g);
        return a;
    }

    private C71415d(int i, int i2, boolean z, String[] strArr, String[] strArr2, boolean z2, String str) {
        this.f160007a = i;
        this.f160008b = i2;
        this.f160009c = 0;
        this.f160010d = 0;
        this.f160011e = z;
        this.f160012f = strArr;
        this.f160013g = strArr2;
        this.f160014h = z2;
        this.f160015i = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C71415d(int i, int i2, boolean z, String[] strArr, String[] strArr2, boolean z2, String str, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? null : strArr, (i3 & 64) != 0 ? null : strArr2, (i3 & 128) == 0 ? z2 : false, (i3 & 256) == 0 ? str : null);
    }
}
