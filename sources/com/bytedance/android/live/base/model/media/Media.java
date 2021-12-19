package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.media.VideoModel;
import com.bytedance.android.live.base.model.share.ShareSourceInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class Media implements AbstractC2989d {
    @AbstractC27891c(mo46611a = "ad_info")
    private MediaAdInfo adInfo;
    @AbstractC27891c(mo46611a = "at_users")
    private List<TextExtraStruct> aiteUserItems;
    @AbstractC27891c(mo46611a = "allow_comment")
    private boolean allowComment;
    @AbstractC27891c(mo46611a = "allow_dislike")
    private boolean allowDislike;
    @AbstractC27891c(mo46611a = "allow_share")
    private boolean allowShare;
    private long apiTime;
    @AbstractC27891c(mo46611a = "author")
    private User author;
    @AbstractC27891c(mo46611a = "auto_play")
    private int autoPlay;
    @AbstractC27891c(mo46611a = "cell_height")
    private int cellHeight;
    @AbstractC27891c(mo46611a = "cell_style")
    private int cellStyle;
    @AbstractC27891c(mo46611a = "cell_width")
    private int cellWidth;
    @AbstractC27891c(mo46611a = "comment_delay")
    private int commentDelay;
    @AbstractC27891c(mo46611a = "comment_prompts")
    private String commentPrompts;
    @AbstractC27891c(mo46611a = "commerce")
    private C2986a commerce;
    @AbstractC27891c(mo46611a = "create_time")
    private long createTime;
    private long danmakuShowTime;
    @AbstractC27891c(mo46611a = "private_info")
    private MediaDebugInfo debugInfo;
    @AbstractC27891c(mo46611a = "description")
    private String description;
    @AbstractC27891c(mo46611a = "display_style")
    private int displayStyle;
    @AbstractC27891c(mo46611a = "enable_send_flame")
    private boolean enableSendFlame;
    @AbstractC27891c(mo46611a = "feed_tips")
    private String feedTips;
    @AbstractC27891c(mo46611a = "feed_tips_type")
    private int feedTipsType;
    @AbstractC27891c(mo46611a = "from_ad")
    private boolean fromAd;
    @AbstractC27891c(mo46611a = "guide_card_id")
    private int guideCardId;
    @AbstractC27891c(mo46611a = "has_free_flame")
    private boolean hasFreeFlame;
    @AbstractC27891c(mo46611a = "has_sync_aweme")
    private boolean hasSyncAweme;
    @AbstractC27891c(mo46611a = "hashtag")
    private C2988c hashTag;
    @AbstractC27891c(mo46611a = "hide_nickname")
    private boolean hideNickName;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private long f8753id;
    private boolean isDeleted;
    @AbstractC27891c(mo46611a = "is_rich")
    private int isRich;
    @AbstractC27891c(mo46611a = "stats")
    private MediaItemStats itemStats;
    private int mDetailType;
    @AbstractC27891c(mo46611a = "mark")
    private VideoMark mark;
    @AbstractC27891c(mo46611a = "recommend_reason")
    private MediaRecommendReason mediaRecommendReason;
    @AbstractC27891c(mo46611a = "media_type")
    private int mediaType;
    @AbstractC27891c(mo46611a = "song")
    private C2990e music;
    @AbstractC27891c(mo46611a = "new_cell_style")
    private int newCellStyle;
    private boolean noNeedQuery;
    @AbstractC27891c(mo46611a = "position")
    private String position;
    @AbstractC27891c(mo46611a = "share_description")
    private String shareDesc;
    @AbstractC27891c(mo46611a = "share_enable")
    private boolean shareEnable;
    @AbstractC27891c(mo46611a = "share_prompts")
    private String sharePrompts;
    @AbstractC27891c(mo46611a = "share_source_info")
    private ShareSourceInfo shareSourceInfo;
    @AbstractC27891c(mo46611a = "share_strong_guide")
    private int shareStrongGuide;
    @AbstractC27891c(mo46611a = "share_text")
    private String shareText;
    @AbstractC27891c(mo46611a = "share_tips")
    private String shareTips;
    @AbstractC27891c(mo46611a = "share_title")
    private String shareTitle;
    @AbstractC27891c(mo46611a = "share_url")
    private String shareUrl;
    @AbstractC27891c(mo46611a = "status")
    private int status;
    @AbstractC27891c(mo46611a = "title")
    private String text;
    @AbstractC27891c(mo46611a = "tips")
    private String tips;
    @AbstractC27891c(mo46611a = "tips_url")
    private String tipsUrl;
    @AbstractC27891c(mo46611a = "user_bury")
    private int userBury;
    @AbstractC27891c(mo46611a = "user_digg")
    private int userDigg;
    @AbstractC27891c(mo46611a = "video")
    private VideoModel videoModel;
    @AbstractC27891c(mo46611a = "video_pic_num")
    private int videoPicNum;

    static {
        Covode.recordClassIndex(3431);
    }

    public String getPlayKey() {
        return null;
    }

    public boolean isNativeAd() {
        return false;
    }

    public MediaAdInfo getAdInfo() {
        return this.adInfo;
    }

    public List<TextExtraStruct> getAiteUserItems() {
        return this.aiteUserItems;
    }

    public long getApiTime() {
        return this.apiTime;
    }

    public User getAuthor() {
        return this.author;
    }

    public int getAutoPlay() {
        return this.autoPlay;
    }

    public int getCellHeight() {
        return this.cellHeight;
    }

    public int getCellStyle() {
        return this.cellStyle;
    }

    public int getCellWidth() {
        return this.cellWidth;
    }

    public int getCommentDelay() {
        return this.commentDelay;
    }

    public String getCommentPrompts() {
        return this.commentPrompts;
    }

    public C2986a getCommerce() {
        return this.commerce;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDanmakuShowTime() {
        return this.danmakuShowTime;
    }

    public MediaDebugInfo getDebugInfo() {
        return this.debugInfo;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDetailType() {
        return this.mDetailType;
    }

    public int getDisplayStyle() {
        return this.displayStyle;
    }

    public String getFeedTips() {
        return this.feedTips;
    }

    public int getFeedTipsType() {
        return this.feedTipsType;
    }

    public int getGuideCardId() {
        return this.guideCardId;
    }

    public C2988c getHashTag() {
        return this.hashTag;
    }

    public long getId() {
        return this.f8753id;
    }

    public int getIsRich() {
        return this.isRich;
    }

    public MediaItemStats getItemStats() {
        return this.itemStats;
    }

    public VideoMark getMark() {
        return this.mark;
    }

    public MediaRecommendReason getMediaRecommendReason() {
        return this.mediaRecommendReason;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public C2990e getMusic() {
        return this.music;
    }

    public int getNewCellStyle() {
        return this.newCellStyle;
    }

    public String getPosition() {
        return this.position;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public boolean getShareEnable() {
        return this.shareEnable;
    }

    public String getSharePrompts() {
        return this.sharePrompts;
    }

    public ShareSourceInfo getShareSourceInfo() {
        return this.shareSourceInfo;
    }

    public int getShareStrongGuide() {
        return this.shareStrongGuide;
    }

    public String getShareText() {
        return this.shareText;
    }

    public String getShareTips() {
        return this.shareTips;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTipsUrl() {
        return this.tipsUrl;
    }

    public int getUserBury() {
        return this.userBury;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    @Override // com.bytedance.android.live.base.model.media.AbstractC2989d
    public VideoModel getVideoModel() {
        return this.videoModel;
    }

    public int getVideoPicNum() {
        return this.videoPicNum;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowDislike() {
        return this.allowDislike;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public boolean isEnableSendFlame() {
        return this.enableSendFlame;
    }

    public boolean isFromAd() {
        return this.fromAd;
    }

    public boolean isHasFreeFlame() {
        return this.hasFreeFlame;
    }

    public boolean isHasSyncAweme() {
        return this.hasSyncAweme;
    }

    public boolean isHideNickName() {
        return this.hideNickName;
    }

    public boolean isNoNeedQuery() {
        return this.noNeedQuery;
    }

    public boolean isShareEnable() {
        return this.shareEnable;
    }

    public String getAdStatus() {
        if (isNativeAd()) {
            return "ad";
        }
        if (isFromAd()) {
            return "normal";
        }
        return "";
    }

    public ImageModel getVideoCoverImage() {
        VideoModel videoModel2 = this.videoModel;
        if (videoModel2 == null) {
            return null;
        }
        if (videoModel2.getCoverType() != VideoModel.EnumC2985a.MEDIUM) {
            return this.videoModel.getCoverModel();
        }
        return this.videoModel.getCoverMediumModel();
    }

    public boolean isBitRate() {
        if (getVideoModel() == null || getVideoModel().getQualityInfo() == null || getVideoModel().getQualityInfo().size() <= 1) {
            return false;
        }
        return true;
    }

    public void setAdInfo(MediaAdInfo mediaAdInfo) {
        this.adInfo = mediaAdInfo;
    }

    public void setAiteUserItems(List<TextExtraStruct> list) {
        this.aiteUserItems = list;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowDislike(boolean z) {
        this.allowDislike = z;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setApiTime(long j) {
        this.apiTime = j;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAutoPlay(int i) {
        this.autoPlay = i;
    }

    public void setCellHeight(int i) {
        this.cellHeight = i;
    }

    public void setCellWidth(int i) {
        this.cellWidth = i;
    }

    public void setCommentDelay(int i) {
        this.commentDelay = i;
    }

    public void setCommentPrompts(String str) {
        this.commentPrompts = str;
    }

    public void setCommerce(C2986a aVar) {
        this.commerce = aVar;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDanmakuShowTime(long j) {
        this.danmakuShowTime = j;
    }

    public void setDebugInfo(MediaDebugInfo mediaDebugInfo) {
        this.debugInfo = mediaDebugInfo;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDetailType(int i) {
        this.mDetailType = i;
    }

    public void setDisplayStyle(int i) {
        this.displayStyle = i;
    }

    public void setEnableSendFlame(boolean z) {
        this.enableSendFlame = z;
    }

    public void setFeedTips(String str) {
        this.feedTips = str;
    }

    public void setFeedTipsType(int i) {
        this.feedTipsType = i;
    }

    public void setFromAd(boolean z) {
        this.fromAd = z;
    }

    public void setGuideCardId(int i) {
        this.guideCardId = i;
    }

    public void setHasFreeFlame(boolean z) {
        this.hasFreeFlame = z;
    }

    public void setHasSyncAweme(boolean z) {
        this.hasSyncAweme = z;
    }

    public void setHashTag(C2988c cVar) {
        this.hashTag = cVar;
    }

    public void setHideNickName(boolean z) {
        this.hideNickName = z;
    }

    public void setId(long j) {
        this.f8753id = j;
    }

    public void setIsRich(int i) {
        this.isRich = i;
    }

    public void setItemStats(MediaItemStats mediaItemStats) {
        this.itemStats = mediaItemStats;
    }

    public void setMark(VideoMark videoMark) {
        this.mark = videoMark;
    }

    public void setMediaRecommendReason(MediaRecommendReason mediaRecommendReason2) {
        this.mediaRecommendReason = mediaRecommendReason2;
    }

    public void setMediaType(int i) {
        this.mediaType = i;
    }

    public void setMusic(C2990e eVar) {
        this.music = eVar;
    }

    public void setNewCellStyle(int i) {
        this.newCellStyle = i;
    }

    public void setNoNeedQuery(boolean z) {
        this.noNeedQuery = z;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareEnable(boolean z) {
        this.shareEnable = z;
    }

    public void setSharePrompts(String str) {
        this.sharePrompts = str;
    }

    public void setShareSourceInfo(ShareSourceInfo shareSourceInfo2) {
        this.shareSourceInfo = shareSourceInfo2;
    }

    public void setShareStrongGuide(int i) {
        this.shareStrongGuide = i;
    }

    public void setShareText(String str) {
        this.shareText = str;
    }

    public void setShareTips(String str) {
        this.shareTips = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTipsUrl(String str) {
        this.tipsUrl = str;
    }

    public void setUserBury(int i) {
        this.userBury = i;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setVideoModel(VideoModel videoModel2) {
        this.videoModel = videoModel2;
    }

    public void setVideoPicNum(int i) {
        this.videoPicNum = i;
    }

    public void setCellStyle(int i) {
        if (!(i == 1 || i == 2 || i == 3)) {
            i = 1;
        }
        this.cellStyle = i;
    }

    public void updateItemStats(MediaItemStats mediaItemStats) {
        if (mediaItemStats != null) {
            MediaItemStats mediaItemStats2 = this.itemStats;
            if (mediaItemStats2 == null) {
                this.itemStats = mediaItemStats;
                return;
            }
            mediaItemStats2.setCommentCount(mediaItemStats.getCommentCount());
            this.itemStats.setDiggCount(Math.max(mediaItemStats.getDiggCount(), this.itemStats.getDiggCount()));
            this.itemStats.setPlayCount(Math.max(mediaItemStats.getPlayCount(), this.itemStats.getPlayCount()));
            this.itemStats.setShareCount(Math.max(mediaItemStats.getShareCount(), this.itemStats.getShareCount()));
        }
    }

    public void update(Media media) {
        if (media != null && media.getId() == this.f8753id) {
            this.text = media.text;
            this.createTime = media.createTime;
            this.userDigg = media.userDigg;
            this.userBury = media.userBury;
            this.mediaType = media.mediaType;
            this.status = media.status;
            updateItemStats(media.itemStats);
            User user = media.author;
            if (user != null) {
                this.author = user;
            }
            VideoModel videoModel2 = media.videoModel;
            if (videoModel2 != null) {
                this.videoModel = videoModel2;
            }
            this.shareUrl = media.shareUrl;
            this.shareTitle = media.shareTitle;
            this.shareDesc = media.shareDesc;
            this.shareEnable = media.shareEnable;
            this.allowShare = media.allowShare;
            this.allowComment = media.allowComment;
            this.allowDislike = media.allowDislike;
            this.cellStyle = media.cellStyle;
            this.tips = media.tips;
            this.tipsUrl = media.tipsUrl;
            MediaDebugInfo mediaDebugInfo = media.debugInfo;
            if (mediaDebugInfo != null) {
                this.debugInfo = mediaDebugInfo;
            }
            VideoMark videoMark = media.mark;
            if (videoMark != null) {
                this.mark = videoMark;
            }
            this.shareText = media.shareText;
            this.cellHeight = media.cellHeight;
            this.cellWidth = media.cellWidth;
            this.feedTipsType = media.feedTipsType;
            this.feedTips = media.feedTips;
            this.displayStyle = media.displayStyle;
            this.commentDelay = media.commentDelay;
            this.guideCardId = media.guideCardId;
            this.sharePrompts = media.sharePrompts;
            this.commentPrompts = media.commentPrompts;
            this.shareTips = media.shareTips;
            this.enableSendFlame = media.enableSendFlame;
            this.hideNickName = media.hideNickName;
            this.music = media.music;
            this.videoPicNum = media.videoPicNum;
            this.apiTime = media.getApiTime();
            this.noNeedQuery = media.noNeedQuery;
            C2986a aVar = media.commerce;
            if (aVar != null) {
                this.commerce = aVar;
            }
        }
    }
}
