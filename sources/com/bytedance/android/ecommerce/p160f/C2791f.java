package com.bytedance.android.ecommerce.p160f;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p153a.C2743c;
import com.bytedance.android.ecommerce.p153a.C2744d;
import com.bytedance.android.ecommerce.p163i.AbstractC2800a;
import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.ecommerce.f.f */
public final class C2791f implements AbstractC2800a {
    static {
        Covode.recordClassIndex(3217);
    }

    @Override // com.bytedance.android.ecommerce.p163i.AbstractC2800a
    /* renamed from: a */
    public final C2744d mo7383a(C2743c... cVarArr) {
        C2744d dVar = new C2744d();
        dVar.f8231a = true;
        C2743c cVar = cVarArr[0];
        String str = cVar.f8224i;
        if (cVar.mo7324a() && TextUtils.isEmpty(str)) {
            dVar.f8231a = false;
            dVar.mo7327a("pipo_common_error_required_field", "pipo_common_payin_Email");
        } else if (!Pattern.matches("^(([^<>()\\[\\]\\\\.,;:\\s@\"]+(\\.[^<>()\\[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$", str)) {
            dVar.f8231a = false;
            dVar.mo7327a("pipo_common_error_is_invalid", "pipo_common_payin_Email");
        }
        return dVar;
    }
}
