package com.p2082ss.android.ugc.aweme.detail.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41128a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.detail.api.DetailApi */
public final class DetailApi {

    /* renamed from: a */
    public static final IDetailApi f96100a = ((IDetailApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(IDetailApi.class));

    /* renamed from: b */
    private static final String f96101b = (C29736b.f70924e + "/aweme/v1/aweme/detail/");

    /* renamed from: com.ss.android.ugc.aweme.detail.api.DetailApi$IDetailApi */
    public interface IDetailApi {
        static {
            Covode.recordClassIndex(48986);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/aweme/detail/")
        AbstractC21983b<String> queryAweme(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "origin_type") String str2, @AbstractC22018z(mo35807a = "request_source") int i, @AbstractC22018z(mo35807a = "notice_source") int i2);

        @AbstractC22012t(mo35799a = "/tiktok/v1/ad/experience/ad/history/detail/")
        @AbstractC21999g
        AbstractC21983b<String> queryAwemeFromInbox(@AbstractC21997e(mo35786a = "aweme_id") String str, @AbstractC21997e(mo35786a = "msg_extra") String str2);

        @AbstractC22012t(mo35799a = "/aweme/v1/multi/aweme/detail/")
        @AbstractC21999g
        AbstractC21983b<C41128a> queryBatchAweme(@AbstractC21997e(mo35786a = "aweme_ids") String str, @AbstractC21997e(mo35786a = "origin_type") String str2, @AbstractC21997e(mo35786a = "push_params") String str3, @AbstractC21997e(mo35786a = "request_source") int i);
    }

    static {
        Covode.recordClassIndex(48985);
    }

    /* renamed from: a */
    public static Aweme m82809a(String str, String str2, int i) {
        T t = f96100a.queryAweme(str, str2, "message".equals(str2) ? 1 : 0, i).execute().f52262b;
        JSONObject jSONObject = new JSONObject((String) t);
        Api.m68818a(jSONObject, t, f96101b);
        return (Aweme) GsonHolder.m138943c().mo123620b().mo46670a(jSONObject.optString("aweme_detail"), Aweme.class);
    }

    /* renamed from: a */
    public static C41128a m82808a(String str, String str2, String str3, int i) {
        if (i < 0) {
            i = 0;
        }
        if ("chat".equals(str3)) {
            i = 3;
            str3 = "";
        }
        return f96100a.queryBatchAweme(str, str3, str2, i).execute().f52262b;
    }
}
