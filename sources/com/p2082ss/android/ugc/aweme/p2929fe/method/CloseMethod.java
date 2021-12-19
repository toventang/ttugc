package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.sdk.webview.C30244b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33119b;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.CloseMethod */
public final class CloseMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47820a f110774a = new C47820a((byte) 0);

    static {
        Covode.recordClassIndex(56455);
    }

    private CloseMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.CloseMethod$a */
    public static final class C47820a {
        static {
            Covode.recordClassIndex(56456);
        }

        private C47820a() {
        }

        public /* synthetic */ C47820a(byte b) {
            this();
        }
    }

    private /* synthetic */ CloseMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.CloseMethod$b */
    public static final class C47821b implements AbstractC81914b {

        /* renamed from: a */
        public final int f110775a;

        static {
            Covode.recordClassIndex(56457);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C47821b) && this.f110775a == ((C47821b) obj).f110775a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f110775a;
        }

        public final String toString() {
            return "WebViewFragmentBackEvent(webViewHash=" + this.f110775a + ")";
        }

        public C47821b(int i) {
            this.f110775a = i;
        }
    }

    public CloseMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        int i;
        WebView webView;
        WebView webView2;
        String optString;
        if (this.mJsBridge != null) {
            int i2 = 0;
            if (jSONObject != null && (optString = jSONObject.optString("reactId")) != null && optString.length() != 0 && optString != null) {
                AbstractC81915c.m141874a(new C30244b(optString));
            } else if (this.mContextRef != null) {
                Context actContext = getActContext();
                if (actContext instanceof Activity) {
                    Activity activity = (Activity) actContext;
                    if (activity.isFinishing()) {
                        return;
                    }
                    if (actContext instanceof C17873f.AbstractC17876c) {
                        C18288a aVar2 = this.mJsBridge;
                        if (aVar2 == null || (webView2 = aVar2.f43654d) == null) {
                            i = 0;
                        } else {
                            i = webView2.hashCode();
                        }
                        AbstractC81915c.m141874a(new C47821b(i));
                        C18288a aVar3 = this.mJsBridge;
                        if (!(aVar3 == null || (webView = aVar3.f43654d) == null)) {
                            i2 = webView.hashCode();
                        }
                        AbstractC81915c.m141874a(new C33119b(i2));
                        return;
                    }
                    activity.finish();
                }
            }
        }
    }
}
