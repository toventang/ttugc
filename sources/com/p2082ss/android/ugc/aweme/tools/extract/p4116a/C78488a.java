package com.p2082ss.android.ugc.aweme.tools.extract.p4116a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a.a */
public final class C78488a implements AbstractC78498e {

    /* renamed from: a */
    public static final C78488a f176395a = new C78488a();

    private C78488a() {
    }

    static {
        Covode.recordClassIndex(91620);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.p4116a.AbstractC78498e
    /* renamed from: a */
    public final C89378p<Integer, String> mo122413a(VideoPublishEditModel videoPublishEditModel, int i) {
        int i2;
        List<Integer> photoDurationList;
        C89219l.m154721d(videoPublishEditModel, "");
        C78505j jVar = C78507ab.f176423a;
        if (jVar == null || (photoDurationList = jVar.getPhotoDurationList()) == null) {
            i2 = 1;
        } else {
            i2 = photoDurationList.size();
        }
        if (i != i2) {
            return C89387v.m154943a(20, "CanvasChecker: frame count:" + i + ", expect size:" + i2);
        }
        return C89387v.m154943a(-1, "");
    }
}
