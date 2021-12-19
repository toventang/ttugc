package com.bytedance.lynx.hybrid.resource.p1526b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.b.d */
public final class C21248d extends C21284j {

    /* renamed from: u */
    public List<String> f50425u;

    /* renamed from: v */
    public int f50426v;

    /* renamed from: w */
    public boolean f50427w;

    /* renamed from: x */
    public int f50428x;

    /* renamed from: y */
    public boolean f50429y;

    /* renamed from: z */
    public int f50430z;

    static {
        Covode.recordClassIndex(24864);
    }

    private /* synthetic */ C21248d() {
        this("");
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.C21284j
    public final String toString() {
        return super.toString() + "\n [fallbackDomains=" + this.f50425u + ",shuffle = " + this.f50426v + ",cdnNoCache=" + this.f50427w + "，maxAttempt=" + this.f50428x + "，isRemote=" + this.f50429y + ",useInteraction = " + this.f50430z + ']';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21248d(String str) {
        super(str);
        C89219l.m154719c(str, "");
        this.f50425u = new ArrayList();
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.C21284j
    /* renamed from: a */
    public final C21284j mo34840a(C21284j jVar) {
        C89219l.m154719c(jVar, "");
        if (jVar instanceof C21248d) {
            C21248d dVar = (C21248d) jVar;
            this.f50425u = dVar.f50425u;
            this.f50426v = dVar.f50426v;
            this.f50427w = dVar.f50427w;
            this.f50428x = dVar.f50428x;
            this.f50430z = dVar.f50430z;
        }
        return super.mo34840a(jVar);
    }
}
