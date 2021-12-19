package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.C1764a;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResult;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResultCollection;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResultItem;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.ttm.player.C86275p;
import com.p2082ss.ttvideoengine.AbstractC86311ag;
import com.p2082ss.ttvideoengine.C86307af;
import com.p2082ss.ttvideoengine.C86366b;
import com.p2082ss.ttvideoengine.C86372bd;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.p4409c.C86383c;
import com.p2082ss.ttvideoengine.p4415h.C86449aa;
import com.p2082ss.ttvideoengine.p4415h.C86472n;
import com.p2082ss.ttvideoengine.p4415h.C86493v;
import com.p2082ss.ttvideoengine.p4416i.AbstractC86508b;
import com.p2082ss.ttvideoengine.p4416i.C86507a;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4418k.C86545d;
import com.p2082ss.ttvideoengine.p4428q.C86614c;
import com.p2082ss.ttvideoengine.p4428q.C86617e;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86637f;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import com.p2082ss.ttvideoengine.p4430s.C86644l;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.r */
public final class C86481r implements AbstractC86468j {

    /* renamed from: aB */
    private static int f194060aB = 1;

    /* renamed from: bd */
    private static Map f194061bd = new HashMap();

    /* renamed from: A */
    private boolean f194062A;

    /* renamed from: B */
    private boolean f194063B;

    /* renamed from: C */
    private int f194064C;

    /* renamed from: D */
    private int f194065D;

    /* renamed from: E */
    private ArrayList f194066E;

    /* renamed from: F */
    private ArrayList<String> f194067F;

    /* renamed from: G */
    private ArrayList f194068G;

    /* renamed from: H */
    private ArrayList f194069H;

    /* renamed from: I */
    private ArrayList f194070I;

    /* renamed from: J */
    private String f194071J;

    /* renamed from: K */
    private String f194072K;

    /* renamed from: L */
    private String f194073L;

    /* renamed from: M */
    private String f194074M;

    /* renamed from: N */
    private String f194075N;

    /* renamed from: O */
    private String f194076O = "";

    /* renamed from: P */
    private String f194077P = "";

    /* renamed from: Q */
    private String f194078Q = "";

    /* renamed from: R */
    private String f194079R = "";

    /* renamed from: S */
    private int f194080S;

    /* renamed from: T */
    private int f194081T;

    /* renamed from: U */
    private int f194082U;

    /* renamed from: V */
    private boolean f194083V;

    /* renamed from: W */
    private Map f194084W;

    /* renamed from: X */
    private int f194085X = -1;

    /* renamed from: Y */
    private String f194086Y = "";

    /* renamed from: Z */
    private String f194087Z = "";

    /* renamed from: a */
    public AbstractC86462f f194088a;

    /* renamed from: aA */
    private long f194089aA;

    /* renamed from: aC */
    private int f194090aC;

    /* renamed from: aD */
    private int f194091aD;

    /* renamed from: aE */
    private int f194092aE;

    /* renamed from: aF */
    private long f194093aF = -2147483648L;

    /* renamed from: aG */
    private long f194094aG = -2147483648L;

    /* renamed from: aH */
    private long f194095aH = -2147483648L;

    /* renamed from: aI */
    private int f194096aI;

    /* renamed from: aJ */
    private boolean f194097aJ;

    /* renamed from: aK */
    private boolean f194098aK;

    /* renamed from: aL */
    private int f194099aL;

    /* renamed from: aM */
    private int f194100aM;

    /* renamed from: aN */
    private int f194101aN;

    /* renamed from: aO */
    private int f194102aO;

    /* renamed from: aP */
    private boolean f194103aP;

    /* renamed from: aQ */
    private boolean f194104aQ;

    /* renamed from: aR */
    private boolean f194105aR;

    /* renamed from: aS */
    private float f194106aS;

    /* renamed from: aT */
    private boolean f194107aT;

    /* renamed from: aU */
    private boolean f194108aU;

    /* renamed from: aV */
    private Timer f194109aV;

    /* renamed from: aW */
    private TimerTask f194110aW;

    /* renamed from: aX */
    private int f194111aX;

    /* renamed from: aY */
    private int f194112aY;

    /* renamed from: aZ */
    private C86471m f194113aZ;

    /* renamed from: aa */
    private int f194114aa;

    /* renamed from: ab */
    private int f194115ab;

    /* renamed from: ac */
    private int f194116ac;

    /* renamed from: ad */
    private int f194117ad;

    /* renamed from: ae */
    private int f194118ae;

    /* renamed from: af */
    private long f194119af;

    /* renamed from: ag */
    private String f194120ag;

    /* renamed from: ah */
    private int f194121ah = -1;

    /* renamed from: ai */
    private long f194122ai;

    /* renamed from: aj */
    private int f194123aj = -1;

    /* renamed from: ak */
    private int f194124ak;

    /* renamed from: al */
    private int f194125al;

    /* renamed from: am */
    private int f194126am = -1;

    /* renamed from: an */
    private String f194127an;

    /* renamed from: ao */
    private int f194128ao;

    /* renamed from: ap */
    private int f194129ap;

    /* renamed from: aq */
    private AbstractC86517e f194130aq;

    /* renamed from: ar */
    private long f194131ar;

    /* renamed from: as */
    private long f194132as;

    /* renamed from: at */
    private int f194133at;

    /* renamed from: au */
    private int f194134au;

    /* renamed from: av */
    private int f194135av;

    /* renamed from: aw */
    private Context f194136aw;

    /* renamed from: ax */
    private String f194137ax = "";

    /* renamed from: ay */
    private int f194138ay = -1002;

    /* renamed from: az */
    private long f194139az;

    /* renamed from: b */
    public C86505z f194140b;

    /* renamed from: bA */
    private boolean f194141bA = false;

    /* renamed from: bB */
    private C86633c f194142bB = null;

    /* renamed from: bC */
    private int f194143bC = -1;

    /* renamed from: bD */
    private long f194144bD = -2147483648L;

    /* renamed from: ba */
    private C86456ac f194145ba;

    /* renamed from: bb */
    private C86460e f194146bb;

    /* renamed from: bc */
    private Map f194147bc = new HashMap();

    /* renamed from: be */
    private int f194148be = -1;

    /* renamed from: bf */
    private int f194149bf = 0;

    /* renamed from: bg */
    private int f194150bg = 0;

    /* renamed from: bh */
    private int f194151bh = 0;

    /* renamed from: bi */
    private int f194152bi = 0;

    /* renamed from: bj */
    private int f194153bj = 0;

    /* renamed from: bk */
    private int f194154bk = 0;

    /* renamed from: bl */
    private int f194155bl = 0;

    /* renamed from: bm */
    private String f194156bm = "";

    /* renamed from: bn */
    private String f194157bn = "";

    /* renamed from: bo */
    private String f194158bo = "";

    /* renamed from: bp */
    private int f194159bp = 0;

    /* renamed from: bq */
    private C86484b f194160bq;

    /* renamed from: br */
    private ArrayList<String> f194161br = new ArrayList<>();

    /* renamed from: bs */
    private ArrayList<String> f194162bs = new ArrayList<>();

    /* renamed from: bt */
    private ArrayList<String> f194163bt = new ArrayList<>();

    /* renamed from: bu */
    private ArrayList<String> f194164bu = new ArrayList<>();

    /* renamed from: bv */
    private ArrayList<String> f194165bv = new ArrayList<>();

    /* renamed from: bw */
    private ArrayList<String> f194166bw = new ArrayList<>();

    /* renamed from: bx */
    private ArrayList<String> f194167bx = new ArrayList<>();

    /* renamed from: by */
    private ArrayList<Integer> f194168by = new ArrayList<>();

    /* renamed from: bz */
    private ArrayList<Integer> f194169bz = new ArrayList<>();

    /* renamed from: c */
    public C86476o f194170c;

    /* renamed from: d */
    public int f194171d;

    /* renamed from: e */
    public long f194172e;

    /* renamed from: f */
    public int f194173f;

    /* renamed from: g */
    public int f194174g;

    /* renamed from: h */
    public int f194175h;

    /* renamed from: i */
    public int f194176i = Integer.MIN_VALUE;

    /* renamed from: j */
    public int f194177j = Integer.MIN_VALUE;

    /* renamed from: k */
    public int f194178k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f194179l = 1000;

    /* renamed from: m */
    public long f194180m;

    /* renamed from: n */
    public long f194181n;

    /* renamed from: o */
    public long f194182o = -2147483648L;

    /* renamed from: p */
    public long f194183p = -2147483648L;

    /* renamed from: q */
    public long f194184q = -2147483648L;

    /* renamed from: r */
    public long f194185r = -2147483648L;

    /* renamed from: s */
    private C86489u f194186s;

    /* renamed from: t */
    private C86497x f194187t;

    /* renamed from: u */
    private C86501y f194188u;

    /* renamed from: v */
    private C86493v f194189v;

    /* renamed from: w */
    private C86452ab f194190w;

    /* renamed from: x */
    private C86472n f194191x;

    /* renamed from: y */
    private final C86464h f194192y;

