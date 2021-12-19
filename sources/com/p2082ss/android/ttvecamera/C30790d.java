package com.p2082ss.android.ttvecamera;

import android.hardware.Camera;
import android.util.Pair;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.p873a.p877d.C13392a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;

/* renamed from: com.ss.android.ttvecamera.d */
public final class C30790d {
    static {
        Covode.recordClassIndex(37415);
    }

    /* renamed from: a */
    private static Camera m63265a() {
        Pair<Boolean, Object> a = C15346a.m28238a(Camera.class, new Object[0], 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (Camera) a.second;
        }
        Camera open = Camera.open();
        C15346a.m28240a(open, Camera.class, new Object[0], 100100, "com_ss_android_ttvecamera_TECamera1PolicyAdapter_android_hardware_Camera_open()Landroid/hardware/Camera;");
        return open;
    }

    /* renamed from: a */
    private static Camera m63266a(int i) {
        Pair<Boolean, Object> a = C15346a.m28238a(Camera.class, new Object[]{Integer.valueOf(i)}, 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (Camera) a.second;
        }
        Camera open = Camera.open(i);
        C15346a.m28240a(open, Camera.class, new Object[]{Integer.valueOf(i)}, 100100, "com_ss_android_ttvecamera_TECamera1PolicyAdapter_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
        return open;
    }

    /* renamed from: a */
    private static void m63268a(Camera camera) {
        if (!((Boolean) C15346a.m28238a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, camera, new Object[0], 100106, "com_ss_android_ttvecamera_TECamera1PolicyAdapter_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            camera.release();
            C15346a.m28240a(null, camera, new Object[0], 100101, "com_ss_android_ttvecamera_TECamera1PolicyAdapter_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
        }
    }

    /* renamed from: a */
    public static void m63269a(PrivacyCert privacyCert, Camera camera) {
        if (m63270a(privacyCert, false)) {
            m63268a(camera);
        }
    }

    /* renamed from: a */
    public static Camera m63267a(PrivacyCert privacyCert, int i) {
        if (!m63270a(privacyCert, true)) {
            return null;
        }
        if (i >= 0) {
            return m63266a(i);
        }
        return m63265a();
    }

    /* renamed from: a */
    private static boolean m63270a(PrivacyCert privacyCert, boolean z) {
        boolean z2;
        if (z) {
            try {
                C13392a.C13393a.m24078a(privacyCert);
            } catch (C13340a e) {
                C30969o.m63689d("TECamera1PolicyAdapter", "error:" + e.getErrorMsg() + " errorCode:" + e.getErrorCode());
                z2 = false;
            }
        } else {
            C13392a.C13393a.m24079b(privacyCert);
        }
        z2 = true;
        C30969o.m63686a("TECamera1PolicyAdapter", "check privacy:" + z2 + ", open:" + z);
        return z2;
    }
}
