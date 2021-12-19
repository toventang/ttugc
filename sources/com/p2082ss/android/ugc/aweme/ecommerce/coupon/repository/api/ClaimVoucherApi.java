package com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.ClaimVoucherRequest;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.ClaimVoucherResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.api.ClaimVoucherApi */
public interface ClaimVoucherApi {

    /* renamed from: a */
    public static final C44330a f103385a = C44330a.f103386a;

    static {
        Covode.recordClassIndex(52645);
    }

    @AbstractC89731o(mo144285a = "/api/v1/shop/voucher/claim")
    AbstractC88979t<ClaimVoucherResponse> claimVoucher(@AbstractC89717a ClaimVoucherRequest claimVoucherRequest);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.api.ClaimVoucherApi$a */
    public static final class C44330a {

        /* renamed from: a */
        static final /* synthetic */ C44330a f103386a = new C44330a();

        /* renamed from: b */
        private static final AbstractC18099f f103387b = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        private C44330a() {
        }

        static {
            Covode.recordClassIndex(52646);
        }
    }
}
