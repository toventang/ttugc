package com.bytedance.android.livesdk.p437ag.p438a;

import android.content.Context;
import android.hardware.Camera;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6653a;
import com.bytedance.android.livesdk.p437ag.p440c.C6662e;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.livesdk.ag.a.b */
public final class C6644b implements AbstractC6646d {

    /* renamed from: a */
    private static AbstractC6653a f16539a;

    static {
        Covode.recordClassIndex(7382);
    }

    /* renamed from: a */
    private static void m14126a(Camera camera) {
        if (!((Boolean) C15346a.m28238a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, camera, new Object[0], 100106, "com_bytedance_android_livesdk_permission_checker_CameraChecker_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            camera.release();
            C15346a.m28240a(null, camera, new Object[0], 100101, "com_bytedance_android_livesdk_permission_checker_CameraChecker_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
        }
    }

    /* renamed from: c */
    private static Camera m14129c() {
        try {
            return m14128b();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m14127a() {
        Camera c = m14129c();
        if (c == null) {
            return false;
        }
        Field field = null;
        try {
            field = c.getClass().getDeclaredField("mHasPermission");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        if (field == null) {
            m14126a(c);
            return true;
        }
        try {
            field.setAccessible(true);
            return field.getBoolean(c);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return true;
        } finally {
            m14126a(c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb A[ExcHandler: Exception (r0v2 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:9:0x0021] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.hardware.Camera m14128b() {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p437ag.p438a.C6644b.m14128b():android.hardware.Camera");
    }

    @Override // com.bytedance.android.livesdk.p437ag.p438a.AbstractC6646d
    /* renamed from: a */
    public final boolean mo12792a(Context context, String str) {
        if (f16539a == null) {
            return m14127a();
        }
        if (!C6662e.C6663a.f16559a.mo12807b() || !f16539a.mo12803a()) {
            return false;
        }
        return true;
    }
}
