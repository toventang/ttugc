package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.service.base.web.AbstractC16680g;
import com.bytedance.ies.bullet.service.base.web.AbstractC16681h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.e */
public final class C35189e extends C16481e {

    /* renamed from: a */
    public boolean f83057a;

    /* renamed from: b */
    public boolean f83058b;

    /* renamed from: c */
    public boolean f83059c;

    /* renamed from: e */
    public long f83060e;

    /* renamed from: f */
    public AbstractC35190a f83061f;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.e$a */
    public interface AbstractC35190a {
        static {
            Covode.recordClassIndex(42348);
        }

        /* renamed from: a */
        void mo62031a();

        /* renamed from: a */
        void mo62032a(long j);

        /* renamed from: b */
        void mo62033b();

        /* renamed from: c */
        void mo62034c();
    }

    static {
        Covode.recordClassIndex(42347);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: a */
    public final void mo62026a(boolean z) {
        AbstractC35190a aVar;
        this.f83059c = z;
        if (z && !this.f83057a && (aVar = this.f83061f) != null) {
            aVar.mo62034c();
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!C89219l.m154714a((Object) str, (Object) "about:blank") && !this.f83057a && !this.f83058b && !this.f83059c) {
            this.f83057a = true;
            AbstractC35190a aVar = this.f83061f;
            if (aVar != null) {
                aVar.mo62032a(System.currentTimeMillis() - this.f83060e);
            }
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!C89219l.m154714a((Object) str, (Object) "about:blank")) {
            this.f83057a = false;
            this.f83058b = false;
            mo62026a(false);
            this.f83060e = System.currentTimeMillis();
            AbstractC35190a aVar = this.f83061f;
            if (aVar != null) {
                aVar.mo62031a();
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
            this.f83058b = true;
            AbstractC35190a aVar = this.f83061f;
            if (aVar != null) {
                aVar.mo62033b();
            }
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (!C89219l.m154714a((Object) str2, (Object) "about:blank")) {
            this.f83058b = true;
            AbstractC35190a aVar = this.f83061f;
            if (aVar != null) {
                aVar.mo62033b();
            }
        }
    }
}
