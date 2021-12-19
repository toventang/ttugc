package com.p2082ss.android.ugc.asve.recorder.camera;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VECameraSettings;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.h */
public final class C31189h {
    static {
        Covode.recordClassIndex(37834);
    }

    /* renamed from: a */
    public static final boolean m64681a(VECameraController vECameraController) {
        C89219l.m154721d(vECameraController, "");
        if (!C31165b.f74716b || vECameraController.f74655p.mo130183a() != VECameraSettings.CAMERA_TYPE.TYPE_CamKit) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m64682b(VECameraController vECameraController) {
        C89219l.m154721d(vECameraController, "");
        if (!vECameraController.f74658s || m64681a(vECameraController)) {
            return false;
        }
        return true;
    }
}
