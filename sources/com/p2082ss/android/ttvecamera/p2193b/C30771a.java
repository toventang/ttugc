package com.p2082ss.android.ttvecamera.p2193b;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttvecamera.C30806e;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30853j;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.C30966n;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.C30972p;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2195d.C30798e;
import com.p2082ss.android.ttvecamera.p2195d.C30801f;
import com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b;
import com.p2082ss.android.ttvecamera.p2200i.C30852a;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ttvecamera.b.a */
public final class C30771a extends AbstractC30813b {

    /* renamed from: a */
    public long f73666a;

    /* renamed from: ae */
    private final Handler f73667ae = new Handler(Looper.getMainLooper());

    /* renamed from: af */
    private StreamConfigurationMap f73668af = null;

    /* renamed from: ag */
    private List<CaptureRequest.Key<?>> f73669ag = null;

    /* renamed from: ah */
    private boolean f73670ah = false;

    /* renamed from: ai */
    private boolean f73671ai = true;

    /* renamed from: aj */
    private long f73672aj = 0;

    /* renamed from: ak */
    private int f73673ak = -1;

    /* renamed from: al */
    private int f73674al = 0;

    /* renamed from: am */
    private C30933l.AbstractC30951l f73675am;

    /* renamed from: b */
    public final HandlerC30780a f73676b;

    /* renamed from: c */
    protected ImageReader f73677c;

    /* renamed from: d */
    protected ImageReader f73678d = null;

    /* renamed from: e */
    public int f73679e = -1;

    /* renamed from: f */
    public TotalCaptureResult[] f73680f;

    /* renamed from: g */
    public TotalCaptureResult f73681g = null;

    /* renamed from: h */
    public volatile boolean f73682h = false;

    /* renamed from: i */
    public int f73683i = 0;

    /* renamed from: j */
    public int f73684j;

    /* renamed from: k */
    public boolean f73685k = false;

    /* renamed from: l */
    public boolean f73686l = false;

    /* renamed from: m */
    public boolean f73687m = false;

    /* renamed from: n */
    public int f73688n = 0;

    /* renamed from: o */
    public int f73689o = 0;

    /* renamed from: p */
    public ConditionVariable f73690p = null;

    /* renamed from: q */
    public C30933l.AbstractC30942c f73691q = null;

    /* renamed from: r */
    public int f73692r = 0;

    /* renamed from: s */
    public long f73693s = 0;

