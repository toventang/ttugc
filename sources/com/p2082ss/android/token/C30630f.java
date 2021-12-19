package com.p2082ss.android.token;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.C22332b;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22313d;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22290c;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22298d;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22304j;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22319f;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22327n;
import com.bytedance.sdk.p1625a.p1643f.C22374d;
import com.bytedance.sdk.p1625a.p1643f.C22375e;
import com.bytedance.sdk.p1625a.p1644g.C22404m;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1664o.C22509b;
import com.bytedance.sdk.p1625a.p1664o.C22516h;
import com.p2082ss.android.C29338a;
import com.p2082ss.android.C29845d;
import com.p2082ss.android.account.C29351f;
import com.p2082ss.android.token.AuthTokenMultiProcessSharedProvider;
import com.p2082ss.android.token.C30625b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.token.f */
public final class C30630f implements WeakHandler.IHandler {

    /* renamed from: a */
    public static C30630f f73196a;

    /* renamed from: f */
    public static volatile boolean f73197f;

    /* renamed from: j */
    static volatile boolean f73198j;

    /* renamed from: A */
    private volatile boolean f73199A;

    /* renamed from: B */
    private volatile boolean f73200B;

    /* renamed from: b */
    public volatile boolean f73201b;

    /* renamed from: c */
    volatile String f73202c;

    /* renamed from: d */
    public C30625b f73203d;

    /* renamed from: e */
    public Handler f73204e;

    /* renamed from: g */
    public volatile boolean f73205g;

    /* renamed from: h */
    protected AbstractC22329e f73206h;

    /* renamed from: i */
    protected AbstractC22313d f73207i;

    /* renamed from: k */
    public volatile boolean f73208k = true;

    /* renamed from: l */
    public volatile JSONObject f73209l;

    /* renamed from: m */
    public AuthTokenMultiProcessSharedProvider.C30623b f73210m;

    /* renamed from: n */
    private volatile boolean f73211n;

    /* renamed from: o */
    private volatile boolean f73212o;

    /* renamed from: p */
    private volatile String f73213p;

    /* renamed from: q */
    private PrivateKey f73214q;

    /* renamed from: r */
    private Context f73215r;

    /* renamed from: s */
    private final int f73216s = 1000;

    /* renamed from: t */
    private final int f73217t = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    /* renamed from: u */
    private volatile int f73218u;

    /* renamed from: v */
    private AbstractC22304j f73219v;

    /* renamed from: w */
    private final long f73220w = 86400000;

    /* renamed from: x */
    private final long f73221x = 10000;

    /* renamed from: y */
    private volatile boolean f73222y = true;

    /* renamed from: z */
    private volatile boolean f73223z;

    static {
        Covode.recordClassIndex(37168);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo54905a(String str) {
        return this.f73222y && C30633g.m62954a(str, this.f73203d.f73186b);
    }

    /* renamed from: c */
    private static boolean m62934c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private void m62932b() {
        m62935d("");
        this.f73211n = false;
        AuthTokenMultiProcessSharedProvider.C30623b bVar = this.f73210m;
        if (bVar != null) {
            bVar.mo54892a().mo54890a("X-Tt-Token", "").mo54891a();
        }
    }

    /* renamed from: d */
    private static boolean m62936d() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean c = m62934c();
        C58029j.f132253e = c;
        return c;
    }

