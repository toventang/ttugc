package com.bytedance.ies.bullet.service.base.web;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.web.l */
public final class C16685l {
    static {
        Covode.recordClassIndex(19125);
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.web.l$a */
    public static final class C16686a implements AbstractC16681h {

        /* renamed from: a */
        final /* synthetic */ WebResourceRequest f39862a;

        static {
            Covode.recordClassIndex(19126);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16681h
        /* renamed from: b */
        public final boolean mo26495b() {
            return this.f39862a.isForMainFrame();
        }

        @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16681h
        /* renamed from: a */
        public final Uri mo26494a() {
            Uri url = this.f39862a.getUrl();
            C89219l.m154709a((Object) url, "");
            return url;
        }

        @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16681h
        /* renamed from: c */
        public final Map<String, String> mo26496c() {
            Map<String, String> requestHeaders = this.f39862a.getRequestHeaders();
            if (requestHeaders == null) {
                return C89041ag.m154415a();
            }
            return requestHeaders;
        }

        C16686a(WebResourceRequest webResourceRequest) {
            this.f39862a = webResourceRequest;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.web.l$b */
    public static final class C16687b implements AbstractC16680g {

        /* renamed from: a */
        final /* synthetic */ WebResourceError f39863a;

        static {
            Covode.recordClassIndex(19127);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16680g
        /* renamed from: a */
        public final int mo26492a() {
            return this.f39863a.getErrorCode();
        }

        @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16680g
        /* renamed from: b */
        public final CharSequence mo26493b() {
            return this.f39863a.getDescription();
        }

        C16687b(WebResourceError webResourceError) {
            this.f39863a = webResourceError;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.web.l$e */
    public static final class C16690e implements AbstractC16673a {

        /* renamed from: a */
        final /* synthetic */ WebChromeClient.FileChooserParams f39866a;

        static {
            Covode.recordClassIndex(19130);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16673a
        /* renamed from: a */
        public final String[] mo26484a() {
            return this.f39866a.getAcceptTypes();
        }

        C16690e(WebChromeClient.FileChooserParams fileChooserParams) {
            this.f39866a = fileChooserParams;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.web.l$c */
    public static final class C16688c {

        /* renamed from: a */
        final /* synthetic */ RenderProcessGoneDetail f39864a;

        static {
            Covode.recordClassIndex(19128);
        }

        C16688c(RenderProcessGoneDetail renderProcessGoneDetail) {
            this.f39864a = renderProcessGoneDetail;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.web.l$d */
    public static final class C16689d implements AbstractC16675c {

        /* renamed from: a */
        final /* synthetic */ PermissionRequest f39865a;

        static {
            Covode.recordClassIndex(19129);
        }

        C16689d(PermissionRequest permissionRequest) {
            this.f39865a = permissionRequest;
        }
    }

    /* renamed from: a */
    public static final AbstractC16681h m30970a(WebResourceRequest webResourceRequest) {
        C89219l.m154719c(webResourceRequest, "");
        return new C16686a(webResourceRequest);
    }
}