    static {
        Covode.recordClassIndex(37396);
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: n */
    public final int mo55725n() {
        return this.f73673ak;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final void mo55715a(C30933l.AbstractC30951l lVar, int i) {
        super.mo55715a(lVar, i);
        this.f73675am = lVar;
        this.f73691q = null;
        this.f73684j = i;
        this.f73686l = false;
        this.f73672aj = System.currentTimeMillis();
        if (this.f73678d == null || this.f73815Z) {
            C30969o.m63686a("TEImage2Mode", "takePicture...flash strategy: " + this.f73790A.f74163ad);
            long j = this.f73815Z ? 1600 : 800;
            if (this.f73790A.f74181e != 0) {
                this.f73683i = 1;
                mo55722k();
            } else if (this.f73790A.f74163ad == 3) {
                if (this.f73815Z) {
                    this.f73666a = System.currentTimeMillis();
                    this.f73683i = 2;
                    this.f73676b.sendEmptyMessageDelayed(1001, j);
                    this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.f73826v.set(CaptureRequest.FLASH_MODE, 2);
                    if (this.f73670ah) {
                        this.f73826v.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f73826v.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                        mo55821c(this.f73826v);
                        this.f73826v.setTag(null);
                        this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.f73826v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                        mo55822d(this.f73826v);
                        AbstractC30813b.C30820a d = mo55822d(this.f73826v);
                        if (!d.f73839a) {
                            HandlerC30780a aVar = this.f73676b;
                            aVar.sendMessage(aVar.obtainMessage(1003, d.mo55842a()));
                            return;
                        }
                        return;
                    }
                    this.f73676b.sendEmptyMessageDelayed(1000, 300);
                    return;
                }
                mo55722k();
            } else if (this.f73790A.f74163ad == 2) {
                if (this.f73815Z || !this.f73687m) {
                    this.f73666a = System.currentTimeMillis();
                    this.f73683i = 2;
                    this.f73676b.sendEmptyMessageDelayed(1001, j);
                    if (this.f73670ah) {
                        this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    }
                    this.f73826v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    this.f73826v.setTag("CAPTURE_REQUEST_TAG_FOR_SHOT");
                    mo55821c(this.f73826v);
                    this.f73826v.setTag(null);
                    this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.f73826v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                    AbstractC30813b.C30820a d2 = mo55822d(this.f73826v);
                    if (!d2.f73839a) {
                        HandlerC30780a aVar2 = this.f73676b;
                        aVar2.sendMessage(aVar2.obtainMessage(1003, d2.mo55842a()));
                        return;
                    }
                    return;
                }
                C30969o.m63686a("TEImage2Mode", "af converge, do capture...");
                mo55722k();
            } else if (this.f73790A.f74163ad == 0) {
                if (this.f73815Z || !this.f73687m) {
                    this.f73666a = System.currentTimeMillis();
                    this.f73683i = 1;
                    this.f73676b.sendEmptyMessageDelayed(1007, j);
                    if (this.f73670ah) {
                        this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    }
                    this.f73826v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    AbstractC30813b.C30820a a = mo55813a(this.f73826v, this.f73820ad, this.f73793D);
                    if (!a.f73839a) {
                        HandlerC30780a aVar3 = this.f73676b;
                        aVar3.sendMessage(aVar3.obtainMessage(1003, a.mo55842a()));
                        return;
                    }
                    return;
                }
                C30969o.m63686a("TEImage2Mode", "af converge, do capture...");
                mo55721j();
            } else if (this.f73790A.f74163ad == 1) {
                this.f73683i = 1;
                if (this.f73815Z) {
                    this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    this.f73826v.set(CaptureRequest.FLASH_MODE, 2);
                }
                mo55721j();
            } else {
                this.f73683i = 1;
                mo55722k();
            }
        } else {
            this.f73683i = 1;
            this.f73682h = true;
            C30969o.m63686a("TEImage2Mode", "takePicture...use zsl buffer");
        }
    }

    /* renamed from: a */
    public final void mo55716a(Exception exc, int i) {
        if (!(this.f73675am == null || this.f73830z == null)) {
            exc = C30806e.m63444a(exc, i);
        }
        this.f73683i = 0;
        C30969o.m63688c("TEImage2Mode", "onCaptureFailed, err = " + exc + ", errCode = " + i);
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final void mo55717a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, final Handler handler, boolean z) {
        if (Build.VERSION.SDK_INT < 28 || (!z && !this.f73790A.f74153T)) {
            C30969o.m63686a("TEImage2Mode", "createSession by normally");
            this.f73792C.createCaptureSession(list, stateCallback, handler);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Surface surface : list) {
            arrayList.add(new OutputConfiguration(surface));
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(mo55812a(list), arrayList, new Executor() {
            /* class com.p2082ss.android.ttvecamera.p2193b.C30771a.ExecutorC307765 */

            static {
                Covode.recordClassIndex(37401);
            }

            public final void execute(Runnable runnable) {
                Handler handler = handler;
                if (handler != null) {
                    handler.post(runnable);
                } else {
                    C30969o.m63689d("TEImage2Mode", "executor run, handler is null");
                }
            }
        }, stateCallback);
        this.f73826v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo55711a(new Range<>(Integer.valueOf(this.f73806Q.f73613a / this.f73790A.f74180d.f73615c), Integer.valueOf(this.f73806Q.f73614b / this.f73790A.f74180d.f73615c))));
        mo55719d(this.f73673ak);
        sessionConfiguration.setSessionParameters(this.f73826v.build());
        C30969o.m63686a("TEImage2Mode", "createSession by sessionConfiguration");
        this.f73792C.createCaptureSession(sessionConfiguration);
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: m */
    public final int mo55724m() {
        mo55719d(this.f73673ak);
        return super.mo55724m();
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: T_ */
    public final int[] mo55708T_() {
        ImageReader imageReader = this.f73677c;
        if (imageReader == null) {
            return null;
        }
        int width = imageReader.getWidth();
        int height = this.f73677c.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{width, height};
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: i */
    public final int[] mo55720i() {
        ImageReader imageReader = this.f73677c;
        if (imageReader == null) {
            return null;
        }
        return new int[]{imageReader.getWidth(), this.f73677c.getHeight()};
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: b */
    public final void mo55641b() {
        this.f73683i = 0;
        this.f73676b.removeCallbacksAndMessages(null);
        Handler x = mo55832x();
        if (x != null) {
            x.removeCallbacksAndMessages(null);
        }
        this.f73666a = 0;
        this.f73686l = false;
        this.f73688n = 0;
        this.f73673ak = -1;
        this.f73681g = null;
        this.f73815Z = false;
        ImageReader imageReader = this.f73677c;
        if (imageReader != null) {
            imageReader.close();
            this.f73677c = null;
        }
        ImageReader imageReader2 = this.f73678d;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f73678d = null;
        }
        this.f73680f = null;
        this.f73675am = null;
        this.f73691q = null;
        super.mo55641b();
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a.AbstractC30792a
    /* renamed from: f */
    public final int mo55647f() {
        if (this.f73826v == null) {
            this.f73829y.mo55847a(-100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f73826v.set(CaptureRequest.CONTROL_AF_MODE, 4);
        mo55822d(this.f73826v);
        return 0;
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a.AbstractC30792a
    /* renamed from: g */
    public final int mo55648g() {
        if (this.f73826v == null) {
            this.f73829y.mo55847a(-100, "rollbackMeteringSessionRequest : param is null.");
            return -100;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f73826v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        if (this.f73803N) {
            mo55819b(this.f73826v);
        }
        this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 1);
        mo55822d(this.f73826v);
        return 0;
    }

    /* renamed from: k */
    public final void mo55722k() {
        this.f73672aj = System.currentTimeMillis();
        this.f73683i = 0;
        CaptureRequest.Builder w = mo55831w();
        if (w == null) {
            mo55716a(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f73677c;
        if (imageReader == null) {
            mo55716a(new Exception("image reader is null"), -1001);
            return;
        }
        w.addTarget(imageReader.getSurface());
        m63225e(w);
        mo55813a(w, new CameraCaptureSession.CaptureCallback() {
            /* class com.p2082ss.android.ttvecamera.p2193b.C30771a.C307754 */

            static {
                Covode.recordClassIndex(37400);
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                C30969o.m63687b("TEImage2Mode", "onCaptureCompleted, do capture done");
                C30771a.this.f73676b.sendEmptyMessage(1002);
                C30771a.this.f73681g = totalCaptureResult;
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                C30969o.m63689d("TEImage2Mode", "onCaptureCompleted, do capture failed");
                if (C30771a.this.f73790A.f74172am) {
                    C30771a.this.f73790A.f74172am = false;
                }
                if (C30771a.this.f73790A.f74185i) {
                    C30771a.this.f73790A.f74185i = false;
                }
                C30771a.this.f73676b.sendMessage(C30771a.this.f73676b.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
                C30771a.this.f73676b.sendEmptyMessage(1002);
            }
        }, (Handler) null);
    }

    /* renamed from: B */
    private Range<Integer> m63221B() {
        int i;
        Range<Integer> range = null;
        if (this.f73824t == null) {
            return null;
        }
        Range<Integer>[] rangeArr = (Range[]) this.f73824t.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            int i2 = 30;
            if (this.f73790A != null && (i = this.f73790A.f74156W) >= 30) {
                i2 = i;
            }
            int i3 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C30969o.m63687b("TEImage2Mode", "fps: " + range2.toString());
                int intValue = range2.getUpper().intValue();
                if (intValue <= i2 && intValue == range2.getLower().intValue() && intValue > i3) {
                    range = range2;
                    i3 = intValue;
                }
            }
        }
        return range;
    }

    /* renamed from: j */
    public final void mo55721j() {
        this.f73672aj = System.currentTimeMillis();
        this.f73683i = 0;
        CaptureRequest.Builder w = mo55831w();
        if (w == null) {
            mo55716a(new Exception("capture build is null"), -1001);
            return;
        }
        ImageReader imageReader = this.f73677c;
        if (imageReader == null) {
            mo55716a(new Exception("image reader is null"), -1001);
            return;
        }
        w.addTarget(imageReader.getSurface());
        m63225e(w);
        AbstractC30813b.C30820a a = mo55813a(w, new CameraCaptureSession.CaptureCallback() {
            /* class com.p2082ss.android.ttvecamera.p2193b.C30771a.C307743 */

            static {
                Covode.recordClassIndex(37399);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                C30969o.m63689d("TEImage2Mode", "captureStillPicture, capture failed");
                if (C30771a.this.f73790A.f74172am) {
                    C30771a.this.f73790A.f74172am = false;
                }
                if (C30771a.this.f73790A.f74185i) {
                    C30771a.this.f73790A.f74185i = false;
                }
                C30771a.this.f73676b.sendMessage(C30771a.this.f73676b.obtainMessage(1003, new Exception("Capture failed: " + captureFailure.getReason())));
                C30771a.this.f73676b.sendEmptyMessage(1002);
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                C30771a.this.f73681g = totalCaptureResult;
                Integer num = (Integer) C30771a.this.f73826v.get(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER);
                Integer num2 = (Integer) C30771a.this.f73826v.get(CaptureRequest.CONTROL_AF_TRIGGER);
                if ((num != null && num.intValue() == 1) || (num2 != null && num2.intValue() == 1)) {
                    C30969o.m63686a("TEImage2Mode", "need cancel ae af trigger");
                    if (Build.VERSION.SDK_INT >= 23) {
                        C30771a.this.f73826v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                    }
                    C30771a.this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    C30771a aVar = C30771a.this;
                    AbstractC30813b.C30820a a = aVar.mo55813a(aVar.f73826v, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
                    if (!a.f73839a) {
                        C30969o.m63688c("TEImage2Mode", "onCaptureSequenceCompleted: error = " + a.f73840b);
                        return;
                    } else {
                        C30771a.this.f73826v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                        C30771a.this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    }
                }
                C30771a aVar2 = C30771a.this;
                aVar2.mo55822d(aVar2.f73826v);
            }
        }, this.f73793D);
        if (!a.f73839a) {
            mo55716a(a.mo55842a(), -1001);
        }
    }

    /* renamed from: l */
    public final void mo55723l() {
        if (this.f73790A.f74181e == 0) {
            if (this.f73790A.f74163ad == 3) {
                if (this.f73815Z) {
                    this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 3);
                    this.f73826v.set(CaptureRequest.FLASH_MODE, 1);
                }
            } else if (this.f73790A.f74163ad == 2 && this.f73670ah) {
                this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                mo55813a(this.f73826v, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
            }
            if (this.f73670ah) {
                this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            }
            this.f73826v.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f73826v.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            mo55822d(this.f73826v);
        }
    }

    /* renamed from: A */
    private Range<Integer> m63220A() {
        int i;
        int i2;
        Range<Integer> range = null;
        if (this.f73824t == null) {
            return null;
        }
        Range<Integer>[] rangeArr = (Range[]) this.f73824t.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            if (this.f73790A == null || (i = this.f73790A.f74156W) < 30) {
                i = 30;
            }
            int i3 = 0;
            int i4 = 0;
            for (Range<Integer> range2 : rangeArr) {
                C30969o.m63687b("TEImage2Mode", "fps: " + range2.toString());
                int intValue = range2.getUpper().intValue();
                int intValue2 = range2.getLower().intValue();
                if (intValue2 < 5) {
                    C30969o.m63686a("TEImage2Mode", "discard fps: " + range2.toString());
                } else {
                    if (intValue > i3) {
                        i3 = intValue;
                    }
                    if (intValue <= i && (i2 = intValue - intValue2) > i4) {
                        range = range2;
                        i4 = i2;
                    }
                }
            }
            if (i3 > 30) {
                C30853j.m63557a("te_record_camera_max_fps", (long) i3);
            }
        }
        return range;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: d */
    public final int mo55645d() {
        int intValue;
        boolean z;
        Handler handler;
        this.f73815Z = false;
        Float f = (Float) this.f73824t.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f == null) {
            intValue = 0;
        } else {
            intValue = f.intValue();
        }
        C30969o.m63687b("TEImage2Mode", "lensInfoMinFocusDistance = ".concat(String.valueOf(intValue)));
        boolean z2 = true;
        if (intValue != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f73670ah = z;
        C30862c cVar = this.f73830z.f73852t;
        if (this.f73792C == null || cVar == null) {
            C30969o.m63689d("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        if (this.f73790A.f74171al) {
            C30969o.m63686a("TEImage2Mode", "bind surface lifecycle to camera...");
            if (!this.f73671ai) {
                if (cVar.f73930b != null) {
                    cVar.f73930b.mo55877d();
                } else {
                    C30969o.m63689d("TEImage2Mode", "reallocate st...err");
                }
            }
            this.f73671ai = false;
        }
        int a = super.mo55631a();
        if (a != 0) {
            return a;
        }
        m63224b(this.f73790A.f74193q.f73616a, this.f73790A.f74193q.f73617b);
        this.f73826v = this.f73792C.createCaptureRequest(1);
        if (this.f73800K != null) {
            this.f73826v.set(CaptureRequest.SCALER_CROP_REGION, this.f73800K);
        }
        ArrayList<Surface> arrayList = new ArrayList();
        if (cVar.f73930b.mo55876c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.mo55895c()));
        } else {
            arrayList.add(cVar.mo55894b());
        }
        ImageReader imageReader = this.f73678d;
        if (imageReader != null) {
            arrayList.add(imageReader.getSurface());
        }
        for (Surface surface : arrayList) {
            this.f73826v.addTarget(surface);
        }
        ImageReader imageReader2 = this.f73677c;
        if (imageReader2 != null) {
            arrayList.add(imageReader2.getSurface());
        }
        this.f73826v.set(CaptureRequest.CONTROL_AF_MODE, 4);
        if (this.f73790A.f74157X) {
            if (Build.VERSION.SDK_INT >= 28) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f73824t != null && this.f73669ag == null) {
                    this.f73669ag = this.f73824t.getAvailableSessionKeys();
                }
                List<CaptureRequest.Key<?>> list = this.f73669ag;
                if (list != null) {
                    Iterator<CaptureRequest.Key<?>> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE.getName().equals(it.next().getName())) {
                                this.f73790A.f74157X = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z2 = false;
                C30969o.m63686a("TEImage2Mode", "check aeTargetFpsRange is session key: " + z2 + ", consume: " + (System.currentTimeMillis() - currentTimeMillis));
            } else {
                this.f73790A.f74157X = false;
            }
        }
        this.f73693s = 0;
        this.f73692r = 0;
        this.f73688n = 0;
        this.f73679e = -1;
        int i = this.f73790A.f74155V;
        this.f73689o = i;
        if (i > 0) {
            C30969o.m63686a("TEImage2Mode", "release camera metadata threshold: " + this.f73689o);
        }
        this.f73687m = false;
        this.f73683i = 0;
        this.f73811V = System.currentTimeMillis();
        if (this.f73790A.f74188l) {
            handler = mo55832x();
        } else {
            handler = this.f73793D;
        }
        this.f73827w = null;
        mo55717a((List<Surface>) arrayList, this.f73819ac, handler, false);
        if (this.f73827w == null) {
            mo55834z();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final void mo55714a(C30933l.AbstractC30951l lVar) {
        mo55715a(lVar, this.f73790A.f74181e);
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final int mo55634a(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        mo55643b(i);
        return 0;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final int mo55633a(C30966n nVar) {
        if (this.f73683i == 0) {
            return super.mo55633a(nVar);
        }
        C30969o.m63689d("TEImage2Mode", "focus action discard, state = " + this.f73683i);
        return -108;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ttvecamera.b.a$a */
    public class HandlerC30780a extends Handler {
        static {
            Covode.recordClassIndex(37405);
        }

        public final void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            C30969o.m63686a("TEImage2Mode", "dispatch msg = " + message.what);
            switch (message.what) {
                case 1000:
                case 1001:
                    C30771a.this.mo55722k();
                    return;
                case 1002:
                    C30771a.this.mo55723l();
                    return;
                case 1003:
                    C30771a.this.mo55716a((Exception) message.obj, -1000);
                    return;
                case 1004:
                    C30771a aVar = C30771a.this;
                    aVar.mo55822d(aVar.f73826v);
                    return;
                case 1005:
                    C30771a aVar2 = C30771a.this;
                    Integer num = (Integer) aVar2.f73826v.get(CaptureRequest.CONTROL_AF_TRIGGER);
                    if (num != null && num.intValue() == 1) {
                        C30969o.m63686a("TEImage2Mode", "need cancel af trigger");
                        aVar2.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        aVar2.mo55813a(aVar2.f73826v, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
                        aVar2.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        aVar2.mo55822d(aVar2.f73826v);
                        return;
                    }
                    return;
                case 1006:
                case 1007:
                    C30771a.this.mo55721j();
                    return;
                default:
                    return;
            }
        }

        public HandlerC30780a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: e */
    private void m63225e(CaptureRequest.Builder builder) {
        if (builder != null) {
            Object obj = this.f73826v.get(CaptureRequest.CONTROL_AF_MODE);
            if (obj != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, obj);
                C30969o.m63687b("TEImage2Mode", "sync afMode: ".concat(String.valueOf(obj)));
            }
            Object[] objArr = (Object[]) this.f73826v.get(CaptureRequest.CONTROL_AE_REGIONS);
            if (objArr != null) {
                builder.set(CaptureRequest.CONTROL_AE_REGIONS, objArr);
                C30969o.m63687b("TEImage2Mode", "sync aeRect: " + Arrays.toString(objArr));
            }
            Object[] objArr2 = (Object[]) this.f73826v.get(CaptureRequest.CONTROL_AF_REGIONS);
            if (objArr != null) {
                builder.set(CaptureRequest.CONTROL_AF_REGIONS, objArr2);
                C30969o.m63687b("TEImage2Mode", "sync afRect: " + Arrays.toString(objArr2));
            }
            m63223a(this.f73826v, builder);
            Object obj2 = this.f73826v.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
            if (obj2 != null) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, obj2);
                C30969o.m63687b("TEImage2Mode", "sync fpsRange: ".concat(String.valueOf(obj2)));
            }
            if (this.f73800K != null) {
                builder.set(CaptureRequest.SCALER_CROP_REGION, this.f73800K);
                C30969o.m63687b("TEImage2Mode", "sync crop region: " + this.f73800K);
            }
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: c */
    public final void mo55718c(int i) {
        Surface surface;
        Surface surface2;
        this.f73674al = i;
        C30969o.m63686a("TEImage2Mode", "setSceneMode: ".concat(String.valueOf(i)));
        if (i == 0) {
            if (this.f73790A.f74157X) {
                Range<Integer> A = m63220A();
                if (!(this.f73826v == null || A == null)) {
                    this.f73826v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, A);
                    mo55822d(this.f73826v);
                    C30969o.m63686a("TEImage2Mode", "apply capture scene: ".concat(String.valueOf(A)));
                }
            }
            ImageReader imageReader = this.f73678d;
            if (imageReader != null && (surface2 = imageReader.getSurface()) != null && surface2.isValid()) {
                if (this.f73826v != null) {
                    try {
                        this.f73826v.removeTarget(surface2);
                        this.f73826v.addTarget(surface2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                mo55822d(this.f73826v);
            }
        } else if (i == 1) {
            if (this.f73790A.f74157X) {
                Range<Integer> B = m63221B();
                if (!(this.f73826v == null || B == null)) {
                    this.f73826v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, B);
                    mo55822d(this.f73826v);
                    C30969o.m63686a("TEImage2Mode", "apply record scene: ".concat(String.valueOf(B)));
                }
            }
            ImageReader imageReader2 = this.f73678d;
            if (imageReader2 != null && (surface = imageReader2.getSurface()) != null && surface.isValid()) {
                if (this.f73826v != null) {
                    try {
                        this.f73826v.removeTarget(surface);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                mo55822d(this.f73826v);
            }
        } else {
            throw new IllegalArgumentException("un support scene");
        }
    }

    /* renamed from: d */
    public final void mo55719d(int i) {
        int intValue;
        C30969o.m63686a("TEImage2Mode", "updateFlashModeParam: ".concat(String.valueOf(i)));
        this.f73673ak = i;
        if (this.f73826v == null) {
            C30969o.m63689d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            this.f73829y.mo55847a(-100, "switchFlashMode : CaptureRequest.Builder is null");
            return;
        }
        Integer num = (Integer) this.f73826v.get(CaptureRequest.FLASH_MODE);
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        if (i == 1) {
            if (this.f73790A.f74181e == 1) {
                C30969o.m63689d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
                C30969o.m63688c("TEImage2Mode", "flash on is not supported in front camera!");
                return;
            }
            this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.f73826v.set(CaptureRequest.FLASH_MODE, 1);
            this.f73815Z = true;
        } else if (i == 0) {
            this.f73815Z = false;
            if (intValue == 0) {
                C30969o.m63686a("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_OFF");
                return;
            }
            this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f73826v.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i == 2) {
            this.f73815Z = false;
            if (intValue == 2) {
                C30969o.m63686a("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            }
            this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f73826v.set(CaptureRequest.FLASH_MODE, 2);
        } else {
            C30969o.m63689d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support flash mode ".concat(String.valueOf(i)));
            C30969o.m63689d("TEImage2Mode", "not support flash mode: ".concat(String.valueOf(i)));
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30812a
    /* renamed from: b */
    public final void mo55643b(int i) {
        boolean z;
        AbstractC30813b.C30820a d;
        int i2 = this.f73673ak;
        if (i2 == -1 || i2 == 0 || i != 0) {
            z = false;
        } else {
            z = true;
        }
        mo55719d(i);
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f73690p == null) {
                this.f73690p = new ConditionVariable();
            }
            this.f73690p.close();
            d = mo55818b(this.f73826v, new CameraCaptureSession.CaptureCallback() {
                /* class com.p2082ss.android.ttvecamera.p2193b.C30771a.C307798 */

                static {
                    Covode.recordClassIndex(37404);
                }

                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    C30771a.this.f73690p.open();
                    C30969o.m63686a("TEImage2Mode", "onCaptureCompleted");
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    C30771a.this.f73690p.open();
                    C30969o.m63689d("TEImage2Mode", "set flash failed");
                }

                public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                    C30771a.this.f73690p.open();
                    C30969o.m63689d("TEImage2Mode", "set flash request abort");
                }
            }, this.f73667ae);
            if (true ^ this.f73690p.block(33)) {
                C30969o.m63686a("TEImage2Mode", "close flash: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            }
            mo55822d(this.f73826v);
        } else {
            d = mo55822d(this.f73826v);
        }
        if (!d.f73839a) {
            C30969o.m63689d("TEImage2Mode", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: " + d.f73840b);
            this.f73829y.mo55846a(-100, -100, d.f73840b);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final Range<Integer> mo55711a(Range<Integer> range) {
        Range<Integer> B;
        if (this.f73824t == null) {
            return range;
        }
        int i = this.f73674al;
        if (i == 0) {
            B = m63220A();
        } else {
            if (i == 1) {
                B = m63221B();
            }
            C30969o.m63686a("TEImage2Mode", "select fps: ".concat(String.valueOf(range)));
            return range;
        }
        if (B != null) {
            range = B;
        }
        C30969o.m63686a("TEImage2Mode", "select fps: ".concat(String.valueOf(range)));
        return range;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final int mo55709a(int i, int i2) {
        this.f73790A.f74201y = true;
        this.f73790A.f74193q.f73616a = i;
        this.f73790A.f74193q.f73617b = i2;
        mo55641b();
        try {
            return mo55645d();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    private static void m63223a(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
        Integer num;
        Integer num2 = (Integer) builder.get(CaptureRequest.CONTROL_AE_MODE);
        if (num2 == null) {
            return;
        }
        if (num2.intValue() == 3) {
            builder2.set(CaptureRequest.CONTROL_AE_MODE, 3);
            builder2.set(CaptureRequest.FLASH_MODE, 1);
        } else if (num2.intValue() == 1 && (num = (Integer) builder.get(CaptureRequest.FLASH_MODE)) != null && num.intValue() == 2) {
            builder2.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder2.set(CaptureRequest.FLASH_MODE, 2);
        }
    }

    /* renamed from: b */
    private void m63224b(int i, int i2) {
        int i3;
        boolean z;
        int i4 = 256;
        if (this.f73790A.f74172am || this.f73790A.f74185i) {
            i3 = 35;
        } else {
            i3 = 256;
        }
        TEFrameSizei a = m63222a(i3, i, i2, this.f73790A.f74196t);
        if (a == null) {
            C30969o.m63689d("TEImage2Mode", "select picture size failed...format: ".concat(String.valueOf(i3)));
            return;
        }
        this.f73790A.f74193q = a;
        int i5 = a.f73616a;
        int i6 = a.f73617b;
        if (!this.f73790A.f74185i || i5 > 4096 || i3 != 35) {
            z = false;
            i4 = i3;
        } else {
            this.f73680f = new TotalCaptureResult[5];
            ImageReader newInstance = ImageReader.newInstance(i5, i6, 35, 3);
            this.f73678d = newInstance;
            newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
                /* class com.p2082ss.android.ttvecamera.p2193b.C30771a.C307776 */

                static {
                    Covode.recordClassIndex(37402);
                }

                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (C30771a.this.f73682h) {
                        int i = 0;
                        C30771a.this.f73682h = false;
                        if (acquireNextImage != null) {
                            long timestamp = acquireNextImage.getTimestamp();
                            TotalCaptureResult totalCaptureResult = null;
                            TotalCaptureResult[] totalCaptureResultArr = C30771a.this.f73680f;
                            int length = totalCaptureResultArr.length;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                TotalCaptureResult totalCaptureResult2 = totalCaptureResultArr[i];
                                Long l = (Long) totalCaptureResult2.get(TotalCaptureResult.SENSOR_TIMESTAMP);
                                if (l != null && timestamp >= l.longValue()) {
                                    totalCaptureResult = totalCaptureResult2;
                                    break;
                                }
                                i++;
                            }
                            C30771a.this.mo55712a(acquireNextImage, totalCaptureResult);
                        } else {
                            C30771a.this.mo55716a(new Exception("no image data"), -1000);
                            return;
                        }
                    } else if (acquireNextImage == null) {
                        return;
                    }
                    acquireNextImage.close();
                }
            }, this.f73667ae);
            z = true;
            Size[] outputSizes = this.f73668af.getOutputSizes(256);
            if (outputSizes != null) {
                for (Size size : outputSizes) {
                    if (size.getWidth() == i5 && size.getHeight() == i6) {
                        i5 = size.getWidth();
                        i6 = size.getHeight();
                        break;
                    }
                }
            }
            this.f73680f = null;
            this.f73678d.setOnImageAvailableListener(null, null);
            this.f73678d.close();
            this.f73678d = null;
            i4 = i3;
        }
        this.f73677c = ImageReader.newInstance(i5, i6, i4, 1);
        C30969o.m63686a("TEImage2Mode", "image reader width: " + this.f73677c.getWidth() + ", height = " + this.f73677c.getHeight() + ", format: " + i4 + ", maxWidth: " + this.f73790A.f74196t + ", hasZslYuvSurface: " + z);
        this.f73677c.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            /* class com.p2082ss.android.ttvecamera.p2193b.C30771a.C307787 */

            static {
                Covode.recordClassIndex(37403);
            }

            public final void onImageAvailable(ImageReader imageReader) {
                TotalCaptureResult totalCaptureResult;
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage == null) {
                    C30771a.this.mo55716a(new Exception("no image data"), -1000);
                    return;
                }
                C30771a aVar = C30771a.this;
                if (acquireNextImage.getFormat() != 256) {
                    totalCaptureResult = C30771a.this.f73681g;
                } else {
                    totalCaptureResult = null;
                }
                aVar.mo55712a(acquireNextImage, totalCaptureResult);
                C30771a.this.f73681g = null;
                acquireNextImage.close();
            }
        }, this.f73667ae);
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final int mo55710a(String str, int i) {
        this.f73671ai = true;
        this.f73674al = 0;
        this.f73669ag = null;
        if (this.f73673ak == -1) {
            this.f73673ak = 0;
        }
        return super.mo55710a(str, i);
    }

    /* renamed from: a */
    public final void mo55712a(Image image, TotalCaptureResult totalCaptureResult) {
        int i;
        C30844i.EnumC30847b bVar;
        int width = image.getWidth();
        int height = image.getHeight();
        if (this.f73684j == 1) {
            i = 270;
        } else {
            i = 90;
        }
        C30969o.m63686a("TEImage2Mode", "on image available, consume: " + (System.currentTimeMillis() - this.f73672aj) + ", size: " + width + "x" + height + ", format: " + image.getFormat() + ", rotation: " + i);
        if (this.f73675am != null) {
            C30972p pVar = new C30972p(image.getPlanes());
            if (image.getFormat() == 256) {
                bVar = C30844i.EnumC30847b.PIXEL_FORMAT_JPEG;
            } else {
                bVar = C30844i.EnumC30847b.PIXEL_FORMAT_YUV420;
            }
            C30844i iVar = new C30844i(pVar, bVar, width, height, i);
            if (image.getFormat() == 35) {
                C30844i.C30848c cVar = new C30844i.C30848c();
                cVar.f73891c = System.currentTimeMillis();
                cVar.f73892d = totalCaptureResult;
                iVar.f73881b = cVar;
                Image.Plane[] planes = image.getPlanes();
                int length = planes.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Image.Plane plane = planes[i2];
                        if (plane != null && plane.getRowStride() != width) {
                            C30969o.m63689d("TEImage2Mode", "process image frame: rowStride: " + plane.getRowStride() + ", w: " + width);
                            byte[] bArr = new byte[(((width * height) * 3) / 2)];
                            C30956m.m63669a(image, bArr);
                            new C30844i(bArr, C30844i.EnumC30847b.PIXEL_FORMAT_NV21, width, height, i);
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
        }
        if (this.f73691q != null) {
            C30956m.m63669a(image, new byte[(((width * height) * 3) / 2)]);
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: a */
    public final void mo55713a(C30852a aVar, int i, C30933l.AbstractC30942c cVar) {
        MethodCollector.m26663i(10946);
        if (!((aVar.f73906c == 0 || aVar.f73906c == this.f73677c.getWidth()) && (aVar.f73907d == 0 || aVar.f73907d == this.f73677c.getHeight()))) {
            C30969o.m63689d("TEImage2Mode", "restart preview for burst capture");
            this.f73790A.f74188l = true;
            mo55709a(aVar.f73906c, aVar.f73907d);
        }
        this.f73675am = null;
        this.f73691q = cVar;
        this.f73684j = i;
        this.f73672aj = System.currentTimeMillis();
        final int width = this.f73677c.getWidth();
        final int height = this.f73677c.getHeight();
        List<Integer> list = aVar.f73905b;
        C307732 r5 = new CameraCaptureSession.CaptureCallback() {
            /* class com.p2082ss.android.ttvecamera.p2193b.C30771a.C307732 */

            static {
                Covode.recordClassIndex(37398);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                C30969o.m63686a("TEImage2Mode", "capture burst failed: " + captureFailure.getReason());
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Object obj = totalCaptureResult.get(TotalCaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                Object obj2 = totalCaptureResult.get(TotalCaptureResult.SENSOR_SENSITIVITY);
                C30969o.m63686a("TEImage2Mode", "onCaptureCompleted, aeExposure: " + obj + ", iso: " + obj2 + ", exposureTime: " + totalCaptureResult.get(TotalCaptureResult.SENSOR_EXPOSURE_TIME));
            }

            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                C30969o.m63686a("TEImage2Mode", "capture burst buffer last...");
            }
        };
        if (aVar.f73904a == 1) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Integer num : list) {
                CaptureRequest.Builder w = mo55831w();
                m63225e(w);
                w.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num);
                w.set(CaptureRequest.CONTROL_AE_LOCK, true);
                w.addTarget(this.f73677c.getSurface());
                arrayList.add(w.build());
            }
            mo55815a(arrayList, r5);
            MethodCollector.m26664o(10946);
            return;
        }
        if (aVar.f73904a == 0) {
            if (aVar.f73909f) {
                mo55830v();
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Integer num2 = list.get(i2);
                CaptureRequest.Builder w2 = mo55831w();
                m63225e(w2);
                w2.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num2);
                w2.set(CaptureRequest.CONTROL_AE_LOCK, true);
                w2.addTarget(this.f73677c.getSurface());
                mo55814a(w2.build(), r5);
                if (i2 > 0 && i2 < size - 1 && aVar.f73908e > 0) {
                    try {
                        Thread.sleep((long) aVar.f73908e);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (aVar.f73909f) {
                mo55822d(this.f73826v);
            }
        }
        MethodCollector.m26664o(10946);
    }

    public C30771a(C30806e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, handler);
        this.f73828x = cameraManager;
        if (this.f73790A.f74190n) {
            this.f73791B = new C30801f(this);
        } else {
            this.f73791B = new C30798e(this);
        }
        this.f73676b = new HandlerC30780a(handler.getLooper());
        this.f73820ad = new CameraCaptureSession.CaptureCallback() {
            /* class com.p2082ss.android.ttvecamera.p2193b.C30771a.C307721 */

            /* renamed from: b */
            private Integer f73695b = -1;

            /* renamed from: c */
            private Integer f73696c = -1;

            /* renamed from: d */
            private Integer f73697d = -1;

            /* renamed from: e */
            private Integer f73698e = -1;

            static {
                Covode.recordClassIndex(37397);
            }

            /* renamed from: a */
            private void m63251a(CaptureResult captureResult) {
                int i;
                boolean z;
                Integer num;
                int i2 = C30771a.this.f73683i;
                boolean z2 = true;
                if (i2 == 0) {
                    Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num2 != null) {
                        i = num2.intValue();
                    } else {
                        i = -1;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    C30771a aVar = C30771a.this;
                    if (valueOf.intValue() == -1 || valueOf.intValue() == 2 || valueOf.intValue() == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f73687m = z;
                    if (C30771a.this.f73826v != null && (num = (Integer) C30771a.this.f73826v.get(CaptureRequest.CONTROL_AF_TRIGGER)) != null && num.intValue() == 1) {
                        if (4 == valueOf.intValue() || 5 == valueOf.intValue() || -1 == valueOf.intValue()) {
                            C30771a.this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                            if (C30771a.this.f73676b != null) {
                                C30771a.this.f73676b.sendEmptyMessage(1004);
                            }
                        }
                    }
                } else if (i2 == 1) {
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 != null && num3.intValue() == 1) {
                        C30771a.this.f73685k = true;
                        C30969o.m63686a("TEImage2Mode", "ae trigger start...");
                    }
                    if (C30771a.this.f73685k) {
                        if (num4 == null || num4.intValue() == 2 || num4.intValue() == 4) {
                            C30771a.this.f73685k = false;
                            C30969o.m63686a("TEImage2Mode", "ae converge, is shot can do");
                        } else {
                            z2 = false;
                        }
                        if (!this.f73698e.equals(num4)) {
                            C30969o.m63686a("TEImage2Mode", "ae state:".concat(String.valueOf(num4)));
                        }
                        this.f73698e = num4;
                        if (z2) {
                            long currentTimeMillis = System.currentTimeMillis() - C30771a.this.f73666a;
                            C30771a.this.f73683i = 0;
                            C30771a.this.f73685k = false;
                            if (C30771a.this.f73676b != null) {
                                C30771a.this.f73676b.removeMessages(1007);
                                C30771a.this.f73676b.sendEmptyMessage(1006);
                                C30771a.this.f73676b.sendEmptyMessage(1005);
                            }
                            C30969o.m63686a("TEImage2Mode", "send-capture-command consume = ".concat(String.valueOf(currentTimeMillis)));
                        }
                    }
                }
            }

            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                m63251a(captureResult);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                if (C30771a.this.f73683i == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                    C30771a.this.f73686l = true;
                    C30969o.m63689d("TEImage2Mode", "onCaptureFailed: ");
                }
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                int i;
                int i2;
                int i3;
                int i4;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - C30771a.this.f73693s > 1000) {
                    C30969o.m63687b("TEImage2Mode", "on frame arrived fps: " + C30771a.this.f73692r);
                    C30771a.this.f73692r = 0;
                    C30771a.this.f73693s = currentTimeMillis;
                } else {
                    C30771a.this.f73692r++;
                }
                m63251a(totalCaptureResult);
                if (!C30771a.this.f73810U) {
                    C30771a.this.mo55833y();
                    C30771a.this.f73810U = true;
                    long currentTimeMillis2 = System.currentTimeMillis() - C30771a.this.f73813X;
                    C30969o.m63686a("TEImage2Mode", "first preview frame callback arrived! consume = " + currentTimeMillis2 + ", session consume: " + C30771a.this.f73812W);
                    C30853j.m63557a("te_record_camera2_set_repeating_request_cost", currentTimeMillis2);
                    Long.valueOf(currentTimeMillis2);
                }
                if (C30771a.this.f73683i == 2) {
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE);
                    Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (num2 != null) {
                        i2 = num2.intValue();
                    } else {
                        i2 = -1;
                    }
                    Integer valueOf2 = Integer.valueOf(i2);
                    if (num3 != null) {
                        i3 = num3.intValue();
                    } else {
                        i3 = -1;
                    }
                    Integer valueOf3 = Integer.valueOf(i3);
                    if (num4 != null) {
                        i4 = num4.intValue();
                    } else {
                        i4 = -1;
                    }
                    Integer valueOf4 = Integer.valueOf(i4);
                    if (!this.f73695b.equals(valueOf) || !this.f73696c.equals(valueOf2) || !this.f73697d.equals(valueOf3) || !this.f73698e.equals(valueOf4)) {
                        C30969o.m63687b("TEImage2Mode", "[afMode=" + valueOf + ", afState=" + valueOf2 + ",aeMode=" + valueOf3 + ", aeState=" + valueOf4 + "]");
                    }
                    this.f73695b = valueOf;
                    this.f73696c = valueOf2;
                    this.f73697d = valueOf3;
                    this.f73698e = valueOf4;
                    if ("CAPTURE_REQUEST_TAG_FOR_SHOT".equals(totalCaptureResult.getRequest().getTag())) {
                        C30771a.this.f73686l = true;
                        C30969o.m63686a("TEImage2Mode", "is shot can do");
                    }
                    if (!C30771a.this.f73686l) {
                        C30969o.m63687b("TEImage2Mode", "discard previous callback");
                    } else if ((valueOf2.intValue() == -1 || valueOf2.intValue() == 4 || valueOf2.intValue() == 5 || valueOf2.intValue() == 2) && (valueOf4.intValue() == -1 || valueOf4.intValue() == 4 || valueOf4.intValue() == 2)) {
                        long currentTimeMillis3 = System.currentTimeMillis() - C30771a.this.f73666a;
                        C30771a.this.f73676b.removeMessages(1001);
                        C30771a.this.f73676b.sendEmptyMessage(1000);
                        C30771a.this.f73686l = false;
                        C30969o.m63686a("TEImage2Mode", "send-capture-command consume = ".concat(String.valueOf(currentTimeMillis3)));
                        C30853j.m63557a("te_record_send_capture_command_cost", currentTimeMillis3);
                    }
                }
                C30771a.this.f73688n++;
                if (C30771a.this.f73689o != 0 && C30771a.this.f73688n > C30771a.this.f73689o) {
                    C30771a.this.f73688n = 0;
                    Runtime.getRuntime().gc();
                }
                C30771a.this.f73679e++;
                if (C30771a.this.f73679e % 5 == 0) {
                    C30771a.this.f73679e = 0;
                }
                if (C30771a.this.f73680f != null) {
                    C30771a.this.f73680f[C30771a.this.f73679e] = totalCaptureResult;
                }
            }

            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                if (C30771a.this.f73683i == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
                    C30771a.this.f73686l = true;
                    C30969o.m63689d("TEImage2Mode", "onCaptureBufferLost: ");
                }
            }
        };
    }

    /* renamed from: a */
    private TEFrameSizei m63222a(int i, int i2, int i3, int i4) {
        if (this.f73790A.f74201y) {
            this.f73790A.f74201y = false;
            return this.f73790A.f74193q;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f73824t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        this.f73668af = streamConfigurationMap;
        if (streamConfigurationMap == null) {
            C30969o.m63689d("TEImage2Mode", "no stream configuration map...");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        if (this.f73790A.f74200x) {
            return C30956m.m63662a(arrayList, this.f73790A.f74192p, i4);
        }
        if (this.f73801L != null) {
            Size[] outputSizes2 = this.f73668af.getOutputSizes(SurfaceTexture.class);
            ArrayList arrayList2 = new ArrayList();
            for (Size size2 : outputSizes2) {
                arrayList2.add(new TEFrameSizei(size2.getWidth(), size2.getHeight()));
            }
            try {
                TEFrameSizei a = this.f73801L.mo55854a(arrayList, arrayList2);
                if (a != null) {
                    return a;
                }
            } catch (Exception e) {
                C30969o.m63689d("TEImage2Mode", "select pic size from client err: " + e.getMessage());
            }
        }
        TEFrameSizei a2 = C30956m.m63663a(arrayList, this.f73790A.f74192p, new TEFrameSizei(i2, i3));
        C30969o.m63686a("TEImage2Mode", "select pic size is null, get closest size: ".concat(String.valueOf(a2)));
        return a2;
    }
}
