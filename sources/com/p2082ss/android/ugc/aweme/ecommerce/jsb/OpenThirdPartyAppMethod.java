package com.p2082ss.android.ugc.aweme.ecommerce.jsb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import androidx.browser.p024a.C0479c;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.C80557hw;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethod */
public final class OpenThirdPartyAppMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C44547a f103947b = new C44547a((byte) 0);

    /* renamed from: a */
    public final C18288a f103948a;

    static {
        Covode.recordClassIndex(52900);
    }

    private OpenThirdPartyAppMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethod$a */
    public static final class C44547a {
        static {
            Covode.recordClassIndex(52901);
        }

        private C44547a() {
        }

        public /* synthetic */ C44547a(byte b) {
            this();
        }
    }

    private /* synthetic */ OpenThirdPartyAppMethod() {
        this((C18288a) null);
    }

    public OpenThirdPartyAppMethod(C18288a aVar) {
        super(aVar);
        this.f103948a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Context context;
        String str;
        WebView webView;
        C18288a aVar2 = this.f103948a;
        String str2 = null;
        if (aVar2 == null || (webView = aVar2.f43654d) == null) {
            context = null;
        } else {
            context = webView.getContext();
        }
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            if (jSONObject != null) {
                str = jSONObject.optString("url");
                str2 = jSONObject.optString("packageName");
            } else {
                str = null;
            }
            if (C80557hw.m139640a(C17867d.m33078a(), str2)) {
                try {
                    C0479c.C0480a aVar3 = new C0479c.C0480a();
                    aVar3.mo2041a().f1822a.setPackage(str2);
                    aVar3.mo2041a().mo2040a(activity, Uri.parse(str));
                    if (aVar != null) {
                        aVar.mo79886a((Object) new JSONObject());
                    }
                } catch (Exception e) {
                    if (aVar != null) {
                        aVar.mo79885a(-1, e.toString());
                    }
                }
            } else if (aVar != null) {
                aVar.mo79885a(-1, "app not installed");
            }
        }
    }
}
