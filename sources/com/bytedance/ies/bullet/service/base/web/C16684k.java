package com.bytedance.ies.bullet.service.base.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16614as;
import com.bytedance.ies.bullet.service.base.web.C16685l;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.web.k */
public class C16684k extends WebChromeClient {
    static {
        Covode.recordClassIndex(19124);
    }

    /* renamed from: a */
    public void mo26504a(ValueCallback<Uri> valueCallback) {
        C89219l.m154719c(valueCallback, "");
    }

    /* renamed from: a */
    public void mo26505a(ValueCallback<Uri> valueCallback, String str) {
        C89219l.m154719c(valueCallback, "");
        C89219l.m154719c(str, "");
    }

    /* renamed from: a */
    public void mo26506a(ValueCallback<Uri> valueCallback, String str, String str2) {
        C89219l.m154719c(valueCallback, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
    }

    /* renamed from: a */
    public void mo26507a(AbstractC16675c cVar) {
    }

    public Bitmap getDefaultVideoPoster() {
        throw new C16614as("An operation is not implemented");
    }

    public View getVideoLoadingProgressView() {
        throw new C16614as("An operation is not implemented");
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        C16685l.C16689d dVar;
        if (permissionRequest != null) {
            C89219l.m154719c(permissionRequest, "");
            dVar = new C16685l.C16689d(permissionRequest);
        } else {
            dVar = null;
        }
        mo26507a(dVar);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C16685l.C16690e eVar;
        if (fileChooserParams != null) {
            C89219l.m154719c(fileChooserParams, "");
            eVar = new C16685l.C16690e(fileChooserParams);
        } else {
            eVar = null;
        }
        return mo26508a(webView, valueCallback, eVar);
    }

    /* renamed from: a */
    public boolean mo26508a(WebView webView, ValueCallback<Uri[]> valueCallback, AbstractC16673a aVar) {
        throw new C16614as("An operation is not implemented");
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        throw new C16614as("An operation is not implemented");
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        throw new C16614as("An operation is not implemented");
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        throw new C16614as("An operation is not implemented");
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        throw new C16614as("An operation is not implemented");
    }
}
