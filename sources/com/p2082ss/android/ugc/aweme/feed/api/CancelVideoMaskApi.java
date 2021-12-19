package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.feed.api.CancelVideoMaskApi */
public final class CancelVideoMaskApi {

    /* renamed from: a */
    public static final CancelVideoMaskApi f111978a = new CancelVideoMaskApi();

    /* renamed from: b */
    private static final RealApi f111979b = ((RealApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.CancelVideoMaskApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(57069);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/mask/cancel/")
        @AbstractC89721e
        AbstractC88979t<BaseResponse> cancelVideoMask(@AbstractC89719c(mo144273a = "aweme_id") String str, @AbstractC89719c(mo144273a = "mask_type") Integer num, @AbstractC89719c(mo144273a = "status") Integer num2);
    }

    private CancelVideoMaskApi() {
    }

    static {
        Covode.recordClassIndex(57068);
    }

    /* renamed from: a */
    public static AbstractC88979t<BaseResponse> m91764a(String str, Integer num, Integer num2) {
        C89219l.m154721d(str, "");
        return f111979b.cancelVideoMask(str, num, num2);
    }
}
