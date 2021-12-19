package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.PushChallengeInfoMsg */
public final class PushChallengeInfoMsg extends C61550b {
    @AbstractC27891c(mo46611a = "extra_str")
    private String extra;
    @AbstractC27891c(mo46611a = "text")
    private String text;
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = "open_url")
    private String url;

    static {
        Covode.recordClassIndex(72222);
    }

    public static /* synthetic */ PushChallengeInfoMsg copy$default(PushChallengeInfoMsg pushChallengeInfoMsg, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushChallengeInfoMsg.url;
        }
        if ((i & 2) != 0) {
            str2 = pushChallengeInfoMsg.title;
        }
        if ((i & 4) != 0) {
            str3 = pushChallengeInfoMsg.text;
        }
        if ((i & 8) != 0) {
            str4 = pushChallengeInfoMsg.extra;
        }
        return pushChallengeInfoMsg.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.extra;
    }

    public final PushChallengeInfoMsg copy(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        return new PushChallengeInfoMsg(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushChallengeInfoMsg)) {
            return false;
        }
        PushChallengeInfoMsg pushChallengeInfoMsg = (PushChallengeInfoMsg) obj;
        return C89219l.m154714a(this.url, pushChallengeInfoMsg.url) && C89219l.m154714a(this.title, pushChallengeInfoMsg.title) && C89219l.m154714a(this.text, pushChallengeInfoMsg.text) && C89219l.m154714a(this.extra, pushChallengeInfoMsg.extra);
    }

    public final int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.extra;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "PushChallengeInfoMsg(url=" + this.url + ", title=" + this.title + ", text=" + this.text + ", extra=" + this.extra + ")";
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.bean.C61550b
    public final EnumC61554f getType() {
        return EnumC61554f.SYSTEM;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setExtra(String str) {
        C89219l.m154721d(str, "");
        this.extra = str;
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        this.text = str;
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        this.title = str;
    }

    public final void setUrl(String str) {
        C89219l.m154721d(str, "");
        this.url = str;
    }

    public PushChallengeInfoMsg(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.url = str;
        this.title = str2;
        this.text = str3;
        this.extra = str4;
    }
}
