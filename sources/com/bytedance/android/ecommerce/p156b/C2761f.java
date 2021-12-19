package com.bytedance.android.ecommerce.p156b;

import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.p162h.C2799a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.b.f */
public class C2761f extends AbstractC2753a {

    /* renamed from: a */
    private final String f8308a = "OnEventMethod";

    static {
        Covode.recordClassIndex(3187);
    }

    @Override // com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final String mo7339a() {
        return "pipo.onEvent";
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b, com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: b */
    public final String mo7341b() {
        return "pipo.onEvent";
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b, com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        super.mo7340a(nVar, bVar, eVar);
        String f = nVar.mo29763f("event_name");
        AbstractC18754n h = nVar.mo29765h("params");
        JSONObject jSONObject = new JSONObject();
        if (h != null) {
            Map<String, Object> b = h.mo29758b();
            for (String str : b.keySet()) {
                try {
                    jSONObject.put(str, b.get(str));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        C2778c.f8362a.mo7374f().mo7380a(f, jSONObject);
        C2799a.m8035a((Object) "success", bVar);
    }
}
