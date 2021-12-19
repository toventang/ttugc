package com.p2082ss.android.medialib.presenter;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import androidx.lifecycle.AbstractC1214u;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.C30008h;
import com.p2082ss.android.medialib.RecordInvoker;
import com.p2082ss.android.medialib.camera.C29998d;
import com.p2082ss.android.medialib.camera.ImageFrame;
import com.p2082ss.android.medialib.listener.AbstractC30011a;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.medialib.listener.AbstractC30013c;
import com.p2082ss.android.medialib.listener.AbstractC30014d;
import com.p2082ss.android.medialib.listener.AudioManagerCallback;
import com.p2082ss.android.medialib.model.C30016a;
import com.p2082ss.android.medialib.model.EnigmaResult;
import com.p2082ss.android.medialib.p2154a.C29980b;
import com.p2082ss.android.medialib.p2155b.C29983a;
import com.p2082ss.android.medialib.p2155b.C29987b;
import com.p2082ss.android.medialib.p2156c.C29993a;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.vesdk.AbstractC85313aj;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85392bf;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.LandMarkFrame;
import com.p2082ss.android.vesdk.VEARCoreParam;
import com.p2082ss.android.vesdk.VEDebugSettings;
import com.p2082ss.android.vesdk.VEEffectParams;
import com.p2082ss.android.vesdk.VESafeAreaParams;
import com.p2082ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.p2082ss.android.vesdk.runtime.VEMapBufferInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.libsdl.app.AudioRecorderInterface;
import org.libsdl.app.AudioRecorderInterfaceExt;
import org.libsdl.app.BufferedAudioRecorder;

/* renamed from: com.ss.android.medialib.presenter.g */
public class C30031g implements AbstractC30028e, AudioRecorderInterfaceExt {

    /* renamed from: a */
    public static final String f71665a = C30031g.class.getSimpleName();

    /* renamed from: A */
    public long f71666A = 0;

    /* renamed from: B */
    public long f71667B = 0;

