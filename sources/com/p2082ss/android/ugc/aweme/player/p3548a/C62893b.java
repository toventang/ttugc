package com.p2082ss.android.ugc.aweme.player.p3548a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.player.C62956e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.video.simplayer.p4227c.C80999b;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.playerkit.model.C84227x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.player.a.b */
public final class C62893b {

    /* renamed from: O */
    public static final int f142630O = 1;

    /* renamed from: P */
    public static final int f142631P = 2;

    /* renamed from: Q */
    public static final int f142632Q = 3;

    /* renamed from: R */
    public static final String f142633R = "X-Cache-Remote";

    /* renamed from: S */
    public static final String f142634S = "Server-Timing";

    /* renamed from: T */
    public static final String f142635T = "ttfb";

    /* renamed from: U */
    public static final String f142636U = "socket_reuse";

    /* renamed from: V */
    public static final int f142637V = 50;

    /* renamed from: W */
    public static final int f142638W = 200;

    /* renamed from: X */
    public static final int f142639X = 300;

    /* renamed from: Y */
    public static final int f142640Y = 5;

    /* renamed from: Z */
    public static final int f142641Z = 20;

    /* renamed from: aa */
    public static final int f142642aa = 15;

    /* renamed from: ab */
    public static int f142643ab;

    /* renamed from: ac */
    public static String f142644ac;

    /* renamed from: ad */
    public static final C62896c f142645ad = new C62896c((byte) 0);

    /* renamed from: A */
    public long f142646A;

    /* renamed from: B */
    public long f142647B;

    /* renamed from: C */
    public long f142648C;

    /* renamed from: D */
    public long f142649D;

    /* renamed from: E */
    public C80999b f142650E;

    /* renamed from: F */
    public boolean f142651F;

    /* renamed from: G */
    public int f142652G;

    /* renamed from: H */
    public String f142653H = "";

    /* renamed from: I */
    public JSONObject f142654I;

    /* renamed from: J */
    public int f142655J;

    /* renamed from: K */
    public int f142656K;

    /* renamed from: L */
    public float f142657L = -1.0f;

    /* renamed from: M */
    public float f142658M = -1.0f;

    /* renamed from: N */
    public boolean f142659N;

    /* renamed from: a */
    public Aweme f142660a;

    /* renamed from: b */
    public Integer f142661b;

    /* renamed from: c */
    public boolean f142662c;

    /* renamed from: d */
    public boolean f142663d;

    /* renamed from: e */
    public String f142664e;

    /* renamed from: f */
    public boolean f142665f;

    /* renamed from: g */
    public List<C84224v> f142666g;

    /* renamed from: h */
    public List<C84227x> f142667h;

    /* renamed from: i */
    public int f142668i;

    /* renamed from: j */
    public float f142669j;

    /* renamed from: k */
    public long f142670k;

    /* renamed from: l */
    public long f142671l;

    /* renamed from: m */
    public int f142672m;

    /* renamed from: n */
    public long f142673n;

    /* renamed from: o */
    public ArrayList<Aweme> f142674o;

    /* renamed from: p */
    public AbstractC63042j.C63048f f142675p;

    /* renamed from: q */
    public int f142676q;

    /* renamed from: r */
    public long f142677r;

    /* renamed from: s */
    public int f142678s;

    /* renamed from: t */
    public long f142679t;

    /* renamed from: u */
    public HashMap<String, String> f142680u;

    /* renamed from: v */
    public String f142681v;

    /* renamed from: w */
    public String f142682w;

    /* renamed from: x */
    public long f142683x;

    /* renamed from: y */
    public long f142684y;

    /* renamed from: z */
    public long f142685z;

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$c */
    public static final class C62896c {
        static {
            Covode.recordClassIndex(73731);
        }

        private C62896c() {
        }

