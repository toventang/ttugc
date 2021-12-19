package com.bytedance.sdk.p1625a.p1643f;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22294b;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22313d;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1626a.C22287a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22298d;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22304j;
import com.bytedance.sdk.p1625a.p1626a.p1629c.AbstractC22309a;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22319f;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22322i;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22327n;
import com.bytedance.sdk.p1625a.p1643f.C22375e;
import com.bytedance.sdk.p1625a.p1644g.C22404m;
import com.bytedance.sdk.p1625a.p1645h.p1646a.AbstractC22413h;
import com.bytedance.sdk.p1625a.p1657l.C22480a;
import com.bytedance.sdk.p1625a.p1657l.p1658a.AbstractC22484a;
import com.bytedance.sdk.p1625a.p1657l.p1659b.AbstractC22487a;
import com.bytedance.sdk.p1625a.p1657l.p1660c.C22490b;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.C29845d;
import com.p2082ss.android.account.C29346c;
import com.p2082ss.android.account.C29351f;
import com.p2082ss.android.account.p2089b.C29345a;
import com.p2082ss.android.token.C30627c;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.token.C30629e;
import com.p2082ss.android.token.C30630f;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.f.e */
public class C22375e implements WeakHandler.IHandler, AbstractC22313d {

    /* renamed from: a */
    static final C29345a f52856a;

    /* renamed from: al */
    private static List<AbstractC22379a> f52857al = new ArrayList();

    /* renamed from: b */
    static final C29345a f52858b;

    /* renamed from: c */
    static final C29345a f52859c;

    /* renamed from: d */
    static final C29345a f52860d;

    /* renamed from: e */
    static final C29345a f52861e;

    /* renamed from: f */
    static final C29345a f52862f;

    /* renamed from: g */
    static final C29345a f52863g;

    /* renamed from: h */
    static final C29345a f52864h;

    /* renamed from: i */
    static final C29345a f52865i;

    /* renamed from: j */
    static final C29345a f52866j;

    /* renamed from: k */
    public static C29345a[] f52867k;

    /* renamed from: x */
    private static volatile AbstractC22313d f52868x;

    /* renamed from: A */
    private String f52869A = "";

    /* renamed from: B */
    private String f52870B = "";

    /* renamed from: C */
    private int f52871C;

    /* renamed from: D */
    private String f52872D = "";

    /* renamed from: E */
    private String f52873E = "";

    /* renamed from: F */
    private int f52874F;

    /* renamed from: G */
    private String f52875G = "";

    /* renamed from: H */
    private int f52876H;

    /* renamed from: I */
    private int f52877I;

    /* renamed from: J */
    private boolean f52878J;

    /* renamed from: K */
    private boolean f52879K;

    /* renamed from: L */
    private String f52880L = "";

    /* renamed from: M */
    private String f52881M = "";

    /* renamed from: N */
    private String f52882N = "";

    /* renamed from: O */
    private String f52883O = "";

    /* renamed from: P */
    private int f52884P;

    /* renamed from: Q */
    private int f52885Q;

    /* renamed from: R */
    private int f52886R;

    /* renamed from: S */
    private String f52887S = "";

    /* renamed from: T */
    private long f52888T;

    /* renamed from: U */
    private String f52889U = "";

    /* renamed from: V */
    private boolean f52890V;

    /* renamed from: W */
    private String f52891W = "";

    /* renamed from: X */
    private String f52892X = "";

    /* renamed from: Y */
    private int f52893Y;

    /* renamed from: Z */
    private boolean f52894Z;

    /* renamed from: aa */
    private boolean f52895aa;

    /* renamed from: ab */
    private boolean f52896ab;

    /* renamed from: ac */
    private long f52897ac;

    /* renamed from: ad */
    private String f52898ad = "";

    /* renamed from: ae */
    private String f52899ae = "";

    /* renamed from: af */
    private boolean f52900af;

    /* renamed from: ag */
    private Set<String> f52901ag;

    /* renamed from: ah */
    private boolean f52902ah;

    /* renamed from: ai */
    private final C29345a[] f52903ai;

    /* renamed from: aj */
    private boolean f52904aj;

    /* renamed from: ak */
    private C13605d<AbstractC22294b> f52905ak = new C13605d<>();

    /* renamed from: l */
    protected AbstractC22329e f52906l;

    /* renamed from: m */
    public long f52907m;

    /* renamed from: n */
    public String f52908n;

    /* renamed from: o */
    public String f52909o = "";

    /* renamed from: p */
    public int f52910p;

    /* renamed from: q */
    public int f52911q;

    /* renamed from: r */
    public int f52912r;

    /* renamed from: s */
    public int f52913s;

    /* renamed from: t */
    C22507a f52914t;

    /* renamed from: u */
    Context f52915u;

    /* renamed from: v */
    public final WeakHandler f52916v = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: w */
    private final int f52917w = 1000;

