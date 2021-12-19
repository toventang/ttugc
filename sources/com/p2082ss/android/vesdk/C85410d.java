package com.p2082ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaRecorder;
import android.opengl.GLES20;
import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.medialib.RecordInvoker;
import com.p2082ss.android.medialib.camera.ImageFrame;
import com.p2082ss.android.medialib.listener.AbstractC30011a;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.medialib.listener.AbstractC30013c;
import com.p2082ss.android.medialib.listener.AudioManagerCallback;
import com.p2082ss.android.medialib.model.C30016a;
import com.p2082ss.android.medialib.model.C30018c;
import com.p2082ss.android.medialib.model.EnigmaResult;
import com.p2082ss.android.medialib.model.FaceAttribute;
import com.p2082ss.android.medialib.model.FaceAttributeInfo;
import com.p2082ss.android.medialib.model.FaceDetect;
import com.p2082ss.android.medialib.model.FaceDetectInfo;
import com.p2082ss.android.medialib.model.Skeleton;
import com.p2082ss.android.medialib.model.SkeletonInfo;
import com.p2082ss.android.medialib.p2155b.C29983a;
import com.p2082ss.android.medialib.p2155b.C29987b;
import com.p2082ss.android.medialib.presenter.AbstractC30029f;
import com.p2082ss.android.medialib.presenter.C30031g;
import com.p2082ss.android.ttve.editorInfo.C30652a;
import com.p2082ss.android.ttve.model.C30676d;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ttve.model.VETrackParams;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.ttve.nativePort.TEAudioDataInterface;
import com.p2082ss.android.ttve.nativePort.TESystemUtils;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.C30972p;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2199h.C30842a;
import com.p2082ss.android.ttvecamera.p2202k.C30929b;
import com.p2082ss.android.ttvecamera.p2202k.C30932c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.vesdk.C85322ar;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.C85521l;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.VECameraSettings;
import com.p2082ss.android.vesdk.VEDisplaySettings;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESensService;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.audio.AbstractC85340h;
import com.p2082ss.android.vesdk.audio.C85342j;
import com.p2082ss.android.vesdk.audio.EnumC85339g;
import com.p2082ss.android.vesdk.faceinfo.C85470a;
import com.p2082ss.android.vesdk.faceinfo.C85471b;
import com.p2082ss.android.vesdk.faceinfo.C85472c;
import com.p2082ss.android.vesdk.faceinfo.C85474d;
import com.p2082ss.android.vesdk.faceinfo.C85475e;
import com.p2082ss.android.vesdk.faceinfo.VESkeleton;
import com.p2082ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.p2082ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.p2082ss.android.vesdk.model.BefTextLayout;
import com.p2082ss.android.vesdk.model.BefTextLayoutResult;
import com.p2082ss.android.vesdk.model.VEPrePlayParams;
import com.p2082ss.android.vesdk.p4386b.AbstractC85381a;
import com.p2082ss.android.vesdk.p4386b.AbstractC85382b;
import com.p2082ss.android.vesdk.p4387c.AbstractC85401a;
import com.p2082ss.android.vesdk.p4387c.C85402b;
import com.p2082ss.android.vesdk.p4388d.C85456b;
import com.p2082ss.android.vesdk.p4389e.C85462a;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import com.p2082ss.android.vesdk.runtime.VEMapBufferInfo;
import com.p2082ss.android.vesdk.utils.C85578b;
import com.p2082ss.android.vesdk.utils.TEPlanUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import org.libsdl.app.AudioRecorderInterfaceExt;
import org.libsdl.app.BufferedAudioRecorder;

/* renamed from: com.ss.android.vesdk.d */
public class C85410d extends AbstractC85508g implements RecordInvoker.OnRunningErrorCallback, AbstractC30012b, AbstractC30013c, C30031g.AbstractC30045c, AudioRecorderInterfaceExt {

    /* renamed from: a */
    public static final String f191200a = C85410d.class.getSimpleName();

    /* renamed from: o */
    public static final Object f191201o = new Object();

    /* renamed from: A */
    public boolean f191202A;

    /* renamed from: B */
    public ConditionVariable f191203B;

    /* renamed from: C */
    public volatile boolean f191204C;

    /* renamed from: D */
    public C85380b f191205D;

    /* renamed from: E */
    public boolean f191206E;

    /* renamed from: F */
    boolean f191207F;

    /* renamed from: G */
    public C30842a f191208G;

    /* renamed from: H */
    C30842a.AbstractC30843a f191209H;

    /* renamed from: I */
    public PrivacyCert f191210I;

    /* renamed from: J */
    public int f191211J;

    /* renamed from: K */
    public int f191212K;

    /* renamed from: L */
    public volatile int f191213L;

    /* renamed from: M */
    public EnumC85329au f191214M;

    /* renamed from: N */
    public TEAudioDataInterface f191215N;

    /* renamed from: O */
    AbstractC85401a f191216O;

    /* renamed from: P */
    public LandMarkFrame f191217P;

    /* renamed from: Q */
    public C85386ba f191218Q;

    /* renamed from: R */
    C85456b.AbstractC85458b f191219R;

    /* renamed from: b */
    final List<C30018c> f191220b = new ArrayList();

    /* renamed from: bA */
    private AbstractC85541q f191221bA;

    /* renamed from: bB */
    private float f191222bB = 1.0f;

    /* renamed from: bC */
    private long f191223bC = -1;

    /* renamed from: bD */
    private boolean f191224bD;

    /* renamed from: bE */
    private Surface f191225bE;

    /* renamed from: bF */
    private boolean f191226bF;

    /* renamed from: bG */
    private boolean f191227bG;

    /* renamed from: bH */
    private VEDebugSettings f191228bH;

    /* renamed from: bI */
    private boolean f191229bI;

    /* renamed from: bJ */
    private final ExecutorService f191230bJ;

    /* renamed from: bK */
    private Object f191231bK;

    /* renamed from: bL */
    private RecordInvoker.FaceResultCallback f191232bL;

    /* renamed from: bM */
    private C85346av.AbstractC85369n f191233bM;

    /* renamed from: bN */
    private boolean f191234bN;

    /* renamed from: bO */
    private boolean f191235bO;

    /* renamed from: bP */
    private boolean f191236bP;

    /* renamed from: bQ */
    private long f191237bQ;

    /* renamed from: bR */
    private boolean f191238bR;

    /* renamed from: bS */
    private boolean f191239bS;

    /* renamed from: bT */
    private boolean f191240bT;

    /* renamed from: bU */
    private boolean f191241bU;

    /* renamed from: bV */
    private AbstractC85340h f191242bV;

    /* renamed from: bW */
    private boolean f191243bW;

    /* renamed from: bX */
    private boolean f191244bX;

    /* renamed from: bY */
    private int f191245bY;

    /* renamed from: bZ */
    private C85521l f191246bZ;

    /* renamed from: bw */
    private boolean f191247bw;

    /* renamed from: bx */
    private final VESize f191248bx;

    /* renamed from: by */
    private final int f191249by = 1;

    /* renamed from: bz */
    private final int f191250bz = 2;

    /* renamed from: c */
    public C30031g f191251c;

    /* renamed from: ca */
    private C29983a.AbstractC29985b f191252ca;

    /* renamed from: d */
    public String f191253d;

    /* renamed from: e */
    public long f191254e;

    /* renamed from: f */
    public long f191255f;

    /* renamed from: g */
    public int f191256g;

    /* renamed from: h */
    public String f191257h;

    /* renamed from: i */
    public long f191258i = 0;

    /* renamed from: j */
    public AbstractC85381a f191259j;

    /* renamed from: k */
    public VESize f191260k = new VESize(0, 0);

    /* renamed from: l */
    public VESize f191261l;

    /* renamed from: m */
    public int f191262m;

    /* renamed from: n */
    public boolean f191263n;

    /* renamed from: p */
    public boolean f191264p;

    /* renamed from: q */
    public VESize f191265q;

    /* renamed from: r */
    public int f191266r;

    /* renamed from: s */
    public C85322ar f191267s;

    /* renamed from: t */
    public VEDisplaySettings f191268t;

    /* renamed from: u */
    public int f191269u;

    /* renamed from: v */
    public C85510h f191270v;

    /* renamed from: w */
    public C85297a<C85456b> f191271w;

    /* renamed from: x */
    public C85456b f191272x;

    /* renamed from: y */
    public List<C85346av.AbstractC85369n> f191273y;

    /* renamed from: z */
    public int f191274z;

