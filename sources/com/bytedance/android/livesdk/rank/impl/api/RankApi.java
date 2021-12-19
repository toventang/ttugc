package com.bytedance.android.livesdk.rank.impl.api;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.rank.api.model.C10353g;
import com.bytedance.android.livesdk.rank.api.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.api.model.PeriodRankExtra;
import com.bytedance.android.livesdk.rank.impl.api.model.C10365b;
import com.bytedance.android.livesdk.rank.impl.api.model.C10369f;
import com.bytedance.android.livesdk.rank.impl.api.model.RankResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22016x;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;

public interface RankApi {
    static {
        Covode.recordClassIndex(11932);
    }

    @AbstractC22000h(mo35789a = "/webcast/ranklist/hour/")
    AbstractC88979t<C5830b<Object, Extra>> getDailyRankContent(@AbstractC21987aa HashMap<String, String> hashMap);

    @AbstractC22000h(mo35789a = "/webcast/ranklist/noble/")
    AbstractC88979t<C5832d<Object>> getNobleUserRank(@AbstractC21987aa HashMap<String, String> hashMap);

    @AbstractC22000h(mo35789a = "/webcast/ranklist/online_audience/")
    AbstractC88979t<C5832d<C10353g>> getOnlineRankList(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "anchor_id") long j2);

    @AbstractC22000h(mo35789a = "/webcast/ranklist/contributor/")
    AbstractC88979t<C5830b<CurrentRankListResponse, PeriodRankExtra>> getPeriodUserRank(@AbstractC21987aa HashMap<String, String> hashMap);

    @AbstractC22000h(mo35789a = "/webcast/ranklist/list/")
    AbstractC88979t<C5832d<RankResponse>> getRankList(@AbstractC22018z(mo35807a = "anchor_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC22018z(mo35807a = "rank_types") String str, @AbstractC22018z(mo35807a = "region_type") int i);

    @AbstractC22012t(mo35799a = "/webcast/ranklist/score_display_config/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C10369f>> getScoreDisplayConfig(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "score_location") String str);

    @AbstractC22000h(mo35789a = "/webcast/ranklist/room/{room_id}/contributor/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.RANK_LIST)
    AbstractC88979t<C5832d<CurrentRankListResponse>> getUserRankContent(@AbstractC22016x(mo35804a = "room_id") long j, @AbstractC21987aa HashMap<String, String> hashMap);

    @AbstractC22000h(mo35789a = "/webcast/ranklist/entrance/")
    AbstractC88979t<C5832d<C10365b>> queryRankEntrances(@AbstractC22018z(mo35807a = "anchor_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2);
}
