package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41930i;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenHotSpotMethod */
public final class OpenHotSpotMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42929a f100100b = new C42929a((byte) 0);

    /* renamed from: c */
    private final String f100101c = "openHotspot";

    static {
        Covode.recordClassIndex(51045);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenHotSpotMethod$a */
    public static final class C42929a {
        static {
            Covode.recordClassIndex(51046);
        }

        private C42929a() {
        }

        public /* synthetic */ C42929a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100101c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenHotSpotMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Bundle bundle = new Bundle();
        JSONObject optJSONObject = jSONObject.optJSONObject("log_extra");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = optJSONObject.opt(next);
                if (opt != null) {
                    bundle.putString(next, opt.toString());
                }
            }
            String optString = jSONObject.optString("aweme_id");
            String optString2 = jSONObject.optString("trending_event_id");
            String optString3 = jSONObject.optString("trending_event_name");
            bundle.putString("id", optString);
            bundle.putString("trending_event_id", optString2);
            bundle.putString("trending_event_name", optString3);
        }
        AbstractC81915c.m141874a(new C41930i(bundle));
        aVar.mo61872a(new JSONArray());
    }
}
