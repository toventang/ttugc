package com.p2082ss.android.ugc.aweme.utils.permission;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.core.content.C0643b;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.e */
public class C80620e {

    /* renamed from: a */
    public static final String f180267a = C80620e.class.getSimpleName();

    /* renamed from: b */
    private static final AbstractC80623c f180268b;

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.e$c */
    public interface AbstractC80623c {
        static {
            Covode.recordClassIndex(93897);
        }

        /* renamed from: a */
        int mo123806a(Context context);

        /* renamed from: b */
        int mo123807b(Context context);

        /* renamed from: c */
        int mo123808c(Context context);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.e$a */
    static class C80621a implements AbstractC80623c {
        static {
            Covode.recordClassIndex(93895);
        }

        /* renamed from: b */
        private static void m139783b(Camera camera) {
            if (!((Boolean) C15346a.m28238a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
                C15346a.m28240a(null, camera, new Object[0], 100106, "com_ss_android_ugc_aweme_utils_permission_PermissionUtils$BasePermissionUtil_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
                camera.release();
                C15346a.m28240a(null, camera, new Object[0], 100101, "com_ss_android_ugc_aweme_utils_permission_PermissionUtils$BasePermissionUtil_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80620e.AbstractC80623c
        /* renamed from: a */
        public int mo123806a(Context context) {
            return 0;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80620e.AbstractC80623c
        /* renamed from: c */
        public int mo123808c(Context context) {
            return 0;
        }

        C80621a() {
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0010 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m139782a(android.hardware.Camera r1) {
            /*
                r0 = 0
                r1.setPreviewTexture(r0)     // Catch:{ IOException | RuntimeException -> 0x0010, all -> 0x000b }
                r1.stopPreview()     // Catch:{ IOException | RuntimeException -> 0x0010, all -> 0x000b }
                m139783b(r1)     // Catch:{ Exception -> 0x000a }
            L_0x000a:
                return
            L_0x000b:
                r0 = move-exception
                m139783b(r1)     // Catch:{ Exception -> 0x000f }
            L_0x000f:
                throw r0
            L_0x0010:
                m139783b(r1)     // Catch:{ Exception -> 0x0013 }
            L_0x0013:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.permission.C80620e.C80621a.m139782a(android.hardware.Camera):void");
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80620e.AbstractC80623c
        /* renamed from: b */
        public int mo123807b(Context context) {
            Camera camera;
            if (Camera.getNumberOfCameras() > 0) {
                try {
                    Camera.getCameraInfo(0, new Camera.CameraInfo());
                    Pair<Boolean, Object> a = C15346a.m28238a(Camera.class, new Object[]{0}, 100100, "android.hardware.Camera", false, null);
                    if (((Boolean) a.first).booleanValue()) {
                        camera = (Camera) a.second;
                    } else {
                        Camera open = Camera.open(0);
                        C15346a.m28240a(open, Camera.class, new Object[]{0}, 100100, "com_ss_android_ugc_aweme_utils_permission_PermissionUtils$BasePermissionUtil_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
                        camera = open;
                    }
                    if (camera == null) {
                        return 0;
                    }
                    camera.setParameters(camera.getParameters());
                    m139782a(camera);
                    return 0;
                } catch (RuntimeException e) {
                    C12290b.m22060a("aweme_open_camera_error_rate", -1001, new C33743c().mo59976a("errorDesc", "Camera permission denied. " + Log.getStackTraceString(e)).mo59977a());
                    e.getLocalizedMessage();
                    if (0 != 0) {
                        m139782a((Camera) null);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        m139782a((Camera) null);
                    }
                    throw th;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m139779a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(93894);
        if (m139779a()) {
            f180268b = new C80622b();
        } else {
            f180268b = new C80621a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.e$b */
    public static class C80622b extends C80621a {
        static {
            Covode.recordClassIndex(93896);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80620e.AbstractC80623c, com.p2082ss.android.ugc.aweme.utils.permission.C80620e.C80621a
        /* renamed from: a */
        public final int mo123806a(Context context) {
            return C0643b.m2367a(context, "android.permission.RECORD_AUDIO");
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80620e.AbstractC80623c, com.p2082ss.android.ugc.aweme.utils.permission.C80620e.C80621a
        /* renamed from: b */
        public final int mo123807b(Context context) {
            return C0643b.m2367a(context, "android.permission.CAMERA");
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80620e.AbstractC80623c, com.p2082ss.android.ugc.aweme.utils.permission.C80620e.C80621a
        /* renamed from: c */
        public final int mo123808c(Context context) {
            return C0643b.m2367a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    /* renamed from: a */
    public static int m139778a(Context context) {
        return f180268b.mo123807b(context);
    }

    /* renamed from: b */
    public static int m139780b(Context context) {
        return f180268b.mo123806a(context);
    }

    /* renamed from: c */
    public static int m139781c(Context context) {
        return f180268b.mo123808c(context);
    }
}
