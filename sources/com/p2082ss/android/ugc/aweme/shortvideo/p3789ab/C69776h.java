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
import java.util.HashSet;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.h */
public final class C69776h implements AbstractC69768a {

    /* renamed from: d */
    public static final C69777a f155939d = new C69777a((byte) 0);

    /* renamed from: a */
    public final C43223c f155940a;

    /* renamed from: b */
    public final VideoPublishEditModel f155941b;

    /* renamed from: c */
    public final boolean f155942c;

    /* renamed from: e */
    private final Workspace f155943e;

    static {
        Covode.recordClassIndex(82182);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.h$a */
    public static final class C69777a {
        static {
            Covode.recordClassIndex(82183);
        }

        private C69777a() {
        }

        public /* synthetic */ C69777a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69768a
    /* renamed from: a */
    public final DraftFileSaveResult mo110127a() {
        boolean z;
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2 = this.f155941b.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(3, new DraftFileSaveException(-600, new RuntimeException("model.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList.isNullOrEmpty()")));
        }
        String draftDir = this.f155941b.draftDir();
        C89219l.m154716b(draftDir, "");
        String a = C43209h.m86171a(draftDir);
        HashSet<String> hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        List<MultiEditVideoSegmentRecordData> list3 = this.f155941b.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList;
        C89219l.m154716b(list3, "");
        for (T t : list3) {
            String str = t.videoPath;
            C89219l.m154716b(str, "");
            hashSet.add(str);
            String str2 = t.audioPath;
            if (!(str2 == null || str2.length() == 0 || str2 == null)) {
                hashSet2.add(str2);
            }
        }
        MultiEditVideoRecordData multiEditVideoRecordData = this.f155941b.multiEditVideoRecordData.restoreMultiEditVideoRecordData;
        if (!(multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
            for (T t2 : list) {
                String str3 = t2.videoPath;
                C89219l.m154716b(str3, "");
                hashSet.add(str3);
                String str4 = t2.audioPath;
                if (!(str4 == null || str4.length() == 0 || str4 == null)) {
                    hashSet2.add(str4);
                }
            }
        }
        for (String str5 : hashSet) {
            StringBuilder append = new StringBuilder().append(a);
            String absolutePath = new File(str5).getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            String str6 = C70637di.f158102e;
            C89219l.m154716b(str6, "");
            DraftFileSaveException a2 = C43209h.m86170a(str5, append.append(C89361p.m154899a(absolutePath, (CharSequence) C43209h.m86171a(str6))).toString(), true);
            if (!a2.isSuc()) {
                return new DraftFileSaveResult(3, a2);
            }
        }
        for (String str7 : hashSet2) {
            StringBuilder append2 = new StringBuilder().append(a);
            String absolutePath2 = new File(str7).getAbsolutePath();
            C89219l.m154716b(absolutePath2, "");
            String str8 = C70637di.f158102e;
            C89219l.m154716b(str8, "");
            C43209h.m86170a(str7, append2.append(C89361p.m154899a(absolutePath2, (CharSequence) C43209h.m86171a(str8))).toString(), true);
        }
        StringBuilder sb = new StringBuilder();
        String str9 = C70637di.f158102e;
        C89219l.m154716b(str9, "");
        DraftFileSaveException a3 = C43209h.m86170a(sb.append(C43209h.m86171a(str9)).append("data.txt").toString(), a + "data.txt", true);
        if (a3.isSuc()) {
            String str10 = C70637di.f158102e;
            C89219l.m154716b(str10, "");
            C71429d.m126157a(str10, this.f155941b.draftDir() + File.separator, this.f155940a.f100900W.f100817ax);
            C43223c cVar = this.f155940a;
            C71414c cVar2 = new C71414c(false);
            MultiEditVideoRecordData multiEditVideoRecordData2 = cVar.f100900W.f100817ax.curMultiEditVideoRecordData;
            C89219l.m154716b(multiEditVideoRecordData2, "");
            EditPreviewInfo editPreviewInfo = cVar.f100900W.f100808ao;
            if (editPreviewInfo == null) {
                C89219l.m154715b();
            }
            cVar.mo73632a(cVar2.mo113019a(new C89378p<>(multiEditVideoRecordData2, editPreviewInfo)));
            C71833a.m126843a();
            C69769b.m123295a(this.f155943e, this.f155942c);
            C69769b.m123294a(this.f155940a);
        }
        return new DraftFileSaveResult(3, a3);
    }

    public C69776h(C43223c cVar, VideoPublishEditModel videoPublishEditModel, boolean z) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f155940a = cVar;
        this.f155941b = videoPublishEditModel;
        this.f155942c = z;
        this.f155943e = C69743b.m123265a(videoPublishEditModel);
    }
}
