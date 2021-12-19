package com.bytedance.android.ecommerce.p156b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;

/* renamed from: com.bytedance.android.ecommerce.b.a */
public abstract class AbstractC2753a extends AbstractC18468a {

    /* renamed from: a */
    private final String f8291a = "BaseBridgeMethod";

    static {
        Covode.recordClassIndex(3179);
    }

    /* renamed from: a */
    public abstract String mo7339a();

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public String mo7341b() {
        return mo7339a();
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        mo7339a();
    }
}
