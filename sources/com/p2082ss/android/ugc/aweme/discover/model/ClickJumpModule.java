package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ClickJumpModule */
public final class ClickJumpModule implements Serializable {
    @AbstractC27891c(mo46611a = "open_url")
    private final String openUrl;
    @AbstractC27891c(mo46611a = "text")
    private final String text;
    @AbstractC27891c(mo46611a = "web_url")
    private final String webUrl;

    static {
        Covode.recordClassIndex(50438);
    }

    public ClickJumpModule() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ClickJumpModule copy$default(ClickJumpModule clickJumpModule, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clickJumpModule.text;
        }
        if ((i & 2) != 0) {
            str2 = clickJumpModule.openUrl;
        }
        if ((i & 4) != 0) {
            str3 = clickJumpModule.webUrl;
        }
        return clickJumpModule.copy(str, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.openUrl;
    }

    public final String component3() {
        return this.webUrl;
    }

    public final ClickJumpModule copy(String str, String str2, String str3) {
        return new ClickJumpModule(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickJumpModule)) {
            return false;
        }
        ClickJumpModule clickJumpModule = (ClickJumpModule) obj;
        return C89219l.m154714a(this.text, clickJumpModule.text) && C89219l.m154714a(this.openUrl, clickJumpModule.openUrl) && C89219l.m154714a(this.webUrl, clickJumpModule.webUrl);
    }

    public final int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.openUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.webUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ClickJumpModule(text=" + this.text + ", openUrl=" + this.openUrl + ", webUrl=" + this.webUrl + ")";
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public ClickJumpModule(String str, String str2, String str3) {
        this.text = str;
        this.openUrl = str2;
        this.webUrl = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClickJumpModule(String str, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
