package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.poi.PoiData;
import com.p2082ss.android.ugc.aweme.profile.model.TagBAUser;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel */
public class PublishExtensionModel {
    @AbstractC27891c(mo46611a = "anchor_business_type")
    public int anchorBusinessType = -1;
    @AbstractC27891c(mo46611a = "anchor_content")
    public String anchorContent;
    @AbstractC27891c(mo46611a = "anchor_icon")
    public UrlModel anchorIcon;
    @AbstractC27891c(mo46611a = "anchor_id")
    public String anchorId = "";
    @AbstractC27891c(mo46611a = "subtype")
    public String anchorSubtype = "";
    @AbstractC27891c(mo46611a = "anchor_tag")
    public String anchorTag;
    @AbstractC27891c(mo46611a = "anchor_title")
    public String anchorTitle;
    @AbstractC27891c(mo46611a = "branded_content_type")
    public String brandedContentType = "0";
    @AbstractC27891c(mo46611a = "anchors")
    public List<CreateAnchorInfo> createAnchorInfos;
    public String dataType;
    @AbstractC27891c(mo46611a = "is_from_commercial_sound_page")
    public boolean fromCommercialSoundPage;
    @AbstractC27891c(mo46611a = "is_star_atlas")
    public boolean isStarAtlas;
    @AbstractC27891c(mo46611a = "mission")
    public Mission mission;
    @AbstractC27891c(mo46611a = "mp_url")
    public String mpUrl;
    @AbstractC27891c(mo46611a = "open_url")
    public String openUrl;
    @AbstractC27891c(mo46611a = "outer_star_atlas")
    public String outerStarAtlas;
    @AbstractC27891c(mo46611a = "poi_data")
    public PoiData poiData;
    @AbstractC27891c(mo46611a = "recommend_anchor")
    public List<AnchorPublishStruct> recommendAnchor;
    public String referSeedId;
    public String referSeedName;
    @AbstractC27891c(mo46611a = "related_hot_sentence")
    public String relatedHotSentence;
    public String seedId;
    public String seedName;
    @AbstractC27891c(mo46611a = "sentence_id")
    public String sentenceId;
    @AbstractC27891c(mo46611a = "shop_order_share_structinfo")
    public ShopOrderShareStructInfo shopOrderShareStructInfo;
    @AbstractC27891c(mo46611a = "source")
    public int source;
    @AbstractC27891c(mo46611a = "star_atlas_content")
    public String starAtlasContent;
    @AbstractC27891c(mo46611a = "tcm_tag_ba_info")
    public List<TagBAUser> tcmTagBaInfo;
    @AbstractC27891c(mo46611a = "web_url")
    public String webUrl;
    @AbstractC27891c(mo46611a = "zip_uri")
    public String zipUri;

    static {
        Covode.recordClassIndex(84607);
    }

    public static String toString(PublishExtensionModel publishExtensionModel) {
        if (publishExtensionModel == null) {
            return null;
        }
        return new C27910f().mo46674b(publishExtensionModel);
    }

    public static PublishExtensionModel fromContext(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null || TextUtils.isEmpty(baseShortVideoContext.commerceData)) {
            return new PublishExtensionModel();
        }
        return (PublishExtensionModel) new C27910f().mo46670a(baseShortVideoContext.commerceData, PublishExtensionModel.class);
    }

    public static PublishExtensionModel fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return new PublishExtensionModel();
        }
        return (PublishExtensionModel) new C27910f().mo46670a(str, PublishExtensionModel.class);
    }
}
