package com.p2082ss.android.ugc.aweme.view.customView;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.Surface;
import com.bef.effectsdk.BEFEffectNative;
import com.bef.effectsdk.OpenGLUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.customView.NaviGLSurfaceView */
public final class NaviGLSurfaceView extends GLSurfaceView implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer {

    /* renamed from: a */
    Surface f181406a;

    /* renamed from: b */
    SurfaceTexture f181407b;

    /* renamed from: c */
    public Handler f181408c;

    /* renamed from: d */
    public final Semaphore f181409d = new Semaphore(1);

    /* renamed from: e */
    public CameraDevice f181410e;

    /* renamed from: f */
    public CameraCaptureSession f181411f;

    /* renamed from: g */
    public CaptureRequest.Builder f181412g;

    /* renamed from: h */
    private final String f181413h = NaviGLSurfaceView.class.getSimpleName();

    /* renamed from: i */
    private boolean f181414i;

    /* renamed from: j */
    private int f181415j;

    /* renamed from: k */
    private int[] f181416k = new int[1];

    /* renamed from: l */
    private final int[] f181417l = new int[10];

    /* renamed from: m */
    private final float[] f181418m = new float[10];

    /* renamed from: n */
    private final float[] f181419n = new float[10];

    /* renamed from: o */
    private boolean f181420o;

    /* renamed from: p */
    private boolean f181421p;

    /* renamed from: q */
    private boolean f181422q;

    /* renamed from: r */
    private boolean f181423r;

    /* renamed from: s */
    private boolean f181424s;

    /* renamed from: t */
    private HandlerThread f181425t;

    /* renamed from: u */
    private String f181426u = "0";

    /* renamed from: v */
    private C81200a f181427v;

    /* renamed from: com.ss.android.ugc.aweme.view.customView.NaviGLSurfaceView$a */
    public static final class C81197a extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        final /* synthetic */ NaviGLSurfaceView f181428a;

