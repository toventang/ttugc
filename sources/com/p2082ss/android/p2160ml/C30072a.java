package com.p2082ss.android.p2160ml;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.p2162bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* renamed from: com.ss.android.ml.a */
public final class C30072a extends AbstractC30118r {

    /* renamed from: a */
    private AbstractC30079f f71778a;

    static {
        Covode.recordClassIndex(36568);
    }

    public C30072a() {
        if (C30120t.f71860a) {
            new Throwable("not crash, only for debug!!");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.p2160ml.AbstractC30118r
    /* renamed from: a */
    public final void mo53442a(ByteBuffer byteBuffer, float[][] fArr) {
        AbstractC30079f fVar = this.f71778a;
        if (fVar != null) {
            fVar.mo53446a(byteBuffer, fArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.p2160ml.AbstractC30118r
    /* renamed from: a */
    public final boolean mo53443a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        AbstractC30079f a = C30074c.m60832a();
        this.f71778a = a;
        if (a != null) {
            return a.mo53447a(mappedByteBuffer, mLConfigModel);
        }
        return false;
    }
}
