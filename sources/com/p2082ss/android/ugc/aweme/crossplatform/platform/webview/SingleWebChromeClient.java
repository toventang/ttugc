package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.sdk.webview.AbstractC30267k;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38633ak;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40596a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40617a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.C40709o;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient */
public class SingleWebChromeClient extends C40686b {

    /* renamed from: a */
    private C40709o f95248a;

    /* renamed from: e */
    public AbstractC30267k f95249e;

    /* renamed from: f */
    public AbstractC40547m f95250f;

    /* renamed from: g */
    public final List<AbstractC40692f> f95251g = new ArrayList();

    /* renamed from: h */
    public C34337k f95252h;

    /* renamed from: i */
    public AbstractC40692f f95253i = new C40663a(this);

    static {
        Covode.recordClassIndex(48507);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (!((Boolean) C15346a.m28238a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
            C15346a.m28243a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
            C89219l.m154721d(str, "");
            C89219l.m154721d(callback, "");
        }
    }

    public void onGeolocationPermissionsHidePrompt() {
        AbstractC30267k kVar = this.f95249e;
        if (kVar != null) {
            kVar.mo53728d();
        }
    }

    public void onHideCustomView() {
        super.onHideCustomView();
        this.f95253i.mo69812a();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient$a */
    public static final class C40663a implements AbstractC40692f {

        /* renamed from: a */
        final /* synthetic */ SingleWebChromeClient f95254a;

        static {
            Covode.recordClassIndex(48508);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40692f
        /* renamed from: a */
        public final void mo69812a() {
            Iterator<T> it = this.f95254a.f95251g.iterator();
            while (it.hasNext()) {
                it.next().mo69812a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40663a(SingleWebChromeClient singleWebChromeClient) {
            this.f95254a = singleWebChromeClient;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40692f
        /* renamed from: a */
        public final void mo69813a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Iterator<T> it = this.f95254a.f95251g.iterator();
            while (it.hasNext()) {
                it.next().mo69813a(view, customViewCallback);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40692f
        /* renamed from: a */
        public final void mo69814a(WebView webView, int i) {
            Iterator<T> it = this.f95254a.f95251g.iterator();
            while (it.hasNext()) {
                it.next().mo69814a(webView, i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40692f
        /* renamed from: a */
        public final void mo69815a(WebView webView, String str) {
            Iterator<T> it = this.f95254a.f95251g.iterator();
            while (it.hasNext()) {
                it.next().mo69815a(webView, str);
            }
        }
    }

    public Bitmap getDefaultVideoPoster() {
        C40618a crossPlatformParams;
        C40617a aVar;
        MethodCollector.m26663i(4642);
        AbstractC40547m mVar = this.f95250f;
        if (mVar == null || (crossPlatformParams = mVar.getCrossPlatformParams()) == null || (aVar = crossPlatformParams.f95068a) == null || !aVar.f95065n) {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            MethodCollector.m26664o(4642);
            return defaultVideoPoster;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        MethodCollector.m26664o(4642);
        return createBitmap;
    }

    public View getVideoLoadingProgressView() {
        MethodCollector.m26663i(4639);
        AbstractC40547m mVar = this.f95250f;
        Context context = null;
        if (mVar == null || mVar.getContext() == null) {
            MethodCollector.m26664o(4639);
            return null;
        }
        AbstractC40547m mVar2 = this.f95250f;
        if (mVar2 == null || (context = mVar2.getContext()) == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        MethodCollector.m26664o(4639);
        return frameLayout;
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        C89219l.m154721d(valueCallback, "");
        this.f95248a.f95314a = valueCallback;
        this.f95248a.mo69891a("", "");
    }

    /* renamed from: a */
    private static ActivityC0218d m82036a(Context context) {
        if (context == null) {
            return null;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof ActivityC0218d) {
                return (ActivityC0218d) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public SingleWebChromeClient(WebView webView) {
        Fragment fragment;
        AbstractC0952i supportFragmentManager;
        AbstractC0952i supportFragmentManager2;
        C89219l.m154721d(webView, "");
        ActivityC0218d a = m82036a(webView.getContext());
        if (a == null || (supportFragmentManager2 = a.getSupportFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = supportFragmentManager2.mo3551a("web_view_upload_file");
        }
        if (!(fragment instanceof C40709o)) {
            this.f95248a = new C40709o();
            if (a != null && (supportFragmentManager = a.getSupportFragmentManager()) != null) {
                supportFragmentManager.mo3552a().mo3456a(this.f95248a, "web_view_upload_file").mo3473c();
                return;
            }
            return;
        }
        this.f95248a = (C40709o) fragment;
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        this.f95253i.mo69813a(view, customViewCallback);
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        C89219l.m154721d(valueCallback, "");
        C89219l.m154721d(str, "");
        this.f95248a.f95314a = valueCallback;
        this.f95248a.mo69891a(str, "");
    }

    public void onProgressChanged(WebView webView, int i) {
        AbstractC40591g crossPlatformBusiness;
        AdWebStatBusiness adWebStatBusiness;
        AbstractC34340m mVar;
        super.onProgressChanged(webView, i);
        C34337k kVar = this.f95252h;
        if (!(kVar == null || (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
            mVar.mo60773a(webView, i);
        }
        this.f95253i.mo69814a(webView, i);
        C40596a.m81947a().mo19237a(webView, i);
        AbstractC40547m mVar2 = this.f95250f;
        if (mVar2 != null && (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) != null && (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo69748a(AdWebStatBusiness.class)) != null) {
            adWebStatBusiness.mo69700a(webView, i);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        AbstractC34340m mVar;
        super.onReceivedTitle(webView, str);
        AbstractC40547m mVar2 = this.f95250f;
        if (mVar2 != null) {
            mVar2.mo67253a(str, false);
        }
        C34337k kVar = this.f95252h;
        if (!(kVar == null || (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
            mVar.mo60786e();
        }
        this.f95253i.mo69815a(webView, str);
    }

    public void onConsoleMessage(String str, int i, String str2) {
        AbstractC40591g crossPlatformBusiness;
        AdWebStatBusiness adWebStatBusiness;
        Logger.debug();
        try {
            AbstractC30267k kVar = this.f95249e;
            if (kVar != null) {
                kVar.mo53727b(str);
            }
            AbstractC40547m mVar = this.f95250f;
            if (!(mVar == null || (crossPlatformBusiness = mVar.getCrossPlatformBusiness()) == null || (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo69748a(AdWebStatBusiness.class)) == null)) {
                adWebStatBusiness.mo69705a(str);
            }
            C38633ak.f91292a.mo67214a(str);
        } catch (Exception unused) {
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        C89219l.m154721d(valueCallback, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f95248a.f95314a = valueCallback;
        this.f95248a.mo69891a(str, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Context context;
        Context context2;
        String str;
        if (fileChooserParams == null) {
            return false;
        }
        Context context3 = null;
        if (webView != null) {
            context = webView.getContext();
        } else {
            context = null;
        }
        if (m82036a(context) == null) {
            return false;
        }
        C40709o oVar = this.f95248a;
        if (webView != null) {
            context2 = webView.getContext();
        } else {
            context2 = null;
        }
        if (C80620e.m139778a(context2) == 0) {
            if (webView != null) {
                context3 = webView.getContext();
            }
            if (C80620e.m139781c(context3) == 0) {
                oVar.f95315b = valueCallback;
                String[] acceptTypes = fileChooserParams.getAcceptTypes();
                C89219l.m154716b(acceptTypes, "");
                if (acceptTypes.length == 0) {
                    str = "";
                } else {
                    str = fileChooserParams.getAcceptTypes()[0];
                }
                oVar.mo69891a(str, "");
                return true;
            }
        }
        C35444b.m72473a(oVar.getActivity(), new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C40709o.C40711b(oVar, valueCallback, fileChooserParams));
        return true;
    }
}
