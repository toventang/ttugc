package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.user.C2993a;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.model.C3254b;
import com.bytedance.android.live.broadcast.model.C3263i;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.broadcast.model.C3273p;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.C7694n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface BroadcastRoomApi {
    static {
        Covode.recordClassIndex(3481);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/screenshot_category_list/")
    AbstractC88979t<C5832d<Object>> getAllCategory(@AbstractC22018z(mo35807a = "platform") int i);

    @AbstractC22000h(mo35789a = "/webcast/room/anchor_pre_finish/")
    AbstractC88979t<C5832d<C3254b>> getAnchorPreFinish(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22012t(mo35799a = "/webcast/room/get_latest_room/")
    AbstractC88979t<C5832d<Room>> getLatestRoom();

    @AbstractC22000h(mo35789a = "/webcast/room/game_list/")
    AbstractC88979t<C5831c<Game>> getLiveGameList(@AbstractC22018z(mo35807a = "game_icon") int i);

    @AbstractC22000h(mo35789a = "/webcast/room/live_permission/apply_info/")
    AbstractC88979t<C5832d<C3263i>> getLivePermissionApply(@AbstractC22018z(mo35807a = "permission_names") String str);

    @AbstractC22000h(mo35789a = "/webcast/anchor/health_score/total/")
    AbstractC88979t<C5832d<Object>> getLiveRoomHealthInfo();

    @AbstractC22000h(mo35789a = "/webcast/room/create_info/")
    AbstractC88979t<C5832d<C3272o>> getPreviewRoomCreateInfo(@AbstractC22018z(mo35807a = "last_time_hashtag_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/room/auditing/info/")
    AbstractC88979t<C5832d<WaitingReviewInfo>> getReviewInfo(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/room/tag_list/")
    AbstractC88979t<C5831c<C7694n>> getRoomTags();

    @AbstractC22000h(mo35789a = "/webcast/anchor/cover/neednotice/")
    AbstractC88979t<C5832d<Object>> shouldShowCoverNotice();

    @AbstractC22012t(mo35799a = "/webcast/room/video/capture/")
    AbstractC88979t<C5832d<Object>> updateCaptureVideo(@AbstractC21994b TypedOutput typedOutput);

    @AbstractC22012t(mo35799a = "/webcast/room/update_room_info/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C3273p>> updateRoomInfo(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "cover_uri") String str);

    @AbstractC22012t(mo35799a = "/webcast/room/internal_ci_info/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> uploadBeautyParams(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "filter_name") String str, @AbstractC21997e(mo35786a = "brightening") int i, @AbstractC21997e(mo35786a = "beauty_skin") int i2, @AbstractC21997e(mo35786a = "big_eyes") int i3, @AbstractC21997e(mo35786a = "face_lift") int i4, @AbstractC21997e(mo35786a = "use_filter") boolean z);

    @AbstractC22012t(mo35799a = "/webcast/review/upload_original_frame")
    AbstractC88979t<C5832d<C2993a>> uploadOriginScreen(@AbstractC21994b TypedOutput typedOutput, @AbstractC22018z(mo35807a = "room_id") Long l);
}
