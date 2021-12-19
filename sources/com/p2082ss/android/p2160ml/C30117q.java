package com.p2082ss.android.p2160ml;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.p2162bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* renamed from: com.ss.android.ml.q */
public final class C30117q extends AbstractC30118r {

    /* renamed from: a */
    AbstractC30079f f71848a;

    /* renamed from: b */
    private String f71849b;

    static {
        Covode.recordClassIndex(36616);
    }

    public C30117q() {
        if (C30120t.f71860a) {
            new Throwable("not crash, only for debug!!");
        }
    }

    public C30117q(String str) {
        if (str != null) {
            this.f71849b = str.toLowerCase();
        }
        if (C30120t.f71860a) {
            new Throwable("not crash, only for debug!!");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.p2160ml.AbstractC30118r
    /* renamed from: a */
    public final void mo53442a(ByteBuffer byteBuffer, float[][] fArr) {
        AbstractC30079f fVar = this.f71848a;
        if (fVar != null) {
            fVar.mo53446a(byteBuffer, fArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.p2160ml.AbstractC30118r
    /* renamed from: a */
    public final boolean mo53443a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        if (TextUtils.isEmpty(this.f71849b) && mLConfigModel.model_type != null) {
            this.f71849b = mLConfigModel.model_type.toLowerCase();
        }
        if (this.f71848a == null) {
            if (!TextUtils.isEmpty(this.f71849b) && this.f71849b.startsWith("byte")) {
                AbstractC30079f a = C30074c.m60832a();
                this.f71848a = a;
                if (a == null && C30120t.f71860a) {
                    throw new RuntimeException("bytenn disabled, please config bytenn. model type: " + this.f71849b);
                }
            } else if (!TextUtils.isEmpty(this.f71849b) && this.f71849b.startsWith("tf")) {
                AbstractC30079f b = C30074c.m60833b();
                this.f71848a = b;
                if (b == null && C30120t.f71860a) {
                    throw new RuntimeException("tensorflow lite disabled, please config tensorflow lite. model type: " + this.f71849b);
                }
            } else if (C30120t.f71860a) {
                throw new RuntimeException("invalid model type: " + this.f71849b);
            }
        }
        AbstractC30079f fVar = this.f71848a;
        if (fVar != null) {
            return fVar.mo53447a(mappedByteBuffer, mLConfigModel);
        }
        return false;
    }
}
