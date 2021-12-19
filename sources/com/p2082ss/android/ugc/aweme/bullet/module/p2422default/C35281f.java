package com.p2082ss.android.ugc.aweme.bullet.module.p2422default;

import android.content.Context;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.kit.web.p1159a.C16477a;
import com.bytedance.ies.bullet.kit.web.p1159a.C16479c;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.newmedia.p2167e.p2168a.C30134a;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35226e;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.web.C81546h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.f */
public final class C35281f extends C16479c {

    /* renamed from: b */
    public static final C35282a f83292b = new C35282a((byte) 0);

    /* renamed from: a */
    public final C16248b f83293a;

    static {
        Covode.recordClassIndex(42446);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.f$a */
    public static final class C35282a {
        static {
            Covode.recordClassIndex(42447);
        }

        private C35282a() {
        }

        public /* synthetic */ C35282a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.f$b */
    public static final class C35283b extends C16477a {
        static {
            Covode.recordClassIndex(42448);
        }

        @Override // com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b, com.bytedance.ies.bullet.kit.web.p1159a.C16477a
        /* renamed from: b */
        public final String mo26171b() {
            return "ToutiaoJSBridge";
        }

        C35283b() {
        }

        @Override // com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b, com.bytedance.ies.bullet.kit.web.p1159a.C16477a
        /* renamed from: a */
        public final Boolean mo26170a() {
            return false;
        }

        @Override // com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b, com.bytedance.ies.bullet.kit.web.p1159a.C16477a
        /* renamed from: c */
        public final List<String> mo26172c() {
            return C81546h.m141420a((List<String>) C89070n.m154516a("host"), false);
        }

        @Override // com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b, com.bytedance.ies.bullet.kit.web.p1159a.C16477a
        /* renamed from: d */
        public final List<String> mo26173d() {
            return C81546h.m141420a((List<String>) C89070n.m154516a("host"), true);
        }

        @Override // com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b, com.bytedance.ies.bullet.kit.web.p1159a.C16477a
        /* renamed from: g */
        public final Boolean mo26176g() {
            boolean z;
            if (!C58939a.C58940a.f134171a.f134170a.enableBoe() || !C58939a.C58940a.f134171a.f134170a.enableBoeJsbBypass()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b, com.bytedance.ies.bullet.kit.web.p1159a.C16477a
        /* renamed from: e */
        public final List<String> mo26174e() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("config");
            arrayList.add("appInfo");
            arrayList.add("login");
            arrayList.add("close");
            arrayList.add("gallery");
            arrayList.add("toggleGalleryBars");
            arrayList.add("slideShow");
            arrayList.add("relatedShow");
            arrayList.add("toast");
            arrayList.add("slideDownload");
            arrayList.add("requestChangeOrientation");
            arrayList.add("adInfo");
            C89219l.m154721d(arrayList, "");
            arrayList.add("sendLog");
            arrayList.add("openSchoolEdit");
            arrayList.add("formDialogClose");
            arrayList.add("openSchoolEdit");
            arrayList.add("orderResult");
            return arrayList;
        }

        @Override // com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b, com.bytedance.ies.bullet.kit.web.p1159a.C16477a
        /* renamed from: f */
        public final List<String> mo26175f() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("isAppInstalled");
            arrayList.add("share");
            arrayList.add("open");
            arrayList.add("openThirdApp");
            arrayList.add("copyToClipboard");
            arrayList.add("userInfo");
            arrayList.add("apiParam");
            arrayList.add("openAweme");
            arrayList.add("openSchema");
            arrayList.add("openRecord");
            arrayList.add("publishVideo");
            arrayList.add("openBrowser");
            arrayList.add("bindPhone");
            arrayList.add("fetch");
            arrayList.add("nativeStorage");
            arrayList.add("fetchTaoCommand");
            C89219l.m154721d(arrayList, "");
            return arrayList;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1159a.C16479c, com.bytedance.ies.bullet.kit.web.AbstractC16497f
    /* renamed from: b */
    public final AbstractC16486b mo26184b() {
        return new C35283b();
    }

    /* renamed from: c */
    private final int m72211c() {
        Uri uri = (Uri) this.f83293a.mo25832c(Uri.class);
        List<String> list = null;
        String decode = Uri.decode(uri != null ? uri.toString() : null);
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            list = iESSettingsProxy.getWebviewCacheUrls();
        } catch (Throwable unused) {
        }
        if (list == null || decode == null) {
            return -1;
        }
        for (String str : list) {
            if (C89361p.m154908a((CharSequence) decode, (CharSequence) str, false)) {
                return 2;
            }
        }
        return -1;
    }

    public C35281f(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        this.f83293a = bVar;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16214m, com.bytedance.ies.bullet.kit.web.p1159a.C16479c
    /* renamed from: a */
    public final AbstractC16741q mo25787a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35226e();
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1159a.C16479c, com.bytedance.ies.bullet.kit.web.AbstractC16497f
    /* renamed from: a */
    public final Map<String, Object> mo26182a(AbstractC16494c cVar, C16248b bVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("statusBarHeight", Integer.valueOf(C34728n.m70948b((double) C34723i.m70927b())));
        return linkedHashMap;
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1159a.C16479c, com.bytedance.ies.bullet.kit.web.AbstractC16497f
    /* renamed from: a */
    public final void mo26183a(WebSettings webSettings, WebView webView) {
        C89219l.m154721d(webSettings, "");
        C89219l.m154721d(webView, "");
        super.mo26183a(webSettings, webView);
        Context context = (Context) this.f83293a.mo25832c(Context.class);
        if (context != null) {
            C30134a a = C30134a.m60958a(context);
            a.f71890a = true;
            a.mo53511a(webView);
        }
        webSettings.setCacheMode(m72211c());
        webView.setFocusableInTouchMode(true);
        webView.setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
    }
}
