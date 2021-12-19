package com.bytedance.ies.bullet.service.base.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.bullet.service.base.C16614as;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

public class WebChromeClientDispatcher extends WebChromeClient {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C16684k> f39859a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(19112);
    }

    public Bitmap getDefaultVideoPoster() {
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().getDefaultVideoPoster();
            } catch (C16614as unused) {
            }
        }
        return super.getDefaultVideoPoster();
    }

    public View getVideoLoadingProgressView() {
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().getVideoLoadingProgressView();
            } catch (C16614as unused) {
            }
        }
        return super.getVideoLoadingProgressView();
    }

    public void onGeolocationPermissionsHidePrompt() {
        super.onGeolocationPermissionsHidePrompt();
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onGeolocationPermissionsHidePrompt();
            } catch (C16614as unused) {
            }
        }
    }

    public void onHideCustomView() {
        super.onHideCustomView();
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHideCustomView();
            } catch (C16614as unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo26464a(C16684k kVar) {
        C89219l.m154719c(kVar, "");
        this.f39859a.add(kVar);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPermissionRequest(permissionRequest);
            } catch (C16614as unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        C89219l.m154719c(valueCallback, "");
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26504a(valueCallback);
            } catch (C16614as unused) {
            }
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onProgressChanged(webView, i);
            } catch (C16614as unused) {
            }
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedTitle(webView, str);
            } catch (C16614as unused) {
            }
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onShowCustomView(view, customViewCallback);
            } catch (C16614as unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        C89219l.m154719c(valueCallback, "");
        C89219l.m154719c(str, "");
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26505a(valueCallback, str);
            } catch (C16614as unused) {
            }
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (!((Boolean) C15346a.m28238a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
            C15346a.m28243a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
            super.onGeolocationPermissionsShowPrompt(str, callback);
            Iterator<T> it = this.f39859a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onGeolocationPermissionsShowPrompt(str, callback);
                } catch (C16614as unused) {
                }
            }
        }
    }

    public void onConsoleMessage(String str, int i, String str2) {
        super.onConsoleMessage(str, i, str2);
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onConsoleMessage(str, i, str2);
            } catch (C16614as unused) {
            }
        }
    }

    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onShowCustomView(view, i, customViewCallback);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            } catch (C16614as unused) {
            }
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        C89219l.m154719c(valueCallback, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26506a(valueCallback, str, str2);
            } catch (C16614as unused) {
            }
        }
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsAlert(webView, str, str2, jsResult);
            } catch (C16614as unused) {
            }
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsBeforeUnload(webView, str, str2, jsResult);
            } catch (C16614as unused) {
            }
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsConfirm(webView, str, str2, jsResult);
            } catch (C16614as unused) {
            }
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<T> it = this.f39859a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
            } catch (C16614as unused) {
            }
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }
}
