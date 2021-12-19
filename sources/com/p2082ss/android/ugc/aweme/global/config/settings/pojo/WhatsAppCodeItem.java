package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem */
public class WhatsAppCodeItem {
    @AbstractC27891c(mo46611a = "calling_code")
    private String callingCode;
    @AbstractC27891c(mo46611a = "whatsapp_first")
    private Boolean whatsappFirst;

    static {
        Covode.recordClassIndex(62432);
    }

    public String getCallingCode() {
        String str = this.callingCode;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Boolean getWhatsappFirst() {
        Boolean bool = this.whatsappFirst;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
