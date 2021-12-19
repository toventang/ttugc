package com.p2082ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.p2194c.C30783a;
import com.p2082ss.android.ttvecamera.p2195d.C30796c;
import com.p2082ss.android.ttvecamera.p2201j.C30855a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.b */
public final class C30764b extends AbstractC30825g {

    /* renamed from: F */
    private boolean f73640F = false;

    /* renamed from: a */
    Camera f73641a;

    /* renamed from: b */
    public Camera.Parameters f73642b;

    /* renamed from: c */
    public boolean f73643c = false;

    /* renamed from: d */
    private C30796c f73644d;

    /* renamed from: e */
    private String f73645e = "";

    /* renamed from: f */
    private int f73646f;

    /* renamed from: g */
    private List<TEFrameSizei> f73647g = new ArrayList();

    /* renamed from: h */
    private List<TEFrameSizei> f73648h = new ArrayList();

    /* renamed from: i */
    private List<TEFrameSizei> f73649i = new ArrayList();

    /* renamed from: j */
    private List<Integer> f73650j = null;

    /* renamed from: k */
    private float f73651k = 100.0f;

    /* renamed from: l */
    private AtomicBoolean f73652l = new AtomicBoolean(false);

    /* renamed from: m */
    private long f73653m = 0;

    static {
        Covode.recordClassIndex(37389);
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: e */
    public final int mo55685e() {
        return 1;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55667a(PrivacyCert privacyCert) {
        super.mo55667a(privacyCert);
        try {
            Camera camera = this.f73641a;
            if (camera != null) {
                C30790d.m63269a(privacyCert, camera);
                this.f73641a = null;
            }
        } catch (Exception unused) {
            C30969o.m63689d("TECamera1", "force close camera failed");
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55668a(final C30933l.AbstractC30951l lVar) {
        if (this.f73641a == null) {
            C30969o.m63689d("TECamera1", "takePicture: camera is null.");
            this.f73849q.mo55847a(-401, "takePicture: camera is null.");
            return;
        }
        try {
            this.f73848p = false;
            C30969o.m63686a("TECamera1", "takePicture size: " + this.f73847o.f74193q.toString());
            final long currentTimeMillis = System.currentTimeMillis();
            this.f73641a.takePicture(null, null, new Camera.PictureCallback() {
                /* class com.p2082ss.android.ttvecamera.C30764b.C307673 */

                static {
                    Covode.recordClassIndex(37392);
                }

                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    int i;
                    C30969o.m63686a("TECamera1", "capture data arrive consume: " + (System.currentTimeMillis() - currentTimeMillis));
                    if (C30764b.this.f73641a != null) {
                        C30764b.this.f73641a.stopPreview();
                    }
                    if (lVar != null) {
                        int pictureFormat = C30764b.this.f73642b.getPictureFormat();
                        Camera.Size pictureSize = C30764b.this.f73642b.getPictureSize();
                        int i2 = pictureSize.width;
                        int i3 = pictureSize.height;
                        C30969o.m63686a("TECamera1", "take picture format: " + pictureFormat + ", w: " + i2 + ", h: " + i3);
                        C30844i.EnumC30847b bVar = C30844i.EnumC30847b.PIXEL_FORMAT_JPEG;
                        if (C30764b.this.f73854v == 1) {
                            i = 270;
                        } else {
                            i = 90;
                        }
                        if (pictureFormat == 17) {
                            bVar = C30844i.EnumC30847b.PIXEL_FORMAT_NV21;
                        }
                        new C30844i(bArr, bVar, i2, i3, i);
                    }
                }
            });
        } catch (Exception e) {
            C30840h.m63546a(e);
            if (lVar != null) {
                m63444a(e, -1000);
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55672a(final C30966n nVar) {
        Camera camera = this.f73641a;
        if (camera == null) {
            C30969o.m63689d("TECamera1", "focusAtPoint: camera is null.");
            nVar.f74246m.mo56059a(-401, this.f73847o.f74181e, "focusAtPoint: camera is null.");
            this.f73849q.mo55847a(-401, "focusAtPoint: camera is null.");
            return;
        }
        boolean z = false;
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f73642b = parameters;
            String str = this.f73645e;
            if (parameters == null || C30796c.f73736f.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0 || !parameters.getSupportedFocusModes().contains(str)) {
                C30969o.m63689d("TECamera1", "Error: not support focus.");
                this.f73849q.mo55846a(-412, -412, "Error: not support focus.");
                if (!C30796c.m63288a(this.f73642b) || !nVar.f74241h) {
                    nVar.f74246m.mo56059a(-412, this.f73847o.f74181e, "Error: not support focus.");
                    return;
                }
                if (nVar.f74245l != null) {
                    this.f73642b.setMeteringAreas(nVar.f74245l.mo55615a());
                } else {
                    this.f73642b.setMeteringAreas(this.f73644d.mo55768a(nVar.f74234a, nVar.f74235b, nVar.f74238e, nVar.f74236c, nVar.f74237d, this.f73847o.f74182f));
                }
                this.f73641a.setParameters(this.f73642b);
                return;
            }
            if (nVar.f74241h && C30796c.m63288a(this.f73642b)) {
                if (nVar.f74245l != null) {
                    this.f73642b.setMeteringAreas(nVar.f74245l.mo55615a());
                } else {
                    this.f73642b.setMeteringAreas(this.f73644d.mo55768a(nVar.f74234a, nVar.f74235b, nVar.f74238e, nVar.f74236c, nVar.f74237d, this.f73847o.f74182f));
                }
            }
            if (nVar.f74240g) {
                if (nVar.f74244k != null) {
                    this.f73642b.setFocusAreas(nVar.f74244k.mo55614a());
                } else {
                    Camera.Parameters parameters2 = this.f73642b;
                    C30796c cVar = this.f73644d;
                    Rect a = cVar.mo55767a(nVar.f74234a, nVar.f74235b, nVar.f74238e, 90.0f, nVar.f74236c, nVar.f74237d, this.f73847o.f74182f);
                    if (cVar.f73741e.size() > 0) {
                        cVar.f73741e.clear();
                    }
                    cVar.f73741e.add(new Camera.Area(a, 1000));
                    parameters2.setFocusAreas(cVar.f73741e);
                }
                this.f73641a.cancelAutoFocus();
                this.f73642b.setFocusMode("auto");
                if (this.f73640F && !nVar.f74243j) {
                    this.f73642b.setFlashMode("off");
                    z = true;
                }
                this.f73641a.setParameters(this.f73642b);
                this.f73641a.autoFocus(new Camera.AutoFocusCallback() {
                    /* class com.p2082ss.android.ttvecamera.C30764b.C307684 */

                    static {
                        Covode.recordClassIndex(37393);
                    }

                    public final void onAutoFocus(boolean z, Camera camera) {
                        String str;
                        if (z) {
                            str = "Camera Focus Succeed!";
                            nVar.f74246m.mo56059a(nVar.mo56055a(), C30764b.this.f73847o.f74181e, str);
                        } else {
                            str = "Camera Focus Failed!";
                            nVar.f74246m.mo56059a(-1, C30764b.this.f73847o.f74181e, str);
                        }
                        C30969o.m63686a("TECamera1", str);
                        if (!nVar.f74242i || !z) {
                            try {
                                Camera.Parameters parameters = camera.getParameters();
                                parameters.setFocusMode("continuous-video");
                                camera.setParameters(parameters);
                                if (C30764b.this.f73643c) {
                                    C30764b.this.mo55680c();
                                }
                            } catch (Exception e) {
                                String str2 = "Error: focusAtPoint failed: " + e.toString();
                                C30969o.m63689d("TECamera1", str2);
                                C30764b.this.f73849q.mo55847a(-411, str2);
                            }
                        }
                    }
                });
                if (z) {
                    try {
                        this.f73642b.setFlashMode("on");
                        this.f73641a.setParameters(this.f73642b);
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.f73641a.setParameters(this.f73642b);
                C30969o.m63686a("TECamera1", "focus is not enable!");
            }
        } catch (Exception e) {
            String str2 = "Error: focusAtPoint failed: " + e.toString();
            C30969o.m63689d("TECamera1", str2);
            nVar.f74246m.mo56059a(-411, this.f73847o.f74181e, str2);
            this.f73849q.mo55847a(-411, str2);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55674a(boolean z) {
        C30969o.m63686a("TECamera1", "setAutoExposureLock...");
        if (this.f73641a == null || this.f73642b == null || !this.f73848p) {
            this.f73849q.mo55847a(-401, "setAutoExposureLock failed. ： Camera is null.");
        } else if (!this.f73642b.isAutoExposureLockSupported()) {
            C30969o.m63688c("TECamera1", "Current camera doesn't support ae lock.");
            this.f73849q.mo55846a(-426, -426, "Current camera doesn't support ae lock.");
        } else {
            try {
                this.f73642b.setAutoExposureLock(z);
                this.f73641a.setParameters(this.f73642b);
            } catch (Exception e) {
                String str = "Error: setAutoExposureLock failed: " + e.toString();
                C30969o.m63689d("TECamera1", str);
                this.f73849q.mo55846a(-427, -427, str);
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55673a(String str) {
        if (this.f73641a == null || !this.f73848p) {
            C30969o.m63689d("TECamera1", "setWhileBalance : Camera is null!");
            this.f73849q.mo55847a(-401, "setWhileBalance : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = this.f73641a.getParameters();
            this.f73642b = parameters;
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(str)) {
                String concat = "SupportWBList has no value: ".concat(String.valueOf(str));
                C30969o.m63689d("TECamera1", concat);
                this.f73849q.mo55847a(-424, concat);
                return;
            }
            this.f73642b.setWhiteBalance(str);
            this.f73641a.setParameters(this.f73642b);
        } catch (Exception e) {
            String str2 = "Set WhileBalance failed: " + e.toString();
            C30969o.m63689d("TECamera1", str2);
            this.f73849q.mo55847a(-424, str2);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55671a(C30933l.AbstractC30955p pVar, boolean z) {
        if (pVar == null) {
            C30969o.m63689d("TECamera1", "ZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f73641a;
        if (camera == null) {
            C30969o.m63689d("TECamera1", "queryZoomAbility : Camera is null!");
            this.f73849q.mo55847a(-401, "queryZoomAbility : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f73856x = (float) parameters.getMaxZoom();
            if (z) {
                pVar.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), ((float) this.f73650j.get((int) this.f73856x).intValue()) / 100.0f, parameters.getZoomRatios());
                return;
            }
            pVar.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), (float) parameters.getMaxZoom(), parameters.getZoomRatios());
        } catch (Exception e) {
            String str = "Query zoom ability failed : " + e.toString();
            C30969o.m63689d("TECamera1", str);
            this.f73849q.mo55847a(-420, str);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55669a(C30933l.AbstractC30953n nVar) {
        if (nVar == null) {
            C30969o.m63689d("TECamera1", "ShaderZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f73641a;
        if (camera == null) {
            C30969o.m63689d("TECamera1", "queryShaderZoomStep : Camera is null!");
            this.f73849q.mo55847a(-401, "queryShaderZoomStep : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters != null && parameters.isZoomSupported()) {
                int maxZoom = parameters.getMaxZoom();
                if (maxZoom > 99) {
                    maxZoom = 99;
                }
                List<Integer> zoomRatios = parameters.getZoomRatios();
                if (maxZoom > 0) {
                    Math.pow((double) ((((float) (zoomRatios.get(1).intValue() - zoomRatios.get(0).intValue())) / 100.0f) + 1.0f), 0.5d);
                }
            }
        } catch (Exception e) {
            String str = "Query shader zoom step failed : " + e.toString();
            C30969o.m63689d("TECamera1", str);
            this.f73849q.mo55847a(-420, str);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55670a(C30933l.AbstractC30955p pVar) {
        Camera camera = this.f73641a;
        if (camera == null) {
            C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -401. Reason: mCameraDevice is null");
            C30969o.m63689d("TECamera1", "stopZoom : Camera is null!");
            this.f73849q.mo55847a(-401, "stopZoom : Camera is null!");
            return;
        }
        try {
            if (camera.getParameters().isSmoothZoomSupported() && pVar != null && pVar.enableSmooth()) {
                this.f73641a.stopSmoothZoom();
            }
        } catch (Exception e) {
            C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -420. Reason: ".concat(String.valueOf(e)));
            String str = "Stop zoom failed : " + e.toString();
            C30969o.m63689d("TECamera1", str);
            this.f73849q.mo55847a(-420, str);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55666a(Bundle bundle) {
        super.mo55666a(bundle);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f73842B.get(this.f73847o.f74139F);
            for (String str : bundle.keySet()) {
                if (C30933l.C30950k.m63656a(str, m63172a(bundle, str)) && TextUtils.equals(str, "support_light_soft")) {
                    bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: m */
    public final void mo55693m() {
        C30969o.m63687b("TECamera1", "cancelFocus...");
        Camera camera = this.f73641a;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: E */
    private List<TEFrameSizei> m63169E() {
        Camera.Parameters parameters = this.f73642b;
        if (parameters == null) {
            this.f73647g.clear();
            return this.f73647g;
        }
        List<TEFrameSizei> a = m63173a(parameters.getSupportedPreviewSizes());
        this.f73647g = a;
        return a;
    }

    /* renamed from: F */
    private List<TEFrameSizei> m63170F() {
        Camera.Parameters parameters = this.f73642b;
        if (parameters == null) {
            this.f73648h.clear();
            return this.f73648h;
        }
        List<TEFrameSizei> a = m63173a(parameters.getSupportedPictureSizes());
        this.f73648h = a;
        return a;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: d */
    public final void mo55683d() {
        Camera camera;
        if (this.f73848p && (camera = this.f73641a) != null) {
            try {
                camera.stopFaceDetection();
            } catch (Exception unused) {
                C30969o.m63689d("TECamera1", "camera stop face detect failed");
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: h */
    public final int[] mo55688h() {
        Camera camera = this.f73641a;
        if (camera == null) {
            return null;
        }
        try {
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: o */
    public final boolean mo55695o() {
        C30969o.m63686a("TECamera1", "isSupportedExposureCompensation...");
        if (this.f73641a == null || this.f73642b == null || !this.f73848p) {
            return false;
        }
        return this.f73847o.f74141H.mo56039a();
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: p */
    public final boolean mo55696p() {
        C30969o.m63686a("TECamera1", "isAutoExposureLockSupported...");
        if (this.f73641a == null || this.f73642b == null || !this.f73848p) {
            return false;
        }
        return this.f73642b.isAutoExposureLockSupported();
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: s */
    public final boolean mo55699s() {
        Bundle bundle = this.f73842B.get(this.f73847o.f74139F);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: c */
    public final void mo55680c() {
        C30969o.m63687b("TECamera1", "Camera start face detect");
        if (this.f73848p && this.f73641a != null && this.f73642b.getMaxNumDetectedFaces() > 0) {
            try {
                this.f73641a.startFaceDetection();
            } catch (Exception unused) {
                C30969o.m63689d("TECamera1", "camera start face detect failed");
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: f */
    public final int[] mo55686f() {
        Camera camera = this.f73641a;
        if (camera == null) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            camera.getParameters().getPreviewFpsRange(iArr);
            iArr[0] = iArr[0] / 1000;
            iArr[1] = iArr[1] / 1000;
            return iArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: g */
    public final void mo55687g() {
        Camera.Parameters parameters = this.f73642b;
        if (parameters != null) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            int[] a = C30956m.m63673a(this.f73847o.f74145L, this.f73847o.f74181e, this.f73847o.f74180d.mo55598a(TEFrameRateRange.m63137a(supportedPreviewFpsRange)), supportedPreviewFpsRange);
            this.f73642b.setPreviewFpsRange(a[0], a[1]);
            this.f73641a.setParameters(this.f73642b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo55691k() {
        /*
            r4 = this;
            android.hardware.Camera r0 = r4.f73641a
            r1 = 0
            if (r0 == 0) goto L_0x0012
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ Exception -> 0x000e }
            android.hardware.Camera$Size r3 = r0.getPictureSize()     // Catch:{ Exception -> 0x000e }
            goto L_0x0013
        L_0x000e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0012:
            r3 = r1
        L_0x0013:
            if (r3 != 0) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 2
            int[] r2 = new int[r0]
            r1 = 0
            int r0 = r3.width
            r2[r1] = r0
            r1 = 1
            int r0 = r3.height
            r2[r1] = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.C30764b.mo55691k():int[]");
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: q */
    public final boolean mo55697q() {
        C30969o.m63686a("TECamera1", "isAutoFocusLockSupported...");
        if (this.f73641a == null || this.f73642b == null || !this.f73848p) {
            this.f73849q.mo55847a(-401, "setAutoFocusLock failed. ： Camera is null.");
            return false;
        }
        try {
            if (this.f73642b.getSupportedFocusModes().contains("fixed")) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            this.f73849q.mo55846a(-433, -433, "isAutoFocusLockSupported failed");
            return false;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: r */
    public final boolean mo55698r() {
        try {
            Camera camera = this.f73641a;
            if (camera == null || camera.getParameters() == null || this.f73641a.getParameters().getSupportedWhiteBalance() == null || !this.f73641a.getParameters().isAutoWhiteBalanceLockSupported()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C30969o.m63689d("TECamera1", "Unsupported whileBalance!: " + e.toString());
            return false;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55675b() {
        C30969o.m63687b("TECamera1", "Camera stopPreview...");
        if (this.f73848p && this.f73641a != null) {
            this.f73848p = false;
            this.f73652l.set(false);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f73641a.stopPreview();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C30853j.m63557a("te_record_camera1_stop_preview_cost", currentTimeMillis2);
                Long.valueOf(currentTimeMillis2);
            } catch (Exception e) {
                C30969o.m63689d("TECamera1", "camera stopcapture failed: " + e.getMessage());
            }
            this.f73653m = 0;
            C30969o.m63686a("TECamera1", "Camera preview stopped!");
            this.f73849q.mo55851b("TECamera1 preview stoped");
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: i */
    public final int mo55689i() {
        int a = C30956m.m63659a(this.f73851s);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f73853u = this.f73854v;
        try {
            Camera.getCameraInfo(this.f73847o.f74183g, cameraInfo);
            if (this.f73853u == 1) {
                this.f73855w = (cameraInfo.orientation + a) % 360;
                this.f73855w = ((360 - this.f73855w) + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
            } else {
                this.f73855w = ((cameraInfo.orientation - a) + 360) % 360;
            }
            return this.f73855w;
        } catch (Exception e) {
            this.f73849q.mo55847a(-425, "getFrameOrientation :" + e.getMessage());
            return 0;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: j */
    public final int mo55690j() {
        Camera camera = this.f73641a;
        if (camera != null) {
            String str = null;
            try {
                str = camera.getParameters().getFlashMode();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if ("on".equals(str)) {
                return 1;
            }
            if ("auto".equals(str)) {
                return 3;
            }
            if ("off".equals(str)) {
                return 0;
            }
            if ("torch".equals(str)) {
                return 2;
            }
            if ("red-eye".equals(str)) {
                return 4;
            }
        }
        return -1;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: l */
    public final float[] mo55692l() {
        float[] fArr = new float[2];
        Camera camera = this.f73641a;
        if (camera == null) {
            C30969o.m63689d("TECamera1", "getFOV: camera device is null.");
            this.f73849q.mo55847a(-401, "getFOV: camera device is null.");
            return new float[]{-2.0f, -2.0f};
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f73642b = parameters;
            fArr[0] = parameters.getVerticalViewAngle();
            fArr[1] = this.f73642b.getHorizontalViewAngle();
            C30969o.m63687b("TECamera1", "Camera1:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
            return fArr;
        } catch (Exception e) {
            e.printStackTrace();
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: n */
    public final void mo55694n() {
        if (this.f73641a != null && this.f73642b != null) {
            C30969o.m63687b("TECamera1", "enableCaf...");
            try {
                if (this.f73642b.getSupportedFocusModes().contains("continuous-video")) {
                    this.f73641a.cancelAutoFocus();
                    this.f73642b.setFocusMode("continuous-video");
                    this.f73641a.setParameters(this.f73642b);
                }
            } catch (Throwable th) {
                String str = "Error: focusAtPoint failed: " + th.toString();
                C30969o.m63689d("TECamera1", str);
                this.f73849q.mo55847a(-411, str);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: t */
    public final Bundle mo55700t() {
        List<TEFrameSizei> a;
        List<TEFrameRateRange> b;
        boolean z;
        this.f73847o.f74139F = new StringBuilder().append(this.f73847o.f74181e).toString();
        Bundle t = super.mo55700t();
        t.putParcelableArrayList("support_preview_sizes", (ArrayList) m63169E());
        t.putParcelableArrayList("support_picture_sizes", (ArrayList) m63170F());
        Camera.Parameters parameters = this.f73642b;
        if (parameters == null) {
            this.f73649i.clear();
            a = this.f73649i;
        } else {
            a = m63173a(parameters.getSupportedVideoSizes());
            this.f73649i = a;
        }
        t.putParcelableArrayList("support_video_sizes", (ArrayList) a);
        Camera.Parameters parameters2 = this.f73642b;
        if (parameters2 == null) {
            b = null;
        } else {
            b = m63174b(parameters2.getSupportedPreviewFpsRange());
        }
        t.putParcelableArrayList("camera_support_fps_range", (ArrayList) b);
        t.putParcelable("camera_preview_size", this.f73847o.f74192p);
        try {
            Camera camera = this.f73641a;
            if (camera == null || camera.getParameters() == null || this.f73641a.getParameters().getSupportedFlashModes() == null) {
                z = false;
            } else {
                z = true;
            }
            t.putBoolean("camera_torch_supported", z);
        } catch (Exception e) {
            C30969o.m63689d("TECamera1", "Get camera torch information failed: " + e.toString());
            t.putBoolean("camera_torch_supported", false);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: u */
    public final void mo55701u() {
        if (m63443H()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f73642b != null) {
                List<TEFrameSizei> E = m63169E();
                if (E != null) {
                    this.f73845E.mo55748a(new C30783a.C30785b(C30783a.EnumC30784a.PREVIEW_SIZE, C30783a.EnumC30786c.STRING, this.f73847o.f74139F + "=" + E.toString()));
                }
                List<int[]> supportedPreviewFpsRange = this.f73642b.getSupportedPreviewFpsRange();
                StringBuilder sb = new StringBuilder(this.f73847o.f74139F + "=");
                if (supportedPreviewFpsRange != null) {
                    for (int[] iArr : supportedPreviewFpsRange) {
                        sb.append("[").append(iArr[0] / 1000).append(",").append(iArr[1] / 1000).append("]");
                        if (supportedPreviewFpsRange.indexOf(iArr) != supportedPreviewFpsRange.size() - 1) {
                            sb.append(", ");
                        }
                    }
                    this.f73845E.mo55748a(new C30783a.C30785b(C30783a.EnumC30784a.FPS_RANGE, C30783a.EnumC30786c.STRING, sb.toString()));
                }
            }
            this.f73845E.mo55747a();
            C30969o.m63686a("TECamera1", "collectCameraCapabilities consume: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0303, code lost:
        if (r10.contains(r5) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0314, code lost:
        if (r10.contains(r5) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02be  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m63176x() {
        /*
        // Method dump skipped, instructions count: 981
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.C30764b.m63176x():int");
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55661a() {
        C30969o.m63686a("TECamera1", "Camera startPreview...");
        if (this.f73848p) {
            C30969o.m63688c("TECamera1", "Camera is previewing...");
        } else if (this.f73641a != null) {
            try {
                if (this.f73852t != null) {
                    Camera.Parameters parameters = this.f73641a.getParameters();
                    this.f73642b = parameters;
                    int a = this.f73852t.mo55893a(m63173a(parameters.getSupportedPreviewSizes()), this.f73847o.f74192p);
                    if (a != 0) {
                        C30969o.m63689d("TECamera1", "Init provider failed, ret = ".concat(String.valueOf(a)));
                        return;
                    }
                    if (this.f73852t.mo55891a() == 1) {
                        if (this.f73852t.mo55896d() != null) {
                            this.f73641a.setPreviewTexture(this.f73852t.mo55896d());
                        } else {
                            C30969o.m63689d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else if (this.f73852t.mo55891a() == 4) {
                        C30855a aVar = (C30855a) this.f73852t.f73930b;
                        if (aVar == null) {
                            throw new AndroidRuntimeException("Provider is null");
                        } else if (this.f73852t.mo55896d() != null) {
                            if (this.f73652l.compareAndSet(false, true)) {
                                int i = ((aVar.f73922h.f73616a * aVar.f73922h.f73617b) * 3) / 2;
                                C30969o.m63687b(C30855a.f73911a, "getBuffers current bufferSize: " + i + " mCallbackBytebufferSize:" + aVar.f73915e);
                                if (i > aVar.f73915e || aVar.f73915e == 0) {
                                    int[] iArr = new int[2];
                                    iArr[1] = i;
                                    iArr[0] = 3;
                                    aVar.f73914d = (byte[][]) Array.newInstance(byte.class, iArr);
                                    C30969o.m63687b(C30855a.f73911a, "new mCallbackBytebuffer size :".concat(String.valueOf(i)));
                                    aVar.f73915e = i;
                                }
                                for (byte[] bArr : aVar.f73914d) {
                                    this.f73641a.addCallbackBuffer(bArr);
                                }
                            }
                            this.f73641a.setPreviewCallbackWithBuffer(aVar.f73912b);
                            this.f73641a.setPreviewTexture(this.f73852t.mo55896d());
                        } else {
                            C30969o.m63689d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else {
                        C30969o.m63689d("TECamera1", "Unsupported camera provider type : " + this.f73852t.mo55891a());
                        return;
                    }
                    TEFrameSizei e = this.f73852t.mo55897e();
                    if (e != null) {
                        if (!(this.f73642b.getPreviewSize().width == e.f73616a && this.f73642b.getPreviewSize().height == e.f73617b)) {
                            this.f73642b.setPreviewSize(e.f73616a, e.f73617b);
                            if (this.f73847o.f74200x) {
                                if (!this.f73847o.f74201y) {
                                    this.f73847o.f74193q = C30956m.m63662a(m63173a(this.f73642b.getSupportedPictureSizes()), e, this.f73847o.f74196t);
                                } else {
                                    this.f73847o.f74201y = false;
                                }
                                this.f73642b.setPictureSize(this.f73847o.f74193q.f73616a, this.f73847o.f74193q.f73617b);
                            }
                            this.f73641a.setParameters(this.f73642b);
                        }
                        this.f73849q.mo55846a(50, 0, e.toString());
                    }
                    if (this.f73847o.f74201y) {
                        this.f73847o.f74201y = false;
                        this.f73642b.setPictureSize(this.f73847o.f74193q.f73616a, this.f73847o.f74193q.f73617b);
                        this.f73641a.setParameters(this.f73642b);
                        C30969o.m63686a("TECamera1", "force set picture size: " + this.f73847o.f74193q.f73616a + "x" + this.f73847o.f74193q.f73617b);
                    }
                    this.f73641a.setErrorCallback(new Camera.ErrorCallback() {
                        /* class com.p2082ss.android.ttvecamera.C30764b.C307651 */

                        static {
                            Covode.recordClassIndex(37390);
                        }

                        public final void onError(int i, Camera camera) {
                            String concat;
                            C30853j.m63557a("te_record_camera_err_ret", (long) i);
                            if (i == 100) {
                                concat = "Camera server died!";
                            } else if (Build.VERSION.SDK_INT >= 23 && i == 2) {
                                concat = "Camera disconnected: ".concat(String.valueOf(i));
                            } else if (i == 1) {
                                concat = "Camera unknown error: ".concat(String.valueOf(i));
                            } else {
                                C30969o.m63688c("TECamera1", "Ignore camera error here: ".concat(String.valueOf(i)));
                                return;
                            }
                            C30969o.m63689d("TECamera1", concat);
                            C30764b bVar = C30764b.this;
                            bVar.mo55678b(bVar.f73844D);
                            C30764b.this.f73857y = 0;
                            if (i == 2) {
                                C30764b.this.f73849q.mo55848a(C30764b.this);
                            } else {
                                C30764b.this.f73849q.mo55850b(-425, concat);
                            }
                        }
                    });
                    this.f73847o.f74182f = mo55689i();
                    C30969o.m63687b("TECamera1", "Camera rotation = " + this.f73847o.f74182f);
                    long currentTimeMillis = System.currentTimeMillis();
                    C30969o.m63686a("TECamera1", "Camera startPreview start");
                    this.f73641a.startPreview();
                    C30969o.m63686a("TECamera1", "Camera startPreview end");
                    boolean z = this.f73847o.f74136C.getBoolean("useCameraFaceDetect");
                    this.f73643c = z;
                    if (z) {
                        mo55680c();
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    this.f73653m = currentTimeMillis2;
                    long j = currentTimeMillis2 - currentTimeMillis;
                    C30853j.m63557a("te_record_camera1_start_preview_cost", j);
                    Long.valueOf(j);
                    this.f73848p = true;
                    this.f73849q.mo55849a("TECamera1 preview");
                    return;
                }
                throw new AndroidRuntimeException("ProviderManager is null");
            } catch (Exception e2) {
                C30969o.m63689d("TECamera1", "startPreview: Error " + e2.getMessage());
                C30840h.m63546a(e2);
                this.f73848p = false;
                try {
                    if (this.f73857y == 0) {
                        this.f73849q.mo55846a(108, 0, "preview error will close camera1");
                        C30790d.m63269a(this.f73844D, this.f73641a);
                        this.f73849q.mo55846a(110, 0, "closePrivacy");
                        this.f73849q.mo55846a(109, 0, "preview error did close camera1");
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                if (this.f73857y == 0) {
                    this.f73641a = null;
                }
                this.f73849q.mo55850b(-425, e2.getMessage());
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55677b(int i) {
        C30969o.m63688c("TECamera1", "Does not support switch mode for camera1");
        this.f73849q.mo55846a(-200, -200, "Does not support switch mode for camera1");
    }

    /* renamed from: a */
    private static List<TEFrameSizei> m63173a(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static List<TEFrameRateRange> m63174b(List<int[]> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int[] iArr : list) {
            arrayList.add(new TEFrameRateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55678b(PrivacyCert privacyCert) {
        this.f73640F = false;
        C30969o.m63686a("TECamera1", "Camera close start...");
        if (this.f73641a != null) {
            if (this.f73848p) {
                try {
                    Camera.Parameters parameters = this.f73641a.getParameters();
                    this.f73642b = parameters;
                    parameters.setFlashMode("off");
                    this.f73641a.setParameters(this.f73642b);
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f73641a.stopPreview();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    C30853j.m63557a("te_record_camera1_stop_preview_cost", currentTimeMillis2);
                    Long.valueOf(currentTimeMillis2);
                    if (this.f73852t.mo55891a() == 1) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f73852t.mo55896d().setOnFrameAvailableListener(null, null);
                        } else {
                            this.f73852t.mo55896d().setOnFrameAvailableListener(null);
                        }
                    } else if (this.f73852t.mo55891a() == 4) {
                        this.f73641a.setPreviewCallbackWithBuffer(null);
                    }
                } catch (Exception e) {
                    C30969o.m63689d("TECamera1", "Close camera failed: " + e.getMessage());
                }
                this.f73848p = false;
            }
            try {
                this.f73641a.setErrorCallback(null);
                this.f73849q.mo55846a(108, 0, "will close camera1");
                C30790d.m63269a(privacyCert, this.f73641a);
                this.f73849q.mo55846a(110, 0, "closePrivacy");
                this.f73849q.mo55846a(109, 0, "did close camera1");
            } catch (Exception e2) {
                C30969o.m63689d("TECamera1", "Camera release failed: " + e2.getMessage());
            }
            this.f73652l.set(false);
            this.f73641a = null;
            C30969o.m63686a("TECamera1", "Camera closed end!");
            this.f73849q.mo55848a(this);
        }
        this.f73844D = null;
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: c */
    public final void mo55681c(int i) {
        String str;
        C30969o.m63686a("TECamera1", "setExposureCompensation... value: ".concat(String.valueOf(i)));
        int i2 = -413;
        if (this.f73641a == null || this.f73642b == null || !this.f73848p || !this.f73847o.f74141H.mo56039a()) {
            if (this.f73641a == null || this.f73642b == null || !this.f73848p) {
                str = "setExposureCompensation ： Camera is null.";
                this.f73849q.mo55847a(-401, str);
            } else {
                i2 = -414;
                str = "Unsupported exposure compensation!";
            }
            C30969o.m63689d("TECamera1", str);
            this.f73849q.mo55847a(i2, str);
        } else if (i > this.f73847o.f74141H.f74215a || i < this.f73847o.f74141H.f74217c) {
            this.f73849q.mo55847a(-415, "Invalid exposure: ".concat(String.valueOf(i)));
        } else {
            try {
                this.f73642b.setExposureCompensation(i);
                this.f73641a.setParameters(this.f73642b);
                this.f73847o.f74141H.f74216b = this.f73642b.getExposureCompensation();
                C30969o.m63686a("TECamera1", "EC = " + this.f73847o.f74141H.f74216b + ", EV = " + (((float) this.f73847o.f74141H.f74216b) * this.f73847o.f74141H.f74218d));
            } catch (Exception e) {
                String str2 = "Error: setExposureCompensation failed: " + e.toString();
                C30969o.m63689d("TECamera1", str2);
                this.f73849q.mo55847a(-413, str2);
            }
        }
    }

    /* renamed from: c */
    private int m63175c(PrivacyCert privacyCert) {
        int i;
        Exception e;
        this.f73844D = privacyCert;
        try {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            int numberOfCameras = Camera.getNumberOfCameras();
            this.f73646f = numberOfCameras;
            C30853j.m63557a("te_record_camera_size", (long) numberOfCameras);
            C30969o.m63686a("TECamera1", "innerOpen mNumberOfCameras: " + this.f73646f + ", current mDefaultCameraID:" + this.f73847o.f74183g);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i4 = 0;
            while (true) {
                if (i4 >= this.f73646f) {
                    break;
                }
                Camera.getCameraInfo(i4, cameraInfo);
                C30969o.m63686a("TECamera1", "innerOpen cameraInfo facing: " + cameraInfo.facing + ", mCameraSettings.mFacing:" + this.f73847o.f74181e);
                if (cameraInfo.facing == this.f73847o.f74181e) {
                    this.f73847o.f74183g = i4;
                    break;
                }
                i4++;
            }
            if (this.f73847o.f74183g != -1 || this.f73646f <= 0 || !this.f73847o.f74167ah) {
                if (this.f73847o.f74183g == -1 && this.f73646f > 0 && this.f73847o.f74166ag) {
                    C30969o.m63688c("TECamera1", "innerOpen: camera info check, set CameraID to 0");
                    this.f73847o.f74183g = 0;
                }
                C30969o.m63686a("TECamera1", "innerOpen: " + this.f73847o.f74183g);
                this.f73849q.mo55846a(106, 0, "will start camera1");
                if (this.f73847o.f74183g < 0) {
                    this.f73641a = C30790d.m63267a(privacyCert, this.f73847o.f74183g);
                    this.f73849q.mo55846a(111, 0, "openPrivacy");
                    this.f73847o.f74181e = 0;
                    this.f73854v = this.f73847o.f74181e;
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= this.f73646f) {
                            break;
                        }
                        Camera.getCameraInfo(i5, cameraInfo2);
                        if (cameraInfo2.facing == this.f73854v) {
                            this.f73847o.f74183g = i5;
                            break;
                        }
                        i5++;
                    }
                } else {
                    this.f73641a = C30790d.m63267a(privacyCert, this.f73847o.f74183g);
                    this.f73849q.mo55846a(111, 0, "openPrivacy");
                }
                C30969o.m63686a("TECamera1", "innerOpen mNewFacing: " + this.f73854v);
                C30969o.m63686a("TECamera1", "innerOpen mCameraSettings.mDefaultCameraID: " + this.f73847o.f74183g);
                this.f73849q.mo55846a(107, 0, "did start camera1");
                if (this.f73641a == null) {
                    C30969o.m63689d("TECamera1", "Open Camera Failed width ID:" + this.f73847o.f74183g);
                    this.f73849q.mo55845a(1, -401);
                    return -401;
                }
                try {
                    i = m63176x();
                    try {
                        mo55700t();
                        mo55701u();
                        this.f73849q.mo55846a(1, 0, "TECamera1 features is ready");
                    } catch (Exception e2) {
                        e = e2;
                        i3 = i;
                    }
                } catch (Exception e3) {
                    e = e3;
                    C30969o.m63689d("TECamera1", "Open init Camera Failed!: " + Log.getStackTraceString(e));
                    C30840h.m63546a(e);
                    i = i3;
                    this.f73849q.mo55845a(1, i);
                    return i;
                }
                this.f73849q.mo55845a(1, i);
                return i;
            }
            C30969o.m63688c("TECamera1", "innerOpen: camera info check error");
            throw new RuntimeException("CameraIDError");
        } catch (RuntimeException e4) {
            C30969o.m63689d("TECamera1", "Open Camera Failed!: " + Log.getStackTraceString(e4));
            C30840h.m63546a(e4);
            this.f73849q.mo55845a(1, -401);
            this.f73641a = null;
            return -401;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55663a(int i) {
        super.mo55663a(i);
        if (i == 0) {
            if (this.f73847o.f74157X) {
                try {
                    this.f73642b.setRecordingHint(false);
                    this.f73641a.setParameters(this.f73642b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (i != 1) {
            throw new IllegalArgumentException("un support scene");
        } else if (this.f73847o.f74157X) {
            try {
                this.f73642b.setRecordingHint(true);
                this.f73641a.setParameters(this.f73642b);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: d */
    public final void mo55684d(final int i) {
        String str;
        int i2;
        String str2;
        int i3;
        MethodCollector.m26663i(14367);
        int i4 = 1;
        if (this.f73641a == null) {
            C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: mCameraDevice is null");
            C30969o.m63689d("TECamera1", "switchFlashMode failed: Camera is not ready!");
            this.f73849q.mo55847a(-401, "switchFlashMode failed: Camera is not ready!");
            AbstractC30825g.AbstractC30826a aVar = this.f73849q;
            if (i == 0) {
                i4 = 0;
            }
            aVar.mo55853d(i4, "switchFlashMode failed: Camera is not ready!");
            MethodCollector.m26664o(14367);
        } else if (this.f73653m == 0 || System.currentTimeMillis() - this.f73653m >= 200 || this.f73850r == null) {
            this.f73640F = false;
            try {
                Camera.Parameters parameters = this.f73641a.getParameters();
                this.f73642b = parameters;
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    if (i == 0) {
                        str2 = "off";
                    } else if (i == 1) {
                        str2 = "on";
                        this.f73640F = true;
                    } else if (i == 2) {
                        str2 = "torch";
                    } else if (i == 3) {
                        str2 = "auto";
                    } else if (i == 4) {
                        str2 = "red-eye";
                    }
                    if (supportedFlashModes.contains(str2)) {
                        this.f73849q.mo55846a(104, 0, "camera1 will change flash mode ".concat(String.valueOf(str2)));
                        this.f73642b.setFlashMode(str2);
                        this.f73641a.setParameters(this.f73642b);
                        if ("off".equalsIgnoreCase(str2) && this.f73847o.f74136C.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                            try {
                                Thread.sleep(200);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        this.f73849q.mo55846a(105, 0, "camera1 did change flash mode ".concat(String.valueOf(str2)));
                        AbstractC30825g.AbstractC30826a aVar2 = this.f73849q;
                        if (i == 0) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        aVar2.mo55852c(i3, "torch success");
                        MethodCollector.m26664o(14367);
                        return;
                    }
                }
                if (supportedFlashModes != null) {
                    str = "Camera does not support flash mode: " + i + "support list: " + supportedFlashModes.toString();
                } else {
                    str = "Camera does not support flash mode: ".concat(String.valueOf(i));
                }
                C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: not support flash mode ".concat(String.valueOf(i)));
                C30969o.m63689d("TECamera1", str);
                this.f73849q.mo55847a(-419, str);
                AbstractC30825g.AbstractC30826a aVar3 = this.f73849q;
                if (i == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                aVar3.mo55853d(i2, str);
                MethodCollector.m26664o(14367);
            } catch (Exception e2) {
                C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: ".concat(String.valueOf(e2)));
                String str3 = "Switch flash mode failed: " + e2.toString();
                C30969o.m63689d("TECamera1", str3);
                this.f73849q.mo55847a(-418, str3);
                AbstractC30825g.AbstractC30826a aVar4 = this.f73849q;
                if (i == 0) {
                    i4 = 0;
                }
                aVar4.mo55853d(i4, str3);
                MethodCollector.m26664o(14367);
            }
        } else {
            this.f73850r.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.C30764b.RunnableC307695 */

                static {
                    Covode.recordClassIndex(37394);
                }

                public final void run() {
                    C30764b.this.mo55684d(i);
                }
            }, 200);
            MethodCollector.m26664o(14367);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55679b(boolean z) {
        C30969o.m63686a("TECamera1", "setAutoFocusLock...");
        if (this.f73641a == null || this.f73642b == null || !this.f73848p) {
            this.f73849q.mo55847a(-401, "setAutoFocusLock failed. ： Camera is null.");
        } else if (!mo55697q()) {
            C30969o.m63688c("TECamera1", "Current camera doesn't support af lock.");
            this.f73849q.mo55846a(-433, -433, "Current camera doesn't support af lock.");
        } else {
            if (z) {
                try {
                    this.f73642b.setFocusMode("fixed");
                } catch (Exception e) {
                    String str = "Error: setAutoFocusLock failed: " + e.toString();
                    C30969o.m63689d("TECamera1", str);
                    this.f73849q.mo55846a(-427, -427, str);
                    return;
                }
            } else {
                this.f73642b.setFocusMode("continuous-video");
            }
            this.f73641a.setParameters(this.f73642b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: c */
    public final void mo55682c(boolean z) {
        String str;
        int i = 0;
        this.f73640F = false;
        if (this.f73641a == null) {
            C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -401. Reason: mCameraDevice is null");
            C30969o.m63689d("TECamera1", "toggleTorch : Camera is not ready!");
            this.f73849q.mo55847a(-401, "toggleTorch : Camera is not ready!");
            this.f73849q.mo55853d(z, "toggleTorch : Camera is not ready!");
        } else if (this.f73847o.f74181e == 1) {
            C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
            C30969o.m63688c("TECamera1", "Front camera does not support torch!");
            this.f73849q.mo55846a(-416, -416, "Front camera does not support torch!");
            this.f73849q.mo55853d(z, "Front camera does not support torch!");
        } else {
            try {
                this.f73849q.mo55846a(104, 0, "camera1 will change flash mode ".concat(String.valueOf(z)));
                Camera.Parameters parameters = this.f73641a.getParameters();
                this.f73642b = parameters;
                if (z != 0) {
                    str = "torch";
                } else {
                    str = "off";
                }
                parameters.setFlashMode(str);
                this.f73641a.setParameters(this.f73642b);
                this.f73849q.mo55846a(105, 0, "camera1 did change flash mode ".concat(String.valueOf(z)));
                AbstractC30825g.AbstractC30826a aVar = this.f73849q;
                if (z != 0) {
                    i = 1;
                }
                aVar.mo55852c(i, "toggleTorch ".concat(String.valueOf(z)));
            } catch (Exception e) {
                C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -417. Reason: ".concat(String.valueOf(e)));
                String str2 = "Toggle torch failed: " + e.toString();
                C30969o.m63689d("TECamera1", str2);
                this.f73849q.mo55847a(-417, str2);
                this.f73849q.mo55853d(z ? 1 : 0, str2);
            }
        }
    }

    /* renamed from: a */
    private static Object m63172a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final int mo55659a(C30933l lVar, PrivacyCert privacyCert) {
        super.mo55659a(lVar, privacyCert);
        this.f73847o = lVar;
        this.f73854v = lVar.f74181e;
        return m63175c(privacyCert);
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final TEFrameSizei mo55660a(float f, TEFrameSizei tEFrameSizei) {
        Camera camera = this.f73641a;
        if (camera == null) {
            C30969o.m63689d("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.f73642b == null) {
            this.f73642b = camera.getParameters();
        }
        if (tEFrameSizei != null) {
            return C30956m.m63661a(m63169E(), tEFrameSizei);
        }
        return C30956m.m63660a(m63169E(), f);
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55662a(float f, final C30933l.AbstractC30955p pVar) {
        Camera camera = this.f73641a;
        if (camera == null) {
            C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -401. Reason: mCameraDevice is null");
            C30969o.m63689d("TECamera1", "startZoom : Camera is null!");
            this.f73849q.mo55847a(-401, "startZoom : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f73642b = parameters;
            if (parameters.isZoomSupported() || this.f73642b.isSmoothZoomSupported()) {
                int min = (int) Math.min((float) this.f73642b.getMaxZoom(), f);
                if (!this.f73642b.isSmoothZoomSupported() || pVar == null || !pVar.enableSmooth()) {
                    this.f73642b.setZoom(min);
                    this.f73641a.setParameters(this.f73642b);
                    if (pVar != null) {
                        pVar.onChange(1, (float) min, true);
                        return;
                    }
                    return;
                }
                this.f73641a.startSmoothZoom(min);
                this.f73641a.setZoomChangeListener(new Camera.OnZoomChangeListener() {
                    /* class com.p2082ss.android.ttvecamera.C30764b.C307706 */

                    static {
                        Covode.recordClassIndex(37395);
                    }

                    public final void onZoomChange(int i, boolean z, Camera camera) {
                        C30933l.AbstractC30955p pVar = pVar;
                        if (pVar != null) {
                            pVar.onChange(1, (float) i, z);
                        }
                    }
                });
                return;
            }
            C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -421. Reason: camera is not support zoom");
            C30969o.m63689d("TECamera1", "Camera is not support zoom!");
            this.f73849q.mo55847a(-421, "Camera is not support zoom!");
        } catch (Exception e) {
            C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ".concat(String.valueOf(e)));
            String str = "Start zoom failed : " + e.toString();
            C30969o.m63689d("TECamera1", str);
            this.f73849q.mo55847a(-420, str);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: b */
    public final void mo55676b(float f, C30933l.AbstractC30955p pVar) {
        List<Integer> list = this.f73650j;
        if (list != null && this.f73641a != null) {
            float f2 = this.f73651k * f;
            this.f73651k = f2;
            int i = 0;
            try {
                if (f2 < ((float) list.get(0).intValue())) {
                    this.f73651k = (float) this.f73650j.get(0).intValue();
                }
                float f3 = this.f73651k;
                List<Integer> list2 = this.f73650j;
                if (f3 > ((float) list2.get(list2.size() - 1).intValue())) {
                    List<Integer> list3 = this.f73650j;
                    this.f73651k = (float) list3.get(list3.size() - 1).intValue();
                }
                Camera.Parameters parameters = this.f73641a.getParameters();
                if (parameters != null) {
                    int i2 = (int) this.f73651k;
                    int size = this.f73650j.size() - 1;
                    while (size - i > 1) {
                        int i3 = (i + size) / 2;
                        if (i2 > this.f73650j.get(i3).intValue()) {
                            i = i3;
                        } else {
                            size = i3;
                        }
                    }
                    if (Math.abs(i2 - this.f73650j.get(i).intValue()) > Math.abs(i2 - this.f73650j.get(size).intValue())) {
                        i = size;
                    }
                    if (parameters.getZoom() != i) {
                        parameters.setZoom(i);
                        this.f73641a.setParameters(parameters);
                        if (pVar != null) {
                            pVar.onChange(1, ((float) this.f73650j.get(i).intValue()) / 100.0f, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: getParameters is null");
                C30969o.m63689d("TECamera1", "setZoom failed for getParameters null");
            } catch (Exception e) {
                C30969o.m63689d("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: ".concat(String.valueOf(e)));
                C30969o.m63689d("TECamera1", "setZoom failed, " + e.getMessage());
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55664a(int i, int i2) {
        this.f73847o.f74201y = true;
        this.f73847o.f74193q.f73616a = i;
        this.f73847o.f74193q.f73617b = i2;
        mo55675b();
        mo55661a();
    }

    @Override // com.p2082ss.android.ttvecamera.AbstractC30825g
    /* renamed from: a */
    public final void mo55665a(int i, int i2, final C30933l.AbstractC30951l lVar) {
        Camera camera = this.f73641a;
        if (camera == null) {
            C30969o.m63689d("TECamera1", "takePicture : camera is null");
            this.f73849q.mo55847a(-401, "takePicture : camera is null");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f73642b = parameters;
            if (!(parameters.getPictureSize().width == i && this.f73642b.getPictureSize().height == i2)) {
                TEFrameSizei a = C30956m.m63663a(m63173a(this.f73642b.getSupportedPictureSizes()), this.f73847o.f74192p, new TEFrameSizei(i, i2));
                this.f73642b.setPictureSize(a.f73616a, a.f73617b);
                List<Integer> supportedPictureFormats = this.f73642b.getSupportedPictureFormats();
                if (!this.f73847o.f74172am || supportedPictureFormats == null || !supportedPictureFormats.contains(17)) {
                    this.f73642b.setPictureFormat(256);
                    this.f73642b.setJpegQuality(100);
                } else {
                    this.f73642b.setPictureFormat(17);
                }
                this.f73641a.setParameters(this.f73642b);
            }
            this.f73848p = false;
            this.f73641a.takePicture(null, null, new Camera.PictureCallback() {
                /* class com.p2082ss.android.ttvecamera.C30764b.C307662 */

                static {
                    Covode.recordClassIndex(37391);
                }

                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    int i;
                    if (lVar != null) {
                        int pictureFormat = C30764b.this.f73642b.getPictureFormat();
                        Camera.Size pictureSize = C30764b.this.f73642b.getPictureSize();
                        int i2 = pictureSize.width;
                        int i3 = pictureSize.height;
                        C30969o.m63686a("TECamera1", "take picture format: " + pictureFormat + ", w: " + i2 + ", h: " + i3);
                        C30844i.EnumC30847b bVar = C30844i.EnumC30847b.PIXEL_FORMAT_JPEG;
                        if (C30764b.this.f73854v == 1) {
                            i = 270;
                        } else {
                            i = 90;
                        }
                        if (pictureFormat == 17) {
                            bVar = C30844i.EnumC30847b.PIXEL_FORMAT_NV21;
                        }
                        new C30844i(bArr, bVar, i2, i3, i);
                    }
                }
            });
        } catch (Exception e) {
            C30840h.m63546a(e);
            if (lVar != null) {
                m63444a(e, -1000);
            }
        }
    }

    /* renamed from: a */
    public static C30764b m63171a(Context context, AbstractC30825g.AbstractC30826a aVar, Handler handler, AbstractC30825g.AbstractC30828c cVar) {
        return new C30764b(context, aVar, handler, cVar);
    }

    private C30764b(Context context, AbstractC30825g.AbstractC30826a aVar, Handler handler, AbstractC30825g.AbstractC30828c cVar) {
        super(context, aVar, handler, cVar);
        this.f73847o = new C30933l(context, 1);
        this.f73644d = new C30796c();
        this.f73844D = null;
    }
}