        public /* synthetic */ C62896c(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(73728);
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$b */
    public static final class C62895b {

        /* renamed from: a */
        public String f142687a;

        /* renamed from: b */
        public String f142688b;

        /* renamed from: c */
        public int f142689c;

        /* renamed from: d */
        public int f142690d;

        /* renamed from: e */
        public String f142691e;

        /* renamed from: f */
        public long f142692f;

        /* renamed from: g */
        public long f142693g;

        /* renamed from: h */
        public int f142694h;

        /* renamed from: i */
        public int f142695i = -1;

        /* renamed from: j */
        public int f142696j;

        /* renamed from: k */
        public String f142697k;

        /* renamed from: l */
        public long f142698l;

        /* renamed from: m */
        public long f142699m;

        /* renamed from: n */
        public Integer f142700n = 0;

        /* renamed from: o */
        public Integer f142701o = 0;

        static {
            Covode.recordClassIndex(73730);
        }

        /* renamed from: a */
        public final JSONObject mo100873a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ip", C62956e.m113377a(this.f142687a, C62893b.f142642aa));
            jSONObject.put("host", C62956e.m113377a(this.f142688b, C62893b.f142641Z));
            jSONObject.put("hit_code", this.f142689c);
            jSONObject.put("hit_code_l2", this.f142690d);
            if (this.f142689c == 0) {
                jSONObject.put("cdn_hit_str", this.f142691e);
            }
            jSONObject.put("rsp_time", this.f142692f);
            jSONObject.put("cache_size", this.f142693g);
            jSONObject.put("url_idx", this.f142695i);
            jSONObject.put("status_code", this.f142694h);
            jSONObject.put("dl_duration", this.f142699m);
            jSONObject.put("dl_size", this.f142698l);
            return jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$e */
    public static final class CallableC62898e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C62893b f142724a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f142725b;

        static {
            Covode.recordClassIndex(73733);
        }

        public CallableC62898e(C62893b bVar, C89233z.C89238e eVar) {
            this.f142724a = bVar;
            this.f142725b = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:195:0x046c, code lost:
            if (r0.f181065c >= 0) goto L_0x046e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x026e  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01e7 A[Catch:{ all -> 0x059c }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01ee A[Catch:{ all -> 0x059c }] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01f1 A[Catch:{ all -> 0x059c }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x020b A[Catch:{ all -> 0x059c }] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 1445
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.p3548a.C62893b.CallableC62898e.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$a */
    public static final class C62894a {

        /* renamed from: a */
        public C62893b f142686a = new C62893b();

        static {
            Covode.recordClassIndex(73729);
        }

        /* renamed from: a */
        public final C62894a mo100872a(int i) {
            this.f142686a.f142668i = i;
            return this;
        }
    }

    /* renamed from: b */
    public static int m113290b(Map<String, String> map) {
        if (map != null) {
            String str = f142633R;
            if (map.containsKey(str)) {
                return C62899c.m113294a(map.get(str));
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m113289a(Map<String, String> map) {
        if (map != null) {
            if (map.containsKey("X-Cache")) {
                return C62899c.m113294a(map.get("X-Cache"));
            }
            if (map.containsKey("X-M-Cache")) {
                return C62899c.m113294a(map.get("X-M-Cache"));
            }
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$d */
    public static final class C62897d {

        /* renamed from: a */
        public String f142702a;

        /* renamed from: b */
        public ArrayList<C62895b> f142703b;

        /* renamed from: c */
        public ArrayList<C84224v> f142704c;

        /* renamed from: d */
        public String f142705d;

        /* renamed from: e */
        public boolean f142706e;

        /* renamed from: f */
        public String f142707f;

        /* renamed from: g */
        public int f142708g;

        /* renamed from: h */
        public int f142709h;

        /* renamed from: i */
        public int f142710i;

        /* renamed from: j */
        public float f142711j;

        /* renamed from: k */
        public long f142712k;

        /* renamed from: l */
        public long f142713l;

        /* renamed from: m */
        public int f142714m;

        /* renamed from: n */
        public long f142715n;

        /* renamed from: o */
        public String f142716o;

        /* renamed from: p */
        public int f142717p;

        /* renamed from: q */
        public long f142718q;

        /* renamed from: r */
        public boolean f142719r;

        /* renamed from: s */
        public ArrayList<Integer> f142720s;

        /* renamed from: t */
        public ArrayList<Aweme> f142721t;

        /* renamed from: u */
        public AbstractC63042j.C63048f f142722u;

        /* renamed from: v */
        public HashMap<String, String> f142723v;

        static {
            Covode.recordClassIndex(73732);
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x02aa  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x02ba  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x02ca  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x02da  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x02ea  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x02fa  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x030a  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x032b  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x0338  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x037a  */
        /* JADX WARNING: Removed duplicated region for block: B:175:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0243  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0266  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0274  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x029a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo100874a(org.json.JSONObject r17) {
            /*
            // Method dump skipped, instructions count: 944
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.p3548a.C62893b.C62897d.mo100874a(org.json.JSONObject):void");
        }
    }
}
