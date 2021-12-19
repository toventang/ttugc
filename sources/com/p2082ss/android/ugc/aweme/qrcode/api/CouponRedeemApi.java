package com.p2082ss.android.ugc.aweme.qrcode.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;

/* renamed from: com.ss.android.ugc.aweme.qrcode.api.CouponRedeemApi */
public final class CouponRedeemApi {

    /* renamed from: com.ss.android.ugc.aweme.qrcode.api.CouponRedeemApi$RetroApi */
    public interface RetroApi {
        static {
            Covode.recordClassIndex(77898);
        }

        @AbstractC22000h(mo35789a = "/aweme/v2/coupon/qrcode/detail/")
        AbstractFutureC27655q<Object> getCouponDetail(@AbstractC22018z(mo35807a = "code_id") String str, @AbstractC22018z(mo35807a = "source") int i);

        @AbstractC22000h(mo35789a = "/aweme/v2/coupon/validate/")
        AbstractFutureC27655q<Object> redeemCoupon(@AbstractC22018z(mo35807a = "code_id") String str);
    }

    static {
        Covode.recordClassIndex(77897);
    }
}
