package com.p2082ss.android.ugc.aweme.bullet.bridge.commerce;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commerce.service.C37533a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.FetchFeedsAwemeDataMethod */
public final class FetchFeedsAwemeDataMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34994a f82560b = new C34994a((byte) 0);

    /* renamed from: c */
    private final String f82561c = "fetchFeedsAwemeData";

    static {
        Covode.recordClassIndex(42066);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.FetchFeedsAwemeDataMethod$a */
    public static final class C34994a {
        static {
            Covode.recordClassIndex(42067);
        }

        private C34994a() {
        }

        public /* synthetic */ C34994a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82561c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchFeedsAwemeDataMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            String optString = jSONObject.optString("item_id");
            if (!TextUtils.isEmpty(optString)) {
                aVar.mo61872a((Object) new JSONObject().put("aweme", C80342dg.m139300a().mo46674b(C37533a.m75656a().getAwemeById(optString))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
