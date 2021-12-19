package com.p2082ss.android.ttvecamera.p2196e;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30806e;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30853j;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.C30966n;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.TEFocusParameters;
import com.p2082ss.android.ttvecamera.TEFrameRateRange;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a;
import com.p2082ss.android.ttvecamera.p2195d.AbstractC30797d;
import com.p2082ss.android.ttvecamera.p2198g.C30833d;
import com.p2082ss.android.ttvecamera.p2198g.C30834e;
import com.p2082ss.android.ttvecamera.p2200i.C30852a;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.e.b */
public abstract class AbstractC30813b implements AbstractC30791a.AbstractC30792a, AbstractC30812a {

    /* renamed from: A */
    public C30933l f73790A;

    /* renamed from: B */
    protected AbstractC30797d f73791B;

    /* renamed from: C */
    public CameraDevice f73792C;

    /* renamed from: D */
    public Handler f73793D;

    /* renamed from: E */
    public CaptureRequest f73794E;

    /* renamed from: F */
    protected AtomicBoolean f73795F = new AtomicBoolean(false);

    /* renamed from: G */
    protected boolean f73796G = true;

    /* renamed from: H */
    protected float f73797H = 0.0f;

    /* renamed from: I */
    protected float f73798I = 1.0f;

    /* renamed from: J */
    protected Range<Float> f73799J = null;

    /* renamed from: K */
    protected Rect f73800K = null;

    /* renamed from: L */
    protected AbstractC30825g.AbstractC30828c f73801L;

    /* renamed from: M */
    protected int[] f73802M;

    /* renamed from: N */
    protected boolean f73803N = false;

    /* renamed from: O */
    protected CaptureRequest.Key<?> f73804O = null;

    /* renamed from: P */
    protected C30966n f73805P;

    /* renamed from: Q */
    protected TEFrameRateRange f73806Q = new TEFrameRateRange(7, 30);

    /* renamed from: R */
    protected int f73807R;

    /* renamed from: S */
    public HandlerThread f73808S = null;

    /* renamed from: T */
    public Handler f73809T = null;

    /* renamed from: U */
    public volatile boolean f73810U = false;

    /* renamed from: V */
    public long f73811V = 0;

    /* renamed from: W */
    public long f73812W = 0;

    /* renamed from: X */
    public long f73813X = 0;

    /* renamed from: Y */
    protected int f73814Y = 0;

    /* renamed from: Z */
    protected boolean f73815Z = false;

    /* renamed from: a */
    private Rect f73816a;

    /* renamed from: aa */
    public volatile boolean f73817aa = false;

    /* renamed from: ab */
    protected HashMap<Integer, String> f73818ab = new HashMap<>();

