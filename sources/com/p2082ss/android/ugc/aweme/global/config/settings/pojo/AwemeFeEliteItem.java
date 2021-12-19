package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFeEliteItem */
public class AwemeFeEliteItem {
    @AbstractC27891c(mo46611a = "edit_contact_link")
    private String editContactLink;
    @AbstractC27891c(mo46611a = "edit_service_center_link")
    private String editServiceCenterLink;

    static {
        Covode.recordClassIndex(62331);
    }

    public String getEditContactLink() {
        String str = this.editContactLink;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getEditServiceCenterLink() {
        String str = this.editServiceCenterLink;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