    /* renamed from: z */
    private boolean f194193z;

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: k */
    public final void mo137618k() {
        m149416C();
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: p */
    public final String mo137638p() {
        return this.f194137ax;
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: r */
    public final int mo137646r() {
        return this.f194171d;
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: s */
    public final long mo137650s() {
        return this.f194172e;
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137543a(int i, String str) {
        this.f194126am = i;
        this.f194127an = str;
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137564a(boolean z) {
        if (z) {
            this.f194080S = 1;
        } else {
            this.f194080S = 0;
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137560a(String str, String str2, float f, float f2, float f3, float f4, long j, Map<String, String> map, Map<String, String> map2) {
        Map map3;
        C86452ab abVar = this.f194190w;
        if (abVar != null && abVar.f193839c && abVar.f193842f != null) {
            abVar.mo137496c();
            String valueOf = String.valueOf(abVar.f193842f.f193983am);
            if (abVar.f193842f != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (map3 = abVar.f193842f.f193971aa) != null && !str.equals("-1") && !str2.equals("-1")) {
                for (Map.Entry entry : ((Map) map3.get("fileKey")).entrySet()) {
                    if (((String) entry.getValue()).equals(str)) {
                        if (entry.getKey() == null) {
                            abVar.f193841e.f193878k.add(-1);
                        } else if (((Integer) entry.getKey()).intValue() == 0) {
                            abVar.f193841e.f193878k.add(-1);
                        } else {
                            abVar.f193841e.f193878k.add(abVar.mo137491a((Integer) entry.getKey()));
                        }
                        abVar.f193841e.f193872e.add(Integer.valueOf((int) j));
                        abVar.f193841e.f193873f.add(Float.valueOf(f));
                        abVar.f193841e.f193875h.add(Float.valueOf(f3));
                        abVar.f193841e.f193876i.add(valueOf);
                        abVar.mo137494a(map, 0);
                    }
                    if (((String) entry.getValue()).equals(str2)) {
                        if (entry.getKey() == null) {
                            abVar.f193841e.f193891x.add(-1);
                        } else if (((Integer) entry.getKey()).intValue() == 0) {
                            abVar.f193841e.f193891x.add(-1);
                        } else {
                            abVar.f193841e.f193891x.add(abVar.mo137491a((Integer) entry.getKey()));
                        }
                        abVar.f193841e.f193885r.add(Integer.valueOf((int) j));
                        abVar.f193841e.f193886s.add(Float.valueOf(f2));
                        abVar.f193841e.f193888u.add(Float.valueOf(f4));
                        abVar.f193841e.f193889v.add(valueOf);
                        abVar.mo137494a(map2, 1);
                    }
                }
            }
            abVar.f193841e.f193871d++;
            abVar.f193841e.f193884q++;
            C86641i.m150113b("VideoEventSampleRecord", "brian video count:" + abVar.f193841e.f193871d + ",audio count:" + abVar.f193841e.f193884q);
            if (abVar.f193841e.f193871d < abVar.f193837a && abVar.f193841e.f193884q < abVar.f193837a) {
                return;
            }
            if (abVar.f193841e.f193857G == 0) {
                abVar.mo137493a(0);
            } else {
                abVar.mo137497d();
            }
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137549a(SpeedPredictorResultCollection speedPredictorResultCollection, SpeedPredictorResultCollection speedPredictorResultCollection2, long j) {
        C86452ab abVar;
        Map map;
        if (speedPredictorResultCollection != null && speedPredictorResultCollection2 != null && (abVar = this.f194190w) != null && abVar.f193839c && abVar.f193842f != null) {
            abVar.mo137496c();
            Map map2 = abVar.f193842f.f193971aa;
            if (map2 != null && (map = (Map) map2.get("fileKey")) != null && !map.isEmpty()) {
                int i = 0;
                Boolean[] boolArr = {false};
                Boolean[] boolArr2 = {false};
                for (Map.Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    Iterator<SpeedPredictorResult> it = speedPredictorResultCollection.getResultCollection().iterator();
                    while (true) {
                        int i2 = 3;
                        if (!it.hasNext()) {
                            break;
                        }
                        SpeedPredictorResult next = it.next();
                        if (next.getFileId().equals(value)) {
                            if (!next.getResultItems().isEmpty()) {
                                if (next.getResultItems().get(i).getTrackType() == 0) {
                                    if (entry.getKey() == null) {
                                        abVar.f193841e.f193878k.add(-1);
                                    } else if (((Integer) entry.getKey()).intValue() == 0) {
                                        abVar.f193841e.f193878k.add(-1);
                                    } else {
                                        abVar.f193841e.f193878k.add(abVar.mo137491a((Integer) entry.getKey()));
                                    }
                                } else if (entry.getKey() == null) {
                                    abVar.f193841e.f193891x.add(-1);
                                } else if (((Integer) entry.getKey()).intValue() == 0) {
                                    abVar.f193841e.f193891x.add(-1);
                                } else {
                                    abVar.f193841e.f193891x.add(abVar.mo137491a((Integer) entry.getKey()));
                                }
                            }
                            Object key = entry.getKey();
                            Iterator<SpeedPredictorResultItem> it2 = next.getResultItems().iterator();
                            while (it2.hasNext()) {
                                SpeedPredictorResultItem next2 = it2.next();
                                Object[] objArr = new Object[i2];
                                objArr[i] = next2.getLoadType();
                                objArr[1] = next2.getHost();
                                objArr[2] = String.valueOf(key);
                                String a = C1764a.m5928a("%s|%s|%s", objArr);
                                if (next2.getTrackType() == 0) {
                                    abVar.f193841e.f193873f.add(Float.valueOf(next2.getBandwidth()));
                                    abVar.f193841e.f193874g.add(a);
                                    if (!boolArr[i].booleanValue()) {
                                        abVar.f193841e.f193872e.add(Integer.valueOf((int) j));
                                        boolArr[i] = true;
                                    } else {
                                        abVar.f193841e.f193872e.add(Integer.valueOf(i));
                                    }
                                } else {
                                    if (next2.getTrackType() == 1) {
                                        abVar.f193841e.f193886s.add(Float.valueOf(next2.getBandwidth()));
                                        abVar.f193841e.f193887t.add(a);
                                        if (!boolArr2[0].booleanValue()) {
                                            abVar.f193841e.f193885r.add(Integer.valueOf((int) j));
                                            boolArr2[0] = true;
                                        } else {
                                            abVar.f193841e.f193885r.add(0);
                                        }
                                    }
                                    i = 0;
                                }
                                i2 = 3;
                            }
                        }
                        i = 0;
                    }
                    Iterator<SpeedPredictorResult> it3 = speedPredictorResultCollection2.getResultCollection().iterator();
                    while (it3.hasNext()) {
                        SpeedPredictorResult next3 = it3.next();
                        if (next3.getFileId().equals(value)) {
                            Object key2 = entry.getKey();
                            Iterator<SpeedPredictorResultItem> it4 = next3.getResultItems().iterator();
                            while (it4.hasNext()) {
                                SpeedPredictorResultItem next4 = it4.next();
                                String a2 = C1764a.m5928a("%s|%s|%s|%s", new Object[]{next4.getLoadType(), next4.getHost(), String.valueOf(key2), String.valueOf(abVar.f193842f.f193983am)});
                                if (next4.getTrackType() == 0) {
                                    abVar.f193841e.f193875h.add(Float.valueOf(next4.getBandwidth()));
                                    abVar.f193841e.f193876i.add(a2);
                                } else if (next4.getTrackType() == 1) {
                                    abVar.f193841e.f193888u.add(Float.valueOf(next4.getBandwidth()));
                                    abVar.f193841e.f193889v.add(a2);
                                }
                            }
                        }
                    }
                    i = 0;
                }
                abVar.f193841e.f193871d++;
                abVar.f193841e.f193884q++;
                if (abVar.f193841e.f193871d < abVar.f193837a && abVar.f193841e.f193884q < abVar.f193837a) {
                    return;
                }
                if (abVar.f193841e.f193857G == 0) {
                    abVar.mo137493a(0);
                } else {
                    abVar.mo137497d();
                }
            }
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: b */
    public final void mo137573b(long j, long j2) {
        MethodCollector.m26663i(2846);
        synchronized ("VideoEventLoggerV2") {
            try {
                C86641i.m150113b("VideoEventLoggerV2", "global speed size:" + j + ", time:" + j2 + ", totalsize:" + this.f194180m + ", totaltime:" + this.f194181n);
                this.f194180m += j;
                this.f194181n += j2;
            } finally {
                MethodCollector.m26664o(2846);
            }
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137551a(AbstractC86517e eVar) {
        if (eVar != null) {
            m149427c(eVar);
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137559a(String str, String str2) {
        this.f194072K = str;
        C86476o oVar = this.f194170c;
        if (oVar != null) {
            oVar.f194004s = str;
        }
        this.f194073L = str2;
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137546a(long j, int i) {
        C86505z zVar = this.f194140b;
        if (zVar != null && zVar.f194454ae <= 0) {
            this.f194140b.f194454ae = j;
            this.f194140b.f194502bZ = i;
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137545a(long j) {
        C86505z zVar = this.f194140b;
        if (zVar != null) {
            zVar.f194455af = j;
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137562a(ArrayList arrayList) {
        this.f194070I = arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: java.util.ArrayList<java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: java.util.ArrayList<java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
    /* renamed from: a */
    public final void mo137557a(String str, long j, String str2) {
        Map<String, Object> d;
        MethodCollector.m26663i(3120);
        this.f194135av = 1;
        C86476o oVar = this.f194170c;
        oVar.f193946C = str;
        oVar.f193992g = str2;
        String str3 = oVar.f193992g;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
            sb.append("T");
        }
        sb.append(Long.toString(System.currentTimeMillis()));
        sb.append("T");
        sb.append(Integer.toString((int) (Math.random() * 65535.0d)));
        oVar.f194003r = sb.toString();
        oVar.f193969Z = oVar.f194003r;
        if (this.f194099aL == 1) {
            this.f194094aG = j;
        }
        if (this.f194095aH <= 0) {
            this.f194095aH = j;
            AbstractC86462f fVar = this.f194088a;
            if (!(fVar == null || (d = fVar.mo137295d()) == null)) {
                this.f194168by.add(d.get("power"));
                this.f194169bz.add(d.get("isCharging"));
            }
        }
        this.f194062A = true;
        this.f194140b.f194492bP = this.f194170c.f194003r;
        if (this.f194099aL == 1) {
            this.f194140b.f194650t = j;
        } else {
            this.f194140b.f194650t = 0;
        }
        this.f194140b.f194651u = 0;
        this.f194140b.f194454ae = 0;
        this.f194140b.f194455af = 0;
        this.f194140b.f194457ah = 0;
        this.f194140b.f194458ai = 0;
        this.f194140b.f194459aj = 0;
        this.f194140b.f194460ak = 0;
        this.f194140b.f194461al = 0;
        this.f194140b.f194462am = 0;
        this.f194140b.f194463an = 0;
        this.f194140b.f194464ao = 0;
        this.f194140b.f194472aw = 0;
        this.f194140b.f194474ay = 0;
        this.f194140b.f194473ax = 0;
        this.f194140b.f194475az = 0;
        this.f194125al++;
        this.f194140b.f194484bH = -2147483648L;
        this.f194140b.f194485bI = -2147483648L;
        this.f194140b.f194486bJ = -2147483648L;
        this.f194140b.f194487bK = -2147483648L;
        this.f194140b.f194488bL = -2147483648L;
        this.f194140b.f194489bM = -2147483648L;
        this.f194140b.f194490bN = Integer.MIN_VALUE;
        this.f194140b.f194606dX = this.f194103aP;
        if (!this.f194103aP) {
            this.f194103aP = true;
        }
        if (this.f194170c.f193947D.equals("vid")) {
            m149425a(-1002, true);
        } else if (this.f194170c.f193947D.equals("local_url")) {
            m149425a(-1005, true);
        } else if (this.f194140b.f194502bZ == 0) {
            m149425a(-1003, true);
        } else if (this.f194140b.f194502bZ == 1) {
            m149425a(-1005, true);
        }
        if (this.f194105aR) {
            this.f194190w.mo137492a();
        }
        C86641i.m150110a("VideoEventLoggerV2", "netlevel interval:" + this.f194111aX + ", max count:" + this.f194179l);
        if (this.f194111aX > 0 && this.f194109aV == null && this.f194110aW == null) {
            this.f194109aV = new Timer();
            C86485c cVar = new C86485c(this, (byte) 0);
            this.f194110aW = cVar;
            this.f194109aV.schedule(cVar, 1000, (long) this.f194111aX);
            this.f194140b.f194552cW = this.f194111aX;
            C86476o oVar2 = this.f194170c;
            if (oVar2.f193973ac != null) {
                synchronized ("VideoEventBase") {
                    try {
                        if (C86476o.f193943d == null) {
                            C86476o.f193943d = C86307af.m148603a();
                        }
                        oVar2.f193990e = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b8: IPUT  
                              (wrap: com.ss.ttvideoengine.h.o$1 : 0x01b5: CONSTRUCTOR  (r0v76 com.ss.ttvideoengine.h.o$1) = (r5v2 'oVar2' com.ss.ttvideoengine.h.o) call: com.ss.ttvideoengine.h.o.1.<init>(com.ss.ttvideoengine.h.o):void type: CONSTRUCTOR)
                              (r5v2 'oVar2' com.ss.ttvideoengine.h.o)
                             com.ss.ttvideoengine.h.o.e com.ss.ttvideoengine.ag in method: com.ss.ttvideoengine.h.r.a(java.lang.String, long, java.lang.String):void, file: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b5: CONSTRUCTOR  (r0v76 com.ss.ttvideoengine.h.o$1) = (r5v2 'oVar2' com.ss.ttvideoengine.h.o) call: com.ss.ttvideoengine.h.o.1.<init>(com.ss.ttvideoengine.h.o):void type: CONSTRUCTOR in method: com.ss.ttvideoengine.h.r.a(java.lang.String, long, java.lang.String):void, file: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 38 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.ttvideoengine.h.o, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 42 more
                            */
                        /*
                        // Method dump skipped, instructions count: 531
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4415h.C86481r.mo137557a(java.lang.String, long, java.lang.String):void");
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137554a(C86633c cVar, int i) {
                        HashMap a = cVar.mo137898a();
                        a.put("apiver", Integer.valueOf(i));
                        this.f194066E.add(a);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137553a(C86633c cVar) {
                        this.f194068G.add(cVar);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137574b(AbstractC86517e eVar) {
                        if (eVar != null) {
                            m149427c(eVar);
                            if (this.f194140b.f194653w <= 0) {
                                this.f194140b.f194649s = System.currentTimeMillis();
                            }
                            this.f194063B = true;
                            if (this.f194140b.f194502bZ == 1) {
                                m149425a(-1005, true);
                            } else if (this.f194140b.f194502bZ == 0) {
                                m149425a(-1004, true);
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137544a(int i, String str, C86633c cVar) {
                        HashMap hashMap = new HashMap();
                        if (cVar != null) {
                            hashMap = cVar.mo137898a();
                        }
                        hashMap.put("result", Integer.valueOf(i));
                        if (str != null) {
                            hashMap.put("filehash", str);
                        }
                        this.f194067F.add(new JSONObject(hashMap).toString());
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137577b(String str, String str2) {
                        this.f194170c.mo137681a(str, str2);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137561a(String str, String str2, boolean z) {
                        if (z) {
                            if (this.f194135av == 4) {
                                this.f194187t.mo137712a("switch", 0);
                            }
                            if (this.f194135av == 3) {
                                this.f194186s.mo137704a("switch");
                                this.f194140b.f194487bK = System.currentTimeMillis();
                            }
                        }
                        if (this.f194141bA) {
                            long j = -1;
                            AbstractC86462f fVar = this.f194088a;
                            if (fVar != null) {
                                j = (long) fVar.mo137292c(67);
                            }
                            this.f194188u.mo137717a((int) j, "switch");
                            this.f194141bA = false;
                        }
                        this.f194140b.f194654x = System.currentTimeMillis();
                        if (!str.equals(str2)) {
                            this.f194128ao++;
                        }
                        this.f194170c.mo137681a(str, str2);
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194488bL = System.currentTimeMillis();
                        }
                        if (z) {
                            m149425a(-2005, true);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137579b(boolean z) {
                        if (z) {
                            if (this.f194135av == 4) {
                                this.f194187t.mo137712a("wait", 0);
                            }
                            if (this.f194135av == 3) {
                                this.f194135av = 2;
                            }
                        }
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194489bM = System.currentTimeMillis();
                            if (this.f194140b.f194488bL > 0) {
                                long j = this.f194140b.f194489bM - this.f194140b.f194488bL;
                                int i = -1;
                                AbstractC86462f fVar = this.f194088a;
                                if (fVar != null) {
                                    i = fVar.mo137292c(67);
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("to", this.f194170c.f193960Q);
                                hashMap.put("p", Integer.valueOf(i));
                                hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                                hashMap.put("c", Long.valueOf(j));
                                hashMap.put("seam", Boolean.valueOf(z));
                                this.f194163bt.add(new JSONObject(hashMap).toString());
                            }
                        }
                        if (z) {
                            m149425a(-2005, false);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137547a(long j, long j2) {
                        C86472n nVar = this.f194191x;
                        C86641i.m150113b("VideoEventAbrEvent", "abrSwitchStart");
                        C86472n.C86475b bVar = new C86472n.C86475b(nVar, (byte) 0);
                        bVar.f193926a = System.currentTimeMillis();
                        bVar.f193929d = nVar.f193916a.f193970a.mo137287a(102);
                        bVar.f193930e = j;
                        bVar.f193931f = j2;
                        bVar.f193932g = (long) nVar.f193916a.f193970a.mo137292c(103);
                        bVar.f193933h = nVar.f193916a.f193970a.mo137290b(104);
                        bVar.f193934i = nVar.f193916a.f193970a.mo137290b(105);
                        bVar.f193939n = nVar.f193916a.f193970a.mo137292c(109);
                        if (C86614c.f195160b != null) {
                            bVar.f193935j = C86614c.f195160b.getPredictSpeed(0);
                        }
                        nVar.f193917b.add(bVar);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee  */
                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo137555a(com.p2082ss.ttvideoengine.p4430s.C86633c r14, int r15, int r16) {
                        /*
                        // Method dump skipped, instructions count: 384
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4415h.C86481r.mo137555a(com.ss.ttvideoengine.s.c, int, int):void");
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137575b(C86633c cVar, int i) {
                        boolean z;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (this.f194135av == 4) {
                            this.f194187t.mo137712a("error", 0);
                            z = false;
                        } else {
                            z = true;
                        }
                        if (this.f194135av == 3) {
                            this.f194186s.mo137704a("error");
                            this.f194140b.f194487bK = currentTimeMillis;
                            z = false;
                        }
                        this.f194135av = 5;
                        HashMap a = cVar.mo137898a();
                        a.put("strategy", 0);
                        a.put("apiver", Integer.valueOf(i));
                        this.f194069H.add(a);
                        if (!this.f194062A || this.f194140b.f194653w > 0) {
                            if (cVar.mo137901d() && this.f194070I.size() <= 1) {
                                this.f194175h++;
                            }
                            this.f194140b.f194654x = currentTimeMillis;
                        } else {
                            this.f194140b.f194655y = currentTimeMillis;
                        }
                        m149426b(cVar);
                        long j = -1;
                        AbstractC86462f fVar = this.f194088a;
                        if (fVar != null) {
                            j = (long) fVar.mo137292c(67);
                            if (this.f194140b.f194578cw <= 0) {
                                this.f194088a.mo137289a(2, m149423J());
                            }
                        }
                        if (this.f194142bB != null) {
                            long j2 = this.f194144bD;
                            if (j2 > 0) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("ec", Integer.valueOf(this.f194142bB.f195251a));
                                hashMap.put("p", Long.valueOf(j));
                                hashMap.put("t", Long.valueOf(currentTimeMillis));
                                hashMap.put("c", Long.valueOf(currentTimeMillis - j2));
                                hashMap.put("st", Integer.valueOf(this.f194143bC));
                                this.f194167bx.add(new JSONObject(hashMap).toString());
                                this.f194142bB = null;
                                this.f194143bC = -1;
                                this.f194144bD = -2147483648L;
                            }
                        }
                        if (z) {
                            this.f194170c.mo137679a();
                        }
                        if (this.f194141bA) {
                            this.f194188u.mo137717a((int) j, "error");
                            this.f194141bA = false;
                        }
                        this.f194140b.f194407K = cVar.mo137899b();
                        this.f194140b.f194408L = cVar.f195251a;
                        m149424V(4);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137550a(C86275p pVar) {
                        if (this.f194140b != null) {
                            float f = pVar.f192718d;
                            HashMap hashMap = new HashMap();
                            this.f194084W = hashMap;
                            hashMap.put("AFMode", Integer.valueOf(pVar.f192716b));
                            this.f194084W.put("pitch", Float.valueOf(pVar.f192717c));
                            this.f194084W.put("speed", Float.valueOf(f));
                            if (this.f194170c.f193968Y != f || this.f194164bu.isEmpty()) {
                                this.f194170c.f193968Y = f;
                                HashMap hashMap2 = new HashMap();
                                int i = -1;
                                AbstractC86462f fVar = this.f194088a;
                                if (fVar != null) {
                                    i = fVar.mo137292c(67);
                                }
                                hashMap2.put("to", Float.valueOf(this.f194170c.f193968Y));
                                hashMap2.put("p", Integer.valueOf(i));
                                hashMap2.put("t", Long.valueOf(System.currentTimeMillis()));
                                this.f194164bu.add(new JSONObject(hashMap2).toString());
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137563a(Map<String, Object> map) {
                        C86476o oVar = this.f194170c;
                        if (oVar != null) {
                            oVar.f193982al = map;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137578b(Map<String, Object> map) {
                        C86476o oVar = this.f194170c;
                        if (oVar != null) {
                            oVar.f193987aq = map;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137556a(String str) {
                        this.f194156bm = str;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v135, resolved type: java.util.ArrayList<java.lang.Integer> */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v136, resolved type: java.util.ArrayList<java.lang.Integer> */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: F */
                    private void m149419F() {
                        if (this.f194140b != null) {
                            if (!this.f194107aT || !this.f194108aU) {
                                C86641i.m150110a("VideoEventLoggerV2", "sendEvent pt_new:" + this.f194140b.f194582d + ", mEvent:" + this.f194140b + ", eventBase:" + this.f194170c);
                            } else {
                                C86641i.m150110a("VideoEventLoggerV2", "player degrade, store context");
                            }
                            if (this.f194140b.f194582d > 0 || this.f194095aH > 0) {
                                AbstractC86462f fVar = this.f194088a;
                                if (fVar != null) {
                                    Map<String, Long> b = fVar.mo137291b();
                                    if (b != null) {
                                        int intValue = b.get("vps").intValue();
                                        int intValue2 = b.get("vds").intValue();
                                        int intValue3 = b.get("single_vds").intValue();
                                        this.f194140b.f194400D = this.f194133at + intValue;
                                        if (this.f194083V) {
                                            this.f194140b.f194401E = this.f194134au + intValue3;
                                        } else {
                                            this.f194140b.f194401E = this.f194134au + intValue2;
                                        }
                                        C86631b.m150044a(new C86372bd.RunnableC86373a((long) this.f194140b.f194400D));
                                    }
                                    this.f194140b.f194503ba = this.f194088a.mo137287a(1);
                                    mo137668x(this.f194088a.mo137287a(2));
                                    this.f194140b.f194504bb = this.f194088a.mo137287a(3);
                                    this.f194140b.f194505bc = this.f194088a.mo137287a(4);
                                    this.f194140b.f194427aD = this.f194088a.mo137292c(23);
                                    this.f194140b.f194525bw = this.f194088a.mo137292c(34);
                                    this.f194140b.f194524bv = this.f194088a.mo137292c(35);
                                    this.f194140b.f194526bx = this.f194088a.mo137292c(36);
                                    if (this.f194140b.f194429aF == null) {
                                        String a = this.f194088a.mo137287a(5);
                                        if (a == null) {
                                            a = "";
                                        }
                                        this.f194140b.f194429aF = a;
                                    }
                                    String a2 = this.f194088a.mo137287a(33);
                                    if (!TextUtils.isEmpty(a2)) {
                                        this.f194140b.f194430aG = a2;
                                    }
                                    if (this.f194140b.f194454ae <= 0) {
                                        this.f194140b.f194502bZ = 1;
                                        this.f194140b.f194454ae = this.f194088a.mo137290b(7);
                                    }
                                    if (this.f194140b.f194455af <= 0) {
                                        long b2 = this.f194088a.mo137290b(10);
                                        if (b2 > this.f194095aH) {
                                            this.f194140b.f194455af = b2;
                                        }
                                    }
                                    if (this.f194140b.f194457ah <= 0) {
                                        long b3 = this.f194088a.mo137290b(11);
                                        if (b3 > this.f194095aH) {
                                            this.f194140b.f194457ah = b3;
                                        }
                                    }
                                    if (this.f194140b.f194458ai <= 0) {
                                        this.f194140b.f194458ai = this.f194088a.mo137290b(51);
                                    }
                                    if (this.f194140b.f194459aj <= 0) {
                                        long b4 = this.f194088a.mo137290b(52);
                                        if (b4 > this.f194095aH) {
                                            this.f194140b.f194459aj = b4;
                                        }
                                    }
                                    if (this.f194140b.f194460ak <= 0) {
                                        long b5 = this.f194088a.mo137290b(53);
                                        if (b5 > this.f194095aH) {
                                            this.f194140b.f194460ak = b5;
                                        }
                                    }
                                    if (this.f194140b.f194461al <= 0) {
                                        this.f194140b.f194461al = this.f194088a.mo137290b(12);
                                    }
                                    if (this.f194140b.f194462am <= 0) {
                                        this.f194140b.f194462am = this.f194088a.mo137290b(13);
                                    }
                                    if (this.f194140b.f194463an <= 0) {
                                        this.f194140b.f194463an = this.f194088a.mo137290b(14);
                                    }
                                    if (this.f194140b.f194464ao <= 0) {
                                        this.f194140b.f194464ao = this.f194088a.mo137290b(15);
                                    }
                                    if (this.f194140b.f194472aw <= 0) {
                                        this.f194140b.f194472aw = this.f194088a.mo137290b(17);
                                    }
                                    if (this.f194140b.f194474ay <= 0) {
                                        this.f194140b.f194474ay = this.f194088a.mo137290b(16);
                                    }
                                    if (this.f194140b.f194473ax <= 0) {
                                        this.f194140b.f194473ax = this.f194088a.mo137290b(19);
                                    }
                                    if (this.f194140b.f194475az <= 0) {
                                        this.f194140b.f194475az = this.f194088a.mo137290b(18);
                                    }
                                    if (this.f194140b.f194497bU <= 0) {
                                        this.f194140b.f194497bU = this.f194088a.mo137290b(38);
                                    }
                                    if (this.f194140b.f194498bV <= 0) {
                                        this.f194140b.f194498bV = this.f194088a.mo137290b(39);
                                    }
                                    this.f194140b.f194508bf = this.f194088a.mo137292c(61);
                                    this.f194140b.f194509bg = this.f194088a.mo137292c(27);
                                    this.f194140b.f194432aI = this.f194088a.mo137292c(30);
                                    this.f194140b.f194521bs = this.f194088a.mo137287a(31);
                                    this.f194140b.f194522bt = this.f194088a.mo137287a(32);
                                    this.f194140b.f194516bn = this.f194088a.mo137292c(81);
                                    this.f194140b.f194571cp = this.f194088a.mo137290b(54);
                                    this.f194140b.f194572cq = this.f194088a.mo137290b(57);
                                    this.f194140b.f194573cr = this.f194088a.mo137290b(58);
                                    int c = this.f194088a.mo137292c(100);
                                    if (c != 0) {
                                        this.f194140b.f194564ci = c;
                                    }
                                    if (this.f194140b.f194541cL == Integer.MIN_VALUE) {
                                        this.f194140b.f194541cL = this.f194088a.mo137292c(63);
                                    }
                                    if (this.f194140b.f194542cM == Integer.MIN_VALUE) {
                                        this.f194140b.f194542cM = this.f194088a.mo137292c(64);
                                    }
                                    if (this.f194170c.f193949F == 1 && this.f194170c.f193948E == 0) {
                                        this.f194140b.f194577cv = this.f194088a.mo137292c(77);
                                    }
                                    this.f194140b.f194607dY = this.f194088a.mo137292c(87);
                                    Map<String, Object> d = this.f194088a.mo137295d();
                                    if (d != null) {
                                        this.f194168by.add(d.get("power"));
                                        this.f194169bz.add(d.get("isCharging"));
                                    }
                                    ArrayList e = this.f194088a.mo137296e();
                                    if (e != null) {
                                        this.f194140b.f194629du = e;
                                    }
                                }
                                int i = this.f194114aa;
                                if (i > 0) {
                                    this.f194170c.f193951H = i;
                                }
                                Context context = this.f194136aw;
                                if (context != null) {
                                    SharedPreferences a3 = C34822d.m71158a(context, "VideoEventLogger", 0);
                                    this.f194140b.f194540cK = a3.getString("playersessionid", "");
                                    SharedPreferences.Editor edit = a3.edit();
                                    edit.putString("playersessionid", this.f194170c.f194003r);
                                    edit.apply();
                                }
                                this.f194140b.f194538cI = this.f194170c.f194003r;
                                this.f194140b.f194480bD = this.f194138ay;
                                this.f194140b.f194431aH = this.f194126am;
                                this.f194140b.f194433aJ = this.f194127an;
                                this.f194140b.f194439aP = this.f194115ab;
                                this.f194140b.f194440aQ = this.f194118ae;
                                this.f194140b.f194399C = this.f194070I;
                                this.f194140b.f194406J = this.f194170c.f193959P;
                                this.f194140b.f194405I = this.f194170c.f193960Q;
                                this.f194140b.f194451ab = this.f194080S;
                                this.f194140b.f194452ac = this.f194081T;
                                this.f194140b.f194435aL = this.f194082U;
                                this.f194140b.f194402F = this.f194116ac;
                                this.f194140b.f194403G = this.f194117ad;
                                this.f194140b.f194443aT = this.f194086Y;
                                this.f194140b.f194441aR = this.f194085X;
                                this.f194140b.f194442aS = this.f194064C;
                                this.f194140b.f194512bj = this.f194123aj;
                                C86505z zVar = this.f194140b;
                                C86545d.m149798a();
                                zVar.f194514bl = C86545d.f194995a;
                                this.f194140b.f194397A = this.f194173f;
                                this.f194140b.f194398B = this.f194175h;
                                this.f194140b.f194568cm = this.f194139az;
                                this.f194140b.f194569cn = this.f194089aA;
                                this.f194140b.f194574cs = (long) this.f194090aC;
                                this.f194140b.f194575ct = (long) this.f194091aD;
                                this.f194140b.f194576cu = (long) this.f194092aE;
                                this.f194140b.f194531cB = this.f194096aI;
                                this.f194140b.f194533cD = this.f194098aK;
                                this.f194140b.f194532cC = this.f194097aJ;
                                this.f194140b.f194534cE = this.f194099aL;
                                this.f194140b.f194561cf = this.f194176i;
                                this.f194140b.f194565cj = this.f194065D;
                                long j = this.f194119af;
                                if (j > 0) {
                                    this.f194140b.f194424aA = j;
                                }
                                this.f194140b.f194425aB = this.f194120ag;
                                C86489u uVar = this.f194186s;
                                if (uVar != null) {
                                    this.f194140b.f194445aV = uVar.f194245d;
                                }
                                this.f194140b.f194446aW = this.f194172e;
                                this.f194140b.f194449aZ = this.f194129ap;
                                this.f194140b.f194436aM = this.f194128ao;
                                this.f194140b.f194535cF = this.f194100aM;
                                this.f194140b.f194537cH = this.f194101aN;
                                this.f194140b.f194536cG = this.f194102aO;
                                this.f194140b.f194523bu = this.f194177j;
                                this.f194140b.f194613de = this.f194185r;
                                this.f194140b.f194612dd = this.f194184q;
                                this.f194140b.f194610db = this.f194183p;
                                this.f194140b.f194609da = this.f194182o;
                                this.f194140b.f194594dL = this.f194148be;
                                this.f194140b.f194595dM = m149422I();
                                this.f194140b.f194596dN = m149421H();
                                this.f194140b.f194597dO = C86637f.m150066a();
                                this.f194140b.f194598dP = C86637f.m150069b();
                                this.f194140b.f194599dQ = C86637f.m150071c();
                                if (this.f194113aZ.mo137674a() > 0.0f) {
                                    this.f194140b.f194600dR = this.f194113aZ.mo137674a();
                                }
                                if (this.f194113aZ.mo137675b() > 0.0f) {
                                    this.f194140b.f194601dS = this.f194113aZ.mo137675b();
                                }
                                this.f194140b.f194602dT = this.f194145ba.f193895b;
                                this.f194140b.f194603dU = this.f194146bb.f193903b;
                                this.f194140b.f194604dV = m149420G();
                                HashMap hashMap = new HashMap();
                                int i2 = 0;
                                while (i2 < this.f194066E.size() && i2 < 3) {
                                    try {
                                        hashMap.put(C1764a.m5928a("fetchretry%d", new Object[]{Integer.valueOf(i2)}), this.f194066E.get(i2));
                                        i2++;
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                int i3 = 0;
                                while (i3 < this.f194068G.size() && i3 < 3) {
                                    hashMap.put(C1764a.m5928a("ldns%d", new Object[]{Integer.valueOf(i3)}), ((C86633c) this.f194068G.get(i3)).mo137898a());
                                    i3++;
                                }
                                for (int i4 = 0; i4 < this.f194069H.size(); i4++) {
                                    if (i4 < 2 || i4 == this.f194069H.size() - 1) {
                                        hashMap.put(C1764a.m5928a("error%d", new Object[]{Integer.valueOf(i4)}), this.f194069H.get(i4));
                                    }
                                }
                                if (!TextUtils.isEmpty(this.f194079R)) {
                                    hashMap.put("log", this.f194079R);
                                }
                                if (!TextUtils.isEmpty(this.f194140b.f194563ch)) {
                                    hashMap.put("tr_err_msg", this.f194140b.f194563ch);
                                }
                                this.f194079R = "";
                                this.f194140b.f194453ad = hashMap;
                                this.f194137ax = hashMap.toString();
                                String str = this.f194071J;
                                if (str != null) {
                                    this.f194140b.f194414R = str;
                                }
                                String str2 = this.f194072K;
                                if (str2 != null) {
                                    this.f194140b.f194415S = str2;
                                }
                                String str3 = this.f194073L;
                                if (str3 != null) {
                                    this.f194140b.f194416T = str3;
                                }
                                String str4 = this.f194074M;
                                if (str4 != null) {
                                    this.f194140b.f194417U = str4;
                                }
                                String str5 = this.f194075N;
                                if (str5 != null) {
                                    this.f194140b.f194418V = str5;
                                }
                                String str6 = this.f194076O;
                                if (str6 != null) {
                                    this.f194140b.f194419W = str6;
                                }
                                String str7 = this.f194077P;
                                if (str7 != null) {
                                    this.f194140b.f194420X = str7;
                                }
                                Map map = this.f194084W;
                                if (map != null) {
                                    this.f194140b.f194434aK = map;
                                }
                                String str8 = this.f194156bm;
                                if (str8 != null) {
                                    this.f194140b.f194591dI = str8;
                                }
                                String str9 = this.f194157bn;
                                if (str9 != null) {
                                    this.f194140b.f194590dH = str9;
                                }
                                String str10 = this.f194158bo;
                                if (str10 != null) {
                                    this.f194140b.f194592dJ = str10;
                                }
                                if (this.f194140b.f194634dz <= 0) {
                                    this.f194140b.f194634dz = -2147483648L;
                                }
                                if (this.f194140b.f194633dy <= 0) {
                                    this.f194140b.f194633dy = -2147483648L;
                                }
                                if (this.f194140b.f194631dw <= 0) {
                                    this.f194140b.f194631dw = -2147483648L;
                                }
                                if (this.f194140b.f194632dx <= 0) {
                                    this.f194140b.f194632dx = -2147483648L;
                                }
                                this.f194140b.f194584dB = this.f194151bh;
                                this.f194140b.f194585dC = this.f194153bj;
                                this.f194140b.f194586dD = this.f194154bk;
                                this.f194140b.f194587dE = this.f194155bl;
                                this.f194140b.f194583dA = this.f194159bp;
                                this.f194140b.f194588dF = this.f194149bf;
                                this.f194140b.f194589dG = this.f194150bg;
                                this.f194140b.f194510bh = this.f194124ak;
                                this.f194140b.f194511bi = this.f194170c.f193988ar;
                                this.f194140b.f194520br = this.f194121ah;
                                this.f194140b.f194570co = f194060aB;
                                f194060aB = 0;
                                if (this.f194140b.f194485bI < this.f194140b.f194484bH) {
                                    this.f194140b.f194485bI = -2147483648L;
                                }
                                if (this.f194140b.f194489bM < this.f194140b.f194488bL) {
                                    this.f194140b.f194489bM = -2147483648L;
                                }
                                this.f194140b.f194423a = this.f194093aF;
                                this.f194140b.f194476b = this.f194094aG;
                                C86505z zVar2 = this.f194140b;
                                zVar2.f194648r = zVar2.f194582d;
                                this.f194140b.f194529c = this.f194095aH;
                                if (this.f194140b.f194654x <= 0 && this.f194140b.f194653w > 0) {
                                    this.f194140b.f194654x = System.currentTimeMillis();
                                }
                                this.f194140b.f194614df = this.f194161br;
                                this.f194140b.f194615dg = this.f194162bs;
                                this.f194140b.f194616dh = this.f194163bt;
                                this.f194140b.f194617di = this.f194164bu;
                                this.f194140b.f194618dj = this.f194165bv;
                                this.f194140b.f194619dk = this.f194166bw;
                                this.f194140b.f194620dl = this.f194167bx;
                                this.f194140b.f194621dm = this.f194186s.f194246e;
                                this.f194140b.f194622dn = this.f194187t.f194318g;
                                this.f194140b.f194624dp = this.f194192y.mo137509d();
                                this.f194140b.f194623do = this.f194188u.f194347c;
                                this.f194140b.f194630dv = this.f194188u.f194348d;
                                this.f194140b.f194605dW = this.f194067F;
                                this.f194140b.f194627ds = this.f194168by;
                                this.f194140b.f194628dt = this.f194169bz;
                                if (this.f194189v.f194292c) {
                                    this.f194189v.mo137708a();
                                }
                                this.f194140b.f194625dq = this.f194189v.f194295f;
                                this.f194140b.f194626dr = this.f194189v.f194294e;
                                m149415B();
                                m149414A();
                                if (TextUtils.isEmpty(this.f194140b.f194539cJ)) {
                                    m149417D();
                                }
                                if (this.f194131ar > 0) {
                                    this.f194140b.f194481bE = (int) (SystemClock.elapsedRealtime() - this.f194131ar);
                                }
                                C86497x xVar = this.f194187t;
                                if (xVar != null) {
                                    this.f194140b.f194483bG = xVar.f194317f;
                                }
                                if (C86644l.m150123b()) {
                                    this.f194140b.f194491bO = C86644l.m150121a() - System.currentTimeMillis();
                                }
                                m149418E();
                                this.f194140b.f194554cY = C86307af.C86308a.m148612a().mo137130c();
                                if (!this.f194107aT) {
                                    C86631b.m150044a(new RunnableC86483a(this.f194136aw, this.f194140b, this, this.f194170c));
                                } else if (this.f194108aU) {
                                    C86641i.m150110a("VideoEventLoggerV2", "degrade1, vid:" + this.f194170c.f193978ah);
                                    C86449aa.C86451b.f193836a.mo137486a(this.f194170c.f193978ah, this.f194140b);
                                    C86449aa.C86451b.f193836a.mo137487a(this.f194170c.f193978ah, this.f194170c.f194003r);
                                    this.f194108aU = false;
                                } else {
                                    C86641i.m150110a("VideoEventLoggerV2", "degrade2, vid:" + this.f194170c.f193978ah);
                                    C86449aa.C86451b.f193836a.mo137486a(this.f194170c.f193978ah, this.f194140b);
                                    this.f194170c.mo137684e();
                                    this.f194140b = C86449aa.C86451b.f193836a.mo137489c(this.f194170c.f193978ah);
                                    C86631b.m150044a(new RunnableC86483a(this.f194136aw, this.f194140b, this, this.f194170c));
                                    C86449aa.C86451b.f193836a.mo137490d(this.f194170c.f193978ah);
                                }
                                m149428z();
                            }
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: com.ss.ttvideoengine.h.r$a */
                    public static class RunnableC86483a implements Runnable {

                        /* renamed from: a */
                        C86481r f194196a;

                        /* renamed from: b */
                        C86476o f194197b;

                        /* renamed from: c */
                        private C86505z f194198c;

                        /* renamed from: d */
                        private Context f194199d;

                        /* renamed from: e */
                        private Handler f194200e = new Handler(Looper.getMainLooper());

                        static {
                            Covode.recordClassIndex(101711);
                        }

                        public final void run() {
                            JSONObject jSONObject;
                            C86641i.m150110a("VideoEventLoggerV2", "AyncGetLogDataRunnable enter");
                            C86505z zVar = this.f194198c;
                            if (zVar == null) {
                                C86641i.m150117e("VideoEventLoggerV2", "rEvent is null, return.");
                                return;
                            }
                            zVar.f194507be = (int) C86640h.m150088b(this.f194199d);
                            if (TextUtils.isEmpty(this.f194198c.f194444aU)) {
                                this.f194198c.f194444aU = C86383c.C86384a.f193541a.mo137356a();
                            }
                            C86476o oVar = this.f194197b;
                            if (oVar != null) {
                                oVar.mo137683c();
                                this.f194197b.f193972ab = C86476o.m149401d();
                                if (this.f194197b.f193979ai.f194037d == 2) {
                                    this.f194198c.f194555cZ.put("preload", 1);
                                }
                            }
                            C86505z zVar2 = this.f194198c;
                            C86476o oVar2 = this.f194197b;
                            if (oVar2 == null) {
                                jSONObject = null;
                            } else {
                                HashMap hashMap = new HashMap();
                                if (zVar2.f194653w <= 0) {
                                    if (oVar2.f193947D.equals("vid") && zVar2.f194649s <= 0) {
                                        zVar2.f194480bD = -1002;
                                    }
                                    if (zVar2.f194528bz <= 0 && zVar2.f194458ai <= 0 && !oVar2.f193947D.equals("local_url")) {
                                        zVar2.f194480bD = -1004;
                                    } else if (zVar2.f194650t <= 0) {
                                        zVar2.f194480bD = -1003;
                                    } else if (zVar2.f194636f <= 0) {
                                        zVar2.f194480bD = -1006;
                                    } else if (zVar2.f194639i <= 0) {
                                        zVar2.f194480bD = -1007;
                                    } else if (zVar2.f194455af <= 0) {
                                        zVar2.f194480bD = -1008;
                                    } else if (zVar2.f194457ah <= 0) {
                                        zVar2.f194480bD = -1009;
                                    } else if (zVar2.f194637g <= 0) {
                                        zVar2.f194480bD = -1010;
                                    } else if (zVar2.f194638h <= 0) {
                                        zVar2.f194480bD = -1011;
                                    } else if (zVar2.f194640j <= 0) {
                                        zVar2.f194480bD = -1012;
                                    } else if (zVar2.f194531cB == 0 && zVar2.f194647q <= 0) {
                                        zVar2.f194480bD = -1014;
                                    } else if (zVar2.f194646p <= 0) {
                                        zVar2.f194480bD = -1015;
                                    } else if (zVar2.f194641k <= 0) {
                                        zVar2.f194480bD = -1013;
                                    } else if (zVar2.f194531cB != 0 || zVar2.f194473ax > 0) {
                                        if (zVar2.f194475az <= 0) {
                                            zVar2.f194480bD = -1017;
                                        } else if (zVar2.f194531cB == 0 && zVar2.f194461al <= 0) {
                                            zVar2.f194480bD = -1018;
                                        } else if (zVar2.f194462am <= 0) {
                                            zVar2.f194480bD = -1019;
                                        } else if (zVar2.f194531cB == 0 && zVar2.f194463an <= 0) {
                                            zVar2.f194480bD = -1020;
                                        } else if (zVar2.f194464ao <= 0) {
                                            zVar2.f194480bD = -1021;
                                        } else if (zVar2.f194531cB == 0 && zVar2.f194642l <= 0) {
                                            zVar2.f194480bD = -1022;
                                        } else if (zVar2.f194643m <= 0) {
                                            zVar2.f194480bD = -1023;
                                        } else {
                                            zVar2.f194480bD = -1024;
                                        }
                                    } else if (zVar2.f194424aA <= 0) {
                                        zVar2.f194480bD = -1025;
                                    } else {
                                        zVar2.f194480bD = -1016;
                                    }
                                }
                                C86470l.m149395a(hashMap, "player_sessionid", zVar2.f194538cI);
                                C86470l.m149395a(hashMap, "log_type", "video_playq");
                                C86470l.m149395a(hashMap, "sdk_version", oVar2.f193996k);
                                C86470l.m149393a((Map) hashMap, "plugin_exception", zVar2.f194422Z);
                                C86470l.m149395a(hashMap, "sv", oVar2.f193995j);
                                C86470l.m149395a(hashMap, "pv", oVar2.f193993h);
                                C86470l.m149395a(hashMap, "pc", oVar2.f193994i);
                                C86470l.m149395a(hashMap, "ffv", oVar2.f193997l);
                                C86470l.m149395a(hashMap, "vcnv", oVar2.f193998m);
                                C86470l.m149395a(hashMap, "trv", oVar2.f193999n);
                                C86470l.m149395a(hashMap, "prldv", oVar2.f194000o);
                                C86470l.m149395a(hashMap, "abrv", oVar2.f194001p);
                                C86470l.m149395a(hashMap, "prdtv", oVar2.f194002q);
                                C86470l.m149395a(hashMap, "v", oVar2.f193946C);
                                C86470l.m149393a((Map) hashMap, "play_type", oVar2.f193945B);
                                C86470l.m149394a(hashMap, "pt", zVar2.f194648r);
                                C86470l.m149394a(hashMap, "at", zVar2.f194649s);
                                C86470l.m149394a(hashMap, "prepare_start_time", zVar2.f194650t);
                                C86470l.m149394a(hashMap, "prepare_end_time", zVar2.f194651u);
                                C86470l.m149394a(hashMap, "play_preparedt", zVar2.f194497bU);
                                C86470l.m149394a(hashMap, "play_startedt", zVar2.f194498bV);
                                C86470l.m149394a(hashMap, "vt", zVar2.f194653w);
                                C86470l.m149394a(hashMap, "et", zVar2.f194654x);
                                C86470l.m149394a(hashMap, "lt", zVar2.f194655y);
                                C86470l.m149394a(hashMap, "bft", zVar2.f194656z);
                                C86470l.m149393a((Map) hashMap, "bc", zVar2.f194397A);
                                C86470l.m149393a((Map) hashMap, "br", zVar2.f194398B);
                                C86470l.m149396a(hashMap, "vu", zVar2.f194399C);
                                C86470l.m149393a((Map) hashMap, "vd", oVar2.f193951H);
                                C86470l.m149393a((Map) hashMap, "vs", oVar2.f193952I);
                                C86470l.m149393a((Map) hashMap, "vps", zVar2.f194400D);
                                C86470l.m149393a((Map) hashMap, "vds", zVar2.f194401E);
                                C86470l.m149393a((Map) hashMap, "width", zVar2.f194402F);
                                C86470l.m149393a((Map) hashMap, "height", zVar2.f194403G);
                                C86470l.m149393a((Map) hashMap, "async_init", zVar2.f194442aS);
                                C86470l.m149393a((Map) hashMap, "async_codec_id", zVar2.f194512bj);
                                C86470l.m149393a((Map) hashMap, "video_preload_size", zVar2.f194404H);
                                C86470l.m149395a(hashMap, "df", zVar2.f194405I);
                                C86470l.m149395a(hashMap, "lf", zVar2.f194406J);
                                C86470l.m149395a(hashMap, "codec", oVar2.f193953J);
                                C86470l.m149395a(hashMap, "render_type", zVar2.f194503ba);
                                C86470l.m149393a((Map) hashMap, "hijack", zVar2.f194421Y);
                                C86470l.m149393a((Map) hashMap, "hw", oVar2.f193948E);
                                C86470l.m149393a((Map) hashMap, "hw_user", oVar2.f193949F);
                                C86470l.m149393a((Map) hashMap, "hw_err_reason", zVar2.f194577cv);
                                C86470l.m149393a((Map) hashMap, "audio_hw_user", oVar2.f193950G);
                                C86470l.m149394a(hashMap, "dns_t", zVar2.f194454ae);
                                C86470l.m149394a(hashMap, "tran_ct", zVar2.f194455af);
                                C86470l.m149394a(hashMap, "tran_ft", zVar2.f194457ah);
                                C86470l.m149394a(hashMap, "a_dns_t", zVar2.f194458ai);
                                C86470l.m149394a(hashMap, "a_tran_ct", zVar2.f194459aj);
                                C86470l.m149394a(hashMap, "a_tran_ft", zVar2.f194460ak);
                                C86470l.m149394a(hashMap, "re_f_videoframet", zVar2.f194461al);
                                C86470l.m149394a(hashMap, "de_f_videoframet", zVar2.f194463an);
                                C86470l.m149394a(hashMap, "re_f_audioframet", zVar2.f194462am);
                                C86470l.m149394a(hashMap, "de_f_audioframet", zVar2.f194464ao);
                                C86470l.m149394a(hashMap, "bu_acu_t", zVar2.f194445aV);
                                C86470l.m149394a(hashMap, "de_bu_acu_t", zVar2.f194446aW);
                                C86470l.m149395a(hashMap, "internal_ip", zVar2.f194429aF);
                                C86470l.m149395a(hashMap, "tag", oVar2.f193963T);
                                C86470l.m149395a(hashMap, "subtag", oVar2.f193964U);
                                C86470l.m149395a(hashMap, "ex", C86505z.m149613a(zVar2.f194453ad));
                                C86470l.m149396a(hashMap, "mdlretry", zVar2.f194605dW);
                                C86470l.m149394a(hashMap, "first_buf_startt", zVar2.f194465ap);
                                C86470l.m149394a(hashMap, "first_buf_endt", zVar2.f194466aq);
                                C86470l.m149394a(hashMap, "cur_play_pos", zVar2.f194467ar);
                                C86470l.m149393a((Map) hashMap, "engine_state", zVar2.f194427aD);
                                C86470l.m149392a((Map) hashMap, "video_out_fps", zVar2.f194468as);
                                C86470l.m149392a((Map) hashMap, "container_fps", zVar2.f194469at);
                                C86470l.m149393a((Map) hashMap, "video_decoder_fps", zVar2.f194517bo);
                                C86470l.m149394a(hashMap, "clock_diff", zVar2.f194470au);
                                C86470l.m149393a((Map) hashMap, "drop_count", zVar2.f194471av);
                                C86470l.m149394a(hashMap, "video_device_opened_t", zVar2.f194473ax);
                                C86470l.m149394a(hashMap, "audio_device_opened_t", zVar2.f194475az);
                                C86470l.m149393a((Map) hashMap, "finish", zVar2.f194428aE);
                                C86470l.m149393a((Map) hashMap, "is_start_play_automatically", zVar2.f194451ab);
                                C86470l.m149395a(hashMap, "player_create_exception", zVar2.f194450aa);
                                C86470l.m149395a(hashMap, "custom_str", zVar2.f194414R);
                                C86470l.m149395a(hashMap, "initial_url", zVar2.f194415S);
                                C86470l.m149395a(hashMap, "init_audio_url", zVar2.f194416T);
                                C86470l.m149395a(hashMap, "initial_host", zVar2.f194417U);
                                C86470l.m149395a(hashMap, "initial_ip", zVar2.f194418V);
                                C86470l.m149395a(hashMap, "initial_resolution", zVar2.f194419W);
                                C86470l.m149395a(hashMap, "initial_quality", zVar2.f194420X);
                                C86470l.m149393a((Map) hashMap, "apiver", zVar2.f194431aH);
                                C86470l.m149395a(hashMap, "auth", zVar2.f194433aJ);
                                C86470l.m149393a((Map) hashMap, "apiver_final", zVar2.f194432aI);
                                C86470l.m149395a(hashMap, "playparam", C86505z.m149613a(zVar2.f194434aK));
                                C86470l.m149395a(hashMap, "vtype", oVar2.f193957N);
                                C86470l.m149395a(hashMap, "dynamic_type", oVar2.f193958O);
                                C86470l.m149393a((Map) hashMap, "lc", zVar2.f194435aL);
                                C86470l.m149393a((Map) hashMap, "switch_resolution_c", zVar2.f194436aM);
                                C86470l.m149393a((Map) hashMap, "watch_dur", zVar2.f194437aN);
                                C86470l.m149393a((Map) hashMap, "sc", zVar2.f194449aZ);
                                C86470l.m149393a((Map) hashMap, "vid_cache", zVar2.f194438aO);
                                C86470l.m149393a((Map) hashMap, "custom_p2p_cdn_type", zVar2.f194441aR);
                                C86470l.m149395a(hashMap, "p2p_load_info", zVar2.f194444aU);
                                C86470l.m149393a((Map) hashMap, "start_time", zVar2.f194439aP);
                                C86470l.m149393a((Map) hashMap, "disable_accurate_start", zVar2.f194440aQ);
                                C86470l.m149393a((Map) hashMap, "audio_codec_nameId", oVar2.f193954K);
                                C86470l.m149393a((Map) hashMap, "video_codec_nameId", oVar2.f193955L);
                                C86470l.m149393a((Map) hashMap, "format_type", oVar2.f193956M);
                                C86470l.m149394a(hashMap, "surface_set_time", zVar2.f194424aA);
                                C86470l.m149395a(hashMap, "surface_code", zVar2.f194425aB);
                                C86470l.m149393a((Map) hashMap, "frames_drop_set_num", zVar2.f194426aC);
                                C86470l.m149394a(hashMap, "video_device_start_t", zVar2.f194472aw);
                                C86470l.m149394a(hashMap, "audio_device_start_t", zVar2.f194474ay);
                                C86470l.m149393a((Map) hashMap, "video_length", zVar2.f194447aX);
                                C86470l.m149393a((Map) hashMap, "audio_length", zVar2.f194448aY);
                                C86470l.m149395a(hashMap, "api_str", zVar2.f194504bb);
                                C86470l.m149395a(hashMap, "net_client", zVar2.f194505bc);
                                C86470l.m149393a((Map) hashMap, "fetch_lv", zVar2.f194506bd);
                                C86470l.m149393a((Map) hashMap, "volume", zVar2.f194507be);
                                C86470l.m149393a((Map) hashMap, "core_volume", zVar2.f194508bf);
                                C86470l.m149393a((Map) hashMap, "ae_type", zVar2.f194516bn);
                                C86470l.m149393a((Map) hashMap, "mute", zVar2.f194509bg);
                                C86470l.m149395a(hashMap, "source_type", oVar2.f193947D);
                                C86470l.m149393a((Map) hashMap, "sharp", zVar2.f194513bk);
                                C86470l.m149395a(hashMap, "dns_server_ip", zVar2.f194514bl);
                                C86470l.m149395a(hashMap, "abr_info", C86505z.m149613a(oVar2.f193982al));
                                C86470l.m149395a(hashMap, "abr_general_info", C86505z.m149613a(oVar2.f193987aq));
                                C86470l.m149395a(hashMap, "enc_key", zVar2.f194515bm);
                                C86470l.m149395a(hashMap, "hw_codec_name", zVar2.f194518bp);
                                C86470l.m149393a((Map) hashMap, "hw_codec_exception", zVar2.f194519bq);
                                C86470l.m149393a((Map) hashMap, "enable_bash", zVar2.f194510bh);
                                C86470l.m149393a((Map) hashMap, "enable_mdl", zVar2.f194511bi);
                                C86470l.m149393a((Map) hashMap, "network_try_count", zVar2.f194520br);
                                C86470l.m149395a(hashMap, "chipboard", zVar2.f194521bs);
                                C86470l.m149395a(hashMap, "chiphardware", zVar2.f194522bt);
                                C86470l.m149393a((Map) hashMap, "buffer_timeout", zVar2.f194523bu);
                                C86470l.m149394a(hashMap, "dns_start_t", zVar2.f194527by);
                                C86470l.m149394a(hashMap, "dns_end_t", zVar2.f194528bz);
                                C86470l.m149395a(hashMap, "dns_type", oVar2.f194010y);
                                C86470l.m149394a(hashMap, "player_created_t", zVar2.f194477bA);
                                C86470l.m149393a((Map) hashMap, "errt", zVar2.f194407K);
                                C86470l.m149393a((Map) hashMap, "errc", zVar2.f194408L);
                                C86470l.m149393a((Map) hashMap, "fir_errt", zVar2.f194409M);
                                C86470l.m149393a((Map) hashMap, "fir_errc", zVar2.f194410N);
                                C86470l.m149393a((Map) hashMap, "fir_errc_in", zVar2.f194411O);
                                C86470l.m149393a((Map) hashMap, "vsc", zVar2.f194412P);
                                C86470l.m149395a(hashMap, "vsc_message", zVar2.f194413Q);
                                C86470l.m149395a(hashMap, "sub_events", C86505z.m149613a(zVar2.f194478bB));
                                C86470l.m149395a(hashMap, "mask_events", C86505z.m149613a(zVar2.f194479bC));
                                C86470l.m149393a((Map) hashMap, "lv_reason", zVar2.f194480bD);
                                C86470l.m149393a((Map) hashMap, "lv_bt", zVar2.f194481bE);
                                C86470l.m149393a((Map) hashMap, "lv_method", zVar2.f194482bF);
                                C86470l.m149393a((Map) hashMap, "sat", zVar2.f194483bG);
                                C86470l.m149394a(hashMap, "lsst", zVar2.f194484bH);
                                C86470l.m149394a(hashMap, "lset", zVar2.f194485bI);
                                C86470l.m149394a(hashMap, "lbst", zVar2.f194486bJ);
                                C86470l.m149394a(hashMap, "lbet", zVar2.f194487bK);
                                C86470l.m149393a((Map) hashMap, "lsp", zVar2.f194490bN);
                                C86470l.m149394a(hashMap, "sl_diff", zVar2.f194491bO);
                                C86470l.m149395a(hashMap, "trace_id", zVar2.f194492bP);
                                C86470l.m149393a((Map) hashMap, "network_timeout", zVar2.f194524bv);
                                C86470l.m149393a((Map) hashMap, "is_pref_near_sam", zVar2.f194525bw);
                                C86470l.m149393a((Map) hashMap, "is_disable_short_seek", zVar2.f194526bx);
                                C86470l.m149393a((Map) hashMap, "drm_type", oVar2.f193966W);
                                C86470l.m149395a(hashMap, "drm_token_url", oVar2.f193967X);
                                C86470l.m149393a((Map) hashMap, "check_hijack", zVar2.f194493bQ);
                                C86470l.m149393a((Map) hashMap, "hijack_retry", zVar2.f194494bR);
                                C86470l.m149393a((Map) hashMap, "first_hijack_code", zVar2.f194495bS);
                                C86470l.m149393a((Map) hashMap, "last_hijack_code", zVar2.f194496bT);
                                C86470l.m149395a(hashMap, "mdl_loader_type", zVar2.f194430aG);
                                C86470l.m149395a(hashMap, "mdl_version", oVar2.f193974ad);
                                C86470l.m149393a((Map) hashMap, "dns_mod", zVar2.f194502bZ);
                                C86470l.m149393a((Map) hashMap, "vd_err", zVar2.f194499bW);
                                C86470l.m149393a((Map) hashMap, "ad_err", zVar2.f194500bX);
                                C86470l.m149393a((Map) hashMap, "vr_err", zVar2.f194501bY);
                                C86470l.m149395a(hashMap, "nt", oVar2.f193972ab);
                                C86470l.m149394a(hashMap, "vpls", zVar2.f194556ca);
                                C86470l.m149394a(hashMap, "d_apls", zVar2.f194558cc);
                                C86470l.m149394a(hashMap, "d_vpls", zVar2.f194557cb);
                                C86470l.m149392a((Map) hashMap, "vt_speed", (float) zVar2.f194559cd);
                                C86470l.m149392a((Map) hashMap, "end_speed", (float) zVar2.f194560ce);
                                C86470l.m149393a((Map) hashMap, "mediacodec_render", zVar2.f194561cf);
                                C86470l.m149393a((Map) hashMap, "tr", zVar2.f194562cg);
                                C86470l.m149393a((Map) hashMap, "tr_err", zVar2.f194564ci);
                                C86470l.m149393a((Map) hashMap, "cp", zVar2.f194565cj);
                                C86470l.m149394a(hashMap, "bit_rate", zVar2.f194568cm);
                                C86470l.m149394a(hashMap, "audio_bitrate", zVar2.f194569cn);
                                C86470l.m149393a((Map) hashMap, "cold_start", zVar2.f194570co);
                                C86470l.m149394a(hashMap, "av_gap", zVar2.f194571cp);
                                C86470l.m149394a(hashMap, "moov_pos", zVar2.f194572cq);
                                C86470l.m149394a(hashMap, "mdat_pos", zVar2.f194573cr);
                                C86470l.m149394a(hashMap, "frange_size", zVar2.f194574cs);
                                C86470l.m149394a(hashMap, "net_speed_level", zVar2.f194575ct);
                                C86470l.m149394a(hashMap, "video_model_version", zVar2.f194576cu);
                                C86470l.m149393a((Map) hashMap, "p2p_play_num", zVar2.f194580cy);
                                C86470l.m149393a((Map) hashMap, "p2p_min_play_num", zVar2.f194579cx);
                                C86470l.m149393a((Map) hashMap, "p2p_min_speed", zVar2.f194581cz);
                                C86470l.m149393a((Map) hashMap, "p2p_probe_speed", zVar2.f194530cA);
                                C86470l.m149394a(hashMap, "prepare_before_play_t", zVar2.f194423a);
                                C86470l.m149394a(hashMap, "setds_t", zVar2.f194476b);
                                C86470l.m149394a(hashMap, "ps_t", zVar2.f194529c);
                                C86470l.m149394a(hashMap, "pt_new", zVar2.f194582d);
                                C86470l.m149394a(hashMap, "a_dns_start_t", zVar2.f194635e);
                                C86470l.m149394a(hashMap, "formater_create_t", zVar2.f194636f);
                                C86470l.m149394a(hashMap, "avformat_open_t", zVar2.f194637g);
                                C86470l.m149394a(hashMap, "demuxer_begin_t", zVar2.f194639i);
                                C86470l.m149394a(hashMap, "demuxer_create_t", zVar2.f194638h);
                                C86470l.m149394a(hashMap, "dec_create_t", zVar2.f194640j);
                                C86470l.m149394a(hashMap, "outlet_create_t", zVar2.f194641k);
                                C86470l.m149394a(hashMap, "v_render_f_t", zVar2.f194642l);
                                C86470l.m149394a(hashMap, "a_render_f_t", zVar2.f194643m);
                                C86470l.m149394a(hashMap, "a_dec_start_t", zVar2.f194644n);
                                C86470l.m149394a(hashMap, "v_dec_start_t", zVar2.f194645o);
                                C86470l.m149394a(hashMap, "a_dec_opened_t", zVar2.f194646p);
                                C86470l.m149394a(hashMap, "v_dec_opened_t", zVar2.f194647q);
                                C86470l.m149393a((Map) hashMap, "radio_mode", zVar2.f194531cB);
                                C86470l.m149393a((Map) hashMap, "v_disabled", zVar2.f194532cC ? 1 : 0);
                                C86470l.m149393a((Map) hashMap, "a_disabled", zVar2.f194533cD ? 1 : 0);
                                C86470l.m149393a((Map) hashMap, "is_replay", zVar2.f194534cE);
                                C86470l.m149395a(hashMap, "play_log_id", zVar2.f194539cJ);
                                C86470l.m149393a((Map) hashMap, "enable_nnsr", zVar2.f194535cF);
                                C86470l.m149393a((Map) hashMap, "at_r", zVar2.f194537cH);
                                C86470l.m149393a((Map) hashMap, "at_rs", zVar2.f194536cG);
                                C86470l.m149393a((Map) hashMap, "video_codec_profile", zVar2.f194541cL);
                                C86470l.m149393a((Map) hashMap, "audio_codec_profile", zVar2.f194542cM);
                                C86470l.m149395a(hashMap, "last_sessionid", zVar2.f194540cK);
                                C86470l.m149395a(hashMap, "nettype_list", C86505z.m149613a(zVar2.f194545cP));
                                C86470l.m149395a(hashMap, "sigstrength_list", C86505z.m149613a(zVar2.f194546cQ));
                                C86470l.m149396a(hashMap, "netspeed_list", zVar2.f194547cR);
                                C86470l.m149395a(hashMap, "quality_list", C86505z.m149613a(zVar2.f194548cS));
                                C86470l.m149395a(hashMap, "bitrate_list", C86505z.m149613a(zVar2.f194549cT));
                                C86470l.m149396a(hashMap, "catowerrtt_list", zVar2.f194550cU);
                                C86470l.m149396a(hashMap, "catowerrttms_list", zVar2.f194551cV);
                                C86470l.m149393a((Map) hashMap, "netquality_int", zVar2.f194552cW);
                                C86470l.m149395a(hashMap, "features", C86505z.m149613a(zVar2.f194555cZ));
                                C86470l.m149393a((Map) hashMap, "network_score", zVar2.f194554cY);
                                C86470l.m149394a(hashMap, "before_play_buffer_start_t", zVar2.f194566ck);
                                C86470l.m149394a(hashMap, "before_play_buffer_end_t", zVar2.f194567cl);
                                C86470l.m149394a(hashMap, "cur_req_pos", oVar2.f193979ai.f194034a);
                                C86470l.m149394a(hashMap, "cur_end_pos", oVar2.f193979ai.f194035b);
                                C86470l.m149394a(hashMap, "cur_cache_pos", oVar2.f193979ai.f194036c);
                                C86470l.m149393a((Map) hashMap, "cache_type", oVar2.f193979ai.f194037d);
                                C86470l.m149395a(hashMap, "cur_ip", oVar2.f193979ai.f194038e);
                                C86470l.m149395a(hashMap, "cur_host", oVar2.f193979ai.f194039f);
                                C86470l.m149395a(hashMap, "cur_url", oVar2.f193979ai.f194040g);
                                C86470l.m149394a(hashMap, "reply_size", oVar2.f193979ai.f194041h);
                                C86470l.m149394a(hashMap, "down_pos", oVar2.f193979ai.f194042i);
                                C86470l.m149394a(hashMap, "player_wait_time", oVar2.f193979ai.f194043j);
                                C86470l.m149393a((Map) hashMap, "player_wait_num", oVar2.f193979ai.f194044k);
                                C86470l.m149393a((Map) hashMap, "mdl_speed", oVar2.f193979ai.f194047n);
                                C86470l.m149395a(hashMap, "mdl_file_key", oVar2.f193979ai.f194048o);
                                C86470l.m149393a((Map) hashMap, "mdl_is_socrf", oVar2.f193979ai.f194049p);
                                C86470l.m149393a((Map) hashMap, "mdl_req_num", oVar2.f193979ai.f194029Q);
                                C86470l.m149393a((Map) hashMap, "mdl_url_index", oVar2.f193979ai.f194050q);
                                C86470l.m149395a(hashMap, "mdl_re_url", oVar2.f193979ai.f194051r);
                                C86470l.m149393a((Map) hashMap, "mdl_cur_source", oVar2.f193979ai.f194052s);
                                C86470l.m149395a(hashMap, "mdl_extra_info", oVar2.f193979ai.f194053t);
                                C86470l.m149393a((Map) hashMap, "mdl_ec", oVar2.f193979ai.f194046m);
                                C86470l.m149394a(hashMap, "mdl_fs", oVar2.f193979ai.f194016D);
                                C86470l.m149393a((Map) hashMap, "mdl_stage", oVar2.f193979ai.f194045l);
                                C86470l.m149394a(hashMap, "req_t", oVar2.f193979ai.f194055v);
                                C86470l.m149394a(hashMap, "end_t", oVar2.f193979ai.f194056w);
                                C86470l.m149394a(hashMap, "mdl_dns_t", oVar2.f193979ai.f194057x);
                                C86470l.m149394a(hashMap, "tcp_con_start_t", oVar2.f193979ai.f194058y);
                                C86470l.m149394a(hashMap, "tcp_con_t", oVar2.f193979ai.f194059z);
                                C86470l.m149394a(hashMap, "tcp_first_pack_t", oVar2.f193979ai.f194013A);
                                C86470l.m149394a(hashMap, "http_first_body_t", oVar2.f193979ai.f194014B);
                                C86470l.m149394a(hashMap, "http_open_end_t", oVar2.f193979ai.f194015C);
                                C86470l.m149393a((Map) hashMap, "http_code", oVar2.f193979ai.f194054u);
                                C86470l.m149393a((Map) hashMap, "mdl_p2p_sp", oVar2.f193979ai.f194017E);
                                C86470l.m149393a((Map) hashMap, "mdl_res_err", oVar2.f193979ai.f194020H);
                                C86470l.m149393a((Map) hashMap, "mdl_read_src", oVar2.f193979ai.f194021I);
                                C86470l.m149393a((Map) hashMap, "mdl_seek_num", oVar2.f193979ai.f194022J);
                                C86470l.m149395a(hashMap, "mdl_last_msg", oVar2.f193979ai.f194023K);
                                C86470l.m149395a(hashMap, "mdl_server_timing", oVar2.f193979ai.f194024L);
                                C86470l.m149393a((Map) hashMap, "mdl_v_lt", oVar2.f193979ai.f194025M);
                                C86470l.m149393a((Map) hashMap, "mdl_v_p2p_ier", oVar2.f193979ai.f194026N);
                                C86470l.m149395a(hashMap, "mdl_ip_list", oVar2.f193979ai.f194027O);
                                C86470l.m149395a(hashMap, "mdl_blocked_ips", oVar2.f193979ai.f194028P);
                                C86470l.m149395a(hashMap, "mdl_response_cache", oVar2.f193979ai.f194030R);
                                C86470l.m149395a(hashMap, "mdl_response_cinfo", oVar2.f193979ai.f194031S);
                                C86470l.m149393a((Map) hashMap, "mdl_disable_seek", oVar2.f193979ai.f194032T);
                                C86470l.m149394a(hashMap, "a_cur_req_pos", oVar2.f193980aj.f194034a);
                                C86470l.m149394a(hashMap, "a_cur_end_pos", oVar2.f193980aj.f194035b);
                                C86470l.m149394a(hashMap, "a_cur_cache_pos", oVar2.f193980aj.f194036c);
                                C86470l.m149393a((Map) hashMap, "a_cache_type", oVar2.f193980aj.f194037d);
                                C86470l.m149395a(hashMap, "a_cur_ip", oVar2.f193980aj.f194038e);
                                C86470l.m149395a(hashMap, "a_cur_host", oVar2.f193980aj.f194039f);
                                C86470l.m149395a(hashMap, "a_cur_url", oVar2.f193980aj.f194040g);
                                C86470l.m149394a(hashMap, "a_reply_size", oVar2.f193980aj.f194041h);
                                C86470l.m149394a(hashMap, "a_down_pos", oVar2.f193980aj.f194042i);
                                C86470l.m149394a(hashMap, "a_player_wait_time", oVar2.f193980aj.f194043j);
                                C86470l.m149393a((Map) hashMap, "a_player_wait_num", oVar2.f193980aj.f194044k);
                                C86470l.m149393a((Map) hashMap, "a_mdl_speed", oVar2.f193980aj.f194047n);
                                C86470l.m149395a(hashMap, "a_mdl_file_key", oVar2.f193980aj.f194048o);
                                C86470l.m149393a((Map) hashMap, "a_mdl_is_socrf", oVar2.f193980aj.f194049p);
                                C86470l.m149393a((Map) hashMap, "a_mdl_req_num", oVar2.f193980aj.f194029Q);
                                C86470l.m149393a((Map) hashMap, "a_mdl_url_index", oVar2.f193980aj.f194050q);
                                C86470l.m149395a(hashMap, "a_mdl_re_url", oVar2.f193980aj.f194051r);
                                C86470l.m149393a((Map) hashMap, "a_mdl_cur_source", oVar2.f193980aj.f194052s);
                                C86470l.m149395a(hashMap, "a_mdl_extra_info", oVar2.f193980aj.f194053t);
                                C86470l.m149393a((Map) hashMap, "a_mdl_ec", oVar2.f193980aj.f194046m);
                                C86470l.m149394a(hashMap, "a_mdl_fs", oVar2.f193980aj.f194016D);
                                C86470l.m149393a((Map) hashMap, "a_mdl_stage", oVar2.f193980aj.f194045l);
                                C86470l.m149394a(hashMap, "a_req_t", oVar2.f193980aj.f194055v);
                                C86470l.m149394a(hashMap, "a_end_t", oVar2.f193980aj.f194056w);
                                C86470l.m149394a(hashMap, "a_mdl_dns_t", oVar2.f193980aj.f194057x);
                                C86470l.m149394a(hashMap, "a_tcp_con_start_t", oVar2.f193980aj.f194058y);
                                C86470l.m149394a(hashMap, "a_tcp_con_t", oVar2.f193980aj.f194059z);
                                C86470l.m149394a(hashMap, "a_tcp_first_pack_t", oVar2.f193980aj.f194013A);
                                C86470l.m149394a(hashMap, "a_http_first_body_t", oVar2.f193980aj.f194014B);
                                C86470l.m149394a(hashMap, "a_http_open_end_t", oVar2.f193980aj.f194015C);
                                C86470l.m149393a((Map) hashMap, "a_http_code", oVar2.f193980aj.f194054u);
                                C86470l.m149393a((Map) hashMap, "a_mdl_res_err", oVar2.f193980aj.f194020H);
                                C86470l.m149393a((Map) hashMap, "a_mdl_read_src", oVar2.f193980aj.f194021I);
                                C86470l.m149393a((Map) hashMap, "a_mdl_seek_num", oVar2.f193980aj.f194022J);
                                C86470l.m149395a(hashMap, "a_mdl_last_msg", oVar2.f193980aj.f194023K);
                                C86470l.m149395a(hashMap, "a_mdl_server_timing", oVar2.f193980aj.f194024L);
                                C86470l.m149395a(hashMap, "a_mdl_ip_list", oVar2.f193980aj.f194027O);
                                C86470l.m149395a(hashMap, "a_mdl_blocked_ips", oVar2.f193980aj.f194028P);
                                C86470l.m149395a(hashMap, "a_mdl_response_cache", oVar2.f193980aj.f194030R);
                                C86470l.m149395a(hashMap, "a_mdl_response_cinfo", oVar2.f193980aj.f194031S);
                                C86470l.m149394a(hashMap, "custom_click_t", zVar2.f194609da);
                                C86470l.m149394a(hashMap, "custom_vm_t", zVar2.f194610db);
                                C86470l.m149394a(hashMap, "custom_init_t", zVar2.f194612dd);
                                C86470l.m149394a(hashMap, "custom_play_t", zVar2.f194613de);
                                C86470l.m149393a((Map) hashMap, "screen_w", zVar2.f194595dM);
                                C86470l.m149393a((Map) hashMap, "screen_h", zVar2.f194596dN);
                                C86470l.m149393a((Map) hashMap, "p_density", zVar2.f194597dO);
                                C86470l.m149392a((Map) hashMap, "xdpi", zVar2.f194598dP);
                                C86470l.m149392a((Map) hashMap, "ydpi", zVar2.f194599dQ);
                                C86470l.m149392a((Map) hashMap, "sr_w", zVar2.f194600dR);
                                C86470l.m149392a((Map) hashMap, "sr_h", zVar2.f194601dS);
                                C86470l.m149396a(hashMap, "eye_filter", zVar2.f194602dT);
                                C86470l.m149396a(hashMap, "bright_list", zVar2.f194603dU);
                                C86470l.m149396a(hashMap, "view_size_list", zVar2.f194604dV);
                                C86470l.m149396a(hashMap, "play_list", zVar2.f194614df);
                                C86470l.m149396a(hashMap, "pause_list", zVar2.f194615dg);
                                C86470l.m149396a(hashMap, "resolution_list", zVar2.f194616dh);
                                C86470l.m149396a(hashMap, "playspeed_list", zVar2.f194617di);
                                C86470l.m149396a(hashMap, "radiomode_list", zVar2.f194618dj);
                                C86470l.m149396a(hashMap, "loop_list", zVar2.f194619dk);
                                C86470l.m149396a(hashMap, "error_list", zVar2.f194620dl);
                                C86470l.m149396a(hashMap, "rebuf_list", zVar2.f194621dm);
                                C86470l.m149396a(hashMap, "seek_list", zVar2.f194622dn);
                                C86470l.m149396a(hashMap, "av_outsync_list", zVar2.f194623do);
                                C86470l.m149393a((Map) hashMap, "av_outsync_count", zVar2.f194630dv);
                                C86470l.m149393a((Map) hashMap, "color_trc", zVar2.f194593dK);
                                C86470l.m149396a(hashMap, "headset_list", zVar2.f194624dp);
                                C86470l.m149393a((Map) hashMap, "hw_conf_type", zVar2.f194594dL);
                                C86470l.m149396a(hashMap, "no_a_list", zVar2.f194626dr);
                                C86470l.m149396a(hashMap, "no_v_list", zVar2.f194625dq);
                                C86470l.m149393a((Map) hashMap, "is_reuse_engine", zVar2.f194606dX ? 1 : 0);
                                C86470l.m149394a(hashMap, "v_duration", zVar2.f194543cN);
                                C86470l.m149394a(hashMap, "a_duration", zVar2.f194544cO);
                                C86470l.m149393a((Map) hashMap, "view_hidden", zVar2.f194607dY);
                                C86470l.m149396a(hashMap, "power", zVar2.f194627ds);
                                C86470l.m149396a(hashMap, "is_charging", zVar2.f194628dt);
                                C86470l.m149396a(hashMap, "foreback_switch_list", zVar2.f194629du);
                                C86470l.m149395a(hashMap, "r_stage_errcs", zVar2.f194608dZ);
                                C86617e eVar = C86617e.C86621c.f195187a;
                                Map<String, Object> a = eVar.f195180q.mo137873a(oVar2.f193946C);
                                if (a != null) {
                                    hashMap.putAll(a);
                                }
                                C86641i.m150110a("VideoEventOnePlay", "play_time:" + zVar2.f194648r + ", pt_new:" + zVar2.f194582d + ",ps_t:" + zVar2.f194529c + ", vv_time:" + zVar2.f194653w + ", lwp_time:" + zVar2.f194655y + ", outsync count:" + zVar2.f194630dv + ", outsync list:" + zVar2.f194623do + ", vs:" + oVar2.f193952I + ", vtype:" + oVar2.f193957N + ", cur_url:" + oVar2.f193979ai.f194040g + ", features:" + zVar2.f194555cZ + ", exception:" + zVar2.f194450aa);
                                C86641i.m150113b("VideoEventOnePlay", "no_a_list: " + zVar2.f194626dr + ", no_v_list: " + zVar2.f194625dq);
                                jSONObject = new JSONObject(hashMap);
                            }
                            boolean z = this.f194197b.f193989as;
                            Handler handler = this.f194200e;
                            if (handler == null || handler.getLooper() == null) {
                                C86641i.m150110a("VideoEventLoggerV2", "report in child thread");
                                EnumC86487t.instance.mo137691a(z, jSONObject);
                                return;
                            }
                            C86641i.m150110a("VideoEventLoggerV2", "report in main looper");
                            this.f194200e.post(new RunnableC86486s(z, jSONObject));
                        }

                        /* renamed from: a */
                        static final /* synthetic */ void m149590a(boolean z, JSONObject jSONObject) {
                            EnumC86487t.instance.mo137691a(z, jSONObject);
                        }

                        public RunnableC86483a(Context context, C86505z zVar, C86481r rVar, C86476o oVar) {
                            this.f194198c = zVar;
                            this.f194199d = context;
                            this.f194196a = rVar;
                            this.f194197b = oVar;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137548a(Bundle bundle) {
                        C86456ac acVar = this.f194145ba;
                        if (bundle == null) {
                            return;
                        }
                        if (bundle.getInt("effect_type") != 2) {
                            C86641i.m150113b("VideoFilterMonitor", "not eye protection filter bundle");
                            return;
                        }
                        int i = bundle.getInt("action");
                        boolean z = false;
                        if (bundle.getInt("effect_type") == 2 && (i != 21 ? i == 19 && bundle.getInt("int_value") == 1 : bundle.getInt("use_effect") == 1)) {
                            z = true;
                        }
                        if (z != acVar.f193894a) {
                            acVar.f193894a = z;
                            HashMap hashMap = new HashMap();
                            hashMap.put("on", z ? "1" : "0");
                            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                            acVar.f193895b.add(new JSONObject(hashMap).toString());
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137558a(String str, Object obj) {
                        if (!TextUtils.isEmpty(str) && obj != null) {
                            this.f194147bc.put(str, obj);
                            C86641i.m150113b("VideoEventLoggerV2", "addFeature, key:" + str + ", value:" + obj);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137535a() {
                        this.f194104aQ = true;
                        this.f194170c.f193989as = true;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137565b() {
                        this.f194149bf++;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: t */
                    public final String mo137654t() {
                        try {
                            return this.f194170c.f193947D;
                        } catch (Throwable unused) {
                            return "";
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: i */
                    public final int mo137610i() {
                        C86489u uVar = this.f194186s;
                        if (uVar != null) {
                            return uVar.f194244c.f194268e;
                        }
                        return -1;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: m */
                    public final void mo137626m() {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194428aE = 1;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: o */
                    public final String mo137634o() {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            return zVar.f194492bP;
                        }
                        return null;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: w */
                    public final AbstractC86508b mo137663w() {
                        C86505z zVar = this.f194140b;
                        C86507a aVar = new C86507a(0);
                        aVar.mo137722a(zVar);
                        return aVar;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: y */
                    public final void mo137669y() {
                        if (this.f194088a != null) {
                            this.f194088a.mo137289a(2, m149423J());
                        }
                    }

                    static {
                        Covode.recordClassIndex(101709);
                    }

                    /* renamed from: H */
                    private int m149421H() {
                        if (C86366b.f193483i <= 0) {
                            C86366b.f193483i = C86637f.m150067a(this.f194136aw).y;
                        }
                        return C86366b.f193483i;
                    }

                    /* renamed from: I */
                    private int m149422I() {
                        if (C86366b.f193482h <= 0) {
                            C86366b.f193482h = C86637f.m150067a(this.f194136aw).x;
                        }
                        return C86366b.f193482h;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: c */
                    public final void mo137580c() {
                        if (this.f194140b.f194653w <= 0) {
                            this.f194140b.f194650t = System.currentTimeMillis();
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: d */
                    public final void mo137589d() {
                        if (this.f194140b.f194653w <= 0) {
                            this.f194140b.f194651u = System.currentTimeMillis();
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: h */
                    public final void mo137606h() {
                        if (this.f194132as > 0) {
                            this.f194132as = 0;
                            C86505z zVar = this.f194140b;
                            if (zVar != null) {
                                zVar.f194485bI = System.currentTimeMillis();
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: n */
                    public final void mo137630n() {
                        this.f194082U++;
                        this.f194166bw.add(String.valueOf(System.currentTimeMillis()));
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: u */
                    public final void mo137657u() {
                        if (this.f194140b.f194566ck <= 0) {
                            this.f194140b.f194566ck = System.currentTimeMillis();
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: v */
                    public final void mo137660v() {
                        if (this.f194140b.f194567cl <= 0) {
                            this.f194140b.f194567cl = System.currentTimeMillis();
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: x */
                    public final long mo137666x() {
                        C86505z zVar = this.f194140b;
                        if (zVar == null || zVar.f194582d <= 0 || this.f194140b.f194655y <= 0) {
                            return 0;
                        }
                        return this.f194140b.f194655y - this.f194140b.f194582d;
                    }

                    /* renamed from: C */
                    private void m149416C() {
                        Map<String, Long> b;
                        AbstractC86462f fVar = this.f194088a;
                        if (fVar != null && (b = fVar.mo137291b()) != null) {
                            int intValue = b.get("vps").intValue();
                            int intValue2 = b.get("vds").intValue();
                            this.f194133at += intValue;
                            this.f194134au += intValue2;
                        }
                    }

                    /* renamed from: A */
                    private void m149414A() {
                        if (this.f194140b != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("sub_langs_c", Integer.valueOf(this.f194150bg));
                            hashMap.put("sub_req_fin_ts", Long.valueOf(this.f194140b.f194631dw));
                            hashMap.put("sub_load_fin_ts", Long.valueOf(this.f194140b.f194632dx));
                            hashMap.put("sub_switch_c", Integer.valueOf(this.f194149bf));
                            hashMap.put("sub_error", this.f194158bo);
                            hashMap.put("sub_req_url", this.f194156bm);
                            hashMap.put("sub_enable", Integer.valueOf(this.f194151bh));
                            hashMap.put("sub_enable_opt_load", Integer.valueOf(this.f194152bi));
                            hashMap.put("sub_thread_enable", Integer.valueOf(this.f194153bj));
                            this.f194140b.f194478bB = hashMap;
                        }
                    }

                    /* renamed from: B */
                    private void m149415B() {
                        if (this.f194140b != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("mask_open_ts", Long.valueOf(this.f194140b.f194633dy));
                            hashMap.put("mask_opened_ts", Long.valueOf(this.f194140b.f194634dz));
                            hashMap.put("mask_errc", Integer.valueOf(this.f194159bp));
                            hashMap.put("mask_enable", Integer.valueOf(this.f194154bk));
                            hashMap.put("mask_thread_enable", Integer.valueOf(this.f194155bl));
                            hashMap.put("mask_url", this.f194157bn);
                            this.f194140b.f194479bC = hashMap;
                        }
                    }

                    /* renamed from: D */
                    private void m149417D() {
                        String str;
                        String substring;
                        if (!TextUtils.isEmpty(this.f194072K)) {
                            str = this.f194072K;
                        } else if (!TextUtils.isEmpty(this.f194078Q)) {
                            str = this.f194078Q;
                        } else if (!TextUtils.isEmpty(this.f194073L)) {
                            str = this.f194073L;
                        } else {
                            return;
                        }
                        try {
                            str = URLDecoder.decode(str, "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            C86641i.m150117e("VideoEventLoggerV2", "exception:" + e.toString());
                        } catch (IllegalArgumentException e2) {
                            C86641i.m150117e("VideoEventLoggerV2", "exception:" + e2.toString());
                        }
                        int indexOf = str.indexOf("&l=");
                        if (indexOf > 0) {
                            int indexOf2 = str.indexOf("&", indexOf + 1);
                            if (indexOf2 > 0) {
                                substring = str.substring(indexOf + 3, indexOf2);
                            } else {
                                substring = str.substring(indexOf + 3);
                            }
                            this.f194140b.f194539cJ = substring;
                        }
                    }

                    /* renamed from: G */
                    private ArrayList<String> m149420G() {
                        if (this.f194088a == null) {
                            return null;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("w", Integer.valueOf(this.f194088a.mo137292c(97)));
                        hashMap.put("h", Integer.valueOf(this.f194088a.mo137292c(98)));
                        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                        ArrayList<String> arrayList = new ArrayList<>();
                        arrayList.add(new JSONObject(hashMap).toString());
                        return arrayList;
                    }

                    /* renamed from: J */
                    private Map m149423J() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("format_open_input", Long.valueOf(this.f194140b.f194638h));
                        hashMap.put("tran_connect", Long.valueOf(this.f194140b.f194455af));
                        hashMap.put("http_response", Long.valueOf(this.f194140b.f194456ag));
                        hashMap.put("receive_first_video_frame", Long.valueOf(this.f194140b.f194461al));
                        hashMap.put("decode_first_video_frame", Long.valueOf(this.f194140b.f194463an));
                        hashMap.put("render_first_video_frame", Long.valueOf(this.f194140b.f194642l));
                        hashMap.put("prepared", Long.valueOf(this.f194140b.f194652v));
                        return hashMap;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: e */
                    public final void mo137594e() {
                        if (this.f194135av != 4 || this.f194062A) {
                            this.f194135av = 2;
                            this.f194062A = false;
                            if (this.f194099aL == 1 && this.f194140b.f194651u <= 0) {
                                this.f194140b.f194651u = System.currentTimeMillis();
                            }
                            if (this.f194140b.f194653w <= 0) {
                                this.f194140b.f194653w = System.currentTimeMillis();
                                C86489u uVar = this.f194186s;
                                if (uVar != null) {
                                    uVar.f194247f = System.currentTimeMillis();
                                }
                                C86501y yVar = this.f194188u;
                                if (yVar != null) {
                                    yVar.f194350f = System.currentTimeMillis();
                                }
                                AbstractC86462f fVar = this.f194088a;
                                if (fVar != null) {
                                    this.f194140b.f194541cL = fVar.mo137292c(63);
                                    this.f194140b.f194542cM = this.f194088a.mo137292c(64);
                                }
                            }
                            m149425a(-2001, true);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: f */
                    public final void mo137598f() {
                        int i;
                        AbstractC86462f fVar = this.f194088a;
                        if (fVar != null) {
                            i = fVar.mo137292c(67);
                        } else {
                            i = -1;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("p", Integer.valueOf(i));
                        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                        this.f194161br.add(new JSONObject(hashMap).toString());
                        C86460e eVar = this.f194146bb;
                        if (!eVar.f193904c) {
                            eVar.f193904c = true;
                            try {
                                eVar.f193902a.getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), true, eVar.f193905d);
                            } catch (Exception e) {
                                C86641i.m150115c("BrightnessMonitor", e.getMessage());
                            }
                            eVar.mo137502a();
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: g */
                    public final void mo137602g() {
                        int i;
                        AbstractC86462f fVar = this.f194088a;
                        if (fVar != null) {
                            i = fVar.mo137292c(67);
                        } else {
                            i = -1;
                        }
                        HashMap hashMap = new HashMap();
                        long currentTimeMillis = System.currentTimeMillis();
                        hashMap.put("p", Integer.valueOf(i));
                        hashMap.put("t", Long.valueOf(currentTimeMillis));
                        this.f194162bs.add(new JSONObject(hashMap).toString());
                        if (this.f194141bA) {
                            this.f194188u.f194346b.f194369J.add(Long.valueOf(currentTimeMillis));
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: j */
                    public final void mo137614j() {
                        String str;
                        C86489u uVar = this.f194186s;
                        if (uVar != null && uVar.f194242a != null && uVar.f194242a.f193970a != null) {
                            HashMap hashMap = new HashMap();
                            if (uVar.f194242a.f193988ar > 0) {
                                hashMap.put("cur_url", uVar.f194242a.f193979ai.f194040g);
                                hashMap.put("cur_ip", uVar.f194242a.f193979ai.f194038e);
                                str = uVar.f194242a.f193979ai.f194040g;
                            } else {
                                hashMap.put("cur_url", uVar.f194242a.f194007v);
                                hashMap.put("cur_ip", uVar.f194242a.f194009x);
                                str = uVar.f194242a.f194007v;
                            }
                            try {
                                hashMap.put("cur_host", Uri.parse(str).getHost());
                            } catch (Exception e) {
                                C86641i.m150110a("VideoEventOneEvent", "triggerBufferStartCb:" + e.toString());
                            }
                            uVar.f194242a.f193970a.mo137289a(0, hashMap);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: l */
                    public final void mo137622l() {
                        int i;
                        if (this.f194142bB != null && this.f194144bD > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = currentTimeMillis - this.f194144bD;
                            HashMap hashMap = new HashMap();
                            AbstractC86462f fVar = this.f194088a;
                            if (fVar != null) {
                                i = fVar.mo137292c(67);
                            } else {
                                i = -1;
                            }
                            hashMap.put("ec", Integer.valueOf(this.f194142bB.f195251a));
                            hashMap.put("p", Integer.valueOf(i));
                            hashMap.put("t", Long.valueOf(currentTimeMillis));
                            hashMap.put("c", Long.valueOf(j));
                            hashMap.put("st", Integer.valueOf(this.f194143bC));
                            this.f194167bx.add(new JSONObject(hashMap).toString());
                        }
                        this.f194142bB = null;
                        this.f194144bD = -2147483648L;
                        this.f194143bC = -1;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: q */
                    public final void mo137642q() {
                        this.f194193z = false;
                        this.f194062A = true;
                        this.f194066E = new ArrayList();
                        this.f194067F = new ArrayList<>();
                        this.f194068G = new ArrayList();
                        this.f194069H = new ArrayList();
                        this.f194070I = new ArrayList();
                        this.f194071J = null;
                        this.f194072K = null;
                        this.f194073L = null;
                        this.f194074M = null;
                        this.f194075N = null;
                        this.f194076O = null;
                        this.f194077P = null;
                        this.f194079R = "";
                        this.f194081T = 0;
                        this.f194084W = null;
                        this.f194114aa = 0;
                        this.f194115ab = 0;
                        this.f194173f = 0;
                        this.f194174g = 0;
                        this.f194171d = 0;
                        this.f194175h = 0;
                        this.f194172e = 0;
                        this.f194129ap = 0;
                        this.f194128ao = 0;
                        this.f194133at = 0;
                        this.f194134au = 0;
                        this.f194096aI = 0;
                        this.f194100aM = 0;
                        this.f194101aN = 0;
                        this.f194102aO = 0;
                        this.f194098aK = false;
                        this.f194097aJ = false;
                        this.f194176i = Integer.MIN_VALUE;
                        this.f194116ac = 0;
                        this.f194117ad = 0;
                        this.f194078Q = null;
                        this.f194063B = false;
                        this.f194124ak = 0;
                        int i = this.f194170c.f193988ar;
                        C86476o oVar = this.f194170c;
                        if (C86476o.f193943d != null) {
                            C86307af afVar = C86476o.f193943d;
                            WeakReference<AbstractC86311ag> weakReference = oVar.f193991f;
                            if (weakReference != null) {
                                afVar.f192814c.lock();
                                afVar.f192815d.remove(weakReference);
                                afVar.f192814c.unlock();
                            }
                        }
                        C86476o oVar2 = new C86476o(this.f194088a, this.f194104aQ, this.f194136aw);
                        this.f194170c = oVar2;
                        oVar2.f193988ar = i;
                        C86452ab abVar = new C86452ab(this.f194170c);
                        this.f194190w = abVar;
                        abVar.f193838b = this.f194106aS;
                        this.f194186s.f194242a = this.f194170c;
                        this.f194187t.f194312a = this.f194170c;
                        this.f194188u.f194345a = this.f194170c;
                        this.f194191x.f193916a = this.f194170c;
                        this.f194189v.f194290a = this.f194170c;
                        this.f194160bq = new C86484b();
                    }

                    /* renamed from: z */
                    private void m149428z() {
                        this.f194066E = new ArrayList();
                        this.f194067F = new ArrayList<>();
                        this.f194068G = new ArrayList();
                        this.f194069H = new ArrayList();
                        C86493v vVar = this.f194189v;
                        vVar.f194291b = new C86493v.C86495b((byte) 0);
                        vVar.f194295f = null;
                        vVar.f194294e = null;
                        vVar.f194292c = false;
                        vVar.f194293d = 0;
                        this.f194135av = 0;
                        this.f194131ar = 0;
                        this.f194133at = 0;
                        this.f194134au = 0;
                        this.f194139az = 0;
                        this.f194089aA = 0;
                        this.f194062A = true;
                        this.f194173f = 0;
                        this.f194174g = 0;
                        this.f194171d = 0;
                        this.f194175h = 0;
                        this.f194172e = 0;
                        this.f194082U = 0;
                        this.f194083V = false;
                        this.f194128ao = 0;
                        this.f194129ap = 0;
                        this.f194132as = 0;
                        this.f194093aF = -2147483648L;
                        this.f194095aH = -2147483648L;
                        this.f194094aG = -2147483648L;
                        this.f194096aI = 0;
                        this.f194098aK = false;
                        this.f194097aJ = false;
                        this.f194099aL = 0;
                        this.f194120ag = null;
                        this.f194119af = 0;
                        this.f194161br = new ArrayList<>();
                        this.f194162bs = new ArrayList<>();
                        this.f194163bt = new ArrayList<>();
                        this.f194164bu = new ArrayList<>();
                        this.f194165bv = new ArrayList<>();
                        this.f194166bw = new ArrayList<>();
                        this.f194167bx = new ArrayList<>();
                        this.f194168by = new ArrayList<>();
                        this.f194169bz = new ArrayList<>();
                        this.f194142bB = null;
                        this.f194144bD = -2147483648L;
                        this.f194143bC = -1;
                        this.f194182o = -2147483648L;
                        this.f194183p = -2147483648L;
                        this.f194184q = -2147483648L;
                        this.f194185r = -2147483648L;
                        this.f194141bA = false;
                        this.f194151bh = 0;
                        this.f194152bi = 0;
                        this.f194153bj = 0;
                        this.f194154bk = 0;
                        this.f194155bl = 0;
                        this.f194157bn = null;
                        this.f194156bm = null;
                        this.f194158bo = null;
                        this.f194150bg = 0;
                        this.f194149bf = 0;
                        this.f194159bp = 0;
                        this.f194160bq.f194222t = 0;
                        this.f194160bq.f194223u = 0;
                        this.f194160bq.f194224v = 0;
                        this.f194113aZ = new C86471m();
                        this.f194145ba = new C86456ac();
                        this.f194146bb = new C86460e(this.f194136aw);
                        this.f194147bc.clear();
                        C86464h hVar = this.f194192y;
                        hVar.f193910d = 0;
                        hVar.f193911e.clear();
                    }

                    /* renamed from: com.ss.ttvideoengine.h.r$c */
                    class C86485c extends TimerTask {
                        static {
                            Covode.recordClassIndex(101713);
                        }

                        public final void run() {
                            int i;
                            int i2;
                            String str;
                            String str2;
                            MethodCollector.m26663i(6066);
                            AbstractC86462f fVar = C86481r.this.f194088a;
                            C86476o oVar = C86481r.this.f194170c;
                            C86505z zVar = C86481r.this.f194140b;
                            int i3 = -1;
                            if (fVar != null) {
                                i = fVar.mo137292c(74);
                                i2 = fVar.mo137292c(99);
                            } else {
                                i = -1;
                                i2 = -1;
                            }
                            String d = C86476o.m149401d();
                            if (C86476o.f193941b.equals("unknown")) {
                                str = "unknown";
                            } else {
                                if (C86476o.f193942c.equals("unknown") && C86476o.f193943d != null) {
                                    C86476o.f193942c = C86476o.m149400b(C86476o.f193943d.f192813b);
                                }
                                str = C86476o.f193942c;
                            }
                            if (oVar != null) {
                                str2 = oVar.f193944A;
                                i3 = oVar.f193961R;
                                if (i3 < 0 && fVar != null) {
                                    i3 = (int) fVar.mo137290b(75);
                                }
                            } else {
                                str2 = null;
                            }
                            float f = -1.0f;
                            if (zVar != null) {
                                if (zVar.f194550cU.size() >= C86481r.this.f194179l) {
                                    zVar.f194550cU.remove(0);
                                }
                                zVar.f194550cU.add(Integer.valueOf(i));
                                if (zVar.f194551cV.size() >= C86481r.this.f194179l) {
                                    zVar.f194551cV.remove(0);
                                }
                                zVar.f194551cV.add(Integer.valueOf(i2));
                                synchronized ("VideoEventLoggerV2") {
                                    try {
                                        if (C86481r.this.f194181n > 0) {
                                            f = (float) (((C86481r.this.f194180m * 8) * 1000) / C86481r.this.f194181n);
                                        }
                                        C86481r.this.f194181n = 0;
                                        C86481r.this.f194180m = 0;
                                    } catch (Throwable th) {
                                        MethodCollector.m26664o(6066);
                                        throw th;
                                    }
                                }
                                zVar.f194547cR.add(Float.valueOf(f));
                                if (i3 > 0) {
                                    int size = zVar.f194549cT.size();
                                    if (size > 0) {
                                        int intValue = zVar.f194549cT.get(zVar.f194549cT.keySet().toArray()[size - 1]).intValue();
                                        if (intValue > 0 && intValue != i3) {
                                            zVar.f194549cT.put(Integer.toString(zVar.f194553cX), Integer.valueOf(i3));
                                        }
                                    } else {
                                        zVar.f194549cT.put(Integer.toString(zVar.f194553cX), Integer.valueOf(i3));
                                    }
                                }
                                int size2 = zVar.f194548cS.size();
                                if (size2 > 0) {
                                    String str3 = zVar.f194548cS.get(zVar.f194548cS.keySet().toArray()[size2 - 1]);
                                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !str3.equals(str2)) {
                                        zVar.f194548cS.put(Integer.toString(zVar.f194553cX), str2);
                                    }
                                } else {
                                    zVar.f194548cS.put(Integer.toString(zVar.f194553cX), str2);
                                }
                                int size3 = zVar.f194545cP.size();
                                if (size3 > 0) {
                                    String str4 = zVar.f194545cP.get(zVar.f194545cP.keySet().toArray()[size3 - 1]);
                                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(d) && !str4.equals(d)) {
                                        zVar.f194545cP.put(Integer.toString(zVar.f194553cX), d);
                                    }
                                } else {
                                    zVar.f194545cP.put(Integer.toString(zVar.f194553cX), d);
                                }
                                int size4 = zVar.f194546cQ.size();
                                if (size4 > 0) {
                                    String str5 = zVar.f194546cQ.get(zVar.f194546cQ.keySet().toArray()[size4 - 1]);
                                    if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str) && !str5.equals(str)) {
                                        zVar.f194546cQ.put(Integer.toString(zVar.f194553cX), str);
                                    }
                                } else {
                                    zVar.f194546cQ.put(Integer.toString(zVar.f194553cX), str);
                                }
                                zVar.f194553cX++;
                            }
                            C86641i.m150113b("VideoEventLoggerV2", "netlevel rttLevel:" + i + ", rttMs:" + i2 + ", netType:" + d + ", sigLevel:" + str + ", bitrate:" + i3 + ", quality:" + str2 + ", speed:" + f);
                            MethodCollector.m26664o(6066);
                        }

                        private C86485c() {
                        }

                        /* synthetic */ C86485c(C86481r rVar, byte b) {
                            this();
                        }
                    }

                    /* renamed from: E */
                    private void m149418E() {
                        int d;
                        HashMap hashMap = new HashMap();
                        hashMap.putAll(f194061bd);
                        hashMap.putAll(this.f194147bc);
                        if (this.f194170c.f193948E != 0) {
                            hashMap.put("v_hw", Integer.valueOf(this.f194170c.f193948E));
                        }
                        if (this.f194170c.f193950G != 0) {
                            hashMap.put("a_hw", Integer.valueOf(this.f194170c.f193950G));
                        }
                        int i = this.f194064C;
                        if (i != 0) {
                            hashMap.put("async_init", Integer.valueOf(i));
                        }
                        int i2 = this.f194065D;
                        if (i2 != 0) {
                            hashMap.put("codec_pool", Integer.valueOf(i2));
                        }
                        if (this.f194170c.f193953J.equals("bytevc1")) {
                            hashMap.put("bytevc1", 1);
                        } else if (this.f194170c.f193953J.equals("bytevc2")) {
                            hashMap.put("bytevc2", 1);
                        }
                        int i3 = this.f194178k;
                        if (i3 > 0) {
                            hashMap.put("network_timeout", Integer.valueOf(i3));
                        }
                        int i4 = this.f194177j;
                        if (i4 > 0) {
                            hashMap.put("buffer_timeout", Integer.valueOf(i4));
                        }
                        if (this.f194160bq.f194203a > 0) {
                            hashMap.put("buffer_directly", Integer.valueOf(this.f194160bq.f194203a));
                        }
                        if (this.f194160bq.f194204b > 0) {
                            hashMap.put("first_buf_end_ms", Integer.valueOf(this.f194160bq.f194204b));
                        }
                        if (this.f194140b.f194562cg > 0) {
                            hashMap.put("oes_texture", Integer.valueOf(this.f194140b.f194562cg));
                        }
                        int i5 = this.f194100aM;
                        if (i5 > 0) {
                            hashMap.put("sr", Integer.valueOf(i5));
                        }
                        if (this.f194160bq.f194205c > 0) {
                            if (this.f194160bq.f194206d == 0) {
                                hashMap.put("volume_balance", 1);
                            } else if (this.f194160bq.f194206d == 1) {
                                hashMap.put("volume_balancev2", 1);
                            }
                        }
                        int i6 = this.f194124ak;
                        if (i6 > 0) {
                            hashMap.put("bash", Integer.valueOf(i6));
                        }
                        if (this.f194170c.f193984an > 0) {
                            hashMap.put("abr", Integer.valueOf(this.f194170c.f193984an));
                        }
                        if (this.f194160bq.f194207e > 0) {
                            hashMap.put("engine_looper", Integer.valueOf(this.f194160bq.f194207e));
                        }
                        if (this.f194160bq.f194208f > 0) {
                            hashMap.put("auto_range", Integer.valueOf(this.f194160bq.f194208f));
                        }
                        if (this.f194160bq.f194209g > 0) {
                            hashMap.put("hw_drop", Integer.valueOf(this.f194160bq.f194209g));
                        }
                        if (this.f194160bq.f194210h > 0) {
                            hashMap.put("enable_https", Integer.valueOf(this.f194160bq.f194210h));
                        }
                        if (this.f194140b.f194493bQ > 0) {
                            hashMap.put("enable_hijack", Integer.valueOf(this.f194140b.f194493bQ));
                        }
                        if (this.f194140b.f194494bR > 0) {
                            hashMap.put("hijack_retry", Integer.valueOf(this.f194140b.f194494bR));
                        }
                        if (this.f194160bq.f194211i > 0) {
                            hashMap.put("fallback_api", Integer.valueOf(this.f194160bq.f194211i));
                        }
                        if (this.f194160bq.f194212j > 0) {
                            hashMap.put("async_pos", Integer.valueOf(this.f194160bq.f194212j));
                        }
                        if (this.f194170c.f193965V > 0) {
                            hashMap.put("socket_reuse", Integer.valueOf(this.f194170c.f193965V));
                        }
                        if (this.f194170c.f193988ar > 0) {
                            hashMap.put("mdl_type", Integer.valueOf(this.f194170c.f193988ar));
                        }
                        if (this.f194160bq.f194213k > 0) {
                            hashMap.put("enable_loadcontrol", Integer.valueOf(this.f194160bq.f194213k));
                        }
                        if (this.f194160bq.f194214l != 5) {
                            hashMap.put("render_type", Integer.valueOf(this.f194160bq.f194214l));
                        } else if (this.f194170c.f193948E == 0) {
                            hashMap.put("render_type", 5);
                        } else {
                            hashMap.put("render_type", 3);
                        }
                        hashMap.put("image_scale", Integer.valueOf(this.f194160bq.f194215m));
                        int i7 = this.f194176i;
                        if (i7 >= 0) {
                            hashMap.put("mc_render", Integer.valueOf(i7));
                        }
                        if (this.f194160bq.f194216n >= 0) {
                            hashMap.put("audio_render_type", Integer.valueOf(this.f194160bq.f194216n));
                        }
                        if (this.f194160bq.f194217o > 0) {
                            hashMap.put("skip_find_stream", Integer.valueOf(this.f194160bq.f194217o));
                        }
                        if (this.f194160bq.f194218p > 0) {
                            hashMap.put("async_prepare", Integer.valueOf(this.f194160bq.f194218p));
                        }
                        if (this.f194160bq.f194219q > 0) {
                            hashMap.put("frc_level", Integer.valueOf(this.f194160bq.f194219q));
                        }
                        if (this.f194160bq.f194220r > 0) {
                            hashMap.put("lazy_seek", Integer.valueOf(this.f194160bq.f194220r));
                        }
                        if (this.f194160bq.f194221s > 0) {
                            hashMap.put("keep_formater_alive", Integer.valueOf(this.f194160bq.f194221s));
                        }
                        if (this.f194140b.f194526bx > 0) {
                            hashMap.put("dis_short_seek", Integer.valueOf(this.f194140b.f194526bx));
                        }
                        if (this.f194140b.f194525bw > 0) {
                            hashMap.put("pref_near_sample", Integer.valueOf(this.f194140b.f194525bw));
                        }
                        int i8 = this.f194153bj;
                        if (i8 > 0) {
                            hashMap.put("sub_thread_enable", Integer.valueOf(i8));
                        }
                        int i9 = this.f194155bl;
                        if (i9 > 0) {
                            hashMap.put("mask_thread_enable", Integer.valueOf(i9));
                        }
                        if ((this.f194160bq.f194222t & 1) == 1) {
                            hashMap.put("hdr_pq", 1);
                        }
                        if ((this.f194160bq.f194222t & 2) == 2) {
                            hashMap.put("hdr_hlg", 1);
                        }
                        if (this.f194160bq.f194223u > 0) {
                            hashMap.put("abr_startup", 1);
                        }
                        if (this.f194160bq.f194224v > 0) {
                            hashMap.put("thread_priority", 1);
                        }
                        if (this.f194160bq.f194225w > 0) {
                            hashMap.put("smooth_clock", 1);
                        }
                        if (this.f194160bq.f194226x > 0) {
                            hashMap.put("disable_split_voice", 1);
                        }
                        if (this.f194170c.f193948E == 0 && this.f194160bq.f194227y > 0) {
                            hashMap.put("yv12", 1);
                        }
                        if (this.f194140b.f194542cM == 28) {
                            hashMap.put("heaacv2", 1);
                        }
                        if (this.f194160bq.f194228z > 0) {
                            hashMap.put("strategy_center", 1);
                        } else {
                            hashMap.put("strategy_center", 0);
                        }
                        if (this.f194160bq.f194201A >= 0) {
                            hashMap.put("drop_limit", Integer.valueOf(this.f194160bq.f194201A));
                        }
                        int d2 = C86385d.C86400h.f193679a.mo137381d(8);
                        if (d2 > 0) {
                            hashMap.put("mdl_socket_reuse", Integer.valueOf(d2));
                        }
                        int d3 = C86385d.C86400h.f193679a.mo137381d(1001);
                        if (d3 > 0) {
                            hashMap.put("mdl_preconn", Integer.valueOf(d3));
                        }
                        if (C86385d.C86400h.f193679a.mo137381d(7) > 0 && ((d = C86385d.C86400h.f193679a.mo137381d(90)) == 2 || d == 3 || d == 4)) {
                            hashMap.put("mdl_httpdns", Integer.valueOf(d));
                        }
                        int d4 = C86385d.C86400h.f193679a.mo137381d(114);
                        if (d4 > 0) {
                            hashMap.put("mdl_predns", Integer.valueOf(d4));
                        }
                        int d5 = C86385d.C86400h.f193679a.mo137381d(105);
                        if (d5 > 0) {
                            hashMap.put("mdl_dns_refresh", Integer.valueOf(d5));
                        }
                        int d6 = C86385d.C86400h.f193679a.mo137381d(103);
                        if (d6 > 0) {
                            hashMap.put("mdl_dns_parallel", Integer.valueOf(d6));
                        }
                        int d7 = C86385d.C86400h.f193679a.mo137381d(115);
                        if (d7 > 0) {
                            hashMap.put("mdl_backip", Integer.valueOf(d7));
                        }
                        int d8 = C86385d.C86400h.f193679a.mo137381d(101);
                        if (d8 > 0) {
                            hashMap.put("mdl_session_reuse", Integer.valueOf(d8));
                        }
                        int d9 = C86385d.C86400h.f193679a.mo137381d(100);
                        if (d9 == 3) {
                            hashMap.put("mdl_tls_ver", Integer.valueOf(d9));
                        }
                        long c = C86385d.C86400h.f193679a.mo137378c(1152);
                        long c2 = C86385d.C86400h.f193679a.mo137378c(1153);
                        if (c > 0 && c2 > 0) {
                            hashMap.put("mdl_socket_monitor", 1);
                        }
                        this.f194140b.f194555cZ = hashMap;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: G */
                    public final void mo137520G(int i) {
                        this.f194085X = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: H */
                    public final void mo137521H(int i) {
                        this.f194124ak = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: S */
                    public final void mo137532S(int i) {
                        this.f194176i = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: T */
                    public final void mo137533T(int i) {
                        this.f194065D = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137552a(C86535p pVar) {
                        mo137574b(pVar);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137576b(String str) {
                        this.f194157bn = str;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: c */
                    public final void mo137582c(int i) {
                        this.f194150bg = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: d */
                    public final void mo137590d(int i) {
                        this.f194159bp = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: e */
                    public final void mo137595e(int i) {
                        this.f194116ac = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: f */
                    public final void mo137599f(int i) {
                        this.f194117ad = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: g */
                    public final void mo137603g(int i) {
                        this.f194121ah = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: l */
                    public final void mo137625l(String str) {
                        this.f194077P = str;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: n */
                    public final void mo137631n(int i) {
                        this.f194115ab = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: o */
                    public final void mo137635o(int i) {
                        this.f194118ae = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: w */
                    public final void mo137665w(String str) {
                        this.f194078Q = str;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: A */
                    public final void mo137513A(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194513bk = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: B */
                    public final void mo137515B(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194471av = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: C */
                    public final void mo137516C(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194426aC = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: I */
                    public final void mo137522I(int i) {
                        this.f194170c.f193988ar = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: J */
                    public final void mo137523J(int i) {
                        this.f194140b.f194437aN = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: K */
                    public final void mo137524K(int i) {
                        this.f194140b.f194506bd = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: L */
                    public final void mo137525L(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194438aO = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: M */
                    public final void mo137526M(int i) {
                        this.f194170c.f193983am = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: N */
                    public final void mo137527N(int i) {
                        this.f194170c.f193984an = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: O */
                    public final void mo137528O(int i) {
                        this.f194170c.f193985ao = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: P */
                    public final void mo137529P(int i) {
                        this.f194170c.f193986ap = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: R */
                    public final void mo137531R(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194562cg = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: U */
                    public final void mo137534U(int i) {
                        this.f194113aZ.f193915a = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: c */
                    public final void mo137581c(float f) {
                        this.f194106aS = f;
                        this.f194190w.f193838b = f;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: d */
                    public final void mo137592d(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194459aj = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: e */
                    public final void mo137596e(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194460ak = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: f */
                    public final void mo137600f(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194461al = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: g */
                    public final void mo137604g(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194463an = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: h */
                    public final void mo137608h(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194462am = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: i */
                    public final void mo137611i(int i) {
                        this.f194170c.f193966W = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: j */
                    public final void mo137615j(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194493bQ = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: k */
                    public final void mo137619k(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194494bR = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: l */
                    public final void mo137624l(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194470au = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: m */
                    public final void mo137627m(int i) {
                        this.f194114aa = i;
                        this.f194170c.f193951H = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: p */
                    public final void mo137641p(String str) {
                        this.f194170c.f193967X = str;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: q */
                    public final void mo137644q(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194556ca = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: r */
                    public final void mo137648r(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194558cc = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: s */
                    public final void mo137652s(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194557cb = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: v */
                    public final void mo137662v(String str) {
                        if (str != null) {
                            this.f194086Y = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: y */
                    public final void mo137670y(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194517bo = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: z */
                    public final void mo137672z(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194519bq = i;
                        }
                    }

                    /* renamed from: c */
                    private void m149427c(AbstractC86517e eVar) {
                        if (eVar != null) {
                            this.f194170c.mo137680a(eVar);
                            this.f194130aq = eVar;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: A */
                    public final void mo137514A(final String str) {
                        C86631b.m150044a(new Runnable() {
                            /* class com.p2082ss.ttvideoengine.p4415h.C86481r.RunnableC864821 */

                            static {
                                Covode.recordClassIndex(101710);
                            }

                            public final void run() {
                                Throwable th;
                                Exception e;
                                MethodCollector.m26663i(6061);
                                synchronized ("VideoEventLoggerV2") {
                                    try {
                                        JSONArray optJSONArray = new JSONObject(str).optJSONArray("data");
                                        long j = 0;
                                        long j2 = 0;
                                        int i = 0;
                                        while (i < optJSONArray.length()) {
                                            JSONArray optJSONArray2 = optJSONArray.getJSONObject(i).optJSONArray("downinfo");
                                            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                                int i2 = 0;
                                                while (i2 < optJSONArray2.length()) {
                                                    JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                                                    long optLong = jSONObject.optLong("size");
                                                    try {
                                                        long optLong2 = jSONObject.optLong("costTime");
                                                        if (optLong != j || optLong2 != -1) {
                                                            C86481r.this.f194180m += optLong;
                                                            j2 = Math.max(j2, optLong2);
                                                        }
                                                        i2++;
                                                        j = 0;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        try {
                                                            C86641i.m150117e("VideoEventLoggerV2", "update networkspeed error " + e.toString());
                                                            MethodCollector.m26664o(6061);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            MethodCollector.m26664o(6061);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                            i++;
                                            j = 0;
                                        }
                                        C86481r.this.f194181n = j2;
                                        C86641i.m150113b("VideoEventLoggerV2", "update multi speed size:" + C86481r.this.f194180m + ", time:" + C86481r.this.f194181n);
                                    } catch (Exception e3) {
                                        e = e3;
                                        C86641i.m150117e("VideoEventLoggerV2", "update networkspeed error " + e.toString());
                                        MethodCollector.m26664o(6061);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        MethodCollector.m26664o(6061);
                                        throw th;
                                    }
                                    MethodCollector.m26664o(6061);
                                }
                            }
                        });
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: D */
                    public final void mo137517D(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null && i > 0) {
                            zVar.f194499bW = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: E */
                    public final void mo137518E(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null && i > 0) {
                            zVar.f194500bX = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: F */
                    public final void mo137519F(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null && i >= 0) {
                            zVar.f194501bY = i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137537a(float f) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194468as = f;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137566b(float f) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194469at = f;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: d */
                    public final void mo137593d(String str) {
                        this.f194071J = str;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: f */
                    public final void mo137601f(String str) {
                        this.f194074M = str;
                        C86476o oVar = this.f194170c;
                        if (oVar != null) {
                            oVar.f194005t = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: h */
                    public final void mo137609h(String str) {
                        this.f194075N = str;
                        C86476o oVar = this.f194170c;
                        if (oVar != null) {
                            oVar.f194006u = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: k */
                    public final void mo137621k(String str) {
                        C86476o oVar = this.f194170c;
                        if (oVar != null) {
                            oVar.f194011z = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: n */
                    public final void mo137632n(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194448aY = (int) j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: s */
                    public final void mo137653s(String str) {
                        C86476o oVar = this.f194170c;
                        if (TextUtils.isEmpty(oVar.f193975ae)) {
                            oVar.f193975ae = str;
                        }
                        oVar.f193976af = str;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: t */
                    public final void mo137655t(int i) {
                        this.f194188u.mo137717a(i, "wait");
                        this.f194141bA = false;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: x */
                    public final void mo137667x(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194467ar = (long) i;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: z */
                    public final void mo137673z(String str) {
                        if (this.f194140b != null && !TextUtils.isEmpty(str)) {
                            this.f194140b.f194563ch = str;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: com.ss.ttvideoengine.h.r$b */
                    public class C86484b {

                        /* renamed from: A */
                        public int f194201A = -1;

                        /* renamed from: a */
                        public int f194203a;

                        /* renamed from: b */
                        public int f194204b;

                        /* renamed from: c */
                        public int f194205c;

                        /* renamed from: d */
                        public int f194206d = -1;

                        /* renamed from: e */
                        public int f194207e;

                        /* renamed from: f */
                        public int f194208f;

                        /* renamed from: g */
                        public int f194209g;

                        /* renamed from: h */
                        public int f194210h;

                        /* renamed from: i */
                        public int f194211i;

                        /* renamed from: j */
                        public int f194212j;

                        /* renamed from: k */
                        public int f194213k;

                        /* renamed from: l */
                        public int f194214l = Integer.MIN_VALUE;

                        /* renamed from: m */
                        public int f194215m;

                        /* renamed from: n */
                        public int f194216n = Integer.MIN_VALUE;

                        /* renamed from: o */
                        public int f194217o;

                        /* renamed from: p */
                        public int f194218p;

                        /* renamed from: q */
                        public int f194219q;

                        /* renamed from: r */
                        public int f194220r;

                        /* renamed from: s */
                        public int f194221s;

                        /* renamed from: t */
                        public int f194222t;

                        /* renamed from: u */
                        public int f194223u;

                        /* renamed from: v */
                        public int f194224v;

                        /* renamed from: w */
                        public int f194225w;

                        /* renamed from: x */
                        public int f194226x;

                        /* renamed from: y */
                        public int f194227y;

                        /* renamed from: z */
                        public int f194228z;

                        static {
                            Covode.recordClassIndex(101712);
                        }

                        C86484b() {
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137567b(int i) {
                        C86476o oVar = this.f194170c;
                        oVar.f193948E = i;
                        oVar.f193949F = i;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: e */
                    public final void mo137597e(String str) {
                        if (this.f194170c != null && str != null && !str.isEmpty()) {
                            this.f194170c.f194007v = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: g */
                    public final void mo137605g(String str) {
                        if (this.f194170c != null && str != null && !str.isEmpty()) {
                            this.f194170c.f194008w = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: i */
                    public final void mo137612i(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194464ao = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: j */
                    public final void mo137616j(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null && zVar.f194578cw <= 0) {
                            this.f194140b.f194578cw = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: l */
                    public final void mo137623l(int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null && i != -1) {
                            if (zVar.f194495bS == -1) {
                                this.f194140b.f194495bS = i;
                            } else {
                                this.f194140b.f194496bT = i;
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: m */
                    public final void mo137628m(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194447aX = (int) j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: o */
                    public final void mo137636o(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194528bz = j;
                            if (this.f194062A && this.f194140b.f194502bZ == 0) {
                                m149425a(-1005, true);
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: p */
                    public final void mo137639p(int i) {
                        m149425a(-2002, false);
                        this.f194135av = 2;
                        this.f194187t.mo137712a("wait", i);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: q */
                    public final void mo137645q(String str) {
                        if (this.f194170c != null && str != null && !str.isEmpty()) {
                            this.f194170c.f193964U = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: r */
                    public final void mo137649r(String str) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194422Z = 1;
                            if (!TextUtils.isEmpty(str)) {
                                this.f194140b.f194450aa = str;
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: t */
                    public final void mo137656t(String str) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194518bp = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: y */
                    public final void mo137671y(String str) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194515bm = str;
                        }
                    }

                    /* renamed from: b */
                    private void m149426b(C86633c cVar) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null && zVar.f194410N == Integer.MIN_VALUE && this.f194140b.f194409M == Integer.MIN_VALUE && this.f194140b.f194411O == Integer.MIN_VALUE) {
                            this.f194140b.f194409M = cVar.mo137899b();
                            this.f194140b.f194410N = cVar.f195251a;
                            this.f194140b.f194411O = cVar.f195252b;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: Q */
                    public final void mo137530Q(int i) {
                        long currentTimeMillis = System.currentTimeMillis();
                        switch (i) {
                            case 63:
                                if (this.f194094aG <= 0) {
                                    this.f194094aG = currentTimeMillis;
                                    return;
                                }
                                return;
                            case 64:
                                if (this.f194140b.f194582d <= 0) {
                                    this.f194140b.f194582d = currentTimeMillis;
                                    return;
                                }
                                return;
                            case 65:
                                if (this.f194093aF <= 0) {
                                    this.f194093aF = currentTimeMillis;
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: h */
                    public final void mo137607h(int i) {
                        if (i == 1 || ((i != 0 && this.f194170c.f193947D.equals("dir_url")) || this.f194170c.f193988ar == 1 || this.f194170c.f193988ar == 2)) {
                            this.f194140b.f194502bZ = 1;
                        } else {
                            this.f194140b.f194502bZ = 0;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: i */
                    public final void mo137613i(String str) {
                        if (this.f194170c != null && str != null && !str.isEmpty()) {
                            this.f194170c.f194009x = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: m */
                    public final void mo137629m(String str) {
                        C86476o oVar = this.f194170c;
                        if (oVar != null) {
                            oVar.f193944A = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: n */
                    public final void mo137633n(String str) {
                        if (this.f194140b != null && !TextUtils.isEmpty(str)) {
                            this.f194140b.f194429aF = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: o */
                    public final void mo137637o(String str) {
                        if (this.f194170c != null && str != null && !str.isEmpty()) {
                            this.f194170c.f193963T = str;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: p */
                    public final void mo137640p(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null && zVar.f194477bA <= 0) {
                            this.f194140b.f194477bA = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: q */
                    public final void mo137643q(int i) {
                        C86641i.m150110a("VideoEventLoggerV2", "movie may stall");
                        C86489u uVar = this.f194186s;
                        uVar.f194244c.f194267d = System.currentTimeMillis();
                        uVar.f194244c.f194268e = i;
                        C86641i.m150113b("VideoEventOneEvent", "movie stall type:".concat(String.valueOf(i)));
                        if (uVar.f194242a != null) {
                            uVar.f194242a.mo137683c();
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: u */
                    public final void mo137659u(String str) {
                        if (TextUtils.isEmpty(this.f194120ag)) {
                            this.f194120ag = str;
                        }
                        if (this.f194119af <= 0) {
                            this.f194119af = System.currentTimeMillis();
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: x */
                    public final void mo137668x(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f194079R += str;
                        }
                    }

                    /* renamed from: V */
                    private void m149424V(int i) {
                        this.f194140b.f194482bF = i;
                        TimerTask timerTask = this.f194110aW;
                        if (timerTask != null) {
                            timerTask.cancel();
                            this.f194110aW = null;
                        }
                        Timer timer = this.f194109aV;
                        if (timer != null) {
                            timer.cancel();
                            this.f194109aV = null;
                        }
                        if (this.f194105aR) {
                            this.f194190w.mo137495b();
                        }
                        C86307af.C86308a.m148612a().mo137129b();
                        m149419F();
                        this.f194140b = new C86505z();
                        this.f194190w.f193842f = this.f194170c;
                        this.f194186s.mo137703a();
                        this.f194187t.mo137711a();
                        this.f194188u.mo137716a();
                        this.f194191x.f193917b.clear();
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: c */
                    public final void mo137586c(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194458ai = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: k */
                    public final void mo137620k(long j) {
                        C86472n nVar = this.f194191x;
                        if (nVar.f193917b != null) {
                            C86472n.C86475b bVar = null;
                            while (true) {
                                if (!nVar.f193917b.isEmpty()) {
                                    bVar = nVar.f193917b.remove(0);
                                    if (bVar != null && bVar.f193931f == j) {
                                        break;
                                    }
                                } else if (bVar == null) {
                                    return;
                                }
                            }
                            C86641i.m150113b("VideoEventAbrEvent", "abrSwitchEnd");
                            bVar.f193938m = (int) nVar.f193916a.f193970a.mo137290b(106);
                            bVar.f193936k = nVar.f193916a.f193970a.mo137290b(107);
                            bVar.f193927b = System.currentTimeMillis() - bVar.f193926a;
                            nVar.f193916a.mo137679a();
                            C86631b.m150044a(new C86472n.RunnableC86473a(nVar.f193916a.f193973ac, nVar, nVar.f193916a, bVar));
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: r */
                    public final void mo137647r(int i) {
                        if (i == 0 && this.f194135av == 3) {
                            this.f194135av = 2;
                            this.f194186s.mo137704a("wait");
                        }
                        if (this.f194140b != null) {
                            if (i == 0) {
                                if (this.f194135av != 4) {
                                    m149425a(-2003, false);
                                }
                            } else if (i == 1) {
                                m149425a(-2004, false);
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            if (this.f194140b.f194466aq <= 0) {
                                this.f194140b.f194466aq = currentTimeMillis;
                            }
                            if (i == 1) {
                                long j = this.f194122ai;
                                if (j > 0 && currentTimeMillis >= j) {
                                    this.f194172e += currentTimeMillis - j;
                                    this.f194122ai = 0;
                                }
                            }
                            this.f194140b.f194487bK = currentTimeMillis;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: v */
                    public final void mo137661v(int i) {
                        C86641i.m150113b("VideoEventLoggerV2", "AVNoRenderEnd, type: ".concat(String.valueOf(i)));
                        if (!this.f194189v.f194292c) {
                            C86641i.m150110a("VideoEventLoggerV2", "AVNoRenderEnd, not started before, abort");
                        } else if (this.f194189v.f194291b.f194300a == i) {
                            this.f194189v.mo137708a();
                            HashMap hashMap = new HashMap();
                            hashMap.put(StringSet.type, Integer.valueOf(i));
                            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                            AbstractC86462f fVar = this.f194088a;
                            if (fVar != null) {
                                fVar.mo137289a(6, hashMap);
                            }
                        } else {
                            C86641i.m150110a("VideoEventLoggerV2", "AVNoRenderEnd, type does not match, abort");
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: w */
                    public final void mo137664w(int i) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (i != 5) {
                            boolean z = true;
                            if (this.f194135av == 4) {
                                this.f194187t.mo137712a("wait", 0);
                                z = false;
                            }
                            if (this.f194135av == 3) {
                                this.f194186s.mo137704a("wait");
                                this.f194140b.f194487bK = currentTimeMillis;
                            } else if (z) {
                                this.f194170c.mo137679a();
                            }
                        }
                        if (this.f194141bA) {
                            long j = -1;
                            AbstractC86462f fVar = this.f194088a;
                            if (fVar != null) {
                                j = (long) fVar.mo137292c(67);
                            }
                            this.f194188u.mo137717a((int) j, "finish");
                            this.f194141bA = false;
                        }
                        if (!this.f194062A || this.f194140b.f194653w > 0) {
                            this.f194140b.f194654x = currentTimeMillis;
                        } else {
                            this.f194140b.f194655y = currentTimeMillis;
                        }
                        m149424V(i);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137538a(int i) {
                        if (this.f194135av != 0) {
                            boolean z = true;
                            long currentTimeMillis = System.currentTimeMillis();
                            if (this.f194135av == 4) {
                                this.f194187t.mo137712a("exit", 0);
                                z = false;
                            }
                            if (this.f194135av == 3) {
                                this.f194186s.mo137704a("exit");
                                this.f194140b.f194487bK = currentTimeMillis;
                                z = false;
                            }
                            this.f194135av = 0;
                            if (!this.f194062A || this.f194140b.f194582d <= 0 || this.f194140b.f194653w > 0) {
                                this.f194140b.f194654x = currentTimeMillis;
                            } else if (this.f194140b.f194655y <= 0) {
                                this.f194140b.f194655y = currentTimeMillis;
                            }
                            if (z) {
                                this.f194170c.mo137679a();
                            }
                            if (this.f194141bA) {
                                long j = -1;
                                AbstractC86462f fVar = this.f194088a;
                                if (fVar != null) {
                                    j = (long) fVar.mo137292c(67);
                                }
                                this.f194188u.mo137717a((int) j, "exit");
                                this.f194141bA = false;
                            }
                            if (this.f194140b.f194578cw <= 0) {
                                this.f194088a.mo137289a(2, m149423J());
                            }
                            C86460e eVar = this.f194146bb;
                            if (eVar.f193904c) {
                                eVar.f193904c = false;
                                eVar.f193902a.getContentResolver().unregisterContentObserver(eVar.f193905d);
                            }
                            m149424V(i);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: j */
                    public final void mo137617j(String str) {
                        this.f194076O = str;
                        HashMap hashMap = new HashMap();
                        hashMap.put("to", str);
                        hashMap.put("p", -1);
                        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                        hashMap.put("c", 0);
                        hashMap.put("seam", false);
                        this.f194163bt.add(new JSONObject(hashMap).toString());
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: s */
                    public final void mo137651s(int i) {
                        long j;
                        Object obj;
                        this.f194141bA = true;
                        C86489u uVar = this.f194186s;
                        long j2 = -1;
                        if (uVar != null) {
                            j = uVar.mo137705b();
                        } else {
                            j = -1;
                        }
                        C86497x xVar = this.f194187t;
                        if (xVar != null) {
                            j2 = xVar.mo137713b();
                        }
                        C86501y yVar = this.f194188u;
                        long currentTimeMillis = System.currentTimeMillis();
                        yVar.f194346b.f194371a = currentTimeMillis;
                        yVar.f194346b.f194388r = i;
                        if (j == 0) {
                            yVar.f194346b.f194386p = yVar.f194346b.f194371a;
                        } else {
                            yVar.f194346b.f194386p = j;
                        }
                        if (j2 == 0) {
                            yVar.f194346b.f194387q = yVar.f194346b.f194371a;
                        } else {
                            yVar.f194346b.f194387q = j2;
                        }
                        if (yVar.f194345a != null) {
                            yVar.f194346b.f194381k = yVar.f194345a.f193960Q;
                            yVar.f194346b.f194383m = yVar.f194345a.f193961R;
                            yVar.f194346b.f194393w = yVar.f194345a.f193976af;
                            if (!(yVar.f194345a.f193982al == null || (obj = yVar.f194345a.f193982al.get("abr_used")) == null)) {
                                yVar.f194346b.f194392v = ((Integer) obj).intValue();
                            }
                            if (yVar.f194345a.f193970a != null) {
                                Map<String, Long> a = C86470l.m149391a(yVar.f194345a.f193970a.mo137287a(55));
                                if (a.get("fvl") != null) {
                                    yVar.f194346b.f194376f = a.get("fvl").longValue();
                                }
                                if (a.get("fal") != null) {
                                    yVar.f194346b.f194375e = a.get("fal").longValue();
                                }
                                if (a.get("dvl") != null) {
                                    yVar.f194346b.f194378h = a.get("dvl").longValue();
                                }
                                if (a.get("dal") != null) {
                                    yVar.f194346b.f194377g = a.get("dal").longValue();
                                }
                                if (a.get("bvl") != null) {
                                    yVar.f194346b.f194380j = a.get("bvl").longValue();
                                }
                                if (a.get("bal") != null) {
                                    yVar.f194346b.f194379i = a.get("bal").longValue();
                                }
                                yVar.f194346b.f194395y = yVar.f194345a.f193970a.mo137292c(88);
                                yVar.f194346b.f194361B = yVar.f194345a.f193970a.mo137292c(89);
                                yVar.f194346b.f194362C = yVar.f194345a.f193970a.mo137292c(90);
                                yVar.f194346b.f194367H = yVar.f194345a.f193970a.mo137292c(94);
                                long b = yVar.f194345a.f193970a.mo137290b(91);
                                if (b > 0) {
                                    yVar.f194346b.f194396z = currentTimeMillis - b;
                                }
                                long b2 = yVar.f194345a.f193970a.mo137290b(92);
                                if (b2 > 0) {
                                    yVar.f194346b.f194360A = currentTimeMillis - b2;
                                }
                                long b3 = yVar.f194345a.f193970a.mo137290b(93);
                                if (b3 > 0) {
                                    yVar.f194346b.f194363D = currentTimeMillis - b3;
                                }
                                long b4 = yVar.f194345a.f193970a.mo137290b(95);
                                if (b4 > 0) {
                                    yVar.f194346b.f194368I = currentTimeMillis - b4;
                                }
                                Map<String, Object> d = yVar.f194345a.f193970a.mo137295d();
                                if (d != null) {
                                    yVar.f194346b.f194364E = ((Integer) d.get("power")).intValue();
                                    yVar.f194346b.f194365F = ((Integer) d.get("isCharging")).intValue();
                                }
                            }
                        }
                        if (yVar.f194345a != null && yVar.f194345a.f193970a != null) {
                            yVar.f194345a.f193970a.mo137289a(3, new HashMap());
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: u */
                    public final void mo137658u(int i) {
                        C86641i.m150113b("VideoEventLoggerV2", "AVNoRenderStart, type: ".concat(String.valueOf(i)));
                        if (this.f194189v.f194292c) {
                            C86641i.m150113b("VideoEventLoggerV2", "AVNoRenderStart event is already started, abort");
                            return;
                        }
                        C86493v vVar = this.f194189v;
                        vVar.f194292c = true;
                        vVar.f194291b.f194307h = System.currentTimeMillis();
                        vVar.f194291b.f194300a = i;
                        if (!(vVar.f194290a == null || vVar.f194290a.f193970a == null)) {
                            Map<String, Long> a = C86470l.m149391a(vVar.f194290a.f193970a.mo137287a(55));
                            if (a.get("fvl") != null) {
                                vVar.f194291b.f194301b = a.get("fvl").longValue();
                            }
                            if (a.get("fal") != null) {
                                vVar.f194291b.f194302c = a.get("fal").longValue();
                            }
                            if (a.get("dvl") != null) {
                                vVar.f194291b.f194303d = a.get("dvl").longValue();
                            }
                            if (a.get("dal") != null) {
                                vVar.f194291b.f194304e = a.get("dal").longValue();
                            }
                            if (a.get("bvl") != null) {
                                vVar.f194291b.f194305f = a.get("bvl").longValue();
                            }
                            if (a.get("bal") != null) {
                                vVar.f194291b.f194306g = a.get("bal").longValue();
                            }
                            vVar.f194291b.f194309j = C86493v.m149601a(vVar.f194290a.f193970a.mo137287a(110));
                            C86641i.m150113b("VideoEventOneNoRender", "stage error: " + vVar.f194291b.f194309j);
                        }
                        this.f194140b.f194608dZ = this.f194189v.f194291b.f194309j;
                        long j = -1;
                        if (this.f194140b.f194653w > 0) {
                            j = this.f194140b.f194653w - this.f194140b.f194582d;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put(StringSet.type, Integer.valueOf(i));
                        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                        C86476o oVar = this.f194170c;
                        Object obj = "";
                        String str = obj;
                        if (oVar.f193971aa != null) {
                            Map map = (Map) oVar.f193971aa.get("codec");
                            Object obj2 = obj;
                            if (map.get(oVar.f193960Q) != null) {
                                obj2 = map.get(oVar.f193960Q);
                            }
                            str = (String) obj2;
                        }
                        String str2 = str;
                        if (oVar.f193970a != null) {
                            boolean isEmpty = TextUtils.isEmpty(str);
                            str2 = str;
                            if (isEmpty) {
                                str2 = oVar.f193970a.mo137287a(0);
                            }
                        }
                        hashMap.put("codec", str2 == 1 ? 1 : 0);
                        hashMap.put("resolution", this.f194170c.f194011z);
                        hashMap.put("quality_desc", this.f194170c.f193976af);
                        hashMap.put("hw", Integer.valueOf(this.f194170c.f193948E));
                        hashMap.put("ps_t", Long.valueOf(this.f194095aH));
                        hashMap.put("first_frame_cost", Long.valueOf(j));
                        if (this.f194140b.f194484bH != -2147483648L) {
                            hashMap.put("seek_t", Long.valueOf(this.f194140b.f194484bH));
                        }
                        AbstractC86462f fVar = this.f194088a;
                        if (fVar != null) {
                            hashMap.put("enable_nnsr", Integer.valueOf(fVar.mo137292c(101)));
                            hashMap.put("surface_error_code", Integer.valueOf(this.f194088a.mo137292c(100)));
                            hashMap.put("switch_resolution_t", Long.valueOf(this.f194088a.mo137290b(92)));
                            this.f194088a.mo137289a(5, hashMap);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137571b(long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194457ah = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: c */
                    public final void mo137587c(String str) {
                        this.f194158bo = str;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: c */
                    public final void mo137588c(boolean z) {
                        this.f194083V = z;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137536a(double d, int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            if (i == 0) {
                                zVar.f194559cd = d;
                            } else if (i == 1) {
                                zVar.f194560ce = d;
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137539a(int i, int i2) {
                        this.f194064C = i;
                        this.f194123aj = i2;
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: c */
                    public final void mo137585c(int i, String str) {
                        boolean z;
                        boolean z2 = false;
                        if (this.f194135av == 4) {
                            this.f194187t.mo137712a("error", 0);
                            z = false;
                        } else {
                            z = true;
                        }
                        if (this.f194135av == 3) {
                            this.f194186s.mo137704a("error");
                            this.f194140b.f194487bK = System.currentTimeMillis();
                        } else {
                            z2 = z;
                        }
                        this.f194135av = 5;
                        if (z2) {
                            this.f194170c.mo137679a();
                        }
                        this.f194140b.f194412P = i;
                        this.f194140b.f194413Q = str;
                        mo137664w(5);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: d */
                    public final void mo137591d(int i, String str) {
                        if (i == 15) {
                            this.f194140b.f194539cJ = str;
                        } else if (i == 53) {
                            this.f194170c.f193978ah = str;
                        } else if (i == 86) {
                            this.f194170c.f194010y = str;
                        }
                    }

                    /* renamed from: a */
                    private void m149425a(int i, boolean z) {
                        if (this.f194140b != null) {
                            if (z) {
                                this.f194138ay = i;
                                if (i == -1002 || i == -1003 || i == -1004 || i == -1005) {
                                    if (this.f194131ar == 0) {
                                        this.f194131ar = SystemClock.elapsedRealtime();
                                    }
                                } else if (i == -2003 || i == -2002) {
                                    this.f194131ar = SystemClock.elapsedRealtime();
                                } else {
                                    this.f194131ar = 0;
                                }
                            } else {
                                this.f194138ay = -2001;
                                this.f194131ar = 0;
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137569b(int i, long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            if (i == 0) {
                                zVar.f194473ax = j;
                            } else if (i == 1) {
                                zVar.f194475az = j;
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137570b(int i, String str) {
                        if (i == 0) {
                            this.f194193z = true;
                        }
                        C86476o oVar = this.f194170c;
                        switch (i) {
                            case 0:
                                oVar.f193947D = "local_url";
                                break;
                            case 1:
                                oVar.f193947D = "dir_url";
                                break;
                            case 2:
                                oVar.f193947D = "playitem";
                                break;
                            case 3:
                                oVar.f193947D = "preload";
                                break;
                            case 4:
                                oVar.f193947D = "feed";
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                oVar.f193947D = "vid";
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                oVar.f193947D = "fd";
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                oVar.f193947D = "mds";
                                break;
                        }
                        oVar.f193946C = str;
                        this.f194125al = 0;
                        if (i == 6 || i == 0) {
                            this.f194138ay = -1005;
                        } else if (i == 1 || i == 4 || i == 2 || i == 3 || i == 7) {
                            this.f194138ay = -1004;
                        } else if (i == 5) {
                            this.f194138ay = -1002;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: c */
                    public final void mo137584c(int i, long j) {
                        if (i == 21) {
                            this.f194139az = j;
                        } else if (i == 56) {
                            this.f194089aA = j;
                        } else if (i == 87) {
                            this.f194140b.f194456ag = j;
                        } else if (i == 88) {
                            this.f194140b.f194652v = j;
                        } else if (i == 98) {
                            this.f194140b.f194543cN = j;
                        } else if (i != 99) {
                            switch (i) {
                                case 66:
                                    this.f194140b.f194635e = j;
                                    return;
                                case 67:
                                    this.f194140b.f194636f = j;
                                    return;
                                case 68:
                                    this.f194140b.f194637g = j;
                                    return;
                                case 69:
                                    this.f194140b.f194638h = j;
                                    return;
                                case 70:
                                    this.f194140b.f194640j = j;
                                    return;
                                case 71:
                                    this.f194140b.f194641k = j;
                                    return;
                                case 72:
                                    this.f194140b.f194645o = j;
                                    return;
                                case 73:
                                    this.f194140b.f194644n = j;
                                    return;
                                case 74:
                                    this.f194140b.f194647q = j;
                                    return;
                                case 75:
                                    this.f194140b.f194646p = j;
                                    return;
                                case 76:
                                    this.f194140b.f194642l = j;
                                    return;
                                case 77:
                                    this.f194140b.f194643m = j;
                                    return;
                                case 78:
                                    this.f194140b.f194639i = j;
                                    return;
                                default:
                                    switch (i) {
                                        case 82:
                                            this.f194140b.f194632dx = j;
                                            return;
                                        case 83:
                                            this.f194140b.f194631dw = j;
                                            return;
                                        case 84:
                                            this.f194140b.f194633dy = j;
                                            return;
                                        case 85:
                                            this.f194140b.f194634dz = j;
                                            return;
                                        default:
                                            return;
                                    }
                            }
                        } else {
                            this.f194140b.f194544cO = j;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137568b(int i, int i2) {
                        Object obj;
                        C86641i.m150110a("VideoEventLoggerV2", "movieStalled, type: ".concat(String.valueOf(i)));
                        if (i == 0) {
                            int i3 = this.f194135av;
                            if (!(i3 == 3 || i3 == 4)) {
                                this.f194135av = 3;
                                int i4 = this.f194174g + 1;
                                this.f194174g = i4;
                                C86489u uVar = this.f194186s;
                                C86641i.m150113b("VideoEventOneEvent", "movieStalled");
                                uVar.f194244c.f194269f = System.currentTimeMillis();
                                uVar.f194244c.f194272i = i2;
                                uVar.f194244c.f194279p = i4;
                                uVar.f194244c.f194264a = "block_net";
                                if (!(uVar.f194242a == null || uVar.f194242a.f193970a == null)) {
                                    uVar.f194244c.f194289z = uVar.f194242a.f193960Q;
                                    uVar.f194244c.f194258B = uVar.f194242a.f193961R;
                                    uVar.f194244c.f194261E = uVar.f194242a.f193976af;
                                    if (!(uVar.f194242a.f193982al == null || (obj = uVar.f194242a.f193982al.get("abr_used")) == null)) {
                                        uVar.f194244c.f194260D = ((Integer) obj).intValue();
                                    }
                                    uVar.f194244c.f194278o = uVar.f194242a.f193970a.mo137290b(56);
                                    Map<String, Long> a = C86470l.m149391a(uVar.f194242a.f193970a.mo137287a(55));
                                    if (a.get("fvl") != null) {
                                        uVar.f194244c.f194274k = a.get("fvl").longValue();
                                    }
                                    if (a.get("fal") != null) {
                                        uVar.f194244c.f194275l = a.get("fal").longValue();
                                    }
                                    if (a.get("dvl") != null) {
                                        uVar.f194244c.f194280q = a.get("dvl").longValue();
                                    }
                                    if (a.get("dal") != null) {
                                        uVar.f194244c.f194282s = a.get("dal").longValue();
                                    }
                                    if (a.get("bvl") != null) {
                                        uVar.f194244c.f194284u = a.get("bvl").longValue();
                                    }
                                    if (a.get("bal") != null) {
                                        uVar.f194244c.f194286w = a.get("bal").longValue();
                                    }
                                    uVar.f194242a.f193972ab = C86476o.m149401d();
                                }
                            }
                            this.f194173f++;
                            if (this.f194135av != 4) {
                                m149425a(-2003, true);
                            }
                        } else if (i == 1) {
                            this.f194171d++;
                            m149425a(-2004, true);
                        }
                        if (this.f194140b != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (this.f194140b.f194465ap <= 0) {
                                this.f194140b.f194465ap = currentTimeMillis;
                            }
                            if (i == 1) {
                                this.f194122ai = currentTimeMillis;
                            }
                            this.f194140b.f194486bJ = currentTimeMillis;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: c */
                    public final void mo137583c(int i, int i2) {
                        if (i == 54) {
                            this.f194160bq.f194206d = i2;
                        } else if (i == 55) {
                            this.f194160bq.f194227y = i2;
                        } else if (i == 59) {
                            this.f194090aC = i2;
                        } else if (i == 60) {
                            this.f194091aD = i2;
                        } else if (i == 62) {
                            this.f194092aE = i2;
                        } else if (i != 100) {
                            boolean z = false;
                            switch (i) {
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                    this.f194096aI = i2;
                                    return;
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                    if (i2 == 1) {
                                        z = true;
                                    }
                                    this.f194097aJ = z;
                                    return;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                    if (i2 == 1) {
                                        z = true;
                                    }
                                    this.f194098aK = z;
                                    return;
                                case ABRConfig.ABR_SELECT_SCENE:
                                    this.f194099aL = i2;
                                    return;
                                default:
                                    switch (i) {
                                        case 16:
                                            this.f194170c.f193950G = i2;
                                            return;
                                        case 17:
                                            C86452ab abVar = this.f194190w;
                                            if (i2 > 0) {
                                                abVar.f193840d = i2;
                                                return;
                                            }
                                            return;
                                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                                            if (i2 != 0) {
                                                this.f194105aR = true;
                                                this.f194190w.mo137492a();
                                                return;
                                            }
                                            this.f194105aR = false;
                                            this.f194190w.mo137495b();
                                            return;
                                        case 19:
                                            C86452ab abVar2 = this.f194190w;
                                            if (i2 > 0) {
                                                abVar2.f193837a = i2;
                                                return;
                                            }
                                            return;
                                        default:
                                            switch (i) {
                                                case 22:
                                                    this.f194111aX = i2;
                                                    return;
                                                case 23:
                                                    this.f194179l = i2;
                                                    return;
                                                case 24:
                                                    this.f194177j = i2;
                                                    return;
                                                case 25:
                                                    this.f194178k = i2;
                                                    return;
                                                case 26:
                                                    this.f194160bq.f194203a = i2;
                                                    return;
                                                case 27:
                                                    this.f194160bq.f194204b = i2;
                                                    return;
                                                default:
                                                    switch (i) {
                                                        case 29:
                                                            this.f194160bq.f194205c = i2;
                                                            return;
                                                        case 30:
                                                            this.f194160bq.f194207e = i2;
                                                            return;
                                                        case 31:
                                                            this.f194160bq.f194208f = i2;
                                                            return;
                                                        case 32:
                                                            this.f194160bq.f194209g = i2;
                                                            return;
                                                        case 33:
                                                            this.f194160bq.f194210h = i2;
                                                            return;
                                                        case 34:
                                                            this.f194160bq.f194211i = i2;
                                                            return;
                                                        case 35:
                                                            this.f194160bq.f194212j = i2;
                                                            return;
                                                        case 36:
                                                            this.f194160bq.f194213k = i2;
                                                            return;
                                                        case 37:
                                                            this.f194160bq.f194214l = i2;
                                                            return;
                                                        case 38:
                                                            this.f194160bq.f194215m = i2;
                                                            return;
                                                        case 39:
                                                            this.f194160bq.f194216n = i2;
                                                            return;
                                                        case 40:
                                                            this.f194160bq.f194217o = i2;
                                                            return;
                                                        case 41:
                                                            this.f194160bq.f194218p = i2;
                                                            return;
                                                        case 42:
                                                            this.f194160bq.f194219q = i2;
                                                            return;
                                                        case 43:
                                                            this.f194160bq.f194220r = i2;
                                                            return;
                                                        case BuildConfig.VERSION_CODE:
                                                            this.f194160bq.f194221s = i2;
                                                            return;
                                                        case 45:
                                                            int i3 = -1;
                                                            HashMap hashMap = new HashMap();
                                                            AbstractC86462f fVar = this.f194088a;
                                                            if (fVar != null) {
                                                                i3 = fVar.mo137292c(67);
                                                            }
                                                            hashMap.put("s", Integer.valueOf(this.f194096aI));
                                                            hashMap.put("p", Integer.valueOf(i3));
                                                            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                                                            this.f194165bv.add(new JSONObject(hashMap).toString());
                                                            return;
                                                        case 46:
                                                            this.f194155bl = i2;
                                                            return;
                                                        case 47:
                                                            this.f194153bj = i2;
                                                            return;
                                                        case 48:
                                                            this.f194154bk = i2;
                                                            return;
                                                        case 49:
                                                            this.f194151bh = i2;
                                                            return;
                                                        case 50:
                                                            this.f194152bi = i2;
                                                            return;
                                                        case 51:
                                                            if (i2 == 1) {
                                                                z = true;
                                                            }
                                                            this.f194107aT = z;
                                                            this.f194170c.f193977ag = z;
                                                            return;
                                                        case 52:
                                                            if (i2 == 1) {
                                                                z = true;
                                                            }
                                                            this.f194108aU = z;
                                                            return;
                                                        default:
                                                            switch (i) {
                                                                case 79:
                                                                    this.f194100aM = i2;
                                                                    return;
                                                                case 80:
                                                                    this.f194101aN = i2;
                                                                    return;
                                                                case 81:
                                                                    this.f194102aO = i2;
                                                                    return;
                                                                default:
                                                                    switch (i) {
                                                                        case 89:
                                                                            this.f194140b.f194593dK = i2;
                                                                            return;
                                                                        case 90:
                                                                            if (i2 > 0) {
                                                                                C86484b bVar = this.f194160bq;
                                                                                bVar.f194222t = i2 | bVar.f194222t;
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 91:
                                                                            this.f194160bq.f194223u = i2;
                                                                            return;
                                                                        case 92:
                                                                            if (i2 > 0) {
                                                                                this.f194160bq.f194224v = i2;
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 93:
                                                                            this.f194160bq.f194225w = i2;
                                                                            return;
                                                                        case 94:
                                                                            this.f194160bq.f194226x = i2;
                                                                            return;
                                                                        case 95:
                                                                            this.f194148be = i2;
                                                                            return;
                                                                        case 96:
                                                                            this.f194160bq.f194228z = i2;
                                                                            return;
                                                                        case 97:
                                                                            this.f194160bq.f194201A = i2;
                                                                            return;
                                                                        default:
                                                                            return;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        } else {
                            this.f194187t.f194319h = i2;
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137542a(int i, long j) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            if (i == 0) {
                                zVar.f194472aw = j;
                            } else if (i == 1) {
                                zVar.f194474ay = j;
                            }
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: b */
                    public final void mo137572b(long j, int i) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194527by = j;
                            this.f194140b.f194502bZ = i;
                            if (this.f194062A && i == 0) {
                                m149425a(-1004, true);
                            }
                        }
                    }

                    public C86481r(Context context, AbstractC86462f fVar, C86464h hVar) {
                        this.f194088a = fVar;
                        this.f194170c = new C86476o(this.f194088a, this.f194104aQ, context);
                        this.f194140b = new C86505z();
                        this.f194187t = new C86497x(this.f194170c);
                        this.f194186s = new C86489u(this.f194170c, this.f194187t);
                        this.f194190w = new C86452ab(this.f194170c);
                        this.f194188u = new C86501y(this.f194170c);
                        this.f194189v = new C86493v(this.f194170c);
                        this.f194191x = new C86472n(this.f194170c);
                        this.f194160bq = new C86484b();
                        this.f194066E = new ArrayList();
                        this.f194067F = new ArrayList<>();
                        this.f194068G = new ArrayList();
                        this.f194069H = new ArrayList();
                        this.f194070I = new ArrayList();
                        this.f194062A = true;
                        this.f194063B = false;
                        this.f194136aw = context;
                        this.f194192y = hVar;
                        this.f194113aZ = new C86471m();
                        this.f194145ba = new C86456ac();
                        this.f194146bb = new C86460e(this.f194136aw);
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137541a(int i, int i2, boolean z) {
                        if (!this.f194062A) {
                            if (!z) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (this.f194135av == 3) {
                                    this.f194186s.mo137704a("seek");
                                    this.f194140b.f194487bK = currentTimeMillis;
                                }
                                if (this.f194135av == 4) {
                                    this.f194187t.mo137712a("seek", 0);
                                }
                                int i3 = this.f194129ap + 1;
                                this.f194129ap = i3;
                                this.f194135av = 4;
                                C86497x xVar = this.f194187t;
                                C86641i.m150113b("VideoEventOneOpera", "brian beginSeek from " + i + " to " + i2);
                                xVar.f194314c.f194333f = System.currentTimeMillis();
                                xVar.f194314c.f194328a = "seek";
                                xVar.f194314c.f194329b = Integer.toString(i);
                                xVar.f194314c.f194330c = Integer.toString(i2);
                                xVar.f194314c.f194331d = 0;
                                xVar.f194314c.f194339l = i3;
                                if (xVar.f194312a != null) {
                                    xVar.f194314c.f194340m = xVar.f194312a.f193960Q;
                                    xVar.f194314c.f194342o = xVar.f194312a.f193961R;
                                }
                                this.f194187t.f194315d = this.f194140b.f194486bJ;
                                this.f194187t.f194316e = this.f194140b.f194487bK;
                                this.f194132as = currentTimeMillis;
                                C86505z zVar = this.f194140b;
                                if (zVar != null) {
                                    zVar.f194484bH = currentTimeMillis;
                                    this.f194140b.f194490bN = i2;
                                }
                                this.f194132as = SystemClock.elapsedRealtime();
                                if (this.f194141bA) {
                                    this.f194188u.mo137717a(i, "seek");
                                    this.f194141bA = false;
                                }
                            }
                            m149425a(-2002, true);
                        }
                    }

                    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86468j
                    /* renamed from: a */
                    public final void mo137540a(int i, int i2, int i3, int i4) {
                        C86505z zVar = this.f194140b;
                        if (zVar != null) {
                            zVar.f194579cx = i;
                            this.f194140b.f194580cy = i2;
                            this.f194140b.f194581cz = i3;
                            this.f194140b.f194530cA = i4;
                        }
                    }
                }
