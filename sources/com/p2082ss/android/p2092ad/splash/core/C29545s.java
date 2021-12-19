package com.p2082ss.android.p2092ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.AbstractC29372aa;
import com.p2082ss.android.p2092ad.splash.AbstractC29374b;
import com.p2082ss.android.p2092ad.splash.AbstractC29382c;
import com.p2082ss.android.p2092ad.splash.AbstractC29629d;
import com.p2082ss.android.p2092ad.splash.AbstractC29635e;
import com.p2082ss.android.p2092ad.splash.AbstractC29637f;
import com.p2082ss.android.p2092ad.splash.AbstractC29670k;
import com.p2082ss.android.p2092ad.splash.AbstractC29672m;
import com.p2082ss.android.p2092ad.splash.AbstractC29674o;
import com.p2082ss.android.p2092ad.splash.AbstractC29681s;
import com.p2082ss.android.p2092ad.splash.AbstractC29683u;
import com.p2082ss.android.p2092ad.splash.AbstractC29684v;
import com.p2082ss.android.p2092ad.splash.AbstractC29686x;
import com.p2082ss.android.p2092ad.splash.AbstractC29689z;
import com.p2082ss.android.p2092ad.splash.C29673n;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29466j;
import com.p2082ss.android.p2092ad.splash.core.p2101f.C29479a;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29508d;
import com.p2082ss.android.p2092ad.splash.core.p2104i.C29518j;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2107d.C29630a;
import com.p2082ss.android.p2092ad.splash.p2107d.C29631b;
import com.p2082ss.android.p2092ad.splash.p2109f.AsyncTaskC29656k;
import com.p2082ss.android.p2092ad.splash.p2109f.C29638a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.s */
public class C29545s implements AbstractC29674o, AbstractC29681s, AbstractC29683u, AbstractC29689z {

    /* renamed from: b */
    private static volatile C29545s f70400b;

    /* renamed from: a */
    public boolean f70401a;

