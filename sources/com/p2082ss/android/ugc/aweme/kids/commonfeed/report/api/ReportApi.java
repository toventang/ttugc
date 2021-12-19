package com.p2082ss.android.ugc.aweme.kids.commonfeed.report.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.api.ReportApi */
public final class ReportApi {

    /* renamed from: a */
    public static final RetrofitApi f131030a = ((RetrofitApi) RetrofitFactory.m33635a().mo28816a(C57345a.f130717a).mo28858a(RetrofitApi.class));

    /* renamed from: b */
    public static final ReportApi f131031b = new ReportApi();

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.api.ReportApi$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(67391);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/aweme/feedback/")
        AbstractC88979t<BaseResponse> reportAwame(@AbstractC22018z(mo35807a = "report_type") String str, @AbstractC22018z(mo35807a = "object_id") long j, @AbstractC22018z(mo35807a = "owner_id") long j2, @AbstractC22018z(mo35807a = "reason") int i, @AbstractC22018z(mo35807a = "additional_reasons") String str2);
    }

    private ReportApi() {
    }

    static {
        Covode.recordClassIndex(67390);
    }
}
