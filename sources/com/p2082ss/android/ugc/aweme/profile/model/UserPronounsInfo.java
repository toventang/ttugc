package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserPronounsInfo */
public final class UserPronounsInfo implements Serializable {
    @AbstractC27891c(mo46611a = "enable_edit_pronouns")
    private Boolean enableEditPronouns;
    @AbstractC27891c(mo46611a = "pronouns")
    private String pronouns;

    static {
        Covode.recordClassIndex(75237);
    }

    public final Boolean getEnableEditPronouns() {
        return this.enableEditPronouns;
    }

    public final String getPronouns() {
        return this.pronouns;
    }

    public final void setEnableEditPronouns(Boolean bool) {
        this.enableEditPronouns = bool;
    }

    public final void setPronouns(String str) {
        this.pronouns = str;
    }
}
