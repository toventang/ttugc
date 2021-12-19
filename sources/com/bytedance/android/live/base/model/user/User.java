package com.bytedance.android.live.base.model.user;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.AbstractC9517ad;
import com.bytedance.android.livesdk.model.AbstractC9917y;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.C9545bb;
import com.bytedance.android.livesdk.model.C9570c;
import com.bytedance.android.livesdk.model.C9584d;
import com.bytedance.android.livesdk.model.C9585e;
import com.bytedance.android.livesdk.model.C9587g;
import com.bytedance.android.livesdk.model.C9588h;
import com.bytedance.android.livesdk.model.C9591j;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.FraternityInfo;
import com.bytedance.android.livesdk.model.NobleLevelInfo;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

public class User implements AbstractC2994b {
    public static boolean sSubPermission;
    @AbstractC27891c(mo46611a = "allow_find_by_contacts")
    public Boolean allowFindByContacts;
    @AbstractC27891c(mo46611a = "allow_others_download_video")
    public Boolean allowOthersDownloadVideo;
    @AbstractC27891c(mo46611a = "allow_others_download_when_sharing_video")
    public Boolean allowOthersDownloadWhenSharingVideo;
    @AbstractC27891c(mo46611a = "allow_share_show_profile")
    public Boolean allowShareShowProfile;
    @AbstractC27891c(mo46611a = "allow_show_in_gossip")
    public Boolean allowShowInGossip;
    @AbstractC27891c(mo46611a = "allow_show_my_action")
    public Boolean allowShowMyAction;
    @AbstractC27891c(mo46611a = "allow_strange_comment")
    public Boolean allowStrangeComment;
    @AbstractC27891c(mo46611a = "allow_unfollower_comment")
    public Boolean allowUnfollowerComment;
    @AbstractC27891c(mo46611a = "allow_use_linkmic")
    public Boolean allowUseLinkmic;
    @AbstractC27891c(mo46611a = "anchor_info")
    C9584d anchorInfo;
    @AbstractC27891c(mo46611a = "webcast_anchor_level")
    C9585e anchorLevel;
    @AbstractC27891c(mo46611a = "authentication_info")
    C9587g authenticationInfo;
    @AbstractC27891c(mo46611a = "author_stats")
    C9588h authorInfo;
    @AbstractC27891c(mo46611a = "avatar_border")
    ImageModel avatarBorder;
    @AbstractC27891c(mo46611a = "avatar_jpg")
    public ImageModel avatarJpg;
    @AbstractC27891c(mo46611a = "avatar_large")
    ImageModel avatarLarge;
    @AbstractC27891c(mo46611a = "avatar_medium")
    ImageModel avatarMedium;
    @AbstractC27891c(mo46611a = "avatar_thumb")
    ImageModel avatarThumb;
    @AbstractC27891c(mo46611a = "bg_img_url")
    String backgroundImgUrl;
    @AbstractC27891c(mo46611a = "badge_image_list")
    List<ImageModel> badgeImageList;
    @AbstractC27891c(mo46611a = "block_status")
    public Integer blockStatus;
    @AbstractC27891c(mo46611a = "border")
    C9591j border;
    @AbstractC27891c(mo46611a = "border_list")
    List<C9591j> borders;
    @AbstractC27891c(mo46611a = "combo_badge_info")
    C2991a comboBadgeInfo;
    @AbstractC27891c(mo46611a = "comment_restrict")
    public Integer commentRestrict;
    @AbstractC27891c(mo46611a = "commerce_webcast_config_ids")
    public List<Long> commerceWebcastConfigIds;
    @AbstractC27891c(mo46611a = "constellation")
    public String constellation;
    @AbstractC27891c(mo46611a = "create_time")
    long createTime;
    @AbstractC27891c(mo46611a = "disable_ichat")
    public Integer disableIchat;
    @AbstractC27891c(mo46611a = "display_id")
    public String displayId;
    @AbstractC27891c(mo46611a = "with_car_management_permission")
    boolean enableCarManagementPermission;
    @AbstractC27891c(mo46611a = "enable_ichat_img")
    public Long enableIchatImg;
    @AbstractC27891c(mo46611a = "with_commerce_permission")
    boolean enableShowCommerceSale;
    @AbstractC27891c(mo46611a = "exp")
    public Integer exp;
    @AbstractC27891c(mo46611a = "ticket_count")
    long fanTicketCount;
    @AbstractC27891c(mo46611a = "fans_club")
    FansClubMember fansClub;
    @AbstractC27891c(mo46611a = "fold_stranger_chat")
    public Boolean foldStrangerChat;
    @AbstractC27891c(mo46611a = "follow_info")
    FollowInfo followInfo;
    @AbstractC27891c(mo46611a = "follow_status")
    public Long followStatus;
    FraternityInfo fraternityInfo;
    @AbstractC27891c(mo46611a = "ichat_restrict_type")
    public Integer ichatRestrictType;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    long f8809id;
    @AbstractC27891c(mo46611a = "id_str")
    String idStr;
    @AbstractC27891c(mo46611a = "is_follower")
    public Boolean isFollower;
    @AbstractC27891c(mo46611a = "is_following")
    public Boolean isFollowing;
    @AbstractC27891c(mo46611a = "verified")
    boolean isVerified;
    @AbstractC27891c(mo46611a = "link_mic_stats")
    int linkMicStats;
    private String logPb;
    private String mAvatarLargeStr;
    private String mAvatarMediumStr;
    private String mAvatarThumbStr;
    @AbstractC27891c(mo46611a = "medal")
    ImageModel medal;
    @AbstractC27891c(mo46611a = "media_badge_image_list")
    public List<ImageModel> mediaBadgeImageList;
    @AbstractC27891c(mo46611a = "modify_time")
    long modifyTime;
    @AbstractC27891c(mo46611a = "need_profile_guide")
    public Boolean needProfileGuide;
    transient boolean neverRecharge;
    @AbstractC27891c(mo46611a = "new_real_time_icons")
    List<ImageModel> newUserBadges;
    @AbstractC27891c(mo46611a = "nickname")
    String nickName;
    NobleLevelInfo nobleLevelInfo;
    @AbstractC27891c(mo46611a = "own_room")
    C2992b ownRoom;
    @AbstractC27891c(mo46611a = "pay_score")
    public Long payScore;
    @AbstractC27891c(mo46611a = "deprecated21")
    long payScores = -1;
    @AbstractC27891c(mo46611a = "personal_card")
    ImageModel personalCard;
    @AbstractC27891c(mo46611a = "push_comment_status")
    public Boolean pushCommentStatus;
    @AbstractC27891c(mo46611a = "push_digg")
    public Boolean pushDigg;
    @AbstractC27891c(mo46611a = "push_follow")
    public Boolean pushFollow;
    @AbstractC27891c(mo46611a = "push_friend_action")
    public Boolean pushFriendAction;
    @AbstractC27891c(mo46611a = "push_ichat")
    public Boolean pushIchat;
    @AbstractC27891c(mo46611a = "push_status")
    public Boolean pushStatus;
    @AbstractC27891c(mo46611a = "push_video_post")
    public Boolean pushVideoPost;
    @AbstractC27891c(mo46611a = "push_video_recommend")
    public Boolean pushVideoRecommend;
    private String requestId;
    @AbstractC27891c(mo46611a = "activity_reward")
    C9570c rewardInfo;
    @AbstractC27891c(mo46611a = "sec_uid")
    String secUid;
    @AbstractC27891c(mo46611a = "secret")
    int secret;
    @AbstractC27891c(mo46611a = "share_qrcode_uri")
    String shareQrcodeUri;
    @AbstractC27891c(mo46611a = "bio_description")
    String signature;
    @AbstractC27891c(mo46611a = "special_id")
    String specialId;
    @AbstractC27891c(mo46611a = "status")
    int status;
    @AbstractC27891c(mo46611a = "subscribe_info")
    SubscribeInfo subscribeInfo;
    @AbstractC27891c(mo46611a = "top_fans")
    List<User> topFans;
    @AbstractC27891c(mo46611a = "top_vip_no")
    int topVipNo;
    @AbstractC27891c(mo46611a = "user_attr")
    C9542az userAttr;
    @AbstractC27891c(mo46611a = "real_time_icons")
    List<ImageModel> userBadges;
    @AbstractC27891c(mo46611a = "pay_grade")
    C9545bb userHonor;
    @AbstractC27891c(mo46611a = "user_role")
    int userRole;
    @AbstractC27891c(mo46611a = "verified_content")
    String verifiedContent;
    @AbstractC27891c(mo46611a = "verified_reason")
    String verifiedReason;
    @AbstractC27891c(mo46611a = "with_fusion_shop_entry")
    public Boolean withFusionShopEntry;

