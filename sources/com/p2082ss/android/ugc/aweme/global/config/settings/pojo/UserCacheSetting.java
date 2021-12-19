package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserCacheSetting */
public class UserCacheSetting {
    @AbstractC27891c(mo46611a = "enable_ru_cache")
    private Integer enableRuCache;
    @AbstractC27891c(mo46611a = "enable_ru_insert")
    private Integer enableRuInsert;
    @AbstractC27891c(mo46611a = "ru_cache_intervals")
    private Long ruCacheIntervals;

    static {
        Covode.recordClassIndex(62421);
    }

    public Integer getEnableRuCache() {
        Integer num = this.enableRuCache;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getEnableRuInsert() {
        Integer num = this.enableRuInsert;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Long getRuCacheIntervals() {
        Long l = this.ruCacheIntervals;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }
}
