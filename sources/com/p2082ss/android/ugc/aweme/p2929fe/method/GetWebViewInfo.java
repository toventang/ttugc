package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.webkit.WebView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetWebViewInfo */
public final class GetWebViewInfo extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47832a f110801a = new C47832a((byte) 0);

    static {
        Covode.recordClassIndex(56479);
    }

    private GetWebViewInfo(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.GetWebViewInfo$a */
    public static final class C47832a {
        static {
            Covode.recordClassIndex(56480);
        }

        private C47832a() {
        }

        public /* synthetic */ C47832a(byte b) {
            this();
        }
    }

    private /* synthetic */ GetWebViewInfo() {
        this((C18288a) null);
    }

    public GetWebViewInfo(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.GetWebViewInfo$b */
    public static final class C47833b implements AbstractC81914b {

        /* renamed from: a */
        public final int f110802a;

        /* renamed from: b */
        public final BaseCommonJavaMethod.AbstractC47813a f110803b;

        static {
            Covode.recordClassIndex(56481);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47833b)) {
                return false;
            }
            C47833b bVar = (C47833b) obj;
            return this.f110802a == bVar.f110802a && C89219l.m154714a(this.f110803b, bVar.f110803b);
        }

        public final int hashCode() {
            int i = this.f110802a * 31;
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110803b;
            return i + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "GetStatusEvent(webViewHash=" + this.f110802a + ", iReturn=" + this.f110803b + ")";
        }

        public C47833b(int i, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110802a = i;
            this.f110803b = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        int i;
        WebView webView;
        C18288a aVar2 = this.mJsBridge;
        if (aVar2 == null || (webView = aVar2.f43654d) == null) {
            i = 0;
        } else {
            i = webView.hashCode();
        }
        AbstractC81915c.m141874a(new C47833b(i, aVar));
    }
}
