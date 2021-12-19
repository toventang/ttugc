package com.p2082ss.android.ttvecamera.p2192a;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.google.p1970ar.core.CameraConfig;
import com.google.p1970ar.core.Config;
import com.google.p1970ar.core.Session;
import com.google.p1970ar.core.SharedCamera;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.a.a */
public class C30756a {

    /* renamed from: a */
    public static final String f73618a = C30756a.class.getSimpleName();

    /* renamed from: b */
    static int f73619b = 5;

    /* renamed from: c */
    public Handler f73620c;

    /* renamed from: d */
    CameraCaptureSession.StateCallback f73621d;

    /* renamed from: e */
    public SharedCamera f73622e;

    /* renamed from: f */
    public Session f73623f;

    /* renamed from: g */
    List<CameraConfig> f73624g;

    /* renamed from: h */
    final Object f73625h = new Object();

    /* renamed from: i */
    public long f73626i = 0;

    /* renamed from: j */
    List<Long> f73627j = new ArrayList();

    /* renamed from: k */
    private CameraDevice.StateCallback f73628k;

    /* renamed from: l */
    private boolean f73629l;

    /* renamed from: com.ss.android.ttvecamera.a.a$a */
    public static class C30759a {

        /* renamed from: a */
        public static final C30756a f73632a = new C30756a();

        static {
            Covode.recordClassIndex(37384);
        }
    }

    /* renamed from: c */
    public final String mo55621c() {
        Session session = this.f73623f;
        if (session == null) {
            return null;
        }
        return session.getCameraConfig().getCameraId();
    }

    static {
        Covode.recordClassIndex(37381);
    }

    /* renamed from: a */
    public final void mo55616a() {
        long currentTimeMillis = System.currentTimeMillis();
        Session session = this.f73623f;
        if (session != null) {
            session.close();
            this.f73623f = null;
        }
        this.f73629l = false;
        this.f73628k = null;
        this.f73621d = null;
        this.f73624g = null;
        C30969o.m63686a(f73618a, "close consume = " + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: b */
    public final CameraDevice.StateCallback mo55620b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f73628k == null && this.f73622e != null && Build.VERSION.SDK_INT >= 21) {
            this.f73628k = this.f73622e.createARDeviceStateCallback(new CameraDevice.StateCallback() {
                /* class com.p2082ss.android.ttvecamera.p2192a.C30756a.C307582 */

                static {
                    Covode.recordClassIndex(37383);
                }

                public final void onDisconnected(CameraDevice cameraDevice) {
                    C30969o.m63686a(C30756a.f73618a, "onDisconnected");
                }

                public final void onOpened(CameraDevice cameraDevice) {
                    if (!((Boolean) C15346a.m28238a(this, new Object[]{cameraDevice}, 100200, "void", false, null).first).booleanValue()) {
                        C15346a.m28243a(this, new Object[]{cameraDevice}, 100200, "onOpened(Landroid/hardware/camera2/CameraDevice;)V");
                        C30969o.m63686a(C30756a.f73618a, "onOpened");
                    }
                }

                public final void onError(CameraDevice cameraDevice, int i) {
                    C30969o.m63686a(C30756a.f73618a, "onError");
                }
            }, this.f73620c);
        }
        C30969o.m63686a(f73618a, "getDevicesStateCallback consume = " + (System.currentTimeMillis() - currentTimeMillis));
        return this.f73628k;
    }

    /* renamed from: d */
    public final long mo55622d() {
        long j;
        MethodCollector.m26663i(11421);
        synchronized (this.f73625h) {
            try {
                j = 0;
                for (Long l : this.f73627j) {
                    j += l.longValue();
                }
                if (this.f73627j.size() > 0) {
                    j /= (long) this.f73627j.size();
                }
            } finally {
                MethodCollector.m26664o(11421);
            }
        }
        return j;
    }

