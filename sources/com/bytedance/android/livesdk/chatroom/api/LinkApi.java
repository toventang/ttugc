package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.interact.model.C7603b;
import com.bytedance.android.livesdk.chatroom.interact.model.C7604c;
import com.bytedance.android.livesdk.chatroom.interact.model.C7605d;
import com.bytedance.android.livesdk.chatroom.interact.model.C7606e;
import com.bytedance.android.livesdk.chatroom.interact.model.C7607f;
import com.bytedance.android.livesdk.chatroom.interact.model.C7608g;
import com.bytedance.android.livesdk.chatroom.interact.model.C7611i;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.model.C7651a;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7656a;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7663b;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7667f;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7668g;
import com.bytedance.android.livesdk.chatroom.model.p495b.p496a.C7657a;
import com.bytedance.android.livesdk.chatroom.model.p495b.p496a.C7659c;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7677b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;

public interface LinkApi {
    static {
        Covode.recordClassIndex(8038);
    }

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/cancel/")
    AbstractC88979t<C5832d<Void>> anchorCancelInviteGuest(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC22018z(mo35807a = "to_user_id") long j3, @AbstractC22018z(mo35807a = "cancel_type") int i, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC21999g
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    @AbstractC22012t(mo35799a = "/webcast/linkmic_audience/apply/")
    AbstractC88403ab<C5832d<C7651a>> apply(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "anchor_id") long j2, @AbstractC21998f Map<String, String> map);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/cancel/")
    AbstractC88979t<C5832d<Void>> cancel(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC22018z(mo35807a = "to_room_id") long j3, @AbstractC22018z(mo35807a = "to_user_id") long j4, @AbstractC22018z(mo35807a = "sec_to_user_id") String str, @AbstractC22018z(mo35807a = "cancel_reason") String str2, @AbstractC22018z(mo35807a = "transparent_extra") String str3);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/check_permission/")
    AbstractC88403ab<C5830b<Void, C7656a>> checkPermissionV1(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "anchor_id") long j2, @AbstractC22018z(mo35807a = "linkmic_layout") int i);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/check_permission/")
    AbstractC88403ab<C5830b<Void, C7656a>> checkPermissionV1(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "anchor_id") long j2, @AbstractC22018z(mo35807a = "linkmic_layout") int i, @AbstractC22018z(mo35807a = "target_user_id") long j3);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/check_permission/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88979t<C5832d<C7603b>> checkPermissionV3(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/finish/")
    AbstractC88403ab<C5832d<Void>> finishV1(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/finish/")
    AbstractC88979t<C5832d<Void>> finishV3(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/finish/")
    AbstractC88979t<C5832d<Void>> finishV3(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "transparent_extra") String str, @AbstractC22018z(mo35807a = "not_suggest_to_uid") long j2);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/get_settings/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88979t<C5832d<C7604c>> getAnchorLinkMicUserSetting(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "sec_user_id") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/list/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88403ab<C5832d<C7668g>> getList(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "anchor_id") long j2, @AbstractC22018z(mo35807a = "link_status") int i);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/init/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88403ab<C5832d<C7663b>> init(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "linkmic_vendor") int i, @AbstractC22018z(mo35807a = "linkmic_layout") int i2);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/invite/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88979t<C5832d<C7607f>> invite(@AbstractC22018z(mo35807a = "vendor") int i, @AbstractC22018z(mo35807a = "to_room_id") long j, @AbstractC22018z(mo35807a = "to_user_id") long j2, @AbstractC22018z(mo35807a = "sec_to_user_id") String str, @AbstractC22018z(mo35807a = "room_id") long j3, @AbstractC22018z(mo35807a = "invite_type") int i2, @AbstractC22018z(mo35807a = "match_type") int i3, @AbstractC22018z(mo35807a = "effective_seconds") int i4);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/get_settings/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88979t<C5832d<C7657a>> isShowGuestLinkHint(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "owner_id") long j2, @AbstractC22018z(mo35807a = "sec_owner_id") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/join_channel/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88403ab<C5832d<C7677b>> joinChannelV1(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/join_channel/")
    AbstractC88979t<C5832d<Void>> joinChannelV3(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/kick_out/")
    AbstractC88403ab<C5832d<Void>> kickOut(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "to_user_id") long j2, @AbstractC22018z(mo35807a = "sec_to_user_id") String str, @AbstractC22018z(mo35807a = "transparent_extra") String str2);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/leave/")
    AbstractC88403ab<C5832d<Void>> leave(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/invite/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88979t<C5832d<C7605d>> linkInRoomAnchorInviteGuest(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "to_user_id") long j2, @AbstractC22018z(mo35807a = "sec_to_user_id") String str, @AbstractC22018z(mo35807a = "effective_seconds") int i, @AbstractC22018z(mo35807a = "invitation_mic_idx") int i2);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/reply/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88979t<C5832d<C7606e>> linkInRoomGuestReplyAnchor(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "reply_status") int i, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC22018z(mo35807a = "invite_user_id") long j3, @AbstractC22018z(mo35807a = "link_type") int i2, @AbstractC22018z(mo35807a = "transparent_extra") String str, @AbstractC22018z(mo35807a = "join_channel") boolean z);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_audience/permit/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88403ab<C5832d<C7659c>> permit(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "to_user_id") long j2, @AbstractC22018z(mo35807a = "sec_to_user_id") String str, @AbstractC22018z(mo35807a = "effective_seconds") int i, @AbstractC22018z(mo35807a = "transparent_extra") String str2, @AbstractC22018z(mo35807a = "permit_status") int i2);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_match/auto_match/")
    AbstractC88979t<C5832d<C7608g>> randomLinkMicAutoMatch(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "user_id") long j2, @AbstractC22018z(mo35807a = "sec_user_id") String str, @AbstractC22018z(mo35807a = "tz_name") String str2, @AbstractC22018z(mo35807a = "tz_offset") int i);

    @AbstractC22000h(mo35789a = "/webcast/linkmic_match/cancel_match/")
    AbstractC88979t<C5832d<Void>> randomLinkMicCancelMatch(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "user_id") long j2, @AbstractC22018z(mo35807a = "sec_user_id") String str);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/reply/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88979t<C5832d<C7667f>> reply(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC22018z(mo35807a = "reply_status") int i, @AbstractC22018z(mo35807a = "invite_user_id") long j3, @AbstractC22018z(mo35807a = "transparent_extra") String str);

    @AbstractC22012t(mo35799a = "/webcast/linkmic_audience/feedback/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> reportAudienceLinkIssue(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "channel_id") long j2, @AbstractC21997e(mo35786a = "scene") int i, @AbstractC21997e(mo35786a = "vendor") int i2, @AbstractC21997e(mo35786a = "issue_category") String str, @AbstractC21997e(mo35786a = "issue_content") String str2, @AbstractC21997e(mo35786a = "err_code") long j3, @AbstractC21997e(mo35786a = "extra_str") String str3);

    @AbstractC22012t(mo35799a = "/webcast/linkmic/feedback/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> reportBroadcasterLinkIssue(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "channel_id") long j2, @AbstractC22018z(mo35807a = "anchor_id") long j3, @AbstractC21997e(mo35786a = "sec_anchor_id") String str, @AbstractC22018z(mo35807a = "to_user_id") long j4, @AbstractC21997e(mo35786a = "sec_to_user_id") String str2, @AbstractC21997e(mo35786a = "scene") String str3, @AbstractC21997e(mo35786a = "vendor") int i, @AbstractC21997e(mo35786a = "issue_category") String str4, @AbstractC21997e(mo35786a = "issue_content") String str5, @AbstractC21997e(mo35786a = "err_code") long j5, @AbstractC21997e(mo35786a = "extra_str") String str6);

    @AbstractC22012t(mo35799a = "/webcast/linkmic/customer_feedback/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> reportCustomerFeedback(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "channel_id") long j2, @AbstractC21997e(mo35786a = "user_id") long j3, @AbstractC21997e(mo35786a = "to_user_id") long j4, @AbstractC21997e(mo35786a = "dislike_to_host") boolean z, @AbstractC21997e(mo35786a = "tags") List<String> list);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/rivals/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.LINK_MIC)
    AbstractC88979t<C5830b<C7611i, RivalsListExtra>> rivalsList(@AbstractC22018z(mo35807a = "rivals_type") int i, @AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "tz_name") String str, @AbstractC22018z(mo35807a = "tz_offset") int i2);

    @AbstractC22012t(mo35799a = "/webcast/linkmic_audience/send_signaling/")
    @AbstractC21999g
    AbstractC88403ab<C5832d<Void>> sendSignalV1(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "content") String str, @AbstractC21997e(mo35786a = "to_user_ids") long[] jArr);

    @AbstractC22000h(mo35789a = "/webcast/linkmic/send_signal/")
    AbstractC88979t<C5832d<Void>> sendSignalV3(@AbstractC22018z(mo35807a = "channel_id") long j, @AbstractC22018z(mo35807a = "content") String str, @AbstractC22018z(mo35807a = "to_user_ids") long[] jArr);

    @AbstractC22012t(mo35799a = "/webcast/linkmic/update_settings/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> updateAnchorLinkSetting(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "sec_user_id") String str, @AbstractC21997e(mo35786a = "effective_field") int i, @AbstractC21997e(mo35786a = "is_turn_on") boolean z, @AbstractC21997e(mo35786a = "accept_multi_linkmic") boolean z2, @AbstractC21997e(mo35786a = "accept_not_follower_invite") boolean z3, @AbstractC21997e(mo35786a = "allow_gift_to_other_anchors") boolean z4, @AbstractC21997e(mo35786a = "block_invitation_of_this_live") boolean z5);

    /* renamed from: com.bytedance.android.livesdk.chatroom.api.LinkApi$b */
    public enum EnumC7284b {
        Invite(0),
        Apply(1);
        
        public int val;

        static {
            Covode.recordClassIndex(8040);
        }

        private EnumC7284b(int i) {
            this.val = i;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.api.LinkApi$d */
    public enum EnumC7286d {
        WINDOW("window"),
        PANEL("panel");
        
        public String value;

        static {
            Covode.recordClassIndex(8042);
        }

        private EnumC7286d(String str) {
            this.value = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.api.LinkApi$a */
    public enum EnumC7283a {
        INVITE_CANCEL("initiative_cancel"),
        COUNTDOWN_CANCEL("countdown_cancel"),
        RTC_ERROR_CANCEL("rtc_error_cancel"),
        INTERRUPT_BY_MULTI_GUEST("interrupt_by_multi_guest");
        
        public String value;

        static {
            Covode.recordClassIndex(8039);
        }

        private EnumC7283a(String str) {
            this.value = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.api.LinkApi$c */
    public enum EnumC7285c {
        USER_CLICK("finish_with_user_click"),
        ILLEGAL_LIVE("finish_with_illegal_live"),
        INTERRUPT_BY_CO_HOST("finish_with_interrupt_by_co_host"),
        RTC_ERROR("finish_with_rtc_error"),
        MIC_ROOM("finish_with_mic_room");
        
        public String value;

        static {
            Covode.recordClassIndex(8041);
        }

        private EnumC7285c(String str) {
            this.value = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.api.LinkApi$e */
    public enum EnumC7287e {
        USER_CLICK("turn_on_with_user_click"),
        AUDIENCE_OPEN("audience_open"),
        AUTO_START("turn_on_with_auto_start"),
        RESTART_AFTER_MIC_ROOM("turn_on_with_restart_after_mic_room"),
        RESTART_AFTER_CO_HOST("turn_on_with_restart_after_co_host");
        
        public String value;

        static {
            Covode.recordClassIndex(8043);
        }

        private EnumC7287e(String str) {
            this.value = str;
        }
    }
}
