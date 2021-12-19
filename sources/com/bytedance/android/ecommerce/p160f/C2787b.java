package com.bytedance.android.ecommerce.p160f;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p153a.C2743c;
import com.bytedance.android.ecommerce.p153a.C2744d;
import com.bytedance.android.ecommerce.p163i.AbstractC2800a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.f.b */
public final class C2787b implements AbstractC2800a {
    static {
        Covode.recordClassIndex(3213);
    }

    @Override // com.bytedance.android.ecommerce.p163i.AbstractC2800a
    /* renamed from: a */
    public final C2744d mo7383a(C2743c... cVarArr) {
        C2744d dVar = new C2744d();
        dVar.f8231a = true;
        String str = cVarArr[0].f8224i;
        String str2 = cVarArr[1].f8224i;
        String str3 = cVarArr[2].f8224i;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        boolean isEmpty3 = TextUtils.isEmpty(str3);
        if ((isEmpty || isEmpty2 || isEmpty3) && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3))) {
            dVar.f8231a = false;
            dVar.mo7327a("invalid_billing_address", new String[0]);
        } else if (!TextUtils.isEmpty(str3) && str3.length() > 300) {
            dVar.f8231a = false;
            dVar.mo7327a("invalid_post_code", new String[0]);
        }
        return dVar;
    }
}