        static {
            Covode.recordClassIndex(94526);
        }

        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C89219l.m154721d(cameraCaptureSession, "");
        }

        /* renamed from: com.ss.android.ugc.aweme.view.customView.NaviGLSurfaceView$a$a */
        public static final class C81198a extends CameraCaptureSession.CaptureCallback {
            static {
                Covode.recordClassIndex(94527);
            }

            C81198a() {
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81197a(NaviGLSurfaceView naviGLSurfaceView) {
            this.f181428a = naviGLSurfaceView;
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C89219l.m154721d(cameraCaptureSession, "");
            if (this.f181428a.f181410e != null) {
                this.f181428a.f181411f = cameraCaptureSession;
                try {
                    CaptureRequest.Builder builder = this.f181428a.f181412g;
                    if (builder == null) {
                        C89219l.m154715b();
                    }
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    CaptureRequest.Builder builder2 = this.f181428a.f181412g;
                    if (builder2 == null) {
                        C89219l.m154715b();
                    }
                    builder2.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    C81198a aVar = new C81198a();
                    CameraCaptureSession cameraCaptureSession2 = this.f181428a.f181411f;
                    if (cameraCaptureSession2 == null) {
                        C89219l.m154715b();
                    }
                    CaptureRequest.Builder builder3 = this.f181428a.f181412g;
                    if (builder3 == null) {
                        C89219l.m154715b();
                    }
                    cameraCaptureSession2.setRepeatingRequest(builder3.build(), aVar, this.f181428a.f181408c);
                } catch (CameraAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(94525);
    }

    public final int getGLVersion() {
        return this.f181415j;
    }

    public final C81200a getNaviManager() {
        return this.f181427v;
    }

    public final void onResume() {
        super.onResume();
        if (this.f181423r && Build.VERSION.SDK_INT >= 21) {
            setCameraHW(true);
        }
    }

    /* renamed from: a */
    private final void m140953a() {
        try {
            int i = Build.VERSION.SDK_INT;
            HandlerThread handlerThread = this.f181425t;
            if (handlerThread == null) {
                C89219l.m154715b();
            }
            handlerThread.quitSafely();
            HandlerThread handlerThread2 = this.f181425t;
            if (handlerThread2 == null) {
                C89219l.m154715b();
            }
            handlerThread2.join();
            this.f181425t = null;
            this.f181408c = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void onPause() {
        try {
            if (this.f181423r && Build.VERSION.SDK_INT >= 21) {
                setCameraHW(false);
            }
            C81200a aVar = this.f181427v;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.mo124682c();
            C81200a aVar2 = this.f181427v;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.mo124685e();
            C81200a aVar3 = this.f181427v;
            if (aVar3 == null) {
                C89219l.m154715b();
            }
            aVar3.mo124680b();
            this.f181414i = false;
        } catch (NullPointerException e) {
            if (e.getMessage() == null) {
                C89219l.m154715b();
            }
        }
        super.onPause();
    }

    public final void setMultiTouchEnabled(boolean z) {
        this.f181421p = z;
    }

    public final void setPaused(boolean z) {
        this.f181420o = z;
    }

    public final void setTouchEnabled(boolean z) {
        this.f181422q = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.customView.NaviGLSurfaceView$b */
    public static final class C81199b extends CameraDevice.StateCallback {

        /* renamed from: a */
        final /* synthetic */ NaviGLSurfaceView f181429a;

        static {
            Covode.recordClassIndex(94528);
        }

        /* renamed from: a */
        private static void m140955a(CameraDevice cameraDevice) {
            if (!((Boolean) C15346a.m28238a(cameraDevice, new Object[0], 100201, "void", false, null).first).booleanValue()) {
                C15346a.m28240a(null, cameraDevice, new Object[0], 100205, "com_ss_android_ugc_aweme_view_customView_NaviGLSurfaceView$setCameraHW$1_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
                cameraDevice.close();
                C15346a.m28240a(null, cameraDevice, new Object[0], 100201, "com_ss_android_ugc_aweme_view_customView_NaviGLSurfaceView$setCameraHW$1_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81199b(NaviGLSurfaceView naviGLSurfaceView) {
            this.f181429a = naviGLSurfaceView;
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            C89219l.m154721d(cameraDevice, "");
            this.f181429a.f181409d.release();
            m140955a(cameraDevice);
            this.f181429a.f181410e = null;
        }

        public final void onOpened(CameraDevice cameraDevice) {
            if (!((Boolean) C15346a.m28238a(this, new Object[]{cameraDevice}, 100200, "void", false, null).first).booleanValue()) {
                C15346a.m28243a(this, new Object[]{cameraDevice}, 100200, "onOpened(Landroid/hardware/camera2/CameraDevice;)V");
                C89219l.m154721d(cameraDevice, "");
                this.f181429a.f181410e = cameraDevice;
                NaviGLSurfaceView naviGLSurfaceView = this.f181429a;
                try {
                    SurfaceTexture surfaceTexture = naviGLSurfaceView.f181407b;
                    if (surfaceTexture == null) {
                        C89219l.m154715b();
                    }
                    surfaceTexture.setDefaultBufferSize(1920, 1080);
                    naviGLSurfaceView.f181406a = new Surface(naviGLSurfaceView.f181407b);
                    CameraDevice cameraDevice2 = naviGLSurfaceView.f181410e;
                    if (cameraDevice2 == null) {
                        C89219l.m154715b();
                    }
                    naviGLSurfaceView.f181412g = cameraDevice2.createCaptureRequest(1);
                    CaptureRequest.Builder builder = naviGLSurfaceView.f181412g;
                    if (builder == null) {
                        C89219l.m154715b();
                    }
                    Surface surface = naviGLSurfaceView.f181406a;
                    if (surface == null) {
                        C89219l.m154715b();
                    }
                    builder.addTarget(surface);
                    CameraDevice cameraDevice3 = naviGLSurfaceView.f181410e;
                    if (cameraDevice3 == null) {
                        C89219l.m154715b();
                    }
                    cameraDevice3.createCaptureSession(Arrays.asList(naviGLSurfaceView.f181406a), new C81197a(naviGLSurfaceView), naviGLSurfaceView.f181408c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            C89219l.m154721d(cameraDevice, "");
            this.f181429a.f181409d.release();
            m140955a(cameraDevice);
            this.f181429a.f181410e = null;
        }
    }

    public final synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        MethodCollector.m26663i(666);
        C89219l.m154721d(surfaceTexture, "");
        this.f181424s = true;
        requestRender();
        MethodCollector.m26664o(666);
    }

    public final void setCamera(boolean z) {
        this.f181423r = z;
        if (Build.VERSION.SDK_INT >= 21) {
            if (z) {
                Object a = m140952a(getContext(), "camera");
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                CameraManager cameraManager = (CameraManager) a;
                try {
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    int length = cameraIdList.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        String str = cameraIdList[i];
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        C89219l.m154716b(cameraCharacteristics, "");
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        if (num != null) {
                            if (num.intValue() == 0) {
                                C89219l.m154716b(str, "");
                                this.f181426u = str;
                                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                                if (streamConfigurationMap == null) {
                                    C89219l.m154715b();
                                }
                                Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                                for (Size size : outputSizes) {
                                    C89219l.m154716b(size, "");
                                    if (1920 == size.getWidth() && 1080 == size.getHeight()) {
                                        break;
                                    }
                                }
                            }
                        }
                        i++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            setCameraHW(z);
        }
    }

    public final void setCameraHW(boolean z) {
        if (z) {
            Object a = m140952a(getContext(), "camera");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) a;
            try {
                HandlerThread handlerThread = new HandlerThread("CameraBackground");
                this.f181425t = handlerThread;
                handlerThread.start();
                HandlerThread handlerThread2 = this.f181425t;
                if (handlerThread2 == null) {
                    C89219l.m154715b();
                }
                this.f181408c = new Handler(handlerThread2.getLooper());
                cameraManager.openCamera(this.f181426u, new C81199b(this), (Handler) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                this.f181409d.acquire();
                Surface surface = this.f181406a;
                if (surface != null) {
                    surface.release();
                    CaptureRequest.Builder builder = this.f181412g;
                    if (builder == null) {
                        C89219l.m154715b();
                    }
                    Surface surface2 = this.f181406a;
                    if (surface2 == null) {
                        C89219l.m154715b();
                    }
                    builder.removeTarget(surface2);
                }
                CameraCaptureSession cameraCaptureSession = this.f181411f;
                if (cameraCaptureSession != null) {
                    try {
                        cameraCaptureSession.stopRepeating();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    CameraCaptureSession cameraCaptureSession2 = this.f181411f;
                    if (cameraCaptureSession2 == null) {
                        C89219l.m154715b();
                    }
                    cameraCaptureSession2.close();
                    this.f181411f = null;
                }
                CameraDevice cameraDevice = this.f181410e;
                if (cameraDevice != null) {
                    if (!((Boolean) C15346a.m28238a(cameraDevice, new Object[0], 100201, "void", false, null).first).booleanValue()) {
                        C15346a.m28240a(null, cameraDevice, new Object[0], 100205, "com_ss_android_ugc_aweme_view_customView_NaviGLSurfaceView_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
                        cameraDevice.close();
                        C15346a.m28240a(null, cameraDevice, new Object[0], 100201, "com_ss_android_ugc_aweme_view_customView_NaviGLSurfaceView_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
                    }
                    this.f181410e = null;
                }
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            } catch (Throwable th) {
                m140953a();
                this.f181409d.release();
                throw th;
            }
            m140953a();
            this.f181409d.release();
        }
    }

    public final void onDrawFrame(GL10 gl10) {
        int i;
        int i2;
        int i3;
        int i4;
        MethodCollector.m26663i(648);
        C89219l.m154721d(gl10, "");
        if (!this.f181414i || this.f181420o) {
            MethodCollector.m26664o(648);
            return;
        }
        synchronized (this) {
            try {
                if (this.f181424s) {
                    SurfaceTexture surfaceTexture = this.f181407b;
                    if (surfaceTexture == null) {
                        C89219l.m154715b();
                    }
                    surfaceTexture.updateTexImage();
                    this.f181424s = false;
                }
            } finally {
                MethodCollector.m26664o(648);
            }
        }
        C81200a aVar = this.f181427v;
        if (aVar == null) {
            C89219l.m154715b();
        }
        boolean z = this.f181423r;
        int i5 = this.f181416k[0];
        int[] iArr = aVar.f181447M;
        if (iArr == null) {
            C89219l.m154715b();
        }
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glClearColor(aVar.f181467k, aVar.f181468l, aVar.f181469m, aVar.f181470n);
        GLES20.glClear(16384);
        if (aVar.f181460d != null) {
            if (z) {
                if (aVar.f181472p) {
                    GLES20.glViewport(0, 0, aVar.f181463g, aVar.f181464h);
                    int[] iArr2 = aVar.f181454T;
                    if (iArr2 == null) {
                        C89219l.m154715b();
                    }
                    aVar.mo124676a(i5, iArr2[0], 1.0f);
                } else {
                    float f = ((float) (aVar.f181462f * aVar.f181466j)) / ((float) (aVar.f181461e * aVar.f181465i));
                    GLES20.glViewport(0, 0, aVar.f181461e, aVar.f181462f);
                    int[] iArr3 = aVar.f181451Q;
                    if (iArr3 == null) {
                        C89219l.m154715b();
                    }
                    aVar.mo124676a(i5, iArr3[0], f);
                }
                GLES20.glFlush();
            }
            if (aVar.f181472p) {
                int[] iArr4 = aVar.f181455U;
                if (iArr4 == null) {
                    C89219l.m154715b();
                }
                i = iArr4[0];
            } else {
                int[] iArr5 = aVar.f181452R;
                if (iArr5 == null) {
                    C89219l.m154715b();
                }
                i = iArr5[0];
            }
            if (aVar.f181472p) {
                i2 = aVar.f181463g;
            } else {
                i2 = aVar.f181461e;
            }
            if (aVar.f181472p) {
                i3 = aVar.f181464h;
            } else {
                i3 = aVar.f181462f;
            }
            double nanoTime = (double) System.nanoTime();
            Double.isNaN(nanoTime);
            double d = nanoTime / 1.0E9d;
            BEFEffectNative.processAlgorithm(aVar.f181458b, i, i2, i3, d);
            if (aVar.f181472p) {
                long j = aVar.f181458b;
                int[] iArr6 = aVar.f181455U;
                if (iArr6 == null) {
                    C89219l.m154715b();
                }
                int i6 = iArr6[0];
                int[] iArr7 = aVar.f181450P;
                if (iArr7 == null) {
                    C89219l.m154715b();
                }
                BEFEffectNative.processFrame(j, i6, iArr7[0], aVar.f181463g, aVar.f181464h, d);
            } else {
                if (aVar.f181473q) {
                    int[] iArr8 = aVar.f181452R;
                    if (iArr8 == null) {
                        C89219l.m154715b();
                    }
                    i4 = iArr8[0];
                } else {
                    int[] iArr9 = aVar.f181448N;
                    if (iArr9 == null) {
                        C89219l.m154715b();
                    }
                    i4 = iArr9[0];
                }
                long j2 = aVar.f181458b;
                int[] iArr10 = aVar.f181450P;
                if (iArr10 == null) {
                    C89219l.m154715b();
                }
                BEFEffectNative.processFrame(j2, i4, iArr10[0], aVar.f181461e, aVar.f181462f, d);
            }
        } else {
            GLES20.glViewport(0, 0, aVar.f181461e, aVar.f181462f);
            int[] iArr11 = aVar.f181448N;
            if (iArr11 == null) {
                C89219l.m154715b();
            }
            int i7 = iArr11[0];
            int[] iArr12 = aVar.f181449O;
            if (iArr12 == null) {
                C89219l.m154715b();
            }
            aVar.mo124676a(i7, iArr12[0], 0.0f);
        }
        if (aVar.f181476t) {
            GLES20.glViewport(0, 0, aVar.f181477u, aVar.f181478v);
            int[] iArr13 = aVar.f181450P;
            if (iArr13 == null) {
                C89219l.m154715b();
            }
            int i8 = iArr13[0];
            int[] iArr14 = aVar.f181453S;
            if (iArr14 == null) {
                C89219l.m154715b();
            }
            aVar.mo124676a(i8, iArr14[0], 0.0f);
            GLES20.glFlush();
        }
        if (aVar.f181471o) {
            GLES20.glViewport(0, 0, aVar.f181461e, aVar.f181462f);
            int[] iArr15 = aVar.f181450P;
            if (iArr15 == null) {
                C89219l.m154715b();
            }
            aVar.mo124676a(iArr15[0], 0, 0.0f);
            GLES20.glFlush();
        }
        if (aVar.f181476t) {
            aVar.f181457a.lock();
            if (aVar.f181476t && aVar.f181479w != null) {
                int[] iArr16 = aVar.f181453S;
                if (iArr16 == null) {
                    C89219l.m154715b();
                }
                GLES20.glBindFramebuffer(36160, iArr16[0]);
                Bitmap a = C81200a.m140956a(aVar.f181477u, aVar.f181478v, true);
                List<ByteArrayOutputStream> list = aVar.f181479w;
                if (list == null) {
                    C89219l.m154715b();
                }
                int size = list.size();
                List<ByteArrayOutputStream> list2 = aVar.f181479w;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                list2.add(new ByteArrayOutputStream());
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                List<ByteArrayOutputStream> list3 = aVar.f181479w;
                if (list3 == null) {
                    C89219l.m154715b();
                }
                a.compress(compressFormat, 90, list3.get(size));
            }
            aVar.f181457a.unlock();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (!this.f181422q) {
            return super.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i = 0; i < pointerCount; i++) {
            this.f181417l[i] = motionEvent.getPointerId(i);
            this.f181418m[i] = motionEvent.getX(i);
            this.f181419n[i] = motionEvent.getY(i);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            m140954a(this.f181418m, this.f181419n, 1);
            int[] iArr = {this.f181417l[0]};
            float[] fArr = {this.f181418m[0]};
            float[] fArr2 = {this.f181419n[0]};
            C81200a aVar = this.f181427v;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.mo124679a(iArr, fArr, fArr2);
        } else if (action == 1) {
            m140954a(this.f181418m, this.f181419n, 1);
            int[] iArr2 = {this.f181417l[0]};
            float[] fArr3 = {this.f181418m[0]};
            float[] fArr4 = {this.f181419n[0]};
            C81200a aVar2 = this.f181427v;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.mo124683c(iArr2, fArr3, fArr4);
        } else if (action == 2) {
            m140954a(this.f181418m, this.f181419n, pointerCount);
            if (!this.f181421p) {
                int[] iArr3 = {this.f181417l[0]};
                float[] fArr5 = {this.f181418m[0]};
                float[] fArr6 = {this.f181419n[0]};
                C81200a aVar3 = this.f181427v;
                if (aVar3 == null) {
                    C89219l.m154715b();
                }
                aVar3.mo124681b(iArr3, fArr5, fArr6);
            } else {
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    int[] iArr4 = {this.f181417l[i2]};
                    float[] fArr7 = {this.f181418m[i2]};
                    float[] fArr8 = {this.f181419n[i2]};
                    C81200a aVar4 = this.f181427v;
                    if (aVar4 == null) {
                        C89219l.m154715b();
                    }
                    aVar4.mo124681b(iArr4, fArr7, fArr8);
                }
            }
        } else if (action == 5) {
            int action2 = motionEvent.getAction() >> 8;
            if (this.f181421p || action2 == 0) {
                m140954a(this.f181418m, this.f181419n, pointerCount);
                int[] iArr5 = {this.f181417l[action2]};
                float[] fArr9 = {this.f181418m[action2]};
                float[] fArr10 = {this.f181419n[action2]};
                C81200a aVar5 = this.f181427v;
                if (aVar5 == null) {
                    C89219l.m154715b();
                }
                aVar5.mo124679a(iArr5, fArr9, fArr10);
            }
        } else if (action == 6) {
            int action3 = motionEvent.getAction() >> 8;
            if (this.f181421p || action3 == 0) {
                m140954a(this.f181418m, this.f181419n, pointerCount);
                int[] iArr6 = {this.f181417l[action3]};
                float[] fArr11 = {this.f181418m[action3]};
                float[] fArr12 = {this.f181419n[action3]};
                C81200a aVar6 = this.f181427v;
                if (aVar6 == null) {
                    C89219l.m154715b();
                }
                aVar6.mo124683c(iArr6, fArr11, fArr12);
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m140952a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(547);
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
                    MethodCollector.m26664o(547);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NaviGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(766);
        Object a = m140952a(context, "activity");
        if (a != null) {
            if (((ActivityManager) a).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                i = 3;
            } else {
                i = 2;
            }
            this.f181415j = i;
            setEGLContextClientVersion(i);
            setZOrderOnTop(true);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(1);
            setRenderer(this);
            setRenderMode(1);
            this.f181427v = new C81200a();
            MethodCollector.m26664o(766);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        MethodCollector.m26664o(766);
        throw nullPointerException;
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        boolean z;
        C89219l.m154721d(gl10, "");
        C89219l.m154721d(eGLConfig, "");
        if (!this.f181414i) {
            C81200a aVar = this.f181427v;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.f181437C = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, texCoord);\n}");
            aVar.f181438D = GLES20.glGetAttribLocation(aVar.f181437C, "vTexCoord");
            aVar.f181439E = GLES20.glGetAttribLocation(aVar.f181437C, "vPosition");
            aVar.f181440F = GLES20.glGetUniformLocation(aVar.f181437C, "sTexture");
            aVar.f181480x = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sCamera;\nuniform float uCamera;\nvarying vec2 texCoord;\nvoid main() {\n  vec2 uv = texCoord;\n  float off = (1.0 - uCamera) / 2.0;\n  uv.x = uv.x * uCamera + off;\n  gl_FragColor = texture2D(sCamera, uv);\n}");
            aVar.f181435A = GLES20.glGetAttribLocation(aVar.f181480x, "vTexCoord");
            aVar.f181482z = GLES20.glGetAttribLocation(aVar.f181480x, "vPosition");
            aVar.f181481y = GLES20.glGetUniformLocation(aVar.f181480x, "sCamera");
            aVar.f181436B = GLES20.glGetUniformLocation(aVar.f181480x, "uCamera");
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(C81200a.f181431V.length * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            aVar.f181444J = allocateDirect.asFloatBuffer();
            FloatBuffer floatBuffer = aVar.f181444J;
            if (floatBuffer != null) {
                floatBuffer.put(C81200a.f181431V);
            }
            FloatBuffer floatBuffer2 = aVar.f181444J;
            if (floatBuffer2 != null) {
                floatBuffer2.position(0);
            }
            aVar.f181441G = new int[1];
            GLES20.glGenBuffers(1, aVar.f181441G, 0);
            int[] iArr = aVar.f181441G;
            if (iArr == null) {
                C89219l.m154715b();
            }
            GLES20.glBindBuffer(34962, iArr[0]);
            GLES20.glBufferData(34962, C81200a.f181431V.length * 4, aVar.f181444J, 35044);
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(C81200a.f181432W.length * 4);
            allocateDirect2.order(ByteOrder.nativeOrder());
            aVar.f181445K = allocateDirect2.asFloatBuffer();
            FloatBuffer floatBuffer3 = aVar.f181445K;
            if (floatBuffer3 != null) {
                floatBuffer3.put(C81200a.f181432W);
            }
            FloatBuffer floatBuffer4 = aVar.f181445K;
            if (floatBuffer4 != null) {
                floatBuffer4.position(0);
            }
            aVar.f181442H = new int[1];
            GLES20.glGenBuffers(1, aVar.f181442H, 0);
            int[] iArr2 = aVar.f181442H;
            if (iArr2 == null) {
                C89219l.m154715b();
            }
            GLES20.glBindBuffer(34962, iArr2[0]);
            GLES20.glBufferData(34962, C81200a.f181432W.length * 4, aVar.f181445K, 35044);
            ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(C81200a.f181433X.length * 2);
            allocateDirect3.order(ByteOrder.nativeOrder());
            aVar.f181446L = allocateDirect3.asShortBuffer();
            ShortBuffer shortBuffer = aVar.f181446L;
            if (shortBuffer != null) {
                shortBuffer.put(C81200a.f181433X);
            }
            ShortBuffer shortBuffer2 = aVar.f181446L;
            if (shortBuffer2 != null) {
                shortBuffer2.position(0);
            }
            aVar.f181443I = new int[1];
            GLES20.glGenBuffers(1, aVar.f181443I, 0);
            int[] iArr3 = aVar.f181443I;
            if (iArr3 == null) {
                C89219l.m154715b();
            }
            GLES20.glBindBuffer(34963, iArr3[0]);
            GLES20.glBufferData(34963, C81200a.f181433X.length * 2, aVar.f181446L, 35044);
            C81200a aVar2 = this.f181427v;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.mo124684d();
            C81200a aVar3 = this.f181427v;
            if (aVar3 == null) {
                C89219l.m154715b();
            }
            if (this.f181415j == 3) {
                z = true;
            } else {
                z = false;
            }
            aVar3.mo124680b();
            aVar3.f181458b = BEFEffectNative.createHandle(z);
            if (!(aVar3.f181458b == 0 || aVar3.f181459c == null)) {
                BEFEffectNative.initResourceFinder(aVar3.f181458b, aVar3.f181459c, aVar3.f181466j, aVar3.f181465i, "android");
                BEFEffectNative.setOrientation(aVar3.f181458b, 0);
                BEFEffectNative.setFrameOrientation(aVar3.f181458b, 0);
                BEFEffectNative.setCameraPosition(aVar3.f181458b, true);
            }
            this.f181416k = new int[1];
            gl10.glDisable(3024);
            gl10.glHint(3152, 4353);
            gl10.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            gl10.glEnable(2884);
            gl10.glShadeModel(7425);
            gl10.glEnable(2929);
            GLES20.glGenTextures(1, this.f181416k, 0);
            GLES20.glBindTexture(36197, this.f181416k[0]);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f181416k[0]);
            this.f181407b = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            this.f181414i = true;
        }
    }

    /* renamed from: a */
    private final void m140954a(float[] fArr, float[] fArr2, int i) {
        int width = getWidth();
        int height = getHeight();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            float f2 = fArr2[i2];
            fArr[i2] = f / ((float) width);
            fArr2[i2] = 1.0f - (f2 / ((float) height));
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        C89219l.m154721d(gl10, "");
        C81200a aVar = this.f181427v;
        if (aVar == null) {
            C89219l.m154715b();
        }
        aVar.f181461e = i;
        aVar.f181462f = i2;
        C81200a aVar2 = this.f181427v;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        aVar2.mo124684d();
    }
}
