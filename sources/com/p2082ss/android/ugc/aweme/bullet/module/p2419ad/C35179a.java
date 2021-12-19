package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1129c.p1130a.C16150c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.web.AbstractC16680g;
import com.bytedance.ies.bullet.service.base.web.AbstractC16681h;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16732j;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.XpathBusiness;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35227f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38161ag;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.p2282ad.settings.C33385c;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34350v;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.net.URISyntaxException;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.a */
public final class C35179a extends C35227f {

    /* renamed from: e */
    private long f83002e = -1;

    /* renamed from: f */
    private boolean f83003f;

    static {
        Covode.recordClassIndex(42337);
    }

    /* renamed from: a */
    private static Bundle m71974a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m71975a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m71976a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35179a(C16248b bVar, AbstractC35125b bVar2) {
        super(bVar, bVar2);
        boolean z;
        C16732j jVar;
        Long l;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C16721b b = bVar2.mo61979b();
        C35196j jVar2 = (C35196j) (!(b instanceof C35196j) ? null : b);
        if (jVar2 == null || (jVar = jVar2.f83110az) == null || (l = (Long) jVar.mo26550b()) == null || l.longValue() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f83003f = z;
    }

    /* renamed from: a */
    private static void m71977a(String str, AbstractC16494c cVar) {
        if (!TextUtils.isEmpty(str)) {
            if (cVar != null) {
                cVar.mo25768b(AbstractC16654o.class);
            }
            new C16607an("webview_safe_log", null, null, 254);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger", "filter_scheme");
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            C16150c.m29991a(jSONObject, new C34350v(parse, "intent_scheme_", null, 4).getFormatData());
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16694o
    /* renamed from: b */
    public final WebResourceResponse mo26520b(WebView webView, AbstractC16681h hVar) {
        PassBackWebInfoBusiness passBackWebInfoBusiness;
        if (!(Build.VERSION.SDK_INT < 21 || hVar == null || hVar.mo26494a() == null || !(!hVar.mo26496c().isEmpty()) || (passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f83231b.mo61972a(PassBackWebInfoBusiness.class)) == null)) {
            passBackWebInfoBusiness.mo61954a(String.valueOf(hVar.mo26494a()), hVar.mo26496c());
        }
        return super.mo26520b(webView, hVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.C35227f
    public final void onPageFinished(WebView webView, String str) {
        SSWebView b = m72134b(this.f39535d);
        XpathBusiness xpathBusiness = (XpathBusiness) this.f83231b.mo61972a(XpathBusiness.class);
        if (xpathBusiness != null) {
            xpathBusiness.xpathDirect(b);
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f83231b.mo61972a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo61942b(b, str);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f83231b.mo61972a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.mo61963a();
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f83231b.mo61972a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.mo61952a((WebView) b, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.C35227f, android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.C16694o
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && str != null && C89361p.m154908a((CharSequence) str, (CharSequence) "__back_url__", false)) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                String encode = Uri.encode(a.mo58961h() + a.mo58908a() + "://adx");
                C89219l.m154716b(encode, "");
                str = C89361p.m154868a(str, "__back_url__", encode);
            }
        }
        return m71981b(this.f39535d, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00dd, code lost:
        if (r4.mo58934a(r3, r9, r0) != true) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f7, code lost:
        if (r4.mo58934a(r3, r9, r0) == true) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f9, code lost:
        r24 = true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m71981b(com.bytedance.ies.bullet.kit.web.AbstractC16494c r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 723
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35179a.m71981b(com.bytedance.ies.bullet.kit.web.c, java.lang.String):boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.C35227f
    /* renamed from: a */
    public final void mo61999a(JSONObject jSONObject, boolean z) {
        Long l;
        C89219l.m154721d(jSONObject, "");
        C16721b b = this.f83231b.mo61979b();
        if (!(b instanceof C35196j)) {
            b = null;
        }
        C35196j jVar = (C35196j) b;
        if (jVar != null && (l = (Long) jVar.f83076Y.mo26550b()) != null && l.longValue() > 0) {
            m72132a(jSONObject, "creativeId", jVar.f83076Y.mo26550b());
            if (!z) {
                C12290b.m22060a("aweme_ad_landingpage_open_error", 1, jSONObject);
            } else if (this.f83002e > 0) {
                m72132a(jSONObject, "duration", Long.valueOf(SystemClock.elapsedRealtime() - this.f83002e));
            }
            C12290b.m22060a("aweme_ad_landingpage_open_error_rate", !z ? 1 : 0, jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.C35227f
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f83002e = SystemClock.elapsedRealtime();
        super.onPageStarted(webView, str, bitmap);
        SSWebView b = m72134b(this.f39535d);
        PreRenderWebViewBusiness.C35121a.m71835a(this.f83231b);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f83231b.mo61972a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo61936a(b, str);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16694o
    /* renamed from: a */
    public final void mo26516a(WebView webView, AbstractC16681h hVar, WebResourceResponse webResourceResponse) {
        AdWebStatBusiness adWebStatBusiness;
        String str;
        Uri a;
        super.mo26516a(webView, hVar, webResourceResponse);
        if (Build.VERSION.SDK_INT >= 21 && (adWebStatBusiness = (AdWebStatBusiness) this.f83231b.mo61972a(AdWebStatBusiness.class)) != null) {
            String str2 = null;
            if (hVar == null || (a = hVar.mo26494a()) == null) {
                str = null;
            } else {
                str = a.toString();
            }
            if (webResourceResponse != null) {
                str2 = webResourceResponse.getReasonPhrase();
            }
            adWebStatBusiness.mo61939a(str, str2);
        }
    }

    /* renamed from: a */
    private static void m71978a(String str, String str2, C33385c cVar) {
        String shortClassName;
        String str3;
        String packageName;
        String str4;
        String className;
        String str5;
        String str6;
        if (str2 != null && !C89361p.m154870a((CharSequence) str2) && str != null && !C89361p.m154870a((CharSequence) str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("scheme", str2);
            jSONObject.put("from", C35179a.class.getSimpleName());
            if (cVar != null) {
                jSONObject.put("pattern", cVar.f79332a);
                jSONObject.put("config_type", cVar.f79333b);
            }
            if (C89219l.m154714a((Object) "intent", (Object) str2)) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    if (parseUri != null) {
                        String str7 = parseUri.getPackage();
                        if (str7 != null && !C89361p.m154870a((CharSequence) str7)) {
                            jSONObject.put("package", parseUri.getPackage());
                        }
                        if (m71974a(parseUri) != null) {
                            Bundle a = m71974a(parseUri);
                            if (a != null) {
                                str6 = a.toString();
                            } else {
                                str6 = null;
                            }
                            jSONObject.put("extra", str6);
                        }
                        ComponentName component = parseUri.getComponent();
                        if (!(component == null || (className = component.getClassName()) == null || !(!C89361p.m154870a((CharSequence) className)))) {
                            ComponentName component2 = parseUri.getComponent();
                            if (component2 != null) {
                                str5 = component2.getClassName();
                            } else {
                                str5 = null;
                            }
                            jSONObject.put("className", str5);
                        }
                        ComponentName component3 = parseUri.getComponent();
                        if (!(component3 == null || (packageName = component3.getPackageName()) == null || !(!C89361p.m154870a((CharSequence) packageName)))) {
                            ComponentName component4 = parseUri.getComponent();
                            if (component4 != null) {
                                str4 = component4.getPackageName();
                            } else {
                                str4 = null;
                            }
                            jSONObject.put("packageName", str4);
                        }
                        ComponentName component5 = parseUri.getComponent();
                        if (!(component5 == null || (shortClassName = component5.getShortClassName()) == null || !(!C89361p.m154870a((CharSequence) shortClassName)))) {
                            ComponentName component6 = parseUri.getComponent();
                            if (component6 != null) {
                                str3 = component6.getShortClassName();
                            } else {
                                str3 = null;
                            }
                            jSONObject.put("shortClassName", str3);
                        }
                        String action = parseUri.getAction();
                        if (action != null && !C89361p.m154870a((CharSequence) action)) {
                            jSONObject.put("action", parseUri.getAction());
                        }
                        Set<String> categories = parseUri.getCategories();
                        if (categories != null && !categories.isEmpty()) {
                            jSONObject.put("categories", parseUri.getCategories().toString());
                        }
                        String dataString = parseUri.getDataString();
                        if (dataString != null && !C89361p.m154870a((CharSequence) dataString)) {
                            jSONObject.put("data", parseUri.getDataString());
                        }
                        String type = parseUri.getType();
                        if (type != null && !C89361p.m154870a((CharSequence) type)) {
                            jSONObject.put(StringSet.type, parseUri.getType());
                        }
                        jSONObject.put("flag", parseUri.getFlags());
                    }
                } catch (Exception e) {
                    jSONObject.put("exception_name", e.getClass().getSimpleName());
                    String message = e.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    jSONObject.put("exception_message", message);
                }
            }
            C38161ag.m77365a("webview_intent_scheme_log", null, jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.C35227f, com.bytedance.ies.bullet.service.base.web.C16694o
    /* renamed from: a */
    public final void mo26517a(WebView webView, AbstractC16681h hVar, AbstractC16680g gVar) {
        String str;
        CharSequence b;
        Uri a;
        super.mo26517a(webView, hVar, gVar);
        if (Build.VERSION.SDK_INT >= 21) {
            m72134b(this.f39535d);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f83231b.mo61972a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                String str2 = null;
                if (hVar == null || (a = hVar.mo26494a()) == null) {
                    str = null;
                } else {
                    str = a.toString();
                }
                if (!(gVar == null || (b = gVar.mo26493b()) == null)) {
                    str2 = b.toString();
                }
                adWebStatBusiness.mo61939a(str, str2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.C35227f
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        m72134b(this.f39535d);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f83231b.mo61972a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo61939a(str2, String.valueOf(i));
        }
    }

    /* renamed from: a */
    private static boolean m71980a(String str, boolean z, String str2, SSWebView sSWebView) {
        String a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && C89219l.m154714a((Object) "intent", (Object) str) && !z) {
            try {
                Intent parseUri = Intent.parseUri(str2, 1);
                if (!(parseUri == null || (a = m71975a(parseUri, "browser_fallback_url")) == null)) {
                    if (sSWebView != null) {
                        sSWebView.loadUrl(a);
                    }
                    return true;
                }
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m71979a(String str, Uri uri, String str2, boolean z, String str3, SSWebView sSWebView, AbstractC16494c cVar) {
        Intent intent;
        PackageManager packageManager;
        if (!TextUtils.isEmpty(str) && uri != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (C89219l.m154714a((Object) "market", (Object) str2)) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(uri);
                intent2.addFlags(268435456);
                m71977a(str3, cVar);
                Activity a = this.f83231b.mo61971a();
                if (a != null) {
                    m71976a(a, intent2);
                }
                return true;
            } else if (C89219l.m154714a((Object) "intent", (Object) str2) && z) {
                String str4 = null;
                try {
                    intent = Intent.parseUri(str3, 1);
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                    intent = null;
                }
                Activity a2 = this.f83231b.mo61971a();
                if (a2 != null) {
                    packageManager = a2.getPackageManager();
                    if (!(packageManager == null || intent == null || intent.resolveActivity(packageManager) == null)) {
                        intent.addFlags(268435456);
                        m71977a(str3, cVar);
                        Activity a3 = this.f83231b.mo61971a();
                        if (a3 != null) {
                            m71976a(a3, intent);
                        }
                        return true;
                    }
                } else {
                    packageManager = null;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW");
                if (intent != null) {
                    C89219l.m154716b(C33113b.C33114a.f78704a, "");
                    AbstractC33115c a4 = C33113b.m67826a();
                    if (a4 != null && a4.mo58928a(this.f83231b.mo61971a())) {
                        intent3.setData(Uri.parse("market://details?id=" + intent.getPackage()));
                        if (!(packageManager == null || intent3.resolveActivity(packageManager) == null)) {
                            intent.addFlags(268435456);
                            m71977a(str3, cVar);
                            Activity a5 = this.f83231b.mo61971a();
                            if (a5 != null) {
                                m71976a(a5, intent3);
                            }
                            return true;
                        }
                    }
                    String a6 = m71975a(intent, "browser_fallback_url");
                    if (a6 != null) {
                        if (sSWebView != null) {
                            sSWebView.loadUrl(a6);
                        }
                        return true;
                    }
                }
                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                AbstractC33115c a7 = C33113b.m67826a();
                if (a7 != null && !a7.mo58928a(this.f83231b.mo61971a())) {
                    Activity a8 = this.f83231b.mo61971a();
                    if (intent != null) {
                        str4 = intent.getPackage();
                    }
                    return a7.mo58944b(a8, str4);
                }
            }
        }
        return false;
    }
}
