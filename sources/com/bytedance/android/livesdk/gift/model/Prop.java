package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.model.C9589i;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public class Prop extends C9543b {
    @AbstractC27891c(mo46611a = "banner")
    public C9589i banner;
    @AbstractC27891c(mo46611a = "count")
    public int count;
    @AbstractC27891c(mo46611a = "description")
    public String description;
    @AbstractC27891c(mo46611a = "diamond")
    public int diamond;
    @AbstractC27891c(mo46611a = "diamond_icon")
    public ImageModel diamondLabel;
    @AbstractC27891c(mo46611a = "fragments_compound_count")
    public Long fragmentsCompoundCount;
    @AbstractC27891c(mo46611a = "gift")
    public C9904t gift = new C9904t();
    @AbstractC27891c(mo46611a = "gifts")
    public List<C8853q> gifts;
    @AbstractC27891c(mo46611a = "icon")
    public ImageModel icon;
    @AbstractC27891c(mo46611a = "prop_def_id")

    /* renamed from: id */
    public long f21689id;
    @AbstractC27891c(mo46611a = "is_aweme_free_gift")
    public int isAwemeFreeGift;
    @AbstractC27891c(mo46611a = "is_fragment")
    public Boolean isFragment;
    @AbstractC27891c(mo46611a = "label_icon")
    public ImageModel labelIcon;
    @AbstractC27891c(mo46611a = "manual")
    public String manual;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;
    @AbstractC27891c(mo46611a = "next_expire")
    public long nextExpire;
    private long nowTimeDiff;
    @AbstractC27891c(mo46611a = "primary_effect_id")
    public int primaryEffectId;
    @AbstractC27891c(mo46611a = "prop_def_type")
    public long propType;
    @AbstractC27891c(mo46611a = "reddot_tip")
    public boolean reddotTip;
    @AbstractC27891c(mo46611a = "scheme_url")
    public String schemeUrl;

    static {
        Covode.recordClassIndex(9690);
    }

    public long getNowTimeDiff() {
        return this.nowTimeDiff;
    }

    public void setNowTimeDiff(long j) {
        this.nowTimeDiff = j;
    }

    public static Prop newInstance(Prop prop) {
        Prop prop2 = new Prop();
        if (prop == null) {
            return prop2;
        }
        prop2.primaryEffectId = prop.primaryEffectId;
        prop2.nextExpire = prop.nextExpire;
        prop2.description = prop.description;
        prop2.f21689id = prop.f21689id;
        prop2.manual = prop.manual;
        prop2.diamond = prop.diamond;
        prop2.reddotTip = prop.reddotTip;
        prop2.icon = prop.icon;
        prop2.count = prop.count;
        prop2.name = prop.name;
        prop2.gift = prop.gift;
        prop2.labelIcon = prop.labelIcon;
        prop2.diamondLabel = prop.diamondLabel;
        prop2.isAwemeFreeGift = prop.isAwemeFreeGift;
        prop2.nowTimeDiff = prop.nowTimeDiff;
        prop2.banner = prop.banner;
        return prop2;
    }
}
