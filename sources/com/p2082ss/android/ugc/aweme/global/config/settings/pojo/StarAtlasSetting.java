package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.StarAtlasSetting */
public class StarAtlasSetting {
    @AbstractC27891c(mo46611a = "star_atlas_enable")
    private Boolean starAtlasEnable;
    @AbstractC27891c(mo46611a = "star_atlas_redirect_url")
    private String starAtlasRedirectUrl;
    @AbstractC27891c(mo46611a = "star_atlas_url")
    private String starAtlasUrl;

    static {
        Covode.recordClassIndex(62399);
    }

    public Boolean getStarAtlasEnable() {
        Boolean bool = this.starAtlasEnable;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public String getStarAtlasRedirectUrl() {
        String str = this.starAtlasRedirectUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getStarAtlasUrl() {
        String str = this.starAtlasUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
