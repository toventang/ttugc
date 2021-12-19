package com.p2082ss.android.ugc.aweme.friends.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.friends.invite.C51541d;
import com.p2082ss.android.ugc.aweme.friends.invite.C51542e;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.C66823a;
import java.util.Map;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.friends.api.FriendApi */
public interface FriendApi {
    static {
        Covode.recordClassIndex(60733);
    }

    @AbstractC89722f(mo144276a = "/ug/social/invite/msg/settings/")
    AbstractFutureC27655q<C51542e> getInviteContactFriendsSettings();

    @AbstractC89722f(mo144276a = "/aweme/v1/social/friend/")
    AbstractC88979t<FriendList<Friend>> getSocialFriendsWithScene(@AbstractC89736t(mo144292a = "social") String str, @AbstractC89736t(mo144292a = "access_token") String str2, @AbstractC89736t(mo144292a = "secret_access_token") String str3, @AbstractC89736t(mo144292a = "token_expiration_timestamp") Long l, @AbstractC89736t(mo144292a = "scene") Integer num);

    @AbstractC89731o(mo144285a = "/ug/social/invite/msg/send_msg/")
    @AbstractC89721e
    AbstractFutureC27655q<Object> inviteBySms(@AbstractC89719c(mo144273a = "user_name") String str, @AbstractC89719c(mo144273a = "enter_from") String str2, @AbstractC89719c(mo144273a = "mobile_list") String str3);

    @AbstractC89722f(mo144276a = "/aweme/v1/user/contact/")
    C1731i<FriendList<User>> queryContactsFriends(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "type") int i3);

    @AbstractC89722f(mo144276a = "/aweme/v1/user/contact/")
    C1731i<FriendList<User>> queryContactsFriendsCountOnly(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "type") int i3, @AbstractC89736t(mo144292a = "count_only") int i4);

    @AbstractC89722f(mo144276a = "/aweme/v1/user/contact/invite_list/")
    C1731i<FriendList<User>> queryMoreUnregisteredFriends(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

    @AbstractC89731o(mo144285a = "/ug/social/invite/msg/short_url/")
    @AbstractC89721e
    AbstractFutureC27655q<C51541d> shortenUrl(@AbstractC89719c(mo144273a = "url") String str);

    @AbstractC89722f(mo144276a = "/aweme/v1/social/friend/")
    AbstractC88979t<FriendList<Friend>> socialFriends(@AbstractC89736t(mo144292a = "social") String str, @AbstractC89736t(mo144292a = "access_token") String str2, @AbstractC89736t(mo144292a = "secret_access_token") String str3, @AbstractC89736t(mo144292a = "token_expiration_timestamp") Long l);

    @AbstractC89731o(mo144285a = "/tiktok/user/relation/social/settings/update/v1")
    @AbstractC89721e
    C1731i<BaseResponse> syncContactStatus(@AbstractC89719c(mo144273a = "social_platform") int i, @AbstractC89719c(mo144273a = "sync_status") Boolean bool);

    @AbstractC89731o(mo144285a = "/tiktok/user/relation/social/settings/update/v1")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> syncSocialRelationStatusInRx(@AbstractC89719c(mo144273a = "social_platform") int i, @AbstractC89719c(mo144273a = "sync_status") Boolean bool);

    @AbstractC89722f(mo144276a = "/aweme/v1/social/friend/")
    C1731i<FriendList<Friend>> thirdPartFriends(@AbstractC89736t(mo144292a = "social") String str, @AbstractC89736t(mo144292a = "access_token") String str2, @AbstractC89736t(mo144292a = "secret_access_token") String str3, @AbstractC89736t(mo144292a = "token_expiration_timestamp") Long l, @AbstractC89736t(mo144292a = "scene") Integer num);

    @AbstractC89722f(mo144276a = "/aweme/v1/social/token_upload/")
    C1731i<BaseResponse> uploadAccessToken(@AbstractC89736t(mo144292a = "social") String str, @AbstractC89736t(mo144292a = "access_token") String str2, @AbstractC89736t(mo144292a = "secret_access_token") String str3);

    @AbstractC89731o(mo144285a = "/aweme/v1/upload/hashcontacts/")
    @AbstractC89721e
    AbstractC88979t<C66823a> uploadHashContacts(@AbstractC89736t(mo144292a = "need_unregistered_user") String str, @AbstractC21998f Map<String, String> map, @AbstractC89736t(mo144292a = "scene") Integer num);
}
