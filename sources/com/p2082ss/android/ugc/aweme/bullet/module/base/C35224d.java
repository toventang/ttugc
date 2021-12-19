package com.p2082ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.bullet.kit.web.p1159a.C16480d;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.web.AbstractC16673a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16855g;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35230h;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.d */
public final class C35224d extends C16480d implements WeakHandler.IHandler {

    /* renamed from: c */
    public static final C35225a f83205c = new C35225a((byte) 0);

    /* renamed from: a */
    public final C16248b f83206a;

    /* renamed from: d */
    private WeakReference<DialogC18267b> f83207d;

    /* renamed from: e */
    private final WeakHandler f83208e = new WeakHandler(this);

    /* renamed from: f */
    private final AbstractC35125b f83209f;

    static {
        Covode.recordClassIndex(42386);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.d$a */
    public static final class C35225a {
        static {
            Covode.recordClassIndex(42387);
        }

        private C35225a() {
        }

        public /* synthetic */ C35225a(byte b) {
            this();
        }
    }

    public final void onGeolocationPermissionsHidePrompt() {
        DialogC18267b bVar;
        WeakReference<DialogC18267b> weakReference = this.f83207d;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            C89219l.m154716b(bVar, "");
            if (bVar.isShowing()) {
                bVar.dismiss();
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    public final Bitmap getDefaultVideoPoster() {
        Boolean b;
        MethodCollector.m26663i(7192);
        C16721b b2 = this.f83209f.mo61979b();
        if (!(b2 instanceof C35226e)) {
            b2 = null;
        }
        C16855g gVar = (C16855g) b2;
        if (gVar == null || (b = gVar.f40069V.mo26550b()) == null || !b.booleanValue()) {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            MethodCollector.m26664o(7192);
            return defaultVideoPoster;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        MethodCollector.m26664o(7192);
        return createBitmap;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    public final View getVideoLoadingProgressView() {
        MethodCollector.m26663i(7514);
        Activity a = this.f83209f.mo61971a();
        if (!(a instanceof ActivityC0218d)) {
            a = null;
        }
        ActivityC0218d dVar = (ActivityC0218d) a;
        if (dVar != null) {
            FrameLayout frameLayout = new FrameLayout(dVar);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ProgressBar progressBar = new ProgressBar(dVar);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            frameLayout.addView(progressBar, layoutParams);
            MethodCollector.m26664o(7514);
            return frameLayout;
        }
        MethodCollector.m26664o(7514);
        return null;
    }

    /* renamed from: a */
    private final C35230h m72114a() {
        AbstractC0952i supportFragmentManager;
        AbstractC0952i supportFragmentManager2;
        Activity a = this.f83209f.mo61971a();
        Fragment fragment = null;
        if (!(a instanceof ActivityC0218d)) {
            a = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) a;
        if (eVar == null) {
            C51423a.m95784a(3, null, "activity is null, file upload failed!");
            Logger.throwException(new IllegalArgumentException("activity is null, call zhangxiang.aaron"));
        }
        if (!(eVar == null || (supportFragmentManager2 = eVar.getSupportFragmentManager()) == null)) {
            fragment = supportFragmentManager2.mo3551a("web_view_upload_file");
        }
        if (!(fragment instanceof C35230h)) {
            fragment = new C35230h();
            if (!(eVar == null || (supportFragmentManager = eVar.getSupportFragmentManager()) == null)) {
                supportFragmentManager.mo3552a().mo3456a(fragment, "web_view_upload_file").mo3473c();
            }
        }
        return (C35230h) fragment;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    /* renamed from: a */
    public final void mo26504a(ValueCallback<Uri> valueCallback) {
        C89219l.m154721d(valueCallback, "");
        m72114a().f83236a = valueCallback;
        m72114a().mo62124a("", "");
    }

    /* renamed from: b */
    private final boolean m72116b(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            if (!C89219l.m154714a((Object) "log_event", (Object) parse.getHost())) {
                return false;
            }
            try {
                Message obtainMessage = this.f83208e.obtainMessage(1);
                C89219l.m154716b(obtainMessage, "");
                obtainMessage.obj = parse;
                this.f83208e.sendMessage(obtainMessage);
                return true;
            } catch (Exception unused) {
                z = true;
            }
        } catch (Exception unused2) {
            return z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e A[Catch:{ Exception -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f A[SYNTHETIC, Splitter:B:29:0x005f] */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r12) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.module.base.C35224d.handleMsg(android.os.Message):void");
    }

    /* renamed from: a */
    private final boolean m72115a(String str) {
        Boolean valueOf;
        int i;
        boolean z;
        String[] l;
        Integer k;
        if (str == null) {
            return false;
        }
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33117e b = C33113b.m67827b();
        if (b == null || (valueOf = Boolean.valueOf(b.mo58980j())) == null) {
            return this.f83209f.mo61981d();
        }
        valueOf.booleanValue();
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33117e b2 = C33113b.m67827b();
        if (b2 == null || (k = b2.mo58981k()) == null) {
            i = 1;
        } else {
            i = k.intValue();
        }
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33117e b3 = C33113b.m67827b();
        if (b3 != null && (l = b3.mo58982l()) != null) {
            int length = l.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (C89361p.m154908a((CharSequence) str, (CharSequence) l[i2], false)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (this.f83209f.mo61981d() || i == 0 || i != 1 || z) {
                return false;
            }
            return true;
        }
        z = false;
        if (this.f83209f.mo61981d()) {
        }
        return false;
    }

    public C35224d(C16248b bVar, AbstractC35125b bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f83206a = bVar;
        this.f83209f = bVar2;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    /* renamed from: a */
    public final void mo26505a(ValueCallback<Uri> valueCallback, String str) {
        C89219l.m154721d(valueCallback, "");
        C89219l.m154721d(str, "");
        m72114a().f83236a = valueCallback;
        m72114a().mo62124a(str, "");
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (!((Boolean) C15346a.m28238a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
            C15346a.m28243a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    public final void onConsoleMessage(String str, int i, String str2) {
        Logger.debug();
        if (str != null && C89361p.m154874b(str, "bytedance://", false)) {
            m72116b(str);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f83209f.mo61972a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                adWebStatBusiness.mo61938a(str);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    /* renamed from: a */
    public final void mo26506a(ValueCallback<Uri> valueCallback, String str, String str2) {
        C89219l.m154721d(valueCallback, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m72114a().f83236a = valueCallback;
        m72114a().mo62124a(str, str2);
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    /* renamed from: a */
    public final boolean mo26508a(WebView webView, ValueCallback<Uri[]> valueCallback, AbstractC16673a aVar) {
        String str;
        if (aVar == null) {
            return false;
        }
        Activity a = this.f83209f.mo61971a();
        if (!(a instanceof ActivityC0218d)) {
            a = null;
        }
        ActivityC0218d dVar = (ActivityC0218d) a;
        if (dVar == null) {
            return false;
        }
        C35230h a2 = m72114a();
        String[] a3 = aVar.mo26484a();
        if (C80620e.m139778a(dVar) == 0 && C80620e.m139781c(dVar) == 0) {
            a2.f83237b = valueCallback;
            if (a3 == null || a3.length == 0) {
                str = "";
            } else {
                str = a3[0];
            }
            a2.mo62124a(str, "");
        } else {
            C35444b.m72473a(dVar, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C35230h.C35232b(a2, valueCallback, a3));
        }
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (m72115a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (m72115a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.confirm();
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (m72115a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16684k
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (m72115a(str)) {
            return false;
        }
        if (jsPromptResult == null) {
            return true;
        }
        jsPromptResult.cancel();
        return true;
    }
}
