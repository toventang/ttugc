package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.p */
public final class C50630p extends AbstractC50627n {
    static {
        Covode.recordClassIndex(59786);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abnor_record";
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        GsonProvider c = GsonHolder.m138943c();
        C89219l.m154716b(c, "");
        String b = c.mo123620b().mo46674b(mo85943d());
        C89219l.m154716b(b, "");
        return b;
    }
}
