package com.p2082ss.android.ugc.aweme.ecommerce.coupon;

import android.content.Context;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43324g;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.b */
public interface AbstractC44324b {

    /* renamed from: a */
    public static final C44325a f103370a = C44325a.f103371a;

    static {
        Covode.recordClassIndex(52638);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.b$a */
    public static final class C44325a {

        /* renamed from: a */
        static final /* synthetic */ C44325a f103371a = new C44325a();

        private C44325a() {
        }

        static {
            Covode.recordClassIndex(52639);
        }

        /* renamed from: a */
        public static void m87050a(Context context, int i, String str, int i2, String str2, HashMap<String, Object> hashMap, VoucherInfo voucherInfo, Integer num) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            String a = C43324g.m86442a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_type", Integer.valueOf(i));
            linkedHashMap.put("previous_page", str);
            linkedHashMap.put("from_type", Integer.valueOf(i2));
            if (str2 != null) {
                linkedHashMap.put("entrance_info", str2);
            }
            if (hashMap != null) {
                linkedHashMap.put("trackParams", hashMap);
            }
            if (voucherInfo != null) {
                linkedHashMap.put("voucher_info", voucherInfo);
            }
            if (num != null) {
                num.intValue();
                linkedHashMap.put("voucher_type", num);
            }
            linkedHashMap.put("height", Integer.valueOf(C13628n.m24522c(C17867d.m33078a(), C45563h.m88110a())));
            C45264j.m87843a(context, a, linkedHashMap, false).open();
        }
    }
}
