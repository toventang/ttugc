package com.p2082ss.android.ugc.aweme.shortvideo.mapping;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.p936a.p937a.C14086d;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mapping.AVChallengeExtrasAdapterFactory */
public final class AVChallengeExtrasAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(84531);
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        if (!HashMap.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        return new C14086d(fVar, C71981a.f161310a);
    }
}
