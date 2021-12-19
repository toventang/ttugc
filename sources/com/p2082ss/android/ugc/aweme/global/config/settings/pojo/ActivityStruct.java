package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ActivityStruct */
public class ActivityStruct {
    @AbstractC27891c(mo46611a = "activity_name")
    private String activityName;
    @AbstractC27891c(mo46611a = "activity_sticker_id_array")
    private List<String> activityStickerIdArray = new ArrayList();
    @AbstractC27891c(mo46611a = "comment_icon")
    private UrlModel commentIcon;
    @AbstractC27891c(mo46611a = "digg_icon")
    private UrlModel diggIcon;
    @AbstractC27891c(mo46611a = "hash_tags")
    private List<String> hashTags = new ArrayList();
    @AbstractC27891c(mo46611a = "in_activity")
    private Boolean inActivity;
    @AbstractC27891c(mo46611a = "share_icon")
    private UrlModel shareIcon;
    @AbstractC27891c(mo46611a = "share_tip_icon")
    private UrlModel shareTipIcon;
    @AbstractC27891c(mo46611a = "shot_icon")
    private UrlModel shotIcon;
    @AbstractC27891c(mo46611a = "undigg_icon")
    private UrlModel undiggIcon;
    @AbstractC27891c(mo46611a = "watermark_struct")
    private WatermarkStruct watermarkStruct;

    static {
        Covode.recordClassIndex(62322);
    }

    public List<String> getActivityStickerIdArray() {
        return this.activityStickerIdArray;
    }

    public List<String> getHashTags() {
        return this.hashTags;
    }

    public String getActivityName() {
        String str = this.activityName;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public UrlModel getCommentIcon() {
        UrlModel urlModel = this.commentIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C16041a();
    }

    public UrlModel getDiggIcon() {
        UrlModel urlModel = this.diggIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C16041a();
    }

    public Boolean getInActivity() {
        Boolean bool = this.inActivity;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public UrlModel getShareIcon() {
        UrlModel urlModel = this.shareIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C16041a();
    }

    public UrlModel getShareTipIcon() {
        UrlModel urlModel = this.shareTipIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C16041a();
    }

    public UrlModel getShotIcon() {
        UrlModel urlModel = this.shotIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C16041a();
    }

    public UrlModel getUndiggIcon() {
        UrlModel urlModel = this.undiggIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C16041a();
    }

    public WatermarkStruct getWatermarkStruct() {
        WatermarkStruct watermarkStruct2 = this.watermarkStruct;
        if (watermarkStruct2 != null) {
            return watermarkStruct2;
        }
        throw new C16041a();
    }
}
