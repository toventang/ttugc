package com.p2082ss.android.ugc.aweme.music.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.music.model.MusicDetail;

/* renamed from: com.ss.android.ugc.aweme.music.api.MusicDetailApi */
public final class MusicDetailApi {

    /* renamed from: a */
    public static final DetailApi f137509a = ((DetailApi) RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(DetailApi.class));

    /* renamed from: com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi */
    public interface DetailApi {
        static {
            Covode.recordClassIndex(70875);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/music/detail/")
        AbstractFutureC27655q<MusicDetail> queryMusic(@AbstractC22018z(mo35807a = "music_id") String str, @AbstractC22018z(mo35807a = "click_reason") int i);

        @AbstractC22000h(mo35789a = "/aweme/v1/music/partner/detail/")
        AbstractFutureC27655q<MusicDetail> queryPartnerMusic(@AbstractC22018z(mo35807a = "partner_music_id") String str, @AbstractC22018z(mo35807a = "partner_name") String str2);
    }

    static {
        Covode.recordClassIndex(70874);
    }
}
