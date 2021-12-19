package com.bytedance.android.ecommerce.p156b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import java.util.HashMap;

/* renamed from: com.bytedance.android.ecommerce.b.h */
public class C2763h extends AbstractC2753a {
    static {
        Covode.recordClassIndex(3189);
    }

    @Override // com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final String mo7339a() {
        return "pipoAppInfo";
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return AbstractC18400b.EnumC18401a.PUBLIC;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b, com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        super.mo7340a(nVar, bVar, eVar);
        HashMap hashMap = new HashMap();
        hashMap.put("aid", 2112);
        hashMap.put("appVersion", "1.0.0-rc.5");
        bVar.mo13405a(hashMap);
    }
}
