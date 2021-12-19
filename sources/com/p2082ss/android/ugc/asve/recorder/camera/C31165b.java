package com.p2082ss.android.ugc.asve.recorder.camera;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VECameraSettings;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.b */
public final class C31165b {

    /* renamed from: a */
    public static int f74715a = -1;

    /* renamed from: b */
    public static boolean f74716b;

    /* renamed from: c */
    public static final C31165b f74717c = new C31165b();

    private C31165b() {
    }

    static {
        Covode.recordClassIndex(37810);
    }

    /* renamed from: a */
    public static final boolean m64582a(int i) {
        if (i == -1 || i != VECameraSettings.CAMERA_TYPE.TYPE_GNOB_Unit.ordinal()) {
            return false;
        }
        return true;
    }
}
