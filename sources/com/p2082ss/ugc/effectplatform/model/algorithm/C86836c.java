package com.p2082ss.ugc.effectplatform.model.algorithm;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.algorithm.c */
public final class C86836c {
    static {
        Covode.recordClassIndex(102561);
    }

    /* renamed from: a */
    public static final String m150404a(ModelInfo modelInfo) {
        C89219l.m154719c(modelInfo, "");
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }
}
