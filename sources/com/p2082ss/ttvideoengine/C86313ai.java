package com.p2082ss.ttvideoengine;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.webkit.URLUtil;
import com.C1764a;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.vcloud.abrmodule.ABRAudioStream;
import com.bytedance.vcloud.abrmodule.ABRBufferInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.abrmodule.ABRResult;
import com.bytedance.vcloud.abrmodule.ABRResultElement;
import com.bytedance.vcloud.abrmodule.ABRVideoStream;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.bytedance.vcloud.abrmodule.IABRInfoListener;
import com.bytedance.vcloud.abrmodule.IABRModule;
import com.bytedance.vcloud.abrmodule.IABRModuleSpeedRecord;
import com.bytedance.vcloud.abrmodule.IAudioStream;
import com.bytedance.vcloud.abrmodule.IBufferInfo;
import com.bytedance.vcloud.abrmodule.IPlayStateSupplier;
import com.bytedance.vcloud.abrmodule.ISegmentInfo;
import com.bytedance.vcloud.abrmodule.IVideoStream;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.texturerender.AbstractC86206n;
import com.p2082ss.texturerender.C86195e;
import com.p2082ss.texturerender.C86203l;
import com.p2082ss.texturerender.C86205m;
import com.p2082ss.texturerender.VideoSurface;
import com.p2082ss.texturerender.p4404a.C86174d;
import com.p2082ss.ttm.player.AbstractC86246f;
import com.p2082ss.ttm.player.AbstractC86253m;
import com.p2082ss.ttm.player.AudioProcessor;
import com.p2082ss.ttm.player.C86275p;
import com.p2082ss.ttm.player.C86277r;
import com.p2082ss.ttm.player.IMediaDataSource;
import com.p2082ss.ttm.player.LoadControl;
import com.p2082ss.ttm.player.MaskInfo;
import com.p2082ss.ttm.player.NativeAudioProcessor;
import com.p2082ss.ttm.player.SubInfo;
import com.p2082ss.ttvideoengine.C86307af;
import com.p2082ss.ttvideoengine.C86347ap;
import com.p2082ss.ttvideoengine.C86372bd;
import com.p2082ss.ttvideoengine.C86377bf;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.p4407a.C86300b;
import com.p2082ss.ttvideoengine.p4409c.C86381b;
import com.p2082ss.ttvideoengine.p4409c.C86383c;
import com.p2082ss.ttvideoengine.p4410d.C86409d;
import com.p2082ss.ttvideoengine.p4412f.C86430b;
import com.p2082ss.ttvideoengine.p4412f.C86433d;
import com.p2082ss.ttvideoengine.p4412f.C86437e;
import com.p2082ss.ttvideoengine.p4412f.p4413a.AbstractC86427b;
import com.p2082ss.ttvideoengine.p4412f.p4413a.C86426a;
import com.p2082ss.ttvideoengine.p4415h.AbstractC86462f;
import com.p2082ss.ttvideoengine.p4415h.AbstractC86463g;
import com.p2082ss.ttvideoengine.p4415h.AbstractC86468j;
import com.p2082ss.ttvideoengine.p4415h.C86449aa;
import com.p2082ss.ttvideoengine.p4415h.C86459d;
import com.p2082ss.ttvideoengine.p4415h.C86464h;
import com.p2082ss.ttvideoengine.p4415h.C86481r;
import com.p2082ss.ttvideoengine.p4416i.AbstractC86508b;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86514c;
import com.p2082ss.ttvideoengine.p4417j.C86520f;
import com.p2082ss.ttvideoengine.p4417j.C86528i;
import com.p2082ss.ttvideoengine.p4417j.C86529j;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4417j.C86537q;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86543b;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import com.p2082ss.ttvideoengine.p4418k.C86544c;
import com.p2082ss.ttvideoengine.p4418k.C86555h;
import com.p2082ss.ttvideoengine.p4420m.C86573a;
import com.p2082ss.ttvideoengine.p4421n.C86575a;
import com.p2082ss.ttvideoengine.p4421n.p4422a.C86576a;
import com.p2082ss.ttvideoengine.p4421n.p4423b.AbstractC86586h;
import com.p2082ss.ttvideoengine.p4421n.p4424c.C86590a;
import com.p2082ss.ttvideoengine.p4421n.p4424c.C86591b;
import com.p2082ss.ttvideoengine.p4425o.C86594a;
import com.p2082ss.ttvideoengine.p4426p.p4427a.C86606b;
import com.p2082ss.ttvideoengine.p4428q.C86614c;
import com.p2082ss.ttvideoengine.p4428q.C86615d;
import com.p2082ss.ttvideoengine.p4428q.C86617e;
import com.p2082ss.ttvideoengine.p4428q.C86622f;
import com.p2082ss.ttvideoengine.p4429r.AbstractC86626b;
import com.p2082ss.ttvideoengine.p4429r.C86627c;
import com.p2082ss.ttvideoengine.p4429r.C86628d;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86635e;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import com.p2082ss.ttvideoengine.p4430s.C86643k;
import com.p2082ss.ttvideoengine.p4430s.C86644l;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.ai */
public final class C86313ai {

    /* renamed from: a */
    public static String f192837a = C86594a.f195105b;

    /* renamed from: b */
    public static String f192838b = C86594a.f195106c;

    /* renamed from: bB */
    public static boolean f192839bB = false;

    /* renamed from: bS */
    public static C86590a f192840bS = null;

    /* renamed from: bZ */
    public static int f192841bZ = 0;

    /* renamed from: bd */
    static boolean f192842bd;

    /* renamed from: c */
    public static String f192843c = C86594a.f195107d;

    /* renamed from: cG */
    private static int f192844cG = 2400;

    /* renamed from: cH */
    private static boolean f192845cH;

    /* renamed from: ca */
    public static int f192846ca = 500;

    /* renamed from: cb */
    public static int f192847cb = 0;

    /* renamed from: cc */
    public static int f192848cc = 100;

    /* renamed from: cd */
    public static int f192849cd = 0;

    /* renamed from: ce */
    public static int f192850ce = 0;

    /* renamed from: cf */
    public static int f192851cf = 0;

    /* renamed from: cj */
    public static String[] f192852cj = new String[0];

    /* renamed from: d */
    public static AbstractC86411e f192853d;

    /* renamed from: dd */
    private static int f192854dd = -1;

    /* renamed from: eg */
    private static int f192855eg;

    /* renamed from: fJ */
    private static C86203l.AbstractC86204a f192856fJ = null;

    /* renamed from: fy */
    private static boolean f192857fy = true;

    /* renamed from: fz */
    private static Lock f192858fz = new ReentrantLock();

    /* renamed from: hq */
    private static boolean f192859hq = false;

    /* renamed from: i */
    public static boolean f192860i;

    /* renamed from: j */
    public static int[] f192861j;

    /* renamed from: jb */
    private static C86430b f192862jb;

    /* renamed from: k */
    public static int f192863k;

    /* renamed from: A */
    public int f192864A;

    /* renamed from: B */
    public String f192865B;

    /* renamed from: C */
    public int f192866C;

    /* renamed from: D */
    public boolean f192867D;

    /* renamed from: E */
    public C86275p f192868E;

    /* renamed from: F */
    public HashMap<String, String> f192869F;

    /* renamed from: G */
    public AbstractC86561j f192870G;

    /* renamed from: H */
    public AbstractC86443g f192871H;

    /* renamed from: I */
    public AbstractC86302aa f192872I;

    /* renamed from: J */
    AbstractC86362aw f192873J;

    /* renamed from: K */
    AbstractC86369ba f192874K;

    /* renamed from: L */
    AbstractC86303ab f192875L;

    /* renamed from: M */
    public C86304ac f192876M;

    /* renamed from: N */
    AbstractC86376be f192877N;

    /* renamed from: O */
    public AbstractC86364ay f192878O;

    /* renamed from: P */
    AbstractC86651x f192879P;

    /* renamed from: Q */
    public AbstractC86379c f192880Q;

    /* renamed from: R */
    public AbstractC86652y f192881R;

    /* renamed from: S */
    public AbstractC86463g f192882S;

    /* renamed from: T */
    AbstractC86355au f192883T;

    /* renamed from: U */
    public AbstractC86354at f192884U;

    /* renamed from: V */
    public AbstractC86298a f192885V;

    /* renamed from: W */
    public AbstractC86650w f192886W;

    /* renamed from: X */
    public C86593o f192887X;

    /* renamed from: Y */
    public AbstractC86363ax f192888Y;

    /* renamed from: Z */
    public String f192889Z;

    /* renamed from: aA */
    public int f192890aA;

    /* renamed from: aB */
    public boolean f192891aB;

    /* renamed from: aC */
    String f192892aC;

    /* renamed from: aD */
    String f192893aD;

    /* renamed from: aE */
    String f192894aE;

    /* renamed from: aF */
    public boolean f192895aF;

    /* renamed from: aG */
    public boolean f192896aG;

    /* renamed from: aH */
    public String f192897aH;

    /* renamed from: aI */
    public String f192898aI;

    /* renamed from: aJ */
    public String f192899aJ;

    /* renamed from: aK */
    public boolean f192900aK;

    /* renamed from: aL */
    C86573a f192901aL;

    /* renamed from: aM */
    boolean f192902aM;

    /* renamed from: aN */
    C86351aq f192903aN;

    /* renamed from: aO */
    public int f192904aO;

    /* renamed from: aP */
    public boolean f192905aP;

    /* renamed from: aQ */
    public boolean f192906aQ;

    /* renamed from: aR */
    public C86633c f192907aR;

    /* renamed from: aS */
    boolean f192908aS;

    /* renamed from: aT */
    boolean f192909aT;

    /* renamed from: aU */
    boolean f192910aU;

    /* renamed from: aV */
    public boolean f192911aV;

    /* renamed from: aW */
    public boolean f192912aW;

    /* renamed from: aX */
    public boolean f192913aX;

    /* renamed from: aY */
    public boolean f192914aY;

    /* renamed from: aZ */
    public boolean f192915aZ;

    /* renamed from: aa */
    public Context f192916aa;

    /* renamed from: ab */
    public Surface f192917ab;

    /* renamed from: ac */
    public SurfaceHolder f192918ac;

    /* renamed from: ad */
    public AbstractC86517e f192919ad;

    /* renamed from: ae */
    public AbstractC86468j f192920ae;

    /* renamed from: af */
    public C86464h f192921af;

    /* renamed from: ag */
    C86437e f192922ag;

    /* renamed from: ah */
    public AbstractC86253m f192923ah;

    /* renamed from: ai */
    public long f192924ai = -1;

    /* renamed from: aj */
    public long f192925aj = -1;

    /* renamed from: ak */
    public long f192926ak = -1;

    /* renamed from: al */
    public EnumC86649v f192927al;

    /* renamed from: am */
    public long f192928am = 0;

    /* renamed from: an */
    public C86534o f192929an;

    /* renamed from: ao */
    Map<String, C86318b> f192930ao;

    /* renamed from: ap */
    public C86529j f192931ap;

    /* renamed from: aq */
    public String f192932aq;

    /* renamed from: ar */
    public boolean f192933ar;

    /* renamed from: as */
    public boolean f192934as;

    /* renamed from: at */
    long f192935at;

    /* renamed from: au */
    public boolean f192936au;

    /* renamed from: av */
    public boolean f192937av;

    /* renamed from: aw */
    public boolean f192938aw;

    /* renamed from: ax */
    public boolean f192939ax;

    /* renamed from: ay */
    public boolean f192940ay;

    /* renamed from: az */
    public int f192941az;

    /* renamed from: bA */
    public String f192942bA;

    /* renamed from: bC */
    public Handler f192943bC;

    /* renamed from: bD */
    public int f192944bD;

    /* renamed from: bE */
    public long f192945bE;

    /* renamed from: bF */
    public boolean f192946bF;

    /* renamed from: bG */
    public LoadControl f192947bG;

    /* renamed from: bH */
    public SubInfo f192948bH;

    /* renamed from: bI */
    public long f192949bI;

    /* renamed from: bJ */
    public long f192950bJ;

    /* renamed from: bK */
    public long f192951bK;

    /* renamed from: bL */
    public C86340x f192952bL;

    /* renamed from: bM */
    public String f192953bM;

    /* renamed from: bN */
    float f192954bN;

    /* renamed from: bO */
    float f192955bO;

    /* renamed from: bP */
    int f192956bP;

    /* renamed from: bQ */
    public String f192957bQ;

    /* renamed from: bR */
    String f192958bR;

    /* renamed from: bT */
    public C86591b f192959bT;

    /* renamed from: bU */
    public IABRModule f192960bU;

    /* renamed from: bV */
    public int f192961bV;

    /* renamed from: bW */
    public int f192962bW;

    /* renamed from: bX */
    int f192963bX;

    /* renamed from: bY */
    public int f192964bY;

    /* renamed from: ba */
    long f192965ba;

    /* renamed from: bb */
    public int f192966bb;

    /* renamed from: bc */
    IMediaDataSource f192967bc;

    /* renamed from: be */
    public boolean f192968be;

    /* renamed from: bf */
    public int f192969bf;

    /* renamed from: bg */
    public C86635e f192970bg;

    /* renamed from: bh */
    public boolean f192971bh;

    /* renamed from: bi */
    int f192972bi;

    /* renamed from: bj */
    public ArrayList<String> f192973bj;

    /* renamed from: bk */
    public ArrayList<String> f192974bk;

    /* renamed from: bl */
    String f192975bl;

    /* renamed from: bm */
    public int f192976bm;

    /* renamed from: bn */
    public VideoSurface f192977bn;

    /* renamed from: bo */
    public int f192978bo;

    /* renamed from: bp */
    public boolean f192979bp;

    /* renamed from: bq */
    public boolean f192980bq;

    /* renamed from: br */
    public boolean f192981br;

    /* renamed from: bs */
    public boolean f192982bs;

    /* renamed from: bt */
    public Bundle f192983bt;

    /* renamed from: bu */
    public boolean f192984bu;

    /* renamed from: bv */
    public boolean f192985bv;

    /* renamed from: bw */
    public boolean f192986bw;

    /* renamed from: bx */
    boolean f192987bx;

    /* renamed from: by */
    public C86627c f192988by;

    /* renamed from: bz */
    int f192989bz;

    /* renamed from: cA */
    public String f192990cA;

    /* renamed from: cB */
    public C86459d f192991cB;

    /* renamed from: cC */
    public int f192992cC;

    /* renamed from: cD */
    public boolean f192993cD;

    /* renamed from: cE */
    private int f192994cE = 30;

    /* renamed from: cF */
    private long f192995cF;

    /* renamed from: cI */
    private int f192996cI;

    /* renamed from: cJ */
    private boolean f192997cJ;

    /* renamed from: cK */
    private String f192998cK = "h264";

    /* renamed from: cL */
    private boolean f192999cL;

    /* renamed from: cM */
    private boolean f193000cM;

    /* renamed from: cN */
    private int f193001cN;

    /* renamed from: cO */
    private int f193002cO;

    /* renamed from: cP */
    private boolean f193003cP;

    /* renamed from: cQ */
    private boolean f193004cQ;

    /* renamed from: cR */
    private boolean f193005cR;

    /* renamed from: cS */
    private boolean f193006cS;

    /* renamed from: cT */
    private boolean f193007cT;

    /* renamed from: cU */
    private boolean f193008cU;

    /* renamed from: cV */
    private int f193009cV;

    /* renamed from: cW */
    private int f193010cW;

    /* renamed from: cX */
    private int f193011cX;

    /* renamed from: cY */
    private int f193012cY;

    /* renamed from: cZ */
    private int f193013cZ;

    /* renamed from: cg */
    protected String f193014cg;

    /* renamed from: ch */
    public C86347ap f193015ch;

    /* renamed from: ci */
    public HashMap<String, String> f193016ci;

    /* renamed from: ck */
    public String f193017ck;

    /* renamed from: cl */
    List<String> f193018cl;

    /* renamed from: cm */
    public int f193019cm;

    /* renamed from: cn */
    public int f193020cn;

    /* renamed from: co */
    public int f193021co;

    /* renamed from: cp */
    public int f193022cp;

    /* renamed from: cq */
    public int f193023cq;

    /* renamed from: cr */
    public int f193024cr;

    /* renamed from: cs */
    public int f193025cs;

    /* renamed from: ct */
    public int f193026ct;

    /* renamed from: cu */
    public int f193027cu;

    /* renamed from: cv */
    public int f193028cv;

    /* renamed from: cw */
    public C86520f f193029cw;

    /* renamed from: cx */
    public int f193030cx;

    /* renamed from: cy */
    public boolean f193031cy;

    /* renamed from: cz */
    public boolean f193032cz;

    /* renamed from: dA */
    private int f193033dA = 10;

    /* renamed from: dB */
    private int f193034dB = 300;

    /* renamed from: dC */
    private int f193035dC;

    /* renamed from: dD */
    private int f193036dD;

    /* renamed from: dE */
    private int f193037dE = 2;

    /* renamed from: dF */
    private int f193038dF = 1;

    /* renamed from: dG */
    private int f193039dG;

    /* renamed from: dH */
    private int f193040dH;

    /* renamed from: dI */
    private int f193041dI = 1;

    /* renamed from: dJ */
    private int f193042dJ;

    /* renamed from: dK */
    private int f193043dK;

    /* renamed from: dL */
    private int f193044dL;

    /* renamed from: dM */
    private int f193045dM;

    /* renamed from: dN */
    private int f193046dN;

    /* renamed from: dO */
    private int f193047dO = -1;

    /* renamed from: dP */
    private int f193048dP;

    /* renamed from: dQ */
    private float f193049dQ = 0.25f;

    /* renamed from: dR */
    private float f193050dR = -18.0f;

    /* renamed from: dS */
    private float f193051dS = 8.0f;

    /* renamed from: dT */
    private float f193052dT = 0.007f;

    /* renamed from: dU */
    private float f193053dU;

    /* renamed from: dV */
    private float f193054dV;

    /* renamed from: dW */
    private float f193055dW;

    /* renamed from: dX */
    private int f193056dX;

    /* renamed from: dY */
    private boolean f193057dY;

    /* renamed from: dZ */
    private int f193058dZ = -2;

    /* renamed from: da */
    private int f193059da;

    /* renamed from: db */
    private int f193060db;

    /* renamed from: dc */
    private int f193061dc = 3;

    /* renamed from: de */
    private int f193062de;

    /* renamed from: df */
    private int f193063df = 1;

    /* renamed from: dg */
    private int f193064dg;

    /* renamed from: dh */
    private int f193065dh;

    /* renamed from: di */
    private int f193066di;

    /* renamed from: dj */
    private int f193067dj;

    /* renamed from: dk */
    private int f193068dk;

    /* renamed from: dl */
    private int f193069dl;

    /* renamed from: dm */
    private int f193070dm = -1;

    /* renamed from: dn */
    private int f193071dn;

    /* renamed from: do */
    private int f193072do;

    /* renamed from: dp */
    private int f193073dp;

    /* renamed from: dq */
    private int f193074dq = -1;

    /* renamed from: dr */
    private String f193075dr = "";

    /* renamed from: ds */
    private int f193076ds;

    /* renamed from: dt */
    private int f193077dt;

    /* renamed from: du */
    private int f193078du;

    /* renamed from: dv */
    private int f193079dv = 1;

    /* renamed from: dw */
    private int f193080dw = 1;

    /* renamed from: dx */
    private int f193081dx;

    /* renamed from: dy */
    private int f193082dy = 31;

    /* renamed from: dz */
    private int f193083dz;

    /* renamed from: e */
    int f193084e = 500;

    /* renamed from: eA */
    private C86433d f193085eA;

    /* renamed from: eB */
    private EnumC86649v f193086eB;

    /* renamed from: eC */
    private EnumC86649v f193087eC;

    /* renamed from: eD */
    private C86534o f193088eD;

    /* renamed from: eE */
    private C86534o f193089eE;

    /* renamed from: eF */
    private String[] f193090eF;

    /* renamed from: eG */
    private Map<EnumC86649v, Integer> f193091eG;

    /* renamed from: eH */
    private Map<EnumC86649v, String> f193092eH;

    /* renamed from: eI */
    private Map<Integer, String> f193093eI;

    /* renamed from: eJ */
    private String f193094eJ;

    /* renamed from: eK */
    private boolean f193095eK;

    /* renamed from: eL */
    private long f193096eL;

    /* renamed from: eM */
    private int f193097eM;

    /* renamed from: eN */
    private int f193098eN;

    /* renamed from: eO */
    private int f193099eO;

    /* renamed from: eP */
    private int f193100eP;

    /* renamed from: eQ */
    private int f193101eQ;

    /* renamed from: eR */
    private int f193102eR;

    /* renamed from: eS */
    private int f193103eS;

    /* renamed from: eT */
    private int f193104eT;

    /* renamed from: eU */
    private boolean f193105eU;

    /* renamed from: eV */
    private String f193106eV;

    /* renamed from: eW */
    private String f193107eW;

    /* renamed from: eX */
    private String f193108eX;

    /* renamed from: eY */
    private String f193109eY;

    /* renamed from: eZ */
    private String f193110eZ;

    /* renamed from: ea */
    private int f193111ea = -1;

    /* renamed from: eb */
    private int f193112eb;

    /* renamed from: ec */
    private int f193113ec;

    /* renamed from: ed */
    private int f193114ed = 5000;

    /* renamed from: ee */
    private int f193115ee;

    /* renamed from: ef */
    private int f193116ef;

    /* renamed from: eh */
    private int f193117eh;

    /* renamed from: ei */
    private int f193118ei = 30;

    /* renamed from: ej */
    private int f193119ej;

    /* renamed from: ek */
    private float f193120ek = 50.0f;

    /* renamed from: el */
    private int f193121el;

    /* renamed from: em */
    private int f193122em;

    /* renamed from: en */
    private int f193123en;

    /* renamed from: eo */
    private int f193124eo = 1;

    /* renamed from: ep */
    private int f193125ep = -1;

    /* renamed from: eq */
    private boolean f193126eq;

    /* renamed from: er */
    private int f193127er = 1;

    /* renamed from: es */
    private int f193128es;

    /* renamed from: et */
    private LinkedList<Pair<Surface, Integer>> f193129et = new LinkedList<>();

    /* renamed from: eu */
    private SurfaceHolder$CallbackC86352ar f193130eu = null;

    /* renamed from: ev */
    private String f193131ev;

    /* renamed from: ew */
    private String f193132ew;

    /* renamed from: ex */
    private Boolean f193133ex;

    /* renamed from: ey */
    private int f193134ey;

    /* renamed from: ez */
    private C86544c f193135ez;

    /* renamed from: f */
    int f193136f = -1;

    /* renamed from: fA */
    private HashMap<String, EnumC86649v> f193137fA;

    /* renamed from: fB */
    private boolean f193138fB;

    /* renamed from: fC */
    private boolean f193139fC;

    /* renamed from: fD */
    private long f193140fD;

    /* renamed from: fE */
    private AudioProcessor f193141fE;

    /* renamed from: fF */
    private int f193142fF;

    /* renamed from: fG */
    private int f193143fG;

    /* renamed from: fH */
    private C86205m f193144fH;

    /* renamed from: fI */
    private String f193145fI;

    /* renamed from: fK */
    private int f193146fK;

    /* renamed from: fL */
    private int f193147fL;

    /* renamed from: fM */
    private int f193148fM;

    /* renamed from: fN */
    private String f193149fN;

    /* renamed from: fO */
    private String f193150fO;

    /* renamed from: fP */
    private String f193151fP;

    /* renamed from: fQ */
    private int f193152fQ;

    /* renamed from: fR */
    private int f193153fR;

    /* renamed from: fS */
    private boolean f193154fS;

    /* renamed from: fT */
    private int f193155fT;

    /* renamed from: fU */
    private int f193156fU;

    /* renamed from: fV */
    private int f193157fV;

    /* renamed from: fW */
    private int f193158fW;

    /* renamed from: fX */
    private Queue<Bundle> f193159fX;

    /* renamed from: fY */
    private Map<Integer, String> f193160fY;

    /* renamed from: fZ */
    private Map<Integer, String> f193161fZ;

    /* renamed from: fa */
    private boolean f193162fa;

    /* renamed from: fb */
    private String f193163fb;

    /* renamed from: fc */
    private String f193164fc;

    /* renamed from: fd */
    private String f193165fd;

    /* renamed from: fe */
    private String f193166fe;

    /* renamed from: ff */
    private String f193167ff;

    /* renamed from: fg */
    private String f193168fg;

    /* renamed from: fh */
    private boolean f193169fh;

    /* renamed from: fi */
    private int f193170fi;

    /* renamed from: fj */
    private boolean f193171fj;

    /* renamed from: fk */
    private boolean f193172fk;

    /* renamed from: fl */
    private float f193173fl;

    /* renamed from: fm */
    private float f193174fm;

    /* renamed from: fn */
    private int f193175fn;

    /* renamed from: fo */
    private long f193176fo;

    /* renamed from: fp */
    private FileDescriptor f193177fp;

    /* renamed from: fq */
    private long f193178fq;

    /* renamed from: fr */
    private long f193179fr;

    /* renamed from: fs */
    private boolean f193180fs;

    /* renamed from: ft */
    private int f193181ft;

    /* renamed from: fu */
    private C86377bf f193182fu;

    /* renamed from: fv */
    private boolean f193183fv;

    /* renamed from: fw */
    private int f193184fw;

    /* renamed from: fx */
    private int f193185fx;

    /* renamed from: g */
    Handler f193186g;

    /* renamed from: gA */
    private MaskInfo f193187gA;

    /* renamed from: gB */
    private int f193188gB;

    /* renamed from: gC */
    private int f193189gC;

    /* renamed from: gD */
    private int f193190gD;

    /* renamed from: gE */
    private float f193191gE;

    /* renamed from: gF */
    private int f193192gF;

    /* renamed from: gG */
    private int f193193gG;

    /* renamed from: gH */
    private int f193194gH;

    /* renamed from: gI */
    private boolean f193195gI;

    /* renamed from: gJ */
    private final long f193196gJ;

    /* renamed from: gK */
    private int f193197gK;

    /* renamed from: gL */
    private int f193198gL;

    /* renamed from: gM */
    private int f193199gM;

    /* renamed from: gN */
    private int f193200gN;

    /* renamed from: gO */
    private int f193201gO;

    /* renamed from: gP */
    private int f193202gP;

    /* renamed from: gQ */
    private int f193203gQ;

    /* renamed from: gR */
    private int f193204gR;

    /* renamed from: gS */
    private int f193205gS;

    /* renamed from: gT */
    private int f193206gT;

    /* renamed from: gU */
    private int f193207gU;

    /* renamed from: gV */
    private int f193208gV;

    /* renamed from: gW */
    private int f193209gW;

    /* renamed from: gX */
    private int f193210gX;

    /* renamed from: gY */
    private int f193211gY;

    /* renamed from: gZ */
    private int f193212gZ;

    /* renamed from: ga */
    private String f193213ga;

    /* renamed from: gb */
    private boolean f193214gb;

    /* renamed from: gc */
    private boolean f193215gc;

    /* renamed from: gd */
    private int f193216gd;

    /* renamed from: ge */
    private int f193217ge;

    /* renamed from: gf */
    private boolean f193218gf;

    /* renamed from: gg */
    private boolean f193219gg;

    /* renamed from: gh */
    private boolean f193220gh;

    /* renamed from: gi */
    private boolean f193221gi;

    /* renamed from: gj */
    private int f193222gj;

    /* renamed from: gk */
    private int f193223gk;

    /* renamed from: gl */
    private int f193224gl;

    /* renamed from: gm */
    private String f193225gm;

    /* renamed from: gn */
    private int f193226gn;

    /* renamed from: go */
    private int f193227go;

    /* renamed from: gp */
    private int f193228gp;

    /* renamed from: gq */
    private int f193229gq;

    /* renamed from: gr */
    private int f193230gr;

    /* renamed from: gs */
    private int f193231gs;

    /* renamed from: gt */
    private int f193232gt;

    /* renamed from: gu */
    private int f193233gu;

    /* renamed from: gv */
    private int f193234gv;

    /* renamed from: gw */
    private int f193235gw;

    /* renamed from: gx */
    private int f193236gx;

    /* renamed from: gy */
    private int f193237gy;

    /* renamed from: gz */
    private int f193238gz;

    /* renamed from: h */
    Runnable f193239h;

    /* renamed from: hA */
    private float f193240hA;

    /* renamed from: hB */
    private String f193241hB;

    /* renamed from: hC */
    private int f193242hC;

    /* renamed from: hD */
    private AbstractC86586h f193243hD;

    /* renamed from: hE */
    private boolean f193244hE;

    /* renamed from: hF */
    private long f193245hF;

    /* renamed from: hG */
    private int f193246hG;

    /* renamed from: hH */
    private int f193247hH;

    /* renamed from: hI */
    private int f193248hI;

    /* renamed from: hJ */
    private int f193249hJ;

    /* renamed from: hK */
    private int f193250hK;

    /* renamed from: hL */
    private int f193251hL;

    /* renamed from: hM */
    private int f193252hM;

    /* renamed from: hN */
    private int f193253hN;

    /* renamed from: hO */
    private int f193254hO;

    /* renamed from: hP */
    private int f193255hP;

    /* renamed from: hQ */
    private int f193256hQ;

    /* renamed from: hR */
    private String f193257hR;

    /* renamed from: hS */
    private String f193258hS;

    /* renamed from: hT */
    private String f193259hT;

    /* renamed from: hU */
    private String f193260hU;

    /* renamed from: hV */
    private int f193261hV;

    /* renamed from: hW */
    private String f193262hW;

    /* renamed from: hX */
    private int f193263hX;

    /* renamed from: hY */
    private int f193264hY;

    /* renamed from: hZ */
    private float f193265hZ;

    /* renamed from: ha */
    private int f193266ha;

    /* renamed from: hb */
    private int f193267hb;

    /* renamed from: hc */
    private int f193268hc;

    /* renamed from: hd */
    private int f193269hd;

    /* renamed from: he */
    private int f193270he;

    /* renamed from: hf */
    private int f193271hf;

    /* renamed from: hg */
    private int f193272hg;

    /* renamed from: hh */
    private HashMap<Integer, Integer> f193273hh;

    /* renamed from: hi */
    private int f193274hi;

    /* renamed from: hj */
    private int f193275hj;

    /* renamed from: hk */
    private int f193276hk;

    /* renamed from: hl */
    private int f193277hl;

    /* renamed from: hm */
    private int f193278hm;

    /* renamed from: hn */
    private AbstractC86253m f193279hn;

    /* renamed from: ho */
    private int f193280ho;

    /* renamed from: hp */
    private int f193281hp;

    /* renamed from: hr */
    private int f193282hr;

    /* renamed from: hs */
    private int f193283hs;

    /* renamed from: ht */
    private long f193284ht;

    /* renamed from: hu */
    private long f193285hu;

    /* renamed from: hv */
    private long f193286hv;

    /* renamed from: hw */
    private long f193287hw;

    /* renamed from: hx */
    private long f193288hx;

    /* renamed from: hy */
    private float f193289hy;

    /* renamed from: hz */
    private float f193290hz;

    /* renamed from: iA */
    private int f193291iA;

    /* renamed from: iB */
    private int f193292iB;

    /* renamed from: iC */
    private int f193293iC;

    /* renamed from: iD */
    private int f193294iD;

    /* renamed from: iE */
    private int f193295iE;

    /* renamed from: iF */
    private int f193296iF;

    /* renamed from: iG */
    private boolean f193297iG;

    /* renamed from: iH */
    private String f193298iH;

    /* renamed from: iI */
    private int f193299iI;

    /* renamed from: iJ */
    private int f193300iJ;

    /* renamed from: iK */
    private int f193301iK;

    /* renamed from: iL */
    private int f193302iL;

    /* renamed from: iM */
    private int f193303iM;

    /* renamed from: iN */
    private int f193304iN;

    /* renamed from: iO */
    private int f193305iO;

    /* renamed from: iP */
    private int f193306iP;

    /* renamed from: iQ */
    private int f193307iQ;

    /* renamed from: iR */
    private int f193308iR;

    /* renamed from: iS */
    private int f193309iS;

    /* renamed from: iT */
    private long f193310iT;

    /* renamed from: iU */
    private float f193311iU;

    /* renamed from: iV */
    private int f193312iV;

    /* renamed from: iW */
    private boolean f193313iW;

    /* renamed from: iX */
    private boolean f193314iX;

    /* renamed from: iY */
    private int f193315iY;

    /* renamed from: iZ */
    private int f193316iZ;

    /* renamed from: ia */
    private float f193317ia;

    /* renamed from: ib */
    private float f193318ib;

    /* renamed from: ic */
    private float f193319ic;

    /* renamed from: id */
    private int f193320id;

    /* renamed from: ie */
    private int f193321ie;

    /* renamed from: if */
    private int f193322if;

    /* renamed from: ig */
    private int f193323ig;

    /* renamed from: ih */
    private int f193324ih;

    /* renamed from: ii */
    private boolean f193325ii;

    /* renamed from: ij */
    private float f193326ij;

    /* renamed from: ik */
    private int f193327ik;

    /* renamed from: il */
    private int f193328il;

    /* renamed from: im */
    private int f193329im;

    /* renamed from: in */
    private int f193330in;

    /* renamed from: io */
    private int f193331io;

    /* renamed from: ip */
    private int f193332ip;

    /* renamed from: iq */
    private int f193333iq;

    /* renamed from: ir */
    private int f193334ir;

    /* renamed from: is */
    private int f193335is;

    /* renamed from: it */
    private int f193336it;

    /* renamed from: iu */
    private int f193337iu;

    /* renamed from: iv */
    private int f193338iv;

    /* renamed from: iw */
    private int f193339iw;

    /* renamed from: ix */
    private int f193340ix;

    /* renamed from: iy */
    private int f193341iy;

    /* renamed from: iz */
    private int f193342iz;

    /* renamed from: ja */
    private AbstractC86427b f193343ja;

    /* renamed from: jc */
    private long f193344jc;

    /* renamed from: jd */
    private int f193345jd;

    /* renamed from: je */
    private int f193346je;

    /* renamed from: jf */
    private int f193347jf;

    /* renamed from: jg */
    private int f193348jg;

    /* renamed from: jh */
    private int f193349jh;

    /* renamed from: ji */
    private int f193350ji;

    /* renamed from: jj */
    private ArrayList<String> f193351jj;

    /* renamed from: jk */
    private int f193352jk;

    /* renamed from: jl */
    private int f193353jl;

    /* renamed from: jm */
    private boolean f193354jm;

    /* renamed from: jn */
    private int f193355jn;

    /* renamed from: jo */
    private String f193356jo;

    /* renamed from: jp */
    private int f193357jp;

    /* renamed from: jq */
    private int f193358jq;

    /* renamed from: jr */
    private int f193359jr;

    /* renamed from: js */
    private final C86606b f193360js;

    /* renamed from: jt */
    private boolean f193361jt;

    /* renamed from: ju */
    private boolean f193362ju;

    /* renamed from: jv */
    private String f193363jv;

    /* renamed from: l */
    public boolean f193364l;

    /* renamed from: m */
    public boolean f193365m;

    /* renamed from: n */
    public int f193366n;

    /* renamed from: o */
    public String f193367o = "";

    /* renamed from: p */
    public int f193368p;

    /* renamed from: q */
    public int f193369q = 5;

    /* renamed from: r */
    public boolean f193370r;

    /* renamed from: s */
    public boolean f193371s;

    /* renamed from: t */
    public boolean f193372t;

    /* renamed from: u */
    public boolean f193373u = true;

    /* renamed from: v */
    public int f193374v;

    /* renamed from: w */
    public int f193375w;

    /* renamed from: x */
    public int f193376x;

    /* renamed from: y */
    public int f193377y;

    /* renamed from: z */
    int f193378z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ai$v */
    public static class C86338v implements C86203l.AbstractC86204a {
        static {
            Covode.recordClassIndex(101566);
        }

        private C86338v() {
        }

        /* synthetic */ C86338v(byte b) {
            this();
        }

        @Override // com.p2082ss.texturerender.C86203l.AbstractC86204a
        /* renamed from: a */
        public final int mo136515a(String str, String str2) {
            C86641i.m150110a(str, str2);
            return 0;
        }
    }

    /* renamed from: a */
    public final boolean mo137190a(int i, int i2) {
        C86641i.m150110a("TTVideoEngine", "[SRLog]doOpenSR open=" + i + " reason=" + i2 + " mTextureSurface=" + this.f192977bn + " mHasFirstFrameShown=" + this.f192937av);
        this.f193146fK = i;
        if (i == 0) {
            this.f193316iZ = i2;
        }
        VideoSurface videoSurface = this.f192977bn;
        if (videoSurface != null) {
            if (1 == i) {
                try {
                    if (this.f192937av) {
                        videoSurface.mo136456b(i);
                    }
                } catch (Exception e) {
                    C86641i.m150110a("TTVideoEngine", "[SRLog]doOpenSR catch exception e=".concat(String.valueOf(e)));
                }
            } else {
                videoSurface.mo136456b(i);
            }
            this.f192988by.f195217h = i;
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo137186a(boolean z) {
        C86641i.m150110a("TTVideoEngine", "[SRLog]openTextureSR =  sr = true, open =" + z);
        this.f192988by.f195212c = 1;
        this.f192985bv = true;
        this.f193146fK = z ? 1 : 0;
        int i = 0;
        if (z == 0) {
            i = -7890;
        }
        if (this.f193154fS) {
            mo137190a((int) z, i);
        }
    }

    /* renamed from: b */
    public final void mo137193b(int i, int i2) {
        this.f193152fQ = i;
        this.f193153fR = i2;
        C86641i.m150110a("TTVideoEngine", "[SRLog]setSrMaxTextureSize:" + this.f193152fQ + "," + this.f193153fR);
        C86628d dVar = new C86628d();
        dVar.mo137887a(i).mo137891b(i2);
        this.f192988by.mo137885a(dVar);
    }

    /* renamed from: b */
    public final void mo137200b(boolean z) {
        this.f192987bx = z;
        C86641i.m150110a("TTVideoEngine", "[SRLog]asyncInitSR = ".concat(String.valueOf(z)));
    }

    /* renamed from: c */
    public final void mo137213c(boolean z) {
        this.f193154fS = z;
        C86641i.m150110a("TTVideoEngine", "[SRLog]dynamicControlSR = ".concat(String.valueOf(z)));
    }

    /* renamed from: a */
    public final void mo137164a(int i, String str, String str2, String str3) {
        this.f193147fL = this.f193148fM;
        this.f193148fM = i;
        this.f193149fN = str;
        this.f193150fO = str2;
        this.f193151fP = str3;
        this.f192920ae.mo137534U(i);
        C86641i.m150110a("TTVideoEngine", "[SRLog]sr init config = " + this.f193148fM + "," + this.f193149fN + "," + this.f193150fO + ", " + this.f193151fP);
    }

    /* renamed from: b */
    public final boolean mo137203b() {
        VideoSurface videoSurface = this.f192977bn;
        boolean z = false;
        if (videoSurface != null && videoSurface.mo136459c(6, -1) == 1) {
            z = true;
        }
        C86641i.m150110a("TTVideoEngine", "isplaybackUsedSR ,mPlayBackUsedSR = " + this.f192984bu + ", mTextureSrOpen = " + this.f193146fK + ", ret = " + z);
        return z;
    }

    /* renamed from: d */
    public final void mo137220d(boolean z) {
        this.f192986bw = z;
        C86641i.m150110a("TTVideoEngine", "[SRLog]ignoreSRResolutionLimit ignore=".concat(String.valueOf(z)));
    }

    /* renamed from: a */
    public final void mo137166a(Bundle bundle) {
        C86641i.m150113b("TTVideoEngine", "setEffect:" + bundle.toString() + " TextureSurface:" + this.f192977bn);
        VideoSurface videoSurface = this.f192977bn;
        if (videoSurface != null) {
            videoSurface.mo136452a(bundle);
        } else {
            this.f193159fX.offer(bundle);
        }
        this.f192920ae.mo137548a(bundle);
    }

    /* renamed from: a */
    private void m148642a(VideoSurface videoSurface) {
        Bundle bundle;
        C86641i.m150110a("TTVideoEngine", "initSr,mTextureAlgType:" + this.f193148fM);
        if (this.f193148fM != -1 && videoSurface != null) {
            if (this.f192983bt != null) {
                bundle = new Bundle(this.f192983bt);
            } else {
                bundle = new Bundle();
            }
            bundle.putInt("effect_type", 5);
            bundle.putInt("action", 21);
            bundle.putInt("srAlgType", this.f193148fM);
            bundle.putInt("srMaxSizeWidth", this.f193152fQ);
            bundle.putInt("srMaxSizeHeight", this.f193153fR);
            bundle.putString("kernelBinPath", this.f193149fN);
            bundle.putString("oclModleName", this.f193150fO);
            bundle.putString("dspModleName", this.f193151fP);
            bundle.putString("moduleName", "");
            videoSurface.mo136452a(bundle);
        }
    }

    /* renamed from: a */
    public final String mo137158a(List<C86514c> list) {
        Exception e;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (C86514c cVar : list) {
                        if (cVar != null) {
                            if (!TextUtils.isEmpty(cVar.f194724h)) {
                                String str = cVar.f194724h;
                                try {
                                    String a = mo137157a(str, null, (long) this.f192972bi, new String[]{cVar.f194718b}, EnumC86649v.Undefine, null, null, null, null);
                                    if (!TextUtils.isEmpty(a)) {
                                        cVar.f194718b = a;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    e.printStackTrace();
                                    return null;
                                }
                            }
                            JSONObject a2 = cVar.mo137764a();
                            if (a2 != null) {
                                if (cVar.f194717a == 0) {
                                    jSONArray.put(a2);
                                } else if (cVar.f194717a == 1) {
                                    jSONArray2.put(a2);
                                }
                            }
                        }
                    }
                    jSONObject.put("dynamic_video_list", jSONArray);
                    jSONObject.put("dynamic_audio_list", jSONArray2);
                    return "mem://bash/url_index:0/segment_format:1/" + jSONObject.toString();
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m148640a(Context context, Map map) {
        if (map.size() > 0) {
            try {
                C86641i.m150113b("TTVideoEngine", "setAppInfo:" + map.toString());
                C86366b.f193475a = context;
                C86366b.f193476b = C86640h.m150076a(map.get("appid"));
                C86366b.f193477c = (String) map.get("appname");
                C86366b.f193478d = (String) map.get("appchannel");
                C86366b.f193479e = (String) map.get("appversion");
                if (map.containsKey("screen_height")) {
                    C86366b.f193483i = ((Integer) map.get("screen_height")).intValue();
                }
                if (map.containsKey("screen_width")) {
                    C86366b.f193482h = ((Integer) map.get("screen_width")).intValue();
                }
                if (map.containsKey("deviceid")) {
                    C86366b.f193480f = (String) map.get("deviceid");
                }
                if (map.containsKey("region")) {
                    C86366b.f193481g = (String) map.get("region");
                }
                C86617e.C86621c.f195187a.mo137877a(C86366b.m148915a(), map);
                C86594a.m149985a().mo137863b().mo137861a(C86594a.f195108e);
            } catch (Exception e) {
                C86641i.m150113b("TTVideoEngine", e.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo137162a(int i, long j) {
        int i2;
        C86529j jVar = this.f192931ap;
        int i3 = 3;
        int i4 = -1;
        if (jVar != null && jVar.f194765c > 0 && !TextUtils.isEmpty(this.f192931ap.f194763a)) {
            if (i == 0) {
                i3 = 2;
            } else if (i != 2) {
                i3 = -1;
            }
            if (i == 1) {
                C86641i.m150116d("PROXY-XY-SETPLAYINFO", C1764a.m5928a("set play info into xyproxy p2p  key is play pos value:%d", new Object[]{Long.valueOf(j)}));
                return;
            }
            C86641i.m150116d("PROXY-XY-SETPLAYINFO", C1764a.m5928a("set play info into xyproxy p2p key:%d value:%d", new Object[]{Integer.valueOf(i3), Long.valueOf(j)}));
        } else if (this.f192969bf <= 0) {
        } else {
            if (TextUtils.isEmpty(this.f193014cg)) {
                C86641i.m150116d("TTVideoEngine", "trace id null, not allow setplayinfo");
                return;
            }
            switch (i) {
                case 0:
                    i2 = 22;
                    break;
                case 1:
                    i2 = 23;
                    break;
                case 2:
                    i2 = 24;
                    break;
                case 3:
                    i2 = 25;
                    break;
                case 4:
                    i2 = 26;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC86253m mVar = this.f192923ah;
                    if (mVar != null) {
                        if (j == -1) {
                            j = mVar.mo16684a(73, -1L);
                            long a = mVar.mo16684a(72, -1L);
                            if (j >= 0 && a >= 0) {
                                j = Math.min(j, a);
                            } else if (a >= 0) {
                                j = a;
                            }
                        }
                        i2 = 27;
                        break;
                    } else {
                        C86641i.m150116d("MDL-SETPLAYINFO", "mediaplayer is null not allow set PLAY_INFO_CURRENT_BUFFER");
                        return;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    i2 = 28;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            if (this.f193230gr == 0 || this.f193067dj == 1) {
                C86385d.C86400h.f193679a.mo137363a(i2, this.f192865B, j);
            } else {
                C86385d dVar = C86385d.C86400h.f193679a;
                String str = this.f193014cg;
                String str2 = this.f192865B;
                if (dVar.f193572d != 0) {
                    C86641i.m150113b("DataLoaderHelper", "dataloader not started, not allow set play info");
                } else {
                    dVar.f193586r.lock();
                    dVar.mo137363a(i2, str2, j);
                    switch (i2) {
                        case 22:
                            i4 = 7210;
                            break;
                        case 23:
                            i4 = 7211;
                            break;
                        case 24:
                            i4 = 7212;
                            break;
                        case 25:
                            i4 = 7213;
                            break;
                        case 26:
                            i4 = 7214;
                            break;
                        case 27:
                            i4 = 7215;
                            break;
                        case 28:
                            i4 = 7338;
                            break;
                    }
                    try {
                        dVar.f193578j.setInt64ValueByStrKey(i4, str, j);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } catch (Throwable th) {
                        dVar.f193586r.unlock();
                        throw th;
                    }
                    dVar.f193586r.unlock();
                }
            }
            C86641i.m150116d("MDL-SETPLAYINFO", C1764a.m5928a("set play info into mdl key:%d value:%d traceid:%s", new Object[]{Integer.valueOf(i2), Long.valueOf(j), this.f193014cg}));
        }
    }

    /* renamed from: a */
    public final void mo137167a(Surface surface) {
        C86641i.m150110a("TTVideoEngine", "setsurface = " + surface + ", pre-surface:" + this.f192917ab + ",this:" + this);
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137312a(54, 0, 0, surface);
        } else {
            mo137209c(surface);
        }
    }

    /* renamed from: a */
    public final void mo137168a(Surface surface, int i) {
        MethodCollector.m26663i(2839);
        synchronized (this.f193129et) {
            try {
                this.f193129et.offer(new Pair<>(surface, Integer.valueOf(i)));
                m148626V();
            } finally {
                MethodCollector.m26664o(2839);
            }
        }
    }

    /* renamed from: b */
    public final void mo137194b(Surface surface) {
        C86641i.m150110a("TTVideoEngine", "setSurfaceSync = " + surface + ",this:" + this);
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137316a(54, this.f193344jc, surface);
        } else {
            mo137209c(surface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137195b(Surface surface, int i) {
        VideoSurface videoSurface;
        AbstractC86253m mVar = this.f193279hn;
        if (mVar != null || (mVar = this.f192923ah) != null) {
            if (surface == null) {
                surface = null;
            } else if (!(i == 1 || (videoSurface = this.f192977bn) == null)) {
                surface = videoSurface;
            }
            mVar.mo16691a(surface);
        }
    }

    /* renamed from: a */
    public final void mo137183a(String str, String str2) {
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137313a(57, 0, 0, str, str2);
        } else {
            mo137212c(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo137159a(float f, float f2) {
        C86641i.m150110a("TTVideoEngine", "setVolume left:" + f + " right:" + f2);
        this.f193173fl = f;
        this.f193174fm = f2;
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137313a(9, 0, 0, Float.valueOf(f), Float.valueOf(f2));
        } else {
            mo137191b(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo137160a(int i) {
        C86641i.m150110a("TTVideoEngine", "setStartTime:".concat(String.valueOf(i)));
        this.f192890aA = i;
        this.f192920ae.mo137631n(i);
    }

    /* renamed from: a */
    public final void mo137173a(AbstractC86369ba baVar) {
        C86641i.m150113b("TTVideoEngine", "setListener ".concat(String.valueOf(baVar)));
        this.f192874K = baVar;
    }

    /* renamed from: a */
    public final void mo137172a(AbstractC86362aw awVar) {
        C86641i.m150113b("TTVideoEngine", "setVideoEngineSimpleCallback ".concat(String.valueOf(awVar)));
        this.f192873J = awVar;
    }

    /* renamed from: a */
    public final void mo137174a(AbstractC86376be beVar) {
        C86641i.m150113b("TTVideoEngine", "setVideoInfoListener ".concat(String.valueOf(beVar)));
        this.f192877N = beVar;
    }

    /* renamed from: a */
    public final void mo137171a(AbstractC86355au auVar) {
        C86641i.m150113b("TTVideoEngine", "setVideoBufferListener ".concat(String.valueOf(auVar)));
        this.f192883T = auVar;
    }

    /* renamed from: a */
    public final void mo137182a(String str) {
        C86641i.m150110a("TTVideoEngine", "setDecryptionKey");
        this.f192894aE = str;
    }

    /* renamed from: b */
    public final void mo137198b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C86641i.m150110a("TTVideoEngine", "setEncodedKey");
            this.f193106eV = str;
        }
    }

    /* renamed from: c */
    public final void mo137211c(String str) {
        this.f193109eY = str;
        C86520f fVar = this.f193029cw;
        if (fVar != null) {
            fVar.mo137770a(str);
        }
    }

    /* renamed from: a */
    public final void mo137181a(FileDescriptor fileDescriptor, long j, long j2) {
        this.f193178fq = j;
        this.f193179fr = j2;
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137312a(12, 0, 0, fileDescriptor);
        } else {
            mo137180a(fileDescriptor);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137180a(FileDescriptor fileDescriptor) {
        mo137273y();
        this.f193177fp = fileDescriptor;
        AbstractC86468j jVar = this.f192920ae;
        if (jVar != null) {
            jVar.mo137570b(6, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo137227e(String str) {
        if (str != null && !str.equals(this.f192865B)) {
            C86641i.m150110a("TTVideoEngine", C1764a.m5928a("set video id:%s", new Object[]{str}));
            mo137273y();
            this.f192896aG = false;
            this.f192908aS = true;
            this.f192910aU = true;
            this.f192909aT = true;
            this.f192864A = 0;
            this.f192933ar = false;
            this.f192941az = 0;
            this.f192932aq = null;
        }
        this.f193372t = false;
        this.f192865B = str;
        this.f192965ba = 0;
        this.f192920ae.mo137570b(5, str);
        this.f192930ao.clear();
        this.f192892aC = null;
        this.f192893aD = null;
    }

    /* renamed from: a */
    public final void mo137175a(AbstractC86517e eVar) {
        if (eVar != null) {
            if (this.f193015ch.mo137317a(false)) {
                this.f193015ch.mo137312a(16, 0, 0, eVar);
            } else {
                mo137197b(eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137197b(AbstractC86517e eVar) {
        String b = eVar.mo137744b(2);
        if (TextUtils.isEmpty(b)) {
            C86641i.m150110a("TTVideoEngine", "_doSetVideoModel vid is empty");
            return;
        }
        if (!eVar.equals(this.f192919ad)) {
            C86641i.m150110a("TTVideoEngine", "_doSetVideoModel VideoModel is new");
            mo137273y();
            this.f192896aG = false;
            this.f192908aS = true;
            this.f192910aU = true;
            this.f192909aT = true;
            this.f192864A = 0;
            this.f192933ar = false;
            this.f192941az = 0;
            this.f192922ag = null;
            this.f192932aq = null;
        }
        this.f193372t = false;
        this.f192919ad = eVar;
        this.f193131ev = eVar.mo137744b(218);
        this.f193132ew = this.f192919ad.mo137744b(217);
        this.f193134ey = this.f192919ad.mo137734a(9);
        this.f192919ad.mo137741a(this.f193137fA);
        this.f192865B = b;
        m148671au();
        this.f193169fh = true;
        this.f192965ba = 0;
        this.f192920ae.mo137570b(4, this.f192865B);
        this.f192920ae.mo137551a(eVar);
        this.f192892aC = null;
        this.f192893aD = null;
        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("set video model, fallback api:%s, keyseed:%s", new Object[]{this.f193132ew, this.f193131ev}));
    }

    /* renamed from: b */
    public final void mo137199b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            mo137184a(str, str2, this.f192865B);
        }
    }

    /* renamed from: a */
    public final void mo137184a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            m148680b(new String[]{str}, str2, str3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137189a(String[] strArr, String str, String str2) {
        String str3 = str;
        if (strArr == null || strArr.length == 0 || TextUtils.isEmpty(strArr[0])) {
            C86641i.m150117e("TTVideoEngine", "invalid urls list, it is empty");
            return;
        }
        this.f193356jo = C86617e.m150015a(str2, str3, strArr);
        if (TextUtils.isEmpty(str3) || this.f192969bf == 0) {
            mo137245i(strArr[0]);
        } else {
            mo137142F();
            C86641i.m150110a("TTVideoEngine", "setDirectUrlUseDataLoader key = " + str3 + ", videoId = " + str2);
            String a = mo137157a(str3, str2, (long) this.f192972bi, strArr, EnumC86649v.Undefine, this.f192894aE, null, null, null);
            if (!this.f193018cl.contains(str3)) {
                this.f193018cl.add(str3);
            }
            if (TextUtils.isEmpty(a)) {
                mo137245i(strArr[0]);
            } else {
                this.f192865B = str2;
                if (this.f193268hc == 1) {
                    for (String str4 : strArr) {
                        if (!URLUtil.isValidUrl(str4)) {
                        }
                    }
                    C86641i.m150117e("TTVideoEngine", "invalid urls list, all url invalid");
                    mo137177a(new C86633c("kTTVideoErrorDomainVideoOwnPlayer", -9966, "Direct url is invalid url."));
                    return;
                }
                mo137245i(a);
            }
            AbstractC86468j jVar = this.f192920ae;
            if (jVar != null) {
                jVar.mo137665w(a);
            }
        }
        if (this.f193361jt) {
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
            } else {
                String e = C86449aa.m149187e(strArr[0]);
                if (!TextUtils.isEmpty(e)) {
                    str3 = e;
                }
            }
            C86449aa.C86451b.f193836a.mo137485a(str3);
            AbstractC86468j jVar2 = this.f192920ae;
            if (jVar2 != null) {
                jVar2.mo137591d(53, str3);
            }
        }
        this.f192865B = str2;
    }

    /* renamed from: a */
    public static void m148639a(int i, String str) {
        C86594a.m149985a().mo137860a(i, str);
        C86385d.C86400h.f193679a.mo137362a(i, str);
    }

    /* renamed from: c */
    public final void mo137208c(int i, String str) {
        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("setPlayAPIVersion:%d", new Object[]{Integer.valueOf(i)}));
        this.f193366n = i;
        this.f193367o = str;
        AbstractC86468j jVar = this.f192920ae;
        if (jVar != null) {
            jVar.mo137543a(i, str);
        }
    }

    /* renamed from: a */
    public final void mo137170a(C86275p pVar) {
        if (pVar != null) {
            C86641i.m150113b("TTVideoEngine", "[SRLog]setPlaybackParams:" + pVar + ", speed:" + pVar.f192718d + ", pitch:" + pVar.f192717c);
        }
        this.f192868E = pVar;
        if (!(pVar == null || pVar.f192718d == -1.0f)) {
            C86628d dVar = new C86628d();
            dVar.mo137892b(((int) (pVar.f192718d * 100.0f)) != 100);
            this.f192988by.mo137885a(dVar);
        }
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137312a(53, 0, 0, pVar);
        } else {
            mo137196b(pVar);
        }
    }

    /* renamed from: b */
    public final void mo137192b(int i) {
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137311a(50, 1, i);
        } else {
            mo137201b(true, i);
        }
    }

    /* renamed from: a */
    public final void mo137187a(boolean z, int i) {
        this.f193046dN = z ? 1 : 0;
        this.f193047dO = i;
    }

    /* renamed from: a */
    public final void mo137161a(int i, float f) {
        if (i == 359) {
            this.f193120ek = f;
        } else if (i == 535) {
            this.f193326ij = f;
            this.f192920ae.mo137581c(f);
        } else if (i != 651) {
            switch (i) {
                case 325:
                    this.f193049dQ = f;
                    break;
                case 326:
                    this.f193050dR = f;
                    break;
                case 327:
                    this.f193051dS = f;
                    break;
                case 328:
                    this.f193052dT = f;
                    break;
                default:
                    boolean z = true;
                    switch (i) {
                        case 344:
                            this.f193055dW = f;
                            AbstractC86253m mVar = this.f192923ah;
                            if (mVar != null) {
                                mVar.mo16683a(645, f);
                                break;
                            }
                            break;
                        case 345:
                            this.f193006cS = true;
                            this.f193053dU = f;
                            AbstractC86253m mVar2 = this.f192923ah;
                            if (mVar2 != null) {
                                mVar2.mo16683a(644, f);
                                break;
                            }
                            break;
                        case 346:
                            this.f193007cT = true;
                            this.f193054dV = f;
                            AbstractC86253m mVar3 = this.f192923ah;
                            if (mVar3 != null) {
                                mVar3.mo16683a(646, f);
                                break;
                            }
                            break;
                        case 347:
                            if (f <= 0.0f) {
                                z = false;
                            }
                            this.f193008cU = z;
                            break;
                        default:
                            switch (i) {
                                case 526:
                                    this.f193265hZ = f;
                                    break;
                                case 527:
                                    this.f193317ia = f;
                                    break;
                                case 528:
                                    this.f193318ib = f;
                                    break;
                                case 529:
                                    this.f193319ic = f;
                                    break;
                            }
                    }
            }
        } else {
            VideoSurface videoSurface = this.f192977bn;
            if (videoSurface != null) {
                videoSurface.mo136449a(4, f);
            }
        }
        C86641i.m150110a("TTVideoEngine", "set float option key:" + i + ",value:" + f);
    }

    /* renamed from: a */
    public final void mo137178a(EnumC86649v vVar) {
        C86641i.m150113b("TTVideoEngine", "configResolution ".concat(String.valueOf(vVar)));
        if (vVar != null) {
            m148678b(vVar);
        }
    }

    /* renamed from: d */
    public final boolean mo137221d(int i) {
        int i2;
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null) {
            i2 = m148701q(mVar.mo16709b());
        } else {
            i2 = this.f192866C;
        }
        return i2 == i;
    }

    /* renamed from: a */
    public final void mo137188a(int[] iArr) {
        if (mo137265q()) {
            if (this.f193015ch.mo137317a(false)) {
                this.f193015ch.mo137312a(51, 0, 0, iArr);
            } else {
                mo137202b(iArr);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137202b(int[] iArr) {
        int length = iArr.length;
        if (length > 0) {
            int length2 = AbstractC86253m.f192691c.length;
            this.f193175fn = 0;
            int i = 0;
            do {
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    } else if (AbstractC86253m.f192691c[i2] == iArr[i]) {
                        this.f193175fn = (1 << i2) | this.f193175fn;
                        break;
                    } else {
                        i2++;
                    }
                }
                i++;
            } while (i < length);
            AbstractC86253m mVar = this.f192923ah;
            if (mVar != null) {
                mVar.mo16687a(111, this.f193175fn);
            }
        }
    }

    /* renamed from: a */
    public final void mo137163a(int i, AbstractC86651x xVar) {
        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("seek to time:%d", new Object[]{Integer.valueOf(i)}));
        this.f192879P = xVar;
        if (this.f192923ah != null && this.f193372t && this.f193023cq > 0) {
            this.f193022cp = i;
        }
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137310a(7, i);
        } else {
            mo137165a(i, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137165a(int i, boolean z) {
        int am;
        C86529j jVar;
        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("_seekTo:%d", new Object[]{Integer.valueOf(i)}));
        if (this.f192923ah == null || !this.f193372t) {
            mo137250j(false);
            return;
        }
        if (z) {
            am = this.f192941az;
        } else {
            am = m148663am();
        }
        if (this.f193233gu > 0 && (jVar = this.f192931ap) != null && jVar.f194765c > 0 && !TextUtils.isEmpty(this.f192931ap.f194763a)) {
            C86641i.m150110a("TTVideoEngine", "forbid proxy p2p when seek");
        }
        this.f192934as = true;
        this.f192935at = SystemClock.currentThreadTimeMillis();
        this.f192941az = i;
        mo137162a(6, 1L);
        this.f192923ah.mo16686a(i);
        mo137162a(1, (long) i);
        this.f192920ae.mo137541a(am, i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo137179a(EnumC86649v vVar, Map<Integer, String> map) {
        C86635e eVar;
        int i;
        Map<Integer, String> map2;
        if (this.f192927al != vVar || ((map2 = this.f193160fY) != null ? !map2.equals(map) : map != null)) {
            AbstractC86517e eVar2 = this.f192919ad;
            if (eVar2 != null) {
                if (!(this.f192927al == vVar || (this.f192874K == null && this.f192873J == null))) {
                    C86534o a = eVar2.mo137737a(vVar, eVar2.mo137734a(7), map, false);
                    AbstractC86517e eVar3 = this.f192919ad;
                    C86534o a2 = eVar3.mo137737a(this.f192927al, eVar3.mo137734a(7), this.f193160fY, false);
                    if (!(a2 == null || a == null || a.mo137724a(3) != a2.mo137724a(3))) {
                        if (this.f193015ch.mo137320b()) {
                            this.f193015ch.mo137318b(407, this.f192919ad.mo137734a(7), 0, null);
                        } else {
                            AbstractC86369ba baVar = this.f192874K;
                            if (baVar != null) {
                                baVar.mo16755d(this, this.f192919ad.mo137734a(7));
                            }
                            if (this.f192873J != null) {
                                this.f192919ad.mo137734a(7);
                            }
                        }
                    }
                }
                this.f193087eC = this.f192927al;
                this.f192928am = System.currentTimeMillis();
                this.f192927al = vVar;
                this.f193160fY = map;
                C86641i.m150110a("TTVideoEngine", C1764a.m5928a("will switch to resolution:%s, from resolution:%s", new Object[]{m148685d(vVar), m148685d(this.f193087eC)}));
                if (map != null) {
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        C86641i.m150110a("TTVideoEngine", "will switch to params, Key = " + entry.getKey() + ",Value = " + entry.getValue());
                    }
                }
                boolean g = m148692g(this.f192919ad);
                if (g && this.f193374v != 2) {
                    int i2 = C86537q.f194867a;
                    if (this.f192919ad.mo137742a()) {
                        if (map == null) {
                            map = new HashMap<>();
                        }
                        if (this.f192998cK.equals("bytevc2") && this.f192919ad.mo137748c(228)) {
                            map.put(8, "bytevc2");
                        } else if (this.f192998cK.equals("bytevc1") && this.f192919ad.mo137748c(204)) {
                            map.put(8, "bytevc1");
                        } else if (this.f192919ad.mo137748c(203)) {
                            map.put(8, "h264");
                        }
                        C86534o a3 = m148634a(this.f192927al, this.f192919ad.mo137734a(7), map);
                        if (a3 != null) {
                            i = a3.mo137724a(3);
                            i2 = a3.mo137723a();
                        } else {
                            i = 0;
                        }
                        if (this.f192878O != null) {
                            ArrayList arrayList = new ArrayList();
                            if (this.f192919ad.mo137743a(AbstractC86517e.EnumC86518a.DASH)) {
                                String h = this.f192919ad.mo137755h();
                                if (!TextUtils.isEmpty(h) && h.equals("segment_base")) {
                                    C86534o a4 = m148634a(this.f192927al, C86537q.f194867a, map);
                                    C86534o a5 = m148634a(this.f192927al, C86537q.f194868b, map);
                                    if (a4 != null) {
                                        arrayList.add(a4);
                                    }
                                    if (a5 != null) {
                                        arrayList.add(a5);
                                    }
                                }
                            } else if (a3 != null) {
                                arrayList.add(a3);
                            }
                            if (arrayList.size() > 0) {
                                C86365az azVar = new C86365az();
                                azVar.f193468a = "usingUrlInfos";
                                azVar.f193469b = arrayList;
                                if (this.f193015ch.mo137320b()) {
                                    this.f193015ch.mo137318b(412, 0, 0, azVar);
                                } else {
                                    this.f192878O.mo101150a(azVar);
                                }
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (this.f192923ah != null && mo137265q()) {
                        this.f192920ae.mo137561a(m148685d(this.f192927al), m148685d(this.f193087eC), false);
                        mo137246i(true);
                        this.f192923ah.mo16715c(i, i2);
                        return;
                    }
                }
                if (!this.f192936au) {
                    this.f192936au = true;
                    this.f192920ae.mo137561a(m148685d(this.f192927al), m148685d(this.f193087eC), true);
                    mo137246i(true);
                    if (!g && (eVar = this.f192970bg) != null) {
                        eVar.mo137909b();
                    }
                    this.f192941az = m148663am();
                }
                AbstractC86253m mVar = this.f192923ah;
                if (mVar != null) {
                    mVar.mo16719g();
                }
                mo137210c(this.f192919ad);
                return;
            }
            return;
        }
        C86641i.m150117e("TTVideoEngine", C1764a.m5928a("switch to the same resolution:%s, drop", new Object[]{m148685d(vVar)}));
    }

    /* renamed from: a */
    private boolean m148648a(C86534o oVar, AbstractC86517e eVar) {
        if (oVar == null || eVar == null || this.f193139fC) {
            return false;
        }
        if (eVar.mo137749d(220) > 0 && C86644l.m150123b() && C86644l.m150121a() - (eVar.mo137749d(220) * 1000) > -30000) {
            return true;
        }
        if (oVar.mo137728c(30) <= 0 || !C86644l.m150123b() || C86644l.m150121a() - (oVar.mo137728c(30) * 1000) <= -30000) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m148641a(IABRModule iABRModule, AbstractC86517e eVar) {
        List<C86534o> b;
        if (eVar == null) {
            return;
        }
        if (!((this.f192962bW == 0 && this.f192961bV == 0) || (b = eVar.mo137745b()) == null || b.size() == 0)) {
            for (C86534o oVar : b) {
                if (oVar != null) {
                    String b2 = oVar.mo137726b(15);
                    iABRModule.addBufferInfo(oVar.mo137723a(), b2, (long) oVar.mo137724a(3), C86385d.C86400h.f193679a.mo137393i(b2), (long) oVar.mo137724a(38));
                }
            }
            iABRModule.setIntOptionForKey(6, this.f193322if);
            iABRModule.setIntOptionForKey(7, this.f193323ig);
        }
    }

    /* renamed from: c */
    public final void mo137210c(AbstractC86517e eVar) {
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137312a(301, 0, 0, eVar);
        } else {
            mo137226e(eVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01bb, code lost:
        if (r18.f192997cJ == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01be, code lost:
        if (r13 == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c8, code lost:
        if (r18.f192998cK.equals("bytevc2") == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cc, code lost:
        if (r18.f192923ah == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d2, code lost:
        if (mo137221d(5) == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d4, code lost:
        mo137177a(com.p2082ss.ttvideoengine.p4430s.C86633c.m150047a(r18.f192923ah, -9993, "create exoplayer failed"));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3165);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e5, code lost:
        if (r18.f193364l != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e7, code lost:
        if (r13 != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01f1, code lost:
        if (r18.f192998cK.equals("bytevc1") != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01fb, code lost:
        if (r18.f192998cK.equals("bytevc2") != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ff, code lost:
        if (r18.f192997cJ == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0201, code lost:
        r0 = r18.f192923ah;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0203, code lost:
        if (r0 == null) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0209, code lost:
        if (r0.mo16709b() == 3) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0211, code lost:
        if (r18.f192923ah.mo16709b() != 4) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0213, code lost:
        mo137177a(new com.p2082ss.ttvideoengine.p4430s.C86633c("kTTVideoErrorDomainVideoOwnPlayer", -9989, "create own plugin player failed"));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3165);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0224, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0225, code lost:
        r0 = r18.f193155fT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0227, code lost:
        if (r0 == 2) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0229, code lost:
        if (r0 != 4) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0231, code lost:
        if (r18.f192923ah.mo16709b() == 1) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0239, code lost:
        if (r18.f192923ah.mo16709b() == 2) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x023b, code lost:
        mo137177a(new com.p2082ss.ttvideoengine.p4430s.C86633c("kTTVideoErrorDomainVideoOwnPlayer", -9993, "osplayer don't support overlay"));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3165);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x024a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x024b, code lost:
        r0 = r18.f192923ah.mo16709b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0251, code lost:
        if (r0 == 0) goto L_0x07e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0253, code lost:
        if (r0 == 1) goto L_0x07e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0255, code lost:
        if (r0 == 2) goto L_0x07dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0257, code lost:
        if (r0 == 3) goto L_0x07d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0259, code lost:
        if (r0 == 4) goto L_0x07d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025b, code lost:
        if (r0 == 5) goto L_0x07d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x025f, code lost:
        if (r18.f193065dh != 1) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0261, code lost:
        if (r16 == false) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0265, code lost:
        if (r18.f192969bf > 0) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0267, code lost:
        r18.f192923ah.mo16687a(14, 1);
        r10 = m148666ap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0276, code lost:
        if (android.text.TextUtils.isEmpty(r18.f193108eX) != false) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0278, code lost:
        r10 = r18.f193108eX;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x027a, code lost:
        r18.f192923ah.mo16688a(34, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0281, code lost:
        r18.f192923ah.mo16687a(823, r18.f193226gn);
        r18.f192923ah.mo16687a(619, r18.f193228gp);
        r18.f192923ah.mo16687a(828, r18.f193229gq);
        r18.f192923ah.mo16687a(870, r18.f193312iV);
        r18.f192923ah.mo16687a(853, r18.f193306iP);
        r18.f192923ah.mo16687a(829, r18.f193307iQ);
        r18.f192923ah.mo16687a(854, r18.f193308iR);
        r18.f192923ah.mo16687a(185, r18.f193227go);
        r18.f192923ah.mo16687a(201, r18.f192976bm);
        r18.f192923ah.mo16687a(94, r18.f193035dC);
        r18.f192923ah.mo16687a(98, r18.f193036dD);
        r18.f192923ah.mo16687a(95, r18.f193368p);
        r18.f192923ah.mo16687a(96, r18.f193081dx);
        r18.f192923ah.mo16687a(133, r18.f193077dt);
        r18.f192923ah.mo16687a(81, r18.f193118ei);
        r18.f192923ah.mo16687a(9, r18.f193369q * 1000000);
        r18.f192923ah.mo16687a(197, r18.f193080dw);
        r18.f192923ah.mo16687a(253, r18.f193276hk);
        r10 = r18.f193079dv;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0329, code lost:
        if (r10 != 0) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x032b, code lost:
        r18.f192923ah.mo16687a(183, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0332, code lost:
        r18.f192923ah.mo16687a(827, r18.f193072do);
        r18.f192923ah.mo16687a(67, r18.f193071dn);
        r18.f192923ah.mo16687a(86, r18.f193073dp);
        r18.f192923ah.mo16687a(110, r18.f193114ed);
        r18.f192923ah.mo16687a(111, r18.f193175fn);
        r18.f192923ah.mo16687a(159, r18.f193037dE);
        r18.f192923ah.mo16687a(195, r18.f193039dG);
        r18.f192923ah.mo16687a(79, r18.f193136f);
        r18.f192923ah.mo16687a(66, r18.f193084e);
        r10 = r18.f192996cI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0385, code lost:
        if (r10 == 0) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0389, code lost:
        if (r18.f192912aW == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x038b, code lost:
        r18.f192923ah.mo16687a(24, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0392, code lost:
        r10 = r18.f193173fl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0396, code lost:
        if (r10 < 0.0f) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0398, code lost:
        r1 = r18.f193174fm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x039c, code lost:
        if (r1 < 0.0f) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x039e, code lost:
        mo137191b(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a1, code lost:
        r18.f192923ah.mo16687a(159, r18.f193037dE);
        r18.f192923ah.mo16687a(83, r18.f193068dk);
        r18.f192923ah.mo16687a(37, r18.f193013cZ);
        r18.f192923ah.mo16687a(38, r18.f193059da);
        r18.f192923ah.mo16687a(36, r18.f193060db);
        r11 = com.p2082ss.ttvideoengine.C86313ai.f192854dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03d1, code lost:
        if (r11 == -1) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03d3, code lost:
        r18.f192923ah.mo16687a(56, r11);
        com.p2082ss.ttvideoengine.p4430s.C86641i.m150110a("TTVideoEngine", "set renderType from static context, renderType:".concat(java.lang.String.valueOf(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e9, code lost:
        r18.f192923ah.mo16687a(301, r18.f193117eh);
        r18.f192923ah.mo16687a(211, r18.f193043dK);
        r18.f192923ah.mo16687a(247, r18.f193112eb);
        r18.f192923ah.mo16687a(248, r18.f193113ec);
        r18.f192923ah.mo16687a(134, r18.f193082dy);
        r18.f192923ah.mo16687a(1010, r18.f193083dz);
        r18.f192923ah.mo16687a(1011, r18.f193033dA);
        r18.f192923ah.mo16687a(1012, r18.f193034dB);
        r18.f192923ah.mo16687a(192, r18.f193038dF);
        r18.f192923ah.mo16687a(358, r18.f193119ej);
        m148658ah();
        r18.f192923ah.mo16687a(278, r18.f193236gx);
        r18.f192923ah.mo16687a(276, r18.f193235gw);
        r18.f192923ah.mo16687a(263, r18.f193234gv);
        r18.f192923ah.mo16687a(261, r18.f192944bD);
        r18.f192923ah.mo16687a(199, r18.f193040dH);
        r18.f192923ah.mo16687a(256, r18.f193283hs);
        r18.f192923ah.mo16687a(285, r18.f193189gC);
        r18.f192923ah.mo16687a(286, r18.f193190gD);
        r18.f192923ah.mo16687a(292, r18.f193192gF);
        r18.f192923ah.mo16687a(293, r18.f193193gG);
        r18.f192923ah.mo16687a(297, r18.f193194gH);
        r18.f192923ah.mo16687a(647, r18.f193023cq);
        m148660aj();
        r18.f192923ah.mo16687a(565, r18.f193353jl);
        r18.f192923ah.mo16687a(664, r18.f193359jr);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04c9, code lost:
        if (r18.f193062de != 1) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04cb, code lost:
        r18.f192923ah.mo16687a(254, r18.f193281hp);
        r18.f192923ah.mo16687a(400, r18.f193280ho);
        r18.f192923ah.mo16687a(182, r18.f193011cX);
        r18.f192923ah.mo16687a(181, r18.f193012cY);
        r18.f192923ah.mo16687a(90, r18.f193115ee);
        r18.f192923ah.mo16687a(215, r18.f193045dM);
        r18.f192923ah.mo16687a(216, r18.f193044dL);
        r10 = r18.f193046dN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x050c, code lost:
        if (r10 != 1) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x050e, code lost:
        r18.f192923ah.mo16687a(212, r10);
        r18.f192923ah.mo16687a(213, r18.f193047dO);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0520, code lost:
        if (r18.f193100eP != 1) goto L_0x0529;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0522, code lost:
        r18.f192923ah.mo16687a(184, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0529, code lost:
        r18.f192923ah.mo16687a(279, r18.f193237gy);
        r10 = r18.f193238gz;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0534, code lost:
        if (r10 != 1) goto L_0x053d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0536, code lost:
        r18.f192923ah.mo16687a(280, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x053d, code lost:
        r18.f192923ah.mo16687a(401, r18.f193188gB);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0548, code lost:
        if (r18.f193078du != 1) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x054a, code lost:
        r18.f192923ah.mo16687a(189, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0553, code lost:
        if (r18.f193197gK != 1) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0555, code lost:
        r18.f192923ah.mo16687a(312, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x055c, code lost:
        r0 = r18.f193140fD;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0562, code lost:
        if (r0 <= 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0564, code lost:
        r18.f192923ah.mo16711b(231, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x056b, code lost:
        r18.f192923ah.mo16687a(223, r18.f193116ef);
        r18.f192923ah.mo16687a(984, com.p2082ss.ttvideoengine.C86313ai.f192855eg);
        r1 = r18.f193141fE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x057f, code lost:
        if (r1 == null) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0581, code lost:
        ((com.p2082ss.ttvideoengine.C86572m) r18.f192923ah).mo137826a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0588, code lost:
        r18.f192923ah.mo16687a(48, r18.f193275hj);
        r10 = r18.f193064dg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0593, code lost:
        if (r10 <= 0) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0595, code lost:
        r18.f192923ah.mo16687a(252, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x059c, code lost:
        r18.f192923ah.mo16687a(88, r18.f193041dI);
        r18.f192923ah.mo16687a(199, r18.f193040dH);
        r18.f192923ah.mo16687a(97, r18.f193042dJ);
        r18.f192923ah.mo16687a(536, r18.f193269hd);
        r18.f192923ah.mo16687a(537, r18.f193270he);
        r18.f192923ah.mo16687a(538, r18.f193271hf);
        r18.f192923ah.mo16687a(539, r18.f193272hg);
        r18.f192923ah.mo16699a(new com.p2082ss.ttvideoengine.C86313ai.C86333q(r18));
        r18.f192923ah.mo16694a(new com.p2082ss.ttvideoengine.C86313ai.C86321e(r18));
        r18.f192923ah.mo16695a(new com.p2082ss.ttvideoengine.C86313ai.C86322f(r18));
        r18.f192923ah.mo16696a(new com.p2082ss.ttvideoengine.C86313ai.C86325i(r18));
        r18.f192923ah.mo16700a(new com.p2082ss.ttvideoengine.C86313ai.C86336t(r18));
        r18.f192923ah.mo16698a(new com.p2082ss.ttvideoengine.C86313ai.C86328l(r18));
        r18.f192923ah.mo16701a(new com.p2082ss.ttvideoengine.C86313ai.C86331o(r18));
        r18.f192923ah.mo16702a(new com.p2082ss.ttvideoengine.C86313ai.C86330n(r18));
        r18.f192923ah.mo16687a(5003, r18.f193324ih);
        m148659ai();
        r18.f192923ah.mo16687a(542, r18.f193327ik);
        r18.f192923ah.mo16687a(550, r18.f193328il);
        r18.f192923ah.mo16687a(551, r18.f193329im);
        r18.f192923ah.mo16687a(552, r18.f193330in);
        r18.f192923ah.mo16687a(556, r18.f193378z);
        r18.f192923ah.mo16687a(654, r18.f193122em);
        r18.f192923ah.mo16687a(348, r18.f193123en);
        r18.f192923ah.mo16687a(557, r18.f193331io);
        r18.f192923ah.mo16687a(558, r18.f193332ip);
        r18.f192923ah.mo16687a(559, r18.f193333iq);
        r18.f192923ah.mo16687a(257, r18.f193124eo);
        r18.f192923ah.mo16687a(560, r18.f193334ir);
        r18.f192923ah.mo16687a(952, r18.f193346je);
        r18.f192923ah.mo16687a(561, r18.f193335is);
        r18.f192923ah.mo16687a(562, r18.f193336it);
        r18.f192923ah.mo16687a(563, r18.f193337iu);
        r18.f192923ah.mo16687a(564, r18.f193338iv);
        r18.f192923ah.mo16687a(566, r18.f193339iw);
        r18.f192923ah.mo16687a(149, r18.f193354jm ? 1 : 0);
        r18.f192923ah.mo16687a(164, r18.f193341iy);
        r18.f192923ah.mo16687a(571, r18.f193342iz);
        r18.f192923ah.mo16687a(572, r18.f193291iA);
        r18.f192923ah.mo16687a(573, r18.f193292iB);
        r18.f192923ah.mo16687a(574, r18.f193293iC);
        r18.f192923ah.mo16687a(575, r18.f193294iD);
        r18.f192923ah.mo16687a(576, r18.f193295iE);
        r18.f192923ah.mo16687a(580, r18.f193296iF);
        r10 = r18.f193347jf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x072d, code lost:
        if (r10 == -1) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x072f, code lost:
        r18.f192923ah.mo16687a(982, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0736, code lost:
        r10 = r18.f193348jg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0738, code lost:
        if (r10 == -1) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x073a, code lost:
        r18.f192923ah.mo16687a(985, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0741, code lost:
        r10 = r18.f193349jh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0743, code lost:
        if (r10 == -1) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0745, code lost:
        r18.f192923ah.mo16687a(1000, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x074c, code lost:
        r11 = r18.f192919ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x074e, code lost:
        if (r11 == null) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0750, code lost:
        r10 = r18.f192923ah;
        r0 = r18.f193125ep;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0756, code lost:
        if (r0 != -1) goto L_0x075e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0758, code lost:
        r0 = r11.mo137734a(230);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x075e, code lost:
        r10.mo16687a(662, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0761, code lost:
        r18.f192920ae.mo137583c(97, r18.f193354jm ? 1 : 0);
        r18.f192920ae.mo137583c(93, r18.f193337iu);
        r18.f192920ae.mo137583c(94, r18.f193338iv);
        r18.f192920ae.mo137583c(55, r18.f193327ik);
        r18.f192920ae.mo137583c(96, com.p2082ss.ttvideoengine.p4428q.C86617e.m150014a().mo137881d() ? 1 : 0);
        r10 = r18.f193350ji;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0797, code lost:
        if (r10 == -1) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0799, code lost:
        r18.f192923ah.mo16687a(1003, r10);
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x07a7, code lost:
        if (r11 >= r18.f193351jj.size()) goto L_0x07e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x07a9, code lost:
        r18.f192923ah.mo16688a(1002, r18.f193351jj.get(r11));
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x07bb, code lost:
        r18.f192923ah.mo16687a(662, r18.f193125ep);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x07c5, code lost:
        r18.f192923ah.mo16687a(56, r18.f193061dc);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x07d0, code lost:
        r18.f192866C = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x07d4, code lost:
        r18.f192866C = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x07d8, code lost:
        r18.f192866C = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x07dc, code lost:
        r18.f192866C = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x07e0, code lost:
        r18.f192866C = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x07e4, code lost:
        r18.f192866C = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x07e8, code lost:
        r10 = r18.f193352jk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x07eb, code lost:
        if (r10 == -1) goto L_0x07f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x07ed, code lost:
        r18.f192923ah.mo16687a(1005, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x07f4, code lost:
        r0 = r18.f193155fT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x07f6, code lost:
        if (r0 == 2) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x07f8, code lost:
        if (r0 != 4) goto L_0x0828;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x07fc, code lost:
        if (r18.f192977bn == null) goto L_0x0828;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x07fe, code lost:
        r18.f193157fV = 1;
        r18.f193156fU = 1;
        r18.f192923ah.mo16687a(820, 1);
        r18.f192923ah.mo16687a(333, r18.f193156fU);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0814, code lost:
        if (r18.f193155fT != 4) goto L_0x0818;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0816, code lost:
        r18.f192895aF = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0818, code lost:
        r1 = r18.f192923ah;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x081c, code lost:
        if ((r1 instanceof com.p2082ss.ttvideoengine.C86572m) == false) goto L_0x0828;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x081e, code lost:
        ((com.p2082ss.ttvideoengine.C86572m) r1).mo137830a(new com.p2082ss.ttvideoengine.C86313ai.C86327k(r18, (byte) 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0828, code lost:
        mo137232f(r18.f192895aF);
        r1 = r18.f192923ah;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0831, code lost:
        if ((r1 instanceof com.p2082ss.ttvideoengine.C86572m) == false) goto L_0x083c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0833, code lost:
        r0 = r18.f192947bG;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0835, code lost:
        if (r0 == null) goto L_0x083c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0837, code lost:
        ((com.p2082ss.ttvideoengine.C86572m) r1).mo137827a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x083c, code lost:
        r18.f193370r = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0919  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x093f  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0997  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0a0e  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0b46  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0b57  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0b7b  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0ca3  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0d4d  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0d64  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0de0  */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0eb3  */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0eca  */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x0ef7 A[Catch:{ all -> 0x1367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0f02 A[Catch:{ all -> 0x1367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0f9e  */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x111a  */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x1186  */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x1199  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137185a(java.lang.String r19, java.util.HashMap r20) {
        /*
        // Method dump skipped, instructions count: 5004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137185a(java.lang.String, java.util.HashMap):void");
    }

    /* renamed from: a */
    private void m148646a(Map<Integer, Integer> map) {
        if (map != null) {
            int i = 0;
            map.put(2, Integer.valueOf(this.f192866C == 1 ? 1 : 0));
            int i2 = this.f192866C;
            map.put(1, Integer.valueOf((i2 == 2 || i2 == 5) ? 0 : 1));
            HashMap<Integer, Integer> hashMap = this.f193273hh;
            if (this.f192866C == 5) {
                i = 1;
            }
            hashMap.put(26, Integer.valueOf(i));
            map.put(11, Integer.valueOf(this.f193266ha));
            map.put(100, Integer.valueOf(this.f193127er));
            map.put(27, Integer.valueOf(this.f193362ju ? 1 : 0));
        }
    }

    /* renamed from: a */
    private static boolean m148647a(C86534o oVar) {
        String b = oVar.mo137726b(6);
        if (!TextUtils.isEmpty(b)) {
            return b.equals("dash") || b.equals("mpd");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0334, code lost:
        if (r8 != 0) goto L_0x030b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137177a(com.p2082ss.ttvideoengine.p4430s.C86633c r17) {
        /*
        // Method dump skipped, instructions count: 823
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137177a(com.ss.ttvideoengine.s.c):void");
    }

    /* renamed from: a */
    private static boolean m148649a(String str, AbstractC86517e eVar) {
        if (eVar != null && (eVar.mo137743a(AbstractC86517e.EnumC86518a.DASH) || eVar.mo137750d() == AbstractC86517e.EnumC86519b.LIVE)) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str.indexOf(".m3u8") > 0 || str.indexOf(".mpd") > 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo137157a(String str, String str2, long j, String[] strArr, EnumC86649v vVar, String str3, C86534o oVar, String str4, String str5) {
        boolean z;
        C86313ai aiVar;
        String str6 = str2;
        AbstractC86517e eVar = this.f192919ad;
        boolean z2 = eVar != null && eVar.mo137743a(AbstractC86517e.EnumC86518a.HLS);
        if (this.f192866C != 0) {
            C86641i.m150110a("TTVideoEngine", "force disable native mal because play type: " + this.f192866C);
            z = true;
        } else {
            z = false;
        }
        String a = C86385d.C86400h.f193679a.mo137358a(str, str6, j, strArr, vVar, str3, oVar, str4, str5, z, z2, this.f192953bM);
        if (!TextUtils.isEmpty(a)) {
            C86641i.m150110a("TTVideoEngine", "_mdlUrl get proxyUrl: key = " + str + ", videoId = " + str6);
            if (a.startsWith("mdl://")) {
                aiVar = this;
                aiVar.f192920ae.mo137522I(2);
            } else {
                aiVar = this;
                aiVar.f192920ae.mo137522I(1);
            }
            aiVar.f192920ae.mo137665w(a);
            if (TextUtils.isEmpty(str6)) {
                str6 = str;
            }
            aiVar.f192975bl = str6;
            if (!TextUtils.isEmpty(str4)) {
                aiVar.f192974bk.add(str4);
            }
            if (!TextUtils.isEmpty(str)) {
                aiVar.f192973bj.add(str);
            }
            m148667aq();
        }
        return a;
    }

    /* renamed from: a */
    private static void m148643a(AbstractC86253m mVar) {
        C86641i.m150110a("TTVideoEngine", "_tryRegisterMdlHandle, player type:" + mVar.mo16709b());
        if (!f192859hq && mVar.mo16709b() == 1) {
            long c = C86385d.C86400h.f193679a.mo137378c(1003);
            if (c != -1) {
                C86385d.m148969a(C86385d.C86400h.f193679a, 1004, (int) mVar.mo16711b(500, c));
                f192859hq = true;
            }
            C86641i.m150110a("TTVideoEngine", "get handle: ".concat(String.valueOf(c)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137201b(boolean z, int i) {
        AbstractC86253m mVar = this.f193279hn;
        if (mVar == null) {
            mVar = this.f192923ah;
        }
        this.f193012cY = z ? 1 : 0;
        if (this.f192919ad != null) {
            i = -1;
        }
        this.f193011cX = i;
        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("setAsyncInit enable:%b codecid:%d", new Object[]{Integer.valueOf((int) z), Integer.valueOf(this.f193011cX)}));
        if (mVar != null && this.f193062de == 1) {
            mVar.mo16687a(181, this.f193012cY);
            mVar.mo16687a(182, this.f193011cX);
            this.f192920ae.mo137539a(this.f193012cY, this.f193011cX);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo137240h(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        int i3 = i2;
        if (i == 11) {
            this.f193118ei = i3;
            this.f192995cF |= 4;
            AbstractC86253m mVar = this.f192923ah;
            if (mVar != null) {
                mVar.mo16687a(81, i3);
            }
            this.f192920ae.mo137583c(24, i3);
        } else if (i == 12) {
            if (C86385d.m148958a().mo137381d(12) == 200) {
                i3 = 0;
            }
            this.f193369q = i3;
            AbstractC86253m mVar2 = this.f192923ah;
            if (mVar2 != null) {
                mVar2.mo16687a(9, 1000000 * i3);
            }
            this.f192920ae.mo137583c(25, i3);
        } else if (i == 100) {
            if (i3 != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f192914aY = z;
            AbstractC86253m mVar3 = this.f192923ah;
            if (mVar3 != null) {
                mVar3.mo16687a(196, !z ? 1 : 0);
            }
        } else if (i == 101) {
            this.f193078du = i3;
        } else if (i == 110) {
            this.f193184fw = i3;
        } else if (i == 111) {
            if (i3 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f193195gI = z2;
        } else if (i == 117) {
            C86277r.m148510b(4, i3);
        } else if (i == 118) {
            this.f193073dp = i3;
            AbstractC86253m mVar4 = this.f192923ah;
            if (mVar4 != null) {
                mVar4.mo16687a(86, i3);
            }
        } else if (i == 160) {
            this.f192969bf = i3;
            C86641i.m150113b("TTVideoEngine", "DataLoaderEnable is: " + this.f192969bf);
        } else if (i == 161) {
            this.f192972bi = i3;
        } else if (i == 183) {
            this.f193079dv = i3;
            AbstractC86253m mVar5 = this.f192923ah;
            if (mVar5 != null && i3 == 0) {
                mVar5.mo16687a(183, i3);
            }
        } else if (i != 184) {
            switch (i) {
                case 0:
                    this.f192996cI = i3;
                    AbstractC86253m mVar6 = this.f192923ah;
                    if (mVar6 != null) {
                        mVar6.mo16687a(24, i3);
                        break;
                    }
                    break;
                case 1:
                    this.f193013cZ = i3;
                    AbstractC86253m mVar7 = this.f192923ah;
                    if (mVar7 != null) {
                        mVar7.mo16687a(37, i3);
                        break;
                    }
                    break;
                case 2:
                    this.f193059da = i3;
                    AbstractC86253m mVar8 = this.f192923ah;
                    if (mVar8 != null) {
                        mVar8.mo16687a(38, i3);
                        break;
                    }
                    break;
                case 3:
                    this.f193266ha = i3;
                    C86277r.m148510b(11, i3);
                    break;
                case 4:
                    this.f193060db = i3;
                    if (this.f192977bn == null) {
                        AbstractC86253m mVar9 = this.f192923ah;
                        if (mVar9 != null) {
                            mVar9.mo16687a(36, i3);
                            break;
                        }
                    } else {
                        m148699p(i3);
                        break;
                    }
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.f193061dc = i3;
                    AbstractC86253m mVar10 = this.f192923ah;
                    if (mVar10 != null) {
                        mVar10.mo16687a(56, i3);
                        break;
                    }
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.f192995cF |= 64;
                    if (i3 != 0) {
                        this.f192998cK = "bytevc1";
                        break;
                    }
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    this.f193004cQ = true;
                    AbstractC86253m mVar11 = this.f193279hn;
                    if (mVar11 == null) {
                        mVar11 = this.f192923ah;
                    }
                    this.f193062de = i3;
                    this.f192995cF |= 32;
                    C86641i.m150110a("TTVideoEngine", "hardware enable = " + this.f193062de);
                    if (mVar11 != null) {
                        mVar11.mo16687a(59, i3);
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            this.f193071dn = i3;
                            AbstractC86253m mVar12 = this.f192923ah;
                            if (mVar12 != null) {
                                mVar12.mo16687a(67, i3);
                                break;
                            }
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            this.f193070dm = i3;
                            break;
                        case 15:
                            this.f193069dl = i3;
                            break;
                        case 16:
                            this.f193068dk = i3;
                            AbstractC86253m mVar13 = this.f192923ah;
                            if (mVar13 != null) {
                                mVar13.mo16687a(83, i3);
                                break;
                            }
                            break;
                        case 17:
                            if (i3 == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.f193364l = z3;
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            this.f193180fs = i3 == 1;
                            break;
                        case 19:
                            this.f193181ft = i3;
                            break;
                        case C84224v.f188239U:
                            this.f193077dt = i3;
                            this.f192920ae.mo137635o(i3);
                            AbstractC86253m mVar14 = this.f192923ah;
                            if (mVar14 != null) {
                                mVar14.mo16687a(133, i3);
                                break;
                            }
                            break;
                        case 21:
                            if (i3 != 1) {
                                this.f193183fv = false;
                                break;
                            } else {
                                this.f193183fv = true;
                                this.f193182fu = C86377bf.m148936a();
                                C86409d.m149062a(this.f192916aa);
                                break;
                            }
                        case 22:
                            if (this.f193182fu != null) {
                                C86377bf.m148937a(i3);
                                break;
                            }
                            break;
                        case 23:
                            if (this.f193182fu != null) {
                                C86377bf.m148938b(i3);
                                break;
                            }
                            break;
                        case 24:
                            this.f193097eM = i3;
                            AbstractC86253m mVar15 = this.f192923ah;
                            if (mVar15 != null) {
                                mVar15.mo16687a(137, i3);
                                break;
                            }
                            break;
                        case 25:
                            this.f193098eN = i3;
                            AbstractC86253m mVar16 = this.f192923ah;
                            if (mVar16 != null) {
                                mVar16.mo16687a(138, i3);
                                break;
                            }
                            break;
                        case 26:
                            this.f193101eQ = i3;
                            AbstractC86253m mVar17 = this.f192923ah;
                            if (mVar17 != null) {
                                mVar17.mo16687a(154, i3);
                                break;
                            }
                            break;
                        case 27:
                            this.f193185fx = i3;
                            break;
                        case 28:
                            this.f192994cE = i3;
                            break;
                        case 29:
                        case 494:
                            this.f192961bV = i3;
                            if (i3 > 0) {
                                if (this.f192960bU == null) {
                                    this.f192960bU = m148691f(this.f192919ad);
                                }
                                if (this.f192960bU != null && m148692g(this.f192919ad)) {
                                    this.f192960bU.start(f192850ce, this.f193246hG);
                                    this.f192920ae.mo137527N(1);
                                }
                            } else {
                                IABRModule iABRModule = this.f192960bU;
                                if (iABRModule != null) {
                                    iABRModule.stop();
                                    this.f192920ae.mo137527N(0);
                                }
                            }
                            AbstractC86253m mVar18 = this.f192923ah;
                            if (mVar18 != null) {
                                mVar18.mo16687a(172, i3);
                                break;
                            }
                            break;
                        case 85:
                            if (i3 != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f193362ju = z4;
                            break;
                        case 120:
                            this.f193115ee = i3;
                            AbstractC86253m mVar19 = this.f192923ah;
                            if (mVar19 != null) {
                                mVar19.mo16687a(90, i3);
                                break;
                            }
                            break;
                        case 198:
                            this.f192976bm = i3;
                            AbstractC86253m mVar20 = this.f192923ah;
                            if (mVar20 != null) {
                                mVar20.mo16687a(201, i3);
                                break;
                            }
                            break;
                        case 199:
                            this.f193142fF = i3;
                            if (i3 == 1 && (!(this.f193279hn == null && this.f192923ah == null) && this.f192977bn == null)) {
                                mo137205c();
                                VideoSurface videoSurface = this.f192977bn;
                                if (videoSurface != null) {
                                    videoSurface.mo136450a(mo137269u(), mo137270v());
                                }
                                SurfaceHolder surfaceHolder = this.f192918ac;
                                if (surfaceHolder == null) {
                                    Surface surface = this.f192917ab;
                                    if (surface != null) {
                                        m148690e(surface);
                                        break;
                                    }
                                } else {
                                    m148690e(surfaceHolder.getSurface());
                                    break;
                                }
                            }
                            break;
                        case 200:
                            int i4 = i3 * 1000;
                            this.f193073dp = i4;
                            AbstractC86253m mVar21 = this.f192923ah;
                            if (mVar21 != null) {
                                mVar21.mo16687a(86, i4);
                                break;
                            }
                            break;
                        case 201:
                            this.f193084e = i3;
                            if (i3 < 500) {
                                this.f193084e = 500;
                            }
                            AbstractC86253m mVar22 = this.f192923ah;
                            if (mVar22 != null) {
                                mVar22.mo16687a(66, this.f193084e);
                                break;
                            }
                            break;
                        case 202:
                            this.f193114ed = i3;
                            AbstractC86253m mVar23 = this.f192923ah;
                            if (mVar23 != null) {
                                mVar23.mo16687a(110, i3);
                                break;
                            }
                            break;
                        case 203:
                        case 311:
                            this.f193368p = i3;
                            AbstractC86253m mVar24 = this.f192923ah;
                            if (mVar24 != null) {
                                mVar24.mo16687a(95, i3);
                                break;
                            }
                            break;
                        case 204:
                            this.f193081dx = i3;
                            AbstractC86253m mVar25 = this.f192923ah;
                            if (mVar25 != null) {
                                mVar25.mo16687a(96, i3);
                                break;
                            }
                            break;
                        case 205:
                            this.f193082dy = i3;
                            AbstractC86253m mVar26 = this.f192923ah;
                            if (mVar26 != null) {
                                mVar26.mo16687a(134, i3);
                                break;
                            }
                            break;
                        case 206:
                            AbstractC86468j jVar = this.f192920ae;
                            break;
                        case 207:
                            if (this.f193037dE >= 0) {
                                this.f193037dE = i3;
                                AbstractC86253m mVar27 = this.f192923ah;
                                if (mVar27 != null) {
                                    mVar27.mo16687a(159, i3);
                                    break;
                                }
                            } else {
                                return;
                            }
                            break;
                        case 208:
                            this.f193038dF = i3;
                            AbstractC86253m mVar28 = this.f192923ah;
                            if (mVar28 != null) {
                                mVar28.mo16687a(192, i3);
                                break;
                            }
                            break;
                        case 213:
                            this.f193039dG = i3;
                            AbstractC86253m mVar29 = this.f192923ah;
                            if (mVar29 != null) {
                                mVar29.mo16687a(195, i3);
                                break;
                            }
                            break;
                        case 214:
                            this.f193040dH = i3;
                            AbstractC86253m mVar30 = this.f192923ah;
                            if (mVar30 != null) {
                                mVar30.mo16687a(199, i3);
                                break;
                            }
                            break;
                        case 215:
                            this.f193041dI = i3;
                            AbstractC86253m mVar31 = this.f192923ah;
                            if (mVar31 != null) {
                                mVar31.mo16687a(88, i3);
                                break;
                            }
                            break;
                        case 216:
                            this.f193042dJ = i3;
                            AbstractC86253m mVar32 = this.f192923ah;
                            if (mVar32 != null) {
                                mVar32.mo16687a(97, i3);
                                break;
                            }
                            break;
                        case 250:
                            this.f193274hi = i3;
                            AbstractC86253m mVar33 = this.f192923ah;
                            if (mVar33 != null) {
                                mVar33.mo16687a(250, i3);
                                break;
                            }
                            break;
                        case 255:
                            this.f193058dZ = i3;
                            AbstractC86253m mVar34 = this.f192923ah;
                            if (mVar34 != null) {
                                mVar34.mo16687a(255, i3);
                                break;
                            }
                            break;
                        case 301:
                            this.f193066di = i3;
                            C86385d.m148958a().mo137360a(this.f193066di);
                            break;
                        case 302:
                            this.f193067dj = i3;
                            break;
                        case 310:
                            this.f193074dq = i3;
                            AbstractC86253m mVar35 = this.f192923ah;
                            if (mVar35 != null) {
                                mVar35.mo16687a(230, i3);
                                break;
                            }
                            break;
                        case 312:
                            this.f193218gf = i3 == 1;
                            break;
                        case 313:
                            if (i3 == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            this.f193220gh = z5;
                            break;
                        case 314:
                            this.f193197gK = i3;
                            break;
                        case 320:
                        case 472:
                            this.f193116ef = i3;
                            AbstractC86253m mVar36 = this.f192923ah;
                            if (mVar36 != null) {
                                mVar36.mo16687a(223, i3);
                            }
                            C86385d.m148958a().mo137374b(i3);
                            break;
                        case 321:
                            this.f193117eh = i3;
                            AbstractC86253m mVar37 = this.f192923ah;
                            if (mVar37 != null) {
                                mVar37.mo16687a(301, i3);
                                break;
                            }
                            break;
                        case 322:
                            this.f193043dK = i3;
                            AbstractC86253m mVar38 = this.f192923ah;
                            if (mVar38 != null) {
                                mVar38.mo16687a(211, i3);
                            }
                            this.f192920ae.mo137583c(26, i3);
                            break;
                        case 323:
                            this.f193044dL = i3;
                            AbstractC86253m mVar39 = this.f192923ah;
                            if (mVar39 != null) {
                                mVar39.mo16687a(216, i3);
                                break;
                            }
                            break;
                        case 324:
                            this.f193045dM = i3;
                            AbstractC86253m mVar40 = this.f192923ah;
                            if (mVar40 != null) {
                                mVar40.mo16687a(215, i3);
                                break;
                            }
                            break;
                        case 329:
                            this.f193048dP = i3;
                            AbstractC86253m mVar41 = this.f192923ah;
                            if (mVar41 != null) {
                                mVar41.mo16687a(302, i3);
                                break;
                            }
                            break;
                        case 330:
                            this.f193112eb = i3;
                            AbstractC86253m mVar42 = this.f192923ah;
                            if (mVar42 != null) {
                                mVar42.mo16687a(247, i3);
                                break;
                            }
                            break;
                        case 331:
                            this.f193113ec = i3;
                            AbstractC86253m mVar43 = this.f192923ah;
                            if (mVar43 != null) {
                                mVar43.mo16687a(248, i3);
                                break;
                            }
                            break;
                        case 332:
                            this.f193280ho = i3;
                            AbstractC86253m mVar44 = this.f193279hn;
                            if (!(mVar44 == null && (mVar44 = this.f192923ah) == null)) {
                                mVar44.mo16687a(400, i3);
                                break;
                            }
                        case 333:
                            this.f193281hp = i3;
                            AbstractC86253m mVar45 = this.f193279hn;
                            if (!(mVar45 == null && (mVar45 = this.f192923ah) == null)) {
                                mVar45.mo16687a(254, i3);
                                break;
                            }
                        case 334:
                            this.f193320id = i3;
                            break;
                        case 335:
                            this.f193321ie = i3;
                            break;
                        case 339:
                            this.f193238gz = i3;
                            AbstractC86253m mVar46 = this.f192923ah;
                            if (mVar46 != null) {
                                mVar46.mo16687a(280, i3);
                                break;
                            }
                            break;
                        case 340:
                            this.f193036dD = i3;
                            AbstractC86253m mVar47 = this.f192923ah;
                            if (mVar47 != null) {
                                mVar47.mo16687a(98, i3);
                                break;
                            }
                            break;
                        case 341:
                            this.f193322if = i3;
                            IABRModule iABRModule2 = this.f192960bU;
                            if (iABRModule2 != null) {
                                iABRModule2.setIntOptionForKey(6, i3);
                                break;
                            }
                            break;
                        case 342:
                            this.f193323ig = i3;
                            IABRModule iABRModule3 = this.f192960bU;
                            if (iABRModule3 != null) {
                                iABRModule3.setIntOptionForKey(7, i3);
                                break;
                            }
                            break;
                        case 343:
                            this.f193056dX = i3;
                            AbstractC86253m mVar48 = this.f192923ah;
                            if (mVar48 != null) {
                                mVar48.mo16687a(643, i3);
                                break;
                            }
                            break;
                        case 358:
                            this.f193119ej = i3;
                            AbstractC86253m mVar49 = this.f192923ah;
                            if (mVar49 != null) {
                                mVar49.mo16687a(358, i3);
                                break;
                            }
                            break;
                        case 370:
                            this.f193121el = i3;
                            AbstractC86253m mVar50 = this.f192923ah;
                            if (mVar50 != null) {
                                mVar50.mo16687a(370, i3);
                                break;
                            }
                            break;
                        case 371:
                            this.f193072do = i3;
                            AbstractC86253m mVar51 = this.f192923ah;
                            if (mVar51 != null) {
                                mVar51.mo16687a(827, i3);
                                break;
                            }
                            break;
                        case 400:
                            if (i3 == 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            this.f193138fB = z6;
                            break;
                        case 401:
                            this.f193100eP = i3;
                            break;
                        case 402:
                            this.f193009cV = i3;
                            break;
                        case 403:
                            this.f193215gc = i3 == 1;
                            break;
                        case 410:
                            if (i3 == 1) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            this.f193214gb = z7;
                            break;
                        case 411:
                            C86277r.m148510b(24, i3);
                            break;
                        case 413:
                            this.f193216gd = i3;
                            break;
                        case 414:
                            this.f193217ge = i3;
                            AbstractC86253m mVar52 = this.f192923ah;
                            break;
                        case 415:
                            this.f193035dC = i3;
                            AbstractC86253m mVar53 = this.f192923ah;
                            if (mVar53 != null) {
                                mVar53.mo16687a(94, i3);
                                break;
                            }
                            break;
                        case 416:
                            this.f193230gr = i3;
                            break;
                        case 417:
                            this.f193227go = i3;
                            AbstractC86253m mVar54 = this.f192923ah;
                            if (mVar54 != null) {
                                mVar54.mo16687a(185, i3);
                                break;
                            }
                            break;
                        case 418:
                            this.f193233gu = i3;
                            break;
                        case 419:
                            this.f193198gL = i3;
                            break;
                        case 420:
                            this.f193199gM = i3;
                            break;
                        case 421:
                            this.f193201gO = i3;
                            break;
                        case 422:
                            this.f193209gW = i3;
                            break;
                        case 423:
                            this.f193210gX = i3;
                            break;
                        case 424:
                            this.f193223gk = i3;
                            break;
                        case 425:
                            this.f193224gl = i3;
                            break;
                        case 427:
                            if (i3 == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            this.f193221gi = z8;
                            break;
                        case 430:
                            this.f193275hj = i3;
                            AbstractC86253m mVar55 = this.f192923ah;
                            if (mVar55 != null) {
                                mVar55.mo16687a(378, i3);
                                break;
                            }
                            break;
                        case 431:
                            this.f193276hk = i3;
                            break;
                        case 432:
                            this.f192995cF |= 128;
                            if (i3 != 0) {
                                this.f192998cK = "bytevc2";
                                break;
                            }
                            break;
                        case 450:
                            if (i3 > 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            this.f193139fC = z9;
                            break;
                        case 460:
                            this.f193064dg = i3;
                            AbstractC86253m mVar56 = this.f192923ah;
                            if (mVar56 != null) {
                                mVar56.mo16687a(252, i3);
                            }
                            this.f192920ae.mo137583c(32, this.f193064dg);
                            break;
                        case 470:
                            C86346ao.f193424a = i3 == 1;
                            break;
                        case 471:
                            this.f193277hl = i3;
                            break;
                        case 473:
                            this.f193204gR = i3;
                            break;
                        case 474:
                            this.f193211gY = i3;
                            break;
                        case 475:
                            this.f193212gZ = i3;
                            break;
                        case 476:
                            this.f193283hs = i3;
                            AbstractC86253m mVar57 = this.f192923ah;
                            if (mVar57 != null) {
                                mVar57.mo16687a(256, i3);
                                break;
                            }
                            break;
                        case 478:
                            this.f193200gN = i3;
                            break;
                        case 479:
                            AbstractC86468j jVar2 = this.f192920ae;
                            if (jVar2 != null) {
                                jVar2.mo137583c(10, i3);
                                break;
                            }
                            break;
                        case 480:
                            this.f192944bD = i3;
                            this.f192945bE = System.currentTimeMillis();
                            AbstractC86253m mVar58 = this.f192923ah;
                            if (mVar58 != null) {
                                mVar58.mo16687a(261, i3);
                            }
                            this.f192920ae.mo137583c(45, i3);
                            this.f192920ae.mo137583c(11, i3);
                            break;
                        case 481:
                            this.f193234gv = i3;
                            AbstractC86253m mVar59 = this.f192923ah;
                            if (mVar59 != null) {
                                mVar59.mo16687a(263, i3);
                                break;
                            }
                            break;
                        case 482:
                            this.f193235gw = i3;
                            AbstractC86253m mVar60 = this.f192923ah;
                            if (mVar60 != null) {
                                mVar60.mo16687a(276, i3);
                                break;
                            }
                            break;
                        case 483:
                            this.f193205gS = i3;
                            break;
                        case 484:
                            this.f193236gx = i3;
                            AbstractC86253m mVar61 = this.f192923ah;
                            if (mVar61 != null) {
                                mVar61.mo16687a(278, i3);
                                break;
                            }
                            break;
                        case 485:
                            this.f193237gy = i3;
                            AbstractC86253m mVar62 = this.f192923ah;
                            if (mVar62 != null) {
                                mVar62.mo16687a(279, i3);
                                break;
                            }
                            break;
                        case 486:
                            this.f193231gs = i3;
                            break;
                        case 487:
                            this.f193232gt = i3;
                            break;
                        case 488:
                            this.f193188gB = i3;
                            AbstractC86253m mVar63 = this.f192923ah;
                            if (mVar63 != null) {
                                mVar63.mo16687a(401, i3);
                                break;
                            }
                            break;
                        case 489:
                            this.f193208gV = i3;
                            break;
                        case 490:
                            this.f193189gC = i3;
                            AbstractC86253m mVar64 = this.f192923ah;
                            if (mVar64 != null) {
                                mVar64.mo16687a(285, i3);
                                break;
                            }
                            break;
                        case 491:
                            if (i3 > 0) {
                                this.f193190gD = i3;
                                AbstractC86253m mVar65 = this.f192923ah;
                                if (mVar65 != null) {
                                    mVar65.mo16687a(286, i3);
                                    break;
                                }
                            }
                            break;
                        case 492:
                            this.f193133ex = Boolean.valueOf(i3 > 0);
                            break;
                        case 493:
                            this.f193003cP = i3 == 1;
                            break;
                        case 495:
                            this.f193206gT = i3;
                            break;
                        case 496:
                            this.f193207gU = i3;
                            break;
                        case 497:
                            this.f193191gE = ((float) i3) / 1000.0f;
                            break;
                        case 498:
                            this.f193202gP = i3;
                            AbstractC86253m mVar66 = this.f192923ah;
                            if (mVar66 != null) {
                                mVar66.mo16687a(146, i3);
                                break;
                            }
                            break;
                        case 499:
                            this.f193019cm = i3;
                            AbstractC86253m mVar67 = this.f192923ah;
                            if (mVar67 != null) {
                                mVar67.mo16687a(613, i3);
                            }
                            AbstractC86468j jVar3 = this.f192920ae;
                            if (jVar3 != null) {
                                jVar3.mo137583c(48, i3);
                                break;
                            }
                            break;
                        case 500:
                            this.f193246hG = i3;
                            break;
                        case 501:
                            this.f193247hH = i3;
                            break;
                        case 502:
                            this.f193253hN = i3;
                            break;
                        case 503:
                            this.f192963bX = i3;
                            break;
                        case 504:
                            this.f193248hI = i3;
                            ABRConfig.setSwitchModel(i3);
                            break;
                        case 505:
                            this.f193249hJ = i3;
                            ABRConfig.setStartupModel(i3);
                            break;
                        case 506:
                            this.f193251hL = i3;
                            ABRConfig.setFixedLevel(i3);
                            break;
                        case 507:
                            this.f193263hX = i3;
                            break;
                        case 508:
                            if (C86385d.m148958a().mo137381d(12) == 200) {
                                i3 = 1;
                            }
                            this.f193192gF = i3;
                            AbstractC86253m mVar68 = this.f192923ah;
                            if (mVar68 != null) {
                                mVar68.mo16687a(292, i3);
                                break;
                            }
                            break;
                        case 509:
                            this.f193193gG = i3;
                            AbstractC86253m mVar69 = this.f192923ah;
                            if (mVar69 != null) {
                                mVar69.mo16687a(293, i3);
                                break;
                            }
                            break;
                        case 510:
                            this.f193303iM = i3;
                            AbstractC86468j jVar4 = this.f192920ae;
                            if (jVar4 != null) {
                                jVar4.mo137583c(46, i3);
                                break;
                            }
                            break;
                        case 515:
                            this.f193267hb = i3;
                            AbstractC86253m mVar70 = this.f192923ah;
                            if (mVar70 != null) {
                                mVar70.mo16687a(515, i3);
                                break;
                            }
                            break;
                        case 516:
                            this.f193194gH = i3;
                            AbstractC86253m mVar71 = this.f192923ah;
                            if (mVar71 != null) {
                                mVar71.mo16687a(297, i3);
                                break;
                            }
                            break;
                        case 517:
                            this.f193304iN = i3;
                            break;
                        case 518:
                            this.f193305iO = i3;
                            break;
                        case 519:
                            if (i3 != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f193005cR = z10;
                            break;
                        case 520:
                            if (i3 != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f193057dY = z11;
                            break;
                        case 521:
                            this.f192962bW = i3;
                            if (i3 > 0 && this.f192961bV == 0) {
                                f192850ce = 4;
                                break;
                            }
                        case 522:
                            if (i3 != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            this.f193325ii = z12;
                            this.f192920ae.mo137583c(18, i3);
                            break;
                        case 523:
                            f192848cc = i3;
                            this.f192920ae.mo137583c(19, i3);
                            break;
                        case 525:
                            this.f193264hY = i3;
                            break;
                        case 530:
                            this.f193228gp = i3;
                            AbstractC86253m mVar72 = this.f192923ah;
                            if (!(mVar72 == null || this.f192920ae == null)) {
                                mVar72.mo16687a(619, i3);
                                this.f192920ae.mo137565b();
                                break;
                            }
                        case 533:
                            this.f193020cn = i3;
                            AbstractC86253m mVar73 = this.f192923ah;
                            if (mVar73 != null) {
                                mVar73.mo16687a(618, i3);
                            }
                            AbstractC86468j jVar5 = this.f192920ae;
                            if (jVar5 != null) {
                                jVar5.mo137583c(49, i3);
                                break;
                            }
                            break;
                        case 534:
                            this.f193021co = i3;
                            AbstractC86468j jVar6 = this.f192920ae;
                            if (jVar6 != null) {
                                jVar6.mo137583c(47, i3);
                                break;
                            }
                            break;
                        case 536:
                            this.f193254hO = i3;
                            break;
                        case 537:
                            this.f193255hP = i3;
                            break;
                        case 541:
                            this.f193203gQ = i3;
                            break;
                        case 542:
                            this.f193143fG = i3;
                            break;
                        case 543:
                            this.f193327ik = i3;
                            AbstractC86253m mVar74 = this.f192923ah;
                            if (mVar74 != null) {
                                mVar74.mo16687a(542, i3);
                                break;
                            }
                            break;
                        case 544:
                            this.f193261hV = i3;
                            break;
                        case 550:
                            this.f193328il = i3;
                            AbstractC86253m mVar75 = this.f192923ah;
                            if (mVar75 != null) {
                                mVar75.mo16687a(550, i3);
                                break;
                            }
                            break;
                        case 551:
                            this.f193329im = i3;
                            AbstractC86253m mVar76 = this.f192923ah;
                            if (mVar76 != null) {
                                mVar76.mo16687a(551, i3);
                                break;
                            }
                            break;
                        case 552:
                            this.f193330in = i3;
                            AbstractC86253m mVar77 = this.f192923ah;
                            if (mVar77 != null) {
                                mVar77.mo16687a(552, i3);
                                break;
                            }
                            break;
                        case 557:
                            this.f193331io = i3;
                            AbstractC86253m mVar78 = this.f192923ah;
                            if (mVar78 != null) {
                                mVar78.mo16687a(557, i3);
                                break;
                            }
                            break;
                        case 558:
                            if (i3 != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            this.f193373u = z13;
                            break;
                        case 559:
                            this.f193332ip = i3;
                            AbstractC86253m mVar79 = this.f192923ah;
                            if (mVar79 != null) {
                                mVar79.mo16687a(558, i3);
                                break;
                            }
                            break;
                        case 560:
                            this.f193333iq = i3;
                            AbstractC86253m mVar80 = this.f192923ah;
                            if (mVar80 != null) {
                                mVar80.mo16687a(559, i3);
                                break;
                            }
                            break;
                        case 561:
                            this.f193334ir = i3;
                            break;
                        case 562:
                            this.f193335is = i3;
                            AbstractC86253m mVar81 = this.f192923ah;
                            if (mVar81 != null) {
                                mVar81.mo16687a(561, i3);
                                break;
                            }
                            break;
                        case 563:
                            this.f193336it = i3;
                            AbstractC86253m mVar82 = this.f192923ah;
                            if (mVar82 != null) {
                                mVar82.mo16687a(562, i3);
                                break;
                            }
                            break;
                        case 564:
                            this.f193337iu = i3;
                            break;
                        case 565:
                            this.f193338iv = i3;
                            break;
                        case 566:
                            this.f193353jl = i3;
                            AbstractC86253m mVar83 = this.f192923ah;
                            if (mVar83 != null) {
                                mVar83.mo16687a(565, i3);
                                break;
                            }
                            break;
                        case 567:
                            this.f193339iw = i3;
                            break;
                        case 568:
                            this.f193306iP = i3;
                            AbstractC86253m mVar84 = this.f192923ah;
                            if (mVar84 != null) {
                                mVar84.mo16687a(853, i3);
                                break;
                            }
                            break;
                        case 569:
                            this.f193308iR = i3;
                            AbstractC86253m mVar85 = this.f192923ah;
                            if (mVar85 != null) {
                                mVar85.mo16687a(854, i3);
                                break;
                            }
                            break;
                        case 571:
                            this.f193256hQ = i3;
                            break;
                        case 572:
                            this.f193341iy = i3;
                            break;
                        case 573:
                            this.f193250hK = i3;
                            break;
                        case 574:
                            this.f193252hM = i3;
                            C86576a.m149949a(i3);
                            break;
                        case 575:
                            this.f193342iz = i3;
                            break;
                        case 576:
                            this.f193291iA = i3;
                            break;
                        case 577:
                            this.f193292iB = i3;
                            break;
                        case 578:
                            this.f193293iC = i3;
                            break;
                        case 579:
                            this.f193294iD = i3;
                            break;
                        case 580:
                            this.f193295iE = i3;
                            break;
                        case 581:
                            this.f193296iF = i3;
                            break;
                        case 582:
                            this.f193359jr = i3;
                            AbstractC86253m mVar86 = this.f192923ah;
                            if (mVar86 != null) {
                                mVar86.mo16687a(664, i3);
                                break;
                            }
                            break;
                        case 583:
                            this.f193242hC = i3;
                            break;
                        case 600:
                            this.f193001cN = i3;
                            break;
                        case 601:
                            this.f193002cO = i3;
                            break;
                        case 602:
                            this.f193023cq = i3;
                            AbstractC86253m mVar87 = this.f192923ah;
                            if (mVar87 != null) {
                                mVar87.mo16687a(647, i3);
                                break;
                            }
                            break;
                        case 603:
                            this.f193282hr = i3;
                            break;
                        case 604:
                            AbstractC86468j jVar7 = this.f192920ae;
                            if (jVar7 != null) {
                                jVar7.mo137583c(22, i3);
                                break;
                            }
                            break;
                        case 605:
                            AbstractC86468j jVar8 = this.f192920ae;
                            if (jVar8 != null) {
                                jVar8.mo137583c(23, i3);
                                break;
                            }
                            break;
                        case 606:
                            this.f193268hc = i3;
                            break;
                        case 607:
                            this.f193269hd = i3;
                            AbstractC86253m mVar88 = this.f192923ah;
                            if (mVar88 != null) {
                                mVar88.mo16687a(536, i3);
                                break;
                            }
                            break;
                        case 608:
                            this.f193270he = i3;
                            AbstractC86253m mVar89 = this.f192923ah;
                            if (mVar89 != null) {
                                mVar89.mo16687a(537, i3);
                                break;
                            }
                            break;
                        case 609:
                            this.f193271hf = i3;
                            break;
                        case 610:
                            this.f193272hg = i3;
                            break;
                        case 611:
                            this.f193324ih = i3;
                            AbstractC86253m mVar90 = this.f192923ah;
                            if (mVar90 != null) {
                                mVar90.mo16687a(5003, i3);
                                break;
                            }
                            break;
                        case 612:
                            if (i3 != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            this.f192915aZ = z14;
                            break;
                        case 613:
                            this.f193156fU = i3;
                            AbstractC86253m mVar91 = this.f192923ah;
                            if (mVar91 != null) {
                                mVar91.mo16687a(333, i3);
                                break;
                            }
                            break;
                        case 616:
                            if (i3 == 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            this.f193361jt = z15;
                            break;
                        case 617:
                            AbstractC86468j jVar9 = this.f192920ae;
                            if (jVar9 != null) {
                                jVar9.mo137583c(52, i3);
                                break;
                            }
                            break;
                        case 618:
                            if (i3 != 0 && this.f192991cB == null) {
                                this.f192991cB = new C86459d(this.f192916aa);
                                break;
                            }
                        case 620:
                            this.f193157fV = i3;
                            AbstractC86253m mVar92 = this.f192923ah;
                            if (mVar92 != null) {
                                mVar92.mo16687a(820, i3);
                                break;
                            }
                            break;
                        case 650:
                            this.f193155fT = i3;
                            break;
                        case 652:
                            this.f192989bz = i3;
                            break;
                        case 654:
                            this.f193158fW = i3;
                            VideoSurface videoSurface2 = this.f192977bn;
                            if (videoSurface2 != null) {
                                videoSurface2.mo136457b(9, i3);
                                break;
                            }
                            break;
                        case 656:
                            if (i3 == 1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            this.f193032cz = z16;
                            break;
                        case 657:
                            if (i3 > 0) {
                                this.f193315iY = i3;
                                break;
                            }
                            break;
                        case 658:
                            this.f193226gn = i3;
                            AbstractC86253m mVar93 = this.f192923ah;
                            if (mVar93 != null) {
                                mVar93.mo16687a(823, i3);
                                break;
                            }
                            break;
                        case 661:
                            this.f192978bo = i3;
                            break;
                        case 663:
                            if (i3 == 1) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            this.f193314iX = z17;
                            break;
                        case 664:
                            this.f193378z = i3;
                            break;
                        case 665:
                            this.f193122em = i3;
                            break;
                        case 666:
                            this.f193123en = i3;
                            break;
                        case 668:
                            if (i3 >= 0) {
                                this.f193278hm = i3;
                                break;
                            }
                            break;
                        case 669:
                            this.f193229gq = i3;
                            AbstractC86253m mVar94 = this.f192923ah;
                            if (mVar94 != null) {
                                mVar94.mo16687a(828, i3);
                                break;
                            }
                            break;
                        case 670:
                            this.f193124eo = i3;
                            break;
                        case 671:
                            if (i3 == 1) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            this.f193000cM = z18;
                            break;
                        case 673:
                            if (i3 == 1) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            this.f193354jm = z19;
                            AbstractC86253m mVar95 = this.f192923ah;
                            if (mVar95 != null) {
                                mVar95.mo16687a(149, i3);
                            }
                            this.f192920ae.mo137583c(97, this.f193354jm ? 1 : 0);
                            break;
                        case 675:
                            AbstractC86253m mVar96 = this.f192923ah;
                            if (!(mVar96 == null || this.f193125ep == i3)) {
                                mVar96.mo16687a(660, i3);
                            }
                            this.f193125ep = i3;
                            break;
                        case 677:
                            this.f193312iV = i3;
                            AbstractC86253m mVar97 = this.f192923ah;
                            if (mVar97 != null) {
                                mVar97.mo16687a(870, i3);
                                break;
                            }
                            break;
                        case 678:
                            this.f193307iQ = i3;
                            AbstractC86253m mVar98 = this.f192923ah;
                            if (mVar98 != null) {
                                mVar98.mo16687a(829, i3);
                                break;
                            }
                            break;
                        case 679:
                            this.f193010cW = i3;
                            break;
                        case 680:
                            this.f193357jp = i3;
                            break;
                        case 681:
                            if (i3 == 1) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            this.f192993cD = z20;
                            break;
                        case 700:
                            this.f193111ea = i3;
                            AbstractC86253m mVar99 = this.f192923ah;
                            if (mVar99 != null) {
                                mVar99.mo16687a(960, i3);
                                break;
                            }
                            break;
                        case 703:
                            this.f193355jn = i3;
                            break;
                        case 704:
                            this.f192920ae.mo137583c(100, i3);
                            break;
                        case 800:
                            this.f193358jq = i3;
                            break;
                        case 850:
                            this.f193083dz = i3;
                            AbstractC86253m mVar100 = this.f192923ah;
                            if (mVar100 != null) {
                                mVar100.mo16687a(1010, i3);
                                break;
                            }
                            break;
                        case 851:
                            this.f193033dA = i3;
                            AbstractC86253m mVar101 = this.f192923ah;
                            if (mVar101 != null) {
                                mVar101.mo16687a(1011, i3);
                                break;
                            }
                            break;
                        case 852:
                            this.f193034dB = i3;
                            AbstractC86253m mVar102 = this.f192923ah;
                            if (mVar102 != null) {
                                mVar102.mo16687a(1012, i3);
                                break;
                            }
                            break;
                        case 950:
                            this.f193344jc = (long) i3;
                            break;
                        case 951:
                            this.f193345jd = i3;
                            break;
                        case 952:
                            this.f193346je = i3;
                            AbstractC86253m mVar103 = this.f192923ah;
                            if (mVar103 != null) {
                                mVar103.mo16687a(952, i3);
                                break;
                            }
                            break;
                        case 953:
                            this.f193347jf = i3;
                            AbstractC86253m mVar104 = this.f192923ah;
                            if (!(mVar104 == null || i3 == -1)) {
                                mVar104.mo16687a(982, i3);
                                break;
                            }
                        case 954:
                            this.f193348jg = i3;
                            AbstractC86253m mVar105 = this.f192923ah;
                            if (!(mVar105 == null || i3 == -1)) {
                                mVar105.mo16687a(985, i3);
                                break;
                            }
                        case 955:
                            this.f193349jh = i3;
                            AbstractC86253m mVar106 = this.f192923ah;
                            if (!(mVar106 == null || i3 == -1)) {
                                mVar106.mo16687a(1000, i3);
                                break;
                            }
                        case 956:
                            this.f193350ji = i3;
                            AbstractC86253m mVar107 = this.f192923ah;
                            if (!(mVar107 == null || i3 == -1)) {
                                mVar107.mo16687a(1003, i3);
                                break;
                            }
                        case 958:
                            this.f193352jk = i3;
                            AbstractC86253m mVar108 = this.f192923ah;
                            if (mVar108 != null) {
                                mVar108.mo16687a(1005, i3);
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case 31:
                                    AbstractC86253m mVar109 = this.f192923ah;
                                    if (mVar109 != null) {
                                        mVar109.mo16687a(59, i3);
                                        break;
                                    }
                                    break;
                                case 32:
                                    this.f193099eO = i3;
                                    AbstractC86253m mVar110 = this.f192923ah;
                                    if (mVar110 != null) {
                                        mVar110.mo16687a(193, i3);
                                        break;
                                    }
                                    break;
                                case 33:
                                    if (i3 == 1) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    this.f192999cL = z21;
                                    break;
                                case 34:
                                    this.f193102eR = i3;
                                    AbstractC86253m mVar111 = this.f192923ah;
                                    if (mVar111 != null) {
                                        mVar111.mo16687a(206, i3);
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 36:
                                            this.f193103eS = i3;
                                            AbstractC86253m mVar112 = this.f192923ah;
                                            if (mVar112 != null) {
                                                mVar112.mo16687a(208, i3);
                                                break;
                                            }
                                            break;
                                        case 37:
                                            if (i3 == 1) {
                                                z22 = true;
                                            } else {
                                                z22 = false;
                                            }
                                            this.f193105eU = z22;
                                            break;
                                        case 38:
                                            this.f193104eT = i3;
                                            AbstractC86253m mVar113 = this.f192923ah;
                                            if (mVar113 != null) {
                                                mVar113.mo16687a(209, i3);
                                                break;
                                            }
                                            break;
                                    }
                            }
                    }
                    break;
            }
        } else {
            this.f193080dw = i3;
            AbstractC86253m mVar114 = this.f192923ah;
            if (mVar114 != null) {
                mVar114.mo16687a(197, i3);
            }
        }
        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("set int option key:%d value:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i3)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137196b(C86275p pVar) {
        if (this.f192923ah != null) {
            try {
                if (!mo137221d(2) || (Build.VERSION.SDK_INT >= 23 && this.f193370r)) {
                    this.f192923ah.mo16703a(pVar);
                    this.f192920ae.mo137550a(this.f192868E);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo137209c(Surface surface) {
        AbstractC86468j jVar;
        this.f192917ab = surface;
        if (!(surface == null || (jVar = this.f192920ae) == null || this.f192937av)) {
            jVar.mo137659u(surface.toString());
        }
        if (this.f193279hn != null || this.f192923ah != null) {
            m148690e(this.f192917ab);
        }
    }

    /* renamed from: a */
    public final void mo137169a(SurfaceHolder surfaceHolder) {
        AbstractC86468j jVar;
        if (!(this.f193130eu == null || this.f192918ac == null)) {
            C86641i.m150113b("TTVideoEngine", "remove callback:" + this.f193130eu + ", surfaceholder:" + surfaceHolder + ", mSurface:" + this.f192917ab + ", mSurfaceHolder:" + this.f192918ac);
            this.f193130eu.f193448a.clear();
            this.f192918ac.removeCallback(this.f193130eu);
            this.f193130eu = null;
        }
        this.f192918ac = surfaceHolder;
        if (!(surfaceHolder == null || (jVar = this.f192920ae) == null)) {
            jVar.mo137659u(surfaceHolder.toString());
        }
        if (this.f193345jd != 0) {
            AbstractC86253m mVar = this.f192923ah;
            if (mVar != null) {
                mVar.mo16692a(surfaceHolder);
            }
        } else if (this.f192918ac == null) {
            m148690e((Surface) null);
        } else {
            SurfaceHolder$CallbackC86352ar arVar = new SurfaceHolder$CallbackC86352ar(this);
            this.f193130eu = arVar;
            this.f192918ac.addCallback(arVar);
            m148690e(this.f192918ac.getSurface());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo137212c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f192869F.put(str.substring(0, 1).toUpperCase() + str.substring(1), str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04af  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137226e(com.p2082ss.ttvideoengine.p4417j.AbstractC86517e r33) {
        /*
        // Method dump skipped, instructions count: 2553
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137226e(com.ss.ttvideoengine.j.e):void");
    }

    /* renamed from: a */
    public static void m148645a(String str, String str2, String[] strArr, long j, String str3) {
        C86385d.C86400h.f193679a.mo137372a(str, str2, strArr, j, str3);
    }

    /* renamed from: a */
    private String[] m148650a(String[] strArr) {
        if (C86381b.C86382a.f193539a.mo137355e() == 1 && this.f193067dj == 0) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = C86640h.m150091b(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ai$g */
    public static class C86323g implements AbstractC86543b {

        /* renamed from: a */
        private final WeakReference<C86313ai> f193396a;

        static {
            Covode.recordClassIndex(101551);
        }

        @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86543b
        /* renamed from: a */
        public final void mo137278a() {
            C86641i.m150110a("TTVideoEngine", "dns cancelled");
        }

        public C86323g(C86313ai aiVar) {
            this.f193396a = new WeakReference<>(aiVar);
        }

        @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86543b
        /* renamed from: a */
        public final void mo137279a(C86633c cVar) {
            if (cVar == null) {
                Object[] objArr = new Object[1];
                throw new NullPointerException("toString");
            }
        }

        @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86543b
        /* renamed from: a */
        public final void mo137280a(JSONObject jSONObject, C86633c cVar) {
            C86313ai aiVar = this.f193396a.get();
            if (aiVar != null) {
                if (aiVar.f192913aX) {
                    C86641i.m150115c("TTVideoEngine", "MyDNSCompletionListener should stop");
                } else if (cVar != null) {
                    C86641i.m150117e("TTVideoEngine", C1764a.m5928a("dns failed:%s", new Object[]{cVar.toString()}));
                    aiVar.mo137177a(cVar);
                } else {
                    String str = null;
                    if (jSONObject != null) {
                        str = jSONObject.optString("ip");
                        long optLong = jSONObject.optLong("time");
                        String optString = jSONObject.optString("dns_type");
                        if (aiVar.f192920ae != null) {
                            aiVar.f192920ae.mo137636o(optLong);
                            aiVar.f192920ae.mo137591d(86, optString);
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        aiVar.mo137177a(new C86633c("", -9997, "DNS result empty"));
                        C86641i.m150117e("TTVideoEngine", "dns parse empty");
                    } else if (aiVar.f193015ch.mo137317a(false)) {
                        aiVar.f193015ch.mo137312a(300, 0, 0, str);
                    } else {
                        aiVar.mo137256l(str);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ai$p */
    public static class C86332p implements IPlayStateSupplier {

        /* renamed from: a */
        private final WeakReference<C86313ai> f193405a;

        /* renamed from: b */
        private int f193406b = -1;

        /* renamed from: c */
        private int f193407c = -1;

        static {
            Covode.recordClassIndex(101560);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final Queue<IABRModuleSpeedRecord> getTimelineNetworkSpeed() {
            return null;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getNetworkState() {
            return C86307af.m148603a().f192812a;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentDownloadAudioBitrate() {
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null) {
                return -1;
            }
            return aiVar.f192964bY;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentDownloadAudioSegmentIndex() {
            AbstractC86253m mVar;
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || (mVar = aiVar.f192923ah) == null) {
                return -1;
            }
            return mVar.mo16710b(519, -1);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentDownloadVideoBitrate() {
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || aiVar.f192923ah == null) {
                return -1;
            }
            return aiVar.f192923ah.mo16710b(601, -1);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentDownloadVideoSegmentIndex() {
            AbstractC86253m mVar;
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || (mVar = aiVar.f192923ah) == null) {
                return -1;
            }
            return mVar.mo16710b(520, -1);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getCurrentPlaybackTime() {
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || aiVar.f192923ah == null) {
                return -1;
            }
            return aiVar.f192923ah.mo16723k();
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getLoaderType() {
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || aiVar.f192923ah == null) {
                return -1;
            }
            try {
                return Integer.parseInt(aiVar.f192923ah.mo16713c(200));
            } catch (Exception unused) {
                return -1;
            }
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getMaxCacheAudioTime() {
            AbstractC86253m mVar;
            int b;
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || (mVar = aiVar.f192923ah) == null || (b = mVar.mo16710b(24, -1)) <= 0) {
                return 30000;
            }
            return b * 1000;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getMaxCacheVideoTime() {
            AbstractC86253m mVar;
            int b;
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || (mVar = aiVar.f192923ah) == null || (b = mVar.mo16710b(24, -1)) <= 0) {
                return 30000;
            }
            return b * 1000;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getPlaySpeed() {
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || aiVar.f192868E == null) {
                return 1.0f;
            }
            return aiVar.f192868E.f192718d;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getPlayerAudioCacheTime() {
            AbstractC86253m mVar;
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || (mVar = aiVar.f192923ah) == null) {
                return -1;
            }
            return (int) mVar.mo16684a(73, -1L);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final int getPlayerVideoCacheTime() {
            AbstractC86253m mVar;
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null || (mVar = aiVar.f192923ah) == null) {
                return -1;
            }
            return (int) mVar.mo16684a(72, -1L);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getDownloadSpeed() {
            Map<String, String> downloadSpeed;
            if (C86614c.f195160b == null || (downloadSpeed = C86614c.f195160b.getDownloadSpeed(C86537q.f194867a)) == null || downloadSpeed.get("download_speed") == null) {
                return -1.0f;
            }
            return Float.parseFloat(downloadSpeed.get("download_speed"));
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getNetworkSpeed() {
            if (C86614c.f195160b == null) {
                return -1.0f;
            }
            float predictSpeed = C86614c.f195160b.getPredictSpeed(0);
            C86641i.m150113b("TTVideoEngine", C1764a.m5928a("[ABR] get network speed:%f", new Object[]{Float.valueOf(predictSpeed)}));
            return predictSpeed;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getSpeedConfidence() {
            if (C86614c.f195160b == null) {
                return -1.0f;
            }
            float lastPredictConfidence = C86614c.f195160b.getLastPredictConfidence();
            C86641i.m150113b("TTVideoEngine", C1764a.m5928a("[ABR] get network confidence:%f", new Object[]{Float.valueOf(lastPredictConfidence)}));
            return lastPredictConfidence;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final Map<String, IBufferInfo> getAudioBufferInfo() {
            List<C86534o> b;
            HashMap hashMap = new HashMap();
            C86313ai aiVar = this.f193405a.get();
            if (!(aiVar == null || aiVar.f192919ad == null || (b = aiVar.f192919ad.mo137745b()) == null || b.size() == 0)) {
                for (C86534o oVar : b) {
                    if (oVar != null && oVar.mo137723a() == C86537q.f194868b) {
                        ABRBufferInfo aBRBufferInfo = new ABRBufferInfo();
                        String b2 = oVar.mo137726b(15);
                        aBRBufferInfo.setStreamId(b2);
                        aBRBufferInfo.setFileAvailSize(C86385d.C86400h.f193679a.mo137393i(b2));
                        C86528i e = oVar.mo137731e();
                        if (e != null) {
                            aBRBufferInfo.setHeadSize((long) e.f194760b);
                        }
                        hashMap.put(new StringBuilder().append(oVar.mo137724a(3)).toString(), aBRBufferInfo);
                    }
                }
            }
            return hashMap;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final Map<String, IBufferInfo> getVideoBufferInfo() {
            List<C86534o> b;
            HashMap hashMap = new HashMap();
            C86313ai aiVar = this.f193405a.get();
            if (!(aiVar == null || aiVar.f192919ad == null || (b = aiVar.f192919ad.mo137745b()) == null || b.size() == 0)) {
                for (C86534o oVar : b) {
                    if (oVar != null && oVar.mo137723a() == C86537q.f194867a) {
                        ABRBufferInfo aBRBufferInfo = new ABRBufferInfo();
                        String b2 = oVar.mo137726b(15);
                        aBRBufferInfo.setStreamId(b2);
                        aBRBufferInfo.setFileAvailSize(C86385d.C86400h.f193679a.mo137393i(b2));
                        C86528i e = oVar.mo137731e();
                        if (e != null) {
                            aBRBufferInfo.setHeadSize((long) e.f194760b);
                        }
                        hashMap.put(new StringBuilder().append(oVar.mo137724a(3)).toString(), aBRBufferInfo);
                    }
                }
            }
            return hashMap;
        }

        public C86332p(C86313ai aiVar) {
            this.f193405a = new WeakReference<>(aiVar);
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final List<? extends ISegmentInfo> getSegmentInfoList(int i, int i2) {
            Object u;
            C86313ai aiVar = this.f193405a.get();
            if (aiVar == null) {
                return null;
            }
            AbstractC86253m mVar = aiVar.f192923ah;
            ArrayList arrayList = new ArrayList();
            if (i != this.f193406b) {
                this.f193406b = i;
                mVar.mo16687a(522, i);
            }
            if (i2 != this.f193407c) {
                this.f193407c = i2;
                mVar.mo16687a(523, i2);
            }
            if ((mVar instanceof C86572m) && (u = ((C86572m) mVar).mo137831u()) != null) {
                for (Object obj : (Object[]) u) {
                    arrayList.add(new C86300b(obj));
                }
            }
            return arrayList;
        }

        @Override // com.bytedance.vcloud.abrmodule.IPlayStateSupplier
        public final float getAverageDownloadSpeed(int i, int i2, boolean z) {
            if (C86614c.f195160b != null) {
                return C86614c.f195160b.getAverageDownloadSpeed(i, i2, z);
            }
            return -1.0f;
        }
    }

    /* renamed from: com.ss.ttvideoengine.ai$w */
    static class RunnableC86339w implements Runnable {

        /* renamed from: a */
        private File f193413a;

        static {
            Covode.recordClassIndex(101567);
        }

        public final void run() {
            C86640h.m150086a(this.f193413a);
        }

        public RunnableC86339w(File file) {
            this.f193413a = file;
        }
    }

    /* renamed from: X */
    private boolean m148628X() {
        return mo137221d(2);
    }

    /* renamed from: aq */
    private void m148667aq() {
        C86385d.C86400h.f193679a.mo137365a(this, this.f192975bl);
    }

    /* renamed from: D */
    public final void mo137140D() {
        this.f192920ae.mo137552a((C86535p) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final /* synthetic */ void mo137156T() {
        mo137210c(this.f192919ad);
    }

    /* renamed from: f */
    public final float mo137228f() {
        return C86640h.m150088b(this.f192916aa);
    }

    /* renamed from: i */
    public final long mo137243i() {
        return mo137257m(60);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ai$t */
    public static class C86336t implements AbstractC86253m.AbstractC86262i {

        /* renamed from: a */
        private final WeakReference<C86313ai> f193411a;

        static {
            Covode.recordClassIndex(101564);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86262i
        /* renamed from: a */
        public final void mo136844a() {
            C86313ai aiVar = this.f193411a.get();
            if (aiVar != null) {
                aiVar.mo137250j(true);
            }
        }

        public C86336t(C86313ai aiVar) {
            this.f193411a = new WeakReference<>(aiVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ai$u */
    public static class C86337u implements C86433d.AbstractC86435a {

        /* renamed from: a */
        private final WeakReference<C86313ai> f193412a;

        static {
            Covode.recordClassIndex(101565);
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86433d.AbstractC86435a
        /* renamed from: a */
        public final void mo137299a() {
            C86641i.m150110a("TTVideoEngine", "sub fetcher cancelled");
            this.f193412a.get();
        }

        public C86337u(C86313ai aiVar) {
            this.f193412a = new WeakReference<>(aiVar);
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86433d.AbstractC86435a
        /* renamed from: a */
        public final void mo137300a(String str, C86633c cVar) {
            C86313ai aiVar = this.f193412a.get();
            if (aiVar != null) {
                AbstractC86303ab abVar = aiVar.f192875L;
                C86304ac acVar = aiVar.f192876M;
                if (abVar == null || aiVar.f193020cn <= 0) {
                    if (acVar == null || aiVar.f193020cn <= 0) {
                        C86641i.m150117e("TTVideoEngine", "mSubInfoListener is null");
                    } else {
                        acVar.mo101157a(cVar);
                    }
                }
                if (str == null || cVar != null) {
                    C86641i.m150117e("TTVideoEngine", C1764a.m5928a("sub fetch info failed:%s", new Object[]{cVar.toString()}));
                    if (aiVar.f192920ae != null) {
                        aiVar.f192920ae.mo137587c(cVar.toString());
                    }
                } else if (aiVar.f192923ah != null && aiVar.f192920ae != null) {
                    aiVar.mo137253k(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ai$x */
    public class C86340x {

        /* renamed from: a */
        public String f193414a;

        /* renamed from: b */
        public String f193415b;

        /* renamed from: c */
        public boolean f193416c;

        static {
            Covode.recordClassIndex(101568);
        }

        /* renamed from: a */
        public final String mo137302a() {
            if (this.f193416c) {
                return this.f193415b;
            }
            return this.f193414a;
        }

        private C86340x() {
        }

        /* renamed from: a */
        public final void mo137303a(String str) {
            this.f193414a = str;
            this.f193416c = false;
        }

        /* synthetic */ C86340x(C86313ai aiVar, byte b) {
            this();
        }
    }

    /* renamed from: am */
    private int m148663am() {
        AbstractC86253m mVar = this.f192923ah;
        if (mVar == null) {
            return 0;
        }
        return mVar.mo16723k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo137142F() {
        this.f192973bj.clear();
        this.f192974bk.clear();
        this.f192975bl = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo137146J() {
        this.f192911aV = true;
        this.f192913aX = false;
        this.f192933ar = false;
        this.f193170fi = 0;
        m148695k(true);
        this.f192971bh = false;
    }

    /* renamed from: d */
    public final AbstractC86508b mo137214d() {
        AbstractC86468j jVar = this.f192920ae;
        if (jVar == null) {
            return null;
        }
        return jVar.mo137663w();
    }

    /* renamed from: g */
    public final boolean mo137237g() {
        boolean z = this.f192895aF;
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null) {
            return mVar.mo16730r();
        }
        return z;
    }

    /* renamed from: h */
    public final AbstractC86561j mo137238h() {
        AbstractC86561j jVar = this.f192870G;
        if (jVar != null) {
            return jVar;
        }
        if (C86346ao.f193425b != null) {
            return C86346ao.f193425b;
        }
        return null;
    }

    /* renamed from: u */
    public final int mo137269u() {
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null) {
            return mVar.mo16725m();
        }
        return 0;
    }

    /* renamed from: v */
    public final int mo137270v() {
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null) {
            return mVar.mo16724l();
        }
        return 0;
    }

    /* renamed from: com.ss.ttvideoengine.ai$m */
    static class C86329m implements AbstractC86462f {

        /* renamed from: a */
        private final WeakReference<C86313ai> f193402a;

        static {
            Covode.recordClassIndex(101557);
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: e */
        public final ArrayList mo137296e() {
            C86313ai aiVar = this.f193402a.get();
            if (!(aiVar == null || aiVar.f192888Y == null)) {
                Object a = aiVar.f192888Y.mo137333a();
                if (a instanceof ArrayList) {
                    return (ArrayList) a;
                }
            }
            return null;
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: c */
        public final String mo137293c() {
            C86313ai aiVar = this.f193402a.get();
            if (aiVar != null && aiVar.f192969bf != 0) {
                return C86385d.C86400h.f193679a.mo137384e(aiVar.f193014cg);
            }
            C86641i.m150117e("TTVideoEngine", "videoEngine is:" + aiVar + ", dataloader enable:" + aiVar.f192969bf);
            return null;
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: d */
        public final Map<String, Object> mo137295d() {
            Intent a;
            int i;
            C86313ai aiVar = this.f193402a.get();
            if (aiVar == null || aiVar.f192991cB == null) {
                return null;
            }
            C86459d dVar = aiVar.f192991cB;
            if (dVar.f193901a == null || (a = C86459d.m149203a(dVar.f193901a, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
                return null;
            }
            int intExtra = a.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                i = 1;
            } else {
                i = 0;
            }
            int intExtra2 = a.getIntExtra("plugged", -1);
            int intExtra3 = a.getIntExtra("level", -1);
            int intExtra4 = a.getIntExtra("scale", -1);
            HashMap hashMap = new HashMap(3);
            hashMap.put("isCharging", Integer.valueOf(i));
            hashMap.put("chargePlug", Integer.valueOf(intExtra2));
            hashMap.put("power", Integer.valueOf((intExtra3 * 100) / intExtra4));
            return hashMap;
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: a */
        public final Map<String, String> mo137288a() {
            C86313ai aiVar = this.f193402a.get();
            if (aiVar == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            String a = C86277r.m148504a(14, "");
            if (aiVar.f192866C == 0 || aiVar.f192866C == 1) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "3.0");
                hashMap.put("pc", a);
                hashMap.put("sdk_version", "1.10.61.5");
            } else if (aiVar.f192866C == 2) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "1.0");
                hashMap.put("pc", "0");
                hashMap.put("sdk_version", "1.10.61.5");
            } else if (aiVar.f192866C == 5) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "5.0");
                hashMap.put("pc", "5");
                hashMap.put("sdk_version", "1.10.61.5");
            } else {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "4.0");
                hashMap.put("pc", a);
                hashMap.put("sdk_version", "1.10.61.5");
            }
            hashMap.put("trv", "3.8.4");
            try {
                hashMap.put("ffv", (String) Class.forName("com.ss.ttffmpeg.FFmpegLibLoaderWrapper").getMethod("getFFmpegVersion", new Class[0]).invoke(null, new Object[0]));
            } catch (Throwable th) {
                C86641i.m150115c("TTVideoEngine", "get ffmpeg version error: " + th.toString());
            }
            return hashMap;
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: b */
        public final Map<String, Long> mo137291b() {
            AbstractC86253m mVar;
            C86313ai aiVar = this.f193402a.get();
            if (aiVar == null || (mVar = aiVar.f192923ah) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("vds", Long.valueOf(mVar.mo16684a(45, 0L)));
            hashMap.put("vps", Long.valueOf(mVar.mo16684a(46, 0L)));
            hashMap.put("download_speed", Long.valueOf(mVar.mo16684a(63, -1L)));
            hashMap.put("vlen", Long.valueOf(mVar.mo16684a(72, 0L)));
            hashMap.put("alen", Long.valueOf(mVar.mo16684a(73, 0L)));
            hashMap.put("vDecLen", Long.valueOf(mVar.mo16684a(602, 0L)));
            hashMap.put("aDecLen", Long.valueOf(mVar.mo16684a(603, 0L)));
            hashMap.put("vBaseLen", Long.valueOf(mVar.mo16684a(604, 0L)));
            hashMap.put("aBaseLen", Long.valueOf(mVar.mo16684a(605, 0L)));
            hashMap.put("avGap", Long.valueOf(mVar.mo16684a(606, -1L)));
            hashMap.put("single_vds", Long.valueOf(mVar.mo16684a(145, 0L)));
            return hashMap;
        }

        public C86329m(C86313ai aiVar) {
            this.f193402a = new WeakReference<>(aiVar);
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: d */
        public final float mo137294d(int i) {
            C86313ai aiVar = this.f193402a.get();
            if (aiVar == null || aiVar.f192923ah == null) {
                return 0.0f;
            }
            if (i == 82) {
                return aiVar.f192923ah.mo16708b(151);
            }
            if (i != 83) {
                return 0.0f;
            }
            return aiVar.f192923ah.mo16708b(150);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: a */
        public final String mo137287a(int i) {
            C86313ai aiVar = this.f193402a.get();
            if (aiVar == null) {
                return "";
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        AbstractC86253m mVar = aiVar.f192923ah;
                        if (mVar != null) {
                            return mVar.mo16713c(5002);
                        }
                    } else if (i == 3) {
                        return aiVar.f192932aq;
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                switch (i) {
                                    case C84224v.f188239U:
                                        if (aiVar.f192931ap != null) {
                                            return C86383c.C86384a.f193541a.mo137356a();
                                        }
                                        break;
                                    case 29:
                                        return aiVar.f193367o;
                                    case 37:
                                        return C86385d.C86400h.f193679a.mo137387f();
                                    case 46:
                                        if (aiVar.f192920ae != null) {
                                            return aiVar.f192920ae.mo137638p();
                                        }
                                        return "";
                                    case 55:
                                        if (aiVar.f192923ah != null) {
                                            return aiVar.f192923ah.mo16713c(609);
                                        }
                                        break;
                                    case 65:
                                        if (aiVar.f192923ah != null) {
                                            return aiVar.f192923ah.mo16713c(516);
                                        }
                                        break;
                                    case 76:
                                        if (aiVar.f192929an != null) {
                                            return aiVar.f192929an.mo137726b(7);
                                        }
                                        return "";
                                    case 78:
                                        if (aiVar.f192923ah != null) {
                                            return aiVar.f192923ah.mo16713c(825);
                                        }
                                        break;
                                    case 80:
                                        if (aiVar.f192923ah != null) {
                                            return aiVar.f192923ah.mo16713c(824);
                                        }
                                        break;
                                    case 102:
                                        return aiVar.f192957bQ;
                                    case 110:
                                        if (aiVar.f192923ah != null) {
                                            return aiVar.f192923ah.mo16713c(467);
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 31:
                                                try {
                                                    return Build.BOARD;
                                                } catch (Exception unused) {
                                                    return "";
                                                }
                                            case 32:
                                                try {
                                                    return Build.HARDWARE;
                                                } catch (Exception unused2) {
                                                    return "";
                                                }
                                            case 33:
                                                if (aiVar.f192923ah != null) {
                                                    return aiVar.f192923ah.mo16713c(200);
                                                }
                                                break;
                                        }
                                }
                            } else if (aiVar.f192923ah != null) {
                                return aiVar.f192923ah.mo16713c(71);
                            }
                        } else if (aiVar.mo137238h() == null) {
                            return "own";
                        } else {
                            return "user";
                        }
                    }
                } else if (aiVar.f192923ah != null) {
                    int b = aiVar.f192923ah.mo16710b(139, -1);
                    if (b == 0) {
                        return "opengl";
                    }
                    if (b != 1) {
                        return "";
                    }
                    return "nativewindow";
                }
            } else if (aiVar.f192923ah != null) {
                int i2 = aiVar.f193026ct;
                if (i2 < 0) {
                    i2 = aiVar.f192923ah.mo16710b(141, -1);
                }
                if (i2 == 0) {
                    return "h264";
                }
                if (i2 == 1) {
                    return "bytevc1";
                }
                if (i2 == 33) {
                    return "bytevc2";
                }
            }
            return "";
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: b */
        public final long mo137290b(int i) {
            C86313ai aiVar = this.f193402a.get();
            if (aiVar == null) {
                return 0;
            }
            if (i != 95) {
                AbstractC86253m mVar = aiVar.f192923ah;
                if (mVar == null) {
                    return 0;
                }
                if (i == 7) {
                    return mVar.mo16684a(68, 0L);
                }
                if (i == 45) {
                    return mVar.mo16684a(152, -1L);
                }
                if (i == 66) {
                    return mVar.mo16684a(517, -1L);
                }
                if (i == 68) {
                    return mVar.mo16684a(72, -1L);
                }
                if (i == 75) {
                    return mVar.mo16684a(171, -1L);
                }
                if (i == 96) {
                    return mVar.mo16684a(526, -1L);
                }
                switch (i) {
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        return mVar.mo16684a(69, 0L);
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        return mVar.mo16684a(70, 0L);
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        return mVar.mo16684a(75, 0L);
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        return mVar.mo16684a(76, 0L);
                    case ABRConfig.ABR_SELECT_SCENE:
                        return mVar.mo16684a(77, 0L);
                    case 15:
                        return mVar.mo16684a(78, 0L);
                    case 16:
                        return mVar.mo16684a(156, -1L);
                    case 17:
                        return mVar.mo16684a(155, -1L);
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                        return mVar.mo16684a(163, -1L);
                    case 19:
                        return mVar.mo16684a(162, -1L);
                    default:
                        switch (i) {
                            case 38:
                                return mVar.mo16684a(307, -1L);
                            case 39:
                                return mVar.mo16684a(308, -1L);
                            case 40:
                                return aiVar.f192949bI;
                            case 41:
                                return aiVar.f192950bJ;
                            default:
                                switch (i) {
                                    case 51:
                                        return mVar.mo16684a(267, 0L);
                                    case 52:
                                        return mVar.mo16684a(268, 0L);
                                    case 53:
                                        return mVar.mo16684a(269, 0L);
                                    case 54:
                                        return mVar.mo16684a(606, -1L);
                                    default:
                                        switch (i) {
                                            case 56:
                                                return mVar.mo16684a(45, -1L);
                                            case 57:
                                                return mVar.mo16684a(607, -1L);
                                            case 58:
                                                return mVar.mo16684a(608, -1L);
                                            default:
                                                switch (i) {
                                                    case 70:
                                                        return mVar.mo16684a(636, -1L);
                                                    case 71:
                                                        return mVar.mo16684a(637, -1L);
                                                    case 72:
                                                        return mVar.mo16684a(638, -1L);
                                                    case 73:
                                                        return mVar.mo16684a(639, -1L);
                                                    default:
                                                        switch (i) {
                                                            case 91:
                                                                return aiVar.f192945bE;
                                                            case 92:
                                                                return aiVar.f192928am;
                                                            case 93:
                                                                C86464h hVar = aiVar.f192921af;
                                                                if (hVar == null) {
                                                                    return 0;
                                                                }
                                                                return hVar.f193910d;
                                                            default:
                                                                switch (i) {
                                                                    case 104:
                                                                        return mVar.mo16684a(73, -1L);
                                                                    case 105:
                                                                        return mVar.mo16684a(72, -1L);
                                                                    case 106:
                                                                        return mVar.mo16684a(579, aiVar.f192926ak);
                                                                    case 107:
                                                                        return mVar.mo16684a(577, aiVar.f192926ak);
                                                                    case 108:
                                                                        return mVar.mo16684a(578, aiVar.f192926ak);
                                                                    default:
                                                                        return 0;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else if (aiVar.f192888Y == null) {
                return -1;
            } else {
                Object a = aiVar.f192888Y.mo137333a();
                if (a instanceof Long) {
                    return ((Long) a).longValue();
                }
                return -1;
            }
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: c */
        public final int mo137292c(int i) {
            C86313ai aiVar = this.f193402a.get();
            if (aiVar == null) {
                return 0;
            }
            if (i == 48) {
                C86381b.C86382a.f193539a.mo137349a(aiVar.f192920ae.mo137666x());
                return 0;
            } else if (i != 49) {
                if (i != 63) {
                    if (i != 64) {
                        if (i != 84) {
                            if (i == 85) {
                                return C86313ai.f192863k;
                            }
                            switch (i) {
                                case 21:
                                    return aiVar.f193374v;
                                case 22:
                                    return aiVar.f193375w;
                                case 23:
                                    return aiVar.f192864A;
                                case 24:
                                    if (aiVar.f192923ah == null) {
                                        return 0;
                                    }
                                    if (aiVar.f193024cr < 0) {
                                        aiVar.f193024cr = aiVar.f192923ah.mo16710b(157, -1);
                                    }
                                    return aiVar.f193024cr;
                                case 25:
                                    if (aiVar.f192923ah == null) {
                                        return 0;
                                    }
                                    if (aiVar.f193025cs < 0) {
                                        aiVar.f193025cs = aiVar.f192923ah.mo16710b(158, -1);
                                    }
                                    return aiVar.f193025cs;
                                case 26:
                                    return (int) C86640h.m150088b(aiVar.f192916aa);
                                case 27:
                                    if (aiVar.f192923ah == null) {
                                        return -1;
                                    }
                                    if (aiVar.f192923ah.mo16730r()) {
                                        return 1;
                                    }
                                    return 0;
                                default:
                                    switch (i) {
                                        case 30:
                                            return aiVar.f193366n;
                                        case 61:
                                            if (aiVar.f192923ah != null) {
                                                return aiVar.f192923ah.mo16710b(53, -1);
                                            }
                                            return -1;
                                        case 67:
                                            if (aiVar.f193022cp > 0) {
                                                return aiVar.f193022cp;
                                            }
                                            if (aiVar.f192923ah != null) {
                                                return aiVar.f192923ah.mo16723k();
                                            }
                                            return -1;
                                        case 69:
                                            if (aiVar.f192923ah != null) {
                                                return aiVar.f192923ah.mo16710b(601, -1);
                                            }
                                            return -1;
                                        case 74:
                                            C86307af a = C86307af.m148603a();
                                            if (a.f192818h != null) {
                                                return a.f192818h.mo137480a();
                                            }
                                            return -1;
                                        case 77:
                                            if (aiVar.f192923ah != null) {
                                                return aiVar.f192923ah.mo16710b(540, -1);
                                            }
                                            return -1;
                                        case 79:
                                            if (aiVar.f192923ah != null) {
                                                return aiVar.f192923ah.mo16710b(826, -1);
                                            }
                                            return -1;
                                        case 81:
                                            if (aiVar.f192923ah == null) {
                                                return 0;
                                            }
                                            return aiVar.f192923ah.mo16710b(643, -1);
                                        case 94:
                                            if (aiVar.f192888Y == null) {
                                                return Integer.MIN_VALUE;
                                            }
                                            Object a2 = aiVar.f192888Y.mo137333a();
                                            if (a2 instanceof Integer) {
                                                return ((Integer) a2).intValue();
                                            }
                                            return Integer.MIN_VALUE;
                                        case 103:
                                            if (aiVar.f192923ah == null) {
                                                return -1;
                                            }
                                            return aiVar.f192923ah.mo16710b(24, 0);
                                        case 109:
                                            IABRModule iABRModule = aiVar.f192960bU;
                                            if (iABRModule != null) {
                                                return (int) iABRModule.getLongOption(53, -1);
                                            }
                                            return -1;
                                        default:
                                            switch (i) {
                                                case 34:
                                                    return aiVar.f193368p;
                                                case 35:
                                                    return aiVar.f193369q;
                                                case 36:
                                                    return aiVar.f192976bm;
                                                default:
                                                    switch (i) {
                                                        case 42:
                                                            if (aiVar.f192923ah == null) {
                                                                return 0;
                                                            }
                                                            return aiVar.f192923ah.mo16710b(221, -1);
                                                        case 43:
                                                            if (aiVar.f192923ah == null) {
                                                                return 0;
                                                            }
                                                            return aiVar.f192923ah.mo16710b(222, -1);
                                                        case BuildConfig.VERSION_CODE:
                                                            if (aiVar.f192923ah == null) {
                                                                return 0;
                                                            }
                                                            return aiVar.f192923ah.mo16710b(245, -1);
                                                        default:
                                                            switch (i) {
                                                                case 87:
                                                                    if (aiVar.f192917ab == null) {
                                                                        return 1;
                                                                    }
                                                                    return 0;
                                                                case 88:
                                                                    return aiVar.f192944bD;
                                                                case 89:
                                                                    C86464h hVar = aiVar.f192921af;
                                                                    if (hVar != null && hVar.mo137507b()) {
                                                                        return 1;
                                                                    }
                                                                    return 0;
                                                                case 90:
                                                                    C86464h hVar2 = aiVar.f192921af;
                                                                    if (hVar2 != null && hVar2.mo137508c()) {
                                                                        return 1;
                                                                    }
                                                                    return 0;
                                                                default:
                                                                    switch (i) {
                                                                        case 97:
                                                                            if (aiVar.f192923ah != null) {
                                                                                return aiVar.f192923ah.mo16710b(463, -1);
                                                                            }
                                                                            return -1;
                                                                        case 98:
                                                                            if (aiVar.f192923ah != null) {
                                                                                return aiVar.f192923ah.mo16710b(464, -1);
                                                                            }
                                                                            return -1;
                                                                        case 99:
                                                                            C86307af a3 = C86307af.m148603a();
                                                                            if (a3.f192818h != null) {
                                                                                return a3.f192818h.mo137481b();
                                                                            }
                                                                            return -1;
                                                                        case HandlerC21534a.f51116a:
                                                                            return aiVar.f192992cC;
                                                                        case 101:
                                                                            if (aiVar.mo137203b()) {
                                                                                return 1;
                                                                            }
                                                                            return 0;
                                                                        default:
                                                                            return 0;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        } else if (aiVar.f192923ah != null) {
                            return aiVar.f192923ah.mo16710b(186, -1);
                        } else {
                            return -1;
                        }
                    } else if (aiVar.f193027cu != -1) {
                        return aiVar.f193027cu;
                    } else {
                        if (aiVar.f192923ah != null) {
                            aiVar.f193027cu = aiVar.f192923ah.mo16710b(402, -1);
                        }
                        return aiVar.f193027cu;
                    }
                } else if (aiVar.f193028cv != -1) {
                    return aiVar.f193028cv;
                } else {
                    if (aiVar.f192923ah != null) {
                        aiVar.f193028cv = aiVar.f192923ah.mo16710b(403, -1);
                    }
                    return aiVar.f193028cv;
                }
            } else if (aiVar.f192923ah == null) {
                return 0;
            } else {
                return aiVar.f192923ah.mo16710b(44, -1);
            }
        }

        @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86462f
        /* renamed from: a */
        public final void mo137289a(int i, Map map) {
            C86313ai aiVar = this.f193402a.get();
            switch (i) {
                case 0:
                    if (aiVar != null && aiVar.f192878O != null) {
                        C86365az azVar = new C86365az();
                        azVar.f193468a = "bufferStartInfos";
                        azVar.f193470c = map;
                        if (aiVar.f193015ch.mo137320b()) {
                            aiVar.f193015ch.mo137312a(412, 0, 0, azVar);
                            return;
                        } else if (aiVar.f192878O != null) {
                            aiVar.f192878O.mo101150a(azVar);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 1:
                    if (aiVar != null && aiVar.f192878O != null) {
                        C86365az azVar2 = new C86365az();
                        azVar2.f193468a = "bufferEndInfos";
                        azVar2.f193470c = map;
                        if (aiVar.f193015ch.mo137320b()) {
                            aiVar.f193015ch.mo137312a(412, 0, 0, azVar2);
                            return;
                        } else if (aiVar.f192878O != null) {
                            aiVar.f192878O.mo101150a(azVar2);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 2:
                    if (aiVar != null && aiVar.f192878O != null) {
                        JSONObject jSONObject = new JSONObject(map);
                        C86365az azVar3 = new C86365az();
                        azVar3.f193468a = "firstframe_split";
                        azVar3.f193470c = jSONObject;
                        azVar3.f193474g = aiVar.f192897aH;
                        if (aiVar.f193015ch.mo137320b()) {
                            aiVar.f193015ch.mo137318b(412, 0, 0, azVar3);
                            return;
                        } else {
                            aiVar.f192878O.mo101150a(azVar3);
                            return;
                        }
                    } else {
                        return;
                    }
                case 3:
                    if (aiVar != null && aiVar.f192878O != null) {
                        C86365az azVar4 = new C86365az();
                        azVar4.f193468a = "outsyncStartInfos";
                        azVar4.f193470c = map;
                        if (aiVar.f193015ch.mo137320b()) {
                            aiVar.f193015ch.mo137312a(412, 0, 0, azVar4);
                            return;
                        } else if (aiVar.f192878O != null) {
                            aiVar.f192878O.mo101150a(azVar4);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 4:
                    if (aiVar != null && aiVar.f192878O != null) {
                        C86365az azVar5 = new C86365az();
                        azVar5.f193468a = "outsyncEndInfos";
                        azVar5.f193470c = map;
                        if (aiVar.f193015ch.mo137320b()) {
                            aiVar.f193015ch.mo137312a(412, 0, 0, azVar5);
                            return;
                        } else if (aiVar.f192878O != null) {
                            aiVar.f192878O.mo101150a(azVar5);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (aiVar != null && aiVar.f192878O != null) {
                        C86365az azVar6 = new C86365az();
                        azVar6.f193468a = "noRenderStartInfos";
                        azVar6.f193470c = map;
                        if (aiVar.f193015ch.mo137320b()) {
                            aiVar.f193015ch.mo137312a(412, 0, 0, azVar6);
                            return;
                        } else if (aiVar.f192878O != null) {
                            aiVar.f192878O.mo101150a(azVar6);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (aiVar != null && aiVar.f192878O != null) {
                        C86365az azVar7 = new C86365az();
                        azVar7.f193468a = "noRenderEndInfos";
                        azVar7.f193470c = map;
                        if (aiVar.f193015ch.mo137320b()) {
                            aiVar.f193015ch.mo137312a(412, 0, 0, azVar7);
                            return;
                        } else if (aiVar.f192878O != null) {
                            aiVar.f192878O.mo101150a(azVar7);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.ai$r */
    static class RunnableC86334r implements Runnable {

        /* renamed from: a */
        private AbstractC86253m f193409a;

        static {
            Covode.recordClassIndex(101562);
        }

        public final void run() {
            if (this.f193409a != null) {
                try {
                    C86641i.m150110a("TTVideoEngine", "MyReleaseRunnable release");
                    this.f193409a.mo16716d();
                    this.f193409a = null;
                } catch (Exception e) {
                    C86641i.m150117e("TTVideoEngine", e.toString());
                }
            }
        }

        public RunnableC86334r(AbstractC86253m mVar) {
            this.f193409a = mVar;
        }
    }

    /* renamed from: a */
    public static synchronized void m148637a() {
        synchronized (C86313ai.class) {
            MethodCollector.m26663i(4575);
            try {
                C86205m.m148119a().mo136519b();
                MethodCollector.m26664o(4575);
            } catch (NullPointerException unused) {
                MethodCollector.m26664o(4575);
            }
        }
    }

    /* renamed from: ad */
    private void m148654ad() {
        Surface surface;
        if (this.f193057dY) {
            SurfaceHolder surfaceHolder = this.f192918ac;
            if (surfaceHolder != null) {
                surface = surfaceHolder.getSurface();
            } else {
                surface = this.f192917ab;
            }
            m148687d(surface);
        }
    }

    /* renamed from: ak */
    private void m148661ak() {
        if (this.f192943bC == null) {
            this.f192943bC = new Handler(C86640h.m150077a()) {
                /* class com.p2082ss.ttvideoengine.C86313ai.HandlerC863163 */

                static {
                    Covode.recordClassIndex(101544);
                }

                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == 10) {
                        String str = (String) message.obj;
                        long j = (long) message.arg1;
                        String str2 = C86313ai.this.f193016ci.get("video");
                        String str3 = C86313ai.this.f193016ci.get(DataType.AUDIO);
                        if (C86313ai.this.f192864A != 5) {
                            if (TextUtils.isEmpty(str3) || !str3.equals(str)) {
                                if (!TextUtils.isEmpty(str2) && str2.equals(str) && C86313ai.this.f192920ae != null) {
                                    C86313ai.this.f192920ae.mo137652s(j);
                                }
                            } else if (C86313ai.this.f192920ae != null) {
                                C86313ai.this.f192920ae.mo137648r(j);
                            }
                            String str4 = "";
                            if (C86313ai.this.f192974bk != null && C86313ai.this.f192974bk.contains(str)) {
                                C86313ai.this.f192951bK += j;
                                if (C86313ai.this.f192920ae != null) {
                                    C86313ai.this.f192920ae.mo137644q(C86313ai.this.f192951bK);
                                }
                                StringBuilder append = new StringBuilder("using mdl cache, key :").append(str).append(" size = ").append(j).append(" vid = ");
                                if (!TextUtils.isEmpty(C86313ai.this.f192865B)) {
                                    str4 = C86313ai.this.f192865B;
                                }
                                C86641i.m150110a("TTVideoEngine", append.append(str4).toString());
                                if ((C86313ai.this.f193016ci.size() < 2 || C86313ai.this.f193016ci.containsValue(str)) && C86313ai.this.f192878O != null) {
                                    C86365az azVar = new C86365az();
                                    azVar.f193468a = "mdlfilepathhitcachesize";
                                    azVar.f193472e = str;
                                    azVar.f193473f = j;
                                    if (C86313ai.this.f193015ch.mo137320b()) {
                                        C86313ai.this.f193015ch.mo137318b(412, 0, 0, azVar);
                                    } else {
                                        C86313ai.this.f192878O.mo101150a(azVar);
                                    }
                                }
                            } else if (C86313ai.this.f192973bj != null && C86313ai.this.f192973bj.contains(str)) {
                                C86313ai.this.f192951bK += j;
                                if (C86313ai.this.f192920ae != null) {
                                    C86313ai.this.f192920ae.mo137644q(C86313ai.this.f192951bK);
                                }
                                StringBuilder append2 = new StringBuilder("using mdl cache, key :").append(str).append(" size = ").append(j).append(" vid = ");
                                if (!TextUtils.isEmpty(C86313ai.this.f192865B)) {
                                    str4 = C86313ai.this.f192865B;
                                }
                                C86641i.m150110a("TTVideoEngine", append2.append(str4).toString());
                                if ((C86313ai.this.f193016ci.size() < 2 || C86313ai.this.f193016ci.containsValue(str)) && C86313ai.this.f192878O != null) {
                                    C86365az azVar2 = new C86365az();
                                    azVar2.f193468a = "mdlhitcachesize";
                                    azVar2.f193471d = str;
                                    azVar2.f193473f = j;
                                    if (C86313ai.this.f193015ch.mo137320b()) {
                                        C86313ai.this.f193015ch.mo137318b(412, 0, 0, azVar2);
                                    } else {
                                        C86313ai.this.f192878O.mo101150a(azVar2);
                                    }
                                }
                            }
                        }
                    }
                }
            };
        }
    }

    /* renamed from: ao */
    private void m148665ao() {
        EnumC86649v[] allResolutions = EnumC86649v.getAllResolutions();
        for (EnumC86649v vVar : allResolutions) {
            this.f193091eG.put(vVar, 0);
            this.f193092eH.put(vVar, "");
        }
    }

    /* renamed from: av */
    private void m148672av() {
        C86430b.m149143a(this.f192865B);
        try {
            C86426a.m149126b(this.f193343ja);
        } catch (Throwable th) {
            C86641i.m150110a("TTVideoEngine", "fetcherMakerNew exception ".concat(String.valueOf(th)));
        }
        this.f193343ja = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo137147K() {
        this.f192911aV = false;
        this.f192920ae.mo137602g();
        m148652ab();
        this.f193176fo = SystemClock.elapsedRealtime();
        C86635e eVar = this.f192970bg;
        if (eVar != null) {
            eVar.mo137909b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo137151O() {
        int i;
        if (this.f192936au || this.f192934as) {
            i = this.f192941az;
        } else {
            i = m148663am();
        }
        mo137252k(i);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 < 0) goto L_0x0018;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo137222e() {
        /*
            r3 = this;
            android.content.Context r1 = r3.f192916aa
            if (r1 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r0 = "audio"
            java.lang.Object r2 = m148636a(r1, r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r1 = 0
            if (r2 == 0) goto L_0x001a
            r0 = 3
            int r0 = r2.getStreamMaxVolume(r0)
            if (r0 >= 0) goto L_0x001b
        L_0x0018:
            float r0 = (float) r1
            return r0
        L_0x001a:
            r0 = 0
        L_0x001b:
            r1 = r0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137222e():float");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo137263o() {
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null) {
            mVar.mo16706a(this.f192867D);
        }
        this.f192920ae.mo137588c(this.f192867D);
    }

    /* renamed from: r */
    public final String mo137266r() {
        if (this.f192896aG) {
            return this.f193110eZ;
        }
        return this.f192952bL.f193414a;
    }

    /* renamed from: w */
    public final synchronized void mo137271w() {
        MethodCollector.m26663i(5349);
        if (this.f193279hn == null) {
            this.f193279hn = m148651aa();
        }
        MethodCollector.m26664o(5349);
    }

    /* renamed from: U */
    private void m148625U() {
        if (this.f193144fH != null) {
            if (this.f192977bn != null) {
                C86641i.m150110a("TTVideoEngine", "release video surface : " + this.f192977bn);
                mo137190a(0, -7880);
                this.f192977bn.release();
                this.f192977bn = null;
            }
            this.f193144fH = null;
            this.f192989bz = 0;
            this.f193158fW = 0;
            this.f192992cC = 0;
            C86641i.m150110a("TTVideoEngine", "mTextureRenderer become to null");
        }
    }

    /* renamed from: V */
    private void m148626V() {
        if (this.f192977bn != null) {
            while (this.f193129et.peek() != null) {
                Pair<Surface, Integer> poll = this.f193129et.poll();
                VideoSurface videoSurface = this.f192977bn;
                Surface surface = (Surface) poll.first;
                int intValue = ((Integer) poll.second).intValue();
                if (videoSurface.f192166a != null) {
                    videoSurface.f192166a.setExtraSurface(surface, intValue);
                }
            }
        }
    }

    /* renamed from: W */
    private void m148627W() {
        VideoSurface videoSurface = this.f192977bn;
        if (videoSurface != null) {
            videoSurface.mo136457b(29, 0);
            this.f192977bn.mo136457b(31, 0);
            this.f192977bn.mo136457b(30, 0);
            m148699p(this.f193060db);
            this.f192977bn.mo136457b(25, 1);
        }
    }

    /* renamed from: ab */
    private void m148652ab() {
        C86641i.m150110a("TTVideoEngine", "_pause");
        if (!this.f193370r) {
            this.f193371s = true;
            mo137244i(2);
            return;
        }
        if (this.f192923ah != null) {
            C86641i.m150110a("TTVideoEngine", "player will pause");
            this.f192923ah.mo16719g();
            mo137244i(2);
            mo137248j(2);
        }
        IABRModule iABRModule = this.f192960bU;
        if (iABRModule != null) {
            iABRModule.stop();
            this.f192920ae.mo137527N(0);
        }
    }

    /* renamed from: ag */
    private void m148657ag() {
        this.f193091eG.put(this.f192927al, Integer.valueOf(this.f193091eG.get(this.f192927al).intValue() + 1));
        mo137210c(this.f192919ad);
    }

    /* renamed from: ai */
    private void m148659ai() {
        this.f193327ik = C86594a.m149985a().mo137859a("native_yv12_render", this.f193327ik);
        C86641i.m150110a("TTVideoEngine", "enabled native YV12: " + this.f193327ik);
    }

    /* renamed from: aj */
    private void m148660aj() {
        this.f193353jl = C86594a.m149985a().mo137859a("native_render_rotation_adapt", this.f193353jl);
        C86641i.m150110a("TTVideoEngine", "native render rotation adapt: " + this.f193353jl);
    }

    /* renamed from: ap */
    private String m148666ap() {
        String a = C86640h.m150080a(this.f192916aa);
        if (a != null) {
            return a + File.separator + "mediattmp";
        }
        return null;
    }

    /* renamed from: au */
    private void m148671au() {
        C86430b.m149144a(this.f192865B, this.f193131ev, this.f193132ew, this.f193134ey);
        if (this.f193343ja == null) {
            this.f193343ja = new C86445h(this);
        }
        try {
            C86426a.m149125a(this.f193343ja);
        } catch (Throwable th) {
            C86641i.m150110a("TTVideoEngine", "fetcherMakerNew exception ".concat(String.valueOf(th)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo137144H() {
        m148661ak();
        boolean z = true;
        this.f192911aV = true;
        this.f192913aX = false;
        this.f192933ar = false;
        this.f193170fi = 0;
        AbstractC86517e eVar = this.f192919ad;
        if (eVar != null) {
            eVar.mo137741a(this.f193137fA);
        }
        if (this.f192891aB) {
            this.f192920ae.mo137583c(14, 1);
            this.f192891aB = false;
        }
        if (!this.f192914aY && this.f192949bI <= 0 && !this.f193370r) {
            z = false;
        }
        m148695k(z);
        this.f192971bh = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo137145I() {
        this.f192914aY = false;
        this.f192911aV = false;
        this.f192913aX = false;
        this.f192933ar = false;
        this.f193170fi = 0;
        AbstractC86517e eVar = this.f192919ad;
        if (eVar != null) {
            eVar.mo137741a(this.f193137fA);
        }
        AbstractC86468j jVar = this.f192920ae;
        if (jVar != null) {
            jVar.mo137530Q(65);
        }
        m148695k(false);
        this.f192971bh = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final JSONObject mo137152P() {
        String str;
        try {
            AbstractC86253m mVar = this.f192923ah;
            if (mVar != null) {
                if (mVar.mo16710b(5000, 0) != 0) {
                    JSONObject jSONObject = new JSONObject();
                    String c = this.f192923ah.mo16713c(5001);
                    if (this.f192923ah.mo16710b(26, 1) == 1) {
                        str = "breakpad crash";
                    } else {
                        str = "simple crash";
                    }
                    jSONObject.put(str, c);
                    return jSONObject;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo137155S() {
        Handler handler;
        m148670at();
        if (this.f192969bf > 0) {
            C86385d.C86400h.f193679a.mo137385e();
        }
        C86347ap apVar = this.f193015ch;
        int i = this.f193315iY;
        if (apVar.f193436i.f192864A != 5 && (handler = apVar.f193429b) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", null);
            Message obtainMessage = handler.obtainMessage(24, 0, 0);
            obtainMessage.obj = hashMap;
            handler.postDelayed(new C86347ap.RunnableC86350c(handler, obtainMessage), (long) i);
        }
    }

    /* renamed from: j */
    public final void mo137247j() {
        C86641i.m150110a("TTVideoEngine", "prepare,".concat(String.valueOf(this)));
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137309a(22);
        } else {
            mo137145I();
        }
    }

    /* renamed from: k */
    public final void mo137251k() {
        C86641i.m150110a("TTVideoEngine", "play:".concat(String.valueOf(this)));
        if (this.f192864A == 5) {
            C86641i.m150117e("TTVideoEngine", "already released, return");
        } else if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137309a(1);
        } else {
            mo137144H();
        }
    }

    /* renamed from: l */
    public final void mo137255l() {
        C86641i.m150110a("TTVideoEngine", "pause,".concat(String.valueOf(this)));
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137309a(2);
        } else {
            mo137147K();
        }
    }

    /* renamed from: m */
    public final void mo137258m() {
        C86641i.m150110a("TTVideoEngine", "stop:".concat(String.valueOf(this)));
        this.f192911aV = false;
        this.f192968be = false;
        this.f192979bp = false;
        this.f192981br = false;
        this.f192913aX = true;
        this.f192989bz = 0;
        this.f193158fW = 0;
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137309a(3);
        } else {
            mo137148L();
        }
    }

    /* renamed from: t */
    public final int mo137268t() {
        if (this.f192866C == 2 || this.f193023cq <= 0) {
            return mo137267s();
        }
        return this.f193022cp;
    }

    /* renamed from: com.ss.ttvideoengine.ai$a */
    static class RunnableC86317a implements Runnable {

        /* renamed from: a */
        private Context f193383a;

        static {
            Covode.recordClassIndex(101545);
        }

        public final void run() {
            String a;
            File[] listFiles;
            Context context = this.f193383a;
            if (!(context == null || (a = C86640h.m150080a(context)) == null)) {
                File file = new File(a);
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isFile() && file2.getName().matches("^[0-9]{1,15}\\.cach$")) {
                            C86640h.m150093b(file2);
                        }
                    }
                }
            }
        }

        public RunnableC86317a(Context context) {
            this.f193383a = context;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ai$c */
    public static class RunnableC86319c implements Runnable {

        /* renamed from: a */
        private ArrayList<String> f193390a;

        /* renamed from: b */
        private ArrayList<String> f193391b;

        /* renamed from: c */
        private WeakReference<C86313ai> f193392c;

        static {
            Covode.recordClassIndex(101547);
        }

        public final void run() {
            C86313ai aiVar = this.f193392c.get();
            if (aiVar != null && aiVar.f192864A != 5) {
                ArrayList<String> arrayList = this.f193391b;
                int i = 0;
                if (arrayList == null || arrayList.size() <= 0) {
                    ArrayList<String> arrayList2 = this.f193390a;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        while (i < this.f193390a.size()) {
                            String str = this.f193390a.get(i);
                            long i2 = C86385d.C86400h.f193679a.mo137393i(str);
                            if (aiVar.f192943bC != null) {
                                int i3 = (int) i2;
                                aiVar.f192943bC.sendMessage(Message.obtain(aiVar.f192943bC, 10, i3, i3, str));
                            }
                            i++;
                        }
                        return;
                    }
                    return;
                }
                while (i < this.f193391b.size()) {
                    String str2 = this.f193391b.get(i);
                    long g = C86385d.C86400h.f193679a.mo137388g(str2);
                    if (aiVar.f192943bC != null) {
                        int i4 = (int) g;
                        aiVar.f192943bC.sendMessage(Message.obtain(aiVar.f192943bC, 10, i4, i4, str2));
                    }
                    i++;
                }
            }
        }

        public RunnableC86319c(C86313ai aiVar, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            this.f193392c = new WeakReference<>(aiVar);
            this.f193390a = arrayList;
            this.f193391b = arrayList2;
        }
    }

    static {
        Covode.recordClassIndex(101541);
    }

    /* renamed from: Y */
    private String m148629Y() {
        C86534o oVar;
        if (!this.f192896aG && !this.f192902aM && !this.f192900aK) {
            if (this.f193162fa) {
                return this.f192893aD;
            }
            if (!TextUtils.isEmpty(this.f193107eW) && ((oVar = this.f192929an) == null || !TextUtils.isEmpty(oVar.mo137726b(15)))) {
                String Z = m148630Z();
                if (TextUtils.isEmpty(Z)) {
                    return null;
                }
                if (this.f193107eW.charAt(this.f193107eW.length() - 1) == '/') {
                    return C1764a.m5928a("%s%s.ttmp", new Object[]{this.f193107eW, Z});
                }
                return C1764a.m5928a("%s/%s.ttmp", new Object[]{this.f193107eW, Z});
            }
        }
        return null;
    }

    /* renamed from: aa */
    private AbstractC86253m m148651aa() {
        m148646a(this.f193273hh);
        AbstractC86253m a = C86572m.m149838a(this.f192916aa, this.f193076ds, this.f193273hh);
        C86572m mVar = (C86572m) a;
        if (mVar.f195055b && this.f192920ae != null) {
            this.f192920ae.mo137649r(mVar.f195056d + ",customState:" + this.f193260hU);
        }
        if (mVar.f195054a == null) {
            return null;
        }
        m148643a(a);
        AbstractC86468j jVar = this.f192920ae;
        if (jVar != null) {
            jVar.mo137640p(System.currentTimeMillis());
        }
        C86641i.m150110a("TTVideoEngine", "_playInternal MediaPlayerWrapper.create done videoId = " + this.f192865B);
        return a;
    }

    /* renamed from: an */
    private void m148664an() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C86318b> entry : this.f192930ao.entrySet()) {
            String key = entry.getKey();
            C86318b value = entry.getValue();
            if (!(key == null || value == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("url", key);
                hashMap.put("ip", value.f193384a);
                hashMap.put("dns", value.f193385b);
                hashMap.put("dns_cache_open", Integer.valueOf(value.f193386c));
                hashMap.put("server_dns_open", Integer.valueOf(value.f193387d));
                hashMap.put("url_desc", value.f193388e);
                if (this.f193162fa && !TextUtils.isEmpty(this.f192897aH)) {
                    hashMap.put("gid", this.f192897aH);
                }
                arrayList.add(hashMap);
            }
        }
        if (!this.f193162fa) {
            this.f192920ae.mo137562a(arrayList);
        }
    }

    /* renamed from: as */
    private boolean m148669as() {
        C86520f fVar = this.f193029cw;
        if (fVar != null) {
            fVar.mo137772c();
        } else {
            this.f193029cw = new C86520f();
        }
        int a = this.f193029cw.mo137766a(this.f192916aa, this.f193104eT);
        if (a != 0) {
            if (a == -1000) {
                mo137177a(new C86633c("kTTVideoErrorDomainIntertrustDRM", -9939));
                return false;
            } else if (a == -1) {
                mo137177a(new C86633c("kTTVideoErrorDomainIntertrustDRM", -9938));
                return false;
            } else if (a == -1002) {
                mo137177a(new C86633c("kTTVideoErrorDomainIntertrustDRM", -9933));
                return false;
            } else {
                mo137177a(new C86633c("kTTVideoErrorDomainIntertrustDRM", -9938, a));
                return false;
            }
        } else if (this.f193029cw.mo137771b() == -1) {
            mo137177a(new C86633c("kTTVideoErrorDomainIntertrustDRM", -9938));
            return false;
        } else {
            this.f193029cw.f194738d = new C86324h(this);
            if (TextUtils.isEmpty(this.f193109eY)) {
                return true;
            }
            this.f193029cw.mo137770a(this.f193109eY);
            return true;
        }
    }

    /* renamed from: at */
    private void m148670at() {
        AbstractC86253m mVar = this.f192923ah;
        if (mVar == null) {
            return;
        }
        if (this.f193066di == 0 && !C86385d.C86400h.f193679a.mo137383d()) {
            return;
        }
        if (this.f192971bh || this.f193313iW) {
            C86641i.m150113b("TTVideoEngine", "_syncPlayInfoToMdl complete");
            return;
        }
        long a = mVar.mo16684a(73, -1L);
        long a2 = mVar.mo16684a(72, -1L);
        if (a >= 0 && a2 >= 0) {
            a = Math.min(a, a2);
        } else if (a < 0) {
            if (a2 >= 0) {
                a = a2;
            } else {
                return;
            }
        }
        mo137162a(5, a);
    }

    /* renamed from: B */
    public final void mo137138B() {
        C86593o oVar;
        C86641i.m150110a("TTVideoEngine", "_audioRenderStart,this:".concat(String.valueOf(this)));
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null) {
            if (!(this.f193378z == 0 || (oVar = this.f192887X) == null)) {
                mVar.mo16710b(48, -1);
                oVar.mo101144e(mVar.mo16684a(156, -1L), mVar.mo16684a(163, -1L));
            }
            if (!this.f192939ax) {
                this.f192939ax = true;
                this.f192920ae.mo137584c(77, mVar.mo16684a(628, 0L));
            }
            if (!this.f192937av) {
                if (mVar.mo16710b(62, -100) == 0 || this.f192944bD != 0 || this.f192946bF) {
                    mo137137A();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo137148L() {
        m148684c(true, 0);
        if (this.f193185fx > 0) {
            AbstractC86253m mVar = this.f192923ah;
            if (mVar != null) {
                mVar.mo16720h();
                this.f193370r = false;
            }
            AbstractC86253m mVar2 = this.f192923ah;
            if (!(mVar2 == null || this.f193143fG <= 0 || this.f192977bn == null)) {
                mVar2.mo16691a((Surface) null);
            }
            AbstractC86253m mVar3 = this.f192923ah;
            if (mVar3 != null && mVar3.mo16709b() == 0) {
                this.f192923ah.mo16716d();
                this.f192923ah = null;
            }
            AbstractC86253m mVar4 = this.f193279hn;
            if (mVar4 != null) {
                mVar4.mo16716d();
                this.f193279hn = null;
            }
            this.f192864A = 0;
        }
        Handler handler = this.f193186g;
        if (handler != null) {
            handler.removeCallbacks(this.f193239h);
        }
        m148668ar();
        this.f193316iZ = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo137149M() {
        C86555h.m149816c(this.f192916aa);
        m148672av();
        C86631b.m150044a(new C86372bd.RunnableC86375c(this.f193196gJ));
        this.f192911aV = false;
        m148684c(false, 1);
        m148625U();
        IABRModule iABRModule = this.f192960bU;
        if (iABRModule != null) {
            iABRModule.release();
            this.f192960bU = null;
        }
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null) {
            try {
                mVar.mo16716d();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f192923ah = null;
                throw th;
            }
            this.f192923ah = null;
            m148654ad();
        }
        C86464h hVar = this.f192921af;
        if (hVar != null) {
            hVar.mo137504a();
            this.f192921af = null;
        }
        this.f192991cB = null;
        this.f193141fE = null;
        this.f192901aL = null;
        this.f192900aK = false;
        this.f192892aC = null;
        this.f192893aD = null;
        this.f193187gA = null;
        this.f192948bH = null;
        this.f193017ck = null;
        this.f193007cT = false;
        this.f193006cS = false;
        this.f193316iZ = 0;
        m148668ar();
        C86520f fVar = this.f193029cw;
        if (fVar != null) {
            fVar.mo137768a();
            this.f193029cw = null;
        }
        this.f192864A = 5;
        this.f193015ch.mo137308a();
    }

    /* renamed from: Q */
    public final boolean mo137153Q() {
        AbstractC86253m mVar = this.f192923ah;
        if (mVar == null) {
            return true;
        }
        try {
            int k = mVar.mo16723k();
            int n = this.f192923ah.mo16726n();
            long a = this.f192923ah.mo16684a(72, -1L);
            if (this.f192923ah.mo16710b(157, -1) == 5 && this.f193374v == 1 && this.f193375w == 1 && k >= 1000 && n - k >= 1000 && a >= 500) {
                int b = this.f192923ah.mo16710b(160, 100);
                long a2 = this.f192923ah.mo16684a(152, -1L);
                int b2 = this.f192923ah.mo16710b(153, -1);
                float b3 = this.f192923ah.mo16708b(151);
                if (b3 > ((float) this.f193082dy)) {
                    b3 /= 2.0f;
                }
                int i = this.f193037dE;
                int i2 = (((int) b3) * i) / (i + 1);
                if (a2 > -350 || b2 < (i2 * 2) / 3 || b <= 2) {
                    return true;
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean mo137154R() {
        AbstractC86253m mVar = this.f192923ah;
        if (mVar == null) {
            return true;
        }
        try {
            int k = mVar.mo16723k();
            int n = this.f192923ah.mo16726n();
            long a = this.f192923ah.mo16684a(72, -1L);
            if (this.f192923ah.mo16710b(157, -1) == 7 && this.f193374v == 1 && this.f193375w == 1 && k >= 1000 && n - k >= 1000 && a >= 500) {
                int b = this.f192923ah.mo16710b(160, 100);
                long a2 = this.f192923ah.mo16684a(152, -1L);
                int b2 = this.f192923ah.mo16710b(153, -1);
                float b3 = this.f192923ah.mo16708b(151);
                if (b3 > ((float) this.f193082dy)) {
                    b3 /= 2.0f;
                }
                int i = this.f193037dE;
                int i2 = (((int) b3) * i) / (i + 1);
                if (a2 > -350 || b2 < (i2 * 2) / 3 || b <= 2) {
                    return true;
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo137264p() {
        AbstractC86253m mVar = this.f192923ah;
        if (mVar == null) {
            int i = this.f192866C;
            if (i == 2 || i == 5) {
                return true;
            }
            return false;
        } else if (mVar.mo16707a() || mVar.mo16709b() == 5) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: q */
    public final boolean mo137265q() {
        if (mo137221d(0) || mo137221d(1) || mo137221d(3) || mo137221d(4)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.ai$h */
    public static class C86324h implements C86520f.AbstractC86521a {

        /* renamed from: a */
        private final WeakReference<C86313ai> f193397a;

        static {
            Covode.recordClassIndex(101552);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
            if (r1.equals("dash") == false) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
            if (r1.equals("mpd") == false) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
            if (r1.equals("hls") == false) goto L_0x0029;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
        @Override // com.p2082ss.ttvideoengine.p4417j.C86520f.AbstractC86521a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo137281a() {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.C86324h.mo137281a():void");
        }

        public C86324h(C86313ai aiVar) {
            this.f193397a = new WeakReference<>(aiVar);
        }

        @Override // com.p2082ss.ttvideoengine.p4417j.C86520f.AbstractC86521a
        /* renamed from: a */
        public final void mo137282a(C86633c cVar) {
            C86313ai aiVar = this.f193397a.get();
            if (aiVar != null && cVar != null) {
                aiVar.mo137177a(cVar);
            }
        }
    }

    /* renamed from: Z */
    private String m148630Z() {
        String str;
        String str2;
        String str3;
        long j;
        if (!this.f192896aG && !this.f192902aM && !this.f192900aK) {
            if (this.f193162fa) {
                return this.f192893aD;
            }
            if (this.f192919ad == null) {
                return null;
            }
            C86534o oVar = this.f192929an;
            if (oVar != null) {
                str = oVar.mo137726b(26);
                j = this.f192929an.mo137728c(12);
                str2 = this.f192929an.mo137726b(5);
                str3 = this.f192929an.mo137726b(15);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                j = 0;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && j != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    return C1764a.m5928a("%s_%s_%s_%d_%s", new Object[]{this.f192865B, str, str3, Long.valueOf(j), C86640h.m150090b(str2)});
                }
                return C1764a.m5928a("%s_%s_%s_%d", new Object[]{this.f192865B, str, str3, Long.valueOf(j)});
            }
        }
        return null;
    }

    /* renamed from: ae */
    private void m148655ae() {
        String str;
        String str2;
        C86635e eVar = this.f192970bg;
        if (eVar != null) {
            eVar.mo137910c();
        }
        this.f192920ae.mo137637o(this.f192898aI);
        this.f192920ae.mo137645q(this.f192899aJ);
        if (this.f193245hF == 0) {
            this.f193245hF = System.currentTimeMillis();
            C86381b.C86382a.f193539a.mo137351b();
        }
        if (this.f192896aG || this.f193162fa || this.f193177fp != null || this.f192967bc != null) {
            m148697n(this.f192865B);
            if (this.f192896aG) {
                str = this.f193110eZ;
            } else {
                str = this.f193163fb;
            }
            m148705s(str);
            if (this.f192896aG) {
                str2 = this.f193110eZ;
            } else {
                str2 = this.f193163fb;
            }
            m148679b(str2, this.f192869F);
        } else if (this.f192900aK) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.f192901aL.f195062f > 0 && currentTimeMillis - this.f192901aL.f195062f > ((long) f192844cG)) {
                m148656af();
            }
            m148705s(this.f192901aL.f195058b);
            m148697n(this.f192901aL.f195057a);
            m148679b(this.f192901aL.f195058b, this.f192869F);
        } else if (this.f192902aM) {
            m148697n(this.f192865B);
            m148705s(this.f192903aN.f193444a);
            m148679b(this.f192903aN.f193444a, this.f192869F);
        } else if (this.f193169fh) {
            m148697n(this.f192865B);
            mo137210c(this.f192919ad);
        } else {
            m148697n(this.f192865B);
            m148656af();
        }
        if (this.f192923ah != null && this.f193066di != 0) {
            mo137162a(5, 0L);
        }
    }

    /* renamed from: al */
    private void m148662al() {
        C86641i.m150110a("TTVideoEngine", "resumed video, shouldplay:" + this.f192911aV + ", mediaplayer:" + this.f192923ah + ", prepared:" + this.f193370r);
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null && this.f192911aV) {
            mVar.mo16729q();
            if (this.f193370r) {
                if ((this.f193374v == 0 || this.f192971bh) && !TextUtils.isEmpty(this.f192865B) && !this.f193169fh && this.f192919ad != null && this.f192877N != null) {
                    if (this.f193015ch.mo137320b()) {
                        this.f193015ch.mo137318b(411, 0, 0, this.f192919ad);
                    } else {
                        this.f192877N.mo51861a((C86535p) this.f192919ad);
                    }
                }
                this.f192923ah.mo16687a(100, this.f192890aA);
                this.f192923ah.mo16718f();
                mo137259m("_renderVideo");
                mo137248j(1);
                if (this.f192937av) {
                    C86635e eVar = this.f192970bg;
                    if (eVar != null) {
                        eVar.mo137908a();
                    }
                    mo137244i(1);
                }
                if (this.f192960bU != null && this.f192961bV > 0 && m148692g(this.f192919ad)) {
                    this.f192960bU.start(f192850ce, this.f193246hG);
                    this.f192920ae.mo137527N(1);
                    return;
                }
                return;
            }
            this.f193371s = false;
        }
    }

    /* renamed from: ar */
    private void m148668ar() {
        MethodCollector.m26663i(4183);
        C86617e eVar = C86617e.C86621c.f195187a;
        String str = this.f192865B;
        C86615d dVar = eVar.f195180q;
        if (!TextUtils.isEmpty(str)) {
            synchronized (dVar) {
                try {
                    dVar.f195161a.remove(str);
                } catch (Throwable th) {
                    MethodCollector.m26664o(4183);
                    throw th;
                }
            }
        }
        C86385d dVar2 = C86385d.C86400h.f193679a;
        String str2 = this.f192975bl;
        if (!TextUtils.isEmpty(str2)) {
            try {
                dVar2.f193577i.lock();
                ArrayList<C86313ai> arrayList = dVar2.f193576h.get(str2);
                if (arrayList != null) {
                    arrayList.remove(this);
                    C86641i.m150110a("DataLoaderHelper", "remove engine ref,rawKey = " + str2 + " engine ref count: " + arrayList.size());
                    if (arrayList.size() == 0) {
                        dVar2.f193576h.remove(str2);
                    }
                }
                dVar2.f193577i.unlock();
            } catch (Throwable th2) {
                dVar2.f193577i.unlock();
                MethodCollector.m26664o(4183);
                throw th2;
            }
        }
        if (this.f192973bj != null) {
            for (int i = 0; i < this.f192973bj.size(); i++) {
                C86385d.C86400h.f193679a.mo137397m(this.f192973bj.get(i));
            }
        }
        mo137142F();
        this.f193016ci.clear();
        MethodCollector.m26664o(4183);
    }

    /* renamed from: C */
    public final void mo137139C() {
        if (!this.f192937av) {
            if (this.f192920ae != null) {
                this.f192950bJ = System.currentTimeMillis();
                this.f192925aj = SystemClock.elapsedRealtime();
                C86641i.m150110a("TTVideoEngine", "mRenderStartTime:" + this.f192925aj + ", curT:" + this.f192950bJ);
                this.f192920ae.mo137594e();
            }
            m148653ac();
            AbstractC86468j jVar = this.f192920ae;
            if (jVar != null) {
                jVar.mo137669y();
            }
            this.f192937av = true;
        }
        this.f192920ae.mo137536a(C84116g.m144636e().mo124230d(), 0);
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null) {
            this.f193024cr = mVar.mo16710b(157, -1);
            this.f193025cs = mVar.mo16710b(158, -1);
            this.f193026ct = mVar.mo16710b(141, -1);
            this.f193309iS = mVar.mo16710b(140, -1);
            this.f193027cu = mVar.mo16710b(402, -1);
            this.f193028cv = mVar.mo16710b(403, -1);
            this.f193310iT = mVar.mo16684a(171, -1L);
            this.f193311iU = mVar.mo16708b(151);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo137141E() {
        C86641i.m150110a("TTVideoEngine", "reset, this:".concat(String.valueOf(this)));
        this.f192911aV = false;
        this.f192913aX = false;
        this.f193370r = false;
        this.f192968be = false;
        this.f193244hE = false;
        this.f192954bN = 0.0f;
        this.f192955bO = 0.0f;
        this.f192956bP = 0;
        this.f192869F.clear();
        m148684c(true, 6);
        if (this.f192923ah != null) {
            if (this.f193062de == 1) {
                m148690e((Surface) null);
            }
            if (this.f193146fK == 1 && this.f192984bu && this.f192977bn != null) {
                C86641i.m150110a("TTVideoEngine", "disable sr while _ShutdownOldSource = " + this.f193146fK);
                mo137190a(0, -7880);
            }
            VideoSurface videoSurface = this.f192977bn;
            if (videoSurface != null) {
                videoSurface.mo136455a(false);
            }
            this.f192923ah.mo16720h();
            m148654ad();
        }
        this.f192988by.mo137883a();
        this.f192980bq = false;
        this.f192937av = false;
        this.f192938aw = false;
        this.f192939ax = false;
        this.f192997cJ = false;
        this.f193219gg = false;
        this.f193242hC = 0;
        this.f192959bT.mo137858a();
        this.f193131ev = null;
        this.f193132ew = null;
        this.f193222gj = 0;
        this.f192905aP = false;
        this.f192920ae.mo137642q();
        this.f193172fk = true;
        this.f192940ay = true;
        this.f192936au = false;
        this.f193030cx = 0;
        this.f192924ai = -1;
        this.f192925aj = -1;
        this.f193284ht = -1;
        this.f193225gm = null;
        IABRModule iABRModule = this.f192960bU;
        if (iABRModule != null) {
            iABRModule.release();
            this.f192960bU = null;
        }
        this.f193363jv = null;
        this.f192946bF = false;
        this.f193125ep = -1;
        this.f192945bE = 0;
        this.f192928am = 0;
        this.f192992cC = 0;
    }

    /* renamed from: G */
    public final C86371bc mo137143G() {
        C86371bc bcVar = new C86371bc();
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null) {
            String c = mVar.mo16713c(516);
            if (!TextUtils.isEmpty(c)) {
                if (c.indexOf("mp4") > 0) {
                    bcVar.f193488a = "mp4";
                } else {
                    int indexOf = c.indexOf(",");
                    if (indexOf < 0) {
                        bcVar.f193488a = c;
                    } else {
                        bcVar.f193488a = c.substring(0, indexOf);
                    }
                }
            }
            bcVar.f193489b = this.f192923ah.mo16684a(171, 0L);
            bcVar.f193490c = this.f192923ah.mo16710b(157, -1);
            bcVar.f193491d = this.f192923ah.mo16710b(403, -1);
            bcVar.f193492e = this.f192923ah.mo16725m();
            bcVar.f193493f = this.f192923ah.mo16724l();
            bcVar.f193494g = this.f192923ah.mo16710b(555, -1);
            bcVar.f193495h = this.f192923ah.mo16708b(151);
            bcVar.f193496i = this.f192923ah.mo16710b(158, -1);
            bcVar.f193497j = this.f192923ah.mo16710b(402, -1);
            bcVar.f193498k = this.f192923ah.mo16710b(553, -1);
            bcVar.f193499l = this.f192923ah.mo16710b(554, -1);
        }
        return bcVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r4.f192917ab != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r4.f192917ab == null) goto L_0x0043;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137150N() {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137150N():void");
    }

    /* renamed from: n */
    public final void mo137261n() {
        C86641i.m150110a("TTVideoEngine", "release,".concat(String.valueOf(this)));
        this.f192913aX = true;
        if (this.f193015ch.mo137317a(false)) {
            this.f193015ch.mo137309a(4);
        } else {
            mo137149M();
        }
    }

    /* renamed from: s */
    public final int mo137267s() {
        int i = this.f192864A;
        int i2 = -1;
        if (i != 3) {
            if (this.f192936au || i == 4) {
                i2 = this.f192941az;
            }
            C86641i.m150110a("TTVideoEngine", "state not correct return:" + this.f192864A);
            return i2;
        }
        int i3 = this.f193374v;
        if ((i3 != 1 && i3 != 2 && !this.f193370r) || this.f192913aX) {
            C86641i.m150110a("TTVideoEngine", "playbackstate not correct return:" + this.f193374v);
            return -1;
        } else if (this.f192891aB) {
            int i4 = this.f193376x;
            if (i4 > 0) {
                return i4;
            }
            return -1;
        } else if (this.f193314iX || !this.f193015ch.mo137317a(true)) {
            return mo137151O();
        } else {
            if (!this.f193015ch.mo137316a(151, this.f193344jc, (Object) null)) {
                return -1;
            }
            this.f193015ch.f193431d.setDataPosition(0);
            return this.f193015ch.f193431d.readInt();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo137273y() {
        this.f192896aG = false;
        this.f193162fa = false;
        this.f192900aK = false;
        this.f192902aM = false;
        this.f193169fh = false;
        AbstractC86253m mVar = this.f192923ah;
        if (mVar != null && mVar.mo16709b() == 0) {
            this.f192923ah.mo16716d();
            this.f192923ah = null;
        }
        mo137141E();
        m148665ao();
        m148672av();
        this.f192864A = 0;
        this.f192929an = null;
        this.f193088eD = null;
        this.f193089eE = null;
        this.f192919ad = null;
        this.f193163fb = null;
        this.f193110eZ = null;
        this.f192865B = null;
        this.f193177fp = null;
        this.f193163fb = null;
        this.f192979bp = false;
        this.f192981br = false;
        this.f192937av = false;
        this.f192938aw = false;
        this.f192939ax = false;
        this.f192970bg.mo137911d();
        this.f192971bh = false;
        this.f192982bs = false;
        this.f193245hF = 0;
        this.f192891aB = false;
        this.f192949bI = 0;
        this.f192906aQ = false;
        this.f193093eI.clear();
        this.f193022cp = -1;
        this.f193024cr = -1;
        this.f193025cs = -1;
        this.f193026ct = -1;
        this.f193309iS = -1;
        this.f193027cu = -1;
        this.f193028cv = -1;
        this.f193310iT = -1;
        this.f193311iU = 0.0f;
        this.f193141fE = null;
        this.f193007cT = false;
        this.f193006cS = false;
        this.f192872I = null;
        this.f192934as = false;
        AbstractC86468j jVar = this.f192920ae;
        if (jVar != null) {
            jVar.mo137530Q(63);
        }
        this.f193018cl.clear();
    }

    /* renamed from: ac */
    private void m148653ac() {
        AbstractC86253m mVar = this.f192923ah;
        if (this.f192920ae != null && mVar != null && !this.f192937av) {
            long a = mVar.mo16684a(68, 0L);
            this.f192920ae.mo137546a(a, 1);
            this.f192920ae.mo137545a(mVar.mo16684a(69, 0L));
            this.f192920ae.mo137571b(mVar.mo16684a(70, 0L));
            this.f192920ae.mo137586c(mVar.mo16684a(267, 0L));
            this.f192920ae.mo137592d(mVar.mo16684a(268, 0L));
            this.f192920ae.mo137596e(mVar.mo16684a(269, 0L));
            this.f192920ae.mo137600f(mVar.mo16684a(75, 0L));
            this.f192920ae.mo137608h(mVar.mo16684a(76, 0L));
            this.f192920ae.mo137604g(mVar.mo16684a(77, 0L));
            this.f192920ae.mo137612i(mVar.mo16684a(78, 0L));
            this.f192920ae.mo137633n(mVar.mo16713c(71));
            this.f192920ae.mo137542a(1, mVar.mo16684a(156, -1L));
            this.f192920ae.mo137542a(0, mVar.mo16684a(155, -1L));
            this.f192920ae.mo137569b(1, mVar.mo16684a(163, -1L));
            this.f192920ae.mo137569b(0, mVar.mo16684a(162, -1L));
            long a2 = mVar.mo16684a(210, 0L);
            this.f192920ae.mo137616j(a2);
            if (a > 0) {
                this.f192920ae.mo137636o(a);
            }
            long a3 = mVar.mo16684a(622, 0L);
            if (a3 > 0) {
                this.f192920ae.mo137572b(a3, 1);
            }
            long a4 = mVar.mo16684a(623, 0L);
            if (a4 > 0) {
                this.f192920ae.mo137584c(66, a4);
            }
            this.f192920ae.mo137584c(67, mVar.mo16684a(620, 0L));
            this.f192920ae.mo137584c(68, mVar.mo16684a(624, 0L));
            this.f192920ae.mo137584c(78, mVar.mo16684a(621, 0L));
            this.f192920ae.mo137584c(69, mVar.mo16684a(625, 0L));
            this.f192920ae.mo137584c(70, mVar.mo16684a(626, 0L));
            this.f192920ae.mo137584c(71, mVar.mo16684a(627, 0L));
            this.f192920ae.mo137584c(72, mVar.mo16684a(629, 0L));
            this.f192920ae.mo137584c(73, mVar.mo16684a(631, 0L));
            this.f192920ae.mo137584c(74, mVar.mo16684a(630, 0L));
            this.f192920ae.mo137584c(75, mVar.mo16684a(632, 0L));
            this.f192920ae.mo137584c(76, a2);
            this.f192920ae.mo137584c(77, mVar.mo16684a(628, 0L));
            this.f192920ae.mo137584c(87, mVar.mo16684a(822, 0L));
            this.f192920ae.mo137584c(88, mVar.mo16684a(307, 0L));
        }
    }

    /* renamed from: af */
    private void m148656af() {
        String str;
        C86377bf.C86378a a;
        Handler handler;
        this.f192864A = 1;
        m148665ao();
        String z = mo137274z();
        if (this.f193138fB) {
            z = C86640h.m150097c(z);
        }
        String a2 = C86643k.m150120a(z);
        this.f192932aq = a2;
        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("start to fetch video info:%s", new Object[]{a2}));
        if (this.f193182fu != null && !TextUtils.isEmpty(this.f192865B) && this.f193183fv) {
            boolean b = C86555h.m149815b(this.f192916aa);
            if ((this.f192904aO <= 1 || !b) && (a = this.f193182fu.mo137342a(this.f192865B, this.f192932aq)) != null && (!a.f193514c || (!b && C86385d.C86400h.f193679a.mo137380c() && this.f192969bf > 0))) {
                C86641i.m150110a("TTVideoEngine", "using videomodel cache");
                this.f192920ae.mo137525L(1);
                C86535p pVar = a.f193512a;
                this.f192919ad = pVar;
                mo137218d(pVar);
                if (this.f192877N != null) {
                    if (!this.f193015ch.mo137320b()) {
                        AbstractC86517e eVar = this.f192919ad;
                        if ((eVar instanceof C86535p) && this.f192877N.mo51861a((C86535p) eVar)) {
                            return;
                        }
                    } else if (this.f193373u) {
                        this.f193015ch.mo137315a(this.f192919ad);
                        this.f193015ch.f193434g.setDataPosition(0);
                        if (this.f193015ch.f193434g.readInt() == 1) {
                            return;
                        }
                    } else {
                        this.f193015ch.mo137318b(411, 0, 0, this.f192919ad);
                    }
                }
                if (this.f193214gb && (handler = this.f192943bC) != null) {
                    try {
                        handler.post(new RunnableC86342ak(this));
                        return;
                    } catch (Exception e) {
                        C86641i.m150117e("TTVideoEngine", e.toString());
                    }
                }
                mo137210c(this.f192919ad);
                return;
            }
        }
        if (this.f193183fv) {
            this.f192920ae.mo137525L(0);
        }
        this.f192968be = true;
        C86437e eVar2 = new C86437e(this.f192916aa, mo137238h(), this.f192898aI);
        this.f192922ag = eVar2;
        eVar2.f193805g = this.f192865B;
        this.f192922ag.mo137476a(this.f193183fv);
        this.f192922ag.f193801c = this.f193128es;
        if (this.f193133ex.booleanValue() && this.f193132ew != null) {
            this.f192922ag.mo137471a(this.f193133ex);
        }
        this.f192922ag.f193803e = new C86326j(this);
        C86437e eVar3 = this.f192922ag;
        String str2 = this.f192932aq;
        int i = this.f193366n;
        if (i == 2 || i == 4) {
            str = null;
        } else {
            str = this.f193367o;
        }
        eVar3.mo137474a(str2, str, i, this.f193131ev);
        this.f192922ag.f193804f = this.f193137fA;
    }

    /* renamed from: ah */
    private void m148658ah() {
        AbstractC86517e eVar;
        JSONArray b;
        boolean z;
        int a = C86594a.m149985a().mo137859a("config_hardware_type", 0);
        this.f192920ae.mo137583c(95, a);
        if (a > 0) {
            C86641i.m150110a("TTVideoEngine", "settings hardware config ".concat(String.valueOf(a)));
            if (a == C86594a.f195110g) {
                AbstractC86517e eVar2 = this.f192919ad;
                if (eVar2 != null) {
                    String b2 = eVar2.mo137744b(223);
                    if (!TextUtils.isEmpty(b2) && b2.equals("hw")) {
                        this.f193062de = 1;
                    }
                    C86641i.m150110a("TTVideoEngine", "using videoModel hardware: " + this.f193062de);
                }
            } else if (a == C86594a.f195111h) {
                C86594a a2 = C86594a.m149985a();
                if (a2.f195115l != 0 && (b = a2.f195112i.f56089c.get("vod").mo39158b("hw_nin_tags")) != null && this.f192898aI != null) {
                    int i = 0;
                    while (true) {
                        if (i >= b.length()) {
                            break;
                        } else if (this.f192898aI.equals(b.optString(i))) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    C86641i.m150110a("TTVideoEngine", "using settings hardware: " + this.f193062de + ", async = " + this.f193012cY + ", ninTag = " + z);
                }
                z = false;
                if (C86594a.m149985a().mo137859a("hardware_decode_priority", 0) == 0 || !this.f193004cQ) {
                    int a3 = C86594a.m149985a().mo137859a("hardware_decode", 0);
                    this.f192920ae.mo137558a("st_hw", Integer.valueOf(a3));
                    this.f193062de = a3;
                    if (this.f192919ad != null) {
                        this.f193012cY = C86594a.m149985a().mo137859a("hardware_async_init", 1);
                    }
                }
                C86641i.m150110a("TTVideoEngine", "using settings hardware: " + this.f193062de + ", async = " + this.f193012cY + ", ninTag = " + z);
            }
        } else if ((!this.f193004cQ || this.f193005cR) && (eVar = this.f192919ad) != null) {
            String b3 = eVar.mo137744b(223);
            if (!TextUtils.isEmpty(b3) && b3.equals("hw")) {
                this.f193062de = 1;
            }
        }
        if (this.f192923ah.mo16709b() != 1 && this.f192923ah.mo16709b() != 2 && this.f192923ah.mo16709b() != 5) {
            this.f193062de = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final String mo137274z() {
        int i;
        if (!TextUtils.isEmpty(this.f193132ew)) {
            try {
                i = JniUtils.m148584b();
            } catch (Exception unused) {
                i = 0;
            }
            StringBuilder sb = new StringBuilder(this.f193132ew);
            sb.append(C1764a.m5928a("&method=%d", new Object[]{Integer.valueOf(i)}));
            if (!TextUtils.isEmpty(this.f193363jv)) {
                sb.append(C1764a.m5928a("&%s=%s", new Object[]{"force_codec", this.f193363jv}));
            }
            String sb2 = sb.toString();
            C86641i.m150110a("TTVideoEngine", C1764a.m5928a("api string from fallback api:%s", new Object[]{sb2}));
            return sb2;
        } else if (this.f192871H == null) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            boolean s = C86572m.m149840s();
            String a = C86277r.m148504a(14, "");
            if (s) {
                if (this.f193364l) {
                    hashMap.put("format_type", "dash");
                }
                if (this.f192998cK.equals("bytevc2")) {
                    hashMap.put("codec_type", "4");
                } else if (this.f192998cK.equals("bytevc1")) {
                    hashMap.put("codec_type", "3");
                }
            } else {
                this.f193062de = 0;
            }
            if (this.f192866C == 2 && this.f193102eR == 2) {
                hashMap.put("format_type", "mpd");
            }
            if (this.f193218gf || this.f193219gg) {
                this.f192997cJ = true;
                hashMap.put("ssl", "1");
            } else {
                this.f192997cJ = false;
            }
            hashMap.put("player_version", a);
            if (this.f193303iM > 1) {
                hashMap.put("barragemask", "1");
            }
            hashMap.put("cdn_type", String.valueOf(this.f193066di));
            int c = C86307af.C86308a.m148612a().mo137130c();
            if (c != -1) {
                hashMap.put("network_score", String.valueOf(c));
            }
            if (!TextUtils.isEmpty(this.f193363jv)) {
                hashMap.put("force_codec", this.f193363jv);
            }
            C86641i.m150110a("TTVideoEngine", hashMap.toString());
            String a2 = this.f192871H.mo101153a(hashMap);
            C86641i.m150110a("TTVideoEngine", "api string from apiForFetcher:".concat(String.valueOf(a2)));
            return a2;
        }
    }

    /* renamed from: A */
    public final void mo137137A() {
        int i;
        int i2;
        String str;
        C86641i.m150110a("TTVideoEngine", "start to render,this:".concat(String.valueOf(this)));
        if (this.f192911aV) {
            mo137244i(1);
        }
        mo137139C();
        AbstractC86517e eVar = this.f192919ad;
        if (eVar == null || eVar.mo137747c() == null || this.f193021co <= 0) {
            i = 0;
        } else {
            i = this.f192919ad.mo137747c().size();
            C86641i.m150113b("TTVideoEngine", "subtitle num:".concat(String.valueOf(i)));
        }
        C86641i.m150113b("TTVideoEngine", "_setup subtitle info in");
        if (this.f193021co > 0) {
            AbstractC86302aa aaVar = this.f192872I;
            if (aaVar != null) {
                String aaVar2 = aaVar.toString();
                if (aaVar2 != null && aaVar2.length() > 0 && this.f192872I.mo137121a() > 0) {
                    AbstractC86468j jVar = this.f192920ae;
                    if (jVar != null) {
                        jVar.mo137582c(i);
                    }
                    C86641i.m150113b("TTVideoEngine", "using subtitle description info for setup subtitle");
                    mo137253k(aaVar2);
                }
            } else if (!this.f192938aw && i > 0) {
                AbstractC86468j jVar2 = this.f192920ae;
                if (jVar2 != null) {
                    jVar2.mo137582c(i);
                }
                C86641i.m150113b("TTVideoEngine", "start fetch subtitle info");
                if (this.f192919ad == null || this.f192929an == null) {
                    str = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    String b = this.f192929an.mo137726b(28);
                    if (b == null) {
                        b = "";
                    }
                    if (!TextUtils.isEmpty(this.f193168fg)) {
                        if (this.f193168fg.startsWith("http://") || this.f193168fg.startsWith("https://")) {
                            sb.append(C1764a.m5928a("%s/video/subtitle/v1/%s/%s?", new Object[]{this.f193168fg, this.f192865B, b}));
                        } else {
                            sb.append(C1764a.m5928a("https://%s/video/subtitle/v1/%s/%s?", new Object[]{this.f193168fg, this.f192865B, b}));
                        }
                        if (!TextUtils.isEmpty(this.f193166fe)) {
                            sb.append(C1764a.m5928a("sub_ids=%s", new Object[]{this.f193166fe}));
                        }
                        if (!TextUtils.isEmpty(this.f193167ff)) {
                            if (!TextUtils.isEmpty(this.f193166fe)) {
                                sb.append("&");
                            }
                            sb.append(C1764a.m5928a("format=%s", new Object[]{this.f193167ff}));
                        }
                    }
                    str = sb.toString();
                }
                if (this.f193138fB) {
                    str = C86640h.m150097c(str);
                }
                String a = C86643k.m150120a(str);
                C86641i.m150110a("TTVideoEngine", C1764a.m5928a("start to fetch sub info:%s", new Object[]{a}));
                AbstractC86468j jVar3 = this.f192920ae;
                if (jVar3 != null) {
                    jVar3.mo137556a(a);
                }
                C86433d dVar = new C86433d(this.f192916aa, mo137238h());
                this.f193085eA = dVar;
                dVar.f193794d = new C86337u(this);
                C86433d dVar2 = this.f193085eA;
                dVar2.f193793c = a;
                if (TextUtils.isEmpty(dVar2.f193793c)) {
                    dVar2.mo137466a(new C86633c("kTTVideoErrorDomainSubFetchingInfo", -9930, "sub ApiString empty"));
                } else {
                    dVar2.f193795e.mo101098a(dVar2.f193793c, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02bd: INVOKE  
                          (wrap: com.ss.ttvideoengine.k.j : 0x02b6: IGET  (r1v18 com.ss.ttvideoengine.k.j) = (r7v0 'dVar2' com.ss.ttvideoengine.f.d) com.ss.ttvideoengine.f.d.e com.ss.ttvideoengine.k.j)
                          (wrap: java.lang.String : 0x02b4: IGET  (r2v9 java.lang.String) = (r7v0 'dVar2' com.ss.ttvideoengine.f.d) com.ss.ttvideoengine.f.d.c java.lang.String)
                          (wrap: com.ss.ttvideoengine.f.d$1 : 0x02ba: CONSTRUCTOR  (r0v82 com.ss.ttvideoengine.f.d$1) = (r7v0 'dVar2' com.ss.ttvideoengine.f.d) call: com.ss.ttvideoengine.f.d.1.<init>(com.ss.ttvideoengine.f.d):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.ss.ttvideoengine.k.j.a(java.lang.String, com.ss.ttvideoengine.k.j$a):void in method: com.ss.ttvideoengine.ai.A():void, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02ba: CONSTRUCTOR  (r0v82 com.ss.ttvideoengine.f.d$1) = (r7v0 'dVar2' com.ss.ttvideoengine.f.d) call: com.ss.ttvideoengine.f.d.1.<init>(com.ss.ttvideoengine.f.d):void type: CONSTRUCTOR in method: com.ss.ttvideoengine.ai.A():void, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 31 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.ttvideoengine.f.d, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 37 more
                        */
                    /*
                    // Method dump skipped, instructions count: 733
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137137A():void");
                }

                /* renamed from: x */
                public final void mo137272x() {
                    AbstractC86253m mVar = this.f192923ah;
                    AbstractC86468j jVar = this.f192920ae;
                    if (jVar != null) {
                        if (mVar != null) {
                            jVar.mo137537a(mVar.mo16708b(150));
                            this.f192920ae.mo137566b(mVar.mo16708b(151));
                            this.f192920ae.mo137670y(mVar.mo16710b(186, -1));
                            this.f192920ae.mo137624l(mVar.mo16684a(152, -1L));
                            this.f192920ae.mo137515B(mVar.mo16710b(153, -1));
                            this.f192920ae.mo137513A(mVar.mo16710b(189, -1));
                            this.f192920ae.mo137517D(mVar.mo16710b(221, -1));
                            this.f192920ae.mo137518E(mVar.mo16710b(222, -1));
                            this.f192920ae.mo137519F(mVar.mo16710b(245, -1));
                            if (this.f193062de > 0) {
                                this.f192920ae.mo137656t(mVar.mo16713c(187));
                                this.f192920ae.mo137672z(mVar.mo16710b(188, -1));
                            }
                            if (this.f193374v != 0) {
                                this.f192920ae.mo137632n(mVar.mo16684a(73, -1L));
                                this.f192920ae.mo137628m(mVar.mo16684a(72, -1L));
                            }
                            this.f192920ae.mo137673z(this.f193145fI);
                            this.f192920ae.mo137584c(21, mVar.mo16684a(171, -1L));
                            this.f192920ae.mo137584c(56, mVar.mo16684a(468, -1L));
                            this.f192920ae.mo137584c(82, mVar.mo16684a(850, 0L));
                            this.f192920ae.mo137584c(84, mVar.mo16684a(851, 0L));
                            this.f192920ae.mo137584c(85, mVar.mo16684a(852, 0L));
                            int b = mVar.mo16710b(62, -100);
                            int b2 = mVar.mo16710b(61, -100);
                            if (b == 0) {
                                this.f192920ae.mo137583c(12, 1);
                            } else {
                                this.f192920ae.mo137583c(12, 0);
                            }
                            if (b2 == 0) {
                                this.f192920ae.mo137583c(13, 1);
                            } else {
                                this.f192920ae.mo137583c(13, 0);
                            }
                            this.f192920ae.mo137583c(89, mVar.mo16710b(912, -1));
                            m148653ac();
                            HashMap hashMap = new HashMap();
                            hashMap.put("abrv", this.f192957bQ);
                            if (C86614c.f195160b != null) {
                                this.f193241hB = C86614c.f195160b.getVersion();
                            }
                            hashMap.put("netv", this.f193241hB);
                            hashMap.put("used", Integer.valueOf(this.f193244hE ? 1 : 0));
                            hashMap.put("pcnt", Integer.valueOf(mVar.mo16710b(179, 0)));
                            hashMap.put("scnt", Integer.valueOf(mVar.mo16710b(173, 0)));
                            hashMap.put("apbr", Integer.valueOf(mVar.mo16710b(174, 0)));
                            hashMap.put("apsp", Float.valueOf(mVar.mo16708b(175)));
                            hashMap.put("adbr", Integer.valueOf(mVar.mo16710b(610, 0)));
                            hashMap.put("npad", Float.valueOf(this.f192954bN));
                            hashMap.put("npap", Float.valueOf(this.f192955bO));
                            hashMap.put("adob", Integer.valueOf(mVar.mo16710b(615, 0)));
                            hashMap.put("aplb", Integer.valueOf(mVar.mo16710b(614, 0)));
                            hashMap.put("avbl", Float.valueOf(mVar.mo16708b(616)));
                            hashMap.put("iast", Integer.valueOf(this.f192962bW));
                            hashMap.put("acsm", Integer.valueOf(ABRConfig.getSwitchModel()));
                            hashMap.put("stbr", Long.valueOf(this.f193284ht));
                            hashMap.put("uebr", Long.valueOf(this.f193285hu));
                            hashMap.put("stre", this.f192958bR);
                            hashMap.put("dgbt", Long.valueOf(this.f193286hv));
                            this.f192920ae.mo137563a(hashMap);
                            if (this.f193244hE || this.f192962bW > 0) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("adtp", Integer.valueOf(f192850ce));
                                hashMap2.put("sptp", Integer.valueOf(f192849cd));
                                hashMap2.put("astp", Integer.valueOf(ABRConfig.getStartupModel()));
                                hashMap2.put("mcbr", Long.valueOf(this.f193287hw));
                                hashMap2.put("stsp", Float.valueOf(this.f193289hy));
                                hashMap2.put("spsp", Float.valueOf(this.f193290hz));
                                hashMap2.put("sasp", Float.valueOf(this.f193240hA));
                                hashMap2.put("stfs", Long.valueOf(this.f193288hx));
                                ArrayList arrayList = new ArrayList();
                                AbstractC86517e eVar = this.f192919ad;
                                if (eVar != null) {
                                    List<C86534o> b3 = eVar.mo137745b();
                                    if (b3 == null) {
                                        b3 = Collections.emptyList();
                                    }
                                    for (C86534o oVar : b3) {
                                        if (oVar != null) {
                                            HashMap hashMap3 = new HashMap();
                                            hashMap3.put("br", Integer.valueOf(oVar.mo137724a(3)));
                                            String b4 = oVar.mo137726b(32);
                                            if (!TextUtils.isEmpty(b4)) {
                                                hashMap3.put("def", b4);
                                            } else {
                                                hashMap3.put("def", m148685d(oVar.mo137729c()));
                                            }
                                            arrayList.add(hashMap3);
                                        }
                                    }
                                }
                                if (arrayList.size() > 0) {
                                    hashMap2.put("brs", arrayList.toArray());
                                }
                                this.f192920ae.mo137578b(hashMap2);
                            }
                        }
                        this.f192920ae.mo137583c(11, this.f192944bD);
                        this.f192920ae.mo137583c(79, mo137203b() ? 1 : 0);
                        this.f192920ae.mo137583c(80, this.f193299iI);
                        this.f192920ae.mo137583c(81, this.f193300iJ);
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: c */
                public final void mo137205c() {
                    C86641i.m150110a("TTVideoEngine", "[SRLog]setupTextureRender");
                    int i = 0;
                    if (this.f192992cC != 0) {
                        this.f192920ae.mo137661v(0);
                    }
                    this.f192992cC = 0;
                    AbstractC86468j jVar = this.f192920ae;
                    if (jVar != null) {
                        jVar.mo137531R(this.f193142fF);
                    }
                    this.f193144fH = C86205m.m148119a();
                    C86641i.m150110a("TTVideoEngine", "get texture renderer start");
                    C86205m mVar = this.f193144fH;
                    if (mVar == null) {
                        this.f193142fF = 0;
                        C86641i.m150117e("TTVideoEngine", "couldn't get rendererManager");
                        return;
                    }
                    Context context = this.f192916aa;
                    if (context != null) {
                        Context applicationContext = context.getApplicationContext();
                        if (C58003a.f132201c && applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                        mVar.f192331d = applicationContext;
                    }
                    if (f192856fJ == null) {
                        C86338v vVar = new C86338v((byte) 0);
                        f192856fJ = vVar;
                        C86203l.m148117a(vVar);
                    }
                    boolean z = this.f192985bv;
                    this.f192984bu = z;
                    if (!this.f193159fX.isEmpty() || !z || !this.f192987bx || this.f193144fH.mo136520c()) {
                        this.f192987bx = false;
                        if (this.f193144fH.mo136520c() && (this.f192985bv || this.f192984bu)) {
                            this.f192984bu = true;
                            z = true;
                        }
                        VideoSurface e = mo137223e(z);
                        if (e == null) {
                            this.f193142fF = 0;
                            this.f193145fI = this.f193144fH.f192330c;
                            C86641i.m150117e("TTVideoEngine", "genOffscreenSurface failed = " + this.f193145fI);
                            return;
                        }
                        e.mo136458b(this.f192986bw);
                        e.f192167b = new VideoSurface.AbstractC86167a() {
                            /* class com.p2082ss.ttvideoengine.C86313ai.C863141 */

                            /* renamed from: b */
                            private int f193380b;

                            static {
                                Covode.recordClassIndex(101542);
                            }

                            @Override // com.p2082ss.texturerender.VideoSurface.AbstractC86167a
                            /* renamed from: a */
                            public final void mo136463a() {
                                if (C86313ai.this.f192982bs) {
                                    C86313ai.this.f193030cx++;
                                    if (C86313ai.this.f192977bn != null) {
                                        int c = C86313ai.this.f192977bn.mo136459c(6, -1);
                                        if (this.f193380b != c) {
                                            C86641i.m150113b("TTVideoEngine", "[SRLog]using sr:" + c + " frameCount:" + C86313ai.this.f193030cx);
                                            this.f193380b = c;
                                        }
                                        C86313ai.this.f192988by.mo137884a(c, 0);
                                    }
                                }
                                if (!C86313ai.this.f192979bp && C86313ai.this.f192982bs) {
                                    C86641i.m150113b("TTVideoEngine", "recive first frame render from texture");
                                    C86313ai.this.f192979bp = true;
                                }
                                if (C86313ai.this.f192980bq && !C86313ai.this.f192981br && C86313ai.this.f192911aV && C86313ai.this.f192978bo != 1) {
                                    C86641i.m150113b("TTVideoEngine", "render start by texture, state =" + C86313ai.this.f193374v);
                                    C86313ai.this.mo137137A();
                                }
                            }
                        };
                        e.mo136454a(new C86341aj(this));
                        e.mo136457b(3, 1);
                        if (this.f193155fT == 2) {
                            i = 1;
                        }
                        e.mo136457b(2, i);
                        while (!this.f193159fX.isEmpty()) {
                            e.mo136452a(this.f193159fX.poll());
                        }
                        C86641i.m150110a("TTVideoEngine", "get a surface = ".concat(String.valueOf(e)));
                        this.f192977bn = e;
                        m148627W();
                        return;
                    }
                    C86641i.m150110a("TTVideoEngine", "sr instance not exist, useSR:" + z + ", asyncInitSR:" + this.f192987bx);
                    this.f192985bv = false;
                }

                /* renamed from: a */
                public final void mo137176a(C86535p pVar) {
                    mo137175a((AbstractC86517e) pVar);
                }

                /* renamed from: d */
                public final void mo137218d(AbstractC86517e eVar) {
                    this.f192920ae.mo137574b(eVar);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$d */
                public static class C86320d implements IABRInfoListener {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193393a;

                    static {
                        Covode.recordClassIndex(101548);
                    }

                    public C86320d(C86313ai aiVar) {
                        this.f193393a = new WeakReference<>(aiVar);
                    }

                    @Override // com.bytedance.vcloud.abrmodule.IABRInfoListener
                    public final void onInfo(int i, int i2) {
                        ABRResult predict;
                        int size;
                        int i3;
                        int i4;
                        int i5;
                        C86313ai aiVar = this.f193393a.get();
                        if (aiVar != null && i == 1 && aiVar.f192960bU != null && (predict = aiVar.f192960bU.getPredict()) != null && (size = predict.size()) != 0) {
                            if (size > 0) {
                                ABRResultElement aBRResultElement = predict.get(0);
                                i4 = aBRResultElement.getMediaType();
                                i5 = (int) aBRResultElement.getBitrate();
                                i3 = aBRResultElement.getCacheTime();
                            } else {
                                i3 = 0;
                                i4 = 0;
                                i5 = 0;
                            }
                            C86641i.m150113b("TTVideoEngine", C1764a.m5929a(Locale.ENGLISH, "[ABR] predict next segment bitrate:%dbps", new Object[]{Integer.valueOf(i5)}) + ", this:" + aiVar);
                            if (i5 != -1) {
                                if (aiVar.f193015ch.mo137320b()) {
                                    aiVar.f193015ch.mo137318b(600, i4, i5, null);
                                }
                                AbstractC86253m mVar = aiVar.f192923ah;
                                long j = (long) i5;
                                if (aiVar.f192926ak != j) {
                                    if (mVar != null) {
                                        aiVar.f192920ae.mo137547a(aiVar.f192926ak, j);
                                        aiVar.f192926ak = j;
                                    } else {
                                        return;
                                    }
                                } else if (mVar == null) {
                                    return;
                                }
                                if (aiVar.f192963bX == 0) {
                                    if (i3 >= 0) {
                                        mVar.mo16687a(270, i3);
                                    }
                                    mVar.mo16687a(600, i5);
                                }
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$e */
                public static class C86321e implements AbstractC86253m.AbstractC86254a {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193394a;

                    static {
                        Covode.recordClassIndex(101549);
                    }

                    public C86321e(C86313ai aiVar) {
                        this.f193394a = new WeakReference<>(aiVar);
                    }

                    @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86254a
                    /* renamed from: a */
                    public final void mo136842a(int i) {
                        C86313ai aiVar = this.f193394a.get();
                        if (aiVar != null) {
                            if (aiVar.f192896aG) {
                                i = 100;
                            }
                            aiVar.f193377y = i;
                            aiVar.mo137162a(2, (long) i);
                            if (aiVar.f193015ch.mo137320b()) {
                                aiVar.f193015ch.mo137318b(403, i, 0, null);
                            } else if (aiVar.f192874K != null) {
                                aiVar.f192874K.mo16753c(aiVar, i);
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$f */
                public static class C86322f implements AbstractC86253m.AbstractC86255b {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193395a;

                    static {
                        Covode.recordClassIndex(101550);
                    }

                    public C86322f(C86313ai aiVar) {
                        this.f193395a = new WeakReference<>(aiVar);
                    }

                    @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86255b
                    /* renamed from: a */
                    public final void mo16759a(AbstractC86253m mVar) {
                        C86313ai aiVar = this.f193395a.get();
                        if (aiVar != null) {
                            C86641i.m150110a("TTVideoEngine", "receive onCompletion,this:".concat(String.valueOf(aiVar)));
                            aiVar.f192920ae.mo137626m();
                            if (!aiVar.f192867D) {
                                aiVar.f192971bh = true;
                                aiVar.mo137244i(0);
                                if (aiVar.f192970bg != null) {
                                    aiVar.f192970bg.mo137909b();
                                    aiVar.f192920ae.mo137523J(aiVar.f192970bg.f195259a.mo137905c());
                                }
                                if (aiVar.f193023cq > 0) {
                                    aiVar.f193022cp = aiVar.f193376x;
                                }
                                aiVar.f192920ae.mo137667x(aiVar.f193376x);
                                aiVar.mo137272x();
                                aiVar.f192920ae.mo137664w(3);
                                aiVar.f192937av = false;
                                aiVar.f192938aw = false;
                                aiVar.f192924ai = -1;
                                aiVar.f192925aj = -1;
                                aiVar.f192939ax = false;
                                aiVar.f192936au = false;
                                aiVar.mo137246i(false);
                                aiVar.f192941az = 0;
                                aiVar.f192905aP = false;
                                aiVar.f193372t = false;
                                aiVar.f192891aB = true;
                                aiVar.f192934as = false;
                                aiVar.mo137248j(3);
                            } else {
                                aiVar.f192920ae.mo137630n();
                            }
                            if (aiVar.f193015ch.mo137320b()) {
                                aiVar.f193015ch.mo137318b(408, 0, 0, null);
                            } else if (aiVar.f192874K != null) {
                                aiVar.f192874K.mo16754d(aiVar);
                            }
                            if (mVar.mo16707a()) {
                                aiVar.f193370r = false;
                            }
                            aiVar.f192890aA = 0;
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$i */
                public static class C86325i implements AbstractC86253m.AbstractC86256c {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193398a;

                    static {
                        Covode.recordClassIndex(101553);
                    }

                    public C86325i(C86313ai aiVar) {
                        this.f193398a = new WeakReference<>(aiVar);
                    }

                    @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86256c
                    /* renamed from: a */
                    public final boolean mo16758a(AbstractC86253m mVar, int i, int i2) {
                        C86313ai aiVar = this.f193398a.get();
                        if (aiVar == null) {
                            return false;
                        }
                        if (aiVar.f192970bg != null) {
                            aiVar.f192970bg.mo137909b();
                        }
                        aiVar.mo137244i(3);
                        aiVar.mo137234g(3, -1);
                        String c = mVar.mo16713c(5002);
                        String a = C86633c.m150048a(mVar);
                        C86381b.C86382a.f193539a.mo137347a(i);
                        if (!a.equals("kTTVideoErrorDomainVideoOwnPlayer") || !aiVar.f192906aQ) {
                            aiVar.f192907aR = new C86633c(a, i, i2, c);
                            aiVar.mo137177a(aiVar.f192907aR);
                            return true;
                        }
                        C86641i.m150110a("TTVideoEngine", "retrying, not handle error: " + i + ", i1:" + i2);
                        return true;
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$j */
                public static class C86326j implements C86437e.AbstractC86441a {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193399a;

                    static {
                        Covode.recordClassIndex(101554);
                    }

                    public C86326j(C86313ai aiVar) {
                        this.f193399a = new WeakReference<>(aiVar);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
                    /* renamed from: a */
                    public final void mo137286a(String str) {
                        C86641i.m150110a("TTVideoEngine", "fetcher cancelled");
                        C86313ai aiVar = this.f193399a.get();
                        if (aiVar != null) {
                            aiVar.f192920ae.mo137668x(str);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
                    /* renamed from: a */
                    public final void mo137285a(C86633c cVar) {
                        if (cVar != null) {
                            C86641i.m150117e("TTVideoEngine", C1764a.m5928a("fetcher should retry, error:%s", new Object[]{cVar.toString()}));
                            C86313ai aiVar = this.f193399a.get();
                            if (aiVar != null) {
                                aiVar.f192920ae.mo137554a(cVar, aiVar.f193366n);
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
                    /* renamed from: a */
                    public final void mo137283a(int i, String str) {
                        C86313ai aiVar = this.f193399a.get();
                        if (aiVar != null) {
                            C86641i.m150117e("TTVideoEngine", C1764a.m5928a("video status exception:%d", new Object[]{Integer.valueOf(i)}));
                            aiVar.f192968be = false;
                            if (aiVar.f192920ae != null) {
                                aiVar.f192920ae.mo137585c(i, str);
                            }
                            if (aiVar.f193015ch.mo137320b()) {
                                aiVar.f193015ch.mo137318b(410, i, 0, null);
                            } else if (aiVar.f192874K != null) {
                                aiVar.f192874K.mo16745a(i);
                            }
                        }
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
                        if (r4.f193015ch.f193434g.readInt() == 1) goto L_0x0091;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
                        if (r4.f192877N.mo51861a(r7) != false) goto L_0x0091;
                     */
                    @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo137284a(com.p2082ss.ttvideoengine.p4417j.C86535p r7, com.p2082ss.ttvideoengine.p4430s.C86633c r8) {
                        /*
                        // Method dump skipped, instructions count: 178
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.C86326j.mo137284a(com.ss.ttvideoengine.j.p, com.ss.ttvideoengine.s.c):void");
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$k */
                public static class C86327k implements AbstractC86246f {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193400a;

                    static {
                        Covode.recordClassIndex(101555);
                    }

                    private C86327k(C86313ai aiVar) {
                        this.f193400a = new WeakReference<>(aiVar);
                    }

                    /* synthetic */ C86327k(C86313ai aiVar, byte b) {
                        this(aiVar);
                    }

                    @Override // com.p2082ss.ttm.player.AbstractC86246f
                    /* renamed from: a */
                    public final void mo136804a(long j, long j2, Map<Integer, String> map) {
                        C86313ai aiVar = this.f193400a.get();
                        if (aiVar != null && aiVar.f192977bn != null) {
                            VideoSurface videoSurface = aiVar.f192977bn;
                            if (videoSurface.f192166a != null) {
                                videoSurface.f192166a.frameMetaCallback(j, j2, map);
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$l */
                public static class C86328l implements AbstractC86253m.AbstractC86258e {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193401a;

                    static {
                        Covode.recordClassIndex(101556);
                    }

                    public C86328l(C86313ai aiVar) {
                        this.f193401a = new WeakReference<>(aiVar);
                    }

                    @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86258e
                    /* renamed from: a */
                    public final boolean mo16760a(AbstractC86253m mVar, int i, int i2) {
                        C86313ai aiVar = this.f193401a.get();
                        if (aiVar == null) {
                            return false;
                        }
                        if (i == 3) {
                            C86641i.m150110a("TTVideoEngine", "player callback render start");
                            if (!(aiVar.f193378z == 0 || aiVar.f192923ah == null || aiVar.f192887X == null)) {
                                C86593o oVar = aiVar.f192887X;
                                aiVar.f192923ah.mo16710b(139, -1);
                                oVar.mo101142c(aiVar.f192923ah.mo16684a(155, -1L), aiVar.f192923ah.mo16684a(162, -1L));
                            }
                            if (aiVar.f192978bo == 1) {
                                aiVar.f192980bq = true;
                                aiVar.mo137137A();
                                if (!(aiVar.f192977bn == null || aiVar.f192917ab == null || aiVar.f192918ac != null)) {
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    mVar.mo16691a(aiVar.f192977bn);
                                    aiVar.f192977bn.mo136453a(aiVar.f192917ab);
                                    C86641i.m150110a("TTVideoEngine", "renderstart change to texturesurface,time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                                }
                            } else if (aiVar.f192977bn == null) {
                                C86641i.m150110a("TTVideoEngine", "render start by player");
                                aiVar.mo137137A();
                            } else {
                                aiVar.f192980bq = true;
                                if (aiVar.f192979bp) {
                                    C86641i.m150110a("TTVideoEngine", "render start by player after texture");
                                    aiVar.mo137137A();
                                }
                            }
                            if (!aiVar.mo137265q()) {
                                aiVar.mo137239h(0);
                            }
                            if (aiVar.f192992cC != 0) {
                                aiVar.f192920ae.mo137658u(0);
                            }
                        } else if (i == 4) {
                            aiVar.mo137139C();
                        } else if (i == 701) {
                            aiVar.mo137229f(i2);
                        } else if (i != 702) {
                            switch (i) {
                                case -268435438:
                                    aiVar.f193022cp = i2;
                                    aiVar.mo137252k(i2);
                                    break;
                                case -268435436:
                                    if (aiVar.f192873J != null) {
                                        aiVar.f192873J.mo101159a(i2);
                                        break;
                                    }
                                    break;
                                case -268435392:
                                    if (aiVar.f192920ae != null) {
                                        aiVar.f192920ae.mo137590d(i2);
                                        break;
                                    }
                                    break;
                                case -268435390:
                                    if (!aiVar.f193015ch.mo137320b()) {
                                        if (aiVar.f192873J != null) {
                                            aiVar.f192873J.mo101151a(aiVar);
                                            break;
                                        }
                                    } else {
                                        aiVar.f193015ch.mo137318b(419, i, 0, null);
                                        break;
                                    }
                                    break;
                                case 801:
                                    aiVar.mo137250j(false);
                                    break;
                                case 251658244:
                                    aiVar.mo137239h(i2);
                                    break;
                                case 251658252:
                                    aiVar.mo137138B();
                                    break;
                                default:
                                    switch (i) {
                                        case -268435408:
                                            C86641i.m150110a("TTVideoEngine", "preBuffering start,this:" + aiVar + ", code:" + i2);
                                            if (aiVar.f192920ae != null) {
                                                aiVar.f192920ae.mo137643q(i2);
                                                break;
                                            }
                                            break;
                                        case -268435407:
                                            C86641i.m150110a("TTVideoEngine", "av outsync start:".concat(String.valueOf(i2)));
                                            aiVar.f192920ae.mo137651s(i2);
                                            break;
                                        case -268435406:
                                            C86641i.m150110a("TTVideoEngine", "av outsync end:".concat(String.valueOf(i2)));
                                            aiVar.f192920ae.mo137655t(i2);
                                            break;
                                        case -268435405:
                                            if (!(aiVar.f193378z == 0 || aiVar.f192887X == null || aiVar.f192923ah == null)) {
                                                C86593o oVar2 = aiVar.f192887X;
                                                aiVar.mo137143G();
                                                oVar2.mo101140a(aiVar.f192923ah.mo16684a(621, 0L), aiVar.f192923ah.mo16684a(625, 0L));
                                                break;
                                            }
                                        case -268435404:
                                            if (!(aiVar.f192923ah == null || aiVar.f193378z == 0)) {
                                                if (i2 != 0) {
                                                    if (i2 == 1 && aiVar.f192887X != null) {
                                                        C86593o oVar3 = aiVar.f192887X;
                                                        aiVar.f192923ah.mo16710b(158, -1);
                                                        oVar3.mo101143d(aiVar.f192923ah.mo16684a(631, -1L), aiVar.f192923ah.mo16684a(632, -1L));
                                                        break;
                                                    }
                                                } else if (aiVar.f192887X != null) {
                                                    C86593o oVar4 = aiVar.f192887X;
                                                    aiVar.f192923ah.mo16710b(157, -1);
                                                    oVar4.mo101141b(aiVar.f192923ah.mo16684a(629, -1L), aiVar.f192923ah.mo16684a(630, -1L));
                                                    aiVar.f192887X.mo101139a(aiVar.f192923ah.mo16684a(77, -1L));
                                                    break;
                                                }
                                            }
                                            break;
                                        case -268435403:
                                            aiVar.f192920ae.mo137658u(i2);
                                            break;
                                        case -268435402:
                                            aiVar.f192920ae.mo137661v(i2);
                                            break;
                                        case -268435401:
                                            C86641i.m150110a("TTVideoEngine", "starttime is bigger than video duration:".concat(String.valueOf(i2)));
                                            aiVar.f192946bF = true;
                                            break;
                                        default:
                                            switch (i) {
                                                case 251658248:
                                                    C86641i.m150110a("TTVideoEngine", C1764a.m5928a("render seek complete:%d", new Object[]{Integer.valueOf(i2)}));
                                                    if (aiVar.f192920ae != null) {
                                                        aiVar.f192920ae.mo137639p(i2);
                                                        aiVar.f192920ae.mo137594e();
                                                    }
                                                    if (aiVar.f192934as) {
                                                        aiVar.f192934as = false;
                                                        aiVar.f192935at = 0;
                                                        if (aiVar.f192920ae != null) {
                                                            aiVar.f192920ae.mo137606h();
                                                            aiVar.f192920ae.mo137594e();
                                                        }
                                                    }
                                                    if (aiVar.f192878O != null) {
                                                        C86641i.m150110a("TTVideoEngine", "render seek complete call back ".concat(String.valueOf(i2)));
                                                        C86365az azVar = new C86365az();
                                                        azVar.f193468a = "renderSeekComplete";
                                                        azVar.f193470c = Integer.valueOf(i2);
                                                        if (!aiVar.f193015ch.mo137320b()) {
                                                            aiVar.f192878O.mo101150a(azVar);
                                                            break;
                                                        } else {
                                                            aiVar.f193015ch.mo137318b(412, 0, 0, azVar);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 251658249:
                                                    aiVar.mo137224e(i2);
                                                    break;
                                            }
                                    }
                                    break;
                            }
                        } else {
                            aiVar.mo137233g(i2);
                        }
                        return false;
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$n */
                public static class C86330n implements AbstractC86253m.AbstractC86264k {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193403a;

                    static {
                        Covode.recordClassIndex(101558);
                    }

                    public C86330n(C86313ai aiVar) {
                        this.f193403a = new WeakReference<>(aiVar);
                    }

                    @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86264k
                    /* renamed from: a */
                    public final void mo136846a(int i, int i2) {
                        C86313ai aiVar = this.f193403a.get();
                        if (aiVar != null) {
                            C86641i.m150110a("TTVideoEngine", "onSARChanged = " + i + ", " + i2);
                            if (aiVar.f193015ch.mo137320b()) {
                                aiVar.f193015ch.mo137318b(418, i, i2, null);
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$o */
                public static class C86331o implements AbstractC86253m.AbstractC86263j {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193404a;

                    static {
                        Covode.recordClassIndex(101559);
                    }

                    public C86331o(C86313ai aiVar) {
                        this.f193404a = new WeakReference<>(aiVar);
                    }

                    @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86263j
                    /* renamed from: a */
                    public final void mo136845a(AbstractC86253m mVar, int i, int i2) {
                        int i3;
                        boolean z;
                        C86313ai aiVar = this.f193404a.get();
                        if (aiVar != null) {
                            C86641i.m150110a("TTVideoEngine", "[SRLog]video size changed = " + i + ", " + i2);
                            C86628d dVar = new C86628d();
                            dVar.f195240s = Integer.valueOf(i);
                            dVar.f195241t = Integer.valueOf(i2);
                            aiVar.f192988by.mo137885a(dVar);
                            if (aiVar.f192977bn != null) {
                                aiVar.f192977bn.mo136450a(i, i2);
                                if (aiVar.f192984bu && !aiVar.f192986bw) {
                                    VideoSurface videoSurface = aiVar.f192977bn;
                                    if (videoSurface.f192166a == null || !videoSurface.f192166a.supportProcessResolution(i, i2)) {
                                        C86641i.m150110a("TTVideoEngine", "VideoSurface resolution not support for sr");
                                        aiVar.mo137190a(0, -7891);
                                    }
                                }
                            }
                            int b = mVar.mo16710b(912, -1);
                            C86641i.m150113b("TTVideoEngine", "colorTrc ".concat(String.valueOf(b)));
                            if (b == 16) {
                                i3 = 1;
                            } else if (b == 18) {
                                i3 = 2;
                            } else {
                                i3 = 0;
                            }
                            if (aiVar.f192977bn != null) {
                                VideoSurface videoSurface2 = aiVar.f192977bn;
                                if (aiVar.f192989bz == 1) {
                                    if (i3 == 1 || i3 == 2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (videoSurface2 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("effect_type", 4);
                                        if (z) {
                                            bundle.putInt("action", 21);
                                            bundle.putInt("hdr_type", i3);
                                            bundle.putInt("use_effect", 1);
                                        } else {
                                            bundle.putInt("action", 19);
                                            bundle.putInt("use_effect", 0);
                                        }
                                        videoSurface2.mo136452a(bundle);
                                    }
                                }
                            }
                            aiVar.f192920ae.mo137583c(90, i3);
                            if (aiVar.f193015ch.mo137320b()) {
                                aiVar.f193015ch.mo137318b(402, i, i2, null);
                            } else if (aiVar.f192874K != null) {
                                aiVar.f192874K.mo16748a(aiVar, i, i2);
                            }
                            if (!aiVar.f192936au && aiVar.f192940ay) {
                                C86641i.m150113b("TTVideoEngine", "changed video size set");
                                aiVar.f192940ay = false;
                                aiVar.f192920ae.mo137595e(i);
                                aiVar.f192920ae.mo137599f(i2);
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$q */
                public static class C86333q implements AbstractC86253m.AbstractC86260g {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193408a;

                    static {
                        Covode.recordClassIndex(101561);
                    }

                    public C86333q(C86313ai aiVar) {
                        this.f193408a = new WeakReference<>(aiVar);
                    }

                    @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86260g
                    /* renamed from: a */
                    public final void mo16757a(AbstractC86253m mVar) {
                        C86313ai aiVar = this.f193408a.get();
                        if (aiVar != null && !aiVar.f192913aX && aiVar.f192923ah != null && mVar != null) {
                            C86641i.m150110a("TTVideoEngine", "receive onPrepared");
                            C86641i.m150113b("TTVideoEngine", "onPrepared mediaFormat " + aiVar.f192923ah.mo16710b(44, -1) + ", videoCodecID " + aiVar.f192923ah.mo16710b(141, -1));
                            aiVar.f192904aO = 0;
                            aiVar.f192907aR = null;
                            aiVar.f193376x = mVar.mo16726n();
                            aiVar.f193370r = true;
                            if (aiVar.f192920ae != null) {
                                aiVar.f192920ae.mo137589d();
                                aiVar.f192920ae.mo137627m(aiVar.f193376x);
                            }
                            if (aiVar.f193015ch.mo137320b()) {
                                aiVar.f193015ch.mo137318b(405, 0, 0, null);
                            } else if (aiVar.f192874K != null) {
                                aiVar.f192874K.mo16750b(aiVar);
                            }
                            if (aiVar.f192923ah == null) {
                                C86641i.m150117e("TTVideoEngine", "onPrepared mediaplayer is null!");
                                return;
                            }
                            aiVar.mo137259m("onPrepared");
                            C86641i.m150110a("TTVideoEngine", "mPausedBeforePrepared:" + aiVar.f193371s + ", mShouldPlay:" + aiVar.f192911aV + ", mIsStartPlayAutomatically:" + aiVar.f192914aY + ", mIsPreDecodeAutoPause:" + aiVar.f192915aZ + ", skip start:" + aiVar.f192993cD);
                            if (!aiVar.f192993cD && ((!aiVar.f193371s && aiVar.f192911aV) || (!aiVar.f192914aY && aiVar.f192915aZ))) {
                                mVar.mo16718f();
                            }
                            if (aiVar.f192936au && !aiVar.f192911aV) {
                                mVar.mo16718f();
                                mVar.mo16719g();
                            }
                            if (!TextUtils.isEmpty(aiVar.f193017ck) && aiVar.f192936au && aiVar.f193021co > 0) {
                                aiVar.f192923ah.mo16687a(618, aiVar.f193020cn);
                                aiVar.f192923ah.mo16688a(617, aiVar.f193017ck);
                                C86641i.m150113b("TTVideoEngine", "sub option: " + aiVar.f193020cn + " url:" + aiVar.f193017ck);
                            }
                            if (aiVar.f192868E != null && aiVar.mo137221d(2) && Build.VERSION.SDK_INT >= 23) {
                                mVar.mo16703a(aiVar.f192868E);
                                aiVar.f192920ae.mo137550a(aiVar.f192868E);
                            }
                            int b = mVar.mo16710b(62, -100);
                            int b2 = mVar.mo16710b(61, -100);
                            if (b == 0) {
                                aiVar.f192920ae.mo137583c(12, 1);
                            } else {
                                aiVar.f192920ae.mo137583c(12, 0);
                            }
                            if (b2 == 0) {
                                aiVar.f192920ae.mo137583c(13, 1);
                            } else {
                                aiVar.f192920ae.mo137583c(13, 0);
                            }
                            C86641i.m150110a("TTVideoEngine", "videoEnabled:" + b + ",audioEnabled:" + b2);
                            long a = aiVar.f192923ah.mo16684a(524, -100L);
                            long a2 = aiVar.f192923ah.mo16684a(525, -100L);
                            aiVar.f192920ae.mo137584c(98, a);
                            aiVar.f192920ae.mo137584c(99, a2);
                            if (aiVar.f193032cz && !aiVar.f193031cy) {
                                aiVar.f193015ch.mo137309a(24);
                                aiVar.f193031cy = true;
                            }
                            if (mVar.mo16707a() && aiVar.f192944bD == 1 && !aiVar.f192937av) {
                                C86641i.m150110a("TTVideoEngine", "OSPlayer in radioMode enter renderStart");
                                aiVar.mo137137A();
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.ttvideoengine.ai$s */
                public static class C86335s implements AbstractC86626b {

                    /* renamed from: a */
                    private final WeakReference<C86313ai> f193410a;

                    static {
                        Covode.recordClassIndex(101563);
                    }

                    public C86335s(C86313ai aiVar) {
                        this.f193410a = new WeakReference<>(aiVar);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4429r.AbstractC86626b
                    /* renamed from: a */
                    public final void mo137298a(C86627c cVar) {
                        C86313ai aiVar = this.f193410a.get();
                        if (aiVar != null) {
                            int i = cVar.f195212c;
                            int i2 = cVar.f195216g;
                            int i3 = cVar.f195217h;
                            boolean z = cVar.f195213d;
                            boolean b = cVar.mo137886b();
                            int i4 = cVar.f195215f;
                            boolean z2 = cVar.f195214e;
                            C86641i.m150110a("TTVideoEngine", "[SRLog]onSRStrategy  mode=" + i + " srRealStatus=" + i2 + " srOpenStatus=" + i3 + " satisfied=" + z + " enabled=" + b + " notUseReason=" + i4 + " shouldUseSRTexture=" + z2);
                            if (i2 == 2) {
                                if (i3 != 0 && 1 != i) {
                                    aiVar.mo137190a(0, i4);
                                    if (aiVar.f192962bW > 0 && aiVar.f192961bV == 0) {
                                        EnumC86649v vVar = cVar.f195219j;
                                        EnumC86649v vVar2 = cVar.f195220k;
                                        if (vVar != null && vVar2 != null && aiVar.f192927al != null && aiVar.f192927al.compareTo((Enum) vVar) == 0 && vVar.compareTo((Enum) vVar2) != 0) {
                                            aiVar.mo137179a(vVar2, (Map<Integer, String>) null);
                                            C86641i.m150110a("TTVideoEngine", "[SRLog]onSRStrategy sr open fail switch resolution to ".concat(String.valueOf(vVar2)));
                                        }
                                    }
                                }
                            } else if (1 != i) {
                                aiVar.f192985bv = z2;
                                if (z) {
                                    if (i3 != 1) {
                                        aiVar.mo137190a(1, 0);
                                    }
                                } else if (i3 != 0) {
                                    aiVar.mo137190a(0, i4);
                                }
                            }
                        }
                    }
                }

                /* renamed from: a */
                public static Context m148633a(Context context) {
                    Context applicationContext = context.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        return C58003a.f132199a;
                    }
                    return applicationContext;
                }

                /* renamed from: r */
                private boolean m148703r(int i) {
                    if (((this.f193208gV >> i) & 1) == 1) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: c */
                public final float mo137204c(int i) {
                    if (i != 474) {
                        return mo137260n(i);
                    }
                    return this.f192954bN;
                }

                /* renamed from: j */
                public final void mo137248j(int i) {
                    VideoSurface videoSurface = this.f192977bn;
                    if (videoSurface != null) {
                        videoSurface.mo136457b(1, i);
                    }
                }

                /* renamed from: c */
                private void m148682c(EnumC86649v vVar) {
                    boolean z;
                    String d = m148685d(vVar);
                    if (this.f193172fk) {
                        if (vVar == EnumC86649v.Auto) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f193172fk = z;
                        this.f192920ae.mo137617j(d);
                    }
                    this.f192920ae.mo137621k(d);
                }

                /* renamed from: d */
                private String m148685d(EnumC86649v vVar) {
                    if (vVar == null) {
                        return "nil";
                    }
                    AbstractC86517e eVar = this.f192919ad;
                    if (eVar != null) {
                        return eVar.mo137740a(vVar);
                    }
                    return vVar.toString(C86537q.f194867a);
                }

                /* renamed from: i */
                private static boolean m148694i(AbstractC86517e eVar) {
                    if (eVar != null && eVar.mo137743a(AbstractC86517e.EnumC86518a.HLS)) {
                        return eVar.mo137759l();
                    }
                    return false;
                }

                /* renamed from: l */
                private boolean m148696l(boolean z) {
                    AbstractC86468j jVar;
                    if ((this.f193184fw == 1 || z) && (jVar = this.f192920ae) != null) {
                        jVar.mo137591d(86, "localDNS");
                    }
                    int i = this.f193184fw;
                    if (i == 1) {
                        return true;
                    }
                    if (i == 0) {
                        return false;
                    }
                    return z;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
                    if (r5 != 2) goto L_0x000e;
                 */
                /* renamed from: p */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private void m148699p(int r5) {
                    /*
                        r4 = this;
                        com.ss.texturerender.VideoSurface r3 = r4.f192977bn
                        if (r3 != 0) goto L_0x0005
                        return
                    L_0x0005:
                        r2 = 2
                        r1 = 1
                        r0 = 0
                        if (r5 == 0) goto L_0x000e
                        if (r5 == r1) goto L_0x0015
                        if (r5 == r2) goto L_0x000f
                    L_0x000e:
                        r2 = 0
                    L_0x000f:
                        r0 = 26
                        r3.mo136457b(r0, r2)
                        return
                    L_0x0015:
                        r2 = 1
                        goto L_0x000f
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.m148699p(int):void");
                }

                /* renamed from: q */
                private static boolean m148702q(String str) {
                    if (TextUtils.isEmpty(str) || str.indexOf(".mpd") <= 0) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: t */
                private void m148706t(String str) {
                    if (this.f193171fj) {
                        this.f193171fj = false;
                        this.f192920ae.mo137625l(str);
                    }
                    this.f192920ae.mo137629m(str);
                }

                /* renamed from: h */
                public final void mo137241h(String str) {
                    if (this.f193015ch.mo137317a(false)) {
                        this.f193015ch.mo137312a(19, 0, 0, str);
                    } else {
                        mo137245i(str);
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: k */
                public final void mo137252k(int i) {
                    mo137162a(1, (long) i);
                    if (!this.f193032cz) {
                        m148670at();
                        if (this.f192969bf > 0) {
                            C86385d.C86400h.f193679a.mo137385e();
                        }
                    }
                }

                /* renamed from: c */
                private void m148681c(C86633c cVar) {
                    AbstractC86468j jVar = this.f192920ae;
                    if (jVar != null) {
                        C86635e eVar = this.f192970bg;
                        if (eVar != null) {
                            jVar.mo137523J(eVar.f195259a.mo137905c());
                        }
                        this.f192920ae.mo137575b(cVar, this.f193366n);
                    }
                    this.f193372t = false;
                    this.f192914aY = true;
                    if (this.f193015ch.mo137320b()) {
                        this.f193015ch.mo137318b(409, 0, 0, cVar);
                    } else {
                        AbstractC86369ba baVar = this.f192874K;
                        if (baVar != null) {
                            baVar.mo16749a(cVar);
                        }
                    }
                    this.f192904aO = 0;
                    this.f193170fi = 0;
                    this.f193313iW = true;
                }

                /* renamed from: g */
                private boolean m148692g(AbstractC86517e eVar) {
                    if (eVar == null) {
                        return false;
                    }
                    if (eVar.mo137743a(AbstractC86517e.EnumC86518a.DASH)) {
                        return true;
                    }
                    if (eVar.mo137743a(AbstractC86517e.EnumC86518a.MP4)) {
                        if (!this.f192999cL || !m148693h(eVar)) {
                            return false;
                        }
                        return true;
                    } else if (!eVar.mo137743a(AbstractC86517e.EnumC86518a.HLS) || !this.f193000cM || !m148694i(eVar)) {
                        return false;
                    } else {
                        return true;
                    }
                }

                /* renamed from: h */
                private boolean m148693h(AbstractC86517e eVar) {
                    if (eVar == null) {
                        return false;
                    }
                    if ((!eVar.mo137743a(AbstractC86517e.EnumC86518a.DASH) || !m148703r(1)) && (!eVar.mo137743a(AbstractC86517e.EnumC86518a.MP4) || !m148703r(2))) {
                        return false;
                    }
                    return eVar.mo137758k();
                }

                /* renamed from: n */
                private void m148697n(String str) {
                    if (this.f192920ae != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f192949bI = currentTimeMillis;
                        this.f192920ae.mo137607h(this.f193184fw);
                        this.f192920ae.mo137557a(str, currentTimeMillis, C86366b.f193480f);
                        this.f193014cg = this.f192920ae.mo137634o();
                    }
                }

                /* renamed from: p */
                private static boolean m148700p(String str) {
                    if (TextUtils.isEmpty(str)) {
                        C86641i.m150113b("TTVideoEngine", "url null, may not use p2p");
                        return false;
                    } else if (!str.contains("http://127.0.0.1") && !str.contains("mdl://")) {
                        C86641i.m150113b("TTVideoEngine", "url not 127 or mdl protocol, may not use p2p");
                        return false;
                    } else if (!str.contains("cdn_type")) {
                        C86641i.m150113b("TTVideoEngine", "url not contain cdntype, may not use p2p");
                        return false;
                    } else {
                        C86641i.m150113b("TTVideoEngine", "url  may use p2p");
                        return true;
                    }
                }

                /* renamed from: q */
                private static int m148701q(int i) {
                    if (i == 0) {
                        return 2;
                    }
                    if (i == 1) {
                        return 0;
                    }
                    if (i == 2) {
                        return 1;
                    }
                    if (i == 3) {
                        return 3;
                    }
                    if (i == 4) {
                        return 4;
                    }
                    if (i == 5) {
                        return 5;
                    }
                    throw new RuntimeException("unknown internal player type: ".concat(String.valueOf(i)));
                }

                /* renamed from: r */
                private static boolean m148704r(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                    String lowerCase = str.toLowerCase();
                    if (lowerCase.startsWith("mem://bash") || lowerCase.startsWith("mem://hls") || lowerCase.indexOf(".m3u8") > 0 || lowerCase.indexOf(".mpd") > 0) {
                        return true;
                    }
                    return false;
                }

                /* access modifiers changed from: package-private */
                /* renamed from: e */
                public final VideoSurface mo137223e(boolean z) {
                    int i;
                    C86641i.m150110a("TTVideoEngine", "use sr tex = ".concat(String.valueOf(z)));
                    if (this.f193155fT != 0) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    VideoSurface a = this.f193144fH.mo136517a(z, i | 0);
                    if (a != null) {
                        if (z) {
                            m148642a(a);
                        }
                        a.mo136457b(26, this.f193060db);
                    }
                    return a;
                }

                /* renamed from: f */
                public final void mo137231f(String str) {
                    if (this.f193015ch.mo137317a(false)) {
                        this.f193015ch.mo137312a(18, 0, 0, str);
                    } else {
                        mo137235g(str);
                    }
                }

                /* renamed from: i */
                public final void mo137244i(int i) {
                    int i2 = this.f193374v;
                    if (i2 != i) {
                        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("playback state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
                        this.f193374v = i;
                        if (this.f193015ch.mo137320b()) {
                            this.f193015ch.mo137318b(400, this.f193374v, 0, null);
                            return;
                        }
                        AbstractC86369ba baVar = this.f192874K;
                        if (baVar != null) {
                            baVar.mo16747a(this, this.f193374v);
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: f */
                public final void mo137232f(boolean z) {
                    float f;
                    AbstractC86253m mVar = this.f192923ah;
                    if (mVar == null) {
                        return;
                    }
                    if (mVar.mo16707a()) {
                        if (z) {
                            f = 0.0f;
                        } else {
                            f = 1.0f;
                        }
                        try {
                            this.f192923ah.mo16685a(f, f);
                        } catch (Exception unused) {
                        }
                    } else {
                        this.f192923ah.mo16712b(z);
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
                    if (r6 == 0) goto L_0x004b;
                 */
                /* renamed from: h */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo137239h(int r6) {
                    /*
                    // Method dump skipped, instructions count: 128
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137239h(int):void");
                }

                /* access modifiers changed from: package-private */
                /* renamed from: i */
                public final void mo137245i(String str) {
                    if (str != null && !str.equals(this.f193163fb)) {
                        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("set direct url:%s", new Object[]{str}));
                        mo137273y();
                        this.f192864A = 0;
                        this.f192908aS = true;
                        this.f192910aU = true;
                        this.f192909aT = true;
                        this.f192933ar = false;
                        this.f192941az = 0;
                        this.f192932aq = null;
                    }
                    this.f193372t = false;
                    this.f193162fa = true;
                    this.f193163fb = str;
                    this.f193164fc = str;
                    this.f192965ba = 0;
                    this.f192892aC = null;
                    this.f192893aD = null;
                    EnumC86649v vVar = EnumC86649v.Undefine;
                    this.f192927al = vVar;
                    this.f192920ae.mo137577b(m148685d(vVar), "");
                    this.f192920ae.mo137570b(1, "");
                    this.f192920ae.mo137583c(51, this.f193361jt ? 1 : 0);
                }

                /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
                /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                /* renamed from: j */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo137249j(java.lang.String r4) {
                    /*
                    // Method dump skipped, instructions count: 110
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137249j(java.lang.String):void");
                }

                /* renamed from: k */
                public final void mo137253k(String str) {
                    this.f193017ck = str;
                    if (!TextUtils.isEmpty(str) && this.f193021co > 0) {
                        this.f192923ah.mo16687a(618, this.f193020cn);
                        this.f192923ah.mo16688a(617, this.f193017ck);
                        this.f192920ae.mo137584c(83, System.currentTimeMillis());
                    }
                    C86641i.m150113b("TTVideoEngine", "sub option: " + this.f193020cn + "sub thread: " + this.f193021co + " url:" + this.f193017ck);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: n */
                public final float mo137260n(int i) {
                    AbstractC86253m mVar = this.f192923ah;
                    if (i == 70) {
                        if (this.f193311iU <= 0.0f) {
                            this.f193311iU = mVar.mo16708b(151);
                        }
                        return this.f193311iU;
                    } else if (i != 71) {
                        if (i != 474) {
                            return 0.0f;
                        }
                        try {
                            return this.f192954bN;
                        } catch (Throwable unused) {
                            return 0.0f;
                        }
                    } else if (mVar != null) {
                        return mVar.mo16708b(150);
                    } else {
                        return 0.0f;
                    }
                }

                /* renamed from: b */
                private void m148677b(C86633c cVar) {
                    String str = this.f193132ew;
                    if (str != null && "dash".equals(C86640h.m150098c(str, "format_type")) && (-9993 == cVar.f195251a || !mo137265q())) {
                        this.f193132ew = C86640h.m150084a(this.f193132ew, "format_type", "mp4");
                    }
                    if (this.f193132ew == null) {
                        return;
                    }
                    if (-9993 == cVar.f195251a || !mo137265q()) {
                        this.f193132ew = C86640h.m150084a(this.f193132ew, "codec_type", "0");
                    }
                }

                /* renamed from: d */
                private static boolean m148687d(Surface surface) {
                    AbstractC86206n nVar;
                    try {
                        C86205m a = C86205m.m148119a();
                        if (surface == null) {
                            C86203l.m148116a("TextureRenderManager", "invalid parameter");
                            return false;
                        }
                        C86174d dVar = new C86174d();
                        a.f192329b.lock();
                        Iterator<AbstractC86206n> it = a.f192328a.iterator();
                        while (true) {
                            nVar = null;
                            if (it.hasNext()) {
                                nVar = it.next();
                                if (nVar.f192347p == 2) {
                                    if (nVar.f192339h > 0) {
                                        break;
                                    }
                                    C86203l.m148116a("TextureRenderManager", "remove render =" + nVar + " state = " + nVar.f192339h);
                                    nVar.mo136510g();
                                    it.remove();
                                }
                            } else {
                                AbstractC86206n a2 = C86195e.m148100a(dVar, 2);
                                if (a2.f192339h != -1) {
                                    a.f192328a.add(a2);
                                    C86203l.m148116a("TextureRenderManager", "add render = " + a2 + ", effectconfig= " + dVar + ", texType =2,size = " + a.f192328a.size());
                                    nVar = a2;
                                } else {
                                    a.f192330c = a2.f192340i;
                                    a2.mo136510g();
                                }
                            }
                        }
                        a.f192329b.unlock();
                        if (nVar != null) {
                            return nVar.mo136526a(surface);
                        }
                        C86203l.m148116a("TextureRenderManager", "couldn't get a renderer return");
                        return false;
                    } catch (Exception unused) {
                        return false;
                    }
                }

                /* renamed from: f */
                private IABRModule m148691f(AbstractC86517e eVar) {
                    boolean z;
                    float f;
                    float f2;
                    float f3;
                    float f4;
                    DefaultABRModule defaultABRModule = null;
                    if (!(eVar == null || (this.f192961bV == 0 && this.f192962bW == 0))) {
                        if (!m148692g(eVar) && this.f192962bW <= 0) {
                            return null;
                        }
                        if (this.f192961bV == 1 || this.f193244hE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f193244hE = z;
                        C86641i.m150113b("TTVideoEngine", C1764a.m5928a("[ABR] init ABR，algorithm type:%d", new Object[]{Integer.valueOf(f192850ce)}));
                        ABRConfig.setSwitchSensitivity(this.f193247hH);
                        ABRConfig.setStartupBandwidthParameter(this.f193265hZ);
                        ABRConfig.setStallPenaltyParameter(this.f193317ia);
                        ABRConfig.setSwitchPenaltyParameter(this.f193318ib);
                        ABRConfig.setBandwidthParameter(this.f193319ic);
                        defaultABRModule = new DefaultABRModule();
                        defaultABRModule.setInfoListener(new C86320d(this));
                        defaultABRModule.init(new C86332p(this));
                        defaultABRModule.setIntOptionForKey(34, this.f193320id);
                        defaultABRModule.setIntOptionForKey(35, this.f193321ie);
                        defaultABRModule.setIntOptionForKey(6, this.f193322if);
                        defaultABRModule.setIntOptionForKey(7, this.f193323ig);
                        defaultABRModule.setLongOptionForKey(26, this.f193245hF);
                        float f5 = 0.0f;
                        if (C86614c.f195160b != null) {
                            Map<String, String> downloadSpeed = C86614c.f195160b.getDownloadSpeed(C86537q.f194867a);
                            if (!(downloadSpeed == null || downloadSpeed.get("download_speed") == null)) {
                                f5 = Float.parseFloat(downloadSpeed.get("download_speed"));
                            }
                            f3 = C86614c.f195160b.getPredictSpeed(0);
                            f4 = C86614c.f195160b.getLastPredictConfidence();
                            f2 = C86614c.f195160b.getAverageDownloadSpeed(C86537q.f194867a, 1, true);
                            f = C86614c.f195160b.getAverageDownloadSpeed(C86537q.f194867a, this.f193252hM, false);
                        } else {
                            f = 0.0f;
                            f2 = 0.0f;
                            f3 = 0.0f;
                            f4 = 0.0f;
                        }
                        defaultABRModule.setFloatOptionForKey(25, f5);
                        defaultABRModule.setFloatOptionForKey(23, f3);
                        defaultABRModule.setFloatOptionForKey(24, f4);
                        defaultABRModule.setFloatOptionForKey(27, f2);
                        defaultABRModule.setFloatOptionForKey(28, f);
                        defaultABRModule.setIntOptionForKey(21, C86307af.m148603a().f192812a);
                        m148676b(defaultABRModule, eVar);
                    }
                    return defaultABRModule;
                }

                /* renamed from: o */
                private void m148698o(String str) {
                    C86641i.m150110a("TTVideoEngine", C1764a.m5928a("hostnameURL:%s", new Object[]{str}));
                    if (this.f192913aX) {
                        C86641i.m150115c("TTVideoEngine", "_parseDNS should stop");
                        return;
                    }
                    this.f192864A = 2;
                    AbstractC86468j jVar = this.f192920ae;
                    if (jVar != null) {
                        jVar.mo137572b(System.currentTimeMillis(), 0);
                    }
                    try {
                        C86544c cVar = new C86544c(this.f192916aa, new URL(str).getHost(), mo137238h());
                        this.f193135ez = cVar;
                        cVar.f194976d = new C86323g(this);
                        if (this.f192904aO != 0) {
                            this.f193135ez.f194981h = true;
                        }
                        this.f193135ez.f194982i = this.f193180fs;
                        int i = this.f193181ft;
                        if (i > 0) {
                            this.f193135ez.f194984k = i;
                        }
                        boolean z = this.f193215gc;
                        if (z && this.f192919ad != null) {
                            this.f193135ez.f194983j = z;
                            this.f193135ez.mo137811a(this.f192919ad.mo137757j(), Long.valueOf(this.f192919ad.mo137749d(216)));
                        }
                        this.f193135ez.mo137804b();
                    } catch (Exception unused) {
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
                    if (r14 == 0) goto L_0x004c;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
                /* renamed from: g */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo137233g(int r14) {
                    /*
                    // Method dump skipped, instructions count: 166
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137233g(int):void");
                }

                /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: boolean */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: h */
                public final void mo137242h(boolean z) {
                    C86641i.m150110a("TTVideoEngine", C1764a.m5928a("setLooping:%s", new Object[]{Boolean.valueOf(z)}));
                    this.f192867D = z;
                    if (this.f193015ch.mo137317a(false)) {
                        this.f193015ch.mo137310a(6, (int) z);
                    } else {
                        mo137263o();
                    }
                    C86641i.m150110a("TTVideoEngine", C1764a.m5928a("set looping value:%d", new Object[]{Integer.valueOf(z ? 1 : 0)}));
                }

                /* renamed from: i */
                public final void mo137246i(boolean z) {
                    if (z) {
                        this.f193095eK = true;
                        this.f193096eL = SystemClock.currentThreadTimeMillis();
                        return;
                    }
                    this.f193095eK = false;
                    this.f193096eL = 0;
                }

                /* renamed from: j */
                public final void mo137250j(boolean z) {
                    C86641i.m150110a("TTVideoEngine", "seek complete");
                    if (!mo137265q()) {
                        this.f192934as = false;
                        this.f192935at = 0;
                        AbstractC86468j jVar = this.f192920ae;
                        if (jVar != null) {
                            jVar.mo137606h();
                            this.f192920ae.mo137594e();
                        }
                    }
                    if (this.f192936au) {
                        this.f192936au = false;
                        mo137246i(false);
                        AbstractC86468j jVar2 = this.f192920ae;
                        if (jVar2 != null) {
                            jVar2.mo137579b(true);
                        }
                    }
                    if (this.f193015ch.mo137320b()) {
                        this.f193015ch.mo137318b(414, z ? 1 : 0, 0, null);
                    } else {
                        AbstractC86651x xVar = this.f192879P;
                        if (xVar != null) {
                            xVar.mo30452a(z);
                            this.f192879P = null;
                        }
                    }
                    AbstractC86253m mVar = this.f192923ah;
                    if (mVar != null && this.f193066di != 0) {
                        long a = mVar.mo16684a(73, -1L);
                        long a2 = this.f192923ah.mo16684a(72, -1L);
                        if (a >= 0 && a2 >= 0) {
                            a = Math.min(a, a2);
                        } else if (a < 0) {
                            if (a2 >= 0) {
                                a = a2;
                            } else {
                                return;
                            }
                        }
                        mo137162a(5, a);
                    }
                }

                /* renamed from: m */
                public final long mo137257m(int i) {
                    AbstractC86253m mVar = this.f192923ah;
                    if (i != 81) {
                        if (i != 315) {
                            if (i == 461) {
                                return this.f192951bK;
                            }
                            if (i == 614) {
                                long j = this.f192924ai;
                                C86641i.m150110a("TTVideoEngine", "get mPlayStartTime:".concat(String.valueOf(j)));
                                return j;
                            } else if (i != 615) {
                                switch (i) {
                                    case AudiencePingIntervalSetting.DEFAULT:
                                        if (this.f193310iT < 0) {
                                            this.f193310iT = mVar.mo16684a(171, 0L);
                                        }
                                        return this.f193310iT;
                                    case 61:
                                        if (mVar != null) {
                                            return mVar.mo16684a(73, 0L);
                                        }
                                        return -1;
                                    case 62:
                                        if (mVar != null) {
                                            return mVar.mo16684a(72, 0L);
                                        }
                                        return -1;
                                    case 63:
                                        if (mVar != null) {
                                            return mVar.mo16684a(63, -1L);
                                        }
                                        return -1;
                                    case 64:
                                        if (mVar == null) {
                                            return -1;
                                        }
                                        try {
                                            return mVar.mo16684a(468, -1L);
                                        } catch (Throwable unused) {
                                            return -1;
                                        }
                                    default:
                                        return -1;
                                }
                            } else {
                                long j2 = this.f192925aj;
                                C86641i.m150110a("TTVideoEngine", "get mRenderStartTime:".concat(String.valueOf(j2)));
                                return j2;
                            }
                        } else if (mVar != null) {
                            return mVar.mo16684a(46, 0L);
                        } else {
                            return -1;
                        }
                    } else if (mVar == null) {
                        return -1;
                    } else {
                        long a = mVar.mo16684a(240, 0L);
                        C86641i.m150110a("TTVideoEngine", "get value of KeyIsLastBufferSizeU64: ".concat(String.valueOf(a)));
                        return a;
                    }
                }

                /* renamed from: e */
                private void m148690e(Surface surface) {
                    AbstractC86253m mVar = this.f193279hn;
                    if (mVar == null) {
                        mVar = this.f192923ah;
                    }
                    C86641i.m150110a("TTVideoEngine", "setSurfaceHook, player:" + mVar + ", surface:" + surface + ", texturesurface:" + this.f192977bn + ", this:" + this);
                    if (mVar == null) {
                        return;
                    }
                    if (this.f192978bo == 1 && this.f192918ac == null && !this.f192980bq) {
                        mo137195b(surface, 1);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("set surface to player = ");
                    Surface surface2 = this.f192977bn;
                    if (surface2 == null) {
                        surface2 = surface;
                    }
                    C86641i.m150110a("TTVideoEngine", sb.append(surface2).toString());
                    Surface surface3 = this.f192977bn;
                    if (surface3 == null) {
                        surface3 = surface;
                    }
                    mo137195b(surface3, 0);
                    VideoSurface videoSurface = this.f192977bn;
                    if (videoSurface != null && this.f193144fH != null) {
                        videoSurface.mo136453a(surface);
                    }
                }

                /* JADX INFO: finally extract failed */
                /* renamed from: k */
                private void m148695k(boolean z) {
                    C86573a aVar;
                    AbstractC86253m mVar;
                    String str;
                    C86318b bVar;
                    C86641i.m150110a("TTVideoEngine", "_play, mState:" + this.f192864A + ", byPlay:" + z + ", this:" + this);
                    this.f193372t = true;
                    this.f193371s = false;
                    if (z && !this.f193126eq) {
                        C86385d dVar = C86385d.C86400h.f193679a;
                        C86312ah ahVar = new C86312ah(this, C86614c.f195159a, C86614c.f195160b);
                        dVar.f193586r.lock();
                        try {
                            dVar.f193571c = ahVar;
                            dVar.f193586r.unlock();
                            this.f193126eq = true;
                            this.f192920ae.mo137583c(17, f192846ca);
                            this.f192920ae.mo137583c(18, f192847cb);
                            this.f192920ae.mo137583c(19, f192848cc);
                            this.f192920ae.mo137526M(f192849cd);
                        } catch (Throwable th) {
                            dVar.f193586r.unlock();
                            throw th;
                        }
                    }
                    m148661ak();
                    AbstractC86468j jVar = this.f192920ae;
                    if (jVar != null) {
                        if (z) {
                            jVar.mo137530Q(64);
                            if (this.f192924ai < 0) {
                                this.f192924ai = SystemClock.elapsedRealtime();
                                C86641i.m150110a("TTVideoEngine", "mPlayStartTime:" + this.f192924ai + ", curT:" + System.currentTimeMillis());
                            }
                        } else if (this.f193299iI != 0) {
                            jVar.mo137583c(31, 1);
                        }
                        this.f192920ae.mo137598f();
                    }
                    int i = this.f192864A;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 3) {
                                int i2 = this.f193374v;
                                if (((i2 != 0 && i2 != 3) || this.f193370r) && ((mVar = this.f192923ah) == null || mVar.mo16709b() != 0 || this.f193370r)) {
                                    C86641i.m150113b("TTVideoEngine", "_replayOrResume state:" + this.f193374v + ", playtime:" + this.f192949bI);
                                    if (this.f192971bh || (this.f193374v == 0 && this.f192949bI == 0)) {
                                        m148697n(this.f192865B);
                                        C86635e eVar = this.f192970bg;
                                        if (eVar != null) {
                                            eVar.mo137910c();
                                        }
                                    }
                                    m148662al();
                                    return;
                                } else if (this.f192896aG || this.f193162fa || this.f193177fp != null || this.f192967bc != null) {
                                    m148697n(this.f192865B);
                                    if (this.f192896aG) {
                                        str = this.f193110eZ;
                                    } else {
                                        str = this.f193163fb;
                                    }
                                    m148679b(str, this.f192869F);
                                    return;
                                } else if (this.f192900aK) {
                                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                                    if (this.f192901aL.f195062f > 0 && currentTimeMillis - this.f192901aL.f195062f > ((long) f192844cG)) {
                                        m148656af();
                                    }
                                    m148697n(this.f192901aL.f195057a);
                                    m148679b(this.f192901aL.f195058b, this.f192869F);
                                    return;
                                } else if (this.f192902aM) {
                                    m148697n(this.f192865B);
                                    m148679b(this.f192903aN.f193444a, this.f192869F);
                                    return;
                                } else {
                                    m148697n(this.f192865B);
                                    Map<String, C86318b> map = this.f192930ao;
                                    if (!(map == null || (bVar = map.get(this.f192952bL.f193414a)) == null)) {
                                        bVar.f193385b = "FromCache";
                                        this.f192930ao.put(this.f192952bL.f193414a, bVar);
                                        m148664an();
                                    }
                                    mo137185a(this.f192952bL.mo137302a(), this.f192869F);
                                    return;
                                }
                            } else if (i != 4) {
                                return;
                            }
                        } else if (this.f192919ad != null) {
                            if (!this.f192900aK || (aVar = this.f192901aL) == null) {
                                m148697n(this.f192865B);
                            } else {
                                m148697n(aVar.f195057a);
                            }
                            mo137210c(this.f192919ad);
                            return;
                        } else if (!this.f192968be) {
                            m148655ae();
                            return;
                        } else {
                            return;
                        }
                    }
                    m148655ae();
                }

                /* renamed from: s */
                private void m148705s(String str) {
                    String str2;
                    C86534o oVar;
                    if (TextUtils.isEmpty(str)) {
                        C86641i.m150113b("TTVideoEngine", "log first url . url is null");
                        return;
                    }
                    if (this.f192908aS) {
                        int i = 0;
                        this.f192908aS = false;
                        String str3 = "";
                        if (str.startsWith("mem://bash") && (oVar = this.f192929an) != null) {
                            if (oVar.mo137723a() == C86537q.f194867a) {
                                str2 = this.f193092eH.get(this.f192927al);
                                if (str2 == null || str2.isEmpty()) {
                                    str2 = str;
                                }
                                for (Map.Entry<Integer, String> entry : this.f193093eI.entrySet()) {
                                    if (i == 0) {
                                        i = entry.getKey().intValue();
                                    } else if (i > entry.getKey().intValue()) {
                                        i = entry.getKey().intValue();
                                    }
                                }
                                if (i > 0) {
                                    str3 = this.f193093eI.get(Integer.valueOf(i));
                                }
                                this.f192920ae.mo137559a(str2, str3);
                            } else if (this.f192929an.mo137723a() == C86537q.f194868b) {
                                str3 = this.f193093eI.get(Integer.valueOf(this.f192929an.mo137724a(3)));
                            }
                        }
                        str2 = str;
                        this.f192920ae.mo137559a(str2, str3);
                    }
                    String[] strArr = null;
                    C86534o oVar2 = this.f192929an;
                    if (oVar2 != null) {
                        strArr = oVar2.mo137727b();
                    } else {
                        AbstractC86517e eVar = this.f192919ad;
                        if (eVar != null) {
                            strArr = eVar.mo137746b(this.f192927al, this.f193160fY);
                        }
                    }
                    if (strArr == null || strArr.length <= 0) {
                        this.f192920ae.mo137597e(str);
                        C86641i.m150110a("TTVideoEngine", "set curUrl:".concat(String.valueOf(str)));
                        return;
                    }
                    int intValue = this.f193091eG.get(this.f192927al).intValue();
                    if (intValue < strArr.length) {
                        this.f192920ae.mo137597e(strArr[intValue]);
                        C86641i.m150110a("TTVideoEngine", "find curUrl:" + strArr[intValue]);
                        return;
                    }
                    this.f192920ae.mo137597e(str);
                    C86641i.m150110a("TTVideoEngine", "set curUrl:".concat(String.valueOf(str)));
                }

                /* renamed from: f */
                public final void mo137229f(int i) {
                    int i2;
                    C86641i.m150110a("TTVideoEngine", "buffering start,this:" + this + ", code:" + i);
                    C86635e eVar = this.f192970bg;
                    if (eVar != null) {
                        eVar.mo137909b();
                    }
                    boolean z = this.f192981br;
                    if (this.f192934as) {
                        if (!this.f193095eK || this.f192935at > this.f193096eL) {
                            i2 = 1;
                        }
                        i2 = 2;
                    } else {
                        if (!this.f193095eK) {
                            i2 = 0;
                        }
                        i2 = 2;
                    }
                    if (this.f193043dK == 1 && !this.f192937av) {
                        this.f192920ae.mo137657u();
                    }
                    if (this.f192937av && !this.f192934as && this.f193375w != 3 && i == 0) {
                        this.f192920ae.mo137614j();
                    }
                    if (this.f193015ch.mo137320b()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("bufferStartAction", Integer.valueOf(i2));
                        hashMap.put("traceid", this.f193014cg);
                        this.f193015ch.mo137318b(415, i, z ? 1 : 0, hashMap);
                    } else {
                        AbstractC86355au auVar = this.f192883T;
                        if (auVar != null) {
                            auVar.mo101148a(i);
                        }
                    }
                    mo137234g(2, i);
                    mo137248j(4);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: g */
                public final void mo137235g(String str) {
                    if (str != null && !str.equals(this.f193110eZ)) {
                        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("set local url:%s", new Object[]{str}));
                        mo137273y();
                        this.f192864A = 0;
                        this.f192933ar = false;
                        this.f192941az = 0;
                        this.f192908aS = true;
                        this.f192932aq = null;
                    }
                    this.f193372t = false;
                    this.f192896aG = true;
                    this.f193110eZ = str;
                    this.f192965ba = 0;
                    this.f192920ae.mo137570b(0, "");
                    this.f192892aC = null;
                    this.f192893aD = null;
                    EnumC86649v vVar = EnumC86649v.Undefine;
                    this.f192927al = vVar;
                    this.f192920ae.mo137577b(m148685d(vVar), "");
                }

                /* access modifiers changed from: package-private */
                /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
                /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x00f2  */
                /* renamed from: l */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo137256l(java.lang.String r17) {
                    /*
                    // Method dump skipped, instructions count: 300
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.mo137256l(java.lang.String):void");
                }

                /* access modifiers changed from: package-private */
                /* renamed from: m */
                public final void mo137259m(String str) {
                    StringBuilder append = new StringBuilder().append(this).append(" -> ").append(str).append(" dumpSurface: mSurface = ").append(this.f192917ab);
                    if (this.f192917ab != null) {
                        append.append(" isValid = ").append(this.f192917ab.isValid());
                    }
                    append.append(", mSurfaceHolder = ").append(this.f192918ac);
                    SurfaceHolder surfaceHolder = this.f192918ac;
                    if (surfaceHolder != null) {
                        Surface surface = surfaceHolder.getSurface();
                        append.append(" surface = ").append(surface);
                        if (surface != null) {
                            append.append(" isValid = ").append(surface.isValid());
                        }
                    }
                    append.append(", mTextureSurface = ").append(this.f192977bn);
                    if (this.f192977bn != null) {
                        append.append(" isValid = ").append(this.f192977bn.isValid());
                    }
                    C86641i.m150113b("TTVideoEngine", append.toString());
                }

                /* renamed from: o */
                public final String mo137262o(int i) {
                    AbstractC86253m mVar = this.f192923ah;
                    String str = "";
                    if (i != 80) {
                        if (i != 82) {
                            if (i == 462) {
                                Map<String, C86318b> map = this.f192930ao;
                                if (map == null) {
                                    return str;
                                }
                                for (Map.Entry<String, C86318b> entry : map.entrySet()) {
                                    String key = entry.getKey();
                                    C86318b value = entry.getValue();
                                    if (!(key == null || value == null)) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("ip", value.f193384a);
                                        hashMap.put("dns", value.f193385b);
                                        hashMap.put("dns_cache_open", Integer.valueOf(value.f193386c));
                                        hashMap.put("server_dns_open", Integer.valueOf(value.f193387d));
                                        hashMap.put("url_desc", value.f193388e);
                                        str = hashMap.toString();
                                    }
                                }
                                return str;
                            } else if (i == 477) {
                                AbstractC86468j jVar = this.f192920ae;
                                if (jVar != null) {
                                    return jVar.mo137654t();
                                }
                                return str;
                            } else if (i != 957 || mVar == null) {
                                return str;
                            } else {
                                try {
                                    return mVar.mo16713c(1002);
                                } catch (Throwable unused) {
                                    return str;
                                }
                            }
                        } else if (f192839bB) {
                            return C86572m.m149841t();
                        } else {
                            return C86277r.m148504a(14, str);
                        }
                    } else if (mVar != null) {
                        return mVar.mo16713c(142);
                    } else {
                        return str;
                    }
                }

                /* renamed from: b */
                private void m148678b(EnumC86649v vVar) {
                    int i;
                    if (this.f192963bX == 0) {
                        if (vVar == EnumC86649v.Auto) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        mo137230f(494, i);
                    }
                    if (vVar != EnumC86649v.Auto) {
                        int i2 = this.f192864A;
                        if (i2 == 0 || i2 == 1 || this.f192971bh) {
                            this.f193087eC = vVar;
                            this.f192927al = vVar;
                            this.f193160fY = null;
                            if (TextUtils.isEmpty(this.f193163fb) && TextUtils.isEmpty(this.f193110eZ)) {
                                this.f192920ae.mo137577b(m148685d(vVar), m148685d(vVar));
                            }
                        } else if (i2 != 3) {
                        } else {
                            if (this.f193015ch.mo137317a(false)) {
                                this.f193015ch.mo137313a(8, 0, 0, vVar, null);
                            } else {
                                mo137179a(vVar, (Map<Integer, String>) null);
                            }
                        }
                    }
                }

                /* renamed from: e */
                public final void mo137224e(int i) {
                    EnumC86649v vVar = EnumC86649v.Undefine;
                    AbstractC86517e eVar = this.f192919ad;
                    if (eVar != null && eVar.mo137742a()) {
                        EnumC86649v[] allResolutions = EnumC86649v.getAllResolutions();
                        int i2 = 0;
                        while (true) {
                            if (i2 < allResolutions.length) {
                                C86534o a = this.f192919ad.mo137736a(allResolutions[i2], C86537q.f194867a, (Map<Integer, String>) null);
                                if (a != null && a.mo137724a(3) == i) {
                                    vVar = allResolutions[i2];
                                    this.f193087eC = this.f192927al;
                                    this.f192926ak = (long) i;
                                    this.f192927al = vVar;
                                    this.f192942bA = a.mo137726b(32);
                                    m148682c(this.f192927al);
                                    this.f192920ae.mo137577b(m148685d(this.f192927al), m148685d(this.f193087eC));
                                    this.f192920ae.mo137653s(this.f192942bA);
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                    }
                    C86641i.m150110a("TTVideoEngine", C1764a.m5928a("video bitrate changed:%d, resoluton:%s", new Object[]{Integer.valueOf(i), vVar.toString(C86537q.f194867a)}));
                    if (this.f193374v != 2 || !this.f192936au) {
                        if (this.f193095eK) {
                            this.f192920ae.mo137579b(false);
                        }
                        mo137246i(false);
                    } else {
                        this.f192936au = false;
                        mo137246i(false);
                        AbstractC86468j jVar = this.f192920ae;
                        if (jVar != null) {
                            jVar.mo137579b(true);
                        }
                    }
                    if (this.f193015ch.mo137320b()) {
                        this.f193015ch.mo137318b(417, i, 0, vVar);
                    } else {
                        AbstractC86652y yVar = this.f192881R;
                        if (yVar != null) {
                            yVar.mo101147a(vVar, i);
                        }
                    }
                    if (this.f192961bV == 1) {
                        this.f192920ae.mo137620k((long) i);
                    }
                }

                /* renamed from: g */
                public final void mo137236g(boolean z) {
                    C86641i.m150110a("TTVideoEngine", C1764a.m5928a("setIsMute:%s", new Object[]{Boolean.valueOf(z)}));
                    this.f192895aF = z;
                    if (this.f193015ch.mo137317a(false)) {
                        this.f193015ch.mo137310a(10, z ? 1 : 0);
                    } else {
                        mo137232f(z);
                    }
                }

                /* renamed from: l */
                public final int mo137254l(int i) {
                    long j;
                    int i2;
                    int i3;
                    int i4;
                    AbstractC86253m mVar = this.f192923ah;
                    if (i != 0) {
                        if (i != 4) {
                            if (i == 83) {
                                C86635e eVar = this.f192970bg;
                                if (eVar != null) {
                                    i2 = eVar.f195260b.mo137905c();
                                }
                            } else if (i == 84) {
                                C86635e eVar2 = this.f192970bg;
                                if (eVar2 != null) {
                                    Context context = this.f192916aa;
                                    if (context == null || context.getPackageManager().checkPermission("android.permission.BLUETOOTH", context.getPackageName()) != 0) {
                                        j = 0;
                                        return (int) j;
                                    }
                                    i2 = eVar2.f195261c.mo137905c();
                                }
                            } else if (i == 301) {
                                return this.f193066di;
                            } else {
                                if (i == 302) {
                                    return this.f193067dj;
                                }
                                if (i == 424) {
                                    return this.f193223gk;
                                }
                                if (i == 425) {
                                    return this.f193224gl;
                                }
                                if (i != 700) {
                                    if (i != 701) {
                                        switch (i) {
                                            case 4:
                                                break;
                                            case 26:
                                                return this.f193101eQ;
                                            case 29:
                                            case 494:
                                                return this.f192961bV;
                                            case 33:
                                                return this.f192999cL ? 1 : 0;
                                            case 160:
                                                return this.f192969bf;
                                            case 313:
                                                return this.f193220gh ? 1 : 0;
                                            case 343:
                                                if (mVar != null) {
                                                    return mVar.mo16710b(643, 0);
                                                }
                                                break;
                                            case 371:
                                                if (mVar != null) {
                                                    return mVar.mo16710b(540, -1);
                                                }
                                                break;
                                            case 416:
                                                return this.f193230gr;
                                            case 480:
                                                return this.f192944bD;
                                            case 499:
                                                return this.f193019cm;
                                            case 525:
                                                return this.f193264hY;
                                            case 530:
                                                return this.f193228gp;
                                            case 533:
                                                return this.f193020cn;
                                            case 650:
                                                return this.f193155fT;
                                            case 655:
                                                if (mVar != null) {
                                                    return mVar.mo16710b(541, 0);
                                                }
                                                break;
                                            case 660:
                                                i3 = this.f193316iZ;
                                                if (i3 >= 0) {
                                                    VideoSurface videoSurface = this.f192977bn;
                                                    if (videoSurface == null) {
                                                        if (this.f193372t) {
                                                            return -7893;
                                                        }
                                                        return -7897;
                                                    } else if (videoSurface.mo136459c(10, -1) != 1) {
                                                        C86205m mVar2 = this.f193144fH;
                                                        if (mVar2 == null || !mVar2.mo136520c()) {
                                                            return -7889;
                                                        }
                                                        return -7894;
                                                    } else if (this.f192977bn.mo136459c(6, -1) == 1) {
                                                        return 0;
                                                    } else {
                                                        return -7899;
                                                    }
                                                }
                                                break;
                                            case 667:
                                                AbstractC86517e eVar3 = this.f192919ad;
                                                if (eVar3 == null) {
                                                    return 0;
                                                }
                                                C86534o a = eVar3.mo137736a(this.f192927al, 0, (Map<Integer, String>) null);
                                                if (a == null) {
                                                    return 0;
                                                }
                                                return a.mo137724a(41);
                                            default:
                                                switch (i) {
                                                    case 40:
                                                        AbstractC86468j jVar = this.f192920ae;
                                                        if (jVar != null) {
                                                            return jVar.mo137646r();
                                                        }
                                                        break;
                                                    case 41:
                                                        AbstractC86468j jVar2 = this.f192920ae;
                                                        if (jVar2 != null) {
                                                            j = jVar2.mo137650s();
                                                            return (int) j;
                                                        }
                                                        break;
                                                    case 42:
                                                        if (mVar != null) {
                                                            return mVar.mo16710b(153, -1);
                                                        }
                                                        break;
                                                    case 43:
                                                        if (this.f193024cr < 0 && mVar != null) {
                                                            this.f193024cr = mVar.mo16710b(157, -1);
                                                        }
                                                        return this.f193024cr;
                                                    case BuildConfig.VERSION_CODE:
                                                        if (this.f193025cs < 0 && mVar != null) {
                                                            this.f193025cs = mVar.mo16710b(158, -1);
                                                        }
                                                        return this.f193025cs;
                                                    case 45:
                                                        if (this.f193026ct < 0 && mVar != null) {
                                                            this.f193026ct = mVar.mo16710b(141, -1);
                                                        }
                                                        return this.f193026ct;
                                                    case 46:
                                                        if (this.f193309iS < 0 && mVar != null) {
                                                            this.f193309iS = mVar.mo16710b(140, -1);
                                                        }
                                                        return this.f193309iS;
                                                    case 47:
                                                        return this.f192866C;
                                                    case 48:
                                                        Context context2 = this.f192916aa;
                                                        if (context2 != null) {
                                                            AudioManager audioManager = (AudioManager) m148636a(context2, DataType.AUDIO);
                                                            if (audioManager == null) {
                                                                return 0;
                                                            }
                                                            i4 = audioManager.getStreamMaxVolume(3);
                                                            if (i4 < 0) {
                                                                return 0;
                                                            }
                                                            return i4;
                                                        }
                                                        break;
                                                    case 49:
                                                        Context context3 = this.f192916aa;
                                                        if (context3 != null) {
                                                            AudioManager audioManager2 = (AudioManager) m148636a(context3, DataType.AUDIO);
                                                            if (audioManager2 == null) {
                                                                return 0;
                                                            }
                                                            i4 = audioManager2.getStreamVolume(3);
                                                            if (i4 < 0) {
                                                                return 0;
                                                            }
                                                            return i4;
                                                        }
                                                        break;
                                                    case 50:
                                                        return this.f193376x;
                                                    case 51:
                                                        return this.f193377y;
                                                    case 52:
                                                        if (this.f192936au) {
                                                            return this.f192941az;
                                                        }
                                                        return m148663am();
                                                    case 53:
                                                        C86635e eVar4 = this.f192970bg;
                                                        if (eVar4 != null) {
                                                            return eVar4.f195259a.mo137905c();
                                                        }
                                                        break;
                                                    case 54:
                                                        return this.f192966bb;
                                                    case 55:
                                                        return this.f193374v;
                                                    case 56:
                                                        return this.f193375w;
                                                    case 57:
                                                        return this.f192864A;
                                                    case 58:
                                                        try {
                                                            if (this.f193028cv == -1 && mVar != null) {
                                                                this.f193028cv = mVar.mo16710b(403, -1);
                                                            }
                                                            return this.f193028cv;
                                                        } catch (Throwable unused) {
                                                            break;
                                                        }
                                                    case 59:
                                                        if (this.f193027cu == -1 && mVar != null) {
                                                            this.f193027cu = mVar.mo16710b(402, -1);
                                                        }
                                                        return this.f193027cu;
                                                }
                                        }
                                    } else if (mVar != null) {
                                        i3 = mVar.mo16710b(569, -1);
                                    }
                                    return i3;
                                } else if (mVar != null) {
                                    return mVar.mo16710b(961, -1);
                                }
                            }
                            j = (long) i2;
                            return (int) j;
                        }
                        return this.f193060db;
                    } else if (mVar != null) {
                        return mVar.mo16710b(24, -1);
                    }
                    return -1;
                }

                /* renamed from: d */
                public final void mo137219d(String str) {
                    if (this.f193015ch.mo137317a(false)) {
                        this.f193015ch.mo137312a(14, 0, 0, str);
                    } else {
                        mo137227e(str);
                    }
                }

                /* renamed from: b */
                public static void m148674b(int i, long j) {
                    C86385d.C86400h.f193679a.mo137361a(i, j);
                }

                /* renamed from: b */
                public static void m148675b(int i, String str) {
                    C86617e.C86621c.f195187a.mo137876a(i, str);
                }

                /* renamed from: f */
                public final void mo137230f(int i, int i2) {
                    if (this.f193015ch.mo137317a(false)) {
                        this.f193015ch.mo137311a(101, i, i2);
                    } else {
                        mo137240h(i, i2);
                    }
                }

                /* renamed from: a */
                public static long m148632a(AbstractC86517e eVar, EnumC86649v vVar) {
                    long j = 0;
                    if (eVar == null || vVar == null) {
                        return 0;
                    }
                    C86534o a = eVar.mo137737a(vVar, C86537q.f194867a, null, false);
                    if (a != null) {
                        j = 0 + C86385d.C86400h.f193679a.mo137393i(a.mo137726b(15));
                    }
                    C86534o a2 = eVar.mo137737a(vVar, C86537q.f194868b, null, true);
                    if (a2 != null) {
                        return j + C86385d.C86400h.f193679a.mo137393i(a2.mo137726b(15));
                    }
                    return j;
                }

                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public final void mo137191b(float f, float f2) {
                    if (this.f192923ah != null) {
                        if (this.f193035dC == 0 && !mo137265q()) {
                            float f3 = 1.0f;
                            if (f != 0.0f) {
                                f2 = 1.0f;
                            } else {
                                f3 = f;
                            }
                            AudioManager audioManager = (AudioManager) m148636a(this.f192916aa, DataType.AUDIO);
                            if (audioManager != null) {
                                audioManager.setStreamVolume(3, (int) f, 0);
                            }
                            f = f3;
                        }
                        this.f192923ah.mo16685a(f, f2);
                    }
                }

                /* renamed from: d */
                public final void mo137215d(int i, int i2) {
                    C86641i.m150110a("TTVideoEngine", "setBufferThresholdControl= " + i + ", " + i2);
                    if (i > 0 && i2 > 0) {
                        if (C86385d.C86400h.f193679a.mo137381d(12) == 200) {
                            i = 0;
                            i2 = 0;
                        }
                        this.f193301iK = i;
                        this.f193302iL = i2;
                    }
                }

                /* renamed from: b */
                private int m148673b(C86633c cVar, boolean z) {
                    switch (cVar.f195251a) {
                        case -1094995529:
                        case -499985:
                        case -499978:
                        case -499977:
                            if (this.f193282hr > 0) {
                                for (String str : this.f193018cl) {
                                    C86641i.m150110a("TTVideoEngine", C1764a.m5928a("clear mdl cache by filekey: %s", new Object[]{str}));
                                    C86385d.C86400h.f193679a.mo137391h(str);
                                }
                            }
                            return 11;
                        case -499972:
                        case -499970:
                            return m148631a(cVar, z);
                        default:
                            return 11;
                    }
                }

                /* renamed from: e */
                public static void m148689e(int i, int i2) {
                    C86641i.m150110a("TTVideoEngine", "TTVideoEngine.setIntValue key=" + i + " value=" + i2);
                    if (i == 672) {
                        C86641i.m150110a("TTVideoEngine", "do set static render type, value = ".concat(String.valueOf(i2)));
                        f192854dd = i2;
                    } else if (i == 674) {
                        C86641i.m150110a("TTVideoEngine", "enable https for fetch");
                        C86643k.f195277a = i2;
                    } else if (i == 112) {
                        if (i2 > 0) {
                            f192851cf = 2;
                            C86385d.m148969a(C86385d.C86400h.f193679a, 112, i2);
                            return;
                        }
                        f192851cf = 1;
                        C86385d.m148969a(C86385d.C86400h.f193679a, 112, 0);
                    } else if (i == 676) {
                        C86614c.m150011a(i2);
                    } else if (i == 702) {
                        f192855eg = i2;
                    } else {
                        C86385d.m148969a(C86385d.C86400h.f193679a, i, i2);
                        C86622f.m150026a(i, i2);
                    }
                }

                /* renamed from: c */
                public final void mo137206c(int i, int i2) {
                    C86641i.m150110a("TTVideoEngine", "set auto range read = " + i + ", " + i2);
                    this.f193299iI = i;
                    this.f193300iJ = i2;
                }

                /* access modifiers changed from: package-private */
                /* renamed from: d */
                public final void mo137216d(int i, long j) {
                    if (i == 217) {
                        this.f193140fD = j;
                        C86385d.C86400h.f193679a.mo137361a(62, j);
                    } else if (i == 440 && j > 0) {
                        NativeAudioProcessor nativeAudioProcessor = new NativeAudioProcessor();
                        this.f193141fE = nativeAudioProcessor;
                        nativeAudioProcessor.setNativeWrapper(j);
                        AbstractC86253m mVar = this.f192923ah;
                        if (mVar != null) {
                            ((C86572m) mVar).mo137826a(this.f193141fE);
                        }
                    }
                    C86641i.m150110a("TTVideoEngine", "set long option key:" + i + ",value:" + j);
                }

                /* renamed from: g */
                public final void mo137234g(int i, int i2) {
                    int i3 = this.f193375w;
                    if (i3 != i) {
                        C86641i.m150110a("TTVideoEngine", C1764a.m5928a("load state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}));
                        if (i == 2 && this.f192937av && !this.f192934as && this.f193375w != 3) {
                            int am = m148663am();
                            this.f192966bb = i2;
                            int i4 = -1;
                            AbstractC86468j jVar = this.f192920ae;
                            if (jVar != null) {
                                jVar.mo137568b(i2, am);
                                i4 = this.f192920ae.mo137610i();
                            }
                            if (i2 == 0) {
                                mo137162a(3, (long) i4);
                            }
                            this.f192965ba = SystemClock.elapsedRealtime();
                        }
                        this.f193375w = i;
                        if (this.f193015ch.mo137320b()) {
                            this.f193015ch.mo137318b(401, this.f193375w, this.f192911aV ? 1 : 0, null);
                            return;
                        }
                        AbstractC86369ba baVar = this.f192874K;
                        if (baVar == null) {
                            return;
                        }
                        if (this.f192911aV || i != 3) {
                            baVar.mo16751b(this, this.f193375w);
                        }
                    }
                }

                /* renamed from: a */
                private int m148631a(C86633c cVar, boolean z) {
                    AbstractC86517e eVar;
                    List<C86534o> b;
                    if (!this.f193221gi) {
                        m148681c(cVar);
                        return 10;
                    }
                    this.f192920ae.mo137623l(cVar.f195251a);
                    f192861j = new int[]{this.f193223gk, this.f193224gl};
                    AbstractC86517e eVar2 = this.f192919ad;
                    if (eVar2 != null && eVar2.mo137742a() && (b = eVar2.mo137745b()) != null && b.size() > 0) {
                        for (C86534o oVar : b) {
                            C86385d.C86400h.f193679a.mo137391h(oVar.mo137726b(15));
                        }
                    }
                    C86385d.C86400h.f193679a.mo137389g();
                    C86385d.m148969a(C86385d.C86400h.f193679a, 90, this.f193223gk);
                    C86385d.m148969a(C86385d.C86400h.f193679a, 91, this.f193224gl);
                    if (this.f193222gj != 0 || z || (eVar = this.f192919ad) == null || !eVar.mo137748c(106)) {
                        this.f193222gj = 0;
                        m148681c(cVar);
                        return 10;
                    }
                    this.f193222gj++;
                    this.f193219gg = true;
                    return 2;
                }

                /* renamed from: e */
                private C86529j m148688e(String str, HashMap hashMap) {
                    int indexOf;
                    int i;
                    String str2;
                    C86529j jVar = new C86529j(str, hashMap);
                    if (this.f193066di != 0 && !TextUtils.isEmpty(str) && !str.startsWith("http://127.0.0.1") && !str.startsWith("mem://bash") && !TextUtils.isEmpty(str) && (indexOf = str.indexOf("cdn_type=")) != -1 && (i = indexOf + 9) < str.length()) {
                        char charAt = str.charAt(i);
                        if (Character.isDigit(charAt) && Character.getNumericValue(charAt) == 1) {
                            if (hashMap != null && hashMap.containsKey("Host")) {
                                String obj = hashMap.get("Host").toString();
                                try {
                                    str2 = new URI(str).getHost();
                                } catch (URISyntaxException unused) {
                                    str2 = "";
                                }
                                if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(str2)) {
                                    str = str.replaceFirst(str2, obj.trim());
                                    if (!TextUtils.isEmpty(str2)) {
                                        str = C86640h.m150091b(str, "xycip=".concat(String.valueOf(str2)));
                                    }
                                }
                            }
                            if (this.f193067dj == 1) {
                                str = C86640h.m150091b(str, "xyp2p=0");
                            }
                            C86640h.m150091b(str, "xynp=1&xyer=1");
                            if (!TextUtils.isEmpty(null)) {
                                throw new NullPointerException("startsWith");
                            }
                            return jVar;
                        }
                    }
                    return jVar;
                }

                /* renamed from: c */
                public final void mo137207c(int i, long j) {
                    if (this.f193015ch.mo137317a(false)) {
                        this.f193015ch.mo137312a(102, i, 0, Long.valueOf(j));
                    } else {
                        mo137216d(i, j);
                    }
                }

                /* renamed from: b */
                private void m148676b(IABRModule iABRModule, AbstractC86517e eVar) {
                    HashMap hashMap;
                    HashMap hashMap2;
                    List<C86534o> b = eVar.mo137745b();
                    if (!(b == null || b.size() == 0)) {
                        List<IVideoStream> arrayList = new ArrayList<>();
                        List<IAudioStream> arrayList2 = new ArrayList<>();
                        for (C86534o oVar : b) {
                            if (oVar != null) {
                                int i = -1;
                                if (oVar.mo137723a() == C86537q.f194867a) {
                                    ABRVideoStream aBRVideoStream = new ABRVideoStream();
                                    String b2 = oVar.mo137726b(15);
                                    aBRVideoStream.setStreamId(b2);
                                    aBRVideoStream.setBandWidth(oVar.mo137724a(3));
                                    aBRVideoStream.setCodec(oVar.mo137726b(8));
                                    int a = oVar.mo137724a(1);
                                    int a2 = oVar.mo137724a(2);
                                    aBRVideoStream.setWidth(a);
                                    aBRVideoStream.setHeight(a2);
                                    aBRVideoStream.setFrameRate(-1);
                                    aBRVideoStream.setSegmentDuration(5000);
                                    if (!TextUtils.isEmpty(b2)) {
                                        arrayList.add(aBRVideoStream);
                                    }
                                    aBRVideoStream.setSupportSR(0);
                                    Integer num = this.f192988by.f195210a.f195230i;
                                    Integer num2 = this.f192988by.f195210a.f195231j;
                                    if (num != null && num2 != null && a <= num.intValue() && a2 <= num2.intValue()) {
                                        aBRVideoStream.setSupportSR(1);
                                    }
                                    EnumC86649v c = oVar.mo137729c();
                                    if (c != null) {
                                        i = c.getIndex();
                                    }
                                    String b3 = oVar.mo137726b(32);
                                    if (b3 != null) {
                                        try {
                                            i = Integer.parseInt(b3);
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                    aBRVideoStream.setResolution(i);
                                } else {
                                    ABRAudioStream aBRAudioStream = new ABRAudioStream();
                                    String b4 = oVar.mo137726b(15);
                                    aBRAudioStream.setStreamId(b4);
                                    aBRAudioStream.setBandWidth(oVar.mo137724a(3));
                                    aBRAudioStream.setCodec(oVar.mo137726b(8));
                                    aBRAudioStream.setSampleRate(-1);
                                    aBRAudioStream.setSegmentDuration(5000);
                                    if (!TextUtils.isEmpty(b4)) {
                                        arrayList2.add(aBRAudioStream);
                                    }
                                }
                            }
                        }
                        iABRModule.setMediaInfo(arrayList, arrayList2);
                        EnumC86649v valueOf = EnumC86649v.valueOf(this.f193253hN);
                        HashMap hashMap3 = null;
                        if (valueOf != null || !TextUtils.isEmpty(this.f193257hR)) {
                            if (!TextUtils.isEmpty(this.f193257hR)) {
                                hashMap2 = new HashMap();
                                hashMap2.put(32, this.f193257hR);
                            } else {
                                hashMap2 = null;
                            }
                            C86534o a3 = eVar.mo137739a(valueOf, (Map<Integer, String>) hashMap2, true);
                            if (a3 != null) {
                                iABRModule.setLongOptionForKey(2, (long) a3.mo137724a(3));
                            }
                        }
                        EnumC86649v valueOf2 = EnumC86649v.valueOf(this.f193254hO);
                        if (valueOf2 != null || !TextUtils.isEmpty(this.f193258hS)) {
                            if (!TextUtils.isEmpty(this.f193258hS)) {
                                hashMap = new HashMap();
                                hashMap.put(32, this.f193258hS);
                            } else {
                                hashMap = null;
                            }
                            C86534o a4 = eVar.mo137739a(valueOf2, (Map<Integer, String>) hashMap, true);
                            if (a4 != null) {
                                iABRModule.setLongOptionForKey(12, (long) a4.mo137724a(3));
                            }
                        }
                        EnumC86649v valueOf3 = EnumC86649v.valueOf(this.f193255hP);
                        if (valueOf3 != null || !TextUtils.isEmpty(this.f193259hT)) {
                            if (!TextUtils.isEmpty(this.f193259hT)) {
                                hashMap3 = new HashMap();
                                hashMap3.put(32, this.f193259hT);
                            }
                            C86534o a5 = eVar.mo137739a(valueOf3, (Map<Integer, String>) hashMap3, true);
                            if (a5 != null) {
                                iABRModule.setLongOptionForKey(13, (long) a5.mo137724a(3));
                            }
                        }
                    }
                }

                /* renamed from: c */
                private void m148683c(String str, HashMap hashMap) {
                    String str2;
                    int i;
                    String d = m148686d(str, hashMap);
                    if (this.f193219gg) {
                        d = C86640h.m150100d(d);
                    }
                    System.currentTimeMillis();
                    C86529j e = m148688e(d, hashMap);
                    if (e.f194765c > 0) {
                        this.f192923ah.mo16687a(310, this.f193074dq);
                        AbstractC86468j jVar = this.f192920ae;
                        if (jVar != null) {
                            jVar.mo137603g(this.f193074dq);
                        }
                    }
                    this.f192931ap = e;
                    System.currentTimeMillis();
                    AbstractC86468j jVar2 = this.f192920ae;
                    if (jVar2 != null) {
                        jVar2.mo137520G(this.f193066di);
                        if (e.f194765c > 0) {
                            this.f192920ae.mo137662v(e.f194763a);
                        }
                    }
                    if (!this.f193370r) {
                        long currentTimeMillis = System.currentTimeMillis();
                        AbstractC86468j jVar3 = this.f192920ae;
                        if (jVar3 != null) {
                            this.f193014cg = jVar3.mo137634o();
                        } else {
                            this.f193014cg = C86640h.m150082a(C86366b.f193480f, currentTimeMillis);
                        }
                        if (!TextUtils.isEmpty(this.f193014cg)) {
                            e.f194764b.put("X-Tt-Traceid", this.f193014cg);
                            this.f192869F.put("X-Tt-Traceid", this.f193014cg);
                            C86641i.m150110a("TTVideoEngine", "X-Tt-Traceid:" + this.f193014cg);
                        }
                        if (!this.f193162fa && (i = this.f193277hl) != 0) {
                            this.f192869F.put("X-Tt-Fapi", String.valueOf(i));
                            this.f192869F.put("Engine-ID", String.valueOf(this.f192990cA));
                            this.f192920ae.mo137583c(34, this.f193277hl);
                        }
                        if (f192851cf == 1) {
                            this.f192869F.put("X-SpeedTest-TimeInternal", String.valueOf(f192841bZ));
                        }
                        HashMap<String, String> hashMap2 = this.f192869F;
                        if (TextUtils.isEmpty(this.f192898aI)) {
                            str2 = "default";
                        } else {
                            str2 = this.f192898aI;
                        }
                        hashMap2.put("X-Tt-Tag", str2);
                        if (!TextUtils.isEmpty(this.f192899aJ)) {
                            this.f192869F.put("X-Tt-SubTag", this.f192899aJ);
                        }
                    }
                    if (e.f194764b != null) {
                        C86641i.m150110a("TTVideoEngine", "setDataSource X-Tt-Traceid:" + e.f194764b.get("X-Tt-Traceid"));
                    }
                    this.f192923ah.mo16690a(this.f192916aa, Uri.parse(e.f194763a), e.f194764b);
                }

                /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
                /* JADX WARNING: Removed duplicated region for block: B:59:0x0123  */
                /* renamed from: d */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private java.lang.String m148686d(java.lang.String r11, java.util.HashMap r12) {
                    /*
                    // Method dump skipped, instructions count: 318
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.m148686d(java.lang.String, java.util.HashMap):java.lang.String");
                }

                /* renamed from: a */
                private static Object m148636a(Context context, String str) {
                    Object obj;
                    MethodCollector.m26663i(3459);
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
                                MethodCollector.m26664o(3459);
                            }
                        }
                    } else {
                        obj = context.getSystemService(str);
                    }
                    return obj;
                }

                /* renamed from: c */
                private void m148684c(boolean z, int i) {
                    C86635e eVar;
                    m148627W();
                    AbstractC86253m mVar = this.f193279hn;
                    if (mVar == null) {
                        mVar = this.f192923ah;
                    }
                    C86641i.m150110a("TTVideoEngine", "_stop, mState:" + this.f192864A + ", this:" + this);
                    int i2 = this.f192864A;
                    if (i2 == 0) {
                        this.f192933ar = true;
                    } else if (i2 == 1) {
                        this.f192933ar = true;
                        C86437e eVar2 = this.f192922ag;
                        if (eVar2 != null) {
                            eVar2.mo137469a();
                        }
                    } else if (i2 == 2) {
                        this.f192933ar = true;
                        C86544c cVar = this.f193135ez;
                        if (cVar != null) {
                            cVar.mo137806c();
                        }
                    } else if (i2 == 3) {
                        this.f192933ar = true;
                    }
                    mo137272x();
                    if (mVar != null && z && (mVar.mo16709b() != 0 || (mVar.mo16709b() == 0 && this.f193370r))) {
                        mVar.mo16721i();
                    }
                    C86635e eVar3 = this.f192970bg;
                    if (eVar3 != null) {
                        eVar3.mo137909b();
                    }
                    C86520f fVar = this.f193029cw;
                    if (fVar != null) {
                        fVar.mo137772c();
                    }
                    if (this.f192920ae != null) {
                        if (mVar != null) {
                            int k = mVar.mo16723k();
                            if (this.f193023cq > 0) {
                                this.f193022cp = k;
                            }
                            this.f192920ae.mo137667x(k);
                            if (this.f192864A == 3) {
                                this.f192920ae.mo137623l(mVar.mo16710b(204, -1));
                            }
                            this.f192920ae.mo137536a(C84116g.m144636e().mo124230d(), 1);
                        }
                        if (!(this.f193374v == 0 || (eVar = this.f192970bg) == null)) {
                            this.f192920ae.mo137523J(eVar.f195259a.mo137905c());
                        }
                        this.f192920ae.mo137538a(i);
                    }
                    mo137244i(0);
                    this.f192937av = false;
                    this.f192938aw = false;
                    this.f192925aj = -1;
                    this.f192924ai = -1;
                    this.f192939ax = false;
                    this.f192949bI = 0;
                    this.f192982bs = false;
                    this.f192980bq = false;
                    this.f192979bp = false;
                    this.f192934as = false;
                    if (i != 6) {
                        SurfaceHolder$CallbackC86352ar arVar = this.f193130eu;
                        if (arVar != null) {
                            SurfaceHolder surfaceHolder = this.f192918ac;
                            if (surfaceHolder != null) {
                                surfaceHolder.removeCallback(arVar);
                            }
                            C86641i.m150110a("TTVideoEngine", "remove surface callback:" + this.f193130eu);
                            this.f193130eu.f193448a.clear();
                            this.f193130eu = null;
                        }
                        this.f192993cD = false;
                    }
                    mo137248j(3);
                }

                /* renamed from: d */
                public final void mo137217d(int i, String str) {
                    if (this.f193015ch.mo137317a(false)) {
                        this.f193015ch.mo137312a(108, i, 0, str);
                    } else {
                        mo137225e(i, str);
                    }
                }

                public C86313ai(Context context, int i) {
                    int i2;
                    boolean z;
                    boolean z2;
                    MethodCollector.m26663i(4566);
                    boolean z3 = false;
                    this.f192933ar = false;
                    this.f192934as = false;
                    this.f192935at = 0;
                    this.f192936au = false;
                    this.f193095eK = false;
                    this.f193096eL = 0;
                    this.f192937av = false;
                    this.f192938aw = false;
                    this.f192939ax = false;
                    this.f192940ay = true;
                    this.f192941az = 0;
                    this.f192890aA = 0;
                    this.f193097eM = 0;
                    this.f193098eN = 0;
                    this.f193099eO = 0;
                    this.f193100eP = 0;
                    this.f193101eQ = 0;
                    this.f193102eR = 0;
                    this.f193103eS = 0;
                    this.f193104eT = 0;
                    this.f193105eU = true;
                    this.f192891aB = false;
                    this.f192892aC = null;
                    this.f192893aD = null;
                    this.f192894aE = "";
                    this.f193106eV = "";
                    this.f193107eW = "";
                    this.f193108eX = null;
                    this.f193109eY = "";
                    this.f192896aG = false;
                    this.f193110eZ = "";
                    this.f193162fa = false;
                    this.f193163fb = "";
                    this.f193164fc = "";
                    this.f192897aH = "";
                    this.f192898aI = "";
                    this.f192899aJ = "";
                    this.f192900aK = false;
                    this.f192901aL = null;
                    this.f193165fd = "";
                    this.f193166fe = "";
                    this.f193167ff = "";
                    this.f193168fg = "";
                    this.f193169fh = false;
                    this.f192902aM = false;
                    this.f192903aN = null;
                    this.f192904aO = 0;
                    this.f193170fi = 0;
                    this.f192905aP = false;
                    this.f192906aQ = false;
                    this.f192907aR = null;
                    this.f192908aS = true;
                    this.f192909aT = true;
                    this.f192910aU = true;
                    this.f193171fj = true;
                    this.f193172fk = true;
                    this.f193173fl = -1.0f;
                    this.f193174fm = -1.0f;
                    this.f192911aV = false;
                    this.f192912aW = false;
                    this.f192913aX = false;
                    this.f192914aY = true;
                    this.f192915aZ = true;
                    this.f192965ba = 0;
                    this.f192966bb = -1;
                    this.f193176fo = 0;
                    this.f193177fp = null;
                    this.f193178fq = 0;
                    this.f193179fr = 0;
                    this.f192967bc = null;
                    this.f193180fs = false;
                    this.f193181ft = 0;
                    this.f193183fv = false;
                    this.f193184fw = -1;
                    this.f193185fx = 0;
                    this.f192968be = false;
                    this.f192969bf = 0;
                    this.f193137fA = null;
                    this.f193138fB = false;
                    this.f192971bh = false;
                    this.f192972bi = 0;
                    this.f192973bj = new ArrayList<>();
                    this.f192974bk = new ArrayList<>();
                    this.f192975bl = null;
                    this.f193139fC = false;
                    this.f192976bm = 0;
                    this.f193140fD = 0;
                    this.f193141fE = null;
                    this.f193142fF = 0;
                    this.f193143fG = 0;
                    this.f192978bo = 0;
                    this.f192979bp = false;
                    this.f192980bq = false;
                    this.f192981br = false;
                    this.f193145fI = null;
                    this.f192982bs = false;
                    this.f193146fK = 0;
                    this.f193147fL = -1;
                    this.f193148fM = -1;
                    this.f193152fQ = 0;
                    this.f193153fR = 0;
                    this.f192983bt = null;
                    this.f192988by = new C86627c();
                    this.f193156fU = 0;
                    this.f193157fV = 0;
                    this.f192989bz = 0;
                    this.f193158fW = 0;
                    this.f193159fX = new LinkedList();
                    this.f193160fY = null;
                    this.f193161fZ = null;
                    this.f193213ga = "";
                    this.f192942bA = "";
                    this.f193214gb = false;
                    this.f193215gc = false;
                    this.f193216gd = 0;
                    this.f193217ge = 3;
                    this.f193218gf = false;
                    this.f193219gg = false;
                    this.f193220gh = false;
                    this.f193221gi = true;
                    this.f193222gj = 0;
                    this.f193223gk = 2;
                    this.f193224gl = 0;
                    this.f193225gm = null;
                    this.f193226gn = 0;
                    this.f193227go = 1;
                    this.f193228gp = 0;
                    this.f193229gq = 0;
                    this.f193230gr = 1;
                    this.f193231gs = 0;
                    this.f193232gt = -1;
                    this.f193233gu = 0;
                    this.f192944bD = 0;
                    this.f192945bE = 0;
                    this.f192946bF = false;
                    this.f193234gv = 0;
                    this.f193235gw = 0;
                    this.f193236gx = 0;
                    this.f193237gy = 0;
                    this.f193238gz = 0;
                    this.f193188gB = 0;
                    this.f193189gC = 0;
                    this.f193190gD = 1000;
                    this.f193191gE = 0.0f;
                    this.f193192gF = 0;
                    this.f193193gG = 0;
                    this.f193194gH = 0;
                    this.f193195gI = false;
                    this.f193196gJ = System.currentTimeMillis();
                    this.f193197gK = 0;
                    this.f193198gL = 0;
                    this.f193199gM = 0;
                    this.f193200gN = 0;
                    this.f193201gO = 0;
                    this.f193202gP = 1;
                    this.f193203gQ = 0;
                    this.f193204gR = 0;
                    this.f193205gS = 0;
                    this.f193206gT = 1;
                    this.f193207gU = 1;
                    this.f193208gV = 2;
                    this.f193209gW = 1048576;
                    this.f193210gX = 409600;
                    this.f193211gY = 5000;
                    this.f193212gZ = 10000;
                    this.f193266ha = 0;
                    this.f193267hb = 0;
                    this.f193268hc = 0;
                    this.f193269hd = 5000000;
                    this.f193270he = 0;
                    this.f193271hf = 0;
                    this.f193272hg = 1;
                    this.f193273hh = null;
                    this.f192949bI = 0;
                    this.f192950bJ = 0;
                    this.f192951bK = 0;
                    this.f192952bL = new C86340x(this, (byte) 0);
                    this.f193274hi = 0;
                    this.f192953bM = "";
                    this.f193275hj = -1;
                    this.f193276hk = 0;
                    this.f193277hl = 0;
                    this.f193278hm = 0;
                    this.f193280ho = 0;
                    this.f193281hp = 0;
                    this.f193282hr = 0;
                    this.f193283hs = 2;
                    this.f192954bN = 0.0f;
                    this.f192955bO = 0.0f;
                    this.f192956bP = 0;
                    this.f193284ht = -1;
                    this.f193285hu = -1;
                    this.f193286hv = -1;
                    this.f193287hw = -1;
                    this.f193288hx = -1;
                    this.f193289hy = -1.0f;
                    this.f193290hz = -1.0f;
                    this.f193240hA = -1.0f;
                    this.f192957bQ = null;
                    this.f193241hB = null;
                    this.f192958bR = "";
                    this.f193242hC = 0;
                    this.f192959bT = new C86591b();
                    this.f192961bV = 0;
                    this.f193244hE = false;
                    this.f192962bW = 0;
                    this.f193246hG = 500;
                    this.f192963bX = 0;
                    this.f193247hH = 0;
                    this.f193248hI = 1;
                    this.f193249hJ = 0;
                    this.f193250hK = 0;
                    this.f193251hL = 2;
                    this.f193252hM = 4;
                    this.f193253hN = EnumC86649v.Undefine.getIndex();
                    this.f193254hO = EnumC86649v.SuperHigh.getIndex();
                    this.f193255hP = EnumC86649v.SuperHigh.getIndex();
                    this.f193256hQ = 1;
                    this.f193257hR = null;
                    this.f193258hS = null;
                    this.f193259hT = null;
                    this.f193260hU = null;
                    this.f193261hV = EnumC86649v.Undefine.getIndex();
                    this.f193262hW = null;
                    this.f193263hX = 0;
                    this.f193264hY = 0;
                    this.f193265hZ = 0.9f;
                    this.f193317ia = 9.0f;
                    this.f193318ib = 2.0f;
                    this.f193319ic = 1.0f;
                    this.f193320id = -1;
                    this.f193321ie = -1;
                    this.f193322if = -1;
                    this.f193323ig = -1;
                    this.f193324ih = 0;
                    this.f193325ii = false;
                    this.f193326ij = 0.0f;
                    this.f193327ik = 0;
                    this.f193328il = 0;
                    this.f193329im = 0;
                    this.f193330in = 0;
                    this.f193331io = 0;
                    this.f193332ip = 0;
                    this.f193333iq = 0;
                    this.f193334ir = 0;
                    this.f193335is = 0;
                    this.f193336it = 0;
                    this.f193337iu = 0;
                    this.f193338iv = 0;
                    this.f193339iw = 0;
                    this.f193340ix = 0;
                    this.f193341iy = 1;
                    this.f193342iz = 0;
                    this.f193291iA = 0;
                    this.f193292iB = 0;
                    this.f193293iC = 1;
                    this.f193294iD = 0;
                    this.f193295iE = 0;
                    this.f193296iF = 0;
                    this.f193014cg = "";
                    this.f193297iG = false;
                    this.f193016ci = new HashMap<>();
                    this.f193017ck = null;
                    this.f193018cl = new ArrayList();
                    this.f193299iI = 0;
                    this.f193019cm = 0;
                    this.f193303iM = 0;
                    this.f193304iN = -3;
                    this.f193305iO = 0;
                    this.f193020cn = 0;
                    this.f193021co = 0;
                    this.f193306iP = -1;
                    this.f193307iQ = 0;
                    this.f193308iR = 0;
                    this.f193022cp = -1;
                    this.f193023cq = 0;
                    this.f193024cr = -1;
                    this.f193025cs = -1;
                    this.f193026ct = -1;
                    this.f193309iS = -1;
                    this.f193027cu = -1;
                    this.f193028cv = -1;
                    this.f193310iT = -1;
                    this.f193311iU = 0.0f;
                    this.f193312iV = 0;
                    this.f193029cw = null;
                    this.f193030cx = 0;
                    this.f193031cy = false;
                    this.f193313iW = false;
                    this.f193032cz = false;
                    this.f193314iX = false;
                    this.f193315iY = 300;
                    this.f193316iZ = 0;
                    this.f193344jc = 0;
                    this.f193345jd = 0;
                    this.f193346je = 0;
                    this.f193347jf = -1;
                    this.f193348jg = -1;
                    this.f193349jh = -1;
                    this.f193350ji = -1;
                    this.f193351jj = new ArrayList<>();
                    this.f193352jk = -1;
                    this.f193353jl = 0;
                    this.f193354jm = false;
                    this.f193355jn = 0;
                    this.f193356jo = null;
                    this.f193357jp = 0;
                    this.f193358jq = 0;
                    this.f193359jr = 0;
                    this.f193360js = new C86606b();
                    this.f193361jt = false;
                    this.f193363jv = null;
                    this.f192991cB = null;
                    this.f192993cD = false;
                    JniUtils.m148583a();
                    C86641i.m150110a("TTVideoEngine", "init, type:" + i + ", this:" + this + ", version:1.10.61.5");
                    this.f192916aa = context;
                    this.f192895aF = false;
                    this.f192908aS = true;
                    this.f192910aU = true;
                    this.f192909aT = true;
                    this.f193133ex = true;
                    this.f192927al = EnumC86649v.Standard;
                    this.f193086eB = EnumC86649v.Auto;
                    this.f193091eG = new HashMap();
                    this.f193092eH = new HashMap();
                    this.f193093eI = new HashMap();
                    m148665ao();
                    this.f192930ao = new HashMap();
                    this.f192869F = new HashMap<>();
                    this.f193273hh = new HashMap<>();
                    this.f192866C = i;
                    this.f192979bp = false;
                    this.f192980bq = false;
                    this.f192969bf = f192845cH ? 1 : 0;
                    this.f193344jc = 500;
                    C86641i.m150113b("TTVideoEngine", "DataLoaderEnable is: " + this.f192969bf);
                    C86277r.m148506a(6, false);
                    if (i == 2 || i == 5) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    C86277r.m148510b(1, i2);
                    if (i == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C86277r.m148506a(2, z);
                    if (i == 5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C86277r.m148506a(26, z2);
                    C86277r.m148506a(11, false);
                    C86277r.m148506a(4, false);
                    if (i == 3) {
                        f192842bd = true;
                    }
                    this.f192921af = new C86464h(context);
                    C86481r rVar = new C86481r(context, new C86329m(this), this.f192921af);
                    this.f192920ae = rVar;
                    rVar.mo137535a();
                    this.f192920ae.mo137577b(m148685d(this.f192927al), "");
                    if (!f192845cH && f192858fz.tryLock()) {
                        try {
                            if (f192857fy) {
                                f192857fy = false;
                                String ap = m148666ap();
                                File file = new File(ap);
                                if (!file.exists()) {
                                    file.mkdirs();
                                } else if (file.list() != null) {
                                    File file2 = new File(ap + "tem");
                                    file.renameTo(file2);
                                    file.mkdirs();
                                    C86631b.m150044a(new RunnableC86339w(file2));
                                }
                                C86631b.m150044a(new RunnableC86317a(m148633a(this.f192916aa)));
                            }
                        } catch (Throwable unused) {
                        }
                        f192858fz.unlock();
                    }
                    this.f192970bg = new C86635e(this.f192921af);
                    if (!C86644l.m150123b()) {
                        Context context2 = this.f192916aa;
                        if (!C86644l.f195281d && !TextUtils.isEmpty(C86644l.f195278a)) {
                            synchronized (C86644l.class) {
                                try {
                                    if (C86644l.f195279b == null || !C86644l.f195279b.mo137914a()) {
                                        if (context2 != null && !C86555h.m149815b(context2)) {
                                            C86641i.m150113b("TimeService", "network unavailable");
                                        } else if (C86644l.f195280c == 0) {
                                            C86644l.f195280c = 1;
                                            if (C86644l.f195282e <= 6) {
                                                C86631b.m150044a(
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05f6: INVOKE  
                                                      (wrap: com.ss.ttvideoengine.s.l$1 : 0x05f3: CONSTRUCTOR  (r0v141 com.ss.ttvideoengine.s.l$1) = (r4v3 'context2' android.content.Context) call: com.ss.ttvideoengine.s.l.1.<init>(android.content.Context):void type: CONSTRUCTOR)
                                                     type: STATIC call: com.ss.ttvideoengine.s.b.a(java.lang.Runnable):java.util.concurrent.Future in method: com.ss.ttvideoengine.ai.<init>(android.content.Context, int):void, file: classes4.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05f3: CONSTRUCTOR  (r0v141 com.ss.ttvideoengine.s.l$1) = (r4v3 'context2' android.content.Context) call: com.ss.ttvideoengine.s.l.1.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.ss.ttvideoengine.ai.<init>(android.content.Context, int):void, file: classes4.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                    	... 53 more
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.ttvideoengine.s.l, state: GENERATED_AND_UNLOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                    	... 59 more
                                                    */
                                                /*
                                                // Method dump skipped, instructions count: 1542
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86313ai.<init>(android.content.Context, int):void");
                                            }

                                            /* renamed from: a */
                                            private void m148638a(int i, C86633c cVar) {
                                                String str;
                                                String str2;
                                                if (i == 0) {
                                                    m148681c(cVar);
                                                } else if (i == 1) {
                                                    m148677b(cVar);
                                                    m148656af();
                                                } else if (i == 2) {
                                                    m148657ag();
                                                } else if (i == 3) {
                                                    if (this.f192896aG) {
                                                        str = this.f193110eZ;
                                                    } else if (this.f193162fa) {
                                                        str = this.f193163fb;
                                                    } else {
                                                        if (this.f192900aK) {
                                                            str2 = this.f192901aL.f195058b;
                                                        } else if (this.f192902aM) {
                                                            str2 = this.f192903aN.f193444a;
                                                        } else {
                                                            mo137185a(this.f192952bL.mo137302a(), this.f192869F);
                                                            return;
                                                        }
                                                        m148679b(str2, this.f192869F);
                                                        return;
                                                    }
                                                    m148679b(str, this.f192869F);
                                                } else if (i == 12 && !this.f193360js.mo137870a(this, cVar)) {
                                                    m148681c(cVar);
                                                }
                                            }

                                            /* renamed from: b */
                                            private void m148679b(String str, HashMap hashMap) {
                                                this.f192952bL.mo137303a(str);
                                                boolean q = m148702q(str);
                                                this.f193365m = q;
                                                this.f193364l = q;
                                                if (m148696l(true) || this.f192896aG) {
                                                    mo137185a(str, hashMap);
                                                } else if (C86640h.m150104f(str) || str.indexOf("http") != 0) {
                                                    mo137185a(str, hashMap);
                                                } else {
                                                    this.f192930ao.put(this.f192952bL.f193414a, new C86318b("", "", this.f193180fs ? 1 : 0, this.f193215gc ? 1 : 0, "single"));
                                                    this.f193090eF = new String[]{str};
                                                    m148664an();
                                                    m148698o(str);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: e */
                                            public final void mo137225e(int i, String str) {
                                                if (i == 531) {
                                                    this.f193168fg = str;
                                                } else if (i == 532) {
                                                    this.f193165fd = str;
                                                } else if (i == 659) {
                                                    this.f193260hU = str;
                                                } else if (i == 662) {
                                                    this.f193225gm = str;
                                                } else if (i != 957) {
                                                    switch (i) {
                                                        case 538:
                                                            this.f193257hR = str;
                                                            break;
                                                        case 539:
                                                            this.f193258hS = str;
                                                            break;
                                                        case 540:
                                                            this.f193259hT = str;
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 545:
                                                                    this.f193262hW = str;
                                                                    break;
                                                                case 546:
                                                                    this.f193166fe = str;
                                                                    break;
                                                                case 547:
                                                                    this.f193167ff = str;
                                                                    break;
                                                            }
                                                    }
                                                } else if (!this.f193351jj.contains(str)) {
                                                    this.f193351jj.add(str);
                                                }
                                                C86641i.m150110a("TTVideoEngine", C1764a.m5928a("set int option key:%d value:%s", new Object[]{Integer.valueOf(i), str}));
                                            }

                                            /* renamed from: b */
                                            private void m148680b(String[] strArr, String str, String str2) {
                                                if (this.f193015ch.mo137317a(false)) {
                                                    this.f193015ch.mo137314a(20, 0, 0, strArr, str, str2);
                                                } else {
                                                    mo137189a(strArr, str, str2);
                                                }
                                            }

                                            /* renamed from: a */
                                            private C86534o m148634a(EnumC86649v vVar, int i, Map<Integer, String> map) {
                                                AbstractC86517e eVar = this.f192919ad;
                                                if (eVar == null || !eVar.mo137742a()) {
                                                    return null;
                                                }
                                                C86534o a = this.f192919ad.mo137737a(vVar, i, map, true);
                                                if (a != null) {
                                                    int a2 = this.f192919ad.mo137734a(7);
                                                    if (a2 == C86537q.f194868b && a.mo137723a() == C86537q.f194868b) {
                                                        this.f192927al = a.mo137729c();
                                                        this.f192942bA = a.mo137726b(32);
                                                    } else if (a2 == C86537q.f194867a && a.mo137723a() == C86537q.f194867a) {
                                                        this.f192927al = a.mo137729c();
                                                        this.f192942bA = a.mo137726b(32);
                                                    }
                                                    this.f192920ae.mo137653s(this.f192942bA);
                                                    this.f192920ae.mo137577b(m148685d(this.f192927al), "");
                                                }
                                                return a;
                                            }

                                            /* renamed from: a */
                                            public static void m148644a(String str, String str2, String str3, long j) {
                                                C86385d.C86400h.f193679a.mo137371a(str, str2, str3, j);
                                            }

                                            /* renamed from: a */
                                            public static EnumC86649v m148635a(AbstractC86517e eVar, EnumC86649v vVar, int i, AbstractC86586h hVar) {
                                                EnumC86649v a = C86575a.m149944a(eVar, vVar);
                                                if (i == 1) {
                                                    return C86575a.m149946b(eVar, a);
                                                }
                                                if (i == 2) {
                                                    return C86575a.m149947c(eVar, a);
                                                }
                                                if (i != 3) {
                                                    return a;
                                                }
                                                double d = -1.0d;
                                                if (C86614c.f195159a != null) {
                                                    d = (double) ((C86614c.f195159a.getPredictSpeed() / 8.0f) / 1024.0f);
                                                }
                                                return C86575a.m149945a(eVar, a, d, hVar);
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.ttvideoengine.ai$b */
                                            public class C86318b {

                                                /* renamed from: a */
                                                public String f193384a;

                                                /* renamed from: b */
                                                public String f193385b;

                                                /* renamed from: c */
                                                public int f193386c;

                                                /* renamed from: d */
                                                public int f193387d;

                                                /* renamed from: e */
                                                public String f193388e;

                                                static {
                                                    Covode.recordClassIndex(101546);
                                                }

                                                public C86318b(String str, String str2, int i, int i2, String str3) {
                                                    this.f193384a = str;
                                                    this.f193385b = str2;
                                                    this.f193386c = i;
                                                    this.f193387d = i2;
                                                    this.f193388e = str3;
                                                }
                                            }
                                        }
