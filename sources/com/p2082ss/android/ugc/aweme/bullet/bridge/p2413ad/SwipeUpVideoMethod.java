package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33134q;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.SwipeUpVideoMethod */
public final class SwipeUpVideoMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82550b = "swipeUpVideo";

    static {
        Covode.recordClassIndex(42058);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82550b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeUpVideoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Object b;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        AbstractC16249c b2 = this.f38923a.mo25830b(BulletContainerView.class);
        int i = 0;
        if (!(b2 == null || (b = b2.mo25823b()) == null)) {
            i = b.hashCode();
        }
        AbstractC81915c.m141874a(new C33134q(i, jSONObject.optString("refer")));
    }
}
