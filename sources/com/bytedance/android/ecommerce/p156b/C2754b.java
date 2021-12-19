package com.bytedance.android.ecommerce.p156b;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p162h.C2799a;
import com.bytedance.android.ecommerce.p165k.C2838i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import java.util.HashMap;

/* renamed from: com.bytedance.android.ecommerce.b.b */
public class C2754b extends AbstractC2753a {
    static {
        Covode.recordClassIndex(3180);
    }

    @Override // com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final String mo7339a() {
        return "pipo.encryptString";
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b, com.bytedance.android.ecommerce.p156b.AbstractC2753a
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        super.mo7340a(nVar, bVar, eVar);
        String f = nVar.mo29763f("key");
        String f2 = nVar.mo29763f("origin_str");
        if (TextUtils.isEmpty(f)) {
            C2799a.m8036a("key is null!", bVar);
        } else if (TextUtils.isEmpty(f2)) {
            C2799a.m8036a("origin_str is null!", bVar);
        } else {
            String a = C2838i.m8117a(f, f2);
            if (a == null) {
                a = "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("result", a);
            C2799a.m8035a(hashMap, bVar);
        }
    }
}
