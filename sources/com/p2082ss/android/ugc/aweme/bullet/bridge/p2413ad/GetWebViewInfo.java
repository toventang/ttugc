package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import android.webkit.WebView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.GetWebViewInfo */
public final class GetWebViewInfo extends BaseBridgeMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(42029);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return "getWebViewInfo";
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetWebViewInfo(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.GetWebViewInfo$a */
    public static final class C34974a implements AbstractC81914b {

        /* renamed from: a */
        public final int f82504a;

        /* renamed from: b */
        public final BaseBridgeMethod.AbstractC34965a f82505b;

        static {
            Covode.recordClassIndex(42030);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34974a)) {
                return false;
            }
            C34974a aVar = (C34974a) obj;
            return this.f82504a == aVar.f82504a && C89219l.m154714a(this.f82505b, aVar.f82505b);
        }

        public final int hashCode() {
            int i = this.f82504a * 31;
            BaseBridgeMethod.AbstractC34965a aVar = this.f82505b;
            return i + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "GetStatusEvent(webViewHash=" + this.f82504a + ", iReturn=" + this.f82505b + ")";
        }

        public C34974a(int i, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82504a = i;
            this.f82505b = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        int i;
        WebView webView;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        C18288a aVar2 = (C18288a) this.f38923a.mo25832c(C18288a.class);
        if (aVar2 == null || (webView = aVar2.f43654d) == null) {
            i = 0;
        } else {
            i = webView.hashCode();
        }
        AbstractC81915c.m141874a(new C34974a(i, aVar));
    }
}
