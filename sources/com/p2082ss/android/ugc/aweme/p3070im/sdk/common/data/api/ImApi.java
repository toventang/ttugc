package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1216f.C17458d;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.BlockResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.ShareStateResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.UserOtherResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.UserSelfResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.UserStruct;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model.RelationFetchResponse;
import kotlinx.coroutines.AbstractC89531av;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi */
public interface ImApi {
    static {
        Covode.recordClassIndex(65004);
    }

    @AbstractC89722f(mo144276a = "user/block/")
    AbstractFutureC27655q<BlockResponse> block(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "block_type") int i);

    @AbstractC89722f(mo144276a = "user/block/")
    AbstractC88973n<BlockResponse> blockUser(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "block_type") int i);

    @AbstractC89731o(mo144285a = "im/msg/feedback/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> feedBackMsg(@AbstractC89719c(mo144273a = "content") String str, @AbstractC89719c(mo144273a = "msg_type") String str2, @AbstractC89719c(mo144273a = "scene") String str3, @AbstractC89719c(mo144273a = "msg_id") String str4, @AbstractC89719c(mo144273a = "conv_short_id") Long l, @AbstractC89719c(mo144273a = "receiver_uid") Long l2);

    @AbstractC89722f(mo144276a = "im/reboot/misc/")
    AbstractC88979t<C17458d> fetchMixInit(@AbstractC89736t(mo144292a = "r_cell_status") int i, @AbstractC89736t(mo144292a = "is_active_x") int i2, @AbstractC89736t(mo144292a = "im_token") int i3);

    @AbstractC89722f(mo144276a = "user/profile/other/")
    AbstractC89531av<UserOtherResponse> fetchUserOther(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2);

    @AbstractC89722f(mo144276a = "user/profile/self/")
    AbstractC89531av<UserSelfResponse> fetchUserSelf(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2);

    @AbstractC89722f(mo144276a = "im/spotlight/multi_relation/")
    AbstractC88403ab<ShareStateResponse> getShareUserCanSendMsg(@AbstractC89736t(mo144292a = "sec_to_user_id") String str);

    @AbstractC89722f(mo144276a = "spotlight/relation/")
    AbstractFutureC27655q<RelationFetchResponse> getSpotlightRelation(@AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "source") String str, @AbstractC89736t(mo144292a = "with_fstatus") int i2, @AbstractC89736t(mo144292a = "max_time") long j, @AbstractC89736t(mo144292a = "min_time") long j2, @AbstractC89736t(mo144292a = "address_book_access") int i3, @AbstractC89736t(mo144292a = "with_mention_check") boolean z);

    @AbstractC89722f(mo144276a = "user/")
    AbstractFutureC27655q<UserStruct> queryUser(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2);
}
