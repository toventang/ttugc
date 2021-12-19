package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.DownloadAppClickMethod */
public final class DownloadAppClickMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82496b = "download_app_click";

    static {
        Covode.recordClassIndex(42017);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82496b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadAppClickMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        boolean z;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Context e = mo26893e();
        if (e != null) {
            String optString = jSONObject.optString("app_id");
            boolean z2 = true;
            if (optString == null || optString.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar.mo61871a(-1, "app_id is empty");
                return;
            }
            if (jSONObject.optInt("direct_download", 0) != 1) {
                z2 = false;
            }
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a == null || !a.mo58931a(e, optString, z2)) {
                aVar.mo61871a(-1, "handle failed");
            } else {
                aVar.mo61872a((Object) null);
            }
        }
    }
}
