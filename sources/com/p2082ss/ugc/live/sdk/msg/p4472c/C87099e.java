package com.p2082ss.ugc.live.sdk.msg.p4472c;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.sdk.msg.c.e */
public final class C87099e {

    /* renamed from: a */
    public final LinkedHashMap<Long, C87098d> f196365a = new LinkedHashMap<>();

    static {
        Covode.recordClassIndex(102895);
    }

    /* renamed from: a */
    public final C87098d mo140811a(long j) {
        return this.f196365a.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo140812a(C87098d dVar) {
        C89219l.m154719c(dVar, "");
        this.f196365a.remove(Long.valueOf(dVar.f196357f));
    }
}
