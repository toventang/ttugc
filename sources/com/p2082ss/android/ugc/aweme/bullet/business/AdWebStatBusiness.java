package com.p2082ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16732j;
import com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.p2082ss.android.ugc.aweme.bullet.business.p2414a.C35124a;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35226e;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness */
public final class AdWebStatBusiness extends BulletBusinessService.Business {

    /* renamed from: a */
    public static ConcurrentHashMap<String, String> f82860a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C35110a f82861b = new C35110a((byte) 0);

    /* renamed from: c */
    private final C35124a f82862c = new C35124a();

    /* renamed from: d */
    private long f82863d;

    /* renamed from: e */
    private boolean f82864e;

    /* renamed from: f */
    private boolean f82865f;

    /* renamed from: g */
    private boolean f82866g;

    /* renamed from: h */
    private final boolean f82867h;

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness$a */
    public static final class C35110a {
        static {
            Covode.recordClassIndex(42255);
        }

        private C35110a() {
        }

        public /* synthetic */ C35110a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(42254);
    }

    /* renamed from: g */
    private final String m71793g() {
        String str;
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35196j)) {
            bVar = null;
        }
        C35196j jVar = (C35196j) bVar;
        if (jVar == null || (str = jVar.mo62044b()) == null) {
            str = "";
        }
        if (this.f82867h) {
            TextUtils.isEmpty(str);
        }
        return str;
    }

    /* renamed from: i */
    private final int m71795i() {
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35226e)) {
            bVar = null;
        }
        C35226e eVar = (C35226e) bVar;
        if (eVar != null) {
            return eVar.mo62121l();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo61944c() {
        this.f82863d = System.currentTimeMillis();
        this.f82864e = false;
        this.f82865f = false;
        this.f82866g = false;
        C35124a aVar = this.f82862c;
        aVar.f82916i = false;
        aVar.f82912e = false;
        aVar.f82913f = false;
        aVar.f82915h = null;
        aVar.f82910c = 0;
        aVar.f82908a = 0;
    }

    /* renamed from: d */
    public final String mo61946d() {
        String str;
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35226e)) {
            bVar = null;
        }
        C35226e eVar = (C35226e) bVar;
        if (eVar == null || (str = eVar.mo62118i()) == null) {
            str = "";
        }
        if (this.f82867h) {
            TextUtils.isEmpty(str);
        }
        return str;
    }

    /* renamed from: h */
    private final long m71794h() {
        C16732j jVar;
        Long l;
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35196j)) {
            bVar = null;
        }
        C35196j jVar2 = (C35196j) bVar;
        if (jVar2 == null || (jVar = jVar2.f83076Y) == null || (l = (Long) jVar.mo26550b()) == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: a */
    public final boolean mo61941a() {
        C16721b bVar = this.f82870k.f82900a;
        if (bVar != null && (bVar instanceof C35226e)) {
            C35226e eVar = (C35226e) bVar;
            if (!TextUtils.isEmpty(eVar.mo62118i()) && eVar.mo62120k() == 4 && eVar.mo62121l() == 1) {
                try {
                    C89219l.m154716b(C33113b.C33114a.f78704a, "");
                    AbstractC33117e b = C33113b.m67827b();
                    if (b != null && !b.mo58972b()) {
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo61943b() {
        String str;
        C16721b bVar = this.f82870k.f82900a;
        if (bVar != null && (bVar instanceof C35226e)) {
            C35226e eVar = (C35226e) bVar;
            AbstractC16725d<String> dVar = eVar.f83218aL;
            if (dVar != null) {
                str = dVar.mo26550b();
            } else {
                str = null;
            }
            Boolean bool = (Boolean) eVar.f83217aK.mo26550b();
            if (bool == null || !bool.booleanValue() || TextUtils.isEmpty(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final String mo61947e() {
        String str;
        AbstractC16725d<String> dVar;
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35226e)) {
            bVar = null;
        }
        C35226e eVar = (C35226e) bVar;
        if (eVar == null || (dVar = eVar.f83218aL) == null || (str = dVar.mo26550b()) == null) {
            str = "";
        }
        if (this.f82867h) {
            TextUtils.isEmpty(str);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.ies.bullet.service.f.a.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject m71792f() {
        /*
            r5 = this;
            r4 = 0
            java.lang.String r0 = r5.m71793g()     // Catch:{ Exception -> 0x0040 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0040 }
            if (r0 != 0) goto L_0x0015
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0040 }
            java.lang.String r0 = r5.m71793g()     // Catch:{ Exception -> 0x0040 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0040 }
            goto L_0x001a
        L_0x0015:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0040 }
            r3.<init>()     // Catch:{ Exception -> 0x0040 }
        L_0x001a:
            java.lang.String r2 = "log_extra"
            com.ss.android.ugc.aweme.bullet.business.a r0 = r5.f82870k     // Catch:{ Exception -> 0x003d }
            com.bytedance.ies.bullet.service.f.a.b r1 = r0.f82900a     // Catch:{ Exception -> 0x003d }
            boolean r0 = r1 instanceof com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j     // Catch:{ Exception -> 0x003d }
            if (r0 != 0) goto L_0x003b
        L_0x0024:
            com.ss.android.ugc.aweme.bullet.module.ad.j r4 = (com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j) r4     // Catch:{ Exception -> 0x003d }
            if (r4 == 0) goto L_0x002e
            java.lang.String r1 = r4.mo62045c()     // Catch:{ Exception -> 0x003d }
            if (r1 != 0) goto L_0x0030
        L_0x002e:
            java.lang.String r1 = ""
        L_0x0030:
            boolean r0 = r5.f82867h     // Catch:{ Exception -> 0x003d }
            if (r0 == 0) goto L_0x0037
            android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x003d }
        L_0x0037:
            r3.put(r2, r1)     // Catch:{ Exception -> 0x003d }
            goto L_0x0045
        L_0x003b:
            r4 = r1
            goto L_0x0024
        L_0x003d:
            r0 = move-exception
            r4 = r3
            goto L_0x0041
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            r0.printStackTrace()
            r3 = r4
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.m71792f():org.json.JSONObject");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdWebStatBusiness(C35123a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: b */
    private final JSONObject m71791b(String str) {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", m71795i());
            if (!TextUtils.isEmpty(mo61946d()) && m71795i() == 1) {
                jSONObject.put("channel_name", mo61946d());
                if (AdLandPagePreloadServiceImpl.m68380f() != null) {
                    mo61946d();
                    i = 2;
                } else {
                    i = null;
                }
                jSONObject.put("landing_type", i);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo61938a(String str) {
        C16721b bVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ((str == null || C89361p.m154874b(str, "bytedance://log_event_v3", false)) && (bVar = this.f82870k.f82900a) != null && (bVar instanceof C35196j)) {
            try {
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                if (!C89219l.m154714a((Object) "log_event_v3", (Object) parse.getHost())) {
                    return;
                }
                if (!this.f82865f) {
                    C39162r.m79463b(parse.getQueryParameter("event"), new JSONObject(parse.getQueryParameter("params")));
                    this.f82865f = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo61940a(boolean z) {
        JSONObject jSONObject;
        Activity a = this.f82870k.mo61971a();
        if (a != null) {
            JSONObject f = m71792f();
            long currentTimeMillis = System.currentTimeMillis() - this.f82863d;
            this.f82863d = 0;
            if (m71794h() > 0) {
                if (currentTimeMillis > 0 && !this.f82864e) {
                    C35124a aVar = this.f82862c;
                    long h = m71794h();
                    JSONObject b = m71791b(null);
                    if (h > 0 && aVar.f82914g != null) {
                        if (f == null) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = f;
                        }
                        try {
                            jSONObject.put("is_ad_event", "1");
                            jSONObject.put("tag", "draw_ad");
                            if (b == null) {
                                b = new JSONObject();
                            }
                            b.put("present_url", aVar.f82914g);
                            b.put("container_type", "bullet");
                            jSONObject.put("ad_extra_data", b.toString());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C39162r.onEvent(MobClick.obtain().setLabelName("stay_page").setEventName("ad_wap_stat").setValue(String.valueOf(h)).setExtValueLong(currentTimeMillis).setJsonObject(jSONObject));
                    }
                    this.f82864e = true;
                }
                if (z || a.isFinishing()) {
                    this.f82862c.mo61982a(null, m71794h(), f, m71791b(null));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61939a(String str, String str2) {
        C35124a aVar = this.f82862c;
        long h = m71794h();
        JSONObject f = m71792f();
        JSONObject b = m71791b(str2);
        aVar.f82913f = true;
        aVar.mo61982a(str, h, f, b);
    }

    /* renamed from: a */
    public final void mo61936a(WebView webView, String str) {
        String str2 = null;
        f82860a = null;
        C35124a aVar = this.f82862c;
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35226e)) {
            bVar = null;
        }
        C35226e eVar = (C35226e) bVar;
        if (!(webView == null || TextUtils.isEmpty(str) || eVar == null)) {
            if (aVar.f82914g == null) {
                aVar.f82914g = str;
            }
            if (aVar.f82908a == 0) {
                aVar.f82908a = System.currentTimeMillis();
            }
            String i = eVar.mo62118i();
            String j = eVar.mo62119j();
            if (eVar.mo62120k() == 7) {
                aVar.f82909b = 5;
            } else if (!TextUtils.isEmpty(i) && eVar.mo62121l() == 1 && C33113b.m67826a() != null) {
                aVar.f82909b = C33113b.m67826a().mo58907a(i, j);
            }
        }
        C16721b bVar2 = this.f82870k.f82900a;
        if (bVar2 != null && (bVar2 instanceof C35196j)) {
            if ((!C89219l.m154714a((Object) str, (Object) "about:blank")) && !this.f82866g) {
                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                AbstractC33115c a = C33113b.m67826a();
                if (a != null) {
                    C35196j jVar = (C35196j) bVar2;
                    String i2 = jVar.mo62118i();
                    String j2 = jVar.mo62119j();
                    int k = jVar.mo62120k();
                    int i3 = m71795i();
                    String c = jVar.mo62045c();
                    String b = jVar.f83100ao.mo26550b();
                    if (TextUtils.isEmpty(b)) {
                        Long l = (Long) jVar.f83076Y.mo26550b();
                        if (l != null) {
                            b = String.valueOf(l.longValue());
                        } else {
                            b = null;
                        }
                    }
                    a.mo58925a(i2, j2, k, i3, c, b);
                }
                this.f82866g = true;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    C89219l.m154716b(C33113b.C33114a.f78704a, "");
                    AbstractC33117e b2 = C33113b.m67827b();
                    if (b2 != null) {
                        str2 = b2.mo58971a();
                    }
                    IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                    if (f != null) {
                        f.mo59386d(str2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo61942b(WebView webView, String str) {
        Long l;
        C35124a aVar = this.f82862c;
        long h = m71794h();
        JSONObject f = m71792f();
        JSONObject b = m71791b(null);
        if (!TextUtils.isEmpty(str) && !aVar.f82911d && !aVar.f82912e) {
            aVar.f82910c = System.currentTimeMillis();
            aVar.f82912e = true;
            aVar.mo61982a(str, h, f, b);
        }
        C16721b bVar = this.f82870k.f82900a;
        if (bVar != null && (bVar instanceof C35196j) && Build.VERSION.SDK_INT >= 21) {
            C35196j jVar = (C35196j) bVar;
            String jSONObject = jVar.mo62046d().toString();
            C89219l.m154716b(jSONObject, "");
            if (webView != null && (l = (Long) jVar.f83076Y.mo26550b()) != null && l.longValue() != 0) {
                IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.m68380f();
                if (f2 != null) {
                    f2.mo59390f(jSONObject);
                }
                Boolean bool = (Boolean) jVar.f83078aA.mo26550b();
                if (bool != null) {
                    bool.booleanValue();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo61945c(WebView webView, String str) {
        boolean z;
        C35124a aVar = this.f82862c;
        long h = m71794h();
        JSONObject f = m71792f();
        JSONObject b = m71791b(null);
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (aVar.f82915h == null) {
                aVar.f82915h = aVar.f82914g;
            }
            if (TextUtils.isEmpty(webView.getOriginalUrl()) || TextUtils.equals(webView.getOriginalUrl(), str) || aVar.f82912e) {
                z = false;
            } else {
                z = true;
            }
            aVar.f82911d = z;
            if (h > 0) {
                if (f == null) {
                    f = new JSONObject();
                }
                try {
                    f.put("is_ad_event", "1");
                    f.put("tag", "draw_ad");
                    if (b == null) {
                        b = new JSONObject();
                    }
                    b.put("present_url", aVar.f82915h);
                    b.put("next_url", str);
                    b.put("container_type", "bullet");
                    f.put("ad_extra_data", b.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C39162r.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(h)).setJsonObject(f));
            }
            aVar.f82915h = str;
        }
    }

    /* renamed from: a */
    public final void mo61937a(C16248b bVar, List<Pattern> list) {
        List<String> c;
        C89219l.m154721d(bVar, "");
        C16721b bVar2 = this.f82870k.f82900a;
        if (bVar2 != null && (bVar2 instanceof C35196j)) {
            if (list == null) {
                list = new ArrayList<>();
            }
            try {
                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                AbstractC33117e b = C33113b.m67827b();
                if (b != null && (c = b.mo58973c()) != null && !c.isEmpty() && C89219l.m154714a((Object) ((Boolean) ((C35196j) bVar2).f83088ac.mo26550b()), (Object) true)) {
                    for (String str : c) {
                        Pattern compile = Pattern.compile(str);
                        C89219l.m154716b(compile, "");
                        list.add(compile);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                List<String> list2 = C16343g.C16345b.f39286a.mo25918a((IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class)).f39830i;
                Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                List d = C89206ad.m154682d(list2);
                String pattern = t.toString();
                C89219l.m154716b(pattern, "");
                if (!d.contains(pattern)) {
                    String pattern2 = t.toString();
                    C89219l.m154716b(pattern2, "");
                    d.add(pattern2);
                }
                arrayList.add(C89391z.f203057a);
            }
        }
    }
}
