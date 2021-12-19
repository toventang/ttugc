package com.bytedance.android.ecommerce.p164j;

import com.bytedance.android.ecommerce.p153a.C2743c;
import com.bytedance.android.ecommerce.p153a.C2744d;
import com.bytedance.android.ecommerce.p160f.C2786a;
import com.bytedance.android.ecommerce.p160f.C2787b;
import com.bytedance.android.ecommerce.p160f.C2788c;
import com.bytedance.android.ecommerce.p160f.C2789d;
import com.bytedance.android.ecommerce.p160f.C2790e;
import com.bytedance.android.ecommerce.p160f.C2791f;
import com.bytedance.android.ecommerce.p160f.C2792g;
import com.bytedance.android.ecommerce.p160f.C2793h;
import com.bytedance.android.ecommerce.p160f.C2794i;
import com.bytedance.android.ecommerce.p160f.C2795j;
import com.bytedance.android.ecommerce.p160f.C2796k;
import com.bytedance.android.ecommerce.p160f.C2797l;
import com.bytedance.android.ecommerce.p163i.AbstractC2800a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.ecommerce.j.b */
public final class C2803b implements AbstractC2800a {

    /* renamed from: a */
    private Map<String, AbstractC2800a> f8398a = new HashMap();

    /* renamed from: b */
    private C2786a f8399b = new C2786a();

    static {
        Covode.recordClassIndex(3229);
    }

    public C2803b() {
        this.f8398a.put("eg_ccdc_global_card_number", new C2788c());
        this.f8398a.put("eg_ccdc_global_cvv", new C2790e());
        this.f8398a.put("eg_ccdc_global_expiration_year", new C2792g());
        this.f8398a.put("eg_ccdc_global_billing_address_country_regin", new C2787b());
        this.f8398a.put("eg_ccdc_global_identity", new C2789d());
        this.f8398a.put("eg_pi_ew_ovo_c_d_local_id_wallet_id", new C2794i());
        this.f8398a.put("eg_ccdc_global_holder_name", new C2793h());
        this.f8398a.put("eg_ccdc_global_email", new C2791f());
        this.f8398a.put("eg_ccdc_global_billing_address", new C2796k());
        this.f8398a.put("eg_ccdc_global_billing_address_street_mobile", new C2797l());
        this.f8398a.put("eg_ccdc_global_billing_address_postal_code", new C2795j());
    }

    @Override // com.bytedance.android.ecommerce.p163i.AbstractC2800a
    /* renamed from: a */
    public final C2744d mo7383a(C2743c... cVarArr) {
        AbstractC2800a aVar = this.f8398a.get(cVarArr[0].f8216a);
        C2744d dVar = new C2744d();
        if (aVar != null) {
            return aVar.mo7383a(cVarArr);
        }
        return dVar;
    }
}
