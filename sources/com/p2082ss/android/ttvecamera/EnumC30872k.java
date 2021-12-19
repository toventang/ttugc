package com.p2082ss.android.ttvecamera;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Printer;
import androidx.core.content.C0643b;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.TECameraCapture;
import com.p2082ss.android.ttvecamera.p2200i.C30852a;
import com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import com.p2082ss.android.ttvecamera.p2202k.C30929b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ttvecamera.k */
public enum EnumC30872k {
    INSTANCE;
    

    /* renamed from: a */
    C30862c f73960a;

    /* renamed from: b */
    private HandlerThread f73961b;

    /* renamed from: c */
    private volatile boolean f73962c = true;
    public PrivacyCert cachedClosePrivacyCert = null;
    public PrivacyCert cachedOpenPrivacyCert = null;

    /* renamed from: d */
    private float f73963d;

    /* renamed from: e */
    private final Object f73964e = new Object();

    /* renamed from: f */
    private volatile boolean f73965f;

    /* renamed from: g */
    private volatile boolean f73966g;

    /* renamed from: h */
    private C30862c.C30863a f73967h;

    /* renamed from: i */
    private volatile int f73968i = 0;

    /* renamed from: j */
    private Runnable f73969j;

    /* renamed from: k */
    private boolean f73970k = false;

    /* renamed from: l */
    private boolean f73971l = true;

