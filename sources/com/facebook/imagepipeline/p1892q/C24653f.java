package com.facebook.imagepipeline.p1892q;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.C24610q;
import com.facebook.p1870h.C24313b;
import com.facebook.p1870h.C24314c;

/* renamed from: com.facebook.imagepipeline.q.f */
public final class C24653f implements AbstractC24649b {

    /* renamed from: a */
    private final boolean f58574a;

    /* renamed from: b */
    private final int f58575b;

    static {
        Covode.recordClassIndex(28803);
    }

    @Override // com.facebook.imagepipeline.p1892q.AbstractC24649b
    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    @Override // com.facebook.imagepipeline.p1892q.AbstractC24649b
    public final boolean canTranscode(C24314c cVar) {
        if (cVar == C24313b.f57661k || cVar == C24313b.f57651a) {
            return true;
        }
        return false;
    }

    public C24653f(boolean z, int i) {
        this.f58574a = z;
        this.f58575b = i;
    }

    @Override // com.facebook.imagepipeline.p1892q.AbstractC24649b
    public final boolean canResize(C24456e eVar, C24364e eVar2, C24363d dVar) {
        if (eVar2 == null) {
            eVar2 = C24364e.f57783b;
        }
        if (!this.f58574a || C24610q.m47101a(eVar2, dVar, eVar, this.f58575b) <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd A[SYNTHETIC, Splitter:B:39:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e4 A[Catch:{ OutOfMemoryError -> 0x00f2 }] */
    @Override // com.facebook.imagepipeline.p1892q.AbstractC24649b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.imagepipeline.p1892q.C24648a transcode(com.facebook.imagepipeline.p1885j.C24456e r19, java.io.OutputStream r20, com.facebook.imagepipeline.common.C24364e r21, com.facebook.imagepipeline.common.C24363d r22, com.facebook.p1870h.C24314c r23, java.lang.Integer r24) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1892q.C24653f.transcode(com.facebook.imagepipeline.j.e, java.io.OutputStream, com.facebook.imagepipeline.common.e, com.facebook.imagepipeline.common.d, com.facebook.h.c, java.lang.Integer):com.facebook.imagepipeline.q.a");
    }
}
