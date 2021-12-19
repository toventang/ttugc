package com.bytedance.android.live.liveinteract.match.remote.api;

import com.bytedance.android.live.liveinteract.match.p305d.C5010a;
import com.bytedance.android.live.liveinteract.match.p305d.C5013b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11696c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface LinkBattleApi {
    static {
        Covode.recordClassIndex(5602);
    }

    @AbstractC22012t(mo35799a = "/webcast/battle/cancel/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> cancel(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "channel_id") long j2, @AbstractC21997e(mo35786a = "battle_id") long j3);

    @AbstractC22000h(mo35789a = "/webcast/battle/check_permission/")
    AbstractC88979t<C5832d<Void>> checkPermission();

    @AbstractC22012t(mo35799a = "/webcast/battle/finish/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C5010a>> finish(@AbstractC21997e(mo35786a = "channel_id") long j, @AbstractC21997e(mo35786a = "battle_id") long j2, @AbstractC21997e(mo35786a = "cut_short") boolean z, @AbstractC21997e(mo35786a = "other_party_left") boolean z2, @AbstractC21997e(mo35786a = "other_party_user_id") long j3);

    @AbstractC22000h(mo35789a = "/webcast/battle/info/")
    AbstractC88979t<C5832d<C11696c>> getInfo(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "channel_id") long j2, @AbstractC22018z(mo35807a = "anchor_id") long j3);

    @AbstractC22000h(mo35789a = "/webcast/battle/info/")
    AbstractC88979t<C5832d<C11696c>> getInfo(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "channel_id") long j2, @AbstractC22018z(mo35807a = "battle_id") long j3, @AbstractC22018z(mo35807a = "anchor_id") long j4);

    @AbstractC22012t(mo35799a = "/webcast/battle/invite/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C5013b>> invite(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "channel_id") long j2, @AbstractC21997e(mo35786a = "target_user_id") long j3, @AbstractC21997e(mo35786a = "invite_type") int i);

    @AbstractC22012t(mo35799a = "/webcast/battle/open/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> open(@AbstractC21997e(mo35786a = "channel_id") long j, @AbstractC21997e(mo35786a = "battle_id") long j2, @AbstractC21997e(mo35786a = "duration") long j3, @AbstractC21997e(mo35786a = "actual_duration") long j4);

    @AbstractC22012t(mo35799a = "/webcast/battle/punish/finish/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> punish(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "channel_id") long j2, @AbstractC21997e(mo35786a = "cut_short") boolean z);

    @AbstractC22012t(mo35799a = "/webcast/battle/reject/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> reject(@AbstractC21997e(mo35786a = "channel_id") long j, @AbstractC21997e(mo35786a = "battle_id") long j2, @AbstractC21997e(mo35786a = "invite_type") int i);
}
