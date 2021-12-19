package com.p2082ss.videoarch.p4474a.p4475a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.videoarch.p4474a.AbstractC87117a;
import com.p2082ss.videoarch.p4474a.C87154g;
import com.p2082ss.videoarch.p4474a.p4476b.C87125b;
import com.ss.videoarch.live.LiveIOWrapper;
import java.net.InetAddress;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.a.a.b */
public class C87119b implements Handler.Callback {

    /* renamed from: ep */
    private static final String f196389ep = C87119b.class.getCanonicalName();

    /* renamed from: A */
    public boolean f196390A;

    /* renamed from: B */
    public String f196391B = "none";

    /* renamed from: C */
    public boolean f196392C;

    /* renamed from: D */
    public String f196393D = "none";

    /* renamed from: E */
    public boolean f196394E;

    /* renamed from: F */
    public int f196395F = -1;

    /* renamed from: G */
    public float f196396G = -1.0f;

    /* renamed from: H */
    public int f196397H = -1;

    /* renamed from: I */
    public float f196398I = -1.0f;

    /* renamed from: J */
    public int f196399J;

    /* renamed from: K */
    public String f196400K = "none";

    /* renamed from: L */
    public String f196401L = "none";

    /* renamed from: M */
    public long f196402M;

    /* renamed from: N */
    public int f196403N;

    /* renamed from: O */
    public int f196404O = -1;

    /* renamed from: P */
    public int f196405P;

    /* renamed from: Q */
    public int f196406Q;

    /* renamed from: R */
    public int f196407R;

    /* renamed from: S */
    public int f196408S = -1;

    /* renamed from: T */
    public int f196409T;

    /* renamed from: U */
    public String f196410U = "none";

    /* renamed from: V */
    public String f196411V = "none";

    /* renamed from: W */
    public boolean f196412W;

    /* renamed from: X */
    public long f196413X;

    /* renamed from: Y */
    public long f196414Y;

    /* renamed from: Z */
    public long f196415Z;

    /* renamed from: a */
    Context f196416a;

    /* renamed from: aA */
    public int f196417aA;

    /* renamed from: aB */
    public long f196418aB;

    /* renamed from: aC */
    public int f196419aC;

    /* renamed from: aD */
    public int f196420aD;

    /* renamed from: aE */
    public int f196421aE;

    /* renamed from: aF */
    public int f196422aF;

    /* renamed from: aG */
    public int f196423aG = -1;

    /* renamed from: aH */
    public String f196424aH;

    /* renamed from: aI */
    public int f196425aI;

    /* renamed from: aJ */
    public int f196426aJ;

    /* renamed from: aK */
    public int f196427aK;

    /* renamed from: aL */
    public int f196428aL = -1;

    /* renamed from: aM */
    public ArrayList<Long> f196429aM;

    /* renamed from: aN */
    public String f196430aN = "none";

    /* renamed from: aO */
    public String f196431aO = "none";

    /* renamed from: aP */
    public boolean f196432aP;

    /* renamed from: aQ */
    public boolean f196433aQ;

    /* renamed from: aR */
    public int f196434aR;

    /* renamed from: aS */
    public int f196435aS = -1;

    /* renamed from: aT */
    public String f196436aT = "none";

    /* renamed from: aU */
    public boolean f196437aU;

    /* renamed from: aV */
    public int f196438aV = -1;

    /* renamed from: aW */
    public int f196439aW;

    /* renamed from: aX */
    public int f196440aX = -1;

    /* renamed from: aY */
    public boolean f196441aY;

    /* renamed from: aZ */
    public int f196442aZ;

    /* renamed from: aa */
    public long f196443aa;

    /* renamed from: ab */
    public boolean f196444ab;

    /* renamed from: ac */
    public long f196445ac;

    /* renamed from: ad */
    public long f196446ad;

    /* renamed from: ae */
    public long f196447ae;

    /* renamed from: af */
    public long f196448af;

    /* renamed from: ag */
    public long f196449ag;

    /* renamed from: ah */
    public int f196450ah;

    /* renamed from: ai */
    public int f196451ai;

    /* renamed from: aj */
    public int f196452aj = -1;

    /* renamed from: ak */
    public boolean f196453ak;

    /* renamed from: al */
    public boolean f196454al;

    /* renamed from: am */
    public long f196455am = 10000;

    /* renamed from: an */
    public boolean f196456an;

    /* renamed from: ao */
    public long f196457ao;

    /* renamed from: ap */
    public long f196458ap;

    /* renamed from: aq */
    public long f196459aq;

    /* renamed from: ar */
    NTPUDPClient f196460ar;

    /* renamed from: as */
    public InetAddress f196461as;

    /* renamed from: at */
    public C87120a f196462at;

    /* renamed from: au */
    public boolean f196463au;

    /* renamed from: av */
    public int f196464av = -1;

    /* renamed from: aw */
    String f196465aw;

    /* renamed from: ax */
    public boolean f196466ax;

    /* renamed from: ay */
    public String f196467ay;

    /* renamed from: az */
    public int f196468az;

    /* renamed from: b */
    public AbstractC87117a f196469b;

    /* renamed from: bA */
    public String f196470bA = "none";

    /* renamed from: bB */
    public long f196471bB = -1;

    /* renamed from: bC */
    public int f196472bC = -1;

    /* renamed from: bD */
    public int f196473bD;

    /* renamed from: bE */
    public String f196474bE = "none";

    /* renamed from: bF */
    public boolean f196475bF;

    /* renamed from: bG */
    public int f196476bG = -1;

    /* renamed from: bH */
    public long f196477bH = -1;

    /* renamed from: bI */
    public long f196478bI = -1;

    /* renamed from: bJ */
    public long f196479bJ = -1;

    /* renamed from: bK */
    public long f196480bK = -1;

    /* renamed from: bL */
    public String f196481bL = "none";

    /* renamed from: bM */
    public int f196482bM = 4;

    /* renamed from: bN */
    public boolean f196483bN;

    /* renamed from: bO */
    public long f196484bO;

    /* renamed from: bP */
    public long f196485bP;

    /* renamed from: bQ */
    public long f196486bQ = -1;

    /* renamed from: bR */
    public long f196487bR = -1;

    /* renamed from: bS */
    public long f196488bS;

    /* renamed from: bT */
    public int f196489bT = -1;

    /* renamed from: bU */
    public int f196490bU = -1;

    /* renamed from: bV */
    public int f196491bV = -1;

    /* renamed from: bW */
    public int f196492bW = -1;

    /* renamed from: bX */
    public int f196493bX = -1;

    /* renamed from: bY */
    public int f196494bY;

    /* renamed from: bZ */
    public int f196495bZ;

    /* renamed from: ba */
    public int f196496ba = 1;

    /* renamed from: bb */
    public long f196497bb;

    /* renamed from: bc */
    public long f196498bc;

    /* renamed from: bd */
    public String f196499bd = "none";

    /* renamed from: be */
    public int f196500be;

    /* renamed from: bf */
    public boolean f196501bf;

    /* renamed from: bg */
    public boolean f196502bg;

    /* renamed from: bh */
    public float f196503bh = -1.0f;

    /* renamed from: bi */
    public long f196504bi;

    /* renamed from: bj */
    public String f196505bj = "none";

    /* renamed from: bk */
    public String f196506bk = "none";

    /* renamed from: bl */
    public int f196507bl = -1;

    /* renamed from: bm */
    public String f196508bm = "none";

    /* renamed from: bn */
    public String f196509bn = "none";

    /* renamed from: bo */
    public boolean f196510bo;

    /* renamed from: bp */
    public boolean f196511bp;

    /* renamed from: bq */
    public JSONObject f196512bq;

    /* renamed from: br */
    public JSONObject f196513br;

    /* renamed from: bs */
    public JSONObject f196514bs;

    /* renamed from: bt */
    public String f196515bt = "none";

    /* renamed from: bu */
    public String f196516bu = "none";

    /* renamed from: bv */
    public boolean f196517bv;

    /* renamed from: bw */
    public String f196518bw = "rad";

    /* renamed from: bx */
    public boolean f196519bx;

    /* renamed from: by */
    public String f196520by = "origin";

    /* renamed from: bz */
    public String f196521bz = "origin";

    /* renamed from: c */
    public C87122c f196522c;

    /* renamed from: cA */
    public int f196523cA;

    /* renamed from: cB */
    public String f196524cB = "none";

    /* renamed from: cC */
    public Map<String, String> f196525cC;

    /* renamed from: cD */
    public String f196526cD = "none";

    /* renamed from: cE */
    public int f196527cE;

    /* renamed from: cF */
    public int f196528cF = -1;

    /* renamed from: cG */
    public float f196529cG = -1.0f;

    /* renamed from: cH */
    public float f196530cH = -1.0f;

    /* renamed from: cI */
    public int f196531cI;

    /* renamed from: cJ */
    public int f196532cJ = -1;

    /* renamed from: cK */
    public int f196533cK = -1;

    /* renamed from: cL */
    public long f196534cL;

    /* renamed from: cM */
    public int f196535cM;

    /* renamed from: cN */
    public C87122c f196536cN;

    /* renamed from: cO */
    public boolean f196537cO;

    /* renamed from: cP */
    public long f196538cP;

    /* renamed from: cQ */
    public long f196539cQ;

    /* renamed from: cR */
    public long f196540cR;

    /* renamed from: cS */
    public long f196541cS;

    /* renamed from: cT */
    public long f196542cT;

    /* renamed from: cU */
    public long f196543cU;

    /* renamed from: cV */
    public long f196544cV;

    /* renamed from: cW */
    public long f196545cW;

    /* renamed from: cX */
    public long f196546cX;

    /* renamed from: cY */
    public long f196547cY;

    /* renamed from: cZ */
    public long f196548cZ;

    /* renamed from: ca */
    public List<String> f196549ca;

    /* renamed from: cb */
    public LinkedBlockingQueue<Long> f196550cb;

    /* renamed from: cc */
    public int f196551cc = -1;

    /* renamed from: cd */
    public int f196552cd;

    /* renamed from: ce */
    public int f196553ce;

    /* renamed from: cf */
    public int f196554cf;

    /* renamed from: cg */
    public int f196555cg;

    /* renamed from: ch */
    public int f196556ch;

    /* renamed from: ci */
    public int f196557ci;

    /* renamed from: cj */
    public int f196558cj;

    /* renamed from: ck */
    public int f196559ck = 10;

    /* renamed from: cl */
    public int f196560cl = 5000;

    /* renamed from: cm */
    public String f196561cm = "none";

    /* renamed from: cn */
    public int f196562cn = -1;

    /* renamed from: co */
    public long f196563co;

    /* renamed from: cp */
    public long f196564cp;

    /* renamed from: cq */
    public long f196565cq;

    /* renamed from: cr */
    public long f196566cr;

    /* renamed from: cs */
    public int f196567cs;

    /* renamed from: ct */
    public String f196568ct = "none";

    /* renamed from: cu */
    public String f196569cu = "none";

    /* renamed from: cv */
    public int f196570cv;

    /* renamed from: cw */
    public int f196571cw;

    /* renamed from: cx */
    public int f196572cx = 1;

    /* renamed from: cy */
    public boolean f196573cy;

    /* renamed from: cz */
    public int f196574cz = -1;

    /* renamed from: d */
    public C87154g f196575d;

    /* renamed from: dA */
    public long f196576dA;

    /* renamed from: dB */
    public long f196577dB;

    /* renamed from: dC */
    public int f196578dC;

    /* renamed from: dD */
    public int f196579dD;

    /* renamed from: dE */
    public String f196580dE = "none";

    /* renamed from: dF */
    public long f196581dF;

    /* renamed from: dG */
    public String f196582dG = "none";

    /* renamed from: dH */
    public long f196583dH;

    /* renamed from: dI */
    public long f196584dI;

    /* renamed from: dJ */
    public int f196585dJ;

    /* renamed from: dK */
    public int f196586dK;

    /* renamed from: dL */
    public long f196587dL;

    /* renamed from: dM */
    public long f196588dM;

    /* renamed from: dN */
    public long f196589dN;

    /* renamed from: dO */
    public long f196590dO;

    /* renamed from: dP */
    public int f196591dP = 4096;

    /* renamed from: dQ */
    public int f196592dQ = 512;

    /* renamed from: dR */
    public String f196593dR = "";

    /* renamed from: dS */
    public String f196594dS = "";

    /* renamed from: dT */
    public int f196595dT;

    /* renamed from: dU */
    public int f196596dU;

    /* renamed from: dV */
    public int f196597dV = -1;

    /* renamed from: dW */
    public StringBuilder f196598dW;

    /* renamed from: dX */
    public long f196599dX;

    /* renamed from: dY */
    public ArrayList<Integer> f196600dY = new ArrayList<>();

    /* renamed from: dZ */
    public volatile long f196601dZ = 0;

    /* renamed from: da */
    public long f196602da;

