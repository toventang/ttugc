package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig */
public class SuperEntranceConfig {
    @AbstractC27891c(mo46611a = "effect_id")
    private String effectId = "";
    @AbstractC27891c(mo46611a = "effect_ids")
    private List<String> effectIds = new ArrayList();
    @AbstractC27891c(mo46611a = "effect_tip")
    private String effectTip = "";
    @AbstractC27891c(mo46611a = "loop_video_md5")
    private String loopVideoMd5 = "";
    @AbstractC27891c(mo46611a = "loop_video_url")
    private String loopVideoUrl = "";
    @AbstractC27891c(mo46611a = "plus_icon_md5")
    private String plusIconMd5 = "";
    @AbstractC27891c(mo46611a = "plus_icon_url")
    private String plusIconUrl = "";
    @AbstractC27891c(mo46611a = "try_tip")
    private String tryTip = "";
    @AbstractC27891c(mo46611a = "valid_times")
    private List<ValidTimesConfig> validTimes = new ArrayList();
    @AbstractC27891c(mo46611a = "video_back_img_md5")
    private String videoBackImgMd5 = "";
    @AbstractC27891c(mo46611a = "video_back_img_url")
    private String videoBackImgUrl = "";
    @AbstractC27891c(mo46611a = "video_md5")
    private String videoMd5 = "";
    @AbstractC27891c(mo46611a = "video_url")
    private String videoUrl = "";

    static {
        Covode.recordClassIndex(62400);
    }

    public String getEffectId() {
        return this.effectId;
    }

    public List<String> getEffectIds() {
        return this.effectIds;
    }

    public String getEffectTip() {
        return this.effectTip;
    }

    public String getLoopVideoMd5() {
        return this.loopVideoMd5;
    }

    public String getLoopVideoUrl() {
        return this.loopVideoUrl;
    }

    public String getPlusIconMd5() {
        return this.plusIconMd5;
    }

    public String getPlusIconUrl() {
        return this.plusIconUrl;
    }

    public String getTryTip() {
        return this.tryTip;
    }

    public List<ValidTimesConfig> getValidTimes() {
        return this.validTimes;
    }

    public String getVideoBackImgMd5() {
        return this.videoBackImgMd5;
    }

    public String getVideoBackImgUrl() {
        return this.videoBackImgUrl;
    }

    public String getVideoMd5() {
        return this.videoMd5;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }
}
