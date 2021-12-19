package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.EditHint */
public class EditHint implements Serializable {
    @AbstractC27891c(mo46611a = "hint")
    String hint;
    @AbstractC27891c(mo46611a = "language")
    String language;

    static {
        Covode.recordClassIndex(58676);
    }

    public String getHint() {
        return this.hint;
    }

    public String getLanguage() {
        return this.language;
    }

    public String toString() {
        return "EditHint{language='" + this.language + '\'' + ", hint='" + this.hint + '\'' + '}';
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }
}
