package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.api.request.GetItemProductInfoRequest;
import com.p2082ss.android.ugc.aweme.api.resp.C33543a;
import com.p2082ss.android.ugc.aweme.api.resp.C33544b;
import com.p2082ss.android.ugc.aweme.api.resp.C33545c;
import com.p2082ss.android.ugc.aweme.api.resp.C33546d;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.api.AnchorApi */
public final class AnchorApi {

    /* renamed from: a */
    public static final AbstractC18099f f79629a = RetrofitFactory.m33635a().mo28817b(Api.f79771d).mo28832d();

    /* renamed from: b */
    public static final AnchorApi f79630b = new AnchorApi();

    /* renamed from: c */
    private static final AbstractC18099f f79631c = RetrofitFactory.m33635a().mo28816a("https://oec-api.tiktokv.com/");

    /* renamed from: com.ss.android.ugc.aweme.api.AnchorApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(40393);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/anchor/history/delete/")
        @AbstractC89721e
        C1731i<C33543a> getAnchorDeleteHistoryResponse(@AbstractC89719c(mo144273a = "type") int i, @AbstractC89719c(mo144273a = "ids") String str, @AbstractC89719c(mo144273a = "clear_all") boolean z);

        @AbstractC89731o(mo144285a = "/api/v1/shop/item/product_info/get")
        C1731i<C33546d> getAnchorProductInfoResponse(@AbstractC89717a GetItemProductInfoRequest getItemProductInfoRequest);

        @AbstractC89722f(mo144276a = "/aweme/v1/anchor/search/")
        AbstractFutureC27655q<C33544b> getAnchorSearchResponse(@AbstractC89736t(mo144292a = "type") int i, @AbstractC89736t(mo144292a = "keyword") String str, @AbstractC89736t(mo144292a = "page") int i2, @AbstractC89736t(mo144292a = "page_size") int i3);

        @AbstractC89722f(mo144276a = "/aweme/v1/anchor/selection/")
        AbstractFutureC27655q<C33545c> getAnchorSelectionResponse(@AbstractC89736t(mo144292a = "type") int i, @AbstractC89736t(mo144292a = "tab_id") int i2, @AbstractC89736t(mo144292a = "page") int i3, @AbstractC89736t(mo144292a = "page_size") int i4);
    }

    private AnchorApi() {
    }

    static {
        Covode.recordClassIndex(40392);
    }

    /* renamed from: a */
    public static C1731i<C33546d> m68691a(GetItemProductInfoRequest getItemProductInfoRequest) {
        C89219l.m154721d(getItemProductInfoRequest, "");
        return ((RealApi) f79631c.mo28858a(RealApi.class)).getAnchorProductInfoResponse(getItemProductInfoRequest);
    }
}
