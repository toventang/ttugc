package com.bytedance.android.ecommerce.p160f;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.ecommerce.p153a.C2733a;
import com.bytedance.android.ecommerce.p153a.C2743c;
import com.bytedance.android.ecommerce.p153a.C2744d;
import com.bytedance.android.ecommerce.p163i.AbstractC2800a;
import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.ecommerce.f.e */
public final class C2790e implements AbstractC2800a {
    static {
        Covode.recordClassIndex(3216);
    }

    @Override // com.bytedance.android.ecommerce.p163i.AbstractC2800a
    /* renamed from: a */
    public final C2744d mo7383a(C2743c... cVarArr) {
        C2733a aVar;
        String str;
        C2744d dVar = new C2744d();
        dVar.f8231a = true;
        C2743c cVar = cVarArr[0];
        String str2 = cVar.f8224i;
        if (cVar.f8229n != null) {
            aVar = (C2733a) cVar.f8229n;
        } else {
            aVar = null;
        }
        if (cVar.mo7324a() && TextUtils.isEmpty(str2)) {
            dVar.f8231a = false;
            dVar.mo7327a("pipo_common_error_required_field", "pipo_common_payin_security_code");
        } else if (aVar != null) {
            if (aVar.mo7317a().size() > 0) {
                str = aVar.mo7317a().toString().replace("[", "{").replace("]", "}").replace(" ", "");
            } else {
                str = "{3,4}";
            }
            if (!Pattern.matches(C1764a.m5928a("^[0-9]%s$", new Object[]{str}), str2)) {
                dVar.f8231a = false;
                dVar.mo7327a("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
            } else if (!Pattern.matches("^[0-9]{3,4}$", str2)) {
                dVar.f8231a = false;
                dVar.mo7327a("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
            }
        } else {
            dVar.f8231a = false;
            dVar.mo7327a("pipo_common_error_is_invalid", "pipo_common_payin_security_code");
        }
        return dVar;
    }
}
