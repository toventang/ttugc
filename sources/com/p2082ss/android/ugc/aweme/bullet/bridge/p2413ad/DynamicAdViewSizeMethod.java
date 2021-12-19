package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdViewSizeMethod */
public final class DynamicAdViewSizeMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82499b = "getDCViewSize";

    static {
        Covode.recordClassIndex(42020);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82499b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicAdViewSizeMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        C89378p<Integer, Integer> b = FeedAdServiceImpl.m67808c().mo58883b().mo59090b();
        if (b.getSecond().intValue() == 0) {
            C89219l.m154721d("getDCViewSize failed", "");
            aVar.mo61871a(-1, "");
            return;
        }
        C89219l.m154721d("getDCViewSize success", "");
        aVar.mo61872a((Object) new JSONObject().put("viewPortWidth", b.getFirst().intValue()).put("viewPortHeight", b.getSecond().intValue()));
    }
}