    /* renamed from: y */
    private String f52918y = "";

    /* renamed from: z */
    private String f52919z = "";

    /* renamed from: com.bytedance.sdk.a.f.e$a */
    interface AbstractC22379a {
        static {
            Covode.recordClassIndex(26195);
        }

        /* renamed from: a */
        void mo36735a(C22289b bVar);
    }

    /* renamed from: com.bytedance.sdk.a.f.e$b */
    static class C22380b implements AbstractC22379a {
        static {
            Covode.recordClassIndex(26196);
        }

        private C22380b() {
        }

        /* synthetic */ C22380b(byte b) {
            this();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
            if (r3.equals("user_logout") == false) goto L_0x0041;
         */
        @Override // com.bytedance.sdk.p1625a.p1643f.C22375e.AbstractC22379a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo36735a(com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b r7) {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.p1625a.p1643f.C22375e.C22380b.mo36735a(com.bytedance.sdk.a.a.a.b):void");
        }
    }

    /* renamed from: com.bytedance.sdk.a.f.e$c */
    static class C22381c implements AbstractC22379a {
        static {
            Covode.recordClassIndex(26197);
        }

        private C22381c() {
        }

        /* synthetic */ C22381c(byte b) {
            this();
        }

        @Override // com.bytedance.sdk.p1625a.p1643f.C22375e.AbstractC22379a
        /* renamed from: a */
        public final void mo36735a(C22289b bVar) {
            C22507a aVar;
            Context b = C29351f.m58781a().mo52210b();
            if (bVar instanceof C22292e) {
                C22507a aVar2 = ((C22292e) bVar).f52724j;
                if (aVar2 != null && (aVar2 instanceof C22507a)) {
                    C22375e.m42171a(b).mo36616a(aVar2, true);
                }
            } else if (bVar instanceof C22291d) {
                T t = ((C22291d) bVar).f52723j;
                if (t instanceof AbstractC22413h) {
                    C22375e.m42171a(b).mo36616a(((AbstractC22413h) t).mo36628b(), true);
                }
            } else if ((bVar instanceof C22322i) && (aVar = ((C22322i) bVar).f52765j) != null && (aVar instanceof C22507a)) {
                C22375e.m42171a(b).mo36616a(aVar, true);
            }
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: a */
    public final String mo36612a() {
        return this.f52892X;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: b */
    public final boolean mo36622b() {
        return this.f52895aa;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: c */
    public final String mo36623c() {
        return this.f52889U;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: d */
    public final C22507a mo36625d() {
        return this.f52914t;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: f */
    public final String mo36627f() {
        return this.f52908n;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: a */
    public final void mo36619a(boolean z) {
        this.f52895aa = z;
        SharedPreferences.Editor edit = C34822d.m71158a(this.f52915u, "com.bytedance.sdk.account_setting", 0).edit();
        edit.putBoolean("is_login", this.f52895aa);
        edit.apply();
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: a */
    public final void mo36618a(String str, final AbstractC22298d dVar) {
        if (!this.f52895aa) {
            mo36734g();
            return;
        }
        AbstractC22329e eVar = this.f52906l;
        if (eVar != null) {
            eVar.mo36635a(str, new AbstractC22298d() {
                /* class com.bytedance.sdk.p1625a.p1643f.C22375e.C223761 */

                static {
                    Covode.recordClassIndex(26192);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: e */
                public final /* synthetic */ void mo36686e(C22319f fVar) {
                    AbstractC22298d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo36686e(fVar);
                    }
                    C22375e.this.mo36734g();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* synthetic */ void mo36681a(C22319f fVar, int i) {
                    AbstractC22298d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo36681a(fVar, i);
                    }
                    C22375e.this.mo36734g();
                }
            });
        }
    }

    /* renamed from: g */
    public final void mo36734g() {
        if (this.f52916v != null) {
            long j = 600000;
            if (C29351f.f69672b != null) {
                j = C29351f.f69672b.f71344a;
            }
            this.f52916v.sendEmptyMessageDelayed(1000, j);
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: e */
    public final void mo36626e() {
        mo36619a(true);
        if (this.f52906l != null) {
            final String a = C30630f.f73196a.mo54900a(false, true);
            if (!TextUtils.isEmpty(a)) {
                C22404m.m42281a(this.f52915u, a, new AbstractC22304j() {
                    /* class com.bytedance.sdk.p1625a.p1643f.C22375e.C223783 */

                    static {
                        Covode.recordClassIndex(26194);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                    @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                    /* renamed from: e */
                    public final /* bridge */ /* synthetic */ void mo36686e(C22327n nVar) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                    @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                    /* renamed from: a */
                    public final /* synthetic */ void mo36681a(C22327n nVar, int i) {
                        String str;
                        C22327n nVar2 = nVar;
                        if (nVar2 == null) {
                            str = "";
                        } else if ("session_expired".equalsIgnoreCase(nVar2.f52768j)) {
                            String str2 = a;
                            if (C30628d.f73193a) {
                                C30630f.f73196a.mo54902a(str2, (List<C30627c>) null, true);
                                return;
                            }
                            return;
                        } else {
                            str = nVar2.f52717f;
                        }
                        C30629e.m62925a("tt_token_beat", i, str);
                    }
                }).mo36736d();
            }
        }
    }

    static {
        Covode.recordClassIndex(26191);
        C29345a aVar = new C29345a("mobile");
        f52856a = aVar;
        C29345a aVar2 = new C29345a("email");
        f52858b = aVar2;
        C29345a aVar3 = new C29345a("google");
        f52859c = aVar3;
        C29345a aVar4 = new C29345a("facebook");
        f52860d = aVar4;
        C29345a aVar5 = new C29345a("twitter");
        f52861e = aVar5;
        C29345a aVar6 = new C29345a("instagram");
        f52862f = aVar6;
        C29345a aVar7 = new C29345a("line");
        f52863g = aVar7;
        C29345a aVar8 = new C29345a("kakaotalk");
        f52864h = aVar8;
        C29345a aVar9 = new C29345a("vk");
        f52865i = aVar9;
        C29345a aVar10 = new C29345a("tiktok");
        f52866j = aVar10;
        f52867k = new C29345a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
    }

    /* renamed from: i */
    private C29346c m42179i() {
        C29346c cVar = new C29346c();
        cVar.f53210a = this.f52888T;
        cVar.f53214e = this.f52894Z;
        cVar.f53215f = this.f52892X;
        cVar.f69616p = this.f52881M;
        cVar.f69648L = this.f52874F;
        cVar.f69659s = this.f52882N;
        cVar.f69660t = this.f52891W;
        cVar.f69618r = this.f52919z;
        cVar.f69651O = this.f52870B;
        cVar.f69650N = this.f52890V;
        cVar.f69652P = this.f52918y;
        cVar.f69653Q = this.f52875G;
        cVar.f69666z = this.f52887S;
        cVar.f69617q = this.f52872D;
        cVar.f69664x = this.f52878J;
        cVar.f69665y = this.f52883O;
        cVar.f69638B = this.f52871C;
        cVar.f69639C = this.f52884P;
        cVar.f69646J = this.f52869A;
        cVar.f69642F = this.f52911q;
        cVar.f69643G = this.f52912r;
        cVar.f69644H = this.f52913s;
        cVar.f69645I = this.f52907m;
        cVar.f53217h = this.f52873E;
        cVar.f69637A = this.f52909o;
        cVar.f69647K = this.f52910p;
        cVar.f69641E = this.f52886R;
        cVar.f69640D = this.f52885Q;
        cVar.f69655S = this.f52876H;
        cVar.f69654R = this.f52877I;
        cVar.f69656T = this.f52879K;
        cVar.f69657U = this.f52896ab;
        cVar.f69662v = this.f52898ad;
        cVar.f69661u = this.f52907m;
        cVar.f69663w = this.f52899ae;
        cVar.f53213d = this.f52893Y;
        cVar.f53218i = this.f52889U;
        cVar.f53220k = this.f52900af;
        cVar.f53221l = this.f52902ah;
        C29345a[] aVarArr = this.f52903ai;
        for (C29345a aVar : aVarArr) {
            if (!TextUtils.isEmpty(aVar.f69626b) && aVar.f69627c) {
                cVar.f53211b.put(aVar.f69626b, aVar);
            }
        }
        return cVar;
    }

    /* renamed from: h */
    private void m42178h() {
        SharedPreferences.Editor edit = C34822d.m71158a(this.f52915u, "com.bytedance.sdk.account_setting", 0).edit();
        m42173a(edit);
        edit.remove("session");
        edit.putBoolean("is_login", this.f52895aa);
        edit.putLong("user_id", this.f52888T);
        edit.putString("sec_user_id", this.f52889U);
        edit.putString("session_key", this.f52892X);
        edit.putString("user_name", this.f52881M);
        edit.putString("verified_content", this.f52891W);
        edit.putInt("user_gender", this.f52874F);
        edit.putString("screen_name", this.f52882N);
        edit.putBoolean("user_verified", this.f52890V);
        edit.putString("avatar_url", this.f52919z);
        edit.putBoolean("is_new_user", this.f52894Z);
        edit.putString("user_email", this.f52873E);
        edit.putString("user_mobile", this.f52880L);
        edit.putInt("is_blocked", this.f52876H);
        edit.putInt("is_blocking", this.f52877I);
        edit.putBoolean("is_toutiao", this.f52879K);
        edit.putBoolean("user_has_pwd", this.f52896ab);
        edit.putInt("country_code", this.f52893Y);
        edit.putString("area", this.f52918y);
        edit.putString("user_industry", this.f52875G);
        edit.putString("user_decoration", this.f52887S);
        edit.putString("user_birthday", this.f52870B);
        edit.putLong("pgc_mediaid", this.f52897ac);
        edit.putString("pgc_avatar_url", this.f52898ad);
        edit.putString("pgc_name", this.f52899ae);
        edit.putString("user_description", this.f52872D);
        edit.putBoolean("is_recommend_allowed", this.f52878J);
        edit.putString("recommend_hint_message", this.f52883O);
        edit.putInt("can_be_found_by_phone", this.f52871C);
        edit.putInt("can_sync_share", this.f52884P);
        edit.putInt("following_count", this.f52911q);
        edit.putInt("followers_count", this.f52912r);
        edit.putInt("visitors_count", this.f52913s);
        edit.putLong("media_id", this.f52907m);
        edit.putString("bg_img_url", this.f52869A);
        edit.putInt("display_ocr_entrance", this.f52910p);
        edit.putString("user_auth_info", this.f52909o);
        edit.putInt("user_privacy_extend", this.f52885Q);
        edit.putInt("user_privacy_extend_value", this.f52886R);
        edit.putBoolean("is_visitor_account", this.f52900af);
        edit.putBoolean("is_kids_mode", this.f52902ah);
        C13611a.m24460a(edit);
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: a */
    public final void mo36615a(C22507a aVar) {
        this.f52914t = aVar;
        mo36616a(aVar, false);
    }

    /* renamed from: b */
    private static Context m42175b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: a */
    public final void mo36617a(String str) {
        mo36618a(str, (AbstractC22298d) null);
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: b */
    public final void mo36620b(String str) {
        this.f52908n = str;
        C34822d.m71158a(this.f52915u, "com.bytedance.sdk.account_setting", 0).edit().putString("multi_sids", str).apply();
    }

    /* renamed from: a */
    public static AbstractC22313d m42171a(Context context) {
        MethodCollector.m26663i(3642);
        if (f52868x == null) {
            synchronized (C22375e.class) {
                try {
                    if (f52868x == null) {
                        f52868x = new C22375e(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3642);
                    throw th;
                }
            }
        }
        C22375e eVar = (C22375e) f52868x;
        if (!((eVar.f52915u instanceof Application) || context == null || m42175b(context) == null)) {
            eVar.f52915u = m42175b(context);
        }
        AbstractC22313d dVar = f52868x;
        MethodCollector.m26664o(3642);
        return dVar;
    }

    /* renamed from: c */
    private void m42177c(boolean z) {
        MethodCollector.m26663i(3688);
        C22287a aVar = new C22287a(0);
        aVar.f52709b = z;
        synchronized (this.f52905ak) {
            try {
                Iterator<AbstractC22294b> it = this.f52905ak.iterator();
                while (it.hasNext()) {
                    it.next().mo36607a(aVar);
                }
            } finally {
                MethodCollector.m26664o(3688);
            }
        }
    }

    /* renamed from: b */
    private boolean m42176b(C22507a aVar) {
        C29345a[] aVarArr = this.f52903ai;
        boolean z = false;
        for (C29345a aVar2 : aVarArr) {
            C29345a aVar3 = aVar.f53211b.get(aVar2.f69626b);
            if (aVar3 == null) {
                if (aVar2.f69627c) {
                    z = true;
                }
                aVar2.mo51308a();
            } else {
                if (!aVar2.f69627c) {
                    aVar2.f69627c = true;
                    z = true;
                }
                aVar2.f69634j = aVar3.f69634j;
                aVar2.f69635k = aVar3.f69635k;
                aVar2.f69628d = aVar3.f69628d;
                aVar2.f69629e = aVar3.f69629e;
                aVar2.f69630f = aVar3.f69630f;
                aVar2.f69636l = aVar3.f69636l;
                aVar2.f69633i = aVar3.f69633i;
                aVar2.f69631g = aVar3.f69631g;
            }
        }
        return z;
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: a */
    public final void mo36613a(C22287a aVar) {
        MethodCollector.m26663i(3424);
        synchronized (this.f52905ak) {
            try {
                Iterator<AbstractC22294b> it = this.f52905ak.iterator();
                while (it.hasNext()) {
                    AbstractC22294b next = it.next();
                    if (next != null) {
                        next.mo36607a(aVar);
                    }
                }
            } finally {
                MethodCollector.m26664o(3424);
            }
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: c */
    public final void mo36624c(String str) {
        if (this.f52901ag == null) {
            this.f52901ag = new HashSet();
        }
        this.f52901ag.add(str);
        C34822d.m71158a(this.f52915u, "com.bytedance.sdk.account_setting", 0).edit().putStringSet("has_update_sec_uids", this.f52901ag).apply();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 100 && (message.obj instanceof C22391k)) {
            C22391k kVar = (C22391k) message.obj;
            if (kVar.f52942b != null) {
                T t = kVar.f52942b;
                for (AbstractC22379a aVar : f52857al) {
                    aVar.mo36735a(t);
                }
                if (kVar.f52941a != null) {
                    AbstractC22288a aVar2 = kVar.f52941a;
                    T t2 = kVar.f52942b;
                    if (!aVar2.f52711a) {
                        aVar2.mo36605a(t2);
                    }
                    AbstractC22309a aVar3 = aVar2.f52853b;
                    if (aVar3 != null) {
                        aVar3.mo36608a();
                    }
                }
            }
        }
        if (message.what == 1000) {
            this.f52916v.removeMessages(1000);
            mo36618a("polling", (AbstractC22298d) null);
        }
    }

    /* renamed from: a */
    private void m42173a(SharedPreferences.Editor editor) {
        C29345a[] aVarArr = this.f52903ai;
        for (C29345a aVar : aVarArr) {
            if (!this.f52895aa) {
                editor.putString("_platform_" + aVar.f69626b, "");
            } else if (aVar.f69627c) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mName", aVar.f69626b);
                    jSONObject.put("mNickname", aVar.f69628d);
                    jSONObject.put("mAvatar", aVar.f69629e);
                    jSONObject.put("mPlatformUid", aVar.f69630f);
                    jSONObject.put("mExpire", aVar.f69634j);
                    jSONObject.put("mExpireIn", aVar.f69635k);
                    jSONObject.put("isLogin", aVar.f69627c);
                    jSONObject.put("mUserId", aVar.f69636l);
                    jSONObject.put("mModifyTime", aVar.f69633i);
                    jSONObject.put("mSecPlatformUid", aVar.f69631g);
                    editor.putString("_platform_" + aVar.f69626b, jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        }
        editor.apply();
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: b */
    public final void mo36621b(boolean z) {
        MethodCollector.m26663i(3540);
        if (this.f52895aa) {
            this.f52894Z = false;
            this.f52895aa = false;
            this.f52888T = 0;
            this.f52892X = "";
            this.f52889U = "";
            m42172a(0, "");
            this.f52881M = "";
            this.f52874F = 0;
            this.f52882N = "";
            this.f52891W = "";
            this.f52872D = "";
            this.f52918y = "";
            this.f52875G = "";
            this.f52876H = 0;
            this.f52877I = 0;
            this.f52887S = "";
            this.f52870B = "";
            this.f52890V = false;
            this.f52878J = false;
            this.f52879K = false;
            this.f52893Y = 0;
            this.f52911q = 0;
            this.f52912r = 0;
            this.f52913s = 0;
            this.f52896ab = false;
            this.f52907m = 0;
            this.f52869A = "";
            this.f52873E = "";
            this.f52880L = "";
            this.f52910p = 0;
            this.f52898ad = "";
            this.f52897ac = 0;
            this.f52899ae = "";
            this.f52909o = "";
            this.f52900af = false;
            for (C29345a aVar : this.f52903ai) {
                aVar.mo51308a();
            }
            m42178h();
        }
        if (z) {
            C22287a aVar2 = new C22287a(2);
            aVar2.f52709b = false;
            synchronized (this.f52905ak) {
                try {
                    Iterator<AbstractC22294b> it = this.f52905ak.iterator();
                    while (it.hasNext()) {
                        it.next().mo36607a(aVar2);
                    }
                } finally {
                    MethodCollector.m26664o(3540);
                }
            }
            return;
        }
        MethodCollector.m26664o(3540);
    }

    /* renamed from: a */
    private void m42174a(SharedPreferences sharedPreferences) {
        Exception e;
        C22375e eVar = this;
        boolean z = false;
        int i = 0;
        while (true) {
            C29345a[] aVarArr = eVar.f52903ai;
            if (i < aVarArr.length) {
                aVarArr[i].f69627c = z;
                C29345a aVar = eVar.f52903ai[i];
                try {
                    if (!TextUtils.isEmpty(aVar.f69626b)) {
                        try {
                            String string = sharedPreferences.getString("_platform_" + aVar.f69626b, null);
                            if (!TextUtils.isEmpty(string)) {
                                JSONObject jSONObject = new JSONObject(string);
                                if (C13627m.m24499a(jSONObject.optString("mName", ""), aVar.f69626b)) {
                                    if (jSONObject.has("mNickname")) {
                                        aVar.f69628d = jSONObject.optString("mNickname", "");
                                    }
                                    if (jSONObject.has("mAvatar")) {
                                        aVar.f69629e = jSONObject.optString("mAvatar", "");
                                    }
                                    if (jSONObject.has("mPlatformUid")) {
                                        aVar.f69630f = jSONObject.optString("mPlatformUid", "");
                                    }
                                    if (jSONObject.has("mExpire")) {
                                        try {
                                            aVar.f69634j = jSONObject.optLong("mExpire", aVar.f69634j);
                                        } catch (Exception e2) {
                                            e = e2;
                                            e.printStackTrace();
                                            i++;
                                            z = false;
                                            eVar = this;
                                        }
                                    }
                                    if (jSONObject.has("mExpireIn")) {
                                        aVar.f69635k = jSONObject.optLong("mExpireIn", aVar.f69635k);
                                    }
                                    if (jSONObject.has("isLogin")) {
                                        aVar.f69627c = jSONObject.optBoolean("isLogin", false);
                                    }
                                    if (jSONObject.has("mUserId")) {
                                        aVar.f69636l = jSONObject.optLong("mUserId", 0);
                                    }
                                    if (jSONObject.has("mModifyTime")) {
                                        aVar.f69633i = jSONObject.optLong("mModifyTime");
                                    }
                                    if (jSONObject.has("mSecPlatformUid")) {
                                        aVar.f69631g = jSONObject.optString("mSecPlatformUid");
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            e.printStackTrace();
                            i++;
                            z = false;
                            eVar = this;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                    i++;
                    z = false;
                    eVar = this;
                }
                i++;
                z = false;
                eVar = this;
            } else {
                return;
            }
        }
    }

    private C22375e(Context context) {
        f52857al.add(new C22381c((byte) 0));
        f52857al.add(new C22380b((byte) 0));
        this.f52915u = context;
        this.f52904aj = false;
        this.f52903ai = f52867k;
        try {
            this.f52904aj = true;
            SharedPreferences a = C34822d.m71158a(context, "com.bytedance.sdk.account_setting", 0);
            this.f52895aa = a.getBoolean("is_login", false);
            this.f52888T = a.getLong("user_id", 0);
            this.f52889U = a.getString("sec_user_id", "");
            this.f52894Z = a.getBoolean("is_new_user", false);
            this.f52892X = a.getString("session_key", "");
            this.f52881M = a.getString("user_name", "");
            this.f52874F = a.getInt("user_gender", 0);
            this.f52882N = a.getString("screen_name", "");
            this.f52891W = a.getString("verified_content", "");
            this.f52890V = a.getBoolean("user_verified", false);
            this.f52919z = a.getString("avatar_url", "");
            this.f52870B = a.getString("user_birthday", "");
            this.f52918y = a.getString("area", "");
            this.f52875G = a.getString("user_industry", "");
            this.f52873E = a.getString("user_email", "");
            this.f52880L = a.getString("user_mobile", "");
            this.f52887S = a.getString("user_decoration", "");
            this.f52872D = a.getString("user_description", "");
            this.f52878J = a.getBoolean("is_recommend_allowed", false);
            this.f52883O = a.getString("recommend_hint_message", "");
            this.f52876H = a.getInt("is_blocked", 0);
            this.f52877I = a.getInt("is_blocking", 0);
            this.f52879K = a.getBoolean("is_toutiao", false);
            this.f52896ab = a.getBoolean("user_has_pwd", false);
            this.f52893Y = a.getInt("country_code", 0);
            this.f52897ac = a.getLong("pgc_mediaid", 0);
            this.f52898ad = a.getString("pgc_avatar_url", "");
            this.f52899ae = a.getString("pgc_name", "");
            this.f52871C = a.getInt("can_be_found_by_phone", 1);
            this.f52884P = a.getInt("can_sync_share", 0);
            this.f52885Q = a.getInt("user_privacy_extend", 0);
            this.f52886R = a.getInt("user_privacy_extend_value", 2147483646);
            this.f52869A = a.getString("bg_img_url", "");
            this.f52908n = a.getString("multi_sids", "");
            this.f52911q = a.getInt("following_count", 0);
            this.f52912r = a.getInt("followers_count", 0);
            this.f52913s = a.getInt("visitors_count", 0);
            this.f52907m = a.getLong("media_id", 0);
            this.f52869A = a.getString("bg_img_url", "");
            this.f52910p = a.getInt("display_ocr_entrance", 0);
            this.f52909o = a.getString("user_auth_info", "");
            this.f52900af = a.getBoolean("is_visitor_account", false);
            this.f52901ag = a.getStringSet("has_update_sec_uids", new HashSet());
            this.f52902ah = a.getBoolean("is_kids_mode", false);
            if (this.f52895aa) {
                if (this.f52888T <= 0) {
                    this.f52895aa = false;
                    this.f52888T = 0;
                    this.f52889U = "";
                }
            } else if (this.f52888T > 0) {
                this.f52888T = 0;
                this.f52889U = "";
            }
            m42174a(a);
            long j = this.f52888T;
            if (j > 0) {
                m42172a(j, this.f52892X);
            }
            this.f52914t = m42179i();
        } catch (Exception e) {
            C29845d.m60144a("BDAccountManager", e.getMessage());
        }
        this.f52906l = C22374d.m42169a(this.f52915u);
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: a */
    public final void mo36614a(AbstractC22294b bVar) {
        MethodCollector.m26663i(3426);
        synchronized (this.f52905ak) {
            try {
                this.f52905ak.mo21864a(bVar);
            } finally {
                MethodCollector.m26664o(3426);
            }
        }
    }

    /* renamed from: a */
    private static void m42172a(long j, String str) {
        try {
            C29351f.m58781a().mo52213e().mo36783a(j, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22313d
    /* renamed from: a */
    public final void mo36616a(C22507a aVar, boolean z) {
        boolean z2;
        if (aVar != null) {
            long j = aVar.f53210a;
            boolean z3 = false;
            boolean z4 = true;
            if (j > 0) {
                this.f52914t = aVar;
                if (!this.f52895aa) {
                    this.f52895aa = true;
                    try {
                        CookieSyncManager.getInstance().sync();
                    } catch (Throwable unused) {
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (aVar.f53214e) {
                    this.f52894Z = true;
                }
                if (this.f52888T != j) {
                    this.f52888T = j;
                    z2 = true;
                    z3 = true;
                }
                if (!C13627m.m24499a(this.f52889U, aVar.f53218i)) {
                    this.f52889U = aVar.f53218i;
                    new AbstractC22484a<C22480a.C22483a>(new StringBuilder().append(aVar.f53210a).toString(), aVar.f53212c, this.f52915u) {
                        /* class com.bytedance.sdk.p1625a.p1657l.C22480a.C224822 */

                        /* renamed from: a */
                        final /* synthetic */ String f53146a;

                        /* renamed from: b */
                        final /* synthetic */ String f53147b;

                        /* renamed from: c */
                        final /* synthetic */ Context f53148c;

                        /* renamed from: d */
                        final /* synthetic */ AbstractC22487a f53149d = null;

                        static {
                            Covode.recordClassIndex(26298);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.sdk.p1625a.p1657l.p1658a.AbstractC22484a
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ void mo36769a(C22483a aVar) {
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.sdk.p1625a.p1657l.p1658a.AbstractC22484a
                        /* renamed from: a */
                        public final /* synthetic */ C22483a mo36768a() {
                            C22483a aVar;
                            MethodCollector.m26663i(92);
                            C22490b bVar = C22490b.C22491a.f53159a;
                            String str = this.f53146a;
                            String str2 = this.f53147b;
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && bVar.mo36778a()) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("sec_uid", str2);
                                if (bVar.f53157a.update("login_info", contentValues, "uid = ?", new String[]{str}) != 0) {
                                    C22375e.m42171a(this.f53148c).mo36624c(this.f53146a);
                                    aVar = new C22483a(0, null);
                                    MethodCollector.m26664o(92);
                                    return aVar;
                                }
                            }
                            aVar = new C22483a(-1, "fail to update data");
                            MethodCollector.m26664o(92);
                            return aVar;
                        }

                        {
                            this.f53146a = r2;
                            this.f53147b = r3;
                            this.f53148c = r4;
                        }
                    }.mo36770b();
                    z2 = true;
                }
                if (!C13627m.m24499a(this.f52892X, aVar.f53215f)) {
                    this.f52892X = aVar.f53215f;
                    z2 = true;
                    z3 = true;
                }
                if (!C13627m.m24499a(this.f52880L, aVar.f53216g)) {
                    this.f52880L = aVar.f53216g;
                    z2 = true;
                }
                if (!C13627m.m24499a(this.f52873E, aVar.f53217h)) {
                    this.f52873E = aVar.f53217h;
                    z2 = true;
                }
                if (this.f52896ab != aVar.f53219j) {
                    this.f52896ab = aVar.f53219j;
                    z2 = true;
                }
                if (this.f52893Y != aVar.f53213d) {
                    this.f52893Y = aVar.f53213d;
                    z2 = true;
                }
                if (this.f52900af != aVar.f53220k) {
                    this.f52900af = aVar.f53220k;
                    z2 = true;
                }
                if (this.f52902ah != aVar.f53221l) {
                    this.f52902ah = aVar.f53221l;
                    z2 = true;
                }
                if (m42176b(aVar)) {
                    z2 = true;
                }
                if (aVar instanceof C29346c) {
                    C29346c cVar = (C29346c) aVar;
                    if (!C13627m.m24499a(this.f52881M, cVar.f69616p)) {
                        this.f52881M = cVar.f69616p;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52882N, cVar.f69659s)) {
                        this.f52882N = cVar.f69659s;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52891W, cVar.f69660t)) {
                        this.f52891W = cVar.f69660t;
                        z2 = true;
                    }
                    if (this.f52874F != cVar.f69648L) {
                        this.f52874F = cVar.f69648L;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52872D, cVar.f69617q)) {
                        this.f52872D = cVar.f69617q;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52919z, cVar.f69618r)) {
                        this.f52919z = cVar.f69618r;
                        z2 = true;
                    }
                    if (this.f52890V != cVar.f69650N) {
                        this.f52890V = cVar.f69650N;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52870B, cVar.f69651O)) {
                        this.f52870B = cVar.f69651O;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52918y, cVar.f69652P)) {
                        this.f52918y = cVar.f69652P;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52875G, cVar.f69653Q)) {
                        this.f52875G = cVar.f69653Q;
                        z2 = true;
                    }
                    if (this.f52879K != cVar.f69656T) {
                        this.f52879K = cVar.f69656T;
                        z2 = true;
                    }
                    if (this.f52877I != cVar.f69654R) {
                        this.f52877I = cVar.f69654R;
                        z2 = true;
                    }
                    if (this.f52876H != cVar.f69655S) {
                        this.f52876H = cVar.f69655S;
                        z2 = true;
                    }
                    if (this.f52878J != cVar.f69664x) {
                        this.f52878J = cVar.f69664x;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52883O, cVar.f69665y)) {
                        this.f52883O = cVar.f69665y;
                        z2 = true;
                    }
                    if (this.f52871C != cVar.f69638B) {
                        this.f52871C = cVar.f69638B;
                        z2 = true;
                    }
                    if (this.f52885Q != cVar.f69640D) {
                        this.f52885Q = cVar.f69640D;
                        z2 = true;
                    }
                    if (this.f52886R != cVar.f69641E) {
                        this.f52886R = cVar.f69641E;
                        z2 = true;
                    }
                    if (this.f52884P != cVar.f69639C) {
                        this.f52884P = cVar.f69639C;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52887S, cVar.f69666z)) {
                        this.f52887S = cVar.f69666z;
                        z2 = true;
                    }
                    if (this.f52907m != cVar.f69645I) {
                        this.f52907m = cVar.f69645I;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52898ad, cVar.f69662v)) {
                        this.f52898ad = cVar.f69662v;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52899ae, cVar.f69663w)) {
                        this.f52899ae = cVar.f69663w;
                        z2 = true;
                    }
                    if (this.f52897ac != cVar.f69661u) {
                        this.f52897ac = cVar.f69661u;
                        z2 = true;
                    }
                    if ((!TextUtils.isEmpty(this.f52869A) && !TextUtils.isEmpty(cVar.f69646J) && !C13627m.m24499a(this.f52869A, cVar.f69646J)) || ((TextUtils.isEmpty(this.f52869A) && !TextUtils.isEmpty(cVar.f69646J)) || (!TextUtils.isEmpty(this.f52869A) && TextUtils.isEmpty(cVar.f69646J)))) {
                        this.f52869A = cVar.f69646J;
                        z2 = true;
                    }
                    if (this.f52910p != cVar.f69647K) {
                        this.f52910p = cVar.f69647K;
                        z2 = true;
                    }
                    if (!C13627m.m24499a(this.f52909o, cVar.f69637A)) {
                        this.f52909o = cVar.f69637A;
                        z2 = true;
                    }
                }
                this.f52895aa = true;
            } else if (this.f52895aa) {
                this.f52894Z = false;
                this.f52895aa = false;
                this.f52888T = 0;
                this.f52889U = "";
                this.f52881M = "";
                this.f52874F = 0;
                this.f52882N = "";
                this.f52891W = "";
                this.f52919z = "";
                this.f52870B = "";
                this.f52918y = "";
                this.f52875G = "";
                this.f52887S = "";
                this.f52872D = "";
                this.f52890V = false;
                this.f52878J = false;
                this.f52892X = "";
                this.f52911q = 0;
                this.f52912r = 0;
                this.f52913s = 0;
                this.f52876H = 0;
                this.f52877I = 0;
                this.f52879K = false;
                this.f52896ab = false;
                this.f52907m = 0;
                this.f52869A = "";
                this.f52910p = 0;
                this.f52898ad = "";
                this.f52897ac = 0;
                this.f52899ae = "";
                this.f52909o = "";
                this.f52900af = false;
                this.f52914t = null;
                for (C29345a aVar2 : this.f52903ai) {
                    aVar2.mo51308a();
                }
                z3 = false;
                z2 = true;
                z4 = false;
            } else {
                return;
            }
            if (z2) {
                m42178h();
                if (z) {
                    m42177c(z4);
                }
                if (C22480a.m42423a(aVar) != null) {
                    new Object() {
                        /* class com.bytedance.sdk.p1625a.p1643f.C22375e.C223772 */

                        static {
                            Covode.recordClassIndex(26193);
                        }
                    };
                    C29351f.m58781a();
                }
            }
            if (z3) {
                m42172a(this.f52888T, this.f52892X);
            }
        }
    }
}
