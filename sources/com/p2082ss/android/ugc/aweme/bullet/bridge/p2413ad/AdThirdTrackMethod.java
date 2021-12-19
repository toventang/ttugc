package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdThirdTrackMethod */
public final class AdThirdTrackMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34970a f82484b = new C34970a((byte) 0);

    /* renamed from: c */
    private final String f82485c = "sendThirdTrack";

    static {
        Covode.recordClassIndex(42005);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdThirdTrackMethod$a */
    public static final class C34970a {
        static {
            Covode.recordClassIndex(42006);
        }

        private C34970a() {
        }

        public /* synthetic */ C34970a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82485c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdThirdTrackMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
        String optString = jSONObject.optString("track_label");
        String optString2 = jSONObject.optString("creative_id");
        String optString3 = jSONObject.optString("log_extra");
        String optString4 = jSONObject.optString("ad_id");
        String optString5 = jSONObject.optString("group_id");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            aVar.mo61871a(-1, "empty track_url_list");
        } else if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            aVar.mo61871a(-1, "empty trackLabel or creativeId");
        } else {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString6 = optJSONArray.optString(i);
                C89219l.m154716b(optString6, "");
                arrayList.add(optString6);
            }
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                C89219l.m154716b(optString, "");
                C89219l.m154716b(optString2, "");
                a.mo58926a(optString, arrayList, C89361p.m154865g(optString2), optString3, optString5, optString4);
            }
            aVar.mo61872a((Object) null);
        }
    }
}
