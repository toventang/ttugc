package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1879d.AbstractC24380f;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1826c.p1827a.AbstractC24026e;

/* renamed from: com.facebook.imagepipeline.n.as */
public final class C24556as extends C24605o {
    static {
        Covode.recordClassIndex(28700);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.C24605o
    /* renamed from: a */
    public final boolean mo40425a(AbstractC24545al alVar) {
        return alVar.mo40413a().isResizedImageDiskCacheActuallyEnabled();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.C24605o
    /* renamed from: a */
    public final AbstractC24026e mo40424a(AbstractC24380f fVar, AbstractC24545al alVar) {
        C24636b a = alVar.mo40413a();
        alVar.mo40417d();
        return fVar.mo40189b(a);
    }

    public C24556as(C24373e eVar, C24373e eVar2, AbstractC24380f fVar, AbstractC24544ak<C24456e> akVar) {
        super(eVar, eVar2, fVar, akVar);
    }
}
