package com.facebook.imagepipeline.p1887l;

import android.graphics.BitmapFactory;
import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1840l.AbstractC24136b;
import com.facebook.common.p1840l.C24138c;
import com.facebook.imagepipeline.memory.AbstractC24485d;

/* renamed from: com.facebook.imagepipeline.l.f */
public final class C24468f extends C24467e {

    /* renamed from: b */
    private final AbstractC24136b f58117b = C24138c.m45745a();

    static {
        Covode.recordClassIndex(28611);
    }

    @Override // com.facebook.imagepipeline.p1887l.AbstractC24464b, com.facebook.imagepipeline.p1887l.C24467e
    /* renamed from: a */
    public final int mo40317a(int i, int i2, BitmapFactory.Options options) {
        return super.mo40317a(i, i2, options);
    }

    public C24468f(AbstractC24485d dVar, int i, C0693f.C0696c cVar) {
        super(dVar, i, cVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 == null) goto L_0x0020;
     */
    @Override // com.facebook.imagepipeline.p1887l.AbstractC24464b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo40318a(java.io.InputStream r4, android.graphics.BitmapFactory.Options r5, int r6, int r7, android.graphics.Bitmap r8) {
        /*
            r3 = this;
            r2 = 3439(0xd6f, float:4.819E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 != r0) goto L_0x0028
            com.facebook.common.l.b r0 = r3.f58117b
            if (r0 == 0) goto L_0x0028
            r0 = 1
        L_0x0010:
            r1 = 0
            if (r0 == 0) goto L_0x0020
            android.graphics.Bitmap$Config r0 = r5.inPreferredConfig
            r8.reconfigure(r6, r7, r0)
            com.facebook.common.l.b r0 = r3.f58117b
            android.graphics.Bitmap r0 = r0.decodeStream(r4, r1, r5)
            if (r0 != 0) goto L_0x0024
        L_0x0020:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r4, r1, r5)
        L_0x0024:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return r0
        L_0x0028:
            r0 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1887l.C24468f.mo40318a(java.io.InputStream, android.graphics.BitmapFactory$Options, int, int, android.graphics.Bitmap):android.graphics.Bitmap");
    }
}