    /* renamed from: ac */
    protected CameraCaptureSession.StateCallback f73819ac = new CameraCaptureSession.StateCallback() {
        /* class com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b.C308174 */

        static {
            Covode.recordClassIndex(37442);
        }

        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C30969o.m63689d("TECameraModeBase", "onConfigureFailed...");
            AbstractC30813b.this.mo55833y();
            C30853j.m63557a("te_record_camera2_create_session_ret", 0L);
            Integer.valueOf(0);
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - AbstractC30813b.this.f73811V;
            AbstractC30813b.this.f73812W = j;
            AbstractC30813b.this.f73813X = currentTimeMillis;
            AbstractC30813b.this.f73810U = false;
            AbstractC30813b.this.f73827w = cameraCaptureSession;
            try {
                final int m = AbstractC30813b.this.mo55724m();
                if (m != 0) {
                    AbstractC30813b.this.mo55833y();
                    RunnableC308181 r3 = new Runnable() {
                        /* class com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b.C308174.RunnableC308181 */

                        static {
                            Covode.recordClassIndex(37443);
                        }

                        public final void run() {
                            AbstractC30813b.this.f73829y.mo55847a(m, "updateCapture : something wrong.");
                        }
                    };
                    if (AbstractC30813b.this.f73790A.f74188l) {
                        AbstractC30813b.this.f73793D.post(r3);
                    } else {
                        r3.run();
                    }
                }
            } catch (Exception e) {
                AbstractC30813b.this.mo55833y();
                e.printStackTrace();
            }
            C30853j.m63557a("te_record_camera2_create_session_ret", 1L);
            C30853j.m63557a("te_record_camera2_create_session_cost", j);
            Integer.valueOf(1);
            Long.valueOf(j);
        }
    };

    /* renamed from: ad */
    public CameraCaptureSession.CaptureCallback f73820ad = new CameraCaptureSession.CaptureCallback() {
        /* class com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b.C308195 */

        static {
            Covode.recordClassIndex(37444);
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            if (AbstractC30813b.this.f73790A.f74164ae && !AbstractC30813b.this.f73810U && captureFailure.getReason() == 0) {
                AbstractC30813b.this.f73814Y++;
                int i = AbstractC30813b.this.f73814Y;
                AbstractC30813b.this.f73790A.getClass();
                if (i >= 5) {
                    AbstractC30813b.this.f73829y.mo55850b(-437, "Camera previewing failed");
                }
            }
            C30969o.m63689d("TECameraModeBase", "failure: " + captureFailure + ",reason:" + captureFailure.getReason());
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            int intValue;
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (totalCaptureResult != null) {
                AbstractC30813b bVar = AbstractC30813b.this;
                if (totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY) == null) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY)).intValue();
                }
                bVar.f73807R = intValue;
            }
            if (!AbstractC30813b.this.f73810U) {
                AbstractC30813b.this.mo55833y();
                AbstractC30813b.this.f73810U = true;
                long currentTimeMillis = System.currentTimeMillis() - AbstractC30813b.this.f73813X;
                C30969o.m63686a("TECameraModeBase", "first preview frame callback arrived! consume = " + currentTimeMillis + ", session consume: " + AbstractC30813b.this.f73812W);
                C30853j.m63557a("te_record_camera2_set_repeating_request_cost", currentTimeMillis);
                Long.valueOf(currentTimeMillis);
            }
            if (AbstractC30813b.this.f73790A.f74170ak) {
                C30844i.C30848c cVar = new C30844i.C30848c();
                cVar.f73891c = System.currentTimeMillis();
                cVar.f73892d = totalCaptureResult;
                cVar.f73893e = AbstractC30813b.this.mo55825q()[1];
                cVar.f73894f = AbstractC30813b.this.mo55825q()[0];
                AbstractC30813b.this.f73830z.f73852t.f73930b.f73926l = cVar;
            }
            if (AbstractC30813b.this.f73796G) {
                AbstractC30813b.this.f73796G = C30956m.m63670a(totalCaptureResult);
            }
        }
    };

    /* renamed from: b */
    private boolean f73821b = false;

    /* renamed from: c */
    private Map<String, Integer> f73822c = new HashMap<String, Integer>() {
        /* class com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b.C308141 */

        static {
            Covode.recordClassIndex(37439);
        }

        {
            put("auto", 1);
            put("incandescent", 2);
            put("fluorescent", 3);
            put("warm-fluorescent", 4);
            put("daylight", 5);
            put("cloudy-daylight", 6);
            put("twilight", 7);
            put("shade", 8);
        }
    };

    /* renamed from: d */
    private Runnable f73823d = new Runnable() {
        /* class com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b.RunnableC308163 */

        static {
            Covode.recordClassIndex(37441);
        }

        public final void run() {
            AbstractC30813b.this.f73791B.mo55751a();
        }
    };

    /* renamed from: t */
    public CameraCharacteristics f73824t;

    /* renamed from: u */
    protected C30834e f73825u;

    /* renamed from: v */
    public CaptureRequest.Builder f73826v;

    /* renamed from: w */
    public volatile CameraCaptureSession f73827w;

    /* renamed from: x */
    protected CameraManager f73828x;

    /* renamed from: y */
    public AbstractC30825g.AbstractC30826a f73829y;

    /* renamed from: z */
    public C30806e f73830z;

    static {
        Covode.recordClassIndex(37438);
    }

    /* renamed from: T_ */
    public int[] mo55708T_() {
        return null;
    }

    /* renamed from: U_ */
    public int mo55744U_() {
        return 0;
    }

    /* renamed from: V_ */
    public int mo55745V_() {
        return 0;
    }

    /* renamed from: a */
    public int mo55709a(int i, int i2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Range<Integer> mo55711a(Range<Integer> range) {
        return range;
    }

    /* renamed from: a */
    public void mo55713a(C30852a aVar, int i, C30933l.AbstractC30942c cVar) {
    }

    /* renamed from: a */
    public void mo55714a(C30933l.AbstractC30951l lVar) {
    }

    /* renamed from: c */
    public void mo55718c(int i) {
    }

    /* renamed from: d */
    public abstract int mo55645d();

    /* renamed from: i */
    public int[] mo55720i() {
        return null;
    }

    /* renamed from: n */
    public int mo55725n() {
        return -1;
    }

    /* renamed from: a */
    public void mo55717a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, final Handler handler, boolean z) {
        if (Build.VERSION.SDK_INT < 28 || (!z && !this.f73790A.f74153T)) {
            C30969o.m63686a("TECameraModeBase", "createSession by normally");
            this.f73792C.createCaptureSession(list, stateCallback, handler);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Surface surface : list) {
            arrayList.add(new OutputConfiguration(surface));
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(mo55812a(list), arrayList, new Executor() {
            /* class com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b.ExecutorC308152 */

            static {
                Covode.recordClassIndex(37440);
            }

            public final void execute(Runnable runnable) {
                Handler handler = handler;
                if (handler != null) {
                    handler.post(runnable);
                }
            }
        }, stateCallback);
        sessionConfiguration.setSessionParameters(this.f73826v.build());
        C30969o.m63686a("TECameraModeBase", "createSession by sessionConfiguration");
        this.f73792C.createCaptureSession(sessionConfiguration);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r7 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c3, code lost:
        com.p2082ss.android.ttvecamera.C30969o.m63688c("TECameraModeBase", "selectCamera: camera tag is null, set 0 for default");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo55636a(int r11) {
        /*
        // Method dump skipped, instructions count: 458
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b.mo55636a(int):java.lang.String");
    }

    /* renamed from: a */
    public final void mo55817a(Object obj) {
        this.f73792C = (CameraDevice) obj;
    }

    /* renamed from: a */
    public void mo55715a(C30933l.AbstractC30951l lVar, int i) {
        if (this.f73815Z) {
            this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.f73826v.set(CaptureRequest.FLASH_MODE, 1);
        }
    }

    /* renamed from: a */
    public Rect mo55635a(float f) {
        CameraCharacteristics cameraCharacteristics = this.f73824t;
        if (cameraCharacteristics == null || this.f73826v == null) {
            this.f73829y.mo55847a(-420, "Camera info is null, may be you need reopen camera.");
            return null;
        }
        float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = (int) (((float) rect.width()) / floatValue);
        int height = (int) (((float) rect.height()) / floatValue);
        int width2 = (int) ((((float) (rect.width() - width)) / floatValue) * f);
        int height2 = (int) ((((float) (rect.height() - height)) / floatValue) * f);
        int i = width2 - (width2 & 3);
        int i2 = height2 - (height2 & 3);
        return new Rect(i, i2, rect.width() - i, rect.height() - i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: int[][] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo55640a(String str) {
        int intValue;
        if (this.f73826v == null || this.f73827w == null) {
            this.f73829y.mo55846a(-424, -424, "Capture Session is null");
        }
        if (this.f73822c.get(str) == null) {
            intValue = 1;
        } else {
            intValue = this.f73822c.get(str).intValue();
        }
        if (!Arrays.asList(this.f73824t.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)).contains(Integer.valueOf(intValue))) {
            this.f73829y.mo55846a(-424, -424, "invalid white balance");
            return;
        }
        C30820a d = mo55822d(this.f73826v);
        if (!d.f73839a) {
            C30969o.m63689d("TECameraModeBase", "setWhiteBalance exception: " + d.f73840b);
            this.f73829y.mo55846a(-424, -424, d.f73840b);
        }
    }

    /* renamed from: a */
    public final void mo55816a(AbstractC30825g.AbstractC30828c cVar) {
        this.f73801L = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C30820a mo55815a(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C30820a aVar = new C30820a();
        if (this.f73827w == null) {
            aVar.f73840b = "Capture Session is null";
            C30969o.m63689d("TECameraModeBase", "capture: " + aVar.f73840b);
            return aVar;
        }
        try {
            this.f73827w.captureBurst(list, captureCallback, null);
            aVar.f73839a = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            aVar.f73840b = e.getMessage();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            aVar.f73840b = e2.getMessage();
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C30820a mo55814a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C30820a aVar = new C30820a();
        if (captureRequest == null) {
            aVar.f73840b = "CaptureRequest is null";
            C30969o.m63689d("TECameraModeBase", "capture: " + aVar.f73840b);
            return aVar;
        } else if (this.f73827w == null) {
            aVar.f73840b = "Capture Session is null";
            C30969o.m63689d("TECameraModeBase", "capture: " + aVar.f73840b);
            return aVar;
        } else {
            try {
                this.f73827w.capture(captureRequest, captureCallback, null);
                aVar.f73839a = true;
            } catch (CameraAccessException e) {
                e.printStackTrace();
                aVar.f73840b = e.getMessage();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
                aVar.f73840b = e2.getMessage();
            }
            return aVar;
        }
    }

    /* renamed from: a */
    public final C30820a mo55813a(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C30820a aVar = new C30820a();
        if (builder == null) {
            aVar.f73840b = "CaptureRequest.Builder is null";
            C30969o.m63689d("TECameraModeBase", "capture: " + aVar.f73840b);
            return aVar;
        } else if (this.f73827w == null) {
            aVar.f73840b = "Capture Session is null";
            C30969o.m63689d("TECameraModeBase", "capture: " + aVar.f73840b);
            return aVar;
        } else {
            try {
                this.f73827w.capture(builder.build(), captureCallback, handler);
                aVar.f73839a = true;
            } catch (CameraAccessException e) {
                e.printStackTrace();
                aVar.f73840b = e.getMessage();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
                aVar.f73840b = e2.getMessage();
            }
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.e.b$a */
    public static class C30820a {

        /* renamed from: a */
        public boolean f73839a;

        /* renamed from: b */
        public String f73840b = "";

        static {
            Covode.recordClassIndex(37445);
        }

        protected C30820a() {
        }

        /* renamed from: a */
        public final Exception mo55842a() {
            return new Exception(this.f73840b);
        }

        public final String toString() {
            return "Response{isSuccess=" + this.f73839a + ", errMsg='" + this.f73840b + '\'' + '}';
        }
    }

    /* renamed from: o */
    public final void mo55823o() {
        this.f73800K = null;
        this.f73814Y = 0;
    }

    /* renamed from: e */
    public int mo55646e() {
        if (this.f73826v != null) {
            return this.f73791B.mo55751a();
        }
        this.f73829y.mo55846a(-100, -100, "rollbackNormalSessionRequest : param is null.");
        return -100;
    }

    /* renamed from: p */
    public final int mo55824p() {
        CaptureRequest.Builder builder = this.f73826v;
        if (builder == null) {
            this.f73829y.mo55847a(-100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.f73791B.mo55754a(builder);
        mo55822d(this.f73826v);
        return 0;
    }

    /* renamed from: r */
    public final int mo55826r() {
        if (this.f73826v == null || this.f73827w == null) {
            this.f73829y.mo55846a(-430, -430, "Capture Session is null");
        }
        return this.f73807R;
    }

    /* renamed from: w */
    public final CaptureRequest.Builder mo55831w() {
        CameraDevice cameraDevice = this.f73792C;
        if (cameraDevice != null) {
            try {
                return cameraDevice.createCaptureRequest(2);
            } catch (CameraAccessException e) {
                e.printStackTrace();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: l */
    private void mo55723l() {
        this.f73806Q = C30834e.m63524a(this.f73824t, this.f73790A.f74180d.f73613a, this.f73790A.f74180d.f73614b, this.f73790A.f74145L, this.f73790A.f74181e);
        C30969o.m63686a("TECameraModeBase", "Set Fps Range: " + this.f73806Q.toString());
    }

    /* renamed from: t */
    public final float[] mo55828t() {
        if (this.f73826v == null || this.f73827w == null) {
            this.f73829y.mo55846a(-432, -432, "Capture Session is null");
        }
        float[] fArr = (float[]) this.f73824t.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        if (fArr == null) {
            return new float[]{-1.0f, -1.0f};
        }
        return fArr;
    }

    /* renamed from: x */
    public final Handler mo55832x() {
        if (this.f73808S == null) {
            HandlerThread handlerThread = new HandlerThread("camera thread");
            this.f73808S = handlerThread;
            handlerThread.start();
            C30969o.m63686a("TECameraModeBase", "getCameraHandler, init camera thread");
        }
        if (this.f73809T == null) {
            this.f73809T = new Handler(this.f73808S.getLooper());
        }
        return this.f73809T;
    }

    /* renamed from: y */
    public final void mo55833y() {
        C30806e eVar = this.f73830z;
        if (eVar != null) {
            eVar.mo55790F();
        } else {
            C30969o.m63687b("TECameraModeBase", "openCameraLock failed, " + C30969o.m63685a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo55834z() {
        C30806e eVar = this.f73830z;
        if (eVar != null) {
            eVar.mo55789E();
        } else {
            C30969o.m63687b("TECameraModeBase", "waitCameraTaskDoneOrTimeout failed, " + C30969o.m63685a());
        }
    }

    /* renamed from: q */
    public final int[] mo55825q() {
        if (this.f73826v == null || this.f73827w == null) {
            this.f73829y.mo55846a(-430, -430, "Capture Session is null");
        }
        Range range = (Range) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        if (range == null || ((Integer) range.getUpper()).intValue() < 800 || ((Integer) range.getLower()).intValue() > 100) {
            return new int[]{-1, -1};
        }
        return new int[]{((Integer) range.getUpper()).intValue(), ((Integer) range.getLower()).intValue()};
    }

    /* renamed from: s */
    public final long[] mo55827s() {
        if (this.f73826v == null || this.f73827w == null) {
            this.f73829y.mo55846a(-431, -431, "Capture Session is null");
        }
        Range range = (Range) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
        if (range == null) {
            return new long[]{-1, -1};
        }
        return new long[]{((Long) range.getUpper()).longValue(), ((Long) range.getLower()).longValue()};
    }

    /* renamed from: v */
    public final C30820a mo55830v() {
        C30820a aVar = new C30820a();
        if (this.f73827w == null) {
            aVar.f73840b = "Capture Session is null";
            C30969o.m63689d("TECameraModeBase", "stopRepeating: " + aVar.f73840b);
            return aVar;
        }
        try {
            this.f73827w.stopRepeating();
            aVar.f73839a = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            aVar.f73840b = e.getMessage();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            aVar.f73840b = e2.getMessage();
        }
        return aVar;
    }

    /* renamed from: A */
    private void m63379A() {
        Bundle bundle;
        if (this.f73830z.f73842B.containsKey(this.f73790A.f74139F)) {
            bundle = this.f73830z.f73842B.get(this.f73790A.f74139F);
        } else {
            bundle = new Bundle();
            this.f73830z.f73842B.put(this.f73790A.f74139F, bundle);
        }
        bundle.putParcelable("camera_preview_size", this.f73790A.f74192p);
        if (this.f73825u != null) {
            bundle.putBoolean("camera_torch_supported", C30834e.m63529b(this.f73824t));
        } else {
            bundle.putBoolean("camera_torch_supported", false);
        }
        if (!(this.f73824t == null || this.f73794E == null)) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.f73609a = (Rect) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.f73610b = (Rect) this.f73794E.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.f73612d = ((Integer) this.f73824t.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.f73611c = ((Integer) this.f73824t.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable("camera_focus_parameters", tEFocusParameters);
        }
        bundle.putInt("camera_sensor_orientation", this.f73790A.f74182f);
    }

    /* renamed from: a */
    public int mo55631a() {
        C30862c cVar = this.f73830z.f73852t;
        if (this.f73792C == null || cVar == null) {
            C30969o.m63689d("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f73824t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (cVar.f73930b.f73924j) {
            cVar.mo55892a(streamConfigurationMap, (TEFrameSizei) null);
            this.f73790A.f74192p = cVar.mo55897e();
            if (this.f73790A.f74192p != null) {
                this.f73829y.mo55846a(50, 0, this.f73790A.f74192p.toString());
            }
        } else {
            cVar.mo55892a(streamConfigurationMap, this.f73790A.f74192p);
            this.f73790A.f74193q = cVar.mo55898f();
        }
        C30969o.m63686a("TECameraModeBase", "Camera provider type: " + cVar.mo55891a());
        if (cVar.mo55891a() == 1 || cVar.mo55891a() == 16) {
            if (cVar.mo55896d() == null) {
                C30969o.m63689d("TECameraModeBase", "SurfaceTexture is null.");
                return -100;
            }
            cVar.mo55896d().setDefaultBufferSize(this.f73790A.f74192p.f73616a, this.f73790A.f74192p.f73617b);
        } else if (cVar.mo55891a() != 2) {
            if (cVar.mo55891a() == 8) {
                cVar.mo55896d().setDefaultBufferSize(this.f73790A.f74192p.f73616a, this.f73790A.f74192p.f73617b);
            } else {
                C30969o.m63689d("TECameraModeBase", "Unsupported camera provider type : " + cVar.mo55891a());
                return -200;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public void mo55641b() {
        C30933l lVar;
        if (!(this.f73830z == null || (lVar = this.f73790A) == null || !lVar.f74188l)) {
            C30969o.m63686a("TECameraModeBase", "close session process...state = " + this.f73830z.f73768b);
            if (this.f73830z.f73768b == 2) {
                this.f73830z.mo55789E();
            }
        }
        this.f73817aa = false;
        if (this.f73792C == null) {
            C30969o.m63689d("TECameraModeBase", "close session process...device is null");
        } else if (this.f73827w == null) {
            C30969o.m63689d("TECameraModeBase", "close session process...session is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                this.f73827w.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f73827w = null;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C30853j.m63557a("te_record_camera2_close_session_cost", currentTimeMillis2);
            Long.valueOf(currentTimeMillis2);
            C30969o.m63686a("TECameraModeBase", "close session...consume = ".concat(String.valueOf(currentTimeMillis2)));
        }
    }

    /* renamed from: h */
    public Rect mo55649h() {
        if (this.f73794E == null) {
            C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mCaptureRequest is null");
            C30969o.m63689d("TECameraModeBase", "mCaptureRequest == null");
            this.f73829y.mo55846a(-420, -420, "mCaptureRequest == null.");
            return null;
        }
        Rect rect = this.f73816a;
        if (rect == null) {
            C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: mActiveArraySize is null");
            C30969o.m63689d("TECameraModeBase", "ActiveArraySize == null");
            this.f73829y.mo55846a(-420, -420, "ActiveArraySize == null.");
            return null;
        }
        float f = this.f73798I;
        if (f <= 0.0f || f > this.f73797H) {
            C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: invalid factor");
            C30969o.m63689d("TECameraModeBase", "factor invalid");
            this.f73829y.mo55846a(-420, -420, "factor invalid.");
            return null;
        }
        float f2 = 1.0f / f;
        int width = rect.width() - Math.round(((float) this.f73816a.width()) * f2);
        int height = this.f73816a.height() - Math.round(((float) this.f73816a.height()) * f2);
        int i = width / 2;
        int i2 = height / 2;
        Rect rect2 = new Rect(C30956m.m63658a(i, this.f73816a.left, this.f73816a.right), C30956m.m63658a(i2, this.f73816a.top, this.f73816a.bottom), C30956m.m63658a(this.f73816a.width() - i, this.f73816a.left, this.f73816a.right), C30956m.m63658a(this.f73816a.height() - i2, this.f73816a.top, this.f73816a.bottom));
        if (rect2.equals(this.f73794E.get(CaptureRequest.SCALER_CROP_REGION))) {
            C30969o.m63686a("TECameraModeBase", "same SCALER_CROP_REGION, no need to set");
        }
        return rect2;
    }

    /* renamed from: m */
    public int mo55724m() {
        if (this.f73830z.f73852t == null || this.f73826v == null) {
            C30969o.m63689d("TECameraModeBase", "update capture failed");
            return -100;
        }
        this.f73829y.mo55849a("TECamera2 preview");
        if (this.f73825u.mo55859c(this.f73824t)) {
            C30969o.m63686a("TECameraModeBase", "Stabilization Supported, toggle = " + this.f73790A.f74151R);
            if (this.f73825u.mo55858a(this.f73824t, this.f73826v, this.f73790A.f74151R) == 0 && this.f73790A.f74151R) {
                this.f73829y.mo55846a(113, 1, "enable stablization");
            }
        }
        this.f73826v.set(CaptureRequest.CONTROL_MODE, 1);
        mo55723l();
        this.f73826v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo55711a(new Range<>(Integer.valueOf(this.f73806Q.f73613a / this.f73790A.f74180d.f73615c), Integer.valueOf(this.f73806Q.f73614b / this.f73790A.f74180d.f73615c))));
        if (this.f73803N) {
            mo55819b(this.f73826v);
        }
        C30820a d = mo55822d(this.f73826v);
        if (!d.f73839a) {
            C30969o.m63689d("TECameraModeBase", "first request failed: " + d.f73840b);
        }
        this.f73790A.f74182f = ((Integer) this.f73824t.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f73830z.mo55798f(3);
        m63379A();
        C30969o.m63686a("TECameraModeBase", "send capture request...");
        return 0;
    }

    /* renamed from: u */
    public final float[] mo55829u() {
        if (this.f73825u == null || this.f73794E == null || this.f73827w == null || this.f73826v == null) {
            C30969o.m63688c("TECameraModeBase", "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        float[] fArr = new float[2];
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f = (Float) this.f73826v.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int abs = StrictMath.abs(rect.right - rect.left);
        int abs2 = StrictMath.abs(rect.top - rect.bottom);
        int i = this.f73790A.f74192p.f73616a;
        int i2 = this.f73790A.f74192p.f73617b;
        if (abs * i2 >= i / abs2) {
            dArr[0] = StrictMath.atan((double) (((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) / (f.floatValue() * 2.0f))) * 2.0d;
            dArr[1] = StrictMath.atan((double) (((((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) * ((float) (i / i2))) / ((float) (abs / abs2))) / (f.floatValue() * 2.0f))) * 2.0d;
        } else {
            dArr[1] = StrictMath.atan((double) (((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) / (f.floatValue() * 2.0f))) * 2.0d;
            dArr[0] = StrictMath.atan((double) (((((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) * ((float) (i2 / i))) / ((float) (abs2 / abs))) / (f.floatValue() * 2.0f))) * 2.0d;
        }
        fArr[0] = (float) ((dArr[1] * 180.0d) / 3.141592653589793d);
        fArr[1] = (float) ((dArr[0] * 180.0d) / 3.141592653589793d);
        C30969o.m63687b("TECameraModeBase", "Camera2:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
        return fArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo55812a(List<Surface> list) {
        int i = Build.VERSION.SDK_INT;
        return 0;
    }

    /* renamed from: d */
    public final C30820a mo55822d(CaptureRequest.Builder builder) {
        return m63381a(builder, this.f73820ad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C30820a mo55821c(CaptureRequest.Builder builder) {
        return mo55813a(builder, this.f73820ad, mo55832x());
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a.AbstractC30792a
    /* renamed from: a */
    public final void mo55757a(CaptureRequest.Builder builder) {
        mo55822d(builder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo55819b(CaptureRequest.Builder builder) {
        int[] iArr = this.f73802M;
        if (iArr == null) {
            C30969o.m63687b("TECameraModeBase", "FaceDetect is not supported!");
        } else if (C30956m.m63671a(iArr, 1)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
        } else if (C30956m.m63671a(this.f73802M, 2)) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 2);
        } else if (C30956m.m63671a(this.f73802M, 0)) {
            C30969o.m63688c("TECameraModeBase", "FaceDetect is not supported!");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        if (0 != 0) goto L_0x0096;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m63382b(com.p2082ss.android.ttvecamera.C30966n r20) {
        /*
        // Method dump skipped, instructions count: 500
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b.m63382b(com.ss.android.ttvecamera.n):int");
    }

    /* renamed from: a */
    public int mo55633a(C30966n nVar) {
        boolean z;
        if (this.f73790A.f74190n) {
            return m63382b(nVar);
        }
        this.f73805P = nVar;
        this.f73791B.f73744c = nVar;
        this.f73791B.mo55769a(this.f73790A);
        if (this.f73825u == null || this.f73827w == null || this.f73826v == null) {
            C30969o.m63688c("TECameraModeBase", "Env is null");
            this.f73805P.f74246m.mo56059a(-100, this.f73790A.f74181e, "Env is null");
            return -100;
        }
        boolean f = C30834e.m63533f(this.f73824t);
        boolean e = C30834e.m63532e(this.f73824t);
        if (e || f) {
            boolean z2 = nVar.f74242i;
            boolean z3 = this.f73795F.get();
            if (!e || !this.f73805P.f74240g) {
                z = true;
            } else {
                z = false;
            }
            C30969o.m63687b("TECameraModeBase", "focusAtPoint++");
            if (z3 && !z) {
                this.f73823d.run();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                C30969o.m63687b("TECameraModeBase", "cancel previous touch af..");
            }
            Rect b = this.f73805P.mo56056b();
            if (b == null) {
                b = m63380a(this.f73805P.f74234a, this.f73805P.f74235b, (float) this.f73805P.f74236c, (float) this.f73805P.f74237d, this.f73790A.f74182f, 0);
            }
            Rect c = this.f73805P.mo56057c();
            if (c == null) {
                c = m63380a(this.f73805P.f74234a, this.f73805P.f74235b, (float) this.f73805P.f74236c, (float) this.f73805P.f74237d, this.f73790A.f74182f, 1);
            }
            if (!C30956m.m63668a(b) || !C30956m.m63668a(c)) {
                C30969o.m63689d("TECameraModeBase", "focusRect or meteringRect is not valid!");
                this.f73805P.f74246m.mo56059a(-100, this.f73790A.f74181e, "focusRect or meteringRect is not valid!");
                return -100;
            }
            if (this.f73805P.f74241h && f) {
                this.f73791B.mo55756b(this.f73826v, c);
            }
            if (z) {
                if (f && this.f73805P.f74241h) {
                    mo55818b(this.f73826v, this.f73791B.mo55753a(!z), this.f73793D);
                    this.f73795F.set(false);
                }
                return -412;
            }
            this.f73795F.set(true);
            this.f73791B.mo55755a(this.f73826v, b);
            CaptureRequest.Builder builder = this.f73826v;
            C30820a b2 = mo55818b(builder, this.f73791B.mo55752a(builder, this.f73795F, z2), this.f73793D);
            if (b2.f73839a) {
                return 0;
            }
            this.f73795F.set(false);
            this.f73805P.f74246m.mo56059a(-108, this.f73790A.f74181e, b2.f73840b);
            this.f73829y.mo55846a(-411, -411, b2.f73840b);
            return -108;
        }
        C30969o.m63688c("TECameraModeBase", "do not support MeteringAreaAF!");
        this.f73805P.f74246m.mo56059a(-412, this.f73790A.f74181e, "do not support MeteringAreaAF!");
        return -412;
    }

    /* renamed from: b */
    public final void mo55820b(boolean z) {
        if (!z && this.f73798I != 1.0f) {
            this.f73798I = 1.0f;
            if (Build.VERSION.SDK_INT >= 30) {
                if (this.f73826v == null || this.f73827w == null) {
                    this.f73829y.mo55847a(-100, "enableMulticamZoom : Capture Session is null");
                    return;
                }
                this.f73826v.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f73798I));
                C30820a d = mo55822d(this.f73826v);
                if (!d.f73839a) {
                    C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d.f73840b);
                    this.f73829y.mo55846a(-420, -420, d.f73840b);
                    return;
                }
            }
            this.f73800K = mo55649h();
        }
        this.f73821b = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public int mo55634a(boolean z) {
        int i;
        CaptureRequest.Builder builder = this.f73826v;
        if (builder == null) {
            C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f73829y.mo55847a(-100, "toggleTorch : CaptureRequest.Builder is null");
            this.f73829y.mo55853d(z, "toggleTorch : CaptureRequest.Builder is null");
            return -100;
        }
        CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
        if (z != 0) {
            i = 2;
        } else {
            i = 0;
        }
        builder.set(key, Integer.valueOf(i));
        this.f73829y.mo55846a(104, 0, "camera2 will change flash mode ".concat(String.valueOf(z)));
        C30820a d = mo55822d(this.f73826v);
        this.f73829y.mo55846a(105, 0, "camera2 did change flash mode ".concat(String.valueOf(z)));
        if (!d.f73839a) {
            C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: TOGGLE. Code: -417. Reason: " + d.f73840b);
            this.f73829y.mo55846a(-417, -417, d.f73840b);
            this.f73829y.mo55853d(z, d.f73840b);
            return -417;
        }
        this.f73829y.mo55852c(z ? 1 : 0, "camera torch success");
        return 0;
    }

    /* renamed from: a */
    private C30820a m63381a(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback) {
        return mo55818b(builder, captureCallback, mo55832x());
    }

    /* renamed from: a */
    public int mo55632a(float f, C30933l.AbstractC30955p pVar) {
        CaptureRequest.Builder builder;
        Rect a = mo55635a(f);
        if (this.f73825u == null || this.f73794E == null || this.f73827w == null || (builder = this.f73826v) == null) {
            C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f73829y.mo55846a(-420, -420, "startZoom : Env is null");
            return -100;
        } else if (a == null) {
            C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: zoomRect is null");
            this.f73829y.mo55846a(-420, -420, "zoom rect is null.");
            return -420;
        } else {
            builder.set(CaptureRequest.SCALER_CROP_REGION, a);
            C30820a d = mo55822d(this.f73826v);
            if (!d.f73839a) {
                C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d.f73840b);
                this.f73829y.mo55846a(-420, -420, d.f73840b);
                return -420;
            }
            if (pVar != null) {
                pVar.onChange(this.f73790A.f74179c, f, true);
            }
            m63379A();
            return 0;
        }
    }

    /* renamed from: b */
    public void mo55642b(float f, C30933l.AbstractC30955p pVar) {
        if (this.f73827w == null || this.f73794E == null || this.f73826v == null) {
            C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: camera is null");
            this.f73829y.mo55847a(-420, "Camera info is null, may be you need reopen camera.");
            return;
        }
        if (Build.VERSION.SDK_INT < 30 || !this.f73821b || !C30834e.m63531d(this.f73824t)) {
            if (this.f73798I < this.f73797H || f <= 1.0f) {
                Rect rect = this.f73800K;
                if (rect == null || !rect.equals(this.f73816a) || f > 1.0f) {
                    C30969o.m63687b("TECameraModeBase", "mNowZoom = " + this.f73798I);
                    this.f73798I *= f;
                } else {
                    C30969o.m63687b("TECameraModeBase", "mZoomSize = " + this.f73800K + ";mActiveArraySize = " + this.f73816a + ";factor = " + f);
                    this.f73798I = 1.0f;
                }
            } else {
                C30969o.m63687b("TECameraModeBase", "mNowZoom = " + this.f73798I + ";mMaxZoom = " + this.f73797H + ";factor = " + f);
                this.f73798I = this.f73797H;
            }
            Rect h = mo55649h();
            if (h != null) {
                this.f73826v.set(CaptureRequest.SCALER_CROP_REGION, h);
                C30820a d = mo55822d(this.f73826v);
                if (!d.f73839a) {
                    C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d.f73840b);
                    this.f73829y.mo55846a(-420, -420, d.f73840b);
                    return;
                }
                this.f73800K = h;
            } else {
                return;
            }
        } else {
            Range<Float> range = this.f73799J;
            if (range != null) {
                Float upper = range.getUpper();
                Float lower = this.f73799J.getLower();
                if (this.f73798I * f >= upper.floatValue() && f > 1.0f) {
                    this.f73798I = upper.floatValue();
                } else if (this.f73798I * f > lower.floatValue() || f > 1.0f) {
                    this.f73798I *= f;
                    C30969o.m63689d("TECameraModeBase", "zoom ratio = " + this.f73798I);
                } else {
                    this.f73798I = lower.floatValue();
                }
            }
            this.f73826v.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f73798I));
            C30820a d2 = mo55822d(this.f73826v);
            if (!d2.f73839a) {
                C30969o.m63689d("TECameraModeBase", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + d2.f73840b);
                this.f73829y.mo55846a(-420, -420, d2.f73840b);
                return;
            }
        }
        if (pVar != null) {
            pVar.onChange(this.f73790A.f74179c, this.f73798I, true);
        }
        m63379A();
    }

    /* renamed from: a */
    public int mo55710a(String str, int i) {
        Range<Float> range;
        CameraCharacteristics cameraCharacteristics = this.f73824t;
        if (cameraCharacteristics == null) {
            C30969o.m63687b("TECameraModeBase", "open failed, mCameraCharacteristics = null");
            return -401;
        }
        int i2 = -1;
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            i2 = num.intValue();
        }
        if (i2 < 0 || i2 > 3) {
            C30969o.m63689d("TECameraHardware2Proxy", "Invalid hardware level = ".concat(String.valueOf(i2)));
            return -403;
        }
        int i3 = C30833d.f73860b[i2];
        C30853j.m63557a("te_record_camera_hardware_level", (long) i3);
        if (Build.VERSION.SDK_INT < 22 && i2 == 2) {
            return -403;
        }
        if (i3 >= i) {
            C30969o.m63686a("TECameraHardware2Proxy", "Camera hardware level supported, deviceLevel = " + i3 + ", require = " + i);
            this.f73790A.f74182f = ((Integer) this.f73824t.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (this.f73824t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP) == null) {
                return -401;
            }
            this.f73797H = C30834e.m63523a(this.f73824t, this.f73790A.f74179c, this.f73790A.f74191o);
            if (this.f73790A.f74175ap == -1.0f || this.f73790A.f74176aq == -1.0f) {
                CameraCharacteristics cameraCharacteristics2 = this.f73824t;
                if (Build.VERSION.SDK_INT < 30 || (range = (Range) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) == null) {
                    range = new Range<>(Float.valueOf(0.0f), (Float) cameraCharacteristics2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM));
                }
                this.f73799J = range;
            } else {
                this.f73799J = new Range<>(Float.valueOf(this.f73790A.f74176aq), Float.valueOf(this.f73790A.f74175ap));
            }
            this.f73798I = 1.0f;
            this.f73816a = (Rect) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            mo55723l();
            this.f73803N = this.f73790A.f74136C.getBoolean("useCameraFaceDetect");
            this.f73802M = (int[]) this.f73824t.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
            return 0;
        }
        C30969o.m63689d("TECameraHardware2Proxy", "Camera hardware level not supported, deviceLevel = " + i3 + ", require = " + i);
        return -403;
    }

    public AbstractC30813b(C30806e eVar, Context context, Handler handler) {
        this.f73830z = eVar;
        C30933l lVar = eVar.f73847o;
        this.f73790A = lVar;
        this.f73825u = C30834e.m63525a(context, lVar.f74179c);
        this.f73829y = this.f73830z.f73849q;
        this.f73793D = handler;
        this.f73796G = this.f73790A.f74187k;
        this.f73815Z = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C30820a mo55818b(CaptureRequest.Builder builder, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        C30820a aVar = new C30820a();
        if (builder == null) {
            aVar.f73840b = "CaptureRequest.Builder is null";
            C30969o.m63689d("TECameraModeBase", "updatePreview: " + aVar.f73840b);
            return aVar;
        } else if (this.f73827w == null) {
            aVar.f73840b = "Capture Session is null";
            C30969o.m63689d("TECameraModeBase", "updatePreview: " + aVar.f73840b);
            return aVar;
        } else {
            CaptureRequest build = builder.build();
            this.f73794E = build;
            try {
                this.f73827w.setRepeatingRequest(build, captureCallback, handler);
                aVar.f73839a = true;
                this.f73817aa = true;
            } catch (CameraAccessException e) {
                e.printStackTrace();
                aVar.f73840b = e.getMessage();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
                aVar.f73840b = e2.getMessage();
                this.f73817aa = false;
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
                aVar.f73840b = e3.getMessage();
            } catch (SecurityException e4) {
                e4.printStackTrace();
                aVar.f73840b = e4.getMessage();
            }
            return aVar;
        }
    }

    /* renamed from: a */
    private Rect m63380a(int i, int i2, float f, float f2, int i3, int i4) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        Rect rect = (Rect) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        C30969o.m63687b("TECameraModeBase", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]");
        Size size = (Size) this.f73824t.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        C30969o.m63686a("onAreaTouchEvent", "mCameraCharacteristics:[width, height]: [" + size.getWidth() + ", " + size.getHeight() + "]");
        int i5 = this.f73790A.f74192p.f73616a;
        int i6 = this.f73790A.f74192p.f73617b;
        if (90 == this.f73790A.f74182f || 270 == this.f73790A.f74182f) {
            i5 = this.f73790A.f74192p.f73617b;
            i6 = this.f73790A.f74192p.f73616a;
        }
        float f8 = 0.0f;
        if (i6 * i >= i5 * i2) {
            f3 = (((float) i) * 1.0f) / ((float) i5);
            f5 = ((((float) i6) * f3) - ((float) i2)) / 2.0f;
            f4 = 0.0f;
        } else {
            f3 = (((float) i2) * 1.0f) / ((float) i6);
            f4 = ((((float) i5) * f3) - ((float) i)) / 2.0f;
            f5 = 0.0f;
        }
        float f9 = (f + f4) / f3;
        float f10 = (f2 + f5) / f3;
        if (90 == i3) {
            float f11 = ((float) this.f73790A.f74192p.f73617b) - f9;
            f9 = f10;
            f10 = f11;
        } else if (270 == i3) {
            float f12 = ((float) this.f73790A.f74192p.f73616a) - f10;
            f10 = f9;
            f9 = f12;
        }
        Rect rect2 = (Rect) this.f73794E.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null || rect2.isEmpty()) {
            C30969o.m63688c("TECameraModeBase", "can't get crop region");
        } else {
            rect = rect2;
        }
        int width = rect.width();
        int height = rect.height();
        if (this.f73790A.f74192p.f73617b * width > this.f73790A.f74192p.f73616a * height) {
            f6 = (((float) height) * 1.0f) / ((float) this.f73790A.f74192p.f73617b);
            f8 = (((float) width) - (((float) this.f73790A.f74192p.f73616a) * f6)) / 2.0f;
            f7 = 0.0f;
        } else {
            f6 = (((float) width) * 1.0f) / ((float) this.f73790A.f74192p.f73616a);
            f7 = (((float) height) - (((float) this.f73790A.f74192p.f73617b) * f6)) / 2.0f;
        }
        float f13 = (f9 * f6) + f8 + ((float) rect.left);
        float f14 = (f10 * f6) + f7 + ((float) rect.top);
        if (this.f73790A.f74181e == 1) {
            f14 = ((float) rect.height()) - f14;
        }
        Rect rect3 = new Rect();
        if (i4 == 0) {
            double d = (double) f13;
            double width2 = (double) rect.width();
            Double.isNaN(width2);
            Double.isNaN(d);
            rect3.left = C30956m.m63658a((int) (d - (width2 * 0.05d)), 0, rect.width());
            double width3 = (double) rect.width();
            Double.isNaN(width3);
            Double.isNaN(d);
            rect3.right = C30956m.m63658a((int) (d + (width3 * 0.05d)), 0, rect.width());
            double d2 = (double) f14;
            double height2 = (double) rect.height();
            Double.isNaN(height2);
            Double.isNaN(d2);
            rect3.top = C30956m.m63658a((int) (d2 - (height2 * 0.05d)), 0, rect.height());
            double height3 = (double) rect.height();
            Double.isNaN(height3);
            Double.isNaN(d2);
            rect3.bottom = C30956m.m63658a((int) (d2 + (height3 * 0.05d)), 0, rect.height());
        } else {
            double d3 = (double) f13;
            double width4 = (double) rect.width();
            Double.isNaN(width4);
            Double.isNaN(d3);
            rect3.left = C30956m.m63658a((int) (d3 - (width4 * 0.1d)), 0, rect.width());
            double width5 = (double) rect.width();
            Double.isNaN(width5);
            Double.isNaN(d3);
            rect3.right = C30956m.m63658a((int) (d3 + (width5 * 0.1d)), 0, rect.width());
            double d4 = (double) f14;
            double height4 = (double) rect.height();
            Double.isNaN(height4);
            Double.isNaN(d4);
            rect3.top = C30956m.m63658a((int) (d4 - (height4 * 0.1d)), 0, rect.height());
            double height5 = (double) rect.height();
            Double.isNaN(height5);
            Double.isNaN(d4);
            rect3.bottom = C30956m.m63658a((int) (d4 + (height5 * 0.1d)), 0, rect.height());
        }
        if (rect3.left < 0 || rect3.left > rect.right) {
            rect3.left = rect.left;
        }
        if (rect3.top < 0 || rect3.top > rect.bottom) {
            rect3.top = rect.top;
        }
        if (rect3.right < 0 || rect3.right > rect.right) {
            rect3.right = rect.right;
        }
        if (rect3.bottom < 0 || rect3.bottom > rect.bottom) {
            rect3.bottom = rect.bottom;
        }
        C30969o.m63686a("TECameraModeBase", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "]");
        return rect3;
    }
}
