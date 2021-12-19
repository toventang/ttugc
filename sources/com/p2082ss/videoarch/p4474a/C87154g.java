package com.p2082ss.videoarch.p4474a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoader;
import com.p2082ss.optimizer.live.sdk.dns.AbstractC86157e;
import com.p2082ss.texturerender.C86203l;
import com.p2082ss.texturerender.C86205m;
import com.p2082ss.texturerender.VideoSurface;
import com.p2082ss.texturerender.p4404a.C86174d;
import com.p2082ss.ttm.player.AbstractC86253m;
import com.p2082ss.ttm.player.AudioProcessor;
import com.p2082ss.ttm.player.C86277r;
import com.p2082ss.videoarch.p4474a.AbstractC87127c;
import com.p2082ss.videoarch.p4474a.p4475a.C87118a;
import com.p2082ss.videoarch.p4474a.p4475a.C87119b;
import com.p2082ss.videoarch.p4474a.p4475a.C87122c;
import com.p2082ss.videoarch.p4474a.p4476b.AbstractC87124a;
import com.p2082ss.videoarch.p4474a.p4476b.C87125b;
import com.p2082ss.videoarch.p4474a.p4477c.C87130a;
import com.p2082ss.videoarch.p4474a.p4477c.C87131b;
import com.p2082ss.videoarch.p4474a.p4477c.C87132c;
import com.p2082ss.videoarch.p4474a.p4478d.C87135a;
import com.p2082ss.videoarch.p4474a.p4478d.C87143c;
import com.p2082ss.videoarch.p4474a.p4479e.C87148a;
import com.p2082ss.videoarch.p4474a.p4479e.C87149b;
import com.p2082ss.videoarch.p4474a.p4480f.C87151a;
import com.p2082ss.videoarch.p4474a.p4481g.C87180a;
import com.p2082ss.videoarch.strategy.LiveStrategyManager;
import com.ss.videoarch.live.LiveIOWrapper;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.a.g */
public final class C87154g {

    /* renamed from: S */
    public static int f196973S = 500;

    /* renamed from: T */
    public static int f196974T = 200;

    /* renamed from: X */
    public static int f196975X = 900;

    /* renamed from: Y */
    public static int f196976Y = 600;

    /* renamed from: bi */
    private static C86203l.AbstractC86204a f196977bi;

    /* renamed from: cZ */
    private static int f196978cZ = -1;

    /* renamed from: A */
    public boolean f196979A;

    /* renamed from: B */
    public String f196980B;

    /* renamed from: C */
    public int f196981C;

    /* renamed from: D */
    public boolean f196982D;

    /* renamed from: E */
    public boolean f196983E;

    /* renamed from: F */
    public String f196984F;

    /* renamed from: G */
    public int f196985G;

    /* renamed from: H */
    public boolean f196986H;

    /* renamed from: I */
    int f196987I;

    /* renamed from: J */
    long f196988J;

    /* renamed from: K */
    long f196989K;

    /* renamed from: L */
    public String f196990L;

    /* renamed from: M */
    int f196991M;

    /* renamed from: N */
    String f196992N;

    /* renamed from: O */
    public boolean f196993O;

    /* renamed from: P */
    public String f196994P;

    /* renamed from: Q */
    public String f196995Q;

    /* renamed from: R */
    public String f196996R;

    /* renamed from: U */
    public int f196997U;

    /* renamed from: V */
    public long f196998V;

    /* renamed from: W */
    public boolean f196999W;

    /* renamed from: Z */
    public int f197000Z;

    /* renamed from: a */
    public final Handler f197001a;

    /* renamed from: aA */
    public Handler f197002aA;

    /* renamed from: aB */
    public final Object f197003aB;

    /* renamed from: aC */
    public volatile boolean f197004aC;

    /* renamed from: aD */
    public int f197005aD;

    /* renamed from: aE */
    public int f197006aE;

    /* renamed from: aF */
    public int f197007aF;

    /* renamed from: aG */
    public int f197008aG;

    /* renamed from: aH */
    public int f197009aH;

    /* renamed from: aI */
    public int f197010aI;

    /* renamed from: aJ */
    public boolean f197011aJ;

    /* renamed from: aK */
    public boolean f197012aK;

    /* renamed from: aL */
    public int f197013aL;

    /* renamed from: aM */
    public boolean f197014aM;

    /* renamed from: aN */
    public int f197015aN;

    /* renamed from: aO */
    public int f197016aO;

    /* renamed from: aP */
    public int f197017aP;

    /* renamed from: aQ */
    public int f197018aQ;

    /* renamed from: aR */
    public boolean f197019aR;

    /* renamed from: aS */
    public int f197020aS;

    /* renamed from: aT */
    public float f197021aT;

    /* renamed from: aU */
    public float f197022aU;

    /* renamed from: aV */
    public float f197023aV;

    /* renamed from: aW */
    public int f197024aW;

    /* renamed from: aX */
    public boolean f197025aX;

    /* renamed from: aY */
    public String f197026aY;

    /* renamed from: aZ */
    public int f197027aZ;

    /* renamed from: aa */
    public long f197028aa;

    /* renamed from: ab */
    public long f197029ab;

    /* renamed from: ac */
    public long f197030ac;

    /* renamed from: ad */
    public int f197031ad;

    /* renamed from: ae */
    public int f197032ae;

    /* renamed from: af */
    public boolean f197033af;

    /* renamed from: ag */
    public boolean f197034ag;

    /* renamed from: ah */
    public long f197035ah;

    /* renamed from: ai */
    public int f197036ai;

    /* renamed from: aj */
    public boolean f197037aj;

    /* renamed from: ak */
    public int f197038ak;

    /* renamed from: al */
    public boolean f197039al;

    /* renamed from: am */
    public boolean f197040am;

    /* renamed from: an */
    public int f197041an;

    /* renamed from: ao */
    public boolean f197042ao;

    /* renamed from: ap */
    public int f197043ap;

    /* renamed from: aq */
    public long f197044aq;

    /* renamed from: ar */
    public boolean f197045ar;

    /* renamed from: as */
    public int f197046as;

    /* renamed from: at */
    public long f197047at;

    /* renamed from: au */
    String f197048au;

    /* renamed from: av */
    String f197049av;

    /* renamed from: aw */
    public long f197050aw;

    /* renamed from: ax */
    public boolean f197051ax;

    /* renamed from: ay */
    public int f197052ay;

    /* renamed from: az */
    public boolean f197053az;

    /* renamed from: b */
    public C87119b f197054b;

    /* renamed from: bA */
    private int f197055bA;

    /* renamed from: bB */
    private int f197056bB;

    /* renamed from: bC */
    private int f197057bC;

    /* renamed from: bD */
    private int f197058bD;

    /* renamed from: bE */
    private int f197059bE;

    /* renamed from: bF */
    private int f197060bF;

    /* renamed from: bG */
    private int f197061bG;

    /* renamed from: bH */
    private int f197062bH;

    /* renamed from: bI */
    private int f197063bI;

    /* renamed from: bJ */
    private int f197064bJ;

    /* renamed from: bK */
    private int f197065bK;

    /* renamed from: bL */
    private float f197066bL;

    /* renamed from: bM */
    private int f197067bM;

    /* renamed from: bN */
    private float f197068bN;

    /* renamed from: bO */
    private int f197069bO;

    /* renamed from: bP */
    private String f197070bP;

    /* renamed from: bQ */
    private String f197071bQ;

    /* renamed from: bR */
    private boolean f197072bR;

    /* renamed from: bS */
    private int f197073bS;

    /* renamed from: bT */
    private int f197074bT;

    /* renamed from: bU */
    private int f197075bU;

    /* renamed from: bV */
    private int f197076bV;

    /* renamed from: bW */
    private int f197077bW;

    /* renamed from: bX */
    private int f197078bX;

    /* renamed from: bY */
    private int f197079bY;

    /* renamed from: bZ */
    private int f197080bZ;

    /* renamed from: ba */
    public int f197081ba;

    /* renamed from: bb */
    public int f197082bb;

    /* renamed from: bc */
    private final Context f197083bc;

    /* renamed from: bd */
    private final int f197084bd;

    /* renamed from: be */
    private SurfaceHolder f197085be;

    /* renamed from: bf */
    private SurfaceHolder$CallbackC87178p f197086bf;

    /* renamed from: bg */
    private Surface f197087bg;

    /* renamed from: bh */
    private int f197088bh;

    /* renamed from: bj */
    private String f197089bj;

    /* renamed from: bk */
    private String f197090bk;

    /* renamed from: bl */
    private String f197091bl;

    /* renamed from: bm */
    private String f197092bm;

    /* renamed from: bn */
    private boolean f197093bn;

    /* renamed from: bo */
    private int f197094bo;

    /* renamed from: bp */
    private boolean f197095bp;

    /* renamed from: bq */
    private int f197096bq;

    /* renamed from: br */
    private int f197097br;

    /* renamed from: bs */
    private int f197098bs;

    /* renamed from: bt */
    private int f197099bt;

    /* renamed from: bu */
    private int f197100bu;

    /* renamed from: bv */
    private int f197101bv;

    /* renamed from: bw */
    private int f197102bw;

    /* renamed from: bx */
    private int f197103bx;

    /* renamed from: by */
    private int f197104by;

    /* renamed from: bz */
    private int f197105bz;

    /* renamed from: c */
    final AbstractC87127c f197106c;

    /* renamed from: cA */
    private String f197107cA;

    /* renamed from: cB */
    private String f197108cB;

    /* renamed from: cC */
    private String f197109cC;

    /* renamed from: cD */
    private int f197110cD;

    /* renamed from: cE */
    private int f197111cE;

    /* renamed from: cF */
    private int f197112cF;

    /* renamed from: cG */
    private int f197113cG;

    /* renamed from: cH */
    private int f197114cH;

    /* renamed from: cI */
    private int f197115cI;

    /* renamed from: cJ */
    private int f197116cJ;

    /* renamed from: cK */
    private int f197117cK;

    /* renamed from: cL */
    private int f197118cL;

    /* renamed from: cM */
    private int f197119cM;

    /* renamed from: cN */
    private int f197120cN;

    /* renamed from: cO */
    private int f197121cO;

    /* renamed from: cP */
    private int f197122cP;

    /* renamed from: cQ */
    private int f197123cQ;

    /* renamed from: cR */
    private int f197124cR;

    /* renamed from: cS */
    private int f197125cS;

    /* renamed from: cT */
    private int f197126cT;

    /* renamed from: cU */
    private int f197127cU;

    /* renamed from: cV */
    private int f197128cV;

    /* renamed from: cW */
    private long f197129cW;

    /* renamed from: cX */
    private int f197130cX;

    /* renamed from: cY */
    private int f197131cY;

    /* renamed from: ca */
    private int f197132ca;

    /* renamed from: cb */
    private int f197133cb;

    /* renamed from: cc */
    private int f197134cc;

    /* renamed from: cd */
    private int f197135cd;

    /* renamed from: ce */
    private long f197136ce;

    /* renamed from: cf */
    private int f197137cf;

    /* renamed from: cg */
    private int f197138cg;

    /* renamed from: ch */
    private int f197139ch;

    /* renamed from: ci */
    private int f197140ci;

    /* renamed from: cj */
    private int f197141cj;

    /* renamed from: ck */
    private int f197142ck;

    /* renamed from: cl */
    private int f197143cl;

    /* renamed from: cm */
    private long f197144cm;

    /* renamed from: cn */
    private int f197145cn;

    /* renamed from: co */
    private int f197146co;

    /* renamed from: cp */
    private Object f197147cp;

    /* renamed from: cq */
    private C87150f f197148cq;

    /* renamed from: cr */
    private long f197149cr;

    /* renamed from: cs */
    private int f197150cs;

    /* renamed from: ct */
    private String f197151ct;

    /* renamed from: cu */
    private String f197152cu;

    /* renamed from: cv */
    private String f197153cv;

    /* renamed from: cw */
    private String f197154cw;

    /* renamed from: cx */
    private boolean f197155cx;

    /* renamed from: cy */
    private String f197156cy;

    /* renamed from: cz */
    private String f197157cz;

    /* renamed from: d */
    public final AbstractC87117a f197158d;

    /* renamed from: dA */
    private JSONObject f197159dA;

    /* renamed from: dB */
    private int f197160dB;

    /* renamed from: dC */
    private String f197161dC;

    /* renamed from: dD */
    private int f197162dD;

    /* renamed from: dE */
    private boolean f197163dE;

    /* renamed from: dF */
    private boolean f197164dF;

    /* renamed from: dG */
    private String f197165dG;

    /* renamed from: dH */
    private String f197166dH;

    /* renamed from: dI */
    private String f197167dI;

    /* renamed from: dJ */
    private int f197168dJ;

    /* renamed from: dK */
    private int f197169dK;

    /* renamed from: dL */
    private boolean f197170dL;

    /* renamed from: dM */
    private boolean f197171dM;

    /* renamed from: dN */
    private boolean f197172dN;

    /* renamed from: dO */
    private int f197173dO;

    /* renamed from: dP */
    private int f197174dP;

    /* renamed from: dQ */
    private int f197175dQ;

    /* renamed from: dR */
    private int f197176dR;

    /* renamed from: dS */
    private int f197177dS;

    /* renamed from: dT */
    private int f197178dT;

    /* renamed from: dU */
    private int f197179dU;

    /* renamed from: dV */
    private int f197180dV;

    /* renamed from: dW */
    private int f197181dW;

    /* renamed from: dX */
    private int f197182dX;

    /* renamed from: dY */
    private int f197183dY;

    /* renamed from: dZ */
    private int f197184dZ;

    /* renamed from: da */
    private int f197185da;

    /* renamed from: db */
    private int f197186db;

    /* renamed from: dc */
    private int f197187dc;

    /* renamed from: dd */
    private int f197188dd;

    /* renamed from: de */
    private int f197189de;

    /* renamed from: df */
    private int f197190df;

    /* renamed from: dg */
    private AbstractC86157e f197191dg;

    /* renamed from: dh */
    private int f197192dh;

    /* renamed from: di */
    private int f197193di;

    /* renamed from: dj */
    private boolean f197194dj;

    /* renamed from: dk */
    private boolean f197195dk;

    /* renamed from: dl */
    private boolean f197196dl;

    /* renamed from: dm */
    private int f197197dm;

    /* renamed from: dn */
    private int f197198dn;

    /* renamed from: do */
    private int f197199do;

    /* renamed from: dp */
    private int f197200dp;

    /* renamed from: dq */
    private int f197201dq;

    /* renamed from: dr */
    private int f197202dr;

    /* renamed from: ds */
    private int f197203ds;

    /* renamed from: dt */
    private long f197204dt;

    /* renamed from: du */
    private long f197205du;

    /* renamed from: dv */
    private int f197206dv;

    /* renamed from: dw */
    private int f197207dw;

    /* renamed from: dx */
    private int f197208dx;

    /* renamed from: dy */
    private int f197209dy;

    /* renamed from: dz */
    private int f197210dz;

    /* renamed from: e */
    final AbstractC87123b f197211e;

    /* renamed from: eA */
    private float f197212eA;

    /* renamed from: eB */
    private int f197213eB;

    /* renamed from: eC */
    private int f197214eC;

    /* renamed from: eD */
    private int f197215eD;

    /* renamed from: eE */
    private int f197216eE;

    /* renamed from: eF */
    private int f197217eF;

    /* renamed from: eG */
    private int f197218eG;

    /* renamed from: eH */
    private int f197219eH;

    /* renamed from: eI */
    private int f197220eI;

    /* renamed from: eJ */
    private int f197221eJ;

    /* renamed from: eK */
    private float f197222eK;

    /* renamed from: eL */
    private float f197223eL;

    /* renamed from: eM */
    private float f197224eM;

    /* renamed from: eN */
    private float f197225eN;

    /* renamed from: eO */
    private float f197226eO;

    /* renamed from: eP */
    private float f197227eP;

    /* renamed from: eQ */
    private float f197228eQ;

    /* renamed from: eR */
    private float f197229eR;

    /* renamed from: eS */
    private float f197230eS;

    /* renamed from: eT */
    private int f197231eT;

    /* renamed from: eU */
    private int f197232eU;

    /* renamed from: eV */
    private int f197233eV;

    /* renamed from: eW */
    private int f197234eW;

    /* renamed from: eX */
    private int f197235eX;

    /* renamed from: eY */
    private int f197236eY;

    /* renamed from: eZ */
    private boolean f197237eZ;

    /* renamed from: ea */
    private int f197238ea;

    /* renamed from: eb */
    private int f197239eb;

    /* renamed from: ec */
    private int f197240ec;

    /* renamed from: ed */
    private int f197241ed;

    /* renamed from: ee */
    private int f197242ee;

    /* renamed from: ef */
    private int f197243ef;

    /* renamed from: eg */
    private int f197244eg;

    /* renamed from: eh */
    private int f197245eh;

    /* renamed from: ei */
    private int f197246ei;

    /* renamed from: ej */
    private int f197247ej;

    /* renamed from: ek */
    private int f197248ek;

    /* renamed from: el */
    private int f197249el;

    /* renamed from: em */
    private int f197250em;

    /* renamed from: en */
    private int f197251en;

    /* renamed from: eo */
    private int f197252eo;

    /* renamed from: ep */
    private int f197253ep;

    /* renamed from: eq */
    private boolean f197254eq;

    /* renamed from: er */
    private String f197255er;

    /* renamed from: es */
    private List<String> f197256es;

    /* renamed from: et */
    private JSONObject f197257et;

    /* renamed from: eu */
    private boolean f197258eu;

    /* renamed from: ev */
    private int f197259ev;

    /* renamed from: ew */
    private int f197260ew;

    /* renamed from: ex */
    private float f197261ex;

    /* renamed from: ey */
    private float f197262ey;

    /* renamed from: ez */
    private float f197263ez;

    /* renamed from: f */
    public final C87135a f197264f;

    /* renamed from: fA */
    private int f197265fA;

    /* renamed from: fB */
    private int f197266fB;

    /* renamed from: fC */
    private long f197267fC;

    /* renamed from: fD */
    private long f197268fD;

    /* renamed from: fE */
    private boolean f197269fE;

    /* renamed from: fF */
    private int f197270fF;

    /* renamed from: fG */
    private int f197271fG;

    /* renamed from: fH */
    private int f197272fH;

    /* renamed from: fI */
    private int f197273fI;

    /* renamed from: fJ */
    private int f197274fJ;

    /* renamed from: fK */
    private int f197275fK;

    /* renamed from: fL */
    private C87164b f197276fL;

    /* renamed from: fM */
    private int f197277fM;

    /* renamed from: fN */
    private int f197278fN;

    /* renamed from: fO */
    private ExecutorService f197279fO;

    /* renamed from: fP */
    private int f197280fP;

    /* renamed from: fQ */
    private int f197281fQ;

    /* renamed from: fR */
    private int f197282fR;

    /* renamed from: fS */
    private JSONObject f197283fS;

    /* renamed from: fT */
    private JSONObject f197284fT;

    /* renamed from: fU */
    private int f197285fU;

    /* renamed from: fV */
    private int f197286fV;

    /* renamed from: fW */
    private boolean f197287fW;

    /* renamed from: fX */
    private int f197288fX;

    /* renamed from: fY */
    private int f197289fY;

    /* renamed from: fZ */
    private String f197290fZ;

    /* renamed from: fa */
    private int f197291fa;

    /* renamed from: fb */
    private int f197292fb;

    /* renamed from: fc */
    private int f197293fc;

    /* renamed from: fd */
    private int f197294fd;

    /* renamed from: fe */
    private HandlerThread f197295fe;

    /* renamed from: ff */
    private final RunnableC87179q f197296ff;

    /* renamed from: fg */
    private int f197297fg;

    /* renamed from: fh */
    private int f197298fh;

    /* renamed from: fi */
    private int f197299fi;

    /* renamed from: fj */
    private int f197300fj;

    /* renamed from: fk */
    private int f197301fk;

    /* renamed from: fl */
    private int f197302fl;

    /* renamed from: fm */
    private int f197303fm;

    /* renamed from: fn */
    private int f197304fn;

    /* renamed from: fo */
    private int f197305fo;

    /* renamed from: fp */
    private String f197306fp;

    /* renamed from: fq */
    private String f197307fq;

    /* renamed from: fr */
    private JSONObject f197308fr;

    /* renamed from: fs */
    private int f197309fs;

    /* renamed from: ft */
    private String f197310ft;

    /* renamed from: fu */
    private String f197311fu;

    /* renamed from: fv */
    private AudioProcessor f197312fv;

    /* renamed from: fw */
    private int f197313fw;

    /* renamed from: fx */
    private int f197314fx;

    /* renamed from: fy */
    private int f197315fy;

    /* renamed from: fz */
    private int f197316fz;

    /* renamed from: g */
    public final C87151a f197317g;

    /* renamed from: ga */
    private JSONObject f197318ga;

    /* renamed from: gb */
    private String f197319gb;

    /* renamed from: gc */
    private int f197320gc;

    /* renamed from: gd */
    private int f197321gd;

    /* renamed from: ge */
    private int f197322ge;

    /* renamed from: gf */
    private boolean f197323gf;

    /* renamed from: gg */
    private Queue<Bundle> f197324gg;

    /* renamed from: gh */
    private int f197325gh;

    /* renamed from: gi */
    private int f197326gi;

    /* renamed from: gj */
    private int f197327gj;

    /* renamed from: gk */
    private int f197328gk;

    /* renamed from: gl */
    private int f197329gl;

    /* renamed from: gm */
    private int f197330gm;

    /* renamed from: gn */
    private int f197331gn;

    /* renamed from: go */
    private int f197332go;

    /* renamed from: gp */
    private int f197333gp;

    /* renamed from: h */
    public final C87149b f197334h;

    /* renamed from: i */
    public final C87130a f197335i;

    /* renamed from: j */
    public AbstractC86253m f197336j;

