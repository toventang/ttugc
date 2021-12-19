package com.p2082ss.android.ugc.aweme.bullet.module.base;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16485a;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.web.AbstractC16680g;
import com.bytedance.ies.bullet.service.base.web.AbstractC16681h;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.f */
public class C35227f extends C16481e {

    /* renamed from: c */
    public static final C35228a f83229c = new C35228a((byte) 0);

    /* renamed from: a */
    public final C16248b f83230a;

    /* renamed from: b */
    public final AbstractC35125b f83231b;

    static {
        Covode.recordClassIndex(42389);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61999a(JSONObject jSONObject, boolean z) {
        C89219l.m154721d(jSONObject, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.f$a */
    public static final class C35228a {
        static {
            Covode.recordClassIndex(42390);
        }

        private C35228a() {
        }

        public /* synthetic */ C35228a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    protected static SSWebView m72134b(AbstractC16494c cVar) {
        if (cVar != null) {
            try {
                WebView n = cVar.mo26210n();
                if (n != null) {
                    return (SSWebView) n;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.web.SSWebView");
    }

    public C35227f(C16248b bVar, AbstractC35125b bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f83230a = bVar;
        this.f83231b = bVar2;
    }

    public void onPageFinished(WebView webView, String str) {
        m72131a(0, "", str, true);
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.C16694o
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (m72133a(this.f39535d, str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* renamed from: a */
    protected static boolean m72133a(AbstractC16494c cVar, String str) {
        AbstractC16485a m;
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a != null) {
            a.mo58942b(str);
        }
        if (cVar == null || (m = cVar.mo26209m()) == null || !m.mo26192a(str)) {
            return false;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.C16694o
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
        if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
            return n.f139469b;
        }
        if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
            return super.shouldInterceptRequest(n.f139470c, (String) n.f139468a);
        }
        throw n.f139472e;
    }

    /* renamed from: a */
    protected static void m72132a(JSONObject jSONObject, String str, Object obj) {
        C89219l.m154721d(str, "");
        if (jSONObject != null && !TextUtils.isEmpty(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a != null) {
            a.mo58919a(this, str);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16694o
    /* renamed from: a */
    public void mo26517a(WebView webView, AbstractC16681h hVar, AbstractC16680g gVar) {
        String str;
        String str2;
        String path;
        String str3;
        Integer num;
        String str4;
        Uri a;
        String path2;
        if (hVar != null) {
            if (hVar.mo26495b() || !((a = hVar.mo26494a()) == null || (path2 = a.getPath()) == null || C89361p.m154876c(path2, "favicon.ico", false))) {
                Uri a2 = hVar.mo26494a();
                if (a2 == null || (str3 = a2.toString()) == null) {
                    str3 = "null";
                }
                C89219l.m154716b(str3, "");
                if (gVar != null) {
                    num = Integer.valueOf(gVar.mo26492a());
                    CharSequence b = gVar.mo26493b();
                    if (b != null) {
                        str4 = b.toString();
                    }
                    str4 = null;
                } else {
                    num = null;
                    str4 = null;
                }
                m72131a(num, str4, String.valueOf(hVar.mo26494a()), false);
            }
            if (!hVar.mo26495b()) {
                Uri a3 = hVar.mo26494a();
                if ((a3 == null || (path = a3.getPath()) == null || !C89361p.m154876c(path, "favicon.ico", false)) && gVar != null) {
                    int a4 = gVar.mo26492a();
                    Uri a5 = hVar.mo26494a();
                    if (a5 != null) {
                        str = a5.getHost();
                    } else {
                        str = null;
                    }
                    Uri a6 = hVar.mo26494a();
                    if (a6 != null) {
                        str2 = a6.getPath();
                    } else {
                        str2 = null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    m72132a(jSONObject, "host", str);
                    m72132a(jSONObject, "path", str2);
                    m72132a(jSONObject, "statusCode", (Object) null);
                    m72132a(jSONObject, "errorCode", Integer.valueOf(a4));
                    C12290b.m22060a("aweme_webview_assets_error", 0, jSONObject);
                }
            }
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 23) {
            m72131a(Integer.valueOf(i), str, str2, false);
        }
    }

    /* renamed from: a */
    private final void m72131a(Integer num, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        m72132a(jSONObject, "errorCode", num);
        if (!TextUtils.isEmpty(str)) {
            m72132a(jSONObject, "errorDesc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str2);
            m72132a(jSONObject, "url", str2);
            C89219l.m154716b(parse, "");
            m72132a(jSONObject, "host", parse.getHost());
            m72132a(jSONObject, "path", parse.getPath());
        }
        m72132a(jSONObject, "container_type", "bullet");
        mo61999a(jSONObject, z);
        C12290b.m22060a("aweme_webview_open_error_rate", !z ? 1 : 0, jSONObject);
    }
}
