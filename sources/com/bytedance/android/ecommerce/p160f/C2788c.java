package com.bytedance.android.ecommerce.p160f;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p153a.C2743c;
import com.bytedance.android.ecommerce.p153a.C2744d;
import com.bytedance.android.ecommerce.p153a.C2748h;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.android.ecommerce.p163i.AbstractC2800a;
import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.ecommerce.f.c */
public final class C2788c implements AbstractC2800a {
    static {
        Covode.recordClassIndex(3214);
    }

    @Override // com.bytedance.android.ecommerce.p163i.AbstractC2800a
    /* renamed from: a */
    public final C2744d mo7383a(C2743c... cVarArr) {
        C2744d dVar = new C2744d();
        dVar.f8231a = true;
        C2743c cVar = cVarArr[0];
        String str = cVar.f8224i;
        if (!cVar.mo7324a() || !TextUtils.isEmpty(str)) {
            C2748h a = C2732a.f8145a.mo7357a(str);
            if (a == null) {
                dVar.f8231a = false;
                dVar.mo7327a("pipo_common_error_card_number", new String[0]);
            } else if (C2778c.f8362a.mo7370b().mo7386b(a.f8265h) == null) {
                dVar.f8231a = false;
                dVar.mo7327a("pipo_common_error_card_not_supported", new String[0]);
            } else if (!a.mo7334a().contains(Integer.valueOf(str.length()))) {
                dVar.f8231a = false;
                dVar.mo7327a("pipo_common_error_card_number_length", new String[0]);
            } else if (!Pattern.matches("^[0-9]+$", str)) {
                dVar.f8231a = false;
                dVar.mo7327a("pipo_common_error_card_check", new String[0]);
            } else {
                char[] charArray = str.toCharArray();
                int length = charArray.length + 1;
                int[] iArr = new int[length];
                int length2 = charArray.length - 1;
                int i = 1;
                while (length2 >= 0) {
                    iArr[i] = charArray[length2] - '0';
                    length2--;
                    i++;
                }
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 1; i4 < length; i4++) {
                    if (i4 % 2 == 0) {
                        int i5 = iArr[i4] * 2;
                        if (i5 >= 10) {
                            i5 -= 9;
                        }
                        i2 += i5;
                    } else {
                        i3 += iArr[i4];
                    }
                }
                if ((i2 + i3) % 10 != 0) {
                    dVar.f8231a = false;
                    dVar.mo7327a("pipo_common_error_card_number", new String[0]);
                }
            }
        } else {
            dVar.f8231a = false;
            dVar.mo7327a("pipo_common_error_required_field", "pipo_common_payin_card_number");
        }
        return dVar;
    }
}
