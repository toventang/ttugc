package com.google.p1970ar.core;

import android.media.ImageReader;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.j */
public final /* synthetic */ class C27101j implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    static final ImageReader.OnImageAvailableListener f64164a = new C27101j();

    static {
        Covode.recordClassIndex(32681);
    }

    private C27101j() {
    }

    public final void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0$SharedCamera(imageReader);
    }
}
