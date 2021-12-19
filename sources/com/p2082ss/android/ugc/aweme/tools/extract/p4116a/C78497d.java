package com.p2082ss.android.ugc.aweme.tools.extract.p4116a;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;
import com.p2082ss.android.ugc.aweme.tools.extract.C78595z;
import dmt.p4542av.video.C88168aj;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a.d */
public final class C78497d implements AbstractC78498e {
    static {
        Covode.recordClassIndex(91629);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.p4116a.AbstractC78498e
    /* renamed from: a */
    public final C89378p<Integer, String> mo122413a(VideoPublishEditModel videoPublishEditModel, int i) {
        int i2;
        int i3;
        List<C78595z> uploadFrameInfoList;
        int i4;
        List<Integer> photoDurationList;
        List<Integer> photoDurationList2;
        List<Integer> photoDurationList3;
        C89219l.m154721d(videoPublishEditModel, "");
        VideoFileInfo b = C88168aj.m153238b(videoPublishEditModel.mOutputFile);
        if (b != null) {
            long duration = b.getDuration();
            if (duration != 0) {
                C78505j jVar = C78507ab.f176423a;
                int i5 = 0;
                if (jVar == null || (photoDurationList3 = jVar.getPhotoDurationList()) == null) {
                    i2 = 0;
                } else {
                    i2 = photoDurationList3.size();
                }
                C78505j jVar2 = C78507ab.f176423a;
                if (!(jVar2 == null || (photoDurationList2 = jVar2.getPhotoDurationList()) == null)) {
                    photoDurationList2.size();
                }
                C78505j jVar3 = C78507ab.f176423a;
                if (jVar3 == null || (photoDurationList = jVar3.getPhotoDurationList()) == null) {
                    i3 = 0;
                } else {
                    Iterator<T> it = photoDurationList.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        i3 += it.next().intValue();
                    }
                }
                C78505j jVar4 = C78507ab.f176423a;
                if (!(jVar4 == null || (uploadFrameInfoList = jVar4.getUploadFrameInfoList()) == null || !(!uploadFrameInfoList.isEmpty()))) {
                    i5 = 0;
                    for (T t : uploadFrameInfoList) {
                        String str = t.f176632a;
                        if (!C72440e.m127817b(str) && !C72440e.m127819c(str)) {
                            C78505j jVar5 = C78507ab.f176423a;
                            if (jVar5 != null && jVar5.getVideoOrigin() == 0) {
                                i4 = ((int) t.f176634c) / 500;
                            } else if (t.f176638g) {
                                i4 = (((int) t.f176634c) / LiveNetAdaptiveHurryTimeSetting.DEFAULT) + 1;
                            } else {
                                i4 = 0;
                            }
                            i5 += i4;
                        }
                    }
                }
                int i6 = i2 + i5;
                if (i6 == 0) {
                    return C89387v.m154943a(9, "concat duration:" + duration + ", photo duration:" + i3);
                }
                if (i < 0) {
                    return C89387v.m154943a(9, "concat duration:" + duration + ", photo duration:" + i3 + ", cal count:" + i6);
                }
                if (Math.abs(i - i6) > 3) {
                    return C89387v.m154943a(7, "concat duration:" + duration + ", photo duration:" + i3 + ", cal count:" + i6 + ", frame count:" + i);
                }
                return C89387v.m154943a(-1, "");
            }
        }
        return C89387v.m154943a(5, "concat file path:" + videoPublishEditModel.mOutputFile);
    }
}
