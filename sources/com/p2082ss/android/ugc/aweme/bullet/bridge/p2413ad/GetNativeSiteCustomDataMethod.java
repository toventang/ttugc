package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35186c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.GetNativeSiteCustomDataMethod */
public final class GetNativeSiteCustomDataMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82502b = "getNativeSiteCustomData";

    static {
        Covode.recordClassIndex(42026);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82502b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetNativeSiteCustomDataMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C35186c cVar;
        String str = "";
        C89219l.m154721d(jSONObject, str);
        C89219l.m154721d(aVar, str);
        JSONObject jSONObject2 = new JSONObject();
        AbstractC16208i h = mo61867h();
        if (!(h == null || (cVar = (C35186c) h.mo25763a(C35186c.class)) == null)) {
            String b = cVar.f83034ah.mo26550b();
            if (b != null) {
                str = b;
            }
            jSONObject2.put("customData", str);
        }
        aVar.mo61874a(jSONObject2);
    }
}
