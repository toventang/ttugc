package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34486b;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ac */
public final class C69789ac implements Serializable {
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private Integer f155962a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    private String f155963b;
    @AbstractC27891c(mo46611a = "post_prompts")

    /* renamed from: c */
    private C69931cj f155964c;

    static {
        Covode.recordClassIndex(82195);
    }

    public final C69931cj getPostPrompts() {
        return this.f155964c;
    }

    public final Integer getStatusCode() {
        return this.f155962a;
    }

    public final String getStatusMessage() {
        return this.f155963b;
    }

    public final void setPostPrompts(C69931cj cjVar) {
        this.f155964c = cjVar;
    }

    public final void setStatusCode(Integer num) {
        this.f155962a = num;
    }

    public final void setStatusMessage(String str) {
        this.f155963b = str;
    }
}
