package com.p2082ss.android.ttvecamera.p2195d;

import android.hardware.camera2.CaptureRequest;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a;

/* renamed from: com.ss.android.ttvecamera.d.h */
public final class C30805h extends C30793b {
    static {
        Covode.recordClassIndex(37430);
    }

    public C30805h(AbstractC30791a.AbstractC30792a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a, com.p2082ss.android.ttvecamera.p2195d.C30793b
    /* renamed from: a */
    public final void mo55754a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }
}
