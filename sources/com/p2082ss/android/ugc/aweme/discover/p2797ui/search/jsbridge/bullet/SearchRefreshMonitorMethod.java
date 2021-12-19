package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41926e;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchRefreshMonitorMethod */
public final class SearchRefreshMonitorMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f100149b = "searchRefreshMonitor";

    static {
        Covode.recordClassIndex(51072);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100149b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchRefreshMonitorMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            AbstractC81915c.m141874a(new C41926e(jSONObject.optLong("networkStart"), jSONObject.optLong("networkEnd"), jSONObject.optInt("itemCount"), jSONObject.optInt("status"), jSONObject.optLong("viewDrawEnd")));
            aVar.mo61872a(new JSONArray());
        } catch (Exception e) {
            aVar.mo61871a(0, e.getMessage());
        }
    }
}
