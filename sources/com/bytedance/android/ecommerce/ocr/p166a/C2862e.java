package com.bytedance.android.ecommerce.ocr.p166a;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.ocr.a.e */
public final class C2862e {

    /* renamed from: a */
    public SurfaceHolder f8518a;

    /* renamed from: b */
    public SurfaceTexture f8519b;

    static {
        Covode.recordClassIndex(3288);
    }

    public C2862e(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f8519b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public C2862e(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f8518a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }
}
