package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.C45655a;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.DistrictData;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4601a.C89070n;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.repo.RegionApi */
public interface RegionApi {

    /* renamed from: a */
    public static final C45656a f106281a = C45656a.f106282a;

    static {
        Covode.recordClassIndex(54158);
    }

    @AbstractC89731o(mo144285a = "/api/v1/logistics/district/list")
    AbstractC88979t<C43612a<DistrictData>> getDistricts(@AbstractC89717a C45655a aVar);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.repo.RegionApi$a */
    public static final class C45656a {

        /* renamed from: a */
        static final /* synthetic */ C45656a f106282a = new C45656a();

        /* renamed from: b */
        private static final AbstractC18099f f106283b = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        private C45656a() {
        }

        static {
            Covode.recordClassIndex(54159);
        }

        /* renamed from: a */
        public static AbstractC88979t<C43612a<DistrictData>> m88166a(String[] strArr, OrderSKUDTO orderSKUDTO) {
            List list;
            RegionApi regionApi = (RegionApi) f106283b.mo28858a(RegionApi.class);
            if (strArr == null) {
                strArr = new String[0];
            }
            if (orderSKUDTO != null) {
                list = C89070n.m154516a(orderSKUDTO);
            } else {
                list = null;
            }
            return regionApi.getDistricts(new C45655a(strArr, list));
        }
    }
}
