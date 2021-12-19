package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LoadGeckoResourcesMethod */
public final class LoadGeckoResourcesMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34975a f82506b = new C34975a((byte) 0);

    /* renamed from: c */
    private final String f82507c = "loadGeckoResources";

    static {
        Covode.recordClassIndex(42031);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LoadGeckoResourcesMethod$a */
    public static final class C34975a {
        static {
            Covode.recordClassIndex(42032);
        }

        private C34975a() {
        }

        public /* synthetic */ C34975a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82507c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadGeckoResourcesMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        AbstractC33368e a;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (jSONObject.has("channels")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("channels");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                C89219l.m154716b(optString, "");
                arrayList.add(optString);
            }
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (!(f == null || (a = f.mo59376a()) == null)) {
                a.mo59418c(arrayList);
            }
        }
    }
}
