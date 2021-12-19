package com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43641b;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43642c;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.api.CartApi */
public interface CartApi {

    /* renamed from: a */
    public static final C43643a f101732a = C43643a.f101734b;

    static {
        Covode.recordClassIndex(51901);
    }

    @AbstractC89731o(mo144285a = "/api/v1/shop/cart/add_item_to_cart")
    AbstractC88979t<C43642c> addToCart(@AbstractC89717a C43641b bVar);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.api.CartApi$a */
    public static final class C43643a {

        /* renamed from: a */
        static final AbstractC18099f f101733a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C43643a f101734b = new C43643a();

        private C43643a() {
        }

        static {
            Covode.recordClassIndex(51902);
        }
    }
}
