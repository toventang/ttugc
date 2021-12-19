package com.p2082ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.p2734c.AbstractC41028d;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.s */
public final class C41063s {

    /* renamed from: a */
    public int f95987a;

    /* renamed from: b */
    private final List<AbstractC41028d> f95988b = new ArrayList();

    static {
        Covode.recordClassIndex(48933);
    }

    /* renamed from: a */
    public final C41063s mo70274a(AbstractC41028d dVar) {
        C89219l.m154721d(dVar, "");
        this.f95988b.add(dVar);
        return this;
    }

    /* renamed from: a */
    public final void mo70275a(C41035d dVar, C41063s sVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(sVar, "");
        if (this.f95987a != this.f95988b.size()) {
            this.f95987a++;
            this.f95988b.get(this.f95987a).mo70239a(dVar, sVar);
        }
    }
}
