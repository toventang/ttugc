package com.p2082ss.android.ttvecamera.p2195d;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.d.a */
public interface AbstractC30791a {

    /* renamed from: com.ss.android.ttvecamera.d.a$a */
    public interface AbstractC30792a {
        static {
            Covode.recordClassIndex(37417);
        }

        /* renamed from: a */
        void mo55757a(CaptureRequest.Builder builder);

        /* renamed from: f */
        int mo55647f();

        /* renamed from: g */
        int mo55648g();
    }

    static {
        Covode.recordClassIndex(37416);
    }

    /* renamed from: a */
    int mo55751a();

    /* renamed from: a */
    CameraCaptureSession.CaptureCallback mo55752a(CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z);

    /* renamed from: a */
    CameraCaptureSession.CaptureCallback mo55753a(boolean z);

    /* renamed from: a */
    void mo55754a(CaptureRequest.Builder builder);

    /* renamed from: a */
    void mo55755a(CaptureRequest.Builder builder, Rect rect);

    /* renamed from: b */
    void mo55756b(CaptureRequest.Builder builder, Rect rect);
}
