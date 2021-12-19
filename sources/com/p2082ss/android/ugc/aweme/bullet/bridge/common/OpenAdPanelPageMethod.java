package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38565b;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38575d;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenAdPanelPageMethod */
public final class OpenAdPanelPageMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35033a f82641b = new C35033a((byte) 0);

    /* renamed from: c */
    private final String f82642c = "openAdPanelPage";

    static {
        Covode.recordClassIndex(42132);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenAdPanelPageMethod$a */
    public static final class C35033a {
        static {
            Covode.recordClassIndex(42133);
        }

        private C35033a() {
        }

        public /* synthetic */ C35033a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82642c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAdPanelPageMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("url");
        boolean z = false;
        int optInt = jSONObject.optInt("landingStyle", 0);
        try {
            Context e = mo26893e();
            if (e == null) {
                e = C17867d.m33078a();
            }
            C89219l.m154716b(optString, "");
            z = C38575d.m78276a(e, new C38565b.C38566a().mo67100f(optString).mo67102g(optString).mo67099f(optInt).f91099a).mo67164a();
        } catch (Throwable unused) {
        }
        if (z) {
            aVar.mo61873a(null, 1, null);
        } else {
            aVar.mo61871a(-1, "Can not handle url");
        }
    }
}