    /* renamed from: k */
    public C87143c f197337k;

    /* renamed from: l */
    public C86205m f197338l;

    /* renamed from: m */
    public VideoSurface f197339m;

    /* renamed from: n */
    public int f197340n;

    /* renamed from: o */
    public int f197341o;

    /* renamed from: p */
    public boolean f197342p;

    /* renamed from: q */
    public int f197343q;

    /* renamed from: r */
    public boolean f197344r;

    /* renamed from: s */
    public EnumC87177o f197345s;

    /* renamed from: t */
    public EnumC87165c f197346t;

    /* renamed from: u */
    public boolean f197347u;

    /* renamed from: v */
    public boolean f197348v;

    /* renamed from: w */
    public boolean f197349w;

    /* renamed from: x */
    public boolean f197350x;

    /* renamed from: y */
    public int f197351y;

    /* renamed from: z */
    public String f197352z;

    /* renamed from: com.ss.videoarch.a.g$m */
    static class ThreadFactoryC87175m implements ThreadFactory {
        static {
            Covode.recordClassIndex(102976);
        }

        private ThreadFactoryC87175m() {
        }

        /* synthetic */ ThreadFactoryC87175m(byte b) {
            this();
        }

        public Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(2827);
            Thread thread = new Thread(runnable, "VideoLiveManager");
            thread.setPriority(10);
            MethodCollector.m26664o(2827);
            return thread;
        }
    }

    /* renamed from: a */
    public final void mo140977a(Runnable runnable, long j) {
        this.f197001a.postDelayed(runnable, j);
    }

    /* renamed from: a */
    public final void mo140972a(SurfaceHolder surfaceHolder) {
        mo140996f("setSurfaceHolder");
        this.f197158d.mo12860b("setSurfaceHolder: ".concat(String.valueOf(surfaceHolder)));
        if (!(this.f197085be == null || this.f197086bf == null)) {
            new StringBuilder("remove callback:").append(this.f197086bf).append(", surfaceholder:").append(surfaceHolder).append(", mSurface:").append(this.f197087bg).append(", mSurfaceHolder:").append(this.f197085be);
            this.f197086bf.f197408a.clear();
            this.f197085be.removeCallback(this.f197086bf);
            this.f197086bf = null;
        }
        this.f197085be = surfaceHolder;
        if (this.f197336j != null) {
            this.f197054b.f196498bc = System.currentTimeMillis();
            if (this.f197085be != null) {
                if (this.f197086bf == null) {
                    SurfaceHolder$CallbackC87178p pVar = new SurfaceHolder$CallbackC87178p(this);
                    this.f197086bf = pVar;
                    this.f197085be.addCallback(pVar);
                }
                mo140971a(this.f197085be.getSurface());
            }
            this.f197054b.f196497bb = System.currentTimeMillis() - this.f197054b.f196498bc;
        }
    }

    /* renamed from: a */
    public final void mo140971a(Surface surface) {
        VideoSurface videoSurface;
        mo140996f("setSurface");
        this.f197158d.mo12860b("setSurface: ".concat(String.valueOf(surface)));
        this.f197087bg = surface;
        if (!(surface == null || (videoSurface = this.f197339m) == null || this.f197338l == null)) {
            videoSurface.mo136453a(surface);
        }
        if (this.f197336j != null) {
            this.f197054b.f196498bc = System.currentTimeMillis();
            if (this.f197340n != 1 || this.f197339m == null) {
                this.f197336j.mo16691a(surface);
            } else {
                this.f197054b.f196502bg = true;
                this.f197336j.mo16691a(this.f197339m);
            }
            this.f197054b.f196497bb = System.currentTimeMillis() - this.f197054b.f196498bc;
        }
    }

    /* renamed from: a */
    public final void mo140973a(AbstractC86157e eVar) {
        this.f197191dg = eVar;
        this.f197054b.f196763z = this.f197195dk;
    }

    /* renamed from: a */
    public final void mo140980a(C87132c[] cVarArr) {
        mo140996f("setPlayURLS");
        this.f197335i.mo140893a(cVarArr);
        this.f197038ak = 0;
        if (this.f197071bQ != null && this.f197335i.mo140908e().f196913a != this.f197071bQ) {
            m151132l("setPlayURLs");
        }
    }

    /* renamed from: a */
    public final boolean mo140982a(String str) {
        mo140996f("playResolution");
        if (this.f197335i.f196886b != 2 || this.f197345s != EnumC87177o.PREPARED) {
            return false;
        }
        if (this.f196994P.equals(str)) {
            return true;
        }
        this.f197317g.mo140956a();
        this.f197150cs = -1;
        this.f196981C = 0;
        this.f197054b.mo140854a(this.f197071bQ, "none", "setting_" + this.f196994P + "_to_" + str, 0);
        this.f197054b.f196481bL = "manual_abr_" + this.f196994P + "_to_" + str;
        m151111Q();
        this.f196994P = str;
        if (this.f196984F.equals("abr_bb_4live") || (this.f196984F.equals("rad") && !str.equals("auto"))) {
            String a = this.f197335i.mo140891a(this.f196994P.equals("auto") ? this.f197335i.mo140889a() : this.f196994P, this.f196996R, this.f196995Q);
            if (TextUtils.isEmpty(a)) {
                return false;
            }
            mo141012v();
            this.f197054b.mo140869d();
            mo141010t();
            this.f196999W = true;
            mo140990d();
            mo140995f();
            this.f197054b.f196745h = a;
            this.f197039al = true;
            this.f197054b.f196538cP = System.currentTimeMillis();
            mo140994e(a);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo140979a(boolean z) {
        C87119b bVar = this.f197054b;
        if (bVar != null) {
            if (bVar.f196748k && !z) {
                this.f197054b.f196577dB = System.currentTimeMillis();
            }
            this.f197054b.f196748k = z;
        }
    }

    /* renamed from: a */
    public final void mo140967a() {
        this.f197196dl = true;
        this.f197054b.f196437aU = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0665  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0683  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0701  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x079b  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x07fe  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0835  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0859  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0897  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0933  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x093c  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0945  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x094e  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0970  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0980  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0990  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x09c7  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x09d2  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0a53  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0a63  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0a6e  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0a8c  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0a99  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0aa2  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0aab  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0abd  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0ac6  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0acf  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0ad8  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0aed  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0af4  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0b2b  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0b48  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0bac  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0bbb  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0bcb  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0bd9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0526  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m151096B() {
        /*
        // Method dump skipped, instructions count: 3046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.m151096B():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a03, code lost:
        if (r0 == 1) goto L_0x0be0;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m151098D() {
        /*
        // Method dump skipped, instructions count: 3093
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.m151098D():void");
    }

    /* renamed from: a */
    public final void mo140970a(int i, String str) {
        C87130a aVar;
        if (i == 26) {
            this.f197352z = str;
            if (this.f197336j != null) {
                String sb = new StringBuilder().append(System.currentTimeMillis()).toString();
                this.f197070bP = sb;
                this.f197336j.mo16688a(17, sb);
                this.f197336j.mo16687a(14, 1);
                this.f197336j.mo16705a(str);
            }
        } else if (i == 43) {
            m151111Q();
            this.f196994P = str;
            if (this.f197336j != null && (aVar = this.f197335i) != null && aVar.f196886b == 2) {
                long c = this.f197335i.mo140901c(this.f196994P, this.f196995Q);
                if (c > 0) {
                    this.f197336j.mo16687a(650, (int) c);
                    this.f197054b.f196531cI = 1;
                }
            }
        } else if (i == 60) {
            this.f196996R = str;
            this.f197054b.mo140864b(str, str);
            if (this.f197336j == null) {
                return;
            }
            if (this.f196996R.equals("avph") || this.f196996R.equals("cmaf")) {
                this.f197336j.mo16688a(315, str);
            }
        } else if (i == 81) {
            this.f197310ft = str;
        } else if (i == 86) {
            this.f197049av = str;
            m151101G();
        } else if (i == 89) {
            this.f197311fu = str;
        } else if (i != 91) {
            switch (i) {
                case 63:
                    this.f197054b.f196628e = str;
                    return;
                case 64:
                    this.f197054b.f196680f = str;
                    return;
                case 65:
                    this.f196984F = str;
                    return;
                case 66:
                    if (str.equals("tcp") || str.equals("quic")) {
                        this.f197154cw = str;
                    }
                    this.f197172dN = true;
                    return;
                default:
                    switch (i) {
                        case 72:
                            this.f197089bj = str;
                            return;
                        case 73:
                            this.f197090bk = str;
                            return;
                        case 74:
                            this.f197091bl = str;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            m151129i(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140969a(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 834
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.mo140969a(int, int):void");
    }

    /* renamed from: a */
    public final long mo140966a(int i, long j) {
        AbstractC86253m mVar;
        if (i == 0) {
            AbstractC86253m mVar2 = this.f197336j;
            return mVar2 != null ? (mVar2.mo16684a(63, 0L) * 8) / 1000 : j;
        } else if (i == 68) {
            AbstractC86253m mVar3 = this.f197336j;
            return mVar3 != null ? (mVar3.mo16684a(63, 0L) * 8) / 1000 : j;
        } else if (i == 78) {
            AbstractC86253m mVar4 = this.f197336j;
            return mVar4 != null ? (long) mVar4.mo16710b(379, 0) : j;
        } else if (i == 79) {
            return (long) this.f197236eY;
        } else {
            if (i != 98) {
                return (i == 99 && (mVar = this.f197336j) != null) ? (long) mVar.mo16710b(157, -1) : j;
            }
            AbstractC86253m mVar5 = this.f197336j;
            return mVar5 != null ? (long) mVar5.mo16710b(141, -1) : j;
        }
    }

    /* renamed from: a */
    public final void mo140968a(int i, float f) {
        if (i != 19) {
            if (i == 20 && this.f197210dz != 1) {
                this.f197068bN = f;
                AbstractC86253m mVar = this.f197336j;
                if (mVar != null) {
                    mVar.mo16683a(191, f);
                    this.f197054b.f196398I = f;
                }
            }
        } else if (this.f197210dz != 1) {
            this.f197066bL = f;
            AbstractC86253m mVar2 = this.f197336j;
            if (mVar2 != null) {
                mVar2.mo16683a(80, f);
                this.f197054b.f196396G = f;
            }
        }
    }

    /* renamed from: a */
    private void m151121a(boolean z, String str) {
        if (this.f197346t == EnumC87165c.PLAYED || this.f197346t == EnumC87165c.PAUSED) {
            if (z) {
                mo140990d();
            } else {
                this.f197345s = EnumC87177o.INITIALIZED;
            }
            m151131k(str);
            this.f197346t = EnumC87165c.STOPPED;
            this.f197052ay = 0;
            this.f197043ap = 0;
            this.f197013aL = 0;
            this.f197027aZ = 0;
            this.f197323gf = false;
            this.f197287fW = false;
            this.f197325gh = -1;
            this.f197054b.f196528cF = -1;
            this.f197054b.f196529cG = -1.0f;
            this.f197054b.f196530cH = -1.0f;
            this.f197054b.f196600dY.clear();
            this.f197256es = null;
            return;
        }
        this.f197054b.mo140863b(str);
        this.f197158d.mo12860b("illegal call: " + str + " -- " + this.f197322ge);
    }

    /* renamed from: a */
    public final void mo140976a(Boolean bool) {
        this.f197334h.mo140954a(bool.booleanValue());
        this.f197054b.f196528cF = bool.booleanValue() ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo140974a(C87122c cVar) {
        AbstractC86253m mVar;
        if (cVar != null && (mVar = this.f197336j) != null) {
            cVar.f196848d = mVar.mo16684a(68, -1L);
            cVar.f196864t = this.f197336j.mo16684a(318, -1L);
            cVar.f196784Q = this.f197336j.mo16684a(345, -1L);
            cVar.f196785R = this.f197336j.mo16684a(346, -1L);
            cVar.f196850f = this.f197336j.mo16684a(69, -1L);
            cVar.f196851g = this.f197336j.mo16684a(70, -1L);
            cVar.f196852h = this.f197336j.mo16684a(75, -1L);
            cVar.f196853i = this.f197336j.mo16684a(76, -1L);
            cVar.f196854j = this.f197336j.mo16684a(77, -1L);
            cVar.f196855k = this.f197336j.mo16684a(78, -1L);
            cVar.f196860p = this.f197336j.mo16684a(155, -1L);
            cVar.f196861q = this.f197336j.mo16684a(162, -1L);
            cVar.f196862r = this.f197336j.mo16684a(156, -1L);
            cVar.f196863s = this.f197336j.mo16684a(163, -1L);
            cVar.f196820aa = (this.f197336j.mo16684a(63, 0L) * 8) / 1000;
            cVar.f196823ad = this.f197336j.mo16684a(73, 0L);
            cVar.f196822ac = this.f197336j.mo16684a(72, 0L);
            cVar.f196842aw = this.f196994P;
            cVar.f196834ao = this.f197336j.mo16684a(458, 0L);
            cVar.f196835ap = this.f197336j.mo16684a(459, 0L);
            cVar.f196836aq = this.f197336j.mo16727o();
            cVar.f196837ar = this.f197336j.mo16684a(624, 0L);
            cVar.f196838as = this.f197336j.mo16684a(338, 0L);
            cVar.f196839at = this.f197336j.mo16684a(336, 0L);
            cVar.f196840au = this.f197336j.mo16684a(337, 0L);
            cVar.f196780M = this.f197336j.mo16684a(341, -1L);
            cVar.f196781N = this.f197336j.mo16684a(343, -1L);
            cVar.f196782O = this.f197336j.mo16684a(342, -1L);
            cVar.f196783P = this.f197336j.mo16684a(344, -1L);
            cVar.f196786S = this.f197336j.mo16684a(821, 0L);
            cVar.f196787T = this.f197336j.mo16684a(822, 0L);
            cVar.f196788U = this.f197336j.mo16684a(45, 0L);
        }
    }

    /* renamed from: a */
    public final void mo140975a(C87122c cVar, int i) {
        AbstractC86253m mVar;
        if (!(cVar == null || (mVar = this.f197336j) == null)) {
            cVar.f196798aD = mVar.mo16710b(466, 0);
            cVar.f196797aC = this.f197336j.mo16710b(465, -1);
            cVar.f196817aW = this.f197336j.mo16710b(349, 0);
            if (TextUtils.equals(this.f197154cw, "h2") || TextUtils.equals(this.f197154cw, "h2q") || TextUtils.equals(this.f197154cw, "h2qu")) {
                cVar.f196803aI = this.f197336j.mo16710b(945, -1);
                cVar.f196804aJ = this.f197336j.mo16710b(947, -1);
            }
            if (i == 0 || i == 2) {
                cVar.f196848d = this.f197336j.mo16684a(68, -1L);
                cVar.f196864t = this.f197336j.mo16684a(318, -1L);
                cVar.f196784Q = this.f197336j.mo16684a(345, -1L);
                cVar.f196785R = this.f197336j.mo16684a(346, -1L);
                cVar.f196788U = this.f197336j.mo16684a(45, 0L);
                if (this.f197293fc == 1 && this.f197333gp == 1) {
                    cVar.f196819aY = ((Integer) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(0, 16, -1, null)).intValue();
                }
                if (!TextUtils.isEmpty(this.f197154cw) && (this.f197154cw.equals("quic") || this.f197154cw.equals("quicu"))) {
                    String c = this.f197336j.mo16713c(946);
                    if (!TextUtils.isEmpty(c)) {
                        cVar.f196845az = c;
                    }
                    cVar.f196801aG = this.f197336j.mo16710b(355, -1);
                    cVar.f196799aE = this.f197336j.mo16710b(351, -1);
                }
                if (!TextUtils.isEmpty(this.f197154cw) && (this.f197154cw.equals("quic") || this.f197154cw.equals("quicu") || this.f197154cw.equals("h2q") || this.f197154cw.equals("h2qu"))) {
                    cVar.f196796aB = this.f197336j.mo16710b(948, -1);
                    String c2 = this.f197336j.mo16713c(949);
                    if (!TextUtils.isEmpty(c2)) {
                        cVar.f196795aA = c2;
                    }
                }
                String str = this.f196996R;
                if (str != null && (str.equals("cmaf") || this.f196996R.equals("avph"))) {
                    cVar.f196772E = this.f197336j.mo16684a(264, -1L);
                    cVar.f196773F = this.f197336j.mo16684a(267, -1L);
                    cVar.f196770C = this.f197336j.mo16684a(265, -1L);
                    cVar.f196771D = this.f197336j.mo16684a(268, -1L);
                    cVar.f196775H = this.f197336j.mo16684a(269, -1L);
                    cVar.f196774G = this.f197336j.mo16684a(266, -1L);
                    cVar.f196776I = this.f197336j.mo16684a(272, -1L);
                    cVar.f196777J = this.f197336j.mo16684a(273, -1L);
                    cVar.f196778K = this.f197336j.mo16684a(274, -1L);
                    cVar.f196779L = this.f197336j.mo16684a(275, -1L);
                    if (this.f196996R.equals("cmaf")) {
                        cVar.f196865u = this.f197336j.mo16684a(457, -1L);
                        cVar.f196866v = this.f197336j.mo16684a(450, -1L);
                        cVar.f196868x = this.f197336j.mo16684a(451, -1L);
                        cVar.f196870z = this.f197336j.mo16684a(452, -1L);
                        cVar.f196869y = this.f197336j.mo16684a(456, -1L);
                        cVar.f196768A = this.f197336j.mo16684a(453, -1L);
                        cVar.f196769B = this.f197336j.mo16684a(454, -1L);
                        cVar.f196867w = this.f197336j.mo16684a(455, -1L);
                    }
                }
                if (mo141013w()) {
                    cVar.f196809aO = this.f197336j.mo16684a(806, -1L);
                    cVar.f196810aP = this.f197336j.mo16684a(807, -1L);
                    cVar.f196811aQ = this.f197336j.mo16684a(808, -1L);
                    cVar.f196812aR = this.f197336j.mo16684a(809, -1L);
                }
                cVar.f196850f = this.f197336j.mo16684a(69, -1L);
                cVar.f196851g = this.f197336j.mo16684a(70, -1L);
                cVar.f196852h = this.f197336j.mo16684a(75, -1L);
                cVar.f196853i = this.f197336j.mo16684a(76, -1L);
                cVar.f196854j = this.f197336j.mo16684a(77, -1L);
                cVar.f196855k = this.f197336j.mo16684a(78, -1L);
                cVar.f196860p = this.f197336j.mo16684a(155, -1L);
                cVar.f196861q = this.f197336j.mo16684a(162, -1L);
                cVar.f196862r = this.f197336j.mo16684a(156, -1L);
                cVar.f196863s = this.f197336j.mo16684a(163, -1L);
                cVar.f196820aa = (this.f197336j.mo16684a(63, 0L) * 8) / 1000;
                cVar.f196823ad = this.f197336j.mo16684a(73, 0L);
                cVar.f196822ac = this.f197336j.mo16684a(72, 0L);
                cVar.f196842aw = this.f196994P;
                cVar.f196834ao = this.f197336j.mo16684a(458, 0L);
                cVar.f196835ap = this.f197336j.mo16684a(459, 0L);
                cVar.f196836aq = this.f197336j.mo16727o();
                cVar.f196837ar = this.f197336j.mo16684a(624, 0L);
                cVar.f196838as = this.f197336j.mo16684a(338, 0L);
                cVar.f196839at = this.f197336j.mo16684a(336, 0L);
                cVar.f196840au = this.f197336j.mo16684a(337, 0L);
                cVar.f196780M = this.f197336j.mo16684a(341, -1L);
                cVar.f196781N = this.f197336j.mo16684a(343, -1L);
                cVar.f196782O = this.f197336j.mo16684a(342, -1L);
                cVar.f196783P = this.f197336j.mo16684a(344, -1L);
                cVar.f196786S = this.f197336j.mo16684a(821, 0L);
                cVar.f196787T = this.f197336j.mo16684a(822, 0L);
                if (i == 0) {
                    cVar.f196816aV = this.f197336j.mo16710b(518, -1);
                    cVar.f196824ae = cVar.f196820aa;
                    cVar.f196825af = cVar.f196822ac;
                    cVar.f196826ag = cVar.f196823ad;
                    cVar.f196828ai = this.f197336j.mo16710b(25, -1);
                    cVar.f196841av = this.f197264f.mo140943c();
                    cVar.f196858n = this.f197336j.mo16684a(210, -1L);
                    cVar.f196856l = System.currentTimeMillis();
                    cVar.f196821ab = this.f197336j.mo16710b(931, 0);
                    cVar.f196849e = this.f197336j.mo16684a(970, 0L);
                    String c3 = this.f197336j.mo16713c(335);
                    if (c3 != null) {
                        String[] split = c3.split("\r\n");
                        for (String str2 : split) {
                            if (str2.startsWith("X-Server-Ip: ")) {
                                cVar.f196843ax = str2.split(": ", 2)[1];
                            } else if (str2.startsWith("Via: ")) {
                                cVar.f196844ay = str2.split(": ", 2)[1];
                            }
                        }
                    }
                }
                if (!this.f197349w && i == 2) {
                    cVar.f196827ah = this.f197336j.mo16684a(314, 0L);
                } else if (i == 0) {
                    cVar.f196802aH = this.f197336j.mo16710b(352, -1);
                }
                if (this.f197014aM) {
                    if (i == 0) {
                        this.f197276fL.mo141019a();
                    }
                    if (this.f197276fL.f197385a != -1) {
                        cVar.f196848d = this.f197276fL.f197385a;
                    }
                    if (this.f197276fL.f197386b != -1) {
                        cVar.f196850f = this.f197276fL.f197386b;
                    }
                    if (this.f197276fL.f197387c != -1) {
                        cVar.f196851g = this.f197276fL.f197387c;
                    }
                    if (this.f197154cw.equals("quic") || this.f197154cw.equals("quicu")) {
                        if (i == 0) {
                            cVar.f196802aH = (int) LiveIOWrapper.getInstance().getLongValueByStr(this.f197026aY, 1106);
                        }
                        cVar.f196801aG = (int) LiveIOWrapper.getInstance().getLongValueByStr(this.f197026aY, 1105);
                        cVar.f196800aF = (int) LiveIOWrapper.getInstance().getLongValueByStr(this.f197026aY, 1106);
                        cVar.f196799aE = (int) LiveIOWrapper.getInstance().getLongValueByStr(this.f197026aY, 1107);
                    }
                }
            } else if (i == 1) {
                cVar.f196788U = this.f197336j.mo16684a(45, 0L);
                cVar.f196789V = this.f197336j.mo16684a(46, 0L);
                cVar.f196793Z = this.f197336j.mo16708b(150);
                cVar.f196820aa = (this.f197336j.mo16684a(63, 0L) * 8) / 1000;
                cVar.f196823ad = this.f197336j.mo16684a(73, 0L);
                cVar.f196822ac = this.f197336j.mo16684a(72, 0L);
                cVar.f196792Y = (long) this.f197336j.mo16723k();
                cVar.f196790W = System.currentTimeMillis();
                cVar.f196841av = this.f197264f.mo140943c();
                cVar.f196842aw = this.f196994P;
                if (mo141013w()) {
                    cVar.f196813aS = this.f197336j.mo16713c(810);
                    String str3 = cVar.f196813aS;
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str3);
                            if (jSONObject.has("video_codec_impl_name")) {
                                String optString = jSONObject.optString("video_codec_impl_name");
                                if (!TextUtils.isEmpty(optString)) {
                                    if ("MediaCodec".equals(optString)) {
                                        this.f197054b.f196393D = "hardware_codec";
                                        this.f197054b.f196392C = true;
                                    } else {
                                        this.f197054b.f196393D = "software_codec";
                                        this.f197054b.f196392C = false;
                                    }
                                }
                            }
                            if (jSONObject.has("video_codec_name")) {
                                String optString2 = jSONObject.optString("video_codec_name");
                                if (!TextUtils.isEmpty(optString2)) {
                                    if ("ByteVC1".equalsIgnoreCase(optString2)) {
                                        this.f197054b.f196391B = "bytevc1";
                                    } else {
                                        this.f197054b.f196391B = "h264";
                                    }
                                }
                            }
                            if (jSONObject.has("video_recv_media_bps")) {
                                cVar.f196820aa = jSONObject.getLong("video_recv_media_bps") / 1000;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (i == 3) {
                cVar.f196793Z = this.f197336j.mo16708b(150);
                cVar.f196820aa = (this.f197336j.mo16684a(63, 0L) * 8) / 1000;
                cVar.f196823ad = this.f197336j.mo16684a(73, 0L);
                cVar.f196842aw = this.f196994P;
            } else if (i == 4) {
                cVar.f196823ad = this.f197336j.mo16684a(73, 0L);
                cVar.f196822ac = this.f197336j.mo16684a(72, 0L);
            } else if (i == 5) {
                cVar.f196806aL = this.f197336j.mo16684a(73, -1L);
                cVar.f196805aK = this.f197336j.mo16684a(72, -1L);
            } else if (i == 6) {
                cVar.f196808aN = this.f197336j.mo16684a(73, -1L);
                cVar.f196807aM = this.f197336j.mo16684a(72, -1L);
            } else if (i == 7) {
                int b = this.f197336j.mo16710b(61, -1);
                int b2 = this.f197336j.mo16710b(62, -1);
                if (b == 1) {
                    if (b2 == 1) {
                        cVar.f196814aT = 2;
                    } else {
                        cVar.f196814aT = 1;
                    }
                } else if (b2 == 1) {
                    cVar.f196814aT = 0;
                }
                if (!TextUtils.isEmpty(this.f197154cw) && (this.f197154cw.equals("quic") || this.f197154cw.equals("quicu"))) {
                    String c4 = this.f197336j.mo16713c(946);
                    if (!TextUtils.isEmpty(c4)) {
                        cVar.f196845az = c4;
                    }
                    cVar.f196801aG = this.f197336j.mo16710b(355, -1);
                    cVar.f196799aE = this.f197336j.mo16710b(351, -1);
                }
                if (!TextUtils.isEmpty(this.f197154cw) && (this.f197154cw.equals("quic") || this.f197154cw.equals("quicu") || this.f197154cw.equals("h2q") || this.f197154cw.equals("h2qu"))) {
                    cVar.f196796aB = this.f197336j.mo16710b(948, -1);
                    String c5 = this.f197336j.mo16713c(949);
                    if (!TextUtils.isEmpty(c5)) {
                        cVar.f196795aA = c5;
                    }
                }
            } else if (i == 8) {
                String c6 = this.f197336j.mo16713c(147);
                if (c6 != null) {
                    cVar.f196815aU = m151135o(c6);
                }
            } else if (i == 9) {
                String c7 = this.f197336j.mo16713c(710);
                if (!TextUtils.isEmpty(c7)) {
                    cVar.f196818aX = m151134n(c7);
                }
            }
            if (cVar.f196800aF == -1) {
                cVar.f196800aF = this.f197336j.mo16710b(352, -1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05d9  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0714  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0791  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0809  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0810  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0819 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x082b A[SYNTHETIC, Splitter:B:262:0x082b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140978a(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 2142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.mo140978a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final boolean mo140981a(int i) {
        if (this.f196995Q.equals("main")) {
            String a = this.f197335i.mo140891a(this.f196994P.equals("auto") ? this.f197335i.mo140889a() : this.f196994P, "flv", "backup");
            if (!TextUtils.isEmpty(a)) {
                mo141012v();
                this.f197054b.mo140869d();
                mo141010t();
                this.f196999W = true;
                this.f197054b.mo140854a(this.f197071bQ, a, "main_to_backup", i);
                this.f197054b.f196745h = a;
                this.f197071bQ = a;
                this.f196995Q = "backup";
                m151138z();
                m151095A();
                this.f197317g.mo140956a();
                mo140995f();
                this.f197267fC = System.currentTimeMillis();
                this.f197258eu = true;
                mo140994e(a);
                this.f196981C = 0;
                return true;
            }
        } else if (this.f196995Q.equals("backup")) {
            String a2 = this.f197335i.mo140891a(this.f196994P.equals("auto") ? this.f197335i.mo140889a() : this.f196994P, "flv", "main");
            if (!TextUtils.isEmpty(a2)) {
                mo141012v();
                this.f197054b.mo140869d();
                mo141010t();
                this.f196999W = true;
                this.f197054b.mo140854a(this.f197071bQ, a2, "backup_to_main", i);
                this.f197054b.f196745h = a2;
                this.f197071bQ = a2;
                this.f196995Q = "main";
                m151138z();
                m151095A();
                this.f197317g.mo140956a();
                mo140995f();
                this.f197267fC = System.currentTimeMillis();
                this.f197258eu = true;
                mo140994e(a2);
                this.f196981C = 0;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$g */
    public static final class C87169g implements AbstractC86253m.AbstractC86258e {

        /* renamed from: a */
        private final WeakReference<C87154g> f197393a;

        static {
            Covode.recordClassIndex(102970);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86258e
        /* renamed from: a */
        public final boolean mo16760a(AbstractC86253m mVar, int i, int i2) {
            String str;
            boolean z;
            int i3;
            C87154g gVar = this.f197393a.get();
            if (gVar == null || gVar.f197336j == null) {
                return false;
            }
            if (i != -268435437) {
                if (i != 3) {
                    if (i == 251658247) {
                        gVar.f197054b.f196399J++;
                        StringBuilder sb = new StringBuilder();
                        C87119b bVar = gVar.f197054b;
                        StringBuilder append = sb.append(bVar.f196400K).append(",");
                        double d = (double) i2;
                        Double.isNaN(d);
                        double d2 = d / 1000.0d;
                        bVar.f196400K = append.append(d2).append(":").append(System.currentTimeMillis()).toString();
                        if (gVar.f197054b.f196401L.equals("none")) {
                            gVar.f197054b.f196401L = (System.currentTimeMillis() - gVar.f197054b.mo140840a(101, 0)) + ":" + d2;
                            return false;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        C87119b bVar2 = gVar.f197054b;
                        bVar2.f196401L = sb2.append(bVar2.f196401L).append(",").append(System.currentTimeMillis() - gVar.f197054b.mo140840a(101, 0)).append(":").append(d2).toString();
                        return false;
                    } else if (i == 701) {
                        gVar.f196981C++;
                        gVar.mo141010t();
                        gVar.f196982D = true;
                        gVar.f197158d.mo12859b();
                        if (!gVar.f197348v) {
                            gVar.f197028aa = System.currentTimeMillis();
                            gVar.f197054b.mo140846a(i2, false);
                        } else {
                            gVar.f197054b.mo140846a(i2, true);
                            if (gVar.f197344r) {
                                C87125b.m150939a(7213, gVar.f197054b.f196411V, i2);
                            }
                            if (gVar.f197014aM) {
                                LiveIOWrapper.getInstance().setInt64ValueByStrKey(1003, gVar.f197026aY, (long) i2);
                            }
                        }
                        if (gVar.f196983E && gVar.f197335i.f196886b == 2) {
                            if (!gVar.f196984F.equals("rad") || gVar.f196981C < gVar.f196985G) {
                                if (gVar.f196984F.equals("abr_bb_4live") && gVar.f196994P.equals("auto") && gVar.f197046as == 3 && gVar.f196981C >= gVar.f196985G) {
                                    if (gVar.f197336j == null) {
                                        return false;
                                    }
                                    gVar.f197336j.mo16687a(545, 1);
                                    return false;
                                }
                            } else if (gVar.mo141008r()) {
                                return false;
                            }
                        }
                        if (gVar.f196993O) {
                            return false;
                        }
                        if (gVar.f197041an == 1 && gVar.f197336j.mo16684a(530, -1L) == 0 && gVar.f197336j.mo16684a(531, -1L) == 0) {
                            gVar.f197040am = true;
                        }
                        gVar.f197317g.mo140960a(true, gVar.f197040am);
                        return false;
                    } else if (i != 702) {
                        switch (i) {
                            case -268435442:
                                gVar.f197054b.mo140848a((long) i2, C87154g.f196975X, true);
                                return false;
                            case -268435441:
                                gVar.f197054b.mo140848a((long) i2, C87154g.f196975X, false);
                                return false;
                            case -268435440:
                                gVar.f197054b.mo140862b((long) i2, C87154g.f196976Y, true);
                                return false;
                            case -268435439:
                                gVar.f197054b.mo140862b((long) i2, C87154g.f196976Y, false);
                                return false;
                            default:
                                switch (i) {
                                    case -268435424:
                                        gVar.f197054b.mo140850a((long) i2, true);
                                        return false;
                                    case -268435423:
                                        gVar.f197054b.mo140850a((long) i2, false);
                                        return false;
                                    default:
                                        String str2 = null;
                                        switch (i) {
                                            case -268435407:
                                                System.currentTimeMillis();
                                                gVar.f197054b.f196583dH = System.currentTimeMillis();
                                                gVar.f197054b.f196584dI = (long) i2;
                                                return false;
                                            case -268435406:
                                                System.currentTimeMillis();
                                                long currentTimeMillis = System.currentTimeMillis();
                                                long j = ((long) i2) - gVar.f197054b.f196584dI;
                                                long j2 = currentTimeMillis - gVar.f197054b.f196583dH;
                                                if (j <= ((long) gVar.f197016aO)) {
                                                    return false;
                                                }
                                                gVar.f197054b.f196585dJ++;
                                                gVar.f197054b.f196586dK++;
                                                gVar.f197054b.f196587dL += j2;
                                                gVar.f197054b.f196588dM += j2;
                                                gVar.f197054b.f196589dN += j;
                                                gVar.f197054b.f196590dO += j;
                                                try {
                                                    str2 = new JSONObject().put("start_time", gVar.f197054b.f196583dH).put("end_time", currentTimeMillis).put("start_pts", gVar.f197054b.f196584dI).put("end_pts", i2).put("info", gVar.f197336j.mo16713c(825)).toString();
                                                } catch (JSONException e) {
                                                    e.printStackTrace();
                                                }
                                                if (((long) (gVar.f197054b.f196594dS.length() + str2.length())) < ((long) gVar.f197054b.f196592dQ)) {
                                                    gVar.f197054b.f196594dS += str2;
                                                }
                                                if (((long) (gVar.f197054b.f196593dR.length() + str2.length())) >= ((long) gVar.f197054b.f196591dP)) {
                                                    return false;
                                                }
                                                gVar.f197054b.f196593dR += str2;
                                                return false;
                                            default:
                                                switch (i) {
                                                    case 251658249:
                                                        int i4 = i2 / 1000;
                                                        if (!gVar.f196983E || !gVar.f196984F.equals("abr_bb_4live") || gVar.f197335i.f196886b != 2) {
                                                            return false;
                                                        }
                                                        C87130a aVar = gVar.f197335i;
                                                        long j3 = (long) i4;
                                                        String str3 = gVar.f196995Q;
                                                        if (aVar.f196886b == 2 && aVar.f196885a != null) {
                                                            str2 = aVar.f196885a.mo140913a(j3, str3);
                                                        }
                                                        if (TextUtils.isEmpty(str2) && gVar.f197054b.f196570cv == 1 && j3 == gVar.f197047at / 1000) {
                                                            str2 = "origin";
                                                        }
                                                        String a = gVar.f197335i.mo140889a();
                                                        if (a == null || a.equals(str2)) {
                                                            return false;
                                                        }
                                                        if (str2 != null) {
                                                            gVar.f197054b.f196481bL = "abr_" + gVar.f197335i.mo140889a() + "_to_" + str2;
                                                            gVar.f197335i.mo140900b(str2);
                                                            gVar.f197054b.f196521bz = str2;
                                                            String replace = gVar.f197335i.mo140891a(gVar.f196994P, gVar.f196996R, gVar.f196995Q).replace("mem://llash/", "");
                                                            gVar.f197054b.f196524cB = gVar.f197335i.mo140891a(str2, gVar.f196996R, gVar.f196995Q) + "&llash=" + replace;
                                                        } else {
                                                            gVar.f197054b.f196481bL = "none";
                                                        }
                                                        gVar.f197054b.f196473bD++;
                                                        StringBuilder sb3 = new StringBuilder();
                                                        C87119b bVar3 = gVar.f197054b;
                                                        bVar3.f196474bE = sb3.append(bVar3.f196474bE).append(",").append(i4).append(":").append(System.currentTimeMillis()).toString();
                                                        gVar.f197054b.f196477bH = (gVar.f197336j.mo16684a(63, 0L) * 8) / 1000;
                                                        gVar.f197054b.f196478bI = gVar.f197336j.mo16684a(73, 0L);
                                                        gVar.f197054b.f196479bJ = gVar.f197336j.mo16684a(72, 0L);
                                                        gVar.f197054b.f196480bK = gVar.f197336j.mo16684a(930, -1L);
                                                        C87119b bVar4 = gVar.f197054b;
                                                        if (!(bVar4.f196575d == null || bVar4.f196469b == null)) {
                                                            try {
                                                                JSONObject b = bVar4.mo140859b();
                                                                b.put("event_key", "abr_switch").put("auto_switch", 1).put("target_resoultion", str2).put("predict_bitrate", j3).put("abr_switch_info", bVar4.f196481bL).put("cur_download_speed", bVar4.f196477bH).put("cur_audio_buffer_time", bVar4.f196478bI).put("cur_video_buffer_time", bVar4.f196479bJ).put("stall_count", bVar4.f196443aa).put("switch_cost", bVar4.f196480bK).put("use_expect_bitrate", bVar4.f196531cI);
                                                                bVar4.f196531cI = 0;
                                                                bVar4.f196469b.mo12858a(b, "live_client_monitor_log");
                                                                if (bVar4.f196415Z > 0) {
                                                                    bVar4.f196415Z++;
                                                                }
                                                            } catch (JSONException e2) {
                                                                e2.printStackTrace();
                                                            }
                                                        }
                                                        if (!gVar.f197014aM) {
                                                            return false;
                                                        }
                                                        LiveIOWrapper.getInstance().setInt64ValueByStrKey(1104, gVar.f197026aY, -1);
                                                        return false;
                                                    case 251658250:
                                                        gVar.f197054b.mo140849a((long) i2, C87154g.f196974T, false, true);
                                                        return false;
                                                    case 251658251:
                                                        gVar.f197054b.mo140849a((long) i2, C87154g.f196973S, true, true);
                                                        return false;
                                                    case 251658252:
                                                        long a2 = gVar.f197336j.mo16684a(628, -1L);
                                                        C87119b bVar5 = gVar.f197054b;
                                                        bVar5.f196522c.f196857m = a2;
                                                        if (bVar5.f196535cM == 1) {
                                                            bVar5.f196540cR = a2;
                                                        }
                                                        if (gVar.f197336j.mo16710b(62, -1) != 0) {
                                                            return false;
                                                        }
                                                        break;
                                                    case 251658253:
                                                        gVar.f197054b.f196452aj++;
                                                        return false;
                                                    default:
                                                        return false;
                                                }
                                        }
                                }
                        }
                    } else {
                        gVar.f196982D = false;
                        gVar.f197158d.mo12861c();
                        gVar.f197317g.mo140960a(false, gVar.f197040am);
                        if (gVar.f197348v && gVar.f197054b.f196444ab) {
                            gVar.f197054b.mo140860b(1);
                        } else if (!gVar.f197348v && gVar.f197028aa != 0) {
                            gVar.f197029ab = System.currentTimeMillis() - gVar.f197028aa;
                        }
                        if (gVar.f197344r) {
                            C87125b.m150939a(7214, gVar.f197054b.f196411V, i2);
                        }
                        if (!gVar.f197014aM) {
                            return false;
                        }
                        LiveIOWrapper.getInstance().setInt64ValueByStrKey(1004, gVar.f197026aY, (long) i2);
                        return false;
                    }
                }
                if (gVar.f197005aD == 1 && gVar.f197007aF == 0 && gVar.f197009aH > 0) {
                    gVar.f197009aH = 0;
                }
                if (gVar.f197341o == 1 && gVar.f197339m != null && !gVar.f197053az) {
                    float b2 = gVar.f197336j.mo16708b(151);
                    gVar.f197054b.f196503bh = b2;
                    if (gVar.f197335i.mo140895a(gVar.f197054b.f196426aJ, gVar.f197054b.f196427aK, b2)) {
                        gVar.f197051ax = true;
                    } else {
                        gVar.f197051ax = false;
                    }
                }
                String c = gVar.f197336j.mo16713c(142);
                C87119b bVar6 = gVar.f197054b;
                if (c != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(c);
                        if (jSONObject.has("sdk_version")) {
                            bVar6.f196750m = jSONObject.getString("sdk_version");
                        }
                        if (jSONObject.has("platform")) {
                            bVar6.f196751n = jSONObject.getString("platform");
                        }
                        if (jSONObject.has("os_version")) {
                            bVar6.f196752o = jSONObject.getString("os_version");
                        }
                        if (jSONObject.has("model")) {
                            bVar6.f196753p = jSONObject.getString("model");
                        }
                        if (jSONObject.has("start_time")) {
                            bVar6.f196754q = jSONObject.getString("start_time");
                        }
                        if (jSONObject.has("is_hardware_encode")) {
                            bVar6.f196755r = jSONObject.getInt("is_hardware_encode");
                        }
                        if (jSONObject.has("min_bitrate")) {
                            bVar6.f196756s = jSONObject.getInt("min_bitrate");
                        }
                        if (jSONObject.has("max_bitrate")) {
                            bVar6.f196757t = jSONObject.getInt("max_bitrate");
                        }
                        if (jSONObject.has("default_bitrate")) {
                            bVar6.f196758u = jSONObject.getInt("default_bitrate");
                        }
                        if (jSONObject.has("hit_node_optimize")) {
                            bVar6.f196759v = jSONObject.getInt("hit_node_optimize");
                        }
                        if (jSONObject.has("push_protocol")) {
                            bVar6.f196760w = jSONObject.getString("push_protocol");
                        }
                        if (jSONObject.has("qId")) {
                            bVar6.f196761x = jSONObject.getString("qId");
                        }
                        if (jSONObject.has("link_info")) {
                            bVar6.f196762y = jSONObject.getString("link_info");
                        }
                        if (jSONObject.has("h_id")) {
                            bVar6.f196532cJ = jSONObject.getInt("h_id");
                        }
                        if (jSONObject.has("s_id")) {
                            bVar6.f196533cK = jSONObject.getInt("s_id");
                        }
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                int b3 = gVar.f197336j.mo16710b(141, -1);
                if (b3 == 0) {
                    gVar.f197054b.f196391B = "h264";
                } else if (b3 == 1) {
                    gVar.f197054b.f196391B = "bytevc1";
                }
                int b4 = gVar.f197336j.mo16710b(157, -1);
                C87119b bVar7 = gVar.f197054b;
                switch (b4) {
                    case 1:
                        str = "IOSHWCodec";
                        break;
                    case 2:
                        str = "hardware_codec";
                        break;
                    case 3:
                        str = "ff_H264_codec";
                        break;
                    case 4:
                        str = "ff_ByteVC1_codec";
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        str = "KS_ByteVC1_codec";
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        str = "JX_ByteVC1_codec";
                        break;
                    default:
                        str = "none_codec";
                        break;
                }
                bVar7.f196393D = str;
                gVar.f197054b.mo140870d(0);
                gVar.f196982D = false;
                if (gVar.f197340n == 1 && gVar.f197339m != null) {
                    gVar.f197054b.f196504bi = System.currentTimeMillis();
                }
                if (gVar.f197013aL == 1) {
                    gVar.f197054b.f196537cO = true;
                    gVar.f197054b.f196539cQ = System.currentTimeMillis();
                    if (!(gVar.f197054b.f196536cN == null || gVar.f197336j == null)) {
                        gVar.f197054b.f196536cN.f196824ae = (gVar.f197336j.mo16684a(63, 0L) * 8) / 1000;
                        gVar.f197054b.f196536cN.f196825af = gVar.f197336j.mo16684a(72, 0L);
                        gVar.f197054b.f196536cN.f196826ag = gVar.f197336j.mo16684a(73, 0L);
                    }
                }
                if (gVar.f197014aM) {
                    LiveIOWrapper.getInstance().setInt64ValueByStrKey(1007, gVar.f197026aY, System.currentTimeMillis());
                }
                if (!gVar.f197348v) {
                    if (gVar.f197340n != 1 || gVar.f197339m == null || gVar.f197012aK) {
                        gVar.f197054b.mo140861b(gVar.f197029ab);
                        gVar.f197054b.mo140841a();
                        gVar.f197348v = true;
                        gVar.f197158d.mo12854a();
                    }
                    if (gVar.f197344r) {
                        i3 = -1;
                        C87125b.m150939a(8015, gVar.f197054b.f196411V, -1);
                    } else {
                        i3 = -1;
                    }
                    if (gVar.f197054b.f196748k) {
                        if (gVar.f197344r) {
                            C87125b.m150939a(8016, gVar.f197054b.f196411V, i3);
                        }
                        if (gVar.f197014aM) {
                            LiveIOWrapper.getInstance().setInt64ValueByStrKey(1006, gVar.f197026aY, -1);
                        }
                    }
                } else if (gVar.f197045ar && gVar.f196999W) {
                    gVar.f197158d.mo12854a();
                    if (gVar.f197039al) {
                        gVar.f197039al = false;
                    } else {
                        gVar.f197054b.mo140866c(0);
                        if (gVar.f197054b.f196444ab) {
                            gVar.f197158d.mo12861c();
                            gVar.f197054b.mo140860b(2);
                        }
                        gVar.mo141009s();
                    }
                    if (gVar.f197054b.f196456an) {
                        C87119b bVar8 = gVar.f197054b;
                        bVar8.f196456an = false;
                        System.currentTimeMillis();
                        if (bVar8.f196457ao != 0) {
                            bVar8.f196458ap++;
                            bVar8.f196459aq += System.currentTimeMillis() - bVar8.f196457ao;
                        }
                    }
                }
                if (gVar.f197054b.f196667em == 1) {
                    z = false;
                    gVar.f197054b.f196667em = 0;
                } else {
                    z = false;
                }
                gVar.f197045ar = true;
                gVar.f196999W = z;
                gVar.f197317g.mo140956a();
                return false;
            }
            C87119b bVar9 = gVar.f197054b;
            long j4 = (long) i2;
            JSONObject b5 = bVar9.mo140859b();
            if (b5 == null) {
                return false;
            }
            try {
                b5.put("event_key", "pts_back").put(StringSet.type, DataType.AUDIO).put("pts_back_diff", j4);
                bVar9.f196469b.mo12858a(b5, "live_client_monitor_log");
                return false;
            } catch (JSONException e4) {
                e4.printStackTrace();
                return false;
            }
        }

        public C87169g(C87154g gVar) {
            this.f197393a = new WeakReference<>(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$k */
    public static class RunnableC87173k implements Runnable {

        /* renamed from: a */
        private AbstractC86253m f197397a;

        static {
            Covode.recordClassIndex(102974);
        }

        public final void run() {
            AbstractC86253m mVar = this.f197397a;
            if (mVar != null) {
                try {
                    mVar.mo16716d();
                    this.f197397a = null;
                } catch (Exception unused) {
                }
            }
        }

        public RunnableC87173k(AbstractC86253m mVar) {
            this.f197397a = mVar;
        }
    }

    /* renamed from: f */
    public final void mo140995f() {
        AbstractC86253m mVar = this.f197336j;
        if (mVar != null) {
            mVar.mo16720h();
        }
        this.f197345s = EnumC87177o.INITIALIZED;
    }

    /* renamed from: j */
    public final boolean mo141000j() {
        AbstractC86253m mVar = this.f197336j;
        if (mVar == null || !mVar.mo16707a()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final int mo141001k() {
        AbstractC86253m mVar = this.f197336j;
        if (mVar != null) {
            return mVar.mo16725m();
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo141002l() {
        AbstractC86253m mVar = this.f197336j;
        if (mVar != null) {
            return mVar.mo16724l();
        }
        return 0;
    }

    /* renamed from: m */
    public final String mo141003m() {
        return this.f197336j.mo16713c(5002);
    }

    /* renamed from: n */
    public final JSONObject mo141004n() {
        C87119b bVar = this.f197054b;
        if (bVar == null) {
            return null;
        }
        return bVar.mo140876h();
    }

    /* renamed from: q */
    public final int mo141007q() {
        AbstractC86253m mVar = this.f197336j;
        if (mVar != null) {
            return mVar.mo16710b(25, -1);
        }
        return -1;
    }

    /* renamed from: w */
    public final boolean mo141013w() {
        if (this.f197005aD == 1 && this.f197007aF == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final boolean mo141014x() {
        String str = this.f196980B;
        if (str == null || !str.startsWith("[")) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(102955);
    }

    /* renamed from: J */
    private boolean m151104J() {
        if (this.f197335i.f196886b != 2 || !this.f196984F.equals("abr_bb_4live") || !this.f196994P.equals("auto")) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    private void m151110P() {
        if (this.f197338l != null) {
            VideoSurface videoSurface = this.f197339m;
            if (videoSurface != null) {
                videoSurface.release();
                this.f197339m = null;
            }
            this.f197338l = null;
        }
    }

    /* renamed from: Q */
    private void m151111Q() {
        C87119b bVar;
        String str;
        if (this.f197346t != EnumC87165c.IDLE && (bVar = this.f197054b) != null) {
            if (this.f196994P.equals("auto")) {
                str = this.f197054b.f196521bz;
            } else {
                str = this.f196994P;
            }
            bVar.f196470bA = str;
        }
    }

    /* renamed from: o */
    public final boolean mo141005o() {
        if (this.f197341o != 1 || this.f197339m == null || this.f197342p || !this.f197051ax || this.f197054b.f196500be != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo141006p() {
        if (this.f197017aP != 1 || this.f197339m == null || !this.f197019aR || this.f197054b.f196500be != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final boolean mo141011u() {
        VideoSurface videoSurface = this.f197339m;
        if (videoSurface == null || videoSurface.mo136459c(15, -1) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.videoarch.a.g$a */
    public static final class C87163a {

        /* renamed from: a */
        final Context f197367a;

        /* renamed from: b */
        public AbstractC87117a f197368b;

        /* renamed from: c */
        String f197369c;

        /* renamed from: d */
        public AbstractC87127c f197370d;

        /* renamed from: e */
        public AbstractC87123b f197371e;

        /* renamed from: f */
        public boolean f197372f;

        /* renamed from: g */
        public boolean f197373g;

        /* renamed from: h */
        public int f197374h;

        /* renamed from: i */
        public int f197375i;

        /* renamed from: j */
        String f197376j;

        /* renamed from: k */
        String f197377k;

        /* renamed from: l */
        boolean f197378l;

        /* renamed from: m */
        boolean f197379m;

        /* renamed from: n */
        public long f197380n;

        /* renamed from: o */
        public long f197381o;

        /* renamed from: p */
        public long f197382p;

        /* renamed from: q */
        public long f197383q;

        /* renamed from: r */
        public ExecutorService f197384r;

        static {
            Covode.recordClassIndex(102964);
        }

        /* renamed from: a */
        public final C87154g mo141018a() {
            if (this.f197367a == null) {
                throw new IllegalArgumentException("mContext should not be null");
            } else if (this.f197368b == null) {
                throw new IllegalArgumentException("mListener should not be null");
            } else if (this.f197370d != null) {
                return new C87154g(this, (byte) 0);
            } else {
                throw new IllegalArgumentException("mNetworkClient should not be null");
            }
        }

        private C87163a(Context context) {
            this.f197374h = 60000;
            this.f197375i = 1;
            this.f197376j = "origin";
            this.f197377k = "flv";
            this.f197379m = true;
            this.f197380n = 10000;
            this.f197381o = 60000;
            this.f197382p = 5000;
            this.f197383q = 8000;
            this.f197367a = context;
        }

        /* synthetic */ C87163a(Context context, byte b) {
            this(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$b */
    public class C87164b {

        /* renamed from: a */
        public long f197385a;

        /* renamed from: b */
        public long f197386b;

        /* renamed from: c */
        public long f197387c;

        static {
            Covode.recordClassIndex(102965);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo141019a() {
            this.f197385a = LiveIOWrapper.getInstance().getLongValueByStr(C87154g.this.f197026aY, 1101);
            this.f197386b = LiveIOWrapper.getInstance().getLongValueByStr(C87154g.this.f197026aY, 1102);
            this.f197387c = LiveIOWrapper.getInstance().getLongValueByStr(C87154g.this.f197026aY, 1103);
        }

        private C87164b() {
            this.f197385a = -1;
            this.f197386b = -1;
            this.f197387c = -1;
        }

        /* synthetic */ C87164b(C87154g gVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.videoarch.a.g$c */
    public enum EnumC87165c {
        IDLE,
        PLAYED,
        PAUSED,
        STOPPED;

        static {
            Covode.recordClassIndex(102966);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$o */
    public enum EnumC87177o {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED;

        static {
            Covode.recordClassIndex(102978);
        }
    }

    /* renamed from: G */
    private void m151101G() {
        this.f197054b.f196573cy = true;
        if ((this.f197335i.f196886b != 2 || this.f197335i.mo140904c(this.f196995Q)) && !this.f197279fO.isShutdown()) {
            this.f197279fO.submit(new Runnable() {
                /* class com.p2082ss.videoarch.p4474a.C87154g.RunnableC871562 */

                static {
                    Covode.recordClassIndex(102957);
                }

                public final void run() {
                    String c;
                    C87154g gVar = C87154g.this;
                    if (!TextUtils.isEmpty(gVar.f197048au) && !TextUtils.isEmpty(gVar.f197049av) && !gVar.f197049av.equals(gVar.f196994P) && gVar.f197336j != null && (c = gVar.f197336j.mo16713c(335)) != null) {
                        String str = null;
                        String[] split = c.split("\r\n");
                        for (String str2 : split) {
                            if (str2.startsWith("X-Has-Token: ")) {
                                str = str2.split(": ", 2)[1];
                            }
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (!TextUtils.isEmpty(gVar.f197054b.f196411V)) {
                                jSONObject.put("live_stream_session_id", gVar.f197054b.f196411V);
                            }
                            String a = gVar.f197335i.mo140891a(gVar.f197049av, "flv", gVar.f196995Q);
                            if (!TextUtils.isEmpty(a)) {
                                jSONObject.put("play_url", a);
                                if (!TextUtils.isEmpty(str)) {
                                    jSONObject.put("token", str);
                                }
                                String substring = a.substring(a.indexOf("//") + 2);
                                String substring2 = substring.substring(substring.indexOf("/"));
                                if (!gVar.f197048au.startsWith("/")) {
                                    gVar.f197048au = "/" + gVar.f197048au;
                                }
                                AbstractC87127c.C87128a b = gVar.f197106c.mo12866b(a.substring(0, a.indexOf(substring2)) + gVar.f197048au, jSONObject.toString());
                                if (b != null) {
                                    gVar.f197054b.f196574cz = b.f196878d;
                                    if (b.f196878d == 200 && b.f196875a.has("code")) {
                                        gVar.f197054b.f196574cz = b.f196875a.optInt("code");
                                        if (gVar.f197054b.f196574cz == 0) {
                                            gVar.f196994P = gVar.f197049av;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: M */
    private void m151107M() {
        MethodCollector.m26663i(5411);
        synchronized (this.f197003aB) {
            try {
                Handler handler = this.f197002aA;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.f197002aA = null;
                }
                HandlerThread handlerThread = this.f197295fe;
                if (handlerThread != null) {
                    handlerThread.quit();
                    this.f197295fe = null;
                }
                this.f197004aC = false;
            } finally {
                MethodCollector.m26664o(5411);
            }
        }
    }

    /* renamed from: g */
    public final void mo140997g() {
        String str;
        if (this.f197191dg != null) {
            try {
                Class<?> cls = Class.forName("com.ss.optimizer.live.sdk.dns.a");
                if (cls != null) {
                    Method method = cls.getMethod("getCurrentNetWorkType", new Class[0]);
                    method.setAccessible(true);
                    str = (String) method.invoke(this.f197191dg, new Object[0]);
                    String str2 = this.f197153cv;
                    if (str2 != "none" && !str2.equals(str)) {
                        this.f197155cx = true;
                    }
                    this.f197153cv = str;
                }
            } catch (Throwable unused) {
            }
        }
        str = "none";
        String str22 = this.f197153cv;
        this.f197155cx = true;
        this.f197153cv = str;
    }

    /* renamed from: s */
    public final void mo141009s() {
        if ((this.f196982D || this.f196999W) && this.f197128cV == 1) {
            if (this.f197129cW != -1) {
                this.f197054b.mo140849a((long) ((int) (System.currentTimeMillis() - this.f197129cW)), 0, false, false);
            }
            if (this.f196998V != -1) {
                this.f197054b.mo140849a((long) ((int) (System.currentTimeMillis() - this.f196998V)), 0, true, false);
            }
        }
    }

    /* renamed from: t */
    public final void mo141010t() {
        if (!this.f196999W && !this.f196982D) {
            if (this.f196997U == 0 || this.f197339m == null) {
                this.f196998V = this.f197336j.mo16684a(320, -1L);
                this.f197129cW = this.f197336j.mo16684a(319, -1L);
            }
        }
    }

    /* renamed from: v */
    public final void mo141012v() {
        long a = this.f197336j.mo16684a(45, 0L);
        this.f197054b.f196485bP += a;
        long j = this.f197054b.f196484bO;
        if (!this.f197054b.f196483bN) {
            C87119b bVar = this.f197054b;
            bVar.f196484bO = a - bVar.f196522c.f196788U;
            this.f197054b.f196483bN = true;
            return;
        }
        this.f197054b.f196484bO = a + j;
    }

    /* renamed from: C */
    private void m151097C() {
        String str;
        this.f197054b.mo140853a(this.f197151ct, this.f197154cw, this.f197152cu);
        this.f197054b.f196749l = this.f197335i.mo140898b(this.f196994P, this.f196995Q);
        AbstractC86253m mVar = this.f197336j;
        if (!(mVar == null || (str = this.f196996R) == null)) {
            mVar.mo16688a(315, str);
        }
        AbstractC86253m mVar2 = this.f197336j;
        if (mVar2 != null && this.f197260ew == 1) {
            mVar2.mo16687a(302, 1);
            float f = this.f197261ex;
            if (f != -1.0f) {
                this.f197336j.mo16683a(303, f);
            }
            float f2 = this.f197262ey;
            if (f2 != -1.0f) {
                this.f197336j.mo16683a(304, f2);
            }
            float f3 = this.f197263ez;
            if (f3 != -1.0f) {
                this.f197336j.mo16683a(305, f3);
            }
            float f4 = this.f197212eA;
            if (f4 != -1.0f) {
                this.f197336j.mo16683a(306, f4);
            }
        }
    }

    /* renamed from: L */
    private void m151106L() {
        MethodCollector.m26663i(5409);
        synchronized (this.f197003aB) {
            try {
                if (!this.f197004aC) {
                    if (this.f197295fe == null) {
                        HandlerThread handlerThread = new HandlerThread("stallCounter");
                        this.f197295fe = handlerThread;
                        handlerThread.start();
                    }
                    if (this.f197002aA == null) {
                        this.f197002aA = new Handler(this.f197295fe.getLooper());
                    }
                    this.f197002aA.post(this.f197296ff);
                    this.f197004aC = true;
                    MethodCollector.m26664o(5409);
                }
            } finally {
                MethodCollector.m26664o(5409);
            }
        }
    }

    /* renamed from: y */
    private void m151137y() {
        C87130a aVar = this.f197335i;
        if (aVar != null) {
            String b = aVar.mo140898b(this.f196994P, this.f196995Q);
            if (!TextUtils.isEmpty(b)) {
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    if (jSONObject.has("ForceDecodeSwitch")) {
                        this.f197110cD = jSONObject.optInt("ForceDecodeSwitch");
                    }
                    if (jSONObject.has("ForceDecodeMsGaps")) {
                        this.f197111cE = jSONObject.optInt("ForceDecodeMsGaps");
                    }
                    if (jSONObject.has("ForceRenderMsGaps")) {
                        this.f197112cF = jSONObject.optInt("ForceRenderMsGaps");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo140987c() {
        this.f197158d.mo12860b("stop start -- " + this.f197322ge);
        mo140996f("stop");
        m151121a(true, "stop");
        m151110P();
        this.f197317g.f196965g = false;
        this.f197158d.mo12860b("stop end-- " + this.f197322ge);
    }

    /* renamed from: d */
    public final void mo140990d() {
        String str;
        if (this.f197336j != null && (this.f197345s == EnumC87177o.PREPARED || this.f197345s == EnumC87177o.PREPARING)) {
            C87119b bVar = this.f197054b;
            if (bVar != null) {
                bVar.mo140874f();
                this.f197054b.mo140875g();
                if (this.f196991M == 1 || this.f197137cf == 1) {
                    this.f197054b.mo140879j();
                }
            }
            if (this.f197346t != EnumC87165c.PAUSED) {
                this.f197336j.mo16721i();
                mo140997g();
            } else {
                this.f197336j.mo16720h();
            }
        }
        if (this.f197344r && (str = this.f196990L) != null) {
            C87125b.m150939a(8018, str, 0);
        }
        if (this.f197014aM && this.f197026aY != null) {
            if (this.f197054b.f196748k) {
                LiveIOWrapper.getInstance().setInt64ValueByStrKey(1006, this.f197026aY, -1);
            }
            if (!this.f197348v) {
                this.f197276fL.mo141019a();
            }
            LiveIOWrapper.getInstance().notifyFinish(this.f197026aY, (String) null);
        }
        this.f197345s = EnumC87177o.INITIALIZED;
    }

    /* renamed from: e */
    public final void mo140993e() {
        mo140996f("reset");
        if (this.f197336j != null) {
            m151132l("reset");
            this.f197054b.mo140872e();
            this.f197070bP = null;
            this.f197352z = null;
            this.f196983E = false;
            this.f197237eZ = false;
            this.f196986H = true;
            this.f197341o = 0;
            this.f197340n = 0;
            this.f197043ap = 0;
            this.f196994P = "origin";
            this.f197150cs = -1;
            this.f196996R = "flv";
            this.f197154cw = "tcp";
            this.f197151ct = "none";
            this.f197152cu = "none";
            this.f196995Q = "main";
            this.f196992N = null;
            this.f196993O = false;
            this.f197069bO = 0;
            this.f197064bJ = -1;
            this.f197157cz = "";
            this.f197170dL = false;
            this.f197348v = false;
            this.f197253ep = 0;
            this.f197005aD = 0;
            this.f197006aE = 0;
        }
    }

    /* renamed from: h */
    public final void mo140998h() {
        this.f197158d.mo12860b("release start -- " + this.f197322ge);
        mo140996f("release");
        if (this.f197346t == EnumC87165c.PLAYED || this.f197346t == EnumC87165c.PAUSED) {
            m151121a(true, "release");
        }
        m151110P();
        this.f197279fO.shutdown();
        this.f197001a.removeCallbacksAndMessages(null);
        AbstractC86253m mVar = this.f197336j;
        if (mVar != null) {
            mVar.mo16714c();
            this.f197336j.mo16716d();
            this.f197336j = null;
            this.f197054b.mo140872e();
            this.f197345s = EnumC87177o.IDLE;
            this.f197346t = EnumC87165c.IDLE;
            this.f197026aY = null;
            this.f197158d.mo12860b("release end -- " + this.f197322ge);
            this.f197322ge = -1;
        }
    }

    /* renamed from: com.ss.videoarch.a.g$l */
    static final class C87174l implements C87151a.AbstractC87153a {

        /* renamed from: a */
        private final WeakReference<C87154g> f197398a;

        static {
            Covode.recordClassIndex(102975);
        }

        @Override // com.p2082ss.videoarch.p4474a.p4480f.C87151a.AbstractC87153a
        /* renamed from: a */
        public final void mo140962a() {
            String str;
            C87154g gVar = this.f197398a.get();
            if (gVar != null && gVar.f197336j != null) {
                gVar.mo141012v();
                gVar.f197054b.mo140869d();
                gVar.mo141010t();
                gVar.f196999W = true;
                if (!gVar.f197349w) {
                    gVar.f197349w = true;
                    gVar.f197054b.mo140847a(gVar.f197336j.mo16684a(314, 0L));
                }
                gVar.mo140990d();
                String str2 = null;
                if (gVar.f197335i.f196886b == 1) {
                    if (gVar.f197335i.mo140908e() != null) {
                        str2 = gVar.f197335i.mo140908e().f196913a;
                    }
                } else if (gVar.f197335i.f196886b == 2) {
                    if (gVar.f196994P.equals("auto")) {
                        str = gVar.f197335i.mo140889a();
                    } else {
                        str = gVar.f196994P;
                    }
                    str2 = gVar.f197335i.mo140891a(str, gVar.f196996R, gVar.f196995Q);
                }
                gVar.f197054b.f196745h = str2;
                gVar.f197030ac = System.currentTimeMillis();
                gVar.f197054b.f196538cP = System.currentTimeMillis();
                if (gVar.f197345s == EnumC87177o.PREPARED) {
                    gVar.mo140994e(str2);
                    return;
                }
                gVar.mo140995f();
                gVar.mo140994e(str2);
            }
        }

        @Override // com.p2082ss.videoarch.p4474a.p4480f.C87151a.AbstractC87153a
        /* renamed from: b */
        public final void mo140964b() {
            String str;
            C87154g gVar = this.f197398a.get();
            if (gVar != null && gVar.f197336j != null) {
                gVar.mo141012v();
                gVar.f197054b.mo140869d();
                gVar.mo141010t();
                gVar.f196999W = true;
                String str2 = null;
                if (gVar.f197335i.f196886b == 1) {
                    str2 = gVar.f197335i.mo140910f();
                } else if (gVar.f197335i.f196886b == 2) {
                    if (gVar.f196994P.equals("auto")) {
                        str = gVar.f197335i.mo140889a();
                    } else {
                        str = gVar.f196994P;
                    }
                    str2 = gVar.f197335i.mo140891a(str, gVar.f196996R, gVar.f196995Q);
                }
                gVar.f197054b.f196745h = str2;
                if (!gVar.f197349w) {
                    gVar.f197349w = true;
                    gVar.f197054b.mo140847a(gVar.f197336j.mo16684a(314, 0L));
                }
                gVar.mo140990d();
                gVar.f197054b.f196538cP = System.currentTimeMillis();
                if (gVar.f197345s == EnumC87177o.PREPARED) {
                    gVar.mo140994e(str2);
                    return;
                }
                gVar.mo140995f();
                gVar.mo140994e(str2);
            }
        }

        @Override // com.p2082ss.videoarch.p4474a.p4480f.C87151a.AbstractC87153a
        /* renamed from: c */
        public final void mo140965c() {
            String str;
            C87154g gVar = this.f197398a.get();
            if (gVar != null && gVar.f197336j != null) {
                gVar.f196999W = true;
                gVar.mo140990d();
                gVar.f197007aF = 1;
                gVar.f197054b.f196558cj = 1;
                C87130a aVar = gVar.f197335i;
                if (aVar.f196885a != null) {
                    aVar.f196885a.f196894e = 1;
                }
                if (!gVar.f197348v) {
                    if (gVar.f197008aG == 1) {
                        gVar.f197008aG = 0;
                        gVar.f197054b.f196557ci = 0;
                    }
                    gVar.f197054b.f196567cs = 1;
                } else {
                    gVar.f197054b.f196567cs = 2;
                }
                String str2 = null;
                if (gVar.f197335i.f196886b == 1) {
                    str2 = gVar.f197335i.mo140910f();
                } else if (gVar.f197335i.f196886b == 2) {
                    if (gVar.f196994P.equals("auto")) {
                        str = gVar.f197335i.mo140889a();
                    } else {
                        str = gVar.f196994P;
                    }
                    str2 = gVar.f197335i.mo140891a(str, gVar.f196996R, gVar.f196995Q);
                }
                gVar.f197054b.f196745h = str2;
                if (gVar.f197345s == EnumC87177o.PREPARED) {
                    gVar.mo140994e(str2);
                    return;
                }
                gVar.mo140995f();
                gVar.mo140994e(str2);
            }
        }

        public C87174l(C87154g gVar) {
            this.f197398a = new WeakReference<>(gVar);
        }

        @Override // com.p2082ss.videoarch.p4474a.p4480f.C87151a.AbstractC87153a
        /* renamed from: a */
        public final void mo140963a(C87118a aVar) {
            C87154g gVar = this.f197398a.get();
            if (gVar != null && gVar.f197336j != null) {
                gVar.f197158d.mo12856a(aVar);
                gVar.f197337k.mo140953a();
                gVar.f197317g.mo140956a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$n */
    public class RunnableC87176n implements Runnable {

        /* renamed from: a */
        String f197399a;

        /* renamed from: b */
        boolean f197400b;

        /* renamed from: d */
        private final WeakReference<C87154g> f197402d;

        static {
            Covode.recordClassIndex(102977);
        }

        public final void run() {
            String str;
            long j;
            C87154g gVar = this.f197402d.get();
            if (gVar != null && (str = this.f197399a) != null && !str.isEmpty()) {
                if (!this.f197400b && !this.f197399a.equals(gVar.f196990L)) {
                    return;
                }
                if (this.f197400b && !this.f197399a.equals(gVar.f197026aY)) {
                    return;
                }
                if (gVar.f197346t != EnumC87165c.PLAYED) {
                    m151207a(500);
                    return;
                }
                C87154g gVar2 = this.f197402d.get();
                if (gVar2 != null) {
                    long a = gVar2.f197336j.mo16684a(73, -1L);
                    long a2 = gVar2.f197336j.mo16684a(605, -1L);
                    long a3 = gVar2.f197336j.mo16684a(603, -1L);
                    if (a >= 0) {
                        j = a + 0;
                    } else {
                        j = 0;
                    }
                    if (a2 >= 0) {
                        j += a2;
                    }
                    if (a3 >= 0) {
                        j += a3;
                    }
                    if (j >= 0 && j != -1) {
                        if (!this.f197400b || C87154g.this.f197015aN != 1) {
                            C87125b.m150939a(7215, gVar.f196990L, (int) j);
                        } else {
                            LiveIOWrapper.getInstance().setInt64ValueByStrKey(1002, gVar.f197026aY, (long) ((int) j));
                        }
                        if (j > 5000) {
                            m151207a(500);
                            return;
                        } else {
                            m151207a(300);
                            return;
                        }
                    }
                }
                m151207a(500);
            }
        }

        /* renamed from: a */
        private void m151207a(long j) {
            C87154g gVar = this.f197402d.get();
            if (gVar != null) {
                gVar.mo140977a(new RunnableC87176n(gVar, this.f197399a, this.f197400b), j);
            }
        }

        public RunnableC87176n(C87154g gVar, String str, boolean z) {
            this.f197402d = new WeakReference<>(gVar);
            this.f197399a = str;
            this.f197400b = z;
        }
    }

    /* renamed from: A */
    private void m151095A() {
        String str;
        String e;
        C87130a aVar = this.f197335i;
        if (this.f196994P.equals("auto")) {
            str = this.f197335i.mo140889a();
        } else {
            str = this.f196994P;
        }
        String a = aVar.mo140891a(str, this.f196996R, this.f196995Q);
        if (a != null) {
            this.f197054b.f196508bm = a;
            if (a.startsWith("http")) {
                this.f197154cw = "tcp";
            }
            if (a.startsWith("httpk")) {
                this.f197154cw = "kcp";
            }
            if (a.startsWith("https")) {
                this.f197154cw = "tls";
            }
            this.f197156cy = this.f197154cw;
        }
        C87130a aVar2 = this.f197335i;
        String str2 = this.f196994P;
        String str3 = this.f196995Q;
        String str4 = null;
        if (aVar2.f196885a == null) {
            e = null;
        } else {
            e = aVar2.f196885a.mo140931e(str2, str3);
        }
        this.f197151ct = e;
        C87130a aVar3 = this.f197335i;
        String str5 = this.f196994P;
        String str6 = this.f196995Q;
        if (aVar3.f196885a != null) {
            str4 = aVar3.f196885a.mo140932f(str5, str6);
        }
        this.f197152cu = str4;
        String str7 = this.f197151ct;
        if (str7 != null) {
            boolean z = true;
            if (str4 == null || str4.equals(this.f197153cv)) {
                if ((this.f197151ct.equals("quic") || this.f197151ct.equals("quicu") || this.f197151ct.equals("h2") || this.f197151ct.equals("h2q") || this.f197151ct.equals("h2qu")) && !this.f197164dF) {
                    try {
                        C87133d.m151005a("ttquic");
                        this.f197164dF = true;
                        this.f197054b.f196507bl = 1;
                    } catch (Throwable unused) {
                        str7 = this.f197154cw;
                        this.f197164dF = false;
                        this.f197054b.f196507bl = 0;
                    }
                }
                this.f197154cw = str7;
                z = false;
            }
            this.f197054b.f196511bp = z;
        }
        if (!TextUtils.isEmpty(this.f197151ct) && !TextUtils.isEmpty(this.f197154cw) && !TextUtils.isEmpty(this.f197152cu)) {
            this.f197054b.mo140853a(this.f197151ct, this.f197154cw, this.f197152cu);
        }
    }

    /* renamed from: H */
    private void m151102H() {
        if (this.f197335i != null) {
            if (!this.f196994P.equals("auto") || (this.f196984F.equals("abr_bb_4live") && this.f196983E)) {
                C87130a aVar = this.f197335i;
                boolean z = this.f197237eZ;
                if (aVar.f196885a != null) {
                    aVar.f196885a.f196893d = z;
                }
                if (this.f196983E && this.f197335i.f196886b == 2 && this.f196984F.equals("abr_bb_4live")) {
                    String a = this.f197335i.mo140889a();
                    if (!TextUtils.isEmpty(a)) {
                        if (this.f197237eZ || !a.equals("origin")) {
                            m151128h(a);
                        } else {
                            m151128h("uhd");
                        }
                    }
                    if (!this.f197335i.mo140904c(this.f196995Q)) {
                        this.f196994P = this.f197335i.mo140889a();
                        this.f196984F = "rad";
                        this.f196983E = false;
                        if (!this.f197335i.mo140904c(this.f196995Q)) {
                            this.f197054b.f196571cw = 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            String a2 = this.f197335i.mo140889a();
            this.f196994P = a2;
            if (TextUtils.isEmpty(a2)) {
                this.f196994P = "origin";
            }
            this.f196984F = "rad";
            this.f196983E = false;
        }
    }

    /* renamed from: I */
    private void m151103I() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z;
        C87130a aVar = this.f197335i;
        if (aVar.f196886b != 2 || aVar.f196885a == null) {
            jSONObject = null;
        } else {
            jSONObject = aVar.f196885a.mo140914a();
        }
        if (jSONObject != null) {
            boolean z2 = true;
            this.f197072bR = true;
            try {
                if (jSONObject.has("enable")) {
                    if (jSONObject.optInt("enable") == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f196983E = z;
                }
                if (jSONObject.has("strategy")) {
                    this.f196984F = jSONObject.getString("strategy");
                }
                if (jSONObject.has("enable_origin_resolution")) {
                    if (jSONObject.optInt("enable_origin_resolution") != 1) {
                        z2 = false;
                    }
                    this.f197237eZ = z2;
                }
                if (jSONObject.has("disable_algorithm")) {
                    this.f197315fy = jSONObject.optInt("disable_algorithm");
                }
                if (jSONObject.has("demotion") && (jSONObject2 = jSONObject.getJSONObject("demotion")) != null && jSONObject2.has("stall_count")) {
                    this.f196985G = jSONObject2.getInt("stall_count");
                }
            } catch (JSONException e) {
                e.printStackTrace();
                this.f197072bR = false;
                this.f196983E = false;
                this.f196984F = "rad";
                this.f197237eZ = false;
                this.f196985G = 4;
            }
        } else {
            this.f197072bR = false;
            this.f196983E = false;
            this.f197237eZ = false;
            this.f196984F = "rad";
            this.f196985G = 4;
        }
    }

    /* renamed from: N */
    private void m151108N() {
        this.f197336j.mo16687a(159, this.f197113cG);
        this.f197336j.mo16687a(653, this.f197127cU);
        this.f197336j.mo16687a(655, this.f197114cH);
        this.f197336j.mo16687a(656, this.f197115cI);
        this.f197336j.mo16687a(326, this.f197116cJ);
        this.f197336j.mo16687a(327, this.f197117cK);
        this.f197336j.mo16687a(328, this.f197118cL);
        this.f197336j.mo16687a(329, this.f197119cM);
        this.f197336j.mo16687a(330, this.f197120cN);
        this.f197336j.mo16687a(331, this.f197121cO);
        this.f197336j.mo16687a(332, this.f197123cQ);
        this.f197336j.mo16687a(712, this.f197122cP);
        this.f197336j.mo16687a(711, this.f197124cR);
        this.f197336j.mo16687a(713, this.f197125cS);
        this.f197336j.mo16687a(714, this.f197126cT);
        String str = new String();
        String str2 = new String();
        if (this.f197108cB.equals("only_audio=1")) {
            str = m151115a(str, "only_audio", "1");
        }
        if (this.f197107cA.equals("only_video=1")) {
            str2 = m151115a(str2, "only_video", "1");
        }
        this.f197336j.mo16688a(376, str);
        this.f197336j.mo16688a(377, str2);
        String str3 = this.f197166dH;
        if (str3 != null) {
            this.f197336j.mo16688a(941, str3);
        }
    }

    /* renamed from: i */
    public final void mo140999i() {
        this.f197158d.mo12860b("releaseAsync start -- " + this.f197322ge);
        mo140996f("releaseAsync");
        if (this.f197346t == EnumC87165c.PLAYED || this.f197346t == EnumC87165c.PAUSED) {
            m151121a(false, "releaseAsync");
        }
        this.f197279fO.shutdown();
        this.f197001a.removeCallbacksAndMessages(null);
        AbstractC86253m mVar = this.f197336j;
        if (mVar != null) {
            if ((this.f197340n != 1 || this.f197339m == null) && this.f197085be != null) {
                mVar.mo16692a((SurfaceHolder) null);
            }
            m151110P();
            AbstractC86253m mVar2 = this.f197336j;
            this.f197336j = null;
            this.f197054b.mo140872e();
            this.f197345s = EnumC87177o.IDLE;
            this.f197346t = EnumC87165c.IDLE;
            C87180a.m151208a(new RunnableC87173k(mVar2));
            this.f197158d.mo12860b("releaseAsync end -- " + this.f197322ge);
        }
    }

    /* renamed from: r */
    public final boolean mo141008r() {
        String a;
        if (this.f196994P == "ld") {
            return false;
        }
        if (this.f197150cs == -1) {
            int i = 0;
            while (true) {
                if (i >= AbstractC87147e.f196947a.length) {
                    break;
                } else if (AbstractC87147e.f196947a[i].equals(this.f196994P)) {
                    this.f197150cs = i;
                    break;
                } else {
                    i++;
                }
            }
        }
        int i2 = this.f197150cs + 1;
        while (i2 < AbstractC87147e.f196947a.length) {
            C87130a aVar = this.f197335i;
            String str = AbstractC87147e.f196947a[i2];
            if (aVar.f196886b == 2 && aVar.f196885a != null && aVar.f196885a.mo140930d(str)) {
                break;
            }
            i2++;
        }
        if (i2 >= AbstractC87147e.f196947a.length || (a = this.f197335i.mo140891a(AbstractC87147e.f196947a[i2], this.f196996R, this.f196995Q)) == null) {
            return false;
        }
        String str2 = this.f197071bQ;
        this.f197071bQ = a;
        this.f197150cs = i2;
        m151111Q();
        C87119b bVar = this.f197054b;
        String str3 = AbstractC87147e.f196947a[i2];
        this.f196994P = str3;
        bVar.f196520by = str3;
        this.f197054b.mo140854a(str2, this.f197071bQ, "auto_" + this.f197054b.f196470bA + "_to_" + this.f196994P, -100015);
        AbstractC87117a aVar2 = this.f197158d;
        if (aVar2 != null) {
            aVar2.mo12862c(this.f196994P);
        }
        this.f197054b.f196745h = this.f197071bQ;
        this.f196981C = 0;
        mo140994e(a);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$q */
    public class RunnableC87179q implements Runnable {
        static {
            Covode.recordClassIndex(102980);
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x015f A[Catch:{ all -> 0x0178 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 386
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.RunnableC87179q.run():void");
        }

        private RunnableC87179q() {
        }

        /* synthetic */ RunnableC87179q(C87154g gVar, byte b) {
            this();
        }
    }

    /* renamed from: E */
    private void m151099E() {
        String b = this.f197335i.mo140898b(this.f196994P, this.f196995Q);
        if (b != null) {
            try {
                JSONObject jSONObject = new JSONObject(b);
                if (jSONObject.has("NetworkAdapt")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString("NetworkAdapt"));
                    if (jSONObject2.has("Enabled")) {
                        int optInt = jSONObject2.optInt("Enabled");
                        this.f197069bO = optInt;
                        if (optInt == 1) {
                            this.f197064bJ = 0;
                        }
                        if (jSONObject2.has("HurryTime")) {
                            int optInt2 = jSONObject2.optInt("HurryTime");
                            this.f197065bK = optInt2;
                            this.f197336j.mo16687a(15, optInt2);
                            this.f197054b.f196395F = this.f197065bK;
                        }
                        if (jSONObject2.has("HurryMillisecond")) {
                            int optInt3 = jSONObject2.optInt("HurryMillisecond");
                            this.f197065bK = optInt3;
                            this.f197336j.mo16687a(397, optInt3);
                            this.f197054b.f196395F = this.f197065bK;
                        }
                        if (jSONObject2.has("HurrySpeed")) {
                            float parseFloat = Float.parseFloat(jSONObject2.optString("HurrySpeed"));
                            this.f197066bL = parseFloat;
                            this.f197336j.mo16683a(80, parseFloat);
                            this.f197054b.f196396G = this.f197066bL;
                        }
                        if (jSONObject2.has("SlowTime")) {
                            int optInt4 = jSONObject2.optInt("SlowTime");
                            this.f197067bM = optInt4;
                            this.f197336j.mo16687a(BuildConfig.VERSION_CODE, optInt4);
                            this.f197054b.f196397H = this.f197067bM;
                        }
                        if (jSONObject2.has("SlowMillisecond")) {
                            int optInt5 = jSONObject2.optInt("SlowMillisecond");
                            this.f197067bM = optInt5;
                            this.f197336j.mo16687a(398, optInt5);
                            this.f197054b.f196397H = this.f197067bM;
                        }
                        if (jSONObject2.has("SlowSpeed")) {
                            float parseFloat2 = Float.parseFloat(jSONObject2.optString("SlowSpeed"));
                            this.f197068bN = parseFloat2;
                            this.f197336j.mo16683a(191, parseFloat2);
                            this.f197054b.f196398I = this.f197068bN;
                        }
                    }
                }
                if (jSONObject.has("FastOpenDuration")) {
                    f196978cZ = jSONObject.optInt("FastOpenDuration");
                }
                if (jSONObject.has("EnableLowLatencyFLV")) {
                    int optInt6 = jSONObject.optInt("EnableLowLatencyFLV");
                    this.f197210dz = optInt6;
                    if (optInt6 == 1) {
                        if (this.f197293fc == 1 && this.f197294fd == 1) {
                            m151124b(this.f197159dA);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("stallTotalCount", (int) this.f197054b.f196443aa);
                            jSONObject3.put("retryTotalCount", this.f197054b.f196451ai);
                            this.f197205du = ((Long) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(0, 12, Long.valueOf(this.f197205du), jSONObject3.toString())).longValue();
                            return;
                        }
                    } else if (optInt6 != 1) {
                        return;
                    }
                    if (this.f197191dg != null) {
                        m151124b(this.f197159dA);
                        this.f197205du = ((Long) this.f197191dg.mo136413a("live_start_play_buffer_thres", Long.valueOf(this.f197205du), (int) this.f197054b.f196443aa, this.f197054b.f196451ai)).longValue();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: F */
    private void m151100F() {
        int i;
        int i2;
        if (this.f197348v && (i2 = this.f197253ep) == 1) {
            this.f197336j.mo16687a(532, i2);
        }
        if (this.f197218eG == 1) {
            this.f197054b.f196556ch = 1;
            this.f197336j.mo16687a(533, this.f197218eG);
            this.f197336j.mo16687a(534, this.f197219eH);
        }
        int i3 = this.f197046as;
        if (i3 >= 0) {
            this.f197336j.mo16687a(535, i3);
        }
        int i4 = this.f197220eI;
        if (i4 > 0) {
            this.f197336j.mo16687a(543, i4);
        }
        this.f197336j.mo16687a(544, this.f197221eJ);
        float f = this.f197222eK;
        if (f > 0.0f) {
            this.f197336j.mo16683a(177, f);
        }
        float f2 = this.f197223eL;
        if (f2 > 0.0f) {
            this.f197336j.mo16683a(178, f2);
        }
        if (this.f197234eW == 1) {
            this.f197336j.mo16687a(546, 1);
            if (!TextUtils.isEmpty(this.f197054b.f196516bu)) {
                try {
                    JSONObject jSONObject = new JSONObject(this.f197054b.f196516bu);
                    if (jSONObject.has("recommend_bitrate")) {
                        this.f197336j.mo16687a(547, jSONObject.optInt("recommend_bitrate"));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        float f3 = this.f197224eM;
        if (f3 > 0.0f) {
            this.f197336j.mo16683a(990, f3);
        }
        float f4 = this.f197225eN;
        if (f4 > 0.0f) {
            this.f197336j.mo16683a(991, f4);
        }
        float f5 = this.f197226eO;
        if (f5 > 0.0f) {
            this.f197336j.mo16683a(992, f5);
        }
        float f6 = this.f197227eP;
        if (f6 > 0.0f) {
            this.f197336j.mo16683a(993, f6);
        }
        float f7 = this.f197228eQ;
        if (f7 > 0.0f) {
            this.f197336j.mo16683a(994, f7);
        }
        float f8 = this.f197229eR;
        if (f8 > 0.0f) {
            this.f197336j.mo16683a(995, f8);
        }
        float f9 = this.f197230eS;
        if (f9 > 0.0f) {
            this.f197336j.mo16683a(998, f9);
        }
        int i5 = this.f197231eT;
        if (i5 > 0) {
            this.f197336j.mo16687a(996, i5);
        }
        int i6 = this.f197232eU;
        if (i6 > 0) {
            this.f197336j.mo16687a(999, i6);
        }
        AbstractC86253m mVar = this.f197336j;
        if (!this.f197348v) {
            i = this.f197233eV;
        } else {
            i = -1;
        }
        mVar.mo16687a(997, i);
    }

    /* renamed from: K */
    private void m151105K() {
        boolean z;
        boolean z2;
        Class<?> cls;
        boolean z3;
        boolean z4 = false;
        if (this.f197084bd != 0) {
            z = true;
        } else {
            z = false;
        }
        C86277r.m148506a(1, z);
        if (this.f197084bd == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C86277r.m148506a(2, z2);
        C86277r.m148506a(6, false);
        C86277r.m148506a(11, true);
        AbstractC86253m mVar = this.f197336j;
        if (mVar != null) {
            boolean a = mVar.mo16707a();
            if (this.f197084bd == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (a ^ z3) {
                this.f197336j.mo16717e();
                this.f197336j = null;
            }
        }
        if (this.f197336j == null) {
            this.f197336j = C87148a.m151031a(this.f197083bc, this.f197060bF);
            C87125b.C87126a.f196874a.f196873c = this.f197336j;
            if (!(this.f197336j.mo16709b() == 1 || this.f197336j.mo16709b() == 2)) {
                this.f197101bv = 0;
                this.f197197dm = 0;
                this.f197198dn = 0;
            }
            m151096B();
            this.f197336j.mo16699a(new C87172j(this));
            this.f197336j.mo16696a(new C87167e(this));
            this.f197336j.mo16698a(new C87169g(this));
            this.f197336j.mo16695a(new C87166d(this));
            this.f197336j.mo16697a(new C87168f(this));
            this.f197336j.mo16701a(new C87171i(this));
            if (this.f197336j instanceof C87148a) {
                this.f197148cq = new C87150f(this);
                try {
                    Class<?> cls2 = Class.forName("com.ss.ttm.player.f");
                    Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, this.f197148cq);
                    this.f197147cp = newProxyInstance;
                    C87148a aVar = (C87148a) this.f197336j;
                    if (!(aVar.f196948a == null || (cls = Class.forName("com.ss.ttm.player.f")) == null)) {
                        Method method = Class.forName("com.ss.ttm.player.TTPlayerClient").getMethod("setFrameMetadataListener", cls);
                        method.setAccessible(true);
                        method.invoke(aVar.f196948a, newProxyInstance);
                    }
                } catch (Throwable unused) {
                }
            }
            AudioProcessor audioProcessor = this.f197312fv;
            if (audioProcessor != null) {
                AbstractC86253m mVar2 = this.f197336j;
                if (mVar2 instanceof C87148a) {
                    C87148a aVar2 = (C87148a) mVar2;
                    if (aVar2.f196948a != null) {
                        try {
                            Method method2 = Class.forName("com.ss.ttm.player.TTPlayerClient").getMethod("setAudioProcessor", AudioProcessor.class);
                            method2.setAccessible(true);
                            method2.invoke(aVar2.f196948a, audioProcessor);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }
        if (this.f197336j.mo16707a()) {
            this.f197054b.f196747j = "-1";
        } else {
            this.f197054b.f196747j = C86277r.m148504a(14, "0");
        }
        C87135a aVar3 = this.f197264f;
        boolean z5 = this.f197254eq;
        String str = this.f197255er;
        if (z5 && aVar3.f196919a != null && !TextUtils.isEmpty(str) && !str.equals("null")) {
            z4 = true;
        }
        aVar3.f196920b = z4;
        aVar3.f196921c = str;
        boolean z6 = aVar3.f196920b;
        if (this.f197337k == null) {
            this.f197337k = new C87143c(this.f197279fO, this.f197106c);
        }
        this.f197334h.f196951b = this.f197336j;
    }

    /* renamed from: O */
    private void m151109O() {
        boolean z;
        boolean z2;
        C86205m a = C86205m.m148119a();
        this.f197338l = a;
        if (a == null) {
            this.f197340n = 0;
            this.f197341o = 0;
            this.f197017aP = 0;
            return;
        }
        if (f196977bi == null) {
            C871605 r0 = new C86203l.AbstractC86204a() {
                /* class com.p2082ss.videoarch.p4474a.C87154g.C871605 */

                static {
                    Covode.recordClassIndex(102961);
                }

                @Override // com.p2082ss.texturerender.C86203l.AbstractC86204a
                /* renamed from: a */
                public final int mo136515a(String str, String str2) {
                    C87154g.this.f197158d.mo12860b(str2);
                    return 0;
                }
            };
            f196977bi = r0;
            C86203l.m148117a(r0);
        }
        final C86174d dVar = new C86174d();
        if (this.f197017aP == 1) {
            z = true;
        } else {
            z = false;
        }
        dVar.f192199b = z;
        HashMap<Integer, Integer> hashMap = dVar.f192200c;
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        hashMap.put(1, Integer.valueOf(i));
        if (this.f197341o == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        dVar.mo136481a(z2);
        if (this.f197027aZ == 1) {
            dVar.mo136480a(10, 1);
        }
        if (this.f197081ba == 1) {
            dVar.mo136480a(2, 1);
        }
        final Bundle bundle = new Bundle();
        if (!this.f197338l.mo136518a(dVar)) {
            if (this.f197341o == 1) {
                JSONObject jSONObject = this.f197284fT;
                if (jSONObject != null) {
                    this.f197343q = jSONObject.optInt("SRAlgType");
                    this.f197316fz = this.f197284fT.optInt("ShorterSideUpperBound");
                    this.f197265fA = this.f197284fT.optInt("LongerSideUpperBound");
                    if (this.f197284fT.has("SROpenMaliSync")) {
                        this.f197093bn = this.f197284fT.optBoolean("SROpenMaliSync");
                    }
                }
                bundle.putInt("effect_type", 5);
                bundle.putInt("action", 21);
                bundle.putInt("srAlgType", this.f197343q);
                bundle.putInt("srMaxSizeWidth", this.f197316fz);
                bundle.putInt("srMaxSizeHeight", this.f197265fA);
                bundle.putString("kernelBinPath", this.f197089bj);
                bundle.putString("oclModleName", this.f197090bk);
                bundle.putString("dspModleName", this.f197091bl);
                bundle.putBoolean("srIsMaliSync", this.f197093bn);
            }
            if (this.f197017aP == 1) {
                JSONObject jSONObject2 = this.f197283fS;
                if (jSONObject2 != null) {
                    if (jSONObject2.has("Amount")) {
                        this.f197021aT = (float) this.f197283fS.optDouble("Amount");
                    }
                    if (this.f197283fS.has("EdgeWeightGamma")) {
                        this.f197023aV = (float) this.f197283fS.optDouble("EdgeWeightGamma");
                    }
                    if (this.f197283fS.has("OverRatio")) {
                        this.f197022aU = (float) this.f197283fS.optDouble("OverRatio");
                    }
                    if (this.f197283fS.has("SceneMode")) {
                        this.f197024aW = this.f197283fS.optInt("SceneMode");
                    }
                    if (this.f197283fS.has("PowerLevel")) {
                        this.f197282fR = this.f197283fS.optInt("PowerLevel");
                    }
                }
                bundle.putInt("action", 21);
                bundle.putInt("effect_type", 1);
                bundle.putInt("max_width", this.f197280fP);
                bundle.putInt("max_height", this.f197281fQ);
                bundle.putInt("power_level", this.f197282fR);
            }
            if (!this.f197279fO.isShutdown()) {
                this.f197279fO.submit(new Runnable() {
                    /* class com.p2082ss.videoarch.p4474a.C87154g.RunnableC871594 */

                    static {
                        Covode.recordClassIndex(102960);
                    }

                    public final void run() {
                        VideoSurface a = C87154g.this.f197338l.mo136516a(dVar, 1);
                        if (a != null) {
                            if (C87154g.this.f197341o == 1) {
                                a.mo136452a(bundle);
                            }
                            if (C87154g.this.f197017aP == 1) {
                                a.mo136452a(bundle);
                                a.mo136449a(11, C87154g.this.f197021aT);
                                a.mo136449a(12, C87154g.this.f197022aU);
                                a.mo136449a(13, C87154g.this.f197023aV);
                                a.mo136457b(17, C87154g.this.f197024aW);
                                a.mo136457b(14, -1);
                            }
                            a.release();
                        }
                    }
                });
            }
            this.f197323gf = true;
        }
        if (this.f197323gf) {
            dVar = new C86174d();
            if (this.f197027aZ == 1) {
                dVar.mo136480a(10, 1);
            }
            if (this.f197081ba == 1) {
                dVar.mo136480a(2, 1);
            }
        }
        VideoSurface a2 = this.f197338l.mo136516a(dVar, 1);
        this.f197339m = a2;
        if (a2 == null) {
            this.f197340n = 0;
            this.f197341o = 0;
            this.f197017aP = 0;
            this.f197092bm = this.f197338l.f192330c;
            return;
        }
        while (!this.f197324gg.isEmpty()) {
            Bundle poll = this.f197324gg.poll();
            if (poll != null) {
                poll.getInt("effect_type");
                this.f197339m.mo136452a(poll);
            }
        }
        this.f197339m.mo136458b(true);
        this.f197339m.f192167b = new VideoSurface.AbstractC86167a() {
            /* class com.p2082ss.videoarch.p4474a.C87154g.C871616 */

            static {
                Covode.recordClassIndex(102962);
            }

            @Override // com.p2082ss.texturerender.VideoSurface.AbstractC86167a
            /* renamed from: a */
            public final void mo136463a() {
                if (C87154g.this.f197336j != null) {
                    if (C87154g.this.f196997U == 1) {
                        if (C87154g.this.f196998V != -1) {
                            long currentTimeMillis = System.currentTimeMillis() - C87154g.this.f196998V;
                            if (currentTimeMillis >= ((long) C87154g.f196973S)) {
                                if (!C87154g.this.f197025aX) {
                                    C87154g.this.f197054b.mo140849a(currentTimeMillis, C87154g.f196973S, true, true);
                                } else {
                                    C87154g.this.f197025aX = false;
                                }
                            }
                        }
                        C87154g.this.f196998V = System.currentTimeMillis();
                    }
                    if (!C87154g.this.f197012aK) {
                        if (!C87154g.this.f197348v && C87154g.this.f197336j.mo16684a(77, -1L) != -1 && C87154g.this.f197336j.mo16684a(77, -1L) != 0) {
                            C87154g.this.f197348v = true;
                            C87154g.this.f197054b.mo140861b(C87154g.this.f197029ab);
                            C87154g.this.f197054b.mo140841a();
                            C87154g.this.f197158d.mo12854a();
                            C87154g.this.f197054b.f196534cL = System.currentTimeMillis();
                        }
                    } else if (!C87154g.this.f197011aJ && C87154g.this.f197336j.mo16684a(77, -1L) != -1 && C87154g.this.f197336j.mo16684a(77, -1L) != 0) {
                        C87154g.this.f197011aJ = true;
                        C87154g.this.f197054b.f196534cL = System.currentTimeMillis();
                    }
                }
            }
        };
        this.f197339m.mo136454a(new VideoSurface.AbstractC86168b() {
            /* class com.p2082ss.videoarch.p4474a.C87154g.C871627 */

            static {
                Covode.recordClassIndex(102963);
            }

            @Override // com.p2082ss.texturerender.VideoSurface.AbstractC86168b
            /* renamed from: a */
            public final void mo136464a(int i) {
                C87154g.this.f197054b.f196500be = i;
                C87154g.this.mo140969a(75, 0);
                C87154g.this.mo140969a(87, 0);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014b  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m151138z() {
        /*
        // Method dump skipped, instructions count: 428
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.m151138z():void");
    }

    /* renamed from: b */
    public final void mo140983b() {
        String str;
        String str2;
        String str3;
        String str4;
        this.f197158d.mo12860b("play start -- " + this.f197322ge);
        mo140996f("play");
        if (this.f197346t == EnumC87165c.PLAYED) {
            this.f197054b.mo140863b("play");
            this.f197158d.mo12860b("illegal call: play -- " + this.f197322ge);
        } else if (this.f197346t == EnumC87165c.PAUSED) {
            this.f197346t = EnumC87165c.PLAYED;
            AbstractC86253m mVar = this.f197336j;
            if (mVar != null) {
                mVar.mo16718f();
            }
        } else {
            mo140997g();
            if (this.f197335i.f196886b == 2) {
                m151103I();
                m151138z();
                m151095A();
                m151102H();
            }
            AbstractC87123b bVar = this.f197211e;
            if (bVar != null && this.f197005aD == 0) {
                this.f197340n = ((Integer) bVar.mo12962a("live_sdk_texture_render_enable", 0)).intValue();
                this.f197012aK = ((Boolean) this.f197211e.mo12962a("live_sdk_texturerender_use_player_renderstart", Boolean.FALSE)).booleanValue();
                if (((Integer) this.f197211e.mo12962a("live_sdk_super_resolution_enable", 0)).intValue() == 1) {
                    JSONObject e = this.f197335i.mo140909e(this.f196994P, this.f196995Q);
                    this.f197284fT = e;
                    if (e != null) {
                        this.f197341o = e.optInt("Enabled");
                    }
                }
                if (((Integer) this.f197211e.mo12962a("live_sdk_sharpen_enable", 0)).intValue() == 1) {
                    JSONObject f = this.f197335i.mo140911f(this.f196994P, this.f196995Q);
                    this.f197283fS = f;
                    if (f != null) {
                        this.f197017aP = f.optInt("Enabled");
                    }
                }
            }
            int i = this.f197325gh;
            if ((i == 1 || (i == -1 && this.f197340n == 1)) && this.f197339m == null) {
                m151109O();
            }
            this.f197346t = EnumC87165c.PLAYED;
            this.f196988J = -1;
            this.f196989K = -1;
            String str5 = null;
            C87130a aVar = this.f197335i;
            if (aVar != null) {
                if (aVar.f196886b == 1 && this.f197335i.mo140908e() != null) {
                    str5 = this.f197335i.mo140908e().f196913a;
                    if (this.f196993O) {
                        str3 = this.f196992N;
                    } else {
                        str3 = str5;
                    }
                    if (str3 != null) {
                        if (str3.startsWith("http")) {
                            this.f197154cw = "tcp";
                        }
                        if (str3.startsWith("https")) {
                            this.f197154cw = "tls";
                        }
                        if (str3.startsWith("httpk")) {
                            this.f197154cw = "kcp";
                        }
                        this.f197156cy = this.f197154cw;
                    }
                    if (this.f197172dN) {
                        try {
                            C87133d.m151005a("ttquic");
                            this.f197164dF = true;
                            this.f197054b.f196507bl = 1;
                            str4 = "quic";
                        } catch (Throwable unused) {
                            str4 = this.f197154cw;
                            this.f197164dF = false;
                            this.f197054b.f196507bl = 0;
                        }
                    } else {
                        str4 = "";
                    }
                    if (str4.isEmpty()) {
                        str4 = this.f197154cw;
                    }
                    this.f197154cw = str4;
                } else if (this.f197335i.f196886b == 2) {
                    C87130a aVar2 = this.f197335i;
                    if (this.f196994P.equals("auto")) {
                        str2 = this.f197335i.mo140889a();
                    } else {
                        str2 = this.f196994P;
                    }
                    str5 = aVar2.mo140891a(str2, this.f196996R, this.f196995Q);
                }
            }
            if (this.f196993O) {
                str5 = this.f196992N;
            }
            if (str5 != null) {
                String c = this.f197335i.mo140902c();
                this.f197161dC = c;
                if (TextUtils.isEmpty(c)) {
                    this.f197161dC = UUID.randomUUID().toString().replace("-", "").toLowerCase();
                }
                this.f197054b.mo140853a(this.f197151ct, this.f197154cw, this.f197152cu);
                this.f197054b.mo140872e();
                this.f197054b.f196411V = this.f197161dC + "." + System.currentTimeMillis();
                this.f197054b.f196410U = this.f197335i.mo140897b();
                this.f197054b.f196520by = this.f196994P;
                this.f197054b.f196521bz = this.f197335i.mo140889a();
                C87119b bVar2 = this.f197054b;
                if (this.f196993O) {
                    str = this.f196992N;
                } else {
                    str = str5;
                }
                bVar2.mo140852a(str, this.f197264f.mo140943c());
                m151130j(str5);
                this.f197317g.f196965g = true;
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("url", "no playurl found while play");
                this.f197317g.mo140959a(new C87118a(-100002, "playURL is null", hashMap), this.f197348v);
            }
            if (this.f197187dc == 1) {
                m151106L();
            }
            this.f197158d.mo12860b("play end -- " + this.f197322ge);
        }
    }

    /* renamed from: a */
    public static C87163a m151112a(Context context) {
        return new C87163a(context, (byte) 0);
    }

    /* renamed from: d */
    public final void mo140991d(String str) {
        this.f197054b.f196733g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$d */
    public static final class C87166d implements AbstractC86253m.AbstractC86255b {

        /* renamed from: a */
        private final WeakReference<C87154g> f197390a;

        static {
            Covode.recordClassIndex(102967);
        }

        public C87166d(C87154g gVar) {
            this.f197390a = new WeakReference<>(gVar);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86255b
        /* renamed from: a */
        public final void mo16759a(AbstractC86253m mVar) {
            C87154g gVar = this.f197390a.get();
            if (gVar != null && gVar.f197336j != null) {
                gVar.f197158d.mo12863d();
                gVar.f197054b.mo140870d(-100009);
                gVar.f197042ao = false;
                if (!gVar.f196993O) {
                    if (gVar.f196986H && gVar.f197335i.f196886b == 2 && gVar.mo140981a(-100009)) {
                        return;
                    }
                    if (gVar.f197335i.f196886b == 1 && gVar.mo140986b(-100009)) {
                        return;
                    }
                    if (gVar.f197351y == 1) {
                        gVar.f196979A = true;
                        if (gVar.f197350x && !TextUtils.isEmpty(gVar.f197352z)) {
                            gVar.mo140988c(gVar.f197352z);
                            gVar.f197350x = true;
                            if (gVar.f197336j != null && gVar.f196993O && !TextUtils.isEmpty(gVar.f196992N)) {
                                gVar.f197336j.mo16706a(gVar.f197350x);
                            }
                            gVar.mo140994e(gVar.f197352z);
                            return;
                        }
                        return;
                    }
                    gVar.f197317g.mo140959a(new C87118a(-100009, "live stream dry up, push stream may occur error", new HashMap()), gVar.f197348v);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$e */
    public static final class C87167e implements AbstractC86253m.AbstractC86256c {

        /* renamed from: a */
        private final WeakReference<C87154g> f197391a;

        static {
            Covode.recordClassIndex(102968);
        }

        public C87167e(C87154g gVar) {
            this.f197391a = new WeakReference<>(gVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
            if (r0 == false) goto L_0x0060;
         */
        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86256c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo16758a(com.p2082ss.ttm.player.AbstractC86253m r9, int r10, int r11) {
            /*
            // Method dump skipped, instructions count: 227
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.C87167e.mo16758a(com.ss.ttm.player.m, int, int):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$f */
    public static final class C87168f implements AbstractC86253m.AbstractC86257d {

        /* renamed from: a */
        private final WeakReference<C87154g> f197392a;

        static {
            Covode.recordClassIndex(102969);
        }

        public C87168f(C87154g gVar) {
            this.f197392a = new WeakReference<>(gVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:344:0x06c4 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:427:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86257d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo136843a(int r31, java.lang.String r32) {
            /*
            // Method dump skipped, instructions count: 2032
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.C87168f.mo136843a(int, java.lang.String):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$h */
    public static final class C87170h implements AbstractC87124a {

        /* renamed from: a */
        private final WeakReference<C87154g> f197394a;

        static {
            Covode.recordClassIndex(102971);
        }

        public C87170h(C87154g gVar) {
            this.f197394a = new WeakReference<>(gVar);
        }

        @Override // com.p2082ss.videoarch.p4474a.p4476b.AbstractC87124a
        /* renamed from: a */
        public final long mo140884a(long j) {
            C87154g gVar = this.f197394a.get();
            if (gVar == null || gVar.f197336j == null) {
                return j;
            }
            return gVar.f197054b.mo140840a(0, j);
        }

        @Override // com.p2082ss.videoarch.p4474a.p4476b.AbstractC87124a
        /* renamed from: a */
        public final void mo140885a(int i, String str) {
            C87119b bVar;
            JSONObject b;
            C87154g gVar = this.f197394a.get();
            if (gVar != null && gVar.f197336j != null && (b = (bVar = gVar.f197054b).mo140859b()) != null) {
                try {
                    b.put("event_key", "p2p_error").put("error_msg", str).put("code", i);
                    bVar.f196469b.mo12858a(b, "live_client_monitor_log");
                    if (bVar.f196415Z > 0) {
                        bVar.f196415Z++;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.p2082ss.videoarch.p4474a.p4476b.AbstractC87124a
        /* renamed from: b */
        public final void mo140886b(int i, String str) {
            C87119b bVar;
            JSONObject b;
            C87154g gVar = this.f197394a.get();
            if (gVar != null && gVar.f197336j != null && (b = (bVar = gVar.f197054b).mo140859b()) != null) {
                try {
                    if (str.equals("cdn_to_p2p")) {
                        bVar.f196421aE = 1;
                    }
                    b.put("event_key", "p2p_switch").put("switch_info", str).put("p2p_vendor", "none").put("reason", i);
                    bVar.f196469b.mo12858a(b, "live_client_monitor_log");
                    if (bVar.f196415Z > 0) {
                        bVar.f196415Z++;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$i */
    public static class C87171i implements AbstractC86253m.AbstractC86263j {

        /* renamed from: a */
        private final WeakReference<C87154g> f197395a;

        static {
            Covode.recordClassIndex(102972);
        }

        public C87171i(C87154g gVar) {
            this.f197395a = new WeakReference<>(gVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0113  */
        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86263j
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo136845a(com.p2082ss.ttm.player.AbstractC86253m r9, int r10, int r11) {
            /*
            // Method dump skipped, instructions count: 286
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.C87171i.mo136845a(com.ss.ttm.player.m, int, int):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$j */
    public static final class C87172j implements AbstractC86253m.AbstractC86260g {

        /* renamed from: a */
        private final WeakReference<C87154g> f197396a;

        static {
            Covode.recordClassIndex(102973);
        }

        public C87172j(C87154g gVar) {
            this.f197396a = new WeakReference<>(gVar);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86260g
        /* renamed from: a */
        public final void mo16757a(AbstractC86253m mVar) {
            C87154g gVar = this.f197396a.get();
            if (gVar != null && gVar.f197345s == EnumC87177o.PREPARING && gVar.f197336j != null) {
                C87119b bVar = gVar.f197054b;
                if (bVar.f196536cN != null) {
                    bVar.f196536cN.f196859o = System.currentTimeMillis();
                }
                if (!bVar.f196412W) {
                    bVar.f196522c.f196859o = System.currentTimeMillis();
                }
                gVar.f197345s = EnumC87177o.PREPARED;
                if (gVar.f197036ai == 0) {
                    gVar.f197336j.mo16718f();
                }
                gVar.f197158d.mo12864e();
            }
        }
    }

    /* renamed from: a */
    private void m151119a(Runnable runnable) {
        this.f197001a.post(runnable);
    }

    /* renamed from: c */
    private static Context m151125c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: g */
    private static void m151127g(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.a.g$p */
    public class SurfaceHolder$CallbackC87178p implements SurfaceHolder.Callback {

        /* renamed from: a */
        final WeakReference<C87154g> f197408a;

        static {
            Covode.recordClassIndex(102979);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C87154g gVar = this.f197408a.get();
            if (gVar != null) {
                gVar.mo140971a(surfaceHolder.getSurface());
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C87154g gVar = this.f197408a.get();
            if (gVar != null) {
                gVar.f197158d.mo12860b("surfaceDestroyed, ".concat(String.valueOf(surfaceHolder)));
                VideoSurface videoSurface = gVar.f197339m;
                if (videoSurface != null) {
                    videoSurface.mo136457b(9, 1);
                    gVar.mo140984b(videoSurface);
                    videoSurface.mo136457b(9, 0);
                    return;
                }
                gVar.mo140984b(surfaceHolder.getSurface());
            }
        }

        public SurfaceHolder$CallbackC87178p(C87154g gVar) {
            this.f197408a = new WeakReference<>(gVar);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            String str = "surfaceChanged, " + surfaceHolder + ", pixel format: " + i + ", width: " + i2 + ", height: " + i3;
            C87154g gVar = this.f197408a.get();
            if (gVar != null) {
                gVar.f197158d.mo12860b(str);
            }
        }
    }

    /* renamed from: b */
    private static File m151122b(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: l */
    private void m151132l(String str) {
        mo140990d();
        mo140995f();
        m151131k(str);
        this.f197150cs = -1;
        this.f197346t = EnumC87165c.IDLE;
    }

    /* renamed from: c */
    public final void mo140988c(String str) {
        mo140996f("setLocalURL");
        if (!(str == null || str.equals(this.f196992N) || this.f196992N == null)) {
            mo140993e();
        }
        this.f196992N = str;
        this.f196993O = true;
    }

    /* renamed from: f */
    public final void mo140996f(String str) {
        C87119b bVar;
        if (this.f197162dD == 1 && Looper.myLooper() != Looper.getMainLooper() && (bVar = this.f197054b) != null) {
            bVar.mo140868c(str);
        }
    }

    /* renamed from: n */
    private static JSONArray m151134n(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (str.contains(";")) {
            for (String str2 : str.split(";")) {
                JSONObject m = m151133m(str2);
                if (m != null) {
                    arrayList.add(m);
                }
            }
        } else {
            JSONObject m2 = m151133m(str);
            if (m2 != null) {
                arrayList.add(m2);
            }
        }
        return new JSONArray((Collection) arrayList);
    }

    /* renamed from: b */
    public final void mo140984b(Surface surface) {
        if (this.f197087bg == surface) {
            VideoSurface videoSurface = this.f197339m;
            if (videoSurface == null || this.f197338l == null) {
                AbstractC86253m mVar = this.f197336j;
                if (mVar != null) {
                    mVar.mo16691a((Surface) null);
                }
            } else {
                videoSurface.mo136453a((Surface) null);
                AbstractC86253m mVar2 = this.f197336j;
                if (mVar2 != null) {
                    mVar2.mo16691a(this.f197339m);
                }
            }
            this.f197087bg = null;
        }
    }

    /* renamed from: i */
    private void m151129i(String str) {
        JSONObject optJSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("DRM") && (optJSONObject = jSONObject.optJSONObject("DRM")) != null) {
                    boolean optBoolean = optJSONObject.optBoolean("isEnabled");
                    this.f197287fW = optBoolean;
                    if (optBoolean) {
                        int optInt = optJSONObject.optInt("drmType");
                        this.f197288fX = optInt;
                        if (optInt == 0) {
                            String optString = optJSONObject.optString("verifyServerUrl");
                            this.f197290fZ = optString;
                            if (optString != null) {
                                this.f197318ga = optJSONObject.optJSONObject("verifyRequestPara");
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    private void m151130j(String str) {
        if (this.f197345s == EnumC87177o.PREPARED && this.f197336j != null) {
            String str2 = this.f196980B;
            if (str2 != null) {
                this.f197054b.mo140855a(str2, false);
            }
            this.f197336j.mo16718f();
        } else if (this.f197345s == EnumC87177o.IDLE || this.f197336j == null) {
            m151105K();
            this.f197345s = EnumC87177o.INITIALIZED;
            if (!this.f196993O || TextUtils.isEmpty(this.f196992N)) {
                mo140994e(str);
            } else {
                this.f197054b.mo140865c();
                mo140978a(this.f196992N, (String) null, (String) null, (String) null);
            }
        } else {
            m151096B();
            if (!this.f196993O || TextUtils.isEmpty(this.f196992N)) {
                mo140994e(str);
            } else {
                mo140978a(this.f196992N, (String) null, (String) null, (String) null);
            }
        }
        VideoSurface videoSurface = this.f197339m;
        if (videoSurface != null) {
            videoSurface.mo136455a(false);
        }
        this.f197347u = false;
    }

    /* renamed from: p */
    private String m151136p(String str) {
        String str2;
        if (this.f197326gi != 1) {
            return str;
        }
        if ((!TextUtils.equals(this.f197154cw, "quic") && !TextUtils.equals(this.f197154cw, "quicu") && !TextUtils.equals(this.f197154cw, "h2q") && !TextUtils.equals(this.f197154cw, "h2qu")) || !C87135a.m151008a(str)) {
            return str;
        }
        List<String> list = this.f197256es;
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = this.f197256es.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                str2 = it.next();
                if (!C87135a.m151008a(str2)) {
                    break;
                }
                it.remove();
            }
        }
        str2 = str;
        if (str2.equals(str)) {
            return "";
        }
        return str2;
    }

    /* renamed from: b */
    private void m151124b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject != null && jSONObject.has("net_effective_connection_type_strategy")) {
            try {
                jSONObject2 = jSONObject.getJSONObject("net_effective_connection_type_strategy");
            } catch (JSONException e) {
                e.printStackTrace();
                jSONObject2 = null;
            }
            if (this.f197293fc == 1 && this.f197294fd == 1) {
                jSONObject3 = (JSONObject) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(0, 14, null, "");
            } else {
                AbstractC86157e eVar = this.f197191dg;
                if (eVar != null) {
                    jSONObject3 = (JSONObject) eVar.mo136413a("net_effective_connection_type_strategy", jSONObject2, (int) this.f197054b.f196443aa, this.f197054b.f196451ai);
                } else {
                    return;
                }
            }
            if (jSONObject3 != null) {
                if (jSONObject3.has("live_start_fs_time")) {
                    f196978cZ = jSONObject3.optInt("live_start_fs_time");
                }
                if (jSONObject3.has("hurry_millisecond")) {
                    int optInt = jSONObject3.optInt("hurry_millisecond");
                    this.f197065bK = optInt;
                    this.f197336j.mo16687a(397, optInt);
                    this.f197054b.f196395F = this.f197065bK;
                }
                if (jSONObject3.has("catch_speed")) {
                    float parseFloat = Float.parseFloat(jSONObject3.optString("catch_speed"));
                    this.f197066bL = parseFloat;
                    this.f197336j.mo16683a(80, parseFloat);
                    this.f197054b.f196396G = this.f197066bL;
                }
                if (jSONObject3.has("slow_play_millisecond")) {
                    int optInt2 = jSONObject3.optInt("slow_play_millisecond");
                    this.f197067bM = optInt2;
                    this.f197336j.mo16687a(398, optInt2);
                    this.f197054b.f196397H = this.f197067bM;
                }
                if (jSONObject3.has("slow_play_speed")) {
                    float parseFloat2 = Float.parseFloat(jSONObject3.optString("slow_play_speed"));
                    this.f197068bN = parseFloat2;
                    this.f197336j.mo16683a(191, parseFloat2);
                    this.f197054b.f196398I = this.f197068bN;
                }
            }
        }
    }

    /* renamed from: o */
    private static JSONArray m151135o(String str) {
        if (str == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                JSONObject jSONObject = new JSONObject();
                int indexOf = str.indexOf("index:");
                int indexOf2 = str.indexOf(",pts_diff:");
                if (indexOf < 0 || indexOf2 < 0 || indexOf >= indexOf2) {
                    break;
                }
                jSONObject.put("index", Integer.parseInt(str.substring(indexOf + 6, indexOf2)));
                String substring = str.substring(indexOf2);
                int indexOf3 = substring.indexOf(",drop_dur:");
                if (indexOf3 < 0 || 10 >= indexOf3) {
                    break;
                }
                jSONObject.put("pts_diff", Long.parseLong(substring.substring(10, indexOf3)));
                String substring2 = substring.substring(indexOf3);
                int indexOf4 = substring2.indexOf(",key:");
                if (indexOf4 < 0 || 10 >= indexOf4) {
                    break;
                }
                jSONObject.put("drop_dur", Long.parseLong(substring2.substring(10, indexOf4)));
                String substring3 = substring2.substring(indexOf4);
                int indexOf5 = substring3.indexOf(",index:");
                if (indexOf5 != -1) {
                    if (5 >= indexOf5) {
                        break;
                    }
                    jSONObject.put("key_frame", Integer.parseInt(substring3.substring(5, indexOf5)));
                    arrayList.add(jSONObject);
                    str = substring3.substring(indexOf5 + 1);
                } else if (substring3.length() != 0) {
                    jSONObject.put("key_frame", Integer.parseInt(substring3.substring(5)));
                    arrayList.add(jSONObject);
                }
            }
            return new JSONArray((Collection) arrayList);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo140989c(int i) {
        String replaceAll;
        if (this.f197071bQ == null) {
            return false;
        }
        if ((!TextUtils.equals(this.f197154cw, "quic") && !TextUtils.equals(this.f197154cw, "quicu")) || i != -499499) {
            return false;
        }
        if (this.f197156cy.equals("tls")) {
            this.f197154cw = "tls";
            replaceAll = this.f197071bQ.replaceAll("httpq", "https");
        } else if (this.f197156cy.equals("kcp")) {
            this.f197154cw = "kcp";
            replaceAll = this.f197071bQ.replaceAll("httpq", "httpk");
        } else {
            this.f197154cw = "tcp";
            replaceAll = this.f197071bQ.replaceAll("httpq", "http");
        }
        String replaceAll2 = replaceAll.replaceAll(":(\\d+)/", "/");
        mo141012v();
        this.f197054b.mo140869d();
        mo141010t();
        this.f196999W = true;
        if (replaceAll2 != null) {
            this.f197054b.f196745h = replaceAll2;
            this.f197054b.mo140854a(this.f197071bQ, replaceAll2, "quic_library_load_error", i);
            this.f197071bQ = replaceAll2;
            mo140990d();
            mo140995f();
            this.f197267fC = System.currentTimeMillis();
            mo140994e(this.f197071bQ);
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo140992d(int i) {
        String replaceAll;
        String str = this.f197071bQ;
        if (str == null || !str.startsWith("httpk") || (replaceAll = this.f197071bQ.replaceAll("httpk", "http").replaceAll(":(\\d+)/", "/")) == null) {
            return false;
        }
        mo141012v();
        this.f197054b.mo140869d();
        mo141010t();
        this.f196999W = true;
        this.f197054b.f196745h = replaceAll;
        this.f197054b.mo140854a(this.f197071bQ, replaceAll, "httpk_to_http", i);
        this.f197071bQ = replaceAll;
        mo140990d();
        mo140995f();
        this.f197267fC = System.currentTimeMillis();
        mo140994e(this.f197071bQ);
        return true;
    }

    /* renamed from: h */
    private void m151128h(String str) {
        if (this.f196984F.equals("abr_bb_4live") && this.f196983E && !TextUtils.isEmpty(str)) {
            String str2 = str;
            while (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(this.f197335i.mo140891a(str2, this.f196996R, this.f196995Q))) {
                    this.f197335i.mo140900b(str2);
                    this.f197054b.f196521bz = this.f197335i.mo140889a();
                    return;
                }
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1008619738:
                        if (str2.equals("origin")) {
                            str2 = "uhd";
                            continue;
                        }
                        break;
                    case 3324:
                        if (str2.equals("hd")) {
                            str2 = "sd";
                            continue;
                        }
                        break;
                    case 3448:
                        if (!str2.equals("ld")) {
                        }
                        break;
                    case 3665:
                        if (str2.equals("sd")) {
                            str2 = "ld";
                            continue;
                        }
                        break;
                    case 115761:
                        if (str2.equals("uhd")) {
                            str2 = "hd";
                            continue;
                        }
                        break;
                }
                str2 = null;
            }
            while (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f197335i.mo140891a(str, this.f196996R, this.f196995Q))) {
                    this.f197335i.mo140900b(str);
                    this.f197054b.f196521bz = this.f197335i.mo140889a();
                    return;
                }
                str.hashCode();
                switch (str.hashCode()) {
                    case -1008619738:
                        if (!str.equals("origin")) {
                        }
                        break;
                    case 3324:
                        if (str.equals("hd")) {
                            str = "uhd";
                            continue;
                        }
                        break;
                    case 3448:
                        if (str.equals("ld")) {
                            str = "sd";
                            continue;
                        }
                        break;
                    case 3665:
                        if (str.equals("sd")) {
                            str = "hd";
                            continue;
                        }
                        break;
                    case 115761:
                        if (str.equals("uhd")) {
                            str = "origin";
                            continue;
                        }
                        break;
                }
                str = null;
            }
            TextUtils.isEmpty(str);
        }
    }

    /* renamed from: k */
    private void m151131k(String str) {
        C87143c cVar = this.f197337k;
        if (cVar != null) {
            cVar.mo140953a();
        }
        C87135a aVar = this.f197264f;
        if (aVar != null) {
            aVar.mo140939a();
        }
        if (this.f197346t == EnumC87165c.PLAYED || this.f197346t == EnumC87165c.PAUSED) {
            mo141009s();
            if (this.f196982D) {
                this.f197054b.mo140860b(0);
            }
            VideoSurface videoSurface = this.f197339m;
            if (videoSurface != null) {
                videoSurface.mo136455a(true);
                mo140969a(75, 0);
            }
            if (this.f197293fc == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sessionId", this.f197161dC + "." + System.currentTimeMillis());
                    jSONObject.put("stallTotalCount", (int) this.f197054b.f196443aa);
                    jSONObject.put("retryTotalCount", this.f197054b.f196451ai);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                LiveStrategyManager.inst().stopSession(jSONObject);
            }
            AbstractC86157e eVar = this.f197191dg;
            if (eVar != null && this.f197210dz == 1) {
                eVar.mo136418a(this.f197161dC + "." + System.currentTimeMillis(), (int) this.f197054b.f196443aa, this.f197054b.f196451ai);
            }
            this.f197054b.f196510bo = this.f197155cx;
            this.f197054b.mo140851a(str);
        }
        mo140969a(75, 0);
        this.f197054b.mo140872e();
        this.f197317g.mo140956a();
        if (str.equals("reset")) {
            this.f197335i.mo140912g();
        }
        this.f197348v = false;
        this.f197045ar = false;
        this.f197342p = true;
        this.f197051ax = false;
        this.f197028aa = 0;
        this.f197029ab = 0;
        this.f196981C = 0;
        this.f197347u = true;
        this.f197346t = EnumC87165c.STOPPED;
        this.f197034ag = false;
        this.f197035ah = 0;
        this.f196982D = false;
        this.f196999W = false;
        this.f197349w = false;
        this.f197042ao = true;
        this.f197038ak = -1;
        this.f196987I = 0;
        this.f197135cd = 0;
        this.f196991M = 0;
        this.f197040am = false;
        this.f197157cz = "";
        this.f197170dL = false;
        this.f196996R = "flv";
        this.f197154cw = "tcp";
        this.f197151ct = "none";
        this.f197152cu = "none";
        this.f197074bT = 1;
        this.f197171dM = false;
        this.f197043ap = 0;
        this.f197052ay = 0;
        this.f197341o = 0;
        this.f197340n = 0;
        this.f197173dO = 39;
        this.f197174dP = 1200;
        this.f197175dQ = 0;
        this.f197184dZ = 0;
        this.f197238ea = 0;
        this.f197239eb = 0;
        this.f197240ec = 0;
        this.f197241ed = 0;
        this.f197242ee = 0;
        this.f197243ef = 0;
        this.f197176dR = 1;
        this.f197177dS = 1;
        this.f197178dT = 1;
        this.f197179dU = 100;
        this.f197180dV = 0;
        this.f197181dW = 0;
        this.f197182dX = 0;
        this.f197189de = 0;
        this.f197344r = false;
        this.f197250em = 10000;
        this.f197251en = 0;
        this.f197258eu = false;
        this.f197218eG = 0;
        this.f197219eH = 1000;
        this.f197046as = -1;
        this.f196980B = null;
        this.f197298fh = 0;
        this.f197297fg = 5000;
        this.f197299fi = 300;
        this.f197007aF = 0;
        this.f197005aD = 0;
        this.f197301fk = 0;
        this.f197302fl = 0;
        this.f197273fI = 0;
        this.f197315fy = 0;
        this.f197011aJ = false;
        this.f197012aK = false;
        f196978cZ = -1;
        this.f197001a.removeCallbacksAndMessages(null);
        if (this.f197187dc == 1) {
            m151107M();
        }
        this.f197016aO = 5000;
        this.f197277fM = 200;
        this.f197169dK = 0;
        this.f197326gi = 1;
        this.f197327gj = -1;
        this.f197328gk = 1;
        this.f197082bb = 0;
        this.f197329gl = 0;
        this.f197332go = 0;
    }

    /* renamed from: m */
    private static JSONObject m151133m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String[] split = str.split(",");
            for (String str2 : split) {
                if (str2.startsWith("video_key")) {
                    jSONObject.put("video_key", Integer.parseInt(str2.substring(10)));
                } else if (str2.startsWith("video_last_dts")) {
                    jSONObject.put("video_last_dts", Integer.parseInt(str2.substring(15)));
                } else if (str2.startsWith("video_cur_dts")) {
                    jSONObject.put("video_cur_dts", Integer.parseInt(str2.substring(14)));
                } else if (str2.startsWith("vv_dts_diff")) {
                    jSONObject.put("vv_dts_diff", Integer.parseInt(str2.substring(12)));
                } else if (str2.startsWith("audio_cur_dts")) {
                    jSONObject.put("audio_cur_dts", Integer.parseInt(str2.substring(14)));
                } else if (str2.startsWith("av_dts_diff")) {
                    jSONObject.put("av_dts_diff", Integer.parseInt(str2.substring(12)));
                } else if (str2.startsWith("audio_first_pkt_ts")) {
                    jSONObject.put("audio_first_pkt_ts", Long.parseLong(str2.substring(19)));
                } else if (str2.startsWith("audio_first_pkt_dts")) {
                    jSONObject.put("audio_first_pkt_dts", Long.parseLong(str2.substring(20)));
                } else if (str2.startsWith("video_first_pkt_ts")) {
                    jSONObject.put("video_first_pkt_ts", Long.parseLong(str2.substring(19)));
                } else if (str2.startsWith("video_first_pkt_dts")) {
                    jSONObject.put("video_first_pkt_dts", Long.parseLong(str2.substring(20)));
                } else if (str2.startsWith("audio_open_input_cost")) {
                    jSONObject.put("audio_open_input_cost", Long.parseLong(str2.substring(22)));
                } else if (str2.startsWith("audio_find_stream_info_cost")) {
                    jSONObject.put("audio_find_stream_info_cost", Long.parseLong(str2.substring(28)));
                } else if (str2.startsWith("video_open_input_cost")) {
                    jSONObject.put("video_open_input_cost", Long.parseLong(str2.substring(22)));
                } else if (str2.startsWith("video_find_stream_info_cost")) {
                    jSONObject.put("video_find_stream_info_cost", Long.parseLong(str2.substring(28)));
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final void mo140985b(String str) {
        this.f197054b.f196499bd = str;
        mo140996f("setStreamInfo");
        try {
            JSONObject jSONObject = new JSONObject(str);
            m151132l("setStreamInfo");
            this.f197335i.mo140892a(new C87131b(jSONObject));
            this.f197038ak = 1;
            m151137y();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012e, code lost:
        if (r7.equals("quicu") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0136, code lost:
        if (r7.equals("quic") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013e, code lost:
        if (r7.equals("tls") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0146, code lost:
        if (r7.equals("tcp") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014a, code lost:
        r2 = "80";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015f, code lost:
        if (r7.equals("h2q") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0169, code lost:
        if (r7.equals("h2") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016d, code lost:
        r2 = "443";
     */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0374  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140994e(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 988
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.C87154g.mo140994e(java.lang.String):void");
    }

    private C87154g(C87163a aVar) {
        this.f197001a = new Handler(Looper.myLooper());
        this.f197335i = new C87130a();
        this.f197086bf = null;
        this.f197339m = null;
        this.f197340n = 0;
        this.f197341o = 0;
        this.f197088bh = -1;
        this.f197342p = true;
        this.f197343q = 0;
        this.f197089bj = "none";
        this.f197090bk = "test";
        this.f197091bl = "test";
        this.f197092bm = null;
        this.f197093bn = true;
        this.f197094bo = 0;
        this.f197095bp = false;
        this.f197344r = false;
        this.f197345s = EnumC87177o.IDLE;
        this.f197346t = EnumC87165c.IDLE;
        this.f197347u = false;
        this.f197348v = false;
        this.f197349w = false;
        this.f197350x = false;
        this.f197096bq = 0;
        this.f197097br = 0;
        this.f197098bs = 0;
        this.f197099bt = 0;
        this.f197100bu = 3;
        this.f197101bv = 0;
        this.f197102bw = 0;
        this.f197103bx = 0;
        this.f197351y = -1;
        this.f197104by = -1;
        this.f197105bz = -1;
        this.f197055bA = -1;
        this.f197056bB = 1;
        this.f197057bC = -1;
        this.f197058bD = -1;
        this.f197059bE = -1;
        this.f197060bF = 0;
        this.f197061bG = 0;
        this.f197062bH = -1;
        this.f197063bI = 0;
        this.f197064bJ = -1;
        this.f197065bK = 0;
        this.f197066bL = -1.0f;
        this.f197067bM = -1;
        this.f197068bN = -1.0f;
        this.f197069bO = -1;
        this.f197352z = null;
        this.f197070bP = null;
        this.f196979A = false;
        this.f197071bQ = null;
        this.f196980B = null;
        this.f196981C = 0;
        this.f196982D = false;
        this.f196983E = false;
        this.f196984F = "rad";
        this.f197072bR = false;
        this.f197073bS = -1;
        this.f196985G = 4;
        this.f196986H = true;
        this.f197074bT = 1;
        this.f197075bU = 0;
        this.f197076bV = 0;
        this.f197077bW = 0;
        this.f197078bX = 1;
        this.f197079bY = 0;
        this.f197080bZ = 0;
        this.f197132ca = 0;
        this.f197133cb = -1;
        this.f197134cc = 0;
        this.f196987I = 0;
        this.f197135cd = 0;
        this.f197136ce = 10000;
        this.f196988J = -1;
        this.f196989K = -1;
        this.f196990L = null;
        this.f196991M = 0;
        this.f197137cf = 0;
        this.f197138cg = 4;
        this.f197139ch = 0;
        this.f197140ci = 0;
        this.f197141cj = 0;
        this.f197142ck = 0;
        this.f197143cl = 0;
        this.f197144cm = 0;
        this.f197145cn = 0;
        this.f197146co = 5000000;
        this.f197147cp = null;
        this.f197148cq = null;
        this.f196992N = null;
        this.f196993O = false;
        this.f197149cr = -1;
        this.f196994P = "origin";
        this.f197150cs = -1;
        this.f196995Q = "main";
        this.f196996R = "flv";
        this.f197151ct = "none";
        this.f197152cu = "none";
        this.f197153cv = "none";
        this.f197154cw = "tcp";
        this.f197155cx = false;
        this.f197156cy = "none";
        this.f197157cz = "";
        this.f197107cA = "";
        this.f197108cB = "";
        this.f197109cC = "";
        this.f197110cD = 0;
        this.f197111cE = 0;
        this.f197112cF = 0;
        this.f197113cG = 15;
        this.f197114cH = 0;
        this.f197115cI = 2000000;
        this.f197116cJ = 4096;
        this.f197117cK = 100000;
        this.f197118cL = 4096;
        this.f197119cM = 100000;
        this.f197120cN = 1;
        this.f197121cO = 10000;
        this.f197122cP = 1;
        this.f197123cQ = 0;
        this.f197124cR = 15000;
        this.f197125cS = 100;
        this.f197126cT = 1;
        this.f197127cU = 0;
        this.f197128cV = 1;
        this.f196997U = 0;
        this.f197129cW = -1;
        this.f196998V = -1;
        this.f196999W = false;
        this.f197130cX = 1;
        this.f197131cY = 1;
        this.f197185da = -1;
        this.f197186db = -1;
        this.f197187dc = 0;
        this.f197000Z = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.f197188dd = 0;
        this.f197189de = 0;
        this.f197190df = 1;
        this.f197191dg = null;
        this.f197028aa = 0;
        this.f197029ab = 0;
        this.f197030ac = 0;
        this.f197192dh = 0;
        this.f197193di = 0;
        this.f197194dj = true;
        this.f197195dk = true;
        this.f197196dl = false;
        this.f197197dm = 0;
        this.f197198dn = 0;
        this.f197199do = -1;
        this.f197200dp = 0;
        this.f197201dq = 1;
        this.f197031ad = 0;
        this.f197032ae = 1;
        this.f197202dr = 1;
        this.f197203ds = 1;
        this.f197204dt = 8000;
        this.f197033af = false;
        this.f197034ag = false;
        this.f197035ah = 0;
        this.f197205du = 0;
        this.f197206dv = 0;
        this.f197036ai = 0;
        this.f197207dw = 0;
        this.f197208dx = 0;
        this.f197209dy = 0;
        this.f197210dz = 0;
        this.f197159dA = null;
        this.f197160dB = 0;
        this.f197162dD = 1;
        this.f197163dE = false;
        this.f197164dF = false;
        this.f197165dG = null;
        this.f197166dH = null;
        this.f197167dI = null;
        this.f197168dJ = 0;
        this.f197169dK = 0;
        this.f197170dL = false;
        this.f197171dM = false;
        this.f197172dN = false;
        this.f197173dO = 39;
        this.f197174dP = 1200;
        this.f197175dQ = 0;
        this.f197176dR = 1;
        this.f197177dS = 1;
        this.f197178dT = 1;
        this.f197179dU = 100;
        this.f197180dV = 0;
        this.f197181dW = 0;
        this.f197182dX = 0;
        this.f197183dY = 1;
        this.f197184dZ = 0;
        this.f197238ea = 0;
        this.f197239eb = 0;
        this.f197240ec = 0;
        this.f197241ed = 0;
        this.f197242ee = 0;
        this.f197243ef = 0;
        this.f197244eg = -1;
        this.f197245eh = -1;
        this.f197246ei = 0;
        this.f197247ej = 0;
        this.f197248ek = 0;
        this.f197249el = 0;
        this.f197250em = 10000;
        this.f197251en = 0;
        this.f197252eo = 0;
        this.f197253ep = 0;
        this.f197254eq = false;
        this.f197255er = null;
        this.f197037aj = false;
        this.f197038ak = -1;
        this.f197039al = false;
        this.f197040am = false;
        this.f197041an = 1;
        this.f197256es = null;
        this.f197257et = null;
        this.f197258eu = false;
        this.f197259ev = 0;
        this.f197042ao = true;
        this.f197043ap = 0;
        this.f197044aq = 0;
        this.f197045ar = false;
        this.f197260ew = 0;
        this.f197261ex = -1.0f;
        this.f197262ey = -1.0f;
        this.f197263ez = -1.0f;
        this.f197212eA = -1.0f;
        this.f197213eB = 0;
        this.f197214eC = 0;
        this.f197215eD = 0;
        this.f197216eE = 0;
        this.f197217eF = 0;
        this.f197218eG = 0;
        this.f197219eH = 1000;
        this.f197046as = -1;
        this.f197220eI = -1;
        this.f197221eJ = 1000000;
        this.f197222eK = 0.0f;
        this.f197223eL = 0.0f;
        this.f197224eM = 0.0f;
        this.f197225eN = 0.0f;
        this.f197226eO = 0.0f;
        this.f197227eP = 0.0f;
        this.f197228eQ = 0.0f;
        this.f197229eR = 0.0f;
        this.f197230eS = 0.0f;
        this.f197231eT = -1;
        this.f197232eU = -1;
        this.f197233eV = -1;
        this.f197234eW = 0;
        this.f197235eX = -1;
        this.f197236eY = 60;
        this.f197237eZ = false;
        this.f197047at = -1;
        this.f197291fa = -3;
        this.f197048au = null;
        this.f197049av = null;
        this.f197292fb = -1;
        this.f197293fc = 0;
        this.f197294fd = 0;
        this.f197050aw = 10000;
        this.f197051ax = false;
        this.f197052ay = 0;
        this.f197053az = false;
        this.f197295fe = null;
        this.f197002aA = null;
        this.f197296ff = new RunnableC87179q(this, (byte) 0);
        this.f197003aB = new Object();
        this.f197004aC = false;
        this.f197005aD = 0;
        this.f197006aE = 0;
        this.f197007aF = 0;
        this.f197297fg = 5000;
        this.f197298fh = 1;
        this.f197299fi = 300;
        this.f197300fj = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.f197301fk = 0;
        this.f197302fl = 0;
        this.f197008aG = 0;
        this.f197009aH = 0;
        this.f197303fm = 5000;
        this.f197304fn = 0;
        this.f197305fo = 0;
        this.f197306fp = "";
        this.f197307fq = "";
        this.f197308fr = null;
        this.f197010aI = 0;
        this.f197309fs = 0;
        this.f197310ft = "";
        this.f197311fu = "";
        this.f197313fw = -1;
        this.f197314fx = -1;
        this.f197315fy = 0;
        this.f197011aJ = false;
        this.f197012aK = false;
        this.f197316fz = 0;
        this.f197265fA = 0;
        this.f197013aL = 0;
        this.f197266fB = 0;
        this.f197267fC = 0;
        this.f197268fD = 0;
        this.f197269fE = false;
        this.f197270fF = 0;
        this.f197014aM = false;
        this.f197271fG = 0;
        this.f197015aN = 0;
        this.f197272fH = 0;
        this.f197273fI = 0;
        this.f197274fJ = 0;
        this.f197275fK = 0;
        this.f197276fL = new C87164b(this, (byte) 0);
        this.f197016aO = 5000;
        this.f197277fM = 200;
        this.f197278fN = 0;
        this.f197279fO = null;
        this.f197017aP = 0;
        this.f197018aQ = 0;
        this.f197019aR = false;
        this.f197020aS = -1;
        this.f197280fP = 1920;
        this.f197281fQ = 1080;
        this.f197282fR = 0;
        this.f197021aT = -1.0f;
        this.f197022aU = -1.0f;
        this.f197023aV = 6.0f;
        this.f197024aW = 1;
        this.f197283fS = null;
        this.f197284fT = null;
        this.f197285fU = 0;
        this.f197286fV = 0;
        this.f197025aX = false;
        this.f197287fW = false;
        this.f197288fX = 0;
        this.f197289fY = 5;
        this.f197290fZ = "";
        this.f197318ga = null;
        this.f197319gb = "";
        this.f197320gc = 0;
        this.f197321gd = 0;
        this.f197322ge = -1;
        this.f197026aY = null;
        this.f197027aZ = 0;
        this.f197081ba = 0;
        this.f197323gf = false;
        this.f197324gg = new LinkedList();
        this.f197325gh = -1;
        this.f197326gi = 1;
        this.f197327gj = -1;
        this.f197328gk = 1;
        this.f197082bb = 0;
        this.f197329gl = 0;
        this.f197330gm = 0;
        this.f197331gn = 0;
        this.f197332go = 0;
        this.f197333gp = 0;
        Context context = aVar.f197367a;
        this.f197083bc = context;
        AbstractC87117a aVar2 = aVar.f197368b;
        this.f197158d = aVar2;
        AbstractC87123b bVar = aVar.f197371e;
        this.f197211e = bVar;
        aVar.f197380n = this.f197050aw;
        if (bVar != null) {
            this.f197013aL = ((Integer) bVar.mo12962a("live_sdk_should_report_session_stop", 0)).intValue();
            this.f197278fN = ((Integer) bVar.mo12962a("live_sdk_enable_use_live_threadpool", 0)).intValue();
        }
        C87119b bVar2 = new C87119b(this, aVar2, aVar.f197381o, aVar.f197380n, context, this.f197013aL);
        this.f197054b = bVar2;
        bVar2.f196733g = aVar.f197369c;
        if (this.f197278fN != 1 || aVar.f197384r == null) {
            this.f197279fO = new ThreadPoolExecutor(1, 3, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC87175m() {
                /* class com.p2082ss.videoarch.p4474a.C87154g.C871551 */

                static {
                    Covode.recordClassIndex(102956);
                }
            });
        } else {
            this.f197279fO = aVar.f197384r;
            this.f197054b.f196595dT = 1;
        }
        this.f197317g = new C87151a(new C87174l(this), aVar.f197374h, aVar.f197380n, this.f197054b);
        this.f197334h = new C87149b(context);
        boolean z = aVar.f197372f;
        this.f197254eq = z;
        this.f197054b.f196433aQ = z;
        AbstractC87127c cVar = aVar.f197370d;
        this.f197106c = cVar;
        C87135a aVar3 = new C87135a(context, this.f197279fO, cVar);
        this.f197264f = aVar3;
        aVar3.mo140942b();
        this.f197084bd = aVar.f197375i;
        this.f196996R = aVar.f197377k;
        this.f196994P = aVar.f197376j;
        this.f196981C = 0;
        this.f196983E = aVar.f197378l;
        this.f196986H = aVar.f197379m;
        this.f197204dt = aVar.f197383q;
        this.f197322ge = hashCode();
    }

    /* renamed from: a */
    private void m151120a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("hw_dec")) != null && optJSONObject.has("enable")) {
            boolean optBoolean = optJSONObject.optBoolean("enable");
            this.f197102bw = optBoolean ? 1 : 0;
            boolean z = true;
            if (!(this.f197101bv == 1 && optBoolean)) {
                z = false;
                this.f197103bx = 0;
            }
            try {
                optJSONObject.put("enable", z);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo140986b(int i) {
        String str;
        boolean z = false;
        if (this.f197190df != 2 || (str = this.f197335i.mo140905d("h264").f196913a) == null) {
            return false;
        }
        mo141012v();
        this.f197054b.mo140869d();
        mo141010t();
        this.f196999W = true;
        this.f197054b.f196745h = str;
        this.f197054b.mo140854a(this.f197071bQ, str, "bytevc1_to_h264", i);
        this.f197071bQ = str;
        this.f197190df = 1;
        this.f197054b.f196436aT = "h264";
        if (this.f197101bv != 1 && this.f197197dm == 1) {
            this.f197101bv = 1;
            this.f197062bH = 0;
            this.f197336j.mo16687a(59, 1);
            C87119b bVar = this.f197054b;
            if (this.f197101bv == 1) {
                z = true;
            }
            bVar.f196392C = z;
        }
        mo140995f();
        this.f197267fC = System.currentTimeMillis();
        mo140994e(str);
        return true;
    }

    /* synthetic */ C87154g(C87163a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    private static JSONObject m151118a(JSONObject jSONObject, String str) {
        try {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
            if (obj instanceof String) {
                return new JSONObject((String) obj);
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private String m151113a(String str, long j) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f197161dC)) {
            return null;
        }
        String str2 = this.f197161dC + "." + j;
        this.f197054b.f196411V = str2;
        if (!str.contains("_session_id")) {
            return m151123b(str, "_session_id", str2);
        }
        return str;
    }

    /* renamed from: a */
    private String m151114a(String str, String str2) {
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            String host = url.getHost();
            url.getPort();
            String file = url.getFile();
            if (2 == this.f197335i.f196886b) {
                if (this.f197154cw.equals("kcp")) {
                    protocol = "httpk";
                } else if (this.f197154cw.equals("quic") || this.f197154cw.equals("quicu")) {
                    protocol = "httpq";
                } else if (this.f197154cw.equals("tls")) {
                    protocol = "https";
                } else if (this.f197154cw.equals("tcp")) {
                    protocol = "http";
                } else if (TextUtils.equals(this.f197154cw, "h2") || TextUtils.equals(this.f197154cw, "h2q") || TextUtils.equals(this.f197154cw, "h2qu")) {
                    protocol = "httpx";
                }
            }
            StringBuilder append = new StringBuilder().append(protocol).append("://").append(host);
            if (TextUtils.isEmpty(str2)) {
                append.append(file);
            } else {
                append.append(":").append(str2).append(file);
            }
            return append.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: c */
    private static String m151126c(String str, String str2, String str3) {
        return str + "&" + str2 + "=" + str3;
    }

    /* renamed from: a */
    private static String m151115a(String str, String str2, String str3) {
        if (!str.equals("")) {
            str = str + "&";
        }
        return ((str + str2) + "=") + str3;
    }

    /* renamed from: b */
    private static String m151123b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str4 = str2 + "=" + str3;
        int indexOf = str.indexOf("?");
        if (indexOf == -1) {
            str4 = "?".concat(String.valueOf(str4));
        } else if (indexOf != str.length() - 1) {
            str4 = "&".concat(String.valueOf(str4));
        }
        return str + str4;
    }

    /* renamed from: a */
    private String m151116a(String str, String str2, String str3, Map<String, String> map) {
        boolean z;
        String str4;
        AVMDLDataLoader instance;
        if (!this.f196996R.equals("flv") || this.f196983E || TextUtils.isEmpty(this.f196990L) || (this.f197332go == 0 && (this.f197154cw.equals("quic") || this.f197154cw.equals("quicu")))) {
            this.f197054b.f196580dE = "proxy not support format: " + this.f196996R + ", protocol: " + this.f197154cw + ", liveio support quic: " + this.f197332go + " ,abr: " + this.f196983E + ", session id invalid: " + TextUtils.isEmpty(this.f196990L);
            return null;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(str2)) {
                z = C87135a.m151008a(str2);
            } else {
                z = false;
            }
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
                str4 = null;
            } else {
                C87135a.C87140b a = C87135a.m151006a(str, z);
                str.startsWith("http");
                String str5 = str.substring(0, a.f196934a) + str3;
                int i = a.f196935b;
                if (a.f196936c != -1) {
                    str5 = str5 + str.substring(a.f196935b, a.f196936c);
                    i = a.f196936c;
                }
                str4 = str5 + str.substring(i);
            }
            if (this.f197015aN == 1 && (this.f197154cw.equals("quic") || this.f197154cw.equals("quicu"))) {
                this.f197015aN = 0;
            }
            if (this.f197270fF == 1 && this.f197271fG == 1) {
                return m151117a(str4, str2, map, z);
            }
            C87125b.m150937a(8100);
            C87125b.m150940a();
            if (this.f197094bo == 1 && C87125b.m150937a(8100) == 1 && !C87135a.m151008a(str2) && C87125b.m150940a() && this.f197095bp) {
                long j = this.f197149cr;
                if (!(j == -1 || (instance = AVMDLDataLoader.getInstance()) == null)) {
                    instance.setLongValue(1100, j);
                }
                this.f197344r = true;
                m151119a(new RunnableC87176n(this, this.f196990L, false));
                String a2 = C87125b.m150938a(str4, Boolean.valueOf(this.f197095bp));
                if (a2 != null && !a2.isEmpty()) {
                    map.put("Stream-Type", "live");
                    String str6 = this.f196990L;
                    if (str6 != null) {
                        map.put("X-Tt-Traceid", str6);
                    }
                    if (str2 != null && !str2.equals("none")) {
                        if (str2.startsWith("[")) {
                            str2 = str2.substring(1, str2.length() - 1);
                        }
                        map.put("X-Given-IPs", str2);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", a2);
                        if (str2 != null) {
                            jSONObject.put("ip", str2);
                        }
                        String str7 = this.f196990L;
                        if (str7 != null) {
                            jSONObject.put("traceId", str7);
                        }
                        String jSONObject2 = jSONObject.toString();
                        AVMDLDataLoader instance2 = AVMDLDataLoader.getInstance();
                        if (instance2 != null) {
                            instance2.setStringValue(8017, jSONObject2);
                        }
                    } catch (Exception unused) {
                    }
                    return a2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m151117a(String str, String str2, Map<String, String> map, boolean z) {
        if (!this.f197269fE) {
            this.f197054b.f196580dE = "liveio protocol register fail";
            return null;
        } else if (!LiveIOWrapper.getInstance().isRunning()) {
            this.f197054b.f196580dE = "liveio not running";
            return null;
        } else {
            String liveURL = LiveIOWrapper.getInstance().getLiveURL(str);
            if (TextUtils.isEmpty(liveURL)) {
                return null;
            }
            String str3 = this.f196990L;
            if (str3 != null) {
                if (this.f197322ge != -1) {
                    this.f197026aY = this.f196990L + "." + this.f197322ge;
                } else {
                    this.f197026aY = str3;
                }
                map.put("X-Session-ID", this.f197026aY);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                if (str2 != null && !str2.equals("none")) {
                    if (z) {
                        str2 = C1764a.m5928a("[%s]", new Object[]{str2});
                    }
                    jSONObject.put("given_ips", str2);
                }
                jSONObject.put("url", str);
                jSONObject.put("http_is_enable_prepare", this.f197272fH);
                jSONObject.put("is_pcdn", this.f197015aN);
                jSONObject.put("is_pcdn_up", this.f197274fJ);
                jSONObject.put("ab_group_id", this.f197275fK);
                jSONObject.put("pcdn_io_type", this.f197320gc);
                jSONObject.put("fastopen", this.f197208dx);
                if (this.f197154cw.equals("quicu")) {
                    jSONObject.put("suggest_protocol", "quic");
                } else {
                    jSONObject.put("suggest_protocol", this.f197154cw);
                }
                jSONObject.put("is_freeflow", this.f197273fI);
                jSONObject.put("task_start_time", System.currentTimeMillis());
                jSONObject.put("is_low_latency_flv", this.f197210dz);
                jSONObject.put("ttnet_nqe_info", this.f197054b.f196516bu);
                LiveIOWrapper.getInstance().prepare(this.f197026aY, jSONObject.toString());
                this.f197014aM = true;
                this.f197054b.f196578dC = 1;
                this.f197054b.f196582dG = LiveIOWrapper.getInstance().getStringValue(1100);
                if (this.f197015aN == 1) {
                    this.f197054b.f196579dD = 1;
                }
                m151119a(new RunnableC87176n(this, this.f197026aY, true));
                return liveURL;
            } catch (Exception unused) {
                this.f197054b.f196580dE = "liveio prepare fail";
                return null;
            }
        }
    }
}