    /* renamed from: db */
    public long f196603db;

    /* renamed from: dc */
    public long f196604dc;

    /* renamed from: dd */
    public long f196605dd;

    /* renamed from: de */
    public long f196606de;

    /* renamed from: df */
    public long f196607df;

    /* renamed from: dg */
    public long f196608dg;

    /* renamed from: dh */
    public long f196609dh;

    /* renamed from: di */
    public int f196610di = -1;

    /* renamed from: dj */
    public int f196611dj = -1;

    /* renamed from: dk */
    public int f196612dk = -1;

    /* renamed from: dl */
    public long f196613dl;

    /* renamed from: dm */
    public long f196614dm;

    /* renamed from: dn */
    public long f196615dn;

    /* renamed from: do */
    public long f196616do;

    /* renamed from: dp */
    public long f196617dp;

    /* renamed from: dq */
    public long f196618dq;

    /* renamed from: dr */
    public long f196619dr;

    /* renamed from: ds */
    public long f196620ds;

    /* renamed from: dt */
    public long f196621dt;

    /* renamed from: du */
    public long f196622du;

    /* renamed from: dv */
    public long f196623dv;

    /* renamed from: dw */
    public long f196624dw;

    /* renamed from: dx */
    public long f196625dx;

    /* renamed from: dy */
    public long f196626dy;

    /* renamed from: dz */
    public long f196627dz;

    /* renamed from: e */
    public String f196628e = "none";

    /* renamed from: eA */
    private String f196629eA = "flv";

    /* renamed from: eB */
    private int f196630eB;

    /* renamed from: eC */
    private int f196631eC;

    /* renamed from: eD */
    private long f196632eD;

    /* renamed from: eE */
    private long f196633eE;

    /* renamed from: eF */
    private long f196634eF = -1;

    /* renamed from: eG */
    private long f196635eG;

    /* renamed from: eH */
    private long f196636eH;

    /* renamed from: eI */
    private long f196637eI;

    /* renamed from: eJ */
    private long f196638eJ;

    /* renamed from: eK */
    private long f196639eK;

    /* renamed from: eL */
    private long f196640eL;

    /* renamed from: eM */
    private long f196641eM;

    /* renamed from: eN */
    private int f196642eN;

    /* renamed from: eO */
    private int f196643eO;

    /* renamed from: eP */
    private int f196644eP;

    /* renamed from: eQ */
    private int f196645eQ;

    /* renamed from: eR */
    private int f196646eR;

    /* renamed from: eS */
    private int f196647eS;

    /* renamed from: eT */
    private long f196648eT;

    /* renamed from: eU */
    private long f196649eU;

    /* renamed from: eV */
    private long f196650eV;

    /* renamed from: eW */
    private long f196651eW;

    /* renamed from: eX */
    private int f196652eX;

    /* renamed from: eY */
    private int f196653eY;

    /* renamed from: eZ */
    private int f196654eZ;

    /* renamed from: ea */
    public volatile long f196655ea = 0;

    /* renamed from: eb */
    public String f196656eb = "none";

    /* renamed from: ec */
    public float f196657ec = -1.0f;

    /* renamed from: ed */
    public int f196658ed = 0;

    /* renamed from: ee */
    public int f196659ee = 0;

    /* renamed from: ef */
    public int f196660ef = 0;

    /* renamed from: eg */
    public int f196661eg = 0;

    /* renamed from: eh */
    public int f196662eh = 0;

    /* renamed from: ei */
    public int f196663ei = 0;

    /* renamed from: ej */
    public int f196664ej = 0;

    /* renamed from: ek */
    public long f196665ek = 0;

    /* renamed from: el */
    public int f196666el = 0;

    /* renamed from: em */
    public int f196667em = 0;

    /* renamed from: en */
    public int f196668en = 0;

    /* renamed from: eo */
    public String f196669eo = "none";

    /* renamed from: eq */
    private Handler f196670eq;

    /* renamed from: er */
    private final long f196671er;

    /* renamed from: es */
    private boolean f196672es;

    /* renamed from: et */
    private String f196673et = "none";

    /* renamed from: eu */
    private String f196674eu = "none";

    /* renamed from: ev */
    private boolean f196675ev;

    /* renamed from: ew */
    private long f196676ew;

    /* renamed from: ex */
    private String f196677ex = "none";

    /* renamed from: ey */
    private boolean f196678ey;

    /* renamed from: ez */
    private boolean f196679ez;

    /* renamed from: f */
    public String f196680f = "none";

    /* renamed from: fA */
    private final int f196681fA = 4;

    /* renamed from: fB */
    private final int f196682fB = 600;

    /* renamed from: fC */
    private int f196683fC = -1;

    /* renamed from: fD */
    private int f196684fD = -1;

    /* renamed from: fE */
    private long f196685fE = -1;

    /* renamed from: fF */
    private int f196686fF;

    /* renamed from: fG */
    private long f196687fG;

    /* renamed from: fH */
    private long f196688fH;

    /* renamed from: fI */
    private long f196689fI;

    /* renamed from: fJ */
    private long f196690fJ;

    /* renamed from: fK */
    private long f196691fK;

    /* renamed from: fL */
    private long f196692fL;

    /* renamed from: fM */
    private long f196693fM;

    /* renamed from: fN */
    private long f196694fN;

    /* renamed from: fO */
    private int f196695fO = -1;

    /* renamed from: fP */
    private int f196696fP = -1;

    /* renamed from: fQ */
    private String f196697fQ = "none";

    /* renamed from: fR */
    private long f196698fR;

    /* renamed from: fS */
    private long f196699fS;

    /* renamed from: fT */
    private long f196700fT;

    /* renamed from: fU */
    private long f196701fU;

    /* renamed from: fV */
    private long f196702fV;

    /* renamed from: fW */
    private long f196703fW;

    /* renamed from: fX */
    private long f196704fX;

    /* renamed from: fY */
    private long f196705fY;

    /* renamed from: fZ */
    private long f196706fZ;

    /* renamed from: fa */
    private int f196707fa;

    /* renamed from: fb */
    private int f196708fb;

    /* renamed from: fc */
    private int f196709fc;

    /* renamed from: fd */
    private long f196710fd;

    /* renamed from: fe */
    private long f196711fe;

    /* renamed from: ff */
    private int f196712ff;

    /* renamed from: fg */
    private boolean f196713fg;

    /* renamed from: fh */
    private final long f196714fh = 300000;

    /* renamed from: fi */
    private ArrayList<Long> f196715fi;

    /* renamed from: fj */
    private ArrayList<Long> f196716fj;

    /* renamed from: fk */
    private ArrayList<Long> f196717fk;

    /* renamed from: fl */
    private ArrayList<Long> f196718fl;

    /* renamed from: fm */
    private long f196719fm = -1;

    /* renamed from: fn */
    private String f196720fn = "none";

    /* renamed from: fo */
    private String f196721fo = "none";

    /* renamed from: fp */
    private JSONObject f196722fp;

    /* renamed from: fq */
    private ArrayList<Integer> f196723fq;

    /* renamed from: fr */
    private ArrayList<Integer> f196724fr;

    /* renamed from: fs */
    private String f196725fs = "tcp";

    /* renamed from: ft */
    private String f196726ft = Build.BOARD;

    /* renamed from: fu */
    private String f196727fu = Build.HARDWARE;

    /* renamed from: fv */
    private int f196728fv;

    /* renamed from: fw */
    private long f196729fw;

    /* renamed from: fx */
    private final int f196730fx = 1;

    /* renamed from: fy */
    private final int f196731fy = 2;

    /* renamed from: fz */
    private final int f196732fz = 3;

    /* renamed from: g */
    public String f196733g = "none";

    /* renamed from: ga */
    private long f196734ga;

    /* renamed from: gb */
    private long f196735gb;

    /* renamed from: gc */
    private long f196736gc;

    /* renamed from: gd */
    private long f196737gd;

    /* renamed from: ge */
    private long f196738ge;

    /* renamed from: gf */
    private long f196739gf;

    /* renamed from: gg */
    private long f196740gg;

    /* renamed from: gh */
    private long f196741gh;

    /* renamed from: gi */
    private long f196742gi;

    /* renamed from: gj */
    private boolean f196743gj;

    /* renamed from: gk */
    private long f196744gk = 5000;

    /* renamed from: h */
    public String f196745h = "none";

    /* renamed from: i */
    public String f196746i = "none";

    /* renamed from: j */
    public String f196747j = "none";

    /* renamed from: k */
    public boolean f196748k;

    /* renamed from: l */
    public String f196749l = "none";

    /* renamed from: m */
    public String f196750m = "none";

    /* renamed from: n */
    public String f196751n = "none";

    /* renamed from: o */
    public String f196752o = "none";

    /* renamed from: p */
    public String f196753p = "none";

    /* renamed from: q */
    public String f196754q = "none";

    /* renamed from: r */
    public int f196755r = -1;

    /* renamed from: s */
    public int f196756s = -1;

    /* renamed from: t */
    public int f196757t = -1;

    /* renamed from: u */
    public int f196758u = -1;

    /* renamed from: v */
    public int f196759v = -1;

    /* renamed from: w */
    public String f196760w = "none";

    /* renamed from: x */
    public String f196761x = "none";

    /* renamed from: y */
    public String f196762y = "";

    /* renamed from: z */
    public boolean f196763z;

    /* renamed from: a */
    public final void mo140851a(String str) {
        if (this.f196672es) {
            this.f196672es = false;
            this.f196670eq.removeCallbacksAndMessages(null);
            C87120a aVar = this.f196462at;
            if (aVar != null) {
                aVar.f196764a.removeCallbacksAndMessages(null);
            }
            this.f196466ax = false;
        }
        mo140879j();
        m150883e(str);
        mo140872e();
    }

