package com.bytedance.android.ecommerce.ocr.p166a;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Pair;
import com.bytedance.android.ecommerce.ocr.p166a.C2857c;
import com.bytedance.android.ecommerce.ocr.p168c.p169a.p170a.p171a.C2879a;
import com.bytedance.android.ecommerce.p165k.C2840k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.ecommerce.ocr.a.b */
public class C2846b {

    /* renamed from: a */
    public C2863f f8462a;

    /* renamed from: b */
    public C2862e f8463b;

    /* renamed from: c */
    public C2857c f8464c;

    /* renamed from: d */
    public Handler f8465d;

    /* renamed from: e */
    public C2865h f8466e;

    /* renamed from: f */
    public volatile boolean f8467f;

    /* renamed from: g */
    public boolean f8468g = true;

    /* renamed from: h */
    public Handler f8469h;

    /* renamed from: i */
    public C2860d f8470i = new C2860d();

    /* renamed from: j */
    private Runnable f8471j = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.p166a.C2846b.RunnableC28514 */

        static {
            Covode.recordClassIndex(3277);
        }

        public final void run() {
            Camera camera;
            try {
                C2857c cVar = C2846b.this.f8464c;
                int a = C2879a.m8166a(cVar.f8495e.f8510a);
                if (a == -1) {
                    camera = null;
                } else {
                    Pair<Boolean, Object> a2 = C15346a.m28238a(Camera.class, new Object[]{Integer.valueOf(a)}, 100100, "android.hardware.Camera", false, null);
                    if (((Boolean) a2.first).booleanValue()) {
                        camera = (Camera) a2.second;
                    } else {
                        camera = Camera.open(a);
                        C15346a.m28240a(camera, Camera.class, new Object[]{Integer.valueOf(a)}, 100100, "com_bytedance_android_ecommerce_ocr_zxing_android_camera_open_OpenCameraInterface_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
                    }
                }
                cVar.f8491a = camera;
                if (cVar.f8491a != null) {
                    int a3 = C2879a.m8166a(cVar.f8495e.f8510a);
                    cVar.f8492b = new Camera.CameraInfo();
                    Camera.getCameraInfo(a3, cVar.f8492b);
                    return;
                }
                throw new RuntimeException("Failed to open camera");
            } catch (Exception e) {
                C2846b.this.mo7435a(e);
            }
        }
    };

    /* renamed from: k */
    private Runnable f8472k = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.p166a.C2846b.RunnableC28525 */

