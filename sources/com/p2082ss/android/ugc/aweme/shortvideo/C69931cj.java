package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cj */
public final class C69931cj implements Serializable {
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: a */
    private String f156283a;
    @AbstractC27891c(mo46611a = "post_anyway")

    /* renamed from: b */
    private String f156284b;
    @AbstractC27891c(mo46611a = "go_back")

    /* renamed from: c */
    private String f156285c;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: d */
    private String f156286d;

    static {
        Covode.recordClassIndex(82340);
    }

    public final String getDialogTitle() {
        return this.f156286d;
    }

    public final String getGoBack() {
        return this.f156285c;
    }

    public final String getPostAnyway() {
        return this.f156284b;
    }

    public final String getText() {
        return this.f156283a;
    }

    public final void setDialogTitle(String str) {
        this.f156286d = str;
    }

    public final void setGoBack(String str) {
        this.f156285c = str;
    }

    public final void setPostAnyway(String str) {
        this.f156284b = str;
    }

    public final void setText(String str) {
        this.f156283a = str;
    }
}
