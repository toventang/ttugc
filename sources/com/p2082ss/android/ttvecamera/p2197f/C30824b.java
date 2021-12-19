package com.p2082ss.android.ttvecamera.p2197f;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30806e;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.p2193b.C30781b;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.f.b */
public final class C30824b extends C30781b {
    static {
        Covode.recordClassIndex(37449);
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final int mo55812a(List<Surface> list) {
        if (Build.VERSION.SDK_INT < 28 || list.size() != 1 || !this.f73790A.f74151R) {
            C30969o.m63686a("GNOBMediaVideo2Mode", "gnob media create normal session, surface size = " + list.size() + " video stable = " + this.f73790A.f74151R);
            return 0;
        }
        C30969o.m63686a("GNOBMediaVideo2Mode", "gnob media create session");
        return 57355;
    }

    public C30824b(C30806e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final void mo55717a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler, boolean z) {
        super.mo55717a(list, stateCallback, handler, true);
    }
}
