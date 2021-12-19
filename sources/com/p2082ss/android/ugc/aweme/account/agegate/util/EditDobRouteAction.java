package com.p2082ss.android.ugc.aweme.account.agegate.util;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.p2082ss.android.ugc.aweme.account.agegate.C31412b;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.util.EditDobRouteAction */
public final class EditDobRouteAction implements IRouteAction {
    static {
        Covode.recordClassIndex(38267);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Integer num;
        Integer num2;
        String b = C36132v.m73608b(str, "default_birthdate");
        String b2 = C36132v.m73608b(str, "upper_bound_date");
        try {
            num = Integer.valueOf(C36132v.m73608b(str, "edibility_birthdate_type"));
        } catch (Exception unused) {
            num = 1;
        }
        String b3 = C36132v.m73608b(str, "enter_method");
        try {
            num2 = Integer.valueOf(C36132v.m73608b(str, "desc_type"));
        } catch (Exception unused2) {
            num2 = 0;
        }
        C89219l.m154716b(num, "");
        int intValue = num.intValue();
        C89219l.m154716b(num2, "");
        C31412b.m65629a(context, b, b3, intValue, b2, num2.intValue());
        return true;
    }
}
