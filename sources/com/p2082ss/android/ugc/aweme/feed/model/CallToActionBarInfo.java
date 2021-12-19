package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CallToActionBarInfo */
public final class CallToActionBarInfo implements Serializable {
    @AbstractC27891c(mo46611a = "button_text")
    private String buttonText = "";
    @AbstractC27891c(mo46611a = "text")
    private String text = "";

    static {
        Covode.recordClassIndex(58660);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getText() {
        return this.text;
    }

    public final void setButtonText(String str) {
        C89219l.m154721d(str, "");
        this.buttonText = str;
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        this.text = str;
    }
}