    /* renamed from: a */
    public final String mo54899a() {
        if (f73198j) {
            return this.f73213p;
        }
        return this.f73210m.mo54893a("X-Tt-Token", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo54906b(String str) {
        C30625b.AbstractC30626a aVar;
        if (str == null || (aVar = this.f73203d.f73190f) == null) {
            return false;
        }
        return aVar.mo54895a();
    }

    /* renamed from: a */
    public static String m62930a(Object obj) {
        String obj2 = obj.toString();
        if (TextUtils.isEmpty(obj2)) {
            return "";
        }
        if (obj2.length() > 10) {
            return obj2.substring(0, 9) + "***" + obj2.substring(obj2.length() - 5);
        }
        return obj2;
    }

    /* renamed from: d */
    private void m62935d(String str) {
        this.f73213p = str;
        C29845d.m60144a("TokenFactory", "setToken token " + m62930a((Object) str) + "    " + Log.getStackTraceString(new Exception()));
    }

    /* renamed from: b */
    private void m62933b(boolean z) {
        if (f73198j && !this.f73201b) {
            this.f73201b = true;
            this.f73223z = true;
            if (!m62936d()) {
                this.f73218u++;
                this.f73204e.sendEmptyMessageDelayed(1000, Math.min(((long) this.f73218u) * 10000, this.f73203d.f73189e));
                this.f73201b = false;
                return;
            }
            AbstractC22313d dVar = this.f73207i;
            if (dVar == null || !dVar.mo36622b()) {
                this.f73204e.sendEmptyMessageDelayed(1000, this.f73203d.f73189e);
                this.f73201b = false;
                return;
            }
            this.f73218u = 0;
            final String a = mo54900a(z, false);
            if (!TextUtils.isEmpty(a)) {
                C306311 r0 = new AbstractC22304j() {
                    /* class com.p2082ss.android.token.C30630f.C306311 */

                    static {
                        Covode.recordClassIndex(37169);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                    @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                    /* renamed from: e */
                    public final /* synthetic */ void mo36686e(C22327n nVar) {
                        try {
                            C30630f.this.f73201b = false;
                            C30630f.this.f73204e.sendEmptyMessageDelayed(1000, C30630f.this.f73203d.f73189e);
                            if (C30630f.this.f73205g) {
                                C30630f.this.f73205g = false;
                                if (C30630f.this.f73210m != null) {
                                    C30630f.this.f73210m.mo54892a().mo54889a("first_beat").mo54891a();
                                }
                            }
                        } catch (Exception e) {
                            C30629e.m62929a(e);
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[Catch:{ Exception -> 0x00b8 }] */
                    @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ void mo36681a(com.bytedance.sdk.p1625a.p1626a.p1630d.C22327n r6, int r7) {
                        /*
                        // Method dump skipped, instructions count: 189
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.token.C30630f.C306311.mo36681a(com.bytedance.sdk.a.a.a.b, int):void");
                    }
                };
                this.f73219v = r0;
                m62931a(a, r0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<String, String> mo54907c(String str) {
        String str2;
        C30630f fVar = f73196a;
        if (fVar == null || !fVar.mo54905a(str) || f73196a.mo54906b(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        boolean z = true;
        if (f73198j) {
            if (!TextUtils.isEmpty(f73196a.f73213p)) {
                hashMap.put("X-Tt-Token", f73196a.mo54899a());
            }
            if (str.contains("passport")) {
                this.f73199A = true;
            } else {
                if (!this.f73207i.mo36622b()) {
                    this.f73199A = true;
                }
                this.f73200B = true;
            }
            if (!TextUtils.isEmpty(f73196a.f73202c) && C29351f.m58781a().mo52212d()) {
                hashMap.put("multi_login", "1");
                hashMap.put("x-tt-multi-sids", f73196a.f73202c);
            }
        } else {
            C30630f fVar2 = f73196a;
            String str3 = "";
            if (fVar2 != null) {
                str2 = fVar2.f73210m.mo54893a("X-Tt-Token", str3);
            } else {
                str2 = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("X-Tt-Token", str2);
            }
            if (C29351f.m58781a().mo52212d()) {
                if (f73198j) {
                    str3 = this.f73202c;
                } else {
                    AuthTokenMultiProcessSharedProvider.C30623b bVar = this.f73210m;
                    if (bVar != null) {
                        str3 = bVar.mo54893a("x-tt-multi-sids", str3);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    hashMap.put("multi_login", "1");
                    hashMap.put("x-tt-multi-sids", str3);
                }
            }
        }
        hashMap.put("sdk-version", "2");
        hashMap.put("passport-sdk-version", "19");
        C30630f fVar3 = f73196a;
        if (!f73198j || fVar3.f73212o || !fVar3.f73211n || (!"change.token".equals(fVar3.f73213p) && !TextUtils.isEmpty(fVar3.f73213p))) {
            z = false;
        } else {
            fVar3.f73212o = true;
        }
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("urlpath", C30629e.m62924a(str));
                C22455a.m42376a("x_tt_token_lost", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 1000) {
            this.f73204e.removeMessages(1000);
            m62933b(false);
        } else if (message.what == 2000 && f73198j) {
            C29351f.m58781a();
            AbstractC22313d dVar = this.f73207i;
            if (dVar != null && dVar.mo36622b()) {
                if (!this.f73223z) {
                    C30629e.m62927a("token_beat_not_poll", this.f73215r.getString(R.string.cnu), (JSONObject) null);
                } else if (this.f73208k) {
                    C22332b.m42039a().mo36673b(true, null);
                }
            }
            if (!this.f73208k) {
                C30629e.m62927a("token_beat_not_config", this.f73215r.getString(R.string.arz), this.f73209l);
                C22332b.m42039a().mo36673b(false, "token beat request error");
            }
            if (!this.f73199A || !this.f73200B) {
                String string = this.f73215r.getString(R.string.fex);
                C30629e.m62927a("sdk-version-not-add", string, (JSONObject) null);
                C22332b.m42039a().mo36672a(false, string);
                return;
            }
            C22332b.m42039a().mo36672a(true, null);
        }
    }

    /* renamed from: a */
    public final void mo54903a(Collection<String> collection) {
        C30625b bVar = this.f73203d;
        if (bVar != null && collection != null && collection.size() > 0) {
            bVar.f73186b.addAll(collection);
        }
    }

    /* renamed from: a */
    public final void mo54904a(boolean z) {
        this.f73222y = z;
        if (!this.f73222y && f73198j) {
            m62932b();
        }
    }

    /* renamed from: a */
    private void m62931a(String str, AbstractC22304j jVar) {
        C22404m.m42281a(this.f73215r, str, jVar).mo36736d();
    }

    /* renamed from: a */
    public final String mo54900a(boolean z, boolean z2) {
        String str;
        String str2;
        C22516h hVar = new C22516h(this.f73203d.f73185a + "/passport/token/beat/v2/");
        if (z) {
            str = "boot";
        } else {
            str = "polling";
        }
        if (z2) {
            str = "wap_login";
        }
        hVar.mo36788a("scene", str);
        if (this.f73205g) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hVar.mo36788a("first_beat", str2);
        return hVar.toString();
    }

    public C30630f(Context context, C30625b bVar) {
        this.f73203d = bVar;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f73215r = applicationContext;
        String str = bVar.f73187c;
        str = TextUtils.isEmpty(str) ? "token_shared_preference" : str;
        Application application = (Application) this.f73215r;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C29338a());
        }
        f73198j = C30633g.m62953a(this.f73215r);
        this.f73210m = AuthTokenMultiProcessSharedProvider.m62902a(this.f73215r, str, f73198j);
        this.f73204e = new WeakHandler(Looper.getMainLooper(), this);
        this.f73206h = C22374d.m42169a(this.f73215r);
        this.f73207i = C22375e.m42171a(this.f73215r);
        if (f73198j) {
            if (!TextUtils.isEmpty(bVar.f73185a)) {
                m62935d(this.f73210m.mo54893a("X-Tt-Token", ""));
                this.f73211n = !TextUtils.isEmpty(this.f73213p);
                this.f73202c = this.f73210m.mo54893a("x-tt-multi-sids", "");
                this.f73205g = this.f73210m.mo54894a("first_beat");
                final String str2 = C22306c.C22308b.m41974a("/passport/account/info/v2/") + "cache";
                String a = C22509b.m42455a().mo36781a(str2);
                if (!C22375e.m42171a(this.f73215r).mo36622b() && TextUtils.isEmpty(a)) {
                    C22374d.m42169a(C29351f.m58781a().mo52210b()).mo36635a("normal", new AbstractC22298d() {
                        /* class com.p2082ss.android.token.C30630f.C306322 */

                        static {
                            Covode.recordClassIndex(37170);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                        /* renamed from: e */
                        public final /* synthetic */ void mo36686e(C22319f fVar) {
                            C22319f fVar2 = fVar;
                            if (fVar2.f52724j != null && fVar2.f52724j.f53210a > 0) {
                                C22455a.m42377b("syn_login_status_error", null);
                            }
                            C22509b.m42455a().mo36782a(str2, null, "whatever", 86400000 + System.currentTimeMillis());
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                        /* renamed from: a */
                        public final /* synthetic */ void mo36681a(C22319f fVar, int i) {
                            C22509b.m42455a().mo36782a(str2, null, "whatever", System.currentTimeMillis() + 86400000);
                        }
                    });
                }
                m62933b(true);
                this.f73204e.sendEmptyMessageDelayed(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 60000);
            } else {
                throw new IllegalStateException("not set beat host");
            }
        }
        f73197f = true;
    }

    /* renamed from: a */
    public final void mo54902a(String str, List<C30627c> list, boolean z) {
        AbstractC22313d dVar;
        C30629e.m62928a(str, list, z);
        if (f73198j && (dVar = this.f73207i) != null && dVar.mo36622b()) {
            m62932b();
            AbstractC22313d dVar2 = this.f73207i;
            if (dVar2 != null) {
                dVar2.mo36621b(true);
            }
            AbstractC22329e eVar = this.f73206h;
            if (eVar != null) {
                eVar.mo36654a("sdk_expired_logout", (Map) null, (AbstractC22288a<C22290c>) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo54901a(String str, String str2, String str3) {
        String str4;
        MethodCollector.m26663i(5);
        boolean z = true;
        if (this.f73203d.f73188d) {
            String str5 = "";
            if (this.f73214q == null) {
                try {
                    this.f73214q = C30624a.m62918a(C30624a.f73182a);
                } catch (Exception e) {
                    C30629e.m62929a(e);
                    str5 = e.getMessage();
                }
            }
            if (this.f73214q != null) {
                int length = str.length();
                byte[] bArr = new byte[(length / 2)];
                for (int i = 0; i < length; i += 2) {
                    bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
                }
                byte[] a = C30624a.m62919a(bArr, this.f73214q);
                String str6 = null;
                if (a != null) {
                    str6 = new String(a);
                }
                if (str6 != null && str6.length() > 100) {
                    str6 = str6.substring(0, 100);
                }
                if (str2 == null || str2.length() <= 100) {
                    str4 = str2;
                } else {
                    str4 = str2.substring(0, 100);
                }
                if (str6 == null || str2 == null || !str6.equals(str4)) {
                    C30629e.m62926a("compare", str, str2, str5);
                    m62932b();
                    MethodCollector.m26664o(5);
                    return;
                }
                m62935d(str2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("token", m62930a((Object) str2));
                    jSONObject.put("logid", str3);
                    C22455a.m42376a("tt_token_change", jSONObject);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.f73210m.mo54892a().mo54890a("X-Tt-Token", str2).mo54891a();
                if ("change.token".equals(this.f73213p) || TextUtils.isEmpty(this.f73213p)) {
                    z = false;
                }
                this.f73211n = z;
                MethodCollector.m26664o(5);
                return;
            }
            C30629e.m62926a("privateKey", str, str2, str5);
            m62932b();
            MethodCollector.m26664o(5);
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            m62935d(str2);
            this.f73210m.mo54892a().mo54890a("X-Tt-Token", str2).mo54891a();
            if ("change.token".equals(this.f73213p) || TextUtils.isEmpty(this.f73213p)) {
                z = false;
            }
            this.f73211n = z;
        }
        MethodCollector.m26664o(5);
    }
}
