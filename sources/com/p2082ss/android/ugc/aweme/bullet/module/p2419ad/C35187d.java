package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.service.base.web.AbstractC16680g;
import com.bytedance.ies.bullet.service.base.web.AbstractC16681h;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.d */
public final class C35187d extends C16481e {

    /* renamed from: c */
    public static final List<JSONObject> f83052c = new ArrayList();

    /* renamed from: e */
    public static final C35188a f83053e = new C35188a((byte) 0);

    /* renamed from: a */
    public boolean f83054a;

    /* renamed from: b */
    public boolean f83055b;

    /* renamed from: f */
    private boolean f83056f = false;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.d$a */
    public static final class C35188a {
        static {
            Covode.recordClassIndex(42346);
        }

        private C35188a() {
        }

        public /* synthetic */ C35188a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m72011a(String str, int i, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error_code", i);
                jSONObject.put("description", str2);
                C35187d.f83052c.add(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(42345);
    }

    /* renamed from: a */
    private static boolean m72008a(String str) {
        if (str == null || !str.equals("about:blank")) {
            return false;
        }
        return true;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!m72008a(str) && !this.f83054a) {
            this.f83054a = true;
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                a.mo58923a(str);
            }
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!m72008a(str)) {
            this.f83054a = false;
            this.f83055b = false;
            f83052c.clear();
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        int i;
        if (sslError != null) {
            str = sslError.getUrl();
            i = sslError.getPrimaryError();
        } else {
            str = null;
            i = 0;
        }
        C35188a.m72011a(str, i, "ssl error");
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16694o
    /* renamed from: a */
    public final void mo26517a(WebView webView, AbstractC16681h hVar, AbstractC16680g gVar) {
        String str;
        String str2;
        int i;
        Uri a;
        Uri a2;
        String str3 = null;
        if (hVar == null || (a2 = hVar.mo26494a()) == null) {
            str = null;
        } else {
            str = a2.toString();
        }
        if (!m72008a(str)) {
            this.f83055b = true;
            if (hVar == null || (a = hVar.mo26494a()) == null) {
                str2 = null;
            } else {
                str2 = a.toString();
            }
            if (gVar != null) {
                i = gVar.mo26492a();
                CharSequence b = gVar.mo26493b();
                if (b != null) {
                    str3 = b.toString();
                }
            } else {
                i = 0;
            }
            C35188a.m72011a(str2, i, str3);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16694o
    /* renamed from: a */
    public final void mo26516a(WebView webView, AbstractC16681h hVar, WebResourceResponse webResourceResponse) {
        String str;
        String str2;
        Uri a;
        Uri a2;
        String path;
        Uri a3;
        String str3 = null;
        if (hVar == null || (a3 = hVar.mo26494a()) == null) {
            str = null;
        } else {
            str = a3.toString();
        }
        if (!m72008a(str)) {
            int i = 0;
            if (this.f83056f && (hVar == null || (a2 = hVar.mo26494a()) == null || (path = a2.getPath()) == null || !C89361p.m154876c(path, "favicon.ico", false))) {
                this.f83055b = true;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (hVar == null || (a = hVar.mo26494a()) == null) {
                    str2 = null;
                } else {
                    str2 = a.toString();
                }
                if (webResourceResponse != null) {
                    i = webResourceResponse.getStatusCode();
                    str3 = webResourceResponse.getReasonPhrase();
                }
                C35188a.m72011a(str2, i, str3);
            }
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (!m72008a(str2)) {
            this.f83055b = true;
            C35188a.m72011a(str2, i, str);
        }
    }
}
