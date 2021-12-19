package com.p2082ss.android.ttvecamera;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Range;
import android.util.Size;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.p2192a.C30760b;
import com.p2082ss.android.ttvecamera.p2193b.C30771a;
import com.p2082ss.android.ttvecamera.p2193b.C30781b;
import com.p2082ss.android.ttvecamera.p2194c.C30783a;
import com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b;
import com.p2082ss.android.ttvecamera.p2197f.C30823a;
import com.p2082ss.android.ttvecamera.p2198g.C30834e;
import com.p2082ss.android.ttvecamera.p2200i.C30852a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.e */
public class C30806e extends AbstractC30825g {

    /* renamed from: a */
    protected C30834e f73767a;

    /* renamed from: b */
    public volatile int f73768b;

    /* renamed from: c */
    protected CameraCharacteristics f73769c;

    /* renamed from: d */
    protected CaptureRequest f73770d;

    /* renamed from: e */
    protected CameraManager f73771e;

    /* renamed from: f */
    protected volatile CameraDevice f73772f;

    /* renamed from: g */
    protected int f73773g = -1;

    /* renamed from: h */
    protected boolean f73774h = true;

    /* renamed from: i */
    protected AbstractC30813b f73775i;

    /* renamed from: j */
    protected boolean f73776j;

    /* renamed from: k */
    protected boolean f73777k;

    /* renamed from: l */
    protected ConditionVariable f73778l = new ConditionVariable();

