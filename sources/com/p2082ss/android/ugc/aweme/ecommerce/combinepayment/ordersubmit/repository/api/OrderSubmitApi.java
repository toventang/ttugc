package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43849c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43850d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43860n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43865s;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.OrderSubmitApi */
public interface OrderSubmitApi {

    /* renamed from: a */
    public static final C43842a f102151a = C43842a.f102153b;

    static {
        Covode.recordClassIndex(52107);
    }

    @AbstractC89731o(mo144285a = "/api/v1/trade/order/create")
    AbstractC88979t<C43850d> createOrder(@AbstractC89717a C43849c cVar);

    @AbstractC89731o(mo144285a = "/api/v1/shop/bill_info/get")
    AbstractC88979t<BillInfoResponse> getBillInfo(@AbstractC89717a BillInfoRequest billInfoRequest);

    @AbstractC89722f(mo144276a = "api/v1/shop/quit_reasons/get")
    AbstractC88979t<C43612a<C43860n>> getQuitReason(@AbstractC89736t(mo144292a = "reason_show_type") int i);

    @AbstractC89731o(mo144285a = "/api/v1/shop/quit_reasons/save")
    AbstractC88979t<C43612a<Object>> submitQuitReason(@AbstractC89717a C43865s sVar);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.OrderSubmitApi$a */
    public static final class C43842a {

        /* renamed from: a */
        public static final AbstractC18099f f102152a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C43842a f102153b = new C43842a();

        private C43842a() {
        }

        static {
            Covode.recordClassIndex(52108);
        }
    }
}
