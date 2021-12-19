package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18137d;
import com.p2082ss.android.sdk.webview.AbstractC30269m;
import com.p2082ss.android.sdk.webview.C30265i;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a.C40584a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.web.C81523a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness */
public class AdWebStatBusiness extends BusinessService.Business {

    /* renamed from: a */
    private static boolean f94923a;

    /* renamed from: b */
    private static int f94924b;

    /* renamed from: c */
    private long f94925c;

    /* renamed from: d */
    private boolean f94926d;

    /* renamed from: e */
    private boolean f94927e;

    /* renamed from: f */
    private boolean f94928f;

    /* renamed from: g */
    private ArrayList<Integer> f94929g = new ArrayList<>();

    /* renamed from: h */
    private final C40584a f94930h = new C40584a();

    static {
        Covode.recordClassIndex(48391);
    }

    /* renamed from: a */
    public final void mo69706a(List<Pattern> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.f94935k.f95069b.f95096J) {
            try {
                List<String> adCardPreloadCommonPrefix = C52912c.f121688a.f121689b.getAdLandingPageConfig().getAdCardPreloadCommonPrefix();
                if (!C13603b.m24435a((Collection) adCardPreloadCommonPrefix)) {
                    for (String str : adCardPreloadCommonPrefix) {
                        list.add(Pattern.compile(str));
                    }
                }
            } catch (C16041a e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0181 A[Catch:{ JSONException -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b6 A[LOOP:0: B:61:0x01b0->B:63:0x01b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ee  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69707a(boolean r19) {
        /*
        // Method dump skipped, instructions count: 543
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness.mo69707a(boolean):void");
    }

    /* renamed from: a */
    public static int m81872a() {
        if (!f94923a || f94924b == 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo69708b() {
        this.f94925c = System.currentTimeMillis();
        this.f94926d = false;
        this.f94927e = false;
        this.f94928f = false;
        this.f94930h.mo69741a();
    }

    public AdWebStatBusiness(C40589e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    private static JSONObject m81873a(C40628b bVar) {
        JSONObject jSONObject;
        try {
            if (!TextUtils.isEmpty(bVar.f95116k)) {
                jSONObject = new JSONObject(bVar.f95116k);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_extra", bVar.f95114i);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final void mo69711b(String str) {
        C81523a.C81524a.m141376a();
        C40628b bVar = this.f94935k.f95069b;
        C40584a aVar = this.f94930h;
        aVar.f94974a = System.currentTimeMillis();
        aVar.f94982i = false;
        aVar.f94983j = 0;
        aVar.f94984k = str;
        if (aVar.f94985l == -1) {
            aVar.f94985l = AdLandPagePreloadServiceImpl.m68380f().mo59375a(bVar.f95106a, aVar.f94974a);
        }
        f94923a = false;
        f94924b = 0;
    }

    /* renamed from: a */
    public void mo69705a(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("bytedance://log_event_v3")) {
            try {
                Uri parse = Uri.parse(str);
                if (!"log_event_v3".equals(parse.getHost())) {
                    return;
                }
                if (!this.f94927e) {
                    C39162r.m79461a(parse.getQueryParameter("event"), new JSONObject(parse.getQueryParameter("params")));
                    this.f94927e = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo69710b(C30265i iVar, AbstractC30269m mVar) {
        IAdLandPagePreloadService f;
        C40628b bVar = this.f94935k.f95069b;
        String str = bVar.f95102P;
        if (bVar.f95101O && !TextUtils.isEmpty(str) && (f = AdLandPagePreloadServiceImpl.m68380f()) != null) {
            String g = f.mo59391g("lynx_feed");
            if (!TextUtils.isEmpty(g)) {
                iVar.mo53720a(new C81523a(mVar.mo53731a(g), str, "lynx_feed"));
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m81874a(C40628b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", bVar.f95130y);
            if (!TextUtils.isEmpty(bVar.f95126u) && bVar.f95130y == 1) {
                jSONObject.put("channel_name", bVar.f95126u);
                int i = 0;
                if (AdLandPagePreloadServiceImpl.m68380f() != null) {
                    i = 2;
                }
                jSONObject.put("landing_type", i);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final void mo69709b(WebView webView, String str) {
        C40628b bVar = this.f94935k.f95069b;
        C40584a aVar = this.f94930h;
        long j = bVar.f95106a;
        String str2 = bVar.f95118m;
        JSONObject a = m81873a(bVar);
        JSONObject a2 = m81874a(bVar, (String) null);
        if (webView != null && !TextUtils.isEmpty(str) && !aVar.f94977d && !aVar.f94978e) {
            aVar.f94976c = System.currentTimeMillis();
            aVar.f94978e = true;
            aVar.mo69742a(webView.getContext(), str, j, str2, a, a2);
        }
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (Build.VERSION.SDK_INT >= 21 && f != null) {
            String jSONObject = bVar.mo69774a().toString();
            if (bVar.f95106a != 0 && webView != null) {
                String f2 = f.mo59390f(jSONObject);
                if (!bVar.f95131z) {
                    if (!TextUtils.isEmpty(f2)) {
                        webView.evaluateJavascript(f2, C40587c.f94995a);
                    }
                    if (bVar.f95128w == 4 && bVar.f95129x != 0 && m81872a() == 1) {
                        String b = f.mo59381b();
                        if (!TextUtils.isEmpty(b)) {
                            webView.evaluateJavascript(b.replace("_platform", "true"), C40588d.f94996a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69700a(WebView webView, int i) {
        C40628b bVar = this.f94935k.f95069b;
        if (i > 10 && !this.f94929g.contains(10)) {
            this.f94929g.add(10);
            this.f94930h.mo69743a(webView.getContext(), webView.getUrl(), bVar.f95106a, bVar.f95118m, m81873a(bVar), m81874a(bVar, (String) null), 10);
        }
        if (i > 30 && !this.f94929g.contains(30)) {
            this.f94929g.add(30);
            this.f94930h.mo69743a(webView.getContext(), webView.getUrl(), bVar.f95106a, bVar.f95118m, m81873a(bVar), m81874a(bVar, (String) null), 30);
        }
        if (i > 50 && !this.f94929g.contains(50)) {
            this.f94929g.add(50);
            this.f94930h.mo69743a(webView.getContext(), webView.getUrl(), bVar.f95106a, bVar.f95118m, m81873a(bVar), m81874a(bVar, (String) null), 50);
        }
        if (i > 75 && !this.f94929g.contains(75)) {
            this.f94929g.add(75);
            this.f94930h.mo69743a(webView.getContext(), webView.getUrl(), bVar.f95106a, bVar.f95118m, m81873a(bVar), m81874a(bVar, (String) null), 75);
        }
        if (i == 100 && !this.f94929g.contains(100)) {
            this.f94929g.add(100);
            this.f94930h.mo69743a(webView.getContext(), webView.getUrl(), bVar.f95106a, bVar.f95118m, m81873a(bVar), m81874a(bVar, (String) null), 100);
        }
    }

    /* renamed from: c */
    public final void mo69712c(WebView webView, String str) {
        boolean z;
        C40628b bVar = this.f94935k.f95069b;
        C40584a aVar = this.f94930h;
        long j = bVar.f95106a;
        JSONObject a = m81873a(bVar);
        JSONObject a2 = m81874a(bVar, (String) null);
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (aVar.f94980g == null) {
                aVar.f94980g = aVar.f94979f;
            }
            if (TextUtils.isEmpty(webView.getOriginalUrl()) || TextUtils.equals(webView.getOriginalUrl(), str) || aVar.f94978e) {
                z = false;
            } else {
                z = true;
            }
            aVar.f94977d = z;
            if (j > 0) {
                if (a == null) {
                    a = new JSONObject();
                }
                try {
                    a.put("is_ad_event", "1");
                    a.put("tag", "draw_ad");
                    if (a2 == null) {
                        a2 = new JSONObject();
                    }
                    a2.put("present_url", aVar.f94980g);
                    a2.put("next_url", str);
                    a.put("ad_extra_data", a2.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C18129a.C18130a a3 = C18129a.m33747a("ad_wap_stat", "jump_page", String.valueOf(j), "", "0");
                Iterator<String> keys = a.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a3.mo28900b(next, a.opt(next));
                }
                a3.mo28902c();
                if (C18137d.m33765b()) {
                    C39162r.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(j)).setJsonObject(a));
                } else if (C18137d.m33764a()) {
                    try {
                        a.put("_ad_staging_flag", "1");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    C39162r.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(j)).setJsonObject(a));
                }
            }
            aVar.f94980g = str;
        }
        C40584a aVar2 = this.f94930h;
        if (!TextUtils.isEmpty(webView.getUrl()) && !TextUtils.equals(webView.getUrl(), str) && !aVar2.f94978e && !TextUtils.isEmpty(C40584a.C40585a.f94989a) && !aVar2.f94986m) {
            aVar2.f94986m = true;
            if (C40584a.C40585a.f94991c) {
                C38182f.C38184b a4 = C38182f.m77418a();
                a4.f90216f = C40584a.C40585a.f94989a;
                a4.f90211a = "redirect";
                a4.mo66500b(C40584a.C40585a.f94993e).mo66492a(C40584a.C40585a.f94992d).mo66490a(Long.valueOf(bVar.f95106a)).mo66506e(bVar.f95114i).mo66502b();
                return;
            }
            C38182f.C38184b a5 = C38182f.m77418a();
            a5.f90211a = C40584a.C40585a.f94989a;
            a5.f90212b = "redirect";
            a5.mo66504c(C40584a.C40585a.f94990b).mo66490a(Long.valueOf(bVar.f95106a)).mo66506e(bVar.f95114i).mo66495a((Context) null);
            C18129a.m33747a(C40584a.C40585a.f94989a, "redirect", String.valueOf(bVar.f95106a), bVar.f95114i, "0").mo28900b("refer", C40584a.C40585a.f94990b).mo28902c();
        }
    }

    /* renamed from: a */
    public final void mo69702a(WebView webView, String str) {
        IAdLandPagePreloadService f;
        Context context;
        ITalentAdRevenueShareService e;
        JSONObject jSONObject;
        String str2;
        this.f94929g.clear();
        C40628b bVar = this.f94935k.f95069b;
        if (this.f94935k.f95069b.f95106a > 0) {
            f94923a = true;
            f94924b++;
        }
        C40584a aVar = this.f94930h;
        long j = bVar.f95106a;
        String str3 = bVar.f95118m;
        JSONObject a = m81873a(bVar);
        JSONObject a2 = m81874a(bVar, (String) null);
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (aVar.f94979f == null) {
                aVar.f94979f = str;
            }
            if (aVar.f94974a == 0) {
                aVar.f94974a = System.currentTimeMillis();
            }
            String str4 = bVar.f95126u;
            String str5 = bVar.f95127v;
            if (bVar.f95128w == 7) {
                aVar.f94975b = 5;
            } else if (!TextUtils.isEmpty(str4) && bVar.f95130y == 1 && bVar.f95128w == 4 && (f = AdLandPagePreloadServiceImpl.m68380f()) != null) {
                aVar.f94975b = f.mo59376a().mo59403a(str4, str5);
                if (aVar.f94975b > 0 && aVar.f94985l != -1) {
                    aVar.f94975b = 3;
                }
            }
            if (aVar.f94981h && (context = webView.getContext()) != null && j > 0 && (e = TalentAdRevenueShareServiceImpl.m77931e()) != null && e.mo67033c()) {
                try {
                    C13624l.EnumC13625a a3 = C40584a.m81929a(context);
                    if (a3 != C13624l.EnumC13625a.NONE) {
                        if (a == null) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = a;
                        }
                        jSONObject.put("ac", C13624l.m24481a(a3));
                        long currentTimeMillis = System.currentTimeMillis() - aVar.f94974a;
                        if (a3 == C13624l.EnumC13625a.WIFI) {
                            if (currentTimeMillis < 1) {
                            }
                        } else if (currentTimeMillis < 1) {
                        }
                        if (currentTimeMillis > 0) {
                            jSONObject.put("duration", Math.min(currentTimeMillis, 90000L));
                            if (str != null) {
                                str2 = str;
                            } else {
                                str2 = aVar.f94979f;
                                if (str2 == null) {
                                }
                            }
                            jSONObject.put("is_ad_event", "1");
                            jSONObject.put("tag", "draw_ad");
                            if (a2 == null) {
                                a2 = new JSONObject();
                            }
                            a2.put("next_url", str2);
                            if (aVar.f94975b != -1) {
                                a2.put("preload_status", aVar.f94975b);
                            }
                            jSONObject.put("ad_extra_data", a2.toString());
                            e.mo67028a(str3, a);
                            C18129a.C18130a a4 = C18129a.m33747a("ad_wap_stat", "detail_show", String.valueOf(j), "", "0");
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                a4.mo28900b(next, jSONObject.opt(next));
                            }
                            a4.mo28902c();
                            if (C18137d.m33765b()) {
                                C39162r.onEvent(MobClick.obtain().setLabelName("detail_show").setEventName("ad_wap_stat").setValue(String.valueOf(j)).setJsonObject(jSONObject));
                            } else if (C18137d.m33764a()) {
                                try {
                                    a.put("_ad_staging_flag", "1");
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                }
                                C39162r.onEvent(MobClick.obtain().setLabelName("detail_show").setEventName("ad_wap_stat").setValue(String.valueOf(j)).setJsonObject(jSONObject));
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            aVar.f94981h = false;
            aVar.f94982i = true;
            aVar.f94983j++;
        }
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.m68380f();
        if (!str.equals("about:blank") && !this.f94928f) {
            if (f2 != null) {
                AbstractC33368e a5 = f2.mo59376a();
                String str6 = bVar.f95126u;
                String str7 = bVar.f95127v;
                int i = bVar.f95128w;
                int i2 = bVar.f95130y;
                String str8 = bVar.f95114i;
                String str9 = bVar.f95118m;
                if (TextUtils.isEmpty(str9)) {
                    str9 = String.valueOf(bVar.f95106a);
                }
                a5.mo59409a(str6, str7, i, i2, str8, str9, this.f94930h.f94985l);
            }
            this.f94928f = true;
        }
        if (Build.VERSION.SDK_INT >= 21 && f2 != null) {
            try {
                f2.mo59386d(C52912c.f121688a.f121689b.getAdLandingPageConfig().getAnalytics());
                if (bVar.f95129x != 0) {
                    f2.mo59389e(C52912c.f121688a.f121689b.getAdLandingPageConfig().getPrememAnalytics());
                }
            } catch (C16041a e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo69704a(C30265i iVar, AbstractC30269m mVar) {
        C40628b bVar = this.f94935k.f95069b;
        if (!TextUtils.isEmpty(bVar.f95126u) && bVar.f95128w == 4 && bVar.f95130y == 1) {
            try {
                if (!C52912c.f121688a.f121689b.getAdLandingPageConfig().getAdLandingPagePreloadEnabled().booleanValue()) {
                    return;
                }
            } catch (Exception unused) {
            }
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f != null) {
                String g = f.mo59391g("feed");
                String str = bVar.f95126u;
                if (!TextUtils.isEmpty(g)) {
                    iVar.mo53720a(new C81523a(mVar.mo53731a(g), str, "feed"));
                }
                String g2 = f.mo59391g("splash");
                if (!TextUtils.isEmpty(g2)) {
                    iVar.mo53720a(new C81523a(mVar.mo53731a(g2), str, "splash"));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69701a(WebView webView, WebResourceRequest webResourceRequest, String str) {
        if (webView != null && webResourceRequest != null && Build.VERSION.SDK_INT >= 23 && webResourceRequest.isForMainFrame()) {
            mo69703a(webView, webResourceRequest.getUrl().toString(), str);
        }
    }

    /* renamed from: a */
    public final void mo69703a(WebView webView, String str, String str2) {
        C40628b bVar = this.f94935k.f95069b;
        this.f94930h.mo69744a(webView, str, bVar.f95106a, bVar.f95118m, m81873a(bVar), m81874a(bVar, str2));
    }
}
