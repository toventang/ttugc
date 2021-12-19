package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.service.base.web.AbstractC16680g;
import com.bytedance.ies.bullet.service.base.web.AbstractC16681h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.i */
public class C35194i extends C16481e {

    /* renamed from: a */
    public boolean f83070a;

    /* renamed from: b */
    public boolean f83071b;

    /* renamed from: c */
    public boolean f83072c;

    /* renamed from: e */
    public long f83073e;

    /* renamed from: f */
    public AbstractC35195a f83074f;

    /* renamed from: g */
    public boolean f83075g = true;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.i$a */
    public interface AbstractC35195a {
        static {
            Covode.recordClassIndex(42353);
        }

        /* renamed from: a */
        void mo62041a();

        /* renamed from: b */
        void mo62042b();

        /* renamed from: c */
        void mo62043c();
    }

    static {
        Covode.recordClassIndex(42352);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: a */
    public final void mo62036a(boolean z) {
        this.f83072c = z;
        if (z && !this.f83070a && this.f83074f != null) {
            System.currentTimeMillis();
        }
    }

    public void onPageFinished(WebView webView, String str) {
        WebView n;
        if (!C89219l.m154714a((Object) str, (Object) "about:blank")) {
            if (this.f83075g) {
                this.f83075g = false;
                AbstractC16494c cVar = this.f39535d;
                if (!(cVar == null || (n = cVar.mo26210n()) == null)) {
                    n.clearHistory();
                }
            }
            if (!this.f83070a && !this.f83071b && !this.f83072c) {
                this.f83070a = true;
            }
            AbstractC35195a aVar = this.f83074f;
            if (aVar != null) {
                aVar.mo62043c();
            }
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!C89219l.m154714a((Object) str, (Object) "about:blank")) {
            this.f83070a = false;
            this.f83071b = false;
            mo62036a(false);
            this.f83073e = System.currentTimeMillis();
            AbstractC35195a aVar = this.f83074f;
            if (aVar != null) {
                aVar.mo62041a();
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16694o
    /* renamed from: a */
    public final void mo26517a(WebView webView, AbstractC16681h hVar, AbstractC16680g gVar) {
        String str;
        Uri a;
        if (hVar == null || (a = hVar.mo26494a()) == null) {
            str = null;
        } else {
            str = a.toString();
        }
        if (!C89219l.m154714a((Object) str, (Object) "about:blank") && hVar != null && hVar.mo26495b()) {
            this.f83071b = true;
            AbstractC35195a aVar = this.f83074f;
            if (aVar != null) {
                aVar.mo62042b();
            }
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (!C89219l.m154714a((Object) str2, (Object) "about:blank")) {
            this.f83071b = true;
            AbstractC35195a aVar = this.f83074f;
            if (aVar != null) {
                aVar.mo62042b();
            }
        }
    }
}
