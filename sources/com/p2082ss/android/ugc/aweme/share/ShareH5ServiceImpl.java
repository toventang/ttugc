package com.p2082ss.android.ugc.aweme.share;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.ShareSearchMethod;
import com.p2082ss.android.ugc.aweme.bullet.business.AbsShareBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.ShareBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.C40594i;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.PushOperationMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ShareLiveEventMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ShareMethod;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ShareH5ServiceImpl */
public final class ShareH5ServiceImpl implements ShareH5Service {
    static {
        Covode.recordClassIndex(81123);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final String mo109374a() {
        return "share";
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: b */
    public final String mo109385b() {
        return "shareLiveEvent";
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: c */
    public final String mo109391c() {
        return "pushOperation";
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final boolean mo109382a(WeakReference<Context> weakReference, JSONObject jSONObject) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(jSONObject, "");
        ShareMethod shareMethod = new ShareMethod();
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(jSONObject, "");
        return shareMethod.mo79927a(weakReference, jSONObject, null, null, null);
    }

    /* renamed from: d */
    public static ShareH5Service m121398d() {
        MethodCollector.m26663i(1429);
        Object a = C81908b.m141854a(ShareH5Service.class, false);
        if (a != null) {
            ShareH5Service shareH5Service = (ShareH5Service) a;
            MethodCollector.m26664o(1429);
            return shareH5Service;
        }
        if (C81908b.f183324dU == null) {
            synchronized (ShareH5Service.class) {
                try {
                    if (C81908b.f183324dU == null) {
                        C81908b.f183324dU = new ShareH5ServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1429);
                    throw th;
                }
            }
        }
        ShareH5ServiceImpl shareH5ServiceImpl = (ShareH5ServiceImpl) C81908b.f183324dU;
        MethodCollector.m26664o(1429);
        return shareH5ServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final BaseCommonJavaMethod mo109373a(C18288a aVar) {
        return new PushOperationMethod(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: b */
    public final BaseCommonJavaMethod mo109384b(C18288a aVar) {
        return new ShareMethod(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: c */
    public final BaseCommonJavaMethod mo109390c(C18288a aVar) {
        return new ShareLiveEventMethod(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final BaseBridgeMethod mo109372a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new com.p2082ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: b */
    public final BaseBridgeMethod mo109383b(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new ShareSearchMethod(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: b */
    public final void mo109386b(AbstractC35125b bVar) {
        C89219l.m154721d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.mo61972a(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.mo61928b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final Map<String, Object> mo109375a(AbstractC35125b bVar) {
        C89219l.m154721d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.mo61972a(ShareBusiness.class);
        if (absShareBusiness != null) {
            return C89041ag.m154412a(new C89378p("local_obj", absShareBusiness.f82850h));
        }
        return C89041ag.m154415a();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final void mo109376a(AbstractC35125b bVar, SSWebView sSWebView) {
        C89219l.m154721d(bVar, "");
        ShareBusiness shareBusiness = (ShareBusiness) bVar.mo61972a(ShareBusiness.class);
        if (shareBusiness != null) {
            shareBusiness.f82898l = sSWebView;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: b */
    public final void mo109387b(AbstractC35125b bVar, SSWebView sSWebView) {
        MethodCollector.m26663i(1423);
        C89219l.m154721d(bVar, "");
        if (bVar.mo61972a(ShareBusiness.class) == null) {
            MethodCollector.m26664o(1423);
        } else if (sSWebView != null) {
            String str = "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());";
            String a = C84357h.f188595a.mo129370a(sSWebView, str);
            if (!TextUtils.isEmpty(a)) {
                str = a;
            }
            sSWebView.loadUrl(str);
            MethodCollector.m26664o(1423);
        } else {
            MethodCollector.m26664o(1423);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final void mo109377a(AbstractC35125b bVar, String str) {
        C89219l.m154721d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.mo61972a(ShareBusiness.class);
        if (absShareBusiness != null && !TextUtils.isEmpty(str)) {
            absShareBusiness.f82844b = null;
            absShareBusiness.f82846d = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: b */
    public final void mo109388b(AbstractC35125b bVar, String str) {
        C89219l.m154721d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.mo61972a(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.f82846d = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final void mo109378a(AbstractC35125b bVar, boolean z) {
        C89219l.m154721d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.mo61972a(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.f82847e = z;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final void mo109379a(AbstractC40591g gVar, int i) {
        com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness;
        if (gVar != null && (absShareBusiness = (com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) gVar.mo69748a(C40594i.C40595a.m81944a(i))) != null) {
            absShareBusiness.mo69698c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: b */
    public final void mo109389b(AbstractC40591g gVar, SingleWebView singleWebView, int i) {
        com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness;
        C89219l.m154721d(singleWebView, "");
        if (gVar != null && (absShareBusiness = (com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) gVar.mo69748a(C40594i.C40595a.m81944a(i))) != null && singleWebView != null) {
            if (absShareBusiness.f94918g == null) {
                absShareBusiness.f94918g = new AbsShareBusiness.C40568a(absShareBusiness, (byte) 0);
            }
            singleWebView.getSettings().setJavaScriptEnabled(true);
            int i2 = Build.VERSION.SDK_INT;
            singleWebView.addJavascriptInterface(absShareBusiness.f94918g, "local_obj");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final void mo109380a(AbstractC40591g gVar, SingleWebView singleWebView, int i) {
        com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness;
        MethodCollector.m26663i(1320);
        C89219l.m154721d(singleWebView, "");
        if (gVar == null || (absShareBusiness = (com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) gVar.mo69748a(C40594i.C40595a.m81944a(i))) == null) {
            MethodCollector.m26664o(1320);
            return;
        }
        if (singleWebView != null) {
            absShareBusiness.f94919h = singleWebView;
            WebView webView = absShareBusiness.f94919h;
            int i2 = Build.VERSION.SDK_INT;
            String concat = "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }".concat("window.local_obj.showSource(window.__title__, getAwemeMetaDatas());");
            String a = C84357h.f188595a.mo129370a(webView, concat);
            if (!TextUtils.isEmpty(a)) {
                concat = a;
            }
            webView.loadUrl(concat);
        }
        MethodCollector.m26664o(1320);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareH5Service
    /* renamed from: a */
    public final void mo109381a(AbstractC40591g gVar, String str, int i) {
        com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness;
        if (gVar != null && (absShareBusiness = (com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) gVar.mo69748a(C40594i.C40595a.m81944a(i))) != null && !TextUtils.isEmpty(str)) {
            absShareBusiness.f94912a = null;
            absShareBusiness.f94915d = str;
        }
    }
}
