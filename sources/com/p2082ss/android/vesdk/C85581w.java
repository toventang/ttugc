package com.p2082ss.android.vesdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.medialib.C30004e;
import com.p2082ss.android.ttve.common.AbstractC30641b;
import com.p2082ss.android.ttve.common.C30651j;
import com.p2082ss.android.ttve.editorInfo.C30652a;
import com.p2082ss.android.ttve.mediacodec.TEAvcEncoder;
import com.p2082ss.android.ttve.model.C30675c;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30689e;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.monitor.C30696i;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.ttve.nativePort.NativeCallbacks;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.ttve.nativePort.TEReverseCallback;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;
import com.p2082ss.android.ttve.p2190a.C30634a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEMVAlgorithmConfig;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p2082ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p2082ss.android.vesdk.clipparam.VEClipParam;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p2082ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.p2082ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.p2082ss.android.vesdk.model.BefTextLayoutResult;
import com.p2082ss.android.vesdk.p4390f.AbstractC85464a;
import com.p2082ss.android.vesdk.p4390f.AbstractC85465b;
import com.p2082ss.android.vesdk.p4390f.AbstractC85466c;
import com.p2082ss.android.vesdk.p4390f.AbstractC85467d;
import com.p2082ss.android.vesdk.p4390f.AbstractC85468e;
import com.p2082ss.android.vesdk.p4390f.AbstractC85469f;
import com.p2082ss.android.vesdk.p4391g.C85509a;
import com.p2082ss.android.vesdk.runtime.C85553b;
import com.p2082ss.android.vesdk.runtime.C85557f;
import com.p2082ss.android.vesdk.runtime.VEPublishSettingManager;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import com.p2082ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.p2082ss.android.vesdk.utils.DigestUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.w */
public class C85581w implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: at */
    private static volatile boolean f191759at = true;

    /* renamed from: aw */
    private static Map<String, Pair<Long, String>> f191760aw = new HashMap();

    /* renamed from: ax */
    private static final Object f191761ax = new Object();

    /* renamed from: ay */
    private static volatile boolean f191762ay = false;

    /* renamed from: az */
    private static int f191763az = 0;

    /* renamed from: A */
    public int f191764A;

    /* renamed from: B */
    public TEInterface f191765B;

    /* renamed from: C */
    public SurfaceTexture f191766C;

    /* renamed from: D */
    public Surface f191767D;

    /* renamed from: E */
    public SurfaceView f191768E;

    /* renamed from: F */
    public TextureView f191769F;

    /* renamed from: G */
    public int f191770G;

    /* renamed from: H */
    public long f191771H;

    /* renamed from: I */
    public long f191772I;

    /* renamed from: J */
    public long f191773J;

    /* renamed from: K */
    public long f191774K;

    /* renamed from: L */
    public long f191775L;

    /* renamed from: M */
    public long f191776M;

    /* renamed from: N */
    public long f191777N;

    /* renamed from: O */
    public boolean f191778O;

    /* renamed from: P */
    public int f191779P;

    /* renamed from: Q */
    public EnumC85613l f191780Q;

    /* renamed from: R */
    public EnumC85612k f191781R;

    /* renamed from: S */
    public EnumC85614m f191782S;

    /* renamed from: T */
    public boolean f191783T;

    /* renamed from: U */
    public int f191784U;

    /* renamed from: V */
    String f191785V;

    /* renamed from: W */
    long f191786W;

    /* renamed from: X */
    public boolean f191787X;

    /* renamed from: Y */
    public RunnableC85603b f191788Y;

    /* renamed from: Z */
    public VEListener.AbstractC85251t f191789Z;

    /* renamed from: a */
    AbstractC85467d f191790a;

    /* renamed from: aA */
    private int f191791aA;

    /* renamed from: aB */
    private AbstractC30641b f191792aB;

    /* renamed from: aC */
    private AbstractC30641b f191793aC;

    /* renamed from: aD */
    private int f191794aD;

    /* renamed from: aE */
    private int f191795aE;

    /* renamed from: aF */
    private int f191796aF;

    /* renamed from: aG */
    private int f191797aG;

    /* renamed from: aH */
    private int f191798aH;

    /* renamed from: aI */
    private boolean f191799aI;

    /* renamed from: aJ */
    private boolean f191800aJ;

    /* renamed from: aK */
    private boolean f191801aK;

    /* renamed from: aL */
    private boolean f191802aL;

    /* renamed from: aM */
    private boolean f191803aM;

    /* renamed from: aN */
    private float f191804aN;

    /* renamed from: aO */
    private float f191805aO;

    /* renamed from: aP */
    private float f191806aP;

    /* renamed from: aQ */
    private int f191807aQ;

    /* renamed from: aR */
    private NativeCallbacks.AbstractC30708h f191808aR;

    /* renamed from: aS */
    private NativeCallbacks.AbstractC30703c f191809aS;

    /* renamed from: aT */
    private NativeCallbacks.AbstractC30704d f191810aT;

    /* renamed from: aU */
    private NativeCallbacks.AbstractC30704d f191811aU;

    /* renamed from: aV */
    private NativeCallbacks.AbstractC30707g f191812aV;

    /* renamed from: aW */
    private NativeCallbacks.AbstractC30705e f191813aW;

    /* renamed from: aa */
    public VEListener.AbstractC85254w f191814aa;

    /* renamed from: ab */
    public VEListener.AbstractC85254w f191815ab;

    /* renamed from: ac */
    public C30696i f191816ac;

    /* renamed from: ad */
    public boolean f191817ad;

    /* renamed from: ae */
    public Bitmap f191818ae;

    /* renamed from: af */
    public int f191819af;

    /* renamed from: ag */
    public int f191820ag;

    /* renamed from: ah */
    public int f191821ah;

    /* renamed from: ai */
    public float f191822ai;

    /* renamed from: aj */
    public final TextureView.SurfaceTextureListener f191823aj;

    /* renamed from: ak */
    public SurfaceHolder.Callback2 f191824ak;

    /* renamed from: al */
    public String f191825al;

    /* renamed from: am */
    public double f191826am;

    /* renamed from: an */
    public double f191827an;

    /* renamed from: ao */
    public double f191828ao;

    /* renamed from: ap */
    public double f191829ap;

    /* renamed from: aq */
    private AbstractC85465b f191830aq;

    /* renamed from: ar */
    private AbstractC85464a f191831ar;

    /* renamed from: as */
    private boolean f191832as;

    /* renamed from: au */
    private VERecordData f191833au;

    /* renamed from: av */
    private final String f191834av;

    /* renamed from: b */
    public AbstractC85469f f191835b;

    /* renamed from: c */
    public AbstractC85466c f191836c;

    /* renamed from: d */
    public AbstractC85468e f191837d;

    /* renamed from: e */
    public C85553b f191838e;

    /* renamed from: f */
    public VESize f191839f;

    /* renamed from: g */
    String f191840g;

    /* renamed from: h */
    public HandlerC85610i f191841h;

    /* renamed from: i */
    public volatile VEListener.AbstractC85250s f191842i;

    /* renamed from: j */
    public volatile VEListener.AbstractC85248q f191843j;

    /* renamed from: k */
    public volatile VEListener.AbstractC85253v f191844k;

    /* renamed from: l */
    public volatile VEListener.AbstractC85231aj f191845l;

    /* renamed from: m */
    public volatile VEListener.AbstractC85247p f191846m;

    /* renamed from: n */
    public volatile VEListener.AbstractC85256y f191847n;

    /* renamed from: o */
    public volatile VEListener.AbstractC85223ab f191848o;

    /* renamed from: p */
    public volatile VEListener.AbstractC85236e f191849p;

    /* renamed from: q */
    public AbstractC85541q f191850q;

    /* renamed from: r */
    public AbstractC85541q f191851r;

    /* renamed from: s */
    public C30651j f191852s;

    /* renamed from: t */
    public C30634a f191853t;

    /* renamed from: u */
    public String f191854u;

    /* renamed from: v */
    public Map<Integer, String> f191855v;

    /* renamed from: w */
    public AtomicBoolean f191856w;

    /* renamed from: x */
    public int f191857x;

    /* renamed from: y */
    public int f191858y;

    /* renamed from: z */
    public Boolean f191859z;

    /* renamed from: com.ss.android.vesdk.w$c */
    public interface AbstractC85604c {
        static {
            Covode.recordClassIndex(99788);
        }

        /* renamed from: a */
        BefTextLayoutResult mo131754a();
    }

    /* renamed from: com.ss.android.vesdk.w$d */
    public interface AbstractC85605d {
        static {
            Covode.recordClassIndex(99789);
        }
    }

    /* renamed from: com.ss.android.vesdk.w$a */
    public enum EnumC85602a {
        GET_FRAMES_MODE_NORMAL(1),
        GET_FRAMES_MODE_NOEFFECT(2),
        GET_FRAMES_MODE_ORIGINAL(4),
        GET_FRAMES_MODE_NORMAL_SCORE(9),
        GET_FRAMES_MODE_NOEFFECT_SCORE(10),
        GET_FRAMES_MODE_ORIGINAL_SCORE(12);
        

        /* renamed from: a */
        private int f191904a;

        public final int getValue() {
            return this.f191904a;
        }

        static {
            Covode.recordClassIndex(99786);
        }

        private EnumC85602a(int i) {
            this.f191904a = i;
        }
    }

    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_UpdateIn can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_UpdateOut can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_UpdateInOut can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Forward can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Clear can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Accurate can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Accurate_Clear can be incorrect */
    /* renamed from: com.ss.android.vesdk.w$f */
    public enum EnumC85607f {
        EDITOR_SEEK_FLAG_OnGoing(0),
        EDITOR_SEEK_FLAG_LastSeek(1),
        EDITOR_SEEK_FLAG_ToIframe(2),
        EDITOR_SEEK_FLAG_LAST_UpdateIn(r13.getValue() | 4),
        EDITOR_SEEK_FLAG_LAST_UpdateOut(r13.getValue() | 8),
        EDITOR_SEEK_FLAG_LAST_UpdateInOut(r13.getValue() | 16),
        EDITOR_SEEK_FLAG_Forward(128),
        EDITOR_SEEK_FLAG_LAST_Forward(r8.getValue() | r13.getValue()),
        EDITOR_SEEK_FLAG_LAST_Clear(r13.getValue() | 256),
        EDITOR_SEEK_FLAG_LAST_Accurate(r13.getValue() | 640),
        EDITOR_SEEK_FLAG_LAST_Accurate_Clear(r13.getValue() | 896),
        EDITOR_REFRESH_MODE(1024),
        EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker(24577),
        EDITOR_REFRESH_MODE_FOECE(536870912);
        

        /* renamed from: a */
        private int f191922a;

        public final int getValue() {
            return this.f191922a;
        }

        static {
            Covode.recordClassIndex(99791);
        }

        private EnumC85607f(int i) {
            this.f191922a = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.w$g */
    public enum EnumC85608g {
        EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
        EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);
        

        /* renamed from: a */
        private int f191924a;

        public final int getValue() {
            return this.f191924a;
        }

        static {
            Covode.recordClassIndex(99792);
        }

        private EnumC85608g(int i) {
            this.f191924a = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.w$j */
    public enum EnumC85611j {
        ANY(65535),
        ERROR(0),
        NOTHING(1048576),
        IDLE(1),
        INITIALIZED(2),
        PREPARED(4),
        STARTED(8),
        PAUSED(16),
        SEEKING(32),
        STOPPED(64),
        COMPLETED(128);
        

        /* renamed from: a */
        private int f191928a;

        public final int getValue() {
            return this.f191928a;
        }

        static {
            Covode.recordClassIndex(99795);
        }

        public static EnumC85611j valueOf(int i) {
            if (i == 0) {
                return ERROR;
            }
            if (i == 1) {
                return IDLE;
            }
            if (i == 2) {
                return INITIALIZED;
            }
            if (i == 4) {
                return PREPARED;
            }
            if (i == 8) {
                return STARTED;
            }
            if (i == 16) {
                return PAUSED;
            }
            if (i == 32) {
                return SEEKING;
            }
            if (i == 64) {
                return STOPPED;
            }
            if (i == 128) {
                return COMPLETED;
            }
            if (i == 65535) {
                return ANY;
            }
            if (i != 1048576) {
                return null;
            }
            return NOTHING;
        }

        private EnumC85611j(int i) {
            this.f191928a = i;
        }
    }

    /* renamed from: a */
    public final void mo131633a() {
        MethodCollector.m26663i(13781);
        if (this.f191856w.get()) {
            C85315al.m146641c("VEEditor", "no need to releasePreviewSurface, is destroying, just return");
            MethodCollector.m26664o(13781);
            return;
        }
        synchronized (this) {
            try {
                if (this.f191856w.get()) {
                    C85315al.m146641c("VEEditor", "no need to releasePreviewSurface, just lock return");
                    return;
                }
                C85315al.m146641c("VEEditor", "surfaceDestroyed...");
                this.f191765B.releasePreviewSurface();
                MethodCollector.m26664o(13781);
            } finally {
                MethodCollector.m26664o(13781);
            }
        }
    }

    /* renamed from: a */
    public final void mo131638a(Bitmap bitmap) {
        if (this.f191856w.get()) {
            C85315al.m146641c("VEEditor", "no need to setPreviewSurfaceBitmap, is destroying, just return");
            return;
        }
        C85315al.m146637a("VEEditor", "setPreviewSurfaceBitmap...");
        this.f191765B.setPreviewSurfaceBitmap(bitmap);
    }

    /* renamed from: a */
    public final void mo131640a(Surface surface) {
        Rect rect;
        C85315al.m146641c("VEEditor", "surfaceCreated...");
        this.f191802aL = false;
        if (this.f191817ad && this.f191818ae != null) {
            Canvas lockCanvas = surface.lockCanvas(null);
            int width = lockCanvas.getWidth();
            int height = lockCanvas.getHeight();
            int width2 = this.f191818ae.getWidth();
            int height2 = this.f191818ae.getHeight();
            C85315al.m146637a("VEEditor", "width " + width + " height " + height + " image width " + width2 + " image height " + height2);
            float f = (float) width;
            float f2 = (float) height;
            float f3 = ((float) width2) / ((float) height2);
            if (f3 > f / f2) {
                int i = (height - ((int) (f / f3))) / 2;
                rect = new Rect(0, i, width, height - i);
            } else {
                int i2 = (width - ((int) (f2 * f3))) / 2;
                rect = new Rect(i2, 0, width - i2, height);
            }
            lockCanvas.drawBitmap(this.f191818ae, (Rect) null, rect, (Paint) null);
            surface.unlockCanvasAndPost(lockCanvas);
            if (this.f191803aM) {
                Bitmap bitmap = this.f191818ae;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f191818ae.recycle();
                    this.f191818ae = null;
                }
                this.f191803aM = false;
            }
        }
        this.f191765B.setPreviewSurface(surface);
    }

    /* renamed from: a */
    public final void mo131636a(int i, int i2) {
        C85315al.m146637a("VEEditor", "onSurfaceChanged... " + i + ", " + i2);
        this.f191857x = i;
        this.f191858y = i2;
        mo131734x();
        if (i != 0 && i2 != 0) {
            this.f191765B.setSurfaceSize(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo131663b() {
        MethodCollector.m26663i(13820);
        boolean b = this.f191816ac.mo55070b();
        long j = 0;
        C30695h.m63062a(1, "te_composition_effect_add", b ? 0 : 1);
        if (!b) {
            C30695h.m63063a(1, "te_composition_effect_json", this.f191816ac.mo55066a(0));
        }
        boolean c = this.f191816ac.mo55071c();
        if (!c) {
            j = 1;
        }
        C30695h.m63062a(1, "te_composition_info_sticker_add", j);
        if (!c) {
            C30695h.m63063a(1, "te_composition_info_sticker_json", this.f191816ac.mo55066a(1));
        }
        this.f191816ac.mo55067a();
        C30695h.m63063a(1, "iesve_veeditor_composition_finish_file", this.f191840g);
        C30695h.m63063a(1, "iesve_veeditor_composition_finish_result", "fail");
        C30695h.m63063a(1, "iesve_veeditor_composition_finish_reason", "");
        TEMonitorInvoker.nativeMonitorPerfWithType(1);
        MethodCollector.m26664o(13820);
    }

    public C85581w(String str, C85395bh bhVar) {
        this.f191839f = new VESize(-1, -1);
        this.f191840g = "mp4";
        this.f191841h = new HandlerC85610i(Looper.getMainLooper());
        this.f191842i = null;
        this.f191843j = null;
        this.f191844k = null;
        this.f191845l = null;
        this.f191846m = null;
        this.f191847n = null;
        this.f191848o = null;
        this.f191849p = null;
        this.f191850q = null;
        this.f191851r = null;
        this.f191852s = new C30651j();
        this.f191853t = new C30634a();
        this.f191832as = true;
        this.f191854u = "unknown";
        this.f191833au = null;
        this.f191834av = "/concatShootVideo";
        this.f191855v = new HashMap();
        this.f191856w = new AtomicBoolean(false);
        this.f191791aA = -1;
        this.f191792aB = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855821 */

            static {
                Covode.recordClassIndex(99766);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(int i, int i2, float f, String str) {
                long j;
                long j2;
                int i3;
                MethodCollector.m26663i(13020);
                if (i == 4101) {
                    if (C85581w.this.f191776M > 0) {
                        System.currentTimeMillis();
                    }
                    if (C85581w.this.f191842i != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        C85581w.this.f191841h.sendEmptyMessage(4101);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        C85581w.this.f191850q.onCallback(4101, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (i != 4103) {
                    if (i != 4105) {
                        if (i != 4129) {
                            if (i != 4157) {
                                if (i != 4133) {
                                    if (i == 4134) {
                                        C85581w.this.f191822ai = f;
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (i != 4144) {
                                        if (i != 4145) {
                                            if (i != 4160) {
                                                if (i != 4161) {
                                                    if (C85581w.this.f191850q != null) {
                                                        C85315al.m146639b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                                    }
                                                } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                    C85581w.this.f191788Y.f191917m = i2;
                                                    MethodCollector.m26664o(13020);
                                                    return;
                                                }
                                            } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                C85581w.this.f191788Y.f191916l = i2;
                                                MethodCollector.m26664o(13020);
                                                return;
                                            }
                                        } else if (C85581w.this.f191846m != null) {
                                            C85581w.this.f191846m.mo87654b();
                                            MethodCollector.m26664o(13020);
                                            return;
                                        } else if (C85581w.this.f191850q != null) {
                                            C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                            C85581w.this.f191850q.onCallback(i, i2, f, str);
                                            MethodCollector.m26664o(13020);
                                            return;
                                        }
                                    } else if (C85581w.this.f191846m != null) {
                                        C85581w.this.f191846m.mo87653a();
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (C85581w.this.f191850q != null) {
                                        C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                        MethodCollector.m26664o(13020);
                                        return;
                                    }
                                } else if (!(C85581w.this.f191845l == null || C85581w.this.f191841h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i2;
                                    message.arg2 = (int) f;
                                    C85581w.this.f191841h.sendMessage(message);
                                    MethodCollector.m26664o(13020);
                                    return;
                                }
                            } else if (!(C85581w.this.f191849p == null || C85581w.this.f191841h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i2;
                                message2.arg2 = (int) f;
                                C85581w.this.f191841h.sendMessage(message2);
                                MethodCollector.m26664o(13020);
                                return;
                            }
                        } else if (C85581w.this.f191777N == 0) {
                            C85581w.this.f191777N = System.currentTimeMillis();
                            C85315al.m146637a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.m26664o(13020);
                            return;
                        }
                    } else if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        Message message3 = new Message();
                        message3.what = i;
                        message3.obj = Float.valueOf(f);
                        C85581w.this.f191841h.sendMessage(message3);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (C85581w.this.f191787X) {
                    C85581w.this.f191788Y.f191908d = C85581w.this.f191850q;
                    new Thread(C85581w.this.f191788Y).start();
                    C85581w.this.f191787X = false;
                    MethodCollector.m26664o(13020);
                    return;
                } else {
                    C85581w wVar = C85581w.this;
                    if (i2 == 1 || i2 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - wVar.f191786W;
                        C85315al.m146641c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        C30695h.m63065a("te_composition_time", currentTimeMillis);
                        C30695h.m63062a(1, "te_composition_time", currentTimeMillis);
                        if (C30004e.m60552a(wVar.f191785V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(wVar.f191785V, iArr) != null) {
                                long length = new File(wVar.f191785V).length();
                                C30695h.m63065a("te_composition_page_mode", (long) wVar.f191819af);
                                double d = (double) length;
                                Double.isNaN(d);
                                double d2 = (d / 1024.0d) / 1024.0d;
                                C30695h.m63064a("te_composition_file_size", d2);
                                C30695h.m63064a("te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63064a("te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63064a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    C85315al.m146641c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                C30695h.m63062a(1, "te_composition_page_mode", (long) wVar.f191819af);
                                C30695h.m63063a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                C30695h.m63061a(1, "te_composition_fps", (double) iArr[7]);
                                C30695h.m63061a(1, "te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63061a(1, "te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63061a(1, "te_composition_file_size", d2);
                                int i4 = wVar.f191816ac.f73424c;
                                if (i4 != 0) {
                                    C30695h.m63062a(1, "te_composition_time_filter_type", (long) i4);
                                }
                                C30652a.m63004a("te_composition_file_duration", (long) iArr[3]);
                                C30652a.m63004a("te_composition_video_frame_rate", (long) iArr[7]);
                                C30652a.m63004a("te_composition_video_resolution_width", (long) iArr[0]);
                                C30652a.m63004a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b = wVar.f191816ac.mo55070b();
                        if (b) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        C30695h.m63062a(1, "te_composition_effect_add", j);
                        if (!b) {
                            C30695h.m63063a(1, "te_composition_effect_json", wVar.f191816ac.mo55066a(0));
                        }
                        boolean c = wVar.f191816ac.mo55071c();
                        if (c) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        C30695h.m63062a(1, "te_composition_info_sticker_add", j2);
                        if (!c) {
                            C30695h.m63063a(1, "te_composition_info_sticker_json", wVar.f191816ac.mo55066a(1));
                        }
                        wVar.f191816ac.mo55067a();
                        TEMonitorInvoker.nativeMonitorPerf(C30695h.f73418b);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_file", wVar.f191840g);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_result", "succ");
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            C30695h.m63067a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", wVar.f191854u);
                            if (i2 == 1 || i2 == 2) {
                                i3 = 0;
                            } else {
                                i3 = i2;
                            }
                            jSONObject.put("resultCode", i3);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i2;
                        message4.obj = str;
                        C85581w.this.f191841h.sendMessage(message4);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                }
                MethodCollector.m26664o(13020);
            }
        };
        this.f191793aC = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855998 */

            static {
                Covode.recordClassIndex(99783);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(final int i, final int i2, final float f, final String str) {
                C85581w.this.mo131663b();
                if (C85581w.this.f191851r != null) {
                    C85581w.this.f191851r.onCallback(i, i2, f, str);
                }
                if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855998.RunnableC856001 */

                        static {
                            Covode.recordClassIndex(99784);
                        }

                        public final void run() {
                            if (C85581w.this.f191843j != null) {
                                C85581w.this.f191843j.onCompileError(i, i2, f, str);
                            }
                        }
                    });
                }
            }
        };
        this.f191857x = 0;
        this.f191858y = 0;
        this.f191794aD = 0;
        this.f191795aE = 0;
        this.f191859z = false;
        this.f191764A = 0;
        this.f191770G = 0;
        this.f191771H = 0;
        this.f191772I = 0;
        this.f191773J = 0;
        this.f191774K = 0;
        this.f191775L = 0;
        this.f191776M = 0;
        this.f191777N = 0;
        this.f191778O = false;
        this.f191796aF = 0;
        this.f191797aG = 0;
        this.f191798aH = 0;
        this.f191779P = -1;
        this.f191781R = EnumC85612k.ALIGN_PARENT_BOTTOM;
        this.f191782S = EnumC85614m.CENTER;
        this.f191783T = false;
        this.f191799aI = false;
        this.f191800aJ = false;
        this.f191784U = -1;
        this.f191785V = null;
        this.f191786W = 0;
        this.f191801aK = false;
        this.f191787X = false;
        this.f191788Y = null;
        this.f191789Z = null;
        this.f191814aa = null;
        this.f191815ab = null;
        this.f191816ac = new C30696i();
        this.f191817ad = false;
        this.f191802aL = true;
        this.f191803aM = false;
        this.f191818ae = null;
        this.f191804aN = 0.0f;
        this.f191805aO = 1.0f;
        this.f191806aP = 1.0f;
        this.f191819af = -1;
        this.f191807aQ = -1;
        this.f191820ag = -16777216;
        this.f191821ah = -16777216;
        this.f191822ai = 0.0f;
        this.f191823aj = new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.vesdk.C85581w.TextureView$SurfaceTextureListenerC856019 */

            static {
                Covode.recordClassIndex(99785);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C85581w.this.mo131633a();
                if (C85581w.this.f191767D == null) {
                    return true;
                }
                C85581w.this.f191767D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C85581w.this.f191857x = i;
                C85581w.this.f191858y = i2;
                C85581w.this.mo131734x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C85581w.this.f191766C == surfaceTexture) {
                    C85581w wVar = C85581w.this;
                    wVar.mo131640a(wVar.f191767D);
                } else {
                    C85581w.this.f191767D = new Surface(surfaceTexture);
                    C85581w wVar2 = C85581w.this;
                    wVar2.mo131640a(wVar2.f191767D);
                }
                C85581w.this.f191766C = surfaceTexture;
            }
        };
        this.f191824ak = new SurfaceHolder.Callback2() {
            /* class com.p2082ss.android.vesdk.C85581w.SurfaceHolder$Callback2C8558310 */

            static {
                Covode.recordClassIndex(99767);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C85315al.m146639b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C85581w.this.mo131640a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (C85581w.this.f191856w.get()) {
                    C85315al.m146641c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    C85581w.this.mo131633a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C85315al.m146639b("VEEditor", C1764a.m5929a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                C85581w.this.mo131636a(i2, i3);
            }
        };
        this.f191808aR = new NativeCallbacks.AbstractC30708h() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558411 */

            static {
                Covode.recordClassIndex(99768);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55096a(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: b */
            public final int mo55098b(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55097a(int i, double d) {
                long j;
                long j2;
                C85315al.m146643e("VEEditor", "onOpenGLDrawing: tex = " + i + " timeStamp = " + d);
                if (!C85581w.this.f191778O) {
                    C85581w.this.f191778O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C85581w.this.f191777N > 0) {
                        j = C85581w.this.f191777N;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (C85581w.this.f191775L > 0) {
                        j2 = C85581w.this.f191775L;
                    } else {
                        j2 = C85581w.this.f191774K;
                    }
                    if (j2 == 0 || j2 < C85581w.this.f191773J) {
                        C85315al.m146642d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + C85581w.this.f191775L + ", mlFirstSeekTimeMS = " + C85581w.this.f191774K + ", mlInitTimeMS = " + C85581w.this.f191773J);
                        j2 = C85581w.this.f191773J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - C85581w.this.f191773J);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                        jSONObject.put("time_total", currentTimeMillis - C85581w.this.f191773J);
                        jSONObject.put("usage_type", C85581w.this.f191854u);
                        C30683b.m63032a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        C85315al.m146637a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e) {
                        C85315al.m146642d("VEEditor", "report first frame json err ".concat(String.valueOf(e)));
                    }
                    C30695h.m63062a(1, "te_edit_first_frame_time", currentTimeMillis - C85581w.this.f191773J);
                    if (C85581w.this.f191844k != null) {
                        C85581w.this.f191844k.mo56396a();
                    }
                }
                C85581w.this.f191770G++;
                if (C85581w.this.f191770G == 30) {
                    C85581w.this.f191771H = System.currentTimeMillis();
                    if (C85581w.this.f191772I != C85581w.this.f191771H) {
                        float f = 30000.0f / ((float) (C85581w.this.f191771H - C85581w.this.f191772I));
                        if (C85376ax.f191102c) {
                            C85315al.m146637a("VEEditor", "Render FPS = ".concat(String.valueOf(f)));
                        }
                        C85581w wVar = C85581w.this;
                        wVar.f191772I = wVar.f191771H;
                        C85581w.this.f191770G = 0;
                    }
                }
                return 0;
            }
        };
        this.f191809aS = new NativeCallbacks.AbstractC30703c() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558512 */

            static {
                Covode.recordClassIndex(99769);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30703c
            /* renamed from: a */
            public final int mo55087a(byte[] bArr, int i, int i2, boolean z) {
                if (bArr == null || i < 0 || i2 <= 0) {
                    return -1;
                }
                if (C85581w.this.f191789Z == null) {
                    return -2;
                }
                C85581w.this.f191789Z.mo116308a(bArr, i, i2, z);
                return 0;
            }
        };
        this.f191810aT = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558613 */

            static {
                Covode.recordClassIndex(99770);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191814aa == null) {
                    return -100;
                }
                if (bArr != null || C85581w.this.f191841h == null) {
                    return C85581w.this.f191814aa.mo110443a(bArr, i, i2);
                }
                Message message = new Message();
                message.what = 4117;
                C85581w.this.f191841h.sendMessage(message);
                return 0;
            }
        };
        this.f191811aU = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558714 */

            static {
                Covode.recordClassIndex(99771);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191815ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return C85581w.this.f191815ab.mo110443a(bArr, i, i2);
            }
        };
        this.f191812aV = new NativeCallbacks.AbstractC30707g() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558815 */

            static {
                Covode.recordClassIndex(99772);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: a */
            public final int mo55092a() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130304a();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: b */
            public final int mo55093b() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130305b();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: c */
            public final int mo55094c() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130306c();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: d */
            public final int mo55095d() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130307d();
            }
        };
        this.f191813aW = new NativeCallbacks.AbstractC30705e() {
            /* class com.p2082ss.android.vesdk.C85581w.C855892 */

            static {
                Covode.recordClassIndex(99773);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55089a(final int i, final int i2, final int i3) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855901 */

                        static {
                            Covode.recordClassIndex(99774);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55090a(final int i, final int i2, final String str) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855912 */

                        static {
                            Covode.recordClassIndex(99775);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                if (str != null) {
                                    C85581w.this.f191855v.put(Integer.valueOf(i), str);
                                }
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            C85315al.m146637a("VEEditor", "VEEditor offscreen");
            this.f191765B = TEInterface.createEngine(bhVar);
            this.f191838e = new C85553b(str);
            this.f191765B.setOpenGLListeners(this.f191808aR);
            this.f191765B.setInfoListener(this.f191792aB);
            this.f191765B.setErrorListener(this.f191793aC);
            C30689e.m63052a("iesve_veeditor_offscreen", 1, (C85509a) null);
            mo131672c(false);
            m147485M();
            return;
        }
        throw new C85615x(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public final void mo131644a(AbstractC85541q qVar) {
        this.f191851r = qVar;
        C85315al.m146637a("VEEditor", "setOnErrorListener...");
    }

    /* renamed from: b */
    public final void mo131665b(AbstractC85541q qVar) {
        C85315al.m146637a("VEEditor", "setOnInfoListener...");
        this.f191850q = qVar;
    }

    /* renamed from: a */
    public final void mo131637a(int i, int i2, int i3, int i4) {
        C85315al.m146637a("VEEditor", "setDisplayPos... " + i + " " + i2 + " " + i3 + " " + i4);
        mo131635a(((float) i3) / ((float) this.f191794aD), ((float) i4) / ((float) this.f191795aE), 0.0f, -(((this.f191857x / 2) - (i3 / 2)) - i), ((this.f191858y / 2) - (i4 / 2)) - i2);
    }

    /* renamed from: b */
    public final VESize mo131662b(int i, int i2) {
        VESize vESize = new VESize(0, 0);
        float f = (float) i;
        float f2 = (float) i2;
        if (((float) this.f191839f.width) / ((float) this.f191839f.height) > f / f2) {
            vESize.width = i;
            vESize.height = (int) (f / (((float) this.f191839f.width) / ((float) this.f191839f.height)));
        } else {
            vESize.height = i2;
            vESize.width = (int) (f2 / (((float) this.f191839f.height) / ((float) this.f191839f.width)));
        }
        C85315al.m146637a("VEEditor", "getInitSize... surfaceWidth:" + i + ", surfaceHeight:" + i2 + ", width:" + vESize.width + ", height:" + vESize.height);
        return vESize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r0 == 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        com.p2082ss.android.vesdk.C85315al.m146642d("VEEditor", "getDisplayImage failed ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        if (r3 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        if (r3.isRecycled() != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        r3.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13955);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        r4 = r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo131630a(int r7) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85581w.mo131630a(int):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final void mo131664b(int i) {
        C85315al.m146637a("VEEditor", "setBackgroundColor... color:".concat(String.valueOf(i)));
        this.f191820ag = i;
        this.f191765B.setBackGroundColor(i);
    }

    /* renamed from: a */
    public final int mo131618a(boolean z) {
        return this.f191765B.setDestroyVersion(z);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo131628a(java.lang.String[] r25, java.lang.String[] r26, java.lang.String[] r27, com.p2082ss.android.vesdk.C85581w.EnumC85613l r28) {
        /*
        // Method dump skipped, instructions count: 484
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85581w.mo131628a(java.lang.String[], java.lang.String[], java.lang.String[], com.ss.android.vesdk.w$l):int");
    }

    /* renamed from: a */
    public final int mo131623a(String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        MethodCollector.m26663i(14106);
        synchronized (this) {
            try {
                this.f191772I = System.currentTimeMillis();
                this.f191773J = System.currentTimeMillis();
                C85315al.m146637a("VEEditor", "initOnlyAudio...");
                C85553b bVar = this.f191838e;
                if (bVar == null) {
                    C85315al.m146642d("VEEditor", "init mResManager is null");
                    return -112;
                }
                int initAudioEditor = this.f191765B.initAudioEditor(bVar.f191680a, strArr, iArr, iArr2, fArr);
                if (initAudioEditor != 0) {
                    C85315al.m146642d("VEEditor", "initAudioEditor failed, ret = ".concat(String.valueOf(initAudioEditor)));
                    MethodCollector.m26664o(14106);
                    return initAudioEditor;
                }
                this.f191783T = true;
                this.f191838e.f191686g = false;
                this.f191838e.f191682c = strArr;
                this.f191838e.f191681b = null;
                this.f191838e.f191683d = null;
                this.f191780Q = null;
                this.f191836c.mo131158i();
                this.f191859z = true;
                this.f191838e.f191690k = 1;
                this.f191838e.f191689j = 0;
                this.f191764A = 0;
                MethodCollector.m26664o(14106);
                return 0;
            } finally {
                MethodCollector.m26664o(14106);
            }
        }
    }

    /* renamed from: a */
    public final int mo131600a(VERecordData vERecordData, boolean z, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f191833au = vERecordData;
        if (!z) {
            int size = vERecordData.f190794b.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            int[] iArr4 = new int[size];
            float[] fArr = new float[size];
            float[] fArr2 = new float[size];
            ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
            int i = 0;
            for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f190794b) {
                if (vERecordSegmentData.f190807j) {
                    strArr[i] = vERecordSegmentData.f190798a;
                    strArr2[i] = vERecordSegmentData.f190799b;
                    iArr[i] = (int) (vERecordSegmentData.f190808k / 1000);
                    iArr2[i] = (int) (vERecordSegmentData.f190809l / 1000);
                    fArr[i] = vERecordSegmentData.f190802e == 0.0f ? 1.0f : vERecordSegmentData.f190802e;
                    fArr2[i] = vERecordSegmentData.f190803f == 0.0f ? 1.0f : vERecordSegmentData.f190803f;
                    rotate_degreeArr[i] = vERecordSegmentData.f190804g;
                    if (vERecordSegmentData.f190810m) {
                        iArr3[i] = (int) (((float) iArr[i]) * 1.0f);
                        iArr4[i] = (int) (((float) iArr2[i]) * 1.0f);
                    } else {
                        iArr3[i] = (int) (((float) iArr[i]) * fArr[i]);
                        iArr4[i] = (int) (((float) iArr2[i]) * fArr[i]);
                    }
                    i++;
                }
            }
            if (i == 0) {
                C85315al.m146642d("VEEditor", "There are no valid clips!");
                return -100;
            }
            String[] strArr3 = (String[]) Arrays.copyOf(strArr, i);
            String[] strArr4 = (String[]) Arrays.copyOf(strArr2, i);
            int[] copyOf = Arrays.copyOf(iArr, i);
            int[] copyOf2 = Arrays.copyOf(iArr2, i);
            int[] copyOf3 = Arrays.copyOf(iArr3, i);
            int[] copyOf4 = Arrays.copyOf(iArr4, i);
            float[] copyOf5 = Arrays.copyOf(fArr, i);
            float[] copyOf6 = Arrays.copyOf(fArr2, i);
            ROTATE_DEGREE[] rotate_degreeArr2 = (ROTATE_DEGREE[]) Arrays.copyOf(rotate_degreeArr, i);
            this.f191836c.mo131149c();
            this.f191765B.clearFilter();
            this.f191852s.mo54956a();
            if (vERecordData.f190795c) {
                strArr4 = null;
                copyOf4 = null;
                copyOf5 = null;
                copyOf3 = null;
            }
            int a = m147492a(strArr3, copyOf, copyOf2, (String[]) null, strArr4, copyOf3, copyOf4, copyOf6, copyOf5, rotate_degreeArr2, EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL, z2);
            C85315al.m146637a("VEEditor", "init with VERecordData: " + (System.currentTimeMillis() - currentTimeMillis));
            return a;
        } else if (vERecordData.f190796d.isEmpty()) {
            C85315al.m146642d("VEEditor", "Merged video file path unconfigured!");
            return -100;
        } else {
            this.f191852s.mo54956a();
            this.f191836c.mo131149c();
            this.f191765B.clearFilter();
            return mo131628a(new String[]{vERecordData.f190796d}, (String[]) null, vERecordData.f190795c ? null : new String[]{vERecordData.f190797e}, EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
        }
    }

    /* renamed from: a */
    public final int mo131597a(VEEditorModel vEEditorModel, C85391be beVar) {
        MethodCollector.m26663i(14108);
        synchronized (this) {
            try {
                TEMonitorInvoker.nativeReset(1);
                C30695h.m63060a(1);
                this.f191772I = System.currentTimeMillis();
                this.f191773J = System.currentTimeMillis();
                C85315al.m146637a("VEEditor", "init with model...");
                mo131635a(1.0f, 1.0f, 0.0f, 0, 0);
                C85553b bVar = this.f191838e;
                if (bVar == null) {
                    C85315al.m146642d("VEEditor", "init mResManager is null");
                    return -112;
                }
                this.f191783T = true;
                bVar.f191686g = vEEditorModel.f190762d;
                this.f191780Q = vEEditorModel.f190763e;
                this.f191838e.f191682c = vEEditorModel.f190773o;
                this.f191838e.f191681b = vEEditorModel.f190772n;
                this.f191838e.f191683d = vEEditorModel.f190774p;
                this.f191836c.mo131158i();
                this.f191859z = Boolean.valueOf(vEEditorModel.f190764f);
                this.f191838e.f191689j = 0;
                this.f191764A = vEEditorModel.f190765g;
                this.f191765B.setHostTrackIndex(vEEditorModel.f190766h);
                if (beVar != null) {
                    int updateSenceTime = this.f191765B.updateSenceTime(beVar);
                    if (updateSenceTime < 0) {
                        C85315al.m146642d("VEEditor", "updateSceneTime failed, ret = ".concat(String.valueOf(updateSenceTime)));
                        MethodCollector.m26664o(14108);
                        return updateSenceTime;
                    }
                    this.f191765B.setTimeRange(0, updateSenceTime, 0);
                }
                int a = this.f191836c.mo131126a(vEEditorModel);
                MethodCollector.m26664o(14108);
                return a;
            } finally {
                MethodCollector.m26664o(14108);
            }
        }
    }

    /* renamed from: b */
    public final void mo131666b(boolean z) {
        this.f191765B.setForceDetectForFirstFrameByClip(z);
    }

    /* renamed from: a */
    public final void mo131634a(float f) {
        C85315al.m146637a("VEEditor", "setHeightWidthRatio... ratio:".concat(String.valueOf(f)));
        this.f191765B.setHeightWidthRatio(f);
    }

    /* renamed from: a */
    public final int mo131625a(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, String[] strArr3, int[] iArr3, int[] iArr4, float[] fArr, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr, EnumC85613l lVar) {
        return m147492a(strArr, iArr, iArr2, strArr2, strArr3, iArr3, iArr4, fArr, fArr2, rotate_degreeArr, lVar, false);
    }

    /* renamed from: a */
    protected static VESize[] m147500a(String[] strArr, String[] strArr2, List<VESize> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr2) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                } else if (str.equals(strArr[i])) {
                    arrayList.add(list.get(i));
                    C85315al.m146642d("VEEditor", strArr[i] + "... (" + list.get(i).width + ", " + list.get(i).height + ")");
                    break;
                } else {
                    i++;
                }
            }
        }
        return (VESize[]) arrayList.toArray(new VESize[0]);
    }

    /* renamed from: a */
    public final int mo131627a(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr) {
        if (strArr == null || strArr.length == 0) {
            return -100;
        }
        boolean[] zArr = new boolean[strArr.length];
        Arrays.fill(zArr, true);
        return mo131629a(zArr, strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, rotate_degreeArr);
    }

    /* renamed from: a */
    public final int mo131629a(boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr) {
        float f;
        C85315al.m146637a("VEEditor", "changeResWithEffect in...");
        if (strArr.length == 0 || zArr.length != strArr.length) {
            return -100;
        }
        int stop = this.f191765B.stop();
        if (stop != 0) {
            C85315al.m146637a("VEEditor", "stop in changeResWithEffect failed, ret = ".concat(String.valueOf(stop)));
            return -1;
        }
        C85315al.m146637a("VEEditor", "changeResWithEffect clear reverse before, mOriginalSoundTrackType = " + this.f191838e.f191690k);
        if (!this.f191838e.f191686g || !this.f191838e.f191687h || this.f191838e.f191685f == null || this.f191838e.f191690k != 1) {
            f = -1.0f;
        } else {
            f = mo131693h(this.f191838e.f191689j);
            m147484A(this.f191838e.f191689j);
            this.f191838e.f191689j = 0;
            C85315al.m146641c("VEEditor", "changeResWithEffect remove org audio track index " + this.f191838e.f191689j);
        }
        this.f191838e.f191685f = null;
        this.f191838e.f191684e = null;
        this.f191838e.f191686g = false;
        this.f191838e.f191687h = false;
        Boolean valueOf = Boolean.valueOf((strArr3 == null || strArr3.length == 0) ? false : true);
        this.f191859z = valueOf;
        if (valueOf.booleanValue()) {
            this.f191838e.f191690k = 1;
        } else {
            this.f191838e.f191690k = 0;
        }
        C85315al.m146637a("VEEditor", "changeResWithEffect clear reverse after, mOriginalSoundTrackType = " + this.f191838e.f191690k);
        this.f191838e.f191681b = strArr;
        this.f191838e.f191682c = strArr3;
        int changeResWithEffect = this.f191765B.changeResWithEffect(zArr, strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, ROTATE_DEGREE.toIntArray(rotate_degreeArr));
        if (changeResWithEffect != 0) {
            C85315al.m146642d("VEEditor", "updateRes in changeResWithEffect failed, ret = ".concat(String.valueOf(changeResWithEffect)));
            return changeResWithEffect;
        }
        this.f191765B.createTimeline();
        int prepareEngine = this.f191765B.prepareEngine(0);
        if (f >= 0.0f) {
            mo131645a(this.f191838e.f191689j, this.f191838e.f191690k, f);
        }
        C85315al.m146637a("VEEditor", "changeResWithEffect done，mInitSize.width = " + this.f191839f.width + ", mInitSize.height = " + this.f191839f.height + ", ret = " + prepareEngine);
        return prepareEngine;
    }

    /* renamed from: a */
    public final void mo131643a(VEListener.AbstractC85247p pVar) {
        MethodCollector.m26663i(11492);
        synchronized (this) {
            try {
                if (this.f191765B != null) {
                    C85315al.m146641c("VEEditor", "onRelease Async... ");
                    this.f191846m = pVar;
                    this.f191765B.stop();
                    this.f191765B.releaseEngineAsync();
                }
            } finally {
                MethodCollector.m26664o(11492);
            }
        }
    }

    /* renamed from: a */
    public final int mo131621a(String[] strArr) {
        C85315al.m146641c("VEEditor", "setReverseVideoPaths");
        if (strArr == null || strArr.length <= 0) {
            C85315al.m146642d("VEEditor", "setReverseVideoPaths error, reverseVideoPaths is null");
            return -100;
        }
        C85553b bVar = this.f191838e;
        if (bVar == null) {
            return 0;
        }
        bVar.f191684e = strArr;
        this.f191838e.f191686g = true;
        return 0;
    }

    /* renamed from: b */
    public final void mo131667b(String[] strArr) {
        C85315al.m146641c("VEEditor", "setVideoPaths");
        this.f191838e.f191681b = strArr;
    }

    /* renamed from: a */
    public final int mo131626a(String[] strArr, String[] strArr2) {
        C85315al.m146641c("VEEditor", "setReverseMediaPaths");
        if (strArr == null || strArr.length <= 0) {
            C85315al.m146642d("VEEditor", "setReverseMediaPaths error, reverseVideoPaths = null");
            return -100;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            C85315al.m146641c("VEEditor", "setReverseMediaPaths with reverseAudioPaths is null");
        }
        C85553b bVar = this.f191838e;
        if (bVar == null) {
            return 0;
        }
        bVar.f191685f = strArr2;
        this.f191838e.f191684e = strArr;
        this.f191838e.f191686g = true;
        return 0;
    }

    /* renamed from: a */
    public final int mo131604a(EnumC85606e eVar) {
        return m147501b(eVar);
    }

    /* renamed from: a */
    public final int mo131589a(int i, EnumC85607f fVar) {
        int seek;
        MethodCollector.m26663i(12721);
        synchronized (this) {
            try {
                C85315al.m146641c("VEEditor", "seek... " + i + " flags " + fVar);
                if ((fVar.getValue() & EnumC85607f.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                    this.f191842i = null;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f191776M = currentTimeMillis;
                    if (this.f191774K == 0) {
                        this.f191774K = currentTimeMillis;
                    }
                }
                seek = this.f191765B.seek(i, this.f191857x, this.f191858y, fVar.getValue());
            } finally {
                MethodCollector.m26664o(12721);
            }
        }
        return seek;
    }

    /* renamed from: a */
    public final int mo131590a(int i, EnumC85607f fVar, VEListener.AbstractC85250s sVar) {
        int seek;
        MethodCollector.m26663i(12722);
        synchronized (this) {
            try {
                C85315al.m146641c("VEEditor", "seek with cb... " + i + " flags " + fVar);
                if ((fVar.getValue() & EnumC85607f.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                    this.f191842i = sVar;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f191776M = currentTimeMillis;
                    if (this.f191774K == 0) {
                        this.f191774K = currentTimeMillis;
                    }
                }
                seek = this.f191765B.seek(i, this.f191857x, this.f191858y, fVar.getValue());
                if (seek != 0) {
                    C85315al.m146642d("VEEditor", "seek failed, result = ".concat(String.valueOf(seek)));
                    this.f191842i = null;
                }
            } finally {
                MethodCollector.m26664o(12722);
            }
        }
        return seek;
    }

    /* renamed from: a */
    public final int mo131611a(String str, String str2) {
        MethodCollector.m26663i(12910);
        synchronized (this) {
            try {
                C85315al.m146641c("VEEditor", "addMetadata...");
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.f191765B.addMetaData(str, str2);
                        MethodCollector.m26664o(12910);
                        return 0;
                    }
                }
                return -100;
            } finally {
                MethodCollector.m26664o(12910);
            }
        }
    }

    /* renamed from: a */
    public final String mo131632a(String str) {
        MethodCollector.m26663i(13441);
        synchronized (this) {
            try {
                C85315al.m146641c("VEEditor", "getMetadata...");
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                String metaData = this.f191765B.getMetaData(str);
                MethodCollector.m26664o(13441);
                return metaData;
            } finally {
                MethodCollector.m26664o(13441);
            }
        }
    }

    /* renamed from: a */
    public final int mo131620a(int[] iArr, int i, int i2, EnumC85602a aVar, VEListener.AbstractC85254w wVar) {
        MethodCollector.m26663i(13656);
        synchronized (this) {
            try {
                C85315al.m146637a("VEEditor", "getImages... width:" + i + ", height:" + i2 + ", flags:" + aVar);
                if (i != 0) {
                    if (i2 != 0) {
                        this.f191814aa = wVar;
                        this.f191765B.setGetImageCallback(this.f191810aT);
                        int images = this.f191765B.getImages(iArr, i, i2, aVar.getValue());
                        C30695h.m63062a(4, "te_edit_get_frame_with_effect_ret", (long) images);
                        TEMonitorInvoker.nativeMonitorPerfWithType(4);
                        MethodCollector.m26664o(13656);
                        return images;
                    }
                }
                C85315al.m146642d("VEEditor", "getImages error, size invalid");
                C30695h.m63062a(4, "te_edit_get_frame_with_effect_ret", -100L);
                TEMonitorInvoker.nativeMonitorPerfWithType(4);
                return -100;
            } finally {
                MethodCollector.m26664o(13656);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo131646a(VEVideoEncodeSettings vEVideoEncodeSettings) {
        MethodCollector.m26663i(13790);
        synchronized (this) {
            try {
                if (!this.f191783T) {
                    C85615x xVar = new C85615x(-105, "Make sure the initialization is successful before calling!!!");
                    MethodCollector.m26664o(13790);
                    throw xVar;
                } else if (this.f191765B.getNativeHandler() == 0) {
                    return false;
                } else {
                    VEPublishSettingManager.EnumC85544a.INSTANCE.f191641b.nativeSetEditorStatus(this.f191765B.genEditorStatus());
                    VEPublishSettingManager.EnumC85544a.INSTANCE.f191641b.mo131502a(vEVideoEncodeSettings, VERuntime.EnumC85549a.INSTANCE.f191667b.nativeGetNativeContext());
                    boolean nativeIsCanRemuxVideo = VEPublishSettingManager.EnumC85544a.INSTANCE.f191641b.nativeIsCanRemuxVideo();
                    MethodCollector.m26664o(13790);
                    return nativeIsCanRemuxVideo;
                }
            } finally {
                MethodCollector.m26664o(13790);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo131647a(String str, VEAudioEncodeSettings vEAudioEncodeSettings, VEListener.AbstractC85248q qVar) {
        this.f191843j = qVar;
        return m147496a(str, vEAudioEncodeSettings);
    }

    /* renamed from: a */
    public final boolean mo131649a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, VEListener.AbstractC85248q qVar) {
        this.f191843j = qVar;
        boolean a = m147497a(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.f190616a);
        if (!a) {
            this.f191843j = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo131648a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.f191843j = null;
        boolean a = m147497a(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.f190616a);
        if (!a) {
            C85315al.m146642d("VEEditor", "_compile failed");
        }
        return a;
    }

    /* renamed from: a */
    public final void mo131642a(VEListener.AbstractC85231aj ajVar) {
        this.f191845l = ajVar;
        if (this.f191845l != null) {
            TEInterface.openOutputCallback(true);
        }
    }

    /* renamed from: a */
    public final void mo131639a(Looper looper) {
        if (looper != null) {
            this.f191841h = new HandlerC85610i(looper);
            return;
        }
        this.f191841h.removeCallbacksAndMessages(null);
        this.f191841h = null;
    }

    /* renamed from: a */
    private boolean m147498a(String str, String[] strArr, long[] jArr) {
        MethodCollector.m26663i(13996);
        synchronized (this) {
            try {
                if (!this.f191783T) {
                    C85615x xVar = new C85615x(-105, "Make sure the initialization is successful before coding!!!");
                    MethodCollector.m26664o(13996);
                    throw xVar;
                } else if (this.f191765B.getNativeHandler() == 0) {
                    return false;
                } else {
                    C85568t.C85573d a = C85568t.m147473a().mo131556a("video_duration_opt");
                    int concatShootVideo = this.f191765B.concatShootVideo(str, strArr, jArr, (a == null || a.f191742b == null || !(a.f191742b instanceof Boolean)) ? false : ((Boolean) a.f191742b).booleanValue());
                    if (concatShootVideo != 0) {
                        C85315al.m146642d("VEEditor", "concatShootVideo failed = ret: ".concat(String.valueOf(concatShootVideo)));
                        MethodCollector.m26664o(13996);
                        return false;
                    }
                    MethodCollector.m26664o(13996);
                    return true;
                }
            } finally {
                MethodCollector.m26664o(13996);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x058f, code lost:
        if (r22.f191765B.prepareEngine(1) != 0) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x059b, code lost:
        if (r7 != null) goto L_0x05ab;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m147497a(java.lang.String r23, java.lang.String r24, com.p2082ss.android.vesdk.VEVideoEncodeSettings r25, com.p2082ss.android.vesdk.VEAudioEncodeSettings r26) {
        /*
        // Method dump skipped, instructions count: 1562
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85581w.m147497a(java.lang.String, java.lang.String, com.ss.android.vesdk.VEVideoEncodeSettings, com.ss.android.vesdk.VEAudioEncodeSettings):boolean");
    }

    /* renamed from: a */
    private boolean m147496a(String str, VEAudioEncodeSettings vEAudioEncodeSettings) {
        MethodCollector.m26663i(14044);
        synchronized (this) {
            try {
                if (this.f191783T) {
                    if (this.f191765B.getNativeHandler() != 0) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f191786W = System.currentTimeMillis();
                            C85315al.m146637a("VEEditor", "_compileOnlyAudio...");
                            this.f191765B.stop();
                            this.f191765B.setCompileType(16);
                            this.f191765B.setEngineCompilePath(str + ".tmp", str);
                            this.f191765B.setEnableRemuxVideo(true);
                            this.f191765B.setAudioCompileSetting(vEAudioEncodeSettings.f190618c, vEAudioEncodeSettings.f190620e, vEAudioEncodeSettings.f190619d);
                            m147488P();
                            this.f191765B.prepareEngine(1);
                            this.f191765B.start();
                            MethodCollector.m26664o(14044);
                            return true;
                        }
                    }
                    return false;
                }
                C85615x xVar = new C85615x(-105, "Make sure the initialization is successful before coding!!!");
                MethodCollector.m26664o(14044);
                throw xVar;
            } finally {
                MethodCollector.m26664o(14044);
            }
        }
    }

    /* renamed from: a */
    public final int mo131583a(int i, int i2, EnumC85608g gVar) {
        return this.f191837d.mo130861a(i, i2, gVar);
    }

    /* renamed from: a */
    public final int mo131601a(C85391be beVar) {
        return this.f191837d.mo130864a(beVar);
    }

    /* renamed from: a */
    public final int mo131602a(C85391be beVar, int i, int i2) {
        return this.f191837d.mo130865a(beVar, i, i2);
    }

    /* renamed from: a */
    public final int mo131593a(int i, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        return this.f191837d.mo130862a(0, i, arrayList, arrayList2);
    }

    /* renamed from: a */
    public final int mo131586a(int i, ROTATE_DEGREE rotate_degree) {
        return this.f191837d.mo130860a(0, i, rotate_degree);
    }

    /* renamed from: a */
    public final String mo131631a(int i, int i2, int i3, String str) {
        return this.f191837d.mo130868a(i, i2, i3, str);
    }

    /* renamed from: a */
    public final int mo131610a(String str, int i, int i2, boolean z) {
        return this.f191837d.mo130867a(str, i, i2, z);
    }

    /* renamed from: a */
    public final int mo131580a(int i, int i2, int i3, boolean z) {
        return this.f191837d.mo130859a(i, i2, i3, z);
    }

    /* renamed from: a */
    public final boolean mo131645a(int i, int i2, float f) {
        return this.f191837d.mo130869a(i, i2, f);
    }

    /* renamed from: a */
    public final int mo131622a(String[] strArr, EnumC85613l lVar) {
        return this.f191830aq.initWithAlgorithm(strArr, lVar);
    }

    /* renamed from: a */
    public final int mo131609a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        return this.f191830aq.setMusicAndResult(str, i, i2, vEAlgorithmPath);
    }

    /* renamed from: a */
    public final int mo131587a(int i, VEListener.AbstractC85240i iVar) {
        return this.f191830aq.beginGenVideoFrames(i, 1, true, iVar);
    }

    /* renamed from: a */
    public final int mo131591a(int i, String str, String str2) {
        return this.f191836c.mo131125a(i, str, 0, 0, str2);
    }

    /* renamed from: a */
    public final int[] mo131651a(int[] iArr, int[] iArr2, String[] strArr) {
        return this.f191836c.mo131136a(iArr, iArr2, strArr);
    }

    /* renamed from: a */
    public final int[] mo131652a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2) {
        return this.f191836c.mo131137a(iArr, iArr2, strArr, iArr3, iArr4, strArr2);
    }

    /* renamed from: a */
    public final int mo131619a(int[] iArr) {
        return this.f191836c.mo131132a(iArr);
    }

    /* renamed from: a */
    public final int mo131581a(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        return this.f191836c.mo131120a(i, i2, vEBaseFilterParam);
    }

    /* renamed from: a */
    public final int mo131582a(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4) {
        return this.f191836c.mo131121a(i, i2, vEBaseFilterParam, i3, i4);
    }

    /* renamed from: b */
    public final int mo131661b(int[] iArr) {
        return this.f191836c.mo131143b(iArr);
    }

    /* renamed from: a */
    public final int mo131588a(int i, VEBaseFilterParam vEBaseFilterParam) {
        return this.f191836c.mo131124a(i, vEBaseFilterParam);
    }

    /* renamed from: a */
    public final int mo131605a(String str, float f) {
        return this.f191836c.mo131128a(str, f);
    }

    /* renamed from: a */
    public final int mo131612a(String str, String str2, float f) {
        return this.f191836c.mo131130a(str, str2, f);
    }

    /* renamed from: b */
    public final int mo131660b(String str, float f) {
        return this.f191836c.mo131142b(str, f);
    }

    /* renamed from: a */
    public final int mo131613a(String str, String str2, float f, float f2, float f3) {
        return this.f191836c.mo131131a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final int mo131603a(VEBaseFilterParam vEBaseFilterParam) {
        return this.f191836c.mo131147c(0, 0, vEBaseFilterParam);
    }

    /* renamed from: a */
    public final int[] mo131650a(VECherEffectParam vECherEffectParam) {
        return this.f191836c.mo131135a(0, 1, vECherEffectParam);
    }

    /* renamed from: a */
    public final int mo131584a(int i, int i2, String str, byte[] bArr, int i3, int i4, VEListener.AbstractC85221a aVar) {
        return this.f191836c.mo131122a(i, i2, str, bArr, i3, i4, aVar);
    }

    /* renamed from: a */
    public final int mo131585a(int i, int i2, String str, byte[] bArr, int i3, VEListener.AbstractC85221a aVar) {
        return this.f191836c.mo131123a(i, i2, str, bArr, i3, aVar);
    }

    /* renamed from: a */
    public final int mo131615a(String str, String[] strArr) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.addInfoSticker(str, strArr);
        }
        C85315al.m146642d("VEEditor", "addInfoSticker 1 STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: a */
    public final int mo131598a(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.setInfoStickerBufferCallback(vEInfoStickerBufferListener);
        }
        C85315al.m146642d("VEEditor", "setInfoStickerBufferCallback STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: a */
    public final int mo131606a(String str, float f, float f2, float f3, float f4) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.addImageSticker(str, f, f2, f3, f4);
        }
        C85315al.m146642d("VEEditor", "addImageSticker STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: a */
    public final int mo131577a(int i, float f, float f2) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.setInfoStickerPosition(i, f, f2);
        }
        C85315al.m146642d("VEEditor", "setInfoStickerPosition STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: a */
    public final int mo131578a(int i, int i2, int i3) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.setInfoStickerTime(i, i2, i3);
        }
        C85315al.m146642d("VEEditor", "setInfoStickerTime STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: a */
    public final int mo131594a(int i, float[] fArr) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.getSrtInfoStickerInitPosition(i, fArr);
        }
        C85315al.m146642d("VEEditor", "getSrtInfoStickerInitPosition STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: a */
    public final int mo131596a(int i, ByteBuffer[] byteBufferArr) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.getInfoStickerPinData(i, byteBufferArr);
        }
        C85315al.m146642d("VEEditor", "getInfoStickerPinData STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: a */
    public final int mo131592a(int i, ByteBuffer byteBuffer) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.restoreInfoStickerPinWithData(i, byteBuffer);
        }
        C85315al.m146642d("VEEditor", "restoreInfoStickerPinWithData STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: a */
    public final void mo131641a(VEListener.AbstractC85222aa aaVar) {
        AbstractC85467d dVar = this.f191790a;
        if (dVar == null) {
            C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        } else {
            dVar.setListenerForMV(aaVar);
        }
    }

    /* renamed from: a */
    public final int mo131617a(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        AbstractC85467d dVar = this.f191790a;
        if (dVar != null) {
            return dVar.initMV(str, strArr, strArr2, str2, i, i2);
        }
        C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    /* renamed from: a */
    public final int mo131599a(VEMVParams vEMVParams) {
        AbstractC85467d dVar = this.f191790a;
        if (dVar != null) {
            return dVar.initMV(vEMVParams);
        }
        C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    /* renamed from: a */
    public final int mo131607a(String str, int i, int i2) {
        AbstractC85467d dVar = this.f191790a;
        if (dVar != null) {
            return dVar.updateMVBackgroundAudioTrack(str, i, i2);
        }
        C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    /* renamed from: a */
    public final int mo131616a(String str, String[] strArr, String[] strArr2) {
        AbstractC85467d dVar = this.f191790a;
        if (dVar != null) {
            return dVar.updateMVResources(str, strArr, strArr2);
        }
        C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    /* renamed from: a */
    public final int mo131614a(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type) {
        AbstractC85467d dVar = this.f191790a;
        if (dVar != null) {
            return dVar.setExternalAlgorithmResult(str, str2, str3, mv_reesult_in_type);
        }
        C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    /* renamed from: a */
    public final int mo131624a(String[] strArr, int[] iArr, int[] iArr2, VETransitionFilterParam[] vETransitionFilterParamArr, String[] strArr2, int[] iArr3, int[] iArr4, float[] fArr, VECanvasFilterParam[] vECanvasFilterParamArr, EnumC85613l lVar) {
        return m147502b(strArr, iArr, iArr2, vETransitionFilterParamArr, strArr2, iArr3, iArr4, fArr, vECanvasFilterParamArr, lVar);
    }

    /* renamed from: a */
    public final int mo131595a(int i, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        return this.f191837d.mo130863a(i, 0, iArr, vEClipTimelineParamArr);
    }

    /* renamed from: a */
    public final int mo131608a(String str, int i, int i2, int i3, int i4, boolean z) {
        return this.f191837d.mo130866a(str, i, i2, i3, i4, z);
    }

    /* renamed from: B */
    public final int mo131565B() {
        return this.f191830aq.restoreAllVideoSound();
    }

    /* renamed from: C */
    public final int mo131566C() {
        return this.f191830aq.genRandomSolve();
    }

    /* renamed from: D */
    public final int mo131567D() {
        return this.f191830aq.genSmartCutting();
    }

    /* renamed from: E */
    public final List<VEClipAlgorithmParam> mo131568E() {
        return this.f191830aq.getAllVideoRangeData();
    }

    /* renamed from: F */
    public final int mo131569F() {
        return this.f191830aq.updateAlgorithmFromNormal();
    }

    /* renamed from: G */
    public final void mo131570G() {
        this.f191836c.mo131118a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final C30675c mo131573J() {
        return this.f191836c.mo131152d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo131574K() {
        this.f191836c.mo131158i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final int mo131575L() {
        return this.f191836c.mo131118a();
    }

    /* renamed from: e */
    public final int mo131681e() {
        return this.f191765B.enableHighSpeedForSingle(true);
    }

    /* renamed from: t */
    public final int mo131725t() {
        return this.f191765B.getCurPosition();
    }

    /* renamed from: y */
    public final int mo131735y() {
        return this.f191837d.mo130857a(0, 0, 0);
    }

    /* renamed from: z */
    public final int mo131737z() {
        return this.f191830aq.initBingoAlgorithm();
    }

    /* renamed from: A */
    public final int mo131564A() {
        return this.f191830aq.removeAllVideoSound();
    }

    /* renamed from: l */
    public final String[] mo131709l() {
        if (this.f191838e.f191686g) {
            return this.f191838e.f191684e;
        }
        return null;
    }

    /* renamed from: m */
    public final String[] mo131711m() {
        if (this.f191838e.f191686g) {
            return this.f191838e.f191685f;
        }
        return null;
    }

    /* renamed from: n */
    public final String[] mo131713n() {
        return this.f191838e.f191681b;
    }

    static {
        Covode.recordClassIndex(99765);
    }

    /* renamed from: N */
    private void m147486N() {
        C85315al.m146641c("VEEditor", "clearNativeFromInvokers... ");
        this.f191790a.clearNativeFromMV();
        this.f191830aq.clearNativeFromBingo();
        this.f191835b.clearNativeFromSticker();
        this.f191836c.mo131159j();
    }

    /* renamed from: O */
    private int m147487O() {
        int pause;
        MethodCollector.m26663i(12246);
        synchronized (this) {
            try {
                C85315al.m146641c("VEEditor", "pause... refreshFrame:false");
                pause = this.f191765B.pause(0);
            } finally {
                MethodCollector.m26664o(12246);
            }
        }
        return pause;
    }

    /* renamed from: P */
    private void m147488P() {
        String generateMd5Checkcode = DigestUtils.generateMd5Checkcode(Build.MODEL.toLowerCase());
        C85315al.m146641c("VEEditor", "addCopyright... ");
        this.f191765B.addMetaData("copyright", generateMd5Checkcode);
    }

    /* renamed from: H */
    public final int mo131571H() {
        AbstractC85467d dVar = this.f191790a;
        if (dVar != null) {
            return dVar.getMVBackgroundAudioTrackIndex();
        }
        C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    /* renamed from: I */
    public final VEMVAudioInfo mo131572I() {
        AbstractC85467d dVar = this.f191790a;
        if (dVar != null) {
            return dVar.getMVOriginalBackgroundAudio();
        }
        C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        return null;
    }

    /* renamed from: d */
    public final Bitmap mo131677d() {
        C85315al.m146637a("VEEditor", "getCurrDisplayImage...");
        return mo131630a(-1);
    }

    /* renamed from: p */
    public final int mo131717p() {
        int O;
        MethodCollector.m26663i(12247);
        synchronized (this) {
            try {
                O = m147487O();
            } finally {
                MethodCollector.m26664o(12247);
            }
        }
        return O;
    }

    /* renamed from: q */
    public final int mo131719q() {
        int pause;
        MethodCollector.m26663i(12492);
        synchronized (this) {
            try {
                pause = this.f191765B.pause(1);
            } finally {
                MethodCollector.m26664o(12492);
            }
        }
        return pause;
    }

    /* renamed from: r */
    public final int mo131721r() {
        int refreshCurrentFrame;
        MethodCollector.m26663i(12718);
        synchronized (this) {
            try {
                C85315al.m146639b("VEEditor", "refreshCurrentFrame...");
                refreshCurrentFrame = this.f191765B.refreshCurrentFrame(0);
            } finally {
                MethodCollector.m26664o(12718);
            }
        }
        return refreshCurrentFrame;
    }

    /* renamed from: s */
    public final int mo131723s() {
        int duration;
        MethodCollector.m26663i(12821);
        synchronized (this) {
            try {
                duration = this.f191765B.getDuration();
            } finally {
                MethodCollector.m26664o(12821);
            }
        }
        return duration;
    }

    /* renamed from: w */
    public final boolean mo131731w() {
        boolean z;
        MethodCollector.m26663i(13995);
        synchronized (this) {
            try {
                if (this.f191765B.getNativeHandler() != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(13995);
            }
        }
        return z;
    }

    /* renamed from: com.ss.android.vesdk.w$h */
    public enum EnumC85609h {
        EDITOR_NORMAl_MODE,
        EDITOR_SLOMO_MODE;

        static {
            Covode.recordClassIndex(99793);
        }
    }

    /* renamed from: i */
    public final void mo131699i() {
        MethodCollector.m26663i(11337);
        this.f191856w.set(true);
        C85315al.m146641c("VEEditor", "destroy... set destroying true");
        synchronized (this) {
            try {
                if (this.f191765B != null) {
                    C85315al.m146641c("VEEditor", "onRelease... ");
                    this.f191765B.stop();
                    this.f191765B.releaseEngine();
                }
                this.f191856w.set(false);
            } finally {
                MethodCollector.m26664o(11337);
            }
        }
    }

    /* renamed from: k */
    public final EnumC85611j mo131706k() {
        MethodCollector.m26663i(11661);
        synchronized (this) {
            try {
                TEInterface tEInterface = this.f191765B;
                if (tEInterface == null) {
                    C85315al.m146641c("VEEditor", "video editor is created yet");
                    return EnumC85611j.IDLE;
                }
                int curState = tEInterface.getCurState();
                if (curState < 0) {
                    C85315al.m146641c("VEEditor", "native video editor is not inited, already released or releasing");
                    EnumC85611j jVar = EnumC85611j.IDLE;
                    MethodCollector.m26664o(11661);
                    return jVar;
                }
                EnumC85611j valueOf = EnumC85611j.valueOf(curState);
                MethodCollector.m26664o(11661);
                return valueOf;
            } finally {
                MethodCollector.m26664o(11661);
            }
        }
    }

    /* renamed from: u */
    public final int mo131728u() {
        int cancelGetImages;
        MethodCollector.m26663i(13658);
        synchronized (this) {
            try {
                C85315al.m146641c("VEEditor", "cancelGetVideoFrames...");
                cancelGetImages = this.f191765B.cancelGetImages();
            } finally {
                MethodCollector.m26664o(13658);
            }
        }
        return cancelGetImages;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.w$7 */
    public static /* synthetic */ class C855987 {

        /* renamed from: a */
        static final /* synthetic */ int[] f191894a;

        /* renamed from: b */
        static final /* synthetic */ int[] f191895b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85581w.C855987.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.vesdk.w$e */
    public enum EnumC85606e {
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE,
        SCALE_MODE_FIT_START_WITH_2DENGINE,
        SCALE_MODE_FIT_END_WITH_2DENGINE,
        SCALE_MODE_CANVAS;

        static {
            Covode.recordClassIndex(99790);
        }
    }

    /* renamed from: com.ss.android.vesdk.w$k */
    public enum EnumC85612k {
        ALIGN_PARENT_LEFT,
        ALIGN_PARENT_TOP,
        ALIGN_PARENT_RIGHT,
        ALIGN_PARENT_BOTTOM,
        CENTER_IN_PARENT,
        CENTER_HORIZONTAL,
        CENTER_VERTICAL;

        static {
            Covode.recordClassIndex(99796);
        }
    }

    /* renamed from: com.ss.android.vesdk.w$l */
    public enum EnumC85613l {
        VIDEO_OUT_RATIO_1_1,
        VIDEO_OUT_RATIO_4_3,
        VIDEO_OUT_RATIO_3_4,
        VIDEO_OUT_RATIO_16_9,
        VIDEO_OUT_RATIO_9_16,
        VIDEO_OUT_RATIO_ORIGINAL;

        static {
            Covode.recordClassIndex(99797);
        }
    }

    /* renamed from: com.ss.android.vesdk.w$m */
    public enum EnumC85614m {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE;

        static {
            Covode.recordClassIndex(99798);
        }
    }

    /* renamed from: M */
    private void m147485M() {
        this.f191790a = (AbstractC85467d) C85311ai.m146629a("com.ss.android.vesdk.VEMVInvoker", new Class[]{C85581w.class}, this);
        this.f191830aq = (AbstractC85465b) C85311ai.m146629a("com.ss.android.vesdk.VEBingoInvoker", new Class[]{C85581w.class}, this);
        this.f191835b = (AbstractC85469f) C85311ai.m146629a("com.ss.android.vesdk.VEStickerInvoker", new Class[]{C85581w.class}, this);
        this.f191836c = new C85617z(this);
        this.f191837d = new C85387bb(this);
        this.f191831ar = new C85525m(this);
        if (this.f191835b == null) {
            C85315al.m146642d("VEEditor", "VEStickerInvoker is NULL");
        }
    }

    /* renamed from: h */
    public final void mo131696h() {
        MethodCollector.m26663i(11188);
        synchronized (this) {
            try {
                if (this.f191765B != null) {
                    C85315al.m146641c("VEEditor", "stop... ");
                    this.f191765B.stop();
                }
            } finally {
                MethodCollector.m26664o(11188);
            }
        }
    }

    /* renamed from: o */
    public final int mo131714o() {
        MethodCollector.m26663i(12107);
        if (this.f191856w.get()) {
            C85315al.m146641c("VEEditor", "no need to play, is destroying, just return");
            MethodCollector.m26664o(12107);
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f191856w.get()) {
                    C85315al.m146641c("VEEditor", "no need to play, is destroying, just lock return");
                    return 0;
                }
                C85315al.m146641c("VEEditor", "play...");
                this.f191770G = 0;
                long currentTimeMillis = System.currentTimeMillis();
                this.f191772I = currentTimeMillis;
                if (this.f191775L == 0) {
                    this.f191775L = currentTimeMillis;
                }
                int start = this.f191765B.start();
                MethodCollector.m26664o(12107);
                return start;
            } finally {
                MethodCollector.m26664o(12107);
            }
        }
    }

    /* renamed from: v */
    public final boolean mo131730v() {
        MethodCollector.m26663i(13792);
        synchronized (this) {
            try {
                if (!this.f191783T) {
                    C85615x xVar = new C85615x(-105, "Make sure the initialization is successful before calling!!!");
                    MethodCollector.m26664o(13792);
                    throw xVar;
                } else if (this.f191765B.getNativeHandler() == 0) {
                    return false;
                } else {
                    VEPublishSettingManager.EnumC85544a.INSTANCE.f191641b.nativeSetEditorStatus(this.f191765B.genEditorStatus());
                    boolean nativeIsUseFilterProcess = VEPublishSettingManager.EnumC85544a.INSTANCE.f191641b.nativeIsUseFilterProcess();
                    MethodCollector.m26664o(13792);
                    return nativeIsUseFilterProcess;
                }
            } finally {
                MethodCollector.m26664o(13792);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo131734x() {
        int i = this.f191857x;
        int i2 = this.f191858y;
        if (((float) this.f191839f.width) / ((float) this.f191839f.height) > ((float) i) / ((float) i2)) {
            this.f191794aD = i;
            this.f191795aE = (int) (((float) i) / (((float) this.f191839f.width) / ((float) this.f191839f.height)));
        } else {
            this.f191795aE = i2;
            this.f191794aD = (int) (((float) i2) / (((float) this.f191839f.height) / ((float) this.f191839f.width)));
        }
        C85315al.m146637a("VEEditor", "updateInitDisplaySize... mInitDisplayWidth:" + this.f191794aD + ", mInitDisplayHeight:" + this.f191795aE);
    }

    /* renamed from: f */
    public final int mo131685f() {
        int prepareEngine;
        MethodCollector.m26663i(14178);
        synchronized (this) {
            try {
                C85315al.m146641c("VEEditor", "prepare...");
                m147509z(this.f191821ah);
                this.f191765B.setEnableRemuxVideo(false);
                this.f191765B.setUsrRotate(0);
                this.f191765B.enableReEncodeOpt(false);
                int i = this.f191807aQ;
                if (i == 1) {
                    C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_editor_firstframe_delay");
                    if (!(a == null || a.f191742b == null || !(a.f191742b instanceof Integer))) {
                        this.f191765B.setEditorFirstFrameDelay(((Integer) a.f191742b).intValue());
                    }
                } else if (i == 2) {
                    C85568t.C85573d a2 = C85568t.m147473a().mo131556a("ve_record_editor_firstframe_delay");
                    if (!(a2 == null || a2.f191742b == null || !(a2.f191742b instanceof Integer))) {
                        this.f191765B.setEditorFirstFrameDelay(((Integer) a2.f191742b).intValue());
                    }
                } else {
                    this.f191765B.setEditorFirstFrameDelay(0);
                }
                prepareEngine = this.f191765B.prepareEngine(0);
                if (prepareEngine != 0) {
                    C85315al.m146642d("VEEditor", "prepare() prepareEngine failed: result: ".concat(String.valueOf(prepareEngine)));
                    mo131663b();
                }
                int[] initResolution = this.f191765B.getInitResolution();
                this.f191839f.width = initResolution[0];
                this.f191839f.height = initResolution[1];
                if (this.f191857x > 0 && this.f191858y > 0) {
                    mo131734x();
                }
                mo131664b(this.f191820ag);
            } finally {
                MethodCollector.m26664o(14178);
            }
        }
        return prepareEngine;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo131689g() {
        if (!this.f191832as || !f191759at) {
            return 0;
        }
        m147509z(this.f191821ah);
        if (this.f191850q != null) {
            EnumC85611j jVar = EnumC85611j.ERROR;
            try {
                jVar = mo131706k();
                int curPosition = this.f191765B.getCurPosition();
                this.f191765B.setEnableRemuxVideo(false);
                this.f191765B.setUsrRotate(0);
                this.f191765B.enableReEncodeOpt(false);
                int prepareEngine = this.f191765B.prepareEngine(0);
                if (prepareEngine != 0) {
                    C85315al.m146642d("VEEditor", "prepareEngine error: ".concat(String.valueOf(prepareEngine)));
                    this.f191850q.onCallback(4120, jVar.ordinal(), (float) curPosition, null);
                    return prepareEngine;
                }
                int[] initResolution = this.f191765B.getInitResolution();
                this.f191839f.width = initResolution[0];
                this.f191839f.height = initResolution[1];
                if (this.f191857x > 0 && this.f191858y > 0) {
                    mo131734x();
                }
                this.f191850q.onCallback(4120, jVar.ordinal(), (float) curPosition, null);
                return 0;
            } catch (Exception e) {
                C85315al.m146642d("VEEditor", "prepareWithCallback error: ".concat(String.valueOf(e)));
                this.f191850q.onCallback(4120, jVar.ordinal(), 0.0f, null);
                return -1;
            }
        } else {
            this.f191765B.setEnableRemuxVideo(false);
            this.f191765B.setUsrRotate(0);
            this.f191765B.enableReEncodeOpt(false);
            return this.f191765B.prepareEngine(0);
        }
    }

    /* renamed from: j */
    public final void mo131703j() {
        MethodCollector.m26663i(11660);
        this.f191856w.set(true);
        C85315al.m146641c("VEEditor", "destroy... set destroying true");
        synchronized (this) {
            try {
                this.f191783T = false;
                C85315al.m146641c("VEEditor", "onDestroy... ");
                TEVideoUtils.nativeCancelCompileProbe();
                if (this.f191765B.getNativeHandler() != 0) {
                    this.f191765B.stop();
                    if (this.f191819af == 1) {
                        TEMonitorInvoker.nativeMonitorPerfWithType(3);
                    }
                    SurfaceView surfaceView = this.f191768E;
                    if (surfaceView != null) {
                        surfaceView.getHolder().removeCallback(this.f191824ak);
                    } else {
                        TextureView textureView = this.f191769F;
                        if (textureView != null && textureView.getSurfaceTextureListener() == this.f191823aj) {
                            this.f191769F.setSurfaceTextureListener(null);
                        }
                    }
                    this.f191768E = null;
                    this.f191769F = null;
                    this.f191766C = null;
                    TEInterface tEInterface = this.f191765B;
                    if (tEInterface != null) {
                        tEInterface.setOpenGLListeners(null);
                        this.f191765B.setInfoListener(null);
                        this.f191765B.setErrorListener(null);
                        this.f191765B.destroyEngine();
                        m147486N();
                    }
                    this.f191838e = null;
                    Bitmap bitmap = this.f191818ae;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.f191818ae.recycle();
                        this.f191818ae = null;
                    }
                    this.f191856w.set(false);
                    MethodCollector.m26664o(11660);
                }
            } finally {
                MethodCollector.m26664o(11660);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.w$b */
    public class RunnableC85603b implements Runnable {

        /* renamed from: a */
        String f191905a;

        /* renamed from: b */
        public String f191906b;

        /* renamed from: c */
        String f191907c;

        /* renamed from: d */
        public AbstractC85541q f191908d;

        /* renamed from: e */
        boolean f191909e;

        /* renamed from: f */
        public String f191910f;

        /* renamed from: g */
        public int f191911g = 50;

        /* renamed from: h */
        public int f191912h = 50;

        /* renamed from: i */
        public int f191913i = 100;

        /* renamed from: j */
        public int f191914j = 100;

        /* renamed from: k */
        public boolean f191915k;

        /* renamed from: l */
        public int f191916l;

        /* renamed from: m */
        public int f191917m;

        /* renamed from: n */
        public int f191918n = -1;

        static {
            Covode.recordClassIndex(99787);
        }

        public final void run() {
            String a;
            String a2;
            if (TextUtils.isEmpty(this.f191906b) || TextUtils.isEmpty(this.f191907c) || this.f191909e) {
                AbstractC85541q qVar = this.f191908d;
                if (qVar != null) {
                    qVar.onCallback(4103, -205, 0.0f, "File is empty or running");
                    return;
                }
                return;
            }
            this.f191909e = true;
            if (this.f191915k) {
                a = C1764a.m5929a(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -y -i %s -vf palettegen=reserve_transparent=on %s", new Object[]{Integer.valueOf(this.f191916l), Integer.valueOf(this.f191917m), this.f191906b, this.f191905a});
            } else {
                a = C1764a.m5928a("ffmpeg -y -i %s -vf palettegen %s", new Object[]{this.f191906b, this.f191905a});
            }
            int executeFFmpegCommand = TEVideoUtils.executeFFmpegCommand(a, null);
            if (executeFFmpegCommand != 0) {
                this.f191909e = false;
                AbstractC85541q qVar2 = this.f191908d;
                if (qVar2 != null) {
                    qVar2.onCallback(4103, executeFFmpegCommand, 0.0f, "ffmpeg gen palette");
                    return;
                }
                return;
            }
            if (this.f191915k) {
                a2 = C1764a.m5929a(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -r %d -y -i %s -i %s -lavfi paletteuse=dither=bayer %s", new Object[]{Integer.valueOf(this.f191916l), Integer.valueOf(this.f191917m), Integer.valueOf(this.f191918n), this.f191906b, this.f191905a, this.f191907c});
            } else if (this.f191910f != null) {
                a2 = C1764a.m5929a(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [2:v]scale=w=%d:h=%d[o0];[0:v][o0]overlay=x=%d-w/2:y=%d-h/2[o1];[o1][1:v]paletteuse -f gif %s", new Object[]{this.f191906b, this.f191905a, this.f191910f, Integer.valueOf(this.f191911g), Integer.valueOf(this.f191912h), Integer.valueOf(this.f191913i), Integer.valueOf(this.f191914j), this.f191907c});
            } else {
                a2 = C1764a.m5929a(Locale.US, "ffmpeg -y -i %s -i %s -lavfi paletteuse -f gif %s", new Object[]{this.f191906b, this.f191905a, this.f191907c});
            }
            int executeFFmpegCommand2 = TEVideoUtils.executeFFmpegCommand(a2, null);
            AbstractC85541q qVar3 = this.f191908d;
            if (qVar3 != null) {
                qVar3.onCallback(4103, executeFFmpegCommand2, 0.0f, "ffmepg convert to gif");
            }
            if (this.f191915k) {
                if (m147697a(new File(this.f191906b))) {
                    C85315al.m146637a("VEEditor", "clear raw data:" + this.f191906b);
                }
                if (m147697a(new File(this.f191905a))) {
                    C85315al.m146637a("VEEditor", "clear palette:" + this.f191905a);
                }
            }
            this.f191909e = false;
        }

        RunnableC85603b() {
        }

        /* renamed from: a */
        public final void mo131752a(String str) {
            this.f191907c = str;
            if (TextUtils.isEmpty(str)) {
                this.f191905a = null;
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = this.f191907c;
            this.f191905a = sb.append(str2.substring(0, str2.lastIndexOf("."))).append(".png").toString();
        }

        /* renamed from: a */
        private static boolean m147697a(File file) {
            MethodCollector.m26663i(13274);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(13274);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(13274);
            return delete;
        }
    }

    /* renamed from: c */
    public final VESize mo131674c() {
        VESize vESize = new VESize(this.f191794aD, this.f191795aE);
        C85315al.m146639b("VEEditor", "getInitSize... initWidth:" + vESize.width + ", initHeight:" + vESize.height);
        return vESize;
    }

    /* renamed from: A */
    private int m147484A(int i) {
        return this.f191837d.mo130870b(i);
    }

    /* renamed from: b */
    public final float mo131653b(String str) {
        return this.f191836c.mo131117a(str);
    }

    /* renamed from: c */
    public final int mo131670c(String str) {
        return this.f191836c.mo131141b(str);
    }

    /* renamed from: g */
    public final int mo131690g(int i) {
        return m147484A(i);
    }

    /* renamed from: h */
    public final float mo131693h(int i) {
        return this.f191837d.mo130874c(i);
    }

    /* renamed from: i */
    public final int mo131697i(int i) {
        return this.f191837d.mo130855a(i);
    }

    /* renamed from: j */
    public final int mo131701j(int i) {
        return this.f191830aq.removeMusic(i);
    }

    /* renamed from: k */
    public final int mo131705k(int i) {
        return this.f191830aq.cancelGenVideoFrame(i);
    }

    /* renamed from: l */
    public final void mo131708l(int i) {
        this.f191836c.mo131133a(i);
    }

    /* renamed from: m */
    public final int mo131710m(int i) {
        return this.f191836c.mo131138b(i);
    }

    /* renamed from: n */
    public final int mo131712n(int i) {
        return this.f191836c.mo131146c(i);
    }

    /* renamed from: o */
    public final int mo131715o(int i) {
        return this.f191836c.mo131151d(i);
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C85315al.m146643e("VEEditor", "onFrameAvailable...");
    }

    /* renamed from: p */
    public final int mo131718p(int i) {
        return this.f191836c.mo131154e(i);
    }

    /* renamed from: c */
    public final int mo131673c(int[] iArr) {
        return this.f191836c.mo131148c(iArr);
    }

    /* renamed from: d */
    public final int mo131676d(String str) {
        return this.f191836c.mo131127a(str, 1.0d);
    }

    /* renamed from: j */
    public final void mo131704j(boolean z) {
        this.f191836c.mo131145b(z);
    }

    /* renamed from: k */
    public final void mo131707k(boolean z) {
        this.f191836c.mo131150c(z);
    }

    /* renamed from: z */
    private void m147509z(int i) {
        C85315al.m146637a("VEEditor", "setVideoBackgroudColor... color:".concat(String.valueOf(i)));
        this.f191821ah = i;
        this.f191765B.setVideoBackGroundColor(i);
    }

    /* renamed from: c */
    public final int mo131668c(float f) {
        AbstractC85467d dVar = this.f191790a;
        if (dVar != null) {
            return dVar.setMvOriginalAudio(true, f);
        }
        C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    /* renamed from: e */
    public final void mo131683e(int i) {
        this.f191807aQ = i;
        C85315al.m146641c("VEEditor", "setEditorMode: ".concat(String.valueOf(i)));
    }

    /* renamed from: f */
    public final int mo131686f(int i) {
        C85315al.m146637a("VEEditor", "setPreviewFps = ".concat(String.valueOf(i)));
        this.f191765B.setPreviewFps(i);
        return 0;
    }

    /* renamed from: i */
    public final void mo131700i(boolean z) {
        this.f191836c.mo131134a(z);
    }

    /* renamed from: t */
    public final int mo131726t(int i) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.setInfoStickerRestoreMode(i);
        }
        C85315al.m146642d("VEEditor", "setInfoStickerRestoreMode STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: u */
    public final float mo131727u(int i) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.getInfoStickerScale(i);
        }
        C85315al.m146642d("VEEditor", "getInfoStickerScale STICKER IS NOT SUPPORT !!!");
        return -901.0f;
    }

    /* renamed from: v */
    public final float mo131729v(int i) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.getInfoStickerRotate(i);
        }
        C85315al.m146642d("VEEditor", "getInfoStickerRotate STICKER IS NOT SUPPORT !!!");
        return -901.0f;
    }

    /* renamed from: x */
    public final int mo131733x(int i) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.beginInfoStickerPin(i);
        }
        C85315al.m146642d("VEEditor", "beginInfoStickerPin STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: y */
    public final int mo131736y(int i) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.cancelInfoStickerPin(i);
        }
        C85315al.m146642d("VEEditor", "cancelInfoStickerPin STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: c */
    private boolean[] m147505c(String[] strArr) {
        boolean[] zArr;
        MethodCollector.m26663i(14070);
        synchronized (this) {
            try {
                int length = strArr.length;
                zArr = new boolean[length];
                for (int i = 0; i < length; i++) {
                    String str = strArr[i];
                    if (str != null && !str.isEmpty()) {
                        zArr[i] = true;
                    }
                }
            } finally {
                MethodCollector.m26664o(14070);
            }
        }
        return zArr;
    }

    /* renamed from: d */
    private String[] m147506d(String[] strArr) {
        String[] strArr2;
        MethodCollector.m26663i(14071);
        synchronized (this) {
            try {
                int length = strArr.length;
                this.f191796aF = 0;
                this.f191797aG = 0;
                strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    String e = m147507e(strArr[i]);
                    if (e == null || e.isEmpty()) {
                        strArr2[i] = "";
                    } else {
                        strArr2[i] = e;
                    }
                }
            } finally {
                MethodCollector.m26664o(14071);
            }
        }
        return strArr2;
    }

    /* renamed from: b */
    public final int mo131654b(float f) {
        C85315al.m146641c("VEEditor", "setSpeedRatioAndUpdate = ".concat(String.valueOf(f)));
        this.f191765B.stop();
        if (f > 3.0f) {
            f = 3.0f;
        }
        this.f191765B.setSpeedRatio(f);
        this.f191765B.createTimeline();
        return this.f191765B.prepareEngine(0);
    }

    /* renamed from: e */
    public final void mo131684e(boolean z) {
        C85315al.m146637a("VEEditor", "setLoopPlay");
        this.f191765B.setLooping(z);
    }

    /* renamed from: f */
    public final synchronized void mo131688f(boolean z) {
        MethodCollector.m26663i(14217);
        C85315al.m146637a("VEEditor", "enableSimpleProcessor: " + String.valueOf(z));
        this.f191765B.enableSimpleProcessor(z);
        MethodCollector.m26664o(14217);
    }

    /* renamed from: h */
    public final int mo131695h(boolean z) {
        C85315al.m146641c("VEEditor", "enableEffect... enable = ".concat(String.valueOf(z)));
        int enableEffect = this.f191765B.enableEffect(z);
        if (enableEffect != 0) {
            C85315al.m146642d("VEEditor", "enableEffect failed, ret = ".concat(String.valueOf(enableEffect)));
        }
        return enableEffect;
    }

    /* renamed from: q */
    public final boolean mo131720q(int i) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.isInfoStickerAnimatable(i);
        }
        C85315al.m146642d("VEEditor", "isInfoStickerAnimatable STICKER IS NOT SUPPORT !!!");
        return false;
    }

    /* renamed from: r */
    public final int mo131722r(int i) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.removeInfoSticker(i);
        }
        C85315al.m146642d("VEEditor", "removeInfoSticker STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: s */
    public final float[] mo131724s(int i) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.getInfoStickerBoundingBox(i);
        }
        C85315al.m146642d("VEEditor", "getInfoStickerBoundingBox STICKER IS NOT SUPPORT !!!");
        return null;
    }

    /* renamed from: w */
    public final boolean mo131732w(int i) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.getInfoStickerVisible(i);
        }
        C85315al.m146642d("VEEditor", "getInfoStickerVisible STICKER IS NOT SUPPORT !!!");
        return false;
    }

    /* renamed from: b */
    private int m147501b(EnumC85606e eVar) {
        C85315al.m146641c("VEEditor", "setScaleMode... mode:" + eVar + ", x = 0.0, y = 0.0");
        switch (C855987.f191894a[eVar.ordinal()]) {
            case 1:
                this.f191765B.setResizer(2, 0.0f, 0.0f);
                return 0;
            case 2:
                this.f191765B.setResizer(1, 0.0f, 0.0f);
                return 0;
            case 3:
                this.f191765B.setResizer(3, 0.0f, 0.0f);
                return 0;
            case 4:
                this.f191765B.setResizer(4, 0.0f, 0.0f);
                return 0;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                this.f191765B.setResizer(5, 0.0f, 0.0f);
                return 0;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                this.f191765B.setResizer(6, 0.0f, 0.0f);
                return 0;
            default:
                return 0;
        }
    }

    /* renamed from: f */
    private String m147508f(String str) {
        MethodCollector.m26663i(14126);
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                String addFileInfoCache = this.f191765B.addFileInfoCache(str);
                if (addFileInfoCache == null || addFileInfoCache.equals("")) {
                    MethodCollector.m26664o(14126);
                    return "";
                }
                long lastModified = new File(str).lastModified();
                if (lastModified == 0) {
                    MethodCollector.m26664o(14126);
                    return "";
                }
                f191760aw.put(str, new Pair<>(Long.valueOf(lastModified), addFileInfoCache));
                MethodCollector.m26664o(14126);
                return addFileInfoCache;
            } finally {
                MethodCollector.m26664o(14126);
            }
        }
    }

    /* renamed from: d */
    public final void mo131678d(int i) {
        this.f191819af = i;
        C85315al.m146641c("VEEditor", "setPageMode: ".concat(String.valueOf(i)));
        this.f191765B.setPageMode(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.w$i */
    public class HandlerC85610i extends Handler {
        static {
            Covode.recordClassIndex(99794);
        }

        public final void handleMessage(Message message) {
            String obj;
            int i = message.what;
            if (i != 4101) {
                if (i != 4103) {
                    if (i != 4105) {
                        if (i != 4117) {
                            if (i != 4133) {
                                if (i == 4157 && C85581w.this.f191849p != null) {
                                    VEListener.AbstractC85236e eVar = C85581w.this.f191849p;
                                    int i2 = message.arg1;
                                    int i3 = message.arg2;
                                }
                            } else if (C85581w.this.f191845l != null) {
                                VEListener.AbstractC85231aj ajVar = C85581w.this.f191845l;
                                int i4 = message.arg1;
                                int i5 = message.arg2;
                            }
                        } else if (C85581w.this.f191814aa != null) {
                            C85581w.this.f191814aa.mo110443a(null, -1, -1);
                            C85581w.this.f191814aa = null;
                        }
                    } else if (C85581w.this.f191843j != null) {
                        C85581w.this.f191843j.onCompileProgress(((Float) message.obj).floatValue());
                    }
                } else if (C85581w.this.f191843j != null) {
                    if (message.arg1 < 0) {
                        VEListener.AbstractC85248q qVar = C85581w.this.f191843j;
                        int i6 = message.arg1;
                        int i7 = message.arg1;
                        if (message.obj == null) {
                            obj = "";
                        } else {
                            obj = message.obj.toString();
                        }
                        qVar.onCompileError(i6, i7, 0.0f, obj);
                    } else {
                        C85581w.this.f191843j.onCompileDone();
                    }
                    C85581w.this.f191843j = null;
                }
            } else if (C85581w.this.f191842i != null) {
                C85581w.this.f191842i.mo87822a();
                C85581w.this.f191842i = null;
            }
        }

        public HandlerC85610i(Looper looper) {
            super(looper);
        }
    }

    public C85581w(String str) {
        this.f191839f = new VESize(-1, -1);
        this.f191840g = "mp4";
        this.f191841h = new HandlerC85610i(Looper.getMainLooper());
        this.f191842i = null;
        this.f191843j = null;
        this.f191844k = null;
        this.f191845l = null;
        this.f191846m = null;
        this.f191847n = null;
        this.f191848o = null;
        this.f191849p = null;
        this.f191850q = null;
        this.f191851r = null;
        this.f191852s = new C30651j();
        this.f191853t = new C30634a();
        this.f191832as = true;
        this.f191854u = "unknown";
        this.f191833au = null;
        this.f191834av = "/concatShootVideo";
        this.f191855v = new HashMap();
        this.f191856w = new AtomicBoolean(false);
        this.f191791aA = -1;
        this.f191792aB = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855821 */

            static {
                Covode.recordClassIndex(99766);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(int i, int i2, float f, String str) {
                long j;
                long j2;
                int i3;
                MethodCollector.m26663i(13020);
                if (i == 4101) {
                    if (C85581w.this.f191776M > 0) {
                        System.currentTimeMillis();
                    }
                    if (C85581w.this.f191842i != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        C85581w.this.f191841h.sendEmptyMessage(4101);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        C85581w.this.f191850q.onCallback(4101, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (i != 4103) {
                    if (i != 4105) {
                        if (i != 4129) {
                            if (i != 4157) {
                                if (i != 4133) {
                                    if (i == 4134) {
                                        C85581w.this.f191822ai = f;
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (i != 4144) {
                                        if (i != 4145) {
                                            if (i != 4160) {
                                                if (i != 4161) {
                                                    if (C85581w.this.f191850q != null) {
                                                        C85315al.m146639b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                                    }
                                                } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                    C85581w.this.f191788Y.f191917m = i2;
                                                    MethodCollector.m26664o(13020);
                                                    return;
                                                }
                                            } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                C85581w.this.f191788Y.f191916l = i2;
                                                MethodCollector.m26664o(13020);
                                                return;
                                            }
                                        } else if (C85581w.this.f191846m != null) {
                                            C85581w.this.f191846m.mo87654b();
                                            MethodCollector.m26664o(13020);
                                            return;
                                        } else if (C85581w.this.f191850q != null) {
                                            C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                            C85581w.this.f191850q.onCallback(i, i2, f, str);
                                            MethodCollector.m26664o(13020);
                                            return;
                                        }
                                    } else if (C85581w.this.f191846m != null) {
                                        C85581w.this.f191846m.mo87653a();
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (C85581w.this.f191850q != null) {
                                        C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                        MethodCollector.m26664o(13020);
                                        return;
                                    }
                                } else if (!(C85581w.this.f191845l == null || C85581w.this.f191841h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i2;
                                    message.arg2 = (int) f;
                                    C85581w.this.f191841h.sendMessage(message);
                                    MethodCollector.m26664o(13020);
                                    return;
                                }
                            } else if (!(C85581w.this.f191849p == null || C85581w.this.f191841h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i2;
                                message2.arg2 = (int) f;
                                C85581w.this.f191841h.sendMessage(message2);
                                MethodCollector.m26664o(13020);
                                return;
                            }
                        } else if (C85581w.this.f191777N == 0) {
                            C85581w.this.f191777N = System.currentTimeMillis();
                            C85315al.m146637a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.m26664o(13020);
                            return;
                        }
                    } else if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        Message message3 = new Message();
                        message3.what = i;
                        message3.obj = Float.valueOf(f);
                        C85581w.this.f191841h.sendMessage(message3);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (C85581w.this.f191787X) {
                    C85581w.this.f191788Y.f191908d = C85581w.this.f191850q;
                    new Thread(C85581w.this.f191788Y).start();
                    C85581w.this.f191787X = false;
                    MethodCollector.m26664o(13020);
                    return;
                } else {
                    C85581w wVar = C85581w.this;
                    if (i2 == 1 || i2 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - wVar.f191786W;
                        C85315al.m146641c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        C30695h.m63065a("te_composition_time", currentTimeMillis);
                        C30695h.m63062a(1, "te_composition_time", currentTimeMillis);
                        if (C30004e.m60552a(wVar.f191785V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(wVar.f191785V, iArr) != null) {
                                long length = new File(wVar.f191785V).length();
                                C30695h.m63065a("te_composition_page_mode", (long) wVar.f191819af);
                                double d = (double) length;
                                Double.isNaN(d);
                                double d2 = (d / 1024.0d) / 1024.0d;
                                C30695h.m63064a("te_composition_file_size", d2);
                                C30695h.m63064a("te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63064a("te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63064a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    C85315al.m146641c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                C30695h.m63062a(1, "te_composition_page_mode", (long) wVar.f191819af);
                                C30695h.m63063a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                C30695h.m63061a(1, "te_composition_fps", (double) iArr[7]);
                                C30695h.m63061a(1, "te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63061a(1, "te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63061a(1, "te_composition_file_size", d2);
                                int i4 = wVar.f191816ac.f73424c;
                                if (i4 != 0) {
                                    C30695h.m63062a(1, "te_composition_time_filter_type", (long) i4);
                                }
                                C30652a.m63004a("te_composition_file_duration", (long) iArr[3]);
                                C30652a.m63004a("te_composition_video_frame_rate", (long) iArr[7]);
                                C30652a.m63004a("te_composition_video_resolution_width", (long) iArr[0]);
                                C30652a.m63004a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b = wVar.f191816ac.mo55070b();
                        if (b) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        C30695h.m63062a(1, "te_composition_effect_add", j);
                        if (!b) {
                            C30695h.m63063a(1, "te_composition_effect_json", wVar.f191816ac.mo55066a(0));
                        }
                        boolean c = wVar.f191816ac.mo55071c();
                        if (c) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        C30695h.m63062a(1, "te_composition_info_sticker_add", j2);
                        if (!c) {
                            C30695h.m63063a(1, "te_composition_info_sticker_json", wVar.f191816ac.mo55066a(1));
                        }
                        wVar.f191816ac.mo55067a();
                        TEMonitorInvoker.nativeMonitorPerf(C30695h.f73418b);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_file", wVar.f191840g);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_result", "succ");
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            C30695h.m63067a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", wVar.f191854u);
                            if (i2 == 1 || i2 == 2) {
                                i3 = 0;
                            } else {
                                i3 = i2;
                            }
                            jSONObject.put("resultCode", i3);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i2;
                        message4.obj = str;
                        C85581w.this.f191841h.sendMessage(message4);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                }
                MethodCollector.m26664o(13020);
            }
        };
        this.f191793aC = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855998 */

            static {
                Covode.recordClassIndex(99783);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(final int i, final int i2, final float f, final String str) {
                C85581w.this.mo131663b();
                if (C85581w.this.f191851r != null) {
                    C85581w.this.f191851r.onCallback(i, i2, f, str);
                }
                if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855998.RunnableC856001 */

                        static {
                            Covode.recordClassIndex(99784);
                        }

                        public final void run() {
                            if (C85581w.this.f191843j != null) {
                                C85581w.this.f191843j.onCompileError(i, i2, f, str);
                            }
                        }
                    });
                }
            }
        };
        this.f191857x = 0;
        this.f191858y = 0;
        this.f191794aD = 0;
        this.f191795aE = 0;
        this.f191859z = false;
        this.f191764A = 0;
        this.f191770G = 0;
        this.f191771H = 0;
        this.f191772I = 0;
        this.f191773J = 0;
        this.f191774K = 0;
        this.f191775L = 0;
        this.f191776M = 0;
        this.f191777N = 0;
        this.f191778O = false;
        this.f191796aF = 0;
        this.f191797aG = 0;
        this.f191798aH = 0;
        this.f191779P = -1;
        this.f191781R = EnumC85612k.ALIGN_PARENT_BOTTOM;
        this.f191782S = EnumC85614m.CENTER;
        this.f191783T = false;
        this.f191799aI = false;
        this.f191800aJ = false;
        this.f191784U = -1;
        this.f191785V = null;
        this.f191786W = 0;
        this.f191801aK = false;
        this.f191787X = false;
        this.f191788Y = null;
        this.f191789Z = null;
        this.f191814aa = null;
        this.f191815ab = null;
        this.f191816ac = new C30696i();
        this.f191817ad = false;
        this.f191802aL = true;
        this.f191803aM = false;
        this.f191818ae = null;
        this.f191804aN = 0.0f;
        this.f191805aO = 1.0f;
        this.f191806aP = 1.0f;
        this.f191819af = -1;
        this.f191807aQ = -1;
        this.f191820ag = -16777216;
        this.f191821ah = -16777216;
        this.f191822ai = 0.0f;
        this.f191823aj = new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.vesdk.C85581w.TextureView$SurfaceTextureListenerC856019 */

            static {
                Covode.recordClassIndex(99785);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C85581w.this.mo131633a();
                if (C85581w.this.f191767D == null) {
                    return true;
                }
                C85581w.this.f191767D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C85581w.this.f191857x = i;
                C85581w.this.f191858y = i2;
                C85581w.this.mo131734x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C85581w.this.f191766C == surfaceTexture) {
                    C85581w wVar = C85581w.this;
                    wVar.mo131640a(wVar.f191767D);
                } else {
                    C85581w.this.f191767D = new Surface(surfaceTexture);
                    C85581w wVar2 = C85581w.this;
                    wVar2.mo131640a(wVar2.f191767D);
                }
                C85581w.this.f191766C = surfaceTexture;
            }
        };
        this.f191824ak = new SurfaceHolder.Callback2() {
            /* class com.p2082ss.android.vesdk.C85581w.SurfaceHolder$Callback2C8558310 */

            static {
                Covode.recordClassIndex(99767);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C85315al.m146639b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C85581w.this.mo131640a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (C85581w.this.f191856w.get()) {
                    C85315al.m146641c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    C85581w.this.mo131633a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C85315al.m146639b("VEEditor", C1764a.m5929a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                C85581w.this.mo131636a(i2, i3);
            }
        };
        this.f191808aR = new NativeCallbacks.AbstractC30708h() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558411 */

            static {
                Covode.recordClassIndex(99768);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55096a(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: b */
            public final int mo55098b(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55097a(int i, double d) {
                long j;
                long j2;
                C85315al.m146643e("VEEditor", "onOpenGLDrawing: tex = " + i + " timeStamp = " + d);
                if (!C85581w.this.f191778O) {
                    C85581w.this.f191778O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C85581w.this.f191777N > 0) {
                        j = C85581w.this.f191777N;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (C85581w.this.f191775L > 0) {
                        j2 = C85581w.this.f191775L;
                    } else {
                        j2 = C85581w.this.f191774K;
                    }
                    if (j2 == 0 || j2 < C85581w.this.f191773J) {
                        C85315al.m146642d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + C85581w.this.f191775L + ", mlFirstSeekTimeMS = " + C85581w.this.f191774K + ", mlInitTimeMS = " + C85581w.this.f191773J);
                        j2 = C85581w.this.f191773J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - C85581w.this.f191773J);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                        jSONObject.put("time_total", currentTimeMillis - C85581w.this.f191773J);
                        jSONObject.put("usage_type", C85581w.this.f191854u);
                        C30683b.m63032a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        C85315al.m146637a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e) {
                        C85315al.m146642d("VEEditor", "report first frame json err ".concat(String.valueOf(e)));
                    }
                    C30695h.m63062a(1, "te_edit_first_frame_time", currentTimeMillis - C85581w.this.f191773J);
                    if (C85581w.this.f191844k != null) {
                        C85581w.this.f191844k.mo56396a();
                    }
                }
                C85581w.this.f191770G++;
                if (C85581w.this.f191770G == 30) {
                    C85581w.this.f191771H = System.currentTimeMillis();
                    if (C85581w.this.f191772I != C85581w.this.f191771H) {
                        float f = 30000.0f / ((float) (C85581w.this.f191771H - C85581w.this.f191772I));
                        if (C85376ax.f191102c) {
                            C85315al.m146637a("VEEditor", "Render FPS = ".concat(String.valueOf(f)));
                        }
                        C85581w wVar = C85581w.this;
                        wVar.f191772I = wVar.f191771H;
                        C85581w.this.f191770G = 0;
                    }
                }
                return 0;
            }
        };
        this.f191809aS = new NativeCallbacks.AbstractC30703c() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558512 */

            static {
                Covode.recordClassIndex(99769);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30703c
            /* renamed from: a */
            public final int mo55087a(byte[] bArr, int i, int i2, boolean z) {
                if (bArr == null || i < 0 || i2 <= 0) {
                    return -1;
                }
                if (C85581w.this.f191789Z == null) {
                    return -2;
                }
                C85581w.this.f191789Z.mo116308a(bArr, i, i2, z);
                return 0;
            }
        };
        this.f191810aT = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558613 */

            static {
                Covode.recordClassIndex(99770);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191814aa == null) {
                    return -100;
                }
                if (bArr != null || C85581w.this.f191841h == null) {
                    return C85581w.this.f191814aa.mo110443a(bArr, i, i2);
                }
                Message message = new Message();
                message.what = 4117;
                C85581w.this.f191841h.sendMessage(message);
                return 0;
            }
        };
        this.f191811aU = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558714 */

            static {
                Covode.recordClassIndex(99771);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191815ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return C85581w.this.f191815ab.mo110443a(bArr, i, i2);
            }
        };
        this.f191812aV = new NativeCallbacks.AbstractC30707g() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558815 */

            static {
                Covode.recordClassIndex(99772);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: a */
            public final int mo55092a() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130304a();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: b */
            public final int mo55093b() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130305b();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: c */
            public final int mo55094c() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130306c();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: d */
            public final int mo55095d() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130307d();
            }
        };
        this.f191813aW = new NativeCallbacks.AbstractC30705e() {
            /* class com.p2082ss.android.vesdk.C85581w.C855892 */

            static {
                Covode.recordClassIndex(99773);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55089a(final int i, final int i2, final int i3) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855901 */

                        static {
                            Covode.recordClassIndex(99774);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55090a(final int i, final int i2, final String str) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855912 */

                        static {
                            Covode.recordClassIndex(99775);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                if (str != null) {
                                    C85581w.this.f191855v.put(Integer.valueOf(i), str);
                                }
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            C85315al.m146637a("VEEditor", "VEEditor offscreen");
            this.f191765B = TEInterface.createEngine();
            this.f191838e = new C85553b(str);
            this.f191765B.setOpenGLListeners(this.f191808aR);
            this.f191765B.setInfoListener(this.f191792aB);
            this.f191765B.setErrorListener(this.f191793aC);
            C30689e.m63052a("iesve_veeditor_offscreen", 1, (C85509a) null);
            mo131672c(false);
            m147485M();
            return;
        }
        throw new C85615x(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    /* renamed from: c */
    public static int m147504c(int i) {
        boolean z;
        boolean z2;
        C85315al.m146637a("VEEditor", "setOptConfig... ".concat(String.valueOf(i)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("config", i);
            C30683b.m63032a("vesdk_event_editor_opt_config", jSONObject, "performance");
        } catch (JSONException e) {
            C85315al.m146642d("VEEditor", "report optConfig json err ".concat(String.valueOf(e)));
        }
        boolean z3 = false;
        if (((Boolean) C85568t.m147473a().mo131557a("crossplat_glbase_fbo", (Object) false)).booleanValue()) {
            i |= 2097152;
        }
        if (((Boolean) C85568t.m147473a().mo131557a("use_byte264", (Object) false)).booleanValue()) {
            i |= 33554432;
        }
        boolean booleanValue = ((Boolean) C85568t.m147473a().mo131557a("optimize srv_um crash", (Object) false)).booleanValue();
        if (booleanValue) {
            i |= 1073741824;
        }
        C85315al.m146642d("VEEditor", "enableColorspace: ".concat(String.valueOf(booleanValue)));
        if (((Boolean) C85568t.m147473a().mo131557a("color_space", (Object) false)).booleanValue()) {
            i |= 536870912;
        }
        if (((Boolean) C85568t.m147473a().mo131557a("ve_enable_render_encode_resolution_align4", (Object) false)).booleanValue() && Build.VERSION.SDK_INT >= 24) {
            C85315al.m146637a("VEEditor", "enableRenderEncodeAlign4: true");
            i |= 16777216;
            TEAvcEncoder.setEncodeResolutionAlign(4);
        }
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        C85376ax.f191101b = z;
        if ((i & 8192) == 8192) {
            z2 = true;
        } else {
            z2 = false;
        }
        C85376ax.f191103d = z2;
        if ((i & 16777216) == 16777216) {
            z3 = true;
        }
        C85376ax.f191104e = z3;
        C85315al.m146637a(C85376ax.f191100a, "setConfig, sUseSingleGLThread = " + C85376ax.f191101b + ", sSeekTimeCostOpt = " + C85376ax.f191103d + ", sOutResolutionBase4 = " + C85376ax.f191104e);
        return TEInterface.setEnableOpt(i);
    }

    /* renamed from: e */
    private String m147507e(String str) {
        MethodCollector.m26663i(14107);
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(str)) {
                    C85315al.m146637a("VEEditor", "file info cache miss: ".concat(String.valueOf(str)));
                    this.f191797aG++;
                    return "";
                }
                Pair<Long, String> pair = f191760aw.get(str);
                if (pair == null) {
                    C85315al.m146637a("VEEditor", "file info cache miss: ".concat(String.valueOf(str)));
                    this.f191797aG++;
                    String f = m147508f(str);
                    if (f.equals("")) {
                        C85315al.m146642d("VEEditor", "add file info cache for " + str + " failed");
                        MethodCollector.m26664o(14107);
                        return "";
                    }
                    MethodCollector.m26664o(14107);
                    return f;
                }
                long lastModified = new File(str).lastModified();
                if (lastModified == 0) {
                    f191760aw.remove(str);
                    C85315al.m146637a("VEEditor", "file info cache miss: ".concat(String.valueOf(str)));
                    this.f191797aG++;
                    MethodCollector.m26664o(14107);
                    return "";
                } else if (lastModified > ((Long) pair.first).longValue()) {
                    f191760aw.remove(str);
                    String f2 = m147508f(str);
                    if (f2.equals("")) {
                        C85315al.m146637a("VEEditor", "file info cache miss: ".concat(String.valueOf(str)));
                        MethodCollector.m26664o(14107);
                        return "";
                    }
                    C85315al.m146637a("VEEditor", "update file info cache for ".concat(String.valueOf(str)));
                    this.f191797aG++;
                    MethodCollector.m26664o(14107);
                    return f2;
                } else {
                    C85315al.m146637a("VEEditor", "file info cache hit: ".concat(String.valueOf(str)));
                    this.f191796aF++;
                    String str2 = (String) pair.second;
                    MethodCollector.m26664o(14107);
                    return str2;
                }
            } finally {
                MethodCollector.m26664o(14107);
            }
        }
    }

    /* renamed from: d */
    public final void mo131680d(boolean z) {
        C85315al.m146637a("VEEditor", "setAutoPrepare... ".concat(String.valueOf(z)));
        this.f191832as = z;
    }

    /* renamed from: g */
    public final int mo131691g(boolean z) {
        String[] strArr;
        boolean z2;
        boolean z3;
        MethodCollector.m26663i(11823);
        synchronized (this) {
            try {
                C85315al.m146641c("VEEditor", "enableReversePlay:".concat(String.valueOf(z)));
                if (!this.f191838e.f191686g) {
                    C85315al.m146642d("VEEditor", "enableReversePlay error: reverse video is not ready!");
                    return -100;
                }
                C85553b bVar = this.f191838e;
                if (bVar == null || bVar.f191684e == null || this.f191838e.f191684e.length <= 0) {
                    C85315al.m146642d("VEEditor", "enableReversePlay error: reverse video path is invalid!");
                    MethodCollector.m26664o(11823);
                    return -105;
                }
                TEVideoUtils.nativeCancelCompileProbe();
                long durationUs = this.f191765B.getDurationUs();
                this.f191765B.stop();
                if (z) {
                    strArr = this.f191838e.f191684e;
                } else {
                    strArr = this.f191838e.f191681b;
                }
                int updateTrackClips = this.f191765B.updateTrackClips(0, 0, strArr);
                if (updateTrackClips != 0) {
                    C85315al.m146642d("VEEditor", "updateTrackClips failed, ret = ".concat(String.valueOf(updateTrackClips)));
                    MethodCollector.m26664o(11823);
                    return updateTrackClips;
                }
                StringBuilder sb = new StringBuilder("enableReversePlay: mReverseAudioPaths == null: ");
                if (this.f191838e.f191685f == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C85315al.m146637a("VEEditor", sb.append(z2).toString());
                C85315al.m146637a("VEEditor", "enableReversePlay: mOriginalSoundTrackType = " + this.f191838e.f191690k);
                if (!(this.f191838e.f191685f == null || this.f191838e.f191690k == 1)) {
                    int addAudioTrack = this.f191765B.addAudioTrack(this.f191838e.f191685f[0], 0, this.f191765B.getDuration(), 0, this.f191765B.getDuration(), false);
                    this.f191838e.f191689j = this.f191852s.mo54954a(addAudioTrack);
                    this.f191838e.f191690k = 1;
                    this.f191838e.f191687h = true;
                    C85315al.m146641c("VEEditor", "enableReversePlay: add org audio track index = " + this.f191838e.f191689j + " mOriginalSoundTrackType = " + this.f191838e.f191690k);
                }
                TEInterface tEInterface = this.f191765B;
                if (z != this.f191801aK) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                tEInterface.updateTrackFilterDuration(0, 0, z3, durationUs);
                this.f191765B.createTimeline();
                int prepareEngine = this.f191765B.prepareEngine(0);
                if (prepareEngine != 0) {
                    C85315al.m146642d("VEEditor", "enableReversePlay() prepareEngine failed: result: ".concat(String.valueOf(prepareEngine)));
                    MethodCollector.m26664o(11823);
                    return prepareEngine;
                }
                this.f191836c.mo131158i();
                mo131589a(0, EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                this.f191801aK = z;
                if (z) {
                    C85509a aVar = new C85509a();
                    aVar.mo131335a("iesve_veeditor_time_effect_id", "reverse");
                    C30689e.m63052a("iesve_veeditor_time_effect", 1, aVar);
                    this.f191816ac.f73424c = 3;
                }
                MethodCollector.m26664o(11823);
                return 0;
            } finally {
                MethodCollector.m26664o(11823);
            }
        }
    }

    /* renamed from: c */
    public final int mo131672c(boolean z) {
        int enableEffectAmazing;
        MethodCollector.m26663i(14176);
        synchronized (this) {
            try {
                enableEffectAmazing = this.f191765B.enableEffectAmazing(z);
            } finally {
                MethodCollector.m26664o(14176);
            }
        }
        return enableEffectAmazing;
    }

    /* renamed from: a */
    private static boolean m147495a(File file) {
        MethodCollector.m26663i(13957);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13957);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13957);
        return delete;
    }

    /* renamed from: b */
    public final int mo131659b(VEMVParams vEMVParams) {
        AbstractC85467d dVar = this.f191790a;
        if (dVar != null) {
            return dVar.updateMVResources(vEMVParams);
        }
        C85315al.m146642d("VEEditor", "MV IS NOT SUPPORT !!!");
        return -900;
    }

    public C85581w(String str, SurfaceView surfaceView) {
        this(str, surfaceView, null, (byte) 0);
    }

    /* renamed from: f */
    public final int mo131687f(int i, int i2) {
        return this.f191837d.mo130871b(0, i, i2);
    }

    /* renamed from: e */
    public final int mo131682e(int i, int i2) {
        return this.f191837d.mo130856a(i, i2);
    }

    /* renamed from: g */
    public final List<VEClipParam> mo131692g(int i, int i2) {
        return this.f191837d.mo130873b(i, i2);
    }

    /* renamed from: h */
    public final int mo131694h(int i, int i2) {
        return this.f191836c.mo131119a(i, i2);
    }

    /* renamed from: i */
    public final int mo131698i(int i, int i2) {
        return this.f191836c.mo131139b(i, i2);
    }

    public C85581w(String str, TextureView textureView) {
        this(str, textureView, (byte) 0);
    }

    /* renamed from: a */
    public final int mo131576a(int i, float f) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.setInfoStickerRotation(i, f);
        }
        C85315al.m146642d("VEEditor", "setInfoStickerRotation STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: b */
    public final int mo131655b(int i, float f) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.setInfoStickerScale(i, f);
        }
        C85315al.m146642d("VEEditor", "setInfoStickerScale STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: j */
    public final int mo131702j(int i, int i2) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.setInfoStickerLayer(i, i2);
        }
        C85315al.m146642d("VEEditor", "setInfoStickerLayer STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: c */
    public final int mo131669c(int i, float f) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.setInfoStickerAlpha(i, f);
        }
        C85315al.m146642d("VEEditor", "setInfoStickerAlpha STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: c */
    public final int mo131671c(String str, float f) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.addImageStickerWithRatio(str, 0.0f, 0.0f, 1.0f, f);
        }
        C85315al.m146642d("VEEditor", "addImageStickerWithRatio STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    /* renamed from: d */
    public final void mo131679d(int i, int i2) {
        C85315al.m146637a("VEEditor", "setMaxWidthHeight... width:" + i + ", height:" + i2);
        this.f191765B.setMaxWidthHeight(i, i2);
    }

    /* renamed from: b */
    public final int mo131658b(int i, ROTATE_DEGREE rotate_degree) {
        return this.f191830aq.setAIRotation(i, rotate_degree);
    }

    /* renamed from: c */
    public final void mo131675c(int i, int i2) {
        C85315al.m146637a("VEEditor", "setWidthHeight... width:" + i + ", height:" + i2);
        this.f191765B.setWidthHeight(i, i2);
    }

    /* renamed from: a */
    public static LoudnessDetectResult[] m147499a(String[] strArr, int[] iArr, int[] iArr2) {
        return TEInterface.detectAudioLoudness(strArr, iArr, iArr2);
    }

    public C85581w(String str, SurfaceView surfaceView, C85395bh bhVar) {
        this(str, surfaceView, bhVar, (byte) 0);
    }

    /* renamed from: b */
    public final int mo131657b(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        return this.f191836c.mo131140b(i, i2, vEBaseFilterParam);
    }

    public C85581w(String str, SurfaceView surfaceView, long j) {
        this.f191839f = new VESize(-1, -1);
        this.f191840g = "mp4";
        this.f191841h = new HandlerC85610i(Looper.getMainLooper());
        this.f191842i = null;
        this.f191843j = null;
        this.f191844k = null;
        this.f191845l = null;
        this.f191846m = null;
        this.f191847n = null;
        this.f191848o = null;
        this.f191849p = null;
        this.f191850q = null;
        this.f191851r = null;
        this.f191852s = new C30651j();
        this.f191853t = new C30634a();
        this.f191832as = true;
        this.f191854u = "unknown";
        this.f191833au = null;
        this.f191834av = "/concatShootVideo";
        this.f191855v = new HashMap();
        this.f191856w = new AtomicBoolean(false);
        this.f191791aA = -1;
        this.f191792aB = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855821 */

            static {
                Covode.recordClassIndex(99766);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(int i, int i2, float f, String str) {
                long j;
                long j2;
                int i3;
                MethodCollector.m26663i(13020);
                if (i == 4101) {
                    if (C85581w.this.f191776M > 0) {
                        System.currentTimeMillis();
                    }
                    if (C85581w.this.f191842i != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        C85581w.this.f191841h.sendEmptyMessage(4101);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        C85581w.this.f191850q.onCallback(4101, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (i != 4103) {
                    if (i != 4105) {
                        if (i != 4129) {
                            if (i != 4157) {
                                if (i != 4133) {
                                    if (i == 4134) {
                                        C85581w.this.f191822ai = f;
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (i != 4144) {
                                        if (i != 4145) {
                                            if (i != 4160) {
                                                if (i != 4161) {
                                                    if (C85581w.this.f191850q != null) {
                                                        C85315al.m146639b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                                    }
                                                } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                    C85581w.this.f191788Y.f191917m = i2;
                                                    MethodCollector.m26664o(13020);
                                                    return;
                                                }
                                            } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                C85581w.this.f191788Y.f191916l = i2;
                                                MethodCollector.m26664o(13020);
                                                return;
                                            }
                                        } else if (C85581w.this.f191846m != null) {
                                            C85581w.this.f191846m.mo87654b();
                                            MethodCollector.m26664o(13020);
                                            return;
                                        } else if (C85581w.this.f191850q != null) {
                                            C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                            C85581w.this.f191850q.onCallback(i, i2, f, str);
                                            MethodCollector.m26664o(13020);
                                            return;
                                        }
                                    } else if (C85581w.this.f191846m != null) {
                                        C85581w.this.f191846m.mo87653a();
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (C85581w.this.f191850q != null) {
                                        C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                        MethodCollector.m26664o(13020);
                                        return;
                                    }
                                } else if (!(C85581w.this.f191845l == null || C85581w.this.f191841h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i2;
                                    message.arg2 = (int) f;
                                    C85581w.this.f191841h.sendMessage(message);
                                    MethodCollector.m26664o(13020);
                                    return;
                                }
                            } else if (!(C85581w.this.f191849p == null || C85581w.this.f191841h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i2;
                                message2.arg2 = (int) f;
                                C85581w.this.f191841h.sendMessage(message2);
                                MethodCollector.m26664o(13020);
                                return;
                            }
                        } else if (C85581w.this.f191777N == 0) {
                            C85581w.this.f191777N = System.currentTimeMillis();
                            C85315al.m146637a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.m26664o(13020);
                            return;
                        }
                    } else if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        Message message3 = new Message();
                        message3.what = i;
                        message3.obj = Float.valueOf(f);
                        C85581w.this.f191841h.sendMessage(message3);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (C85581w.this.f191787X) {
                    C85581w.this.f191788Y.f191908d = C85581w.this.f191850q;
                    new Thread(C85581w.this.f191788Y).start();
                    C85581w.this.f191787X = false;
                    MethodCollector.m26664o(13020);
                    return;
                } else {
                    C85581w wVar = C85581w.this;
                    if (i2 == 1 || i2 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - wVar.f191786W;
                        C85315al.m146641c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        C30695h.m63065a("te_composition_time", currentTimeMillis);
                        C30695h.m63062a(1, "te_composition_time", currentTimeMillis);
                        if (C30004e.m60552a(wVar.f191785V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(wVar.f191785V, iArr) != null) {
                                long length = new File(wVar.f191785V).length();
                                C30695h.m63065a("te_composition_page_mode", (long) wVar.f191819af);
                                double d = (double) length;
                                Double.isNaN(d);
                                double d2 = (d / 1024.0d) / 1024.0d;
                                C30695h.m63064a("te_composition_file_size", d2);
                                C30695h.m63064a("te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63064a("te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63064a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    C85315al.m146641c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                C30695h.m63062a(1, "te_composition_page_mode", (long) wVar.f191819af);
                                C30695h.m63063a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                C30695h.m63061a(1, "te_composition_fps", (double) iArr[7]);
                                C30695h.m63061a(1, "te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63061a(1, "te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63061a(1, "te_composition_file_size", d2);
                                int i4 = wVar.f191816ac.f73424c;
                                if (i4 != 0) {
                                    C30695h.m63062a(1, "te_composition_time_filter_type", (long) i4);
                                }
                                C30652a.m63004a("te_composition_file_duration", (long) iArr[3]);
                                C30652a.m63004a("te_composition_video_frame_rate", (long) iArr[7]);
                                C30652a.m63004a("te_composition_video_resolution_width", (long) iArr[0]);
                                C30652a.m63004a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b = wVar.f191816ac.mo55070b();
                        if (b) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        C30695h.m63062a(1, "te_composition_effect_add", j);
                        if (!b) {
                            C30695h.m63063a(1, "te_composition_effect_json", wVar.f191816ac.mo55066a(0));
                        }
                        boolean c = wVar.f191816ac.mo55071c();
                        if (c) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        C30695h.m63062a(1, "te_composition_info_sticker_add", j2);
                        if (!c) {
                            C30695h.m63063a(1, "te_composition_info_sticker_json", wVar.f191816ac.mo55066a(1));
                        }
                        wVar.f191816ac.mo55067a();
                        TEMonitorInvoker.nativeMonitorPerf(C30695h.f73418b);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_file", wVar.f191840g);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_result", "succ");
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            C30695h.m63067a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", wVar.f191854u);
                            if (i2 == 1 || i2 == 2) {
                                i3 = 0;
                            } else {
                                i3 = i2;
                            }
                            jSONObject.put("resultCode", i3);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i2;
                        message4.obj = str;
                        C85581w.this.f191841h.sendMessage(message4);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                }
                MethodCollector.m26664o(13020);
            }
        };
        this.f191793aC = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855998 */

            static {
                Covode.recordClassIndex(99783);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(final int i, final int i2, final float f, final String str) {
                C85581w.this.mo131663b();
                if (C85581w.this.f191851r != null) {
                    C85581w.this.f191851r.onCallback(i, i2, f, str);
                }
                if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855998.RunnableC856001 */

                        static {
                            Covode.recordClassIndex(99784);
                        }

                        public final void run() {
                            if (C85581w.this.f191843j != null) {
                                C85581w.this.f191843j.onCompileError(i, i2, f, str);
                            }
                        }
                    });
                }
            }
        };
        this.f191857x = 0;
        this.f191858y = 0;
        this.f191794aD = 0;
        this.f191795aE = 0;
        this.f191859z = false;
        this.f191764A = 0;
        this.f191770G = 0;
        this.f191771H = 0;
        this.f191772I = 0;
        this.f191773J = 0;
        this.f191774K = 0;
        this.f191775L = 0;
        this.f191776M = 0;
        this.f191777N = 0;
        this.f191778O = false;
        this.f191796aF = 0;
        this.f191797aG = 0;
        this.f191798aH = 0;
        this.f191779P = -1;
        this.f191781R = EnumC85612k.ALIGN_PARENT_BOTTOM;
        this.f191782S = EnumC85614m.CENTER;
        this.f191783T = false;
        this.f191799aI = false;
        this.f191800aJ = false;
        this.f191784U = -1;
        this.f191785V = null;
        this.f191786W = 0;
        this.f191801aK = false;
        this.f191787X = false;
        this.f191788Y = null;
        this.f191789Z = null;
        this.f191814aa = null;
        this.f191815ab = null;
        this.f191816ac = new C30696i();
        this.f191817ad = false;
        this.f191802aL = true;
        this.f191803aM = false;
        this.f191818ae = null;
        this.f191804aN = 0.0f;
        this.f191805aO = 1.0f;
        this.f191806aP = 1.0f;
        this.f191819af = -1;
        this.f191807aQ = -1;
        this.f191820ag = -16777216;
        this.f191821ah = -16777216;
        this.f191822ai = 0.0f;
        this.f191823aj = new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.vesdk.C85581w.TextureView$SurfaceTextureListenerC856019 */

            static {
                Covode.recordClassIndex(99785);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C85581w.this.mo131633a();
                if (C85581w.this.f191767D == null) {
                    return true;
                }
                C85581w.this.f191767D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C85581w.this.f191857x = i;
                C85581w.this.f191858y = i2;
                C85581w.this.mo131734x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C85581w.this.f191766C == surfaceTexture) {
                    C85581w wVar = C85581w.this;
                    wVar.mo131640a(wVar.f191767D);
                } else {
                    C85581w.this.f191767D = new Surface(surfaceTexture);
                    C85581w wVar2 = C85581w.this;
                    wVar2.mo131640a(wVar2.f191767D);
                }
                C85581w.this.f191766C = surfaceTexture;
            }
        };
        this.f191824ak = new SurfaceHolder.Callback2() {
            /* class com.p2082ss.android.vesdk.C85581w.SurfaceHolder$Callback2C8558310 */

            static {
                Covode.recordClassIndex(99767);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C85315al.m146639b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C85581w.this.mo131640a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (C85581w.this.f191856w.get()) {
                    C85315al.m146641c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    C85581w.this.mo131633a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C85315al.m146639b("VEEditor", C1764a.m5929a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                C85581w.this.mo131636a(i2, i3);
            }
        };
        this.f191808aR = new NativeCallbacks.AbstractC30708h() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558411 */

            static {
                Covode.recordClassIndex(99768);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55096a(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: b */
            public final int mo55098b(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55097a(int i, double d) {
                long j;
                long j2;
                C85315al.m146643e("VEEditor", "onOpenGLDrawing: tex = " + i + " timeStamp = " + d);
                if (!C85581w.this.f191778O) {
                    C85581w.this.f191778O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C85581w.this.f191777N > 0) {
                        j = C85581w.this.f191777N;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (C85581w.this.f191775L > 0) {
                        j2 = C85581w.this.f191775L;
                    } else {
                        j2 = C85581w.this.f191774K;
                    }
                    if (j2 == 0 || j2 < C85581w.this.f191773J) {
                        C85315al.m146642d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + C85581w.this.f191775L + ", mlFirstSeekTimeMS = " + C85581w.this.f191774K + ", mlInitTimeMS = " + C85581w.this.f191773J);
                        j2 = C85581w.this.f191773J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - C85581w.this.f191773J);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                        jSONObject.put("time_total", currentTimeMillis - C85581w.this.f191773J);
                        jSONObject.put("usage_type", C85581w.this.f191854u);
                        C30683b.m63032a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        C85315al.m146637a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e) {
                        C85315al.m146642d("VEEditor", "report first frame json err ".concat(String.valueOf(e)));
                    }
                    C30695h.m63062a(1, "te_edit_first_frame_time", currentTimeMillis - C85581w.this.f191773J);
                    if (C85581w.this.f191844k != null) {
                        C85581w.this.f191844k.mo56396a();
                    }
                }
                C85581w.this.f191770G++;
                if (C85581w.this.f191770G == 30) {
                    C85581w.this.f191771H = System.currentTimeMillis();
                    if (C85581w.this.f191772I != C85581w.this.f191771H) {
                        float f = 30000.0f / ((float) (C85581w.this.f191771H - C85581w.this.f191772I));
                        if (C85376ax.f191102c) {
                            C85315al.m146637a("VEEditor", "Render FPS = ".concat(String.valueOf(f)));
                        }
                        C85581w wVar = C85581w.this;
                        wVar.f191772I = wVar.f191771H;
                        C85581w.this.f191770G = 0;
                    }
                }
                return 0;
            }
        };
        this.f191809aS = new NativeCallbacks.AbstractC30703c() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558512 */

            static {
                Covode.recordClassIndex(99769);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30703c
            /* renamed from: a */
            public final int mo55087a(byte[] bArr, int i, int i2, boolean z) {
                if (bArr == null || i < 0 || i2 <= 0) {
                    return -1;
                }
                if (C85581w.this.f191789Z == null) {
                    return -2;
                }
                C85581w.this.f191789Z.mo116308a(bArr, i, i2, z);
                return 0;
            }
        };
        this.f191810aT = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558613 */

            static {
                Covode.recordClassIndex(99770);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191814aa == null) {
                    return -100;
                }
                if (bArr != null || C85581w.this.f191841h == null) {
                    return C85581w.this.f191814aa.mo110443a(bArr, i, i2);
                }
                Message message = new Message();
                message.what = 4117;
                C85581w.this.f191841h.sendMessage(message);
                return 0;
            }
        };
        this.f191811aU = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558714 */

            static {
                Covode.recordClassIndex(99771);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191815ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return C85581w.this.f191815ab.mo110443a(bArr, i, i2);
            }
        };
        this.f191812aV = new NativeCallbacks.AbstractC30707g() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558815 */

            static {
                Covode.recordClassIndex(99772);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: a */
            public final int mo55092a() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130304a();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: b */
            public final int mo55093b() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130305b();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: c */
            public final int mo55094c() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130306c();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: d */
            public final int mo55095d() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130307d();
            }
        };
        this.f191813aW = new NativeCallbacks.AbstractC30705e() {
            /* class com.p2082ss.android.vesdk.C85581w.C855892 */

            static {
                Covode.recordClassIndex(99773);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55089a(final int i, final int i2, final int i3) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855901 */

                        static {
                            Covode.recordClassIndex(99774);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55090a(final int i, final int i2, final String str) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855912 */

                        static {
                            Covode.recordClassIndex(99775);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                if (str != null) {
                                    C85581w.this.f191855v.put(Integer.valueOf(i), str);
                                }
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            C85315al.m146637a("VEEditor", "VEEditor surfaceView with handler:".concat(String.valueOf(j)));
            this.f191765B = TEInterface.createEngine(j);
            this.f191838e = new C85553b(str);
            this.f191768E = surfaceView;
            surfaceView.getHolder().addCallback(this.f191824ak);
            this.f191765B.setOpenGLListeners(this.f191808aR);
            this.f191765B.setInfoListener(this.f191792aB);
            this.f191765B.setErrorListener(this.f191793aC);
            mo131672c(false);
            m147485M();
            return;
        }
        throw new C85615x(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    /* renamed from: b */
    public final int mo131656b(int i, float f, float f2) {
        AbstractC85469f fVar = this.f191835b;
        if (fVar != null) {
            return fVar.setSrtInitialPosition(i, f, f2);
        }
        C85315al.m146642d("VEEditor", "setSrtInitialPosition STICKER IS NOT SUPPORT !!!");
        return -901;
    }

    private C85581w(String str, TextureView textureView, byte b) {
        this.f191839f = new VESize(-1, -1);
        this.f191840g = "mp4";
        this.f191841h = new HandlerC85610i(Looper.getMainLooper());
        this.f191842i = null;
        this.f191843j = null;
        this.f191844k = null;
        this.f191845l = null;
        this.f191846m = null;
        this.f191847n = null;
        this.f191848o = null;
        this.f191849p = null;
        this.f191850q = null;
        this.f191851r = null;
        this.f191852s = new C30651j();
        this.f191853t = new C30634a();
        this.f191832as = true;
        this.f191854u = "unknown";
        this.f191833au = null;
        this.f191834av = "/concatShootVideo";
        this.f191855v = new HashMap();
        this.f191856w = new AtomicBoolean(false);
        this.f191791aA = -1;
        this.f191792aB = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855821 */

            static {
                Covode.recordClassIndex(99766);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(int i, int i2, float f, String str) {
                long j;
                long j2;
                int i3;
                MethodCollector.m26663i(13020);
                if (i == 4101) {
                    if (C85581w.this.f191776M > 0) {
                        System.currentTimeMillis();
                    }
                    if (C85581w.this.f191842i != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        C85581w.this.f191841h.sendEmptyMessage(4101);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        C85581w.this.f191850q.onCallback(4101, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (i != 4103) {
                    if (i != 4105) {
                        if (i != 4129) {
                            if (i != 4157) {
                                if (i != 4133) {
                                    if (i == 4134) {
                                        C85581w.this.f191822ai = f;
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (i != 4144) {
                                        if (i != 4145) {
                                            if (i != 4160) {
                                                if (i != 4161) {
                                                    if (C85581w.this.f191850q != null) {
                                                        C85315al.m146639b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                                    }
                                                } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                    C85581w.this.f191788Y.f191917m = i2;
                                                    MethodCollector.m26664o(13020);
                                                    return;
                                                }
                                            } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                C85581w.this.f191788Y.f191916l = i2;
                                                MethodCollector.m26664o(13020);
                                                return;
                                            }
                                        } else if (C85581w.this.f191846m != null) {
                                            C85581w.this.f191846m.mo87654b();
                                            MethodCollector.m26664o(13020);
                                            return;
                                        } else if (C85581w.this.f191850q != null) {
                                            C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                            C85581w.this.f191850q.onCallback(i, i2, f, str);
                                            MethodCollector.m26664o(13020);
                                            return;
                                        }
                                    } else if (C85581w.this.f191846m != null) {
                                        C85581w.this.f191846m.mo87653a();
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (C85581w.this.f191850q != null) {
                                        C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                        MethodCollector.m26664o(13020);
                                        return;
                                    }
                                } else if (!(C85581w.this.f191845l == null || C85581w.this.f191841h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i2;
                                    message.arg2 = (int) f;
                                    C85581w.this.f191841h.sendMessage(message);
                                    MethodCollector.m26664o(13020);
                                    return;
                                }
                            } else if (!(C85581w.this.f191849p == null || C85581w.this.f191841h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i2;
                                message2.arg2 = (int) f;
                                C85581w.this.f191841h.sendMessage(message2);
                                MethodCollector.m26664o(13020);
                                return;
                            }
                        } else if (C85581w.this.f191777N == 0) {
                            C85581w.this.f191777N = System.currentTimeMillis();
                            C85315al.m146637a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.m26664o(13020);
                            return;
                        }
                    } else if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        Message message3 = new Message();
                        message3.what = i;
                        message3.obj = Float.valueOf(f);
                        C85581w.this.f191841h.sendMessage(message3);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (C85581w.this.f191787X) {
                    C85581w.this.f191788Y.f191908d = C85581w.this.f191850q;
                    new Thread(C85581w.this.f191788Y).start();
                    C85581w.this.f191787X = false;
                    MethodCollector.m26664o(13020);
                    return;
                } else {
                    C85581w wVar = C85581w.this;
                    if (i2 == 1 || i2 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - wVar.f191786W;
                        C85315al.m146641c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        C30695h.m63065a("te_composition_time", currentTimeMillis);
                        C30695h.m63062a(1, "te_composition_time", currentTimeMillis);
                        if (C30004e.m60552a(wVar.f191785V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(wVar.f191785V, iArr) != null) {
                                long length = new File(wVar.f191785V).length();
                                C30695h.m63065a("te_composition_page_mode", (long) wVar.f191819af);
                                double d = (double) length;
                                Double.isNaN(d);
                                double d2 = (d / 1024.0d) / 1024.0d;
                                C30695h.m63064a("te_composition_file_size", d2);
                                C30695h.m63064a("te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63064a("te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63064a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    C85315al.m146641c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                C30695h.m63062a(1, "te_composition_page_mode", (long) wVar.f191819af);
                                C30695h.m63063a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                C30695h.m63061a(1, "te_composition_fps", (double) iArr[7]);
                                C30695h.m63061a(1, "te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63061a(1, "te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63061a(1, "te_composition_file_size", d2);
                                int i4 = wVar.f191816ac.f73424c;
                                if (i4 != 0) {
                                    C30695h.m63062a(1, "te_composition_time_filter_type", (long) i4);
                                }
                                C30652a.m63004a("te_composition_file_duration", (long) iArr[3]);
                                C30652a.m63004a("te_composition_video_frame_rate", (long) iArr[7]);
                                C30652a.m63004a("te_composition_video_resolution_width", (long) iArr[0]);
                                C30652a.m63004a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b = wVar.f191816ac.mo55070b();
                        if (b) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        C30695h.m63062a(1, "te_composition_effect_add", j);
                        if (!b) {
                            C30695h.m63063a(1, "te_composition_effect_json", wVar.f191816ac.mo55066a(0));
                        }
                        boolean c = wVar.f191816ac.mo55071c();
                        if (c) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        C30695h.m63062a(1, "te_composition_info_sticker_add", j2);
                        if (!c) {
                            C30695h.m63063a(1, "te_composition_info_sticker_json", wVar.f191816ac.mo55066a(1));
                        }
                        wVar.f191816ac.mo55067a();
                        TEMonitorInvoker.nativeMonitorPerf(C30695h.f73418b);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_file", wVar.f191840g);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_result", "succ");
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            C30695h.m63067a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", wVar.f191854u);
                            if (i2 == 1 || i2 == 2) {
                                i3 = 0;
                            } else {
                                i3 = i2;
                            }
                            jSONObject.put("resultCode", i3);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i2;
                        message4.obj = str;
                        C85581w.this.f191841h.sendMessage(message4);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                }
                MethodCollector.m26664o(13020);
            }
        };
        this.f191793aC = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855998 */

            static {
                Covode.recordClassIndex(99783);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(final int i, final int i2, final float f, final String str) {
                C85581w.this.mo131663b();
                if (C85581w.this.f191851r != null) {
                    C85581w.this.f191851r.onCallback(i, i2, f, str);
                }
                if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855998.RunnableC856001 */

                        static {
                            Covode.recordClassIndex(99784);
                        }

                        public final void run() {
                            if (C85581w.this.f191843j != null) {
                                C85581w.this.f191843j.onCompileError(i, i2, f, str);
                            }
                        }
                    });
                }
            }
        };
        this.f191857x = 0;
        this.f191858y = 0;
        this.f191794aD = 0;
        this.f191795aE = 0;
        this.f191859z = false;
        this.f191764A = 0;
        this.f191770G = 0;
        this.f191771H = 0;
        this.f191772I = 0;
        this.f191773J = 0;
        this.f191774K = 0;
        this.f191775L = 0;
        this.f191776M = 0;
        this.f191777N = 0;
        this.f191778O = false;
        this.f191796aF = 0;
        this.f191797aG = 0;
        this.f191798aH = 0;
        this.f191779P = -1;
        this.f191781R = EnumC85612k.ALIGN_PARENT_BOTTOM;
        this.f191782S = EnumC85614m.CENTER;
        this.f191783T = false;
        this.f191799aI = false;
        this.f191800aJ = false;
        this.f191784U = -1;
        this.f191785V = null;
        this.f191786W = 0;
        this.f191801aK = false;
        this.f191787X = false;
        this.f191788Y = null;
        this.f191789Z = null;
        this.f191814aa = null;
        this.f191815ab = null;
        this.f191816ac = new C30696i();
        this.f191817ad = false;
        this.f191802aL = true;
        this.f191803aM = false;
        this.f191818ae = null;
        this.f191804aN = 0.0f;
        this.f191805aO = 1.0f;
        this.f191806aP = 1.0f;
        this.f191819af = -1;
        this.f191807aQ = -1;
        this.f191820ag = -16777216;
        this.f191821ah = -16777216;
        this.f191822ai = 0.0f;
        TextureView$SurfaceTextureListenerC856019 r3 = new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.vesdk.C85581w.TextureView$SurfaceTextureListenerC856019 */

            static {
                Covode.recordClassIndex(99785);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C85581w.this.mo131633a();
                if (C85581w.this.f191767D == null) {
                    return true;
                }
                C85581w.this.f191767D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C85581w.this.f191857x = i;
                C85581w.this.f191858y = i2;
                C85581w.this.mo131734x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C85581w.this.f191766C == surfaceTexture) {
                    C85581w wVar = C85581w.this;
                    wVar.mo131640a(wVar.f191767D);
                } else {
                    C85581w.this.f191767D = new Surface(surfaceTexture);
                    C85581w wVar2 = C85581w.this;
                    wVar2.mo131640a(wVar2.f191767D);
                }
                C85581w.this.f191766C = surfaceTexture;
            }
        };
        this.f191823aj = r3;
        this.f191824ak = new SurfaceHolder.Callback2() {
            /* class com.p2082ss.android.vesdk.C85581w.SurfaceHolder$Callback2C8558310 */

            static {
                Covode.recordClassIndex(99767);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C85315al.m146639b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C85581w.this.mo131640a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (C85581w.this.f191856w.get()) {
                    C85315al.m146641c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    C85581w.this.mo131633a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C85315al.m146639b("VEEditor", C1764a.m5929a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                C85581w.this.mo131636a(i2, i3);
            }
        };
        this.f191808aR = new NativeCallbacks.AbstractC30708h() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558411 */

            static {
                Covode.recordClassIndex(99768);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55096a(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: b */
            public final int mo55098b(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55097a(int i, double d) {
                long j;
                long j2;
                C85315al.m146643e("VEEditor", "onOpenGLDrawing: tex = " + i + " timeStamp = " + d);
                if (!C85581w.this.f191778O) {
                    C85581w.this.f191778O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C85581w.this.f191777N > 0) {
                        j = C85581w.this.f191777N;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (C85581w.this.f191775L > 0) {
                        j2 = C85581w.this.f191775L;
                    } else {
                        j2 = C85581w.this.f191774K;
                    }
                    if (j2 == 0 || j2 < C85581w.this.f191773J) {
                        C85315al.m146642d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + C85581w.this.f191775L + ", mlFirstSeekTimeMS = " + C85581w.this.f191774K + ", mlInitTimeMS = " + C85581w.this.f191773J);
                        j2 = C85581w.this.f191773J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - C85581w.this.f191773J);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                        jSONObject.put("time_total", currentTimeMillis - C85581w.this.f191773J);
                        jSONObject.put("usage_type", C85581w.this.f191854u);
                        C30683b.m63032a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        C85315al.m146637a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e) {
                        C85315al.m146642d("VEEditor", "report first frame json err ".concat(String.valueOf(e)));
                    }
                    C30695h.m63062a(1, "te_edit_first_frame_time", currentTimeMillis - C85581w.this.f191773J);
                    if (C85581w.this.f191844k != null) {
                        C85581w.this.f191844k.mo56396a();
                    }
                }
                C85581w.this.f191770G++;
                if (C85581w.this.f191770G == 30) {
                    C85581w.this.f191771H = System.currentTimeMillis();
                    if (C85581w.this.f191772I != C85581w.this.f191771H) {
                        float f = 30000.0f / ((float) (C85581w.this.f191771H - C85581w.this.f191772I));
                        if (C85376ax.f191102c) {
                            C85315al.m146637a("VEEditor", "Render FPS = ".concat(String.valueOf(f)));
                        }
                        C85581w wVar = C85581w.this;
                        wVar.f191772I = wVar.f191771H;
                        C85581w.this.f191770G = 0;
                    }
                }
                return 0;
            }
        };
        this.f191809aS = new NativeCallbacks.AbstractC30703c() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558512 */

            static {
                Covode.recordClassIndex(99769);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30703c
            /* renamed from: a */
            public final int mo55087a(byte[] bArr, int i, int i2, boolean z) {
                if (bArr == null || i < 0 || i2 <= 0) {
                    return -1;
                }
                if (C85581w.this.f191789Z == null) {
                    return -2;
                }
                C85581w.this.f191789Z.mo116308a(bArr, i, i2, z);
                return 0;
            }
        };
        this.f191810aT = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558613 */

            static {
                Covode.recordClassIndex(99770);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191814aa == null) {
                    return -100;
                }
                if (bArr != null || C85581w.this.f191841h == null) {
                    return C85581w.this.f191814aa.mo110443a(bArr, i, i2);
                }
                Message message = new Message();
                message.what = 4117;
                C85581w.this.f191841h.sendMessage(message);
                return 0;
            }
        };
        this.f191811aU = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558714 */

            static {
                Covode.recordClassIndex(99771);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191815ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return C85581w.this.f191815ab.mo110443a(bArr, i, i2);
            }
        };
        this.f191812aV = new NativeCallbacks.AbstractC30707g() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558815 */

            static {
                Covode.recordClassIndex(99772);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: a */
            public final int mo55092a() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130304a();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: b */
            public final int mo55093b() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130305b();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: c */
            public final int mo55094c() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130306c();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: d */
            public final int mo55095d() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130307d();
            }
        };
        this.f191813aW = new NativeCallbacks.AbstractC30705e() {
            /* class com.p2082ss.android.vesdk.C85581w.C855892 */

            static {
                Covode.recordClassIndex(99773);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55089a(final int i, final int i2, final int i3) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855901 */

                        static {
                            Covode.recordClassIndex(99774);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55090a(final int i, final int i2, final String str) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855912 */

                        static {
                            Covode.recordClassIndex(99775);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                if (str != null) {
                                    C85581w.this.f191855v.put(Integer.valueOf(i), str);
                                }
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            C85315al.m146637a("VEEditor", "VEEditor textureView");
            this.f191765B = TEInterface.createEngine((C85395bh) null);
            this.f191838e = new C85553b(str);
            this.f191769F = textureView;
            textureView.setSurfaceTextureListener(r3);
            this.f191765B.setOpenGLListeners(this.f191808aR);
            this.f191765B.setInfoListener(this.f191792aB);
            this.f191765B.setErrorListener(this.f191793aC);
            mo131672c(false);
            m147485M();
            return;
        }
        throw new C85615x(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    private C85581w(String str, SurfaceView surfaceView, C85395bh bhVar, byte b) {
        this.f191839f = new VESize(-1, -1);
        this.f191840g = "mp4";
        this.f191841h = new HandlerC85610i(Looper.getMainLooper());
        this.f191842i = null;
        this.f191843j = null;
        this.f191844k = null;
        this.f191845l = null;
        this.f191846m = null;
        this.f191847n = null;
        this.f191848o = null;
        this.f191849p = null;
        this.f191850q = null;
        this.f191851r = null;
        this.f191852s = new C30651j();
        this.f191853t = new C30634a();
        this.f191832as = true;
        this.f191854u = "unknown";
        this.f191833au = null;
        this.f191834av = "/concatShootVideo";
        this.f191855v = new HashMap();
        this.f191856w = new AtomicBoolean(false);
        this.f191791aA = -1;
        this.f191792aB = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855821 */

            static {
                Covode.recordClassIndex(99766);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(int i, int i2, float f, String str) {
                long j;
                long j2;
                int i3;
                MethodCollector.m26663i(13020);
                if (i == 4101) {
                    if (C85581w.this.f191776M > 0) {
                        System.currentTimeMillis();
                    }
                    if (C85581w.this.f191842i != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                        C85581w.this.f191841h.sendEmptyMessage(4101);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                        C85581w.this.f191850q.onCallback(4101, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (i != 4103) {
                    if (i != 4105) {
                        if (i != 4129) {
                            if (i != 4157) {
                                if (i != 4133) {
                                    if (i == 4134) {
                                        C85581w.this.f191822ai = f;
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (i != 4144) {
                                        if (i != 4145) {
                                            if (i != 4160) {
                                                if (i != 4161) {
                                                    if (C85581w.this.f191850q != null) {
                                                        C85315al.m146639b("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                                    }
                                                } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                    C85581w.this.f191788Y.f191917m = i2;
                                                    MethodCollector.m26664o(13020);
                                                    return;
                                                }
                                            } else if (C85581w.this.f191787X && C85581w.this.f191788Y != null) {
                                                C85581w.this.f191788Y.f191916l = i2;
                                                MethodCollector.m26664o(13020);
                                                return;
                                            }
                                        } else if (C85581w.this.f191846m != null) {
                                            C85581w.this.f191846m.mo87654b();
                                            MethodCollector.m26664o(13020);
                                            return;
                                        } else if (C85581w.this.f191850q != null) {
                                            C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                            C85581w.this.f191850q.onCallback(i, i2, f, str);
                                            MethodCollector.m26664o(13020);
                                            return;
                                        }
                                    } else if (C85581w.this.f191846m != null) {
                                        C85581w.this.f191846m.mo87653a();
                                        MethodCollector.m26664o(13020);
                                        return;
                                    } else if (C85581w.this.f191850q != null) {
                                        C85315al.m146637a("VEEditor", "TECommonCallback type:".concat(String.valueOf(i)));
                                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                                        MethodCollector.m26664o(13020);
                                        return;
                                    }
                                } else if (!(C85581w.this.f191845l == null || C85581w.this.f191841h == null)) {
                                    Message message = new Message();
                                    message.what = 4133;
                                    message.arg1 = i2;
                                    message.arg2 = (int) f;
                                    C85581w.this.f191841h.sendMessage(message);
                                    MethodCollector.m26664o(13020);
                                    return;
                                }
                            } else if (!(C85581w.this.f191849p == null || C85581w.this.f191841h == null)) {
                                Message message2 = new Message();
                                message2.what = 4157;
                                message2.arg1 = i2;
                                message2.arg2 = (int) f;
                                C85581w.this.f191841h.sendMessage(message2);
                                MethodCollector.m26664o(13020);
                                return;
                            }
                        } else if (C85581w.this.f191777N == 0) {
                            C85581w.this.f191777N = System.currentTimeMillis();
                            C85315al.m146637a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                            MethodCollector.m26664o(13020);
                            return;
                        }
                    } else if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        Message message3 = new Message();
                        message3.what = i;
                        message3.obj = Float.valueOf(f);
                        C85581w.this.f191841h.sendMessage(message3);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                } else if (C85581w.this.f191787X) {
                    C85581w.this.f191788Y.f191908d = C85581w.this.f191850q;
                    new Thread(C85581w.this.f191788Y).start();
                    C85581w.this.f191787X = false;
                    MethodCollector.m26664o(13020);
                    return;
                } else {
                    C85581w wVar = C85581w.this;
                    if (i2 == 1 || i2 == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - wVar.f191786W;
                        C85315al.m146641c("VEEditor", "compile cost:".concat(String.valueOf(currentTimeMillis)));
                        C30695h.m63065a("te_composition_time", currentTimeMillis);
                        C30695h.m63062a(1, "te_composition_time", currentTimeMillis);
                        if (C30004e.m60552a(wVar.f191785V)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(wVar.f191785V, iArr) != null) {
                                long length = new File(wVar.f191785V).length();
                                C30695h.m63065a("te_composition_page_mode", (long) wVar.f191819af);
                                double d = (double) length;
                                Double.isNaN(d);
                                double d2 = (d / 1024.0d) / 1024.0d;
                                C30695h.m63064a("te_composition_file_size", d2);
                                C30695h.m63064a("te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63064a("te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63064a("te_composition_fps", (double) iArr[7]);
                                String str2 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    C85315al.m146641c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str2);
                                }
                                C30695h.m63062a(1, "te_composition_page_mode", (long) wVar.f191819af);
                                C30695h.m63063a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                C30695h.m63061a(1, "te_composition_fps", (double) iArr[7]);
                                C30695h.m63061a(1, "te_composition_bit_rate", (double) iArr[6]);
                                C30695h.m63061a(1, "te_composition_file_duration", (double) iArr[3]);
                                C30695h.m63061a(1, "te_composition_file_size", d2);
                                int i4 = wVar.f191816ac.f73424c;
                                if (i4 != 0) {
                                    C30695h.m63062a(1, "te_composition_time_filter_type", (long) i4);
                                }
                                C30652a.m63004a("te_composition_file_duration", (long) iArr[3]);
                                C30652a.m63004a("te_composition_video_frame_rate", (long) iArr[7]);
                                C30652a.m63004a("te_composition_video_resolution_width", (long) iArr[0]);
                                C30652a.m63004a("te_composition_video_resolution_height", (long) iArr[1]);
                            }
                        }
                        boolean b = wVar.f191816ac.mo55070b();
                        if (b) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        C30695h.m63062a(1, "te_composition_effect_add", j);
                        if (!b) {
                            C30695h.m63063a(1, "te_composition_effect_json", wVar.f191816ac.mo55066a(0));
                        }
                        boolean c = wVar.f191816ac.mo55071c();
                        if (c) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        C30695h.m63062a(1, "te_composition_info_sticker_add", j2);
                        if (!c) {
                            C30695h.m63063a(1, "te_composition_info_sticker_json", wVar.f191816ac.mo55066a(1));
                        }
                        wVar.f191816ac.mo55067a();
                        TEMonitorInvoker.nativeMonitorPerf(C30695h.f73418b);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_file", wVar.f191840g);
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_result", "succ");
                        C30695h.m63063a(1, "iesve_veeditor_composition_finish_reason", "");
                        Map<String, String> nativeGetMapByType = TEMonitorInvoker.nativeGetMapByType(1);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            C30695h.m63067a(nativeGetMapByType, jSONObject);
                            jSONObject.put("usage_type", wVar.f191854u);
                            if (i2 == 1 || i2 == 2) {
                                i3 = 0;
                            } else {
                                i3 = i2;
                            }
                            jSONObject.put("resultCode", i3);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "performance");
                        C30683b.m63032a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
                        TEMonitorInvoker.nativeMonitorPerfWithType(1);
                    }
                    if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                        C85315al.m146641c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                        Message message4 = new Message();
                        message4.what = 4103;
                        message4.arg1 = i2;
                        message4.obj = str;
                        C85581w.this.f191841h.sendMessage(message4);
                        MethodCollector.m26664o(13020);
                        return;
                    } else if (C85581w.this.f191850q != null) {
                        C85315al.m146641c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                        C85581w.this.f191850q.onCallback(i, i2, f, str);
                        MethodCollector.m26664o(13020);
                        return;
                    }
                }
                MethodCollector.m26664o(13020);
            }
        };
        this.f191793aC = new AbstractC30641b() {
            /* class com.p2082ss.android.vesdk.C85581w.C855998 */

            static {
                Covode.recordClassIndex(99783);
            }

            @Override // com.p2082ss.android.ttve.common.AbstractC30641b
            /* renamed from: a */
            public final void mo54931a(final int i, final int i2, final float f, final String str) {
                C85581w.this.mo131663b();
                if (C85581w.this.f191851r != null) {
                    C85581w.this.f191851r.onCallback(i, i2, f, str);
                }
                if (C85581w.this.f191843j != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855998.RunnableC856001 */

                        static {
                            Covode.recordClassIndex(99784);
                        }

                        public final void run() {
                            if (C85581w.this.f191843j != null) {
                                C85581w.this.f191843j.onCompileError(i, i2, f, str);
                            }
                        }
                    });
                }
            }
        };
        this.f191857x = 0;
        this.f191858y = 0;
        this.f191794aD = 0;
        this.f191795aE = 0;
        this.f191859z = false;
        this.f191764A = 0;
        this.f191770G = 0;
        this.f191771H = 0;
        this.f191772I = 0;
        this.f191773J = 0;
        this.f191774K = 0;
        this.f191775L = 0;
        this.f191776M = 0;
        this.f191777N = 0;
        this.f191778O = false;
        this.f191796aF = 0;
        this.f191797aG = 0;
        this.f191798aH = 0;
        this.f191779P = -1;
        this.f191781R = EnumC85612k.ALIGN_PARENT_BOTTOM;
        this.f191782S = EnumC85614m.CENTER;
        this.f191783T = false;
        this.f191799aI = false;
        this.f191800aJ = false;
        this.f191784U = -1;
        this.f191785V = null;
        this.f191786W = 0;
        this.f191801aK = false;
        this.f191787X = false;
        this.f191788Y = null;
        this.f191789Z = null;
        this.f191814aa = null;
        this.f191815ab = null;
        this.f191816ac = new C30696i();
        this.f191817ad = false;
        this.f191802aL = true;
        this.f191803aM = false;
        this.f191818ae = null;
        this.f191804aN = 0.0f;
        this.f191805aO = 1.0f;
        this.f191806aP = 1.0f;
        this.f191819af = -1;
        this.f191807aQ = -1;
        this.f191820ag = -16777216;
        this.f191821ah = -16777216;
        this.f191822ai = 0.0f;
        this.f191823aj = new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.vesdk.C85581w.TextureView$SurfaceTextureListenerC856019 */

            static {
                Covode.recordClassIndex(99785);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C85581w.this.mo131633a();
                if (C85581w.this.f191767D == null) {
                    return true;
                }
                C85581w.this.f191767D.release();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C85581w.this.f191857x = i;
                C85581w.this.f191858y = i2;
                C85581w.this.mo131734x();
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C85581w.this.f191766C == surfaceTexture) {
                    C85581w wVar = C85581w.this;
                    wVar.mo131640a(wVar.f191767D);
                } else {
                    C85581w.this.f191767D = new Surface(surfaceTexture);
                    C85581w wVar2 = C85581w.this;
                    wVar2.mo131640a(wVar2.f191767D);
                }
                C85581w.this.f191766C = surfaceTexture;
            }
        };
        this.f191824ak = new SurfaceHolder.Callback2() {
            /* class com.p2082ss.android.vesdk.C85581w.SurfaceHolder$Callback2C8558310 */

            static {
                Covode.recordClassIndex(99767);
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
                C85315al.m146639b("VEEditor", "surfaceRedrawNeeded...");
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C85581w.this.mo131640a(surfaceHolder.getSurface());
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (C85581w.this.f191856w.get()) {
                    C85315al.m146641c("VEEditor", "surfaceDestroyed, is destroying, just return");
                } else {
                    C85581w.this.mo131633a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C85315al.m146639b("VEEditor", C1764a.m5929a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                C85581w.this.mo131636a(i2, i3);
            }
        };
        this.f191808aR = new NativeCallbacks.AbstractC30708h() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558411 */

            static {
                Covode.recordClassIndex(99768);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55096a(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLCreate: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: b */
            public final int mo55098b(int i) {
                C85315al.m146639b("VEEditor", "onOpenGLDestroy: ret = ".concat(String.valueOf(i)));
                return 0;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30708h
            /* renamed from: a */
            public final int mo55097a(int i, double d) {
                long j;
                long j2;
                C85315al.m146643e("VEEditor", "onOpenGLDrawing: tex = " + i + " timeStamp = " + d);
                if (!C85581w.this.f191778O) {
                    C85581w.this.f191778O = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C85581w.this.f191777N > 0) {
                        j = C85581w.this.f191777N;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (C85581w.this.f191775L > 0) {
                        j2 = C85581w.this.f191775L;
                    } else {
                        j2 = C85581w.this.f191774K;
                    }
                    if (j2 == 0 || j2 < C85581w.this.f191773J) {
                        C85315al.m146642d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + C85581w.this.f191775L + ", mlFirstSeekTimeMS = " + C85581w.this.f191774K + ", mlInitTimeMS = " + C85581w.this.f191773J);
                        j2 = C85581w.this.f191773J;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time_init", j2 - C85581w.this.f191773J);
                        jSONObject.put("time_seek", j - j2);
                        jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                        jSONObject.put("time_total", currentTimeMillis - C85581w.this.f191773J);
                        jSONObject.put("usage_type", C85581w.this.f191854u);
                        C30683b.m63032a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                        C85315al.m146637a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                    } catch (JSONException e) {
                        C85315al.m146642d("VEEditor", "report first frame json err ".concat(String.valueOf(e)));
                    }
                    C30695h.m63062a(1, "te_edit_first_frame_time", currentTimeMillis - C85581w.this.f191773J);
                    if (C85581w.this.f191844k != null) {
                        C85581w.this.f191844k.mo56396a();
                    }
                }
                C85581w.this.f191770G++;
                if (C85581w.this.f191770G == 30) {
                    C85581w.this.f191771H = System.currentTimeMillis();
                    if (C85581w.this.f191772I != C85581w.this.f191771H) {
                        float f = 30000.0f / ((float) (C85581w.this.f191771H - C85581w.this.f191772I));
                        if (C85376ax.f191102c) {
                            C85315al.m146637a("VEEditor", "Render FPS = ".concat(String.valueOf(f)));
                        }
                        C85581w wVar = C85581w.this;
                        wVar.f191772I = wVar.f191771H;
                        C85581w.this.f191770G = 0;
                    }
                }
                return 0;
            }
        };
        this.f191809aS = new NativeCallbacks.AbstractC30703c() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558512 */

            static {
                Covode.recordClassIndex(99769);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30703c
            /* renamed from: a */
            public final int mo55087a(byte[] bArr, int i, int i2, boolean z) {
                if (bArr == null || i < 0 || i2 <= 0) {
                    return -1;
                }
                if (C85581w.this.f191789Z == null) {
                    return -2;
                }
                C85581w.this.f191789Z.mo116308a(bArr, i, i2, z);
                return 0;
            }
        };
        this.f191810aT = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558613 */

            static {
                Covode.recordClassIndex(99770);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191814aa == null) {
                    return -100;
                }
                if (bArr != null || C85581w.this.f191841h == null) {
                    return C85581w.this.f191814aa.mo110443a(bArr, i, i2);
                }
                Message message = new Message();
                message.what = 4117;
                C85581w.this.f191841h.sendMessage(message);
                return 0;
            }
        };
        this.f191811aU = new NativeCallbacks.AbstractC30704d() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558714 */

            static {
                Covode.recordClassIndex(99771);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30704d
            /* renamed from: a */
            public final int mo55088a(byte[] bArr, int i, int i2) {
                if (C85581w.this.f191815ab == null) {
                    return -100;
                }
                if (bArr == null) {
                    return -1;
                }
                return C85581w.this.f191815ab.mo110443a(bArr, i, i2);
            }
        };
        this.f191812aV = new NativeCallbacks.AbstractC30707g() {
            /* class com.p2082ss.android.vesdk.C85581w.C8558815 */

            static {
                Covode.recordClassIndex(99772);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: a */
            public final int mo55092a() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130304a();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: b */
            public final int mo55093b() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130305b();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: c */
            public final int mo55094c() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130306c();
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30707g
            /* renamed from: d */
            public final int mo55095d() {
                if (C85581w.this.f191848o == null) {
                    return -100;
                }
                return C85581w.this.f191848o.mo130307d();
            }
        };
        this.f191813aW = new NativeCallbacks.AbstractC30705e() {
            /* class com.p2082ss.android.vesdk.C85581w.C855892 */

            static {
                Covode.recordClassIndex(99773);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55089a(final int i, final int i2, final int i3) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855901 */

                        static {
                            Covode.recordClassIndex(99774);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30705e
            /* renamed from: a */
            public final void mo55090a(final int i, final int i2, final String str) {
                if (C85581w.this.f191847n != null && C85581w.this.f191841h != null) {
                    C85581w.this.f191841h.post(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855892.RunnableC855912 */

                        static {
                            Covode.recordClassIndex(99775);
                        }

                        public final void run() {
                            if (C85581w.this.f191847n != null) {
                                if (str != null) {
                                    C85581w.this.f191855v.put(Integer.valueOf(i), str);
                                }
                                VEListener.AbstractC85256y yVar = C85581w.this.f191847n;
                            }
                        }
                    });
                }
            }
        };
        if (!TextUtils.isEmpty(str)) {
            C85315al.m146637a("VEEditor", "VEEditor surfaceView");
            this.f191765B = TEInterface.createEngine(bhVar);
            this.f191838e = new C85553b(str);
            this.f191768E = surfaceView;
            surfaceView.getHolder().addCallback(this.f191824ak);
            this.f191765B.setOpenGLListeners(this.f191808aR);
            this.f191765B.setInfoListener(this.f191792aB);
            this.f191765B.setErrorListener(this.f191793aC);
            mo131672c(false);
            m147485M();
            return;
        }
        throw new C85615x(-100, "workspace is: ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public static C85581w m147494a(C85581w wVar, final C85553b bVar, VEVideoEncodeSettings vEVideoEncodeSettings, final VEListener.AbstractC85249r rVar) {
        String str;
        String str2;
        String str3;
        String str4;
        MethodCollector.m26663i(11989);
        System.currentTimeMillis();
        TEVideoUtils.nativeCancelCompileProbe();
        final TEReverseCallback tEReverseCallback = new TEReverseCallback();
        tEReverseCallback.setListener(rVar);
        bVar.f191686g = false;
        if (vEVideoEncodeSettings == null) {
            C85315al.m146641c("VEEditor", "using default video setting for genReverseVideo2");
            vEVideoEncodeSettings = new VEVideoEncodeSettings.C85292a(2).mo130573a(-1, -1).mo130597f(1).mo130572a(30).mo130588b(false).mo130590c(13).mo130598g(1).mo130589c().mo130579a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo130578a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo130594d();
        }
        f191763az++;
        if (bVar.f191691l != null && bVar.f191691l.size() > 0) {
            Iterator<String> it = bVar.f191691l.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    C85553b.m147445a(file);
                }
            }
        }
        final String a = bVar.mo131521a(f191763az + "-0");
        final String a2 = bVar.mo131521a(f191763az + "-1");
        final String str5 = C85557f.m147458a(bVar.f191680a, "concat") + File.separator + (f191763az + "-0") + "_reverse.wav";
        bVar.f191691l.add(str5);
        wVar.mo131665b(new AbstractC85541q(wVar) {
            /* class com.p2082ss.android.vesdk.C85581w.C855923 */

            /* renamed from: a */
            final /* synthetic */ C85581w f191876a;

            /* renamed from: b */
            final /* synthetic */ boolean f191877b = true;

            static {
                Covode.recordClassIndex(99776);
            }

            @Override // com.p2082ss.android.vesdk.AbstractC85541q
            public final void onCallback(int i, int i2, float f, String str) {
                if (i != 4103) {
                    if (i == 4105) {
                        TEReverseCallback tEReverseCallback = tEReverseCallback;
                        double d = (double) f;
                        Double.isNaN(d);
                        tEReverseCallback.onProgressChanged(d * 0.5d);
                    }
                } else if (this.f191876a.mo131731w()) {
                    if (this.f191877b) {
                        TEVideoUtils.reverseAllIVideo(a, a2, tEReverseCallback);
                    } else {
                        TEVideoUtils.reverseAllIVideoAndMuxAudio(a, str5, a2, tEReverseCallback);
                    }
                    new Thread(new Runnable() {
                        /* class com.p2082ss.android.vesdk.C85581w.C855923.RunnableC855931 */

                        static {
                            Covode.recordClassIndex(99777);
                        }

                        public final void run() {
                            C855923.this.f191876a.mo131703j();
                            C85553b bVar = bVar;
                            bVar.f191681b = new String[]{a};
                            if (C855923.this.f191877b) {
                                C85553b bVar2 = bVar;
                                bVar2.f191685f = new String[]{str5};
                            }
                            C85553b bVar3 = bVar;
                            bVar3.f191684e = new String[]{a2};
                            bVar.f191686g = true;
                            C85315al.m146637a("VEEditor", "reverse compileDone: needSeparateAudioPath = " + C855923.this.f191877b);
                            C85315al.m146637a("VEEditor", "reverse compileDone: mOriginalSoundTrackType = " + bVar.f191690k);
                            if (rVar != null) {
                                rVar.mo111965a(0);
                            }
                        }
                    }).start();
                }
            }

            {
                this.f191876a = r2;
            }
        });
        wVar.mo131644a(new AbstractC85541q(wVar) {
            /* class com.p2082ss.android.vesdk.C85581w.C855944 */

            /* renamed from: a */
            final /* synthetic */ C85581w f191885a;

            static {
                Covode.recordClassIndex(99778);
            }

            {
                this.f191885a = r1;
            }

            @Override // com.p2082ss.android.vesdk.AbstractC85541q
            public final void onCallback(int i, int i2, float f, String str) {
                new Thread(new Runnable() {
                    /* class com.p2082ss.android.vesdk.C85581w.C855944.RunnableC855951 */

                    static {
                        Covode.recordClassIndex(99779);
                    }

                    public final void run() {
                        C855944.this.f191885a.mo131703j();
                        if (rVar != null) {
                            rVar.mo111965a(-1);
                        }
                    }
                }).start();
            }
        });
        wVar.mo131648a(a, str5, vEVideoEncodeSettings);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mWorkSpace", bVar.f191680a);
            String str6 = null;
            if (bVar.f191681b != null) {
                str = Arrays.toString(bVar.f191681b);
            } else {
                str = null;
            }
            jSONObject.put("mVideoPaths", str);
            if (bVar.f191682c != null) {
                str2 = Arrays.toString(bVar.f191682c);
            } else {
                str2 = null;
            }
            jSONObject.put("mAudioPaths", str2);
            if (bVar.f191683d != null) {
                str3 = Arrays.toString(bVar.f191683d);
            } else {
                str3 = null;
            }
            jSONObject.put("mTransitions", str3);
            if (bVar.f191684e != null) {
                str4 = Arrays.toString(bVar.f191684e);
            } else {
                str4 = null;
            }
            jSONObject.put("mReverseVideoPath", str4);
            if (bVar.f191685f != null) {
                str6 = Arrays.toString(bVar.f191685f);
            }
            jSONObject.put("mReverseAudioPaths", str6);
            jSONObject.put("resultCode", 0);
            C30683b.m63032a("vesdk_event_editor_reverse_video", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        MethodCollector.m26664o(11989);
        return wVar;
    }

    /* renamed from: a */
    public final void mo131635a(float f, float f2, float f3, int i, int i2) {
        m147503b(f, f2, f3, i, i2);
    }

    /* renamed from: a */
    public static C85581w m147493a(C85553b bVar, VERecordData vERecordData, int i, int i2, VEListener.AbstractC85249r rVar) {
        VEVideoEncodeSettings d;
        C85315al.m146641c("VEEditor", "genReverseVideo2 with recordData.");
        if (vERecordData.f190794b == null || vERecordData.f190794b.size() <= 1) {
            d = new VEVideoEncodeSettings.C85292a(2).mo130573a(i, i2).mo130572a(30).mo130588b(false).mo130590c(13).mo130598g(1).mo130589c().mo130579a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo130578a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo130583a(false, false).mo130594d();
        } else {
            d = new VEVideoEncodeSettings.C85292a(2).mo130573a(i, i2).mo130597f(1).mo130572a(30).mo130588b(false).mo130590c(13).mo130598g(1).mo130589c().mo130579a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo130578a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo130583a(false, false).mo130594d();
        }
        C85581w wVar = new C85581w(bVar.f191680a);
        int a = wVar.mo131600a(vERecordData, false, false);
        if (a == 0) {
            return m147494a(wVar, bVar, d, rVar);
        }
        C85315al.m146642d("VEEditor", "genReverseVideo2 init error:".concat(String.valueOf(a)));
        return null;
    }

    /* renamed from: b */
    private void m147503b(float f, float f2, float f3, int i, int i2) {
        C85509a aVar = new C85509a();
        aVar.mo131333a("iesve_veeditor_video_scale_width", f).mo131333a("iesve_veeditor_video_scale_heigh", f2);
        C30689e.m63052a("iesve_veeditor_video_scale", 1, aVar);
        this.f191804aN = f3;
        this.f191805aO = f2;
        this.f191806aP = f2;
        C85315al.m146637a("VEEditor", "setDisplayState... " + f + " " + f2 + " " + f3 + " " + i + " " + i2 + " 0");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scaleW", String.valueOf(f));
            jSONObject.put("scaleH", String.valueOf(f2));
            jSONObject.put("degree", String.valueOf(f3));
            jSONObject.put("transX", String.valueOf(i));
            jSONObject.put("transY", String.valueOf(i2));
            C30683b.m63032a("vesdk_event_editor_scale_rotate_trans", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f191765B.setDisplayState(f, f2, f3, 0.0f, i, i2, 0);
    }

    /* renamed from: a */
    public final int mo131579a(int i, int i2, int i3, int i4, int i5, boolean z) {
        return this.f191837d.mo130858a(i, i2, i3, i4, i5, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r22 != 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        com.p2082ss.android.vesdk.C85315al.m146641c("VEEditor", "compile use not hard encode, not soft encode");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13875);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return -100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r1 = m147489a(r15, r16, 1080, 1920, r17, r19, r21, r22, (com.p2082ss.android.vesdk.VEListener.AbstractC85244m) null, r23);
        com.p2082ss.android.vesdk.C85581w.f191762ay = false;
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13875);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m147491a(java.lang.String r15, java.lang.String r16, long r17, long r19, java.lang.String r21, int r22, com.p2082ss.android.vesdk.VEListener.AbstractC85245n r23) {
        /*
            r2 = 13875(0x3633, float:1.9443E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            java.lang.Object r1 = com.p2082ss.android.vesdk.C85581w.f191761ax
            monitor-enter(r1)
            boolean r0 = com.p2082ss.android.vesdk.C85581w.f191762ay     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0012
            r0 = -2
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return r0
        L_0x0012:
            r0 = 1
            com.p2082ss.android.vesdk.C85581w.f191762ay = r0
            monitor-exit(r1)
            r12 = r22
            if (r12 != 0) goto L_0x0027
            java.lang.String r1 = "VEEditor"
            java.lang.String r0 = "compile use not hard encode, not soft encode"
            com.p2082ss.android.vesdk.C85315al.m146641c(r1, r0)
            r0 = -100
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return r0
        L_0x0027:
            r5 = 1080(0x438, float:1.513E-42)
            r6 = 1920(0x780, float:2.69E-42)
            r13 = 0
            r9 = r19
            r7 = r17
            r4 = r16
            r14 = r23
            r11 = r21
            r3 = r15
            int r1 = m147489a(r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r0 = 0
            com.p2082ss.android.vesdk.C85581w.f191762ay = r0
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return r1
        L_0x0042:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85581w.m147491a(java.lang.String, java.lang.String, long, long, java.lang.String, int, com.ss.android.vesdk.VEListener$n):int");
    }

    /* renamed from: a */
    public static int m147490a(String str, String str2, int i, int i2, long j, long j2, String str3, VEListener.AbstractC85244m mVar) {
        MethodCollector.m26663i(13874);
        synchronized (f191761ax) {
            try {
                if (f191762ay) {
                    return -2;
                }
                f191762ay = true;
                int a = m147489a(str, str2, i, i2, j, j2, str3, 1, mVar, (VEListener.AbstractC85245n) null);
                f191762ay = false;
                MethodCollector.m26664o(13874);
                return a;
            } finally {
                MethodCollector.m26664o(13874);
            }
        }
    }

    /* renamed from: a */
    private static int m147489a(String str, String str2, int i, int i2, long j, long j2, String str3, int i3, final VEListener.AbstractC85244m mVar, final VEListener.AbstractC85245n nVar) {
        final int i4;
        C855976 r8;
        C855965 r9;
        MethodCollector.m26663i(13913);
        final VEVideoEncodeSettings d = new VEVideoEncodeSettings.C85292a(2).mo130581a(str3).mo130594d();
        C85568t.C85573d a = C85568t.m147473a().mo131556a("use_byte264");
        C85568t.C85573d a2 = C85568t.m147473a().mo131556a("compile_probe_use_byte264");
        if (a == null || a.f191742b == null || !((Boolean) a.f191742b).booleanValue()) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (!(a2 == null || a2.f191742b == null || ((Boolean) a2.f191742b).booleanValue())) {
            i4 = 0;
        }
        C85315al.m146637a("VEEditor", "KEY_USE_BYTE264= " + ((Boolean) a.f191742b).booleanValue() + "KEY_COMPILE_PROBE_USE_BYTE264= " + ((Boolean) a2.f191742b).booleanValue() + "tempValue= " + i4);
        if (nVar != null) {
            r9 = new TEVideoUtils.CompileProbeListener2() {
                /* class com.p2082ss.android.vesdk.C85581w.C855965 */

                static {
                    Covode.recordClassIndex(99780);
                }

                @Override // com.p2082ss.android.ttve.nativePort.TEVideoUtils.CompileProbeListener2
                public final void onCompileProbeResult2(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, float f3) {
                    double d;
                    double d2;
                    float f4 = f2;
                    if (nVar != null) {
                        int min = Math.min(i5, i6);
                        if (min <= 716 || min >= 724) {
                            if (min > 1076 && min < 1084) {
                                d = (double) d.getVideoCompileEncodeSetting().mHWEncodeSetting.mBitrate;
                                d2 = d.getVideoCompileEncodeSetting().mHWEncodeSetting.mFullHd_bitrate_ratio;
                                Double.isNaN(d);
                            } else if (min > 572 && min < 580) {
                                d = (double) d.getVideoCompileEncodeSetting().mHWEncodeSetting.mBitrate;
                                d2 = d.getVideoCompileEncodeSetting().mHWEncodeSetting.mSd_bitrate_ratio;
                                Double.isNaN(d);
                            }
                            f4 = (float) (d * d2);
                        } else {
                            f4 = (float) d.getVideoCompileEncodeSetting().mHWEncodeSetting.mBitrate;
                        }
                        if (f4 > 0.0f) {
                            f4 /= 1000.0f;
                        }
                        C85315al.m146637a("VEEditor", "callback opt_crf=" + i2 + " optBitrate=" + f4 + " videoBitrate=" + f + " encoder_type=" + i4 + " preset=" + i3 + " max_bitrate=" + i4 + " encode_width=" + i5 + " encoder_height=" + i6 + " psnr= " + f3 + " pre_crf= " + d.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf + " pre_gop=" + d.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop + " pre_qpoffset=" + d.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
                        nVar.mo127353a(i, i2, f, f4, i4, i3, i4, i5, i6, f3, d.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf, d.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop, d.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
                    }
                }
            };
            r8 = null;
        } else if (mVar != null) {
            r8 = new TEVideoUtils.CompileProbeListener() {
                /* class com.p2082ss.android.vesdk.C85581w.C855976 */

                static {
                    Covode.recordClassIndex(99781);
                }

                @Override // com.p2082ss.android.ttve.nativePort.TEVideoUtils.CompileProbeListener
                public final void onCompileProbeResult(int i, int i2, float f, int i3, int i4, int i5, int i6, float f2) {
                    if (mVar != null) {
                        C85315al.m146637a("VEEditor", "callback opt_crf=" + i2 + " videoBitrate=" + f + " encoder_type=" + i4 + " preset=" + i3 + " max_bitrate=" + i4 + " encode_width=" + i5 + " encoder_height=" + i6 + " psnr=" + f2 + " pre_crf=" + d.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf + " pre_gop=" + d.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop + " pre_qpoffset=" + d.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
                        mVar.mo127298a(i, i2, f, i4, i3, i4, i5, i6, f2, d.getVideoCompileEncodeSetting().mSWEncodeSetting.mCrf, d.getVideoCompileEncodeSetting().mSWEncodeSetting.mGop, d.getVideoCompileEncodeSetting().mSWEncodeSetting.mQPOffset);
                    }
                }
            };
            r9 = null;
        } else {
            MethodCollector.m26664o(13913);
            return -100;
        }
        VEVideoCompileEncodeSettings videoCompileEncodeSetting = d.getVideoCompileEncodeSetting();
        if (videoCompileEncodeSetting.useHWEncoder && i3 == 1) {
            C85315al.m146641c("VEEditor", "compile use hard encode, not soft encode");
            MethodCollector.m26664o(13913);
            return -100;
        } else if (str2 == null || str2.isEmpty()) {
            C85315al.m146641c("VEEditor", "savepath is null or savepath is empty");
            MethodCollector.m26664o(13913);
            return -100;
        } else {
            File file = new File(str2);
            if (!file.exists() || !file.isDirectory()) {
                C85315al.m146641c("VEEditor", "savepath is not exist, savepath: ".concat(String.valueOf(str2)));
                MethodCollector.m26664o(13913);
                return -1;
            }
            String str4 = str2 + "/probe/";
            if (new File(str4).exists() || C85616y.m147706c(str4)) {
                String str5 = str4 + "compile_probe";
                TEVideoUtils.nativeCompileProbe(str, str5, i, i2, j, j2, videoCompileEncodeSetting.mSWEncodeSetting.mPreset, videoCompileEncodeSetting.mSWEncodeSetting.mCrf, videoCompileEncodeSetting.mSWEncodeSetting.mGop, videoCompileEncodeSetting.mSWEncodeSetting.mMaxRate, videoCompileEncodeSetting.mSWEncodeSetting.mQPOffset, r8, r9, i3);
                File file2 = new File(str5);
                if (file2.exists()) {
                    C85315al.m146641c("VEEditor", "delete file: ".concat(String.valueOf(str5)));
                    m147495a(file2);
                }
                MethodCollector.m26664o(13913);
                return 0;
            }
            C85315al.m146641c("VEEditor", "create probeDir failed");
            MethodCollector.m26664o(13913);
            return -1;
        }
    }

    /* renamed from: b */
    private int m147502b(String[] strArr, int[] iArr, int[] iArr2, VETransitionFilterParam[] vETransitionFilterParamArr, String[] strArr2, int[] iArr3, int[] iArr4, float[] fArr, VECanvasFilterParam[] vECanvasFilterParamArr, EnumC85613l lVar) {
        int[] iArr5;
        int[] iArr6;
        boolean z;
        MethodCollector.m26663i(14129);
        synchronized (this) {
            if (vECanvasFilterParamArr != null) {
                try {
                    if (vECanvasFilterParamArr.length != 0 && vECanvasFilterParamArr[0].height > 0 && vECanvasFilterParamArr[0].width > 0) {
                        if (strArr.length == iArr.length && strArr.length == iArr2.length) {
                            for (int i = 0; i < iArr.length; i++) {
                                if (iArr2[i] >= 0 && iArr2[i] <= iArr[i]) {
                                    C85315al.m146642d("VEEditor", "initWithCanvas invalid param vTrimIn[" + i + "]=" + iArr[i] + ", vTrimOut[" + i + "]=" + iArr2[i]);
                                    MethodCollector.m26664o(14129);
                                    return -100;
                                }
                            }
                            TEMonitorInvoker.nativeReset(1);
                            C30695h.m63060a(1);
                            long currentTimeMillis = System.currentTimeMillis();
                            this.f191773J = currentTimeMillis;
                            this.f191772I = currentTimeMillis;
                            C85315al.m146637a("VEEditor", "initWithCanvasAndInfos...");
                            String[] strArr3 = null;
                            if (vETransitionFilterParamArr == null || vETransitionFilterParamArr.length <= 0) {
                                iArr5 = null;
                                iArr6 = null;
                            } else {
                                strArr3 = new String[vETransitionFilterParamArr.length];
                                iArr5 = new int[vETransitionFilterParamArr.length];
                                iArr6 = new int[vETransitionFilterParamArr.length];
                                for (int i2 = 0; i2 < vETransitionFilterParamArr.length; i2++) {
                                    strArr3[i2] = vETransitionFilterParamArr[i2].transName;
                                    iArr5[i2] = vETransitionFilterParamArr[i2].tranType;
                                    iArr6[i2] = vETransitionFilterParamArr[i2].tranDuration;
                                }
                            }
                            int initVideoEditorWithCanvas = this.f191765B.initVideoEditorWithCanvas(strArr, null, strArr.length, null, iArr, iArr2, strArr2, null, iArr3, iArr4, strArr3, iArr5, iArr6, null, fArr, EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL.ordinal(), null);
                            if (initVideoEditorWithCanvas != 0) {
                                C85315al.m146642d("VEEditor", "initVideoEditorWithCanvas, ret = ".concat(String.valueOf(initVideoEditorWithCanvas)));
                                mo131663b();
                                this.f191783T = false;
                                MethodCollector.m26664o(14129);
                                return initVideoEditorWithCanvas;
                            }
                            this.f191783T = true;
                            this.f191799aI = false;
                            this.f191780Q = lVar;
                            this.f191838e.f191682c = strArr2;
                            this.f191838e.f191681b = strArr;
                            this.f191838e.f191683d = strArr3;
                            this.f191836c.mo131158i();
                            if (strArr2 == null || strArr2.length == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            this.f191859z = Boolean.valueOf(z);
                            this.f191764A = 0;
                            this.f191765B.setTrackDurationType(0, 0, 1);
                            m147501b(EnumC85606e.SCALE_MODE_CANVAS);
                            mo131675c(vECanvasFilterParamArr[0].width, vECanvasFilterParamArr[0].height);
                            this.f191853t.f73229a = 1;
                            try {
                                int i3 = this.f191765B.addFilters(new int[]{0}, new String[]{"canvas wrap"}, new int[]{0}, new int[]{this.f191779P}, new int[]{0}, new int[]{15}, new int[]{1})[0];
                                this.f191784U = i3;
                                mo131657b(-1, i3, vECanvasFilterParamArr[0]);
                                int length = strArr.length;
                                for (int i4 = 0; i4 < length; i4++) {
                                    mo131657b(i4, this.f191784U, vECanvasFilterParamArr[i4]);
                                }
                                VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
                                for (int i5 = 0; i5 < length; i5++) {
                                    mo131657b(i5, this.f191784U, vEVideoTransformFilterParam);
                                }
                                MethodCollector.m26664o(14129);
                                return initVideoEditorWithCanvas;
                            } catch (NullPointerException unused) {
                                C85615x xVar = new C85615x(-1, "init failed: VESDK need to be init");
                                MethodCollector.m26664o(14129);
                                throw xVar;
                            }
                        } else {
                            C85315al.m146642d("VEEditor", "initWithCanvas invalid param, videoFilePaths.length: " + strArr.length + ", vTrimIn.length: " + iArr.length + ", vTrimOut.length: " + iArr2.length);
                            return -100;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(14129);
                }
            }
            C85315al.m146642d("VEEditor", "initWithCanvas invalid canvasFilterParam!");
            MethodCollector.m26664o(14129);
            return -100;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m147492a(java.lang.String[] r30, int[] r31, int[] r32, java.lang.String[] r33, java.lang.String[] r34, int[] r35, int[] r36, float[] r37, float[] r38, com.p2082ss.android.vesdk.ROTATE_DEGREE[] r39, com.p2082ss.android.vesdk.C85581w.EnumC85613l r40, boolean r41) {
        /*
        // Method dump skipped, instructions count: 522
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85581w.m147492a(java.lang.String[], int[], int[], java.lang.String[], java.lang.String[], int[], int[], float[], float[], com.ss.android.vesdk.ROTATE_DEGREE[], com.ss.android.vesdk.w$l, boolean):int");
    }
}
