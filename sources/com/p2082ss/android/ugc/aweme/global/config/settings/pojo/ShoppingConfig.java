package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingConfig */
public class ShoppingConfig {
    @AbstractC27891c(mo46611a = "card_show_duration")
    private Integer cardShowDuration;
    @AbstractC27891c(mo46611a = "disable_card")
    private Boolean disableCard;
    @AbstractC27891c(mo46611a = "disable_want")
    private Boolean disableWant;
    @AbstractC27891c(mo46611a = "enable")
    private Boolean enable;
    @AbstractC27891c(mo46611a = "enable_float_video")
    private Boolean enableFloatVideo;
    @AbstractC27891c(mo46611a = "enable_user")
    private Boolean enableUser;
    @AbstractC27891c(mo46611a = "law_window")
    private Boolean lawWindow;
    @AbstractC27891c(mo46611a = "live")
    private ShoppingLiveConfig live;
    @AbstractC27891c(mo46611a = "newbie_help")
    private ShoppingNewbieHelp newbieHelp;
    @AbstractC27891c(mo46611a = "order_share_intro_url")
    private String orderShareIntroUrl;
    @AbstractC27891c(mo46611a = "preload_data_wait_duration")
    private Integer preloadDataWaitDuration = 3;

    static {
        Covode.recordClassIndex(62392);
    }

    public Integer getPreloadDataWaitDuration() {
        return this.preloadDataWaitDuration;
    }

    public Integer getCardShowDuration() {
        Integer num = this.cardShowDuration;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Boolean getDisableCard() {
        Boolean bool = this.disableCard;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getDisableWant() {
        Boolean bool = this.disableWant;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getEnable() {
        Boolean bool = this.enable;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getEnableFloatVideo() {
        Boolean bool = this.enableFloatVideo;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getEnableUser() {
        Boolean bool = this.enableUser;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getLawWindow() {
        Boolean bool = this.lawWindow;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public ShoppingLiveConfig getLive() {
        ShoppingLiveConfig shoppingLiveConfig = this.live;
        if (shoppingLiveConfig != null) {
            return shoppingLiveConfig;
        }
        throw new C16041a();
    }

    public ShoppingNewbieHelp getNewbieHelp() {
        ShoppingNewbieHelp shoppingNewbieHelp = this.newbieHelp;
        if (shoppingNewbieHelp != null) {
            return shoppingNewbieHelp;
        }
        throw new C16041a();
    }

    public String getOrderShareIntroUrl() {
        String str = this.orderShareIntroUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
