package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ac */
public class C38214ac implements Serializable {
    @AbstractC27891c(mo46611a = "image_list")

    /* renamed from: a */
    List<UrlModel> f90276a;
    @AbstractC27891c(mo46611a = "avatar_icon")
    public UrlModel avatarIcon;

    /* renamed from: b */
    private User f90277b;
    @AbstractC27891c(mo46611a = "background_type")
    public int backgroundType;
    @AbstractC27891c(mo46611a = "button_style")
    public int buttonStyle;
    @AbstractC27891c(mo46611a = "button_text")
    public String buttonText;
    @AbstractC27891c(mo46611a = "click_track_url_list")
    public UrlModel clickTrackUrlList;
    @AbstractC27891c(mo46611a = "comment_area")
    public C38215a commentArea;
    @AbstractC27891c(mo46611a = "creative_id")
    public String creativeId;
    @AbstractC27891c(mo46611a = "description")
    public String description;
    @AbstractC27891c(mo46611a = "download_url")
    public String downloadUrl;
    @AbstractC27891c(mo46611a = "feed_show_type")
    public int feedShowType;
    public boolean hasDislike;
    @AbstractC27891c(mo46611a = "is_preview")
    public boolean isPreview;
    @AbstractC27891c(mo46611a = "label")
    public String label;
    @AbstractC27891c(mo46611a = "label_type")
    public int labelType;
    public int linkType;
    @AbstractC27891c(mo46611a = "log_extra")
    public String logExtra;
    @AbstractC27891c(mo46611a = "mp_url")
    public String mpUrl;
    @AbstractC27891c(mo46611a = "open_url")
    public String openUrl;
    @AbstractC27891c(mo46611a = "package")
    public String packageName;
    @AbstractC27891c(mo46611a = "report_enable")
    public boolean reportEnabled = true;
    @AbstractC27891c(mo46611a = "saiyan_link_type")
    public int saiyanLinkType;
    @AbstractC27891c(mo46611a = "show_close_tips")
    public boolean showCloseTips;
    @AbstractC27891c(mo46611a = "show_type")
    public int showType;
    @AbstractC27891c(mo46611a = "source")
    public String source;
    @AbstractC27891c(mo46611a = "tips_schema")
    public String tipsSchema;
    @AbstractC27891c(mo46611a = "tips_text")
    public String tipsText;
    @AbstractC27891c(mo46611a = "tips_type")
    public int tipsType;
    @AbstractC27891c(mo46611a = "title")
    public String title;
    @AbstractC27891c(mo46611a = "track_url_list")
    public UrlModel trackUrlList;
    @AbstractC27891c(mo46611a = StringSet.type)
    public String type;
    @AbstractC27891c(mo46611a = "web_title")
    public String webTitle;
    @AbstractC27891c(mo46611a = "web_url")
    public String webUrl;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.ac$a */
    public static class C38215a implements Serializable {
        @AbstractC27891c(mo46611a = "avatar_icon")
        public UrlModel avatarIcon;
        @AbstractC27891c(mo46611a = "feature_label")
        public String featureLabel;
        @AbstractC27891c(mo46611a = "title")
        public String title;

        static {
            Covode.recordClassIndex(45699);
        }
    }

    static {
        Covode.recordClassIndex(45698);
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public List<UrlModel> getImageList() {
        return this.f90276a;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public User getUser() {
        return this.f90277b;
    }

    public boolean isHasDislike() {
        return this.hasDislike;
    }

    public UrlModel getCommentAvatarIcon() {
        C38215a aVar = this.commentArea;
        if (aVar == null || aVar.avatarIcon == null) {
            return this.avatarIcon;
        }
        return this.commentArea.avatarIcon;
    }

    public boolean showOnFeed() {
        int i = this.showType;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public boolean showOnComment() {
        C38215a aVar;
        int i = this.showType;
        if ((i != 0 && i != 2) || (aVar = this.commentArea) == null || aVar.title == null || this.commentArea.featureLabel == null) {
            return false;
        }
        return true;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setHasDislike(boolean z) {
        this.hasDislike = z;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setUser(User user) {
        this.f90277b = user;
    }
}
