package com.p2082ss.android.ugc.aweme.shortvideo.mapping;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.p936a.p937a.C14087e;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mapping.TimeSpeedModelExtrasAdapterFactory */
public final class TimeSpeedModelExtrasAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(84532);
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        if (!Bundle.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        return new C14087e(fVar, C71983b.f161312a);
    }
}
