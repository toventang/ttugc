package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.br */
public final class C70979br {
    static {
        Covode.recordClassIndex(83473);
    }

    /* renamed from: a */
    public static final AbstractC70977bq m125332a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.isFastImport) {
            return new C71514q(videoPublishEditModel);
        }
        return new C71026h(videoPublishEditModel);
    }
}
