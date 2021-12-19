package com.bytedance.android.ecommerce.p156b;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.p162h.C2799a;
import com.bytedance.android.ecommerce.p164j.AbstractC2811j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import java.util.Map;

/* renamed from: com.bytedance.android.ecommerce.b.i */
public class C2764i extends AbstractC2753a {

    /* renamed from: a */
    private final String f8311a = "StarlingMethod";

    static {
        Covode.recordClassIndex(3190);
    }

    @Override // com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final String mo7339a() {
        return "pipo.getStarlingData";
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b, com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, final AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        super.mo7340a(nVar, bVar, eVar);
        String f = nVar.mo29763f("language");
        String f2 = nVar.mo29763f("url");
        if (TextUtils.isEmpty(f)) {
            C2799a.m8036a("language is null!", bVar);
        } else if (TextUtils.isEmpty(f2)) {
            C2799a.m8036a("url is null!", bVar);
        } else {
            C2778c.f8362a.mo7376h().mo7406a(f2, new AbstractC2811j.AbstractC2812a() {
                /* class com.bytedance.android.ecommerce.p156b.C2764i.C27651 */

                static {
                    Covode.recordClassIndex(3191);
                }

                @Override // com.bytedance.android.ecommerce.p164j.AbstractC2811j.AbstractC2812a
                /* renamed from: a */
                public final void mo7349a(Map<String, String> map) {
                    C2799a.m8035a(map, bVar);
                }
            }, f);
        }
    }
}
