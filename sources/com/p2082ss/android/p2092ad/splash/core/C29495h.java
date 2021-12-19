package com.p2082ss.android.p2092ad.splash.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.AbstractC29372aa;
import com.p2082ss.android.p2092ad.splash.AbstractC29374b;
import com.p2082ss.android.p2092ad.splash.AbstractC29382c;
import com.p2082ss.android.p2092ad.splash.AbstractC29629d;
import com.p2082ss.android.p2092ad.splash.AbstractC29635e;
import com.p2082ss.android.p2092ad.splash.AbstractC29637f;
import com.p2082ss.android.p2092ad.splash.AbstractC29665g;
import com.p2082ss.android.p2092ad.splash.AbstractC29670k;
import com.p2082ss.android.p2092ad.splash.AbstractC29672m;
import com.p2082ss.android.p2092ad.splash.AbstractC29682t;
import com.p2082ss.android.p2092ad.splash.AbstractC29685w;
import com.p2082ss.android.p2092ad.splash.AbstractC29686x;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b;
import com.p2082ss.android.p2092ad.splash.core.p2104i.C29509e;
import com.p2082ss.android.p2092ad.splash.core.p2104i.C29515h;
import com.p2082ss.android.p2092ad.splash.p2093a.C29370a;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29385c;
import com.p2082ss.android.p2092ad.splash.p2107d.AbstractC29634d;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29659n;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.h */
public class C29495h {

    /* renamed from: A */
    static int f70177A;

    /* renamed from: B */
    public static int f70178B;

    /* renamed from: C */
    public static int f70179C;

    /* renamed from: D */
    public static boolean f70180D = true;

    /* renamed from: E */
    public static volatile boolean f70181E = false;

    /* renamed from: F */
    public static volatile boolean f70182F = false;

    /* renamed from: G */
    static volatile String f70183G;

    /* renamed from: H */
    static volatile String f70184H;

    /* renamed from: I */
    public static volatile String f70185I;

    /* renamed from: J */
    static volatile long f70186J = 864000000;

    /* renamed from: K */
    static volatile boolean f70187K = true;

    /* renamed from: L */
    public static AbstractC29682t f70188L;

    /* renamed from: M */
    public static int f70189M = 0;

    /* renamed from: N */
    static int f70190N = 0;

    /* renamed from: O */
    static int f70191O = 0;

    /* renamed from: P */
    public static boolean f70192P = false;

    /* renamed from: Q */
    static boolean f70193Q = false;

    /* renamed from: R */
    public static volatile AbstractC29634d f70194R;

    /* renamed from: S */
    public static int f70195S;

    /* renamed from: T */
    static boolean f70196T = true;

    /* renamed from: U */
    public static AbstractC29385c f70197U;

    /* renamed from: V */
    static boolean f70198V = false;

    /* renamed from: W */
    static volatile Future f70199W;

    /* renamed from: X */
    public static int f70200X = -1;

    /* renamed from: Y */
    public static boolean f70201Y = true;

    /* renamed from: Z */
    static boolean f70202Z = false;

    /* renamed from: a */
    public static final String f70203a = "200713";

    /* renamed from: aa */
    static boolean f70204aa = false;

    /* renamed from: ab */
    public static long f70205ab = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: ac */
    public static long f70206ac = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: ad */
    static boolean f70207ad = false;

    /* renamed from: ae */
    public static boolean f70208ae = true;

    /* renamed from: af */
    static boolean f70209af = false;

    /* renamed from: ag */
    static boolean f70210ag = false;

    /* renamed from: ah */
    static AbstractC29665g f70211ah;

    /* renamed from: ai */
    static boolean f70212ai = false;

    /* renamed from: aj */
    static boolean f70213aj = false;

    /* renamed from: ak */
    public static boolean f70214ak = false;

    /* renamed from: al */
    static AbstractC29503a f70215al;

    /* renamed from: am */
    public static AbstractC29629d f70216am;

    /* renamed from: an */
    static AbstractC29382c f70217an;