    /* renamed from: a */
    public final void mo140852a(String str, String str2) {
        if (this.f196536cN != null) {
            this.f196538cP = System.currentTimeMillis();
        }
        this.f196522c.f196794a = System.currentTimeMillis();
        if (this.f196748k) {
            this.f196741gh = this.f196522c.f196794a;
        }
        this.f196522c.f196841av = str2;
        this.f196674eu = str;
        this.f196745h = str;
        JSONObject b = mo140859b();
        this.f196415Z = 0;
        if (b != null) {
            try {
                b.put("event_key", "start_play").put("rule_ids", this.f196410U).put("set_surface_cost", this.f196497bb).put("start_play_time", this.f196522c.f196794a).put("stream_data", this.f196499bd).put("suggest_format", this.f196505bj).put("play_format", this.f196629eA).put("suggest_protocol", this.f196506bk).put("suggest_access_code", this.f196509bn).put("origin_url", this.f196508bm).put("log_total_count_when_playing", this.f196415Z);
                if (TextUtils.equals(this.f196725fs, "h2") || TextUtils.equals(this.f196725fs, "h2q") || TextUtils.equals(this.f196725fs, "h2qu")) {
                    b.remove("h2_context_start_cost");
                }
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                this.f196415Z++;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo140858a(boolean z, boolean z2) {
        this.f196522c.f196846b = System.currentTimeMillis();
        C87122c cVar = this.f196536cN;
        if (cVar != null) {
            cVar.f196846b = System.currentTimeMillis();
        }
        this.f196678ey = z2;
        this.f196679ez = z;
    }

    /* renamed from: a */
    public final void mo140856a(JSONObject jSONObject, JSONArray jSONArray, String str) {
        JSONObject b = mo140859b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            b.put(next, jSONObject.getLong(next));
        }
        if (b != null) {
            try {
                b.put("event_key", str).put("push_retry_stall", jSONArray).put("sei_source", this.f196522c.f196830ak);
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                long j = this.f196415Z;
                if (j > 0) {
                    this.f196415Z = j + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo140854a(String str, String str2, String str3, int i) {
        if (this.f196575d != null && this.f196469b != null) {
            try {
                JSONObject b = mo140859b();
                JSONObject put = b.put("event_key", "switch_url");
                if (str == null) {
                    str = "null";
                }
                JSONObject put2 = put.put("last_cdn_play_url", str);
                if (str2 == null) {
                    str2 = "null";
                }
                put2.put("next_cdn_play_url", str2).put("res_bitrate", this.f196471bB).put("last_res", this.f196470bA).put("code", i).put("reason", str3);
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                long j = this.f196415Z;
                if (j > 0) {
                    this.f196415Z = j + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo140842a(int i) {
        C87154g gVar;
        if (!this.f196412W && (gVar = this.f196575d) != null && this.f196469b != null) {
            gVar.mo140975a(this.f196522c, 2);
            JSONObject b = mo140859b();
            if (b != null) {
                try {
                    b.put("event_key", "first_frame_failed").put("start_time", System.currentTimeMillis()).put("reason", i);
                    m150880a(b);
                    this.f196469b.mo12858a(b, "live_client_monitor_log");
                    long j = this.f196415Z;
                    if (j > 0) {
                        this.f196415Z = j + 1;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo140846a(int i, boolean z) {
        this.f196630eB = -100015;
        if (z) {
            this.f196575d.mo140975a(this.f196522c, 5);
            long currentTimeMillis = System.currentTimeMillis();
            this.f196632eD = currentTimeMillis;
            if (this.f196710fd == 0) {
                this.f196710fd = currentTimeMillis;
            }
            if (this.f196535cM == 1) {
                if (this.f196693fM == 0) {
                    this.f196693fM = currentTimeMillis;
                }
                this.f196696fP = this.f196630eB;
            }
            this.f196633eE = currentTimeMillis;
            this.f196634eF = (long) i;
            this.f196444ab = true;
            if (this.f196718fl == null) {
                this.f196718fl = new ArrayList<>();
            }
            this.f196719fm = this.f196632eD - this.f196522c.f196794a;
        }
    }

    /* renamed from: a */
    public final void mo140849a(long j, int i, boolean z, boolean z2) {
        this.f196655ea = 1;
        if (j <= System.currentTimeMillis() - this.f196522c.f196794a && j > ((long) i)) {
            if (z) {
                this.f196654eZ++;
                this.f196648eT++;
                this.f196707fa = (int) (((long) this.f196707fa) + j);
                this.f196649eU += j;
                if (this.f196535cM == 1) {
                    this.f196689fI++;
                    this.f196690fJ += j;
                }
                long currentTimeMillis = System.currentTimeMillis() - this.f196522c.f196856l;
                if (this.f196721fo.equals("none")) {
                    this.f196721fo = currentTimeMillis + ":" + j;
                } else {
                    this.f196721fo += "," + currentTimeMillis + ":" + j;
                }
                if (this.f196748k) {
                    this.f196638eJ++;
                    this.f196639eK += j;
                    this.f196644eP++;
                    this.f196645eQ = (int) (((long) this.f196645eQ) + j);
                }
            } else {
                this.f196708fb++;
                this.f196650eV++;
                this.f196709fc = (int) (((long) this.f196709fc) + j);
                this.f196651eW += j;
                if (this.f196535cM == 1) {
                    this.f196691fK++;
                    this.f196692fL += j;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - this.f196522c.f196856l;
                if (this.f196720fn.equals("none")) {
                    this.f196720fn = currentTimeMillis2 + ":" + j;
                } else {
                    this.f196720fn += "," + currentTimeMillis2 + ":" + j;
                }
                if (this.f196748k) {
                    this.f196640eL++;
                    this.f196641eM += j;
                    this.f196646eR++;
                    this.f196647eS = (int) (((long) this.f196647eS) + j);
                }
            }
            if (z2) {
                this.f196575d.mo140975a(this.f196522c, 4);
                JSONObject b = mo140859b();
                if (b != null) {
                    try {
                        b.put("event_key", "render_stall").put(StringSet.type, z ? "video" : DataType.AUDIO).put("stall_time", j).put("video_buffer_time", this.f196522c.f196822ac).put("audio_buffer_time", this.f196522c.f196823ad);
                        this.f196469b.mo12858a(b, "live_client_monitor_log");
                        long j2 = this.f196415Z;
                        if (j2 > 0) {
                            this.f196415Z = j2 + 1;
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo140848a(long j, int i, boolean z) {
        if (j <= System.currentTimeMillis() - this.f196522c.f196794a && j > ((long) i)) {
            if (z) {
                this.f196702fV++;
                this.f196703fW += j;
                if (this.f196748k) {
                    this.f196737gd++;
                    this.f196738ge += j;
                }
            } else {
                this.f196704fX++;
                this.f196705fY += j;
                if (this.f196748k) {
                    this.f196739gf++;
                    this.f196740gg += j;
                }
            }
            JSONObject b = mo140859b();
            if (b != null) {
                try {
                    b.put("event_key", "demux_stall").put(StringSet.type, z ? "video" : DataType.AUDIO).put("stall_time", j);
                    this.f196469b.mo12858a(b, "live_client_monitor_log");
                    long j2 = this.f196415Z;
                    if (j2 > 0) {
                        this.f196415Z = j2 + 1;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo140850a(long j, boolean z) {
        JSONObject b;
        if (j <= System.currentTimeMillis() - this.f196522c.f196794a && (b = mo140859b()) != null) {
            try {
                b.put("event_key", "rtc_decode_stall").put(StringSet.type, z ? "video" : DataType.AUDIO).put("decode_stall_time", j);
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                long j2 = this.f196415Z;
                if (j2 > 0) {
                    this.f196415Z = j2 + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo140845a(int i, String str) {
        if (this.f196722fp == null) {
            this.f196722fp = new JSONObject();
        }
        try {
            this.f196722fp.put(Long.toString(System.currentTimeMillis() - this.f196522c.f196794a), i);
        } catch (JSONException e) {
            this.f196722fp = null;
            e.printStackTrace();
        }
        this.f196575d.mo140975a(this.f196522c, 2);
        JSONObject b = mo140859b();
        this.f196575d.mo140997g();
        if (b != null) {
            try {
                b.put("event_key", "play_error").put("code", i).put("info", str);
                m150880a(b);
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                long j = this.f196415Z;
                if (j > 0) {
                    this.f196415Z = j + 1;
                }
                this.f196630eB = i;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo140857a(boolean z) {
        if (this.f196419aC == 1) {
            C87125b.m150939a(z ? 8013 : 8014, this.f196411V, -1);
        }
        if (this.f196422aF == 1) {
            LiveIOWrapper.getInstance().setInt64ValueByStrKey(z ? 1008 : 1009, this.f196575d.f197026aY, -1);
        }
        JSONObject b = mo140859b();
        if (b != null) {
            try {
                b.put("event_key", "link").put("info", z ? "start" : "end");
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                long j = this.f196415Z;
                if (j > 0) {
                    this.f196415Z = j + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo140855a(String str, boolean z) {
        this.f196746i = str;
        this.f196675ev = z;
    }

    /* renamed from: a */
    public final void mo140844a(int i, int i2, long j) {
        LinkedBlockingQueue<Long> linkedBlockingQueue;
        int i3;
        JSONObject b;
        if (i >= 0 && i2 > 0 && j >= 0 && (linkedBlockingQueue = this.f196550cb) != null) {
            int i4 = this.f196683fC;
            if (i4 == -1) {
                this.f196683fC = i;
                this.f196684fD = i2;
                this.f196685fE = j;
            } else if (i != i4) {
                long j2 = -1;
                if (linkedBlockingQueue.size() > 0) {
                    j2 = this.f196550cb.peek().longValue();
                }
                int i5 = 0;
                if (j2 > 0 && j2 <= this.f196685fE) {
                    boolean z = false;
                    int i6 = 0;
                    while (this.f196550cb.size() > 0) {
                        long longValue = this.f196550cb.peek().longValue();
                        long j3 = this.f196685fE;
                        if (longValue == j3) {
                            z = true;
                        } else if (!z) {
                            continue;
                            this.f196550cb.poll().longValue();
                        }
                        if (longValue > j3 && longValue <= j) {
                            i6++;
                            if (longValue == j) {
                                break;
                            }
                        }
                        this.f196550cb.poll().longValue();
                    }
                    if (i - this.f196683fC == 1 && i6 > 0 && i6 != i2) {
                        if (i6 < i2) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        if (!(this.f196575d == null || (b = mo140859b()) == null)) {
                            try {
                                b.put("event_key", "stream_abnormal").put("stream_type", "video").put(StringSet.type, i3).put("sent_frames", i2).put("received_frames", i6);
                                this.f196469b.mo12858a(b, "live_client_monitor_log");
                                long j4 = this.f196415Z;
                                if (j4 > 0) {
                                    this.f196415Z = j4 + 1;
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                int i7 = this.f196683fC;
                if (i - i7 != 1) {
                    if (i <= i7) {
                        i5 = 1;
                    }
                    mo140843a(i5, i, i7);
                }
                this.f196683fC = i;
                this.f196684fD = i2;
                this.f196685fE = j;
            }
        }
    }

    /* renamed from: a */
    public final void mo140843a(int i, int i2, int i3) {
        JSONObject b;
        if (this.f196575d != null && (b = mo140859b()) != null) {
            try {
                b.put("event_key", "stream_abnormal").put("stream_type", "video").put(StringSet.type, i).put("cur_index", i2).put("last_index", i3);
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                long j = this.f196415Z;
                if (j > 0) {
                    this.f196415Z = j + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(102920);
    }

    /* renamed from: f */
    public final void mo140874f() {
        C87122c cVar;
        C87154g gVar = this.f196575d;
        if (gVar != null && (cVar = this.f196522c) != null) {
            gVar.mo140975a(cVar, 8);
        }
    }

    /* renamed from: g */
    public final void mo140875g() {
        C87122c cVar;
        C87154g gVar = this.f196575d;
        if (gVar != null && (cVar = this.f196522c) != null) {
            gVar.mo140975a(cVar, 9);
        }
    }

    /* renamed from: i */
    public final void mo140878i() {
        this.f196456an = true;
        this.f196457ao = System.currentTimeMillis();
    }

    /* renamed from: k */
    public final boolean mo140880k() {
        C87154g gVar = this.f196575d;
        if (gVar != null) {
            return gVar.mo141013w();
        }
        return false;
    }

    /* renamed from: c */
    public final void mo140865c() {
        if (!this.f196412W) {
            this.f196522c.f196847c = System.currentTimeMillis();
            C87122c cVar = this.f196536cN;
            if (cVar != null) {
                cVar.f196847c = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: j */
    public final void mo140879j() {
        LinkedBlockingQueue<Long> linkedBlockingQueue = this.f196550cb;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.clear();
            this.f196550cb = null;
        }
        this.f196683fC = -1;
        this.f196684fD = -1;
        this.f196685fE = -1;
        this.f196551cc = -1;
        this.f196683fC = -1;
    }

    /* renamed from: m */
    private void m150885m() {
        C87122c cVar;
        if (this.f196535cM != 0 && (cVar = this.f196536cN) != null) {
            this.f196537cO = false;
            this.f196693fM = 0;
            this.f196694fN = 0;
            this.f196687fG = 0;
            this.f196688fH = 0;
            this.f196538cP = 0;
            this.f196539cQ = 0;
            this.f196540cR = 0;
            this.f196689fI = 0;
            this.f196690fJ = 0;
            this.f196691fK = 0;
            this.f196692fL = 0;
            this.f196695fO = -1;
            this.f196696fP = 0;
            this.f196697fQ = "none";
            cVar.mo140883a();
        }
    }

    /* renamed from: p */
    private void m150888p() {
        long j = this.f196540cR;
        if (j > 0 && this.f196539cQ > 0) {
            this.f196695fO = 0;
        } else if (j > 0 && this.f196539cQ <= 0) {
            this.f196695fO = 1;
        } else if (j > 0 || this.f196539cQ <= 0) {
            this.f196695fO = 3;
        } else {
            this.f196695fO = 2;
        }
    }

    /* renamed from: o */
    private void m150887o() {
        if (this.f196522c.f196857m > 0 && this.f196522c.f196856l > 0) {
            this.f196631eC = 0;
        } else if (this.f196522c.f196857m > 0 && this.f196522c.f196856l <= 0) {
            this.f196631eC = 1;
        } else if (this.f196522c.f196857m > 0 || this.f196522c.f196856l <= 0) {
            this.f196631eC = 3;
        } else {
            this.f196631eC = 2;
        }
    }

    /* renamed from: l */
    private JSONObject m150884l() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        m150886n();
        try {
            JSONObject put = new JSONObject().put("start_time", this.f196522c.f196794a).put("duration", System.currentTimeMillis() - this.f196522c.f196794a).put("render_fps_series", new JSONArray((Collection) this.f196715fi)).put("download_bitrate_series", new JSONArray((Collection) this.f196716fj)).put("play_buffer_series", new JSONArray((Collection) this.f196717fk)).put("speed_switch_series", this.f196401L).put("video_stall_series", this.f196721fo).put("audio_stall_series", this.f196720fn);
            if (this.f196723fq == null) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray((Collection) this.f196723fq);
            }
            JSONObject put2 = put.put("push_bitrate_series", jSONArray);
            if (this.f196724fr == null) {
                jSONArray2 = new JSONArray();
            } else {
                jSONArray2 = new JSONArray((Collection) this.f196724fr);
            }
            JSONObject put3 = put2.put("push_fps_series", jSONArray2);
            if (this.f196718fl == null) {
                jSONArray3 = new JSONArray();
            } else {
                jSONArray3 = new JSONArray((Collection) this.f196718fl);
            }
            JSONObject put4 = put3.put("stall_series", jSONArray3);
            JSONObject jSONObject = this.f196722fp;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject put5 = put4.put("error_series", jSONObject);
            if (this.f196429aM == null) {
                jSONArray4 = new JSONArray();
            } else {
                jSONArray4 = new JSONArray((Collection) this.f196429aM);
            }
            return put5.put("push_stall_series", jSONArray4).put("push_video_stall_series", this.f196431aO).put("push_audio_stall_series", this.f196430aN);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    private void m150886n() {
        C87122c cVar;
        C87154g gVar = this.f196575d;
        if (gVar != null && this.f196469b != null && (cVar = this.f196522c) != null) {
            gVar.mo140975a(cVar, 3);
            if (this.f196715fi == null) {
                this.f196715fi = new ArrayList<>();
                this.f196717fk = new ArrayList<>();
                this.f196716fj = new ArrayList<>();
            }
            this.f196715fi.add(Long.valueOf((long) this.f196522c.f196793Z));
            this.f196717fk.add(Long.valueOf(this.f196522c.f196823ad));
            this.f196716fj.add(Long.valueOf(this.f196522c.f196820aa));
            if (this.f196432aP) {
                if (this.f196724fr == null) {
                    this.f196724fr = new ArrayList<>();
                    this.f196723fq = new ArrayList<>();
                }
                this.f196724fr.add(Integer.valueOf(this.f196522c.f196833an));
                this.f196723fq.add(Integer.valueOf(this.f196522c.f196832am));
            }
        }
    }

    /* renamed from: a */
    public final void mo140841a() {
        C87120a aVar;
        if (!this.f196672es) {
            this.f196670eq.sendEmptyMessageDelayed(101, this.f196671er);
            if (this.f196437aU) {
                this.f196670eq.sendEmptyMessageDelayed(102, 5000);
            }
            if (this.f196417aA == 1 && !this.f196466ax && (aVar = this.f196462at) != null) {
                aVar.mo140881a(103);
                this.f196466ax = true;
            }
            this.f196672es = true;
        }
    }

    /* renamed from: d */
    public final void mo140869d() {
        C87122c cVar;
        long currentTimeMillis;
        long j;
        long j2;
        long j3;
        int i;
        long j4;
        int i2;
        int i3;
        int i4;
        long j5;
        if (this.f196535cM != 0 && (cVar = this.f196536cN) != null) {
            this.f196575d.mo140974a(cVar);
            JSONObject b = mo140859b();
            if (this.f196537cO) {
                j = System.currentTimeMillis() - this.f196539cQ;
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = System.currentTimeMillis() - this.f196538cP;
                j = 0;
            }
            this.f196686fF++;
            long j6 = this.f196693fM;
            if (j6 > 0) {
                j2 = j6 - this.f196539cQ;
                j3 = this.f196694fN - j6;
            } else {
                j2 = 0;
                j3 = 0;
            }
            if (this.f196444ab) {
                this.f196687fG++;
                if (this.f196632eD >= this.f196538cP) {
                    this.f196688fH += System.currentTimeMillis() - this.f196632eD;
                } else {
                    this.f196688fH += System.currentTimeMillis() - this.f196538cP;
                }
            }
            m150888p();
            long j7 = this.f196536cN.f196788U;
            if (b != null) {
                try {
                    JSONObject put = b.put("event_key", "session_stop").put("index", this.f196686fF).put("socket_err_code", this.f196522c.f196798aD).put("socket_err_type", this.f196522c.f196797aC).put("stop_time", System.currentTimeMillis()).put("play_time", j);
                    if (this.f196537cO) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    JSONObject put2 = put.put("is_stream_received", i).put("render_fail_type", this.f196695fO).put("code", this.f196696fP).put("stall_count", this.f196687fG).put("stall_time", this.f196688fH).put("audio_render_stall_count", this.f196691fK).put("audio_render_stall_time", this.f196692fL).put("video_render_stall_count", this.f196689fI).put("video_render_stall_time", this.f196690fJ).put("start", this.f196538cP).put("sdk_dns_analysis_end", this.f196536cN.f196846b).put("player_dns_analysis_end", this.f196522c.f196848d).put("http_req_finish_time", this.f196536cN.f196786S).put("http_res_finish_time", this.f196536cN.f196787T).put("tcp_first_package_end", this.f196522c.f196851g).put("first_video_package_end", this.f196536cN.f196852h).put("first_audio_package_end", this.f196536cN.f196853i).put("first_video_frame_decode_end", this.f196536cN.f196854j).put("first_audio_frame_decode_end", this.f196536cN.f196855k).put("video_device_open_start", this.f196536cN.f196860p).put("video_device_open_end", this.f196536cN.f196861q).put("audio_device_open_start", this.f196536cN.f196862r).put("audio_device_open_end", this.f196536cN.f196863s).put("video_device_wait_start", this.f196536cN.f196839at).put("video_device_wait_end", this.f196536cN.f196840au).put("find_stream_info_start", this.f196536cN.f196837ar).put("find_stream_info_end", this.f196536cN.f196838as).put("video_param_send_outlet_time", this.f196536cN.f196834ao).put("first_video_frame_send_outlet_time", this.f196536cN.f196835ap).put("first_frame_render_end", this.f196539cQ).put("first_audio_frame_end", this.f196540cR).put("prepare_end", this.f196536cN.f196859o).put("prepare_block_end", this.f196536cN.f196847c).put("video_first_pkt_pos", this.f196536cN.f196780M).put("video_first_pkt_pts", this.f196536cN.f196781N).put("audio_first_pkt_pos", this.f196536cN.f196782O).put("audio_first_pkt_pts", this.f196536cN.f196783P).put("video_render_type", this.f196536cN.f196836aq).put("download_speed", this.f196536cN.f196824ae).put("video_buffer_time", this.f196536cN.f196825af).put("audio_buffer_time", this.f196536cN.f196826ag);
                    if (this.f196536cN.f196827ah > 0) {
                        j4 = this.f196522c.f196827ah;
                    } else {
                        j4 = -this.f196522c.f196827ah;
                    }
                    JSONObject put3 = put2.put("wait_time", j4);
                    if (this.f196536cN.f196827ah >= 0) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    JSONObject put4 = put3.put("is_waiting", i2).put("first_stall_time", j2).put("first_stall_duration", j3).put("play_time_on_no_frame", currentTimeMillis);
                    String str = this.f196749l;
                    if (str == null) {
                        str = "none";
                    }
                    JSONObject put5 = put4.put("sdk_params", str).put("total_download_size", j7).put("drop_audio_pts_diff", this.f196536cN.f196784Q).put("drop_audio_cost", this.f196536cN.f196785R);
                    if (this.f196501bf) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    JSONObject put6 = put5.put("sr_used", i3);
                    if (this.f196743gj) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    put6.put("sharpen_used", i4).put("network_timeout", this.f196489bT).put("suggest_format", this.f196505bj).put("suggest_protocol", this.f196506bk).put("suggest_access_code", this.f196509bn).put("error_msg", this.f196697fQ);
                    if (this.f196674eu == null) {
                        b.put("tcp_connect_end", this.f196536cN.f196850f);
                    } else {
                        if (this.f196725fs.equals("kcp")) {
                            j5 = this.f196536cN.f196848d;
                        } else {
                            j5 = this.f196536cN.f196850f;
                        }
                        b.put("tcp_connect_end", j5);
                    }
                    this.f196415Z++;
                    this.f196469b.mo12858a(b, "live_client_monitor_log");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            m150885m();
        }
    }

    /* renamed from: e */
    public final void mo140872e() {
        this.f196674eu = "none";
        this.f196745h = "none";
        this.f196746i = "none";
        this.f196675ev = false;
        this.f196676ew = 0;
        this.f196750m = "none";
        this.f196751n = "none";
        this.f196752o = "none";
        this.f196753p = "none";
        this.f196754q = "none";
        this.f196755r = -1;
        this.f196756s = -1;
        this.f196757t = -1;
        this.f196758u = -1;
        this.f196759v = -1;
        this.f196760w = "none";
        this.f196761x = "none";
        this.f196677ex = "none";
        this.f196678ey = false;
        this.f196390A = false;
        this.f196679ez = false;
        this.f196483bN = false;
        this.f196428aL = -1;
        this.f196394E = false;
        this.f196395F = -1;
        this.f196396G = -1.0f;
        this.f196397H = -1;
        this.f196398I = -1.0f;
        this.f196399J = 0;
        this.f196400K = "none";
        this.f196402M = 0;
        this.f196403N = 0;
        this.f196404O = -1;
        this.f196405P = 0;
        this.f196406Q = 0;
        this.f196407R = 0;
        this.f196409T = 0;
        this.f196435aS = -1;
        this.f196434aR = 0;
        this.f196412W = false;
        this.f196413X = 0;
        this.f196630eB = 0;
        this.f196632eD = 0;
        this.f196634eF = -1;
        this.f196443aa = 0;
        this.f196635eG = 0;
        this.f196649eU = 0;
        this.f196648eT = 0;
        this.f196651eW = 0;
        this.f196650eV = 0;
        this.f196458ap = 0;
        this.f196459aq = 0;
        this.f196456an = false;
        this.f196444ab = false;
        this.f196652eX = 0;
        this.f196653eY = 0;
        this.f196708fb = 0;
        this.f196709fc = 0;
        this.f196654eZ = 0;
        this.f196707fa = 0;
        this.f196633eE = 0;
        this.f196710fd = 0;
        this.f196711fe = 0;
        this.f196445ac = 0;
        this.f196446ad = 0;
        this.f196447ae = 0;
        this.f196448af = 0;
        this.f196449ag = 0;
        this.f196450ah = 0;
        this.f196712ff = 0;
        this.f196451ai = 0;
        this.f196452aj = -1;
        this.f196463au = false;
        this.f196418aB = 0;
        this.f196468az = 0;
        this.f196417aA = 0;
        this.f196426aJ = 0;
        this.f196427aK = 0;
        this.f196438aV = -1;
        this.f196501bf = false;
        this.f196500be = 0;
        this.f196502bg = false;
        this.f196503bh = -1.0f;
        this.f196504bi = 0;
        this.f196534cL = 0;
        this.f196715fi = null;
        this.f196716fj = null;
        this.f196717fk = null;
        this.f196723fq = null;
        this.f196724fr = null;
        this.f196722fp = null;
        this.f196718fl = null;
        this.f196719fm = -1;
        this.f196401L = "none";
        this.f196720fn = "none";
        this.f196721fo = "none";
        this.f196431aO = "none";
        this.f196430aN = "none";
        this.f196429aM = null;
        C87122c cVar = this.f196522c;
        if (cVar != null) {
            cVar.mo140883a();
        }
        this.f196393D = "none";
        this.f196391B = "none";
        this.f196496ba = 1;
        this.f196410U = "none";
        this.f196411V = "none";
        this.f196515bt = "none";
        this.f196516bu = "none";
        this.f196669eo = "none";
        this.f196420aD = 0;
        this.f196419aC = 0;
        this.f196421aE = 0;
        this.f196423aG = -1;
        this.f196485bP = 0;
        this.f196484bO = 0;
        this.f196517bv = false;
        this.f196519bx = false;
        this.f196518bw = "rad";
        this.f196520by = "origin";
        this.f196521bz = "origin";
        this.f196470bA = "none";
        this.f196472bC = -1;
        this.f196471bB = -1;
        this.f196473bD = 0;
        this.f196474bE = "none";
        this.f196481bL = "none";
        this.f196477bH = -1;
        this.f196478bI = -1;
        this.f196479bJ = -1;
        this.f196480bK = -1;
        this.f196482bM = 4;
        this.f196475bF = false;
        this.f196476bG = -1;
        this.f196489bT = -1;
        this.f196491bV = -1;
        this.f196490bU = -1;
        this.f196492bW = -1;
        this.f196493bX = -1;
        this.f196728fv = 0;
        this.f196729fw = 0;
        this.f196488bS = 0;
        this.f196494bY = 0;
        this.f196495bZ = 0;
        this.f196658ed = 0;
        this.f196659ee = 0;
        this.f196660ef = 0;
        this.f196662eh = 0;
        this.f196661eg = 0;
        this.f196663ei = 0;
        this.f196664ej = 0;
        this.f196665ek = 0;
        this.f196666el = 0;
        this.f196549ca = null;
        this.f196556ch = 0;
        this.f196564cp = 0;
        this.f196566cr = 0;
        this.f196565cq = 0;
        this.f196558cj = 0;
        this.f196567cs = 0;
        this.f196568ct = "none";
        this.f196569cu = "none";
        this.f196527cE = 0;
        this.f196524cB = "none";
        this.f196525cC = null;
        this.f196526cD = "none";
        this.f196531cI = 0;
        this.f196532cJ = -1;
        this.f196533cK = -1;
        this.f196535cM = 0;
        this.f196686fF = 0;
        this.f196698fR = 0;
        this.f196699fS = 0;
        this.f196700fT = 0;
        this.f196701fU = 0;
        this.f196702fV = 0;
        this.f196703fW = 0;
        this.f196704fX = 0;
        this.f196705fY = 0;
        this.f196585dJ = 0;
        this.f196586dK = 0;
        this.f196587dL = 0;
        this.f196588dM = 0;
        this.f196589dN = 0;
        this.f196590dO = 0;
        this.f196594dS = "";
        this.f196593dR = "";
        this.f196422aF = 0;
        this.f196578dC = 0;
        this.f196579dD = 0;
        this.f196580dE = "none";
        this.f196581dF = 0;
        this.f196582dG = "none";
        this.f196595dT = 0;
        this.f196596dU = 0;
        this.f196597dV = -1;
        this.f196598dW = null;
        this.f196599dX = 0;
        this.f196636eH = 0;
        this.f196637eI = 0;
        this.f196638eJ = 0;
        this.f196639eK = 0;
        this.f196640eL = 0;
        this.f196641eM = 0;
        this.f196643eO = 0;
        this.f196642eN = 0;
        this.f196645eQ = 0;
        this.f196644eP = 0;
        this.f196646eR = 0;
        this.f196647eS = 0;
        this.f196706fZ = 0;
        this.f196734ga = 0;
        this.f196735gb = 0;
        this.f196736gc = 0;
        this.f196737gd = 0;
        this.f196738ge = 0;
        this.f196739gf = 0;
        this.f196740gg = 0;
        this.f196741gh = 0;
        this.f196742gi = 0;
        this.f196577dB = 0;
        this.f196542cT = 0;
        this.f196544cV = 0;
        this.f196541cS = 0;
        this.f196543cU = 0;
        this.f196607df = 0;
        this.f196609dh = 0;
        this.f196606de = 0;
        this.f196608dg = 0;
        this.f196610di = -1;
        this.f196611dj = -1;
        this.f196612dk = -1;
        this.f196613dl = 0;
        this.f196614dm = 0;
        this.f196615dn = 0;
        this.f196616do = 0;
        this.f196617dp = 0;
        this.f196618dq = 0;
        this.f196619dr = 0;
        this.f196620ds = 0;
        this.f196621dt = 0;
        this.f196622du = 0;
        this.f196623dv = 0;
        this.f196624dw = 0;
        this.f196625dx = 0;
        this.f196626dy = 0;
        this.f196627dz = 0;
        this.f196576dA = 0;
        this.f196602da = 0;
        this.f196604dc = 0;
        this.f196603db = 0;
        this.f196605dd = 0;
        this.f196656eb = "none";
        this.f196667em = 0;
        this.f196668en = 0;
    }

    /* renamed from: h */
    public final JSONObject mo140876h() {
        int i;
        String str;
        String str2;
        C87122c cVar = new C87122c();
        this.f196575d.mo140975a(cVar, 1);
        try {
            JSONObject put = new JSONObject().put("playing_time:", System.currentTimeMillis() - this.f196413X).put("live_sdk_version:", "1.4.28.12");
            String str3 = this.f196747j;
            String str4 = "-1";
            if (str3 == null) {
                str3 = str4;
            }
            JSONObject put2 = put.put("player_sdk_version:", str3);
            String str5 = this.f196746i;
            if (str5 != null) {
                str4 = str5;
            }
            JSONObject put3 = put2.put("cdn_ip:", str4).put("push_client_sdk_version:", this.f196750m).put("push_client_platform:", this.f196751n).put("push_client_model:", this.f196753p).put("push_client_os_version:", this.f196752o).put("push_client_is_hardware_encode:", this.f196755r).put("push_client_push_protocol:", this.f196760w).put("push_client_qid:", this.f196761x).put("push_client_bitrate:", this.f196522c.f196832am).put("push_client_fps:", this.f196522c.f196833an);
            int i2 = 0;
            if (this.f196678ey) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject put4 = put3.put("Hit_Node_Optimizer:", i).put("Evaluator_Symbol:", this.f196677ex);
            if (this.f196390A) {
                i2 = 1;
            }
            JSONObject put5 = put4.put("Is_Remote_Sorted:", i2).put("Stall_Total_Count:", this.f196443aa).put("Stall_Total_Time:", this.f196635eG);
            long j = this.f196634eF;
            if (j == -1) {
                str = "no stall";
            } else if (j == 0) {
                str = "network stall";
            } else {
                str = "decode stall";
            }
            JSONObject put6 = put5.put("Stall_Reason:", str).put("audio_Render_Stall_Total_Count：", this.f196650eV).put("audio_Render_Stall_Total_Time：", this.f196651eW).put("video_Render_Stall_Total_Count：", this.f196648eT).put("video_Render_Stall_Total_Time：", this.f196649eU).put("first_frame_time:", this.f196522c.f196856l - this.f196522c.f196794a).put("video_Buffer_Time:", cVar.f196822ac).put("audio_Buffer_Time:", cVar.f196823ad).put("delay:", this.f196522c.f196829aj).put("render_fps:", (double) cVar.f196793Z).put("sei_source:", this.f196522c.f196830ak).put("download_Speed:", cVar.f196820aa).put("Error_Code:", this.f196630eB).put("HardDecode:", this.f196392C).put("Codec_Type:", this.f196391B).put("Codec_Name:", this.f196393D);
            if (this.f196421aE == 1) {
                str2 = "PCDN";
            } else if (this.f196419aC == 1) {
                str2 = "Http-CDN";
            } else {
                str2 = "none";
            }
            JSONObject put7 = put6.put("MDL_Vendor:", str2).put("audio_Buffer_Time_On_First_Frame:", this.f196522c.f196826ag).put("waiting_Time_After_First_Frame:", this.f196522c.f196827ah).put("dns_ip:", this.f196522c.f196841av).put("url:", this.f196674eu).put("width:", this.f196426aJ).put("height:", this.f196427aK).put("resolution:", cVar.f196842aw).put("play_format:", this.f196629eA).put("play_protocol:", this.f196725fs).put("settings_res:", this.f196520by).put("enable_resolution_auto_degrade:", this.f196517bv);
            if (!TextUtils.isEmpty(this.f196506bk) && this.f196506bk.equals("quicu")) {
                put7.put("audio_quicu_frame_drop_time:", this.f196546cX).put("video_quicu_frame_drop_time:", this.f196548cZ).put("audio_quicu_frame_drop_count:", this.f196545cW).put("video_quicu_frame_drop_count:", this.f196547cY);
            }
            return put7;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final JSONObject mo140859b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        boolean z3;
        C87154g gVar = this.f196575d;
        if (!(gVar.f197336j == null || gVar.f197054b == null)) {
            int b = gVar.f197336j.mo16710b(141, -1);
            if (b == 0) {
                gVar.f197054b.f196391B = "h264";
            } else if (b == 1) {
                gVar.f197054b.f196391B = "bytevc1";
            }
        }
        C87154g gVar2 = this.f196575d;
        int i13 = 0;
        if (gVar2.f197336j != null) {
            String c = gVar2.f197336j.mo16713c(71);
            if (gVar2.mo141014x() && c != null && !c.startsWith("[")) {
                c = C1764a.m5928a("[%s]", new Object[]{c});
            }
            if (!(c == null || gVar2.f196980B == null || c.equals(gVar2.f196980B))) {
                if (gVar2.f196980B.equals("none")) {
                    gVar2.f197054b.mo140855a(c, true);
                } else {
                    gVar2.f197054b.f196656eb = c;
                }
            }
            gVar2.f197054b.f196656eb = "none";
        }
        try {
            JSONObject put = new JSONObject().put("report_version", "5").put("live_sdk_version", "1.4.28.12").put("product_line", "live").put("client_timestamp", System.currentTimeMillis());
            String str2 = this.f196747j;
            String str3 = "-1";
            if (str2 == null) {
                str2 = str3;
            }
            JSONObject put2 = put.put("player_sdk_version", str2);
            String str4 = this.f196733g;
            if (str4 == null) {
                str4 = str3;
            }
            JSONObject put3 = put2.put("project_key", str4);
            String str5 = this.f196628e;
            if (str5 == null) {
                str5 = "none";
            }
            JSONObject put4 = put3.put("live_stream_enter_method", str5);
            String str6 = this.f196680f;
            if (str6 == null) {
                str6 = "none";
            }
            JSONObject put5 = put4.put("live_stream_enter_action", str6);
            String str7 = this.f196674eu;
            if (str7 != null) {
                str3 = str7;
            }
            JSONObject put6 = put5.put("cdn_play_url", str3);
            String str8 = this.f196746i;
            if (str8 == null) {
                str8 = "none";
            }
            JSONObject put7 = put6.put("cdn_ip", str8).put("request_url", this.f196524cB);
            if (this.f196675ev) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject put8 = put7.put("ip_from_player_core", i);
            if (this.f196748k) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            JSONObject put9 = put8.put("is_preview", i2).put("push_client_sdk_version", this.f196750m).put("push_client_platform", this.f196751n).put("push_client_os_version", this.f196752o).put("push_client_model", this.f196753p).put("push_client_start_time", this.f196754q).put("push_client_is_hardware_encode", this.f196755r).put("push_client_min_bitrate", this.f196756s).put("push_client_max_bitrate", this.f196757t).put("push_client_default_bitrate", this.f196758u).put("push_client_push_protocol", this.f196760w).put("push_client_qid", this.f196761x).put("push_client_hit_node_optimize", this.f196759v);
            if (this.f196763z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            JSONObject put10 = put9.put("open_dns_optimizer", i3);
            if (this.f196678ey) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            JSONObject put11 = put10.put("hit_node_optimize", i4).put("evaluator_symbol", this.f196677ex);
            if (this.f196390A) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            JSONObject put12 = put11.put("remote_sorted", i5).put("common_tag", this.f196673et).put("codec_type", this.f196391B).put("codec_name", this.f196393D);
            if (this.f196392C) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            JSONObject put13 = put12.put("hardware_decode", i6);
            if (this.f196453ak) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            JSONObject put14 = put13.put("sharp", i7);
            if (this.f196394E) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            JSONObject put15 = put14.put("enable_hurry", i8).put("hurry_time", this.f196395F).put("catch_speed", new DecimalFormat("0.00").format((double) this.f196396G)).put("slow_play_time", this.f196397H).put("slow_speed", new DecimalFormat("0.00").format((double) this.f196398I));
            if (this.f196412W) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            JSONObject put16 = put15.put("first_screen", i9);
            if (this.f196433aQ) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            JSONObject put17 = put16.put("enable_httpDns", i10).put("enable_ntp", this.f196468az).put("enable_media_codec_async", this.f196434aR).put("default_codec_id", this.f196435aS).put("url_ability", this.f196436aT).put("max_cache_seconds", this.f196438aV).put("enable_fast_open", this.f196442aZ).put("enable_mdl", this.f196419aC).put("enable_p2p", this.f196420aD).put("p2p_loader_type", this.f196423aG).put("used_p2p", this.f196421aE);
            String str9 = this.f196424aH;
            if (str9 == null) {
                str9 = "none";
            }
            JSONObject put18 = put17.put("mdl_version", str9).put("enable_mdl_proto", this.f196425aI).put("enable_low_latency_flv", this.f196495bZ).put("open_strategy_sdk", this.f196658ed).put("enable_strategy_node_opt", this.f196659ee).put("enable_strategy_httpDNS", this.f196660ef).put("enable_strategy_httpDNS_by_localDNS_timeout", this.f196661eg).put("enable_strategy_ipv6", this.f196662eh).put("enable_strategy_flv_low_strategy", this.f196663ei).put("hit_strategy_opt", this.f196666el);
            if (this.f196522c.f196841av == null) {
                str = "none";
            } else {
                str = this.f196522c.f196841av;
            }
            JSONObject put19 = put18.put("dns_ip", str).put("in_main_looper", this.f196496ba).put("start_play_buffer_threshold", this.f196402M).put("enable_change_start_play_buffer_advance", this.f196409T).put("fast_open_gop_cache", this.f196404O).put("buffering_end_ignore_video", this.f196405P).put("start_direct_after_prepared", this.f196406Q).put("check_buffering_end_advance", this.f196407R).put("channel_id", this.f196522c.f196831al).put("sei_delay", this.f196522c.f196829aj).put("sei_source", this.f196522c.f196830ak).put("chip_board", this.f196726ft).put("chip_hardware", this.f196727fu).put("width", this.f196426aJ).put("height", this.f196427aK).put("settings_info", this.f196515bt).put("ttnet_nqe_info", this.f196516bu).put("play_format", this.f196629eA).put("play_protocol", this.f196725fs).put("url_set_method", this.f196575d.f197038ak).put("enable_resolution_auto_degrade", this.f196517bv).put("has_abr_info", this.f196519bx).put("quic_load_succ", this.f196507bl).put("link_info", this.f196762y);
            if (this.f196502bg) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            JSONObject put20 = put19.put("used_texturerender", i11).put("settings_res", this.f196520by).put("is_too_large_av_diff", this.f196522c.f196817aW).put("stall_retry_time_interval", this.f196455am).put("is_too_large_av_diff", this.f196522c.f196817aW);
            C87154g gVar3 = this.f196575d;
            if (gVar3 == null) {
                i12 = 0;
            } else if (gVar3.f197006aE == 1) {
                i12 = 2;
            } else {
                i12 = gVar3.f197005aD;
            }
            JSONObject put21 = put20.put("enable_rtc_play", i12).put("enable_mini_sdp", this.f196557ci).put("rtc_play_fallback", this.f196558cj).put("fallback_type", this.f196567cs).put("mute_audio", this.f196528cF).put("volume_setting", (double) this.f196529cG).put("player_volume_setting", (double) this.f196530cH).put("enable_liveio_play", this.f196422aF).put("liveio_play", this.f196578dC).put("liveio_p2p", this.f196579dD).put("timer_version", this.f196493bX).put("is_background", this.f196596dU).put("duration_of_start_auto_speed", this.f196403N).put("redirect_ip", this.f196656eb).put("request_id", this.f196526cD).put("backup_to_origin", this.f196667em).put("enable_strategy_performance_optimization", this.f196664ej).put("strategy_start_up_delay", this.f196665ek).put("request_id", this.f196526cD).put("quic_fallback_tcp", this.f196668en);
            ArrayList<Integer> arrayList = this.f196600dY;
            if (arrayList != null && !arrayList.isEmpty()) {
                put21.put("ab_group_id", new JSONArray((Collection) this.f196600dY));
            }
            if (this.f196422aF == 1) {
                put21.put("liveio_error_msg", this.f196580dE);
                put21.put("liveio_version", this.f196582dG);
            }
            if (mo140880k()) {
                put21.put("rtc_get_width", this.f196575d.mo141001k());
                put21.put("rtc_get_height", this.f196575d.mo141002l());
            }
            if (!this.f196568ct.equals("none")) {
                put21.put("live_stream_session_id", this.f196568ct);
            } else {
                put21.put("live_stream_session_id", this.f196411V);
            }
            if (this.f196520by.equals("auto")) {
                put21.put("auto_res", this.f196521bz);
            }
            if (this.f196575d.f197340n == 1) {
                put21.put("texturerender_error", this.f196500be);
            }
            if (this.f196575d.f197341o == 1 && this.f196575d.f197340n == 1) {
                C87154g gVar4 = this.f196575d;
                if (gVar4.f197339m == null || gVar4.f197339m.mo136459c(6, -1) != 1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (this.f196575d.f197343q == 0) {
                        put21.put("sr_width", this.f196426aJ * 2).put("sr_height", this.f196427aK * 2);
                    } else if (this.f196575d.f197343q == 4) {
                        put21.put("sr_width", (this.f196426aJ * 3) / 2).put("sr_height", (this.f196427aK * 3) / 2);
                    }
                    this.f196501bf = true;
                } else {
                    put21.put("sr_width", this.f196426aJ).put("sr_height", this.f196427aK);
                }
            }
            if (this.f196575d.f197027aZ == 1) {
                C87154g gVar5 = this.f196575d;
                if (gVar5.f197339m == null || gVar5.f197339m.mo136459c(19, 10) != 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    put21.put("used_gaussican_blur", 1);
                    put21.put("gaussican_blur_strength", (double) this.f196657ec);
                }
            }
            if (this.f196575d.f197081ba == 1) {
                C87154g gVar6 = this.f196575d;
                if (gVar6.f197339m == null || gVar6.f197339m.mo136459c(19, 2) != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    put21.put("used_lut_filter", 1);
                }
            }
            if (this.f196575d.f197017aP == 1 && this.f196575d.f197340n == 1) {
                if (this.f196575d.mo141011u()) {
                    i13 = 1;
                }
                put21.put("used_sharpen", i13);
                if (!this.f196743gj) {
                    this.f196743gj = this.f196575d.mo141011u();
                }
            }
            if (this.f196517bv || this.f196519bx) {
                put21.put("abr_strategy", this.f196518bw).put("defualt_res_bitrate", this.f196472bC).put("stall_count_rad", this.f196482bM);
            }
            if (TextUtils.equals(this.f196725fs, "quic") || TextUtils.equals(this.f196725fs, "quicu") || TextUtils.equals(this.f196725fs, "h2q") || TextUtils.equals(this.f196725fs, "h2qu")) {
                put21.put("quic_config_cached", this.f196522c.f196799aE).put("quic_CHLO_count", this.f196522c.f196800aF);
            }
            if (TextUtils.equals(this.f196725fs, "h2") || TextUtils.equals(this.f196725fs, "h2q") || TextUtils.equals(this.f196725fs, "h2qu")) {
                put21.put("h2_context_start_cost", this.f196522c.f196803aI);
                put21.put("h2_reused", this.f196522c.f196804aJ);
            }
            if (this.f196575d.f197010aI == 1) {
                put21.put("disable_video_render", this.f196527cE);
            }
            int i14 = this.f196440aX;
            if (i14 > 0) {
                put21.put("tsl_timeshift", i14);
            }
            Map<String, String> map = this.f196525cC;
            if (map != null) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if (next.getKey().equals("Host")) {
                        put21.put("headers_host", next.getValue().replace(" ", ""));
                        break;
                    }
                }
            }
            int i15 = this.f196532cJ;
            if (i15 != -1) {
                put21.put("fcdn_res_type", i15);
            }
            int i16 = this.f196533cK;
            if (i16 != -1) {
                put21.put("fcdn_trans_strategy", i16);
            }
            if (!TextUtils.isEmpty(this.f196725fs) && ((this.f196725fs.equals("quic") || this.f196725fs.equals("quicu")) && !TextUtils.isEmpty(this.f196522c.f196845az))) {
                put21.put("ttquic_sdk_version", this.f196522c.f196845az);
            }
            if (!TextUtils.isEmpty(this.f196725fs) && (this.f196725fs.equals("quic") || this.f196725fs.equals("quicu") || this.f196725fs.equals("h2q") || this.f196725fs.equals("h2qu"))) {
                put21.put("quic_rej_count", this.f196522c.f196796aB);
                put21.put("quic_rej_reasons", this.f196522c.f196795aA);
            }
            return put21;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public final void mo140871d(String str) {
        if (str != null) {
            this.f196677ex = str;
        }
    }

    /* renamed from: com.ss.videoarch.a.a.b$a */
    public static class C87120a {

        /* renamed from: a */
        public Handler f196764a;

        /* renamed from: b */
        private HandlerThread f196765b;

        static {
            Covode.recordClassIndex(102921);
        }

        /* renamed from: a */
        public final void mo140881a(int i) {
            Handler handler;
            if (this.f196765b != null && (handler = this.f196764a) != null) {
                handler.sendEmptyMessage(i);
            }
        }

        public C87120a(final C87119b bVar) {
            HandlerThread handlerThread = new HandlerThread("DnsHandlerThread");
            this.f196765b = handlerThread;
            handlerThread.start();
            this.f196764a = new Handler(this.f196765b.getLooper()) {
                /* class com.p2082ss.videoarch.p4474a.p4475a.C87119b.C87120a.HandlerC871211 */

                static {
                    Covode.recordClassIndex(102922);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
                    if (r3.f196461as == null) goto L_0x0068;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void handleMessage(android.os.Message r11) {
                    /*
                    // Method dump skipped, instructions count: 230
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.p4475a.C87119b.C87120a.HandlerC871211.handleMessage(android.os.Message):void");
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo140847a(long j) {
        C87122c cVar = this.f196522c;
        if (cVar != null) {
            cVar.f196827ah = j;
        }
        C87122c cVar2 = this.f196536cN;
        if (cVar2 != null) {
            cVar2.f196827ah = j;
        }
    }

    /* renamed from: c */
    public final void mo140867c(long j) {
        if (j >= 1000) {
            this.f196744gk = j;
        }
    }

    /* renamed from: e */
    public final void mo140873e(int i) {
        boolean z;
        int i2 = 0;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f196713fg = z;
        if (i <= 0) {
            i2 = -1;
        }
        this.f196452aj = i2;
    }

    /* renamed from: a */
    public static long m150877a(JSONArray jSONArray) {
        int length = jSONArray.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j += (long) jSONArray.getInt(i);
        }
        return j;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (101 == i) {
            m150882b(false);
            return true;
        } else if (102 != i) {
            return true;
        } else {
            m150886n();
            if (!this.f196672es) {
                return true;
            }
            this.f196670eq.sendEmptyMessageDelayed(102, 5000);
            return true;
        }
    }

    /* renamed from: a */
    private void m150880a(JSONObject jSONObject) {
        if (TextUtils.equals(this.f196725fs, "quic") || TextUtils.equals(this.f196725fs, "quicu")) {
            jSONObject.put("quic_open_result", this.f196522c.f196801aG);
        }
    }

    /* renamed from: b */
    public final void mo140863b(String str) {
        C87154g gVar = this.f196575d;
        if (gVar != null && this.f196469b != null) {
            gVar.mo140975a(this.f196522c, 2);
            JSONObject b = mo140859b();
            if (b != null) {
                try {
                    b.put("event_key", "illegal_call").put("api_name", str);
                    m150880a(b);
                    this.f196469b.mo12858a(b, "live_client_monitor_log");
                    long j = this.f196415Z;
                    if (j > 0) {
                        this.f196415Z = j + 1;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo140868c(String str) {
        JSONObject b;
        if (this.f196575d != null && this.f196469b != null && (b = mo140859b()) != null) {
            try {
                b.put("event_key", "call_not_in_main_thread").put("api_name", str);
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                long j = this.f196415Z;
                if (j > 0) {
                    this.f196415Z = j + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m150882b(boolean z) {
        C87122c cVar;
        if (this.f196575d != null && this.f196469b != null && (cVar = this.f196522c) != null) {
            try {
                long j = cVar.f196788U;
                long j2 = this.f196522c.f196789V;
                long j3 = this.f196522c.f196790W;
                long j4 = this.f196522c.f196792Y;
                long j5 = this.f196522c.f196791X;
                this.f196575d.mo140975a(this.f196522c, 1);
                this.f196469b.mo12858a(m150878a(this.f196522c, j, j2, j3, j4, z, j5), "live_client_monitor_log");
                long j6 = this.f196415Z;
                if (j6 > 0) {
                    this.f196415Z = j6 + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            long j7 = this.f196671er;
            if (mo140880k()) {
                j7 = this.f196744gk;
            }
            if (this.f196672es) {
                this.f196670eq.sendEmptyMessageDelayed(101, j7);
            }
        }
    }

    /* renamed from: c */
    public final void mo140866c(int i) {
        this.f196712ff++;
        this.f196451ai++;
        this.f196575d.mo140975a(this.f196522c, 2);
        JSONObject b = mo140859b();
        m150887o();
        if (b != null) {
            try {
                b.put("event_key", "retry").put("reason", this.f196630eB).put("code", i).put("socket_err_code", this.f196522c.f196798aD).put("socket_err_type", this.f196522c.f196797aC).put("render_fail_type", this.f196631eC);
                m150880a(b);
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                long j = this.f196415Z;
                if (j > 0) {
                    this.f196415Z = j + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[Catch:{ JSONException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a A[Catch:{ JSONException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c A[Catch:{ JSONException -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140870d(int r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.p4475a.C87119b.mo140870d(int):void");
    }

    /* renamed from: b */
    public final void mo140860b(int i) {
        if (this.f196630eB == -100015) {
            this.f196630eB = 0;
        }
        if (this.f196444ab) {
            this.f196444ab = false;
            this.f196575d.mo140975a(this.f196522c, 6);
            JSONObject b = mo140859b();
            if (this.f196718fl == null) {
                this.f196718fl = new ArrayList<>();
            }
            this.f196718fl.add(Long.valueOf(this.f196719fm));
            this.f196718fl.add(Long.valueOf(-(System.currentTimeMillis() - this.f196522c.f196794a)));
            if (this.f196711fe == 0) {
                this.f196711fe = System.currentTimeMillis();
            }
            if (this.f196535cM == 1 && this.f196694fN == 0) {
                this.f196694fN = System.currentTimeMillis();
            }
            if (b != null && this.f196632eD != 0) {
                try {
                    if (this.f196633eE != 0) {
                        this.f196652eX++;
                        this.f196653eY = (int) (((long) this.f196653eY) + (System.currentTimeMillis() - this.f196633eE));
                        if (this.f196748k) {
                            this.f196642eN++;
                            this.f196643eO = (int) (((long) this.f196643eO) + (System.currentTimeMillis() - this.f196633eE));
                        }
                    }
                    this.f196443aa++;
                    this.f196635eG += System.currentTimeMillis() - this.f196632eD;
                    this.f196601dZ += System.currentTimeMillis() - this.f196632eD;
                    if (this.f196748k) {
                        this.f196637eI++;
                        this.f196636eH += System.currentTimeMillis() - this.f196632eD;
                    }
                    if (this.f196535cM == 1) {
                        this.f196687fG++;
                        this.f196688fH += System.currentTimeMillis() - this.f196632eD;
                    }
                    b.put("event_key", "stall").put("stall_start", this.f196632eD).put("stall_end", System.currentTimeMillis()).put("video_buffer_time_stall_start", this.f196522c.f196805aK).put("audio_buffer_time_stall_start", this.f196522c.f196806aL).put("video_buffer_time_stall_end", this.f196522c.f196807aM).put("audio_buffer_time_stall_end", this.f196522c.f196808aN).put("last_res", this.f196470bA).put("reason", this.f196634eF).put("recover_reason", i);
                    this.f196469b.mo12858a(b, "live_client_monitor_log");
                    long j = this.f196415Z;
                    if (j > 0) {
                        this.f196415Z = j + 1;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo140861b(long j) {
        C87122c cVar;
        this.f196412W = true;
        this.f196728fv = this.f196451ai;
        this.f196729fw = this.f196488bS;
        long currentTimeMillis = System.currentTimeMillis();
        this.f196413X = currentTimeMillis;
        if (this.f196748k) {
            this.f196742gi = currentTimeMillis;
        }
        if (this.f196575d != null && this.f196469b != null && (cVar = this.f196522c) != null) {
            try {
                cVar.f196790W = System.currentTimeMillis();
                if (this.f196748k) {
                    C87122c cVar2 = this.f196522c;
                    cVar2.f196791X = cVar2.f196790W;
                }
                this.f196575d.mo140975a(this.f196522c, 0);
                JSONObject a = m150879a(this.f196522c, this.f196679ez, j);
                this.f196581dF = this.f196413X - this.f196522c.f196794a;
                String str = this.f196629eA;
                if (str != null && (str.equals("cmaf") || this.f196629eA.equals("avph"))) {
                    a.put("video_dns_analysis_end", this.f196522c.f196772E).put("audio_dns_analysis_end", this.f196522c.f196773F).put("video_tcp_connect_time", this.f196522c.f196770C).put("audio_tcp_connect_time", this.f196522c.f196771D).put("video_tcp_first_packet_time", this.f196522c.f196774G).put("audio_tcp_first_packet_time", this.f196522c.f196775H).put("video_http_req_finish_time", this.f196522c.f196776I).put("audio_http_req_finish_time", this.f196522c.f196777J).put("video_http_res_finish_time", this.f196522c.f196778K).put("audio_http_res_finish_time", this.f196522c.f196779L);
                    if (this.f196629eA.equals("cmaf")) {
                        a.put("cmaf_mpd_dns_analysis_end", this.f196522c.f196865u).put("cmaf_mpd_tcp_connect_time", this.f196522c.f196866v).put("cmaf_mpd_tcp_first_package_end", this.f196522c.f196868x).put("cmaf_mpd_http_req_finish_time", this.f196522c.f196867w).put("cmaf_mpd_http_res_finish_time", this.f196522c.f196869y).put("cmaf_audio_firstseg_connect_time", this.f196522c.f196768A).put("cmaf_video_firstseg_connect_time", this.f196522c.f196769B).put("cmaf_mpd_connect_time", this.f196522c.f196870z);
                    }
                    m150880a(a);
                }
                this.f196469b.mo12858a(a, "live_client_monitor_log");
                long j2 = this.f196415Z;
                if (j2 > 0) {
                    this.f196415Z = j2 + 1;
                }
                this.f196400K = "1.0:" + this.f196413X;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private void m150883e(String str) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        long j7;
        int i2;
        int i3;
        int i4;
        int i5;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        if (this.f196412W) {
            m150882b(true);
        } else {
            this.f196575d.mo140975a(this.f196522c, 2);
            this.f196728fv = this.f196451ai;
            this.f196729fw = this.f196488bS;
        }
        mo140869d();
        JSONObject b = mo140859b();
        if (b != null) {
            try {
                if (this.f196412W) {
                    j2 = System.currentTimeMillis() - this.f196413X;
                    if (this.f196748k) {
                        j11 = System.currentTimeMillis();
                        j12 = this.f196742gi;
                    } else {
                        j11 = this.f196577dB;
                        j12 = this.f196742gi;
                    }
                    j3 = j11 - j12;
                    j4 = 0;
                    j = 0;
                } else if (this.f196630eB != 0 || this.f196522c.f196794a == 0) {
                    j2 = 0;
                    j = 0;
                    j3 = 0;
                    j4 = 0;
                } else {
                    j = System.currentTimeMillis() - this.f196522c.f196794a;
                    if (this.f196748k) {
                        j9 = System.currentTimeMillis();
                        j10 = this.f196741gh;
                    } else {
                        j9 = this.f196577dB;
                        j10 = this.f196741gh;
                    }
                    j4 = j9 - j10;
                    j3 = 0;
                    j2 = 0;
                }
                long j13 = this.f196710fd;
                if (j13 > 0) {
                    j5 = j13 - this.f196522c.f196856l;
                    j6 = this.f196711fe - this.f196710fd;
                } else {
                    j5 = 0;
                    j6 = 0;
                }
                if (this.f196444ab) {
                    this.f196443aa++;
                    this.f196635eG += System.currentTimeMillis() - this.f196632eD;
                    if (this.f196748k) {
                        this.f196637eI++;
                        this.f196636eH += System.currentTimeMillis() - this.f196632eD;
                    }
                }
                if (this.f196456an && this.f196457ao != 0) {
                    this.f196458ap++;
                    this.f196459aq += System.currentTimeMillis() - this.f196457ao;
                }
                m150887o();
                long j14 = this.f196485bP + this.f196522c.f196788U;
                JSONObject put = b.put("event_key", "play_stop").put("socket_err_code", this.f196522c.f196798aD).put("socket_err_type", this.f196522c.f196797aC).put("stop_time", System.currentTimeMillis()).put("play_time", j2);
                if (this.f196412W) {
                    i = 1;
                } else {
                    i = 0;
                }
                JSONObject put2 = put.put("is_stream_received", i).put("render_fail_type", this.f196631eC).put("code", this.f196630eB).put("stall_count", this.f196443aa).put("stall_time", this.f196635eG).put("audio_render_stall_count", this.f196650eV).put("audio_render_stall_time", this.f196651eW).put("video_render_stall_count", this.f196648eT).put("video_render_stall_time", this.f196649eU).put("video_decode_stall_count", this.f196698fR).put("video_decode_stall_time", this.f196699fS).put("audio_decode_stall_count", this.f196700fT).put("audio_decode_stall_time", this.f196701fU).put("video_demux_stall_count", this.f196702fV).put("video_demux_stall_time", this.f196703fW).put("audio_demux_stall_count", this.f196704fX).put("audio_demux_stall_time", this.f196705fY).put("stall_count_preview", this.f196637eI).put("stall_time_preview", this.f196636eH).put("audio_render_stall_count_preview", this.f196640eL).put("audio_render_stall_time_preview", this.f196641eM).put("video_render_stall_count_preview", this.f196638eJ).put("video_render_stall_time_preview", this.f196639eK).put("video_decode_stall_count_preview", this.f196706fZ).put("video_decode_stall_time_preview", this.f196734ga).put("audio_decode_stall_count_preview", this.f196735gb).put("audio_decode_stall_time_preview", this.f196736gc).put("video_demux_stall_count_preview", this.f196737gd).put("video_demux_stall_time_preview", this.f196738ge).put("audio_demux_stall_count_preview", this.f196739gf).put("audio_demux_stall_time_preview", this.f196740gg).put("play_time_preview", j3).put("play_time_on_no_frame_preview", j4).put("error_recover_count", this.f196458ap).put("error_recover_time", this.f196459aq).put("start", this.f196522c.f196794a).put("sdk_dns_analysis_end", this.f196522c.f196846b).put("http_req_finish_time", this.f196522c.f196786S).put("http_res_finish_time", this.f196522c.f196787T).put("first_video_package_end", this.f196522c.f196852h).put("first_audio_package_end", this.f196522c.f196853i).put("first_video_frame_decode_end", this.f196522c.f196854j).put("first_audio_frame_decode_end", this.f196522c.f196855k).put("first_frame_render_end", this.f196522c.f196856l).put("first_audio_frame_end", this.f196522c.f196857m).put("video_device_open_start", this.f196522c.f196860p).put("video_device_open_end", this.f196522c.f196861q).put("audio_device_open_start", this.f196522c.f196862r).put("audio_device_open_end", this.f196522c.f196863s).put("video_device_wait_start", this.f196522c.f196839at).put("video_device_wait_end", this.f196522c.f196840au).put("find_stream_info_start", this.f196522c.f196837ar).put("find_stream_info_end", this.f196522c.f196838as).put("video_param_send_outlet_time", this.f196522c.f196834ao).put("first_video_frame_send_outlet_time", this.f196522c.f196835ap).put("video_first_pkt_pos", this.f196522c.f196780M).put("video_first_pkt_pts", this.f196522c.f196781N).put("audio_first_pkt_pos", this.f196522c.f196782O).put("audio_first_pkt_pts", this.f196522c.f196783P).put("set_surface_time", this.f196498bc).put("set_surface_cost", this.f196497bb).put("video_render_type", this.f196522c.f196836aq).put("prepare_block_end", this.f196522c.f196847c).put("prepare_end", this.f196522c.f196859o).put("retry_count", this.f196451ai).put("download_speed", this.f196522c.f196824ae).put("video_buffer_time", this.f196522c.f196825af).put("audio_buffer_time", this.f196522c.f196826ag).put("socket_receive_buffer_size_on_first_frame", this.f196522c.f196828ai).put("socket_receive_buffer_size_on_stop", this.f196575d.mo141007q());
                if (this.f196522c.f196827ah > 0) {
                    j7 = this.f196522c.f196827ah;
                } else {
                    j7 = -this.f196522c.f196827ah;
                }
                JSONObject put3 = put2.put("wait_time", j7);
                if (this.f196522c.f196827ah >= 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                JSONObject put4 = put3.put("is_waiting", i2).put("first_stall_time", j5).put("first_stall_duration", j6).put("call_api_name", str).put("play_time_on_no_frame", j).put("abr_switch_count", this.f196473bD).put("abr_switch_count_info", this.f196474bE);
                String str2 = this.f196749l;
                if (str2 == null) {
                    str2 = "none";
                }
                JSONObject put5 = put4.put("sdk_params", str2).put("total_download_size", j14).put("drop_audio_pts_diff", this.f196522c.f196784Q).put("drop_audio_cost", this.f196522c.f196785R).put("first_frame_retry_count", this.f196728fv).put("first_frame_retry_duration", this.f196729fw).put("abr_check_enhance", this.f196556ch);
                if (this.f196501bf) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                JSONObject put6 = put5.put("sr_used", i3);
                if (this.f196743gj) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                put6.put("sharpen_used", i4).put("network_timeout", this.f196489bT).put("suggest_format", this.f196505bj).put("suggest_protocol", this.f196506bk).put("suggest_access_code", this.f196509bn).put("is_change_network_type", this.f196510bo).put("degrade_for_net_change", this.f196511bp).put("session_num", this.f196686fF).put("use_live_threadpool", this.f196595dT).put("used_drm", this.f196597dV).put("push_audio_stall_time_0", this.f196445ac).put("push_audio_stall_time_2", this.f196446ad).put("push_video_stall_time_0", this.f196447ae).put("push_video_stall_time_1", this.f196448af).put("push_video_stall_time_2", this.f196449ag).put("push_retry_stall", this.f196450ah).put("preconnect_result", this.f196669eo).put("ipv6_probe_result", this.f196522c.f196819aY);
                if (this.f196522c.f196815aU != null) {
                    b.put("abr_stream_info", this.f196522c.f196815aU);
                }
                int i6 = this.f196408S;
                if (i6 != -1) {
                    b.put("audio_timescale_enable", i6);
                }
                if (this.f196522c.f196818aX != null) {
                    b.put("avph_stream_info", this.f196522c.f196818aX);
                }
                if (this.f196575d.f197340n == 1) {
                    b.put("render_start_timestamp", this.f196504bi);
                    b.put("texturerender_renderstart_timestamp", this.f196534cL);
                }
                int i7 = this.f196585dJ;
                if (i7 > 0) {
                    b.put("av_out_sync_count", i7).put("av_out_sync_duration", this.f196587dL).put("av_out_sync_info", this.f196593dR);
                }
                m150880a(b);
                if (mo140880k()) {
                    b.put("player_dns_analysis_end", this.f196563co);
                    b.put("rtc_use_sdk_dns", this.f196562cn);
                    b.put("tcp_connect_end", this.f196564cp);
                    b.put("rtc_tls_handshake_end", this.f196565cq);
                    b.put("tcp_first_package_end", this.f196566cr);
                    b.put("rtc_inited_end", this.f196522c.f196809aO);
                    b.put("rtc_offer_send_end", this.f196522c.f196810aP);
                    b.put("rtc_answer_recv_end", this.f196522c.f196811aQ);
                    b.put("rtc_start_end", this.f196522c.f196812aR);
                    b.put("rtc_playstop_info", this.f196569cu);
                } else {
                    b.put("tcp_first_package_end", this.f196522c.f196851g);
                    b.put("player_dns_analysis_end", this.f196522c.f196848d);
                    if (this.f196674eu == null) {
                        b.put("tcp_connect_end", this.f196522c.f196850f);
                    } else {
                        if (this.f196725fs.equals("kcp")) {
                            j8 = this.f196522c.f196848d;
                        } else {
                            j8 = this.f196522c.f196850f;
                        }
                        b.put("tcp_connect_end", j8);
                    }
                }
                String str3 = this.f196629eA;
                if (str3 != null && (str3.equals("cmaf") || this.f196629eA.equals("avph"))) {
                    b.put("video_dns_analysis_end", this.f196522c.f196772E).put("audio_dns_analysis_end", this.f196522c.f196773F).put("video_tcp_connect_time", this.f196522c.f196770C).put("audio_tcp_connect_time", this.f196522c.f196771D).put("video_tcp_first_packet_time", this.f196522c.f196774G).put("audio_tcp_first_packet_time", this.f196522c.f196775H).put("video_http_req_finish_time", this.f196522c.f196776I).put("audio_http_req_finish_time", this.f196522c.f196777J).put("video_http_res_finish_time", this.f196522c.f196778K).put("audio_http_res_finish_time", this.f196522c.f196779L);
                    if (this.f196629eA.equals("cmaf")) {
                        b.put("cmaf_mpd_dns_analysis_end", this.f196522c.f196865u).put("cmaf_mpd_tcp_connect_time", this.f196522c.f196866v).put("cmaf_mpd_tcp_first_package_end", this.f196522c.f196868x).put("cmaf_mpd_http_req_finish_time", this.f196522c.f196867w).put("cmaf_mpd_http_res_finish_time", this.f196522c.f196869y).put("cmaf_audio_firstseg_connect_time", this.f196522c.f196768A).put("cmaf_video_firstseg_connect_time", this.f196522c.f196769B).put("cmaf_mpd_connect_time", this.f196522c.f196870z);
                        int i8 = this.f196523cA;
                        if (i8 == 1) {
                            b.put("enable_async", i8);
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.f196506bk) && this.f196506bk.equals("quicu")) {
                    b.put("audio_quicu_frame_drop_time", this.f196546cX).put("video_quicu_frame_drop_time", this.f196548cZ).put("audio_quicu_frame_drop_count", this.f196545cW).put("video_quicu_frame_drop_count", this.f196547cY).put("audio_quicu_frame_drop_time_preview", this.f196603db).put("video_quicu_frame_drop_time_preview", this.f196605dd).put("audio_quicu_frame_drop_count_preview", this.f196602da).put("video_quicu_frame_drop_count_preview", this.f196604dc).put("audio_level1_frame_drop_time", this.f196623dv).put("video_level1_frame_drop_time", this.f196617dp).put("audio_level2_frame_drop_time", this.f196625dx).put("video_level2_frame_drop_time", this.f196619dr).put("audio_level3_frame_drop_time", this.f196627dz).put("video_level3_frame_drop_time", this.f196621dt).put("audio_before_first_frame_drop_time", this.f196615dn).put("video_before_first_frame_drop_time", this.f196613dl);
                }
                if (this.f196437aU) {
                    b.put("session_time_series", m150884l());
                }
                if (this.f196454al) {
                    b.put("expected_sei_count", this.f196552cd);
                    b.put("received_sei_count", this.f196553ce);
                    b.put("expected_unique_sei_count", this.f196554cf);
                    b.put("received_unique_sei_count", this.f196555cg);
                }
                int i9 = this.f196570cv;
                if (i9 != 0) {
                    b.put("bitrate_amnormal", i9);
                }
                int i10 = this.f196571cw;
                if (i10 != 0) {
                    b.put("abr_codec_not_same", i10);
                }
                if (this.f196572cx == 0) {
                    i5 = 1;
                    b.put("abr_list_not_match", 1);
                } else {
                    i5 = 1;
                }
                if (TextUtils.equals(this.f196725fs, "quic") || TextUtils.equals(this.f196725fs, "quicu")) {
                    b.put("scfg", this.f196490bU).put("mtu", this.f196491bV).put("pad_hello", this.f196492bW);
                    m150881a(b, this.f196513br);
                }
                if (TextUtils.equals(this.f196725fs, "h2") || TextUtils.equals(this.f196725fs, "h2q") || TextUtils.equals(this.f196725fs, "h2qu")) {
                    m150881a(b, this.f196512bq);
                }
                if (TextUtils.equals(this.f196629eA, "avph")) {
                    m150881a(b, this.f196514bs);
                }
                if (this.f196573cy) {
                    b.put("cdn_abr_switch_performed", i5).put("cdn_abr_switch_code", this.f196574cz);
                }
                long j15 = this.f196415Z + 1;
                this.f196415Z = j15;
                b.put("log_total_count_when_playing", j15);
                this.f196469b.mo12858a(b, "live_client_monitor_log");
                this.f196415Z = 0;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo140864b(String str, String str2) {
        this.f196505bj = str;
        this.f196629eA = str2;
    }

    /* renamed from: a */
    private static void m150881a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null && jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final long mo140840a(int i, long j) {
        C87154g gVar;
        if (i == 0) {
            int i2 = this.f196757t;
            if (i2 != -1 || (gVar = this.f196575d) == null) {
                return (long) i2;
            }
            return gVar.mo140966a(i, j);
        } else if (i == 100) {
            return this.f196522c.f196829aj;
        } else {
            if (i != 101) {
                return j;
            }
            return this.f196522c.f196856l;
        }
    }

    /* renamed from: a */
    public final void mo140853a(String str, String str2, String str3) {
        this.f196506bk = str;
        this.f196725fs = str2;
        this.f196509bn = str3;
    }

    /* renamed from: b */
    public final void mo140862b(long j, int i, boolean z) {
        String str;
        if (j <= System.currentTimeMillis() - this.f196522c.f196794a && j > ((long) i)) {
            if (z) {
                this.f196698fR++;
                this.f196699fS += j;
                if (this.f196748k) {
                    this.f196706fZ++;
                    this.f196734ga += j;
                }
            } else {
                this.f196700fT++;
                this.f196701fU += j;
                if (this.f196748k) {
                    this.f196735gb++;
                    this.f196736gc += j;
                }
            }
            JSONObject b = mo140859b();
            if (b != null) {
                try {
                    JSONObject put = b.put("event_key", "decode_stall");
                    if (z) {
                        str = "video";
                    } else {
                        str = DataType.AUDIO;
                    }
                    put.put(StringSet.type, str).put("stall_time", j);
                    this.f196469b.mo12858a(b, "live_client_monitor_log");
                    long j2 = this.f196415Z;
                    if (j2 > 0) {
                        this.f196415Z = j2 + 1;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private JSONObject m150879a(C87122c cVar, boolean z, long j) {
        long j2;
        JSONArray jSONArray;
        long j3;
        JSONObject b = mo140859b();
        if (b == null) {
            return null;
        }
        JSONObject put = b.put("event_key", "first_frame").put("last_retry_end", 0L).put("hit_cache", z ? 1 : 0).put("start", cVar.f196794a).put("sdk_dns_analysis_end", cVar.f196846b).put("prepare_block_end", cVar.f196847c);
        if (cVar.f196864t <= 0) {
            j2 = cVar.f196848d;
        } else {
            j2 = cVar.f196864t;
        }
        JSONObject put2 = put.put("tfo_fall_back_time", j2).put("pre_connect", this.f196428aL).put("http_req_finish_time", cVar.f196786S).put("http_res_finish_time", cVar.f196787T).put("first_video_package_end", cVar.f196852h).put("first_audio_package_end", cVar.f196853i).put("first_video_frame_decode_end", cVar.f196854j).put("first_audio_frame_decode_end", cVar.f196855k).put("first_frame_from_player_core", cVar.f196858n).put("first_frame_render_end", cVar.f196856l).put("video_param_send_outlet_time", cVar.f196834ao).put("first_video_frame_send_outlet_time", cVar.f196835ap).put("set_surface_time", this.f196498bc).put("set_surface_cost", this.f196497bb).put("video_render_type", cVar.f196836aq).put("video_device_open_start", cVar.f196860p).put("video_device_open_end", cVar.f196861q).put("audio_device_open_start", cVar.f196862r).put("audio_device_open_end", cVar.f196863s).put("video_device_wait_start", cVar.f196839at).put("video_device_wait_end", cVar.f196840au).put("find_stream_info_start", cVar.f196837ar).put("find_stream_info_end", cVar.f196838as).put("video_first_pkt_pos", cVar.f196780M).put("video_first_pkt_pts", cVar.f196781N).put("audio_first_pkt_pos", cVar.f196782O).put("audio_first_pkt_pts", cVar.f196783P).put("video_buffer_time", this.f196522c.f196822ac).put("audio_buffer_time", this.f196522c.f196823ad).put("download_speed", this.f196522c.f196820aa).put("stall_time", j).put("first_sei_delay", this.f196522c.f196829aj).put("response_header_X-Server-IP", this.f196522c.f196843ax).put("response_header_Via", this.f196522c.f196844ay).put("prepare_end", cVar.f196859o).put("drop_audio_pts_diff", cVar.f196784Q).put("drop_audio_cost", cVar.f196785R).put("enable_tcp_fast_open", this.f196494bY).put("tfo_success", cVar.f196816aV).put("abr_check_enhance", this.f196556ch);
        if (this.f196549ca == null) {
            jSONArray = new JSONArray();
        } else {
            jSONArray = new JSONArray((Collection) this.f196549ca);
        }
        put2.put("optimize_backup_ips", jSONArray).put("suggest_format", this.f196505bj).put("suggest_protocol", this.f196506bk).put("suggest_access_code", this.f196509bn).put("container_fps", (double) this.f196503bh).put("used_drm", this.f196597dV).put("ipv6_probe_result", cVar.f196819aY);
        if (this.f196597dV == 1) {
            b.put("drm_get_secret_key_end", this.f196599dX);
        }
        if (mo140880k()) {
            b.put("player_dns_analysis_end", this.f196563co);
            b.put("rtc_use_sdk_dns", this.f196562cn);
            b.put("tcp_connect_end", this.f196564cp);
            b.put("rtc_tls_handshake_end", this.f196565cq);
            b.put("tcp_first_package_end", this.f196566cr);
            b.put("rtc_inited_end", cVar.f196809aO);
            b.put("rtc_offer_send_end", cVar.f196810aP);
            b.put("rtc_answer_recv_end", cVar.f196811aQ);
            b.put("rtc_start_end", cVar.f196812aR);
        } else {
            b.put("player_dns_analysis_end", cVar.f196848d);
            b.put("player_open_input_start", cVar.f196849e);
            if (this.f196725fs.equals("kcp")) {
                j3 = cVar.f196848d;
            } else {
                j3 = cVar.f196850f;
            }
            b.put("tcp_connect_end", j3);
            b.put("tcp_first_package_end", cVar.f196851g);
        }
        int i = this.f196408S;
        if (i != -1) {
            b.put("audio_timescale_enable", i);
        }
        if (this.f196475bF) {
            b.put("abr_startup_bitrate", cVar.f196821ab);
        }
        if (TextUtils.equals(this.f196725fs, "quic") || TextUtils.equals(this.f196725fs, "quicu")) {
            m150881a(b, this.f196513br);
        }
        if (TextUtils.equals(this.f196725fs, "h2") || TextUtils.equals(this.f196725fs, "h2q") || TextUtils.equals(this.f196725fs, "h2qu")) {
            m150881a(b, this.f196512bq);
        }
        if (TextUtils.equals(this.f196629eA, "avph")) {
            m150881a(b, this.f196514bs);
        }
        return b;
    }

    public C87119b(C87154g gVar, AbstractC87117a aVar, long j, long j2, Context context, int i) {
        this.f196416a = context;
        this.f196670eq = new Handler(this);
        this.f196671er = j <= 0 ? 60000 : j;
        this.f196469b = aVar;
        this.f196575d = gVar;
        this.f196522c = new C87122c();
        NTPUDPClient nTPUDPClient = new NTPUDPClient();
        this.f196460ar = nTPUDPClient;
        nTPUDPClient.setDefaultTimeout(10000);
        this.f196455am = j2;
        if (i == 1) {
            this.f196536cN = new C87122c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x024c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m150878a(com.p2082ss.videoarch.p4474a.p4475a.C87122c r20, long r21, long r23, long r25, long r27, boolean r29, long r30) {
        /*
        // Method dump skipped, instructions count: 617
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.p4475a.C87119b.m150878a(com.ss.videoarch.a.a.c, long, long, long, long, boolean, long):org.json.JSONObject");
    }
}
