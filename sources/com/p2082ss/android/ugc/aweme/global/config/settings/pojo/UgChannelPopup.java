package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup */
public class UgChannelPopup {
    @AbstractC27891c(mo46611a = "button_text")
    private String buttonText;
    @AbstractC27891c(mo46611a = "campaign_list")
    private List<String> campaignList = new ArrayList();
    @AbstractC27891c(mo46611a = "campaign_name")
    private String campaignName;
    @AbstractC27891c(mo46611a = "content")
    private String content;
    @AbstractC27891c(mo46611a = "h5_link")
    private String h5Link;
    @AbstractC27891c(mo46611a = "image_style")
    private Integer imageStyle;
    @AbstractC27891c(mo46611a = "link_schema")
    private String linkSchema;
    @AbstractC27891c(mo46611a = "resource_url")
    private UrlModel resourceUrl;
    @AbstractC27891c(mo46611a = "show_for_all")
    private Boolean showForAll;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(62406);
    }

    public List<String> getCampaignList() {
        return this.campaignList;
    }

    public String getButtonText() {
        String str = this.buttonText;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getCampaignName() {
        String str = this.campaignName;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getH5Link() {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getImageStyle() {
        Integer num = this.imageStyle;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getLinkSchema() {
        String str = this.linkSchema;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C16041a();
    }

    public Boolean getShowForAll() {
        Boolean bool = this.showForAll;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