    @Override // org.libsdl.app.AudioRecorderInterfaceExt
    public int initAudioConfig(int i, int i2, int i3, int i4, int i5) {
        return 0;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public void lackPermission() {
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt, com.p2082ss.android.medialib.p2154a.RunnableC29977a.AbstractC29978a
    public int onProcessData(byte[] bArr, int i, long j) {
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: q */
    public final int mo131066q() {
        return 0;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public void recordStatus(boolean z) {
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: c */
    public final AbstractC85401a mo131025c() {
        return this.f191216O;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: h */
    public final int mo131048h() {
        return this.f191269u;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130946a(AbstractC85381a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C85322ar arVar, String str, String str2, boolean z) {
        C85394bg.m146928a("TECameraVideoRecorder-init");
        this.f191259j = null;
        this.f191240bT = z;
        String str3 = f191200a;
        C85315al.m146639b(str3, "mIsARCoreSupported = " + this.f191240bT);
        this.f191513as = null;
        if (!(this.f191513as == null || this.f191513as.f190723x != VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME || this.f191513as.mo130183a() == VECameraSettings.CAMERA_TYPE.TYPE1)) {
            this.f191513as.f190723x = VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE;
        }
        this.f191257h = str + File.separator;
        this.f191514at = vEVideoEncodeSettings;
        this.f191515au = vEAudioEncodeSettings;
        this.f191267s = arVar;
        this.f191516av = str2;
        boolean booleanValue = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_refactor_audio", (Object) false)).booleanValue();
        boolean z2 = true;
        if (this.f191541bu) {
            booleanValue = true;
        }
        C85315al.m146637a(str3, "audio refactor: ".concat(String.valueOf(booleanValue)));
        this.f191206E = booleanValue;
        C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_enable_optimize_audio_delay");
        int intValue = (a == null || !(a.f191742b instanceof Integer)) ? 0 : ((Integer) a.f191742b).intValue();
        C85315al.m146637a(str3, "audio length opt: ".concat(String.valueOf(intValue)));
        if (intValue != 1) {
            z2 = false;
        }
        this.f191241bU = z2;
        if (this.f191541bu) {
            EnumC85339g.INSTANCE.setAudioEncodeSettings(this.f191515au);
            EnumC85339g.INSTANCE.setAudioBufferConsumer(this.f191251c);
        }
        this.f191463U = new C85519k();
        int B = m146949B();
        C85394bg.m146929b();
        this.f191511aq = -1;
        C30695h.m63062a(0, "te_titan_engine", 0L);
        return B;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130950a(AbstractC85556e eVar) {
        int i = this.f191269u;
        if (i == 0 || i == 1) {
            super.mo130950a(eVar);
            this.f191220b.clear();
            this.f191258i = 0;
            this.f191257h = eVar.mo56847a() + File.separator;
            if (this.f191269u != 1) {
                return 0;
            }
            mo131068r();
            int B = m146949B();
            if (B == 0) {
                return 0;
            }
            C85315al.m146642d(f191200a, "nativeInitBeautyPlay error: ".concat(String.valueOf(B)));
            return -108;
        }
        C85315al.m146642d(f191200a, "Invoking the wrong timing!");
        return -105;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final void mo131012b(int i) {
        this.f191251c.mo53333e(i, -1);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130969a(int i, int i2, int i3, int i4) {
        this.f191251c.mo53243a(i, i2, i3, i4);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int[] mo131002a(int i, int i2, int i3, int i4, float f) {
        int[] a = this.f191251c.mo53288a(i, i2, i3, i4, f);
        C85315al.m146637a(f191200a, "updateReactionRegion " + Arrays.toString(a));
        return a;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final boolean mo131020b(int i, int i2) {
        boolean f = this.f191251c.mo53339f(i, i2);
        C85315al.m146637a(f191200a, "posInReactionRegion ".concat(String.valueOf(f)));
        return f;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130964a(final double d) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8542018 */

            static {
                Covode.recordClassIndex(99541);
            }

            public final void run() {
                MethodCollector.m26663i(6239);
                synchronized (C85410d.this) {
                    try {
                        if (C85410d.this.f191269u == 3) {
                            C85315al.m146642d(C85410d.f191200a, "setVideoBgSpeed could not be executed in state: " + C85410d.this.f191269u);
                            return;
                        }
                        C85410d.this.f191251c.mo53235a(d);
                        MethodCollector.m26664o(6239);
                    } finally {
                        MethodCollector.m26664o(6239);
                    }
                }
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130994a(final String str, final String str2, final String str3) {
        C85315al.m146637a(f191200a, "setCustomVideoBg: videoPath = " + str2 + ", audioPath = " + str3 + ", mVERecordMode = " + this.f191520az);
        if (this.f191520az == EnumC85329au.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(str2)) {
            mo131017b(new Runnable() {
                /* class com.p2082ss.android.vesdk.C85410d.RunnableC8542925 */

                static {
                    Covode.recordClassIndex(99550);
                }

                public final void run() {
                    EnumC85329au auVar;
                    MethodCollector.m26663i(6085);
                    synchronized (C85410d.this) {
                        try {
                            C85315al.m146637a(C85410d.f191200a, "setCustomVideoBg: doing... ");
                            if (C85410d.this.f191269u == 3) {
                                C85315al.m146642d(C85410d.f191200a, "setCustomVideoBg could not be executed in recording mode: " + C85410d.this.f191269u);
                                return;
                            }
                            C85410d dVar = C85410d.this;
                            if (!TextUtils.isEmpty(str2)) {
                                auVar = EnumC85329au.CUSTOM_VIDEO_BG;
                            } else {
                                auVar = EnumC85329au.DEFAULT;
                            }
                            dVar.mo130943a(auVar);
                            C85410d.this.f191251c.mo53251a(C85410d.this.f191461S, str, str2, str3);
                            MethodCollector.m26664o(6085);
                        } finally {
                            MethodCollector.m26664o(6085);
                        }
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130991a(final String str, final String str2) {
        C85315al.m146637a(f191200a, "setCustomVideoBg, key = " + str + ", Gif path = " + str2);
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8543833 */

            static {
                Covode.recordClassIndex(99559);
            }

            public final void run() {
                EnumC85329au auVar;
                MethodCollector.m26663i(6078);
                synchronized (C85410d.this) {
                    try {
                        C85315al.m146637a(C85410d.f191200a, "setCustomVideoBg-gif: doing...");
                        if (C85410d.this.f191269u == 3) {
                            C85315al.m146642d(C85410d.f191200a, "setCustomVideoBg could not be executed in recording mode: " + C85410d.this.f191269u);
                            return;
                        }
                        C85410d dVar = C85410d.this;
                        if (!TextUtils.isEmpty(str2)) {
                            auVar = EnumC85329au.CUSTOM_VIDEO_BG_GIF;
                        } else {
                            auVar = EnumC85329au.DEFAULT;
                        }
                        dVar.mo130943a(auVar);
                        C85410d.this.f191251c.mo53272a(str, str2);
                        MethodCollector.m26664o(6078);
                    } finally {
                        MethodCollector.m26664o(6078);
                    }
                }
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130955a(final String str, final long j, final long j2, final int i) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8544842 */

            static {
                Covode.recordClassIndex(99569);
            }

            public final void run() {
                MethodCollector.m26663i(5926);
                synchronized (C85410d.this) {
                    try {
                        if (C85410d.this.f191269u == 3) {
                            C85315al.m146642d(C85410d.f191200a, "setRecordBGM could not be executed in state: " + C85410d.this.f191269u);
                        } else if (!C85410d.this.f191204C) {
                            C85315al.m146642d(C85410d.f191200a, "setRecordBGM could not be executed, after startPrePlay");
                            MethodCollector.m26664o(5926);
                        } else {
                            C85410d.super.mo130955a((C85410d) str, (String) j, j2, (long) i);
                            C30031g a = C85410d.this.f191251c.mo53233a(str);
                            boolean z = true;
                            if (C85410d.this.f191472aD != 1) {
                                z = false;
                            }
                            a.f71691d = z;
                            a.mo53232a(C85410d.this.f191470aB, C85410d.this.f191471aC, C85410d.this.f191258i);
                            C85410d dVar = C85410d.this;
                            dVar.mo131026c(dVar.mo131024c(false));
                            C85410d.this.f191251c.mo53296b(C85410d.this.f191461S, C85410d.this.mo131024c(false), C85410d.this);
                            C85410d.this.f191253d = str;
                            C85410d.this.f191254e = j;
                            C85410d.this.f191255f = j2;
                            C85410d.this.f191256g = i;
                            MethodCollector.m26664o(5926);
                        }
                    } finally {
                        MethodCollector.m26664o(5926);
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130995a(final List<C85390bd> list, String str, int i, final VEListener.AbstractC85241j jVar) {
        this.f191236bP = true;
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC854222 */

            static {
                Covode.recordClassIndex(99543);
            }

            public final void run() {
                C85410d.this.f191220b.clear();
                C85410d.this.f191220b.addAll(list);
                C85410d dVar = C85410d.this;
                dVar.f191258i = (long) C30018c.m60569a(dVar.f191220b);
                int a = C85410d.this.f191251c.mo53201a(list.size(), C85410d.this.f191257h);
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(a);
                }
            }
        });
        mo130955a(str, (long) i, this.f191471aC, 2);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130973a(final Surface surface, final VEListener.AbstractC85241j jVar) {
        C85394bg.m146928a("startPreviewAsync");
        this.f191236bP = true;
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC854343 */

            static {
                Covode.recordClassIndex(99555);
            }

            public final void run() {
                int b = C85410d.this.mo131005b(surface);
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(b);
                }
            }
        });
        this.f191251c.mo53356k(false);
        if (this.f191259j != null) {
            VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.EnumC85266b.PRIVACY_STATUS_USING);
            this.f191259j.mo130846a();
        }
        C85394bg.m146929b();
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130977a(final VEListener.AbstractC85241j jVar) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC854454 */

            static {
                Covode.recordClassIndex(99566);
            }

            public final void run() {
                C85410d.this.f191251c.mo53367p();
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(0);
                }
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130978a(final VEListener.AbstractC85241j jVar, boolean z) {
        final boolean z2;
        String str = f191200a;
        C85315al.m146637a(str, "stopPreviewAsync: listener".concat(String.valueOf(jVar)));
        double currentTimeMillis = (double) System.currentTimeMillis();
        mo130994a((String) null, (String) null, (String) null);
        m146960r(z);
        C85322ar arVar = this.f191267s;
        if (arVar == null || !arVar.f191000l) {
            z2 = false;
        } else {
            z2 = true;
            this.f191203B.close();
        }
        final boolean z3 = this.f191239bS;
        C85315al.m146637a(str, "stop preview async opt = ".concat(String.valueOf(z3)));
        if (z3 && z2 && this.f191251c.mo53189D() != 0) {
            this.f191203B.open();
        }
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC854505 */

            static {
                Covode.recordClassIndex(99571);
            }

            public final void run() {
                C85410d.this.mo131069s();
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(0);
                }
                if (!z3 && z2) {
                    C85410d.this.f191203B.open();
                }
            }
        });
        if (z2) {
            this.f191203B.block(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
        double currentTimeMillis2 = (double) System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("stopPreviewAsync cost ");
        Double.isNaN(currentTimeMillis2);
        Double.isNaN(currentTimeMillis);
        C85315al.m146637a(str, sb.append(currentTimeMillis2 - currentTimeMillis).append("ms").toString());
        C85315al.m146637a(str, "add log for TC");
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130941a(Surface surface) {
        int a = this.f191251c.mo53208a(surface);
        this.f191251c.mo53365o();
        return a;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130967a(final float f, final VEListener.AbstractC85241j jVar) {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_USING);
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC854527 */

            static {
                Covode.recordClassIndex(99573);
            }

            public final void run() {
                int a = C85410d.this.mo130929a(f);
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(a);
                }
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final void mo131014b(final VEListener.AbstractC85241j jVar) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC854538 */

            static {
                Covode.recordClassIndex(99574);
            }

            public final void run() {
                int k = C85410d.this.mo131054k();
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(k);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130957a(boolean z, String str) {
        this.f191489aU = z;
        this.f191491aW = str;
        return this.f191251c.mo53222a(z, str);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130993a(String str, String str2, int i, String str3, String str4, VEListener.AbstractC85241j jVar) {
        mo131017b(new Runnable(jVar, str, str2, 0, str3, str4, -1) {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8541412 */

            /* renamed from: a */
            final /* synthetic */ VEListener.AbstractC85241j f191278a;

            /* renamed from: b */
            final /* synthetic */ String f191279b;

            /* renamed from: c */
            final /* synthetic */ String f191280c;

            /* renamed from: d */
            final /* synthetic */ int f191281d;

            /* renamed from: e */
            final /* synthetic */ String f191282e;

            /* renamed from: f */
            final /* synthetic */ String f191283f;

            /* renamed from: g */
            final /* synthetic */ int f191284g = -1;

            static {
                Covode.recordClassIndex(99535);
            }

            public final void run() {
                if (C85410d.this.f191269u == 3 || C85410d.this.f191269u == 0) {
                    VEListener.AbstractC85241j jVar = this.f191278a;
                    if (jVar != null) {
                        jVar.mo56563a(-105);
                        return;
                    }
                    return;
                }
                int a = C85410d.this.f191251c.mo53218a(this.f191279b, this.f191280c, this.f191281d, this.f191282e, this.f191283f, C85410d.this.f191514at.isOptRemuxWithCopy(), this.f191284g);
                VEListener.AbstractC85241j jVar2 = this.f191278a;
                if (jVar2 != null) {
                    jVar2.mo56563a(a);
                }
            }

            {
                this.f191278a = r3;
                this.f191279b = r4;
                this.f191280c = r5;
                this.f191281d = r6;
                this.f191282e = r7;
                this.f191283f = r8;
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130998a(final boolean z, final PrivacyCert privacyCert) {
        int iDWithName = VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC);
        if (z) {
            VESensService.getInstance().setSensCheckObjExpectStatus(iDWithName, VESensService.EnumC85266b.PRIVACY_STATUS_USING);
        } else {
            VESensService.getInstance().setSensCheckObjExpectStatus(iDWithName, VESensService.EnumC85266b.PRIVACY_STATUS_RELEASE);
        }
        if (this.f191206E && !this.f191541bu) {
            if (z) {
                mo131063o(m146955H());
                mo131037d("enableAudioRecorder");
            } else {
                C85315al.m146639b(f191200a, "mVEAudioCapture release: enableAudioRecorder");
                this.f191463U.release(privacyCert);
                this.f191213L = 0;
            }
        }
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8541513 */

            static {
                Covode.recordClassIndex(99536);
            }

            public final void run() {
                if (!C85410d.this.f191206E && C85410d.this.mo131074x()) {
                    if (z) {
                        C85410d.this.mo131063o(true);
                        C85410d.this.mo131037d("enableAudioRecorder");
                    } else {
                        C85315al.m146639b(C85410d.f191200a, "mVEAudioCapture release: enableAudioRecorder");
                        C85410d.this.f191463U.release(privacyCert);
                        C85410d.this.f191213L = 0;
                    }
                }
                C85410d.this.f191251c.mo53362m(z);
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130975a(final PrivacyCert privacyCert) {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_USING);
        String str = f191200a;
        C85315al.m146639b(str, "mVEAudioCapture startAudioRecorder");
        if (!this.f191206E) {
            mo131017b(new Runnable() {
                /* class com.p2082ss.android.vesdk.C85410d.RunnableC8541614 */

                static {
                    Covode.recordClassIndex(99537);
                }

                public final void run() {
                    if (C85410d.this.mo131074x()) {
                        C85410d.this.mo131037d("startAudioRecorder not refactor");
                        C85315al.m146639b(C85410d.f191200a, "mVEAudioCapture start: startAudioRecorder");
                        C85410d.this.f191210I = privacyCert;
                        C85410d.this.f191463U.start(privacyCert);
                    }
                    C30031g gVar = C85410d.this.f191251c;
                    if ((!gVar.f71699l || gVar.f71698k) && !gVar.f71692e) {
                        if (gVar.f71689b == null) {
                            gVar.f71689b = new BufferedAudioRecorder(gVar, gVar.f71702o, gVar.f71703p, gVar.f71704q, gVar.f71708u);
                            gVar.f71689b.init(C30031g.m60581y());
                        }
                        gVar.f71706s = true;
                        gVar.f71689b.startRecording(1.0d, false);
                    }
                }
            });
        } else if (!this.f191541bu) {
            C30031g gVar = this.f191251c;
            if (!gVar.f71699l || gVar.f71698k) {
                mo131037d("startAudioRecorder");
                C85315al.m146639b(str, "mVEAudioCapture start: startAudioRecorder");
                this.f191210I = privacyCert;
                this.f191463U.start(privacyCert);
                return;
            }
            C85315al.m146639b(str, "mVEAudioCapture audioNeedStart: false");
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final void mo131013b(final PrivacyCert privacyCert) {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_RELEASE);
        String str = f191200a;
        C85315al.m146639b(str, "mVEAudioCapture stopAudioRecorder");
        if (!this.f191206E) {
            mo131017b(new Runnable() {
                /* class com.p2082ss.android.vesdk.C85410d.RunnableC8541715 */

                static {
                    Covode.recordClassIndex(99538);
                }

                public final void run() {
                    if (C85410d.this.mo131074x()) {
                        C85315al.m146639b(C85410d.f191200a, "mVEAudioCapture stop: stopAudioRecorder not refactor");
                        C85410d.this.f191463U.stop(privacyCert);
                        C85410d.this.f191210I = null;
                        return;
                    }
                    C85410d.this.f191251c.mo53372r();
                }
            });
        } else if (!this.f191541bu) {
            C85315al.m146639b(str, "mVEAudioCapture stop: stopAudioRecorder");
            this.f191463U.stop(privacyCert);
            this.f191210I = null;
        }
    }

    /* renamed from: a */
    public final int mo130943a(EnumC85329au auVar) {
        this.f191520az = auVar;
        return this.f191251c.mo53345h(auVar.ordinal());
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130996a(final boolean z) {
        this.f191224bD = z;
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8541816 */

            static {
                Covode.recordClassIndex(99539);
            }

            public final void run() {
                C85410d.this.f191251c.mo53241a(z ? 1 : 0);
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final void mo131019b(final boolean z) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8541917 */

            static {
                Covode.recordClassIndex(99540);
            }

            public final void run() {
                C85410d.this.f191251c.mo53301b(z ? 1 : 0);
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130982a(C85346av.AbstractC85363i iVar) {
        super.mo130982a(iVar);
        if (iVar == null) {
            this.f191251c.mo53384w();
            return;
        }
        iVar.mo130838a();
        this.f191251c.mo53265a(this, iVar.mo130838a().f191095b.ordinal());
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130989a(AbstractC85541q qVar) {
        boolean z;
        this.f191221bA = qVar;
        if (qVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.f191251c.mo53350i(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130979a(VEVolumeParam vEVolumeParam) {
        if (vEVolumeParam.f190875b > -1.0f) {
            this.f191251c.mo53229a(vEVolumeParam.f190875b, vEVolumeParam.f190874a);
        }
        this.f191251c.f71700m = vEVolumeParam.f190876c;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130937a(int i, VETrackParams vETrackParams) {
        C85315al.m146641c(f191200a, "addTrack trimIn " + vETrackParams.f73347b.get(0) + " trimOut " + vETrackParams.f73348c.get(0));
        if (m146955H()) {
            return this.f191251c.mo53203a(i, vETrackParams.f73346a.get(0), (long) vETrackParams.f73347b.get(0).intValue(), (long) vETrackParams.f73348c.get(0).intValue());
        }
        return m146957a(vETrackParams.f73346a.get(0), (long) vETrackParams.f73347b.get(0).intValue(), (long) vETrackParams.f73348c.get(0).intValue());
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130936a(int i, int i2, boolean z) {
        mo131017b(new RunnableC85461e(this, i, i2, z));
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130949a(final VEPrePlayParams vEPrePlayParams) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8542119 */

            static {
                Covode.recordClassIndex(99542);
            }

            public final void run() {
                if (C85410d.this.f191269u != 2) {
                    C85315al.m146642d(C85410d.f191200a, "startPrePlay in state:" + C85410d.this.f191269u);
                    return;
                }
                C85410d dVar = C85410d.this;
                dVar.mo131026c(dVar.mo131024c(true));
                C85410d.this.f191251c.mo53296b(C85410d.this.f191461S, C85410d.this.mo131024c(true), C85410d.this);
                C85410d.this.f191204C = false;
                C85410d.this.f191251c.mo53221a(vEPrePlayParams.f191588b, vEPrePlayParams.f191587a, false);
            }
        });
        return 0;
    }

    /* renamed from: b */
    public final void mo131017b(Runnable runnable) {
        if (this.f191238bR) {
            C85315al.m146642d(f191200a, "Recorder is destroyed, ignore subsequent tasks");
        } else if (!this.f191236bP) {
            runnable.run();
        } else if (this.f191230bJ.isShutdown()) {
            C85315al.m146642d(f191200a, "executeSafeSubmit EXECUTOR isShutdown");
            runnable.run();
        } else {
            try {
                this.f191230bJ.submit(runnable);
            } catch (RejectedExecutionException e) {
                e.printStackTrace();
                C85315al.m146642d(f191200a, "RejectedExecutionException happened to executeSafeSubmit: " + e.getMessage());
                runnable.run();
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final VEFrame mo130963a(C85346av.C85357c cVar) {
        ImageFrame f;
        if (cVar.f191092a != 1 || (f = this.f191251c.mo53336f(cVar.f191093b)) == null) {
            return null;
        }
        return VEFrame.createByteBufferFrame(f.byteBuffer, f.width, f.height, f.rotate, 0, VEFrame.EnumC30668a.values()[f.format]);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130971a(long j) {
        this.f191251c.mo53294b(j);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130987a(AbstractC85382b bVar) {
        if (bVar != null) {
            VESize f = bVar.mo130852f();
            C85456b bVar2 = null;
            Iterator<C85456b> it = this.f191271w.mo130623c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C85456b next = it.next();
                if (next.f191387f) {
                    bVar2 = next;
                    break;
                }
            }
            if (!(f == null || bVar2 == null || bVar2.f191385d == null)) {
                bVar2.f191385d.f73616a = f.width;
                bVar2.f191385d.f73617b = f.height;
            }
            bVar.mo130851a(this.f191271w);
        }
    }

    @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
    /* renamed from: a */
    public final void mo52865a(int i) {
        C30695h.m63062a(0, "te_record_preview_init_time", System.currentTimeMillis() - this.f191237bQ);
        if (!(this.f191520az != EnumC85329au.REACTION || this.f191519ay == null || this.f191519ay.f191023b == null || this.f191519ay.f191022a == null)) {
            int i2 = this.f191514at.getVideoRes().width;
            int i3 = this.f191514at.getVideoRes().height;
            float[] fArr = this.f191519ay.f191024c;
            float f = (float) i3;
            float f2 = (float) i2;
            this.f191251c.mo53243a((int) (fArr[0] * f), (int) (fArr[1] * f), (int) (fArr[2] * f2), (int) (fArr[3] * f2));
            this.f191251c.mo53333e(2, 0);
            float[] fArr2 = this.f191519ay.f191025d;
            this.f191251c.mo53328d((int) (fArr2[2] * f2), (int) (fArr2[3] * f));
        }
        if (i == 0) {
            C85322ar arVar = this.f191267s;
            if (((Boolean) C85568t.m147473a().mo131557a("ve_disable_effect_internal_setting", (Object) false)).booleanValue()) {
                arVar.f190998j = true;
            }
            if (!arVar.f190998j) {
                mo130938a(this.f191476aH.f73357a, this.f191476aH.f73358b);
                mo130930a(this.f191476aH.f73359c, this.f191476aH.f73360d);
                if (this.f191478aJ.f73372g) {
                    if (!TextUtils.isEmpty(this.f191478aJ.f73366a) && !TextUtils.isEmpty(this.f191478aJ.f73367b)) {
                        mo130992a(this.f191478aJ.f73366a, this.f191478aJ.f73367b, this.f191478aJ.f73368c, this.f191478aJ.f73369d, this.f191478aJ.f73370e);
                    } else if (!TextUtils.isEmpty(this.f191478aJ.f73366a)) {
                        this.f191251c.mo53271a(this.f191478aJ.f73366a, this.f191478aJ.f73369d);
                    }
                } else if (!TextUtils.isEmpty(this.f191478aJ.f73366a) && !TextUtils.isEmpty(this.f191478aJ.f73367b)) {
                    String str = this.f191478aJ.f73366a;
                    String str2 = this.f191478aJ.f73367b;
                    float f3 = this.f191478aJ.f73368c;
                    this.f191478aJ.f73366a = str;
                    this.f191478aJ.f73367b = str2;
                    this.f191478aJ.f73368c = f3;
                    this.f191478aJ.f73371f = true;
                    this.f191251c.mo53273a(C85578b.m147483a(str), C85578b.m147483a(str2), f3);
                } else if (!TextUtils.isEmpty(this.f191478aJ.f73366a)) {
                    this.f191251c.mo53306b(this.f191478aJ.f73366a);
                    if (!this.f191478aJ.f73371f) {
                        this.f191251c.mo53321d(this.f191478aJ.f73369d);
                    }
                }
                mo130952a(this.f191479aK.f73373a, this.f191479aK.f73374b, this.f191479aK.f73375c);
                String str3 = this.f191479aK.f73373a;
                Map<Integer, Float> map = this.f191479aK.f73376d;
                this.f191479aK.f73373a = str3;
                C30676d dVar = this.f191479aK;
                if (dVar.f73376d == null) {
                    dVar.f73376d = map;
                } else {
                    dVar.f73376d.putAll(map);
                }
                this.f191251c.mo53276a(str3, map);
                mo131009b(this.f191480aL.f73361a, this.f191480aL.f73362b, this.f191480aL.f73363c);
                if (!TextUtils.isEmpty(this.f191480aL.f73361a)) {
                    mo130932a(19, this.f191480aL.f73364d);
                    mo130932a(20, this.f191480aL.f73365e);
                }
                mo131332b(this.f191477aI);
            }
            if (this.f191502ah == null) {
                this.f191251c.mo53384w();
            } else {
                this.f191251c.mo53265a(this, this.f191502ah.mo130838a().f191095b.ordinal());
            }
        } else {
            C85315al.m146642d(f191200a, "Create native GL env failed");
        }
        if (this.f191465W != null) {
            this.f191465W.mo56558a(i);
            if (this.f191465W instanceof VEListener.AbstractC85229ah) {
                ((VEListener.AbstractC85229ah) this.f191465W).mo56559a(1002, i, "Init onNativeInitCallBack");
            }
        }
        C30695h.m63062a(0, "te_record_preview_init_ret", (long) i);
    }

    @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
    /* renamed from: a */
    public final void mo52866a(int i, int i2) {
        if (this.f191465W != null) {
            boolean z = i == 0;
            this.f191465W.mo56561a(z);
            if (this.f191465W instanceof VEListener.AbstractC85229ah) {
                ((VEListener.AbstractC85229ah) this.f191465W).mo56559a(1003, z ? 1 : -1, "Init HardEncode");
            }
        }
        if (this.f191514at.isSupportHwEnc()) {
            C30695h.m63062a(0, "te_record_hard_encode_init_ret", i == 1 ? -1 : 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo130968a(int i, int i2, float f, String str) {
        AbstractC85541q qVar = this.f191221bA;
        if (qVar != null) {
            qVar.onCallback(i, i2, f, str);
        }
    }

    @Override // com.p2082ss.android.medialib.presenter.C30031g.AbstractC30045c
    /* renamed from: a */
    public final void mo53393a(C30016a aVar) {
        C85346av.AbstractC85363i iVar = this.f191502ah;
        if (iVar != null) {
            VEFrame vEFrame = null;
            if (aVar.f71635c == VEFrame.EnumC30668a.TEPixFmt_OpenGL_RGBA8.ordinal()) {
                vEFrame = VEFrame.createTextureFrame(aVar.f71633a, aVar.f71634b, aVar.f71636d, aVar.f71637e, 0, aVar.f71638f, VEFrame.EnumC30668a.TEPixFmt_OpenGL_RGBA8);
            } else {
                if (aVar.f71635c == VEFrame.EnumC30668a.TEPixFmt_YUV420P.ordinal()) {
                    vEFrame = VEFrame.createByteBufferFrame(aVar.f71640h, aVar.f71636d, aVar.f71637e, 0, aVar.f71638f, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
                }
                int i = Build.VERSION.SDK_INT;
                iVar.mo130839a(vEFrame);
            }
            if (vEFrame != null) {
                vEFrame.setFromFrontCamera(aVar.f71641i);
            }
            int i2 = Build.VERSION.SDK_INT;
            iVar.mo130839a(vEFrame);
        }
    }

    @Override // com.p2082ss.android.medialib.presenter.C30031g.AbstractC30045c
    /* renamed from: b */
    public final boolean mo53394b() {
        C85346av.AbstractC85363i iVar = this.f191502ah;
        if (iVar == null) {
            return false;
        }
        iVar.mo130838a();
        return iVar.mo130838a().f191094a;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130951a(String str, float f) {
        this.f191478aJ.f73366a = str;
        this.f191478aJ.f73367b = str;
        this.f191478aJ.f73369d = f;
        this.f191478aJ.f73370e = f;
        this.f191478aJ.f73371f = false;
        this.f191478aJ.f73368c = 1.0f;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f191251c.mo53271a(str, f);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130992a(String str, String str2, float f, float f2, float f3) {
        this.f191478aJ.f73366a = str;
        this.f191478aJ.f73367b = str2;
        this.f191478aJ.f73368c = f;
        this.f191478aJ.f73369d = f2;
        this.f191478aJ.f73370e = f3;
        this.f191478aJ.f73371f = true;
        this.f191478aJ.f73372g = true;
        this.f191251c.mo53274a(C85578b.m147483a(str), C85578b.m147483a(str2), f, f2, f3);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130938a(int i, String str) {
        this.f191476aH.f73357a = i;
        this.f191476aH.f73358b = str;
        this.f191251c.mo53303b(i, str);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130952a(String str, float f, float f2) {
        this.f191479aK.f73373a = str;
        this.f191479aK.f73374b = f;
        this.f191479aK.f73375c = f2;
        this.f191251c.mo53216a(C85578b.m147483a(str), f, f2);
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130948a(VEEffectFilterParam vEEffectFilterParam) {
        if (vEEffectFilterParam == null) {
            return -100;
        }
        this.f191477aI = vEEffectFilterParam;
        this.f191251c.mo53202a(vEEffectFilterParam.effectFilterType.ordinal(), vEEffectFilterParam.effectPath, vEEffectFilterParam.stickerId, vEEffectFilterParam.reqId, vEEffectFilterParam.stickerTag, vEEffectFilterParam.composerTags, vEEffectFilterParam.composerValues, vEEffectFilterParam.needReload, vEEffectFilterParam.isSyncLoadResource);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130984a(C85346av.AbstractC85369n nVar) {
        super.mo130984a(nVar);
        if (this.f191273y == null) {
            this.f191273y = new CopyOnWriteArrayList();
        }
        this.f191273y.add(nVar);
        if (this.f191232bL == null) {
            this.f191232bL = new RecordInvoker.FaceResultCallback() {
                /* class com.p2082ss.android.vesdk.C85410d.C8542723 */

                static {
                    Covode.recordClassIndex(99548);
                }

                @Override // com.p2082ss.android.medialib.RecordInvoker.FaceResultCallback
                public final void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo) {
                    C85471b bVar;
                    for (C85346av.AbstractC85369n nVar : C85410d.this.f191273y) {
                        C85474d dVar = null;
                        int i = 0;
                        if (faceAttributeInfo == null) {
                            bVar = null;
                        } else {
                            bVar = new C85471b();
                            FaceAttribute[] info = faceAttributeInfo.getInfo();
                            if (info == null) {
                                bVar.f191426a = new C85470a[0];
                            } else {
                                C85470a[] aVarArr = new C85470a[info.length];
                                bVar.f191426a = aVarArr;
                                int length = info.length;
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < length) {
                                    FaceAttribute faceAttribute = info[i2];
                                    C85470a aVar = new C85470a();
                                    int i4 = i3 + 1;
                                    aVarArr[i3] = aVar;
                                    if (faceAttribute != null) {
                                        aVar.f191405a = faceAttribute.getAge();
                                        aVar.f191416l = faceAttribute.getAngryScore();
                                        aVar.f191413i = faceAttribute.getArousal();
                                        aVar.f191416l = faceAttribute.getAngryScore();
                                        aVar.f191407c = faceAttribute.getAttractive();
                                        aVar.f191424t = faceAttribute.getBlurScore();
                                        aVar.f191406b = faceAttribute.getBoyProb();
                                        aVar.f191410f = faceAttribute.getExpProbs();
                                        aVar.f191409e = faceAttribute.getExpType();
                                        aVar.f191408d = faceAttribute.getHappyScore();
                                        aVar.f191425u = faceAttribute.getIllumination();
                                        aVar.f191421q = faceAttribute.getLipstickProb();
                                        aVar.f191418n = faceAttribute.getMaskProb();
                                        aVar.f191420p = faceAttribute.getMustacheProb();
                                        aVar.f191412h = faceAttribute.getQuality();
                                        aVar.f191411g = faceAttribute.getRealFaceProb();
                                        aVar.f191415k = faceAttribute.getSadScore();
                                        aVar.f191417m = faceAttribute.getSurpriseScore();
                                        aVar.f191414j = faceAttribute.getValence();
                                        aVar.f191422r = faceAttribute.getWearGlassProb();
                                        aVar.f191419o = faceAttribute.getWearHatProb();
                                        aVar.f191423s = faceAttribute.getWearSunglassProb();
                                    }
                                    i2++;
                                    i3 = i4;
                                }
                            }
                        }
                        if (!(faceDetectInfo == null || faceDetectInfo.getInfo() == null)) {
                            dVar = new C85474d();
                            C85472c[] cVarArr = new C85472c[faceDetectInfo.getInfo().length];
                            FaceDetect[] info2 = faceDetectInfo.getInfo();
                            int length2 = info2.length;
                            int i5 = 0;
                            while (i < length2) {
                                FaceDetect faceDetect = info2[i];
                                C85472c cVar = new C85472c();
                                cVar.f191427a = faceDetect.getRect();
                                cVar.f191429c = faceDetect.getPoints();
                                cVar.f191436j = faceDetect.getAction();
                                cVar.f191434h = faceDetect.getEyeDistance();
                                if (faceDetect.getFaceExtInfo() != null) {
                                    C85472c.C85473a aVar2 = new C85472c.C85473a();
                                    aVar2.f191440b = faceDetect.getFaceExtInfo().eyebrowCount;
                                    aVar2.f191445g = faceDetect.getFaceExtInfo().eyeBrowLeftPoints;
                                    aVar2.f191446h = faceDetect.getFaceExtInfo().eyeBrowRightPoints;
                                    aVar2.f191439a = faceDetect.getFaceExtInfo().eyeCount;
                                    aVar2.f191443e = faceDetect.getFaceExtInfo().eyeLeftPoints;
                                    aVar2.f191444f = faceDetect.getFaceExtInfo().eyeRightPoints;
                                    aVar2.f191441c = faceDetect.getFaceExtInfo().lipCount;
                                    aVar2.f191447i = faceDetect.getFaceExtInfo().irisLeftPoints;
                                    aVar2.f191448j = faceDetect.getFaceExtInfo().irisRightPoints;
                                    aVar2.f191442d = faceDetect.getFaceExtInfo().irisCount;
                                    cVar.f191438l = aVar2;
                                }
                                cVar.f191435i = faceDetect.getFaceID();
                                cVar.f191432f = faceDetect.getPitch();
                                cVar.f191430d = faceDetect.getPointVisibility();
                                cVar.f191433g = faceDetect.getRoll();
                                cVar.f191431e = faceDetect.getYaw();
                                cVar.f191428b = faceDetect.getScore();
                                cVar.f191437k = faceDetect.getTrackCount();
                                cVarArr[i5] = cVar;
                                i++;
                                i5++;
                            }
                            dVar.f191449a = cVarArr;
                        }
                        nVar.mo56829a(bVar, dVar);
                    }
                }
            };
        }
        this.f191251c.mo53255a(this.f191232bL);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final void mo131016b(C85346av.AbstractC85369n nVar) {
        super.mo131016b(nVar);
        List<C85346av.AbstractC85369n> list = this.f191273y;
        if (list != null) {
            for (C85346av.AbstractC85369n nVar2 : list) {
                if (nVar2.equals(nVar)) {
                    this.f191273y.remove(nVar2);
                }
            }
            if (this.f191273y.isEmpty()) {
                this.f191251c.mo53377t();
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130985a(final C85346av.AbstractC85371p pVar) {
        super.mo130985a(pVar);
        this.f191251c.mo53257a((RecordInvoker.OnPreviewRadioListener) new RecordInvoker.OnPreviewRadioListener() {
            /* class com.p2082ss.android.vesdk.C85410d.C8542824 */

            static {
                Covode.recordClassIndex(99549);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnPreviewRadioListener
            public final void onInfo(int i, int i2) {
                EnumC85321aq.values();
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130986a(final C85346av.AbstractC85374s sVar) {
        super.mo130986a(sVar);
        this.f191251c.mo53259a((RecordInvoker.OnSkeletonDetectCallback) new RecordInvoker.OnSkeletonDetectCallback() {
            /* class com.p2082ss.android.vesdk.C85410d.C8543026 */

            static {
                Covode.recordClassIndex(99551);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnSkeletonDetectCallback
            public final void onResult(SkeletonInfo skeletonInfo) {
                C85475e eVar;
                C85346av.AbstractC85374s sVar = sVar;
                if (skeletonInfo == null) {
                    eVar = null;
                } else {
                    eVar = new C85475e();
                    VESkeleton[] vESkeletonArr = new VESkeleton[skeletonInfo.getInfo().length];
                    Skeleton[] info = skeletonInfo.getInfo();
                    int length = info.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        Skeleton skeleton = info[i];
                        VESkeleton vESkeleton = new VESkeleton();
                        vESkeleton.setID(skeleton.getID());
                        vESkeleton.setRect(skeleton.getRect());
                        vESkeleton.setPoints(skeleton.getPoints());
                        vESkeletonArr[i2] = vESkeleton;
                        i++;
                        i2++;
                    }
                    eVar.f191450a = vESkeletonArr;
                }
                sVar.mo56831a(eVar);
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130983a(final C85346av.AbstractC85367l lVar) {
        super.mo130983a(lVar);
        this.f191251c.mo53256a((RecordInvoker.OnCherEffectParmaCallback) new RecordInvoker.OnCherEffectParmaCallback() {
            /* class com.p2082ss.android.vesdk.C85410d.C8543127 */

            static {
                Covode.recordClassIndex(99552);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnCherEffectParmaCallback
            public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
                lVar.mo56830a(strArr, dArr, zArr);
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130976a(VECherEffectParam vECherEffectParam) {
        this.f191251c.mo53285a(vECherEffectParam.getMatrix(), vECherEffectParam.getDuration(), vECherEffectParam.getSegUseCher());
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130970a(int i, long j, long j2, String str) {
        this.f191251c.mo53244a(i, j, j2, str);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130974a(MessageCenter.Listener listener) {
        this.f191251c.mo53254a(listener);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130981a(final C85346av.AbstractC85356b bVar, int i) {
        super.mo130981a(bVar, i);
        this.f191251c.mo53261a((AbstractC30011a) new AbstractC30011a() {
            /* class com.p2082ss.android.vesdk.C85410d.C8543228 */

            static {
                Covode.recordClassIndex(99553);
            }

            @Override // com.p2082ss.android.medialib.listener.AbstractC30011a
            /* renamed from: a */
            public final void mo52864a(int i, int i2) {
                C85346av.AbstractC85356b bVar = bVar;
                if (bVar != null) {
                    bVar.mo116956a(i2);
                }
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130999a(float[] fArr) {
        this.f191251c.mo53282a(fArr);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo131000a(float[] fArr, double d) {
        this.f191251c.mo53283a(fArr, d);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130965a(float f, float f2, float f3) {
        this.f191251c.mo53238a(f, f2, f3);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130958a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f191251c.mo53223a(z, z2, z3, z4);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130959a(double[] dArr, double d) {
        return this.f191251c.mo53226a(dArr, d);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130954a(String str, int i, int i2, String str2) {
        return this.f191251c.mo53217a(str, i, i2, str2);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130945a(final C85346av.AbstractC85362h hVar) {
        return this.f191251c.mo53212a((RecordInvoker.OnARTextCountCallback) new RecordInvoker.OnARTextCountCallback() {
            /* class com.p2082ss.android.vesdk.C85410d.C8543329 */

            static {
                Covode.recordClassIndex(99554);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnARTextCountCallback
            public final void onResult(int i) {
                C85346av.AbstractC85362h hVar = hVar;
                if (hVar != null) {
                    hVar.mo56832a(i);
                }
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130944a(final C85346av.AbstractC85361g gVar) {
        this.f191251c.mo53210a((RecordInvoker.OnARTextBitmapCallback) new RecordInvoker.OnARTextBitmapCallback() {
            /* class com.p2082ss.android.vesdk.C85410d.C8543631 */

            static {
                Covode.recordClassIndex(99557);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnARTextBitmapCallback
            public final BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
                C85346av.AbstractC85361g gVar = gVar;
                if (gVar != null) {
                    return gVar.mo56094a(str, befTextLayout);
                }
                return null;
            }
        });
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130940a(Bitmap bitmap) {
        return this.f191251c.mo53207a(bitmap);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130980a(AbstractC85313aj ajVar) {
        this.f191251c.mo53268a(ajVar);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final void mo131015b(AbstractC85313aj ajVar) {
        this.f191251c.mo53305b(ajVar);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final void mo131018b(String str, String str2) {
        this.f191251c.mo53307b(str, str2);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130935a(int i, int i2, C85346av.AbstractC85358d dVar) {
        C8543934 r4 = new C30031g.AbstractC30046d(System.currentTimeMillis(), false, dVar) {
            /* class com.p2082ss.android.vesdk.C85410d.C8543934 */

            /* renamed from: a */
            final /* synthetic */ long f191338a;

            /* renamed from: b */
            final /* synthetic */ boolean f191339b = false;

            /* renamed from: c */
            final /* synthetic */ C85346av.AbstractC85358d f191340c;

            static {
                Covode.recordClassIndex(99560);
            }

            @Override // com.p2082ss.android.medialib.presenter.C30031g.AbstractC30046d
            /* renamed from: a */
            public final void mo53395a(Bitmap bitmap, int i) {
                C30695h.m63062a(0, "te_record_shot_screen_time", System.currentTimeMillis() - this.f191338a);
                if ((i != 0 || this.f191339b) && C85410d.this.f191259j != null) {
                    C85410d.this.f191259j.mo130848b();
                }
                C85410d.this.mo130972a(bitmap, "TECam_shotScreen_0");
                C85346av.AbstractC85358d dVar = this.f191340c;
                if (dVar != null) {
                    dVar.mo115054a(bitmap, i);
                }
            }

            {
                this.f191338a = r3;
                this.f191340c = r6;
            }
        };
        return this.f191251c.mo53227a(new int[]{i, i2}, true, (C30031g.AbstractC30046d) r4, false);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130947a(final C85388bc bcVar) {
        if (!this.f191207F) {
            C85315al.m146641c(f191200a, "mHasFirstFrameCaptured is false");
            if (bcVar.f191144k != null) {
                bcVar.f191144k.mo56638a(-100002);
            }
            return -100002;
        }
        VESize vESize = bcVar.f191134a;
        if (vESize == null) {
            C85315al.m146641c(f191200a, "size is null, can not shotscreen");
            return -100;
        } else if (bcVar.f191145l != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            C8544035 r13 = new C30031g.AbstractC30046d() {
                /* class com.p2082ss.android.vesdk.C85410d.C8544035 */

                static {
                    Covode.recordClassIndex(99561);
                }

                @Override // com.p2082ss.android.medialib.presenter.C30031g.AbstractC30046d
                /* renamed from: a */
                public final void mo53395a(Bitmap bitmap, int i) {
                    C30695h.m63062a(0, "te_record_shot_screen_time", System.currentTimeMillis() - currentTimeMillis);
                    if ((i != 0 || bcVar.f191137d) && C85410d.this.f191259j != null) {
                        C85410d.this.f191259j.mo130848b();
                    }
                    C85410d.this.mo130972a(bitmap, "TECam_shotScreen_2");
                    bcVar.f191145l.mo115054a(bitmap, i);
                }
            };
            if (bcVar.f191146m != null) {
                C8544136 r15 = null;
                if (bcVar.f191135b && bcVar.f191139f) {
                    r15 = new C30031g.AbstractC30047e() {
                        /* class com.p2082ss.android.vesdk.C85410d.C8544136 */

                        static {
                            Covode.recordClassIndex(99562);
                        }

                        @Override // com.p2082ss.android.medialib.presenter.C30031g.AbstractC30047e
                        /* renamed from: a */
                        public final void mo53396a(int[] iArr, int i, int i2) {
                            VEFrame.createIntArrayFrame(iArr, i, i2, 0, 0, VEFrame.EnumC30668a.TEPixFmt_ARGB8);
                        }
                    };
                }
                return this.f191251c.mo53224a(this.f191267s.f191011w, new int[]{vESize.width, vESize.height}, bcVar.f191135b, r13, bcVar.f191135b && bcVar.f191139f, r15, bcVar.f191143j);
            }
            return this.f191251c.mo53227a(new int[]{vESize.width, vESize.height}, bcVar.f191135b, r13, bcVar.f191142i);
        } else if (bcVar.f191136c == null) {
            return 0;
        } else {
            return this.f191251c.mo53219a(bcVar.f191136c, new int[]{vESize.width, vESize.height}, bcVar.f191135b, bcVar.f191138e, new C29983a.AbstractC29986c() {
                /* class com.p2082ss.android.vesdk.C85410d.C8544237 */

                static {
                    Covode.recordClassIndex(99563);
                }

                @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29986c
                /* renamed from: a */
                public final void mo52800a(int i) {
                    if (bcVar.f191144k != null) {
                        bcVar.f191144k.mo56638a(i);
                    }
                }
            }, bcVar.f191142i);
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130960a(String[] strArr) {
        return this.f191251c.mo53228a(strArr, 0);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130956a(String str, String str2, float f) {
        return this.f191251c.mo53298b(str, str2, f);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130962a(String[] strArr, String[] strArr2, float[] fArr) {
        return this.f191251c.mo53205a(2, strArr, strArr2, fArr);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130961a(String[] strArr, int i) {
        return this.f191251c.mo53299b(strArr, i);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130942a(VEEffectParams vEEffectParams) {
        return this.f191251c.mo53215a(vEEffectParams);
    }

    @Override // com.p2082ss.android.medialib.listener.AbstractC30013c
    /* renamed from: a */
    public final void mo52867a() {
        Iterator it = this.f191504aj.mo130623c().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130966a(float f, float f2, float f3, float f4) {
        this.f191251c.mo53239a(f, f2, f3, f4);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130997a(boolean z, long j) {
        this.f191251c.mo53280a(z, j);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final boolean mo131001a(C85392bf bfVar, int i) {
        return this.f191251c.mo53287a(bfVar, i);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130988a(VEBaseRecorderLensParams vEBaseRecorderLensParams, final C85346av.AbstractC85372q qVar) {
        this.f191509ao = qVar;
        this.f191251c.mo53269a(vEBaseRecorderLensParams, new RecordInvoker.OnLensResultCallback() {
            /* class com.p2082ss.android.vesdk.C85410d.C8544640 */

            static {
                Covode.recordClassIndex(99567);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnLensResultCallback
            public final void onError(int i, int i2, String str) {
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnLensResultCallback
            public final void onInfo(int i, int i2, int i3, String str) {
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnLensResultCallback
            public final void onSuccess(int i, float f, int i2) {
                qVar.mo56562a(i, f, i2);
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130939a(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        this.f191251c.mo53247a(i, vESafeAreaParamsArr);
        return 0;
    }

    /* renamed from: a */
    public final void mo130972a(Bitmap bitmap, String str) {
        VEDebugSettings vEDebugSettings = this.f191228bH;
        if (vEDebugSettings != null && vEDebugSettings.isNeedDumpCapture()) {
            String str2 = this.f191228bH.getCapDumpDir() + File.separator + str + "_" + bitmap.getWidth() + "x" + bitmap.getHeight() + "_" + System.currentTimeMillis() + ".jpg";
            C85315al.m146637a(f191200a, "Start to dump bitmap to ".concat(String.valueOf(str2)));
            C29987b.m60522a(bitmap, str2, Bitmap.CompressFormat.JPEG);
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130953a(String str, int i, int i2, Bitmap.CompressFormat compressFormat, C85346av.AbstractC85359e eVar) {
        if (!this.f191207F) {
            C85315al.m146641c(f191200a, "mHasFirstFrameCaptured is false");
            eVar.mo56638a(-100002);
            return -100002;
        }
        C8543732 r7 = new C29983a.AbstractC29986c(eVar, false) {
            /* class com.p2082ss.android.vesdk.C85410d.C8543732 */

            /* renamed from: a */
            final /* synthetic */ C85346av.AbstractC85359e f191332a;

            /* renamed from: b */
            final /* synthetic */ boolean f191333b = false;

            static {
                Covode.recordClassIndex(99558);
            }

            @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29986c
            /* renamed from: a */
            public final void mo52800a(int i) {
                this.f191332a.mo56638a(i);
            }

            {
                this.f191332a = r3;
            }
        };
        return this.f191251c.mo53219a(str, new int[]{i, i2}, true, compressFormat, (C29983a.AbstractC29986c) r7, false);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: l */
    public final long mo131056l() {
        return this.f191251c.mo53335f();
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: m */
    public final long mo131058m() {
        return this.f191251c.mo53341g();
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: n */
    public final int mo131060n() {
        return this.f191251c.mo53344h();
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: v */
    public final long mo131072v() {
        return this.f191251c.mo53188C();
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: w */
    public final VEMapBufferInfo mo131073w() {
        return this.f191251c.mo53191E();
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: y */
    public final EnigmaResult mo131075y() {
        return this.f191251c.mo53379u();
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: z */
    public final AbstractC30029f mo131076z() {
        return this.f191251c.f71697j;
    }

    /* renamed from: F */
    private void m146953F() {
        if (this.f191511aq != -1) {
            TEVideoUtils.resetModel(this.f191511aq);
            this.f191511aq = -1;
        }
    }

    /* renamed from: G */
    private boolean m146954G() {
        if (this.f191206E || mo131074x()) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private boolean m146955H() {
        if (this.f191520az == EnumC85329au.KARAOKE || this.f191520az == EnumC85329au.KARAOKE_PURE_AUDIO) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: A */
    public final void mo130926A() {
        mo131017b(new Runnable(null) {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8544439 */

            /* renamed from: a */
            final /* synthetic */ VEListener.AbstractC85241j f191351a = null;

            static {
                Covode.recordClassIndex(99565);
            }

            public final void run() {
                int B = C85410d.this.f191251c.mo53185B();
                C85315al.m146637a(C85410d.f191200a, "startRender ret=".concat(String.valueOf(B)));
                VEListener.AbstractC85241j jVar = this.f191351a;
                if (jVar != null) {
                    jVar.mo56563a(B);
                }
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: i */
    public final void mo131051i() {
        m146960r(false);
        mo131069s();
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: j */
    public final String[] mo131053j() {
        return this.f191251c.mo53355j();
    }

    /* renamed from: r */
    public final void mo131068r() {
        if (this.f191269u != 0) {
            m146959g(0);
            this.f191251c.mo53332e();
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: t */
    public final void mo131070t() {
        AbstractC85381a aVar = this.f191259j;
        if (aVar != null) {
            aVar.mo130849c();
        } else {
            C85315al.m146641c(f191200a, "No Camera capture to stopCameraPreview");
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: u */
    public final void mo131071u() {
        super.mo131071u();
        this.f191251c.mo53381v();
    }

    /* renamed from: x */
    public final boolean mo131074x() {
        if (this.f191214M == EnumC85329au.KARAOKE || this.f191214M == EnumC85329au.KARAOKE_PURE_AUDIO) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(99531);
    }

    /* renamed from: D */
    private void m146951D() {
        this.f191251c.mo53186B(((Boolean) C85568t.m147473a().mo131557a("video_duration_opt", (Object) false)).booleanValue());
    }

    /* renamed from: E */
    private void m146952E() {
        this.f191251c.mo53187C(((Boolean) C85568t.m147473a().mo131557a("enable_duet_gl_finish", (Object) false)).booleanValue());
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: f */
    public final int[] mo131045f() {
        int[] c = this.f191251c.mo53318c();
        C85315al.m146637a(f191200a, "getReactRegionInViewPixel " + Arrays.toString(c));
        return c;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: g */
    public final float mo131046g() {
        float b = this.f191251c.mo53290b();
        C85315al.m146637a(f191200a, "getReactionWindowRotation ".concat(String.valueOf(b)));
        return b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: p */
    public final float[] mo131065p() {
        C30031g gVar = this.f191251c;
        if (gVar == null) {
            return new float[]{0.0f, 0.0f};
        }
        return gVar.mo53389z();
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt
    public void startMicError() {
        C30695h.m63062a(0, "te_record_audio_mic_start_ret", 1061L);
        VEListener.AbstractC85230ai aiVar = this.f191465W;
        if (aiVar != null && (aiVar instanceof VEListener.AbstractC85229ah)) {
            ((VEListener.AbstractC85229ah) aiVar).mo56559a(1061, 0, "start audio record error.");
        }
    }

    /* renamed from: C */
    private void m146950C() {
        int intValue;
        this.f191514at.getEncodeStandard();
        if (((Boolean) C85568t.m147473a().mo131557a("enable_record_mpeg4", (Object) false)).booleanValue()) {
            intValue = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_MPEG4.ordinal();
            C85315al.m146637a(f191200a, "setCodecType MPEG4");
        } else {
            intValue = ((Integer) C85568t.m147473a().mo131557a("ve_record_codec_type", (Object) 0)).intValue();
        }
        String str = f191200a;
        C30969o.m63687b(str, "setCodecType: ".concat(String.valueOf(intValue)));
        int g = this.f191251c.mo53340g(intValue);
        if (g != 0) {
            C85315al.m146642d(str, "setCodecType failed ".concat(String.valueOf(g)));
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: d */
    public final void mo131034d() {
        this.f191251c.mo53277a(true);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: e */
    public final int[] mo131042e() {
        int[] d = this.f191251c.mo53327d();
        C85315al.m146637a(f191200a, "getReactionPosMarginInViewPixel " + Arrays.toString(d));
        return d;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: o */
    public final void mo131062o() {
        MethodCollector.m26663i(6116);
        if (this.f191238bR) {
            MethodCollector.m26664o(6116);
            return;
        }
        if (this.f191463U != null) {
            this.f191463U.f191571a.mo130619a();
        }
        C85394bg.m146928a("onDestroy");
        if (!this.f191247bw) {
            mo130978a((VEListener.AbstractC85241j) null, false);
        }
        if (this.f191462T != null) {
            this.f191462T.f191559c.mo130622b(this);
        }
        AbstractC85381a aVar = this.f191259j;
        if (aVar != null) {
            aVar.mo130850d();
        }
        this.f191251c.f71694g = null;
        this.f191251c.mo53261a((AbstractC30011a) null);
        this.f191251c.mo53192F();
        List<C85346av.AbstractC85369n> list = this.f191273y;
        if (list != null) {
            list.clear();
        }
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8541210 */

            static {
                Covode.recordClassIndex(99533);
            }

            public final void run() {
                C85410d.this.mo131068r();
                if (C85410d.this.f191215N != null) {
                    C85410d.this.f191215N.release();
                }
            }
        });
        if (!this.f191230bJ.isShutdown()) {
            this.f191230bJ.shutdown();
        }
        super.mo131062o();
        TEMonitorInvoker.nativeMonitorPerfWithType(0);
        this.f191238bR = true;
        this.f191541bu = false;
        this.f191232bL = null;
        this.f191505ak = null;
        this.f191508an = null;
        C85394bg.m146929b();
        MethodCollector.m26664o(6116);
    }

    /* renamed from: B */
    private int m146949B() {
        VESize vESize;
        VESize vESize2;
        if (this.f191269u != 0) {
            C85315al.m146641c(f191200a, "initInternalRecorder called in a invalid state: " + this.f191269u + "should be : 0");
            return -105;
        }
        if (this.f191515au != null) {
            this.f191251c.mo53230a(this.f191515au.f190618c, this.f191515au.f190620e, this.f191515au.f190619d);
        }
        this.f191251c.mo53249a(this.f191461S);
        int i = this.f191514at.getVideoRes().width;
        int i2 = this.f191514at.getVideoRes().height;
        int i3 = !TextUtils.isEmpty(this.f191469aA) ? 1 : 0;
        if (this.f191265q.width == 0 || this.f191265q.height == 0) {
            VEDisplaySettings vEDisplaySettings = this.f191267s.f190983B;
            if (vEDisplaySettings == null || vEDisplaySettings.f190744i == null || (vESize2 = vEDisplaySettings.f190745j) == null) {
                vESize = new VESize(this.f191267s.f190989a.height, this.f191267s.f190989a.width);
            } else {
                vESize = new VESize(vESize2.height, vESize2.width);
            }
        } else {
            vESize = this.f191265q;
        }
        int a = this.f191251c.mo53199a(vESize.width, vESize.height, this.f191257h, i2, i, this.f191516av, i3, this.f191517aw, this.f191240bT, this.f191494aZ);
        if (this.f191494aZ) {
            this.f191251c.mo53252a(this.f191493aY);
        }
        int a2 = this.f191251c.mo53222a(this.f191489aU, this.f191491aW);
        int a3 = this.f191251c.mo53220a(this.f191244bX, this.f191245bY);
        m146950C();
        m146951D();
        m146952E();
        this.f191265q = vESize;
        if (a2 != 0) {
            C85315al.m146642d(f191200a, "setEnableAEC failed ".concat(String.valueOf(a2)));
        }
        if (a3 != 0) {
            C85315al.m146642d(f191200a, "setLoudness failed ".concat(String.valueOf(a3)));
        }
        if (a == 0) {
            m146959g(1);
        }
        return a;
    }

    /* renamed from: s */
    public final synchronized void mo131069s() {
        MethodCollector.m26663i(6149);
        String str = f191200a;
        C85315al.m146637a(str, "stopRecordPreview enter");
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f191269u;
        if ((i & 2) == 0) {
            C85315al.m146642d(str, "stopRecordPreview status error: " + this.f191269u);
            MethodCollector.m26664o(6149);
            return;
        }
        if (i == 3 && this.f191267s.f190984C) {
            this.f191251c.mo53372r();
            this.f191251c.mo53362m(false);
            int k = mo131054k();
            if (this.f191465W != null && (this.f191465W instanceof VEListener.AbstractC85229ah)) {
                ((VEListener.AbstractC85229ah) this.f191465W).mo56559a(1022, k, "stopRecord in stopPreview!!");
            }
        }
        if (this.f191465W != null && (this.f191465W instanceof VEListener.AbstractC85229ah)) {
            ((VEListener.AbstractC85229ah) this.f191465W).mo56559a(1060, 1, "calling mic release func");
        }
        this.f191251c.mo53369q();
        m146959g(1);
        if (m146954G() && !this.f191541bu) {
            C85315al.m146639b(str, "mVEAudioCapture release: stopRecordPreview");
            this.f191463U.release(this.f191210I);
            this.f191213L = 0;
        }
        C30031g gVar = this.f191251c;
        if (!gVar.f71692e && gVar.f71689b != null) {
            gVar.f71689b.unInit();
            gVar.f71689b = null;
        }
        if (this.f191465W != null && (this.f191465W instanceof VEListener.AbstractC85229ah)) {
            ((VEListener.AbstractC85229ah) this.f191465W).mo56559a(1060, 2, "mic released func");
        }
        this.f191251c.mo53262a((AbstractC30012b) null);
        this.f191251c.mo53258a((RecordInvoker.OnRunningErrorCallback) null);
        this.f191251c.mo53304b(this);
        mo131016b(this.f191233bM);
        this.f191233bM = null;
        if (this.f191226bF) {
            mo131068r();
        } else {
            m146959g(1);
        }
        C30695h.m63062a(0, "te_record_preview_destroy_time", System.currentTimeMillis() - currentTimeMillis);
        TEMonitorInvoker.nativeMonitorPerfWithType(0);
        this.f191243bW = true;
        m146953F();
        C85315al.m146637a(str, "stopRecordPreview exit");
        MethodCollector.m26664o(6149);
    }

    /* renamed from: k */
    public final synchronized int mo131054k() {
        float f;
        int i;
        MethodCollector.m26663i(5958);
        int i2 = this.f191269u;
        if (i2 == 3 || i2 == 4) {
            if (this.f191541bu && this.f191241bU) {
                EnumC85339g.INSTANCE.stopFeedPCM();
            }
            C85394bg.m146928a("stopRecord");
            this.f191234bN = false;
            this.f191235bO = false;
            if (this.f191539bs) {
                C30929b.EnumC30931b bVar = C30929b.EnumC30931b.BOOST_CPU;
                C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_vboost_timeout");
                if (a == null || !(a.f191742b instanceof Integer)) {
                    i = 50;
                } else {
                    i = ((Integer) a.f191742b).intValue();
                }
                new C30929b.C30930a(bVar, i);
                this.f191251c.mo53358l();
                new C30929b.C30930a(C30929b.EnumC30931b.RESTORE_CPU);
            } else {
                this.f191251c.mo53358l();
            }
            this.f191234bN = true;
            this.f191251c.mo53363n();
            if (this.f191235bO && this.f191465W != null && (this.f191465W instanceof VEListener.AbstractC85229ah)) {
                ((VEListener.AbstractC85229ah) this.f191465W).mo56559a(1021, 0, "Update segmentation time.");
            }
            long f2 = (long) (((float) this.f191251c.mo53335f()) / 1000.0f);
            this.f191220b.add(new C30018c(f2, (double) this.f191222bB));
            synchronized (f191201o) {
                try {
                    this.f191223bC = -1;
                    f = (float) f2;
                    this.f191258i = (long) (((float) this.f191258i) + ((1.0f * f) / this.f191222bB));
                } catch (Throwable th) {
                    MethodCollector.m26664o(5958);
                    throw th;
                }
            }
            if (this.f191269u == 3) {
                m146959g(2);
            } else {
                m146959g(1);
            }
            if (System.currentTimeMillis() - this.f191205D.f191123e > 1000) {
                C30695h.m63061a(0, "te_record_camera_sensor_interval_variance", this.f191205D.mo130843a());
                C30695h.m63061a(0, "te_record_camera_sensor_interval_mean", this.f191205D.mo130844b());
                C30695h.m63061a(0, "te_record_camera_sensor_interval_range", this.f191205D.mo130845c());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("variance", this.f191205D.mo130843a());
                    jSONObject.put("mean", this.f191205D.mo130844b());
                    jSONObject.put("range", this.f191205D.mo130845c());
                    C30683b.m63033a("vesdk_event_camera_sensor_frame_interval", jSONObject, "performance", false, true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            C85380b bVar2 = this.f191205D;
            bVar2.f191119a.clear();
            bVar2.f191121c = -1.0d;
            bVar2.f191122d = -1.0d;
            bVar2.f191120b = -1.0d;
            C85394bg.m146929b();
            this.f191243bW = true;
            C30695h.m63062a(0, "te_record_mode", (long) this.f191520az.ordinal());
            int i3 = (int) (f / this.f191222bB);
            MethodCollector.m26664o(5958);
            return i3;
        }
        C85315al.m146642d(f191200a, "nativeStopRecord called in a invalid state: " + this.f191269u);
        MethodCollector.m26664o(5958);
        return -105;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final void mo130990a(Runnable runnable) {
        RecordInvoker.setDuetVideoCompleteCallback(runnable);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: f */
    public final void mo131043f(int i) {
        this.f191251c.mo53325d(i);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: g */
    public final void mo131047g(boolean z) {
        this.f191251c.mo53370q(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: h */
    public final void mo131049h(boolean z) {
        this.f191251c.f71711x = z;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: i */
    public final int mo131050i(boolean z) {
        return this.f191251c.mo53371r(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: j */
    public final void mo131052j(boolean z) {
        this.f191251c.mo53375s(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: p */
    public final void mo131064p(boolean z) {
        this.f191251c.mo53388z(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: q */
    public final void mo131067q(boolean z) {
        this.f191251c.mo53245a(24, z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: e */
    public final int mo131039e(int i) {
        return this.f191251c.mo53353j(i, 0);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: f */
    public final void mo131044f(boolean z) {
        this.f191251c.mo53380u(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: k */
    public final void mo131055k(boolean z) {
        if (z) {
            this.f191251c.mo53295b(this.f191461S);
        } else {
            this.f191251c.mo53385x();
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: l */
    public final void mo131057l(boolean z) {
        this.f191251c.mo53386x(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: m */
    public final void mo131059m(boolean z) {
        this.f191251c.mo53383w(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: n */
    public final void mo131061n(boolean z) {
        this.f191251c.mo53184A(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final float mo130927a(String str) {
        return this.f191251c.mo53310c(str);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: c */
    public final void mo131027c(final VEListener.AbstractC85241j jVar) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC854549 */

            static {
                Covode.recordClassIndex(99575);
            }

            public final void run() {
                MethodCollector.m26663i(7989);
                synchronized (C85410d.this) {
                    try {
                        if (C85410d.this.f191269u == 3) {
                            C85315al.m146642d(C85410d.f191200a, "deleteLastFrag could not be executed in mode: " + C85410d.this.f191269u);
                            VEListener.AbstractC85241j jVar = jVar;
                            if (jVar != null) {
                                jVar.mo56563a(-105);
                            }
                            return;
                        }
                        int size = C85410d.this.f191220b.size();
                        if (size > 0) {
                            C85410d.this.f191220b.remove(size - 1);
                            C85410d dVar = C85410d.this;
                            dVar.f191258i = (long) C30018c.m60569a(dVar.f191220b);
                        }
                        C85410d.this.f191251c.mo53349i();
                        VEListener.AbstractC85241j jVar2 = jVar;
                        if (jVar2 != null) {
                            jVar2.mo56563a(0);
                        }
                        MethodCollector.m26664o(7989);
                    } finally {
                        MethodCollector.m26664o(7989);
                    }
                }
            }
        });
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: d */
    public final int mo131032d(final VEListener.AbstractC85241j jVar) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8542320 */

            static {
                Covode.recordClassIndex(99544);
            }

            public final void run() {
                if (C85410d.this.f191269u != 2) {
                    C85315al.m146642d(C85410d.f191200a, "stopPrePlay in state:" + C85410d.this.f191269u);
                    return;
                }
                int m = C85410d.this.f191251c.mo53361m();
                C85410d.this.f191204C = true;
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(m);
                }
            }
        });
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: e */
    public final void mo131040e(final VEListener.AbstractC85241j jVar) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8544338 */

            static {
                Covode.recordClassIndex(99564);
            }

            public final void run() {
                int A = C85410d.this.f191251c.mo53183A();
                C85315al.m146637a(C85410d.f191200a, "pauseRender ret=".concat(String.valueOf(A)));
                VEListener.AbstractC85241j jVar = jVar;
                if (jVar != null) {
                    jVar.mo56563a(A);
                }
            }
        });
    }

    /* renamed from: g */
    private void m146959g(int i) {
        C85315al.m146637a(f191200a, "update cur record status from [" + this.f191269u + "] to [" + i + "]");
        this.f191269u = i;
    }

    /* renamed from: r */
    private void m146960r(boolean z) {
        this.f191251c.mo53356k(true);
        if (this.f191259j != null) {
            VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.EnumC85266b.PRIVACY_STATUS_RELEASE);
            this.f191259j.mo130847a(z);
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final int mo131006b(final C85346av.AbstractC85362h hVar) {
        return this.f191251c.mo53211a((RecordInvoker.OnARTextContentCallback) new RecordInvoker.OnARTextContentCallback() {
            /* class com.p2082ss.android.vesdk.C85410d.C8543530 */

            static {
                Covode.recordClassIndex(99556);
            }

            @Override // com.p2082ss.android.medialib.RecordInvoker.OnARTextContentCallback
            public final void onResult(String[] strArr) {
                C85346av.AbstractC85362h hVar = hVar;
                if (hVar != null) {
                    hVar.mo56833a(strArr);
                }
            }
        });
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int closeWavFile(boolean z) {
        C85315al.m146639b(f191200a, "closeWavFile...");
        this.f191235bO = true;
        if (this.f191234bN && this.f191465W != null && (this.f191465W instanceof VEListener.AbstractC85229ah)) {
            ((VEListener.AbstractC85229ah) this.f191465W).mo56559a(1021, 0, "Update segmentation time.");
        }
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: e */
    public final boolean mo131041e(boolean z) {
        return this.f191251c.mo53364n(z);
    }

    /* renamed from: o */
    public final void mo131063o(boolean z) {
        boolean z2 = false;
        boolean booleanValue = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_sys_karaoke", (Object) false)).booleanValue();
        C85521l.C85522a a = new C85521l.C85522a().mo131430a(z ? 1 : 0).mo131431a(z);
        if (booleanValue && this.f191538br) {
            z2 = true;
        }
        this.f191246bZ = a.mo131432b(z2).f191584a;
    }

    @Override // com.p2082ss.android.medialib.RecordInvoker.OnRunningErrorCallback
    public void onError(int i) {
        C85315al.m146642d(f191200a, "running error: ".concat(String.valueOf(i)));
        int i2 = -601;
        if (i == -602) {
            i2 = -602;
        } else if (i != -601) {
            i2 = 0;
        }
        if (this.f191465W instanceof VEListener.AbstractC85229ah) {
            ((VEListener.AbstractC85229ah) this.f191465W).mo56560a(i2, "");
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final int mo131007b(String str) {
        return this.f191251c.mo53323d(str);
    }

    /* renamed from: c */
    public final int mo131024c(boolean z) {
        if (!this.f191267s.f190990b && !z) {
            return 0;
        }
        if (this.f191520az == EnumC85329au.DUET || this.f191520az == EnumC85329au.REACTION || this.f191520az == EnumC85329au.CUSTOM_VIDEO_BG) {
            return 5;
        }
        if (TextUtils.isEmpty(this.f191469aA)) {
            return 1;
        }
        if (z) {
            return 5;
        }
        return 4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo131026c(int r7) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85410d.mo131026c(int):void");
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: d */
    public final void mo131035d(int i) {
        this.f191251c.mo53337f(i);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: c */
    public final void mo131028c(String str) {
        this.f191251c.mo53331e(str);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: d */
    public final void mo131036d(boolean z) {
        this.f191251c.mo53378t(z);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final synchronized int mo130929a(float f) {
        int i;
        boolean z;
        MethodCollector.m26663i(5951);
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_USING);
        if (this.f191514at == null) {
            MethodCollector.m26664o(5951);
            return -108;
        }
        if (this.f191269u == 2) {
            m146959g(3);
        } else if ((this.f191214M == EnumC85329au.KARAOKE_PURE_AUDIO || this.f191520az == EnumC85329au.AUDIO) && this.f191269u == 1) {
            m146959g(4);
        } else {
            C85315al.m146642d(f191200a, "nativeStartRecord called in a invalid state: " + this.f191269u + "should be : 2");
            int i2 = this.f191269u;
            if (i2 == 3 || i2 == 4) {
                MethodCollector.m26664o(5951);
                return -115;
            }
            MethodCollector.m26664o(5951);
            return -105;
        }
        C85394bg.m146928a("startRecord");
        if (this.f191541bu && this.f191241bU) {
            EnumC85339g.INSTANCE.startFeedPCM();
        }
        mo131026c(mo131024c(true));
        this.f191251c.mo53296b(this.f191461S, mo131024c(true), this);
        this.f191222bB = f;
        this.f191251c.mo53231a(this.f191470aB, this.f191258i);
        if (this.f191514at.getBitrateMode() == VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF) {
            int swCRF = this.f191514at.getSwCRF();
            C30031g gVar = this.f191251c;
            int ordinal = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
            if (swCRF < 12) {
                swCRF = 12;
            }
            gVar.mo53314c(ordinal, swCRF);
        } else {
            this.f191251c.mo53314c(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal(), this.f191514at.getSwQP());
        }
        float bps = (((float) this.f191514at.getBps()) * 1.0f) / 4194304.0f;
        if (this.f191514at.getEncodeProfile() == VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN.ordinal()) {
            i = 2;
        } else if (this.f191514at.getEncodeProfile() == VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH.ordinal()) {
            i = 8;
        } else {
            i = 1;
        }
        this.f191251c.mo53368p(this.f191487aS);
        if (this.f191488aT != null) {
            if (this.f191488aT.waterMarkBitmap == null) {
                this.f191251c.mo53284a(this.f191488aT.images, this.f191488aT.width, this.f191488aT.height, this.f191488aT.xOffset, this.f191488aT.yOffset, this.f191488aT.position.ordinal(), this.f191488aT.interval, this.f191488aT.rotation);
            } else {
                this.f191251c.mo53253a(this.f191488aT.waterMarkBitmap, this.f191488aT.width, this.f191488aT.height, this.f191488aT.xOffset, this.f191488aT.yOffset, this.f191488aT.position.ordinal(), this.f191488aT.interval, this.f191488aT.rotation);
            }
        }
        final VEListener.AbstractC85237f fVar = this.f191506al;
        C854516 r5 = new C30031g.AbstractC30044b() {
            /* class com.p2082ss.android.vesdk.C85410d.C854516 */

            static {
                Covode.recordClassIndex(99572);
            }

            @Override // com.p2082ss.android.medialib.presenter.C30031g.AbstractC30044b
            /* renamed from: a */
            public final void mo53392a(int i) {
                C30695h.m63062a(0, "te_record_audio_start_record_ret", (long) i);
            }
        };
        C30031g gVar2 = this.f191251c;
        if (!gVar2.f71692e && gVar2.f71689b != null) {
            gVar2.f71689b.setAudioRecordStateCallack(r5);
        }
        if (m146954G() && !this.f191541bu && this.f191251c.mo53357k()) {
            mo131037d("startRecord");
            C85315al.m146639b(f191200a, "mVEAudioCapture start: startRecord");
            this.f191463U.start(this.f191210I);
        }
        C30031g gVar3 = this.f191251c;
        double d = (double) f;
        if (!this.f191514at.isSupportHwEnc()) {
            z = true;
        } else {
            z = false;
        }
        int a = gVar3.mo53194a(d, z, bps, i, this.f191514at.getDescription(), this.f191514at.getComment());
        if (a != 0) {
            C85315al.m146642d(f191200a, "nativeStartRecord error: ".concat(String.valueOf(a)));
        }
        C30695h.m63062a(0, "te_titan_engine", 0L);
        C30695h.m63062a(0, "te_record_start_record_ret", (long) a);
        int outputAudioDeviceType = TESystemUtils.getOutputAudioDeviceType();
        long j = (long) outputAudioDeviceType;
        C30695h.m63062a(0, "te_record_audio_device", j);
        C85315al.m146637a(f191200a, "output audio device: ".concat(String.valueOf(outputAudioDeviceType)));
        C30652a.m63004a("te_record_audio_device", j);
        synchronized (f191201o) {
            try {
                this.f191223bC = 0;
            } catch (Throwable th) {
                MethodCollector.m26664o(5951);
                throw th;
            }
        }
        C85394bg.m146929b();
        MethodCollector.m26664o(5951);
        return a;
    }

    /* renamed from: d */
    public final boolean mo131037d(String str) {
        if (this.f191213L != 0) {
            return false;
        }
        C85315al.m146639b(f191200a, "mVEAudioCapture init ".concat(String.valueOf(str)));
        this.f191213L = 1;
        this.f191463U.mo131429b(this.f191242bV);
        this.f191463U.mo131427a(this.f191242bV);
        this.f191463U.init(this.f191246bZ);
        return true;
    }

    /* renamed from: b */
    public final synchronized int mo131005b(Surface surface) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        VEDisplaySettings vEDisplaySettings;
        MethodCollector.m26663i(6145);
        this.f191237bQ = System.currentTimeMillis();
        if (this.f191465W != null && (this.f191465W instanceof VEListener.AbstractC85229ah)) {
            ((VEListener.AbstractC85229ah) this.f191465W).mo56559a(1020, 0, "You can replace the Res Manager here.");
        }
        if (this.f191269u == 0) {
            mo131068r();
            int B = m146949B();
            if (B != 0) {
                C85315al.m146642d(f191200a, "nativeInitBeautyPlay error: ".concat(String.valueOf(B)));
                MethodCollector.m26664o(6145);
                return -108;
            }
            if (this.f191505ak != null) {
                mo130985a(this.f191505ak);
            }
            if (this.f191508an != null) {
                final C85346av.AbstractC85355a aVar = this.f191508an;
                this.f191508an = aVar;
                this.f191251c.mo53286a(this.f191461S, new AudioManagerCallback() {
                    /* class com.p2082ss.android.vesdk.C85410d.C8544741 */

                    static {
                        Covode.recordClassIndex(99568);
                    }
                });
            }
        }
        if (this.f191269u != 1) {
            C85315al.m146642d(f191200a, "startRecordPreview statue error: " + this.f191269u);
            if (this.f191225bE != surface) {
                mo130941a(surface);
                this.f191225bE = surface;
            }
            MethodCollector.m26664o(6145);
            return -105;
        }
        this.f191225bE = surface;
        this.f191262m = -1;
        this.f191266r = 0;
        this.f191260k.width = 0;
        this.f191260k.height = 0;
        this.f191251c.mo53264a(this.f191512ar);
        boolean z4 = this.f191226bF;
        this.f191226bF = z4;
        this.f191251c.mo53190D(z4);
        if (this.f191226bF) {
            this.f191251c.mo53316c(this.f191473aE);
        }
        this.f191251c.mo53236a(this.f191484aP);
        this.f191251c.mo53300b(this.f191485aQ);
        this.f191251c.mo53366o(this.f191482aN);
        VESize videoRes = this.f191514at.getVideoRes();
        if (this.f191483aO.isValid() && !videoRes.equals(this.f191483aO)) {
            this.f191251c.mo53242a(this.f191483aO.width, this.f191483aO.height);
            videoRes.width = this.f191483aO.width;
            videoRes.height = this.f191483aO.height;
        }
        if (this.f191520az == EnumC85329au.DUET) {
            this.f191251c.mo53275a(this.f191518ax.f191750a, this.f191518ax.f191751b, this.f191518ax.f191752c, this.f191518ax.f191753d, this.f191518ax.f191754e, this.f191518ax.f191755f, this.f191518ax.f191756g, this.f191518ax.f191757h.ordinal());
        } else if (this.f191520az == EnumC85329au.REACTION) {
            this.f191251c.mo53250a(this.f191461S, this.f191519ay.f191022a, this.f191519ay.f191023b);
        } else {
            C30031g a = this.f191251c.mo53233a(this.f191469aA);
            if (this.f191472aD == 1) {
                z = true;
            } else {
                z = false;
            }
            a.f71691d = z;
            a.mo53232a(this.f191470aB, this.f191471aC, 0);
        }
        this.f191251c.mo53234a();
        C30031g gVar = this.f191251c;
        C85322ar arVar = this.f191267s;
        if (((Boolean) C85568t.m147473a().mo131557a("ve_async_detection", (Object) true)).booleanValue()) {
            arVar.f190991c = true;
        }
        gVar.mo53359l(arVar.f190991c);
        this.f191251c.mo53262a((AbstractC30012b) this);
        this.f191251c.mo53258a((RecordInvoker.OnRunningErrorCallback) this);
        C30031g gVar2 = this.f191251c;
        C85322ar arVar2 = this.f191267s;
        if (((Boolean) C85568t.m147473a().mo131557a("ve_opt_first_frame", (Object) false)).booleanValue()) {
            arVar2.f190997i = true;
        }
        gVar2.mo53370q(arVar2.f190997i);
        this.f191251c.mo53364n(this.f191267s.f190999k);
        this.f191251c.mo53308b(this.f191486aR);
        this.f191251c.mo53263a((AbstractC30013c) this);
        C30031g gVar3 = this.f191251c;
        C85322ar arVar3 = this.f191267s;
        if (((Boolean) C85568t.m147473a().mo131557a("ve_enable_three_buffer", (Object) false)).booleanValue()) {
            arVar3.f191001m = true;
        }
        gVar3.mo53317c(arVar3.f191001m);
        C30031g gVar4 = this.f191251c;
        C85322ar arVar4 = this.f191267s;
        if (((Boolean) C85568t.m147473a().mo131557a("ve_enable_preload_effect_res", (Object) false)).booleanValue()) {
            arVar4.f191002n = true;
        }
        gVar4.mo53326d(arVar4.f191002n);
        this.f191251c.mo53248a(this.f191267s.f191004p);
        this.f191251c.mo53334e(this.f191267s.f191005q);
        this.f191251c.mo53338f(this.f191267s.f191006r);
        this.f191251c.mo53343g(this.f191226bF);
        this.f191251c.mo53302b(this.f191267s.f191009u, this.f191267s.f191010v);
        C30031g gVar5 = this.f191251c;
        if (this.f191267s.f191007s.ordinal() == C85322ar.EnumC85324b.RecordOriginContent.ordinal()) {
            z2 = true;
        } else {
            z2 = false;
        }
        gVar5.mo53382v(z2);
        C30031g gVar6 = this.f191251c;
        C85322ar arVar5 = this.f191267s;
        if (((Boolean) C85568t.m147473a().mo131557a("ve_enable_titan_auto_test_log", (Object) false)).booleanValue()) {
            arVar5.f190996h = true;
        }
        gVar6.mo53354j(arVar5.f190996h);
        if (this.f191267s.f190987F) {
            this.f191251c.mo53374s();
        }
        if (!this.f191226bF) {
            VEDisplaySettings vEDisplaySettings2 = this.f191268t;
            if (vEDisplaySettings2 == null) {
                vEDisplaySettings2 = this.f191267s.f190983B;
            }
            this.f191226bF = false;
            if (vEDisplaySettings2 != null) {
                z3 = true;
            } else {
                z3 = false;
                VEDisplaySettings.C85217a aVar2 = new VEDisplaySettings.C85217a();
                aVar2.f190751a.f190745j = this.f191267s.f190989a;
                vEDisplaySettings2 = aVar2.f190751a;
            }
            VESize vESize = vEDisplaySettings2.f190745j;
            VESize vESize2 = vEDisplaySettings2.f190746k;
            VESize vESize3 = vEDisplaySettings2.f190747l;
            EnumC85321aq aqVar = vEDisplaySettings2.f190744i;
            if (aqVar != null) {
                if (this.f191227bG || (vEDisplaySettings = this.f191268t) == null || !vEDisplaySettings.equals(vEDisplaySettings2)) {
                    this.f191227bG = false;
                    this.f191268t = vEDisplaySettings2;
                    this.f191473aE = aqVar.ordinal();
                    if (vESize.isValid()) {
                        int i7 = vESize.height;
                        int i8 = vESize.width;
                        this.f191265q.width = i7;
                        this.f191265q.height = i8;
                    }
                } else {
                    C85315al.m146641c(f191200a, "set same display settings...");
                }
            }
            C30031g gVar7 = this.f191251c;
            int ordinal = vEDisplaySettings2.f190738c.ordinal();
            long j = vEDisplaySettings2.f190742g;
            float f = vEDisplaySettings2.f190743h;
            int i9 = vEDisplaySettings2.f190739d;
            if (vESize == null) {
                i4 = 0;
                i5 = 0;
            } else {
                i4 = vESize.width;
                i5 = vESize.height;
            }
            int ordinal2 = vEDisplaySettings2.f190749n.ordinal();
            float f2 = vEDisplaySettings2.f190750o;
            int i10 = vEDisplaySettings2.f190736a;
            int i11 = vEDisplaySettings2.f190737b;
            int i12 = vESize2.width;
            int i13 = vESize2.height;
            int i14 = vESize3.width;
            int i15 = vESize3.height;
            if (aqVar != null) {
                i6 = this.f191473aE;
            } else {
                i6 = -1;
            }
            if (gVar7.mo53200a(ordinal, j, f, i9, i4, i5, ordinal2, f2, i10, i11, i12, i13, i14, i15, z3, i6) != 0) {
                this.f191227bG = true;
            }
        }
        if (surface != null) {
            i = this.f191251c.mo53209a(surface, Build.DEVICE);
        } else {
            if (this.f191462T != null) {
                i2 = this.f191462T.f191557a;
            } else {
                i2 = -1;
            }
            if (this.f191462T != null) {
                i3 = this.f191462T.f191558b;
            } else {
                i3 = -1;
            }
            i = this.f191251c.mo53346h(i2, i3);
        }
        if (i != 0) {
            C85315al.m146642d(f191200a, "nativeStartPlay error: ".concat(String.valueOf(i)));
        }
        C30695h.m63062a(0, "te_record_start_preview_ret", (long) i);
        m146959g(2);
        if (mo131074x()) {
            this.f191251c.mo53347h(true);
        } else {
            this.f191251c.mo53347h(this.f191206E);
            this.f191251c.mo53206a(this.f191461S, mo131024c(false), this);
        }
        synchronized (this.f191231bK) {
            try {
                if (!this.f191220b.isEmpty()) {
                    int a2 = this.f191251c.mo53201a(this.f191220b.size(), this.f191257h);
                    if (a2 != 0) {
                        C85315al.m146642d(f191200a, "tryRestore ret: ".concat(String.valueOf(a2)));
                    } else {
                        this.f191258i = (long) C30018c.m60569a(this.f191220b);
                    }
                }
            } finally {
                MethodCollector.m26664o(6145);
            }
        }
        if (this.f191267s.f190992d) {
            VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_USING);
            C30031g gVar8 = this.f191251c;
            float f3 = this.f191222bB;
            if (gVar8.f71706s && gVar8.f71689b != null && !gVar8.f71692e) {
                gVar8.f71689b.startRecording((double) f3, false);
            }
        }
        return i;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final void mo131011b(float f) {
        this.f191251c.mo53315c(f);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: c */
    public final int mo131022c(float f, float f2) {
        return this.f191251c.mo53312c(f, f2);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: d */
    public final int mo131030d(float f, float f2) {
        return this.f191251c.mo53322d(f, f2);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: e */
    public final int mo131038e(float f, float f2) {
        return this.f191251c.mo53329e(f, f2);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: d */
    public final int mo131031d(int i, int i2) {
        mo131017b(new RunnableC85463f(this, i, i2));
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final int mo131004b(float f, float f2) {
        return this.f191251c.mo53293b(f, f2);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: c */
    public final int mo131023c(int i, int i2) {
        C85315al.m146637a(f191200a, "removeTrack trackIndex " + i2 + " trackType " + i);
        if (m146955H()) {
            return this.f191251c.mo53348i(i, i2);
        }
        return mo130955a(this.f191253d, this.f191254e, this.f191255f, this.f191256g);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: d */
    public final int mo131033d(String str, String str2) {
        return this.f191251c.mo53324d(str, str2);
    }

    @Override // com.p2082ss.android.medialib.RecordInvoker.OnRunningErrorCallback
    public void onAccurateInfo(int i, double d) {
        switch (i) {
            case 1072:
                this.f191533bm = d;
                break;
            case 1073:
                this.f191534bn = d;
                break;
            case 1074:
                this.f191536bp = d;
                break;
            case 1075:
                this.f191535bo = d;
                break;
        }
        if (i == C85310ah.f190965y || i == C85310ah.f190966z || i == C85310ah.f190918F || i == C85310ah.f190922J) {
            mo130968a(i, 0, (float) d, "");
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130930a(float f, float f2) {
        this.f191476aH.f73359c = f;
        this.f191476aH.f73360d = f2;
        this.f191251c.mo53237a(f, f2);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final int mo131008b(String str, float f) {
        this.f191478aJ.f73366a = str;
        this.f191478aJ.f73369d = f;
        this.f191478aJ.f73370e = f;
        this.f191478aJ.f73371f = true;
        if (TextUtils.isEmpty(str)) {
            this.f191251c.mo53306b("");
            return 0;
        }
        this.f191251c.mo53306b(str);
        return 0;
    }

    public C85410d(Context context, AbstractC85556e eVar) {
        super(context, eVar, null);
        VESize vESize = new VESize(1280, 720);
        this.f191248bx = vESize;
        this.f191261l = vESize;
        this.f191262m = -1;
        this.f191265q = new VESize(0, 0);
        this.f191226bF = false;
        this.f191266r = 0;
        this.f191227bG = false;
        this.f191268t = null;
        this.f191228bH = null;
        this.f191269u = 0;
        this.f191229bI = false;
        this.f191270v = new C85510h();
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        this.f191230bJ = C40780g.m82242a(a.mo70028a());
        this.f191271w = new C85297a<>();
        this.f191231bK = new Object();
        this.f191233bM = null;
        this.f191274z = 3;
        this.f191202A = false;
        this.f191203B = new ConditionVariable();
        this.f191234bN = false;
        this.f191235bO = false;
        this.f191236bP = false;
        this.f191204C = true;
        this.f191205D = new C85380b();
        this.f191237bQ = 0;
        this.f191238bR = false;
        this.f191239bS = false;
        this.f191206E = false;
        this.f191207F = false;
        this.f191240bT = false;
        this.f191241bU = false;
        this.f191242bV = new AbstractC85340h() {
            /* class com.p2082ss.android.vesdk.C85410d.C854111 */

            static {
                Covode.recordClassIndex(99532);
            }

            @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
            public final void onError(int i, int i2, String str) {
            }

            @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
            public final void onReceive(C85342j jVar) {
                if (jVar.f191054a instanceof C85342j.C85343a) {
                    C85410d.this.f191251c.mo53225a(((C85342j.C85343a) jVar.f191054a).f191057a, jVar.f191055b, jVar.f191056c);
                } else if (C85410d.this.f191215N != null) {
                    C85410d.this.f191215N.onReceive(jVar);
                }
            }

            @Override // com.p2082ss.android.vesdk.audio.AbstractC85340h
            public final void onInfo(int i, int i2, double d, Object obj) {
                if (i != C85310ah.f190925M) {
                    return;
                }
                if (i2 == 0) {
                    C85521l lVar = (C85521l) obj;
                    C85410d.this.f191251c.initAudioConfig(lVar.f191576b, lVar.f191575a, C85410d.this.f191515au.f190618c, C85410d.this.f191515au.f190620e, C85410d.this.f191515au.f190619d);
                    C85315al.m146637a(C85410d.f191200a, "mVEAudioCapture inited: channelCount:" + lVar.f191575a + " sampleHz:" + lVar.f191576b + " encode sample rate:" + C85410d.this.f191515au.f190618c + " encode channel count:" + C85410d.this.f191515au.f190620e);
                    if (lVar.f191579e == 1 && C85410d.this.f191215N != null) {
                        C85410d.this.f191215N.onInfo(i, 0, d, obj);
                    }
                    C85410d.this.f191213L = 2;
                    return;
                }
                C85315al.m146637a(C85410d.f191200a, "initAudio error:".concat(String.valueOf(i2)));
                C85410d.this.f191213L = 0;
            }
        };
        this.f191243bW = false;
        this.f191244bX = false;
        this.f191245bY = -16;
        this.f191210I = null;
        this.f191211J = -1;
        this.f191212K = -1;
        this.f191246bZ = new C85521l.C85522a().f191584a;
        this.f191213L = 0;
        this.f191214M = EnumC85329au.DEFAULT;
        this.f191217P = new LandMarkFrame();
        this.f191218Q = C85386ba.m146900a();
        this.f191219R = new C85456b.AbstractC85458b() {
            /* class com.p2082ss.android.vesdk.C85410d.C8542421 */

            /* renamed from: b */
            private float f191307b = -1.0f;

            static {
                Covode.recordClassIndex(99545);
            }

            @Override // com.p2082ss.android.vesdk.p4388d.C85456b.AbstractC85457a, com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
            public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
                C85410d.this.f191251c.f71710w = surfaceTexture;
                C85410d.this.f191270v.f191547b = surfaceTexture;
            }

            @Override // com.p2082ss.android.vesdk.p4388d.C85456b.AbstractC85457a
            /* renamed from: a */
            public final void mo131089a(TEFrameSizei tEFrameSizei) {
                C85410d.this.f191251c.mo53342g(tEFrameSizei.f73616a, tEFrameSizei.f73617b);
            }

            @Override // com.p2082ss.android.vesdk.p4388d.C85456b.AbstractC85458b
            /* renamed from: a */
            public final void mo131090a(Object obj) {
                boolean z;
                C85510h hVar = C85410d.this.f191270v;
                if (obj != null) {
                    z = true;
                } else {
                    z = false;
                }
                hVar.f191551f = z;
                C85410d.this.f191251c.mo53270a(obj);
            }

            @Override // com.p2082ss.android.vesdk.p4388d.C85456b.AbstractC85457a, com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
            public final void onFrameCaptured(C30844i iVar) {
                MethodCollector.m26663i(8435);
                long currentTimeMillis = System.currentTimeMillis();
                if (C85410d.this.f191269u == 0) {
                    C85315al.m146641c(C85410d.f191200a, "Frame captured in idle status!");
                    MethodCollector.m26664o(8435);
                    return;
                }
                int i = 1;
                if (!C85410d.this.f191207F) {
                    this.f191307b = ((Float) C85568t.m147473a().mo131557a("ve_recorder_fps_downgrade", Float.valueOf(-1.0f))).floatValue();
                    C85315al.m146637a(C85410d.f191200a, "camera texture size : [ " + C85410d.this.f191260k.width + "," + C85410d.this.f191260k.height + "]");
                    C85410d.this.f191207F = true;
                }
                if (!(C85410d.this.f191260k.width == iVar.f73882c.f73897c.f73616a && C85410d.this.f191260k.height == iVar.f73882c.f73897c.f73617b)) {
                    C85410d.this.f191260k.width = iVar.f73882c.f73897c.f73616a;
                    C85410d.this.f191260k.height = iVar.f73882c.f73897c.f73617b;
                }
                if (!(C85410d.this.f191266r == iVar.f73882c.f73902h && C85410d.this.f191262m == iVar.f73882c.f73900f)) {
                    synchronized (C85410d.f191201o) {
                        try {
                            C85410d.this.f191266r = iVar.f73882c.f73902h;
                            C85410d.this.f191262m = iVar.f73882c.f73900f;
                            C85410d.this.f191263n = true;
                        } catch (Throwable th) {
                            MethodCollector.m26664o(8435);
                            throw th;
                        }
                    }
                }
                C30844i.EnumC30847b bVar = iVar.f73882c.f73898d;
                float[] fArr = null;
                C30972p pVar = null;
                byte[] bArr = null;
                if (bVar == C30844i.EnumC30847b.PIXEL_FORMAT_OpenGL_OES || bVar == C30844i.EnumC30847b.PIXEL_FORMAT_Recorder) {
                    int i2 = 0;
                    if (C85410d.this.f191218Q.f191131e) {
                        C85410d.this.f191217P.setInfo(C85410d.this.f191218Q.f191128b, C85410d.this.f191218Q.f191129c, C85410d.this.f191218Q.f191130d);
                        C85410d.this.f191251c.mo53387y(true);
                        C85410d.this.f191251c.mo53266a(C85410d.this.f191217P);
                    } else {
                        C85410d.this.f191251c.mo53387y(false);
                    }
                    if (C85410d.this.f191269u == 3) {
                        double b = C85410d.this.f191270v.mo131338b();
                        C85380b bVar2 = C85410d.this.f191205D;
                        if (bVar2.f191124f) {
                            if (bVar2.f191119a.size() == 0) {
                                bVar2.f191123e = System.currentTimeMillis();
                                bVar2.f191119a.offer(Double.valueOf(0.0d));
                            } else {
                                bVar2.f191119a.add(Double.valueOf(b - bVar2.f191120b));
                            }
                            bVar2.f191120b = b;
                        }
                    }
                    C30031g gVar = C85410d.this.f191251c;
                    if (iVar.f73882c instanceof C30844i.C30849d) {
                        i2 = ((C30844i.C30849d) iVar.f73882c).f73895a;
                    }
                    if (iVar.f73882c instanceof C30844i.C30849d) {
                        fArr = ((C30844i.C30849d) iVar.f73882c).f73896b;
                    }
                    gVar.mo53204a(i2, fArr, C85410d.this.f191272x.f191390i);
                } else if (iVar.f73882c.f73899e == 3) {
                    if (iVar.f73882c instanceof C30844i.C30851f) {
                        pVar = ((C30844i.C30851f) iVar.f73882c).f73903a;
                    }
                    ImageFrame imageFrame = new ImageFrame(TEPlanUtils.convert(pVar), -2, iVar.f73882c.f73897c.f73616a, iVar.f73882c.f73897c.f73617b);
                    if (C85410d.this.f191513as == null || C85410d.this.f191513as.f190723x == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                        C85410d.this.f191251c.mo53291b((double) (iVar.f73880a / 1000));
                        C85410d.this.f191251c.mo53214a(imageFrame, C85410d.this.f191272x.f191390i);
                    } else if (C85410d.this.f191513as.f190723x == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                        C85410d.this.f191251c.mo53213a(imageFrame, C85410d.this.f191270v.f191546a, C85410d.this.f191272x.f191390i);
                    }
                } else if (bVar == C30844i.EnumC30847b.PIXEL_FORMAT_NV21 || bVar == C30844i.EnumC30847b.PIXEL_FORMAT_JPEG) {
                    if (bVar == C30844i.EnumC30847b.PIXEL_FORMAT_NV21) {
                        i = -3;
                    }
                    if (iVar.f73882c instanceof C30844i.C30846a) {
                        bArr = ((C30844i.C30846a) iVar.f73882c).f73887b;
                    }
                    ImageFrame imageFrame2 = new ImageFrame(bArr, i, iVar.f73882c.f73897c.f73616a, iVar.f73882c.f73897c.f73617b);
                    if (C85410d.this.f191513as == null || C85410d.this.f191513as.f190723x == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                        C85410d.this.f191251c.mo53291b((double) (iVar.f73880a / 1000));
                        C85410d.this.f191251c.mo53214a(imageFrame2, C85410d.this.f191272x.f191390i);
                    } else if (C85410d.this.f191513as.f190723x == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                        C85410d.this.f191251c.mo53213a(imageFrame2, C85410d.this.f191270v.f191546a, C85410d.this.f191272x.f191390i);
                    }
                } else {
                    C85315al.m146642d(C85410d.f191200a, "Not support now!!");
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                float f = this.f191307b;
                if (f > 0.001f) {
                    double d = (double) f;
                    Double.isNaN(d);
                    long j = (long) (1000.0d / d);
                    if (j > currentTimeMillis2) {
                        long j2 = j - currentTimeMillis2;
                        try {
                            Thread.sleep(j2);
                            C85315al.m146639b(C85410d.f191200a, "FrameSleep: " + j2 + "ms");
                            MethodCollector.m26664o(8435);
                            return;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                MethodCollector.m26664o(8435);
            }

            @Override // com.p2082ss.android.vesdk.p4388d.C85456b.AbstractC85458b
            /* renamed from: a */
            public final void mo131088a(SurfaceTexture surfaceTexture, boolean z) {
                onNewSurfaceTexture(surfaceTexture);
                C85410d.this.f191270v.f191550e = true;
            }
        };
        this.f191252ca = new C29983a.AbstractC29985b() {
            /* class com.p2082ss.android.vesdk.C85410d.C8542522 */

            static {
                Covode.recordClassIndex(99546);
            }

            @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29985b
            /* renamed from: b */
            public final void mo52798b() {
                C85315al.m146643e(C85410d.f191200a, "onOpenGLDestroy");
                C85410d.this.f191268t = null;
                C85510h hVar = C85410d.this.f191270v;
                if (hVar.f191547b != null) {
                    hVar.f191547b.release();
                    hVar.f191547b = null;
                }
                if (hVar.f191546a != 0) {
                    GLES20.glDeleteTextures(1, new int[]{hVar.f191546a}, 0);
                    hVar.f191546a = 0;
                }
                C85410d.this.f191271w.mo130622b(C85410d.this.f191272x);
                if (C85410d.this.f191208G != null) {
                    C30842a aVar = C85410d.this.f191208G;
                    C30969o.m63687b("TEMediaRecorder", "[schedule] releaseMediaRecorder");
                    if (aVar.f73869a != null) {
                        if ((C30969o.f74248b & 16) != 0) {
                            C30969o.f74249c.Log((byte) 16, C30969o.f74247a + "TEMediaRecorder", "Releasing media recorder.");
                        }
                        try {
                            aVar.f73869a.reset();
                        } catch (IllegalStateException e) {
                            C30969o.m63689d("TEMediaRecorder", "media recorder maybe has been released! msg=" + e.getMessage());
                            if (aVar.f73876h != null) {
                                aVar.f73876h.mo55865a();
                            }
                        }
                        aVar.mo55863a();
                        MediaRecorder mediaRecorder = aVar.f73869a;
                        if (!((Boolean) C15346a.m28238a(mediaRecorder, new Object[0], 100501, "void", false, null).first).booleanValue()) {
                            mediaRecorder.release();
                            C15346a.m28240a(null, mediaRecorder, new Object[0], 100501, "com_ss_android_ttvecamera_mediarecorder_TEMediaRecorder_android_media_MediaRecorder_release(Landroid/media/MediaRecorder;)V");
                        }
                        aVar.f73869a = null;
                        if (aVar.f73871c != null) {
                            aVar.f73871c.quitSafely();
                            try {
                                aVar.f73871c.join();
                                aVar.f73871c = null;
                                aVar.f73872d = null;
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    C85410d.this.f191208G = null;
                }
                VEListener.AbstractC85230ai aiVar = C85410d.this.f191465W;
                if (aiVar instanceof VEListener.AbstractC85229ah) {
                    ((VEListener.AbstractC85229ah) aiVar).mo56559a(1001, 0, "Render Env Destroyed.");
                }
            }

            @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29985b
            /* renamed from: c */
            public final int mo52799c() {
                boolean z;
                float f;
                int i;
                MethodCollector.m26663i(8756);
                if (C85410d.this.f191263n) {
                    synchronized (C85410d.f191201o) {
                        try {
                            if (C85410d.this.f191260k.width > 0 && C85410d.this.f191260k.height > 0) {
                                if (!C85410d.this.f191272x.f191388g) {
                                    f = (float) C85410d.this.f191260k.width;
                                    i = C85410d.this.f191260k.height;
                                } else {
                                    f = (float) C85410d.this.f191260k.height;
                                    i = C85410d.this.f191260k.width;
                                }
                                C85410d.this.f191251c.mo53240a(f / ((float) i), C85410d.this.f191260k.width, C85410d.this.f191260k.height);
                            }
                            boolean z2 = true;
                            if (C85410d.this.f191266r == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (C85410d.this.f191266r != 2) {
                                z2 = false;
                            }
                            C85410d.this.f191251c.mo53246a(C85410d.this.f191262m, z, z2);
                            C85410d.this.f191263n = false;
                        } catch (Throwable th) {
                            MethodCollector.m26664o(8756);
                            throw th;
                        }
                    }
                }
                if (C85410d.this.f191513as == null || C85410d.this.f191513as.f190723x != VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                    try {
                        C85410d.this.f191270v.mo131337a();
                        if (C85410d.this.f191264p) {
                            MethodCollector.m26664o(8756);
                            return -1000;
                        }
                        if (C85410d.this.f191270v.f191547b != null) {
                            C85410d.this.f191251c.mo53291b(C85410d.this.f191270v.mo131338b());
                        }
                        MethodCollector.m26664o(8756);
                        return 0;
                    } catch (Exception e) {
                        C85315al.m146642d(C85410d.f191200a, "onOpenGLRunning error msg: " + e.getMessage() + ", is can retry = " + C85410d.this.f191270v.f191550e);
                        if (C85410d.this.f191270v.f191550e) {
                            try {
                                C85410d.this.f191270v.f191547b.detachFromGLContext();
                                C85410d.this.f191270v.mo131337a();
                            } catch (Exception unused) {
                                C85315al.m146642d(C85410d.f191200a, "onOpenGLRunning error msg: " + e.getMessage() + ", retry failed!!!");
                            }
                        }
                    }
                } else {
                    if (C85410d.this.f191513as.mo130183a() == VECameraSettings.CAMERA_TYPE.TYPE1) {
                        try {
                            if (C85410d.this.f191513as.f190681K.getBoolean("forceRunUpdateTexImg", false)) {
                                C85410d.this.f191270v.mo131337a();
                            }
                        } catch (Exception e2) {
                            C85315al.m146642d(C85410d.f191200a, "onOpenGLRunning error: " + e2.getMessage());
                        }
                    }
                    if (C85410d.this.f191264p) {
                        MethodCollector.m26664o(8756);
                        return -1000;
                    }
                    MethodCollector.m26664o(8756);
                    return 0;
                }
            }

            @Override // com.p2082ss.android.medialib.p2155b.C29983a.AbstractC29985b
            /* renamed from: a */
            public final void mo52797a() {
                int i;
                int i2;
                C85315al.m146643e(C85410d.f191200a, "onOpenGLCreate");
                C85410d.this.f191271w = new C85297a<>();
                C85510h hVar = C85410d.this.f191270v;
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(36197, iArr[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                hVar.f191546a = iArr[0];
                hVar.f191547b = new C85462a(hVar.f191546a);
                hVar.f191547b.setOnFrameAvailableListener(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: INVOKE  
                      (wrap: android.graphics.SurfaceTexture : 0x0049: IGET  (r1v5 android.graphics.SurfaceTexture) = (r5v0 'hVar' com.ss.android.vesdk.h) com.ss.android.vesdk.h.b android.graphics.SurfaceTexture)
                      (wrap: com.ss.android.vesdk.h$1 : 0x004d: CONSTRUCTOR  (r0v10 com.ss.android.vesdk.h$1) = (r5v0 'hVar' com.ss.android.vesdk.h) call: com.ss.android.vesdk.h.1.<init>(com.ss.android.vesdk.h):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.graphics.SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener):void in method: com.ss.android.vesdk.d.22.a():void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: CONSTRUCTOR  (r0v10 com.ss.android.vesdk.h$1) = (r5v0 'hVar' com.ss.android.vesdk.h) call: com.ss.android.vesdk.h.1.<init>(com.ss.android.vesdk.h):void type: CONSTRUCTOR in method: com.ss.android.vesdk.d.22.a():void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 14 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.vesdk.h, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 20 more
                    */
                /*
                // Method dump skipped, instructions count: 659
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85410d.C8542522.mo52797a():void");
            }
        };
        if (this.f191462T != null) {
            this.f191462T.f191559c.mo130620a(this);
        }
        C30031g gVar = new C30031g();
        this.f191251c = gVar;
        gVar.f71694g = new C30031g.AbstractC30043a() {
            /* class com.p2082ss.android.vesdk.C85410d.C8541311 */

            static {
                Covode.recordClassIndex(99534);
            }

            @Override // com.p2082ss.android.medialib.presenter.C30031g.AbstractC30043a
            /* renamed from: a */
            public final void mo53391a(int i, int i2) {
                C85410d.this.f191211J = i;
                C85410d.this.f191212K = i2;
            }
        };
        this.f191251c.mo53260a(this.f191252ca);
        C30695h.m63065a("iesve_use_new_record", 1L);
        this.f191239bS = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_stop_preview_optimize", (Object) false)).booleanValue();
        this.f191216O = new C85402b(this.f191251c, this);
        this.f191540bt = new C30929b();
        this.f191539bs = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_vboost", (Object) false)).booleanValue();
        if (this.f191539bs) {
            this.f191540bt.mo56037a(new C30932c());
            this.f191540bt.mo56036a();
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130932a(int i, float f) {
        if (i == 1) {
            this.f191476aH.f73360d = f;
        } else if (i == 2) {
            this.f191476aH.f73359c = f;
        } else if (i == 4) {
            this.f191479aK.f73374b = f;
        } else if (i != 5) {
            switch (i) {
                case 17:
                    this.f191480aL.f73362b = f;
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    this.f191480aL.f73363c = f;
                    break;
                case 19:
                    this.f191480aL.f73364d = f;
                    break;
                case C84224v.f188239U:
                    this.f191480aL.f73365e = f;
                    break;
            }
        } else {
            this.f191479aK.f73375c = f;
        }
        this.f191251c.mo53196a(i, f);
        return 0;
    }

    @Override // com.p2082ss.android.medialib.RecordInvoker.OnRunningErrorCallback
    public void onInfo(int i, int i2) {
        String str;
        if (i == 1051) {
            this.f191532bl = (float) i2;
            C85315al.m146639b(f191200a, "onInfo: " + i + "; INFO_PREVIEW_DROP_FPS:" + this.f191532bl);
        } else if (i == 1052) {
            this.f191525be = (float) i2;
            C85315al.m146639b(f191200a, "onInfo: " + i + "; INFO_RECORD_RENDER_DROP_FPS:" + this.f191525be);
        } else if (i != 1070) {
            switch (i) {
                case 1040:
                    this.f191521ba = i2;
                    break;
                case 1041:
                    this.f191522bb = i2;
                    break;
                case 1042:
                    if (i2 != 0) {
                        this.f191524bd = 1000.0f / ((float) i2);
                    }
                    C85315al.m146639b(f191200a, "onInfo: " + i + "; TET_RECORD_RENDER_FPS:" + this.f191524bd);
                    break;
                case 1043:
                    this.f191523bc = i2;
                    break;
                case 1044:
                    this.f191528bh = i2;
                    break;
                case 1045:
                    this.f191529bi = i2;
                    break;
                case 1046:
                    this.f191530bj = i2;
                    break;
                case 1047:
                    if (i2 != 0) {
                        this.f191531bk = 1000.0f / ((float) i2);
                        break;
                    }
                    break;
                case 1048:
                    this.f191526bf = i2;
                    break;
                case 1049:
                    this.f191527bg = ((float) i2) / 1000.0f;
                    break;
            }
        } else {
            this.f191203B.open();
            C85315al.m146637a(f191200a, "turn to off-screen render");
        }
        C85315al.m146639b(f191200a, "onInfo: " + i + "ext:" + i2);
        if (i == 1030) {
            str = "shotScreen...";
        } else if (i == 1050) {
            str = String.valueOf(System.currentTimeMillis());
        } else {
            str = "";
        }
        if (this.f191465W instanceof VEListener.AbstractC85229ah) {
            ((VEListener.AbstractC85229ah) this.f191465W).mo56559a(i, i2, str);
        }
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final int mo131010b(String[] strArr, int i) {
        return this.f191251c.mo53313c(strArr, i);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: c */
    public final int[] mo131029c(String str, String str2) {
        return this.f191251c.mo53319c(str, str2);
    }

    /* renamed from: a */
    private int m146957a(final String str, final long j, final long j2) {
        mo131017b(new Runnable() {
            /* class com.p2082ss.android.vesdk.C85410d.RunnableC8544943 */

            /* renamed from: d */
            final /* synthetic */ int f191367d = 2;

            static {
                Covode.recordClassIndex(99570);
            }

            public final void run() {
                MethodCollector.m26663i(7820);
                synchronized (C85410d.this) {
                    try {
                        if (C85410d.this.f191269u == 3) {
                            C85315al.m146642d(C85410d.f191200a, "setRecordBGM could not be executed in state: " + C85410d.this.f191269u);
                        } else if (!C85410d.this.f191204C) {
                            C85315al.m146642d(C85410d.f191200a, "setRecordBGM could not be executed, after startPrePlay");
                            MethodCollector.m26664o(7820);
                        } else {
                            C85410d.super.mo130955a((C85410d) str, (String) j, j2, (long) this.f191367d);
                            C30031g a = C85410d.this.f191251c.mo53233a(str);
                            boolean z = true;
                            if (C85410d.this.f191472aD != 1) {
                                z = false;
                            }
                            a.f71691d = z;
                            a.mo53232a(C85410d.this.f191470aB, C85410d.this.f191471aC, C85410d.this.f191258i);
                            C85410d dVar = C85410d.this;
                            dVar.mo131026c(dVar.mo131024c(false));
                            C85410d.this.f191251c.mo53296b(C85410d.this.f191461S, C85410d.this.mo131024c(false), C85410d.this);
                            MethodCollector.m26664o(7820);
                        }
                    } finally {
                        MethodCollector.m26664o(7820);
                    }
                }
            }
        });
        return 0;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int initWavFile(int i, int i2, double d) {
        C85315al.m146639b(f191200a, "initWavFile...");
        this.f191211J = i;
        this.f191212K = i2;
        return 0;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int addPCMData(byte[] bArr, int i, long j) {
        String str = f191200a;
        C85315al.m146639b(str, "addPCMData...");
        if (this.f191211J != -1) {
            if (!(this.f191515au == null || !this.f191492aX || this.f191507am == null)) {
                TEVideoUtils.getAudioVolume(bArr, this.f191211J, this.f191212K, i);
            }
            if (!(this.f191515au == null || this.f191510ap == null)) {
                String a = this.f191510ap.mo130309a();
                if (TextUtils.isEmpty(a)) {
                    C85315al.m146642d(str, "modePath is empty");
                } else {
                    if (this.f191511aq == -1) {
                        C85315al.m146637a(str, "load model");
                        this.f191511aq = TEVideoUtils.loadModel(this.f191211J, a);
                    }
                    if (this.f191511aq != -1) {
                        TEVideoUtils.voiceActivityDetection(bArr, this.f191511aq, this.f191212K, i);
                    }
                    if (this.f191243bW) {
                        this.f191243bW = false;
                        m146953F();
                    }
                }
            }
        }
        if (this.f191467Y != null) {
            Arrays.copyOf(bArr, i);
        }
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final int mo131009b(String str, float f, float f2) {
        this.f191480aL.f73361a = str;
        this.f191480aL.f73362b = f;
        this.f191480aL.f73363c = f2;
        this.f191251c.mo53297b(C85578b.m147483a(str), f, f2);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130934a(int i, int i2, long j) {
        C85315al.m146637a(f191200a, "seekTrack trackIndex " + i + " trackType " + i2 + " timeInMS 0");
        return this.f191251c.mo53198a(i, i2, 0L);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: b */
    public final int mo131003b(double d, double d2, double d3, double d4) {
        return this.f191251c.mo53292b(d, d2, d3, d4);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: c */
    public final int mo131021c(double d, double d2, double d3, double d4) {
        return this.f191251c.mo53311c(d, d2, d3, d4);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130928a(double d, double d2, double d3, double d4) {
        return this.f191251c.mo53193a(d, d2, d3, d4);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130933a(int i, float f, float f2, int i2) {
        return this.f191251c.mo53197a(i, f, f2, i2);
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85508g
    /* renamed from: a */
    public final int mo130931a(float f, float f2, float f3, float f4, float f5) {
        return this.f191251c.mo53195a(f, f2, f3, f4, f5);
    }
}
