package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.EffectExtKt */
public final class EffectExtKt {
    static {
        Covode.recordClassIndex(95511);
    }

    public static final String expectedMd5(Effect effect) {
        C89219l.m154719c(effect, "");
        UrlModel fileUrl = effect.getFileUrl();
        if (fileUrl != null) {
            return fileUrl.getUri();
        }
        return null;
    }
}
