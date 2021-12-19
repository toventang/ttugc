package com.bytedance.android.live.liveinteract.cohost.remote.api;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.interact.model.C7603b;
import com.bytedance.android.livesdk.chatroom.interact.model.C7607f;
import com.bytedance.android.livesdk.chatroom.interact.model.C7608g;
import com.bytedance.android.livesdk.chatroom.interact.model.C7611i;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7667f;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;

public interface CoHostApi {

    /* renamed from: a */
    public static final C4631a f12282a = C4631a.f12283a;

    static {
        Covode.recordClassIndex(5207);
    }

    @AbstractC22000h(mo35789a = "/webcast/linkmic/cancel/")
    AbstractC88403ab<C5832d<Void>> cancel(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC22018z(mo35807a = "to_room_id") long j3, @AbstractC22018z(mo35807a = "to_user_id") long j4, @AbstractC22018z(mo35807a = "sec_to_user_id") String str, @AbstractC22018z(mo35807a = "cancel_reason") String str2, @AbstractC22018z(mo35807a = "transparent_extra") String str3);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/check_permission/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88403ab<C5832d<C7603b>> checkPermissionV3(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/finish/")
    AbstractC88403ab<C5832d<Void>> finishV3(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/finish/")
    AbstractC88403ab<C5832d<Void>> finishV3(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "transparent_extra") String str, @AbstractC22018z(mo35807a = "not_suggest_to_uid") long j2);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/invite/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88403ab<C5832d<C7607f>> invite(@AbstractC22018z(mo35807a = "vendor") int i, @AbstractC22018z(mo35807a = "to_room_id") long j, @AbstractC22018z(mo35807a = "to_user_id") long j2, @AbstractC22018z(mo35807a = "sec_to_user_id") String str, @AbstractC22018z(mo35807a = "room_id") long j3, @AbstractC22018z(mo35807a = "invite_type") int i2, @AbstractC22018z(mo35807a = "match_type") int i3, @AbstractC22018z(mo35807a = "effective_seconds") int i4);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/join_channel/")
    AbstractC88403ab<C5832d<Void>> joinChannelV3(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_match/auto_match/")
    AbstractC88979t<C5832d<C7608g>> randomLinkMicAutoMatch(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "user_id") long j2, @AbstractC22018z(mo35807a = "sec_user_id") String str, @AbstractC22018z(mo35807a = "tz_name") String str2, @AbstractC22018z(mo35807a = "tz_offset") int i);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_match/cancel_match/")
    AbstractC88979t<C5832d<Void>> randomLinkMicCancelMatch(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "user_id") long j2, @AbstractC22018z(mo35807a = "sec_user_id") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/reply/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88403ab<C5832d<C7667f>> reply(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC22018z(mo35807a = "reply_status") int i, @AbstractC22018z(mo35807a = "invite_user_id") long j3, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/rivals/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88979t<C5830b<C7611i, RivalsListExtra>> rivalsList(@AbstractC22018z(mo35807a = "rivals_type") int i, @AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "tz_name") String str, @AbstractC22018z(mo35807a = "tz_offset") int i2);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/send_signal/")
    AbstractC88403ab<C5832d<Void>> sendSignalV3(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "content") String str, @AbstractC22018z(mo35807a = "to_user_ids") long[] jArr);

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi$a */
    public static final class C4631a {

        /* renamed from: a */
        static final /* synthetic */ C4631a f12283a = new C4631a();

        private C4631a() {
        }

        static {
            Covode.recordClassIndex(5208);
        }
    }
}