    /* renamed from: C */
    public SurfaceTexture.OnFrameAvailableListener f71668C = new SurfaceTexture.OnFrameAvailableListener() {
        /* class com.p2082ss.android.medialib.presenter.C30031g.C3003310 */

        static {
            Covode.recordClassIndex(36519);
        }

        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (C30031g.this.f71712y == -1) {
                C30031g.this.f71666A = System.currentTimeMillis();
            }
            C30031g.this.f71712y++;
            C30031g.this.f71667B = System.currentTimeMillis();
            float f = ((float) (C30031g.this.f71667B - C30031g.this.f71666A)) / 1000.0f;
            if (f >= 1.0f) {
                C30031g gVar = C30031g.this;
                gVar.f71713z = ((float) gVar.f71712y) / f;
                C30031g gVar2 = C30031g.this;
                gVar2.f71666A = gVar2.f71667B;
                C30031g.this.f71712y = 0;
            }
        }
    };

    /* renamed from: D */
    private String f71669D;

    /* renamed from: E */
    private long f71670E;

    /* renamed from: F */
    private long f71671F = -1;

    /* renamed from: G */
    private long f71672G;

    /* renamed from: H */
    private boolean f71673H;

    /* renamed from: I */
    private AtomicBoolean f71674I = new AtomicBoolean(false);

    /* renamed from: J */
    private int f71675J = 18;

    /* renamed from: K */
    private int f71676K = -1;

    /* renamed from: L */
    private boolean f71677L = false;

    /* renamed from: M */
    private float f71678M = 1.0f;

    /* renamed from: N */
    private volatile boolean f71679N = false;

    /* renamed from: O */
    private boolean f71680O = false;

    /* renamed from: P */
    private AtomicInteger f71681P = new AtomicInteger(-1);

    /* renamed from: Q */
    private boolean f71682Q = false;

    /* renamed from: R */
    private boolean f71683R = false;

    /* renamed from: S */
    private C30027d<C30024a> f71684S;

    /* renamed from: T */
    private boolean f71685T = false;

    /* renamed from: U */
    private VEDebugSettings f71686U = null;

    /* renamed from: V */
    private double f71687V = -1.0d;

    /* renamed from: W */
    private AbstractC30014d f71688W = new AbstractC30014d() {
        /* class com.p2082ss.android.medialib.presenter.C30031g.C3003411 */

        static {
            Covode.recordClassIndex(36520);
        }

        @Override // com.p2082ss.android.medialib.listener.AbstractC30014d
        /* renamed from: a */
        public final long mo52868a() {
            SurfaceTexture surfaceTexture = C30031g.this.f71710w;
            long abs = Math.abs(System.nanoTime() - surfaceTexture.getTimestamp());
            int i = Build.VERSION.SDK_INT;
            long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - surfaceTexture.getTimestamp());
            long abs3 = Math.abs((SystemClock.uptimeMillis() * 1000000) - surfaceTexture.getTimestamp());
            C85315al.m146639b(C30031g.f71665a, "nano_time: " + abs + ",elapsed: " + abs2 + " ,delta_uptime_nano: " + abs3);
            return Math.min(Math.min(abs, abs2), abs3) / 1000;
        }
    };

    /* renamed from: b */
    public BufferedAudioRecorder f71689b;

    /* renamed from: c */
    public int f71690c = 1;

    /* renamed from: d */
    public boolean f71691d;

    /* renamed from: e */
    public boolean f71692e = false;

    /* renamed from: f */
    public AudioRecorderInterface f71693f;

    /* renamed from: g */
    public AbstractC30043a f71694g;

    /* renamed from: h */
    public AbstractC30045c f71695h;

    /* renamed from: i */
    protected RecordInvoker f71696i;

    /* renamed from: j */
    public C30049i f71697j;

    /* renamed from: k */
    public boolean f71698k = true;

    /* renamed from: l */
    public boolean f71699l = false;

    /* renamed from: m */
    public boolean f71700m = false;

    /* renamed from: n */
    public int f71701n = 0;

    /* renamed from: o */
    public int f71702o = 44100;

    /* renamed from: p */
    public int f71703p = 2;

    /* renamed from: q */
    public int f71704q = 131072;

    /* renamed from: r */
    public boolean f71705r = true;

    /* renamed from: s */
    public boolean f71706s = true;

    /* renamed from: t */
    public boolean f71707t = false;

    /* renamed from: u */
    public C30048h f71708u;

    /* renamed from: v */
    public C29980b f71709v;

    /* renamed from: w */
    public SurfaceTexture f71710w;

    /* renamed from: x */
    public boolean f71711x = false;

    /* renamed from: y */
    public int f71712y = -1;

    /* renamed from: z */
    public float f71713z = -1.0f;

    /* renamed from: com.ss.android.medialib.presenter.g$a */
    public interface AbstractC30043a {
        static {
            Covode.recordClassIndex(36529);
        }

        /* renamed from: a */
        void mo53391a(int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.presenter.g$b */
    public interface AbstractC30044b {
        static {
            Covode.recordClassIndex(36530);
        }

        /* renamed from: a */
        void mo53392a(int i);
    }

    /* renamed from: com.ss.android.medialib.presenter.g$c */
    public interface AbstractC30045c {
        static {
            Covode.recordClassIndex(36531);
        }

        /* renamed from: a */
        void mo53393a(C30016a aVar);

        /* renamed from: b */
        boolean mo53394b();
    }

    /* renamed from: com.ss.android.medialib.presenter.g$d */
    public interface AbstractC30046d {
        static {
            Covode.recordClassIndex(36532);
        }

        /* renamed from: a */
        void mo53395a(Bitmap bitmap, int i);
    }

    /* renamed from: com.ss.android.medialib.presenter.g$e */
    public interface AbstractC30047e {
        static {
            Covode.recordClassIndex(36533);
        }

        /* renamed from: a */
        void mo53396a(int[] iArr, int i, int i2);
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt
    public void startMicError() {
    }

    /* renamed from: a */
    public final C30031g mo53230a(int i, int i2, int i3) {
        this.f71702o = i;
        this.f71703p = i2;
        this.f71704q = i3;
        return this;
    }

    /* renamed from: a */
    public final C30031g mo53233a(String str) {
        this.f71669D = str;
        this.f71696i.changeMusicPath(str);
        return this;
    }

    /* renamed from: a */
    public final C30031g mo53229a(float f, int i) {
        this.f71678M = f;
        this.f71696i.setBGMVolume(f, i);
        return this;
    }

    /* renamed from: a */
    public final void mo53275a(String str, String str2, float f, float f2, float f3, boolean z, boolean z2, int i) {
        this.f71696i.initDuet(str, f, f2, f3, z, z2, i);
        mo53231a(0L, 0L);
        mo53233a(str2);
        this.f71699l = true;
    }

    /* renamed from: a */
    public final void mo53277a(boolean z) {
        RecordInvoker recordInvoker = this.f71696i;
        if (recordInvoker != null) {
            recordInvoker.setSwapReactionRegion(true);
        }
    }

    /* renamed from: a */
    public final void mo53242a(int i, int i2) {
        C85315al.m146637a(f71665a, "changeOutputVideoSize: width=" + i + ", height=" + i2);
        this.f71696i.changeOutputVideoSize(i, i2);
    }

    /* renamed from: a */
    public final void mo53236a(float f) {
        this.f71696i.chooseAreaFromRatio34(f);
    }

    /* renamed from: b */
    public final void mo53300b(float f) {
        this.f71696i.setPaddingBottomInRatio34(f);
    }

    /* renamed from: b */
    public final void mo53308b(boolean z) {
        this.f71696i.forceFirstFrameHasEffect(z);
    }

    /* renamed from: a */
    public final void mo53248a(long j) {
        this.f71696i.setEffectAlgorithmRequirement(j);
    }

    /* renamed from: a */
    public final void mo53257a(RecordInvoker.OnPreviewRadioListener onPreviewRadioListener) {
        this.f71696i.setPreviewRadioListener(onPreviewRadioListener);
    }

    /* renamed from: b */
    public final void mo53302b(int i, int i2) {
        this.f71696i.setCaptureRenderWidth(i, i2);
    }

    /* renamed from: a */
    public final void mo53250a(Context context, String str, String str2) {
        this.f71696i.initReaction(context, str, str2);
        mo53231a(0L, 0L);
        mo53233a(str2);
    }

    /* renamed from: a */
    public final C30031g mo53231a(long j, long j2) {
        return mo53232a(j, -1, j2);
    }

    /* renamed from: a */
    public final C30031g mo53232a(long j, long j2, long j3) {
        this.f71670E = j;
        this.f71671F = j2;
        this.f71672G = j3;
        this.f71696i.setMusicTime(j, j2, j3);
        return this;
    }

    /* renamed from: a */
    public final synchronized int mo53206a(Context context, int i, AudioRecorderInterface audioRecorderInterface) {
        BufferedAudioRecorder bufferedAudioRecorder;
        MethodCollector.m26663i(1894);
        this.f71693f = audioRecorderInterface;
        if (context == null) {
            C85315al.m146642d(f71665a, "file " + C85315al.m146633a() + ",fun " + C85315al.m146640c() + ",line " + C85315al.m146638b() + ": context is null");
            MethodCollector.m26664o(1894);
            return -1000;
        }
        this.f71690c = i;
        if (!this.f71692e && (bufferedAudioRecorder = this.f71689b) != null) {
            bufferedAudioRecorder.unInit();
            C85315al.m146637a(f71665a, "initRecord: mAudioRecorder.unInit()");
        }
        if ((this.f71690c & 1) != 0 && !this.f71692e) {
            BufferedAudioRecorder bufferedAudioRecorder2 = new BufferedAudioRecorder(this, this.f71702o, this.f71703p, this.f71704q, this.f71708u);
            this.f71689b = bufferedAudioRecorder2;
            bufferedAudioRecorder2.init(m60581y());
            m60579J();
        }
        int i2 = 0;
        if ((this.f71690c & 4) != 0 && !TextUtils.isEmpty(this.f71669D)) {
            this.f71696i.setBGMVolume(this.f71678M, -1);
            i2 = this.f71696i.initAudioPlayer(context, this.f71669D, this.f71672G + this.f71670E, this.f71691d, this.f71700m);
        }
        C85315al.m146637a(f71665a, "initRecord return: ".concat(String.valueOf(i2)));
        MethodCollector.m26664o(1894);
        return i2;
    }

    /* renamed from: a */
    public final void mo53252a(AssetManager assetManager) {
        this.f71696i.configStyleResourceFinder(assetManager);
    }

    /* renamed from: a */
    public final void mo53234a() {
        this.f71696i.setEffectBuildChainType(1);
    }

    /* renamed from: a */
    public final int[] mo53288a(int i, int i2, int i3, int i4, float f) {
        return this.f71696i.updateReactionCameraPosWithRotation(i, i2, i3, i4, f);
    }

    /* renamed from: a */
    public final void mo53243a(int i, int i2, int i3, int i4) {
        this.f71696i.setReactionPosMargin(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void mo53251a(Context context, String str, String str2, String str3) {
        this.f71696i.setCustomVideoBg(context, str, str2, str3, 0, true, this.f71700m);
        if (!TextUtils.isEmpty(str2)) {
            this.f71696i.previewVideoBg();
        }
        if (TextUtils.isEmpty(this.f71669D)) {
            this.f71696i.uninitAudioPlayer();
            mo53233a((String) null);
            mo53241a(0);
        }
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f71669D) && !TextUtils.isEmpty(str3)) {
            C85315al.m146637a(f71665a, "setCustomVideoBg, initAudioPlayer ret = ".concat(String.valueOf(this.f71696i.initAudioPlayer(context, str3, this.f71672G, false, this.f71700m))));
        }
    }

    /* renamed from: a */
    public final void mo53272a(String str, String str2) {
        this.f71696i.setCustomVideoBg(str, str2);
    }

    /* renamed from: a */
    public final void mo53235a(double d) {
        this.f71696i.setVideoBgSpeed(d);
    }

    /* renamed from: a */
    public final void mo53241a(int i) {
        this.f71696i.setUseMusic(i);
    }

    /* renamed from: b */
    public final void mo53301b(int i) {
        this.f71696i.enableAudio(i);
    }

    /* renamed from: a */
    public final int mo53204a(int i, float[] fArr, boolean z) {
        SurfaceTexture surfaceTexture;
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.f71668C;
        if (!(onFrameAvailableListener == null || (surfaceTexture = this.f71710w) == null)) {
            if (fArr != null) {
                boolean z2 = false;
                if ((fArr[0] * fArr[5]) - (fArr[1] * fArr[4]) >= 0.0f) {
                    z2 = true;
                }
                this.f71705r = z2;
            }
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
        return this.f71696i.onDrawFrame(i, fArr, z);
    }

    /* renamed from: a */
    public final void mo53246a(int i, boolean z, boolean z2) {
        this.f71696i.updateRotation((i + this.f71701n) % 360, z, z2);
    }

    /* renamed from: a */
    public final void mo53238a(float f, float f2, float f3) {
        this.f71696i.updateRotation(f, f2, f3);
    }

    /* renamed from: a */
    public final void mo53282a(float[] fArr) {
        this.f71696i.setDeviceRotation(fArr);
    }

    /* renamed from: a */
    public final void mo53283a(float[] fArr, double d) {
        this.f71696i.setDeviceRotation(fArr, d);
    }

    /* renamed from: a */
    public final void mo53266a(LandMarkFrame landMarkFrame) {
        this.f71696i.setLandMarkInfo(landMarkFrame);
    }

    /* renamed from: a */
    public final int mo53221a(boolean z, int i, boolean z2) {
        return this.f71696i.startPrePlay(z, i, z2);
    }

    /* renamed from: a */
    public final int mo53225a(byte[] bArr, int i, long j) {
        if (!this.f71692e) {
            return 0;
        }
        this.f71696i.onAudioCallback(bArr, i);
        AudioRecorderInterface audioRecorderInterface = this.f71693f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.addPCMData(bArr, i, j);
            C85315al.m146639b(f71665a, "addPCMData is running");
        }
        if (this.f71681P.get() != 0) {
            return 0;
        }
        this.f71709v.mo52794a(Arrays.copyOf(bArr, i), i, j);
        return 0;
    }

    /* renamed from: a */
    public final synchronized int mo53218a(String str, String str2, int i, String str3, String str4, boolean z, int i2) {
        int concat;
        MethodCollector.m26663i(136);
        mo53363n();
        long currentTimeMillis = System.currentTimeMillis();
        concat = this.f71696i.concat(str, str2, i, str3, str4, z, i2);
        C30695h.m63062a(0, "te_record_concat_ret", (long) concat);
        C30695h.m63062a(0, "te_record_concat_time", System.currentTimeMillis() - currentTimeMillis);
        MethodCollector.m26664o(136);
        return concat;
    }

    /* renamed from: a */
    public final int mo53209a(Surface surface, String str) {
        int i = C29998d.m60545a().f71589d;
        C29998d a = C29998d.m60545a();
        int i2 = (a.f71586a != null && a.f71586a.mo52825b() == 1) ? 1 : 0;
        C85315al.m146639b("MediaPresenter", "Start Play >>> ");
        int startPlay = this.f71696i.startPlay(surface, str, this.f71673H, i, i2);
        C85315al.m146639b("MediaPresenter", "Start Play ret = ".concat(String.valueOf(startPlay)));
        return startPlay;
    }

    /* renamed from: a */
    public final int mo53208a(Surface surface) {
        return this.f71696i.changeSurface(surface);
    }

    /* renamed from: a */
    public final void mo53240a(float f, int i, int i2) {
        this.f71696i.setPreviewSizeRatio(f, i, i2);
    }

    /* renamed from: b */
    public final void mo53303b(int i, String str) {
        C85315al.m146639b(f71665a, "nativeSetBeautyFace: ".concat(String.valueOf(i)));
        this.f71696i.setBeautyFace(i, str);
    }

    /* renamed from: a */
    public final void mo53237a(float f, float f2) {
        this.f71696i.setBeautyFaceIntensity(f, f2);
    }

    /* renamed from: a */
    public final int mo53216a(String str, float f, float f2) {
        return this.f71696i.setReshape(str, f, f2);
    }

    /* renamed from: a */
    public final void mo53284a(String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f71696i.setWaterMark(strArr, i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: a */
    public final void mo53253a(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f71696i.setWaterMark(bitmap, i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: a */
    public final void mo53249a(Context context) {
        this.f71696i.setNativeLibraryDir(context.getApplicationInfo().nativeLibraryDir);
    }

    /* renamed from: a */
    public final void mo53271a(String str, float f) {
        C85315al.m146639b(f71665a, "ret = ".concat(String.valueOf(this.f71696i.setFilterNew(str, f))));
    }

    /* renamed from: b */
    public final void mo53306b(String str) {
        C85315al.m146639b(f71665a, "ret = ".concat(String.valueOf(this.f71696i.setFilter(str))));
    }

    /* renamed from: a */
    public final void mo53273a(String str, String str2, float f) {
        this.f71696i.setFilter(str, str2, f);
    }

    /* renamed from: a */
    public final void mo53274a(String str, String str2, float f, float f2, float f3) {
        this.f71696i.setFilterNew(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo53260a(C29983a.AbstractC29985b bVar) {
        this.f71696i.setOnOpenGLCallback(bVar);
    }

    /* renamed from: a */
    public final int mo53219a(final String str, int[] iArr, boolean z, final Bitmap.CompressFormat compressFormat, C29983a.AbstractC29986c cVar, boolean z2) {
        int i;
        if (compressFormat == Bitmap.CompressFormat.JPEG) {
            i = 1;
        } else {
            i = compressFormat == Bitmap.CompressFormat.PNG ? 0 : -1;
        }
        return this.f71696i.shotScreen(str, iArr, z, i, new RecordInvoker.OnPictureCallback() {
            /* class com.p2082ss.android.medialib.presenter.C30031g.C300374 */

            static {
                Covode.recordClassIndex(36523);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnPictureCallback
            public final void onResult(int[] iArr, int i, int i2) {
                MethodCollector.m26663i(663);
                Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
                C29987b.m60522a(createBitmap, str, compressFormat);
                if (createBitmap != null) {
                    createBitmap.recycle();
                }
                MethodCollector.m26664o(663);
            }
        }, cVar, z2);
    }

    /* renamed from: a */
    public final int mo53227a(int[] iArr, boolean z, final AbstractC30046d dVar, boolean z2) {
        return this.f71696i.shotScreen("", iArr, z, -1, new RecordInvoker.OnPictureCallback() {
            /* class com.p2082ss.android.medialib.presenter.C30031g.C300385 */

            static {
                Covode.recordClassIndex(36524);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnPictureCallback
            public final void onResult(int[] iArr, int i, int i2) {
                MethodCollector.m26663i(671);
                C30031g.this.f71696i.setIsDuringScreenshot(false);
                if (iArr == null || iArr.length <= 0 || i <= 0 || i2 <= 0) {
                    AbstractC30046d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo53395a(null, -3000);
                    }
                    MethodCollector.m26664o(671);
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
                AbstractC30046d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.mo53395a(createBitmap, 0);
                }
                MethodCollector.m26664o(671);
            }
        }, new C29983a.AbstractC29986c() {
            /* class com.p2082ss.android.medialib.presenter.C30031g.C300396 */

            static {
                Covode.recordClassIndex(36525);
            }

            @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29986c
            /* renamed from: a */
            public final void mo52800a(int i) {
                AbstractC30046d dVar = dVar;
                if (dVar != null && i < 0) {
                    dVar.mo53395a(null, i);
                }
            }
        }, z2);
    }

    /* renamed from: a */
    public final int mo53224a(final boolean z, int[] iArr, boolean z2, final AbstractC30046d dVar, boolean z3, final AbstractC30047e eVar, boolean z4) {
        MethodCollector.m26663i(762);
        C300418 r12 = null;
        final Bitmap createBitmap = z ? Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888) : null;
        C300407 r9 = new RecordInvoker.OnPictureCallback() {
            /* class com.p2082ss.android.medialib.presenter.C30031g.C300407 */

            static {
                Covode.recordClassIndex(36526);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnPictureCallback
            public final void onResult(int[] iArr, int i, int i2) {
                MethodCollector.m26663i(585);
                if (iArr == null || iArr.length <= 0 || i <= 0) {
                    if (i == -1 && i2 == -1 && iArr == null) {
                        AbstractC30046d dVar = dVar;
                        if (dVar != null) {
                            dVar.mo53395a(createBitmap, 0);
                            MethodCollector.m26664o(585);
                            return;
                        }
                        MethodCollector.m26664o(585);
                    }
                } else if (i2 > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
                    AbstractC30046d dVar2 = dVar;
                    if (dVar2 != null) {
                        dVar2.mo53395a(createBitmap, 0);
                    }
                    MethodCollector.m26664o(585);
                    return;
                }
                AbstractC30046d dVar3 = dVar;
                if (dVar3 != null) {
                    dVar3.mo53395a(null, -3000);
                }
                if (z && !createBitmap.isRecycled()) {
                    createBitmap.recycle();
                }
                MethodCollector.m26664o(585);
            }
        };
        if (eVar != null) {
            r12 = new RecordInvoker.OnPictureCallback() {
                /* class com.p2082ss.android.medialib.presenter.C30031g.C300418 */

                static {
                    Covode.recordClassIndex(36527);
                }

                @Override // com.p2082ss.android.medialib.RecordInvoker.OnPictureCallback
                public final void onResult(int[] iArr, int i, int i2) {
                    if (iArr == null || iArr.length <= 0 || i <= 0 || i2 <= 0) {
                        eVar.mo53396a(null, i, i2);
                    } else {
                        eVar.mo53396a(iArr, i, i2);
                    }
                }
            };
        }
        int shotHDScreen = this.f71696i.shotHDScreen("", iArr, z2, -1, r9, new C29983a.AbstractC29986c() {
            /* class com.p2082ss.android.medialib.presenter.C30031g.C300429 */

            static {
                Covode.recordClassIndex(36528);
            }

            @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29986c
            /* renamed from: a */
            public final void mo52800a(int i) {
                AbstractC30046d dVar = dVar;
                if (dVar != null && i < 0) {
                    dVar.mo53395a(null, i);
                }
            }
        }, z3, r12, createBitmap, z4);
        MethodCollector.m26664o(762);
        return shotHDScreen;
    }

    /* renamed from: a */
    public final int mo53223a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f71696i.slamDeviceConfig(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final int mo53226a(double[] dArr, double d) {
        return this.f71696i.slamProcessIngestOri(dArr, d);
    }

    /* renamed from: a */
    public final int mo53217a(String str, int i, int i2, String str2) {
        return this.f71696i.slamSetInputText(str, i, i2, str2);
    }

    /* renamed from: a */
    public final int mo53212a(RecordInvoker.OnARTextCountCallback onARTextCountCallback) {
        return this.f71696i.slamGetTextLimitCount(onARTextCountCallback);
    }

    /* renamed from: a */
    public final int mo53211a(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
        return this.f71696i.slamGetTextParagraphContent(onARTextContentCallback);
    }

    /* renamed from: a */
    public final int mo53210a(RecordInvoker.OnARTextBitmapCallback onARTextBitmapCallback) {
        return this.f71696i.slamGetTextBitmap(onARTextBitmapCallback);
    }

    /* renamed from: a */
    public final void mo53268a(AbstractC85313aj ajVar) {
        this.f71696i.addLandMarkDetectListener(ajVar);
    }

    /* renamed from: b */
    public final void mo53305b(AbstractC85313aj ajVar) {
        this.f71696i.removeLandMarkDetectListener(ajVar);
    }

    /* renamed from: a */
    public final int mo53207a(Bitmap bitmap) {
        return this.f71696i.setSlamFace(bitmap);
    }

    /* renamed from: a */
    public final int mo53203a(int i, String str, long j, long j2) {
        return this.f71696i.addTrack(i, str, j, j2);
    }

    /* renamed from: a */
    public final int mo53214a(ImageFrame imageFrame, boolean z) {
        SurfaceTexture surfaceTexture;
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.f71668C;
        if (!(onFrameAvailableListener == null || (surfaceTexture = this.f71710w) == null)) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
        return this.f71696i.onDrawFrame(imageFrame, z);
    }

    /* renamed from: a */
    public final int mo53213a(ImageFrame imageFrame, int i, boolean z) {
        return this.f71696i.onDrawFrame(imageFrame, i, z);
    }

    /* renamed from: a */
    public final void mo53244a(int i, long j, long j2, String str) {
        this.f71696i.sendEffectMsg(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo53254a(MessageCenter.Listener listener) {
        this.f71696i.setMessageListenerV2(listener);
    }

    /* renamed from: a */
    public final void mo53255a(RecordInvoker.FaceResultCallback faceResultCallback) {
        this.f71696i.registerFaceResultCallback(true, faceResultCallback);
    }

    /* renamed from: a */
    public final void mo53239a(float f, float f2, float f3, float f4) {
        mo53279a(true, f, f2, f3, f4, true, 0, 0, 0, false, false, true);
    }

    /* renamed from: a */
    public final void mo53279a(boolean z, float f, float f2, float f3, float f4, boolean z2, int i, long j, int i2, boolean z3, boolean z4, boolean z5) {
        this.f71696i.setEnigmaDetectParams(z, f, f2, f3, f4, z2, i, j, i2, z3, z4, z5);
    }

    /* renamed from: a */
    public final void mo53280a(boolean z, long j) {
        this.f71696i.enableScan(z, j);
    }

    /* renamed from: a */
    public final void mo53259a(RecordInvoker.OnSkeletonDetectCallback onSkeletonDetectCallback) {
        this.f71696i.registerSkeletonDetectCallback(onSkeletonDetectCallback);
    }

    /* renamed from: a */
    public final void mo53256a(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback) {
        this.f71696i.registerCherEffectParamCallback(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo53285a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f71696i.recoverCherEffect(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo53265a(AbstractC30045c cVar, int i) {
        C300352 r1;
        boolean z;
        this.f71695h = cVar;
        RecordInvoker recordInvoker = this.f71696i;
        if (cVar == null) {
            r1 = null;
        } else {
            r1 = new RecordInvoker.OnFrameCallback() {
                /* class com.p2082ss.android.medialib.presenter.C30031g.C300352 */

                /* renamed from: a */
                volatile C30016a f71717a = new C30016a();

                /* renamed from: c */
                private double f71719c = 0.0d;

                /* renamed from: d */
                private double f71720d = 0.0d;

                /* renamed from: e */
                private float f71721e = 0.0f;

                static {
                    Covode.recordClassIndex(36521);
                }

                @Override // com.p2082ss.android.medialib.RecordInvoker.OnFrameCallback
                public final void onFrame(int i, double d) {
                    this.f71717a.f71634b = i;
                    this.f71717a.f71638f = (long) d;
                    this.f71717a.f71641i = C30031g.this.f71705r;
                    if (C30031g.this.f71695h != null) {
                        C30031g.this.f71695h.mo53393a(this.f71717a);
                    }
                }

                @Override // com.p2082ss.android.medialib.RecordInvoker.OnFrameCallback
                public final void onInit(EGLContext eGLContext, int i, int i2, int i3, long j) {
                    this.f71717a.f71633a = eGLContext;
                    this.f71717a.f71635c = i;
                    this.f71717a.f71636d = i2;
                    this.f71717a.f71637e = i3;
                    this.f71717a.f71639g = j;
                    this.f71721e = ((Float) C85568t.m147473a().mo131557a("ve_recorder_fps_downgrade", Float.valueOf(-1.0f))).floatValue();
                }

                @Override // com.p2082ss.android.medialib.RecordInvoker.OnFrameCallback
                public final void onFrame(ByteBuffer byteBuffer, int i, int i2, int i3, double d) {
                    this.f71717a.f71640h = byteBuffer;
                    this.f71717a.f71635c = i;
                    this.f71717a.f71636d = i2;
                    this.f71717a.f71637e = i3;
                    this.f71717a.f71638f = (long) d;
                    this.f71717a.f71641i = C30031g.this.f71705r;
                    if (C30031g.this.f71695h != null) {
                        C30031g.this.f71695h.mo53393a(this.f71717a);
                    }
                }
            };
            if (cVar.mo53394b()) {
                z = true;
                recordInvoker.setFrameCallback(r1, z, i);
            }
        }
        z = false;
        recordInvoker.setFrameCallback(r1, z, i);
    }

    /* renamed from: b */
    public final void mo53307b(String str, String str2) {
        this.f71696i.setRenderCacheString(str, str2);
    }

    /* renamed from: a */
    public final void mo53258a(RecordInvoker.OnRunningErrorCallback onRunningErrorCallback) {
        this.f71696i.setRunningErrorCallback(onRunningErrorCallback);
    }

    /* renamed from: a */
    public final void mo53261a(AbstractC30011a aVar) {
        this.f71696i.setFaceDetectListener2(aVar);
    }

    /* renamed from: a */
    public final void mo53262a(AbstractC30012b bVar) {
        this.f71696i.setNativeInitListener2(bVar);
    }

    /* renamed from: a */
    public final void mo53264a(IStickerRequestCallback iStickerRequestCallback) {
        this.f71696i.setStickerRequestCallback(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final int mo53228a(String[] strArr, int i) {
        return this.f71696i.setComposerNodes(strArr, 0);
    }

    /* renamed from: a */
    public final int mo53205a(int i, String[] strArr, String[] strArr2, float[] fArr) {
        return this.f71696i.updateMultiComposerNodes(2, strArr, strArr2, fArr);
    }

    /* renamed from: b */
    public final int mo53299b(String[] strArr, int i) {
        return this.f71696i.appendComposerNodes(strArr, i);
    }

    /* renamed from: a */
    public final void mo53263a(AbstractC30013c cVar) {
        this.f71696i.addSlamDetectListener2(cVar);
    }

    /* renamed from: b */
    public final void mo53304b(AbstractC30013c cVar) {
        this.f71696i.removeSlamDetectListener2(cVar);
    }

    /* renamed from: a */
    public final int mo53215a(VEEffectParams vEEffectParams) {
        return this.f71696i.setVEEffectParams(vEEffectParams);
    }

    /* renamed from: a */
    public final boolean mo53287a(C85392bf bfVar, int i) {
        return this.f71696i.processTouchEvent(bfVar, i);
    }

    /* renamed from: a */
    public final int mo53222a(boolean z, String str) {
        if (!this.f71699l || this.f71698k) {
            return this.f71696i.setEnableAEC(z, str);
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo53220a(boolean z, int i) {
        return this.f71696i.setLoudness(z, i);
    }

    /* renamed from: a */
    public final void mo53270a(Object obj) {
        this.f71696i.attachExtFrameData(obj);
    }

    /* renamed from: a */
    public final void mo53269a(VEBaseRecorderLensParams vEBaseRecorderLensParams, RecordInvoker.OnLensResultCallback onLensResultCallback) {
        this.f71696i.setLensParams(vEBaseRecorderLensParams, onLensResultCallback);
    }

    /* renamed from: a */
    public final void mo53245a(int i, boolean z) {
        this.f71696i.enableLensProcess(24, z);
    }

    /* renamed from: a */
    public final void mo53247a(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        this.f71696i.setSafeArea(i, vESafeAreaParamsArr);
    }

    /* renamed from: a */
    public final void mo53281a(boolean z, String str, String str2) {
        this.f71696i.enableAudioAlgorithmParam(z, str, str2);
    }

    /* renamed from: a */
    public final void mo53278a(boolean z, double d) {
        this.f71696i.enableAudioLoudnessBalanceFilter(z, d);
    }

    /* renamed from: b */
    public final void mo53309b(boolean z, String str, String str2) {
        this.f71696i.enableBachAlgorithm(z, str, str2);
    }

    /* renamed from: a */
    public final boolean mo53286a(Context context, AudioManagerCallback audioManagerCallback) {
        Pair<Integer, Integer> a = C29993a.m60538a(context);
        return this.f71696i.setEffectAudioManagerCallback(((Integer) a.first).intValue(), ((Integer) a.second).intValue(), false, audioManagerCallback);
    }

    /* renamed from: a */
    public final void mo53267a(VEARCoreParam vEARCoreParam) {
        this.f71696i.setARCoreParam(vEARCoreParam);
    }

    /* renamed from: a */
    public final void mo53276a(String str, Map<Integer, Float> map) {
        this.f71696i.setReshapeResource(str);
        if (map != null) {
            for (Map.Entry<Integer, Float> entry : map.entrySet()) {
                m60580b(entry.getKey().intValue(), entry.getValue().floatValue());
            }
        }
    }

    /* renamed from: A */
    public final int mo53183A() {
        return this.f71696i.pauseRender();
    }

    /* renamed from: B */
    public final int mo53185B() {
        return this.f71696i.startRender();
    }

    /* renamed from: D */
    public final int mo53189D() {
        return this.f71696i.turnToOffScreenRender();
    }

    /* renamed from: E */
    public final VEMapBufferInfo mo53191E() {
        return this.f71696i.getMapBuffer();
    }

    /* renamed from: F */
    public final void mo53192F() {
        this.f71696i.onDestroy();
    }

    /* renamed from: f */
    public final long mo53335f() {
        return this.f71696i.getEndFrameTime();
    }

    /* renamed from: h */
    public final int mo53344h() {
        return this.f71696i.getLastRecordFrameNum();
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public void lackPermission() {
        AudioRecorderInterface audioRecorderInterface = this.f71693f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.lackPermission();
        }
    }

    /* renamed from: m */
    public final int mo53361m() {
        return this.f71696i.stopPrePlay();
    }

    /* renamed from: o */
    public final void mo53365o() {
        this.f71696i.setModeChangeState(2);
    }

    /* renamed from: p */
    public final void mo53367p() {
        this.f71696i.releaseGPUResources();
    }

    /* renamed from: s */
    public final void mo53374s() {
        this.f71696i.setSwitchEffectInGLTask(true);
    }

    /* renamed from: t */
    public final void mo53377t() {
        this.f71696i.unRegisterFaceResultCallback();
    }

    /* renamed from: u */
    public final EnigmaResult mo53379u() {
        return this.f71696i.getEnigmaResult();
    }

    /* renamed from: v */
    public final void mo53381v() {
        this.f71696i.registerSkeletonDetectCallback(null);
    }

    /* renamed from: x */
    public final int mo53385x() {
        return this.f71696i.bindEffectAudioProcessor(0, 0, false);
    }

    static {
        Covode.recordClassIndex(36517);
    }

    /* renamed from: C */
    public final long mo53188C() {
        return this.f71696i.getEffectHandler();
    }

    /* renamed from: b */
    public final float mo53290b() {
        return this.f71696i.getReactionCamRotation();
    }

    /* renamed from: g */
    public final long mo53341g() {
        return this.f71696i.getLastAudioLength();
    }

    /* renamed from: w */
    public final void mo53384w() {
        mo53265a((AbstractC30045c) null, -1);
    }

    /* renamed from: z */
    public final float[] mo53389z() {
        return this.f71696i.getAECSuggestVolume();
    }

    /* renamed from: G */
    private synchronized void m60576G() {
        MethodCollector.m26663i(16);
        this.f71696i.clearFragFile();
        MethodCollector.m26664o(16);
    }

    /* renamed from: I */
    private boolean m60578I() {
        if (this.f71692e) {
            C29980b bVar = this.f71709v;
            if (bVar == null || !bVar.mo52795b()) {
                return false;
            }
            return true;
        }
        BufferedAudioRecorder bufferedAudioRecorder = this.f71689b;
        if (bufferedAudioRecorder == null || !bufferedAudioRecorder.isProcessing()) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    private void m60579J() {
        BufferedAudioRecorder bufferedAudioRecorder;
        if (!this.f71692e && (bufferedAudioRecorder = this.f71689b) != null) {
            bufferedAudioRecorder.attachRecordingObserver(new AbstractC1214u<Boolean>() {
                /* class com.p2082ss.android.medialib.presenter.C30031g.C300363 */

                static {
                    Covode.recordClassIndex(36522);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    C30031g.this.f71707t = bool.booleanValue();
                    C85315al.m146639b(C30031g.f71665a, "change audio recording state: " + C30031g.this.f71707t);
                }
            });
        }
    }

    /* renamed from: y */
    public static int m60581y() {
        C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_audio_source_type");
        if (a == null || !(a.f191742b instanceof Integer)) {
            return 1;
        }
        return ((Integer) a.f191742b).intValue();
    }

    /* renamed from: j */
    public final String[] mo53355j() {
        return this.f71696i.getRecordedVideoPaths();
    }

    /* renamed from: l */
    public final synchronized void mo53358l() {
        MethodCollector.m26663i(40);
        m60577H();
        MethodCollector.m26664o(40);
    }

    /* renamed from: n */
    public final void mo53363n() {
        if (!this.f71692e && this.f71689b != null && m60578I()) {
            this.f71689b.waitUtilAudioProcessDone();
        }
    }

    /* renamed from: q */
    public final void mo53369q() {
        BufferedAudioRecorder bufferedAudioRecorder;
        if (!this.f71692e && (bufferedAudioRecorder = this.f71689b) != null) {
            bufferedAudioRecorder.stopRecording();
        }
        this.f71696i.stopPlay();
        mo53363n();
    }

    /* renamed from: r */
    public final void mo53372r() {
        if (!this.f71692e) {
            BufferedAudioRecorder bufferedAudioRecorder = this.f71689b;
            if (bufferedAudioRecorder != null) {
                bufferedAudioRecorder.stopRecording();
                return;
            }
            return;
        }
        this.f71709v.mo52792a();
    }

    /* renamed from: e */
    public final void mo53332e() {
        this.f71696i.uninitBeautyPlay();
    }

    /* renamed from: i */
    public final void mo53349i() {
        MethodCollector.m26663i(23);
        synchronized (this) {
            try {
                if (m60578I()) {
                    C85315al.m146642d(f71665a, "Audio processing, will delete after nativeCloseWavFile");
                    this.f71677L = true;
                    return;
                }
                C85315al.m146637a(f71665a, "Delete last frag now");
                this.f71696i.deleteLastFrag();
                MethodCollector.m26664o(23);
            } finally {
                MethodCollector.m26664o(23);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023 A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53357k() {
        /*
            r3 = this;
            boolean r0 = r3.f71699l
            if (r0 == 0) goto L_0x000b
            boolean r1 = r3.f71706s
            boolean r0 = r3.f71698k
            r1 = r1 & r0
            r3.f71706s = r1
        L_0x000b:
            boolean r2 = r3.f71692e
            r1 = 1
            r0 = 0
            if (r2 == 0) goto L_0x001a
            boolean r0 = r3.f71706s
            if (r0 == 0) goto L_0x0023
            com.ss.android.medialib.a.b r0 = r3.f71709v
            if (r0 == 0) goto L_0x0023
        L_0x0019:
            return r1
        L_0x001a:
            boolean r0 = r3.f71706s
            if (r0 == 0) goto L_0x0023
            org.libsdl.app.BufferedAudioRecorder r0 = r3.f71689b
            if (r0 == 0) goto L_0x0023
            goto L_0x0019
        L_0x0023:
            r1 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.presenter.C30031g.mo53357k():boolean");
    }

    /* renamed from: H */
    private synchronized int m60577H() {
        MethodCollector.m26663i(58);
        if (this.f71683R) {
            this.f71685T = false;
        }
        if (this.f71674I.get()) {
            MethodCollector.m26664o(58);
            return -1;
        }
        this.f71674I.getAndSet(true);
        int stopRecord = this.f71696i.stopRecord(false);
        if (this.f71692e) {
            C29980b bVar = this.f71709v;
            if (bVar != null && !this.f71680O) {
                bVar.mo52792a();
                this.f71681P.getAndSet(-1);
            }
        } else {
            BufferedAudioRecorder bufferedAudioRecorder = this.f71689b;
            if (bufferedAudioRecorder != null && !this.f71680O) {
                bufferedAudioRecorder.stopFeeding();
            }
        }
        this.f71674I.getAndSet(false);
        TEMonitorInvoker.nativeMonitorPerfWithType(0);
        MethodCollector.m26664o(58);
        return stopRecord;
    }

    public C30031g() {
        RecordInvoker recordInvoker = new RecordInvoker();
        this.f71696i = recordInvoker;
        recordInvoker.resetPerfStats();
        this.f71697j = new C30049i(this.f71696i);
    }

    /* renamed from: d */
    public final int[] mo53327d() {
        return this.f71696i.getReactionPosMarginInViewPixel();
    }

    /* renamed from: c */
    public final int[] mo53318c() {
        return this.f71696i.getReactionCameraPosInViewPixel();
    }

    /* renamed from: C */
    public final int mo53187C(boolean z) {
        return this.f71696i.enableDuetGlFinish(z);
    }

    /* renamed from: c */
    public final float mo53310c(String str) {
        return this.f71696i.getFilterIntensity(str);
    }

    /* renamed from: d */
    public final int mo53321d(float f) {
        return m60580b(12, f);
    }

    /* renamed from: g */
    public final int mo53340g(int i) {
        return this.f71696i.setCodecType(i);
    }

    /* renamed from: k */
    public final void mo53356k(boolean z) {
        this.f71696i.setCameraClose(z);
    }

    /* renamed from: n */
    public final boolean mo53364n(boolean z) {
        return this.f71696i.setSharedTextureStatus(z);
    }

    /* renamed from: q */
    public final void mo53370q(boolean z) {
        this.f71696i.setCameraFirstFrameOptimize(z);
    }

    /* renamed from: r */
    public final int mo53371r(boolean z) {
        return this.f71696i.slamNotifyHideKeyBoard(z);
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public void recordStatus(boolean z) {
        AudioRecorderInterface audioRecorderInterface = this.f71693f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.recordStatus(z);
        }
    }

    /* renamed from: w */
    public final int mo53383w(boolean z) {
        return this.f71696i.setHandDetectLowpower(z);
    }

    /* renamed from: y */
    public final void mo53387y(boolean z) {
        this.f71696i.enableLandMark(z);
    }

    /* renamed from: z */
    public final void mo53388z(boolean z) {
        RecordInvoker recordInvoker = this.f71696i;
        if (recordInvoker != null) {
            recordInvoker.setEnableDuetV2(z);
        }
    }

    /* renamed from: A */
    public final void mo53184A(boolean z) {
        this.f71696i.setBgmMute(z);
    }

    /* renamed from: B */
    public final int mo53186B(boolean z) {
        return this.f71696i.enableRecordMaxDuration(z);
    }

    /* renamed from: D */
    public final void mo53190D(boolean z) {
        this.f71696i.setUseMultiPreviewRatio(z);
    }

    /* renamed from: e */
    public final int mo53330e(int i) {
        return this.f71696i.initImageDrawer(i);
    }

    /* renamed from: f */
    public final ImageFrame mo53336f(String str) {
        return this.f71696i.getFrameByKey(str);
    }

    /* renamed from: h */
    public final int mo53345h(int i) {
        return this.f71696i.setRecordMode(i);
    }

    /* renamed from: i */
    public final void mo53350i(boolean z) {
        this.f71696i.enableTimestampCallback(z);
    }

    /* renamed from: j */
    public final void mo53354j(boolean z) {
        this.f71696i.enableAutoTestLog(z);
    }

    /* renamed from: l */
    public final void mo53359l(boolean z) {
        RecordInvoker recordInvoker = this.f71696i;
        if (recordInvoker != null) {
            recordInvoker.setDetectionMode(z);
        }
    }

    /* renamed from: o */
    public final void mo53366o(boolean z) {
        this.f71696i.enablePBO(z);
    }

    /* renamed from: p */
    public final void mo53368p(boolean z) {
        this.f71696i.enableWaterMark(z);
    }

    /* renamed from: s */
    public final void mo53375s(boolean z) {
        this.f71696i.pauseEffectAudio(z);
    }

    /* renamed from: t */
    public final void mo53378t(boolean z) {
        this.f71696i.enableEffectBGM(z);
    }

    /* renamed from: u */
    public final void mo53380u(boolean z) {
        this.f71696i.enableEffect(z);
    }

    /* renamed from: v */
    public final void mo53382v(boolean z) {
        this.f71696i.setRecordContentType(z);
    }

    /* renamed from: x */
    public final void mo53386x(boolean z) {
        this.f71696i.useLargeMattingModel(z);
    }

    /* renamed from: b */
    public final int mo53291b(double d) {
        return this.f71696i.onDrawFrameTime(d);
    }

    /* renamed from: d */
    public final int mo53323d(String str) {
        return this.f71696i.slamSetLanguge(str);
    }

    /* renamed from: e */
    public final int mo53331e(String str) {
        return this.f71696i.setMusicNodes(str);
    }

    /* renamed from: f */
    public final void mo53337f(int i) {
        this.f71696i.setForceAlgorithmCnt(i);
    }

    /* renamed from: m */
    public final void mo53362m(boolean z) {
        BufferedAudioRecorder bufferedAudioRecorder;
        BufferedAudioRecorder bufferedAudioRecorder2;
        if (!z) {
            if (!this.f71692e && (bufferedAudioRecorder2 = this.f71689b) != null) {
                bufferedAudioRecorder2.unInit();
            }
        } else if (!this.f71692e && (bufferedAudioRecorder = this.f71689b) != null) {
            bufferedAudioRecorder.init(m60581y());
        }
        this.f71706s = z;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int closeWavFile(boolean z) {
        int closeWavFile;
        MethodCollector.m26663i(106);
        synchronized (this) {
            try {
                closeWavFile = this.f71696i.closeWavFile(z);
                AudioRecorderInterface audioRecorderInterface = this.f71693f;
                if (audioRecorderInterface != null) {
                    audioRecorderInterface.closeWavFile(z);
                }
                if (this.f71677L) {
                    this.f71696i.deleteLastFrag();
                }
                this.f71677L = false;
                C85315al.m146637a(f71665a, "closeWavFile");
            } finally {
                MethodCollector.m26664o(106);
            }
        }
        return closeWavFile;
    }

    /* renamed from: f */
    public final void mo53338f(boolean z) {
        this.f71696i.enableMakeUpBackground(z);
    }

    /* renamed from: g */
    public final void mo53343g(boolean z) {
        this.f71696i.enableClearColorAfterRender(z);
    }

    /* renamed from: h */
    public final void mo53347h(boolean z) {
        this.f71692e = z;
        if (z) {
            this.f71709v = new C29980b(this);
        } else {
            this.f71709v = null;
        }
    }

    /* renamed from: d */
    public final void mo53325d(int i) {
        this.f71696i.setDetectInterval(i);
    }

    /* renamed from: b */
    public final int mo53294b(long j) {
        return this.f71696i.setRecordMaxDuration(j);
    }

    /* renamed from: c */
    public final void mo53315c(float f) {
        this.f71696i.setScale(f);
    }

    /* renamed from: d */
    public final void mo53326d(boolean z) {
        this.f71696i.enablePreloadEffectRes(z);
    }

    /* renamed from: e */
    public final void mo53334e(boolean z) {
        this.f71696i.enableEffectRT(z);
    }

    /* renamed from: b */
    public final int mo53295b(Context context) {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || !packageManager.hasSystemFeature("android.hardware.audio.low_latency")) {
            z = false;
        } else {
            z = true;
        }
        String str = f71665a;
        C85315al.m146639b(str, "has low latency ? ".concat(String.valueOf(z)));
        Pair<Integer, Integer> a = C29993a.m60538a(context);
        C85315al.m146639b(str, "nativeSampleRate ? " + a.first + " nativeSamleBufferSize? " + a.second);
        return this.f71696i.bindEffectAudioProcessor(((Integer) a.first).intValue(), ((Integer) a.second).intValue(), true);
    }

    /* renamed from: c */
    public final void mo53316c(int i) {
        this.f71696i.changePreviewRadioMode(i);
    }

    /* renamed from: c */
    public final void mo53317c(boolean z) {
        this.f71696i.enable3buffer(z);
    }

    /* renamed from: b */
    private int m60580b(int i, float f) {
        return this.f71696i.setIntensityByType(i, f);
    }

    /* renamed from: a */
    public final int mo53196a(int i, float f) {
        return m60580b(i, f);
    }

    /* renamed from: e */
    public final int mo53329e(float f, float f2) {
        return this.f71696i.slamProcessDoubleClickEvent(f, f2);
    }

    /* renamed from: i */
    public final int mo53348i(int i, int i2) {
        return this.f71696i.removeTrack(i, i2);
    }

    /* renamed from: j */
    public final int mo53353j(int i, int i2) {
        return this.f71696i.setComposerMode(i, 0);
    }

    /* renamed from: d */
    public final int mo53322d(float f, float f2) {
        return this.f71696i.slamProcessRotationEvent(f, f2);
    }

    /* renamed from: c */
    public final int mo53312c(float f, float f2) {
        return this.f71696i.slamProcessScaleEvent(f, f2);
    }

    /* renamed from: g */
    public final void mo53342g(int i, int i2) {
        this.f71696i.setCamPreviewSize(i, i2);
    }

    /* renamed from: h */
    public final int mo53346h(int i, int i2) {
        return this.f71696i.startPlay(i, i2, Build.DEVICE, -1, -1);
    }

    /* renamed from: c */
    public final int mo53313c(String[] strArr, int i) {
        return this.f71696i.removeComposerNodes(strArr, i);
    }

    /* renamed from: d */
    public final int mo53324d(String str, String str2) {
        if (str2 != null) {
            return this.f71696i.animateImageToPreview(str, str2);
        }
        C85315al.m146642d(f71665a, "Illegal argument. imagePath can't be null. Consider using empty string to cancel.");
        return -100;
    }

    /* renamed from: b */
    public final int mo53293b(float f, float f2) {
        return this.f71696i.processTouchEvent(f, f2);
    }

    /* renamed from: c */
    public final C30031g mo53314c(int i, int i2) {
        this.f71676K = i;
        this.f71675J = i2;
        return this;
    }

    /* renamed from: e */
    public final void mo53333e(int i, int i2) {
        this.f71696i.setReactionBorderParam(i, i2);
    }

    /* renamed from: f */
    public final boolean mo53339f(int i, int i2) {
        return this.f71696i.posInReactionRegion(i, i2);
    }

    /* renamed from: d */
    public final int[] mo53328d(int i, int i2) {
        return this.f71696i.updateReactionCameraPos(0, 0, i, i2);
    }

    /* renamed from: a */
    public final synchronized int mo53201a(int i, String str) {
        int tryRestore;
        MethodCollector.m26663i(2058);
        m60576G();
        tryRestore = this.f71696i.tryRestore(i, str);
        MethodCollector.m26664o(2058);
        return tryRestore;
    }

    /* renamed from: c */
    public final int[] mo53319c(String str, String str2) {
        return this.f71696i.checkComposerNodeExclusion(str, str2);
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int initWavFile(int i, int i2, double d) {
        int initWavFile = this.f71696i.initWavFile(i, i2, d);
        AudioRecorderInterface audioRecorderInterface = this.f71693f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.initWavFile(i, i2, d);
            C85315al.m146637a(f71665a, "initWavFile");
        }
        return initWavFile;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int addPCMData(byte[] bArr, int i, long j) {
        if (this.f71692e) {
            C85315al.m146639b(f71665a, "onProcessData is running");
            this.f71696i.addPCMData(bArr, i, j);
            return 0;
        }
        if (this.f71683R && !this.f71685T && this.f71684S != null) {
            this.f71684S.addLastSafe(new C30024a(Arrays.copyOf(bArr, i), i));
        }
        this.f71696i.onAudioCallback(bArr, i);
        AudioRecorderInterface audioRecorderInterface = this.f71693f;
        if (audioRecorderInterface == null) {
            return 0;
        }
        audioRecorderInterface.addPCMData(bArr, i, j);
        C85315al.m146639b(f71665a, "addPCMData is running");
        return 0;
    }

    /* renamed from: a */
    public final int mo53198a(int i, int i2, long j) {
        return this.f71696i.seekTrack(i, i2, j);
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt, com.p2082ss.android.medialib.p2154a.RunnableC29977a.AbstractC29978a
    public int onProcessData(byte[] bArr, int i, long j) {
        C85315al.m146639b(f71665a, "onProcessData is running");
        if (this.f71683R) {
            if (!this.f71685T && this.f71684S != null) {
                for (int i2 = 0; i2 < this.f71684S.getMaxSize(); i2++) {
                    C30024a pollSafe = this.f71684S.pollSafe();
                    if (pollSafe != null) {
                        this.f71696i.addPCMData(pollSafe.f71662b, pollSafe.f71661a, 0);
                        C85315al.m146639b(f71665a, "cached buffer in");
                    }
                }
            }
            this.f71685T = true;
        }
        return this.f71696i.addPCMData(bArr, i, j);
    }

    /* renamed from: b */
    public final synchronized int mo53296b(Context context, int i, AudioRecorderInterface audioRecorderInterface) {
        BufferedAudioRecorder bufferedAudioRecorder;
        MethodCollector.m26663i(1947);
        if (this.f71689b == null && this.f71706s && (i & 1) != 0) {
            C85315al.m146637a(f71665a, "changeAudioRecord make sure audioRecorder will be created here !!");
        }
        int i2 = this.f71690c;
        if (i2 == i) {
            C85315al.m146641c(f71665a, "changeAudioRecord: no need");
            MethodCollector.m26664o(1947);
            return 1;
        } else if (context == null) {
            C85315al.m146642d(f71665a, "file " + C85315al.m146633a() + ",fun " + C85315al.m146640c() + ",line " + C85315al.m146638b() + ": context is null");
            MethodCollector.m26664o(1947);
            return -1000;
        } else {
            this.f71693f = audioRecorderInterface;
            int i3 = -2000;
            if ((i2 & 1 & i) == 0 && !this.f71692e && (bufferedAudioRecorder = this.f71689b) != null) {
                bufferedAudioRecorder.unInit();
                this.f71689b = null;
                C85315al.m146637a(f71665a, "changeAudioRecord: mAudioRecorder.unInit()");
            }
            if (this.f71706s && (i & 1) != 0 && !this.f71692e && this.f71689b == null) {
                BufferedAudioRecorder bufferedAudioRecorder2 = new BufferedAudioRecorder(this, this.f71702o, this.f71703p, this.f71704q, this.f71708u);
                this.f71689b = bufferedAudioRecorder2;
                bufferedAudioRecorder2.init(m60581y());
                m60579J();
                C85315al.m146637a(f71665a, "changeAudioRecord: mAudioRecorder.init()");
            }
            if ((i & 4) != 0) {
                this.f71696i.setBGMVolume(this.f71678M, -1);
                i3 = this.f71696i.initAudioPlayer(context, this.f71669D, this.f71672G + this.f71670E, this.f71691d, this.f71700m);
                C85315al.m146637a(f71665a, "changeAudioRecord: initAudioPlayer return: ".concat(String.valueOf(i3)));
            } else {
                this.f71696i.uninitAudioPlayer();
                mo53241a(0);
            }
            this.f71690c = i;
            MethodCollector.m26664o(1947);
            return i3;
        }
    }

    /* renamed from: b */
    public final int mo53297b(String str, float f, float f2) {
        return this.f71696i.setFaceMakeUp(str, f, f2);
    }

    /* renamed from: b */
    public final int mo53298b(String str, String str2, float f) {
        return this.f71696i.updateComposerNode(str, str2, f);
    }

    /* renamed from: a */
    public final int mo53193a(double d, double d2, double d3, double d4) {
        return this.f71696i.slamProcessIngestAcc(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final int mo53311c(double d, double d2, double d3, double d4) {
        return this.f71696i.slamProcessIngestGra(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo53197a(int i, float f, float f2, int i2) {
        return this.f71696i.slamProcessTouchEventByType(i, f, f2, i2);
    }

    /* renamed from: b */
    public final int mo53292b(double d, double d2, double d3, double d4) {
        return this.f71696i.slamProcessIngestGyr(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo53195a(float f, float f2, float f3, float f4, float f5) {
        return this.f71696i.slamProcessPanEvent(f, f2, f3, f4, f5);
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt
    public int initAudioConfig(int i, int i2, int i3, int i4, int i5) {
        C85315al.m146637a(f71665a, "initAudioConfig");
        AbstractC30043a aVar = this.f71694g;
        if (aVar != null) {
            aVar.mo53391a(i, i2);
        }
        return this.f71696i.initAudioConfig(i, i2, i3, i4, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r6 > 0) goto L_0x009b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo53194a(double r21, boolean r23, float r24, int r25, java.lang.String r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.presenter.C30031g.mo53194a(double, boolean, float, int, java.lang.String, java.lang.String):int");
    }

    /* renamed from: a */
    public final int mo53202a(int i, String str, int i2, int i3, String str2, String[] strArr, float[] fArr, boolean z, boolean z2) {
        return this.f71696i.setStickerPathWithTag(i, str, i2, i3, str2, strArr, fArr, z, z2);
    }

    /* renamed from: a */
    public final int mo53199a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z, boolean z2, boolean z3) {
        MethodCollector.m26663i(1967);
        String str3 = f71665a;
        C85315al.m146639b(str3, "init enter ");
        C30008h.m60555a().f71612a = this.f71696i;
        TEMonitorInvoker.nativeReset(0);
        C30695h.m63060a(0);
        int initBeautyPlay = this.f71696i.initBeautyPlay(i, i2, str, i3, i4, str2, i5, z, z2, z3);
        this.f71696i.setTextureTimeListener(this.f71688W);
        RecordInvoker.setRecordStopCallback(new RecordInvoker.AbstractC29971a() {
            /* class com.p2082ss.android.medialib.presenter.C30031g.C300321 */

            static {
                Covode.recordClassIndex(36518);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.AbstractC29971a
            /* renamed from: a */
            public final void mo52774a() {
                if (!C30031g.this.f71692e && C30031g.this.f71689b != null) {
                    C30031g.this.f71689b.markRecordStop();
                }
            }
        });
        C85315al.m146639b(str3, "init ret = ".concat(String.valueOf(initBeautyPlay)));
        MethodCollector.m26664o(1967);
        return initBeautyPlay;
    }

    /* renamed from: a */
    public final int mo53200a(int i, long j, float f, int i2, int i3, int i4, int i5, float f2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, int i12) {
        return this.f71696i.setDisplaySettings(i, j, f, i2, i3, i4, i5, f2, i6, i7, i8, i9, i10, i11, z, i12);
    }
}
