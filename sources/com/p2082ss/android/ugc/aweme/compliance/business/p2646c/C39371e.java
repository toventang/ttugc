package com.p2082ss.android.ugc.aweme.compliance.business.p2646c;

import android.net.Uri;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.business.p2641a.C39300c;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61423c;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import okhttp3.C90029ac;
import okhttp3.Request;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.c.e */
public final class C39371e implements AbstractC61434i, AbstractC61436k, AbstractC61437l {

    /* renamed from: a */
    public static final String f92941a;

    /* renamed from: b */
    public static String f92942b;

    /* renamed from: c */
    public static final Keva f92943c;

    /* renamed from: d */
    public static final C39372a f92944d = new C39372a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: a */
    public final boolean mo68797a() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: d */
    public final C61425e<Request, C90029ac> mo68800d(C61425e<Request, C90029ac> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: f */
    public final C61425e<HttpURLConnection, InputStream> mo68802f(C61425e<HttpURLConnection, InputStream> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: h */
    public final C61425e<HttpURLConnection, InputStream> mo68804h(C61425e<HttpURLConnection, InputStream> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: i */
    public final C61425e<HttpURLConnection, Integer> mo68805i(C61425e<HttpURLConnection, Integer> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: j */
    public final C61425e<HttpURLConnection, Integer> mo68806j(C61425e<HttpURLConnection, Integer> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: k */
    public final C61425e<HttpURLConnection, InputStream> mo68807k(C61425e<HttpURLConnection, InputStream> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: l */
    public final C61425e<HttpURLConnection, InputStream> mo68808l(C61425e<HttpURLConnection, InputStream> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: m */
    public final C61425e<URL, URLConnection> mo68809m(C61425e<URL, URLConnection> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.c.e$a */
    public static final class C39372a {
        static {
            Covode.recordClassIndex(47056);
        }

        private C39372a() {
        }

        public /* synthetic */ C39372a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(47055);
        String simpleName = C39371e.class.getSimpleName();
        C89219l.m154716b(simpleName, "");
        f92941a = simpleName;
        Keva repo = Keva.getRepo("x-tt-cmpl-token", 1);
        C89219l.m154716b(repo, "");
        f92943c = repo;
    }

    /* renamed from: b */
    private final String m80067b() {
        String str = f92942b;
        if (str == null || C89361p.m154870a((CharSequence) str)) {
            String string = f92943c.getString(m80070d(""), "");
            if (string == null || C89361p.m154870a((CharSequence) string)) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                C89219l.m154716b(currentUser, "");
                string = m80069c(currentUser.getUid());
            }
            if (string != null && !C89361p.m154870a((CharSequence) string)) {
                m80068b(string);
            }
        }
        return f92942b;
    }

    /* renamed from: b */
    private static void m80068b(String str) {
        f92942b = str;
        f92943c.storeString(m80070d(""), str);
    }

    /* renamed from: d */
    private static String m80070d(String str) {
        if (C89361p.m154870a((CharSequence) str)) {
            return "x-tt-cmpl-token";
        }
        return "x-tt-cmpl-token_".concat(String.valueOf(str));
    }

    /* renamed from: c */
    private static String m80069c(String str) {
        boolean z;
        String str2;
        if (str == null || C89361p.m154870a((CharSequence) str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String d = m80070d(str);
        Keva keva = f92943c;
        if (keva.contains(d)) {
            str2 = keva.getString(d, "");
        } else {
            str2 = null;
        }
        m80065a("keva", null, str2, null, 10);
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r2 != null) goto L_0x0016;
     */
    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.net.model.C61425e<java.net.HttpURLConnection, java.io.InputStream> mo68801e(com.p2082ss.android.ugc.aweme.net.model.C61425e<java.net.HttpURLConnection, java.io.InputStream> r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            Q r2 = r6.f139468a
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r4 = 0
            if (r2 == 0) goto L_0x0030
            java.net.URL r0 = r2.getURL()
            if (r0 == 0) goto L_0x0037
            java.lang.String r3 = r0.toString()
        L_0x0016:
            boolean r0 = m80066a(r3)
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = r5.m80067b()
            if (r1 == 0) goto L_0x0028
            boolean r0 = p4600h.p4622m.C89361p.m154870a(r1)
            if (r0 == 0) goto L_0x0031
        L_0x0028:
            r2 = 4
            java.lang.String r1 = "no token"
            java.lang.String r0 = "3"
            m80065a(r1, r3, r4, r0, r2)
        L_0x0030:
            return r6
        L_0x0031:
            java.lang.String r0 = "x-tt-cmpl-token"
            r2.setRequestProperty(r0, r1)
            goto L_0x0030
        L_0x0037:
            r3 = r4
            if (r2 == 0) goto L_0x0030
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39371e.mo68801e(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r2 != null) goto L_0x0016;
     */
    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.net.model.C61425e<java.net.HttpURLConnection, java.io.InputStream> mo68803g(com.p2082ss.android.ugc.aweme.net.model.C61425e<java.net.HttpURLConnection, java.io.InputStream> r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            Q r2 = r6.f139468a
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r4 = 0
            if (r2 == 0) goto L_0x0030
            java.net.URL r0 = r2.getURL()
            if (r0 == 0) goto L_0x0037
            java.lang.String r3 = r0.toString()
        L_0x0016:
            boolean r0 = m80066a(r3)
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = r5.m80067b()
            if (r1 == 0) goto L_0x0028
            boolean r0 = p4600h.p4622m.C89361p.m154870a(r1)
            if (r0 == 0) goto L_0x0031
        L_0x0028:
            r2 = 4
            java.lang.String r1 = "no token"
            java.lang.String r0 = "3"
            m80065a(r1, r3, r4, r0, r2)
        L_0x0030:
            return r6
        L_0x0031:
            java.lang.String r0 = "x-tt-cmpl-token"
            r2.setRequestProperty(r0, r1)
            goto L_0x0030
        L_0x0037:
            r3 = r4
            if (r2 == 0) goto L_0x0030
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39371e.mo68803g(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r5 != null) goto L_0x0016;
     */
    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.net.model.C61425e<okhttp3.Request, okhttp3.C90029ac> mo68799c(com.p2082ss.android.ugc.aweme.net.model.C61425e<okhttp3.Request, okhttp3.C90029ac> r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r0)
            Q r5 = r7.f139468a
            okhttp3.Request r5 = (okhttp3.Request) r5
            r4 = 0
            if (r5 == 0) goto L_0x0030
            okhttp3.t r0 = r5.url()
            if (r0 == 0) goto L_0x0052
            java.lang.String r3 = r0.toString()
        L_0x0016:
            boolean r0 = m80066a(r3)
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = r6.m80067b()
            if (r1 == 0) goto L_0x0028
            boolean r0 = p4600h.p4622m.C89361p.m154870a(r1)
            if (r0 == 0) goto L_0x0031
        L_0x0028:
            r2 = 4
            java.lang.String r1 = "no token"
            java.lang.String r0 = "4"
            m80065a(r1, r3, r4, r0, r2)
        L_0x0030:
            return r7
        L_0x0031:
            okhttp3.s r0 = r5.headers()
            if (r0 == 0) goto L_0x004c
            okhttp3.s$a r2 = r0.mo145033c()
        L_0x003b:
            java.lang.String r0 = "x-tt-cmpl-token"
            r2.mo145045d(r0, r1)
            okhttp3.Request$a r1 = r5.newBuilder()
            okhttp3.s r0 = r2.mo145040a()
            r1.mo144696a(r0)
            goto L_0x0030
        L_0x004c:
            okhttp3.s$a r2 = new okhttp3.s$a
            r2.<init>()
            goto L_0x003b
        L_0x0052:
            r3 = r4
            if (r5 == 0) goto L_0x0030
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39371e.mo68799c(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    /* renamed from: a */
    private static boolean m80066a(String str) {
        String str2;
        if (str == null || C89361p.m154870a((CharSequence) str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        List<String> d = C22898a.m43150a(C17867d.m33078a()).mo23739d(str2);
        if (str2 != null && !C89361p.m154870a((CharSequence) str2) && d != null && !d.isEmpty()) {
            for (T t : d) {
                C89219l.m154716b(t, "");
                if (C89361p.m154876c(str2, (String) t, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: b */
    public final C61425e<com.bytedance.retrofit2.client.Request, C22099u<?>> mo68798b(C61425e<com.bytedance.retrofit2.client.Request, C22099u<?>> eVar) {
        String str;
        R r;
        List<C22027b> list;
        T t;
        String str2;
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (q != null) {
            str = q.getUrl();
        } else {
            str = null;
        }
        if (!(!m80066a(str) || (r = eVar.f139469b) == null || (list = r.f52261a.f52042d) == null)) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                C89219l.m154716b(t2, "");
                String str3 = t2.f52037a;
                C89219l.m154716b(str3, "");
                Locale locale = Locale.ROOT;
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = str3.toLowerCase(locale);
                C89219l.m154716b(lowerCase, "");
                if (C89219l.m154714a((Object) lowerCase, (Object) "x-tt-cmpl-token")) {
                    break;
                }
            }
            T t3 = t;
            if (!(t3 == null || (str2 = t3.f52038b) == null || C89361p.m154870a((CharSequence) str2))) {
                m80068b(str2);
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: a */
    public final C61425e<com.bytedance.retrofit2.client.Request, C22099u<?>> mo68796a(C61425e<com.bytedance.retrofit2.client.Request, C22099u<?>> eVar) {
        List<C22027b> list;
        int i;
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (q != null) {
            String url = q.getUrl();
            if (m80066a(url)) {
                List<C22027b> headers = q.getHeaders();
                if (headers != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : headers) {
                        T t2 = t;
                        C89219l.m154716b(t2, "");
                        if (!C89219l.m154714a((Object) t2.f52037a, (Object) "x-tt-cmpl-token")) {
                            arrayList.add(t);
                        }
                    }
                    list = C89070n.m154585g((Collection) arrayList);
                } else {
                    list = new ArrayList<>();
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder("login=");
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                sb.append(sb2.append(g.isLogin() ? 1 : 0).append(';').toString());
                sb.append("ct=" + (C39300c.C39301a.m79956d() ? 1 : 0) + ';');
                StringBuilder sb3 = new StringBuilder("rt=");
                if (!C39300c.f92779f.contains("consent_reason")) {
                    Keva keva = C39300c.f92779f;
                    if (C80580in.m139687c()) {
                        i = 2;
                    } else if (GuestModeServiceImpl.m65990d().mo57219c()) {
                        i = 3;
                    } else if (C39300c.f92779f.getBoolean("is_consent_accepted", false)) {
                        i = 6;
                    } else if (C39300c.f92779f.getBoolean("user_logged_in_atleast_once", false)) {
                        i = 4;
                    } else {
                        IAccountUserService g2 = C31575b.m65865g();
                        C89219l.m154716b(g2, "");
                        if (g2.isLogin()) {
                            i = 1;
                        } else if (!C39300c.C39301a.m79956d()) {
                            i = 7;
                        } else {
                            i = 0;
                        }
                    }
                    keva.storeInt("consent_reason", i);
                }
                sb.append(sb3.append(C39300c.f92779f.getInt("consent_reason", 0)).toString());
                list.add(new C22027b("x-tt-dm-status", sb.toString()));
                String b = m80067b();
                if (b == null || C89361p.m154870a((CharSequence) b)) {
                    m80065a("no token", url, null, "2", 4);
                } else {
                    list.add(new C22027b("x-tt-cmpl-token", b));
                }
                Request.C22024a newBuilder = q.newBuilder();
                newBuilder.f52025c = list;
                eVar.f139468a = (Q) newBuilder.mo35840a();
            }
        }
        return eVar;
    }

    /* renamed from: a */
    private static void m80064a(String str, String str2, String str3, String str4) {
        try {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
            C89219l.m154716b(currentUser, "");
            String uid = currentUser.getUid();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op", str);
            jSONObject.put("uid", uid);
            if (str2 != null) {
                jSONObject.put("url", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            if (str4 != null) {
                jSONObject.put("netType", str4);
            }
            C12290b.m22064a(EnumC61423c.PENETRATE_HEADER_LOG.getLogType(), jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m80065a(String str, String str2, String str3, String str4, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        m80064a(str, str2, str3, str4);
    }
}
