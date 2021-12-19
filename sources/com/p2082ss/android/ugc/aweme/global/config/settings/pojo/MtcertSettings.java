package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings */
public class MtcertSettings {
    @AbstractC27891c(mo46611a = "cert_url_schema")
    private String certUrlSchema = "";
    @AbstractC27891c(mo46611a = "enable_change_handle_notice")
    private Boolean enableChangeHandleNotice = false;
    @AbstractC27891c(mo46611a = "enable_change_mobile_notice")
    private Boolean enableChangeMobileNotice = false;
    @AbstractC27891c(mo46611a = "enable_change_nickname_notice")
    private Boolean enableChangeNicknameNotice = false;
    @AbstractC27891c(mo46611a = "enable_private_account_notice")
    private Boolean enablePrivateAccountNotice = false;
    @AbstractC27891c(mo46611a = "show_cert_entry")
    private Boolean showCertEntry = false;
    @AbstractC27891c(mo46611a = "verification_badge_type")
    private List<VerificationBadgeType> verificationBadgeType = new ArrayList();

    static {
        Covode.recordClassIndex(62378);
    }

    public String getCertUrlSchema() {
        return this.certUrlSchema;
    }

    public Boolean getEnableChangeHandleNotice() {
        return this.enableChangeHandleNotice;
    }

    public Boolean getEnableChangeMobileNotice() {
        return this.enableChangeMobileNotice;
    }

    public Boolean getEnableChangeNicknameNotice() {
        return this.enableChangeNicknameNotice;
    }

    public Boolean getEnablePrivateAccountNotice() {
        return this.enablePrivateAccountNotice;
    }

    public Boolean getShowCertEntry() {
        return this.showCertEntry;
    }

    public List<VerificationBadgeType> getVerificationBadgeType() {
        return this.verificationBadgeType;
    }
}
