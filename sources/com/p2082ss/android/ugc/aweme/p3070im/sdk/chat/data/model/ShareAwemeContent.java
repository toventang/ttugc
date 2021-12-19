package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent */
public class ShareAwemeContent extends BaseContent {
    protected static String awemeMsgHint = "";
    @AbstractC27891c(mo46611a = "author_username")
    String authorUsername;
    int awemeType;
    @AbstractC27891c(mo46611a = "content_name")
    String contentName;
    @AbstractC27891c(mo46611a = "content_thumb")
    UrlModel contentThumb;
    @AbstractC27891c(mo46611a = "cover_url")
    UrlModel coverUrl;
    @AbstractC27891c(mo46611a = "diamond_game_id")
    String diamondGameId;
    @AbstractC27891c(mo46611a = "cover_height")
    float height;
    @AbstractC27891c(mo46611a = "hot_spot_create_time")
    long hotSpotCreateTime;
    @AbstractC27891c(mo46611a = "is_ad_fake")
    boolean isAdFake;
    @AbstractC27891c(mo46611a = "is_hot_spot_video")
    boolean isHotSpotVideo;
    @AbstractC27891c(mo46611a = "itemId")
    String itemId;
    @AbstractC27891c(mo46611a = "need_skip_strange")
    int needSkipStrange;
    @AbstractC27891c(mo46611a = "secUID")
    String secUid;
    @AbstractC27891c(mo46611a = "send_method")
    String sendMethod = "";
    @AbstractC27891c(mo46611a = "content_title")
    String title;
    @AbstractC27891c(mo46611a = "uid")
    String user;
    @AbstractC27891c(mo46611a = "cover_width")
    float width;

    public boolean showQuoteHint() {
        return false;
    }

    public String getAuthorUsername() {
        return this.authorUsername;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public String getContentName() {
        return this.contentName;
    }

    public UrlModel getContentThumb() {
        return this.contentThumb;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getDiamondGameId() {
        return this.diamondGameId;
    }

    public float getHeight() {
        return this.height;
    }

    public long getHotSpotCreateTime() {
        return this.hotSpotCreateTime;
    }

    public String getItemId() {
        return this.itemId;
    }

    public int getNeedSkipStrange() {
        return this.needSkipStrange;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getSendMethod() {
        return this.sendMethod;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUser() {
        return this.user;
    }

    public float getWidth() {
        return this.width;
    }

    public boolean isHotSpotVideo() {
        return this.isHotSpotVideo;
    }

    public Boolean getIsAdFake() {
        return Boolean.valueOf(this.isAdFake);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        super.getMsgHint();
        return awemeMsgHint;
    }

    static {
        Covode.recordClassIndex(63460);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.PreloadFetcher, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public List<UrlModel> fetchPreload() {
        UrlModel urlModel = this.coverUrl;
        if (urlModel == null) {
            return null;
        }
        return Collections.singletonList(urlModel);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public void tryInit() {
        Context a;
        if (TextUtils.isEmpty(awemeMsgHint) && (a = C17867d.m33078a()) != null) {
            awemeMsgHint = a.getString(R.string.cha);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("aweme");
        Bundle bundle = a.f155492i;
        bundle.putInt("aweme_type", getAwemeType());
        bundle.putString("item_id_string", this.itemId);
        bundle.putString("author_id", this.user);
        bundle.putSerializable("video_cover", getCoverUrl());
        bundle.putString("diamond_game_id", getDiamondGameId());
        bundle.putBoolean("is_hot_spot_video", isHotSpotVideo());
        return a;
    }

    public void setAuthorUsername(String str) {
        this.authorUsername = str;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setContentName(String str) {
        this.contentName = str;
    }

    public void setContentThumb(UrlModel urlModel) {
        this.contentThumb = urlModel;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setDiamondGameId(String str) {
        this.diamondGameId = str;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setHotSpotCreateTime(long j) {
        this.hotSpotCreateTime = j;
    }

    public void setHotSpotVideo(boolean z) {
        this.isHotSpotVideo = z;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setNeedSkipStrange(int i) {
        this.needSkipStrange = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSendMethod(String str) {
        this.sendMethod = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public void setIsAdFake(Boolean bool) {
        this.isAdFake = bool.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cg7);
    }

    public static ShareAwemeContent fromSharePackage(SharePackage sharePackage) {
        ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
        shareAwemeContent.setUser(sharePackage.f155492i.getString("uid_for_share"));
        shareAwemeContent.setSecUid(sharePackage.f155492i.getString("sec_user_id"));
        shareAwemeContent.setItemId(sharePackage.f155492i.getString("item_id_string"));
        shareAwemeContent.setCoverUrl((UrlModel) sharePackage.f155492i.getSerializable("video_cover"));
        shareAwemeContent.setContentThumb((UrlModel) sharePackage.f155492i.getSerializable("thumb_for_share"));
        shareAwemeContent.setContentName(sharePackage.f155492i.getString("author_name"));
        shareAwemeContent.setAuthorUsername(sharePackage.f155492i.getString("author_username"));
        shareAwemeContent.setIsAdFake(Boolean.valueOf(sharePackage.f155492i.getBoolean("is_ad_fake")));
        shareAwemeContent.setWidth((float) sharePackage.f155492i.getInt("aweme_width"));
        shareAwemeContent.setHeight((float) sharePackage.f155492i.getInt("aweme_height"));
        shareAwemeContent.setHotSpotVideo(sharePackage.f155492i.getBoolean("is_hot_spot_video"));
        shareAwemeContent.setHotSpotCreateTime(System.currentTimeMillis());
        shareAwemeContent.setAwemeType(0);
        shareAwemeContent.setType(800);
        shareAwemeContent.setTitle(sharePackage.f155492i.getString("desc"));
        shareAwemeContent.setDiamondGameId(sharePackage.f155492i.getString("diamond_game_id"));
        shareAwemeContent.setNeedSkipStrange(sharePackage.f155492i.getInt("key_message_source", 0));
        return shareAwemeContent;
    }

    public static ShareAwemeContent fromAweme(Aweme aweme, String str) {
        ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
        shareAwemeContent.setUser(aweme.getAuthor().getUid());
        shareAwemeContent.setSecUid(aweme.getAuthor().getSecUid());
        shareAwemeContent.setItemId(aweme.getAid());
        shareAwemeContent.setCoverUrl(aweme.getVideo().getCover());
        shareAwemeContent.setContentThumb(aweme.getAuthor().getAvatarThumb());
        shareAwemeContent.setContentName(aweme.getAuthor().getUserDisplayName());
        shareAwemeContent.setAuthorUsername(aweme.getAuthor().getUniqueId());
        shareAwemeContent.setIsAdFake(Boolean.valueOf(!aweme.isAd()));
        shareAwemeContent.setWidth((float) aweme.getVideo().getWidth());
        shareAwemeContent.setHeight((float) aweme.getVideo().getHeight());
        shareAwemeContent.setHotSpotVideo(aweme.isHotVideoAweme());
        shareAwemeContent.setAwemeType(0);
        shareAwemeContent.setType(800);
        shareAwemeContent.setTitle(aweme.getDesc());
        shareAwemeContent.setSendMethod(str);
        return shareAwemeContent;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z || z2) {
            awemeMsgHint = a.getString(R.string.a_l);
        } else {
            awemeMsgHint = a.getString(R.string.fia);
        }
        return awemeMsgHint;
    }
}
