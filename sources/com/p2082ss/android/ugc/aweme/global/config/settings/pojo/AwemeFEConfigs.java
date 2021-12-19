package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs */
public class AwemeFEConfigs {
    @AbstractC27891c(mo46611a = "business_ec")
    private BusinessEC businessEc;
    @AbstractC27891c(mo46611a = "goods_report")
    private GoodsReport goodsReport;
    @AbstractC27891c(mo46611a = "link_plan")
    private LinkPlan linkPlan;
    @AbstractC27891c(mo46611a = "live")
    private ShopLiveConfig live;
    @AbstractC27891c(mo46611a = "mp_tab")
    private MpTab mpTab;
    @AbstractC27891c(mo46611a = "seed_label")
    private String seedLabel;
    @AbstractC27891c(mo46611a = "seeding")
    private Seeding seeding;
    @AbstractC27891c(mo46611a = "star_atlas_order")
    private StarAtlasOrder starAtlasOrder;
    @AbstractC27891c(mo46611a = "video_auth")
    private VideoAuth videoAuth;

    static {
        Covode.recordClassIndex(62330);
    }

    public BusinessEC getBusinessEc() {
        BusinessEC businessEC = this.businessEc;
        if (businessEC != null) {
            return businessEC;
        }
        throw new C16041a();
    }

    public GoodsReport getGoodsReport() {
        GoodsReport goodsReport2 = this.goodsReport;
        if (goodsReport2 != null) {
            return goodsReport2;
        }
        throw new C16041a();
    }

    public LinkPlan getLinkPlan() {
        LinkPlan linkPlan2 = this.linkPlan;
        if (linkPlan2 != null) {
            return linkPlan2;
        }
        throw new C16041a();
    }

    public ShopLiveConfig getLive() {
        ShopLiveConfig shopLiveConfig = this.live;
        if (shopLiveConfig != null) {
            return shopLiveConfig;
        }
        throw new C16041a();
    }

    public MpTab getMpTab() {
        MpTab mpTab2 = this.mpTab;
        if (mpTab2 != null) {
            return mpTab2;
        }
        throw new C16041a();
    }

    public String getSeedLabel() {
        String str = this.seedLabel;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Seeding getSeeding() {
        Seeding seeding2 = this.seeding;
        if (seeding2 != null) {
            return seeding2;
        }
        throw new C16041a();
    }

    public StarAtlasOrder getStarAtlasOrder() {
        StarAtlasOrder starAtlasOrder2 = this.starAtlasOrder;
        if (starAtlasOrder2 != null) {
            return starAtlasOrder2;
        }
        throw new C16041a();
    }

    public VideoAuth getVideoAuth() {
        VideoAuth videoAuth2 = this.videoAuth;
        if (videoAuth2 != null) {
            return videoAuth2;
        }
        throw new C16041a();
    }
}
