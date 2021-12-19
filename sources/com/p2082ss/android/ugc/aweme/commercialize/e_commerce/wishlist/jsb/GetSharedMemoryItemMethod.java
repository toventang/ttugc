package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.C37763a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.GetSharedMemoryItemMethod */
public final class GetSharedMemoryItemMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C37759a f89164b = new C37759a((byte) 0);

    /* renamed from: c */
    private final String f89165c = "getSharedMemoryItem";

    static {
        Covode.recordClassIndex(45202);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.GetSharedMemoryItemMethod$a */
    public static final class C37759a {
        static {
            Covode.recordClassIndex(45203);
        }

        private C37759a() {
        }

        public /* synthetic */ C37759a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f89165c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSharedMemoryItemMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            aVar.mo61873a(C37763a.f89172a, 1, null);
        } catch (Exception e) {
            aVar.mo61871a(-1, e.getMessage());
            e.printStackTrace();
        }
    }
}
