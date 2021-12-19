package com.bytedance.globalpayment.iap.google.helper;

import com.android.billingclient.api.C2240g;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.google.p1070f.C15193b;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;

/* renamed from: com.bytedance.globalpayment.iap.google.helper.a */
public class C15197a {

    /* renamed from: a */
    public static boolean f37094a = false;

    /* renamed from: b */
    public static int f37095b;

    /* renamed from: c */
    public static int f37096c;

    /* renamed from: d */
    public static int f37097d;

    /* renamed from: e */
    private static final String f37098e = C15197a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17378);
    }

    /* renamed from: a */
    public static C2240g m28001a(C2240g.C2241a aVar, OrderData orderData) {
        String str;
        String orderId = orderData.getOrderId();
        String str2 = orderData.getIapPayRequest().f36917b;
        String userId = orderData.getUserId();
        String str3 = orderData.getIapPayRequest().f36924i;
        if (orderData.isNewSubscription()) {
            str = "1";
        } else {
            str = "0";
        }
        if (f37094a) {
            String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
            int max = Math.max(Math.max(f37095b, f37096c), f37097d);
            orderId = "";
            str2 = orderId;
            userId = str2;
            for (int i = 0; i < max; i++) {
                if (i < f37095b) {
                    orderId = orderId + (i % 10);
                }
                if (i < f37096c) {
                    str2 = str2 + strArr[i % 10];
                }
                if (i < f37097d) {
                    userId = userId + strArr[i % 10].toUpperCase();
                }
            }
        }
        C15253a.m28071a().mo24705e();
        orderId.length();
        str2.length();
        userId.length();
        aVar.f6725a = "newstr" + C15193b.m27998a(new String[]{orderId, C15253a.m28071a().mo24709i().mo24715d().f37213a, str});
        if (str2.length() > 64) {
            aVar.f6726b = str2.substring(0, 64);
        } else if ((str2 + "\n" + userId).length() > 64) {
            aVar.f6726b = (str2 + "\n" + userId).substring(0, 64);
        } else if ((str2 + "\n" + userId + "\n" + str3).length() > 64) {
            aVar.f6726b = (str2 + "\n" + userId + "\n" + str3).substring(0, 64);
        } else {
            aVar.f6726b = str2 + "\n" + userId + "\n" + str3;
        }
        return aVar.mo6210a();
    }
}
