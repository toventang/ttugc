package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.C43207g;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.File;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ay */
public final /* synthetic */ class C70932ay implements AbstractC88434g {

    /* renamed from: a */
    static final AbstractC88434g f158822a = new C70932ay();

    static {
        Covode.recordClassIndex(83426);
    }

    private C70932ay() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        String str = videoPublishEditModel.draftDir() + File.separator;
        String str2 = C70637di.f158102e;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (videoPublishEditModel.multiEditVideoRecordData == null) {
            return "success";
        }
        String str3 = videoPublishEditModel.creationId;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData == null) {
            C43213k.m86181a("[copyDirMultiRecordData]: multiEditVideoRecordData is empty");
            return "success";
        } else if (C84904k.m145909a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
            C43213k.m86181a("[copyDirMultiRecordData]: segmentDataList is empty");
            return "success";
        } else {
            C43213k.m86181a("[copyDirMultiRecordData]: start copy srcDir = " + str + " destDir = " + str2);
            C43207g.m86165c(str, str3);
            String a = C43207g.m86163a(str, str2);
            C43207g.m86165c(str2, str3);
            C43213k.m86181a("[copyDirMultiRecordData]: end copy srcDir = " + str + " destDir = " + str2 + " ret  = " + a);
            return a;
        }
    }
}
