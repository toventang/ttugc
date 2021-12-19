package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.r */
public final class C70097r {
    static {
        Covode.recordClassIndex(82520);
    }

    /* renamed from: a */
    public static final void m123782a(AbstractC31071f fVar, List<? extends VideoSegment> list) {
        String str;
        C89219l.m154721d(list, "");
        if (fVar != null) {
            str = fVar.mo56346d("LvMetaInfo");
        } else {
            str = null;
        }
        C84911q.m145928d("fillDescription ".concat(String.valueOf(str)));
        for (VideoSegment videoSegment : list) {
            videoSegment.f156730v = str;
        }
    }
}
