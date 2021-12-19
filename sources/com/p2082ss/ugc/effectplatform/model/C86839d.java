package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.d */
public final class C86839d {
    static {
        Covode.recordClassIndex(102564);
    }

    /* renamed from: a */
    public static final String m150405a(Effect effect) {
        C89219l.m154719c(effect, "");
        if (C89219l.m154714a((Object) effect.getFile_url().getUri(), (Object) "")) {
            return null;
        }
        return effect.getFile_url().getUri();
    }
}
