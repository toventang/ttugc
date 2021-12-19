package com.bytedance.android.ecommerce.p160f;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p153a.C2743c;
import com.bytedance.android.ecommerce.p153a.C2744d;
import com.bytedance.android.ecommerce.p153a.C2745e;
import com.bytedance.android.ecommerce.p163i.AbstractC2800a;
import com.bytedance.android.ecommerce.p165k.C2828c;
import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.ecommerce.f.a */
public final class C2786a implements AbstractC2800a {
    static {
        Covode.recordClassIndex(3212);
    }

    /* renamed from: a */
    private static C2744d m8016a(C2743c cVar) {
        C2744d dVar = new C2744d();
        dVar.f8231a = true;
        for (C2745e eVar : cVar.mo7325b()) {
            C2744d a = m8018a(cVar.f8224i, eVar);
            if (!a.f8231a) {
                return a;
            }
        }
        if (TextUtils.equals(cVar.f8222g, "R") && TextUtils.isEmpty(cVar.f8224i)) {
            dVar.f8231a = false;
            dVar.mo7327a("empty_content", new String[0]);
        }
        return dVar;
    }

    @Override // com.bytedance.android.ecommerce.p163i.AbstractC2800a
    /* renamed from: a */
    public final C2744d mo7383a(C2743c... cVarArr) {
        C2744d a = m8016a(cVarArr[0]);
        if (cVarArr.length > 1) {
            for (C2743c cVar : cVarArr) {
                a.mo7329a(m8016a(cVar));
            }
        }
        return a;
    }

    /* renamed from: a */
    private static C2744d m8018a(String str, C2745e eVar) {
        C2744d dVar = new C2744d();
        dVar.f8231a = true;
        String str2 = eVar.f8235a;
        str2.hashCode();
        switch (str2.hashCode()) {
            case 108392519:
                if (str2.equals("regex")) {
                    return m8019a(str, eVar.f8236b, eVar.f8237c);
                }
                break;
            case 844440762:
                if (str2.equals("max_len")) {
                    return m8017a(str, C2828c.m8097a(eVar.f8236b), eVar.f8237c);
                }
                break;
            case 1064238760:
                if (str2.equals("min_len")) {
                    return m8020b(str, C2828c.m8097a(eVar.f8236b), eVar.f8237c);
                }
                break;
        }
        return dVar;
    }

    /* renamed from: a */
    private static C2744d m8017a(String str, int i, String str2) {
        C2744d dVar = new C2744d();
        dVar.f8231a = true;
        if (str != null && str.length() <= i) {
            return dVar;
        }
        dVar.f8231a = false;
        dVar.mo7327a(str2, new String[0]);
        return dVar;
    }

    /* renamed from: b */
    private static C2744d m8020b(String str, int i, String str2) {
        C2744d dVar = new C2744d();
        dVar.f8231a = true;
        if (str != null && str.length() >= i) {
            return dVar;
        }
        dVar.f8231a = false;
        dVar.mo7327a(str2, new String[0]);
        return dVar;
    }

    /* renamed from: a */
    private static C2744d m8019a(String str, String str2, String str3) {
        C2744d dVar = new C2744d();
        dVar.f8231a = true;
        if (!Pattern.matches(str2, str)) {
            dVar.f8231a = false;
            dVar.mo7327a(str3, new String[0]);
        }
        return dVar;
    }
}
