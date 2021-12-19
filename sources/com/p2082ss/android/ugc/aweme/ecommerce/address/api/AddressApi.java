package com.p2082ss.android.ugc.aweme.ecommerce.address.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C22099u;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43365a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43366b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43367c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43369e;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43370f;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43372h;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43374j;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43375k;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43376l;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.api.AddressApi */
public interface AddressApi {

    /* renamed from: a */
    public static final C43341a f101151a = C43341a.f101153b;

    static {
        Covode.recordClassIndex(51558);
    }

    @AbstractC89731o(mo144285a = "/api/v1/shop/shipping_address/delete")
    AbstractC88979t<C43612a<Object>> deleteAddress(@AbstractC89717a C43372h hVar);

    @AbstractC89731o(mo144285a = "/api/v1/shop/shipping_address/get")
    AbstractC88979t<C22099u<C43612a<C43365a>>> getAddressList();

    @AbstractC89731o(mo144285a = "/api/v1/shop/shipping_address/get_detail_place")
    AbstractC88979t<C22099u<C43612a<C43367c>>> getCandDetailPlace(@AbstractC89717a C43366b bVar);

    @AbstractC89731o(mo144285a = "/api/v1/shop/shipping_address/get_shipping_address_candidate_input")
    AbstractC88979t<C22099u<C43612a<C43369e>>> getCandInput(@AbstractC89717a C43370f fVar);

    @AbstractC89731o(mo144285a = "/api/v1/shop/shipping_address/input_item")
    AbstractC88979t<C22099u<C43612a<InputItemData>>> getInputItems(@AbstractC89717a C43374j jVar);

    @AbstractC89731o(mo144285a = "/api/v1/shop/shipping_address/save")
    AbstractC88979t<C22099u<C43612a<C43375k>>> saveAddress(@AbstractC89717a C43376l lVar);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.api.AddressApi$a */
    public static final class C43341a {

        /* renamed from: a */
        public static final AbstractC18099f f101152a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C43341a f101153b = new C43341a();

        private C43341a() {
        }

        static {
            Covode.recordClassIndex(51559);
        }

        /* renamed from: a */
        public static AbstractC88979t<C22099u<C43612a<InputItemData>>> m86459a(Region region) {
            return ((AddressApi) f101152a.mo28858a(AddressApi.class)).getInputItems(new C43374j(region));
        }
    }
}
