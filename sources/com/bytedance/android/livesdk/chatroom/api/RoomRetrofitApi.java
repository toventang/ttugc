package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.network.response.C5833e;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.model.DecorationTextAuditResult;
import com.bytedance.android.livesdkapi.depend.model.live.ContinueRoomResponse;
import com.bytedance.android.livesdkapi.depend.model.live.DebugRoomItem;
import com.bytedance.android.livesdkapi.depend.model.live.DebugToolState;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22016x;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;

public interface RoomRetrofitApi {
    static {
        Covode.recordClassIndex(8049);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/collect_unread/")
    AbstractC88979t<C5832d<Object>> collectUnreadRequest(@AbstractC22018z(mo35807a = "unread_extra") String str, @AbstractC22018z(mo35807a = "room_ids") String str2);

    @AbstractC22000h(mo35789a = "/webcast/room/continue/")
    AbstractC88979t<C5832d<ContinueRoomResponse>> continuePreviousRoom();

    @AbstractC22012t(mo35799a = "/webcast/room/create/")
    @AbstractC21999g
    AbstractC88979t<C5833e<Room>> createRoom(@AbstractC21998f HashMap<String, String> hashMap);

    @AbstractC22000h(mo35789a = "/hotsoon/room/{roomId}/_deblock_mosaic/")
    AbstractC88979t<C5832d<Object>> deblockMosaic(@AbstractC22016x(mo35804a = "roomId") long j);

    @AbstractC22012t(mo35799a = "/webcast/room/digg/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Object>> digg(@AbstractC21998f HashMap<String, String> hashMap);

    @AbstractC21999g
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.ROOM)
    @AbstractC22012t(mo35799a = "/webcast/room/enter/")
    AbstractC88979t<C5830b<Room, EnterRoomExtra>> enterRoom(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "hold_living_room") long j2, @AbstractC21997e(mo35786a = "is_login") long j3, @AbstractC21998f HashMap<String, String> hashMap);

    @AbstractC22000h(mo35789a = "/webcast/room/info/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.ROOM)
    AbstractC88979t<C5832d<Room>> fetchRoom(@AbstractC21987aa HashMap<String, String> hashMap);

    @AbstractC22000h(mo35789a = "/webcast/room/finish_abnormal/")
    AbstractC88979t<C5832d<Object>> finishRoomAbnormal();

    @AbstractC22000h(mo35789a = "/webcast/anchor/health_score/total/")
    AbstractC88979t<C5832d<Object>> getLiveRoomHealthInfo();

    @AbstractC22000h(mo35789a = "/hotsoon/room/follow/ids/")
    AbstractC21983b<C5831c<Long>> getLivingRoomIds();

    @AbstractC22012t(mo35799a = "/webcast/room/mget_info/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Map<String, Room>>> getMultipleRoomInfo(@AbstractC21997e(mo35786a = "room_ids") String str);

    @AbstractC22000h(mo35789a = "/webcast/room/debug_item/")
    AbstractC88979t<C5832d<List<DebugRoomItem>>> getRoomDebugInfo(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/room/debug_permission/")
    AbstractC88979t<C5832d<DebugToolState>> getRoomDebugInfoPermission();

    @AbstractC22000h(mo35789a = "/webcast/room/info/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.ROOM)
    AbstractC21983b<C5832d<Room>> getRoomStats(@AbstractC22018z(mo35807a = "is_anchor") boolean z, @AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "pack_level") int i);

    @AbstractC22000h(mo35789a = "/webcast/room/info/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.ROOM)
    AbstractC21983b<C5832d<Room>> getRoomStats(@AbstractC22018z(mo35807a = "is_anchor") boolean z, @AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "pack_level") int i, @AbstractC22018z(mo35807a = "need_health_score_info") boolean z2, @AbstractC22018z(mo35807a = "from_type") int i2);

    @AbstractC22012t(mo35799a = "/webcast/room/leave/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Object>> leaveRoom(@AbstractC21997e(mo35786a = "room_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/room/background_img/delete/")
    AbstractC88979t<C5832d<Void>> removeRoomBackgroundImg(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "user_id") long j2);

    @AbstractC22012t(mo35799a = "/webcast/room/decoration/audit_text/")
    @AbstractC21999g
    AbstractC88979t<C5832d<DecorationTextAuditResult>> sendDecorationText(@AbstractC21998f HashMap<String, String> hashMap);

    @AbstractC22000h(mo35789a = "/webcast/room/ping/audience/")
    AbstractC88979t<C5832d<PingResult>> sendPlayingPing(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "only_status") int i);

    @AbstractC22000h(mo35789a = "/webcast/room/auditing/apply/")
    AbstractC88979t<C5832d<Object>> unblockRoom(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/anchor/memorial/memorial_reported/")
    AbstractC88979t<C5832d<Void>> updateAnchorMemorial(@AbstractC22018z(mo35807a = "anchor_id") long j);
}