    /* renamed from: ao */
    static AbstractC29637f f70218ao;

    /* renamed from: ap */
    public static int f70219ap = 0;

    /* renamed from: aq */
    public static AbstractC29670k f70220aq;

    /* renamed from: ar */
    static boolean f70221ar = false;

    /* renamed from: as */
    static boolean f70222as = false;

    /* renamed from: at */
    static C29627w f70223at;

    /* renamed from: au */
    private static Handler f70224au = new Handler(Looper.getMainLooper());

    /* renamed from: av */
    private static boolean f70225av = false;

    /* renamed from: b */
    public static AbstractC29672m f70226b;

    /* renamed from: c */
    public static volatile AbstractC29372aa f70227c;

    /* renamed from: d */
    static AbstractC29685w f70228d;

    /* renamed from: e */
    static AbstractC29686x f70229e;

    /* renamed from: f */
    public static ExecutorService f70230f;

    /* renamed from: g */
    static ExecutorService f70231g;

    /* renamed from: h */
    public static ExecutorService f70232h;

    /* renamed from: i */
    public static ExecutorService f70233i;

    /* renamed from: j */
    static long f70234j;

    /* renamed from: k */
    static boolean f70235k = false;

    /* renamed from: l */
    static ConcurrentHashMap<Long, Integer> f70236l;

    /* renamed from: m */
    public static volatile boolean f70237m = false;

    /* renamed from: n */
    static long f70238n;

    /* renamed from: o */
    static C29478f f70239o;

    /* renamed from: p */
    static HashMap<String, String> f70240p;

    /* renamed from: q */
    static AbstractC29374b f70241q;

    /* renamed from: r */
    public static Context f70242r;

    /* renamed from: s */
    public static boolean f70243s = false;

    /* renamed from: t */
    static AbstractC29505b f70244t;

    /* renamed from: u */
    public static AbstractC29635e f70245u;

    /* renamed from: v */
    public static int f70246v;

    /* renamed from: w */
    public static int f70247w;

    /* renamed from: x */
    static boolean f70248x = true;

    /* renamed from: y */
    public static int f70249y;

    /* renamed from: z */
    static int f70250z;

    /* renamed from: d */
    public static ExecutorService m59105d() {
        return f70233i;
    }

    /* renamed from: a */
    public static C29627w m59095a() {
        if (f70223at == null) {
            f70223at = C29627w.m59640a(null);
        }
        return f70223at;
    }

    /* renamed from: b */
    public static C29478f m59102b() {
        if (f70239o == null) {
            f70239o = new C29478f();
        }
        return f70239o;
    }

    /* renamed from: c */
    public static AbstractC29382c m59104c() {
        if (f70217an == null) {
            f70217an = new AbstractC29382c() {
                /* class com.p2082ss.android.p2092ad.splash.core.C29495h.C294961 */

                static {
                    Covode.recordClassIndex(35890);
                }
            };
        }
        return f70217an;
    }

    /* renamed from: h */
    public static AbstractC29503a m59109h() {
        if (f70215al == null) {
            f70215al = new AbstractC29503a.C29504a();
        }
        return f70215al;
    }

    /* renamed from: k */
    public static void m59112k() {
        C29644g.m59688b("UDPClient. setIsFirstTimeRequestAd: false");
        f70196T = false;
    }

    /* renamed from: e */
    public static String m59106e() {
        if (!m59095a().f70655c) {
            return m59107f();
        }
        String str = f70183G;
        if (TextUtils.isEmpty(str)) {
            str = m59113l();
        }
        return m59096a(str);
    }

    /* renamed from: f */
    public static String m59107f() {
        if (TextUtils.isEmpty(f70184H)) {
            return m59096a(m59113l());
        }
        return m59096a(f70184H);
    }

    /* renamed from: i */
    public static HashMap<String, String> m59110i() {
        AbstractC29374b bVar;
        if (f70240p == null && (bVar = f70241q) != null) {
            f70240p = bVar.mo28666a();
        }
        return f70240p;
    }

