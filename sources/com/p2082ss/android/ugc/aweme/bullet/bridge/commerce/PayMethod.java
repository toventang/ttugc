package com.p2082ss.android.ugc.aweme.bullet.bridge.commerce;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.PayMethod */
public final class PayMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34997a f82566b = new C34997a((byte) 0);

    /* renamed from: c */
    private final String f82567c = "pay";

    static {
        Covode.recordClassIndex(42072);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.PayMethod$a */
    public static final class C34997a {
        static {
            Covode.recordClassIndex(42073);
        }

        private C34997a() {
        }

        public /* synthetic */ C34997a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82567c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }
}