    /* renamed from: com.bytedance.android.live.base.model.user.User$a */
    public static class C2991a {
        @AbstractC27891c(mo46611a = "icon")

        /* renamed from: a */
        public ImageModel f8810a;
        @AbstractC27891c(mo46611a = "combo_count")

        /* renamed from: b */
        public long f8811b;

        static {
            Covode.recordClassIndex(3453);
        }
    }

    /* renamed from: com.bytedance.android.live.base.model.user.User$b */
    public static class C2992b {
        @AbstractC27891c(mo46611a = "room_ids")

        /* renamed from: a */
        public List<Long> f8812a;

        static {
            Covode.recordClassIndex(3454);
        }
    }

    static {
        Covode.recordClassIndex(3452);
    }

    public boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public C9584d getAnchorInfo() {
        return this.anchorInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public C9585e getAnchorLevel() {
        return this.anchorLevel;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public C9587g getAuthenticationInfo() {
        return this.authenticationInfo;
    }

    public C9588h getAuthorInfo() {
        return this.authorInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public String getAutoGraph() {
        return this.signature;
    }

    public ImageModel getAvatarBorder() {
        return this.avatarBorder;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public String getBackgroundImgUrl() {
        return this.backgroundImgUrl;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public List<ImageModel> getBadgeImageList() {
        return this.badgeImageList;
    }

    public C9591j getBorder() {
        return this.border;
    }

    public List<C9591j> getBorders() {
        return this.borders;
    }

    public C2991a getComboBadgeInfo() {
        return this.comboBadgeInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public long getCreateTime() {
        return this.createTime;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public String getDisplayId() {
        return this.displayId;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public long getFanTicketCount() {
        return this.fanTicketCount;
    }

    public FansClubMember getFansClub() {
        return this.fansClub;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public FollowInfo getFollowInfo() {
        return this.followInfo;
    }

    public FraternityInfo getFraternityInfo() {
        return this.fraternityInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public long getId() {
        return this.f8809id;
    }

    public int getLinkMicStats() {
        return this.linkMicStats;
    }

    public String getLogPb() {
        return this.logPb;
    }

    public ImageModel getMedal() {
        return this.medal;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public long getModifyTime() {
        return this.modifyTime;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public String getNickName() {
        return this.nickName;
    }

    public NobleLevelInfo getNobleLevelInfo() {
        return this.nobleLevelInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public C2992b getOwnRoom() {
        return this.ownRoom;
    }

    public long getPayScores() {
        return this.payScores;
    }

    public ImageModel getPersonalCard() {
        return this.personalCard;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public C9570c getRewardInfo() {
        return this.rewardInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public String getSecUid() {
        return this.secUid;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public int getSecret() {
        return this.secret;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public String getShareQrcodeUri() {
        return this.shareQrcodeUri;
    }

    public String getSpecialId() {
        return this.specialId;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public int getStatus() {
        return this.status;
    }

    public SubscribeInfo getSubscribeInfo() {
        return this.subscribeInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public List<User> getTopFans() {
        return this.topFans;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public int getTopVipNo() {
        return this.topVipNo;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public C9542az getUserAttr() {
        return this.userAttr;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public List<ImageModel> getUserBadges() {
        return this.userBadges;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public C9545bb getUserHonor() {
        return this.userHonor;
    }

    public int getUserRole() {
        return this.userRole;
    }

    public String getVerifiedContent() {
        return this.verifiedContent;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public String getVerifiedReason() {
        return this.verifiedReason;
    }

    public boolean isEnableCarManagement() {
        return this.enableCarManagementPermission;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public boolean isEnableShowCommerceSale() {
        return this.enableShowCommerceSale;
    }

    public boolean isNeverRecharge() {
        return this.neverRecharge;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public boolean isVerified() {
        return this.isVerified;
    }

    public boolean isWithCommercePermission() {
        return isEnableShowCommerceSale();
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public List<ImageModel> getNewUserBadges() {
        List<ImageModel> list = this.newUserBadges;
        if (list == null || list.isEmpty()) {
            return this.userBadges;
        }
        return this.newUserBadges;
    }

    public boolean isAnchorHasSubQualification() {
        SubscribeInfo subscribeInfo2 = this.subscribeInfo;
        if (subscribeInfo2 != null) {
            return subscribeInfo2.isAnchorQualified();
        }
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public ImageModel getAvatarLarge() {
        try {
            if (this.avatarLarge == null && !TextUtils.isEmpty(this.mAvatarLargeStr)) {
                this.avatarLarge = (ImageModel) C4139e.C4140a.f11575b.mo46670a(this.mAvatarLargeStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarLarge;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public ImageModel getAvatarMedium() {
        try {
            if (this.avatarMedium == null && !TextUtils.isEmpty(this.mAvatarMediumStr)) {
                this.avatarMedium = (ImageModel) C4139e.C4140a.f11575b.mo46670a(this.mAvatarMediumStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarMedium;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public ImageModel getAvatarThumb() {
        try {
            if (this.avatarThumb == null && !TextUtils.isEmpty(this.mAvatarThumbStr)) {
                this.avatarThumb = (ImageModel) C4139e.C4140a.f11575b.mo46670a(this.mAvatarThumbStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarThumb;
    }

    public String getIdStr() {
        if (TextUtils.isEmpty(this.idStr)) {
            return String.valueOf(this.f8809id);
        }
        return this.idStr;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public boolean isFollowing() {
        FollowInfo followInfo2 = this.followInfo;
        if (followInfo2 == null) {
            return false;
        }
        if (followInfo2.getFollowStatus() == 2 || this.followInfo.getFollowStatus() == 1) {
            return true;
        }
        return false;
    }

    public boolean isSubscribed() {
        SubscribeInfo subscribeInfo2 = this.subscribeInfo;
        if (subscribeInfo2 == null || !subscribeInfo2.isAnchorQualified()) {
            return false;
        }
        return this.subscribeInfo.isSubscribed();
    }

    public long getLiveRoomId() {
        C2992b bVar = this.ownRoom;
        if (bVar == null || bVar.f8812a == null || bVar.f8812a.size() == 0) {
            return 0;
        }
        return bVar.f8812a.get(0).longValue();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str = this.nickName;
        int i21 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i22 = i * 31;
        String str2 = this.signature;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f8809id;
        long j2 = this.createTime;
        int i23 = (((((i22 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        ImageModel imageModel = this.avatarThumb;
        if (imageModel != null) {
            i3 = imageModel.hashCode();
        } else {
            i3 = 0;
        }
        int i24 = (i23 + i3) * 31;
        ImageModel imageModel2 = this.avatarMedium;
        if (imageModel2 != null) {
            i4 = imageModel2.hashCode();
        } else {
            i4 = 0;
        }
        int i25 = (i24 + i4) * 31;
        ImageModel imageModel3 = this.avatarLarge;
        if (imageModel3 != null) {
            i5 = imageModel3.hashCode();
        } else {
            i5 = 0;
        }
        int i26 = (i25 + i5) * 31;
        List<User> list = this.topFans;
        if (list != null) {
            i6 = list.hashCode();
        } else {
            i6 = 0;
        }
        int i27 = (i26 + i6) * 31;
        String str3 = this.idStr;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        long j3 = this.fanTicketCount;
        int i28 = (((((i27 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isVerified ? 1 : 0)) * 31;
        String str4 = this.verifiedReason;
        if (str4 != null) {
            i8 = str4.hashCode();
        } else {
            i8 = 0;
        }
        int i29 = (((i28 + i8) * 31) + this.topVipNo) * 31;
        C9545bb bbVar = this.userHonor;
        if (bbVar != null) {
            i9 = bbVar.hashCode();
        } else {
            i9 = 0;
        }
        int i30 = (i29 + i9) * 31;
        C9585e eVar = this.anchorLevel;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i31 = (i30 + i10) * 31;
        List<ImageModel> list2 = this.userBadges;
        if (list2 != null) {
            i11 = list2.hashCode();
        } else {
            i11 = 0;
        }
        int i32 = (i31 + i11) * 31;
        List<ImageModel> list3 = this.newUserBadges;
        if (list3 != null) {
            i12 = list3.hashCode();
        } else {
            i12 = 0;
        }
        int i33 = (i32 + i12) * 31;
        String str5 = this.mAvatarThumbStr;
        if (str5 != null) {
            i13 = str5.hashCode();
        } else {
            i13 = 0;
        }
        int i34 = (i33 + i13) * 31;
        String str6 = this.mAvatarMediumStr;
        if (str6 != null) {
            i14 = str6.hashCode();
        } else {
            i14 = 0;
        }
        int i35 = (i34 + i14) * 31;
        String str7 = this.mAvatarLargeStr;
        if (str7 != null) {
            i15 = str7.hashCode();
        } else {
            i15 = 0;
        }
        int i36 = (((i35 + i15) * 31) + (this.enableShowCommerceSale ? 1 : 0)) * 31;
        String str8 = this.backgroundImgUrl;
        if (str8 != null) {
            i16 = str8.hashCode();
        } else {
            i16 = 0;
        }
        long j4 = this.modifyTime;
        int i37 = (((((((i36 + i16) * 31) + this.status) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.secret) * 31;
        String str9 = this.shareQrcodeUri;
        if (str9 != null) {
            i17 = str9.hashCode();
        } else {
            i17 = 0;
        }
        int i38 = (i37 + i17) * 31;
        List<ImageModel> list4 = this.badgeImageList;
        if (list4 != null) {
            i18 = list4.hashCode();
        } else {
            i18 = 0;
        }
        int i39 = (i38 + i18) * 31;
        FollowInfo followInfo2 = this.followInfo;
        if (followInfo2 != null) {
            i19 = followInfo2.hashCode();
        } else {
            i19 = 0;
        }
        int i40 = (i39 + i19) * 31;
        C9542az azVar = this.userAttr;
        if (azVar != null) {
            i20 = azVar.hashCode();
        } else {
            i20 = 0;
        }
        int i41 = (i40 + i20) * 31;
        C9584d dVar = this.anchorInfo;
        if (dVar != null) {
            i21 = dVar.hashCode();
        }
        return i41 + i21;
    }

    public void setAVatarMediumStr(String str) {
        this.mAvatarMediumStr = str;
    }

    public void setAnchorInfo(C9584d dVar) {
        this.anchorInfo = dVar;
    }

    public void setAnchorLevel(C9585e eVar) {
        this.anchorLevel = eVar;
    }

    public void setAuthenticationInfo(C9587g gVar) {
        this.authenticationInfo = gVar;
    }

    public void setAuthorInfo(C9588h hVar) {
        this.authorInfo = hVar;
    }

    public void setAvatarBorder(ImageModel imageModel) {
        this.avatarBorder = imageModel;
    }

    public void setAvatarLarge(ImageModel imageModel) {
        this.avatarLarge = imageModel;
    }

    public void setAvatarLargeStr(String str) {
        this.mAvatarLargeStr = str;
    }

    public void setAvatarMedium(ImageModel imageModel) {
        this.avatarMedium = imageModel;
    }

    public void setAvatarThumb(ImageModel imageModel) {
        this.avatarThumb = imageModel;
    }

    public void setAvatarThumbStr(String str) {
        this.mAvatarThumbStr = str;
    }

    public void setBackgroundImgUrl(String str) {
        this.backgroundImgUrl = str;
    }

    public void setBadgeImageList(List<ImageModel> list) {
        this.badgeImageList = list;
    }

    public void setBorder(C9591j jVar) {
        this.border = jVar;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setEnableShowCommerceSale(boolean z) {
        this.enableShowCommerceSale = z;
    }

    public void setFanTicketCount(long j) {
        this.fanTicketCount = j;
    }

    public void setFansClub(FansClubMember fansClubMember) {
        this.fansClub = fansClubMember;
    }

    public void setFollowInfo(FollowInfo followInfo2) {
        this.followInfo = followInfo2;
    }

    public void setFraternityInfo(FraternityInfo fraternityInfo2) {
        this.fraternityInfo = fraternityInfo2;
    }

    public void setId(long j) {
        this.f8809id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLogPb(String str) {
        this.logPb = str;
    }

    public void setMedal(ImageModel imageModel) {
        this.medal = imageModel;
    }

    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public void setNeverRecharge(boolean z) {
        this.neverRecharge = z;
    }

    public void setNewUserBadges(List<ImageModel> list) {
        this.newUserBadges = list;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setNobleLevelInfo(NobleLevelInfo nobleLevelInfo2) {
        this.nobleLevelInfo = nobleLevelInfo2;
    }

    public void setPersonalCard(ImageModel imageModel) {
        this.personalCard = imageModel;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(int i) {
        this.secret = i;
    }

    public void setShareQrcodeUri(String str) {
        this.shareQrcodeUri = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSpecialId(String str) {
        this.specialId = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSubscribeInfo(SubscribeInfo subscribeInfo2) {
        this.subscribeInfo = subscribeInfo2;
    }

    public void setTopFans(List<User> list) {
        this.topFans = list;
    }

    public void setTopVipNo(int i) {
        this.topVipNo = i;
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public void setUserAttr(C9542az azVar) {
        this.userAttr = azVar;
    }

    public void setUserBadges(List<ImageModel> list) {
        this.userBadges = list;
    }

    public void setUserHonor(C9545bb bbVar) {
        this.userHonor = bbVar;
    }

    public void setUserRole(int i) {
        this.userRole = i;
    }

    public void setVerified(boolean z) {
        this.isVerified = z;
    }

    public void setVerifiedContent(String str) {
        this.verifiedContent = str;
    }

    public void setVerifiedReason(String str) {
        this.verifiedReason = str;
    }

    public void setWithCommercePermission(boolean z) {
        setEnableShowCommerceSale(z);
    }

    public void setSubscribeStatus(boolean z) {
        SubscribeInfo subscribeInfo2 = this.subscribeInfo;
        if (subscribeInfo2 != null) {
            subscribeInfo2.setSubscribed(z);
        }
    }

    @Override // com.bytedance.android.live.base.model.user.AbstractC2994b
    public void setFollowStatus(int i) {
        FollowInfo followInfo2 = this.followInfo;
        if (followInfo2 != null) {
            followInfo2.setFollowStatus((long) i);
        }
    }

    public void setPayScores(long j) {
        this.payScores = j;
        if (j > 0) {
            this.neverRecharge = false;
        }
    }

    public static User from(AbstractC2994b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof User) {
            C27910f fVar = C4139e.C4140a.f11575b;
            return (User) fVar.mo46670a(fVar.mo46674b(bVar), User.class);
        }
        User user = new User();
        user.initWith(bVar);
        return user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            User user = (User) obj;
            if (this.f8809id != user.f8809id || this.createTime != user.createTime || this.fanTicketCount != user.fanTicketCount || this.isVerified != user.isVerified || this.topVipNo != user.topVipNo || getLiveRoomId() != user.getLiveRoomId() || this.enableShowCommerceSale != user.enableShowCommerceSale) {
                return false;
            }
            String str = this.nickName;
            if (str == null ? user.nickName != null : !str.equals(user.nickName)) {
                return false;
            }
            String str2 = this.signature;
            if (str2 == null ? user.signature != null : !str2.equals(user.signature)) {
                return false;
            }
            ImageModel imageModel = this.avatarThumb;
            if (imageModel == null ? user.avatarThumb != null : !imageModel.equals(user.avatarThumb)) {
                return false;
            }
            ImageModel imageModel2 = this.avatarMedium;
            if (imageModel2 == null ? user.avatarMedium != null : !imageModel2.equals(user.avatarMedium)) {
                return false;
            }
            ImageModel imageModel3 = this.avatarLarge;
            if (imageModel3 == null ? user.avatarLarge != null : !imageModel3.equals(user.avatarLarge)) {
                return false;
            }
            List<User> list = this.topFans;
            if (list == null ? user.topFans != null : !list.equals(user.topFans)) {
                return false;
            }
            String str3 = this.idStr;
            if (str3 == null ? user.idStr != null : !str3.equals(user.idStr)) {
                return false;
            }
            String str4 = this.verifiedReason;
            if (str4 == null ? user.verifiedReason != null : !str4.equals(user.verifiedReason)) {
                return false;
            }
            C9545bb bbVar = this.userHonor;
            if (bbVar == null ? user.userHonor != null : !bbVar.equals(user.userHonor)) {
                return false;
            }
            C9585e eVar = this.anchorLevel;
            if (eVar == null ? user.anchorLevel != null : !eVar.equals(user.anchorLevel)) {
                return false;
            }
            List<ImageModel> list2 = this.userBadges;
            if (list2 == null ? user.userBadges != null : !list2.equals(user.userBadges)) {
                return false;
            }
            List<ImageModel> list3 = this.newUserBadges;
            if (list3 == null ? user.newUserBadges != null : !list3.equals(user.newUserBadges)) {
                return false;
            }
            String str5 = this.mAvatarThumbStr;
            if (str5 == null ? user.mAvatarThumbStr != null : !str5.equals(user.mAvatarThumbStr)) {
                return false;
            }
            String str6 = this.mAvatarMediumStr;
            if (str6 == null ? user.mAvatarMediumStr != null : !str6.equals(user.mAvatarMediumStr)) {
                return false;
            }
            String str7 = this.mAvatarLargeStr;
            if (str7 == null ? user.mAvatarLargeStr != null : !str7.equals(user.mAvatarLargeStr)) {
                return false;
            }
            String str8 = this.backgroundImgUrl;
            if (str8 == null ? user.backgroundImgUrl != null : !str8.equals(user.backgroundImgUrl)) {
                return false;
            }
            if (this.status != user.status || this.modifyTime != user.modifyTime || this.secret != user.secret) {
                return false;
            }
            String str9 = this.shareQrcodeUri;
            if (str9 == null ? user.shareQrcodeUri != null : !str9.equals(user.shareQrcodeUri)) {
                return false;
            }
            List<ImageModel> list4 = this.badgeImageList;
            if (list4 == null ? user.badgeImageList != null : !list4.equals(user.badgeImageList)) {
                return false;
            }
            FollowInfo followInfo2 = this.followInfo;
            if (followInfo2 == null ? user.followInfo != null : !followInfo2.equals(user.followInfo)) {
                return false;
            }
            C9542az azVar = this.userAttr;
            if (azVar == null ? user.userAttr != null : !azVar.equals(user.userAttr)) {
                return false;
            }
            C9587g gVar = this.authenticationInfo;
            if (gVar == null ? user.authenticationInfo != null : !gVar.equals(user.authenticationInfo)) {
                return false;
            }
            C9584d dVar = this.anchorInfo;
            C9584d dVar2 = user.anchorInfo;
            if (dVar != null) {
                return dVar.equals(dVar2);
            }
            if (dVar2 == null) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void initWith(AbstractC2994b bVar) {
        ArrayList arrayList;
        C9545bb bbVar;
        ArrayList arrayList2;
        C9585e eVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.enableShowCommerceSale = bVar.isEnableShowCommerceSale();
        this.fanTicketCount = bVar.getFanTicketCount();
        this.avatarThumb = bVar.getAvatarThumb();
        this.avatarMedium = bVar.getAvatarMedium();
        this.avatarLarge = bVar.getAvatarLarge();
        this.nickName = bVar.getNickName();
        this.signature = bVar.getAutoGraph();
        this.f8809id = bVar.getId();
        ArrayList arrayList5 = null;
        if (bVar.getTopFans() != null) {
            arrayList = new ArrayList(bVar.getTopFans());
        } else {
            arrayList = null;
        }
        this.topFans = arrayList;
        this.isVerified = bVar.isVerified();
        this.verifiedReason = bVar.getVerifiedReason();
        this.topVipNo = bVar.getTopVipNo();
        AbstractC9517ad userHonor2 = bVar.getUserHonor();
        if (userHonor2 == null) {
            bbVar = null;
        } else if (userHonor2 instanceof C9545bb) {
            C27910f fVar = C4139e.C4140a.f11575b;
            bbVar = (C9545bb) fVar.mo46670a(fVar.mo46674b(userHonor2), C9545bb.class);
        } else {
            bbVar = new C9545bb();
            bbVar.f23196a = userHonor2.mo16471a();
            bbVar.f23197b = userHonor2.mo16472b();
            bbVar.f23198c = userHonor2.mo16473c();
            bbVar.f23199d = userHonor2.mo16474d();
            bbVar.f23200e = userHonor2.mo16475e();
            bbVar.f23201f = userHonor2.mo16476f();
            bbVar.f23202g = userHonor2.mo16477g();
            bbVar.f23203h = userHonor2.mo16480j();
            bbVar.f23204i = userHonor2.mo16481k();
            bbVar.f23205j = userHonor2.mo16485o();
            bbVar.f23208m = userHonor2.mo16482l();
            bbVar.f23206k = userHonor2.mo16483m();
            bbVar.f23207l = userHonor2.mo16484n();
            if (userHonor2.mo16486p() != null) {
                arrayList2 = new ArrayList(userHonor2.mo16486p());
            } else {
                arrayList2 = null;
            }
            bbVar.f23209n = arrayList2;
            bbVar.f23210o = userHonor2.mo16487q();
            bbVar.f23211p = userHonor2.mo16478h();
            bbVar.f23212q = userHonor2.mo16479i();
            bbVar.f23213r = userHonor2.mo16488r();
            bbVar.f23214s = userHonor2.mo16489s();
        }
        this.userHonor = bbVar;
        AbstractC9917y anchorLevel2 = bVar.getAnchorLevel();
        if (anchorLevel2 == null) {
            eVar = null;
        } else if (anchorLevel2 instanceof C9585e) {
            eVar = (C9585e) anchorLevel2;
        } else {
            C9585e eVar2 = new C9585e();
            eVar2.f23223a = anchorLevel2.mo16531a();
            eVar2.f23224b = anchorLevel2.mo16532b();
            eVar2.f23225c = anchorLevel2.mo16533c();
            eVar2.f23226d = anchorLevel2.mo16534d();
            eVar2.f23227e = anchorLevel2.mo16535e();
            eVar2.f23228f = anchorLevel2.mo16537f();
            eVar2.f23229g = anchorLevel2.mo16538g();
            eVar2.f23230h = anchorLevel2.mo16539h();
            eVar2.f23231i = anchorLevel2.mo16541i();
            eVar2.f23232j = anchorLevel2.mo16542j();
            eVar2.f23233k = anchorLevel2.mo16543k();
            eVar2.f23234l = anchorLevel2.mo16544l();
            eVar2.f23235m = anchorLevel2.mo16545m();
            eVar = eVar2;
        }
        this.anchorLevel = eVar;
        this.createTime = bVar.getCreateTime();
        this.ownRoom = bVar.getOwnRoom();
        if (bVar.getUserBadges() != null) {
            arrayList3 = new ArrayList(bVar.getUserBadges());
        } else {
            arrayList3 = null;
        }
        this.userBadges = arrayList3;
        if (bVar.getNewUserBadges() != null) {
            arrayList4 = new ArrayList(bVar.getNewUserBadges());
        } else {
            arrayList4 = null;
        }
        this.newUserBadges = arrayList4;
        this.backgroundImgUrl = bVar.getBackgroundImgUrl();
        this.status = bVar.getStatus();
        this.modifyTime = bVar.getModifyTime();
        this.secret = bVar.getSecret();
        this.shareQrcodeUri = bVar.getShareQrcodeUri();
        if (bVar.getBadgeImageList() != null) {
            arrayList5 = new ArrayList(bVar.getBadgeImageList());
        }
        this.badgeImageList = arrayList5;
        this.followInfo = bVar.getFollowInfo();
        this.userAttr = bVar.getUserAttr();
        this.anchorInfo = bVar.getAnchorInfo();
        this.authenticationInfo = bVar.getAuthenticationInfo();
    }
}