    /* renamed from: m */
    protected CameraDevice.StateCallback f73779m = new CameraDevice.StateCallback() {
        /* class com.p2082ss.android.ttvecamera.C30806e.C308071 */

        /* renamed from: a */
        C30808a<CameraDevice> f73780a;

        static {
            Covode.recordClassIndex(37432);
        }

        /* renamed from: a */
        private static void m63376a(CameraDevice cameraDevice) {
            if (!((Boolean) C15346a.m28238a(cameraDevice, new Object[0], 100201, "void", false, null).first).booleanValue()) {
                C15346a.m28240a(null, cameraDevice, new Object[0], 100205, "com_ss_android_ttvecamera_TECamera2$1_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
                cameraDevice.close();
                C15346a.m28240a(null, cameraDevice, new Object[0], 100201, "com_ss_android_ttvecamera_TECamera2$1_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
            }
        }

        {
            this.f73780a = new C30808a<>(C30806e.this);
        }

        public final void onClosed(CameraDevice cameraDevice) {
            if (C30806e.this.f73775i instanceof C30760b) {
                ((C30760b) C30806e.this.f73775i).mo55639a(cameraDevice, 4, -1);
            }
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            C30969o.m63686a("TECamera2", "onDisconnected: OpenCameraCallBack");
            if (C30806e.this.f73775i instanceof C30760b) {
                ((C30760b) C30806e.this.f73775i).mo55639a(cameraDevice, 1, -1);
            }
            C30806e.this.mo55790F();
            C30808a<CameraDevice> aVar = this.f73780a;
            if (aVar != null) {
                C30969o.m63689d("TECamera2", "StateCallback::onDisconnected...");
                C30806e eVar = aVar.f73782a.get();
                if (eVar == null) {
                    return;
                }
                if (eVar.f73847o.f74169aj) {
                    C30969o.m63689d("TECamera2", "StateCallback::onDisconnected...ignore reset...");
                    eVar.f73847o.f74169aj = false;
                    return;
                }
                C30808a.RunnableC308102 r1 = new Runnable(eVar) {
                    /* class com.p2082ss.android.ttvecamera.C30806e.C30808a.RunnableC308102 */

                    /* renamed from: a */
                    final /* synthetic */ C30806e f73785a;

                    static {
                        Covode.recordClassIndex(37435);
                    }

                    public final void run() {
                        C30806e eVar = this.f73785a;
                        eVar.mo55795c(eVar.f73844D);
                    }

                    {
                        this.f73785a = r2;
                    }
                };
                if (eVar.f73847o.f74188l) {
                    eVar.f73850r.post(r1);
                } else {
                    r1.run();
                }
            }
        }

        public final void onOpened(CameraDevice cameraDevice) {
            if (!((Boolean) C15346a.m28238a(this, new Object[]{cameraDevice}, 100200, "void", false, null).first).booleanValue()) {
                C15346a.m28243a(this, new Object[]{cameraDevice}, 100200, "onOpened(Landroid/hardware/camera2/CameraDevice;)V");
                C30969o.m63686a("TECamera2", "onOpened: OpenCameraCallBack");
                C30806e.this.f73849q.mo55846a(107, 0, "did start camera2");
                if (C30806e.this.f73775i instanceof C30760b) {
                    ((C30760b) C30806e.this.f73775i).mo55639a(cameraDevice, 0, -1);
                }
                C30806e.this.f73772f = cameraDevice;
                C30806e.this.f73775i.mo55817a(cameraDevice);
                C30806e.this.mo55790F();
                C30808a<CameraDevice> aVar = this.f73780a;
                if (aVar == null || !aVar.mo55808a()) {
                    m63376a(cameraDevice);
                    AbstractC30825g.AbstractC30826a aVar2 = C30806e.this.f73849q;
                    CameraDevice cameraDevice2 = C30806e.this.f73772f;
                    aVar2.mo55846a(110, 0, "onOpened error closePrivacy");
                    C30969o.m63688c("TECamera2", "onOpened: OpenCameraCallBack, some bad case occur, close camera!");
                } else if (C30806e.this.f73777k && C30806e.this.f73776j) {
                    m63376a(cameraDevice);
                    AbstractC30825g.AbstractC30826a aVar3 = C30806e.this.f73849q;
                    CameraDevice cameraDevice3 = C30806e.this.f73772f;
                    aVar3.mo55846a(110, 0, "close intent... closePrivacy");
                    C30969o.m63688c("TECamera2", "onOpened: OpenCameraCallBack, but had camera close intent...");
                    C30806e.this.f73776j = false;
                }
            }
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            C30969o.m63686a("TECamera2", "onError: ".concat(String.valueOf(i)));
            if (C30806e.this.f73775i instanceof C30760b) {
                ((C30760b) C30806e.this.f73775i).mo55639a(cameraDevice, 3, i);
            }
            C30806e.this.mo55790F();
            C30808a<CameraDevice> aVar = this.f73780a;
            if (aVar == null) {
                C30969o.m63689d("TECamera2", "had called onError");
                return;
            }
            C30969o.m63686a("TECamera2", "StateCallback::onError...");
            C30806e eVar = aVar.f73782a.get();
            if (eVar != null) {
                C30808a.RunnableC308113 r1 = new Runnable(eVar, i) {
                    /* class com.p2082ss.android.ttvecamera.C30806e.C30808a.RunnableC308113 */

                    /* renamed from: a */
                    final /* synthetic */ C30806e f73787a;

                    /* renamed from: b */
                    final /* synthetic */ int f73788b;

                    static {
                        Covode.recordClassIndex(37436);
                    }

                    public final void run() {
                        C30806e eVar = this.f73787a;
                        eVar.mo55795c(eVar.f73844D);
                        if (this.f73787a.f73849q != null) {
                            AbstractC30825g.AbstractC30826a aVar = this.f73787a.f73849q;
                            int i = this.f73787a.f73847o.f74179c;
                            int i2 = this.f73788b;
                            CameraDevice cameraDevice = this.f73787a.f73772f;
                            aVar.mo55845a(i, i2);
                        }
                    }

                    {
                        this.f73787a = r2;
                        this.f73788b = r3;
                    }
                };
                if (eVar.f73847o.f74188l) {
                    eVar.f73850r.post(r1);
                } else {
                    r1.run();
                }
                eVar.mo55798f(4);
            }
            this.f73780a = null;
        }
    };

    static {
        Covode.recordClassIndex(37431);
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55670a(C30933l.AbstractC30955p pVar) {
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: e */
    public final int mo55685e() {
        return 2;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: q */
    public final boolean mo55697q() {
        return true;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: r */
    public final boolean mo55698r() {
        return true;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55666a(Bundle bundle) {
        super.mo55666a(bundle);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f73842B.get(this.f73847o.f74139F);
            for (String str : bundle.keySet()) {
                if (C30933l.C30950k.m63656a(str, m63315a(bundle, str)) && "support_light_soft".equalsIgnoreCase(str)) {
                    bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55667a(PrivacyCert privacyCert) {
        super.mo55667a(privacyCert);
        if (this.f73772f != null) {
            C30822f.m63437a(privacyCert, this.f73772f);
            this.f73772f = null;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55793a(C30852a aVar, C30933l.AbstractC30942c cVar) {
        this.f73775i.mo55713a(aVar, this.f73854v, cVar);
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55668a(C30933l.AbstractC30951l lVar) {
        AbstractC30813b bVar;
        if (this.f73768b == 1) {
            C30969o.m63687b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f73768b == 2) {
            C30969o.m63687b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "takePicture : camera is null.");
            this.f73849q.mo55847a(-401, "takePicture : camera is null.");
        } else {
            bVar.mo55715a(lVar, this.f73854v);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55672a(C30966n nVar) {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "setFocusAreas...");
        if (this.f73768b == 1) {
            C30969o.m63687b("TECamera2", "Camera is opening, ignore setFocusAreas operation.");
            nVar.f74246m.mo56059a(0, this.f73847o.f74181e, "Camera is opening, ignore setFocusAreas operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "focusAtPoint : camera is null.");
            nVar.f74246m.mo56059a(-401, this.f73847o.f74181e, "focusAtPoint : camera is null.");
            this.f73849q.mo55847a(-401, "focusAtPoint : camera is null.");
        } else {
            int a = bVar.mo55633a(nVar);
            if (a != 0) {
                this.f73849q.mo55846a(-411, a, "focusAtPoint : something wrong.");
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55674a(boolean z) {
        AbstractC30813b bVar;
        C30969o.m63686a("TECamera2", "setAutoExposureLock...");
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setAutoExposureLock operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null || bVar.f73824t == null) {
            C30969o.m63689d("TECamera2", "setAutoExposureLock : camera is null.");
            this.f73849q.mo55847a(-401, "setAutoExposureLock : camera is null.");
        } else if (Build.VERSION.SDK_INT < 23) {
            C30969o.m63688c("TECamera2", "Current camera doesn't support auto exposure lock.");
            this.f73849q.mo55846a(-426, -426, "Current camera doesn't support auto exposure lock.");
        } else {
            Boolean bool = (Boolean) this.f73775i.f73824t.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
            if (bool == null || !bool.booleanValue()) {
                C30969o.m63688c("TECamera2", "Current camera doesn't support auto exposure lock.");
                this.f73849q.mo55846a(-426, -426, "Current camera doesn't support auto exposure lock.");
                return;
            }
            AbstractC30813b bVar2 = this.f73775i;
            if (bVar2.f73826v == null || bVar2.f73827w == null) {
                bVar2.f73829y.mo55847a(-100, "setExposureCompensation : Capture Session is null");
                return;
            }
            try {
                bVar2.f73826v.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z));
                bVar2.mo55822d(bVar2.f73826v);
            } catch (Exception e) {
                e.printStackTrace();
                bVar2.f73829y.mo55846a(-427, -427, e.toString());
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55673a(String str) {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "setWhileBalance: ".concat(String.valueOf(str)));
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63688c("TECamera2", "setWhileBalance : camera is null.");
            this.f73849q.mo55847a(-401, "setWhileBalance : camera is null.");
        } else {
            bVar.mo55640a(str);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55792a(long j) {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "setShutterTime : ".concat(String.valueOf(j)));
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setShutterTime operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63688c("TECamera2", "setISO : camera is null.");
            this.f73849q.mo55847a(-401, "setISO : camera is null.");
        } else {
            if (bVar.f73826v == null || bVar.f73827w == null) {
                bVar.f73829y.mo55846a(-431, -431, "Capture Session is null");
            }
            if (j > bVar.mo55827s()[1] || j < bVar.mo55827s()[0]) {
                bVar.f73829y.mo55846a(-431, -431, "invalid shutter time");
                return;
            }
            if (!((Integer) bVar.f73826v.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
                bVar.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 0);
            }
            if (!((Integer) bVar.f73826v.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
                bVar.f73826v.set(CaptureRequest.CONTROL_MODE, 0);
            }
            bVar.f73826v.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j));
            AbstractC30813b.C30820a d = bVar.mo55822d(bVar.f73826v);
            if (!d.f73839a) {
                C30969o.m63689d("TECameraModeBase", "setShutterTime exception: " + d.f73840b);
                bVar.f73829y.mo55846a(-431, -431, d.f73840b);
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55671a(C30933l.AbstractC30955p pVar, boolean z) {
        AbstractC30813b bVar;
        if (!m63312K() || (bVar = this.f73775i) == null || bVar.f73824t == null) {
            C30969o.m63689d("TECamera2", "queryZoomAbility: camera is null.");
            this.f73849q.mo55847a(-401, "queryZoomAbility: camera is null.");
        } else if (this.f73767a == null) {
            C30969o.m63689d("TECamera2", "DeviceProxy is null!");
            this.f73849q.mo55847a(-420, "");
        } else {
            float a = C30834e.m63523a(this.f73775i.f73824t, this.f73847o.f74179c, this.f73847o.f74191o);
            this.f73856x = a;
            C30969o.m63687b("TECamera2", "zoom: " + a + ", factor = " + this.f73847o.f74191o);
            if (pVar != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf((int) (100.0f * a)));
                pVar.onZoomSupport(this.f73847o.f74179c, a > 0.0f, false, a, arrayList);
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55669a(C30933l.AbstractC30953n nVar) {
        AbstractC30813b bVar;
        if (!m63312K() || (bVar = this.f73775i) == null || bVar.f73824t == null) {
            C30969o.m63689d("TECamera2", "queryShaderZoomStep: camera is null.");
            this.f73849q.mo55847a(-401, "queryShaderZoomStep: camera is null.");
        } else if (this.f73767a == null) {
            C30969o.m63689d("TECamera2", "DeviceProxy is null!");
            this.f73849q.mo55847a(-420, "");
        } else {
            C30834e.m63522a(this.f73775i.f73824t);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55662a(float f, C30933l.AbstractC30955p pVar) {
        AbstractC30813b bVar;
        if (this.f73768b != 3) {
            C30969o.m63689d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f73849q.mo55846a(-420, -420, "Invalid state, state = " + this.f73768b);
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -401. Reason: camera is null");
            this.f73849q.mo55847a(-401, "startZoom : Camera is null.");
        } else {
            bVar.mo55632a(f, pVar);
        }
    }

    /* renamed from: K */
    private boolean m63312K() {
        if (this.f73772f != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: v */
    public final int mo55799v() {
        return this.f73775i.mo55744U_();
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: w */
    public final int mo55800w() {
        return this.f73775i.mo55745V_();
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: h */
    public final int[] mo55688h() {
        AbstractC30813b bVar = this.f73775i;
        if (bVar == null) {
            return null;
        }
        return bVar.mo55708T_();
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: j */
    public final int mo55690j() {
        AbstractC30813b bVar = this.f73775i;
        if (bVar == null) {
            return -1;
        }
        return bVar.mo55725n();
    }

    /* renamed from: F */
    public final void mo55790F() {
        if (this.f73847o.f74188l) {
            this.f73778l.open();
            C30969o.m63686a("TECamera2", "open camera-operation lock");
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: k */
    public final int[] mo55691k() {
        AbstractC30813b bVar = this.f73775i;
        if (bVar != null) {
            return bVar.mo55720i();
        }
        C30969o.m63689d("TECamera2", "get picture size failed, no mode...");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo55801x() {
        C30969o.m63687b("TECamera2", "create TEVideo2Mode");
        this.f73775i = new C30781b(this, this.f73851s, this.f73771e, this.f73850r);
    }

    /* renamed from: com.ss.android.ttvecamera.e$a */
    public static class C30808a<T> {

        /* renamed from: a */
        WeakReference<C30806e> f73782a;

        static {
            Covode.recordClassIndex(37433);
        }

        /* renamed from: a */
        public final boolean mo55808a() {
            C30969o.m63686a("TECamera2", "StateCallback::onOpened...");
            final C30806e eVar = this.f73782a.get();
            if (eVar == null) {
                return false;
            }
            eVar.f73847o.f74169aj = false;
            eVar.mo55798f(2);
            RunnableC308091 r1 = new Runnable() {
                /* class com.p2082ss.android.ttvecamera.C30806e.C30808a.RunnableC308091 */

                static {
                    Covode.recordClassIndex(37434);
                }

                public final void run() {
                    if (eVar.f73849q != null) {
                        AbstractC30825g.AbstractC30826a aVar = eVar.f73849q;
                        int i = eVar.f73847o.f74179c;
                        CameraDevice cameraDevice = eVar.f73772f;
                        aVar.mo55845a(i, 0);
                        return;
                    }
                    C30969o.m63689d("TECamera2", "mCameraEvents is null!");
                }
            };
            if (eVar.f73847o.f74188l) {
                eVar.f73850r.post(r1);
            } else {
                r1.run();
            }
            eVar.f73774h = false;
            return true;
        }

        public C30808a(C30806e eVar) {
            this.f73782a = new WeakReference<>(eVar);
        }
    }

    /* renamed from: J */
    private int m63311J() {
        AbstractC30813b bVar = this.f73775i;
        if (bVar == null) {
            this.f73849q.mo55847a(-425, "_stopCapture : mode is null");
            return -1;
        }
        try {
            bVar.mo55641b();
            this.f73849q.mo55851b("TECamera2 preview stoped");
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            this.f73849q.mo55847a(-425, "Error:_stopCapture : mode is null");
            return -1;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: B */
    public final int mo55786B() {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "getISO...");
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setISO operation.");
            return -1;
        } else if (m63312K() && (bVar = this.f73775i) != null) {
            return bVar.mo55826r();
        } else {
            C30969o.m63688c("TECamera2", "getISO : camera is null.");
            this.f73849q.mo55847a(-401, "getISO : camera is null.");
            return -1;
        }
    }

    /* renamed from: E */
    public final void mo55789E() {
        if (this.f73847o.f74188l) {
            this.f73778l.close();
            C30969o.m63686a("TECamera2", "block camera-operation start...");
            C30969o.m63686a("TECamera2", "block camera-operation end...result = ".concat(String.valueOf(this.f73778l.block(1000))));
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55675b() {
        C30969o.m63687b("TECamera2", "stopCapture...");
        if (!m63312K()) {
            C30969o.m63689d("TECamera2", "Device is not ready.");
            return;
        }
        if (this.f73768b != 3) {
            C30969o.m63689d("TECamera2", "Invalid state: " + this.f73768b);
        }
        m63311J();
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: i */
    public final int mo55689i() {
        int i;
        int a = C30956m.m63659a(this.f73851s);
        this.f73853u = this.f73854v;
        CameraCharacteristics cameraCharacteristics = this.f73769c;
        if (cameraCharacteristics != null) {
            i = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } else {
            i = this.f73847o.f74182f;
        }
        if (this.f73853u == 1) {
            this.f73855w = (i + a) % 360;
            this.f73855w = ((360 - this.f73855w) + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
        } else {
            this.f73855w = ((i - a) + 360) % 360;
        }
        return this.f73855w;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: m */
    public final void mo55693m() {
        AbstractC30813b bVar;
        if (this.f73768b == 1) {
            C30969o.m63687b("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "cancelFocus : camera is null.");
            this.f73849q.mo55847a(-401, "cancelFocus : camera is null.");
        } else {
            bVar.mo55646e();
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: n */
    public final void mo55694n() {
        AbstractC30813b bVar;
        if (this.f73768b == 1) {
            C30969o.m63687b("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "enableCaf : camera is null.");
            this.f73849q.mo55847a(-401, "enableCaf : camera is null.");
        } else {
            bVar.mo55824p();
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: o */
    public final boolean mo55695o() {
        AbstractC30813b bVar;
        C30969o.m63686a("TECamera2", "isSupportedExposureCompensation...");
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        } else if (m63312K() && (bVar = this.f73775i) != null && bVar.f73824t != null) {
            return this.f73847o.f74141H.mo56039a();
        } else {
            C30969o.m63689d("TECamera2", "isSupportedExposureCompensation : camera is null.");
            this.f73849q.mo55847a(-401, "isSupportedExposureCompensation : camera is null.");
            return false;
        }
    }

    /* renamed from: I */
    private int m63310I() {
        AbstractC30813b bVar = this.f73775i;
        if (bVar == null) {
            this.f73857y = 0;
            this.f73849q.mo55850b(-425, "_startCapture : mode is null");
            return -1;
        }
        try {
            int d = bVar.mo55645d();
            if (d != 0) {
                mo55790F();
                this.f73849q.mo55850b(d, "_startCapture : something wrong");
            }
            return d;
        } catch (Exception e) {
            mo55790F();
            e.printStackTrace();
            C30840h.m63546a(e);
            this.f73849q.mo55850b(-425, "_startCapture : mode is null, err msg: " + e.getMessage());
            return -1;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: A */
    public final int[] mo55785A() {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "getISORange...");
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
            return new int[]{-1, -1};
        } else if (m63312K() && (bVar = this.f73775i) != null) {
            return bVar.mo55825q();
        } else {
            C30969o.m63688c("TECamera2", "setWhileBalance : camera is null.");
            this.f73849q.mo55847a(-401, "setWhileBalance : camera is null.");
            return new int[]{-1, -1};
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: C */
    public final long[] mo55787C() {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "getShutterTimeRange...");
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore getShutterTimeRange operation.");
            return new long[]{-1, -1};
        } else if (m63312K() && (bVar = this.f73775i) != null) {
            return bVar.mo55827s();
        } else {
            C30969o.m63688c("TECamera2", "getShutterTimeRange : camera is null.");
            this.f73849q.mo55847a(-401, "getShutterTimeRange : camera is null.");
            return new long[]{-1, -1};
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: D */
    public final float[] mo55788D() {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "getApertureRange...");
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore getApertureRange operation.");
            return new float[]{-1.0f, -1.0f};
        } else if (m63312K() && (bVar = this.f73775i) != null) {
            return bVar.mo55828t();
        } else {
            C30969o.m63688c("TECamera2", "getApertureRange : camera is null.");
            this.f73849q.mo55847a(-401, "getApertureRange : camera is null.");
            return new float[]{-1.0f, -1.0f};
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: f */
    public final int[] mo55686f() {
        Range range;
        AbstractC30813b bVar = this.f73775i;
        if (bVar == null || bVar.f73826v == null || (range = (Range) bVar.f73826v.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) == null) {
            return null;
        }
        return new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: l */
    public final float[] mo55692l() {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "getVFOV...");
        if (this.f73768b == 1) {
            C30969o.m63687b("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        } else if (m63312K() && (bVar = this.f73775i) != null) {
            return bVar.mo55829u();
        } else {
            C30969o.m63689d("TECamera2", "getFOV : camera is null.");
            this.f73849q.mo55847a(-401, "getFOV : camera is null.");
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: p */
    public final boolean mo55696p() {
        AbstractC30813b bVar;
        Boolean bool;
        C30969o.m63686a("TECamera2", "isAutoExposureLockSupported...");
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore isAutoExposureLockSupported operation.");
            return false;
        } else if (!m63312K() || (bVar = this.f73775i) == null || bVar.f73824t == null) {
            C30969o.m63689d("TECamera2", "isAutoExposureLockSupported : camera is null.");
            this.f73849q.mo55847a(-401, "isAutoExposureLockSupported : camera is null.");
            return false;
        } else if (Build.VERSION.SDK_INT >= 23 && (bool = (Boolean) this.f73775i.f73824t.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE)) != null) {
            return bool.booleanValue();
        } else {
            return false;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: s */
    public final boolean mo55699s() {
        AbstractC30813b bVar;
        if (!m63312K() || (bVar = this.f73775i) == null || bVar.f73824t == null) {
            C30969o.m63688c("TECamera2", "Query torch info failed, you must open camera first.");
            this.f73849q.mo55847a(-401, "Query torch info failed, you must open camera first.");
            return false;
        } else if (this.f73767a == null) {
            C30969o.m63689d("TECamera2", "DeviceProxy is null!");
            this.f73849q.mo55847a(-417, "");
            return false;
        } else {
            Bundle bundle = this.f73842B.get(this.f73847o.f74139F);
            if (bundle == null) {
                return false;
            }
            return bundle.getBoolean("camera_torch_supported", false);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: y */
    public final void mo55802y() {
        if (!m63312K()) {
            C30969o.m63689d("TECamera2", "Device is not ready.");
            return;
        }
        AbstractC30813b bVar = this.f73775i;
        if (bVar != null && bVar.f73827w != null && Build.VERSION.SDK_INT >= 28) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                bVar.f73827w.abortCaptures();
            } catch (Exception e) {
                C30969o.m63689d("TECameraModeBase", "abort session failed, e: " + e.getMessage());
            }
            C30969o.m63686a("TECameraModeBase", "abort session...consume = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: z */
    public final float mo55803z() {
        AbstractC30813b bVar;
        if (this.f73768b == 1) {
            C30969o.m63687b("TECamera2", "Camera is opening, ignore getManualFocusAbility operation.");
            return -1.0f;
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "getManualFocusAbility : camera is null.");
            this.f73849q.mo55847a(-401, "getManualFocusAbility : camera is null.");
            return -1.0f;
        } else {
            if (bVar.f73826v == null || bVar.f73827w == null) {
                bVar.f73829y.mo55846a(-435, -435, "Capture Session is null");
            }
            float floatValue = ((Float) bVar.f73824t.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE)).floatValue();
            if (floatValue >= 0.0f) {
                return floatValue;
            }
            bVar.f73829y.mo55846a(-435, -435, "can not get manual focus ability");
            return -1.0f;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: t */
    public final Bundle mo55700t() {
        ArrayList<? extends Parcelable> arrayList;
        Bundle t = super.mo55700t();
        t.putParcelableArrayList("support_preview_sizes", (ArrayList) C30956m.m63666a(((StreamConfigurationMap) this.f73775i.f73824t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class)));
        t.putParcelableArrayList("support_picture_sizes", (ArrayList) C30956m.m63666a(((StreamConfigurationMap) this.f73775i.f73824t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256)));
        Range[] rangeArr = (Range[]) this.f73775i.f73824t.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        boolean z = false;
        if (rangeArr == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>(rangeArr.length);
            for (Range range : rangeArr) {
                arrayList.add(new TEFrameRateRange(((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()));
            }
        }
        t.putParcelableArrayList("camera_support_fps_range", arrayList);
        if (C30834e.m63531d(this.f73775i.f73824t) && Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        t.putBoolean("device_support_multicamera_zoom", z);
        return t;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: u */
    public final void mo55701u() {
        if (m63443H()) {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            CameraManager cameraManager = this.f73771e;
            if (cameraManager != null) {
                try {
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    for (String str : cameraIdList) {
                        CameraCharacteristics cameraCharacteristics = this.f73771e.getCameraCharacteristics(str);
                        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        if (iArr != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i : iArr) {
                                arrayList.add(Integer.valueOf(i));
                            }
                            for (Integer num : C30783a.f73714d.keySet()) {
                                C30783a.EnumC30784a aVar = C30783a.f73714d.get(num);
                                if (aVar != null) {
                                    if (hashMap.get(aVar) == null) {
                                        hashMap.put(aVar, new HashMap());
                                    }
                                    ((Map) hashMap.get(aVar)).put(str, Boolean.valueOf(arrayList.contains(num)));
                                }
                            }
                        }
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            Range<Integer>[] highSpeedVideoFpsRanges = streamConfigurationMap.getHighSpeedVideoFpsRanges();
                            if (highSpeedVideoFpsRanges.length != 0) {
                                if (hashMap.get(C30783a.EnumC30784a.HIGH_SPEED_VIDEO_FPS_RANGE) == null) {
                                    hashMap.put(C30783a.EnumC30784a.HIGH_SPEED_VIDEO_FPS_RANGE, new HashMap());
                                }
                                ((Map) hashMap.get(C30783a.EnumC30784a.HIGH_SPEED_VIDEO_FPS_RANGE)).put(str, Arrays.toString(highSpeedVideoFpsRanges));
                            }
                            Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                            if (hashMap.get(C30783a.EnumC30784a.PREVIEW_SIZE) == null) {
                                hashMap.put(C30783a.EnumC30784a.PREVIEW_SIZE, new HashMap());
                            }
                            ((Map) hashMap.get(C30783a.EnumC30784a.PREVIEW_SIZE)).put(str, Arrays.toString(outputSizes));
                        }
                        Object[] objArr = (Object[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        if (hashMap.get(C30783a.EnumC30784a.FPS_RANGE) == null) {
                            hashMap.put(C30783a.EnumC30784a.FPS_RANGE, new HashMap());
                        }
                        ((Map) hashMap.get(C30783a.EnumC30784a.FPS_RANGE)).put(str, Arrays.toString(objArr));
                        float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                        if (hashMap.get(C30783a.EnumC30784a.SUPPORT_APERTURES) == null) {
                            hashMap.put(C30783a.EnumC30784a.SUPPORT_APERTURES, new HashMap());
                        }
                        ((Map) hashMap.get(C30783a.EnumC30784a.SUPPORT_APERTURES)).put(str, Arrays.toString(fArr));
                    }
                } catch (CameraAccessException e) {
                    C30969o.m63689d("TECamera2", "Could not initialize Camera Cache");
                    e.printStackTrace();
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C30783a.EnumC30784a aVar2 = (C30783a.EnumC30784a) entry.getKey();
                this.f73845E.mo55748a(new C30783a.C30785b(aVar2, this.f73845E.mo55746a(aVar2), entry.getValue().toString()));
            }
            this.f73845E.mo55747a();
            C30969o.m63686a("TECamera2", "collectCameraCapabilities consume: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55661a() {
        if (!m63312K() || this.f73852t == null) {
            C30969o.m63689d("TECamera2", "startCapture, Device is not ready.");
        } else if (this.f73768b == 2 || this.f73768b == 3) {
            try {
                this.f73847o.f74182f = mo55689i();
                C30969o.m63686a("TECamera2", "Camera rotation = " + this.f73847o.f74182f);
            } catch (Exception e) {
                C30840h.m63546a(e);
                mo55795c(this.f73844D);
                if (this.f73849q != null) {
                    this.f73849q.mo55845a(this.f73847o.f74179c, -425);
                }
            }
            m63310I();
        } else {
            C30969o.m63689d("TECamera2", "startCapture, Invalid state: " + this.f73768b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: d */
    public final void mo55796d(boolean z) {
        AbstractC30813b bVar = this.f73775i;
        if (bVar == null) {
            C30969o.m63689d("TECamera2", "enableMulticamZoom failed, mode is null...");
        } else {
            bVar.mo55820b(z);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55663a(int i) {
        super.mo55663a(i);
        AbstractC30813b bVar = this.f73775i;
        if (bVar == null) {
            C30969o.m63689d("TECamera2", "set scene failed, no mode...");
        } else {
            bVar.mo55718c(i);
        }
    }

    /* renamed from: f */
    public final void mo55798f(int i) {
        if (this.f73768b == i) {
            C30969o.m63688c("TECamera2", "No need update state: ".concat(String.valueOf(i)));
            return;
        }
        C30969o.m63686a("TECamera2", "[updateSessionState]: " + this.f73768b + " -> " + i);
        this.f73768b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo55795c(PrivacyCert privacyCert) {
        try {
            this.f73775i.mo55823o();
            this.f73775i.mo55641b();
            if (this.f73772f != null) {
                this.f73849q.mo55846a(108, 0, "will close camera2");
                C30822f.m63437a(privacyCert, this.f73772f);
                this.f73849q.mo55846a(109, 0, "did close camera2");
                this.f73849q.mo55846a(110, 0, "reset closePrivacy");
                this.f73772f = null;
                this.f73849q.mo55848a(this);
            }
        } catch (Throwable th) {
            C30969o.m63689d("TECamera2", th.getMessage());
        }
        mo55798f(0);
        this.f73769c = null;
        this.f73770d = null;
        this.f73844D = null;
        if (this.f73775i != null && this.f73847o.f74202z == 2) {
            ((C30760b) this.f73775i).mo55644c();
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: d */
    public final void mo55684d(int i) {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "switchFlashMode: ".concat(String.valueOf(i)));
        int i2 = 0;
        if (this.f73768b == 1) {
            AbstractC30813b bVar2 = this.f73775i;
            if (bVar2 == null || !(bVar2 instanceof C30771a)) {
                C30969o.m63689d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: camera is opening, ignore toggleTorch operation");
                C30969o.m63688c("TECamera2", "Camera is opening, ignore toggleTorch operation.");
                AbstractC30825g.AbstractC30826a aVar = this.f73849q;
                if (i != 0) {
                    i2 = 1;
                }
                aVar.mo55853d(i2, "Camera is opening, ignore toggleTorch operation.");
                return;
            }
            ((C30771a) bVar2).mo55719d(i);
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: camera is null");
            C30969o.m63689d("TECamera2", "switch flash mode  failed, you must open camera first.");
            AbstractC30825g.AbstractC30826a aVar2 = this.f73849q;
            if (i != 0) {
                i2 = 1;
            }
            aVar2.mo55853d(i2, "switch flash mode  failed, you must open camera first.");
            this.f73849q.mo55847a(-401, "switch flash mode  failed, you must open camera first.");
        } else {
            bVar.mo55643b(i);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55794b(float f) {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "setAperture : ".concat(String.valueOf(f)));
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setAperture operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63688c("TECamera2", "setAperture : camera is null.");
            this.f73849q.mo55847a(-401, "setAperture : camera is null.");
        } else {
            if (bVar.f73826v == null || bVar.f73827w == null) {
                bVar.f73829y.mo55846a(-432, -432, "Capture Session is null");
            }
            if (bVar.mo55828t().length == 1) {
                if (!Arrays.asList(bVar.mo55828t()).contains(Float.valueOf(f))) {
                    bVar.f73829y.mo55846a(-432, -432, "invalid aperture");
                    return;
                }
            }
            if (!((Integer) bVar.f73826v.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
                bVar.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 0);
            }
            if (!((Integer) bVar.f73826v.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
                bVar.f73826v.set(CaptureRequest.CONTROL_MODE, 0);
            }
            bVar.f73826v.set(CaptureRequest.LENS_APERTURE, Float.valueOf(f));
            AbstractC30813b.C30820a d = bVar.mo55822d(bVar.f73826v);
            if (!d.f73839a) {
                C30969o.m63689d("TECameraModeBase", "setAperture exception: " + d.f73840b);
                bVar.f73829y.mo55846a(-432, -432, d.f73840b);
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: c */
    public final void mo55681c(int i) {
        AbstractC30813b bVar;
        C30969o.m63686a("TECamera2", "setExposureCompensation... value: ".concat(String.valueOf(i)));
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null || bVar.f73824t == null) {
            C30969o.m63689d("TECamera2", "setExposureCompensation : camera is null.");
            this.f73849q.mo55847a(-401, "setExposureCompensation : camera is null.");
        } else if (!this.f73847o.f74141H.mo56039a()) {
            C30969o.m63688c("TECamera2", "Current camera doesn't support setting exposure compensation.");
            this.f73849q.mo55846a(-414, -414, "Current camera doesn't support setting exposure compensation.");
        } else if (i > this.f73847o.f74141H.f74215a || i < this.f73847o.f74141H.f74217c) {
            String str = "Invalid exposure compensation value: " + i + ", it must between [" + this.f73847o.f74141H.f74217c + ", " + this.f73847o.f74141H.f74215a + "].";
            C30969o.m63688c("TECamera2", str);
            this.f73849q.mo55846a(-415, -415, str);
        } else {
            AbstractC30813b bVar2 = this.f73775i;
            if (bVar2.f73826v == null || bVar2.f73827w == null) {
                bVar2.f73829y.mo55847a(-100, "setExposureCompensation : Capture Session is null");
                return;
            }
            try {
                Integer num = (Integer) bVar2.f73826v.get(CaptureRequest.CONTROL_AE_MODE);
                if (num != null && num.intValue() == 0) {
                    C30969o.m63688c("TECameraModeBase", "Can't set exposure compensation when ae mode is off.");
                } else if (bVar2.f73790A.f74141H.f74216b == i) {
                    C30969o.m63686a("TECameraModeBase", "setExposureCompensation return, no need to set");
                } else {
                    bVar2.f73826v.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i));
                    bVar2.f73790A.f74141H.f74216b = i;
                    bVar2.mo55822d(bVar2.f73826v);
                }
            } catch (Exception e) {
                e.printStackTrace();
                bVar2.f73829y.mo55846a(-413, -413, e.toString());
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: e */
    public final void mo55797e(int i) {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "setISO : ".concat(String.valueOf(i)));
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setISO operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63688c("TECamera2", "setISO : camera is null.");
            this.f73849q.mo55847a(-401, "setISO : camera is null.");
        } else {
            if (bVar.f73826v == null || bVar.f73827w == null) {
                bVar.f73829y.mo55846a(-430, -430, "Capture Session is null");
            }
            if (i > bVar.mo55825q()[1] || i < bVar.mo55825q()[0]) {
                bVar.f73829y.mo55846a(-430, -430, "invalid iso");
                return;
            }
            if (!((Integer) bVar.f73826v.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
                bVar.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 0);
            }
            if (!((Integer) bVar.f73826v.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
                bVar.f73826v.set(CaptureRequest.CONTROL_MODE, 0);
            }
            bVar.f73826v.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i));
            AbstractC30813b.C30820a d = bVar.mo55822d(bVar.f73826v);
            if (!d.f73839a) {
                C30969o.m63689d("TECameraModeBase", "setISO exception: " + d.f73840b);
                bVar.f73829y.mo55846a(-430, -430, d.f73840b);
            }
        }
    }

    /* renamed from: d */
    private int m63316d(PrivacyCert privacyCert) {
        Handler handler;
        int i;
        if (this.f73771e == null) {
            CameraManager cameraManager = (CameraManager) m63314a(this.f73851s, "camera");
            this.f73771e = cameraManager;
            if (cameraManager == null) {
                return -401;
            }
        }
        if (this.f73847o.f74202z == 0) {
            mo55801x();
        } else if (this.f73847o.f74202z == 1) {
            C30771a aVar = new C30771a(this, this.f73851s, this.f73771e, this.f73850r);
            this.f73775i = aVar;
            aVar.mo55816a(this.f73858z);
        } else {
            this.f73775i = new C30760b(this, this.f73851s, this.f73771e, this.f73850r);
            this.f73849q.mo55846a(117, 0, "enable arcore");
        }
        if (this.f73847o.f74188l) {
            handler = this.f73775i.mo55832x();
        } else {
            handler = this.f73850r;
        }
        AbstractC30813b bVar = this.f73775i;
        if (bVar instanceof C30760b) {
            ((C30760b) bVar).mo55637a(this.f73851s, handler);
        }
        this.f73847o.f74139F = this.f73775i.mo55636a(this.f73847o.f74181e);
        if (this.f73847o.f74139F == null) {
            C30969o.m63689d("TECamera2", "Invalid CameraID");
            return -401;
        }
        AbstractC30813b bVar2 = this.f73775i;
        String str = this.f73847o.f74139F;
        if (this.f73774h) {
            i = this.f73847o.f74135B;
        } else {
            i = 0;
        }
        int a = bVar2.mo55710a(str, i);
        if (a != 0) {
            return a;
        }
        mo55700t();
        C30834e eVar = this.f73767a;
        if (eVar != null) {
            eVar.mo55855a(this.f73847o.f74179c, this.f73771e);
        }
        mo55701u();
        this.f73849q.mo55846a(1, 0, "TECamera2 features is ready");
        if (this.f73847o.f74188l) {
            try {
                this.f73772f = null;
                C30822f.m63438a(privacyCert, this.f73771e, this.f73847o.f74139F, this.f73779m, handler);
                this.f73849q.mo55846a(111, 0, "use sync mode openPrivacy");
                if (this.f73772f == null) {
                    mo55789E();
                }
            } catch (CameraAccessException e) {
                e.printStackTrace();
                mo55790F();
                return e.getReason();
            }
        } else {
            try {
                this.f73849q.mo55846a(106, 0, "will start camera2");
                C30822f.m63438a(privacyCert, this.f73771e, this.f73847o.f74139F, this.f73779m, handler);
                this.f73849q.mo55846a(111, 0, "normal openPrivacy");
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
                return e2.getReason();
            }
        }
        return 0;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55677b(int i) {
        Handler handler;
        if (this.f73768b != 3) {
            C30969o.m63688c("TECamera2", "Invalid state: " + this.f73768b);
        } else if (this.f73775i != null) {
            m63311J();
            if (i == 0) {
                mo55801x();
            } else if (i == 1) {
                C30771a aVar = new C30771a(this, this.f73851s, this.f73771e, this.f73850r);
                this.f73775i = aVar;
                aVar.mo55816a(this.f73858z);
            } else {
                this.f73775i = new C30760b(this, this.f73851s, this.f73771e, this.f73850r);
            }
            if (this.f73847o.f74188l) {
                handler = this.f73775i.mo55832x();
            } else {
                handler = this.f73850r;
            }
            AbstractC30813b bVar = this.f73775i;
            if (bVar instanceof C30760b) {
                ((C30760b) bVar).mo55637a(this.f73851s, handler);
            }
            try {
                this.f73847o.f74139F = this.f73775i.mo55636a(this.f73847o.f74181e);
                if (this.f73847o.f74139F == null || this.f73775i.mo55710a(this.f73847o.f74139F, this.f73847o.f74135B) != 0) {
                    return;
                }
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
            this.f73775i.mo55817a(this.f73772f);
            m63310I();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: c */
    public final void mo55682c(boolean z) {
        AbstractC30813b bVar;
        C30969o.m63687b("TECamera2", "toggleTorch: ".concat(String.valueOf(z)));
        if (this.f73768b == 1) {
            C30969o.m63689d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: camera is opening, ignore toggleTorch operation");
            C30969o.m63687b("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            this.f73849q.mo55853d(z, "Camera is opening, ignore toggleTorch operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: camera is null");
            C30969o.m63688c("TECamera2", "Toggle torch failed, you must open camera first.");
            this.f73849q.mo55847a(-401, "Toggle torch failed, you must open camera first.");
            this.f73849q.mo55853d(z ? 1 : 0, "Toggle torch failed, you must open camera first.");
        } else {
            bVar.mo55634a(z);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55678b(PrivacyCert privacyCert) {
        C30969o.m63687b("TECamera2", "close...");
        if (this.f73768b != 1) {
            mo55795c(privacyCert);
            AbstractC30813b bVar = this.f73775i;
            if (bVar != null && bVar.f73808S != null) {
                int i = Build.VERSION.SDK_INT;
                bVar.f73808S.quitSafely();
                bVar.f73808S = null;
                bVar.f73809T = null;
                C30969o.m63686a("TECameraModeBase", "releaseCameraThread");
            }
        } else if (this.f73777k) {
            this.f73776j = true;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55679b(boolean z) {
        AbstractC30813b bVar;
        C30969o.m63686a("TECamera2", "setAutoFocusLock...");
        if (this.f73768b == 1) {
            C30969o.m63688c("TECamera2", "Camera is opening, ignore setAutoFocusLock operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null || bVar.f73824t == null) {
            C30969o.m63689d("TECamera2", "setAutoFocusLock : camera is null.");
            this.f73849q.mo55847a(-401, "setAutoFocusLock : camera is null.");
        } else if (Build.VERSION.SDK_INT < 21) {
            C30969o.m63688c("TECamera2", "Current camera doesn't support auto focus lock.");
            this.f73849q.mo55846a(-433, -433, "Current camera doesn't support auto focus lock.");
        } else {
            AbstractC30813b bVar2 = this.f73775i;
            if (bVar2.f73826v == null || bVar2.f73827w == null) {
                bVar2.f73829y.mo55847a(-100, "setAutoFocusLock : Capture Session is null");
                return;
            }
            try {
                bVar2.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                bVar2.mo55822d(bVar2.f73826v);
            } catch (Exception e) {
                e.printStackTrace();
                bVar2.f73829y.mo55846a(-434, -434, e.toString());
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55791a(float f) {
        AbstractC30813b bVar;
        if (this.f73768b == 1) {
            C30969o.m63687b("TECamera2", "Camera is opening, ignore setManualFocusDistance operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "setManualFocusDistance : camera is null.");
            this.f73849q.mo55847a(-401, "setManualFocusDistance : camera is null.");
        } else {
            if (bVar.f73826v == null || bVar.f73827w == null) {
                bVar.f73829y.mo55846a(-436, -436, "Capture Session is null");
            }
            if (f < 0.0f) {
                bVar.f73829y.mo55846a(-436, -436, "invalid distance");
                return;
            }
            bVar.f73826v.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f));
            AbstractC30813b.C30820a d = bVar.mo55822d(bVar.f73826v);
            if (!d.f73839a) {
                C30969o.m63689d("TECameraModeBase", "setManualFocusDistance exception: " + d.f73840b);
                bVar.f73829y.mo55846a(-430, -430, d.f73840b);
            }
        }
    }

    /* renamed from: a */
    private static Object m63315a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55664a(int i, int i2) {
        AbstractC30813b bVar = this.f73775i;
        if (bVar == null) {
            C30969o.m63689d("TECamera2", "set picture size failed, no mode...");
        } else {
            bVar.mo55709a(i, i2);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55676b(float f, C30933l.AbstractC30955p pVar) {
        AbstractC30813b bVar;
        if (this.f73768b != 3) {
            C30969o.m63689d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.f73849q.mo55847a(-420, "Invalid state, state = " + this.f73768b);
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -401. Reason: camera is null");
            this.f73849q.mo55847a(-401, "zoomV2 : Camera is null.");
        } else {
            bVar.mo55642b(f, pVar);
        }
    }

    /* renamed from: a */
    private static Object m63314a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11745);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(11745);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final int mo55659a(C30933l lVar, PrivacyCert privacyCert) {
        super.mo55659a(lVar, privacyCert);
        this.f73844D = privacyCert;
        this.f73847o = lVar;
        if (this.f73768b == 4) {
            mo55795c(privacyCert);
        }
        try {
            mo55798f(1);
            int d = m63316d(privacyCert);
            this.f73854v = lVar.f74181e;
            C30969o.m63686a("TECamera2", "open: camera face = " + this.f73854v);
            if (d != 0) {
                mo55798f(0);
                mo55795c(privacyCert);
                if (this.f73849q != null) {
                    this.f73849q.mo55845a(lVar.f74179c, d);
                }
                return -1;
            }
            this.f73777k = lVar.f74147N;
            return 0;
        } catch (Throwable unused) {
            this.f73768b = 4;
            mo55795c(privacyCert);
            if (this.f73849q != null) {
                this.f73849q.mo55845a(lVar.f74179c, -401);
            }
            return -1;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final TEFrameSizei mo55660a(float f, TEFrameSizei tEFrameSizei) {
        if (this.f73768b == 0 || this.f73768b == 1) {
            C30969o.m63689d("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        Size[] outputSizes = ((StreamConfigurationMap) this.f73775i.f73824t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        if (tEFrameSizei != null) {
            return C30956m.m63661a(arrayList, tEFrameSizei);
        }
        return C30956m.m63660a(arrayList, f);
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55665a(int i, int i2, C30933l.AbstractC30951l lVar) {
        AbstractC30813b bVar;
        if (this.f73768b == 1) {
            C30969o.m63687b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f73768b == 2) {
            C30969o.m63687b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!m63312K() || (bVar = this.f73775i) == null) {
            C30969o.m63689d("TECamera2", "takePicture : camera is null.");
            this.f73849q.mo55847a(-401, "takePicture : camera is null.");
        } else {
            bVar.mo55714a(lVar);
        }
    }

    public C30806e(int i, Context context, AbstractC30825g.AbstractC30826a aVar, Handler handler, AbstractC30825g.AbstractC30828c cVar) {
        super(context, aVar, handler, cVar);
        this.f73847o = new C30933l(context, i);
        this.f73767a = C30834e.m63525a(context, i);
    }

    /* renamed from: a */
    public static C30806e m63313a(int i, Context context, AbstractC30825g.AbstractC30826a aVar, Handler handler, AbstractC30825g.AbstractC30828c cVar) {
        if (i == 3) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new C30806e(3, context, aVar, handler, cVar);
            }
        } else if (i == 4) {
            return new C30806e(4, context, aVar, handler, cVar);
        } else {
            if (i == 6) {
                return new C30806e(6, context, aVar, handler, cVar);
            }
            if (i == 8) {
                if (Build.VERSION.SDK_INT >= 21) {
                    return new C30806e(8, context, aVar, handler, cVar);
                }
            } else if (i == 9) {
                return new C30823a(9, context, aVar, handler, cVar);
            }
        }
        return new C30806e(i, context, aVar, handler, cVar);
    }
}
