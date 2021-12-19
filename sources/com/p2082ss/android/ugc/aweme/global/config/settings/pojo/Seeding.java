package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Seeding */
public class Seeding {
    @AbstractC27891c(mo46611a = "shop_wish_list_url")
    private String shopWishListUrl;

    static {
        Covode.recordClassIndex(62389);
    }

    public String getShopWishListUrl() {
        String str = this.shopWishListUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
