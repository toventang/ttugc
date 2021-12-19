package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CommerceEggConfig */
public class CommerceEggConfig {
    @AbstractC27891c(mo46611a = "enable_comment_egg_refactor")
    private Boolean enableCommentEggRefactor = false;
    @AbstractC27891c(mo46611a = "enable_digg_egg_refactor")
    private Boolean enableDiggEggRefactor = false;
    @AbstractC27891c(mo46611a = "enable_search_egg_refactor")
    private Boolean enableSearchEggRefactor = false;

    static {
        Covode.recordClassIndex(62339);
    }

    public Boolean getEnableCommentEggRefactor() {
        Boolean bool = this.enableCommentEggRefactor;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getEnableDiggEggRefactor() {
        Boolean bool = this.enableDiggEggRefactor;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getEnableSearchEggRefactor() {
        Boolean bool = this.enableSearchEggRefactor;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