        static {
            Covode.recordClassIndex(3278);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(16:3|4|5|(12:(2:8|(2:10|(1:13))(1:14))(1:15)|16|(1:18)(1:20)|19|21|22|23|24|25|(1:28)(1:33)|29|(4:31|(1:34)(2:35|(1:37)(1:39))|38|46)(1:45))|12|16|(0)(0)|19|21|22|23|24|25|(0)(0)|29|(0)(0)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0028 A[Catch:{ Exception -> 0x0047 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[Catch:{ Exception -> 0x0047 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:45:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 175
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.p166a.C2846b.RunnableC28525.run():void");
        }
    };

    /* renamed from: l */
    private Runnable f8473l = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.p166a.C2846b.RunnableC28536 */

        static {
            Covode.recordClassIndex(3279);
        }

        public final void run() {
            try {
                C2857c cVar = C2846b.this.f8464c;
                C2862e eVar = C2846b.this.f8463b;
                Camera camera = cVar.f8491a;
                if (eVar.f8518a != null) {
                    camera.setPreviewDisplay(eVar.f8518a);
                } else {
                    camera.setPreviewTexture(eVar.f8519b);
                }
                C2857c cVar2 = C2846b.this.f8464c;
                Camera camera2 = cVar2.f8491a;
                if (camera2 != null && !cVar2.f8494d) {
                    camera2.startPreview();
                    cVar2.f8494d = true;
                    cVar2.f8493c = new C2842a(cVar2.f8491a, cVar2.f8495e);
                }
            } catch (Exception e) {
                C2846b.this.mo7435a(e);
            }
        }
    };

    /* renamed from: m */
    private Runnable f8474m = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.p166a.C2846b.RunnableC28547 */

        static {
            Covode.recordClassIndex(3280);
        }

        public final void run() {
            try {
                C2857c cVar = C2846b.this.f8464c;
                if (cVar.f8493c != null && !cVar.f8493c.f8450a) {
                    cVar.f8493c.mo7427d();
                    cVar.f8493c.mo7425b();
                }
            } catch (Exception e) {
                C2846b.this.mo7435a(e);
            }
        }
    };

    /* renamed from: n */
    private RunnableC2856a f8475n = new RunnableC2856a(this, (byte) 0);

    /* renamed from: o */
    private Runnable f8476o = new Runnable() {
        /* class com.bytedance.android.ecommerce.ocr.p166a.C2846b.RunnableC28558 */

        static {
            Covode.recordClassIndex(3281);
        }

        public final void run() {
            MethodCollector.m26663i(3528);
            try {
                C2857c cVar = C2846b.this.f8464c;
                if (cVar.f8493c != null) {
                    cVar.f8493c.mo7427d();
                    cVar.f8493c = null;
                }
                if (cVar.f8491a != null && cVar.f8494d) {
                    cVar.f8491a.stopPreview();
                    cVar.f8503m.f8507a = null;
                    cVar.f8494d = false;
                }
                C2857c cVar2 = C2846b.this.f8464c;
                if (cVar2.f8491a != null) {
                    Camera camera = cVar2.f8491a;
                    if (!((Boolean) C15346a.m28238a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
                        C15346a.m28240a(null, camera, new Object[0], 100106, "com_bytedance_android_ecommerce_ocr_camera_CameraManager_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
                        camera.release();
                        C15346a.m28240a(null, camera, new Object[0], 100101, "com_bytedance_android_ecommerce_ocr_camera_CameraManager_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
                    }
                    cVar2.f8491a = null;
                }
            } catch (Exception unused) {
            }
            C2846b.this.f8468g = true;
            C2846b.this.f8465d.sendEmptyMessage(R.id.fk9);
            C2863f fVar = C2846b.this.f8462a;
            synchronized (fVar.f8524e) {
                try {
                    fVar.f8523d--;
                    if (fVar.f8523d == 0) {
                        synchronized (fVar.f8524e) {
                            try {
                                fVar.f8522c.quit();
                                fVar.f8522c = null;
                                fVar.f8521b = null;
                            } catch (Throwable th) {
                                MethodCollector.m26664o(3528);
                                throw th;
                            }
                        }
                    }
                } finally {
                    MethodCollector.m26664o(3528);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(3272);
    }

    /* renamed from: b */
    public final void mo7437b() {
        C2840k.m8119a();
        if (this.f8467f) {
            this.f8462a.mo7455a(this.f8472k);
        }
    }

    /* renamed from: c */
    public final void mo7438c() {
        C2840k.m8119a();
        if (this.f8467f) {
            this.f8462a.mo7455a(this.f8473l);
        }
    }

    /* renamed from: d */
    public final void mo7439d() {
        if (this.f8462a != null && this.f8467f) {
            this.f8462a.mo7455a(this.f8474m);
        }
    }

    /* renamed from: a */
    public final void mo7431a() {
        C2840k.m8119a();
        this.f8467f = true;
        this.f8468g = false;
        this.f8462a.mo7456b(this.f8471j);
    }

    /* renamed from: e */
    public final void mo7440e() {
        C2840k.m8119a();
        if (this.f8467f) {
            this.f8462a.mo7455a(this.f8476o);
        } else {
            this.f8468g = true;
        }
        this.f8467f = false;
    }

    /* renamed from: com.bytedance.android.ecommerce.ocr.a.b$a */
    class RunnableC2856a implements Runnable {

        /* renamed from: a */
        public int f8489a;

        static {
            Covode.recordClassIndex(3282);
        }

        public final void run() {
            try {
                C2857c cVar = C2846b.this.f8464c;
                int i = this.f8489a;
                if (cVar.f8491a != null) {
                    Camera.Parameters parameters = cVar.f8491a.getParameters();
                    if (parameters.isZoomSupported()) {
                        int maxZoom = parameters.getMaxZoom();
                        int zoom = parameters.getZoom();
                        cVar.f8502l = 1.0f;
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    if (zoom > 0) {
                                        cVar.mo7451a(0);
                                        return;
                                    } else {
                                        cVar.mo7451a(maxZoom / 3);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else if (zoom > 0) {
                                zoom--;
                            }
                        } else if (zoom < maxZoom) {
                            zoom++;
                        }
                        parameters.setZoom(zoom);
                        cVar.f8491a.setParameters(parameters);
                    }
                }
            } catch (Exception e) {
                C2846b.this.mo7435a(e);
            }
        }

        private RunnableC2856a() {
        }

        /* synthetic */ RunnableC2856a(C2846b bVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo7434a(C2857c.AbstractC2859b bVar) {
        this.f8464c.f8500j = bVar;
    }

    /* renamed from: a */
    public final void mo7435a(Exception exc) {
        Handler handler = this.f8465d;
        if (handler != null) {
            handler.obtainMessage(R.id.fk_, exc).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo7432a(final float f) {
        C2840k.m8119a();
        if (this.f8467f) {
            this.f8462a.mo7455a(new Runnable() {
                /* class com.bytedance.android.ecommerce.ocr.p166a.C2846b.RunnableC28471 */

                static {
                    Covode.recordClassIndex(3273);
                }

                public final void run() {
                    C2857c cVar = C2846b.this.f8464c;
                    float f = f;
                    Camera.Parameters parameters = cVar.f8491a.getParameters();
                    if (cVar.f8491a != null && parameters.isZoomSupported() && f > 1.0f) {
                        try {
                            cVar.f8502l *= f;
                            double d = (double) cVar.f8502l;
                            List<Integer> zoomRatios = parameters.getZoomRatios();
                            int maxZoom = parameters.getMaxZoom();
                            if (!(zoomRatios == null || zoomRatios.isEmpty())) {
                                if (zoomRatios.size() == maxZoom + 1) {
                                    Double.isNaN(d);
                                    double d2 = d * 100.0d;
                                    double d3 = Double.POSITIVE_INFINITY;
                                    int i = 0;
                                    for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
                                        double intValue = (double) zoomRatios.get(i2).intValue();
                                        Double.isNaN(intValue);
                                        double abs = Math.abs(intValue - d2);
                                        if (abs < d3) {
                                            i = i2;
                                            d3 = abs;
                                        }
                                    }
                                    if (i != -1) {
                                        int zoom = parameters.getZoom();
                                        int maxZoom2 = parameters.getMaxZoom();
                                        if (i > zoom && maxZoom2 > i) {
                                            parameters.setZoom(i);
                                            cVar.f8491a.setParameters(parameters);
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public C2846b(Context context) {
        C2840k.m8119a();
        if (C2863f.f8520a == null) {
            C2863f.f8520a = new C2863f();
        }
        this.f8462a = C2863f.f8520a;
        C2857c cVar = new C2857c(context);
        this.f8464c = cVar;
        cVar.f8495e = this.f8470i;
        this.f8469h = new Handler();
    }

    /* renamed from: a */
    public final void mo7433a(int i) {
        if (this.f8462a != null && this.f8467f) {
            this.f8475n.f8489a = i;
            this.f8462a.mo7455a(this.f8475n);
        }
    }

    /* renamed from: a */
    public final void mo7436a(final boolean z) {
        C2840k.m8119a();
        if (this.f8467f) {
            this.f8462a.mo7455a(new Runnable() {
                /* class com.bytedance.android.ecommerce.ocr.p166a.C2846b.RunnableC28482 */

                static {
                    Covode.recordClassIndex(3274);
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[Catch:{ RuntimeException -> 0x0088 }] */
                /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 137
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.p166a.C2846b.RunnableC28482.run():void");
                }
            });
        }
    }
}
