package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.C37763a;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.SetSharedMemoryItemMethod */
public final class SetSharedMemoryItemMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C37761a f89168b = new C37761a((byte) 0);

    /* renamed from: c */
    private final String f89169c = "setSharedMemoryItem";

    static {
        Covode.recordClassIndex(45206);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb.SetSharedMemoryItemMethod$a */
    public static final class C37761a {
        static {
            Covode.recordClassIndex(45207);
        }

        private C37761a() {
        }

        public /* synthetic */ C37761a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f89169c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetSharedMemoryItemMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                C89219l.m154716b(next, "");
                C89219l.m154716b(optString, "");
                C89219l.m154721d(next, "");
                C89219l.m154721d(optString, "");
                C37763a.f89172a.put(next, optString);
            }
            aVar.mo61873a(null, 1, null);
        } catch (Exception e) {
            aVar.mo61871a(-1, e.getMessage());
            e.printStackTrace();
        }
    }
}