    static {
        Covode.recordClassIndex(35939);
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: d */
    public final AbstractC29683u mo51694d() {
        C29644g.f70704a = 2;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: e */
    public final AbstractC29683u mo51696e() {
        C29495h.f70243s = false;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: i */
    public final AbstractC29683u mo51702i() {
        C29495h.f70198V = true;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29689z
    /* renamed from: q */
    public final AbstractC29689z mo51710q() {
        C29495h.f70190N = 1;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29689z
    /* renamed from: r */
    public final AbstractC29689z mo51711r() {
        C29495h.f70191O = 1;
        return this;
    }

    private C29545s() {
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29681s
    /* renamed from: a */
    public final void mo51682a() {
        C29630a a;
        C29495h.f70238n = System.currentTimeMillis();
        boolean z = true;
        C29495h.f70237m = true;
        for (WeakReference<AbstractC29502i> weakReference : C29453e.m58995a()) {
            AbstractC29502i iVar = weakReference.get();
            if (iVar != null) {
                iVar.mo51391b();
            }
        }
        C29631b a2 = C29631b.m59651a();
        if (System.currentTimeMillis() - a2.f70692a <= 3600000) {
            z = false;
        }
        String str = "";
        if (!(!z || C29495h.f70194R == null || (a = C29495h.f70194R.mo51928a()) == null)) {
            a2.f70692a = System.currentTimeMillis();
            C29556v.m59363a().mo51764u().putString("key_splash_ad_rt_necessary_device_params", a.toString()).apply();
            String str2 = a.f70687a;
            String d = C29495h.m59102b() != null ? C29495h.m59102b().mo51566d() : str;
            if (!TextUtils.isEmpty(d)) {
                str2 = d;
            }
            if (!C29657l.m59760a(str2)) {
                C29556v.m59363a().mo51733b(str2).mo51750h();
            }
        }
        if (C29495h.f70239o != null) {
            str = C29495h.m59102b().mo51566d();
        }
        if (!C29657l.m59760a(str)) {
            C29556v.m59363a().mo51733b(str).mo51750h();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final void mo51683a(int i) {
        C29495h.m59097a(i);
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29674o
    /* renamed from: a */
    public final byte[] mo51685a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C29654j.m59743b(str, str2);
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29674o
    /* renamed from: a */
    public final boolean mo51684a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            Package r0 = C29673n.class.getPackage();
            if (r0 != null) {
                arrayList.add(r0.getName());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    C29638a.m59660a(84378473382L, "crashed，ad array is: " + C29535k.m59196a().mo51648b() + "\n crash stack is: " + str, null);
                    if (C29556v.m59363a().mo51767x() + 1 >= C29495h.m59095a().f70653a) {
                        C29495h.f70232h.execute(new Runnable() {
                            /* class com.p2082ss.android.p2092ad.splash.core.C29545s.RunnableC295461 */

                            static {
                                Covode.recordClassIndex(35940);
                            }

                            public final void run() {
                                try {
                                    C29638a.m59663b("clear splash ad data");
                                    JSONArray jSONArray = new JSONArray();
                                    C29556v.m59363a().mo51727a(jSONArray.toString()).mo51740d(jSONArray.toString()).mo51750h();
                                } catch (Throwable th) {
                                    C29638a.m59660a(0, "  crashed while clearing ad data ", th);
                                }
                            }
                        });
                        C29556v.m59363a().mo51764u().putInt("key_exception_time", 0).commit();
                    } else {
                        C29556v a = C29556v.m59363a();
                        a.mo51764u().putInt("key_exception_time", a.mo51767x() + 1).commit();
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            C29638a.m59660a(0, " crashed while processing crash ", null);
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51678a(AbstractC29686x xVar) {
        C29495h.f70229e = xVar;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29689z
    /* renamed from: a */
    public final AbstractC29689z mo51681a(AbstractC29635e eVar) {
        C29495h.f70245u = eVar;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51680a(boolean z) {
        C29495h.f70235k = z;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51679a(JSONArray jSONArray, int i) {
        if (jSONArray.length() > 0) {
            C29628x.m59641a().f70678e = jSONArray.length();
            C29628x.m59641a().mo51918a(-1);
            C29628x.m59641a().mo51919a(-1L);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    new AsyncTaskC29656k(jSONArray.getString(i2), i).executeOnExecutor(C29495h.f70230f, new Void[0]);
                } catch (Throwable unused) {
                }
            }
        }
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: j */
    public final void mo51703j() {
        C29548u.m59321a().mo51717b();
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29689z
    /* renamed from: l */
    public final AbstractC29689z mo51705l() {
        C29495h.f70177A = R.style.ma;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29689z
    /* renamed from: m */
    public final AbstractC29689z mo51706m() {
        C29495h.f70180D = false;
        C29495h.f70246v = 0;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29689z
    /* renamed from: n */
    public final AbstractC29689z mo51707n() {
        C29495h.f70249y = R.string.g0b;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29689z
    /* renamed from: o */
    public final AbstractC29689z mo51708o() {
        C29495h.f70179C = 2131233899;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29689z
    /* renamed from: p */
    public final AbstractC29689z mo51709p() {
        C29495h.f70250z = R.string.g0a;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: f */
    public final AbstractC29684v mo51699f() {
        m59270u();
        return new C29547t();
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: k */
    public final int mo51704k() {
        return C29556v.m59363a().mo51759p();
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29681s
    /* renamed from: c */
    public final void mo51693c() {
        C29548u.m59321a().f70409a = 0;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: h */
    public final AbstractC29683u mo51701h() {
        if (C29495h.f70220aq == null) {
            C29638a.m59660a(0, "please setup SplashAdManager#setSDKMonitorInitializer before enable SDKMonitor", null);
            return this;
        }
        C29375a a = C29375a.m58829a();
        a.f69743b = true;
        a.mo51355a(null);
        return this;
    }

    /* renamed from: s */
    public static C29545s m59268s() {
        MethodCollector.m26663i(8903);
        if (f70400b == null) {
            synchronized (C29545s.class) {
                try {
                    if (f70400b == null) {
                        f70400b = new C29545s();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8903);
                    throw th;
                }
            }
        }
        C29545s sVar = f70400b;
        MethodCollector.m26664o(8903);
        return sVar;
    }

    /* renamed from: t */
    static boolean m59269t() {
        boolean z = false;
        if (!C29495h.f70208ae) {
            C29638a.m59663b(" SDK is unavailable ");
            return false;
        }
        if (!C29495h.f70182F) {
            C29638a.m59660a(0, "splash ad data is not ready, ad is unavailable", null);
            C29375a.m58829a().mo51357a("service_load_local_status_monitor", 1, (JSONObject) null);
        } else {
            z = true;
        }
        m59270u();
        return z;
    }

    /* renamed from: u */
    private static void m59270u() {
        int i = 0;
        try {
            if (C29495h.f70227c == null) {
                i = 1;
                C29638a.m59660a(0, "SplashNetWork is null! please setup it in SplashAdManager!", null);
            }
            if (C29495h.f70226b == null) {
                i = 2;
                C29638a.m59660a(0, "EventListener is null! please setup it in SplashAdManager!", null);
            }
            if (C29495h.f70229e == null) {
                i = 3;
                C29638a.m59660a(0, "SplashAdResourceLoader is null! please setup it in SplashAdManager!", null);
            }
            if (C29495h.f70228d == null) {
                C29638a.m59660a(0, "SplashAdPlatformSupportCallback is null! please setup it in SplashAdManager!", null);
            }
            if (i > 0) {
                C29375a.m58829a().mo51357a("service_sdk_engine_invalidate", i, (JSONObject) null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29681s
    /* renamed from: b */
    public final void mo51689b() {
        C29495h.f70234j = System.currentTimeMillis();
        C29495h.f70237m = false;
        for (WeakReference<AbstractC29502i> weakReference : C29453e.m58995a()) {
            AbstractC29502i iVar = weakReference.get();
            if (iVar != null) {
                iVar.mo51394c();
            }
        }
        C29628x.m59641a().mo51918a(-1);
        C29495h.m59112k();
        C29495h.f70199W = null;
        C29495h.f70200X = -1;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: g */
    public final boolean mo51700g() {
        boolean z;
        int i = 0;
        if (!m59269t()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C29466j b = C29539n.m59216a().mo51656b();
        if (b == null || b.f70092a == null) {
            z = false;
        } else {
            z = true;
        }
        C29628x.m59641a().mo51925f();
        if (z) {
            C29638a.m59659a(b.f70092a.f70026d, " there is a suitable ad this time ");
            C29486g a = C29486g.m59087a();
            a.f70161a = b.f70092a;
            a.f70162b = System.currentTimeMillis();
            i = 1;
        } else {
            C29638a.m59659a(0, " there is no suitable ad this time ");
            C29479a.m59084a();
            C29537m.m59206a().mo51652b();
        }
        C29495h.m59112k();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - currentTimeMillis);
            C29375a.m58829a().mo51358a("bda_splash_pick_model_duration", i, jSONObject, null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return z;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51670a(AbstractC29374b bVar) {
        C29495h.f70241q = bVar;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: b */
    public final AbstractC29683u mo51686b(long j) {
        C29495h.f70205ab = j;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: c */
    public final AbstractC29683u mo51690c(long j) {
        C29495h.f70206ac = j;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: f */
    public final AbstractC29683u mo51698f(boolean z) {
        C29495h.f70221ar = z;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51671a(AbstractC29382c cVar) {
        C29495h.f70217an = cVar;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: b */
    public final AbstractC29683u mo51687b(String str) {
        C29495h.f70183G = str;
        C29495h.f70187K = true;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: c */
    public final AbstractC29683u mo51691c(String str) {
        C29495h.f70184H = str;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: d */
    public final AbstractC29683u mo51695d(boolean z) {
        C29495h.f70204aa = z;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: e */
    public final AbstractC29683u mo51697e(boolean z) {
        C29495h.f70214ak = z;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51668a(long j) {
        if (j <= 86400000) {
            j = 86400000;
        }
        C29495h.f70186J = j;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: b */
    public final AbstractC29683u mo51688b(boolean z) {
        C29495h.f70193Q = z;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: c */
    public final AbstractC29683u mo51692c(boolean z) {
        C29495h.f70202Z = z;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51669a(AbstractC29372aa aaVar) {
        if (C29495h.f70244t == null) {
            C29644g.m59691e("SplashAdTracker is null, please init SplashAdTracker before SplashNetwork!!!");
        }
        C29495h.f70227c = aaVar;
        AbstractC29505b g = C29495h.m59108g();
        if (g instanceof AbstractC29508d) {
            ((AbstractC29508d) g).mo51607a();
        }
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51672a(AbstractC29503a aVar) {
        C29495h.f70215al = aVar;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51673a(AbstractC29505b bVar) {
        if (!(bVar == null || bVar == C29495h.f70244t)) {
            C29495h.f70244t = new C29518j(bVar);
        }
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51674a(AbstractC29629d dVar) {
        C29495h.f70216am = dVar;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51675a(AbstractC29637f fVar) {
        C29495h.f70218ao = fVar;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51676a(AbstractC29670k kVar) {
        C29495h.f70220aq = kVar;
        return this;
    }

    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29683u
    /* renamed from: a */
    public final AbstractC29683u mo51677a(AbstractC29672m mVar) {
        C29495h.f70226b = mVar;
        return this;
    }
}
