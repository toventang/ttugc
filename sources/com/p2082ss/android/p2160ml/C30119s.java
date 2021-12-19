package com.p2082ss.android.p2160ml;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.p2162bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* renamed from: com.ss.android.ml.s */
public final class C30119s extends AbstractC30118r {

    /* renamed from: a */
    private AbstractC30079f f71859a;

    static {
        Covode.recordClassIndex(36618);
    }

    public C30119s() {
        if (C30120t.f71860a) {
            new Throwable("not crash, only for debug!!");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.p2160ml.AbstractC30118r
    /* renamed from: a */
    public final void mo53442a(ByteBuffer byteBuffer, float[][] fArr) {
        AbstractC30079f fVar = this.f71859a;
        if (fVar != null) {
            fVar.mo53446a(byteBuffer, fArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.p2160ml.AbstractC30118r
    /* renamed from: a */
    public final boolean mo53443a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        AbstractC30079f b = C30074c.m60833b();
        this.f71859a = b;
        if (b != null) {
            return b.mo53447a(mappedByteBuffer, mLConfigModel);
        }
        return false;
    }
}
