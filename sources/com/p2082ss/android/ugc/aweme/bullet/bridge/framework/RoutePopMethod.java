package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Intent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34322e;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePopMethod */
public final class RoutePopMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35085a f82787b = new C35085a((byte) 0);

    /* renamed from: c */
    private final String f82788c = "routePop";

    static {
        Covode.recordClassIndex(42217);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePopMethod$a */
    public static final class C35085a {
        static {
            Covode.recordClassIndex(42218);
        }

        private C35085a() {
        }

        public /* synthetic */ C35085a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82788c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoutePopMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        AbstractC17045g f = mo26894f();
        if (f != null) {
            JSONObject jSONObject2 = new JSONObject();
            C34322e.m70198a(jSONObject2, jSONObject);
            Intent intent = new Intent();
            intent.putExtra("serialized_data", jSONObject2.toString());
            f.mo26822a(intent);
            f.mo26825b();
            aVar.mo61873a(new JSONObject(), 1, "pop succeed");
            return;
        }
        aVar.mo61871a(-1, "params not valid");
    }
}