    /* renamed from: m */
    private C30929b f73972m;
    public long mBeginTime = 0;
    public TECameraCapture mCameraClient;
    public final ConditionVariable mCameraClientCondition = new ConditionVariable();
    public AbstractC30825g.AbstractC30826a mCameraEvent = new AbstractC30825g.AbstractC30826a() {
        /* class com.p2082ss.android.ttvecamera.EnumC30872k.C3091043 */

        static {
            Covode.recordClassIndex(37535);
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30826a
        /* renamed from: b */
        public final void mo55851b(String str) {
            C30969o.m63686a("TECameraServer", "stopCapture success!");
            mo55846a(4, 0, str);
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30826a
        /* renamed from: a */
        public final void mo55848a(AbstractC30825g gVar) {
            MethodCollector.m26663i(10006);
            C30969o.m63686a("TECameraServer", "onCameraClosed, CameraState = " + EnumC30872k.this.mCurrentCameraState);
            if (gVar == EnumC30872k.this.mCameraInstance) {
                synchronized (EnumC30872k.this.mStateLock) {
                    try {
                        EnumC30872k.this.updateCameraState(0);
                    } finally {
                        MethodCollector.m26664o(10006);
                    }
                }
                EnumC30872k.this.mCameraObserver.onCaptureStopped(0);
            }
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30826a
        /* renamed from: a */
        public final void mo55849a(String str) {
            C30969o.m63686a("TECameraServer", "startCapture success!");
            EnumC30872k.this.mStartPreviewError = false;
            int i = EnumC30872k.this.mCameraSettings.f74198v - EnumC30872k.this.mCameraInstance.f73857y;
            mo55846a(0, i, str + ", Retry preview times = " + i);
            C30853j.m63557a("te_record_camera_preview_ret", 0L);
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30826a
        /* renamed from: c */
        public final void mo55852c(int i, String str) {
            String str2;
            StringBuilder append = new StringBuilder("onTorchSuccess ").append(str);
            if (i == 0) {
                str2 = " close";
            } else {
                str2 = " open";
            }
            C30969o.m63686a("TECameraServer", append.append(str2).toString());
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30826a
        /* renamed from: d */
        public final void mo55853d(int i, String str) {
            String str2;
            StringBuilder append = new StringBuilder("onTorchError ").append(str);
            if (i == 0) {
                str2 = " close";
            } else {
                str2 = " open";
            }
            C30969o.m63686a("TECameraServer", append.append(str2).toString());
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30826a
        /* renamed from: a */
        public final void mo55847a(int i, String str) {
            C30969o.m63689d("TECameraServer", "onCameraError: code = " + i + ", msg = " + str);
            EnumC30872k.this.mCameraObserver.onError(i, "Open camera failed @" + EnumC30872k.this.mCameraSettings.f74179c + ",face:" + EnumC30872k.this.mCameraSettings.f74181e + " " + EnumC30872k.this.mCameraSettings.f74192p.toString() + " " + str);
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30826a
        /* renamed from: b */
        public final void mo55850b(int i, String str) {
            MethodCollector.m26663i(10157);
            if (!EnumC30872k.this.mCameraSettings.f74164ae || i != -437) {
                synchronized (EnumC30872k.this.mStateLock) {
                    try {
                        if (EnumC30872k.this.mCameraInstance == null || EnumC30872k.this.mCameraInstance.f73857y <= 0) {
                            mo55847a(i, str);
                            C30853j.m63557a("te_record_camera_preview_ret", (long) i);
                        } else {
                            EnumC30872k.this.mStartPreviewError = true;
                            C30969o.m63688c("TECameraServer", "Retry to startPreview. " + EnumC30872k.this.mCameraInstance.f73857y + " times is waiting to retry.");
                            AbstractC30825g gVar = EnumC30872k.this.mCameraInstance;
                            if (gVar.f73857y > 0) {
                                gVar.f73857y--;
                            }
                            Handler handler = EnumC30872k.this.mHandler;
                            if (handler != null) {
                                handler.postDelayed(new Runnable() {
                                    /* class com.p2082ss.android.ttvecamera.EnumC30872k.C3091043.RunnableC309122 */

                                    static {
                                        Covode.recordClassIndex(37537);
                                    }

                                    public final void run() {
                                        EnumC30872k.this.start(EnumC30872k.this.mCameraClient);
                                    }
                                }, 100);
                            } else {
                                return;
                            }
                        }
                        MethodCollector.m26664o(10157);
                    } finally {
                        MethodCollector.m26664o(10157);
                    }
                }
            } else {
                C30853j.m63557a("te_record_camera_preview_ret", (long) i);
                Handler handler2 = EnumC30872k.this.mHandler;
                if (handler2 == null) {
                    MethodCollector.m26664o(10157);
                    return;
                }
                handler2.post(new Runnable() {
                    /* class com.p2082ss.android.ttvecamera.EnumC30872k.C3091043.RunnableC309111 */

                    static {
                        Covode.recordClassIndex(37536);
                    }

                    public final void run() {
                        EnumC30872k.this.handlePreviewingFallback();
                    }
                });
                MethodCollector.m26664o(10157);
            }
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30826a
        /* renamed from: a */
        public final void mo55845a(int i, int i2) {
            MethodCollector.m26663i(9856);
            EnumC30872k.this.mOpenTime = System.currentTimeMillis() - EnumC30872k.this.mBeginTime;
            C30969o.m63686a("TECameraServer", "onCameraOpened: CameraType = " + EnumC30872k.this.mCameraSettings.f74179c + ", Ret = " + i2 + ",retryCnt = " + EnumC30872k.this.mRetryCnt);
            EnumC30872k.this.mOpenInfoMap.put("CamType" + EnumC30872k.this.mRetryCnt, String.valueOf(EnumC30872k.this.mCameraSettings.f74179c));
            EnumC30872k.this.mOpenInfoMap.put("Ret" + EnumC30872k.this.mRetryCnt, String.valueOf(i2));
            EnumC30872k.this.mOpenInfoMap.put("OpenTime" + EnumC30872k.this.mRetryCnt, String.valueOf(EnumC30872k.this.mOpenTime));
            if (i2 == 0) {
                EnumC30872k kVar = EnumC30872k.this;
                kVar.mRetryCnt = kVar.mCameraSettings.f74197u;
                synchronized (EnumC30872k.this.mStateLock) {
                    try {
                        if (EnumC30872k.this.mCurrentCameraState == 1) {
                            EnumC30872k.this.updateCameraState(2);
                            EnumC30872k.this.mCameraObserver.onCaptureStarted(i, i2);
                            int i3 = EnumC30872k.this.mCameraSettings.f74197u - EnumC30872k.this.mRetryCnt;
                            EnumC30872k.this.mCameraObserver.onInfo(120, i3, "Retry open camera times = ".concat(String.valueOf(i3)));
                            EnumC30872k.this.mOpenInfoMap.put("ResultType", "Open Success");
                            C30853j.m63557a("te_record_camera_open_ret", (long) i2);
                            C30853j.m63557a("te_record_camera_open_cost", EnumC30872k.this.mOpenTime);
                            C30853j.m63558a("te_record_camera_open_info", EnumC30872k.this.mOpenInfoMap.toString());
                            C30969o.m63686a("VESDKCOST", "TE_RECORD_CAMERA_OPEN_COST " + EnumC30872k.this.mOpenTime);
                            EnumC30872k.this.mOpenInfoMap.clear();
                            MethodCollector.m26664o(9856);
                            return;
                        }
                        C30969o.m63688c("TECameraServer", "Open camera error ? May be closed now!!, state = " + EnumC30872k.this.mCurrentCameraState);
                    } finally {
                        MethodCollector.m26664o(9856);
                    }
                }
            } else if (EnumC30872k.this.mCameraSettings.f74179c == 11 && i2 == -428) {
                C30969o.m63686a("TECameraServer", "CameraUnit auth failed, fall back to camera2");
                EnumC30872k kVar2 = EnumC30872k.this;
                kVar2.mRetryCnt = kVar2.mCameraSettings.f74197u;
                synchronized (EnumC30872k.this.mStateLock) {
                    try {
                        if (EnumC30872k.this.mCurrentCameraState == 0) {
                            C30969o.m63688c("TECameraServer", "onCameraOpened, no need to close camera, state: " + EnumC30872k.this.mCurrentCameraState);
                            EnumC30872k.this.mCameraInstance = null;
                        } else {
                            EnumC30872k.this.updateCameraState(0);
                            if (EnumC30872k.this.mCameraInstance != null) {
                                EnumC30872k.this.mCameraInstance.mo55678b(EnumC30872k.this.cachedOpenPrivacyCert);
                                EnumC30872k.this.mCameraInstance = null;
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(9856);
                        throw th;
                    }
                }
                EnumC30872k.this.mCameraSettings.f74179c = 2;
                EnumC30872k.INSTANCE.open(EnumC30872k.this.mCameraClient, EnumC30872k.this.mCameraSettings, EnumC30872k.this.cachedOpenPrivacyCert);
                EnumC30872k.this.mOpenInfoMap.put("ResultType", "fallback to Camera2");
                C30853j.m63558a("te_record_camera_open_info", EnumC30872k.this.mOpenInfoMap.toString());
                EnumC30872k.this.mOpenInfoMap.clear();
                MethodCollector.m26664o(9856);
            } else if (i2 != -403 && EnumC30872k.this.mRetryCnt > 0 && EnumC30872k.this.isCameraPermitted()) {
                EnumC30872k.this.mCameraObserver.onError(-404, "Retry to Open Camera Failed @" + EnumC30872k.this.mCameraSettings.f74179c + ",face:" + EnumC30872k.this.mCameraSettings.f74181e + " " + EnumC30872k.this.mCameraSettings.f74192p.toString());
                if (EnumC30872k.this.mIsCameraPendingClose) {
                    EnumC30872k.this.mIsCameraPendingClose = false;
                    C30969o.m63689d("TECameraServer", "retry to open camera, but camera close was called");
                    EnumC30872k.this.mRetryCnt = -1;
                    EnumC30872k.this.mOpenInfoMap.put("ResultType" + EnumC30872k.this.mRetryCnt, "retry to open camera");
                    C30853j.m63558a("te_record_camera_open_info", EnumC30872k.this.mOpenInfoMap.toString());
                    MethodCollector.m26664o(9856);
                    return;
                }
                if (i == 2 && EnumC30872k.this.mRetryCnt == EnumC30872k.this.mCameraSettings.f74197u && (i2 == 4 || i2 == 5 || i2 == 1)) {
                    C30969o.m63686a("TECameraServer", "camera2 is not available");
                    EnumC30872k kVar3 = EnumC30872k.this;
                    kVar3.mRetryCnt = kVar3.mCameraSettings.f74199w;
                }
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C30969o.m63686a("TECameraServer", "retry to open camera, mRetryCnt = " + EnumC30872k.this.mRetryCnt);
                synchronized (EnumC30872k.this.mStateLock) {
                    try {
                        if (EnumC30872k.this.mCurrentCameraState == 0) {
                            C30969o.m63688c("TECameraServer", "onCameraOpened, no need to close camera, state: " + EnumC30872k.this.mCurrentCameraState);
                            EnumC30872k.this.mCameraInstance = null;
                        } else {
                            EnumC30872k.this.updateCameraState(0);
                            if (EnumC30872k.this.mCameraInstance != null) {
                                EnumC30872k.this.mCameraInstance.mo55678b(EnumC30872k.this.cachedOpenPrivacyCert);
                                EnumC30872k.this.mCameraInstance = null;
                            }
                        }
                    } catch (Throwable th2) {
                        MethodCollector.m26664o(9856);
                        throw th2;
                    }
                }
                EnumC30872k.this.mRetryCnt--;
                EnumC30872k.INSTANCE.open(EnumC30872k.this.mCameraClient, EnumC30872k.this.mCameraSettings, EnumC30872k.this.cachedOpenPrivacyCert);
                EnumC30872k.this.mOpenInfoMap.put("ResultType" + EnumC30872k.this.mRetryCnt, "retry to open camera");
                C30853j.m63558a("te_record_camera_open_info", EnumC30872k.this.mOpenInfoMap.toString());
                MethodCollector.m26664o(9856);
            } else if ((!EnumC30872k.this.mCameraSettings.f74142I || i == 1) && i2 != -403) {
                EnumC30872k.this.mCameraObserver.onCaptureStarted(i, i2);
                C30969o.m63686a("TECameraServer", "finally go to the error.");
                C30853j.m63557a("te_record_camera_open_ret", (long) i2);
                EnumC30872k.this.mCameraObserver.onError(i2, "Open camera failed @" + EnumC30872k.this.mCameraSettings.f74179c + ",face:" + EnumC30872k.this.mCameraSettings.f74181e + " " + EnumC30872k.this.mCameraSettings.f74192p.toString());
                EnumC30872k.INSTANCE.close(EnumC30872k.this.cachedOpenPrivacyCert);
                EnumC30872k.this.mRetryCnt = -1;
                C30853j.m63558a("te_record_camera_open_info", EnumC30872k.this.mOpenInfoMap.toString());
                EnumC30872k.this.mOpenInfoMap.clear();
                MethodCollector.m26664o(9856);
            } else {
                C30969o.m63686a("TECameraServer", "Open camera failed, fall back to camera1");
                EnumC30872k kVar4 = EnumC30872k.this;
                kVar4.mRetryCnt = kVar4.mCameraSettings.f74197u;
                synchronized (EnumC30872k.this.mStateLock) {
                    try {
                        if (EnumC30872k.this.mCurrentCameraState == 0) {
                            C30969o.m63688c("TECameraServer", "onCameraOpened, no need to close camera, state: " + EnumC30872k.this.mCurrentCameraState);
                            EnumC30872k.this.mCameraInstance = null;
                        } else {
                            EnumC30872k.this.updateCameraState(0);
                            if (EnumC30872k.this.mCameraInstance != null) {
                                EnumC30872k.this.mCameraInstance.mo55678b(EnumC30872k.this.cachedOpenPrivacyCert);
                                EnumC30872k.this.mCameraInstance = null;
                            }
                        }
                    } catch (Throwable th3) {
                        MethodCollector.m26664o(9856);
                        throw th3;
                    }
                }
                EnumC30872k.this.mCameraSettings.f74179c = 1;
                EnumC30872k.INSTANCE.open(EnumC30872k.this.mCameraClient, EnumC30872k.this.mCameraSettings, EnumC30872k.this.cachedOpenPrivacyCert);
                EnumC30872k.this.mOpenInfoMap.put("ResultType", "fallback to Camera1");
                C30853j.m63558a("te_record_camera_open_info", EnumC30872k.this.mOpenInfoMap.toString());
                MethodCollector.m26664o(9856);
            }
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30826a
        /* renamed from: a */
        public final void mo55846a(int i, int i2, String str) {
            C30969o.m63687b("TECameraServer", "onCameraInfo: " + i + ", ext: " + i2 + " msg: " + str);
            EnumC30872k.this.mCameraObserver.onInfo(i, i2, str);
        }
    };
    public volatile AbstractC30825g mCameraInstance;
    public TECameraCapture.AbstractC30747a mCameraObserver = new TECameraCapture.C30748b();
    public C30933l mCameraSettings;
    public volatile int mCurrentCameraState = 0;
    public boolean mFirstZoom = true;
    public Handler mHandler;
    public volatile boolean mIsCameraPendingClose;
    public Handler mMainHandler = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap<String, String> mOpenInfoMap = new ConcurrentHashMap<>();
    public long mOpenTime = 0;
    public TECameraCapture.AbstractC30749c mPictureSizeCallback;
    public int mRetryCnt = -1;
    public C30933l.AbstractC30952m mSATZoomCallback;
    public boolean mStartPreviewError = false;
    public final Object mStateLock = new Object();

    /* renamed from: n */
    private boolean f73973n = false;

    /* renamed from: o */
    private int f73974o = 0;

    /* renamed from: p */
    private boolean f73975p = false;

    /* renamed from: q */
    private int f73976q = -1;

    /* renamed from: r */
    private final AbstractC30825g.AbstractC30828c f73977r = new AbstractC30825g.AbstractC30828c() {
        /* class com.p2082ss.android.ttvecamera.EnumC30872k.C3091344 */

        static {
            Covode.recordClassIndex(37538);
        }

        @Override // com.p2082ss.android.ttvecamera.AbstractC30825g.AbstractC30828c
        /* renamed from: a */
        public final TEFrameSizei mo55854a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            if (EnumC30872k.this.mPictureSizeCallback != null) {
                return EnumC30872k.this.mPictureSizeCallback.mo55591a(list, list2);
            }
            return null;
        }
    };

    /* renamed from: s */
    private AbstractC30825g.AbstractC30829d f73978s = new AbstractC30825g.AbstractC30829d() {
        /* class com.p2082ss.android.ttvecamera.EnumC30872k.C3091546 */

        static {
            Covode.recordClassIndex(37540);
        }
    };

    public final void changeCaptureFormat() {
    }

    public final int getCameraState() {
        return getCameraState(false);
    }

    public final int startRecording() {
        return this.mCameraInstance.mo55799v();
    }

    public final int stopRecording() {
        return this.mCameraInstance.mo55800w();
    }

    public final int[] getCameraCaptureSize() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.mo55688h();
    }

    public final int[] getPreviewFps() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.mo55686f();
    }

    static {
        Covode.recordClassIndex(37497);
    }

    /* renamed from: c */
    private synchronized int m63639c() {
        int i;
        MethodCollector.m26663i(14362);
        this.f73968i++;
        C30969o.m63687b("TECameraServer", "sClientCount = " + this.f73968i);
        i = this.f73968i;
        MethodCollector.m26664o(14362);
        return i;
    }

    public final synchronized int decreaseClientCount() {
        int i;
        MethodCollector.m26663i(14363);
        this.f73968i--;
        C30969o.m63687b("TECameraServer", "sClientCount = " + this.f73968i);
        if (this.f73968i < 0) {
            C30969o.m63688c("TECameraServer", "Invalid ClientCount = " + this.f73968i);
            this.f73968i = 0;
        }
        i = this.f73968i;
        MethodCollector.m26664o(14363);
        return i;
    }

    public final synchronized int destroy() {
        MethodCollector.m26663i(13549);
        C30969o.m63686a("TECameraServer", "destroy...start");
        this.f73965f = false;
        this.f73969j = null;
        this.mCameraClient = null;
        this.mPictureSizeCallback = null;
        this.cachedClosePrivacyCert = null;
        this.cachedOpenPrivacyCert = null;
        this.f73967h = null;
        AbstractC30825g gVar = this.mCameraInstance;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC308731 */

                static {
                    Covode.recordClassIndex(37498);
                }

                public final void run() {
                    AbstractC30857b bVar = EnumC30872k.this.f73960a.f73930b;
                    if (bVar != null) {
                        bVar.mo55882e();
                    }
                    C30969o.m63686a("TECameraServer", "provider release...");
                }
            });
        }
        if (this.f73961b != null) {
            int i = Build.VERSION.SDK_INT;
            this.f73961b.quitSafely();
            this.f73961b = null;
            this.f73962c = true;
            this.mHandler = null;
        }
        this.mCameraObserver = TECameraCapture.C30748b.m63135a();
        C30969o.m63686a("TECameraServer", "destroy...end");
        MethodCollector.m26664o(13549);
        return 0;
    }

    public final void handlePreviewingFallback() {
        boolean z;
        MethodCollector.m26663i(14357);
        if (this.mCameraSettings.f74179c == 1) {
            MethodCollector.m26664o(14357);
            return;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55675b();
                        updateCameraState(2);
                        this.mCameraInstance.mo55678b(this.cachedOpenPrivacyCert);
                        this.mCameraInstance = null;
                        updateCameraState(0);
                    }
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(14357);
            }
        }
        if (z) {
            this.mCameraSettings.f74179c = 1;
            this.mCameraEvent.mo55846a(51, 0, "need recreate surfacetexture");
            INSTANCE.open(this.mCameraClient, this.mCameraSettings, this.cachedOpenPrivacyCert);
        }
    }

    public final boolean isCameraPermitted() {
        boolean z = true;
        try {
            if (C0643b.m2367a(this.mCameraSettings.f74178b, "android.permission.CAMERA") != 0) {
                z = false;
            }
        } catch (Exception e) {
            C30969o.m63689d("TECameraServer", "test camera permission failed!: " + e.toString());
        }
        this.mOpenInfoMap.put("CamPerm" + this.mRetryCnt, String.valueOf(z));
        return z;
    }

    /* renamed from: a */
    private synchronized void m63634a() {
        MethodCollector.m26663i(13487);
        C30969o.m63686a("TECameraServer", "init...start");
        if (this.f73965f) {
            MethodCollector.m26664o(13487);
            return;
        }
        this.mHandler = m63633a("TECameraServer");
        this.f73962c = false;
        this.f73960a = new C30862c();
        this.f73965f = true;
        this.f73963d = 0.0f;
        this.f73970k = false;
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.f73972m = new C30929b();
        C30969o.m63686a("TECameraServer", "init...end");
        MethodCollector.m26664o(13487);
    }

    /* renamed from: b */
    private AbstractC30825g m63637b() {
        boolean z;
        if (Build.VERSION.SDK_INT < 24) {
            return C30764b.m63171a(this.mCameraSettings.f74178b, this.mCameraEvent, this.mHandler, this.f73977r);
        }
        if (this.mCameraSettings.f74174ao) {
            z = C30956m.m63676b(this.mCameraSettings.f74178b);
        } else {
            z = true;
        }
        if (this.mCameraSettings.f74179c == 1) {
            return C30764b.m63171a(this.mCameraSettings.f74178b, this.mCameraEvent, this.mHandler, this.f73977r);
        }
        if (this.mCameraSettings.f74179c == 7 && z) {
            this.mCameraSettings.f74179c = 2;
            return C30806e.m63313a(this.mCameraSettings.f74179c, this.mCameraSettings.f74178b, this.mCameraEvent, this.mHandler, this.f73977r);
        } else if ((10 == this.mCameraSettings.f74179c || 11 == this.mCameraSettings.f74179c) && Build.VERSION.SDK_INT >= 28) {
            try {
                AbstractC30825g gVar = (AbstractC30825g) Class.forName("com.ss.android.ttvecamera.TEVendorCamera").getMethod("create", Integer.TYPE, Context.class, AbstractC30825g.AbstractC30826a.class, Handler.class, AbstractC30825g.AbstractC30828c.class).invoke(null, Integer.valueOf(this.mCameraSettings.f74179c), this.mCameraSettings.f74178b, this.mCameraEvent, this.mHandler, this.f73977r);
                if (gVar != null) {
                    C30969o.m63686a("TECameraServer", "createCameraInstance TEVendorCamera");
                    return gVar;
                }
            } catch (Exception e) {
                if ((C30969o.f74248b & 2) != 0) {
                    C30969o.f74249c.Log((byte) 2, C30969o.f74247a + "TECameraServer", "createCameraInstance for TEVendorCamera class failed, exception occurred" + e.getMessage() + "stack: " + Log.getStackTraceString(e));
                }
            }
            if (!z) {
                this.mCameraSettings.f74179c = 1;
                return C30764b.m63171a(this.mCameraSettings.f74178b, this.mCameraEvent, this.mHandler, this.f73977r);
            }
            this.mCameraSettings.f74179c = 2;
            return C30806e.m63313a(this.mCameraSettings.f74179c, this.mCameraSettings.f74178b, this.mCameraEvent, this.mHandler, this.f73977r);
        } else if (z) {
            return C30806e.m63313a(this.mCameraSettings.f74179c, this.mCameraSettings.f74178b, this.mCameraEvent, this.mHandler, this.f73977r);
        } else {
            this.mCameraSettings.f74179c = 1;
            return C30764b.m63171a(this.mCameraSettings.f74178b, this.mCameraEvent, this.mHandler, this.f73977r);
        }
    }

    public final void appLifeCycleChanged(boolean z) {
        this.f73970k = z;
    }

    public final void setSATZoomCallback(C30933l.AbstractC30952m mVar) {
        this.mSATZoomCallback = mVar;
    }

    public final int close(PrivacyCert privacyCert) {
        return close(true, privacyCert);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ttvecamera.k$a */
    public static class C30927a implements Handler.Callback {

        /* renamed from: a */
        private WeakReference<EnumC30872k> f74125a;

        static {
            Covode.recordClassIndex(37552);
        }

        public C30927a(EnumC30872k kVar) {
            this.f74125a = new WeakReference<>(kVar);
        }

        public final boolean handleMessage(Message message) {
            MethodCollector.m26663i(9358);
            int i = message.what;
            Object obj = message.obj;
            EnumC30872k kVar = this.f74125a.get();
            if (i == 1) {
                C30969o.m63687b("TECameraServer", "startZoom...");
                synchronized (kVar.mStateLock) {
                    try {
                        if (kVar.mCameraInstance != null) {
                            kVar.mCameraInstance.mo55662a(((float) message.arg1) / 100.0f, (C30933l.AbstractC30955p) obj);
                        }
                        if (kVar.mFirstZoom) {
                            AbstractC30825g.AbstractC30826a aVar = kVar.mCameraEvent;
                            AbstractC30825g gVar = kVar.mCameraInstance;
                            aVar.mo55846a(114, 0, "startzoom");
                            kVar.mFirstZoom = false;
                        }
                    } finally {
                        MethodCollector.m26664o(9358);
                    }
                }
            }
            return false;
        }
    }

    public final int getFlashMode(TECameraCapture tECameraCapture) {
        if (this.mCameraInstance == null) {
            return -1;
        }
        return this.mCameraInstance.mo55690j();
    }

    public final C30933l.C30943d getCameraECInfo(TECameraCapture tECameraCapture) {
        if (m63635a(tECameraCapture) && this.mCameraInstance != null) {
            return this.mCameraInstance.f73847o.f74141H;
        }
        return null;
    }

    public final int getCameraState(boolean z) {
        int i;
        MethodCollector.m26663i(13601);
        if (z) {
            synchronized (this.mStateLock) {
                try {
                    i = this.mCurrentCameraState;
                } finally {
                    MethodCollector.m26664o(13601);
                }
            }
        } else {
            i = this.mCurrentCameraState;
        }
        return i;
    }

    public final int[] getPictureSize(TECameraCapture tECameraCapture) {
        if (m63635a(tECameraCapture) && this.mCameraInstance != null) {
            return this.mCameraInstance.mo55691k();
        }
        return null;
    }

    public final boolean isTorchSupported(TECameraCapture tECameraCapture) {
        AbstractC30825g gVar;
        if (m63635a(tECameraCapture) && (gVar = this.mCameraInstance) != null && gVar.mo55699s()) {
            return true;
        }
        return false;
    }

    public final void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings != null && this.mCameraInstance != null) {
            this.mCameraSettings.f74180d = tEFrameRateRange;
            this.mCameraSettings.f74145L = 1;
            this.mCameraInstance.mo55687g();
        }
    }

    /* renamed from: a */
    private boolean m63635a(TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14353);
        synchronized (this.f73964e) {
            try {
                TECameraCapture tECameraCapture2 = this.mCameraClient;
                if (tECameraCapture2 != tECameraCapture) {
                    if (tECameraCapture2 == null) {
                        C30969o.m63688c("TECameraServer", "Internal CameraClient is null. Must call connect first!");
                    } else {
                        C30969o.m63688c("TECameraServer", "Invalid CameraClient, need : " + this.mCameraClient);
                    }
                    return false;
                }
                MethodCollector.m26664o(14353);
                return true;
            } finally {
                MethodCollector.m26664o(14353);
            }
        }
    }

    public final int abortSession(TECameraCapture tECameraCapture) {
        if (!m63635a(tECameraCapture)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C30969o.m63689d("TECameraServer", "abortSession, mHandler is null!");
            return -112;
        }
        handler.post(new Runnable() {
            /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3092151 */

            static {
                Covode.recordClassIndex(37546);
            }

            public final void run() {
                if (EnumC30872k.this.mCameraInstance != null) {
                    EnumC30872k.this.mCameraInstance.mo55802y();
                }
            }
        });
        return 0;
    }

    public final boolean isSupportWhileBalance(TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14318);
        boolean z = false;
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14318);
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.mo55698r()) {
                    z = true;
                }
            } finally {
                MethodCollector.m26664o(14318);
            }
        }
        return z;
    }

    public final boolean isSupportedExposureCompensation(TECameraCapture tECameraCapture) {
        if (!m63635a(tECameraCapture)) {
            return false;
        }
        if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
            return this.mCameraInstance.mo55695o();
        }
        C30969o.m63688c("TECameraServer", "Can not set ec on state : " + this.mCurrentCameraState);
        return false;
    }

    public final void updateCameraState(int i) {
        if (this.mCurrentCameraState == i) {
            C30969o.m63688c("TECameraServer", "No need update state: ".concat(String.valueOf(i)));
            return;
        }
        C30969o.m63686a("TECameraServer", "[updateCameraState]: " + this.mCurrentCameraState + " -> " + i);
        this.mCurrentCameraState = i;
    }

    private EnumC30872k(String str) {
    }

    /* renamed from: a */
    private Handler m63633a(String str) {
        Looper mainLooper;
        try {
            HandlerThread handlerThread = this.f73961b;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            HandlerThread handlerThread2 = new HandlerThread(str);
            handlerThread2.start();
            handlerThread2.getLooper().setMessageLogging(new Printer() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.C3090942 */

                /* renamed from: b */
                private long f74086b;

                /* renamed from: c */
                private int f74087c;

                /* renamed from: d */
                private long f74088d;

                static {
                    Covode.recordClassIndex(37534);
                }

                public final void println(String str) {
                    if (str.startsWith(">>>>> Dispatching to Handler")) {
                        this.f74086b = System.currentTimeMillis();
                    } else if (str.startsWith("<<<<< Finished to Handler")) {
                        long currentTimeMillis = System.currentTimeMillis() - this.f74086b;
                        if (currentTimeMillis > 1000) {
                            int i = this.f74087c + 1;
                            this.f74087c = i;
                            C30853j.m63557a("te_record_camera_task_time_out_count", (long) i);
                            if (currentTimeMillis > this.f74088d) {
                                this.f74088d = currentTimeMillis;
                                C30853j.m63557a("te_record_camera_max_lag_task_cost", currentTimeMillis);
                                C30969o.m63686a("TECameraServer", "task: " + str + ", cost: " + currentTimeMillis + "ms");
                            }
                        }
                    }
                }
            });
            this.f73961b = handlerThread2;
            return new Handler(handlerThread2.getLooper(), new C30927a(this));
        } catch (Exception e) {
            C30969o.m63689d("TECameraServer", "CreateHandler failed!: " + e.toString());
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            return new Handler(mainLooper);
        }
    }

    public final int cancelFocus(final TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14062);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14062);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3087713 */

                static {
                    Covode.recordClassIndex(37502);
                }

                public final void run() {
                    EnumC30872k.this.cancelFocus(tECameraCapture);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "cancelFocus...");
            synchronized (this.mStateLock) {
                try {
                    this.mCameraInstance.mo55693m();
                } catch (Throwable th) {
                    MethodCollector.m26664o(14062);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14062);
        return 0;
    }

    public final boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            C30969o.m63688c("TECameraServer", "No need this");
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    C30969o.m63689d("TECameraServer", "Invalidate camera state = ".concat(String.valueOf(i)));
                    return false;
                } else if (this.mCurrentCameraState == 1) {
                    return true;
                } else {
                    return false;
                }
            } else if (this.mCurrentCameraState != 0) {
                C30969o.m63688c("TECameraServer", "No need open camera again, state = " + this.mCurrentCameraState);
            }
        }
        return true;
    }

    public final int enableCaf(final TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14090);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14090);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3087814 */

                static {
                    Covode.recordClassIndex(37503);
                }

                public final void run() {
                    EnumC30872k.this.enableCaf(tECameraCapture);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "enableCaf...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55694n();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14090);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14090);
        return 0;
    }

    public final int getExposureCompensation(TECameraCapture tECameraCapture) {
        int i;
        MethodCollector.m26663i(14242);
        if (m63635a(tECameraCapture)) {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        AbstractC30825g gVar = this.mCameraInstance;
                        if (gVar.f73847o.f74141H != null) {
                            i = gVar.f73847o.f74141H.f74216b;
                        } else {
                            i = 0;
                        }
                        MethodCollector.m26664o(14242);
                        return i;
                    }
                    this.mCameraObserver.onError(-105, "Can not get ec on state : " + this.mCurrentCameraState);
                    return -105;
                } finally {
                    MethodCollector.m26664o(14242);
                }
            }
        } else {
            RuntimeException runtimeException = new RuntimeException("Client is not connected!!!");
            MethodCollector.m26664o(14242);
            throw runtimeException;
        }
    }

    public final boolean isAutoExposureLockSupported(TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14300);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14300);
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    boolean p = this.mCameraInstance.mo55696p();
                    MethodCollector.m26664o(14300);
                    return p;
                }
                C30969o.m63688c("TECameraServer", "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } finally {
                MethodCollector.m26664o(14300);
            }
        }
    }

    public final boolean isAutoFocusLockSupported(TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14317);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14317);
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    boolean q = this.mCameraInstance.mo55697q();
                    MethodCollector.m26664o(14317);
                    return q;
                }
                C30969o.m63688c("TECameraServer", "Can not get ae lock supported on state : " + this.mCurrentCameraState);
                return false;
            } finally {
                MethodCollector.m26664o(14317);
            }
        }
    }

    public final void realCloseCamera(PrivacyCert privacyCert) {
        MethodCollector.m26663i(13903);
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 0) {
                    C30969o.m63688c("TECameraServer", "realCloseCamera, no need to close camera, state: " + this.mCurrentCameraState);
                } else {
                    if (this.mCameraInstance != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.mCameraInstance.mo55678b(privacyCert);
                        C30969o.m63686a("TECameraServer", "system call close() cost: ".concat(String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                    }
                    updateCameraState(0);
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance = null;
                }
            } finally {
                MethodCollector.m26664o(13903);
            }
        }
    }

    public final int removeCameraProvider(final TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(13819);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(13819);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3091849 */

                static {
                    Covode.recordClassIndex(37543);
                }

                public final void run() {
                    EnumC30872k.this.removeCameraProvider(tECameraCapture);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "removeCameraProvider");
            synchronized (this.mStateLock) {
                try {
                    C30862c cVar = this.f73960a;
                    if (cVar.f73930b != null) {
                        cVar.f73930b.mo55882e();
                        cVar.f73930b = null;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13819);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(13819);
        return 0;
    }

    public final int startCameraFaceDetect(final TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14015);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14015);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC309195 */

                static {
                    Covode.recordClassIndex(37544);
                }

                public final void run() {
                    EnumC30872k.this.startCameraFaceDetect(tECameraCapture);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "startCameraFaceDetect");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Can not start face detect on state : " + this.mCurrentCameraState);
                        return -105;
                    }
                    this.mCameraInstance.mo55680c();
                } finally {
                    MethodCollector.m26664o(14015);
                }
            }
        }
        MethodCollector.m26664o(14015);
        return 0;
    }

    public final int stopCameraFaceDetect(final TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14035);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14035);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC309236 */

                static {
                    Covode.recordClassIndex(37548);
                }

                public final void run() {
                    EnumC30872k.this.stopCameraFaceDetect(tECameraCapture);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "stopCameraFaceDetect");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Can not stop face detect on state : " + this.mCurrentCameraState);
                        return -105;
                    }
                    this.mCameraInstance.mo55683d();
                } finally {
                    MethodCollector.m26664o(14035);
                }
            }
        }
        MethodCollector.m26664o(14035);
        return 0;
    }

    /* renamed from: b */
    private boolean m63638b(C30933l lVar) {
        if (this.mCameraSettings == null) {
            return true;
        }
        if (lVar.f74202z != 2) {
            return false;
        }
        if (this.mCameraSettings.f74177at != null && this.mCameraSettings.f74177at.f74203a.ordinal() == lVar.f74177at.f74203a.ordinal() && this.mCameraSettings.f74177at.f74204b.ordinal() == lVar.f74177at.f74204b.ordinal() && this.mCameraSettings.f74177at.f74205c.ordinal() == lVar.f74177at.f74205c.ordinal() && this.mCameraSettings.f74177at.f74206d.ordinal() == lVar.f74177at.f74206d.ordinal() && this.mCameraSettings.f74177at.f74207e.ordinal() == lVar.f74177at.f74207e.ordinal() && this.mCameraSettings.f74177at.f74208f.ordinal() == lVar.f74177at.f74208f.ordinal()) {
            return false;
        }
        return true;
    }

    public final void downExposureCompensation(final TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14274);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14274);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3089328 */

                static {
                    Covode.recordClassIndex(37518);
                }

                public final void run() {
                    EnumC30872k.this.downExposureCompensation(tECameraCapture);
                }
            });
            MethodCollector.m26664o(14274);
        } else {
            C30969o.m63686a("TECameraServer", "downExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        C30933l.C30943d dVar = this.mCameraInstance.f73847o.f74141H;
                        if (dVar == null) {
                            this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
                            MethodCollector.m26664o(14274);
                            return;
                        }
                        this.mCameraInstance.mo55681c(dVar.f74216b - 1);
                        MethodCollector.m26664o(14274);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.m26664o(14274);
                }
            }
        }
    }

    public final int stop(final TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(13865);
        C30969o.m63686a("TECameraServer", "stop: client ".concat(String.valueOf(tECameraCapture)));
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(13865);
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C30969o.m63689d("TECameraServer", "stop, mHandler is null!");
            MethodCollector.m26664o(13865);
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3092252 */

                static {
                    Covode.recordClassIndex(37547);
                }

                public final void run() {
                    EnumC30872k.this.stop(tECameraCapture);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 2) {
                        C30969o.m63688c("TECameraServer", "stop, no need to stop capture, state: " + this.mCurrentCameraState);
                        return 0;
                    } else if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 2");
                        MethodCollector.m26664o(13865);
                        return -105;
                    } else {
                        updateCameraState(2);
                        this.mCameraInstance.mo55675b();
                    }
                } finally {
                    MethodCollector.m26664o(13865);
                }
            }
        }
        MethodCollector.m26664o(13865);
        return 0;
    }

    public final void upExposureCompensation(final TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(14265);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14265);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3089227 */

                static {
                    Covode.recordClassIndex(37517);
                }

                public final void run() {
                    EnumC30872k.this.upExposureCompensation(tECameraCapture);
                }
            });
            MethodCollector.m26664o(14265);
        } else {
            C30969o.m63686a("TECameraServer", "upExposureCompensation...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        C30933l.C30943d dVar = this.mCameraInstance.f73847o.f74141H;
                        if (dVar == null) {
                            this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
                            MethodCollector.m26664o(14265);
                            return;
                        }
                        this.mCameraInstance.mo55681c(dVar.f74216b + 1);
                        MethodCollector.m26664o(14265);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.m26664o(14265);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m63636a(C30933l lVar) {
        C30933l lVar2 = this.mCameraSettings;
        if (lVar2 == null) {
            return false;
        }
        if (lVar2.f74179c == lVar.f74179c && this.mCameraSettings.f74192p.f73616a == lVar.f74192p.f73616a && this.mCameraSettings.f74192p.f73617b == lVar.f74192p.f73617b && this.mCameraSettings.f74181e == lVar.f74181e && this.mCameraSettings.f74144K == lVar.f74144K && this.mCameraSettings.f74151R == lVar.f74151R && this.mCameraSettings.f74135B == lVar.f74135B && this.mCameraSettings.f74196t == lVar.f74196t && this.mCameraSettings.f74200x == lVar.f74200x && this.mCameraSettings.f74202z == lVar.f74202z && !m63638b(lVar)) {
            return false;
        }
        return true;
    }

    public final int start(final TECameraCapture tECameraCapture) {
        MethodCollector.m26663i(13821);
        C30969o.m63686a("TECameraServer", "start: client ".concat(String.valueOf(tECameraCapture)));
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(13821);
            return -108;
        }
        C30933l lVar = this.mCameraSettings;
        if (lVar == null || lVar.f74178b == null) {
            C30969o.m63689d("TECameraServer", "mCameraSettings has some error");
            MethodCollector.m26664o(13821);
            return -100;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C30969o.m63689d("TECameraServer", "start, mHandler is null!");
            MethodCollector.m26664o(13821);
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3092050 */

                static {
                    Covode.recordClassIndex(37545);
                }

                public final void run() {
                    EnumC30872k.this.start(tECameraCapture);
                    if (EnumC30872k.this.mCameraSettings.f74188l) {
                        EnumC30872k.this.mCameraClientCondition.open();
                    }
                }
            });
            if (this.mCameraSettings.f74188l) {
                long currentTimeMillis = System.currentTimeMillis();
                this.mCameraClientCondition.close();
                this.mCameraClientCondition.block(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                C30969o.m63686a("TECameraServer", "Camera start cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            }
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3) {
                        C30969o.m63688c("TECameraServer", "start, no need to start capture, state: " + this.mCurrentCameraState);
                        if (!this.f73966g && !this.mStartPreviewError) {
                            return 0;
                        }
                        this.mCameraInstance.mo55675b();
                        updateCameraState(2);
                        this.f73966g = false;
                    }
                    if (this.mCurrentCameraState != 2) {
                        this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                        MethodCollector.m26664o(13821);
                        return -105;
                    }
                    this.mCameraObserver.onInfo(3, this.mCurrentCameraState, "Camera state: opened");
                    this.mCameraInstance.mo55661a();
                    updateCameraState(3);
                    C30853j.m63557a("te_record_camera_type", (long) this.mCameraInstance.mo55685e());
                    C30853j.m63558a("te_preview_camera_resolution", this.mCameraSettings.f74192p.f73616a + "*" + this.mCameraSettings.f74192p.f73617b);
                    C30853j.m63556a("te_record_camera_frame_rate", (double) this.mCameraSettings.f74180d.f73614b);
                    C30853j.m63557a("te_record_camera_direction", (long) this.mCameraSettings.f74181e);
                } finally {
                    MethodCollector.m26664o(13821);
                }
            }
        }
        MethodCollector.m26664o(13821);
        return 0;
    }

    public final int disConnect(TECameraCapture tECameraCapture, PrivacyCert privacyCert) {
        return disConnect(tECameraCapture, true, privacyCert);
    }

    public final void notifyHostForegroundVisible(TECameraCapture tECameraCapture, boolean z) {
        if (m63635a(tECameraCapture)) {
            this.f73975p = z;
            C30969o.m63686a("TECameraServer", "is foreground visible: ".concat(String.valueOf(z)));
        }
    }

    public final int getISO(final TECameraCapture tECameraCapture, final C30933l.AbstractC30946g gVar) {
        MethodCollector.m26663i(14336);
        int i = -1;
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14336);
            return -1;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3090135 */

                static {
                    Covode.recordClassIndex(37526);
                }

                public final void run() {
                    EnumC30872k.this.getISO(tECameraCapture, gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        i = this.mCameraInstance.mo55786B();
                    }
                } finally {
                    MethodCollector.m26664o(14336);
                }
            }
        }
        return i;
    }

    public final float getManualFocusAbility(final TECameraCapture tECameraCapture, final C30933l.AbstractC30948i iVar) {
        MethodCollector.m26663i(14122);
        float f = -1.0f;
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14122);
            return -1.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3087915 */

                static {
                    Covode.recordClassIndex(37504);
                }

                public final void run() {
                    EnumC30872k.this.getManualFocusAbility(tECameraCapture, iVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        f = this.mCameraInstance.mo55803z();
                    }
                } finally {
                    MethodCollector.m26664o(14122);
                }
            }
        }
        return f;
    }

    public final void setAperture(final TECameraCapture tECameraCapture, final float f) {
        MethodCollector.m26663i(14345);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14345);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3090539 */

                static {
                    Covode.recordClassIndex(37530);
                }

                public final void run() {
                    EnumC30872k.this.setAperture(tECameraCapture, f);
                }
            });
            MethodCollector.m26664o(14345);
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55794b(f);
                    }
                } finally {
                    MethodCollector.m26664o(14345);
                }
            }
        }
    }

    public final void setISO(final TECameraCapture tECameraCapture, final int i) {
        MethodCollector.m26663i(14332);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14332);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3089933 */

                static {
                    Covode.recordClassIndex(37524);
                }

                public final void run() {
                    EnumC30872k.this.setISO(tECameraCapture, i);
                }
            });
            MethodCollector.m26664o(14332);
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55797e(i);
                    }
                } finally {
                    MethodCollector.m26664o(14332);
                }
            }
        }
    }

    public final void setManualFocusDistance(final TECameraCapture tECameraCapture, final float f) {
        MethodCollector.m26663i(14148);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14148);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3088016 */

                static {
                    Covode.recordClassIndex(37505);
                }

                public final void run() {
                    EnumC30872k.this.setManualFocusDistance(tECameraCapture, f);
                }
            });
            MethodCollector.m26664o(14148);
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55791a(f);
                    }
                } finally {
                    MethodCollector.m26664o(14148);
                }
            }
        }
    }

    public final void setSceneMode(TECameraCapture tECameraCapture, final int i) {
        if (m63635a(tECameraCapture)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3088218 */

                    static {
                        Covode.recordClassIndex(37507);
                    }

                    public final void run() {
                        if (EnumC30872k.this.mCameraInstance != null) {
                            EnumC30872k.this.mCameraInstance.mo55663a(i);
                        }
                    }
                });
                return;
            }
            return;
        }
        C30969o.m63688c("TECameraServer", "set scnen failed: ".concat(String.valueOf(i)));
    }

    public final void setShutterTime(final TECameraCapture tECameraCapture, final long j) {
        MethodCollector.m26663i(14341);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14341);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3090337 */

                static {
                    Covode.recordClassIndex(37528);
                }

                public final void run() {
                    EnumC30872k.this.setShutterTime(tECameraCapture, j);
                }
            });
            MethodCollector.m26664o(14341);
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55792a(j);
                    }
                } finally {
                    MethodCollector.m26664o(14341);
                }
            }
        }
    }

    public final int takePicture(TECameraCapture tECameraCapture, final C30933l.AbstractC30951l lVar) {
        if (!m63635a(tECameraCapture)) {
            return -108;
        }
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3087410 */

            static {
                Covode.recordClassIndex(37499);
            }

            public final void run() {
                MethodCollector.m26663i(9555);
                C30969o.m63686a("TECameraServer", "takePicture");
                synchronized (EnumC30872k.this.mStateLock) {
                    try {
                        if (EnumC30872k.this.mCurrentCameraState != 3) {
                            String str = "Can not takePicture on state : " + EnumC30872k.this.mCurrentCameraState;
                            EnumC30872k.this.mCameraObserver.onError(-105, str);
                            C30969o.m63689d("TECameraServer", str);
                            if (lVar != null) {
                                new Exception(str);
                            }
                            return;
                        }
                        if (EnumC30872k.this.mCameraSettings.f74179c == 1) {
                            EnumC30872k.this.updateCameraState(2);
                        }
                        EnumC30872k.this.mCameraInstance.mo55668a(lVar);
                        MethodCollector.m26664o(9555);
                    } finally {
                        MethodCollector.m26664o(9555);
                    }
                }
            }
        });
        return 0;
    }

    public final int enableMulticamZoom(final TECameraCapture tECameraCapture, final boolean z) {
        MethodCollector.m26663i(14365);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14365);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3091748 */

                static {
                    Covode.recordClassIndex(37542);
                }

                public final void run() {
                    EnumC30872k.this.enableMulticamZoom(tECameraCapture, z);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "enableMulticamZoom: ".concat(String.valueOf(z)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55796d(z);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14365);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14365);
        return 0;
    }

    public final int focusAtPoint(final TECameraCapture tECameraCapture, final C30966n nVar) {
        MethodCollector.m26663i(14061);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14061);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3087511 */

                static {
                    Covode.recordClassIndex(37500);
                }

                public final void run() {
                    int focusAtPoint = EnumC30872k.this.focusAtPoint(tECameraCapture, nVar);
                    if (focusAtPoint != 0 && nVar.f74246m != null) {
                        nVar.f74246m.mo56059a(focusAtPoint, EnumC30872k.this.mCameraSettings.f74181e, "");
                    }
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "focusAtPoint at: ".concat(String.valueOf(nVar)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo55672a(nVar);
                    } else {
                        this.mCameraObserver.onError(-105, "Can not set focus on state : " + this.mCurrentCameraState);
                        return -105;
                    }
                } finally {
                    MethodCollector.m26664o(14061);
                }
            }
        }
        MethodCollector.m26664o(14061);
        return 0;
    }

    public final float[] getApertureRange(final TECameraCapture tECameraCapture, final C30933l.AbstractC30941b bVar) {
        MethodCollector.m26663i(14342);
        float[] fArr = {0.0f};
        if (!m63635a(tECameraCapture)) {
            float[] fArr2 = {-1.0f, -1.0f};
            MethodCollector.m26664o(14342);
            return fArr2;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3090438 */

                static {
                    Covode.recordClassIndex(37529);
                }

                public final void run() {
                    EnumC30872k.this.getApertureRange(tECameraCapture, bVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        fArr = this.mCameraInstance.mo55788D();
                    }
                } finally {
                    MethodCollector.m26664o(14342);
                }
            }
        }
        return fArr;
    }

    public final float[] getFOV(final TECameraCapture tECameraCapture, final C30933l.AbstractC30944e eVar) {
        MethodCollector.m26663i(14059);
        float[] fArr = new float[2];
        if (!m63635a(tECameraCapture)) {
            float[] fArr2 = {-2.0f, -2.0f};
            MethodCollector.m26664o(14059);
            return fArr2;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC309247 */

                static {
                    Covode.recordClassIndex(37549);
                }

                public final void run() {
                    float[] fov = EnumC30872k.this.getFOV(tECameraCapture, eVar);
                    C30933l.AbstractC30944e eVar = eVar;
                    if (eVar != null) {
                        eVar.mo56041a(fov);
                    }
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "getFOV");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        this.mCameraObserver.onError(-105, "Can not getFOV on state : " + this.mCurrentCameraState);
                        return new float[]{-2.0f, -2.0f};
                    }
                    fArr = this.mCameraInstance.mo55692l();
                } finally {
                    MethodCollector.m26664o(14059);
                }
            }
        }
        MethodCollector.m26664o(14059);
        return fArr;
    }

    public final int[] getISORange(final TECameraCapture tECameraCapture, final C30933l.AbstractC30947h hVar) {
        MethodCollector.m26663i(14326);
        int[] iArr = new int[2];
        if (!m63635a(tECameraCapture)) {
            int[] iArr2 = {-1, -1};
            MethodCollector.m26664o(14326);
            return iArr2;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3089832 */

                static {
                    Covode.recordClassIndex(37523);
                }

                public final void run() {
                    int[] iSORange = EnumC30872k.this.getISORange(tECameraCapture, hVar);
                    if (iSORange != null) {
                        hVar.mo56042a(iSORange);
                    }
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        iArr = this.mCameraInstance.mo55785A();
                    }
                } finally {
                    MethodCollector.m26664o(14326);
                }
            }
        }
        return iArr;
    }

    public final long[] getShutterTimeRange(final TECameraCapture tECameraCapture, final C30933l.AbstractC30954o oVar) {
        MethodCollector.m26663i(14340);
        long[] jArr = new long[2];
        if (!m63635a(tECameraCapture)) {
            long[] jArr2 = {-1, -1};
            MethodCollector.m26664o(14340);
            return jArr2;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3090236 */

                static {
                    Covode.recordClassIndex(37527);
                }

                public final void run() {
                    EnumC30872k.this.getShutterTimeRange(tECameraCapture, oVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        jArr = this.mCameraInstance.mo55787C();
                    }
                } finally {
                    MethodCollector.m26664o(14340);
                }
            }
        }
        return jArr;
    }

    public final int process(final TECameraCapture tECameraCapture, final C30933l.C30949j jVar) {
        MethodCollector.m26663i(14227);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14227);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3089025 */

                static {
                    Covode.recordClassIndex(37515);
                }

                public final void run() {
                    EnumC30872k.this.process(tECameraCapture, jVar);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        AbstractC30825g gVar = this.mCameraInstance;
                        if (jVar != null && jVar.f74220a == 2) {
                            gVar.f73841A.set(true);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14227);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14227);
        return 0;
    }

    public final float queryShaderZoomStep(final TECameraCapture tECameraCapture, final C30933l.AbstractC30953n nVar) {
        MethodCollector.m26663i(14195);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14195);
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3088520 */

                static {
                    Covode.recordClassIndex(37510);
                }

                public final void run() {
                    EnumC30872k.this.queryShaderZoomStep(tECameraCapture, nVar);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "queryShaderZoomStep...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55669a(nVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14195);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14195);
        return 0.0f;
    }

    public final void setAutoExposureLock(final TECameraCapture tECameraCapture, final boolean z) {
        MethodCollector.m26663i(14293);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14293);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3089429 */

                static {
                    Covode.recordClassIndex(37519);
                }

                public final void run() {
                    EnumC30872k.this.setAutoExposureLock(tECameraCapture, z);
                }
            });
            MethodCollector.m26664o(14293);
        } else {
            C30969o.m63686a("TECameraServer", "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo55674a(z);
                        MethodCollector.m26664o(14293);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.m26664o(14293);
                }
            }
        }
    }

    public final void setAutoFocusLock(final TECameraCapture tECameraCapture, final boolean z) {
        MethodCollector.m26663i(14308);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14308);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3089630 */

                static {
                    Covode.recordClassIndex(37521);
                }

                public final void run() {
                    EnumC30872k.this.setAutoFocusLock(tECameraCapture, z);
                }
            });
            MethodCollector.m26664o(14308);
        } else {
            C30969o.m63687b("TECameraServer", "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo55679b(z);
                        MethodCollector.m26664o(14308);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.m26664o(14308);
                }
            }
        }
    }

    public final int setFeatureParameters(final TECameraCapture tECameraCapture, final Bundle bundle) {
        MethodCollector.m26663i(14221);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14221);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3088924 */

                static {
                    Covode.recordClassIndex(37514);
                }

                public final void run() {
                    EnumC30872k.this.setFeatureParameters(tECameraCapture, bundle);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55666a(bundle);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14221);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14221);
        return 0;
    }

    public final int stopZoom(final TECameraCapture tECameraCapture, final C30933l.AbstractC30955p pVar) {
        MethodCollector.m26663i(14209);
        if (!m63635a(tECameraCapture)) {
            C30969o.m63689d("TECameraServer", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -108. Reason: invalid CameraClient");
            MethodCollector.m26664o(14209);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3088621 */

                static {
                    Covode.recordClassIndex(37511);
                }

                public final void run() {
                    EnumC30872k.this.stopZoom(tECameraCapture, pVar);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "stopZoom...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55670a(pVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14209);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14209);
        return 0;
    }

    public final int switchFlashMode(final TECameraCapture tECameraCapture, final int i) {
        MethodCollector.m26663i(14351);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14351);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3090841 */

                static {
                    Covode.recordClassIndex(37533);
                }

                public final void run() {
                    EnumC30872k.this.switchFlashMode(tECameraCapture, i);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "switchFlashMode: ".concat(String.valueOf(i)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55684d(i);
                        this.mCameraEvent.mo55846a(116, i, "");
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14351);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14351);
        return 0;
    }

    public final int toggleTorch(final TECameraCapture tECameraCapture, final boolean z) {
        MethodCollector.m26663i(14348);
        if (!m63635a(tECameraCapture)) {
            C30969o.m63689d("TECameraServer", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -108. Reason: invalid CameraClient");
            MethodCollector.m26664o(14348);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3090740 */

                static {
                    Covode.recordClassIndex(37532);
                }

                public final void run() {
                    EnumC30872k.this.toggleTorch(tECameraCapture, z);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "toggleTorch: ".concat(String.valueOf(z)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55682c(z);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14348);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14348);
        return 0;
    }

    public final int close(final boolean z, final PrivacyCert privacyCert) {
        Handler handler = this.mHandler;
        if (handler == null) {
            this.f73976q = -1;
            C30969o.m63689d("TECameraServer", "call camera close process, handler is null");
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo55667a(this.cachedClosePrivacyCert);
            }
            updateCameraState(0);
            C30969o.m63688c("TECameraServer", "call camera close process, handler is null, force close done");
            return -112;
        }
        C30969o.m63686a("TECameraServer", "call camera close process...sync: " + z + ", handler: " + handler);
        if (this.f73962c || Looper.myLooper() == handler.getLooper()) {
            this.f73976q = -1;
            if (this.f73973n) {
                new C30929b.C30930a(C30929b.EnumC30931b.BOOST_CPU, this.f73974o);
                realCloseCamera(privacyCert);
                new C30929b.C30930a(C30929b.EnumC30931b.RESTORE_CPU);
            } else {
                realCloseCamera(privacyCert);
            }
            this.mMainHandler.removeCallbacks(this.f73969j);
            if (!z && decreaseClientCount() == 0) {
                return destroy();
            }
        } else {
            int hashCode = handler.hashCode();
            int i = this.f73976q;
            if (i == -1 || i == hashCode) {
                this.f73976q = hashCode;
                final long currentTimeMillis = System.currentTimeMillis();
                if (z) {
                    this.mCameraClientCondition.close();
                }
                this.mIsCameraPendingClose = true;
                handler.post(new Runnable() {
                    /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC308842 */

                    static {
                        Covode.recordClassIndex(37509);
                    }

                    public final void run() {
                        long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                        C30969o.m63686a("TECameraServer", "Push close task cost: ".concat(String.valueOf(currentTimeMillis)));
                        EnumC30872k.this.close(z, privacyCert);
                        EnumC30872k.this.mIsCameraPendingClose = false;
                        if (z) {
                            EnumC30872k.this.mCameraClientCondition.open();
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        C30853j.m63557a("te_record_camera_push_close_task_time", currentTimeMillis);
                        C30853j.m63557a("te_record_camera_close_cost", currentTimeMillis2);
                        Long.valueOf(currentTimeMillis2);
                    }
                });
                if (z) {
                    boolean z2 = !this.mCameraClientCondition.block(1500);
                    this.mIsCameraPendingClose = false;
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    if (z2) {
                        C30969o.m63689d("TECameraServer", "Camera close timeout, mCurrentCameraState " + this.mCurrentCameraState);
                        if (this.mCameraInstance != null) {
                            this.mCameraInstance.mo55667a(this.cachedClosePrivacyCert);
                        }
                        updateCameraState(0);
                    } else {
                        C30969o.m63686a("TECameraServer", "Camera close cost: " + currentTimeMillis2 + "ms");
                    }
                }
            } else {
                this.f73976q = -1;
                C30969o.m63689d("TECameraServer", "camera close task discard...handler id has changed");
                return 0;
            }
        }
        return 0;
    }

    public final void queryFeatures(String str, Bundle bundle) {
        Class cls;
        if (this.mCameraInstance != null) {
            Bundle bundle2 = this.mCameraInstance.f73842B.get(str);
            if (bundle2 == null) {
                C30969o.m63689d("TECameraServer", "queryFeatures: getFeatures is null");
                return;
            }
            for (String str2 : bundle.keySet()) {
                if (bundle2.containsKey(str2)) {
                    if (C30933l.C30945f.f74219a.containsKey(str2)) {
                        cls = C30933l.C30945f.f74219a.get(str2);
                    } else {
                        cls = null;
                    }
                    if (cls == Boolean.class) {
                        bundle.putBoolean(str2, bundle2.getBoolean(str2));
                    } else if (cls == Integer.class) {
                        bundle.putInt(str2, bundle2.getInt(str2));
                    } else if (cls == Long.class) {
                        bundle.putLong(str2, bundle2.getLong(str2));
                    } else if (cls == Float.class) {
                        bundle.putFloat(str2, bundle2.getFloat(str2));
                    } else if (cls == Double.class) {
                        bundle.putDouble(str2, bundle2.getDouble(str2));
                    } else if (cls == String.class) {
                        bundle.putString(str2, bundle2.getString(str2));
                    } else if (cls == ArrayList.class) {
                        bundle.putParcelableArrayList(str2, bundle2.getParcelableArrayList(str2));
                    } else if (cls == TEFrameSizei.class) {
                        bundle.putParcelable(str2, bundle2.getParcelable(str2));
                    } else if (cls == TEFocusParameters.class) {
                        bundle.putParcelable(str2, bundle2.getParcelable(str2));
                    } else {
                        C30969o.m63688c("TECameraServer", "Not supported key:".concat(String.valueOf(str2)));
                    }
                }
            }
            return;
        }
        C30969o.m63689d("TECameraServer", "queryFeatures: camera instance null");
    }

    public final void setExposureCompensation(final TECameraCapture tECameraCapture, final int i) {
        MethodCollector.m26663i(14250);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14250);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3089126 */

                static {
                    Covode.recordClassIndex(37516);
                }

                public final void run() {
                    EnumC30872k.this.setExposureCompensation(tECameraCapture, i);
                }
            });
            MethodCollector.m26664o(14250);
        } else {
            C30969o.m63686a("TECameraServer", "setExposureCompensation: ".concat(String.valueOf(i)));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                        this.mCameraInstance.mo55681c(i);
                        if (this.f73971l) {
                            this.mCameraEvent.mo55846a(115, 0, "exposure compensation");
                            this.f73971l = false;
                        }
                        MethodCollector.m26664o(14250);
                        return;
                    }
                    this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                } finally {
                    MethodCollector.m26664o(14250);
                }
            }
        }
    }

    public final int switchCameraMode(final TECameraCapture tECameraCapture, final int i) {
        MethodCollector.m26663i(13721);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(13721);
            return -108;
        } else if (tECameraCapture.mCameraSettings.f74179c == 1 || !(i == 1 || i == 0 || i == 2)) {
            MethodCollector.m26664o(13721);
            return -100;
        } else if (tECameraCapture.mCameraSettings.f74202z == i) {
            MethodCollector.m26664o(13721);
            return 0;
        } else {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3090034 */

                    static {
                        Covode.recordClassIndex(37525);
                    }

                    public final void run() {
                        EnumC30872k.this.switchCameraMode(tECameraCapture, i);
                    }
                });
            } else {
                C30969o.m63686a("TECameraServer", "switchCameraMode");
                synchronized (this.mStateLock) {
                    try {
                        if (this.mCurrentCameraState != 3) {
                            this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                            return -105;
                        }
                        this.mCameraInstance.mo55677b(i);
                    } finally {
                        MethodCollector.m26664o(13721);
                    }
                }
            }
            MethodCollector.m26664o(13721);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addCameraProvider(final com.p2082ss.android.ttvecamera.TECameraCapture r11, final com.p2082ss.android.ttvecamera.p2201j.C30862c.C30863a r12) {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.EnumC30872k.addCameraProvider(com.ss.android.ttvecamera.TECameraCapture, com.ss.android.ttvecamera.j.c$a):int");
    }

    public final int captureBurst(TECameraCapture tECameraCapture, final C30933l.AbstractC30942c cVar, final C30852a aVar) {
        if (!m63635a(tECameraCapture)) {
            return -108;
        }
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC309258 */

            static {
                Covode.recordClassIndex(37550);
            }

            public final void run() {
                MethodCollector.m26663i(12452);
                synchronized (EnumC30872k.this.mStateLock) {
                    try {
                        if (EnumC30872k.this.mCurrentCameraState != 3) {
                            String str = "Can not takePicture on state : " + EnumC30872k.this.mCurrentCameraState;
                            EnumC30872k.this.mCameraObserver.onError(-105, str);
                            C30969o.m63689d("TECameraServer", str);
                            if (cVar != null) {
                                new Exception(str);
                            }
                            return;
                        }
                        if (EnumC30872k.this.mCameraSettings.f74179c == 1) {
                            EnumC30872k.this.updateCameraState(2);
                        }
                        EnumC30872k.this.mCameraInstance.mo55793a(aVar, cVar);
                        MethodCollector.m26664o(12452);
                    } finally {
                        MethodCollector.m26664o(12452);
                    }
                }
            }
        });
        return 0;
    }

    public final TEFrameSizei getBestPreviewSize(TECameraCapture tECameraCapture, float f, TEFrameSizei tEFrameSizei) {
        if (!m63635a(tECameraCapture) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1) {
            return null;
        }
        return this.mCameraInstance.mo55660a(f, tEFrameSizei);
    }

    public final void setPictureSize(TECameraCapture tECameraCapture, final int i, final int i2) {
        if (m63635a(tECameraCapture)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3088117 */

                    static {
                        Covode.recordClassIndex(37506);
                    }

                    public final void run() {
                        if (EnumC30872k.this.mCurrentCameraState != 3) {
                            C30969o.m63689d("TECameraServer", "set picture size failed, w: " + i + ", h: " + i2 + ", state: " + EnumC30872k.this.mCurrentCameraState);
                        } else {
                            EnumC30872k.this.mCameraInstance.mo55664a(i, i2);
                        }
                    }
                });
                return;
            }
            return;
        }
        C30969o.m63688c("TECameraServer", "set picture size failed, w: " + i + ", h: " + i2);
    }

    public final int changeRecorderState(final TECameraCapture tECameraCapture, final int i, final AbstractC30825g.AbstractC30827b bVar) {
        MethodCollector.m26663i(14364);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14364);
            return -108;
        }
        if (this.f73962c || Looper.myLooper() == this.mHandler.getLooper()) {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance == null) {
                        this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                        return -100;
                    }
                } finally {
                    MethodCollector.m26664o(14364);
                }
            }
        } else {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3091647 */

                static {
                    Covode.recordClassIndex(37541);
                }

                public final void run() {
                    EnumC30872k.this.changeRecorderState(tECameraCapture, i, bVar);
                }
            });
        }
        MethodCollector.m26664o(14364);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (decreaseClientCount() != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = destroy();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13489);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r5.mMainHandler.removeCallbacks(r5.f73969j);
        r5.mMainHandler.postDelayed(r5.f73969j, com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting.DEFAULT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13489);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r5.cachedClosePrivacyCert = r8;
        close(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r7 == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int disConnect(com.p2082ss.android.ttvecamera.TECameraCapture r6, boolean r7, com.bytedance.bpea.basics.PrivacyCert r8) {
        /*
            r5 = this;
            r4 = 13489(0x34b1, float:1.8902E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            java.lang.String r2 = "TECameraServer"
            java.lang.String r1 = "disConnect with client: "
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r1.concat(r0)
            com.p2082ss.android.ttvecamera.C30969o.m63686a(r2, r0)
            java.lang.Object r2 = r5.f73964e
            monitor-enter(r2)
            com.ss.android.ttvecamera.TECameraCapture r0 = r5.mCameraClient     // Catch:{ all -> 0x0057 }
            if (r0 != r6) goto L_0x0050
            if (r0 == 0) goto L_0x0050
            r1 = 0
            r5.mCameraClient = r1     // Catch:{ all -> 0x0057 }
            android.os.Handler r0 = r5.mHandler     // Catch:{ all -> 0x0057 }
            r0.removeCallbacksAndMessages(r1)     // Catch:{ all -> 0x0057 }
            monitor-exit(r2)     // Catch:{ all -> 0x0057 }
            r5.cachedClosePrivacyCert = r8
            r5.close(r7, r8)
            if (r7 == 0) goto L_0x003b
            int r0 = r5.decreaseClientCount()
            if (r0 != 0) goto L_0x004b
            int r0 = r5.destroy()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        L_0x003b:
            android.os.Handler r1 = r5.mMainHandler
            java.lang.Runnable r0 = r5.f73969j
            r1.removeCallbacks(r0)
            android.os.Handler r3 = r5.mMainHandler
            java.lang.Runnable r2 = r5.f73969j
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
        L_0x004b:
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        L_0x0050:
            r0 = -100
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        L_0x0057:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.EnumC30872k.disConnect(com.ss.android.ttvecamera.TECameraCapture, boolean, com.bytedance.bpea.basics.PrivacyCert):int");
    }

    public final int queryZoomAbility(final TECameraCapture tECameraCapture, final C30933l.AbstractC30955p pVar, final boolean z) {
        MethodCollector.m26663i(14194);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14194);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3088319 */

                static {
                    Covode.recordClassIndex(37508);
                }

                public final void run() {
                    EnumC30872k.this.queryZoomAbility(tECameraCapture, pVar, z);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "queryZoomAbility...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55671a(pVar, z);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14194);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(14194);
        return 0;
    }

    public final void setWhileBalance(final TECameraCapture tECameraCapture, final boolean z, final String str) {
        MethodCollector.m26663i(14325);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(14325);
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3089731 */

                static {
                    Covode.recordClassIndex(37522);
                }

                public final void run() {
                    EnumC30872k.this.setWhileBalance(tECameraCapture, z, str);
                }
            });
            MethodCollector.m26664o(14325);
        } else {
            synchronized (this.mStateLock) {
                try {
                    C30969o.m63686a("TECameraServer", "setWhileBalance...");
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55673a(str);
                    }
                } finally {
                    MethodCollector.m26664o(14325);
                }
            }
        }
    }

    public final int startZoom(TECameraCapture tECameraCapture, float f, C30933l.AbstractC30955p pVar) {
        Message obtainMessage;
        if (!m63635a(tECameraCapture)) {
            C30969o.m63689d("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        Looper.myLooper();
        this.mHandler.getLooper();
        AbstractC30825g gVar = this.mCameraInstance;
        if (gVar == null) {
            C30969o.m63689d("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -105. Reason: mCameraInstance is null");
            C30969o.m63688c("TECameraServer", "camera is null, no need to start zoom");
            return -105;
        }
        float abs = Math.abs(f - this.f73963d);
        if (Math.abs(f - gVar.f73856x) < 0.1f) {
            f = gVar.f73856x;
        } else if (Math.abs(f) < 0.1f) {
            f = 0.0f;
        } else if (abs < 0.1f) {
            return 0;
        }
        this.f73963d = f;
        Handler handler = this.mHandler;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            obtainMessage = new Message();
        } else {
            obtainMessage = handler.obtainMessage();
        }
        obtainMessage.what = 1;
        obtainMessage.arg1 = (int) (f * 100.0f);
        obtainMessage.obj = pVar;
        this.mHandler.sendMessage(obtainMessage);
        return 0;
    }

    public final int zoomV2(final TECameraCapture tECameraCapture, final float f, final C30933l.AbstractC30955p pVar) {
        MethodCollector.m26663i(14219);
        if (!m63635a(tECameraCapture)) {
            C30969o.m63689d("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            MethodCollector.m26664o(14219);
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3088722 */

                static {
                    Covode.recordClassIndex(37512);
                }

                public final void run() {
                    EnumC30872k.this.zoomV2(tECameraCapture, f, pVar);
                }
            });
        } else {
            C30969o.m63686a("TECameraServer", "zoomV2...");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55676b(f, pVar);
                    }
                    if (this.mFirstZoom) {
                        this.mCameraEvent.mo55846a(114, 0, "zoomV2");
                        this.mFirstZoom = false;
                    }
                } finally {
                    MethodCollector.m26664o(14219);
                }
            }
        }
        return 0;
    }

    public final int open(final TECameraCapture tECameraCapture, final C30933l lVar, final PrivacyCert privacyCert) {
        int i;
        MethodCollector.m26663i(13650);
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(13650);
            return -108;
        } else if (this.mIsCameraPendingClose) {
            C30969o.m63689d("TECameraServer", "pending close");
            MethodCollector.m26664o(13650);
            return -105;
        } else if (!lVar.f74165af || !this.f73970k) {
            Handler handler = this.mHandler;
            if (handler == null) {
                C30969o.m63689d("TECameraServer", "open, mHandler is null!");
                MethodCollector.m26664o(13650);
                return -112;
            } else if (this.mIsCameraPendingClose) {
                C30969o.m63689d("TECameraServer", "had called disConnect(), abandon open camera!");
                MethodCollector.m26664o(13650);
                return -113;
            } else {
                if (this.f73962c || Looper.myLooper() == handler.getLooper()) {
                    this.mCameraSettings = lVar;
                    C30969o.m63686a("TECameraServer", "is force close camera=" + this.mCameraSettings.f74148O + ", Camera2Detect=" + this.mCameraSettings.f74174ao);
                    this.f73969j = new Runnable() {
                        /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3088823 */

                        static {
                            Covode.recordClassIndex(37513);
                        }

                        public final void run() {
                            if (EnumC30872k.this.mCurrentCameraState > 1) {
                                C30969o.m63686a("TECameraServer", "close camera in main thread");
                                if (!EnumC30872k.this.mCameraSettings.f74148O || EnumC30872k.this.mCameraInstance == null) {
                                    EnumC30872k kVar = EnumC30872k.this;
                                    kVar.realCloseCamera(kVar.cachedClosePrivacyCert);
                                } else {
                                    EnumC30872k.this.mCameraInstance.mo55667a(EnumC30872k.this.cachedClosePrivacyCert);
                                }
                                if (EnumC30872k.this.decreaseClientCount() == 0) {
                                    EnumC30872k.this.destroy();
                                    return;
                                }
                                return;
                            }
                            EnumC30872k.this.mMainHandler.postDelayed(this, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                        }
                    };
                    this.f73963d = 0.0f;
                    if (this.mRetryCnt < 0) {
                        this.mRetryCnt = lVar.f74197u;
                    }
                    synchronized (this.mStateLock) {
                        try {
                            if (this.mCurrentCameraState != 0) {
                                C30969o.m63688c("TECameraServer", "No need open camera again, state = " + this.mCurrentCameraState);
                                if (this.mCurrentCameraState != 1) {
                                    this.mCameraObserver.onInfo(1, 0, "Camera features is ready");
                                }
                                return 0;
                            }
                            updateCameraState(1);
                            if (this.mCameraInstance == null) {
                                this.mCameraInstance = m63637b();
                                if (this.mCameraInstance == null) {
                                    if (this.mCameraSettings.f74179c == 11) {
                                        updateCameraState(0);
                                        this.mCameraEvent.mo55845a(this.mCameraSettings.f74179c, -428);
                                    } else {
                                        updateCameraState(0);
                                        this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                                    }
                                    MethodCollector.m26664o(13650);
                                    return -1;
                                }
                            }
                            this.mBeginTime = System.currentTimeMillis();
                            if (this.f73973n) {
                                new C30929b.C30930a(C30929b.EnumC30931b.BOOST_CPU, this.f73974o);
                                i = this.mCameraInstance.mo55659a(this.mCameraSettings, privacyCert);
                                new C30929b.C30930a(C30929b.EnumC30931b.RESTORE_CPU);
                            } else {
                                i = this.mCameraInstance.mo55659a(this.mCameraSettings, privacyCert);
                            }
                            if (i != 0) {
                                C30969o.m63688c("TECameraServer", "Open camera failed, ret = ".concat(String.valueOf(i)));
                            }
                        } finally {
                            MethodCollector.m26664o(13650);
                        }
                    }
                } else {
                    final long currentTimeMillis = System.currentTimeMillis();
                    handler.post(new Runnable() {
                        /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC3087612 */

                        static {
                            Covode.recordClassIndex(37501);
                        }

                        public final void run() {
                            C30969o.m63687b("TECameraServer", "Push open task cost: " + (System.currentTimeMillis() - currentTimeMillis));
                            C30853j.m63557a("te_record_camera_push_open_task_time", System.currentTimeMillis() - currentTimeMillis);
                            EnumC30872k.this.open(tECameraCapture, lVar, privacyCert);
                            C30969o.m63686a("TECameraServer", "Camera open cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                        }
                    });
                }
                MethodCollector.m26664o(13650);
                return 0;
            }
        } else {
            C30969o.m63689d("TECameraServer", "in background");
            MethodCollector.m26664o(13650);
            return -105;
        }
    }

    public final int switchCamera(final TECameraCapture tECameraCapture, final int i, final PrivacyCert privacyCert) {
        MethodCollector.m26663i(13936);
        C30969o.m63686a("TECameraServer", "switchCamera: ".concat(String.valueOf(i)));
        if (!m63635a(tECameraCapture)) {
            MethodCollector.m26664o(13936);
            return -108;
        }
        C30933l lVar = this.mCameraSettings;
        if (lVar == null) {
            C30969o.m63689d("TECameraServer", "switchCamera failed: ".concat(String.valueOf(i)));
            MethodCollector.m26664o(13936);
            return -108;
        } else if (lVar.f74181e == i) {
            MethodCollector.m26664o(13936);
            return -423;
        } else {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC308953 */

                    static {
                        Covode.recordClassIndex(37520);
                    }

                    public final void run() {
                        EnumC30872k.this.switchCamera(tECameraCapture, i, privacyCert);
                    }
                });
            } else {
                synchronized (this.mStateLock) {
                    try {
                        if (this.mCurrentCameraState == 1) {
                            this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request.");
                            return -105;
                        }
                        this.mCameraSettings.f74181e = i;
                        this.f73963d = 0.0f;
                        if (this.mCameraInstance == null) {
                            this.mCameraInstance = m63637b();
                            if (this.mCameraInstance == null) {
                                this.mCurrentCameraState = 0;
                                if (this.mCameraSettings.f74179c == 11) {
                                    this.mCameraEvent.mo55845a(this.mCameraSettings.f74179c, -428);
                                } else {
                                    this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                                }
                                MethodCollector.m26664o(13936);
                                return -1;
                            }
                        }
                        if (this.mCurrentCameraState != 0) {
                            this.mCameraInstance.mo55678b(privacyCert);
                            updateCameraState(0);
                        }
                        updateCameraState(1);
                        if (this.mRetryCnt < 0) {
                            this.mRetryCnt = this.mCameraSettings.f74197u;
                        }
                        this.mBeginTime = System.currentTimeMillis();
                        int a = this.mCameraInstance.mo55659a(this.mCameraSettings, privacyCert);
                        if (a != 0) {
                            this.mCameraObserver.onError(a, "Switch camera failed @" + this.mCameraSettings.f74179c + ",face:" + this.mCameraSettings.f74181e + " " + this.mCameraSettings.f74192p.toString());
                        }
                    } finally {
                        MethodCollector.m26664o(13936);
                    }
                }
            }
            MethodCollector.m26664o(13936);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
        close(r10);
        open(r8, r9, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int switchCamera(final com.p2082ss.android.ttvecamera.TECameraCapture r8, final com.p2082ss.android.ttvecamera.C30933l r9, final com.bytedance.bpea.basics.PrivacyCert r10) {
        /*
        // Method dump skipped, instructions count: 463
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.EnumC30872k.switchCamera(com.ss.android.ttvecamera.TECameraCapture, com.ss.android.ttvecamera.l, com.bytedance.bpea.basics.PrivacyCert):int");
    }

    public final int takePicture(TECameraCapture tECameraCapture, final int i, final int i2, final C30933l.AbstractC30951l lVar) {
        if (!m63635a(tECameraCapture)) {
            return -108;
        }
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.android.ttvecamera.EnumC30872k.RunnableC309269 */

            static {
                Covode.recordClassIndex(37551);
            }

            public final void run() {
                MethodCollector.m26663i(13461);
                synchronized (EnumC30872k.this.mStateLock) {
                    try {
                        if (EnumC30872k.this.mCurrentCameraState != 3) {
                            String str = "Can not takePicture on state : " + EnumC30872k.this.mCurrentCameraState;
                            EnumC30872k.this.mCameraObserver.onError(-105, str);
                            C30969o.m63689d("TECameraServer", str);
                            if (lVar != null) {
                                new Exception(str);
                            }
                            return;
                        }
                        if (EnumC30872k.this.mCameraSettings.f74179c == 1) {
                            EnumC30872k.this.updateCameraState(2);
                        }
                        EnumC30872k.this.mCameraInstance.mo55665a(i, i2, lVar);
                        MethodCollector.m26664o(13461);
                    } finally {
                        MethodCollector.m26664o(13461);
                    }
                }
            }
        });
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        m63639c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r4 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        com.p2082ss.android.ttvecamera.C30969o.m63686a("TECameraServer", "reopen camera.");
        close(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        r6.mIsCameraPendingClose = false;
        r6.cachedOpenPrivacyCert = r11;
        r0 = open(r7, r9, r11);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13488);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int connect(com.p2082ss.android.ttvecamera.TECameraCapture r7, com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30747a r8, com.p2082ss.android.ttvecamera.C30933l r9, com.p2082ss.android.ttvecamera.TECameraCapture.AbstractC30749c r10, com.bytedance.bpea.basics.PrivacyCert r11) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.EnumC30872k.connect(com.ss.android.ttvecamera.TECameraCapture, com.ss.android.ttvecamera.TECameraCapture$a, com.ss.android.ttvecamera.l, com.ss.android.ttvecamera.TECameraCapture$c, com.bytedance.bpea.basics.PrivacyCert):int");
    }
}
