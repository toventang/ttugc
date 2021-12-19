package com.facebook.imagepipeline.p1892q;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.nativecode.C24631a;
import com.facebook.p1870h.C24314c;

/* renamed from: com.facebook.imagepipeline.q.e */
public final class C24652e implements AbstractC24650c {

    /* renamed from: a */
    private final int f58570a;

    /* renamed from: b */
    private final boolean f58571b;

    /* renamed from: c */
    private final AbstractC24650c f58572c;

    /* renamed from: d */
    private final Integer f58573d;

    static {
        Covode.recordClassIndex(28802);
    }

    /* renamed from: b */
    private AbstractC24649b m47163b(C24314c cVar, boolean z) {
        return new C24631a(this.f58570a, this.f58571b).mo40473a(cVar, z);
    }

    /* renamed from: c */
    private AbstractC24649b m47164c(C24314c cVar, boolean z) {
        return new C24654g(this.f58570a).mo40473a(cVar, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r0 == null) goto L_0x0009;
     */
    @Override // com.facebook.imagepipeline.p1892q.AbstractC24650c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.imagepipeline.p1892q.AbstractC24649b mo40473a(com.facebook.p1870h.C24314c r3, boolean r4) {
        /*
            r2 = this;
            com.facebook.imagepipeline.q.c r1 = r2.f58572c
            r0 = 0
            if (r1 != 0) goto L_0x0029
        L_0x0005:
            java.lang.Integer r0 = r2.f58573d
            if (r0 != 0) goto L_0x0014
        L_0x0009:
            com.facebook.imagepipeline.q.b r0 = r2.m47163b(r3, r4)
            if (r0 != 0) goto L_0x0038
            com.facebook.imagepipeline.q.b r0 = r2.m47164c(r3, r4)
            return r0
        L_0x0014:
            int r1 = r0.intValue()
            if (r1 == 0) goto L_0x0024
            r0 = 1
            if (r1 != r0) goto L_0x0030
            com.facebook.imagepipeline.q.b r0 = r2.m47164c(r3, r4)
        L_0x0021:
            if (r0 != 0) goto L_0x0038
            goto L_0x0009
        L_0x0024:
            com.facebook.imagepipeline.q.b r0 = r2.m47163b(r3, r4)
            goto L_0x0021
        L_0x0029:
            com.facebook.imagepipeline.q.b r0 = r1.mo40473a(r3, r4)
            if (r0 != 0) goto L_0x0038
            goto L_0x0005
        L_0x0030:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid ImageTranscoderType"
            r1.<init>(r0)
            throw r1
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1892q.C24652e.mo40473a(com.facebook.h.c, boolean):com.facebook.imagepipeline.q.b");
    }

    public C24652e(int i, boolean z, AbstractC24650c cVar, Integer num) {
        this.f58570a = i;
        this.f58571b = z;
        this.f58572c = cVar;
        this.f58573d = num;
    }
}
