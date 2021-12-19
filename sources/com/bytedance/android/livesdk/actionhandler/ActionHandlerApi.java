package com.bytedance.android.livesdk.actionhandler;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

interface ActionHandlerApi {
    static {
        Covode.recordClassIndex(7344);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/info/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.ROOM)
    AbstractC21983b<C5832d<Room>> getRoomStats(@AbstractC22018z(mo35807a = "is_anchor") boolean z, @AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "pack_level") int i);

    @AbstractC21999g
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.REPORT)
    @AbstractC22012t(mo35799a = "/webcast/user/report/commit/")
    AbstractC88979t<C5832d<ReportCommitData>> postReportReasons(@AbstractC21997e(mo35786a = "target_room_id") long j, @AbstractC21997e(mo35786a = "target_anchor_id") long j2, @AbstractC21997e(mo35786a = "reason") long j3, @AbstractC21997e(mo35786a = "report_record_extra") String str);
}
