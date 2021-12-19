package com.p2082ss.android.ttvecamera;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.p873a.p877d.C13392a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;

/* renamed from: com.ss.android.ttvecamera.f */
public final class C30822f {
    static {
        Covode.recordClassIndex(37447);
    }

    /* renamed from: a */
    private static void m63436a(CameraDevice cameraDevice) {
        if (!((Boolean) C15346a.m28238a(cameraDevice, new Object[0], 100201, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, cameraDevice, new Object[0], 100205, "com_ss_android_ttvecamera_TECamera2PolicyAdapter_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
            cameraDevice.close();
            C15346a.m28240a(null, cameraDevice, new Object[0], 100201, "com_ss_android_ttvecamera_TECamera2PolicyAdapter_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
        }
    }

    /* renamed from: a */
    public static void m63437a(PrivacyCert privacyCert, CameraDevice cameraDevice) {
        if (m63439a(privacyCert, false)) {
            m63436a(cameraDevice);
        }
    }

    /* renamed from: a */
    private static boolean m63439a(PrivacyCert privacyCert, boolean z) {
        boolean z2;
        if (z) {
            try {
                C13392a.C13393a.m24078a(privacyCert);
            } catch (C13340a e) {
                C30969o.m63689d("TECamera2PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
                z2 = false;
            }
        } else {
            C13392a.C13393a.m24079b(privacyCert);
        }
        z2 = true;
        C30969o.m63686a("TECamera2PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }

    /* renamed from: a */
    public static void m63438a(PrivacyCert privacyCert, CameraManager cameraManager, String str, CameraDevice.StateCallback stateCallback, Handler handler) {
        if (m63439a(privacyCert, true)) {
            cameraManager.openCamera(str, stateCallback, handler);
        }
    }
}
