package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.AwemeDetailList;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentStatusResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ImChatTopTipModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.UserStruct;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55372b;
import kotlinx.coroutines.AbstractC89531av;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi */
public interface TikTokImApi {
    static {
        Covode.recordClassIndex(65005);
    }

    @AbstractC89731o(mo144285a = "im/group/invite/accept/")
    @AbstractC89721e
    AbstractC88979t<AcceptInviteCardResponse> acceptInviteCard(@AbstractC89719c(mo144273a = "invite_id") String str);

    @AbstractC89731o(mo144285a = "im/chat/notice/ack/")
    @AbstractC89721e
    AbstractC89531av<BaseResponse> acknowledgeNoticeRead(@AbstractC89719c(mo144273a = "notice_code") String str, @AbstractC89719c(mo144273a = "source_type") String str2, @AbstractC89719c(mo144273a = "operation_code") int i, @AbstractC89719c(mo144273a = "conversation_id") String str3);

    @AbstractC89731o(mo144285a = "im/user/info/")
    @AbstractC89721e
    AbstractC89531av<Object> fetchUserInfo(@AbstractC89719c(mo144273a = "sec_user_ids") String str);

    @AbstractC22000h(mo35789a = "/tiktok/comment/status/batch_get/v1")
    AbstractC88973n<CommentStatusResponse> getCommentStatusBatch(@AbstractC89736t(mo144292a = "cids") String str);

    @AbstractC89731o(mo144285a = "im/group/invite/share")
    @AbstractC89721e
    AbstractC89531av<C55372b> getGroupInviteInfo(@AbstractC89719c(mo144273a = "conversation_short_id") String str);

    @AbstractC89731o(mo144285a = "im/group/invite/verify/")
    @AbstractC89721e
    AbstractC88979t<InviteCardDetailInnerResponse> getInviteCardDetailInner(@AbstractC89719c(mo144273a = "invite_id") String str);

    @AbstractC22000h(mo35789a = "im/chat/notice/")
    AbstractC89531av<ImChatTopTipModel> getTopChatNotice(@AbstractC89736t(mo144292a = "to_user_id") String str, @AbstractC89736t(mo144292a = "sec_to_user_id") String str2, @AbstractC89736t(mo144292a = "conversation_id") String str3, @AbstractC89736t(mo144292a = "source_type") String str4, @AbstractC89736t(mo144292a = "unread_count") int i, @AbstractC89736t(mo144292a = "push_status") int i2);

    @AbstractC89731o(mo144285a = "im/chat/stranger/unlimit/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> postChatStrangeUnLimit(@AbstractC89719c(mo144273a = "to_user_id") String str, @AbstractC89719c(mo144273a = "sec_to_user_id") String str2, @AbstractC89719c(mo144273a = "conversation_id") String str3);

    @AbstractC89731o(mo144285a = "videos/detail/")
    @AbstractC89721e
    AbstractC89531av<AwemeDetailList> queryAwemeList(@AbstractC89719c(mo144273a = "aweme_ids") String str, @AbstractC89719c(mo144273a = "origin_type") String str2, @AbstractC89719c(mo144273a = "request_source") int i);

    @AbstractC22000h(mo35789a = "user/")
    AbstractC88973n<UserStruct> queryUser(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2);
}
