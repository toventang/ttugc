package com.p2082ss.android.ugc.aweme.user.p4196c;

import android.content.SharedPreferences;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.commerce.C37495f;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.music.C60836o;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;

/* renamed from: com.ss.android.ugc.aweme.user.c.a */
public final class C80055a {

    /* renamed from: a */
    private SharedPreferences f179391a = C34822d.m71158a(C51427a.f118503a, "aweme_user", 0);

    static {
        Covode.recordClassIndex(93286);
    }

    /* renamed from: a */
    public final User mo123505a() {
        User user = new User();
        user.setUid(this.f179391a.getString("uid", ""));
        user.setShortId(this.f179391a.getString("aweme_id", ""));
        user.setNickname(this.f179391a.getString("nickname", ""));
        user.setSignature(this.f179391a.getString("signature", ""));
        user.setFollowStatus(this.f179391a.getInt("allow_status", 0));
        user.setAwemeCount(this.f179391a.getInt("aweme_count", 0));
        user.setFollowingCount(this.f179391a.getInt("following_count", 0));
        user.setFollowerCount(this.f179391a.getInt("follower_count", 0));
        user.setTotalFavorited((long) this.f179391a.getInt("total_favorite", 0));
        user.setFavoritingCount(this.f179391a.getInt("favoriting_count", 0));
        user.setAllowStatus(this.f179391a.getInt("allow_status", 1));
        user.setRegisterStatus(this.f179391a.getInt("register_status", 0));
        user.setHideSearch(this.f179391a.getBoolean("hide_search", false));
        user.setLoginPlatform(this.f179391a.getInt("login_platform", 0));
        user.setLiveAgreement(this.f179391a.getInt("live_agreement", 0));
        user.setCustomVerify(this.f179391a.getString("custom_verify", ""));
        user.setUniqueId(this.f179391a.getString("unique_id", ""));
        user.setBindPhone(this.f179391a.getString("bind_phone", ""));
        user.setPhoneBinded(this.f179391a.getBoolean("is_phone_bound", false));
        user.setIsCreater(this.f179391a.getBoolean("is_creater", false));
        user.setHasEmail(this.f179391a.getBoolean("has_email", false));
        user.setCreateTime(Long.valueOf(this.f179391a.getLong("create_time", 0)));
        user.setNeedRecommend(this.f179391a.getBoolean("show_recommend", false));
        user.setShowImageBubble(this.f179391a.getBoolean("show_image_bubble", false));
        user.setRegisterTime(this.f179391a.getLong("register_time", 0));
        user.setHasFacebookToken(false);
        user.setHasTwitterToken(false);
        user.setFbExpireTime(0);
        user.setTwExpireTime(0);
        user.setYoutubeExpireTime(0);
        user.setHasYoutubeToken(false);
        user.setShieldFollowNotice(0);
        user.setShieldDiggNotice(0);
        user.setShieldCommentNotice(0);
        user.setInsId(this.f179391a.getString("ins_id", ""));
        user.setTwitterId(this.f179391a.getString("twitter_id", ""));
        user.setTwitterName(this.f179391a.getString("twitter_name", ""));
        user.setYoutubeChannelId(this.f179391a.getString("youtube_channel_id", ""));
        user.setYoutubeChannelTitle(this.f179391a.getString("youtube_channel_title", ""));
        user.setAuthorityStatus(this.f179391a.getLong("authority_status", 0));
        user.setWithCommerceEntry(this.f179391a.getBoolean("with_commerce_enty", false));
        user.setWithNewGoods(this.f179391a.getBoolean("with_new_goods", false));
        user.setHasOrders(this.f179391a.getBoolean("user_has_orders", false));
        user.setVerificationType(this.f179391a.getInt("verification_type", 0));
        user.setCommerceUserLevel(this.f179391a.getInt("commerce_user_level", 0));
        user.setEnterpriseVerifyReason(this.f179391a.getString("enterprise_verify", ""));
        user.setSecret(this.f179391a.getBoolean("secret", false));
        user.setHandleModified(0);
        user.setCommerceUserLevel(this.f179391a.getInt("commerce_user_level", 0));
        user.setDisciplineMember(this.f179391a.getBoolean("is_discipline_member", false));
        user.setShowImageBubble(this.f179391a.getBoolean("show_image_bubble", false));
        user.setCommentSetting(this.f179391a.getInt("comment_setting", 0));
        user.setRegisterTime(this.f179391a.getLong("register_time", 0));
        user.setRegion(this.f179391a.getString("region", ""));
        try {
            user.setAvatarThumb((UrlModel) C80361dw.m139333a(this.f179391a.getString("avatar_thumb", ""), UrlModel.class));
            user.setAvatarMedium((UrlModel) C80361dw.m139333a(this.f179391a.getString("avatar_medium", ""), UrlModel.class));
            user.setAvatarLarger((UrlModel) C80361dw.m139333a(this.f179391a.getString("avatar_larger", ""), UrlModel.class));
            user.setShareInfo((ShareInfo) C80361dw.m139333a(this.f179391a.getString("share_info", ""), ShareInfo.class));
            user.setOriginalMusician((C60836o) C80361dw.m139333a(this.f179391a.getString("original_musician", ""), C60836o.class));
            user.setCommerceInfo((C37495f) C80361dw.m139333a(this.f179391a.getString("commerce_info", ""), C37495f.class));
        } catch (Throwable unused) {
            SharedPreferences.Editor edit = this.f179391a.edit();
            edit.putString("share_info", "");
            edit.putString("avatar_larger", "");
            edit.putString("avatar_thumb", "");
            edit.putString("avatar_medium", "");
            C13611a.m24460a(edit);
        }
        return user;
    }
}
