package com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.DislikeReasonApi */
public interface DislikeReasonApi {

    /* renamed from: a */
    public static final C33244a f78982a = C33244a.f78984b;

    static {
        Covode.recordClassIndex(40069);
    }

    @AbstractC22012t(mo35799a = "/tiktok/v1/ad/experience/dislike/")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> submitReason(@AbstractC21997e(mo35786a = "item_id") String str, @AbstractC21997e(mo35786a = "ad_id") String str2, @AbstractC21997e(mo35786a = "creative_id") String str3, @AbstractC21997e(mo35786a = "dislike_reasons") String str4, @AbstractC21997e(mo35786a = "log_extra") String str5, @AbstractC21997e(mo35786a = "room_id") String str6);

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.DislikeReasonApi$a */
    public static final class C33244a {

        /* renamed from: a */
        static final String f78983a = ("https://" + C17867d.f42587k.f42569a);

        /* renamed from: b */
        static final /* synthetic */ C33244a f78984b = new C33244a();

        private C33244a() {
        }

        static {
            Covode.recordClassIndex(40070);
        }
    }
}