    /* renamed from: j */
    public static String m59111j() {
        String str;
        C29478f fVar = f70239o;
        if (fVar != null) {
            str = fVar.mo51566d();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return C29556v.m59363a().f70433b.getString("splash_ad_did", "");
        }
        return str;
    }

    /* renamed from: l */
    private static String m59113l() {
        return m59103b(f70242r).getAbsolutePath() + "/splashCache/";
    }

    /* renamed from: g */
    public static AbstractC29505b m59108g() {
        MethodCollector.m26663i(12737);
        if (f70244t == null) {
            synchronized (C29495h.class) {
                try {
                    if (f70244t == null) {
                        f70244t = new C29509e(f70242r, new C29515h(f70242r));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12737);
                    throw th;
                }
            }
        }
        AbstractC29505b bVar = f70244t;
        MethodCollector.m26664o(12737);
        return bVar;
    }

    static {
        Covode.recordClassIndex(35889);
    }

    /* renamed from: a */
    public static void m59097a(int i) {
        f70219ap = i | f70219ap;
    }

    /* renamed from: a */
    private static String m59096a(String str) {
        if (str.endsWith(File.separator)) {
            return str;
        }
        return str + File.separator;
    }

    /* renamed from: b */
    private static File m59103b(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    public static void m59098a(long j) {
        f70236l.remove(Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m59100a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        f70242r = applicationContext;
    }

    /* renamed from: a */
    public static void m59101a(AbstractC29665g gVar) {
        if (f70239o == null) {
            f70239o = new C29478f();
        }
        f70211ah = gVar;
    }

    /* renamed from: a */
    public static void m59099a(final long j, final String str, final String str2, final JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            long optLong = jSONObject.optLong("ad_fetch_time", 0);
            if (optLong != 0) {
                try {
                    optJSONObject.putOpt("ad_fetch_time", Long.valueOf(optLong));
                } catch (JSONException unused) {
                    C29644g.m59686a("error in transferring ad fetch time");
                }
            }
            optJSONObject.putOpt("current_time", C29659n.m59765a(System.currentTimeMillis()));
            jSONObject.putOpt("ad_extra_data", optJSONObject);
            jSONObject.put("is_ad_event", "1");
            if (!f70225av) {
                jSONObject.put("category", "event_v1");
            }
        }
        if (f70225av) {
            C29370a.C29371a aVar = new C29370a.C29371a();
            aVar.f69740g = jSONObject;
            aVar.f69737d = j;
            aVar.f69736c = str2;
            aVar.f69735b = str;
            aVar.f69734a = "event_v3";
            final C29370a a = aVar.mo51352a();
            if (m59095a().f70658f) {
                f70232h.execute(new Runnable() {
                    /* class com.p2082ss.android.p2092ad.splash.core.C29495h.RunnableC294972 */

                    static {
                        Covode.recordClassIndex(35891);
                    }

                    public final void run() {
                    }
                });
            } else {
                f70224au.post(new Runnable() {
                    /* class com.p2082ss.android.p2092ad.splash.core.C29495h.RunnableC294983 */

                    static {
                        Covode.recordClassIndex(35892);
                    }

                    public final void run() {
                    }
                });
            }
        } else if (m59095a().f70658f) {
            f70232h.execute(new Runnable() {
                /* class com.p2082ss.android.p2092ad.splash.core.C29495h.RunnableC294994 */

                static {
                    Covode.recordClassIndex(35893);
                }

                public final void run() {
                    if (C29495h.f70226b != null) {
                        C29495h.f70226b.mo28691a(str, str2, j, jSONObject);
                    }
                }
            });
        } else {
            f70224au.post(new Runnable() {
                /* class com.p2082ss.android.p2092ad.splash.core.C29495h.RunnableC295005 */

                static {
                    Covode.recordClassIndex(35894);
                }

                public final void run() {
                    if (C29495h.f70226b != null) {
                        C29495h.f70226b.mo28691a(str, str2, j, jSONObject);
                    }
                }
            });
        }
    }
}