    /* renamed from: a */
    public final void mo55617a(TEFrameSizei tEFrameSizei) {
        if (Build.VERSION.SDK_INT >= 21 && this.f73623f != null) {
            for (CameraConfig cameraConfig : this.f73624g) {
                if (cameraConfig.getTextureSize().getWidth() == tEFrameSizei.f73616a && cameraConfig.getTextureSize().getHeight() == tEFrameSizei.f73617b) {
                    this.f73623f.setCameraConfig(cameraConfig);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo55619a(CameraCaptureSession.CaptureCallback captureCallback) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        Session session = this.f73623f;
        if (session != null) {
            try {
                session.resume();
                this.f73622e.setCaptureCallback(captureCallback, this.f73620c);
                C30969o.m63686a(f73618a, "ARCore resumed");
                z = true;
            } catch (Exception e) {
                C30969o.m63687b(f73618a, "Failed to resume ARCore session".concat(String.valueOf(e)));
            }
            C30969o.m63686a(f73618a, "resume consume = " + (System.currentTimeMillis() - currentTimeMillis));
            return z;
        }
        z = false;
        C30969o.m63686a(f73618a, "resume consume = " + (System.currentTimeMillis() - currentTimeMillis));
        return z;
    }

    /* renamed from: a */
    public final boolean mo55618a(Context context, C30933l lVar) {
        C30933l.C30934a aVar;
        Config config;
        if (this.f73629l) {
            C30969o.m63686a(f73618a, "init already...");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (lVar.f74177at == null) {
            aVar = new C30933l.C30934a();
        } else {
            aVar = lVar.f74177at;
        }
        if (aVar.f74203a == C30933l.C30934a.EnumC30935a.MESH3D) {
            lVar.f74181e = 1;
        } else {
            lVar.f74181e = 0;
        }
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(Session.Feature.SHARED_CAMERA);
            if (lVar.f74181e == 1) {
                hashSet.add(Session.Feature.FRONT_CAMERA);
            }
            this.f73623f = new Session(context, hashSet);
            String str = f73618a;
            C30969o.m63686a(str, "create session consume = " + (System.currentTimeMillis() - currentTimeMillis));
            Session session = this.f73623f;
            if (session == null) {
                config = null;
            } else {
                config = new Config(this.f73623f);
                config.setAugmentedFaceMode(Config.AugmentedFaceMode.values()[aVar.f74203a.ordinal()]);
                config.setCloudAnchorMode(Config.CloudAnchorMode.values()[aVar.f74204b.ordinal()]);
                config.setDepthMode(Config.DepthMode.values()[aVar.f74205c.ordinal()]);
                config.setFocusMode(Config.FocusMode.values()[aVar.f74206d.ordinal()]);
                config.setLightEstimationMode(Config.LightEstimationMode.values()[aVar.f74207e.ordinal()]);
                config.setPlaneFindingMode(Config.PlaneFindingMode.values()[aVar.f74208f.ordinal()]);
                if (!this.f73623f.isDepthModeSupported(config.getDepthMode())) {
                    C30969o.m63687b(str, config.getDepthMode().name() + " is not supported, fallback to DepthMode.DISABLED");
                    config.setDepthMode(Config.DepthMode.DISABLED);
                }
            }
            session.configure(config);
            C30969o.m63686a(str, "configure consume = " + (System.currentTimeMillis() - currentTimeMillis) + ", get id =" + mo55621c());
        } catch (Exception e) {
            String str2 = f73618a;
            if ((C30969o.f74248b & 1) != 0) {
                C30969o.f74249c.Log((byte) 1, str2, "Failed to create ARCore session that supports camera sharing" + e.getMessage() + "stack: " + Log.getStackTraceString(e));
            }
        }
        Session session2 = this.f73623f;
        if (session2 == null) {
            C30969o.m63689d(f73618a, "create ar session failed...");
            return false;
        }
        this.f73622e = session2.getSharedCamera();
        this.f73629l = true;
        return true;
    }
}
