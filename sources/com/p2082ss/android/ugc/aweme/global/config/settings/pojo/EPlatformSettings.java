package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.EPlatformSettings */
public class EPlatformSettings {
    @AbstractC27891c(mo46611a = "block_hint")
    private String blockHint;
    @AbstractC27891c(mo46611a = "block_mode")
    private Integer blockMode;
    @AbstractC27891c(mo46611a = "jump_block_list")
    private List<String> jumpBlockList = new ArrayList();
    @AbstractC27891c(mo46611a = "jump_redirect_url")
    private String jumpRedirectUrl;
    @AbstractC27891c(mo46611a = "lite_link")
    private String liteLink;
    @AbstractC27891c(mo46611a = "profile_add_contact_info_text")
    private String profileAddContactInfoText;

    static {
        Covode.recordClassIndex(62347);
    }

    public List<String> getJumpBlockList() {
        return this.jumpBlockList;
    }

    public String getBlockHint() {
        String str = this.blockHint;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getBlockMode() {
        Integer num = this.blockMode;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getJumpRedirectUrl() {
        String str = this.jumpRedirectUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getLiteLink() {
        String str = this.liteLink;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getProfileAddContactInfoText() {
        String str = this.profileAddContactInfoText;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
